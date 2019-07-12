/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helps.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

import helps.view.login;
import helps.view.cadastro;
import com.sun.javafx.font.Disposer;
import com.sun.media.jfxmediaimpl.MediaDisposer;
import static helps.dao.cadastrar_usuario.cn;
import helps.pojo.pojo_servico;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LabInfo2
 */
public class Cadastrar_Servico_Banco {
    String tiposervico, ferramenta, qualferramenta, infoadicional;
    public static ConPooling cn = ConPooling.getInstance();
    
    public int inserir_servico(pojo_servico pj){
        Connection con = cn.getConnection();
        int n=0;
        String sql = "insert into servicos (Servico,Ferramenta,QualFerramenta,InfoAdicional) values(?,?,?,?);";
        try{
            PreparedStatement p = con.prepareStatement(sql);
            p.setString(1, pj.getServico());
            p.setString(2, pj.getFerramenta());
            p.setString(3, pj.getQualFerramenta());
            p.setString(4, pj.getInfoAdicional());
            
             
            n=p.executeUpdate();
            
            if(n==1)
            {
                JOptionPane.showMessageDialog(null, "Serviço cadastrado com sucesso","Cadastro",1);
            }else{
                JOptionPane.showMessageDialog(null, "Serviço NÃO cadastrado ","Cadastro",1);
            }
            
            
            
            
            
            
        }catch(SQLException e){
            cn.retConnection(con);
            JOptionPane.showMessageDialog(null, e ); //no lugar do e da para colocar uma mensagem de erro ex "ta errado"
        }
        return n;
          
    }
    
    public List read() {
        List  lista = new ArrayList();//nao muda
        
        try {
            String sql="select* from servicos;";
            Connection con = cn.getConnection();//nao muda
            PreparedStatement p = con.prepareStatement(sql);//nao muda
            ResultSet rs = p.executeQuery();
            while(rs.next()){
                pojo_servico cap = new pojo_servico();
                cap.setCodigoid(rs.getInt("id"));
                cap.setServico(rs.getString("servico"));
                cap.setFerramenta(rs.getString("ferramenta"));
                cap.setQualFerramenta(rs.getString("qualferramenta"));
                cap.setInfoAdicional(rs.getString("infoadicional"));
                System.out.println(rs.getString("servico"));
                lista.add(cap);
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Cadastrar_Servico_Banco.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
        return lista;
     
  }
    
}