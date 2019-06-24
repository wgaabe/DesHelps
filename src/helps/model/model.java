/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helps.model;

import com.sun.management.jmx.Trace;
import helps.pojo.pojo;
import javax.swing.text.MaskFormatter;
import helps.pojo.pojo_servico;
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
    
    public static boolean verificar_campos_servico(pojo_servico ps) throws IllegalArgumentException
    {
        if(ps.getServico().equals("")){
            ps.setErro("Escolha um tipo de Serviço");
            throw new IllegalArgumentException();
        }
        
        if(ps.getFerramenta().equals("0")){
            ps.setErro("Defina se seu serviço precise de ferramenta adicional");
            throw new IllegalArgumentException();
        }
            
        return false;                
                       
    }
    public void verificar_login(pojo hp) throws IllegalArgumentException
    {
        //System.out.println(""+hp.getEmail());
       // System.out.println(""+hp.getSenha());
     if (hp.getEmail().equals("")){
         hp.setErro("Login Inválido");
         throw new IllegalArgumentException();
     }
     if (hp.getSenha().equals("")){
         hp.setErro("Login Inválido");
         throw new IllegalArgumentException();
    }
        
        
        
        
        //return false;
        
    }
    
    
    
    
    
    
}

    

