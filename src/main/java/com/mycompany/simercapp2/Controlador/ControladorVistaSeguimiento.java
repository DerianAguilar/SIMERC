package com.mycompany.simercapp2.Controlador;


import com.mycompany.simercapp2.Dao.seguimientoDao;
import com.mycompany.simercapp2.Modelo.Contacto;
import com.mycompany.simercapp2.Modelo.RegContacto;
import com.mycompany.simercapp2.Vista.vistaSeguimiento;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ControladorVistaSeguimiento implements ActionListener {

    private Contacto cot;
    private seguimientoDao segDao;
    private vistaSeguimiento vSeguimiento;
    private ControladorRegContacto ctrlRegContacto;
    private RegContacto rCot;
    
    DefaultTableModel modelo = new DefaultTableModel();

    public ControladorVistaSeguimiento() {
        this.cot = new Contacto();
        this.segDao = new seguimientoDao();
        this.vSeguimiento = new vistaSeguimiento();
        this.ctrlRegContacto=new ControladorRegContacto();
        this.rCot = new RegContacto();
        this.vSeguimiento.btnBuscar.addActionListener(this);
        this.vSeguimiento.brnVer.addActionListener(this);
        this.vSeguimiento.btnLimpiar.addActionListener(this);
        this.vSeguimiento.btnRegistrar.addActionListener(this);

    }

    public void iniciar() {
        vSeguimiento.setTitle("Ver Seguimiento");
        vSeguimiento.setLocationRelativeTo(null);
        vSeguimiento.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vSeguimiento.btnBuscar) {

            buscar(vSeguimiento.tContacto);
            vSeguimiento.jtBuscar.setText(null);
        }
        if (e.getSource() == vSeguimiento.brnVer) {

            ver(vSeguimiento.tHistorial);
        }
        if (e.getSource() == vSeguimiento.btnLimpiar) {
            
            
        }
        if(e.getSource()==vSeguimiento.btnRegistrar){
            
            int id =Integer.parseInt(vSeguimiento.jtVer.getText());
            ocultar();
            ctrlRegContacto.iniciar(id);
            
        }
    }
    

    public void buscar(JTable tabla) {
        String buscar = vSeguimiento.jtBuscar.getText();
        DefaultTableModel modelo = new DefaultTableModel();
        List<Contacto> lista = segDao.buscar(buscar);
        
        modelo.addColumn("ID");
        modelo.addColumn("T.D");
        modelo.addColumn("DOCUMENTO");
        modelo.addColumn("NOMBRE");
        modelo.addColumn("APELLIDO");
        modelo.addColumn("NACIONALIDAD");
        modelo.addColumn("CORREO");
        modelo.addColumn("TELEFONO");
        modelo.addColumn("COLEGIO");
        modelo.addColumn("DIRECCION");
        modelo.addColumn("MODALIDAD");
        modelo.addColumn("ASESOR");
        vSeguimiento.tContacto.setModel(modelo);
        
        Object[] object = new Object[12];
        for (int i = 0; i < lista.size(); i++) {
            object[0] = lista.get(i).getId();
            object[1] = lista.get(i).getTipoDocumento();
            object[2] = lista.get(i).getDocumento();
            object[3] = lista.get(i).getNombre();
            object[4] = lista.get(i).getApellido();
            object[5] = lista.get(i).getNacionalidad();
            object[6] = lista.get(i).getCorreo();
            object[7] = lista.get(i).getTelefono();
            object[8] = lista.get(i).getColegio();
            object[9] = lista.get(i).getDireccion();
            object[10] = lista.get(i).getModalidad();
            object[11] = lista.get(i).getAsesor();
            modelo.addRow(object);
        }
        vSeguimiento.tContacto.setModel(modelo);
    }

    public void ver(JTable tabla) {
            
            int id = Integer.parseInt(vSeguimiento.jtVer.getText());
            List<RegContacto> lista = segDao.ver(id);
            DefaultTableModel modelo = new DefaultTableModel();
            modelo.addColumn("ID");
            modelo.addColumn("MEDIO");
            modelo.addColumn("DESCRIPCION");
            modelo.addColumn("FECHA");
            vSeguimiento.tHistorial.setModel(modelo);

            Object[] object = new Object[4];
            for (int i = 0; i < lista.size(); i++) {
                object[0] = lista.get(i).getId();
                object[1] = lista.get(i).getMedio();
                object[2] = lista.get(i).getDescripcion();
                object[3] = lista.get(i).getFecha();
                modelo.addRow(object);

            }
        }
        
        public void ocultar(){
            vSeguimiento.setVisible(false);
        }

    }

    /*public void limpiarT() {
        vSeguimiento.jtBuscar.setText(null);
        String buscar = vSeguimiento.jtBuscar.getText();
        DefaultTableModel modelo = new DefaultTableModel();
        List<Contacto> lista = segDao.buscar(buscar);
        
        modelo.addColumn("ID");
        modelo.addColumn("T.D");
        modelo.addColumn("DOCUMENTO");
        modelo.addColumn("NOMBRE");
        modelo.addColumn("APELLIDO");
        modelo.addColumn("NACIONALIDAD");
        modelo.addColumn("CORREO");
        modelo.addColumn("TELEFONO");
        modelo.addColumn("COLEGIO");
        modelo.addColumn("DIRECCION");
        modelo.addColumn("MODALIDAD");
        modelo.addColumn("ASESOR");
        vSeguimiento.tContacto.setModel(modelo);
        
        Object[] object = new Object[12];
        for (int i = 0; i < lista.size(); i++) {
            object[0] = lista.get(i).getId();
            object[1] = lista.get(i).getTipoDocumento();
            object[2] = lista.get(i).getDocumento();
            object[3] = lista.get(i).getNombre();
            object[4] = lista.get(i).getApellido();
            object[5] = lista.get(i).getNacionalidad();
            object[6] = lista.get(i).getCorreo();
            object[7] = lista.get(i).getTelefono();
            object[8] = lista.get(i).getColegio();
            object[9] = lista.get(i).getDireccion();
            object[10] = lista.get(i).getModalidad();
            object[11] = lista.get(i).getAsesor();
            modelo.addRow(object);
        }
        vSeguimiento.tContacto.setModel(modelo);
        

    }*/

    

