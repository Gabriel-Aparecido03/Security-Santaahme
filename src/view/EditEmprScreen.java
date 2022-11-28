/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import conexoes.MySQL;
import javax.swing.JOptionPane;
import objetos.Empresa;

/**
 *
 * @author gabri
 */
public class EditEmprScreen extends javax.swing.JFrame {

    /**
     * Creates new form EditAlocatScreen
     */
    public EditEmprScreen() {
        initComponents();
    }
    MySQL conectar = new MySQL("localhost:3306","brunoac2","root","123mudar");
    public void configCampos (Empresa novaEmpresa) {
        txtCnpjEditEmpresa.setText(novaEmpresa.getCnpj());
        txtRazaoSocialEditEmpresa.setText(novaEmpresa.getRazaoSocial());
        txtEnderecoEditEmpresa.setText(novaEmpresa.getEndereco());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        txtRazaoSocialEditEmpresa = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtCnpjEditEmpresa = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtEnderecoEditEmpresa = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        btnUpdateEmpresa = new javax.swing.JToggleButton();
        btnDeleteEmpresa = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(null);

        txtRazaoSocialEditEmpresa.setEditable(false);
        txtRazaoSocialEditEmpresa.setBackground(new java.awt.Color(204, 204, 204));
        txtRazaoSocialEditEmpresa.setBorder(null);
        txtRazaoSocialEditEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRazaoSocialEditEmpresaActionPerformed(evt);
            }
        });
        jPanel3.add(txtRazaoSocialEditEmpresa);
        txtRazaoSocialEditEmpresa.setBounds(300, 100, 200, 30);

        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Razao Social");
        jPanel3.add(jLabel9);
        jLabel9.setBounds(300, 80, 70, 16);

        txtCnpjEditEmpresa.setEditable(false);
        txtCnpjEditEmpresa.setBackground(new java.awt.Color(204, 204, 204));
        txtCnpjEditEmpresa.setBorder(null);
        txtCnpjEditEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCnpjEditEmpresaActionPerformed(evt);
            }
        });
        jPanel3.add(txtCnpjEditEmpresa);
        txtCnpjEditEmpresa.setBounds(300, 160, 200, 30);

        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Cnpj");
        jPanel3.add(jLabel10);
        jLabel10.setBounds(300, 140, 37, 16);

        txtEnderecoEditEmpresa.setBackground(new java.awt.Color(204, 204, 204));
        txtEnderecoEditEmpresa.setBorder(null);
        txtEnderecoEditEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEnderecoEditEmpresaActionPerformed(evt);
            }
        });
        jPanel3.add(txtEnderecoEditEmpresa);
        txtEnderecoEditEmpresa.setBounds(300, 230, 200, 30);

        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Endereco");
        jPanel3.add(jLabel11);
        jLabel11.setBounds(300, 210, 60, 16);

        btnUpdateEmpresa.setBackground(new java.awt.Color(0, 255, 0));
        btnUpdateEmpresa.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdateEmpresa.setText("Salvar Alteração");
        btnUpdateEmpresa.setToolTipText("");
        btnUpdateEmpresa.setBorder(null);
        btnUpdateEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateEmpresaActionPerformed(evt);
            }
        });
        jPanel3.add(btnUpdateEmpresa);
        btnUpdateEmpresa.setBounds(430, 310, 180, 40);

        btnDeleteEmpresa.setBackground(new java.awt.Color(255, 0, 0));
        btnDeleteEmpresa.setForeground(new java.awt.Color(255, 255, 255));
        btnDeleteEmpresa.setText("Apagar Empresa");
        btnDeleteEmpresa.setBorder(null);
        btnDeleteEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteEmpresaActionPerformed(evt);
            }
        });
        jPanel3.add(btnDeleteEmpresa);
        btnDeleteEmpresa.setBounds(190, 310, 180, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 740, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 740, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 390, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteEmpresaActionPerformed
        this.conectar.conectaBanco();
        
        try {
            this.conectar.updateSQL("DELETE from empresa where empresa_cnpj ='"+txtCnpjEditEmpresa.getText()+"';");
            JOptionPane.showMessageDialog (null, "Empresa apagada np banco de dados", "Apagada", JOptionPane.INFORMATION_MESSAGE);
            this.setVisible(false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error!",
            "Verifique os dados digitados", JOptionPane.ERROR_MESSAGE);
        } finally {
            this.conectar.fechaBanco();
        }
    }//GEN-LAST:event_btnDeleteEmpresaActionPerformed

    private void btnUpdateEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateEmpresaActionPerformed

        this.conectar.conectaBanco();
        
        try {
            this.conectar.updateSQL("UPDATE empresa set empresa_endereco ='"+txtEnderecoEditEmpresa.getText()+"' where empresa_cnpj ='"+txtCnpjEditEmpresa.getText()+"';");
            JOptionPane.showMessageDialog (null, "Empresa editada no banco de dados", "Editada", JOptionPane.INFORMATION_MESSAGE);
            this.setVisible(false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error!",
            "Verifique os dados digitados", JOptionPane.ERROR_MESSAGE);
        } finally {
            this.conectar.fechaBanco();
        }
    }//GEN-LAST:event_btnUpdateEmpresaActionPerformed

    private void txtEnderecoEditEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEnderecoEditEmpresaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEnderecoEditEmpresaActionPerformed

    private void txtCnpjEditEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCnpjEditEmpresaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCnpjEditEmpresaActionPerformed

    private void txtRazaoSocialEditEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRazaoSocialEditEmpresaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRazaoSocialEditEmpresaActionPerformed

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
            java.util.logging.Logger.getLogger(EditEmprScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditEmprScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditEmprScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditEmprScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditEmprScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnDeleteEmpresa;
    private javax.swing.JToggleButton btnUpdateEmpresa;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txtCnpjEditEmpresa;
    private javax.swing.JTextField txtEnderecoEditEmpresa;
    private javax.swing.JTextField txtRazaoSocialEditEmpresa;
    // End of variables declaration//GEN-END:variables
}
