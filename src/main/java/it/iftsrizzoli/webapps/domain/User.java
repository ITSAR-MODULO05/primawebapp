package it.iftsrizzoli.webapps.domain;

import java.io.Serializable;

public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6979649886593823103L;
	private String nome;
	private String cognome;
	private String sesso;
	private String annoDiNascita;
	private String eMail;
	private String nazione;
	private int id;

	public User() {
		super();

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

	public String getSesso() {
		return sesso;
	}

	public void setSesso(String sesso) {
		this.sesso = sesso;
	}

	public String getAnnoDiNascita() {
		return annoDiNascita;
	}

	public void setAnnoDiNascita(String annoDiNascita) {
		this.annoDiNascita = annoDiNascita;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public String getNazione() {
		return nazione;
	}

	public void setNazione(String nazione) {
		this.nazione = nazione;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @param nome
	 * @param cognome
	 * @param sesso
	 * @param annoDiNascita
	 * @param eMail
	 * @param nazione
	 */
	public User(String nome, String cognome, String sesso, String annoDiNascita, String eMail, String nazione) {
		this.nome = nome;
		this.cognome = cognome;
		this.sesso = sesso;
		this.annoDiNascita = annoDiNascita;
		this.eMail = eMail;
		this.nazione = nazione;
	}

	@Override
	public String toString() {
		return "User [nome=" + nome + ", cognome=" + cognome + ", sesso=" + sesso + ", annoDiNascita=" + annoDiNascita
				+ ", eMail=" + eMail + ", nazione=" + nazione + "]";
	}

}
