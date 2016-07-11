package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProdottiDAO extends BaseDAO{
	
	public ProdottiDAO(){}
	
	public void gestisciProdotti(int scelta){
		
		PreparedStatement ps = null;
		if( scelta == 1 ){
			try{
				addProdotto(conn, ps, 1, 2);
				addProdotto(conn, ps, 1, 3);
				addProdotto(conn, ps, 2, 2);
				addProdotto(conn, ps, 2, 4);
				addProdotto(conn, ps, 2, 6);
			}
			catch(SQLException e){e.printStackTrace();}
		}
	}

	private void addProdotto(Connection conn, PreparedStatement ps, int id, int quantita) throws SQLException{
		
		ps = conn.prepareStatement("UPDATE prodotti set disponibilita = disponibilita + ? where id = ?");
		ps.setInt(1, quantita);
		ps.setInt(2, id);
		
		ps.executeUpdate();
	}
}
