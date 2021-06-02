package Sample;

public class Employee{//1.3 User Define Class //Sub class
	
	//1.2 Pre-define class
	String company,name, noPhone,emailAddress,position;
	char gender;
	
	public Employee() {//1.4 Constructor with non-argument
		this.company = "YBK GROCERY";
		this.name = "YONG BOON KEAT";
		this.gender = 'M';
		this.noPhone = "017-4715598";
		this.emailAddress = "yongboonkeatybk@gmail.com";
		this.position = "Cashier";
		
	    System.out.println("Company Name\t\t\t\t: " + company);
	       System.out.println("Name\t\t\t\t\t: " + name);
	       if(gender == 'M') {
	    	   System.out.println("Gender\t\t\t\t\t: Male");
	       }
	       else if(gender == 'F') { 
	    	   System.out.println("Gender\t\t\t\t\t: Male");
	       }
	       else {
	    	   System.out.println("Gender\t\t\t\t\t: -");
		   }
	       System.out.println("No Phone\t\t\t\t: " +noPhone);
	       System.out.println("Email Address\t\t\t\t: " + emailAddress);
	       System.out.println("Position\t\t\t\t: " + position);
	  }
	
	public Employee(String company,String name, char gender, String noPhone, String emailAddress,String position) {//1.4 Constructor with argument
		this.company = company;
		this.name = name;
		this.gender = gender;
		this.noPhone = noPhone;
		this.emailAddress = emailAddress;
		this.position = position;
		
		   System.out.println("Company Name\t\t\t\t: " + company);
	       System.out.println("Name\t\t\t\t\t: " + name);
	       if(gender == 'M') {
	    	   System.out.println("Gender\t\t\t\t\t: Male");
	       }
	       else if(gender == 'F') { 
	    	   System.out.println("Gender\t\t\t\t\t: Male");
	       }
	       else {
	    	   System.out.println("Gender\t\t\t\t\t: -");
		   }
	       System.out.println("No Phone\t\t\t\t: " +noPhone);
	       System.out.println("Email Address\t\t\t\t: " + emailAddress);
	       System.out.println("Position\t\t\t\t: " + position);
	     
    }
	
	void printWorkingTime(String typeOfWorkSchedule,int workingHours,int workingDays) {//Method print workingTime
		System.out.println("Type of Work Schedule\t\t\t: " + typeOfWorkSchedule);//Full-Time Job
		System.out.println("Working Hours Per Day\t\t\t: " + workingHours + "hours");//10hours
		System.out.println("Working Days Per Month\t\t\t: " + workingDays + "days");//26day
	}
	
	void calNetSalary(double basicSalaries, double OT , double commision) {//Method print NetSalary
		System.out.println("__________________________________________________________________________________________________________");
		double TotalSalary = basicSalaries + OT + commision;
		System.out.println("Basic Salary\t\t\t\t: RM" + basicSalaries);
		System.out.println("OT(Overtime)\t\t\t\t: RM" + OT);
		System.out.println("Commision\t\t\t\t: RM" + commision);
		System.out.println("__________________________________________________________________________________________________________");
		System.out.println("Net Salary\t\t\t\t: RM" + TotalSalary);
 }
}
