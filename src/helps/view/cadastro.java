/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helps.view;

import helps.view.login;
import helps.dao.Estados;
import helps.dao.cadastrar_usuario;
import helps.model.model;
import helps.pojo.pojo;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;
import helps.view.Perfil_Usuario;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import sun.font.CreatedFontTracker;

public class cadastro extends javax.swing.JFrame {

    String nome, telefone, email, senha, confirmacao;
    
   

    public cadastro() throws SQLException {
        initComponents();
        setLocationRelativeTo(null);
        Estados estadoslista = new Estados();
        List <String> Estados = estadoslista.Estados();
        
        CCadastroEstado.setModel(new DefaultComboBoxModel(Estados.toArray()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        TNome = new javax.swing.JTextField();
        TTelefone = new javax.swing.JTextField();
        LNome = new javax.swing.JLabel();
        LTelefone = new javax.swing.JLabel();
        BCadastrar = new javax.swing.JButton();
        BLimpar = new javax.swing.JButton();
        TEmail = new javax.swing.JTextField();
        LEmail = new javax.swing.JLabel();
        LSenha = new javax.swing.JLabel();
        LConfirmacao = new javax.swing.JLabel();
        CStermo = new javax.swing.JCheckBox();
        TSenha = new javax.swing.JPasswordField();
        TConfirmacao = new javax.swing.JPasswordField();
        CSMostrar1 = new javax.swing.JCheckBox();
        CSMostrar2 = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        TCadastroNome = new javax.swing.JTextField();
        LNome1 = new javax.swing.JLabel();
        LTelefone1 = new javax.swing.JLabel();
        BCadastrar1 = new javax.swing.JButton();
        BLimpar1 = new javax.swing.JButton();
        TCadastroEmail = new javax.swing.JTextField();
        LEmail1 = new javax.swing.JLabel();
        LSenha1 = new javax.swing.JLabel();
        LConfirmacao1 = new javax.swing.JLabel();
        CCadastroTermo = new javax.swing.JCheckBox();
        TCadastroSenha = new javax.swing.JPasswordField();
        TCadastroSenhaConfirmacao = new javax.swing.JPasswordField();
        jScrollPane2 = new javax.swing.JScrollPane();
        TATermo = new javax.swing.JTextArea();
        BVoltar = new javax.swing.JButton();
        LCadastroEstado = new javax.swing.JLabel();
        CCadastroEstado = new javax.swing.JComboBox<>();
        TCadastroTelefone = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();

        LNome.setText("Nome:");

        LTelefone.setText("Telefone:");

        BCadastrar.setText("Cadastrar");

        BLimpar.setText("Limpar");

        LEmail.setText("E-mail:");

        LSenha.setText("Senha:");

        LConfirmacao.setText("Confirmação de senha:");

        CStermo.setText("Aceito termos de uso");

        CSMostrar1.setText("Mostrar");

        CSMostrar2.setText("Mostrar");
        CSMostrar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CSMostrar2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(CStermo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(BLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BCadastrar)
                        .addGap(25, 25, 25))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LConfirmacao)
                            .addComponent(LSenha, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(LEmail, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(LTelefone, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(LNome, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(TNome)
                                .addComponent(TTelefone)
                                .addComponent(TEmail)
                                .addComponent(TConfirmacao, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE))
                            .addComponent(TSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CSMostrar1)
                            .addComponent(CSMostrar2))
                        .addContainerGap(38, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LNome))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LTelefone))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LEmail))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LSenha)
                    .addComponent(TSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CSMostrar1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LConfirmacao)
                    .addComponent(TConfirmacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CSMostrar2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BCadastrar)
                    .addComponent(BLimpar)
                    .addComponent(CStermo))
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "CADASTRO"));

        TCadastroNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TCadastroNomeActionPerformed(evt);
            }
        });

        LNome1.setText("Nome:");

        LTelefone1.setText("Telefone:");

        BCadastrar1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        BCadastrar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/helps/icon/icons8-ok-12.png"))); // NOI18N
        BCadastrar1.setText("Cadastrar");
        BCadastrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BCadastrar1ActionPerformed(evt);
            }
        });

        BLimpar1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        BLimpar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/helps/icon/icons8-vassoura-12.png"))); // NOI18N
        BLimpar1.setText("Limpar");
        BLimpar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BLimpar1ActionPerformed(evt);
            }
        });

        LEmail1.setText("E-mail:");

        LSenha1.setText("Senha:");

        LConfirmacao1.setText("Confirmação de senha:");

        CCadastroTermo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        CCadastroTermo.setText("Aceito termos de uso");
        CCadastroTermo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CCadastroTermoActionPerformed(evt);
            }
        });

        TCadastroSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TCadastroSenhaActionPerformed(evt);
            }
        });

        TCadastroSenhaConfirmacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TCadastroSenhaConfirmacaoActionPerformed(evt);
            }
        });

        TATermo.setEditable(false);
        TATermo.setColumns(20);
        TATermo.setRows(5);
        TATermo.setText("Por meio de seus termos e condições gerais de uso e/ou de venda, um site ou um aplicativo explica aos usuários quais são as condições de utilização do serviço disponibilizado através de sua página ou programa, seja ele gratuito ou pago. Além de informar o usuário sobre a necessidade de cadastro ou sobre os elementos protegidos por direitos autorais, este instrumento determina, ainda, as responsabilidades de cada uma das partes - editor (pessoa que mantém o site ou aplicativo) e usuário -, em relação ao uso do serviço.");
        TATermo.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                TATermoAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane2.setViewportView(TATermo);

        BVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/helps/icon/SetaEsquerda24x24.png"))); // NOI18N
        BVoltar.setToolTipText("Voltar");
        BVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BVoltarActionPerformed(evt);
            }
        });

        LCadastroEstado.setText("Estado");

        CCadastroEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione um Estado", "Acre (AC)", "Alagoas (AL)", "Amapá (AP)", "Amazonas (AM)", "Bahia (BA)", "Ceará (CE)", "Distrito Federal (DF)", "Espírito Santo (ES)", "Goiás (GO)", "Maranhão (MA)", "Mato Grosso (MT)", "Mato Grosso do Sul (MS)", "Minas Gerais (MG)", "Pará (PA)", "Paraíba (PB)", "Paraná (PR)", "Pernambuco (PE)", "Piauí (PI)", "Rio de Janeiro (RJ)", "Rio Grande do Norte (RN)", "Rio Grande do Sul (RS)", "Rondônia (RO)", "Roraima (RR)", "Santa Catarina (SC)", "São Paulo (SP)", "Sergipe (SE)", "Tocantins (TO)" }));
        CCadastroEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CCadastroEstadoActionPerformed(evt);
            }
        });

        try {
            TCadastroTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        TCadastroTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TCadastroTelefoneActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Todos os Campos São Obrigatórios !");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(LSenha1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(LEmail1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(LTelefone1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(LConfirmacao1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(LCadastroEstado, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(BVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)
                                .addComponent(LNome1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(CCadastroEstado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(TCadastroSenhaConfirmacao)
                                    .addComponent(TCadastroSenha)
                                    .addComponent(TCadastroEmail)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE))
                                .addComponent(TCadastroTelefone, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(TCadastroNome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(CCadastroTermo, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BLimpar1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BCadastrar1)))
                .addGap(19, 19, 19))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BVoltar)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TCadastroNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LNome1))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LTelefone1)
                            .addComponent(TCadastroTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TCadastroEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LEmail1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LSenha1)
                            .addComponent(TCadastroSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LConfirmacao1)
                            .addComponent(TCadastroSenhaConfirmacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LCadastroEstado)
                            .addComponent(CCadastroEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CCadastroTermo)
                    .addComponent(BLimpar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BCadastrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CSMostrar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CSMostrar2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CSMostrar2ActionPerformed

    private void BCadastrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BCadastrar1ActionPerformed
        cadastrar_usuario c_dao = new cadastrar_usuario();
        model c_model = new model();
        pojo c_pojo = new pojo();
        login c_login = new login();
        
        c_pojo.setNome(TCadastroNome.getText());
        c_pojo.setTelefone(TCadastroTelefone.getText());
        c_pojo.setTermo(CCadastroTermo.isSelected());
        c_pojo.setSenha(String.valueOf(TCadastroSenha.getPassword()));
        c_pojo.setConfirmacaoSenha(String.valueOf(TCadastroSenhaConfirmacao.getPassword()));
        c_pojo.setEstado(String.valueOf(CCadastroEstado.getSelectedIndex()));
        c_pojo.setEmail(TCadastroEmail.getText());
       
        try {
            model.verificar_campos(c_pojo);
            int n=c_dao.inserir_usuario(c_pojo);
            if(n==1)
            {
                login lg = new login(); 
                lg.setVisible(true);
                this.dispose();
            }
        }   catch 
               (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, c_pojo.getErro()+ ", Por favor, Verifique Novamente !","Erro",2);
            
        }       
       
        
        System.out.println(TCadastroTelefone);
        
        
        /*if(TSenha1==TConfirmacao1){
        if (CStermo1.isSelected()){
        pegar_dados();
        escolha es = new escolha();
        es.setVisible(true);
        dispose();*/
 
    
    
        // TODO add your handling code here:
    }//GEN-LAST:event_BCadastrar1ActionPerformed

    
    private void CCadastroTermoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CCadastroTermoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CCadastroTermoActionPerformed

    private void TCadastroNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TCadastroNomeActionPerformed
        TCadastroNome.getText();
        
        // TODO add your handling code here:
    }//GEN-LAST:event_TCadastroNomeActionPerformed

    private void BLimpar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BLimpar1ActionPerformed
    limpar_tela();
    }//GEN-LAST:event_BLimpar1ActionPerformed

    private void TCadastroSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TCadastroSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TCadastroSenhaActionPerformed

    private void TATermoAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_TATermoAncestorAdded
        TATermo.setLineWrap(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_TATermoAncestorAdded

    private void BVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BVoltarActionPerformed
        login lg = new login(); 
        lg.setVisible(true);
        dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_BVoltarActionPerformed

    private void TCadastroSenhaConfirmacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TCadastroSenhaConfirmacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TCadastroSenhaConfirmacaoActionPerformed

    private void CCadastroEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CCadastroEstadoActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_CCadastroEstadoActionPerformed

    private void TCadastroTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TCadastroTelefoneActionPerformed
    
   
    
    }//GEN-LAST:event_TCadastroTelefoneActionPerformed
        public void limpar_tela()        
        {
            TCadastroNome.setText("");
            TCadastroTelefone.setText("");
            TCadastroEmail.setText("");
            TCadastroSenha.setText("");
            TCadastroSenhaConfirmacao.setText("");
            CCadastroEstado.setSelectedIndex(0);
        }  
        
        public void pegar_dados()
        {
            nome=TCadastroNome.getText();
            telefone=TCadastroTelefone.getText();
            email=TCadastroEmail.getText();
            senha=TCadastroSenha.getText();
            confirmacao=TCadastroSenhaConfirmacao.getText(); 
            JOptionPane.showMessageDialog(null, "Nome: " + nome + "\n" + "Telefone: " + telefone + "\n" + "E-mail: " + email + "\n" + "Senha: " + senha + "\n" + "confirmacao: " + confirmacao);
        }            
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
            java.util.logging.Logger.getLogger(cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new cadastro().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(cadastro.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BCadastrar;
    private javax.swing.JButton BCadastrar1;
    private javax.swing.JButton BLimpar;
    private javax.swing.JButton BLimpar1;
    private javax.swing.JButton BVoltar;
    private javax.swing.JComboBox<String> CCadastroEstado;
    private javax.swing.JCheckBox CCadastroTermo;
    private javax.swing.JCheckBox CSMostrar1;
    private javax.swing.JCheckBox CSMostrar2;
    private javax.swing.JCheckBox CStermo;
    private javax.swing.JLabel LCadastroEstado;
    private javax.swing.JLabel LConfirmacao;
    private javax.swing.JLabel LConfirmacao1;
    private javax.swing.JLabel LEmail;
    private javax.swing.JLabel LEmail1;
    private javax.swing.JLabel LNome;
    private javax.swing.JLabel LNome1;
    private javax.swing.JLabel LSenha;
    private javax.swing.JLabel LSenha1;
    private javax.swing.JLabel LTelefone;
    private javax.swing.JLabel LTelefone1;
    private javax.swing.JTextArea TATermo;
    private javax.swing.JTextField TCadastroEmail;
    private javax.swing.JTextField TCadastroNome;
    private javax.swing.JPasswordField TCadastroSenha;
    private javax.swing.JPasswordField TCadastroSenhaConfirmacao;
    private javax.swing.JFormattedTextField TCadastroTelefone;
    private javax.swing.JPasswordField TConfirmacao;
    private javax.swing.JTextField TEmail;
    private javax.swing.JTextField TNome;
    private javax.swing.JPasswordField TSenha;
    private javax.swing.JTextField TTelefone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
