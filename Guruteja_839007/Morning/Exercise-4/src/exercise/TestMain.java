package exercise;

import java.util.Scanner;

public class TestMain {
	public static void main(String[] args) {
		int entry=0;
		EmployeeService service = new EmployeeService();
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("1.Add 2: Display Id 3: Display All 4: Sort by id 5: Sort by dob 6: Sort by name 7: Exit");
			entry=sc.nextInt();
			switch(entry) {
			case 1:service.addEmployee(new Employee(sc.nextInt(),sc.next(),sc.nextDouble()));
					break;
					
			case 2:System.out.println(service.findEmployeeById(sc.nextInt()));
					break;
			case 3:System.out.println(service.allEmployees());
					break;
			case 4:System.out.println(service.sortedEmployeesById());
					break;
			case 6: System.out.println(service.sortedEmployeesByName());
					break;
			case 5: System.out.println(service.sortedEmployeesByDOB());
					break;
			}
		
		}while(entry!=7);
	}

}
