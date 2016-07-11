package prodottiMain;

import javax.swing.JOptionPane;

import dao.ProdottiDAO;
import dao.UtenteDAO;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int scelta = 0;
		
		UtenteDAO utente = new UtenteDAO();
		
		scelta = MyUtil.leggiIntero("Inserisci una scelta 1 per Login, 2 per registrazione, 3 inserisci prodotto");
		
		if (scelta == 1){
			
			String username = JOptionPane.showInputDialog("Scrivi username");
			String password = JOptionPane.showInputDialog("Scrivi password");
			
			
			boolean user = utente.login(username, password);
			if(user)
				JOptionPane.showMessageDialog(null, "Benvenuto");
			else
				JOptionPane.showMessageDialog(null, "Non puoi entrare");
			
		}
		
		
		if (scelta == 2){
			
			String username = JOptionPane.showInputDialog("Scrivi username");
			String password = JOptionPane.showInputDialog("Scrivi password");
			
			
			int esito = utente.registrazione(username, password);
			if(esito == 1)
				JOptionPane.showMessageDialog(null, "Registrato");
			else
				JOptionPane.showMessageDialog(null, "Non Registrato");
			
		}
				
		if (scelta == 3){
			
			ProdottiDAO pDAO = new ProdottiDAO();
			pDAO.gestisciProdotti(1);
			
		}
		
		
		
		
		
	}

}
