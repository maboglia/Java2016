package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UtenteDAO extends BaseDAO {

	public UtenteDAO(){}
	
	public boolean login(String username, String password){
		
		String sql = "select * from utente where username = '"+username+"' and password = '"+password+"'    ";
		
		boolean utenteTrovato = false;
		
		try{
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(sql);
			while (rs.next()) {
				utenteTrovato = true;
			}
		} 
		catch(SQLException e){e.printStackTrace();}
		
		return utenteTrovato;
	}

	public int registrazione(String username, String password){
		int esitoRegistrazione = 0;
		

		String sql = "insert into utente (username, password) values (?,?)";
		
		try{
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, username);
			ps.setString(2, password);
			esitoRegistrazione = ps.executeUpdate();
		} catch(SQLException e){
			System.out.println("errore sql");
			e.printStackTrace();
		}
		
		return esitoRegistrazione;
		
	}
	
	
}
