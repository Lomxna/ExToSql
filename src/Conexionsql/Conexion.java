/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexionsql;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author ediso
 */
public class Conexion {
         Connection conexion =null;
    String Usuario ="Usersql";
    String Clave ="123456";
    String db ="DB_Budgets";
    String puerto="1433";
    
    public Connection obtenerconexion(){
       
try{
    
String cadena= "jdbc:sqlserver://localhost:"+puerto+" ; "+"databaseName= "+db;
conexion=DriverManager.getConnection(cadena,Usuario,Clave);

    
}catch(Exception ex){
    JOptionPane.showMessageDialog(null, "Error"+ex.toString());
}
return conexion;
    }
}
