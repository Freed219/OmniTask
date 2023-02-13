/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import modelo.Tarea;
import java.sql.Date;
import java.util.List;
/**
 *
 * @author admin
 */
public class prueba {
    
    

    public static void main(String[] args) {
        
        TareaDao Dao=new TareaDao();
        
        //Tarea tarea=new Tarea();
        
        //tarea.setDescripcion("hh");
        //Date fecha=Date.valueOf("2023-03-10");
        //System.out.println(fecha);
        //tarea.setFechaIicio("2023-03-10");
        //tarea.setId(1);
        //System.out.println(tarea.toString());
        //System.out.println(Dao.registrar(tarea));
        System.out.println(Dao.listarTareas(false));
        
        
        //System.out.println(Dao.eliminar(0));
    }
    
}
