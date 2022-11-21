
package com.mycompany.simercapp2.Controlador;

import com.mycompany.simercapp2.Vista.VistaPrincipal;


public class ControladorVistaPrincipal {
   
    private VistaPrincipal vPrincipal;
    //private ControladorVistaNcontacto ctrlVistaNcontacto;

    public ControladorVistaPrincipal() {
        this.vPrincipal = new VistaPrincipal();
        //this.ctrlVistaNcontacto= new ControladorVistaNcontacto();
        //this.vPrincipal.btnNC.addActionListener(this);
        
        
        
    }
    public void iniciar(){
        vPrincipal.setTitle("Pag - Principal");
        vPrincipal.setLocationRelativeTo(null);
        vPrincipal.setVisible(true);
    }

    /*@Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==vPrincipal.btnNC){
            ctrlVistaNcontacto.mostrar();
        }
    }
    */
    
    
}
