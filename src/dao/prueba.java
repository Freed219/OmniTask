/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import modelo.Tarea;

/**
 *
 * @author admin
 */
public class prueba {
    
    

    public static void main(String[] args) {
        Tarea tarea=new Tarea();
        TareaDao Dao=new TareaDao();
        tarea.setDescripcion("revisar informe");
        System.out.println(tarea.toString());
        System.out.println(Dao.registrar(tarea));
        
    }
    
}
