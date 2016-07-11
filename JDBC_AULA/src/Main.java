import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
	
		/*//test connessione
		Connessione miaConnessione = new Connessione();
		

			Connection conn = miaConnessione.getConn();
			System.out.println("tutto ok");
			miaConnessione.closeConn(conn);
			*/
			
		Scuola miaScuola = new Scuola();
		
		
		//sintetizzo il codice
//		ArrayList<StudentiDAO> studenti = new ArrayList<>();
//		
//		studenti = miaScuola.listStudenti();
//		
//		for (StudentiDAO stud : studenti) {
//			System.out.println(stud.getCognome()  + stud.getNome() );
//		} 
		
		for (StudentiDAO stud : miaScuola.listStudenti()) {
			System.out.println(stud.getCognome()  + stud.getNome() );
		} 
		
		


	}

}
