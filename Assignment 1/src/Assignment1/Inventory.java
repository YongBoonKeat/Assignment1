package Assignment1;
import java.util.Scanner;
public class Inventory {//1.3 User Define Class
	
	//1.2 Pre-define class
	String itemName,employeeName,position;															// Variable to store itemName,employeeName,position
	int itemQuantity;																				//Variable to store itemNQuantity
	double itemPrice,TotalPricePurchase;															//Variable to store itemPrice,TotalPricePurchase
	
	Scanner input = new Scanner(System.in);
	
	public Inventory() {	
		System.out.print("Enter Your Name: ");
		this.employeeName = input.nextLine();		
				
		System.out.print("Enter Your Position: ");
		this.position = input.nextLine();
		
	}
	
	public Inventory(String employeeName,String position) {											//1.4 Constructor with argument
		this.employeeName = employeeName;
		this.position = position; 
		System.out.println("=========================================================================================================================================");
		System.out.println("\t\t\t\t\t\t\tList Inventory");
		System.out.println("=========================================================================================================================================");
		System.out.println("Employee Name\t\t\t: " + this.employeeName + "\t\t\t\t\t\tPosition\t\t\t: " + this.position);
	}
	
	public int getItemQuantity() {																	//Method to get Quantity Item
		return this.itemQuantity;
	}
	public double getItemPrice() {																	//Method to get Price Item
		return this.itemPrice;
	}
	public double getSubTotalPricePurchase() {														//Method to get the sub total price of every inventory stock
		return this.itemQuantity * this.itemPrice;
	}
	public double getTotalPricePurchase() {															//Method to get the total price of all inventory stock
		return TotalPricePurchase;
	}
	void StockInventory(String itemName, int itemQuantity,double itemPrice) {							//Method to get Inventory
		this.itemName = itemName;
		this.itemQuantity = itemQuantity;
		this.itemPrice = itemPrice;
		System.out.println(itemName +"\t\t|\t"+ itemQuantity + "\t\t|\t" + itemPrice + "\t\t|\t" + getSubTotalPricePurchase() +"\t\t|");
		TotalPricePurchase = TotalPricePurchase + (this.itemQuantity * this.itemPrice);
	}
	
}
