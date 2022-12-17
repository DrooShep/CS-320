package contact;

public class Contact {
	//Class properties
	
	private String contactId;
	private String firstName;
	private String lastName;
	private String phone;
	private String address;
	
	public Contact(String contactId, String firstName, String lastName, String phone, String address) {
		// Checking if each property is null when being set and restrict length.
		if (contactId == null || contactId.length() > 10) {
			throw new IllegalArgumentException("Invalid Id, must be 10 characters or less");//// Illegal Argument Exception retrieved from Rollbar.com How to throw illegal argument exception in java Rollbar Editorial Team Jul 19, 2021.
		}
		
		if (firstName == null || firstName.length() > 10) {
			throw new IllegalArgumentException("Invalid name, must be 10 characters or less");
		}
		
		if (lastName == null || lastName.length() > 10) {
			throw new IllegalArgumentException("Invalid name, must be 10 characters or less");
		}
		
		if (phone == null || phone.length() != 10) {
			throw new IllegalArgumentException("Invalid phone number, must be 10 characters");
		}
		
		if (address == null || address.length() > 30) {
			throw new IllegalArgumentException("Invalid address, must be 30 characters or less");
		}
		this.contactId = contactId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.address = address;
		
	}
	
	// Getters for each property
	public String getContactId() {
		return contactId;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public String getAddress() {
		return address;
	}
	
	// Setters for firstName, lastName, phone, and address ONLY.
	public void setFirstName(String fName) {
		this.firstName = fName;
	}
		
	public void setLastName(String lName) {
		this.lastName = lName;
	}
	
	public void setPhone(String newPhone) {
		this.phone = newPhone;
	}
	
	public void setAddress(String newAddress) {
		this.address = newAddress;
	}
		
}
