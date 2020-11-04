package marina1103w5d2kengo;

public class User {
	
	private String firstName;
	private String lastName;
	
	public User (String firstName, String lastName) {
		setFirstName(firstName);
		setLastName(lastName);
	
		
	}
	

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		if (!firstName.isEmpty() && !firstName.equalsIgnoreCase(null)) {
			this.firstName = firstName;
		} else {
			this.firstName = "unknown";
		}
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		if (!lastName.isEmpty() && !lastName.equalsIgnoreCase(null)) {
			this.lastName = lastName;
		} else {
			this.lastName = "unknown";
		}
	}
@Override
public String toString() {
	return String.format("Name: " + firstName + " " + lastName);
}

}
