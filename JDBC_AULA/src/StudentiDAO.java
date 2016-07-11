import java.sql.Date;

public class StudentiDAO {
	
	private int studenti_ID;
	private String nome, cognome, citta, regione;
	private Date data_nascita;
	private char genere;
	
	
	
	
	public StudentiDAO(String nome, String cognome) {
		super();
		this.nome = nome;
		this.cognome = cognome;
	}


	public StudentiDAO(int studenti_ID, String nome, String cognome, String citta, String regione, Date data_nascita,
			char genere) {
		super();
		this.studenti_ID = studenti_ID;
		this.nome = nome;
		this.cognome = cognome;
		this.citta = citta;
		this.regione = regione;
		this.data_nascita = data_nascita;
		this.genere = genere;
	}
	
	
	public int getStudenti_ID() {
		return studenti_ID;
	}
	public void setStudenti_ID(int studenti_ID) {
		this.studenti_ID = studenti_ID;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public String getCitta() {
		return citta;
	}
	public void setCitta(String citta) {
		this.citta = citta;
	}
	public String getRegione() {
		return regione;
	}
	public void setRegione(String regione) {
		this.regione = regione;
	}
	public Date getData_nascita() {
		return data_nascita;
	}
	public void setData_nascita(Date data_nascita) {
		this.data_nascita = data_nascita;
	}
	public char getGenere() {
		return genere;
	}
	public void setGenere(char genere) {
		this.genere = genere;
	}
	
	
	
	

}
