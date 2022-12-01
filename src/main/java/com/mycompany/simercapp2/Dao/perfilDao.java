
package com.mycompany.simercapp2.Dao;

import com.mycompany.simercapp2.Config.conexion;
import com.mycompany.simercapp2.Modelo.Asesor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class perfilDao extends conexion {
     public List perfil(int id){
        
        Connection con = getConection();
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        List<Asesor> datos = new ArrayList<>();
        String sql="SELECT UPPER(nombre), UPPER(apellido) FROM asesor WHERE id="+id;
        
        try {
            ps = con.prepareStatement(sql);
            rs= ps.executeQuery();
            
            while(rs.next()){
                Asesor as = new Asesor();
                
                as.setNombre(rs.getString(1));
                as.setApellido(rs.getString(2));
                
                datos.add(as);
                
                
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(perfilDao.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(perfilDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return datos;
        
    }
    
    public boolean cambiarCon(Asesor as,int id){
        
        Connection con = getConection();
        PreparedStatement ps = null;
        
        String sql = "UPDATE asesor SET password=? WHERE password=? AND id=?";
        try {
            
            System.out.println(as.getPassword());
            System.out.println(as.getContraseña());
           ps=con.prepareStatement(sql);
           
           ps.setString(1, as.getContraseña());
           ps.setString(2, as.getPassword());
           ps.setInt(3, id);
           
           ps.execute();
           
           return true;
        
        
        } catch (SQLException e) {
            System.out.println(e);
            return false;
        }finally{
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(perfilDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
            
    }
    
    public boolean eliminar(String fecha){
        Connection con = getConection();
        PreparedStatement ps = null;
        
        String sql="DELETE FROM asig_tarea WHERE fecha!=?";
        
        try {
            ps=con.prepareStatement(sql);
            ps.setString(1, fecha);
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(perfilDao.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    public boolean eliminarN(String fecha){
        Connection con = getConection();
        PreparedStatement ps = null;
        
        String sql="DELETE FROM nota WHERE fecha!=?";
        
        try {
            ps=con.prepareStatement(sql);
            ps.setString(1, fecha);
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(perfilDao.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
}
