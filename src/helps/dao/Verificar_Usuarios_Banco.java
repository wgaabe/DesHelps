/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helps.dao;

import java.sql.Connection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import helps.dao.Configuracao;
import helps.model.model;
import helps.pojo.pojo;
import helps.view.escolha;
import javax.swing.JOptionPane;




/**
 *
 * @author gabrielw
 */
public class Verificar_Usuarios_Banco {

    
public static ConPooling cn = ConPooling.getInstance();
    
    
    public boolean verificar_login(String email, String senha){
        
        Connection con = cn.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        boolean num=false;
               
            try {
                
                stmt = con.prepareStatement("select * from usuarios where email = ? And senha = ?");
                stmt.setString(1, email);
                stmt.setString(2, senha);
                
                rs=stmt.executeQuery();
                num=rs.next();
                System.out.println("-"+num);
        } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex);
        }
        
        return num;
        
        
    }
    public pojo verificar_login_usuario_unico(int codigo){
        
        Connection con = cn.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        int n=0;
        pojo p = new pojo();
            try {
                
                stmt = con.prepareStatement("select * from usuarios where id="+ codigo  );
                
                
                
                rs=stmt.executeQuery();
                while(rs.next()){
                p.setCodigo(rs.getInt("id"));
                p.setNome(rs.getString("nome"));
                p.setEmail(rs.getString("email"));
                p.setTelefone(rs.getString("telefone"));
                p.setSenhasha(rs.getString("senha"));
                p.setEstadoid(rs.getInt("estado"));
                
                System.out.println();
                }
        } catch (SQLException ex) {
                //JOptionPane.showMessageDialog(null, ex);
        }
        
        return p;
        
        
    }
    public int verificar_login_usuario_codigo(String email, String senha){
        
        Connection con = cn.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        int n=0;
        
            try {
                
                stmt = con.prepareStatement("select * from usuarios where email = ? And senha = ?");
                stmt.setString(1, email);
                stmt.setString(2, senha);
                
                rs=stmt.executeQuery();
                rs.next();
                n=rs.getInt("id");
                
        } catch (SQLException ex) {
                //JOptionPane.showMessageDialog(null, ex);
        }
        System.out.println("n"+n);
        return n;
        
        
    }   
       
     public pojo verificar_dados_serico(int codigo){
        
        Connection con = cn.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        int n=0;
        pojo p = new pojo();
            try {
                
                stmt = con.prepareStatement("select * from servico" );
                
                
                
                rs=stmt.executeQuery();
                while(rs.next()){
                p.setCodigo(rs.getInt("id"));
                p.setNome(rs.getString("nome"));
                p.setEmail(rs.getString("email"));
                p.setTelefone(rs.getString("telefone"));
                p.setSenhasha(rs.getString("senha"));
                p.setEstadoid(rs.getInt("estado"));
                
                System.out.println();
                }
        } catch (SQLException ex) {
                //JOptionPane.showMessageDialog(null, ex);
        }
        
        return p;

}
}
