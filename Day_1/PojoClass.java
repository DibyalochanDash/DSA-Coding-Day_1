package Day_1;

import java.util.ArrayList;
import java.util.Scanner;

class Employee{
	private int id;
	private String  name ;
	private String email;
	private String department;
	private int salary;
	
	
	
	public Employee(int id, String name, String email, String department, int salary) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.department = department;
		this.salary = salary;
	}



	public int getId() {
		return id;
	}



	public String getName() {
		return name;
	}



	public String getEmail() {
		return email;
	}



	public String getDepartment() {
		return department;
	}



	public int getSalary() {
		return salary;
	}



	public void setId(int id) {
		this.id = id;
	}



	public void setName(String name) {
		this.name = name;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public void setDepartment(String department) {
		this.department = department;
	}



	public void setSalary(int salary) {
		this.salary = salary;
	}

	}
	public class PojoClass {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Employee> employeelist = new ArrayList<Employee>();
		
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			String str = sc.next();
			String ar[] = str.split(",");
			int id = 1000 + i;
			String name = ar[0];
			String email =ar[1];
			String department = ar[2];
			Integer salary = Integer.parseInt(ar[3]);
			
			Employee e = new Employee(id,name,email,department,salary);
		

	        
			employeelist.add(e);
			
		}
		for (int i = 0; i < employeelist.size(); i++) {
			Employee e = employeelist.get(i);
			System.out.println("=========================================");
			System.out.println("ID : " +e.getId());
			System.out.println("Name : "+ e.getName());
			System.out.println("Email : "+ e.getEmail());
			System.out.println("Department : "+ e.getDepartment());
			System.out.println("Salary : "+ e.getSalary());
			
		}
		
		
		
	}
	

}
