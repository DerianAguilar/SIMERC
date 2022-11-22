package com.mycompany.simercapp2.Controlador;

import com.mycompany.simercapp2.Dao.InicioRegistroDao;
import com.mycompany.simercapp2.Modelo.Asesor;
import com.mycompany.simercapp2.Vista.vistaLogin;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;

public class ControladorVistaLogin implements MouseListener {

    private vistaLogin vLogin;
    private Asesor as;
    private InicioRegistroDao registrarDao;
    private ControladorVistaPrincipal ctrlVistaPrincipal;

    public ControladorVistaLogin() {
        this.vLogin = new vistaLogin();
        this.as = new Asesor();
        this.registrarDao = new InicioRegistroDao();
        this.ctrlVistaPrincipal = new ControladorVistaPrincipal();
        this.vLogin.btnIngresar.addMouseListener(this);
        this.vLogin.btnRegistrar.addMouseListener(this);
        this.vLogin.btnCancelar.addMouseListener(this);
        this.vLogin.btnGuardar.addMouseListener(this);

    }

    public void iniciar() {
        vLogin.setTitle("INICIO DE SESION");
        vLogin.setLocationRelativeTo(null);
        vLogin.txtConIn.setVisible(false);
        mostrar();
        vLogin.ventanaRegistrar.setVisible(false);
    }

    public void mostrar() {
        vLogin.setVisible(true);
    }

    public void ocultar() {
        vLogin.setVisible(false);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == vLogin.btnIngresar) {
            ingresar();
        }
        if (e.getSource() == vLogin.btnRegistrar) {
            vLogin.ventanaRegistrar.setVisible(true);
            vLogin.ventanaInicioSesion.setVisible(false);
        }
        if (e.getSource() == vLogin.btnCancelar) {
            limpiar();
            vLogin.ventanaRegistrar.setVisible(false);
            vLogin.ventanaInicioSesion.setVisible(true);
        }
        if (e.getSource() == vLogin.btnGuardar) {
            guardar();
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    public void guardar() {

        as.setDocumento(vLogin.jtDocumento.getText());
        as.setNombre(vLogin.jtNombre.getText());
        as.setApellido(vLogin.jtApellido.getText());
        as.setCorreo(vLogin.jtCorreo.getText());
        as.setPassword(vLogin.jtContraseña.getText());

        if (registrarDao.guardar(as)) {
            JOptionPane.showMessageDialog(null, "SE REGISTRO CORRECTAMENTE");
            limpiar();
        } else {
            JOptionPane.showMessageDialog(null, "NO SE GUARDO EL REGISTRO");
        }
    }

    public void ingresar() {
        String user = vLogin.jtUser.getText();
        String pass = String.valueOf(vLogin.jtPass.getText());
       
            
            if (registrarDao.ingresar(user, pass)) {
                ocultar();
                limpiarI();
                ctrlVistaPrincipal.iniciar();

            }else{
                limpiarI();
                vLogin.txtConIn.setVisible(true);
            }
        
    }
    public void limpiarI() {
        vLogin.jtUser.setText("");
        vLogin.jtPass.setText("");
    }
    public void limpiar() {
        vLogin.jtDocumento.setText("");
        vLogin.jtNombre.setText("");
        vLogin.jtApellido.setText("");
        vLogin.jtCorreo.setText("");
        vLogin.jtContraseña.setText("");
    }

}
