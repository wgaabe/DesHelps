
package helps.view;

import helps.dao.Verificar_Usuarios_Banco;
import helps.model.*;
import helps.pojo.pojo;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

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

        LLogin.setText("E-mail:");

        LSenha.setText("Senha:");

        BLoginEntrar.setText("Entrar");
        BLoginEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BLoginEntrarActionPerformed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Não possui cadastro?");

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 126, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(LIcone)
                        .addGap(96, 96, 96))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(115, 115, 115))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(BLoginEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(127, 127, 127))))
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
                            .addComponent(TLoginEmail)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(BCadastraragora, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addGap(42, 42, 42)
                .addComponent(BLoginEntrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BCadastraragora)
                .addGap(11, 11, 11)
                .addComponent(BSobre)
                .addGap(8, 8, 8))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BCadastraragoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BCadastraragoraActionPerformed
        cadastro cd;
        try {
            cd = new cadastro();
            cd.setVisible(true);
            dispose();
        } catch (SQLException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
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
            //System.out.println("1");
            n=b.verificar_login(""+c_pojo.getEmail(), ""+c_pojo.getSenha());
            int codigo=0;
            codigo=b.verificar_login_usuario_codigo(c_pojo.getEmail(), c_pojo.getSenha());
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
