package emailapp;

public class EmailApp {

	public static void main(String[] args) {

		// create an object of class Email

		Email em1 = new Email("John", "Marston");
		em1.setAltEmail("jMarston@myseneca.ca");
		System.out.println(em1.showInfo());
	}

}
