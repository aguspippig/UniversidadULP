
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
        jButton_buscar = new javax.swing.JButton();
        jrEstadoMateria = new javax.swing.JRadioButton();
        jbModificar = new javax.swing.JButton();
        jbEliminarMateriia = new javax.swing.JButton();
        jbGuardarMateria = new javax.swing.JButton();
        jbSalirMateria = new javax.swing.JButton();

        jLabel1.setText("Codigo: ");

        jLabel2.setText("Nombre");

        jLabel3.setText("Año");

        jLabel4.setText("Estado");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel5.setText("FORMULARIO MATERIA");

        jButton_buscar.setText("Buscar");
        jButton_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_buscarActionPerformed(evt);
            }
        });

        jrEstadoMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrEstadoMateriaActionPerformed(evt);
            }
        });

        jbModificar.setText("Modificar");
        jbModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarActionPerformed(evt);
            }
        });

        jbEliminarMateriia.setText("Eliminar");
        jbEliminarMateriia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarMateriiaActionPerformed(evt);
            }
        });

        jbGuardarMateria.setText("Nuevo");
        jbGuardarMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarMateriaActionPerformed(evt);
            }
        });

        jbSalirMateria.setText("Salir");
        jbSalirMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirMateriaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel2)
                                .addComponent(jLabel4)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtCodigo)
                                    .addComponent(jtNombre)
                                    .addComponent(jtAnio))
                                .addGap(18, 18, 18)
                                .addComponent(jButton_buscar)
                                .addGap(79, 79, 79))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jrEstadoMateria)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jbGuardarMateria)
                        .addGap(18, 18, 18)
                        .addComponent(jbSalirMateria)
                        .addGap(18, 18, 18)
                        .addComponent(jbEliminarMateriia)
                        .addGap(18, 18, 18)
                        .addComponent(jbModificar)
                        .addGap(0, 79, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent(jLabel5)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_buscar))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jtAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4))
                    .addComponent(jrEstadoMateria))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbGuardarMateria)
                    .addComponent(jbSalirMateria)
                    .addComponent(jbEliminarMateriia)
                    .addComponent(jbModificar))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

        //int cod = Integer.parseInt(jtCodigo.getText());
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

    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed
      
        int id= Integer.parseInt(jtCodigo.getText());
        String nombre=jtNombre.getText();
        int anio=Integer.parseInt(jtAnio.getText());
        boolean estado=jrEstadoMateria.isEnabled();
        
        Materia materia=new Materia(id,anio, nombre, estado);
        materiaData.modificarMateria(materia);
    }//GEN-LAST:event_jbModificarActionPerformed

    




    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_buscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton jbEliminarMateriia;
    private javax.swing.JButton jbGuardarMateria;
    private javax.swing.JButton jbModificar;
    private javax.swing.JButton jbSalirMateria;
    private javax.swing.JRadioButton jrEstadoMateria;
    private javax.swing.JTextField jtAnio;
    private javax.swing.JTextField jtCodigo;
    private javax.swing.JTextField jtNombre;
    // End of variables declaration//GEN-END:variables
}
