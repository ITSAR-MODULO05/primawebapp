package it.iftsrizzoli.webapps.domain;

import java.io.Serializable;

public class Studente implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6437763293169834441L;
	private String nome;
	private String cognome;
	private String matricola;

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

	public String getMatricola() {
		return matricola;
	}

	public void setMatricola(String matricola) {
		this.matricola = matricola;
	}

	@Override
	public String toString() {
		return "Studente [nome=" + nome + ", cognome=" + cognome + ", matricola=" + matricola + "]";
	}

}
