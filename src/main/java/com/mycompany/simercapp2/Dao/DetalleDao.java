package com.mycompany.simercapp2.Dao;

import com.mycompany.simercapp2.Config.conexion;
import com.mycompany.simercapp2.Modelo.Contacto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DetalleDao extends conexion {

    public List mostrar(int idC) {

        Connection con = getConection();
        PreparedStatement ps = null;
        ResultSet rs = null;

        List<Contacto> datos = new ArrayList<>();
        String sql = "SELECT a.*,b.nombre,b.apellido FROM contacto a INNER JOIN asesor b ON a.id_asesor=b.id AND a.id=" + idC;

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
                cot.setNacionalidad(rs.getString(6));
                cot.setCorreo(rs.getString(7));
                cot.setTelefono(rs.getString(8));
                cot.setColegio(rs.getString(9));
                cot.setDireccion(rs.getString(10));
                cot.setPrograma(rs.getString(11));
                cot.setModalidad(rs.getString(12));
                cot.setAsesor(rs.getInt(13));
                cot.setObservaciones(rs.getString(14));
                cot.setnAs(rs.getString(15));
                cot.setApAs(rs.getString(16));
                datos.add(cot);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(DetalleDao.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(DetalleDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return datos;

    }
    public boolean actualizar(Contacto cot){
        
        PreparedStatement ps = null;
        Connection con = getConection();

        String sql= "UPDATE contacto SET tDocumento=?,documento=?,nombre=?,apellido=?,nacionalidad=?,correo=?,telefono=?,colegio=?,direccion=?,programa=?,modalidad=?,observaciones=? WHERE id=?";
        
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, cot.getTipoDocumento());
            ps.setString(2, cot.getDocumento());
            ps.setString(3, cot.getNombre());
            ps.setString(4, cot.getApellido());
            ps.setString(5, cot.getNacionalidad());
            ps.setString(6, cot.getCorreo());
            ps.setString(7, cot.getTelefono());
            ps.setString(8, cot.getColegio());
            ps.setString(9, cot.getDireccion());
            ps.setString(10, cot.getPrograma());
            ps.setString(11, cot.getModalidad());
            ps.setString(12, cot.getObservaciones());
            ps.setInt(13, cot.getId());
            
            ps.execute();
            return true;

        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }

    }

}
