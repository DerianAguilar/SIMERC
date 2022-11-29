
package com.mycompany.simercapp2.Controlador;

import com.mycompany.simercapp2.Dao.DetalleDao;
import com.mycompany.simercapp2.Modelo.Contacto;
import com.mycompany.simercapp2.Vista.VistaDetalle;
import java.util.List;
import javax.swing.JOptionPane;


public class ControladorVistaDetalle {
    
    
    private VistaDetalle vD;
    private DetalleDao dDao;
    private Contacto cot;

    private String idu;
    
    public ControladorVistaDetalle() {
        this.vD= new VistaDetalle();
        this.dDao= new DetalleDao();
        this.cot= new Contacto();
    }
    
    public void mostrar(String id){
        vD.setVisible(true);
        vD.setLocationRelativeTo(null);
        this.idu=id;
        vD.txtIdU.setText(id);
        vD.btnGuardar.setVisible(false);
        detalle();
    }
    
    public void detalle(){
        
        int id = Integer.parseInt(vD.txtIdU.getText());
        
        List<Contacto> lista= dDao.mostrar(id);
        
        for(int i=0; i<lista.size();i++){
            vD.txtTd.setText(lista.get(i).getTipoDocumento());
            vD.txtDocument.setText(String.valueOf(lista.get(i).getDocumento()));
            vD.txtNombre.setText(lista.get(i).getNombre());
            vD.txtApellido.setText(lista.get(i).getApellido());
            vD.txtNacionalidad.setText(lista.get(i).getNacionalidad());
            vD.txtCorreo.setText(lista.get(i).getCorreo());
            vD.txtTelefono.setText(lista.get(i).getTelefono());
            vD.txtColegio.setText(lista.get(i).getColegio());
            vD.txtDireccion.setText(lista.get(i).getDireccion());
            vD.txtPrograma.setText(lista.get(i).getPrograma());
            vD.txtModalidad.setText(lista.get(i).getModalidad());
            vD.txtModalidad.setText(lista.get(i).getObservaciones());
            String nombre = lista.get(i).getnAs();
            String apellido = lista.get(i).getApAs();
            String nombreAs = nombre+" "+apellido;
            vD.txtAsesor.setText(nombreAs);
            
        }
        
        
    }
    public void guardar(){
        int id = Integer.parseInt(vD.txtIdU.getText());
        
        cot.setTipoDocumento(vD.txtTd.getText());
        cot.setDocumento(vD.txtDocument.getText());
        cot.setNombre(vD.txtNombre.getText());
        cot.setApellido(vD.txtApellido.getText());
        cot.setNacionalidad(vD.txtNacionalidad.getText());
        cot.setCorreo(vD.txtCorreo.getText());
        cot.setTelefono(vD.txtTelefono.getText());
        cot.setDireccion(vD.txtDireccion.getText());
        cot.setPrograma(vD.txtPrograma.getText());
        cot.setModalidad(vD.txtModalidad.getText());
        cot.setObservaciones(vD.txtObservaciones.getText());
        cot.setColegio(vD.txtColegio.getText());
        cot.setId(id);
        
        if(dDao.actualizar(cot)){
            JOptionPane.showMessageDialog(null, "SE ACTUALIZARON LOS DATOS");
        }else{
            JOptionPane.showMessageDialog(null, "NO SE ACTUALIZARON LOS DATOS");
        }
        
    }
    
}
