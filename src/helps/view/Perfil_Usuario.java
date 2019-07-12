/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helps.view;


import helps.dao.Verificar_Usuarios_Banco;
import java.awt.Color;
import helps.pojo.pojo;
import helps.dao.Banco;
import helps.dao.cadastrar_usuario;
import java.sql.SQLException;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import helps.pojo.estadopojo;
import jdk.nashorn.internal.runtime.arrays.ArrayIndex;
import helps.dao.cadastrar_usuario;
import helps.model.model;
import javax.swing.JOptionPane;


    
public class Perfil_Usuario extends javax.swing.JFrame {
    
    int id = 0;
    pojo pojo_global;
    
   
    public Perfil_Usuario(int codigo) throws SQLException {
        
        id = codigo;
        pojo select = new pojo();
        initComponents();
        preencher_campos(codigo);
        setLocationRelativeTo(null);
        
        /*int cont=0;
        CUsuarioEstado.setModel(new DefaultComboBoxModel(Estado.toArray()));
        for(int i =0;i<Estado.size();i++)
        {
            estadopojo ep = (estadopojo)Estado.get(i);
            CUsuarioEstado.addItem(ep.getNome());
            
        }
        /*
        CUsuarioEstado.setSelectedItem(select.getEstado());*/
        
    }
    
    public void preencher_campos (int codigo){
        
        Verificar_Usuarios_Banco p = new Verificar_Usuarios_Banco();
        pojo_global = p.verificar_login_usuario_unico(codigo);
        TUsuarioEmail.setText(pojo_global.getEmail());
        TUsuarioNome.setText(pojo_global.getNome());
        TUsuarioTelefone.setText(pojo_global.getTelefone());
        CUsuarioEstado.setSelectedIndex(pojo_global.estadoid);
        //System.out.println("id"+pojo.estadoid);
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        LNome = new javax.swing.JLabel();
        LEmail = new javax.swing.JLabel();
        LEspecializacoes = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        BVoltar = new javax.swing.JButton();
        BSalvar = new javax.swing.JButton();
        TUsuarioNome = new javax.swing.JTextField();
        TUsuarioEmail = new javax.swing.JTextField();
        BVisibilidade = new javax.swing.JToggleButton();
        LTelefone = new javax.swing.JLabel();
        LEndereco = new javax.swing.JLabel();
        CUsuarioEstado = new javax.swing.JComboBox<>();
        TUsuarioTelefone = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Perfil do Usuário"));

        LNome.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        LNome.setText("Nome");

        LEmail.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        LEmail.setText("E-mail");

        LEspecializacoes.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        LEspecializacoes.setText("Especializações");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Trocar pneu", "Roçar grama" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        BVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/helps/icon/SetaEsquerda24x24.png"))); // NOI18N
        BVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BVoltarActionPerformed(evt);
            }
        });

        BSalvar.setText("Salvar");
        BSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BSalvarActionPerformed(evt);
            }
        });

        TUsuarioNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TUsuarioNomeActionPerformed(evt);
            }
        });

        TUsuarioEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TUsuarioEmailActionPerformed(evt);
            }
        });

        BVisibilidade.setText("Escolher trabalho");
        BVisibilidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BVisibilidadeActionPerformed(evt);
            }
        });

        LTelefone.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        LTelefone.setText("Telefone");

        LEndereco.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        LEndereco.setText("Endereço");

        CUsuarioEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione um Estado", "Acre (AC)", "Alagoas (AL)", "Amapá (AP)", "Amazonas (AM)", "Bahia (BA)", "Ceará (CE)", "Distrito Federal (DF)", "Espírito Santo (ES)", "Goiás (GO)", "Maranhão (MA)", "Mato Grosso (MT)", "Mato Grosso do Sul (MS)", "Minas Gerais (MG)", "Pará (PA) ", "Paraíba (PB)", "Paraná (PR)", "Pernambuco (PE)", "Piauí (PI)", "Rio de Janeiro (RJ)", "Rio Grande do Norte (RN)", "Rio Grande do Sul (RS)", "Rondônia (RO)", "Roraima (RR)", "Santa Catarina (SC)", "São Paulo (SP)", "Sergipe (SE)", "Tocantins (TO)" }));
        CUsuarioEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CUsuarioEstadoActionPerformed(evt);
            }
        });

        try {
            TUsuarioTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        TUsuarioTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TUsuarioTelefoneActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(LEndereco)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CUsuarioEstado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(LNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TUsuarioNome))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(LEmail)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TUsuarioEmail))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(LTelefone)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TUsuarioTelefone)))
                .addGap(30, 30, 30))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(BVisibilidade, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                .addComponent(BSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(LEspecializacoes)
                        .addGap(163, 163, 163))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(154, 154, 154))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(BVoltar)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TUsuarioNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LNome, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LEndereco)
                    .addComponent(CUsuarioEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LTelefone)
                    .addComponent(TUsuarioTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TUsuarioEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LEspecializacoes, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BVisibilidade, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BVisibilidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BVisibilidadeActionPerformed

    }//GEN-LAST:event_BVisibilidadeActionPerformed

    private void TUsuarioEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TUsuarioEmailActionPerformed
       
      
    }//GEN-LAST:event_TUsuarioEmailActionPerformed

    private void TUsuarioNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TUsuarioNomeActionPerformed

    }//GEN-LAST:event_TUsuarioNomeActionPerformed

    private void BSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BSalvarActionPerformed
        pojo a_pojo = new pojo();
        
        cadastrar_usuario c_dao = new cadastrar_usuario();
            a_pojo.setNome(TUsuarioNome.getText());
            a_pojo.setEstado(String.valueOf(CUsuarioEstado.getSelectedIndex()));
            a_pojo.setTelefone(TUsuarioTelefone.getText());
            a_pojo.setEmail(TUsuarioEmail.getText());

            try {
                model.alterar_campos(a_pojo);
                int n = c_dao.alterar_usuario(a_pojo);
        }   catch 
               (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, a_pojo.getErro()+ ", Por favor, Verifique Novamente !","Erro",2);
            
        }       
            
        
    }//GEN-LAST:event_BSalvarActionPerformed

    private void BVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BVoltarActionPerformed
        
        escolha es = new escolha(pojo.codigo);
        es.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_BVoltarActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void CUsuarioEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CUsuarioEstadoActionPerformed
       
    }//GEN-LAST:event_CUsuarioEstadoActionPerformed

    private void TUsuarioTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TUsuarioTelefoneActionPerformed

    }//GEN-LAST:event_TUsuarioTelefoneActionPerformed
        
    
    
        
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BSalvar;
    private javax.swing.JToggleButton BVisibilidade;
    private javax.swing.JButton BVoltar;
    private javax.swing.JComboBox<String> CUsuarioEstado;
    private javax.swing.JLabel LEmail;
    private javax.swing.JLabel LEndereco;
    private javax.swing.JLabel LEspecializacoes;
    private javax.swing.JLabel LNome;
    private javax.swing.JLabel LTelefone;
    private javax.swing.JTextField TUsuarioEmail;
    private javax.swing.JTextField TUsuarioNome;
    private javax.swing.JFormattedTextField TUsuarioTelefone;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
