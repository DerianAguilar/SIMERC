
package com.mycompany.simercapp2.Controlador;

import com.mycompany.simercapp2.Modelo.Asesor;
import com.mycompany.simercapp2.Vista.vistaLogin;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class ControladorVistaLogin implements MouseListener{
    
    private vistaLogin vLogin;
    private Asesor as;

    public ControladorVistaLogin() {
        this.vLogin= new vistaLogin();
        this.as= new Asesor();
        this.vLogin.btnIngresar.addMouseListener(this);
        this.vLogin.btnRegistrar.addMouseListener(this);
        
        
    }
    public void iniciar(){
        vLogin.setTitle("INICIO DE SESION");
        vLogin.setLocationRelativeTo(null);
        mostrar();
        vLogin.ventanaRegistrar.setVisible(false);
    }
    public void mostrar(){
        vLogin.setVisible(true);
    }
    public void ocultar(){
        vLogin.setVisible(false);
    }

    
    
    
    
    
   

    @Override
    public void mouseClicked(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mousePressed(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
