package com.mycompany.simercapp2.Dao;

import com.mycompany.simercapp2.Modelo.RegContacto;
import com.mycompany.simercapp2.Config.conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RegContactoDao extends conexion {

    public boolean guardar(RegContacto regCot) {

        PreparedStatement ps = null;
        Connection con = getConection();

        String sql = "INSERT INTO reg_contacto (medio,descripcion,fecha,id_contacto) VALUES (?,?,?,?)";
        
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, regCot.getMedio());
            ps.setString(2, regCot.getDescripcion());
            ps.setString(3, regCot.getFecha());
            ps.setInt(4, regCot.getId_contacto());
            ps.execute();
            return true;
        } catch (SQLException ex) {
            System.err.println(ex);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                System.err.println(ex);
            }
        }

    }

}
