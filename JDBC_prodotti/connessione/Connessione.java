package connessione;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Connessione {
		
		//configuro i parametri di connessione
		
		private final String DRIVER 		= "com.mysql.jdbc.Driver";
		private final String URL       		= "jdbc:mysql://localhost:3306/java2016";
		private final String USER     		= "root";
		private final String PASSWORD = "";
		

		public Connection getConn(){
			
			// 1 - creare connessione

			Connection connection = null;			
			
			//collego classe Driver
			try {
				Class.forName(DRIVER);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			try {
				connection = DriverManager.getConnection(URL, USER, PASSWORD);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return connection;
		}

		public void closeConn (Connection conn){
			
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
}
