package it.solvingteam.trastulliconstruts2.model.dipendente;

import java.time.LocalDate;


public class Dipendente {

	private String nome;
	private String cognome;
	private Integer eta;
	private LocalDate dataNascita;
	private Ruolo ruolo;
	private String email;
	
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
	
	public Integer getEta() {
		return eta;
	}
	
	public void setEta(Integer eta) {
		this.eta = eta;
	}
	
	public LocalDate getDataNascita() {
		return dataNascita;
	}
	
	public void setDataNascita(LocalDate dataNascita) {
		this.dataNascita = dataNascita;
	}
	
	public Ruolo getRuolo() {
		return ruolo;
	}
	
	public void setRuolo(Ruolo ruolo) {
		this.ruolo = ruolo;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}

	public Dipendente(String nome, String cognome, Integer eta, LocalDate dataNascita, Ruolo ruolo, String email) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.eta = eta;
		this.dataNascita = dataNascita;
		this.ruolo = ruolo;
		this.email = email;
	}

	public Dipendente() {
		super();
	}
	
	
	
}
