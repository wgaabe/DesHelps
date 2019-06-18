/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helps.dao;


import helps.pojo.estadopojo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author cedup
 */
public class Estados {
    
    public static ConPooling cn = ConPooling.getInstance();
    Connection con = cn.getConnection();
    
    public List Estados() throws SQLException{
        String sqlquery = "SELECT * FROM estado"; 
        
        PreparedStatement stmt = con.prepareStatement(sqlquery);       
        ResultSet rs = null;
        rs = stmt.executeQuery(sqlquery);
        List ListarEstados = new ArrayList();
        ListarEstados.add("<Selecione Estado>");
        while(rs.next()){
            estadopojo ep = new estadopojo();
            ep.setNome(rs.getString("nome"));
            ListarEstados.add(ep);
           //ListarEstados.add(rs.getString("nome"));
        }
        
        return ListarEstados;
        
    }
        
        
    
    
    
    
}
