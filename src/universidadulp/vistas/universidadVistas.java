/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadulp.vistas;

/**
 *
 * @author marti
 */
public class universidadVistas extends javax.swing.JFrame {

    /**
     * Creates new form universidadVistas
     */
    public universidadVistas() {
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

        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        Escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmAlumno = new javax.swing.JMenu();
        jmFormularioAlumno = new javax.swing.JMenu();
        jmFormularioMateria = new javax.swing.JMenu();
        jmFMateria = new javax.swing.JMenu();
        jmAdministracion = new javax.swing.JMenu();
        jmManejoInscripcion = new javax.swing.JMenu();
        jmNotas = new javax.swing.JMenu();
        jmConsultas = new javax.swing.JMenu();
        jmAlumnoMateria = new javax.swing.JMenu();
        jmSalir = new javax.swing.JMenu();

        jMenu3.setText("jMenu3");

        jMenu4.setText("jMenu4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Escritorio.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout EscritorioLayout = new javax.swing.GroupLayout(Escritorio);
        Escritorio.setLayout(EscritorioLayout);
        EscritorioLayout.setHorizontalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 872, Short.MAX_VALUE)
        );
        EscritorioLayout.setVerticalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1347, Short.MAX_VALUE)
        );

        jmAlumno.setText("Alumno");
        jmAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmAlumnoActionPerformed(evt);
            }
        });

        jmFormularioAlumno.setText("Formulario de Alumno");
        jmFormularioAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmFormularioAlumnoActionPerformed(evt);
            }
        });
        jmAlumno.add(jmFormularioAlumno);

        jMenuBar1.add(jmAlumno);

        jmFormularioMateria.setText("Materia");

        jmFMateria.setText("Formulario de Materia");
        jmFMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmFMateriaActionPerformed(evt);
            }
        });
        jmFormularioMateria.add(jmFMateria);

        jMenuBar1.add(jmFormularioMateria);

        jmAdministracion.setText("Administracion");

        jmManejoInscripcion.setText("Menejo de Inscripcion");
        jmManejoInscripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmManejoInscripcionActionPerformed(evt);
            }
        });
        jmAdministracion.add(jmManejoInscripcion);

        jmNotas.setText("Manipulacion de notas");
        jmNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmNotasActionPerformed(evt);
            }
        });
        jmAdministracion.add(jmNotas);

        jMenuBar1.add(jmAdministracion);

        jmConsultas.setText("Consultas");

        jmAlumnoMateria.setText("Alumnos por Materia");
        jmAlumnoMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmAlumnoMateriaActionPerformed(evt);
            }
        });
        jmConsultas.add(jmAlumnoMateria);

        jMenuBar1.add(jmConsultas);

        jmSalir.setText("Salir");
        jMenuBar1.add(jmSalir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmAlumnoActionPerformed
        
    }//GEN-LAST:event_jmAlumnoActionPerformed

    private void jmFormularioAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmFormularioAlumnoActionPerformed
       Escritorio.removeAll();
       Escritorio.repaint();
       FormularioAlumno FA= new FormularioAlumno();
       FA.setVisible(true);
       Escritorio.add(FA);
       Escritorio.moveToFront(FA);
       
    }//GEN-LAST:event_jmFormularioAlumnoActionPerformed

    private void jmFMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmFMateriaActionPerformed
       Escritorio.removeAll();
       Escritorio.repaint();
       Materia FM= new Materia();
       FM.setVisible(true);
       Escritorio.add(FM);
       Escritorio.moveToFront(FM);       
    }//GEN-LAST:event_jmFMateriaActionPerformed

    private void jmManejoInscripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmManejoInscripcionActionPerformed
       Escritorio.repaint();
    FormularioInscripcion FInscripcion= new FormularioInscripcion();
       FInscripcion.setVisible(true);
       Escritorio.add(FInscripcion);
       Escritorio.moveToFront(FInscripcion);   
        // TODO add your handling code here:
    }//GEN-LAST:event_jmManejoInscripcionActionPerformed

    private void jmNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmNotasActionPerformed
 Escritorio.repaint();
    ManipulacionNotas MNotas= new ManipulacionNotas();
      MNotas.setVisible(true);
       Escritorio.add(MNotas);
       Escritorio.moveToFront(MNotas);
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jmNotasActionPerformed

    private void jmAlumnoMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmAlumnoMateriaActionPerformed
       Escritorio.repaint();
   ListadoAlumnos LA = new ListadoAlumnos();
      LA.setVisible(true);
       Escritorio.add(LA);
       Escritorio.moveToFront(LA);
        
// TODO add your handling code here:
    }//GEN-LAST:event_jmAlumnoMateriaActionPerformed

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
            java.util.logging.Logger.getLogger(universidadVistas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(universidadVistas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(universidadVistas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(universidadVistas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new universidadVistas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane Escritorio;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jmAdministracion;
    private javax.swing.JMenu jmAlumno;
    private javax.swing.JMenu jmAlumnoMateria;
    private javax.swing.JMenu jmConsultas;
    private javax.swing.JMenu jmFMateria;
    private javax.swing.JMenu jmFormularioAlumno;
    private javax.swing.JMenu jmFormularioMateria;
    private javax.swing.JMenu jmManejoInscripcion;
    private javax.swing.JMenu jmNotas;
    private javax.swing.JMenu jmSalir;
    // End of variables declaration//GEN-END:variables
}