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
        jmFormAlumno = new javax.swing.JMenuItem();
        jmFormularioMateria = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jmAdministracion = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jmNotas = new javax.swing.JMenuItem();
        jmConsultas = new javax.swing.JMenu();
        jmAluXMat = new javax.swing.JMenuItem();
        jmSalir = new javax.swing.JMenu();

        jMenu3.setText("jMenu3");

        jMenu4.setText("jMenu4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Escritorio.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout EscritorioLayout = new javax.swing.GroupLayout(Escritorio);
        Escritorio.setLayout(EscritorioLayout);
        EscritorioLayout.setHorizontalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 758, Short.MAX_VALUE)
        );
        EscritorioLayout.setVerticalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 452, Short.MAX_VALUE)
        );

        jmAlumno.setText("Alumno");
        jmAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmAlumnoActionPerformed(evt);
            }
        });

        jmFormAlumno.setText("Formulario de Alumno");
        jmFormAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmFormAlumnoActionPerformed(evt);
            }
        });
        jmAlumno.add(jmFormAlumno);

        jMenuBar1.add(jmAlumno);

        jmFormularioMateria.setText("Materia");

        jMenuItem2.setText("Formulario de Materia");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jmFormularioMateria.add(jMenuItem2);

        jMenuBar1.add(jmFormularioMateria);

        jmAdministracion.setText("Administracion");

        jMenuItem1.setText("Manipulacion de Inscripciones");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jmAdministracion.add(jMenuItem1);

        jmNotas.setText("Manipulacion de Notas");
        jmNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmNotasActionPerformed(evt);
            }
        });
        jmAdministracion.add(jmNotas);

        jMenuBar1.add(jmAdministracion);

        jmConsultas.setText("Consultas");

        jmAluXMat.setText("Alumnos por Materia");
        jmAluXMat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmAluXMatActionPerformed(evt);
            }
        });
        jmConsultas.add(jmAluXMat);

        jMenuBar1.add(jmConsultas);

        jmSalir.setText("Salir");
        jmSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmSalirActionPerformed(evt);
            }
        });
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
            .addComponent(Escritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmAlumnoActionPerformed

    }//GEN-LAST:event_jmAlumnoActionPerformed

    private void jmFormAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmFormAlumnoActionPerformed
        // TODO add your handling code here:
        Escritorio.removeAll();
        Escritorio.repaint();
        FormularioAlumno FA = new FormularioAlumno();
        FA.setVisible(true);
        Escritorio.add(FA);
        Escritorio.moveToFront(FA);
    }//GEN-LAST:event_jmFormAlumnoActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        Escritorio.removeAll();
        Escritorio.repaint();
        FormularioInscripcion fi = new FormularioInscripcion();
        fi.setVisible(true);
        Escritorio.add(fi);
        Escritorio.moveToFront(fi);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jmAluXMatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmAluXMatActionPerformed
        // TODO add your handling code here:
        Escritorio.removeAll();
        Escritorio.repaint();
        ListadoAlumnos la = new ListadoAlumnos();
        la.setVisible(true);
        Escritorio.add(la);
        Escritorio.moveToFront(la);
    }//GEN-LAST:event_jmAluXMatActionPerformed

    private void jmSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmSalirActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jmSalirActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        Escritorio.removeAll();
        Escritorio.repaint();
        FormularioMateria FM = new FormularioMateria();
        FM.setVisible(true);
        Escritorio.add(FM);
        Escritorio.moveToFront(FM);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jmNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmNotasActionPerformed
        // TODO add your handling code here:
        Escritorio.repaint();
        ManipulacionNotas MNotas = new ManipulacionNotas();
        MNotas.setVisible(true);
        Escritorio.add(MNotas);
        Escritorio.moveToFront(MNotas);
    }//GEN-LAST:event_jmNotasActionPerformed

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
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenu jmAdministracion;
    private javax.swing.JMenuItem jmAluXMat;
    private javax.swing.JMenu jmAlumno;
    private javax.swing.JMenu jmConsultas;
    private javax.swing.JMenuItem jmFormAlumno;
    private javax.swing.JMenu jmFormularioMateria;
    private javax.swing.JMenuItem jmNotas;
    private javax.swing.JMenu jmSalir;
    // End of variables declaration//GEN-END:variables
}
