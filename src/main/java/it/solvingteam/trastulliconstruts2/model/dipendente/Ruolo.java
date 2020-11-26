package it.solvingteam.trastulliconstruts2.model.dipendente;

import java.util.TreeMap;

public enum Ruolo {

	MAGAZZINIERE("magazziniere"),
	IMPIEGATO("impiegato"),
	MANAGER("manager");
		
	private String stringaRuolo;
	
	Ruolo(String stringaRuolo) {
		this.stringaRuolo=stringaRuolo;
	}

	public String getStringaRuolo() {
		return stringaRuolo;
	}

	public void setStringaRuolo(String stringaRuolo) {
		this.stringaRuolo = stringaRuolo;
	}
	
	@Override
	public String toString () {
		return stringaRuolo;
	}
	
	public static TreeMap<String,Ruolo> conversioneRuolo = new TreeMap<>();
	
	static {
		
		conversioneRuolo.put("magazziniere",MAGAZZINIERE);
		conversioneRuolo.put("impiegato",IMPIEGATO);
		conversioneRuolo.put("manager",MANAGER);
		
	}
	
}
