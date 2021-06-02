package Sample;
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
				System.out.println("=========================================================================================================================");
				System.out.println(" \t\t\t\t\t\tList of Prepared Food"); 
				System.out.println("=========================================================================================================================");
				System.out.println("Item Number\t| \t\t Item Name\t\t\t| \tItem Price\t| \tDeparment \t\t|");
				ProductDescription PF1 = new ProductDescription("PF-914","Maggi Instant Noodles Curry", 3.5,"Package Food");
				ProductDescription PF2 = new ProductDescription("PF-925","Mamee Instant Noodles Spicy",  6.5,"Package Food");
				ProductDescription PF3 = new ProductDescription("PF-936","Indomie Instant Noodles Chicken",  4.5,"Frozen Food");
				ProductDescription FF1 = new ProductDescription("FF-821","Figo Fried Fish Ball\t",  13.3, "Frozen Food");
				ProductDescription FF2 = new ProductDescription("FF-822","Ayamas Hot Crispy Fried Chicken",  16.5,"Frozen Food");
				System.out.println("==========================================================================================================================");
			    System.out.println(); 
			}
		

//Inventory
		GroceryStore Inventory = new GroceryStore("Inventory");
		System.out.println(Inventory.toString());
		
		System.out.println("========================================================================================================================================");
		System.out.println(" \t\t\t\t\t\tInventory of Prepared Food"); 
		System.out.println("========================================================================================================================================");
		System.out.println("Item Number\t| \t\t Item Name\t\t\t| \tItem Price\t|  Inventory Stock\t|  Value Inventory \t|");
		Inventory IPF1 = new Inventory("PF-914","Maggi Instant Noodles Curry",  3.5,200);
		Inventory IPF2 = new Inventory("PF-925","Mamee Instant Noodles Spicy",  6.5,200);
		Inventory IPF3 = new Inventory("PF-936","Indomie Instant Noodles Chicken",  4.5,200);
		Inventory IFF1 = new Inventory("FF-821","Figo Fried Fish Ball\t",  13.3, 20);
		Inventory IFF2 = new Inventory("FF-822","Ayamas Hot Crispy Fried Chicken",  16.5,20);
		System.out.println("========================================================================================================================================");
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
		  	Customer CPF1 = new Customer("PF-914","Maggi Instant Noodles Curry",  3.5);
		  	Customer CPF2 = new Customer("PF-925","Mamee Instant Noodles Spicy",  6.5);
		  	Customer CPF3 = new Customer("PF-936","Indomie Instant Noodles Chicken",  4.5);
			Customer CFF1 = new Customer("FF-821","Figo Fried Fish Ball\t",  13.3);
			Customer CFF2 = new Customer("FF-822","Ayamas Hot Crispy Fried Chicken",  16.5);
		  System.out.println("******************************************************************************************");
		  Customer C = new Customer();
		  C.printReceipt(); 
		
		
		
	}
}
