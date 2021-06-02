package Assignment;
import java.util.Scanner;
public class Employee {//1.3 User Define Class
	//1.2 Pre-define class
	private String employeeName,position;												// variable that stores the employeeName,position
	private int employeeID;																// variable that stores the employeeID
	private double salary;																// variable that stores the salary
	
	Scanner input = new Scanner(System.in);
	public Employee() {																	//1.4 Constructor with non-argument
		System.out.print("Enter Your Name: ");
		this.employeeName = input.nextLine();		
		
		System.out.print("Enter Your EmployeeID: ");
		this.employeeID = input.nextInt();
		input.nextLine();
		
		System.out.print("Enter Your Position: ");
		this.position  = input.nextLine();
		
		System.out.print("Enter Your Salary: ");
		this.salary  = input.nextDouble();

		   System.out.println("=================================================================================");
		   System.out.println("\t\t\t\tInfo Employee");
		   System.out.println("=================================================================================");
	       System.out.println("Employee Name\t\t\t\t: " + this.employeeName);
	       System.out.println("Employee ID\t\t\t\t: " + this.employeeID );
	       System.out.println("Position\t\t\t\t: " + this.position);
	       System.out.println("Salary\t\t\t\t\t: RM" + this.salary );
	       System.out.println("=================================================================================");
	  }
	
	public Employee(String employeeName) {													//1.4 Constructor with one argument		
		System.out.print("Enter Your EmployeeID: ");
		this.employeeID = input.nextInt();
		input.nextLine();
		
		System.out.print("Enter Your Position: ");
		this.position  = input.nextLine();
		
		System.out.print("Enter Your Salary: ");
		this.salary  = input.nextDouble();
		EmployeeInfo (employeeName,employeeID,position,salary);
    }
	
	public Employee(String employeeName, int employeeID) {									//1.4 Constructor with two argument
		System.out.print("Enter Your Position: ");
		this.position  = input.nextLine();
		
		System.out.print("Enter Your Salary: ");
		this.salary  = input.nextDouble();
		EmployeeInfo (employeeName,employeeID,position,salary);
    }
	
	public Employee(String employeeName, int employeeID,String position) {					//1.4 Constructor with three argument
		System.out.print("Enter Your Salary: ");
		this.salary  = input.nextDouble();
		EmployeeInfo (employeeName,employeeID,position,salary);
    }
	
	public Employee(String employeeName, int employeeID,String position, double salary) {	//1.4 Constructor with argument
		this.employeeName = employeeName;
		this.employeeID = employeeID;
		this.position = position;
		this.salary = salary;
		EmployeeInfo (employeeName,employeeID,position,salary);
    }
	public String getEmployeeName(){  // Method to get EmployeeName
		return this.employeeName;
	}	
	public int getEmployeeID() { // Method to get EmployeeID
		return this.employeeID;
	}					
	public String getPosition(){  // Method to get Position
		return this.position;
	}
	public double getSalary(){  // Method to get Salary
		return this.salary;
	}
	
	void EmployeeInfo (String employeeName, int employeeID,String position, double salary) {//Method print Employee Info
		System.out.println("=================================================================================");
		System.out.println("\t\t\t\tInfo Employee");
		System.out.println("=================================================================================");
		System.out.println("Employee Name\t\t\t\t: " + employeeName);
	    System.out.println("Employee ID\t\t\t\t: " + employeeID);
	    System.out.println("Position\t\t\t\t: " + position);
	    System.out.println("Salary\t\t\t\t\t: RM" + salary);
		System.out.println("=================================================================================");
	}

}
