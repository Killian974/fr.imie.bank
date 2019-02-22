package fr.imie.bank;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateUtils {

	public static final DateTimeFormatter fr = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	

	public static LocalDate toDate(String text) {
		LocalDate dateFomatLocal = LocalDate.parse(text, fr);
		return dateFomatLocal ;
		
	}

	public static String toString(LocalDate date) {
		// TODO return ...
		String dateFormatString = date.format(fr);
		return dateFormatString;
	}

	
}
