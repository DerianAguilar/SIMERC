package com.mycompany.simercapp2.Controlador;


import com.mycompany.simercapp2.Dao.ContactoDao;
import com.mycompany.simercapp2.Dao.InicioRegistroDao;
import com.mycompany.simercapp2.Modelo.Contacto;
import com.mycompany.simercapp2.Vista.vistaLogin;
import com.mycompany.simercapp2.Vista.VistaNcontacto;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class ControladorVistaNcontacto implements ActionListener{

    private Contacto cot;
    private ContactoDao cotDao;
    private VistaNcontacto vNcot;
    private vistaLogin vLog;
    private ControladorVistaPrincipal ctrlVistaPrincipal;
    private InicioRegistroDao registroDao;
    private String ida;

    public ControladorVistaNcontacto() {
        this.cot = new Contacto();
        this.cotDao = new ContactoDao();
        this.vNcot = new VistaNcontacto();
        this.vLog = new vistaLogin();
        this.ctrlVistaPrincipal = new ControladorVistaPrincipal();
        this.registroDao= new InicioRegistroDao();
        this.vNcot.btnGuardar.addActionListener(this);
        this.vNcot.btnCancelar.addActionListener(this);
        

    }

    public void iniciar(String idU) {
        this.ida=idU;
        vNcot.setTitle("nuevo contacto");
        vNcot.setLocationRelativeTo(null);
        vNcot.jtIdAs.setText(idU);
        String idString=vNcot.jtIdAs.getText();
        System.out.println(idString);
        mostrar();
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vNcot.btnGuardar) {
            guardar();

        }
        if (e.getSource() == vNcot.btnCancelar) {
            limpiar();
        }
    }

    public void limpiar() {
        vNcot.jtNombre.setText(null);
        vNcot.jtApellido.setText(null);
        vNcot.jtDocumento.setText(null);
        vNcot.jtNacionalidad.setText(null);
        vNcot.jtColegio.setText(null);
        vNcot.jtDireccion.setText(null);
        vNcot.jtTelefono.setText(null);
        vNcot.jtCorreo.setText(null);
    }

    public void guardar() {
        String td = vNcot.cmbTipoDocumento.getSelectedItem().toString();
        String md = vNcot.cmbModalidad.getSelectedItem().toString();
        int idAs = Integer.parseInt(vNcot.jtIdAs.getText());
        

        cot.setTipoDocumento(td);
        cot.setDocumento(vNcot.jtDocumento.getText());
        cot.setNombre(vNcot.jtNombre.getText());
        cot.setApellido(vNcot.jtApellido.getText());
        cot.setTelefono(vNcot.jtTelefono.getText());
        cot.setCorreo(vNcot.jtCorreo.getText());
        cot.setColegio(vNcot.jtColegio.getText());
        cot.setDireccion(vNcot.jtDireccion.getText());
        cot.setNacionalidad(vNcot.jtNacionalidad.getText());
        cot.setAsesor(idAs);
        cot.setModalidad(md);

        if (cotDao.guardar(cot)) {
            JOptionPane.showMessageDialog(null, "GUARDADO EXITOSAMENTE");
            limpiar();
        } else {
            JOptionPane.showMessageDialog(null, "NO SE GUARDO");
            limpiar();
        }
    }

    public void mostrar() {
        vNcot.setVisible(true);
    }

    public void ocultar() {
        vNcot.setVisible(false);
    }

   

   

}
