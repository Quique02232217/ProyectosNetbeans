/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author User
 */
public class PrendaVestirDAO {
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    public List Listar(){
        List<PrendaVestir> listadeprendas = new ArrayList<>();
        String sql = "select * from prenda";
        try{
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                PrendaVestir prenda = new PrendaVestir();
                prenda.setId(rs.getInt(1));
                prenda.setImagen(rs.getBinaryStream(2));
                prenda.setNombre(rs.getString(3));
                prenda.setPrecio(rs.getInt(4));
                prenda.setTalla(rs.getString(5));
                prenda.setColor(rs.getString(6));
                listadeprendas.add(prenda);
            }
        }catch(Exception e){
        }
        return listadeprendas;
    }
    
    public void listarImagen(int id, HttpServletResponse response){
        String sql = "select * from prenda where Id=" + id;
        InputStream inputstream = null;
        OutputStream outputstream = null;
        BufferedInputStream bufferedinputstream = null;
        BufferedOutputStream bufferesoutputstream = null;
        response.setContentType("image/*");
        
        try{
            outputstream=response.getOutputStream();
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            if(rs.next()){
                inputstream = rs.getBinaryStream("imagen");
            }
            
            bufferedinputstream = new BufferedInputStream(inputstream);
            bufferesoutputstream = new BufferedOutputStream(outputstream);
            int i = 0;
            while((i = bufferedinputstream.read()) != -1){
                bufferesoutputstream.write(i);
            }
        }catch(Exception e){
        
        }
    }
    
}
