package agenda_info.dao;

import agenda_info.dao.ConPooling;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class Banco {

	public static ConPooling cn = ConPooling.getInstance();


 
       
	public static void main(String args[]) {

		System.out.println("Funcionou!");
	}
}