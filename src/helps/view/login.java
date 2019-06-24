
package helps.view;

import helps.dao.Verificar_Usuarios_Banco;
import helps.model.*;
import helps.pojo.pojo;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import helps.dao.cadastrar_usuario;
import java.security.NoSuchAlgorithmException;

public class login extends javax.swing.JFrame {

    String login, senha, lembrar, sobre;
    
    public login() {
        initComponents();
        setLocationRelativeTo(null);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TLoginEmail = new javax.swing.JTextField();
        LLogin = new javax.swing.JLabel();
        LSenha = new javax.swing.JLabel();
        BLoginEntrar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        BCadastraragora = new javax.swing.JButton();
        BSobre = new javax.swing.JButton();
        LIcone = new javax.swing.JLabel();
        TLoginSenha = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 255, 255));
        setIconImages(null);

        TLoginEmail.setText("@admin.admin");
        TLoginEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TLoginEmailActionPerformed(evt);
            }
        });

        LLogin.setText("E-mail:");

        LSenha.setText("Senha:");

        BLoginEntrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/helps/icon/icons8-ok-12.png"))); // NOI18N
        BLoginEntrar.setText("Entrar");
        BLoginEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BLoginEntrarActionPerformed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Não possui cadastro?");

        BCadastraragora.setIcon(new javax.swing.ImageIcon(getClass().getResource("/helps/icon/icons8-mais-15.png"))); // NOI18N
        BCadastraragora.setText("Cadastrar Agora");
        BCadastraragora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BCadastraragoraActionPerformed(evt);
            }
        });

        BSobre.setText("Sobre nós");
        BSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BSobreActionPerformed(evt);
            }
        });

        LIcone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/helps/icon/RQG4Ufm.png"))); // NOI18N

        TLoginSenha.setText("admin");
        TLoginSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TLoginSenhaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BSobre))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LLogin, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(LSenha, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TLoginSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                            .addComponent(TLoginEmail))))
                .addContainerGap(66, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 116, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(LIcone)
                        .addGap(96, 96, 96))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(BLoginEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(115, 115, 115))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(BCadastraragora, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(87, 87, 87))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(LIcone, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TLoginEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LLogin))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LSenha)
                    .addComponent(TLoginSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(BLoginEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BCadastraragora, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(BSobre)
                .addGap(8, 8, 8))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BCadastraragoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BCadastraragoraActionPerformed
        cadastro cd = null;
        try {
            cd = new cadastro();
        } catch (SQLException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }
        cd.setVisible(true);
        dispose();
        
        
        
        
    }//GEN-LAST:event_BCadastraragoraActionPerformed

    private void BLoginEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BLoginEntrarActionPerformed
        
        model c_model = new model();
        pojo c_pojo = new pojo();
        
        c_pojo.setEmail(TLoginEmail.getText());
        c_pojo.setSenha(TLoginSenha.getText());
        
        boolean n=false;
        Verificar_Usuarios_Banco b = new Verificar_Usuarios_Banco();
        try {
            c_model.verificar_login(c_pojo);
            String senha = cadastrar_usuario.sha1(c_pojo.getSenha());
            n=b.verificar_login(""+c_pojo.getEmail(), "" + senha );
            int codigo=0;
            codigo=b.verificar_login_usuario_codigo(c_pojo.getEmail(), senha);
            if(n==true)
            {
                escolha es = new escolha(codigo);
                es.setVisible(true);
                dispose();
            }else
            {
                JOptionPane.showMessageDialog(null, "Login ou Senha inválidos");
            }
            
            
            
        } catch (IllegalArgumentException e) {
           //(IllegalArgumentException e)
            JOptionPane.showMessageDialog(null, c_pojo.getErro()+ ", Por favor, Verifique Novamente !","Erro",2);
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }
                         
        
        //if(TLoginEmail.getText().equals("") || TLoginSenha.getText().equals("")){
            //JOptionPane.showMessageDialog(null, "Login ou Senha inválido.", "Invalido !", JOptionPane.ERROR_MESSAGE);
        
        
            {
        

        //dispose(); 
        // Verificar dados existentes.
        }
    }//GEN-LAST:event_BLoginEntrarActionPerformed

    private void BSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BSobreActionPerformed
    sobre = "Alunos = Gabriel, Lucas, Richard, Zeka." + "\n" + "Turma = Info_17" + "\n" + "Escola = Cedup" + "\n" + "2019";
    JOptionPane.showMessageDialog(null, sobre);
    }//GEN-LAST:event_BSobreActionPerformed

    private void TLoginEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TLoginEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TLoginEmailActionPerformed

    private void TLoginSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TLoginSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TLoginSenhaActionPerformed
    
        
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BCadastraragora;
    private javax.swing.JButton BLoginEntrar;
    private javax.swing.JButton BSobre;
    private javax.swing.JLabel LIcone;
    private javax.swing.JLabel LLogin;
    private javax.swing.JLabel LSenha;
    private javax.swing.JTextField TLoginEmail;
    private javax.swing.JPasswordField TLoginSenha;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
