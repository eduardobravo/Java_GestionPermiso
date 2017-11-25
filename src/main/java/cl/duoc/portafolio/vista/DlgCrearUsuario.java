/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.portafolio.vista;

import cl.duoc.portafolio.entities.Usuario;
import cl.duoc.portafolio.controller.UsuarioController;
import cl.duoc.portafolio.controller.ValidacionesController;
import javax.swing.JOptionPane;
import org.apache.log4j.Logger;

/**
 *
 * @author Esteban Perez
 */
public class DlgCrearUsuario extends javax.swing.JDialog {

    private final static Logger logger = Logger.getLogger(DlgCrearUsuario.class);
    private static UsuarioView usuarioView = null;
    private static Usuario usu = null;

    /**
     * Creates new form DirtyDialog
     */
    public DlgCrearUsuario(UsuarioView usuarioViewP, boolean modal, Usuario usuario) {
        //super(parent, modal);
        usuarioView = usuarioViewP;
        usu = usuario;
        this.setModal(modal);
        initComponents();
        setLocationRelativeTo(this);
        if (usu != null) {
            this.cargarDatosUsuario(usuario);
        }
    }

    private void cargarDatosUsuario(Usuario usu) {
        this.txtRut.setText(usu.getRut());
        this.txtNombre.setText(usu.getNombre());
        this.txtApellidoP.setText(usu.getApellidop());
        this.txtApellidoM.setText(usu.getApellidom());
        this.ftfFechaIngreso.setText(usu.getFecha_ingreso());
        this.ftfFechaContrato.setText(usu.getFecha_contrato());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCancelar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblApellidoP = new javax.swing.JLabel();
        lblApellidoM = new javax.swing.JLabel();
        txtApellidoP = new javax.swing.JTextField();
        txtApellidoM = new javax.swing.JTextField();
        lblClave = new javax.swing.JLabel();
        psfClave = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        ftfFechaIngreso = new javax.swing.JFormattedTextField();
        lblFechaContrato = new javax.swing.JLabel();
        ftfFechaContrato = new javax.swing.JFormattedTextField();
        lblClaveRepite = new javax.swing.JLabel();
        psfClaveRepite = new javax.swing.JPasswordField();
        lblRut = new javax.swing.JLabel();
        txtRut = new javax.swing.JTextField();
        lblTitulo = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);
        setModal(true);
        setResizable(false);

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnAgregar.setText("Aceptar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        lblNombre.setText("Nombre");

        lblApellidoP.setText("Apellido Paterno");

        lblApellidoM.setText("Apellido Materno");

        lblClave.setText("Clave");

        jLabel1.setText("Fecha Ingreso");

        ftfFechaIngreso.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/yyyy"))));

        lblFechaContrato.setText("Fecha Contrato");

        ftfFechaContrato.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/yyyy"))));
        ftfFechaContrato.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                ftfFechaContratoFocusLost(evt);
            }
        });

        lblClaveRepite.setText("Reingrese Clave");

        lblRut.setText("Rut");

        txtRut.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtRutFocusLost(evt);
            }
        });

        lblTitulo.setFont(new java.awt.Font("Lucida Grande", 1, 20)); // NOI18N
        lblTitulo.setText("Crear Usuario");

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 2, 13)); // NOI18N
        jLabel4.setText("Ingrese los campos solicitados");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(295, 295, 295)
                .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(53, 53, 53))
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(149, 149, 149))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(20, 20, 20))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblClave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(8, 8, 8))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(lblApellidoP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblFechaContrato, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(12, 12, 12))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblClaveRepite, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(8, 8, 8))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(57, 57, 57))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblRut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(86, 86, 86))
                            .addComponent(lblApellidoM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(ftfFechaIngreso, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                            .addComponent(psfClaveRepite, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(psfClave, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtApellidoM, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtApellidoP, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtRut, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ftfFechaContrato))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(353, 353, 353))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblRut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(txtRut))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtNombre)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblApellidoP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(txtApellidoP))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblApellidoM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(txtApellidoM))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblClave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(psfClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblClaveRepite, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(psfClaveRepite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(ftfFechaIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblFechaContrato, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(ftfFechaContrato))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(39, 39, 39))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
        UsuarioController usrCont = new UsuarioController();
        try {
            //Acción actualizar o crear
            if (usu != null) {
                //Actualizar
                usu.setRut(this.txtRut.getText().trim());
                usu.setNombre(this.txtNombre.getText().trim());
                usu.setFecha_ingreso(this.ftfFechaIngreso.getText().trim());
                usu.setFecha_contrato(this.ftfFechaContrato.getText().trim());
                usu.setApellidop(this.txtApellidoP.getText().trim());
                usu.setApellidom(this.txtApellidoM.getText().trim());

                //validación clave
                if (!new String(this.psfClave.getPassword()).trim().isEmpty()) {
                    if (new String(this.psfClaveRepite.getPassword()).trim().isEmpty()) {
                        JOptionPane.showMessageDialog(this, "Debe ingresar la confirmación de la clave.", "Error", JOptionPane.ERROR_MESSAGE);
                        this.psfClaveRepite.requestFocus();
                        return;
                    } else if (!new String(this.psfClaveRepite.getPassword()).trim().equals(new String(this.psfClave.getPassword()).trim())) {
                        JOptionPane.showMessageDialog(this, "Las claves ingresadas no son identicas.", "Error", JOptionPane.ERROR_MESSAGE);
                        this.psfClave.requestFocus();
                        this.psfClaveRepite.setText("");
                        return;
                    } else {
                        usu.setPassword(new String(this.psfClave.getPassword()).trim());
                    }
                }

                //incorporar rut de navegación
                //usu.setRut_actualizacion("");
                
                boolean resultado = usrCont.actualizarUsuario(usu);
                if (!resultado) {
                    JOptionPane.showMessageDialog(this, "Error actualizando Usuario.", "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    this.dispose();
                }
            } else {
                //valido que la clave no venga vacía
                if (new String(this.psfClave.getPassword()).trim().isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Debe ingresar una clave.", "Error", JOptionPane.ERROR_MESSAGE);
                    this.psfClave.requestFocus();
                    this.psfClaveRepite.setText("");
                    return;
                }

                //Crear
                usu = new Usuario();
                usu.setRut(this.txtRut.getText().trim());
                usu.setNombre(this.txtNombre.getText().trim());
                usu.setFecha_ingreso(this.ftfFechaIngreso.getText().trim());
                usu.setFecha_contrato(this.ftfFechaContrato.getText().trim());
                usu.setApellidop(this.txtApellidoP.getText().trim());
                usu.setApellidom(this.txtApellidoM.getText().trim());

                //validación clave
                if (!new String(this.psfClave.getPassword()).trim().isEmpty()) {
                    if (new String(this.psfClaveRepite.getPassword()).trim().isEmpty()) {
                        JOptionPane.showMessageDialog(this, "Debe ingresar la confirmación de la clave.", "Error", JOptionPane.ERROR_MESSAGE);
                        this.psfClaveRepite.requestFocus();
                        return;
                    } else if (!new String(this.psfClaveRepite.getPassword()).trim().equals(new String(this.psfClave.getPassword()).trim())) {
                        JOptionPane.showMessageDialog(this, "Las claves ingresadas no son identicas.", "Error", JOptionPane.ERROR_MESSAGE);
                        this.psfClave.requestFocus();
                        this.psfClaveRepite.setText("");
                        return;
                    } else {
                        usu.setPassword(new String(this.psfClave.getPassword()).trim());
                    }
                }
                
                //incorporar rut de navegación
                //usu.setRut_creacion("");

                boolean resultado = usrCont.crearUsuario(usu);
                if (!resultado) {
                    JOptionPane.showMessageDialog(this, "Error creando Usuario.", "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    this.dispose();
                }
            }
        } catch (Exception e) {
            logger.error("Error grave en el mantenedor de usuario.", e);
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            usrCont = null;
            usu = null;
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtRutFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtRutFocusLost
        // TODO add your handling code here:
        ValidacionesController valid = new ValidacionesController();
        try {
            boolean valido = valid.validarRut(txtRut.getText().trim());
       
        if (!valido) {
            JOptionPane.showMessageDialog(this, "El Rut no es valido", "Error",JOptionPane.ERROR_MESSAGE);
        } else {
            
        }
        } catch (Exception e) {
        }
        finally{
            valid = null;
        }
       
    }//GEN-LAST:event_txtRutFocusLost

    private void ftfFechaContratoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ftfFechaContratoFocusLost
        // TODO add your handling code here:
         ValidacionesController valid = new ValidacionesController();
         try {
             String resultado = valid.ValidarFecha(ftfFechaIngreso.getText().trim(), ftfFechaContrato.getText().trim());
             if (!resultado.isEmpty()) {
               JOptionPane.showConfirmDialog(this, resultado, "Error",JOptionPane.ERROR_MESSAGE);
             } 
        } catch (Exception e) {
        }finally{
             valid = null;
         }
 
        
    }//GEN-LAST:event_ftfFechaContratoFocusLost

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
            java.util.logging.Logger.getLogger(DlgCrearUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DlgCrearUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DlgCrearUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DlgCrearUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DlgCrearUsuario dialog = new DlgCrearUsuario(usuarioView, true, usu);
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
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JFormattedTextField ftfFechaContrato;
    private javax.swing.JFormattedTextField ftfFechaIngreso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblApellidoM;
    private javax.swing.JLabel lblApellidoP;
    private javax.swing.JLabel lblClave;
    private javax.swing.JLabel lblClaveRepite;
    private javax.swing.JLabel lblFechaContrato;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblRut;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPasswordField psfClave;
    private javax.swing.JPasswordField psfClaveRepite;
    private javax.swing.JTextField txtApellidoM;
    private javax.swing.JTextField txtApellidoP;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtRut;
    // End of variables declaration//GEN-END:variables
}
