package com.mycompany.simercapp2.Dao;

import com.mycompany.simercapp2.Config.conexion;
import com.mycompany.simercapp2.Modelo.Asesor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class InicioRegistroDao extends conexion {

    public boolean guardar(Asesor as) {

        Connection con = getConection();
        PreparedStatement ps;
        String sql = "INSERT INTO asesor (documento,nombre,apellido,correo,password,rol) VALUES (?,?,?,?,?,?)";

        String rol = "user";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, as.getDocumento());
            ps.setString(2, as.getNombre());
            ps.setString(3, as.getApellido());
            ps.setString(4, as.getCorreo());
            ps.setString(5, as.getPassword());
            ps.setString(6, rol);
            ps.execute();
            return true;

        } catch (SQLException ex) {
            System.err.println(ex);
            return false;
        }

    }
    public boolean ingresar(String user,String pass){
        Connection con = getConection();
        PreparedStatement ps=null;
        ResultSet rs;
        
        String sql = "SELECT correo, password FROM asesor WHERE correo='"+user+"' AND password='"+pass+"'";
        
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            if(rs.next()){
                return true;
            }else {
                return false;
            }
        } catch (SQLException ex) {
            System.err.println(ex);
            return false;
        }
        
        
    }

}
