/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexion;
import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author admin
 */
public class ConexionMysql {
    private Connection connection;
    private String usuario="root";
    private String contrasenia="123456";
    private String servidor="localhost";
    private String puerto="3306";
    private String nombreDB="omnitask";
    private String url="jdbc:mysql://"+servidor+':'+puerto+'/'+nombreDB+"?serverTimezone=UTC";
    private String driver="com.mysql.jdbc.Driver";
    public ConexionMysql() {
        try{
            Class.forName(driver);
            connection=DriverManager.getConnection(url,usuario,contrasenia);
            if(connection!=null){
                System.out.println("Conexion realizada correctamente");
            }
        }catch(Exception e){
            
        }
    }
    
}
