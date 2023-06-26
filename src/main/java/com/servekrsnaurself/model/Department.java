package model;

import java.util.List;

public class Department {
	
	int id;
	String departmentName;
	List<Donation> donations;
	List<Payment> payments;
	List<Preacher> preacher;
	Admin admin;
	Temple temple;
}
