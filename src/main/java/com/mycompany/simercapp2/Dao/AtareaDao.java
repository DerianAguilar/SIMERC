package com.mycompany.simercapp2.Dao;

import com.mycompany.simercapp2.Config.conexion;
import com.mycompany.simercapp2.Modelo.Asesor;
import com.mycompany.simercapp2.Modelo.AsignarTarea;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AtareaDao extends conexion {

    public List mostrar() {
        Connection con = getConection();
        PreparedStatement ps = null;
        ResultSet rs = null;

        List<Asesor> datos = new ArrayList<>();
        String sql = "SELECT id,nombre,apellido FROM asesor WHERE rol='user'";
        
        try {
            ps = con.prepareStatement(sql);
            rs= ps.executeQuery();
            
            while(rs.next()){
                Asesor as = new Asesor();
                
                as.setId(rs.getInt(1));
                as.setNombre(rs.getString(2));
                as.setApellido(rs.getString(3));
                
                datos.add(as);
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(AtareaDao.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(AtareaDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return datos;
    }
    
    public boolean guardar(AsignarTarea ast){
        Connection con = getConection();
        PreparedStatement ps= null;
        
        
        String sql = "INSERT INTO asig_tarea (titulo,descripcion,fecha,estado,id_asesorE,id_asesorR) VALUES (?,?,?,?,?,?)";
        
        try {
            ps = con.prepareStatement(sql);
            
            ps.setString(1, ast.getTitulo());
            ps.setString(2, ast.getDescripcion());
            ps.setString(3, ast.getFecha());
            ps.setInt(4, ast.getEstado());
            ps.setInt(5, ast.getAsesorE());
            ps.setInt(6, ast.getAsesorR());
            ps.execute();
            
            return true;
            
        } catch (SQLException ex) {
            Logger.getLogger(AtareaDao.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }finally{
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(AtareaDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        
    }
    
    public List mostrarTarea(int id,String fecha){
        Connection con = getConection();
        PreparedStatement ps= null;
        ResultSet rs= null;
        
        List<AsignarTarea> datos = new ArrayList<>();
        String sql="SELECT id,titulo,descripcion,estado FROM asig_tarea WHERE id_asesorR="+id+" AND estado=0 AND fecha='"+fecha+"'";
        
        try {
            ps = con.prepareStatement(sql);
            rs= ps.executeQuery();
            
            while(rs.next()){
                AsignarTarea ast = new AsignarTarea();
                
                ast.setId(rs.getInt(1));
                ast.setTitulo(rs.getString(2));
                ast.setDescripcion(rs.getString(3));
                ast.setEstado(rs.getInt(4));
                
                datos.add(ast);
                 
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(AtareaDao.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(AtareaDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return  datos;
    }
    
    public boolean guardarEstado(AsignarTarea ast){
     
        Connection con = getConection();
        PreparedStatement ps = null;
        
        String sql= "UPDATE asig_tarea SET estado=? WHERE id=? AND id_asesorR=?";
        
        try {
            ps = con.prepareStatement(sql);
            
            ps.setInt(1, ast.getEstado());
            ps.setInt(2, ast.getId());
            ps.setInt(3, ast.getAsesorR());
            ps.executeUpdate();
            
            
            return true;
           
            
        } catch (SQLException ex) {
            Logger.getLogger(AtareaDao.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }finally{
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(AtareaDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        
        
    }
}
