package com.org;

public class EmployeeService {

	EmployeeDao employeeDao = new EmployeeDao();
	public void storeEmployee() {
		System.out.println("storeEmployee() method of service class");
		employeeDao.store();
	}
}
