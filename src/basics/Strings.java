package basics;

public class Strings {

	public static void main(String[] args) {
		String bookTitle;
		String wordChoice = "Ring";
		bookTitle = "The Lord of the Rings";
		
		
		if(bookTitle.contains("Ring")) {
			System.out.println("Title contains the word " + wordChoice );
		}
		
		String browser = "Chrome";
		if(browser.equalsIgnoreCase("chrome")) {
			System.out.println("Browser is chrome");
		}
		
		String firstName = "Ben";
		String lastName = "Dover";
		String SSN = "71256245";
		
		System.out.println( "There are " + SSN.length() + " digits in your SSN.");
		
		// print initials and last four digits of SSN
		System.out.print( firstName.substring(0,1));
		System.out.print( lastName.substring(0,3));
		System.out.println( SSN.substring(SSN.length()-4));
		
		
	}
	
}
