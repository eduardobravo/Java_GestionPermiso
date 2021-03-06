/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.portafolio.vista;

import cl.duoc.portafolio.controller.UnidadInternaController;
import cl.duoc.portafolio.entities.UnidadInterna;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.apache.log4j.Logger;
/**
 *
 * @author Edo
 */
public class UnidadInternaView extends javax.swing.JInternalFrame {

    private final static Logger logger = Logger.getLogger(UnidadInternaView.class);
    /**
     * Creates new form UnidadInternaView
     */
    public UnidadInternaView() {
        initComponents();
        cargaTabla();
    }

    
    private void cargaTabla(){
        UnidadInternaController unidadInternaController = null;
        try {
            //limpia la tabla
            DefaultTableModel tableModel = (DefaultTableModel) this.tblUnidadInterna.getModel();
            tableModel.setRowCount(0);//al setear en cero, elimina de verdad todas las filas del objeto JTable
            //crea estructura de columnas
            String col[] = {"ID","Glosa","Rut Creación","Fecha Creación"};
            tableModel.setColumnIdentifiers(col);
            //trae datos del web service
            unidadInternaController = new UnidadInternaController();
            List<UnidadInterna> listaUnidadInternas = unidadInternaController.getUnidadInternas();
            //carga datos a la tabla, fila por fila
            for (UnidadInterna ui : listaUnidadInternas) {
                Object[] row = new Object[]{ui.getId_unidad_interna(), ui.getGlosa_unidad_interna(), ui.getRut_creacion(), ui.getFecha_creacion()};
                if (ui.getId_unidad_interna() > 0) {
                    tableModel.addRow(row);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            unidadInternaController = null;
        }
    }
    
    /**
     * método para encontrar el index, usando el nombre de la columna
     */
    private int getIndexColumnByName(javax.swing.JTable tabla, String nombre) {
        for (int i = 0; i < tabla.getColumnCount(); i++) {
            if (tabla.getColumnName(i).equals(nombre)) {
                return i;
            }
        }
        return -1;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblUnidadInterna = new javax.swing.JTable();
        lblTitulo = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnEliminarTipoDeUnidadInterna = new javax.swing.JButton();
        btnEditarTipoDeUnidadInterna = new javax.swing.JButton();
        btnCrearTipoDeUnidadInterna = new javax.swing.JButton();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tblUnidadInterna.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblUnidadInterna);

        lblTitulo.setFont(new java.awt.Font("Lucida Grande", 1, 20)); // NOI18N
        lblTitulo.setText("Tipos de unidades internas");

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 2, 13)); // NOI18N
        jLabel4.setText("1. Para crear un nuevo tipo de unidad interna solo debe pulsar el boton \"Crear\"");

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 2, 13)); // NOI18N
        jLabel5.setText("2. Para editar un tipo de unidad interna debe seleccionar un tipo de usuario y pulsar el boton \"Editar\"");

        btnEliminarTipoDeUnidadInterna.setText("Eliminar");
        btnEliminarTipoDeUnidadInterna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarTipoDeUnidadInternaActionPerformed(evt);
            }
        });

        btnEditarTipoDeUnidadInterna.setText("Editar");
        btnEditarTipoDeUnidadInterna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarTipoDeUnidadInternaActionPerformed(evt);
            }
        });

        btnCrearTipoDeUnidadInterna.setText("Crear");
        btnCrearTipoDeUnidadInterna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearTipoDeUnidadInternaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 794, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnCrearTipoDeUnidadInterna)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEditarTipoDeUnidadInterna)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEliminarTipoDeUnidadInterna))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 804, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(60, 60, 60))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCrearTipoDeUnidadInterna, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnEditarTipoDeUnidadInterna)
                        .addComponent(btnEliminarTipoDeUnidadInterna)))
                .addGap(41, 41, 41))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearTipoDeUnidadInternaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearTipoDeUnidadInternaActionPerformed
        // TODO add your handling code here:
        try {
            DlgCrearUnidadInterna dlg = new DlgCrearUnidadInterna(this, true, null);
            dlg.setTitle("Agregar Unidad Interna");
            dlg.setVisible(true);
        } catch (Exception e) {
            logger.error("Error grave creando Unidad Interna.", e);
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnCrearTipoDeUnidadInternaActionPerformed

    private void btnEditarTipoDeUnidadInternaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarTipoDeUnidadInternaActionPerformed
        // TODO add your handling code here:
        UnidadInternaController unidadInternaCont = null;
        try {
            unidadInternaCont = new UnidadInternaController();
            if (this.tblUnidadInterna.getSelectedRowCount() == 0) {
                JOptionPane.showMessageDialog(this, "Error: Debe seleccionar un registro de la tabla para Actualizar.", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                String ID = String.valueOf(this.tblUnidadInterna.getValueAt(this.tblUnidadInterna.getSelectedRow(), 0)).trim();
                UnidadInterna uni = unidadInternaCont.obtenerUnidadInterna(ID);
                DlgCrearUnidadInterna dlg = new DlgCrearUnidadInterna(this, true, uni);
                dlg.setTitle("Modificar Unidad Interna");
                dlg.setVisible(true);
            }
        } catch (Exception e) {
            logger.error("Error grave actualizando unidad interna.", e);
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            unidadInternaCont = null;
        }
    }//GEN-LAST:event_btnEditarTipoDeUnidadInternaActionPerformed

    private void btnEliminarTipoDeUnidadInternaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarTipoDeUnidadInternaActionPerformed
        // TODO add your handling code here:
        UnidadInternaController unidadInternaCont = null;
        try {
            unidadInternaCont = new UnidadInternaController();
            if (this.tblUnidadInterna.getSelectedRowCount() == 0) {
                JOptionPane.showMessageDialog(this, "Error: Debe seleccionar un registro de la tabla para Eliminar.", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                String ID = String.valueOf(this.tblUnidadInterna.getValueAt(this.tblUnidadInterna.getSelectedRow(), 0)).trim();
                //UnidadInterna uni = unidadInternaCont.obtenerUnidadInterna(ID);
                
                boolean resultado = unidadInternaCont.eliminarUnidadInterna(ID);
                if (!resultado) {
                    JOptionPane.showMessageDialog(this, "Error Eliminando Unidad Interna.", "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    this.cargaTabla();
                }
            }
        } catch (Exception e) {
            logger.error("Error grave en mantenedor unidad interna.", e);
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            unidadInternaCont = null;
        }
    }//GEN-LAST:event_btnEliminarTipoDeUnidadInternaActionPerformed

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
            java.util.logging.Logger.getLogger(UnidadInternaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UnidadInternaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UnidadInternaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UnidadInternaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UnidadInternaView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrearTipoDeUnidadInterna;
    private javax.swing.JButton btnEditarTipoDeUnidadInterna;
    private javax.swing.JButton btnEliminarTipoDeUnidadInterna;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTable tblUnidadInterna;
    // End of variables declaration//GEN-END:variables
}
