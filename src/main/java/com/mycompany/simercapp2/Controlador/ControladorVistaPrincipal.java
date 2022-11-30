
package com.mycompany.simercapp2.Controlador;


import com.mycompany.simercapp2.Dao.RecordatorioDao;
import com.mycompany.simercapp2.Modelo.Nota;
import com.mycompany.simercapp2.Vista.VistaPrincipal;
import java.time.LocalDate;
import java.util.List;



public class ControladorVistaPrincipal {
   
    private VistaPrincipal vPrincipal;
    private String id;
    private RecordatorioDao rDao;
    
    
    
    //private ControladorVistaNcontacto ctrlVistaNcontacto;

    public ControladorVistaPrincipal() {
        this.vPrincipal = new VistaPrincipal();
        this.rDao= new RecordatorioDao();
       vPrincipal.btnA.setVisible(false);
       vPrincipal.setVisible(false);
        
        
        
        
    }
    public void iniciar(String idU){
        this.id=idU;
        vPrincipal.setTitle("Pag - Principal");
        vPrincipal.setLocationRelativeTo(null);
        vPrincipal.setVisible(true);
        vPrincipal.txtIdU.setText(idU);
        recordatorio();
        
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
    
    
    
}
