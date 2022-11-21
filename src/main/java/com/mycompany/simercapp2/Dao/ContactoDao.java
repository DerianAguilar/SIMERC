package com.mycompany.simercapp2.Dao;

import com.mycompany.simercapp2.Modelo.Contacto;
import com.mycompany.simercapp2.Config.conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ContactoDao extends conexion {

    public boolean guardar(Contacto cot) {
        PreparedStatement ps = null;
        Connection con = getConection();

        String sql = "INSERT INTO contacto (tDocumento,documento,nombre,apellido,nacionalidad,correo,telefono,colegio,direccion,modalidad,id_asesor ) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
        int asesor = 1;
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
            ps.setString(10, cot.getModalidad());
            ps.setInt(11, asesor);
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
