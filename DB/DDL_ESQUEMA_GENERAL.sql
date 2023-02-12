-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema general
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema general
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `general` DEFAULT CHARACTER SET utf8 ;
USE `general` ;

-- -----------------------------------------------------
-- Table `general`.`estados`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `general`.`estados` (
  `id` BIGINT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NOT NULL,
  `abreviatura` VARCHAR(4) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `general`.`grupos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `general`.`grupos` (
  `id` BIGINT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NOT NULL,
  `descripcion` VARCHAR(100) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `general`.`tareas`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `general`.`tareas` (
  `id` BIGINT NOT NULL AUTO_INCREMENT,
  `descripcion` VARCHAR(150) NOT NULL,
  `fecha_inicio` DATE NULL,
  `hora_inicio` TIME NULL,
  `fecha_fin` DATE NULL,
  `hora_fin` TIME NULL,
  `id_estado` BIGINT NOT NULL,
  `id_grupo` BIGINT NULL,
  `cumplida` TINYINT(1) NOT NULL DEFAULT 0,
  `fecha_registro` TIMESTAMP NOT NULL DEFAULT NOW(),
  PRIMARY KEY (`id`),
  INDEX `fk_estados_id_idx` (`id_estado` ASC) VISIBLE,
  INDEX `fk_grupos_id_idx` (`id_grupo` ASC) VISIBLE,
  CONSTRAINT `fk_estados_id`
    FOREIGN KEY (`id_estado`)
    REFERENCES `general`.`estados` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_grupos_id`
    FOREIGN KEY (`id_grupo`)
    REFERENCES `general`.`grupos` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

ALTER TABLE `general`.`estados` 
ADD CONSTRAINT constraint_nombre UNIQUE (nombre)
; 

ALTER TABLE `general`.`estados` 
ADD CONSTRAINT constraint_abreviatura UNIQUE (abreviatura)
; 

USE `general`;

DELIMITER $$
USE `general`$$
CREATE DEFINER = CURRENT_USER TRIGGER `general`.`tareas_validar_estado_bi` BEFORE INSERT ON `tareas` FOR EACH ROW
BEGIN
	IF DATE_FORMAT(NEW.fecha_inicio||' '||NEW.hora_inicio, '%Y-%m-%d %H:%i:%s') > DATE_FORMAT(DATE(NOW()), '%Y-%m-%d %H:%i:%s') THEN
		SET NEW.id_estado = (
			SELECT id
            FROM `general`.`estados`
            WHERE abreviatura = 'CRD'
        )
        ;
	ELSEIF DATE_FORMAT(NEW.fecha_inicio||' '||NEW.hora_inicio, '%Y-%m-%d %H:%i:%s') <= DATE_FORMAT(DATE(NOW()), '%Y-%m-%d %H:%i:%s') 
		AND DATE_FORMAT(NEW.fecha_fin||' '||NEW.hora_fin, '%Y-%m-%d %H:%i:%s') > DATE_FORMAT(DATE(NOW()), '%Y-%m-%d %H:%i:%s') 
    THEN
		SET NEW.id_estado = (
			SELECT id
            FROM `general`.`estados`
            WHERE abreviatura = 'INI'
        )
        ;
	
    ELSEIF DATE_FORMAT(NEW.fecha_fin||' '||NEW.hora_fin, '%Y-%m-%d %H:%i:%s') <= DATE_FORMAT(DATE(NOW()), '%Y-%m-%d %H:%i:%s') THEN
		SET NEW.id_estado = (
			SELECT id
            FROM `general`.`estados`
            WHERE abreviatura = 'FIN'
        )
        ;
	
    END IF;
    
END$$


DELIMITER ;

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
