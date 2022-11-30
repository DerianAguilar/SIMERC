package com.mycompany.simercapp2.Dao;

import com.mycompany.simercapp2.Modelo.Contacto;
import com.mycompany.simercapp2.Modelo.RegContacto;
import com.mycompany.simercapp2.Config.conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class seguimientoDao extends conexion {

    public List buscar(String buscar) {

        Connection con = getConection();
        PreparedStatement ps;
        ResultSet rs;

        List<Contacto> datos = new ArrayList<>();
        String sql = "SELECT a.id,a.tDocumento,a.documento,a.nombre,a.apellido,a.programa,a.modalidad FROM contacto a WHERE a.nombre LIKE '%" + buscar + "%' OR a.apellido LIKE '%" + buscar + "%' OR a.documento LIKE '%" + buscar + "%' GROUP BY a.nombre ORDER BY a.id";
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                Contacto cot = new Contacto();

                cot.setId(rs.getInt(1));
                cot.setTipoDocumento(rs.getString(2));
                cot.setDocumento(rs.getString(3));
                cot.setNombre(rs.getString(4));
                cot.setApellido(rs.getString(5));
                cot.setPrograma(rs.getString(6));
                cot.setModalidad(rs.getString(7));

                datos.add(cot);

            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(seguimientoDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return datos;

    }

    public List ver(int id) {

        Connection con = getConection();
        PreparedStatement ps;
        ResultSet rs;

        List<RegContacto> datos = new ArrayList<>();
        String sql = "SELECT a.id,a.medio,a.descripcion,a.fecha FROM reg_contacto a WHERE a.id_contacto =" + id;

        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                RegContacto regCot = new RegContacto();
                regCot.setId(rs.getInt(1));
                regCot.setMedio(rs.getString(2));
                regCot.setDescripcion(rs.getString(3));
                regCot.setFecha(rs.getString(4));
                datos.add(regCot);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(seguimientoDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return datos;
    }

}
