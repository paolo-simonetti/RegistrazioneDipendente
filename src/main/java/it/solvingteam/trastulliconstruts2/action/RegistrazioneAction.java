package it.solvingteam.trastulliconstruts2.action;

import java.time.LocalDate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.opensymphony.xwork2.ActionSupport;

import it.solvingteam.trastulliconstruts2.model.dipendente.Ruolo;
import it.solvingteam.trastulliconstruts2.utils.Utils;

public class RegistrazioneAction extends ActionSupport {

	private static final long serialVersionUID = -5666316195928341497L;

	private String nome;
	private String cognome;
	private Integer eta;
	private LocalDate dataNascita;
	private Ruolo ruolo;
	private String email;
	private String successMessage;
	
	public String getSuccessMessage() {
		return successMessage;
	}

	public void setSuccessMessage(String successMessage) {
		this.successMessage = successMessage;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCognome() {
		System.out.println("Sono entrato qui");
		return cognome;
	}
	
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	
	public Integer getEta() {
		return eta;
	}
	
	public void setEta(String etaString) {
		this.eta = Integer.parseInt(etaString);
	}
	
	public LocalDate getDataNascita() {
		return this.dataNascita;
	}
	
	public void setDataNascita(String dataNascitaString) {
		Utils utils=new Utils();
		this.dataNascita = utils.stringToLocalDate(dataNascitaString);
	}
	
	public Ruolo getRuolo() {
		return ruolo;
	}
	
	public void setRuolo(String ruoloString) {
		this.ruolo = Ruolo.conversioneRuolo.get(ruoloString);
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}

	
	public void validateRegistraDipendente() {
		if (nome==null||nome.isEmpty()) {
			addFieldError("nome","Il nome è un campo obbligatorio!");
		}
		
		if (cognome==null||cognome.isEmpty()) {
			addFieldError("cognome","Il cognome è un campo obbligatorio!");
		}
		
		Pattern pattern = Pattern.compile("(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c"
				+ "\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?"
				+ "\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|"
				+ "[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b"
				+ "\\x0c\\x0e-\\x7f])+)\\])", Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(email);
		boolean matchFound = matcher.find();
		if(!matchFound) {
		  addFieldError("email","Formato e-mail non valido");
		}
		
	}
	
	
	public String registraDipendente() {
		System.out.println("Ora sono qui");
		String successMessage="Registrazione avvenuta con successo!";
		this.successMessage=successMessage;
		return "registrazioneRiuscita";
		
	}
	
	public String vaiAllaForm() {
		return "success";
	} 
	
	public void validateVaiAllaForm() {}
	

	
}
