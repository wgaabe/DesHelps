/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helps.dao;


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
    
    public List<String> Estados() throws SQLException{
        
        String sqlquery = "SELECT * FROM estado";
        
        PreparedStatement stmt = con.prepareStatement(sqlquery);
        
        ResultSet rs = null;

        rs = stmt.executeQuery(sqlquery);

        List<String> lista = new ArrayList<String>();

        lista.add("<Selecione Estado>");

        while(rs.next()){
             
            lista.add(rs.getString("nome"));
        }
        return lista;
        
    }
    
}
