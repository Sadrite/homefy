/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author samue
 */
public class ConectionDB {
    
   Connection conectar;
   
   String usuario = "root";
   String contrasena = "1234";
   String bd = "homefy";
   String ip = "localhost";
   String puerto = "3306";
   
   String cadena = "jdbc:mysql://"+ip+":"+puerto+"/"+bd;
   
   public Connection estableceConexion(){
     try{
         
         Class.forName("com.mysql.jdbc.Driver");
         conectar = DriverManager.getConnection(cadena,usuario,contrasena);
          
     }catch (Exception e){
         JOptionPane.showMessageDialog(null, "Problemas en la conexion" + e.toString());
     }
     return conectar;
   }  
    
}
