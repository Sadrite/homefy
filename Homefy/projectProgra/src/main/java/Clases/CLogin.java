/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import com.mycompany.login.FormMenuPrincipal;
import com.mycompany.projectprogra.FormLogin;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author samue
 */
public class CLogin {
    
    public void validaUsuario(JTextField usuario, JPasswordField contrasenia){
       
        try {
            ResultSet rs = null;
            PreparedStatement ps = null;
            Clases.ConectionDB objetoConexion = new Clases.ConectionDB();
            
            String consulta = "select * from Usuarios where Usuarios.ingresoUsuario = (?) and Usuarios.ingresoContrasenia = (?);";
            ps = objetoConexion.estableceConexion().prepareStatement(consulta);
            
            String contras = String.valueOf(contrasenia.getPassword());
            ps.setString(1, usuario.getText());
            ps.setString(2, contras);
            
            rs = ps.executeQuery();
            
            if (rs.next()){
                FormMenuPrincipal objetoMenu = new FormMenuPrincipal();
                objetoMenu.setVisible(true);
                
            }
            else{
                JOptionPane.showMessageDialog(null, "Las credenciales ingresadas son incorrectas");
            }
            
        }catch (Exception e ){
            JOptionPane.showMessageDialog(null, "ERROR: " + e.toString());
        }
    }
}
