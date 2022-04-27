package model;

public class Instructor {
	private String firstName;
	private String lastName;
	private String email;

	public Instructor() {
		// TODO Auto-generated constructor stub
	}

	public Instructor(String firstName, String lastName, String email) {
		setFirstName(firstName);
		setLastName(lastName);
		setEmail(email);
	}

	public Instructor(String firstName, String lastName) {
		setFirstName(firstName);
		setLastName(lastName);
		this.email = makeEmailAddress(firstName, lastName);

	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Instructor [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + "]";
	}

	public static String makeEmailAddress(String firstName, String lastName) {
		firstName = firstName.toLowerCase();
		lastName = lastName.toLowerCase();
		return firstName.charAt(0) + lastName + "@dmacc.edu";

	}

}
