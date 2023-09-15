/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jdbc;

import javax.swing.JOptionPane;

import java.sql.*;
/**
 *
 * @author maria
 */
public class Jdbc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
        // TODO code application logic here
        try{
            Class.forName("org.mariadb.jdbc.Driver");
            
            Connection conn=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/universidadulp","root","");
            
            String sql="INSERT INTO empleado(dni,apellido,nombre,acceso,estado)"+"VALUES(123456,'toto','tomas',1,true)";
            
            PreparedStatement ps=conn.prepareStatement(sql);
            int registros=ps.executeUpdate();
            System.out.println(registros);
            
        }catch(ClassNotFoundException ex){
           JOptionPane.showMessageDialog(null,"debe agregar los driver del proyecto ex");
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error de conexión");
        }
    }
    
}
