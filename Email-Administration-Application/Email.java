package emailapp;

import java.util.Scanner;

public class Email {

	private String firstName;
	private String lastName;
	private String password;
	private int defaultPasswordLength = 12;
	private String email;
	private int mailBoxCapacity = 500;
	private String alternateEmail;
	private String department;
	private String companySuffix = "senecacollege.ca";

	// Constructor to recieve firstname and lastname

	public Email(String first, String last) {
		this.firstName = first;
		this.lastName = last;

//		System.out.println("Email Created: " + this.firstName + "." + this.lastName + "@gmail.com");

		// Call the "setDepartment method"
		this.department = setDepartment();
//		System.out.println("Department: " + this.department);

		// call the "generatePassword" method

		this.password = generatePassword(defaultPasswordLength);
//		System.out.println("Random Password is: " + this.password);

		// Combine elements together
		email = firstName.toLowerCase() + '.' + lastName.toLowerCase() + '@' + department + '.' + companySuffix;
//		System.out.println("Your Company Email: " + email);
	}

	// method to ask for department

	@SuppressWarnings("resource")
	private String setDepartment() {
		System.out.print(
				"DEPARTMENT CODES:\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter the Department Code: ");
		Scanner in = new Scanner(System.in);

		int departmentChoice = in.nextInt();
		String name = "";
		// switch statement
		switch (departmentChoice) {
		case 1:
			name = "sales";
			break;
		case 2:
			name = "Development";
			break;
		case 3:
			name = "Accounting";
			break;
		case 0:
			name = "";
			break;
		}

		return name;
	}
	// method to produce a random password

	private String generatePassword(int length) {

		String passwordSet = "123xyz4uvw567qrst890AB[FGHIklmnopJKLMNOPQRSTUabcdefghijVWXYZ!#$CDE%&^]";

		char[] password = new char[length];
		for (int i = 0; i < length; i++) {
			int rand = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}

		return new String(password);
	}

	// method to set the mailbox capacity
	public void setMailboxCapacity(int capacity) {
		this.mailBoxCapacity = capacity;
	}

	// method to set the alternate email
	public void setAltEmail(String altEmail) {
		this.alternateEmail = altEmail;
	}
	// method to change the password

	public void changePassword(String newPassword) {
		this.password = newPassword;
	}

	// get methods

	// email

	public String getEmail() {
		return this.email;
	}

	public String getAltEmail() {
		return this.alternateEmail;
	}

	// name

	public String getFullName() {
		return this.firstName + ' ' + this.lastName;
	}

	// mailBox Capacity

	public int getMailBoxCapacity() {
		return this.mailBoxCapacity;
	}

	// password

	public String getPassword() {
		return this.password;
	}

	// showInfo

	public String showInfo() {
		return "\nWELCOME\nFULL NAME: " + getFullName() + "\nEMAIL: " + getEmail() + "\nALTERNATE EMAIL: "
				+ getAltEmail() + "\nPASSWORD: " + getPassword();
	}
}
