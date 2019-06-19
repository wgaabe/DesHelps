/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helps.model;

import com.sun.management.jmx.Trace;
import helps.dao.cadastrar_usuario;
import helps.pojo.pojo;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author Usuario
 */
public class model {
    
    
    public static boolean verificar_campos(pojo hp) throws IllegalArgumentException
            
    {
        if(hp.getNome().equals("")){
            hp.setErro("Preencha o Nome");
            throw new IllegalArgumentException();
        }
        
        if(hp.getTelefone().length()< 10 || hp.getTelefone().equals("(  )     -    ")){
           hp.setErro("Numero de Telefone Inválido ou Inexistente");
           throw new IllegalArgumentException();
        }
        
        if(!hp.getEmail().contains(".") || !hp.getEmail().contains("@")){
            hp.setErro("Email Inválido ou Inexistente");
            throw new IllegalArgumentException();
        }

        cadastrar_usuario c_dao = new cadastrar_usuario();
        int n = c_dao.pesquisar_email(hp.getEmail());
        if(n>=1)
            
        {
            hp.setErro("Email já cadastrado");
            throw new IllegalArgumentException();
        }
        
        if(hp.getSenha().equals("") || !hp.getSenha().equals(hp.getConfirmacaoSenha()) || hp.getSenha().length() <=3){
            hp.setErro("Verifique sua Senha");
            throw new IllegalArgumentException();
            
        }
        if (hp.getEstado().equals("0")){
            hp.setErro("Selecione Um Estado");
            throw new IllegalArgumentException();
            
        }
        if (!hp.isTermo()){
            hp.setErro("Aceite os Termos para que possamos Prosseguir");
            throw new IllegalArgumentException();
        }
        
       
        System.out.println("hp.getEstado");
        System.out.println(hp.getTelefone());
        
        return false;
        
    }
    
    public void verificar_login(pojo hp) throws IllegalArgumentException
    {
      
        if (hp.getEmail().equals("")){
            hp.setErro("Login Inválido");
            throw new IllegalArgumentException();
            }
        if (hp.getSenha().equals("")){
            hp.setErro("Login Inválido");
            throw new IllegalArgumentException();
            }

    }
    
    public static boolean alterar_campos(pojo hp) throws IllegalArgumentException
    {
        if(!hp.getEmail().contains(".") || !hp.getEmail().contains("@")){
            hp.setErro("Email Inválido");
            throw new IllegalArgumentException();
        }
        if(hp.getNome().equals("")){
            hp.setErro("Preencha o Nome");
            throw new IllegalArgumentException();
        }
        if (hp.getEstado().equals("0")){
            hp.setErro("Selecione Um Estado");
            throw new IllegalArgumentException();
        }
        if(hp.getTelefone().length()< 10 || hp.getTelefone().equals("(  )     -    ")){
           hp.setErro("Numero de Telefone Inválido ou Inexistente");
           throw new IllegalArgumentException();
        }
        
        
        return false;
    
    }
    
}

    

