package com.mycompany.simercapp2.Dao;

import com.mycompany.simercapp2.Config.conexion;
import com.mycompany.simercapp2.Modelo.Asesor;
import com.mycompany.simercapp2.Modelo.Nota;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RecordatorioDao extends conexion {

    public List recordatorio(int id, String fecha) {
        Connection con = getConection();
        PreparedStatement ps = null;
        ResultSet rs = null;

        List<Nota> datos = new ArrayList<>();
        String sql = "SELECT titulo,descripcion FROM nota WHERE id_asesor='" + id + "'AND fecha= '" + fecha + "'";

        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {

                Nota not = new Nota();

                not.setTitulo(rs.getString(1));
                not.setDescripcion(rs.getString(2));
                datos.add(not);

            }

        } catch (SQLException e) {
            System.err.println(e);
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(RecordatorioDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return datos;
    }

    public boolean valAdmin(int id) {

        Connection con = getConection();
        PreparedStatement ps = null;
        ResultSet rs = null;
        boolean  val = false;
        
        List<Asesor> datos = new ArrayList<>();
        String sql = "SELECT nombre FROM asesor WHERE rol='admin' AND id="+id;
         
        try {
            ps = con.prepareStatement(sql);
            rs= ps.executeQuery();
            
            while(rs.next()){
               val = true;
            }
            return val;
        } catch (SQLException ex) {
            Logger.getLogger(RecordatorioDao.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }

}
