
package com.mycompany.simercapp2.Controlador;


import com.google.protobuf.Internal;
import com.mycompany.simercapp2.Dao.AtareaDao;
import com.mycompany.simercapp2.Dao.RecordatorioDao;
import com.mycompany.simercapp2.Modelo.AsignarTarea;
import com.mycompany.simercapp2.Modelo.Nota;
import com.mycompany.simercapp2.Vista.VistaPrincipal;
import java.time.LocalDate;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;



public class ControladorVistaPrincipal {
   
    private VistaPrincipal vPrincipal;
    private String id;
    private RecordatorioDao rDao;
    private AtareaDao atareaDao;
    
    
    
    //private ControladorVistaNcontacto ctrlVistaNcontacto;

    public ControladorVistaPrincipal() {
        this.vPrincipal = new VistaPrincipal();
        this.rDao= new RecordatorioDao();
        this.atareaDao= new AtareaDao();
       vPrincipal.btnA.setVisible(false);
       vPrincipal.setVisible(false);
        
        
        
        
    }
    public void iniciar(String idU){
        this.id=idU;
        vPrincipal.setTitle("Pag - Principal");
        vPrincipal.setLocationRelativeTo(null);
        vPrincipal.setVisible(true);
        vPrincipal.txtIdU.setText(idU);
        vPrincipal.pCambar.setVisible(false);
        vPrincipal.pPerfil.setVisible(false);
        recordatorio();
        valAdmin();
        tareas();
        
    }

    public void recordatorio(){
        int id= Integer.parseInt(vPrincipal.txtIdU.getText());
        System.out.println(id);
        String titulo= "";
        String desc="";
        LocalDate fecha = LocalDate.now();
        String fech = String.valueOf(fecha);
        
        List<Nota> lista = rDao.recordatorio(id, fech);
        
        for(int i=0; i<lista.size();i++){
            titulo= lista.get(0).getTitulo();
            desc= lista.get(0).getDescripcion();
            
            
        }
        vPrincipal.txtTitulo.setText(titulo);
        vPrincipal.txtDesc.setText(desc);
        
        if(lista.size()>1){
            vPrincipal.btnS.setVisible(true);
        }else{
            vPrincipal.btnS.setVisible(false);
        }
    }
    
    public void valAdmin(){
        int id= Integer.parseInt(vPrincipal.txtIdU.getText());
        
        if(rDao.valAdmin(id)){
            vPrincipal.btnAtarea.setVisible(true);
            vPrincipal.pAtarea.setVisible(true);
            vPrincipal.btnTarea.setVisible(false);
            vPrincipal.pTarea.setVisible(false);
        }else{
            vPrincipal.btnAtarea.setVisible(false);
            vPrincipal.pAtarea.setVisible(false);
            vPrincipal.btnTarea.setVisible(true);
            vPrincipal.pAtarea.setVisible(true);
        }
    }
    
    public void tareas(){
        int id= Integer.parseInt(vPrincipal.txtIdU.getText());
        LocalDate fecha= LocalDate.now();
        String fech = String.valueOf(fecha);
        
        
        List<AsignarTarea> lista= atareaDao.mostrarTarea(id, fech);
        int nT= lista.size();
        
        if(nT != 0){
            vPrincipal.pMsj.setVisible(true);
            vPrincipal.msjTarea.setVisible(true);
            vPrincipal.msjTarea.setText("TAREAS PENDIENTE: "+nT);
            
        }else{
            vPrincipal.pMsj.setVisible(false);
            vPrincipal.msjTarea.setVisible(false);
            vPrincipal.msjTarea.setText("");
        }
        
        
    }
    
    
}
