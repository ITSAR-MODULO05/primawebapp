package it.iftsrizzoli.webapps.domain;

import java.io.Serializable;

public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6979649886593823103L;
	private String nome;
	private String cognome;

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

	@Override
	public String toString() {
		return "User [nome=" + nome + ", cognome=" + cognome + "]";
	}

}
