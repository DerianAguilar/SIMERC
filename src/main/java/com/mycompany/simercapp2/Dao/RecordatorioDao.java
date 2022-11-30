
package com.mycompany.simercapp2.Dao;

import com.mycompany.simercapp2.Config.conexion;
import com.mycompany.simercapp2.Modelo.Nota;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class RecordatorioDao extends conexion{
    
    public List recordatorio(int id, String fecha){
        Connection con = getConection();
        PreparedStatement ps = null;
        ResultSet rs= null;
        
        List<Nota> datos= new ArrayList<>();
        String sql= "SELECT titulo,descripcion FROM nota WHERE id_asesor='"+id+"'AND fecha= '"+fecha+"'";
        
        try {
            ps= con.prepareStatement(sql);
            rs= ps.executeQuery();
            
            while(rs.next()){
                
                Nota not = new Nota();
                
                not.setTitulo(rs.getString(1));
                not.setDescripcion(rs.getString(2));
                datos.add(not);
                
            }
            
            
        } catch (SQLException e) {
            System.err.println(e);
        }
        return datos;
    }
    
}
