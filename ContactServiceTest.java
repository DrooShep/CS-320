package contact;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import contact.ContactService;


public class ContactServiceTest {
	
	ContactService newContactService = new ContactService();
	
	@Test
	void testContactService() {
		
		newContactService.AddContact("Blake", "Johnson", "5559991111", "11 There Dr. State, CA 12345");
		int num = 0;
		
		assertTrue(newContactService.contactList.get(num).getContactId().equals("1000000001"));
		assertTrue(newContactService.contactList.get(num).getFirstName().equals("John"));
		assertTrue(newContactService.contactList.get(num).getLastName().equals("Doe"));
		assertTrue(newContactService.contactList.get(num).getPhone().equals("1234567891"));
		assertTrue(newContactService.contactList.get(num).getAddress().equals("55 Valhalla Dr. Val, VA 12345"));
	}
	
	@Test
	void testContactServiceUpdateFirstName() {
		
		System.out.println(newContactService.contactList.get(0).getContactId());
		System.out.println(newContactService.contactList.get(0).getFirstName());
		newContactService.updateFirstName("1000000001", "Aaron");
		System.out.println(newContactService.contactList.get(0).getFirstName());
		assertTrue(newContactService.contactList.get(0).getFirstName().equals("Aaron"));
	}
	
	@Test
	void testContactServiceUpdateLastName() {
		System.out.println(newContactService.contactList.get(0).getContactId());
		System.out.println(newContactService.contactList.get(0).getLastName());
		newContactService.updateLastName("1000000001", "Hemsworth");
		System.out.println(newContactService.contactList.get(0).getLastName());
		assertTrue(newContactService.contactList.get(0).getLastName().equals("Hemsworth"));
	}
	
	@Test
	void testContactServiceUpdatePhone() {
		System.out.println(newContactService.contactList.get(0).getContactId());
		System.out.println(newContactService.contactList.get(0).getPhone());
		newContactService.updatePhone("1000000001", "1112223333");
		System.out.println(newContactService.contactList.get(0).getPhone());
		assertTrue(newContactService.contactList.get(0).getPhone().equals("1112223333"));
	}
	
	@Test
	void testContactServiceUpdateAddress() {
		System.out.println(newContactService.contactList.get(0).getContactId());
		System.out.println(newContactService.contactList.get(0).getAddress());
		newContactService.updateAddress("1000000001", "33 Empire Dr. Alex, IN 45678");
		System.out.println(newContactService.contactList.get(0).getAddress());
		assertTrue(newContactService.contactList.get(0).getAddress().equals("33 Empire Dr. Alex, IN 45678"));
	}
	
	@Test
	void testContactServiceDelete() {
		
		ContactService newContactService = new ContactService();
		//newTaskService.AddItem("John", "This is a new task description");
		newContactService.deleteItem("1000000001");
		int temp = newContactService.findContact("1000000001");
		assertTrue(temp == 1);
	}
	
	@Test
	void testContactServiceFindContact() {
		
		newContactService.AddContact("Blake", "Johnson", "5559991111", "11 There Dr. State, CA 12345");
		newContactService.findContact("1000000001");
		assertTrue(newContactService.findContact("1000000001") == 0);
	}
	
}