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
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author cedup
 */
public class cadastrar_usuario {
    
    public static ConPooling cn = ConPooling.getInstance();
    
    public int inserir_usuario(pojo pj){
        Connection con = cn.getConnection();
        int n=0;
        String sql = "insert into usuarios (nome,telefone,email,senha,estado) values(?,?,?,?,?);";
        try{
            PreparedStatement p = con.prepareStatement(sql);
            p.setString(1, pj.getNome());
            p.setString(2, pj.getTelefone());
            p.setString(3, pj.getEmail());
            p.setString(4, pj.getSenha());
            p.setString(5, pj.getEstado());
            
            n=p.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Usuario Cadastrado Com Sucesso","Cadastro",1);
            
            
            
            
        }catch(SQLException e){
            cn.retConnection(con);
            JOptionPane.showMessageDialog(null, e ); //no lugar do e da para colocar uma mensagem de erro ex "ta errado"
        }
        return n;
        
        
    }
    }

    
    

