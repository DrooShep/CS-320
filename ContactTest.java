package contact;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ContactTest {

	@Test
	void testContactClass() {
		
		Contact newContact = new Contact("10001", "John", "Doe", "1234567891", "55 Valhalla Dr. Alex, VA 12345");
		
		assertTrue(newContact.getFirstName().equals("John"));
		assertTrue(newContact.getLastName().equals("Doe"));
		assertTrue(newContact.getContactId().equals("10001"));
		assertTrue(newContact.getPhone().equals("1234567891"));
		assertTrue(newContact.getAddress().equals("55 Valhalla Dr. Alex, VA 12345"));
	}
	
	@Test // Illegal Argument Exception retrieved from Rollbar.com How to throw illegal argument exception in java Rollbar Editorial Team Jul 19, 2021.
	void testContactClassIdToLong() {
		assertThrows(IllegalArgumentException.class, () ->{ 
			new Contact("10000000001", "John", "Doe", "1234567891", "55 Valhalla Dr. Alex, VA 12345");
		});
	}
	
	@Test
	void testContactClassNullId() {
		assertThrows(IllegalArgumentException.class, () ->{
			new Contact(null, "John", "Doe", "1234567891", " 55 Valhalla Dr. Alex, VA 12345");
		});
	}
	
	@Test
	void testContactClassFirstNameToLong() {
		assertThrows(IllegalArgumentException.class, () ->{
			new Contact("100000001", "Johnathonson", "Doe", "1234567891", "55 Vallhalla Dr. Alex, VA 12345");
		});
	}
	
	@Test
	void testContactClassNullFirstName() {
		assertThrows(IllegalArgumentException.class, () ->{
			new Contact("100000001", null, "Doe", "1234567891", " 55 Valhalla Dr. Alex, VA 12345");
		});
	}
	
	@Test
	void testContactClassLastNameToLong() {
		assertThrows(IllegalArgumentException.class, () ->{
			new Contact("100000001", "John", "abcdefghijklmn", "1234567891", "55 Vallhalla Dr. Alex, VA 12345");
		});
	}
	
	@Test
	void testContactClassNullLastName() {
		assertThrows(IllegalArgumentException.class, () ->{
			new Contact("100000001", "John", null, "1234567891", " 55 Valhalla Dr. Alex, VA 12345");
		});
	}
	
	@Test
	void testContactClassPhoneNull() {
		assertThrows(IllegalArgumentException.class, () ->{
			new Contact("1000000001", "John", "Doe", null, "55 Valhalla Dr. Alex, VA 12345");
		});
	}
	
	@Test
	void testContactClassIncorrectPhone() {
		assertThrows(IllegalArgumentException.class, () ->{
			new Contact("1000000001", "John", "Doe", "123456789", "55 Valhalla Dr. Alex, VA 12345");
		});
	}
	
	@Test
	void testContactClassAddressToLong() {
		assertThrows(IllegalArgumentException.class, () ->{
			new Contact("100000001", "John", "Doe", "1234567891", "55 Vallhalla Dr. Alex, VA 123456789");
		});
	}
	
	@Test
	void testContactClassAddressNull() {
		assertThrows(IllegalArgumentException.class, () ->{
			new Contact("1000000001", "John", "Doe", "1234567891", null);
		});
	}
	
	@Test
	void testContactClassSetFirstName() {
		Contact newContact = new Contact("1000000001", "John", "Doe", "1234567891", "55 Valhalla Dr. Alex, VA 12345");
		newContact.setFirstName("Johnathan");
		assertTrue(newContact.getFirstName().equals("Johnathan"));
	}
	
	@Test
	void testContactClassSetFirstNameLong() {
		assertThrows(IllegalArgumentException.class, () ->{
			new Contact("1000000001", "Johnathonson", "Doe", "1234567891", "55 Valhalla Dr. Alex, VA 12345");
		});
	}
	
	@Test
	void testContactClassSetFirstNameNull() {
		assertThrows(IllegalArgumentException.class, () ->{
			new Contact("1000000001", null, "Doe", "1234567891", "55 Valhalla Dr. Alex, VA 12345");
		});
	}
	
	void testContactClassSetLastName() {
		Contact newContact = new Contact("1000000001", "John", "Doe", "1234567891", "55 Valhalla Dr. Alex, VA 12345");
		newContact.setLastName("Hemsworth");
		assertTrue(newContact.getLastName().equals("Hemsworth"));
	}
	
	@Test
	void testContactClassSetLastNameLong() {
		assertThrows(IllegalArgumentException.class, () ->{
			new Contact("1000000001", "John", "Doeisaveryshortname", "1234567891", "55 Valhalla Dr. Alex, VA 12345");
		});
	}
	
	@Test
	void testContactClassSetLastNameNull() {
		assertThrows(IllegalArgumentException.class, () ->{
			new Contact("1000000001", "John", null, "1234567891", "55 Valhalla Dr. Alex, VA 12345");
		});
	}
	
	@Test
	void testContactClassSetPhoneNumber() {
		Contact newContact = new Contact("1000000001", "John", "Doe", "1234567891", "55 Valhalla Dr. Alex, VA 12345");
		newContact.setPhone("1234567892");
		assertTrue(newContact.getPhone().equals("1234567892"));
	}
	
	@Test
	void testContactClassSetPhoneNumberToLong() {	
		assertThrows(IllegalArgumentException.class,  () ->{
			new Contact("1000000001", "John", "Doe", "12345678912", "55 Valhalla Dr. Alex, VA 12345");
		});
	}
	
	@Test
	void testContactClassSetPhoneNumberNull() {
		//Contact newContact = new Contact("1000000001", "John", "Doe", "1234567891", "55 Valhalla Dr. Alex, VA 12345");
		assertThrows(IllegalArgumentException.class, () ->{
			new Contact("1000000001", "John", "Doe", null, "55 Valhalla Dr. Alex, VA 12345");
		});
	}
	
	@Test
	void testContactClassSetPhoneNumberToShort() {
		assertThrows(IllegalArgumentException.class, () ->{
			new Contact("1000000001", "John", "Doe", "1234567", "55 Valhalla Dr. Alex, VA 12345");
		});
	}
	
	@Test
	void testContactClassSetAddress() {
		Contact newContact = new Contact("1000000001", "John", "Doe", "1234567891", "55 Valhalla Dr. Alex, VA 12345");
		newContact.setAddress("56 Valhalla Dr. Alex, VA 12345");
		assertTrue(newContact.getAddress().equals("56 Valhalla Dr. Alex, VA 12345"));
	}
	
	@Test
	void testContactClassSetAddressToLong() {
		assertThrows(IllegalArgumentException.class,  () -> {
			new Contact("1000000001", "John", "Doe", "1234567891", "55 Valhalla Dr. Alex, VA 1234567891");
		});
	}
	
	@Test
	void testContactClassSetAddressToNull() {
		assertThrows(IllegalArgumentException.class, () ->{
			new Contact("1000000001", "John", "Doe", "1234567891", null);
		});
	}

}
