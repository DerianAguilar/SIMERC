
package com.mycompany.simercapp2.Controlador;

import com.mycompany.simercapp2.Dao.perfilDao;
import com.mycompany.simercapp2.Modelo.Asesor;
import com.mycompany.simercapp2.Vista.VistaPrincipal;
import java.time.LocalDate;
import java.util.List;
import javax.swing.JOptionPane;


public class ControladorPerfil {
     private VistaPrincipal vP;
    private perfilDao pDao;
    private Asesor as;

    public ControladorPerfil() {
        this.vP= new VistaPrincipal();
        this.pDao= new perfilDao();
        this.as= new Asesor();
        
        
        
    }
    
    
    public void iniciar(){
        vP.setVisible(true);
        vP.setLocationRelativeTo(null);
        vP.pPerfil.setVisible(true);
        vP.pPerfil.setVisible(false);
        vP.pCambar.setVisible(false);
        eliminarTN();
        
    }
    
    
    
    
    
    
    
    public String perfil(int id){
        
        
        String nombre="";
        
        List<Asesor> lista = pDao.perfil(id);
        for (int i = 0; i < lista.size(); i++) {
            
            nombre=lista.get(i).getNombre()+" "+lista.get(i).getApellido();
            System.out.println(nombre);
        }
        
        return nombre;
        
        
    }
    
    
    
    public void eliminarTN(){
        LocalDate fecha = LocalDate.now();
        String fech= String.valueOf(fecha);
        
        if(pDao.eliminar(fech)&& pDao.eliminarN(fech)){
            System.out.println("SE BORRO NOTA Y ASIG_TAREA");
        }
        
        
        
    }
}
