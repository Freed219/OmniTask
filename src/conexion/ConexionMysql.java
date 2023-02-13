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
    private String usuario="admin";
    private String contrasenia="sxgRXnG9";
    private String servidor="mysql-110626-0.cloudclusters.net";
    private String puerto="19990";
    private String nombreDB="omnitask";
    private String url="jdbc:mysql://"+servidor+':'+puerto+'/'+nombreDB+"?serverTimezone=UTC";
    private String driver="com.mysql.cj.jdbc.Driver";
    public ConexionMysql() {
        try{
            Class.forName(driver);
            connection=DriverManager.getConnection(url,usuario,contrasenia);
            if(connection!=null){
                System.out.println("Conexion realizada correctamente");
            }
        }catch(Exception e){
            System.err.println("Ocurrio un error en la conexion");
            System.err.println("Mensaje de error: "+e.getMessage());
            System.err.println("Detalle");
            e.printStackTrace();
        }
    }

    public Connection getConnection() {
        return connection;
    }
    
}
