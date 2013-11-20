/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Sucursal;

/**
 *
 * @author Marcos
 */
public class ConsultarPaquetes extends javax.swing.JFrame {

    /**
     * Creates new form ConsultarPaquetes
     */
    public ConsultarPaquetes() {
        initComponents();
       
        for (int i = 0; i < Configuracion.listaPaquetesRecibidos.size(); i++) {
            
            this.jCBPaquetes.addItem(Configuracion.listaPaquetesRecibidos.get(i).getId());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTFHoradesaldia = new javax.swing.JTextField();
        jTFHoradllegada = new javax.swing.JTextField();
        jTFOrigen = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jCBPaquetes = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jBVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTFHoradesaldia.setSelectionColor(new java.awt.Color(0, 0, 0));
        jTFHoradesaldia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFHoradesaldiaActionPerformed(evt);
            }
        });

        jTFHoradllegada.setSelectionColor(new java.awt.Color(0, 0, 0));
        jTFHoradllegada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFHoradllegadaActionPerformed(evt);
            }
        });

        jTFOrigen.setSelectionColor(new java.awt.Color(0, 0, 0));
        jTFOrigen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFOrigenActionPerformed(evt);
            }
        });

        jLabel1.setText("Seleccione el paquete que desea consultar:");

        jCBPaquetes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBPaquetesActionPerformed(evt);
            }
        });

        jLabel2.setText("Hora de salida:");

        jLabel3.setText("Hora de llegada:");

        jLabel4.setText("Origen:");

        jBVolver.setText("Volver");
        jBVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(89, 89, 89)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTFHoradesaldia, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                    .addComponent(jTFHoradllegada)
                    .addComponent(jTFOrigen))
                .addContainerGap(93, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addComponent(jCBPaquetes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(jBVolver)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(36, 36, 36)
                .addComponent(jCBPaquetes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTFHoradesaldia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTFHoradllegada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTFOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(jBVolver)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTFHoradesaldiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFHoradesaldiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFHoradesaldiaActionPerformed

    private void jTFHoradllegadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFHoradllegadaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFHoradllegadaActionPerformed

    private void jTFOrigenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFOrigenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFOrigenActionPerformed

    private void jCBPaquetesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBPaquetesActionPerformed
        for (int i = 0; i <Configuracion.listaPaquetesRecibidos.size(); i++) {
            if (Configuracion.listaPaquetesRecibidos.get(i).getId()== (int) this.jCBPaquetes.getSelectedItem())
            {
                this.jTFHoradesaldia.setText(Long.toString(Configuracion.listaPaquetesRecibidos.get(i).getTiempoDeSalida()));
                this.jTFHoradllegada.setText(Long.toString(Configuracion.listaPaquetesRecibidos.get(i).getTiempoDeLlegada()));
                this.jTFOrigen.setText(Configuracion.listaPaquetesRecibidos.get(i).getOrigen());
            }   
                 }
    }//GEN-LAST:event_jCBPaquetesActionPerformed

    private void jBVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBVolverActionPerformed
       Menu menu = new Menu();
       this.dispose();
       menu.setVisible(true); 
        // TODO add your handling code here:
    }//GEN-LAST:event_jBVolverActionPerformed

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
            java.util.logging.Logger.getLogger(ConsultarPaquetes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultarPaquetes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultarPaquetes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultarPaquetes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultarPaquetes().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBVolver;
    private javax.swing.JComboBox jCBPaquetes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTFHoradesaldia;
    private javax.swing.JTextField jTFHoradllegada;
    private javax.swing.JTextField jTFOrigen;
    // End of variables declaration//GEN-END:variables
}
