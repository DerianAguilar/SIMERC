package com.mycompany.simercapp2.Controlador;

import com.mycompany.simercapp2.Vista.VistaRegSeguimiento;
import com.mycompany.simercapp2.Dao.RegContactoDao;
import com.mycompany.simercapp2.Modelo.RegContacto;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ControladorRegContacto implements ActionListener{
    
    private RegContacto regCot;
    private RegContactoDao regCotDao;
    private VistaRegSeguimiento vRegCot;
    
    private RegContacto rCot;
    private int id;
    private String idU;
    
    public ControladorRegContacto() {
        this.regCot = new RegContacto();
        this.regCotDao = new RegContactoDao();
        this.vRegCot = new VistaRegSeguimiento();
        this.rCot=new RegContacto();
        
        this.vRegCot.btnGuardar.addActionListener(this);
        this.vRegCot.btnCancelar.addActionListener(this);
        
        
    }
    
    public void iniciar(int id,String idU) {
        this.id=id;
        this.idU=idU;
        vRegCot.setTitle("REGISTRAR SEGUIMIENTO");
        vRegCot.setLocationRelativeTo(null);
        mostrar();
        vRegCot.jtId.setText(String.valueOf(id));
        vRegCot.txtIdU.setText(idU);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vRegCot.btnGuardar) {
            guardar();
        }
        if (e.getSource() == vRegCot.btnCancelar) {
            cancelar();
        }
        
    }
    
    public void guardar() {
        
        String md = vRegCot.cmbMedio.getSelectedItem().toString();
        String fecha = ((JTextField) vRegCot.jtChooser.getDateEditor().getUiComponent()).getText();
        
        
        regCot.setMedio(md);
        regCot.setDescripcion(vRegCot.jtDescripcion.getText());
        regCot.setFecha(fecha);
        regCot.setId_contacto(id);
        
        
        
        if (regCotDao.guardar(regCot)) {
            JOptionPane.showMessageDialog(null, "GUARDADO EXITOSAMENTE");
            limpiar();
        } else {
            JOptionPane.showMessageDialog(null, "NO SE GUARDO");
            limpiar();
        }
        
    }

    public void cancelar() {
        limpiar();
    }
    
    public void limpiar() {
        vRegCot.jtDescripcion.setText(null);
    }
    
    public void mostrar() {
        vRegCot.setVisible(true);
    }
    
    public void ocultar() {
        vRegCot.setVisible(false);
    }

    

   

   
    
}
