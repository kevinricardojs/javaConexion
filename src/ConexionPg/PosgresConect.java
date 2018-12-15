/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConexionPg;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


/**
 *
 * @author DajuOST
 */
public class PosgresConect {
    
    private Connection conx = null;
    private PreparedStatement pr = null;
    
    private String driver = "org.postgresql.Driver";
    private String usuario = "postgres";
    private String clave = "wester";
    private String base = "midb";
    private String servidor = "localhost";
    private String puerto = "5432";
    private String url = "jdbc:postgresql://" + servidor + ":" + puerto +"/" + base;
    
    public void buscar(){
        try{
        Class.forName(driver);
        conx = DriverManager.getConnection (url, usuario, clave);
        String sql = "select * from persona";
        
        Statement statemante = conx.createStatement();
         ResultSet rsm= statemante.executeQuery(sql);
         
         while(rsm.next()){
             System.out.println(rsm.getString("nombre") + " " + rsm.getString("edad") + " " + rsm.getString("sexo"));
         }
        conx.close();
        }
        catch(ClassNotFoundException | SQLException e){
            System.out.println(e
            );
        }
    }
}
