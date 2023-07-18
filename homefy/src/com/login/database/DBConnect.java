/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.login.database;

import java.sql.*;
import javax.swing.*;

public class DBConnect {
    Connection conn = null;
    public static Connection ConnectDb(){
        try{
           Class.forName("com.mysql.cj.jdbc.Driver");
           Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/homefy", "root","1234");
           return conn;
    
        }catch(Exception e){
           JOptionPane.showMessageDialog(null, e); 
        }
        return null;
        
    }
    
    
    
}
