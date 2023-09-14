
package universidadulp.vistas;
import universidadulp.accesoADatos.MateriaData;

import java.sql.Connection;
import javax.swing.JOptionPane;
import universidadulp.accesoADatos.Conexion;
import universidadulp.accesoADatos.MateriaData;
import universidadulp.entidades.Materia;


public class FormularioMateria extends javax.swing.JInternalFrame {

    private MateriaData materiaData;
    private Connection con;

    public FormularioMateria() {


        initComponents();

        this.materiaData = new MateriaData();
        this.con = Conexion.conectar();

    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtCodigo = new javax.swing.JTextField();
        jtNombre = new javax.swing.JTextField();
        jtAnio = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jbBuscarMateria = new javax.swing.JButton();
        jrEstadoMateria = new javax.swing.JRadioButton();
        jbNuevaMateria = new javax.swing.JButton();
        jbEliminarMateriia = new javax.swing.JButton();
        jbGuardarMateria = new javax.swing.JButton();
        jbSalirMateria = new javax.swing.JButton();

        jLabel1.setText("Codigo: ");

        jLabel2.setText("Nombre");

        jLabel3.setText("Año");

        jLabel4.setText("Estado");

        jtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtCodigoActionPerformed(evt);
            }
        });

        jtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtNombreActionPerformed(evt);
            }
        });

        jLabel5.setText("Materia");

        jbBuscarMateria.setText("Buscar");

        jrEstadoMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrEstadoMateriaActionPerformed(evt);
            }
        });

        jbNuevaMateria.setText("Nuevo");

        jbEliminarMateriia.setText("Eliminar");

        jbGuardarMateria.setText("Guardar");

        jbSalirMateria.setText("Salir");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(119, 119, 119)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jrEstadoMateria)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jtCodigo)
                                    .addComponent(jtNombre)
                                    .addComponent(jtAnio, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbBuscarMateria))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(234, 234, 234)
                        .addComponent(jLabel5)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jbNuevaMateria)
                .addGap(44, 44, 44)
                .addComponent(jbEliminarMateriia)
                .addGap(29, 29, 29)
                .addComponent(jbGuardarMateria)
                .addGap(26, 26, 26)
                .addComponent(jbSalirMateria)
                .addContainerGap(100, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbBuscarMateria))
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jtAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jrEstadoMateria))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbNuevaMateria)
                    .addComponent(jbEliminarMateriia)
                    .addComponent(jbGuardarMateria)
                    .addComponent(jbSalirMateria))
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtCodigoActionPerformed

    private void jtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtNombreActionPerformed

    private void jrEstadoMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrEstadoMateriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrEstadoMateriaActionPerformed


    private void jbSalirMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirMateriaActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jbSalirMateriaActionPerformed

    private void jbBuscarMateriaActionPerformed(java.awt.event.ActionEvent evt) {                                                

        int id = Integer.parseInt(jtCodigo.getText());
        Materia mat = materiaData.buscarMateria(id);
        jtCodigo.setText(mat.getIdMateria() + "");
        jtNombre.setText(mat.getNombre());
        jtAnio.setText(mat.getAnioMateria() + "");
        jrEstadoMateria.setSelected(mat.isEstado());
// TODO add your handling code here:
    }                                               

    private void jbGuardarMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarMateriaActionPerformed

        int cod = Integer.parseInt(jtCodigo.getText());
        String materia = jtNombre.getText();
        int anio = Integer.parseInt(jtAnio.getText());
        boolean estado = jrEstadoMateria.isEnabled();
        Materia mat = new Materia(anio, materia, estado);
        materiaData.guardarMateria(mat);
        
// TODO add your handling code here:
    }//GEN-LAST:event_jbGuardarMateriaActionPerformed

    private void jbEliminarMateriiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarMateriiaActionPerformed

        int id = Integer.valueOf(jtCodigo.getText());
        int respuesta = JOptionPane.showConfirmDialog(this, "¿Desea borrar Materia: " + jtCodigo.getText() +  "?", "Confirme", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (respuesta == JOptionPane.YES_OPTION) {
            materiaData.eliminarAlmuno(id);
            JOptionPane.showMessageDialog(this, "Materia eliminada exitosamente");
            jtCodigo.setText("");
            jtNombre.setText("");
            jtAnio.setText("");
            
        } else if (respuesta == JOptionPane.NO_OPTION) {
            this.dispose();

    }//GEN-LAST:event_jbEliminarMateriiaActionPerformed
    }
    private void jButton_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_buscarActionPerformed
        int id = Integer.parseInt(jtCodigo.getText());
        Materia mat = materiaData.buscarMateria(id);
        jtCodigo.setText(mat.getIdMateria() + "");
        jtNombre.setText(mat.getNombre());
        jtAnio.setText(mat.getAnioMateria() + "");
        jrEstadoMateria.setSelected(mat.isEstado());
    }//GEN-LAST:event_jButton_buscarActionPerformed

    




    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton jbBuscarMateria;
    private javax.swing.JButton jbEliminarMateriia;
    private javax.swing.JButton jbGuardarMateria;
    private javax.swing.JButton jbNuevaMateria;
    private javax.swing.JButton jbSalirMateria;
    private javax.swing.JRadioButton jrEstadoMateria;
    private javax.swing.JTextField jtAnio;
    private javax.swing.JTextField jtCodigo;
    private javax.swing.JTextField jtNombre;
    // End of variables declaration//GEN-END:variables
}
