/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.simercapp2.Vista;

import com.mycompany.simercapp2.Controlador.ControladorVistaDetalle;
import com.mycompany.simercapp2.Controlador.ControladorVistaSeguimiento;

/**
 *
 * @author Ryzen
 */
public class VistaDetalle extends javax.swing.JFrame {

    /**
     * Creates new form VistaDetalle
     */
    public VistaDetalle() {
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
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtIdU = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtColegio = new javax.swing.JTextField();
        txtTd = new javax.swing.JTextField();
        txtDocument = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtNacionalidad = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtPrograma = new javax.swing.JTextField();
        txtModalidad = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtObservaciones = new javax.swing.JTextArea();
        txtAsesor = new javax.swing.JTextField();
        cActualizar = new javax.swing.JCheckBox();
        btnGuardar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 0, 0));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ryzen\\simercApp2\\src\\main\\java\\com\\mycompany\\simercapp2\\Imagen\\1668456118416.png")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 14, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1500, 150));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("DETALLES");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(519, 6, 293, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ryzen\\simercApp2\\src\\main\\java\\com\\mycompany\\simercapp2\\Imagen\\volver-flecha-izquierda_1.png")); // NOI18N
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, 31));

        txtIdU.setBackground(new java.awt.Color(255, 255, 255));
        txtIdU.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtIdU.setEnabled(false);
        jPanel2.add(txtIdU, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 67, 31, -1));

        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("NOMBRES:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 140, -1));

        jLabel5.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("APELLIDOS:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 170, 140, -1));

        jLabel6.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("T.D");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 70, -1));

        jLabel7.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 15)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("DOCUMENTO:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, 140, -1));

        jLabel8.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 15)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("NACIONALIDAD:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 140, -1));

        jLabel9.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 15)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("PROGRAMA");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, 140, -1));

        jLabel10.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 15)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("MODALIDAD:");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 350, 140, -1));

        jLabel11.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 15)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("ASESOR:");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 550, 140, -1));

        jLabel12.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 15)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("CORREO:");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 210, 140, -1));

        jLabel13.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 15)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("TELEFONO:");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, 140, -1));

        jLabel14.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 15)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("DIRECCION:");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 260, 140, -1));

        jLabel15.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 15)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("OBSERVACIONES:");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 430, 160, -1));

        txtColegio.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtColegio.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(txtColegio, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 300, 280, -1));

        txtTd.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtTd.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(txtTd, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 70, -1));

        txtDocument.setBackground(new java.awt.Color(255, 255, 255));
        txtDocument.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtDocument.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(txtDocument, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 120, 240, -1));

        txtNombre.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, 280, -1));

        txtNacionalidad.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtNacionalidad.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(txtNacionalidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 210, 280, -1));

        txtTelefono.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtTelefono.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 260, 280, -1));

        txtPrograma.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtPrograma.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(txtPrograma, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 310, 280, -1));

        txtModalidad.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtModalidad.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(txtModalidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 350, 280, -1));

        txtApellido.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtApellido.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 170, 280, -1));

        txtCorreo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtCorreo.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 210, 280, -1));

        txtDireccion.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtDireccion.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 250, 280, -1));

        jLabel16.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 15)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("COLEGIO:");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 310, 140, -1));

        txtObservaciones.setColumns(20);
        txtObservaciones.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtObservaciones.setForeground(new java.awt.Color(0, 0, 0));
        txtObservaciones.setRows(5);
        jScrollPane1.setViewportView(txtObservaciones);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 430, 380, 100));

        txtAsesor.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtAsesor.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(txtAsesor, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 550, 300, -1));

        cActualizar.setBackground(new java.awt.Color(51, 255, 204));
        cActualizar.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        cActualizar.setForeground(new java.awt.Color(0, 0, 0));
        cActualizar.setText("Actualizar");
        cActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cActualizarActionPerformed(evt);
            }
        });
        jPanel2.add(cActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1370, 60, -1, -1));

        btnGuardar.setBackground(new java.awt.Color(0, 204, 0));
        btnGuardar.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("GUARDAR");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel2.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 540, 170, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 1500, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        String idU= txtIdU.getText();
        ControladorVistaSeguimiento ctrlVistaSeguimiento = new ControladorVistaSeguimiento();
        ctrlVistaSeguimiento.iniciar(idU);
        this.dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void cActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cActualizarActionPerformed
        if(cActualizar.isSelected()){
            /*txtTd.enable(true);
            txtDocument.enable(true);
            txtNombre.enable(true);
            txtApellido.enable(true);
            txtNacionalidad.enable(true);
            txtCorreo.enable(true);
            txtTelefono.enable(true);
            txtColegio.enable(true);
            txtDireccion.enable(true);
            txtPrograma.enable(true);
            txtModalidad.enable(true);
            txtObservaciones.enable(true);
            txtAsesor.enable(true);*/
            btnGuardar.setVisible(true);
        }
        if(!cActualizar.isSelected()){
            btnGuardar.setVisible(false);
        }
    }//GEN-LAST:event_cActualizarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        ControladorVistaDetalle ctrvD= new ControladorVistaDetalle();
        ctrvD.guardar();
    }//GEN-LAST:event_btnGuardarActionPerformed

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
            java.util.logging.Logger.getLogger(VistaDetalle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaDetalle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaDetalle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaDetalle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaDetalle().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnGuardar;
    private javax.swing.JCheckBox cActualizar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTextField txtApellido;
    public javax.swing.JTextField txtAsesor;
    public javax.swing.JTextField txtColegio;
    public javax.swing.JTextField txtCorreo;
    public javax.swing.JTextField txtDireccion;
    public javax.swing.JTextField txtDocument;
    public javax.swing.JTextField txtIdU;
    public javax.swing.JTextField txtModalidad;
    public javax.swing.JTextField txtNacionalidad;
    public javax.swing.JTextField txtNombre;
    public javax.swing.JTextArea txtObservaciones;
    public javax.swing.JTextField txtPrograma;
    public javax.swing.JTextField txtTd;
    public javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}