/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helps.dao;

import helps.pojo.pojo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import helps.pojo.pojo_servico;
import helps.view.login;
import helps.view.cadastro;
import com.sun.javafx.font.Disposer;
import com.sun.media.jfxmediaimpl.MediaDisposer;
import static helps.dao.cadastrar_usuario.cn;
import java.sql.ResultSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import helps.pojo.pojo_servico;
import java.util.ArrayList;

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
        String sql = "insert into serviços (Servico,Ferramenta,QualFerramenta,InfoAdicional) values(?,?,?,?);";
        try{
            PreparedStatement p = con.prepareStatement(sql);
            p.setString(1, pojo_servico.getServico());
            p.setString(2, pojo_servico.getFerramenta());
            p.setString(3, pojo_servico.getQualFerramenta());
            p.setString(4, pojo_servico.getInfoAdicional());
            
             
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
    
    public List<Cadastrar_Servico_Banco> read() {
        
        Connection con = cn.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        pojo_servico pj = new pojo_servico();
        
        
        List<Cadastrar_Servico_Banco> listar_servicos = new ArrayList<>();
        
        try {
            stmt =con.prepareStatement("SELECT * FROM serviços");
            rs = stmt.executeQuery();
            
            while (rs.next()) {                
                
                Cadastrar_Servico_Banco lista_servicos = new Cadastrar_Servico_Banco();
                
                pj.setCodigoid(rs.getInt("Id"));
                pj.setServico(rs.getString("Servico"));
                pj.setFerramenta(rs.getString("Ferramenta"));
                pj.setQualFerramenta(rs.getString("QualFerramenta"));
                pj.setInfoAdicional(rs.getString("InfoAdicional"));
                listar_servicos.add(lista_servicos);
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Cadastrar_Servico_Banco.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
        return listar_servicos;
     
  }
    
}