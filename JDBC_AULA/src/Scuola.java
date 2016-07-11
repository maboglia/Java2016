import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.ArrayList;

import java.sql.Connection;

public class Scuola {
	
	
	//0 - scaricare e configurare driver java mysql
	
			//1 - creare connessione
			
			Connessione miaConnessione = new Connessione();
			Connection conn = miaConnessione.getConn();
			
			//2 - preparare uno statement
			
			Statement statement = null;
			PreparedStatement prepStat = null;
			//3 ricevere un result set
			
			ResultSet resultSet = null;
	
			//4 creo un arraylist di oggetti di classe studenteDAO
			
			ArrayList<StudentiDAO>	studenti = new ArrayList<>();
	
			
			public void addStudent(String nome, String cognome){
				
				try {
					
					String query = "insert into studenti set Nome = ?, Cognome = ? ";
					prepStat = conn.prepareStatement(query);
					
					prepStat.setString(1, nome);
					prepStat.setString(2, cognome);
					
					prepStat.execute();
										
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.getMessage();e.printStackTrace();
				}				
				
				
				
			}
			
			
			public ArrayList<StudentiDAO> listStudenti(){
				
				try {
					statement = conn.createStatement();
					String query = "select Nome, Cognome from studenti";
					
					resultSet = statement.executeQuery(query);
					
					while (resultSet.next()) {
						
						studenti.add( new StudentiDAO(resultSet.getString("Nome"), resultSet.getString("Cognome"))    );
						
					}
					
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
				
				return studenti;
			}
			
			
	
	public void listDocenti(){
		/*
		statement = connessione.createStatement();
		resultset = statement.executeQuery("select*from java2016.docenti");
		
		while (resultset.next()) {
			String nome = resultset.getString("nome");
			String cognome = resultset.getString("cognome");

			System.out.println("Nome  " + nome + " cognome  " + cognome);

		}
		*/
		
		
	}
	

}
