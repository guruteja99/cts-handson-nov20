package practice;

import java.util.Locale;
import java.util.ResourceBundle;

public class Testi18n {
	public static void main(String[] args) {
		String language = Locale.FRENCH.getLanguage();
		String country = Locale.FRENCH.getCountry();
		System.out.println("Language :"+language +"country "+country);
		Locale locale = new Locale(language,country);
		ResourceBundle resource = ResourceBundle.getBundle("MessagesBundle", locale);
		System.out.println(resource.getString("greetings"));
	}

}
