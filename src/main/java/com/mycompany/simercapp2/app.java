
package com.mycompany.simercapp2;

import com.mycompany.simercapp2.Controlador.ControladorVistaLogin;
import com.mycompany.simercapp2.Controlador.ControladorVistaPrincipal;










public class app {
    public static void main(String[] args) {
        
        /*ControladorVistaPrincipal ctrlVistaPrincipal = new ControladorVistaPrincipal();
        ctrlVistaPrincipal.iniciar();*/
        ControladorVistaLogin ctrLogin = new ControladorVistaLogin();
        ctrLogin.iniciar();
    }
}
