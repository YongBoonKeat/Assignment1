package Assignment1_PreparedFood;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//Product
		GroceryStore Product = new GroceryStore("Product Description");
		System.out.println(Product.toString());
		
		ProductDescription P = new ProductDescription();
		Scanner input = new Scanner(System.in);
		System.out.println("*********************Prepare Food*********************");
		System.out.println("1.Package Food");
		System.out.println("2.Frozen Food");
		System.out.println("3.Both");
		System.out.println("Please Enter Your Choice:");
		int choice = input.nextInt();
		
		if (choice==1) {
			ProductDescription PF = new ProductDescription("Package Food");
			}
		else if (choice==2) {
			ProductDescription FF = new ProductDescription("Frozen Food");
			}
		else if (choice==3) {
				ProductDescription PF = new ProductDescription("Package Food");
				ProductDescription FF = new ProductDescription("Frozen Food");
			}
		else {
				System.out.println("=================================================================================================================");
				System.out.println(" \t\t\t\t\t\tList of Prepared Food"); 
				System.out.println("=================================================================================================================");
				System.out.println("Item Number\t| \t Item Name\t\t\t| \tItem Price\t| \tDeparment \t\t|");
				ProductDescription PF1 = new ProductDescription("PF-731","Tuna\t\t",  4.5,"Package Food");
				ProductDescription PF2 = new ProductDescription("PF-753","Soup\t\t",  5.5,"Package Food");
				ProductDescription FF1 = new ProductDescription("FF-864","Ice Cream\t",  8.0,"Frozen Food");
				ProductDescription FF2 = new ProductDescription("FF-875","Pancakes\t",  9.0,"Frozen Food");
				ProductDescription FF3 = new ProductDescription("FF-886","Waffles \t",  17.5, "Frozen Food");
				System.out.println("==================================================================================================================");
			    System.out.println(); 
			}
		

//Inventory
		GroceryStore Inventory = new GroceryStore("Inventory");
		System.out.println(Inventory.toString());
		
		System.out.println("=========================================================================================================================================");
		System.out.println(" \t\t\t\t\t\tInventory of Prepared Food"); 
		System.out.println("=========================================================================================================================================");
		System.out.println("Item Number\t| \t\t Item Name\t\t\t| \tItem Price\t|  Inventory Stock\t|  Value Inventory \t|");
		Inventory IPF1 = new Inventory("PF-731","Tuna\t\t\t", 4.5,200);
		Inventory IPF2 = new Inventory("PF-753","Soup\t\t\t", 5.5,200);
		Inventory IFF1 = new Inventory("FF-864","Ice Cream\t\t", 8.0,200);
		Inventory IFF2 = new Inventory("FF-875","Pancakes\t\t", 9.0, 200);
		Inventory IFF3 = new Inventory("FF-886","Waffles\t\t\t", 17.5,200);
		System.out.println("=========================================================================================================================================");
	    System.out.println(); 
		
//Employee
	    GroceryStore Employee = new GroceryStore("Employee");
		  System.out.println("3." + Employee.toString()); 
	      System.out.println("=========================================================================================================");
	      System.out.println("\t\t\t\t\t\tEmployee");
	      System.out.println("=========================================================================================================");
	      Employee E = new Employee("YBK GROCERY","YONG BOON KEAT",'M', "017-4715598" ,"yongboonkeatybk@gmail.com","Cashier");
	      E.printWorkingTime("Full-Time Job",10,26); 
	      E.calNetSalary(1200 ,100 , 200); 
	      System.out.println("==========================================================================================================");
	      System.out.println();
		
//Customer
	      GroceryStore Customer = new GroceryStore("Customer");
		  System.out.println("4." + Customer.toString()); 
		  System.out.println("******************************************************************************************");
		  System.out.println("\t\t\t\tList Product YBK Grocery");
		  System.out.println("******************************************************************************************");
		  System.out.println("Item Number\t| \t\t Item Name\t\t\t| \tItem Price\t|");	
		  	Customer CPF1 = new Customer("PF-731","Tuna", 4.5);
		  	Customer CPF2 = new Customer("PF-753","Soup", 5.5);
		  	Customer CFF1 = new Customer("FF-864","Ice Cream", 8.0);
			Customer CFF2 = new Customer("FF-875","Pancakes", 9.0);
			Customer CFF3 = new Customer("FF-886","Waffles \t", 17.5);
		  System.out.println("******************************************************************************************");
		  Customer C = new Customer();
		  C.printReceipt(); 

//Employee
		
		
	}
}
