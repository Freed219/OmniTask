/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import conexion.ConexionMysql;
import modelo.Tarea;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author admin
 */
public class TareaDao {
    private ConexionMysql fabricaConexion;

    public TareaDao() {
        this.fabricaConexion = new ConexionMysql();
    }
    
    public boolean registrar(Tarea tarea){
        try {
            String SQL="insert into tareas(descripcion,"
                    + "fecha_inicio,hora_inicio,fecha_fin,"
                    + "hora_fin,id_estado,id_grupo,"
                    + "cumplida,fecha_registro)values("
                    + "?,?,?,?,?,?,?,?,?)";
            Connection connection=this.fabricaConexion.getConnection();
            PreparedStatement sentencia=connection.prepareStatement(SQL);
            sentencia.setString(1, tarea.getDescripcion());
            sentencia.setDate(2, tarea.getFechaIicio());
            sentencia.setTime(3, tarea.getHoraInicio());
            sentencia.setDate(4, tarea.getFechaFin());
            sentencia.setTime(5, tarea.getHoraFin());
            sentencia.setInt(6, tarea.getEstado());
            sentencia.setInt(7, tarea.getIdGrupo());
            sentencia.setBoolean(8, tarea.isCumplida());
            sentencia.setDate(9, tarea.getFechaRegistro());
            
            sentencia.executeUpdate();
            sentencia.close();
            
            return true;
        } catch (Exception e) {
            System.err.println("Ocurrio un error al registrar la tarea");
            System.err.println("Mensaje de error: "+e.getMessage());
            System.err.println("Detalle");
            e.printStackTrace();
            return false;
        }
    }
    
    
}
