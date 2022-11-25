package com.mycompany.simercapp2.Controlador;


import com.mycompany.simercapp2.Dao.EnviarCorreoDao;
import com.mycompany.simercapp2.Modelo.Asesor;
import com.mycompany.simercapp2.Modelo.Contacto;
import com.mycompany.simercapp2.Vista.VistaDesCorreo;
import java.util.List;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;

public class ControladorVistaDesCorreo {

    private VistaDesCorreo vdc;
    private EnviarCorreoDao enCoDao;
    private Asesor as;

    private String idU;
    private String idFila;

    //variables envio de correo
    /*private String correoEmisor = "15derianaguilar@gmail.com";
    private String correoReceptor="15derianaguilar@gmail.com";
    private String asunto;
    private String descripcion;
    private String contraseñaCorreo="lwazrnecoggosbwx";
     */
    public ControladorVistaDesCorreo() {
        this.vdc = new VistaDesCorreo();
        this.enCoDao= new EnviarCorreoDao();
        this.as=new Asesor();

    }

    public void mostrar(String idU, String idFila) {
        this.idU = idU;
        this.idFila = idFila;

        vdc.setLocationRelativeTo(null);
        vdc.setVisible(true);
        vdc.txtIdU.setText(idU);
        vdc.txtFila.setText(idFila);

    }

    public void enviarCorreo(String asunto, String descripcion,String correoEmisor,String correoReceptor,String contraseñaCorreo) {
        

        
        
        
            String idU= vdc.txtIdU.getText();
            String idF=vdc.txtFila.getText();
            
            Properties objetoPEC = new Properties();

            objetoPEC.put("mail.smtp.host", "smtp.gmail.com");
            objetoPEC.setProperty("mail.smtp.starttls.enable", "true");
            objetoPEC.put("mail.smtp.port", "587");
            objetoPEC.setProperty("mail.smtp.port", "587");
            objetoPEC.put("mail.smtp.user", correoEmisor);
            objetoPEC.setProperty("mail.smtp.auth", "true");

            Session sesion = Session.getDefaultInstance(objetoPEC);
            MimeMessage mail = new MimeMessage(sesion);

            try {
                mail.setFrom(new InternetAddress(correoEmisor));
                mail.addRecipients(Message.RecipientType.TO, correoReceptor);
                mail.setSubject(asunto);
                mail.setText(descripcion);

                Transport transporte = sesion.getTransport("smtp");
                transporte.connect(correoEmisor, contraseñaCorreo);
                transporte.sendMessage(mail, mail.getRecipients(Message.RecipientType.TO));
                transporte.close();

                
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Error al enviar el correo " + ex);
            }

        
    }

}
