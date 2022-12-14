package InterfazEmpleado;

import interfaces.fis.login;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author katty
 */
public class PantallaPrincipalEmpleado extends javax.swing.JFrame {

    /**
     * Creates new form PantallaPrincipalEmpleado
     */
    public PantallaPrincipalEmpleado() {
        initComponents();
         this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        lblPIEmpleado = new javax.swing.JLabel();
        btnCerrarEmpleado = new javax.swing.JButton();
        btnRegistroPaciente = new javax.swing.JButton();
        btnActividadesPaciente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        lblPIEmpleado.setText("PANTALLA DE INICIO DEL EMPELADO");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.insets = new java.awt.Insets(15, 10, 15, 20);
        getContentPane().add(lblPIEmpleado, gridBagConstraints);

        btnCerrarEmpleado.setText("CERRAR SESION");
        btnCerrarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarEmpleadoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(15, 10, 15, 20);
        getContentPane().add(btnCerrarEmpleado, gridBagConstraints);

        btnRegistroPaciente.setText("Registrar paciente");
        btnRegistroPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroPacienteActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 81;
        gridBagConstraints.insets = new java.awt.Insets(15, 10, 15, 20);
        getContentPane().add(btnRegistroPaciente, gridBagConstraints);

        btnActividadesPaciente.setText("Actividades por paciente");
        btnActividadesPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActividadesPacienteActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 45;
        gridBagConstraints.insets = new java.awt.Insets(15, 10, 15, 20);
        getContentPane().add(btnActividadesPaciente, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarEmpleadoActionPerformed
        login log = new login();
        log.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCerrarEmpleadoActionPerformed

    private void btnRegistroPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroPacienteActionPerformed
        RegistroPaciente registroPaciente = new RegistroPaciente();
        registroPaciente.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegistroPacienteActionPerformed

    private void btnActividadesPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActividadesPacienteActionPerformed
        ActividadesPacientes actividades = new ActividadesPacientes();
        actividades.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnActividadesPacienteActionPerformed

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
            java.util.logging.Logger.getLogger(PantallaPrincipalEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipalEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipalEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipalEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaPrincipalEmpleado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActividadesPaciente;
    private javax.swing.JButton btnCerrarEmpleado;
    private javax.swing.JButton btnRegistroPaciente;
    private javax.swing.JLabel lblPIEmpleado;
    // End of variables declaration//GEN-END:variables
}
