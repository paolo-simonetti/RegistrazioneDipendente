package it.solvingteam.trastulliconstruts2.utils;

import java.time.LocalDate;

public class Utils {
	
	public LocalDate stringToLocalDate(String stringaData) {
		Integer[] annoMeseGiorno=new Integer[3];
		String[] annoMeseGiornoString=stringaData.split("-");
		for (int i=0; i<3; i++) {
			annoMeseGiorno[i]=Integer.parseInt(annoMeseGiornoString[i]);				
		}
	
		LocalDate dataNascita=LocalDate.of(annoMeseGiorno[0],annoMeseGiorno[1],annoMeseGiorno[2]);
		return dataNascita;
	}
	
}
