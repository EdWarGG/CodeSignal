package codesignal.intro;

public class TheJourneyBegins {
	
	int add(int param1, int param2) {
	    return param1 + param2;
	}
	
	
	
	int centuryFromYear(int year) {
	    return ((year-1)/100)+1;
	}
	
	
	
	boolean checkPalindrome(String inputString) {
	    inputString = inputString.toLowerCase().replace("á", "a").replace("é", "e").replace("í", "i").replace("ó", "o")
					.replace("ú", "u").replace(" ", "").replace(".", "").replace(",", "");
	    String invertida = new StringBuilder(inputString).reverse().toString();
	    return invertida.equals(inputString);
	}
	
}
