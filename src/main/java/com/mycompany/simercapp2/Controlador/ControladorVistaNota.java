
package com.mycompany.simercapp2.Controlador;

import com.mycompany.simercapp2.Dao.NotaDao;
import com.mycompany.simercapp2.Modelo.Nota;
import com.mycompany.simercapp2.Vista.VistaNota;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class ControladorVistaNota implements ActionListener{

    private VistaNota vN;
    private Nota not;
    private NotaDao nDao;

    private String id;
    
    public ControladorVistaNota() {
        this.vN= new VistaNota();
        this.not= new Nota();
        this.nDao= new NotaDao();
        this.vN.btnGuardar.addActionListener(this);
    }
    
    public void iniciar(String idU){
        vN.setVisible(true);
        vN.setLocationRelativeTo(null);
        this.id=idU;
        vN.txtIdU.setText(idU);
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==vN.btnGuardar){
            guardar();
        }
    }
    
    public void guardar(){
        int idU= Integer.parseInt(vN.txtIdU.getText());
        String fech= ((JTextField)vN.fecha.getDateEditor().getUiComponent()).getText();
        
        not.setTitulo(vN.jtTitulo.getText());
        not.setDescripcion(vN.jtdescripcion.getText());
        not.setFecha(fech);
        
        if(nDao.guardar(not, idU)){
            JOptionPane.showMessageDialog(null, "SE GUARDO LA NOTA ");
        }else{
            JOptionPane.showMessageDialog(null, "NO SE GUARDO LA NOTA ");
        }
        
        
    }
}
