package com.mycompany.simercapp2.Controlador;

import com.mycompany.simercapp2.Dao.EnCorreoDao;
import com.mycompany.simercapp2.Modelo.Contacto;
import com.mycompany.simercapp2.Vista.VistaEnCorreo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ControladorVistaEnCorreo implements ActionListener {

    private VistaEnCorreo vEnCorreo;
    private String id;
    private EnCorreoDao enCorreoDao;

    public ControladorVistaEnCorreo() {
        this.vEnCorreo = new VistaEnCorreo();
        this.enCorreoDao = new EnCorreoDao();
        this.vEnCorreo.btnBuscar.addActionListener(this);
        this.vEnCorreo.btnSiguiente.addActionListener(this);
    }

    public void iniciar(String idU) {
        this.id = idU;
        vEnCorreo.setTitle("Enviar Correo");
        vEnCorreo.setLocationRelativeTo(null);
        mostrar();
        vEnCorreo.txtIdU.setText(idU);
    }

    public void mostrar() {
        vEnCorreo.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vEnCorreo.btnBuscar) {
            buscar(vEnCorreo.tablaCorreo);
        }
        if(e.getSource()==vEnCorreo.btnSiguiente){
            String idU= vEnCorreo.txtIdU.getText();
            String idFila=vEnCorreo.txtidFila.getText();
            siguiente();
        }
        
    }

    public void buscar(JTable tabla) {
        String buscar = vEnCorreo.jtBuscar.getText();
        if (buscar.equals("")) {
            System.out.println("Ninguna palabra a buscar");
        } else {
            DefaultTableModel modelo = new DefaultTableModel();
            List<Contacto> lista = enCorreoDao.buscar(buscar);
            
            modelo.addColumn("ID");
            modelo.addColumn("DOCUMENTO");
            modelo.addColumn("NOMBRE");
            modelo.addColumn("APELLIDO");
            modelo.addColumn("CORREO");
            vEnCorreo.tablaCorreo.setModel(modelo);
            
            Object[] object = new Object[5];
            for(int i=0;i<lista.size();i++){
                object[0]=lista.get(i).getId();
                object[1]=lista.get(i).getDocumento();
                object[2]=lista.get(i).getNombre();
                object[3]=lista.get(i).getApellido();
                object[4]=lista.get(i).getCorreo();
                modelo.addRow(object);
            }
            vEnCorreo.tablaCorreo.setModel(modelo);
        }

    }
    public void siguiente(){
        
    }
    

}
