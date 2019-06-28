/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helps.view;

import helps.dao.Banco;
import helps.dao.Verificar_Usuarios_Banco;
import helps.pojo.pojo;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Usuario
 */
public class escolha extends javax.swing.JFrame {

    int id=0;
    pojo pojo_global;
    /**
     * Creates new form escolha
     */
    public escolha(int codigo) {
        
        id=codigo;
        initComponents();
        carregar_dados(codigo);
        setLocationRelativeTo(null);
        
    }

    escolha() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

     
    public void carregar_dados(int codigo)
    {
        Verificar_Usuarios_Banco v = new Verificar_Usuarios_Banco();
        System.out.println(codigo);
        pojo_global=v.verificar_login_usuario_unico(codigo);
        BPerfil.setText(pojo_global.getNome());
        
        
        
        
        
  
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BPerfil = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        BContratar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        BVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/helps/icon/AvatarUsuario20x20.png"))); // NOI18N
        BPerfil.setText("Richard");
        BPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BPerfilActionPerformed(evt);
            }
        });

        jButton2.setText("Escolher trabalho || Tela do Sharp");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        BContratar.setText("Preciso Contratar || Tela do Richard");
        BContratar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BContratarActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Escolher um Serviço Disponivel \"o que eu sei fazer\"");

        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Deixar serviço visivel");

        BVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/helps/icon/SetaEsquerda24x24.png"))); // NOI18N
        BVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BPerfil)
                                .addContainerGap())
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 134, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addGap(152, 152, 152))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BContratar, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(72, 72, 72))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BPerfil)
                    .addComponent(BVoltar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(66, 66, 66)
                .addComponent(BContratar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BVoltarActionPerformed
        login lg = new login();
        lg.setVisible(true);
        dispose();        
        // TODO add your handling code here:
    }//GEN-LAST:event_BVoltarActionPerformed

    private void BContratarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BContratarActionPerformed
       Cadastrar_Serviço cs = new Cadastrar_Serviço();
       cs.setVisible(true);
       dispose();
    }//GEN-LAST:event_BContratarActionPerformed

    private void BPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BPerfilActionPerformed
        Perfil_Usuario p = null;
        try {
            p = new Perfil_Usuario(id);
        } catch (SQLException ex) {
            Logger.getLogger(escolha.class.getName()).log(Level.SEVERE, null, ex);
        }
        p.setVisible(true);
        dispose();
    }//GEN-LAST:event_BPerfilActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(escolha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(escolha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(escolha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(escolha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new escolha(id).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BContratar;
    private javax.swing.JButton BPerfil;
    private javax.swing.JButton BVoltar;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
