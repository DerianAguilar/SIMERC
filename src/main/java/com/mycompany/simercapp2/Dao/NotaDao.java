
package com.mycompany.simercapp2.Dao;

import com.mycompany.simercapp2.Config.conexion;
import com.mycompany.simercapp2.Modelo.Nota;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class NotaDao extends conexion{
    
    public boolean guardar(Nota not,int id){
        Connection con = getConection();
        PreparedStatement ps = null;
        
        String sql = "INSERT INTO nota (titulo,descripcion,fecha,id_asesor) VALUES (?,?,?,"+id+")";
        
        try {
            ps= con.prepareStatement(sql);
            
            ps.setString(1, not.getTitulo());
            ps.setString(2, not.getDescripcion());
            ps.setString(3, not.getFecha());
            ps.execute();
            
            return true;
            
        } catch (SQLException ex) {
            Logger.getLogger(NotaDao.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
        
        
    }
    
}
