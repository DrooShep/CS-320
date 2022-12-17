package contact;
import java.util.ArrayList;


public class ContactService {
	
	public ArrayList<Contact> contactList;
	// Update items from list
	
	//constructor
	public ContactService() {
		// instance new list of type Contact and add one default item to list
		contactList = new ArrayList<Contact>();
		contactList.add(new Contact("1000000001", "John", "Doe", "1234567891", "55 Valhalla Dr. Val, VA 12345"));
	}
	
	public void AddContact(String fName, String lName, String phone, String address ) {
		
		//Convert string to an integer
		int lastContactId = Integer.valueOf(contactList.get(contactList.size() - 1).getContactId());
		
		// Add 1 to next value to make it unique
		String newContactId = Integer.toString(lastContactId + 1);
		
		//Convert integer back to string
		contactList.add(new Contact(newContactId, fName, lName, phone, address));
	}
	
	public void updateFirstName(String searchId, String fName) {
		//loop through contactList, assigning each item to variable contactList
		for (Contact contactItem: contactList) {
			// get contactItem by searchName
			if(contactItem.getContactId().equals(searchId)) {
				// item found, update with new first name
				// ONLY if new name isn't null and isn't more than 10 characters
				if (fName != null && fName.length() <= 10) {
					contactItem.setFirstName(fName);
				}else {
					throw new IllegalArgumentException("New first name must be 10 characters or less.");
				}
			}
		}
	}
	
	public void updateLastName(String searchId, String lName) {
		//loop through contactList, assigning each item to variable contactItem
		for (Contact contactItem: contactList) {
			//get contactItem by searchId
			if(contactItem.getContactId().equals(searchId)) {
				// item found, update with new last name
				// ONLY if new last name isn't null and isn't more than 10 characters
				if (lName != null && lName.length() <= 10) {
					contactItem.setLastName(lName);
				}else {
					throw new IllegalArgumentException("New last name must be 10 characters or less.");
				}
			}
		}
	}
	
	public void updatePhone (String searchId, String newPhone) {
		//loop through contactList, assigning each item to variable contactItem
		for(Contact contactItem: contactList) {
			//get contactItem by searchId
			if(contactItem.getContactId().equals(searchId)) {
				//item found, update with new phone
				// ONLY if new phone isn't null and isn't more less than or greater than 10 characters
				if(newPhone != null && newPhone.length() == 10) {
					contactItem.setPhone(newPhone);
				}else {
					throw new IllegalArgumentException("New phone number must be 10 characters.");
				}
			}
		}
	}
	
	public void updateAddress(String searchId, String newAddress) {
		// loop through contactList, assigning each item to variable contactItem
		for (Contact contactItem: contactList) {
			// get contactItem by searchId
			if(contactItem.getContactId().equals(searchId)) {
				// item found, update with new address
				// ONLY if new address isn't null and isn't more than 30 characters
				if(newAddress != null && newAddress.length() <= 30) {
					contactItem.setAddress(newAddress);
				}else {
					throw new IllegalArgumentException("New address must be less than 30 characters");
				}
			}
		}
	}
	
	public void deleteItem(String searchId) {
		int Index = -1;
		// loop through contactList, assigning each item to variable contactItem
		for(Contact contactItem: contactList) {
			// get contactItem by searchId
			if(contactItem.getContactId().equals(searchId)) {
				Index = contactList.indexOf(contactItem);
			}
		}
		if(Index != -1) {
			contactList.remove(Index);
		}
	}
	
	public int findContact(String uniqueContactId) {
		
		int contactResult = 1;
		
		//loop through existing contactList
		for (int i = 0; i < contactList.size(); i++) {
			String currentContact = contactList.get(1).getContactId();
			if(currentContact.compareTo(uniqueContactId) == 1) {
				contactResult = 0;
				return contactResult;
			}
		}
		return contactResult;
	}
	
	/*public String getContactIdByFirstName(String name) {
		String currentContactId = null;
		
		for(int i = 0; i < contactList.size(); i++) {
			String currentName = contactList.get(i).getFirstName();
			if(currentName.compareTo(name) == 0) {
				currentContactId = contactList.get(i).getContactId();
			}
		}
		return currentContactId;
	}*/
	
	
}

