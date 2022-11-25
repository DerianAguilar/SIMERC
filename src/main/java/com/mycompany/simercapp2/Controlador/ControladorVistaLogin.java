package com.mycompany.simercapp2.Controlador;

import com.mycompany.simercapp2.Dao.InicioRegistroDao;
import com.mycompany.simercapp2.Modelo.Asesor;
import com.mycompany.simercapp2.Vista.vistaLogin;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;
import javax.swing.JOptionPane;

public class ControladorVistaLogin implements MouseListener {

    private vistaLogin vLogin;
    private Asesor as;
    private InicioRegistroDao registrarDao;
    private ControladorVistaPrincipal ctrlVistaPrincipal;
    private ControladorVistaNcontacto ctrlVistaNcontacto;

    public ControladorVistaLogin() {
        this.vLogin = new vistaLogin();
        this.as = new Asesor();
        this.registrarDao = new InicioRegistroDao();
        this.ctrlVistaPrincipal = new ControladorVistaPrincipal();
        this.ctrlVistaNcontacto = new ControladorVistaNcontacto();
        this.vLogin.btnIngresar.addMouseListener(this);
        this.vLogin.btnRegistrar.addMouseListener(this);
        this.vLogin.btnCancelar.addMouseListener(this);
        this.vLogin.btnGuardar.addMouseListener(this);
        this.vLogin.btnAceptar.addMouseListener(this);

    }

    public void iniciar() {
        vLogin.setTitle("INICIO DE SESION");
        vLogin.setLocationRelativeTo(null);
        vLogin.txtConIn.setVisible(false);
        mostrar();
        vLogin.ventanaRegistrar.setVisible(false);
        vLogin.txtConInVal.setVisible(false);
        vLogin.pValAdmin.setVisible(false);

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
            vLogin.ventanaInicioSesion.setVisible(false);
            vLogin.pValAdmin.setVisible(true);

        }
        if (e.getSource() == vLogin.btnAceptar) {
            System.out.println("achaehjbvsbv");
            valAdmin();

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
        as.setContraseña(vLogin.jtConCorreo.getText());

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
        String id = "";

        if (registrarDao.ingresar(user, pass)) {
            List<Asesor> lista = registrarDao.enId(user, pass);
            for (int i = 0; i < lista.size(); i++) {
                id = String.valueOf(lista.get(i).getId());
            }

            ocultar();
            limpiarI();
            ctrlVistaPrincipal.iniciar(id);

        } else {
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
        vLogin.jtConCorreo.setText("");
    }

    public void valAdmin() {
        String pass = String.valueOf(vLogin.txtClaveAd.getText());

        if (registrarDao.valAd(pass)) {
            vLogin.txtClaveAd.setText("");
            vLogin.ventanaRegistrar.setVisible(true);
            vLogin.ventanaInicioSesion.setVisible(false);
            vLogin.pValAdmin.setVisible(false);
        } else {
            vLogin.txtClaveAd.setText("");
            vLogin.txtConInVal.setVisible(true);
        }

    }

}
