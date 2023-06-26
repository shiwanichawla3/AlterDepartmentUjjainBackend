package model;

import java.util.List;

public class ContactPerson {
	int id;
	String name;
	List<Address> address;
	String contactNumber;
	String dob;
	List<ContactPerson> familyMembers;
}
