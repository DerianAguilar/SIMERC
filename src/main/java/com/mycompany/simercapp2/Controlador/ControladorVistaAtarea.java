
package com.mycompany.simercapp2.Controlador;

import com.mycompany.simercapp2.Dao.AtareaDao;
import com.mycompany.simercapp2.Modelo.Asesor;
import com.mycompany.simercapp2.Modelo.AsignarTarea;
import com.mycompany.simercapp2.Vista.VistaAtarea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;


public class ControladorVistaAtarea implements ActionListener{

    private VistaAtarea vAtarea;
    private AtareaDao aDao;
    private AsignarTarea ast;
    
    private String idU;

    public ControladorVistaAtarea() {
        this.vAtarea= new VistaAtarea();
        this.aDao= new AtareaDao();
        this.ast= new AsignarTarea();
        
        this.vAtarea.btnGuardar.addActionListener(this);
    }
    
    public void iniciar(String id){
        this.idU=id;
        vAtarea.setVisible(true);
        vAtarea.setLocationRelativeTo(null);
        vAtarea.txtIdU.setText(id);
        
        mostrar();
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==vAtarea.btnGuardar){
            guardar();
        }
    }
    
    public void mostrar(){
        
        DefaultTableModel modelo = new DefaultTableModel();
        List<Asesor> lista= aDao.mostrar();
        
        modelo.addColumn("ID");
        modelo.addColumn("NOMBRE");
        modelo.addColumn("APELLIDO");
        vAtarea.tPara.setModel(modelo);
        
        
        
        Object[] object = new Object[3];
        for(int i=0; i<lista.size();i++){
            object[0]= lista.get(i).getId();
            object[1]= lista.get(i).getNombre();
            object[2]= lista.get(i).getApellido();
            modelo.addRow(object);
            
        }
        vAtarea.tPara.setModel(modelo);
        
    }
    
    public void guardar(){
        int idU= Integer.parseInt(vAtarea.txtIdU.getText());
        int idF= Integer.parseInt(vAtarea.txtIdFila.getText());
        String fecha = ((JTextField)vAtarea.fecha.getDateEditor().getUiComponent()).getText();
        int est=0;
        
        ast.setTitulo(vAtarea.jtTitulo.getText());
        ast.setDescripcion(vAtarea.jtdescripcion.getText());
        ast.setFecha(fecha);
        ast.setEstado(est);
        ast.setAsesorE(idU);
        ast.setAsesorR(idF);
        
        if(aDao.guardar(ast)){
            JOptionPane.showMessageDialog(null, "SE ASIGNO LA TAREA");
        }else{
            JOptionPane.showMessageDialog(null, "NO SE ASIGNO LA TAREA");
        }
        
        vAtarea.jtTitulo.setText("");
        vAtarea.jtdescripcion.setText("");
        vAtarea.fecha.setCalendar(null);
        
    }
}
