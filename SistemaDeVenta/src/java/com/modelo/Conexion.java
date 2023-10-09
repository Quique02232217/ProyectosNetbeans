/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.modelo;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author User
 */
public class Conexion {
    public static final String url = "jdbc:mysql://localhost:3306/ticket";
    public static final String username = "root";
    public static final String password = "02232217";
    
    public static Connection getConection(){
        Connection con = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(url, username, password);
        }catch(HeadlessException | ClassNotFoundException | SQLException s){
            s.getMessage();
        
        }
        
        
        return con;
        
    }
}
