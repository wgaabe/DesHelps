/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helps.dao;

import com.sun.javafx.font.Disposer;
import com.sun.media.jfxmediaimpl.MediaDisposer;
import helps.pojo.pojo;
import helps.view.login;
import helps.view.cadastro;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author cedup
 */
public class cadastrar_usuario {
    
    public static ConPooling cn = ConPooling.getInstance();
    
    
    
    public int pesquisar_email(String email){
        
        
        
        Connection con = cn.getConnection();
        
        int n=0;
        
        String sql = "Select count(*) as qtd from usuarios where email=?" ; 
        try{
                  
                
            PreparedStatement p = con.prepareStatement(sql);
            p.setString(1, email);
            ResultSet teste=p.executeQuery();
            teste.first();
            return teste.getInt("qtd");   

               
        }catch(SQLException e){
            cn.retConnection(con);
            JOptionPane.showMessageDialog(null, e ); //no lugar do e da para colocar uma mensagem de erro ex "ta errado"
        }
        return n;

    }
            
    
    public int inserir_usuario(pojo pj){
        Connection con = cn.getConnection();
        int n=0;
        String sql = "insert into usuarios (nome,telefone,email,senha,estado) values(?,?,?,?,?);";
        try{
            PreparedStatement p = con.prepareStatement(sql);
            p.setString(1, pj.getNome());
            p.setString(2, pj.getTelefone());
            p.setString(3, pj.getEmail());
            p.setString(4, pj.getSenhasha());
            p.setString(5, pj.getEstado());
            
            n=p.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Usuario Cadastrado Com Sucesso","Cadastro",1);
            
            
            
            
        }catch(SQLException e){
            cn.retConnection(con);
            JOptionPane.showMessageDialog(null, e ); //no lugar do e da para colocar uma mensagem de erro ex "ta errado"
        }
        return n;
        
        
    }   
    
    public int alterar_usuario (pojo pj){
 
        String sql = "UPDATE usuarios SET nome = ?, estado = ?, telefone = ?, email = ? ";
        int n = 0;
        Connection con = cn.getConnection();
        
        try{
            PreparedStatement p = con.prepareStatement(sql);

            //seta os valores
            p.setString(1, pj.getNome());
            p.setString(2, pj.getEstado());
            p.setString(3, pj.getTelefone());
            p.setString(4, pj.getEmail());


            n= p.executeUpdate();
            JOptionPane.showMessageDialog(null, "Usuario Alterado Com Sucesso","Alteração",1);
            
            }catch(SQLException e){
                cn.retConnection(con);
                JOptionPane.showMessageDialog(null, e ); //no lugar do e da para colocar uma mensagem de erro ex "ta errado"
            }
            return n;
        
        //stmt.setInt(10, reg.getCOD_PRODUTO());

        //executa o codigo
        //stmt.execute();
       // stmt.close();
    }
    
    public static void main(String[] args) throws NoSuchAlgorithmException {
        System.out.println(sha1("test string to sha1")); 
    }
    
    public static String sha1(String input) throws NoSuchAlgorithmException {
        MessageDigest mDigest = MessageDigest.getInstance("SHA1");
        byte[] result = mDigest.digest(input.getBytes());
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < result.length; i++) {
            sb.append(Integer.toString((result[i] & 0xff) + 0x100, 16).substring(1));
        }
         
        return sb.toString();
    }
    
    
    }

    
    

