package Activity1;

import java.util.Scanner;


public class EmployeeMain {
	public static void main(String[] args) {
		Employee emp = new Employee();
		String name,mobile,address;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the name:");
		emp.setName(name = sc.nextLine());
		System.out.println("Enter the Address:");
		emp.setAddress( address = sc.nextLine());
		System.out.println("Enter the Mobile:");
		emp.setMobile( mobile = sc.nextLine());
		System.out.println(emp.alldetails());

		int n=1;
		while(n==1) {
			System.out.println("\nVerify and Update the details:\nMenu\n1.Update Employee name\n2.Update Employee Address\n3.Update Employee mobile\n4.All information correct/Exit");
			int number = sc.nextInt();
			switch(number){    
		    case 1: name_change();
		    n=1;
		    break;
		    case 2: Address_change();
		    n=1;
		    break;
		    case 3: mobile_change();
		    n=1;
		    break;
		    case 4: System.out.println(emp.alldetails());
		    System.exit(0);
			}
		}
		
		
		
		
		
		
	}
	
	//name change
	public static void name_change() {
		Employee emp = new Employee();
		String name;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the name:");
		emp.setName(name = sc.nextLine());
	}
	
	//Address change
	public static void Address_change() {
		Employee emp = new Employee();
		String address;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Address:");
		emp.setName(address = sc.nextLine());
	}
	
	//mobile change
	public static void mobile_change() {
		Employee emp = new Employee();
		String mobile;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the name:");
		emp.setName(mobile = sc.nextLine());
	}
}
