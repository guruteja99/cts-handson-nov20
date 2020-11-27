package exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeService {

	List<Employee> employees = new ArrayList<>();
	public void addEmployee(Employee e) {
		employees.add(e);
	}
	public Employee findEmployeeById(int id) {
		for (Employee employee : employees) {
			if(employee.getId()==id)
				return employee;			
		}
		return null;
	}
	public List<Employee> allEmployees(){
		return employees;
	}
	public List<Employee> sortedEmployeesById(){
		Collections.sort(employees, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.getId()-o2.getId();
			}
			
		});
		return employees;
	}
	public List<Employee> sortedEmployeesByName(){
		Collections.sort(employees, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.getName().compareTo(o2.getName());
			}
			
		});
		return employees;
	}
	public List<Employee> sortedEmployeesByDOB(){
		Collections.sort(employees, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				return (int) (o1.getSalary()-o2.getSalary());
			}
			
		});
		return employees;
	}

}
