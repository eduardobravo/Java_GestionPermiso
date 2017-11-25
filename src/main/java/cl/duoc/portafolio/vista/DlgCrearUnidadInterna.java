/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.portafolio.vista;

import cl.duoc.portafolio.controller.UnidadInternaController;
import cl.duoc.portafolio.entities.UnidadInterna;
import javax.swing.JOptionPane;
import org.apache.log4j.Logger;

/**
 *
 * @author lun4t1k0
 */
public class DlgCrearUnidadInterna extends javax.swing.JDialog {
    private final static Logger logger = Logger.getLogger(DlgCrearUnidadInterna.class);
    private static UnidadInternaView unidadInternaView = null;
    private static UnidadInterna uni = null;
    /**
     * Creates new form DlgCrearUnidadInterna
     */
    public DlgCrearUnidadInterna(UnidadInternaView unidadInternaViewP, boolean modal, UnidadInterna unidadInt) {
//        super(parent, modal);
//        initComponents();
        unidadInternaView = unidadInternaViewP;
        uni = unidadInt;
        this.setModal(modal);
        initComponents();
        setLocationRelativeTo(this);
        if (uni != null) {
            this.cargarDatos(unidadInt);
        }
    }

    private void cargarDatos(UnidadInterna unidadInt) {
        this.txtTipoUnidadInterna.setText(unidadInt.getGlosa_unidad_interna());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblNombreTipoAprobacion = new javax.swing.JLabel();
        txtTipoUnidadInterna = new javax.swing.JTextField();
        btnCrearTipoUnidadInterna = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblTitulo.setFont(new java.awt.Font("Lucida Grande", 1, 20)); // NOI18N
        lblTitulo.setText("Crear tipo de Unidad Interna");

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 2, 13)); // NOI18N
        jLabel4.setText("Ingrese el nombre del nuevo tipo de Unidad Interna");

        lblNombreTipoAprobacion.setText("Nombre Tipo Unidad Interna:");

        btnCrearTipoUnidadInterna.setText("Crear");
        btnCrearTipoUnidadInterna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearTipoUnidadInternaActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblNombreTipoAprobacion)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnCrearTipoUnidadInterna)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnCancelar))
                            .addComponent(txtTipoUnidadInterna, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombreTipoAprobacion)
                    .addComponent(txtTipoUnidadInterna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCrearTipoUnidadInterna)
                    .addComponent(btnCancelar))
                .addGap(12, 12, 12))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnCrearTipoUnidadInternaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearTipoUnidadInternaActionPerformed
        // TODO add your handling code here:
        UnidadInternaController uniCont = new UnidadInternaController();
        
        try {
            //Acción actualizar o crear
            if (uni != null) {
                //Actualizar
                uni.setGlosa_unidad_interna(this.txtTipoUnidadInterna.getText().trim());
                
                //incorporar rut de navegación
                //uni.setRut_actualizacion("");

                boolean resultado = uniCont.actualizarUnidadInterna(uni);
                if (!resultado) {
                    JOptionPane.showMessageDialog(this, "Error actualizando Unidad Interna.", "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    this.dispose();
                }
            } else {
                //Crear
                uni = new UnidadInterna();
                uni.setGlosa_unidad_interna(this.txtTipoUnidadInterna.getText().trim());
                
                //incorporar rut de navegación
                //uni.setRut_creacion("");

                boolean resultado = uniCont.crearUnidadInterna(uni);
                if (!resultado) {
                    JOptionPane.showMessageDialog(this, "Error creando Unidad Interna.", "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    this.dispose();
                }
            }
        } catch (Exception e) {
            logger.error("Error grave en el mantenedor de Unidad Interna.", e);
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            uniCont = null;
            uni = null;
        }
    }//GEN-LAST:event_btnCrearTipoUnidadInternaActionPerformed

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
            java.util.logging.Logger.getLogger(DlgCrearUnidadInterna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DlgCrearUnidadInterna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DlgCrearUnidadInterna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DlgCrearUnidadInterna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DlgCrearUnidadInterna dialog = new DlgCrearUnidadInterna(unidadInternaView, true, uni);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCrearTipoUnidadInterna;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblNombreTipoAprobacion;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtTipoUnidadInterna;
    // End of variables declaration//GEN-END:variables
}
