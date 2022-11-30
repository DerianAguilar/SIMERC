
package com.mycompany.simercapp2.Controlador;

import com.mycompany.simercapp2.Dao.AtareaDao;
import com.mycompany.simercapp2.Modelo.AsignarTarea;
import com.mycompany.simercapp2.Vista.VistaTarea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.util.List;


public class ControladorVistaTareas implements ActionListener{

    private VistaTarea vt;
    private AtareaDao atareaDao;
    
    
    private String idU;

    public ControladorVistaTareas() {
        this.vt= new VistaTarea();
        this.atareaDao= new AtareaDao();
        
        this.vt.btnRealizada.addActionListener(this);
    }
    
    public void iniciar(String id){
        this.idU=id;
        vt.setVisible(true);
        vt.setLocationRelativeTo(null);
        vt.txtIdU.setText(id);
        mostrar();
        vt.atras.setVisible(false);
        
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
    
    public void mostrar(){
        int id= Integer.parseInt(vt.txtIdU.getText());
        LocalDate fecha= LocalDate.now();
        String fech = String.valueOf(fecha);
        String titulo="";
        String desc= "";
        int idF=0;
        
        List<AsignarTarea> lista= atareaDao.mostrarTarea(id, fech);
        
        for(int i=0;i<lista.size();i++){
            
            idF= lista.get(0).getId();
            titulo= lista.get(0).getTitulo();
            desc= lista.get(0).getDescripcion();
            
        }
        String idTarea= String.valueOf(idF);
        
        vt.txtIdTarea.setText(idTarea);
        vt.txtTitulo.setText(titulo);
        vt.txtDescripcion.setText(desc);
        
        if(lista.size()>1){
            vt.siguiente.setVisible(true);
        }else{
            vt.siguiente.setVisible(false);
        }
        
        
    }
}
