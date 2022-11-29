/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.simercapp2.Vista;

import com.mycompany.simercapp2.Controlador.ControladorVistaDesCorreo;
import com.mycompany.simercapp2.Controlador.ControladorVistaEnCorreo;
import com.mycompany.simercapp2.Controlador.ControladorVistaLogin;
import com.mycompany.simercapp2.Dao.EnviarCorreoDao;
import com.mycompany.simercapp2.Modelo.Asesor;
import com.mycompany.simercapp2.Modelo.Contacto;
import java.io.File;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.MessagingException;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMultipart;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Ryzen
 */
public class VistaDesCorreo extends javax.swing.JFrame {

    /**
     * Creates new form VistaDesCorreo
     */
    public VistaDesCorreo() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnSalir = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtIdU = new javax.swing.JTextField();
        txtFila = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtAsunto = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtDescrip = new javax.swing.JTextArea();
        btnEnviarCorreo = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        cmbPrograma = new javax.swing.JComboBox<>();
        txtP = new javax.swing.JLabel();
        txtRuta = new javax.swing.JTextField();
        btnRuta = new javax.swing.JButton();
        cmbPlan = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSalir.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ryzen\\simercApp2\\src\\main\\java\\com\\mycompany\\simercapp2\\Imagen\\salir.png")); // NOI18N
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalirMouseClicked(evt);
            }
        });
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1460, 10, -1, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ryzen\\simercApp2\\src\\main\\java\\com\\mycompany\\simercapp2\\Imagen\\1668456118416.png")); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 136));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 150));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ENVIAR CORREO");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(475, 6, 448, -1));

        txtIdU.setEnabled(false);
        jPanel2.add(txtIdU, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 143, -1, -1));

        txtFila.setEnabled(false);
        jPanel2.add(txtFila, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 184, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("ASUNTO:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 120, -1, -1));

        jtAsunto.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jtAsunto.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jtAsunto, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 150, 610, -1));

        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("DESCRIPCION:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 210, -1, -1));

        jtDescrip.setColumns(20);
        jtDescrip.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jtDescrip.setForeground(new java.awt.Color(0, 0, 0));
        jtDescrip.setRows(5);
        jScrollPane1.setViewportView(jtDescrip);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 240, 610, 180));

        btnEnviarCorreo.setBackground(new java.awt.Color(0, 255, 0));
        btnEnviarCorreo.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btnEnviarCorreo.setForeground(new java.awt.Color(255, 255, 255));
        btnEnviarCorreo.setText("ENVIAR");
        btnEnviarCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarCorreoActionPerformed(evt);
            }
        });
        jPanel2.add(btnEnviarCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(1234, 550, 130, -1));

        btnCancelar.setBackground(new java.awt.Color(204, 0, 0));
        btnCancelar.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("CANCELAR");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel2.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1084, 550, 130, -1));

        cmbPrograma.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PROGRAMA", "INGENIERIA DE SOFTWARE", "DISEÑO GRAFICO", "DISEÑO DE MODAS", "ADMINISTRACION FINANCIERA", "NEGOCIOS INTERNACIONALES", "LOGISTICA EMPRESARIAL", "HOTELERIA Y TURISMO" }));
        jPanel2.add(cmbPrograma, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 250, -1));

        txtP.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        txtP.setForeground(new java.awt.Color(0, 0, 0));
        txtP.setText("TODOS:");
        jPanel2.add(txtP, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        txtRuta.setEnabled(false);
        jPanel2.add(txtRuta, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 470, 300, -1));

        btnRuta.setForeground(new java.awt.Color(0, 0, 0));
        btnRuta.setText(".....");
        btnRuta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRutaActionPerformed(evt);
            }
        });
        jPanel2.add(btnRuta, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 470, 70, -1));

        cmbPlan.setBackground(new java.awt.Color(204, 255, 255));
        cmbPlan.setForeground(new java.awt.Color(0, 0, 0));
        cmbPlan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No", "Si" }));
        cmbPlan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPlanActionPerformed(evt);
            }
        });
        jPanel2.add(cmbPlan, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 150, 110, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("PLANTILLA:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 150, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 1500, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEnviarCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarCorreoActionPerformed
        String asunto = jtAsunto.getText();
        String descripcion = jtDescrip.getText();
        String plan = cmbPlan.getSelectedItem().toString();
        String prgm= cmbPrograma.getSelectedItem().toString();
        String ruta = txtRuta.getText();
        
        String idU = txtIdU.getText();
        String idF = txtFila.getText();

        String correoEmisor = "";
        String correoReceptor = "";
        String contraseñaCorreo = "";

        int c = JOptionPane.showConfirmDialog(null, "Enviar Correo? ", "Confirmacion", JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE);

        if (c == 0) {
            EnviarCorreoDao enCoDao = new EnviarCorreoDao();
            List<Asesor> lista = enCoDao.correoE(idU);
            
            if (idF.equals("todos")) {

                for (int i = 0; i < lista.size(); i++) {
                    correoEmisor = lista.get(i).getCorreo();
                    contraseñaCorreo = lista.get(i).getContraseña();

                }

                List<Contacto> listaC = enCoDao.correoTodos(prgm);

                String mensaje = "";
                int cont = 0;
                int nEl = listaC.size();
                String nombre = "";
                for (int i = 0; i < listaC.size(); i++) {
                    MimeMultipart partes = new MimeMultipart();

                    correoReceptor = listaC.get(i).getCorreo();
                    nombre = listaC.get(i).getNombre();
                    mensaje = "HOLA <b>" + nombre + "</b><br><br><br>" + descripcion + "<br><br>";
                    BodyPart archivo = new MimeBodyPart();
                    BodyPart texto = new MimeBodyPart();
                    System.out.println(mensaje);

                    try {
                        texto.setContent(mensaje, "text/html");
                        archivo.setDataHandler(new DataHandler(new FileDataSource(ruta)));

                        partes.addBodyPart(texto);
                        partes.addBodyPart(archivo);

                    } catch (MessagingException ex) {
                        Logger.getLogger(VistaDesCorreo.class.getName()).log(Level.SEVERE, null, ex);
                    }

                    ControladorVistaDesCorreo ctrlDesCorreo = new ControladorVistaDesCorreo();
                    ctrlDesCorreo.enviarCorreo(asunto, partes, correoEmisor, correoReceptor, contraseñaCorreo,plan,mensaje);
                    System.out.println(correoReceptor);
                    nombre = "";
                    mensaje="";
                    //cont+=1;
                    //JOptionPane.showMessageDialog(null, "Enviando....."+cont+" de "+nEl+".\n\n Espere por favor");
                }
                JOptionPane.showMessageDialog(null, "Correo enviado");

            } else {
                List<Contacto> listaC = enCoDao.correoR(idF);
                String mensaje = "";
                
                for (int i = 0; i < lista.size(); i++) {
                    correoEmisor = lista.get(i).getCorreo();
                    contraseñaCorreo = lista.get(i).getContraseña();

                }
                for (int i = 0; i < listaC.size(); i++) {
                    String nombre = "";
                    MimeMultipart partes = new MimeMultipart();
                    correoReceptor = listaC.get(i).getCorreo();
                    nombre = listaC.get(i).getNombre();
                    mensaje = "HOLA <b>" + nombre + "</b><br><br>" + descripcion+"<br><br>";
                    BodyPart texto = new MimeBodyPart();
                    BodyPart archivo = new MimeBodyPart();
                    try {
                        texto.setContent(mensaje, "text/html");
                        archivo.setDataHandler(new DataHandler(new FileDataSource(ruta)));

                        partes.addBodyPart(texto);
                        partes.addBodyPart(archivo);

                    } catch (MessagingException ex) {
                        Logger.getLogger(VistaDesCorreo.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    ControladorVistaDesCorreo ctrlDesCorreo = new ControladorVistaDesCorreo();
                    ctrlDesCorreo.enviarCorreo(asunto, partes, correoEmisor, correoReceptor, contraseñaCorreo,plan,mensaje);
                    System.out.println(texto);
                }

                JOptionPane.showMessageDialog(null, "Correo enviado");
            }
        }

        jtAsunto.setText("");
        jtDescrip.setText("");
        cmbPlan.setSelectedIndex(0);
        cmbPrograma.setSelectedIndex(0);
    }//GEN-LAST:event_btnEnviarCorreoActionPerformed

    private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked
        int input = JOptionPane.showConfirmDialog(null, "SE VA A CERRAR LA SESION", "CERRAR SESION",
                JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE);

        if (input == 0) {
            ControladorVistaLogin ctrLogin = new ControladorVistaLogin();
            this.dispose();
            ctrLogin.iniciar();
        }
    }//GEN-LAST:event_btnSalirMouseClicked

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        jtAsunto.setText("");
        jtDescrip.setText("");

        String idU = txtIdU.getText();
        ControladorVistaEnCorreo ctrEnCorreo = new ControladorVistaEnCorreo();
        ctrEnCorreo.mostrar(idU);
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void cmbPlanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPlanActionPerformed
        String plan = cmbPlan.getSelectedItem().toString();
        System.out.println(plan);
        if(plan.equals("No")){
            btnRuta.setVisible(false);
            txtRuta.setVisible(false);
        }else{
            btnRuta.setVisible(true);
            txtRuta.setVisible(true);
        }
    }//GEN-LAST:event_cmbPlanActionPerformed

    private void btnRutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRutaActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);

        FileNameExtensionFilter texFilter = new FileNameExtensionFilter("archivos(*.txt)", "txt");
        fileChooser.setFileFilter(texFilter);

        int result = fileChooser.showOpenDialog(this);

        if (result != JFileChooser.CANCEL_OPTION) {

            File fileName = fileChooser.getSelectedFile();

            if ((fileName == null) || (fileName.getName().equals(""))) {
                txtRuta.setText("...");
            } else {
                txtRuta.setText(fileName.getAbsolutePath());
            }
        }
    }//GEN-LAST:event_btnRutaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VistaDesCorreo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaDesCorreo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaDesCorreo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaDesCorreo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaDesCorreo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnCancelar;
    public javax.swing.JButton btnEnviarCorreo;
    public javax.swing.JButton btnRuta;
    private javax.swing.JLabel btnSalir;
    public javax.swing.JComboBox<String> cmbPlan;
    public javax.swing.JComboBox<String> cmbPrograma;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTextField jtAsunto;
    public javax.swing.JTextArea jtDescrip;
    public javax.swing.JTextField txtFila;
    public javax.swing.JTextField txtIdU;
    public javax.swing.JLabel txtP;
    public javax.swing.JTextField txtRuta;
    // End of variables declaration//GEN-END:variables
}
