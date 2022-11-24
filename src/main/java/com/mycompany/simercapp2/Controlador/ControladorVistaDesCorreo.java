package com.mycompany.simercapp2.Controlador;

import com.mycompany.simercapp2.Vista.VistaDesCorreo;

public class ControladorVistaDesCorreo {

    private VistaDesCorreo vdc;

    private String idU;
    private String idFila;

    public ControladorVistaDesCorreo() {
        this.vdc = new VistaDesCorreo();

    }

    public void mostrar(String idU, String idFila) {
        this.idU = idU;
        this.idFila = idFila;

        vdc.setLocationRelativeTo(null);
        vdc.setVisible(true);
        vdc.txtIdU.setText(idU);
        vdc.txtFila.setText(idFila);

    }

}
