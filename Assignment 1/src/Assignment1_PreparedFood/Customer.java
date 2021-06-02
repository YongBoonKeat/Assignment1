package Assignment1_PreparedFood;
import java.util.Scanner;
public class Customer{//1.3 User Define Class //Sub class
	
	//1.2 Pre-define class
	String itemNumber,itemName;// Variable to store itemNumber,itemName
	int quantity,choice;// Variable to store quantity,choice
	double itemPrice,taxService,subtotal,discount;// Variable to store itemPrice,taxService,subtotal,discount
	
	public Customer() {//1.4 Constructor with non-argument
		do {   
	 		System.out.println();
	        System.out.println("YBK Groceries");
	        System.out.println("1. PF-914  Maggi Instant Noodles Curry\t\t RM3.50 per pack");
	        System.out.println("2. PF-925  Mamee Instant Noodles Spicy\t\t RM6.50 per pack");
	        System.out.println("3. PF-925  Indomie Instant Noodles Chicken\t RM4.50 per pack");
	        System.out.println("4. FF-821  Figo Fried Fish Ball\t\t\t RM13.3 per pack");
	        System.out.println("5. FF-822  Ayamas Red Hot Crispy Fried Chicken\t RM16.5 per pack");
	        System.out.println("0. Payment");
	        System.out.println("Subtotal : RM " +(int)(subtotal * 100) / 100.0);
	        System.out.println("What would you like to purchase?");
	        Scanner input = new Scanner(System.in);   
	        choice = input.nextInt();
	        if (choice == 0)
	        			break;

	        	System.out.println("How many do you want?");
	        	this.quantity = input.nextInt();
	        				switch (choice) {

	        				case 1:
	        						itemPrice = 3.5;
	        						break;
	        				case 2:
	        						itemPrice = 6.5;                       
	        						break;
	        				case 3:
	        						itemPrice = 4.5;
	        						break;
	        				case 4:
	        						itemPrice = 13.3;
	        						break;
	        				case 5:
	        						itemPrice = 16.5;
	        						break;
	        			} //End switch (choice)  
	        				subtotal = subtotal + (this.quantity * itemPrice);
						}while(choice > 0);
					}

	public Customer(String itemNumber,String itemName, double itemPrice) {//1.4 Constructor with argument
		this.itemNumber = itemNumber;
		this.itemName = itemName;
		this.itemPrice = itemPrice;
		System.out.println(this.itemNumber + "\t\t|\t" + this.itemName + "\t\t|\t" + this.itemPrice + "\t\t|");
		}
	
	public String getItemNumber()  {// Method to get ItemNumber 
		return this.itemNumber;
	}
	
	public String getItemName()  {// Method to get ItemName
		return this.itemName;
	}
	
	public double getItemPrice()  {// Method to get ItemPrice
		return this.itemPrice;
	}
	
	void printReceipt() {//Method print Receipt
        System.out.print("Are you a member of the discount club? (Y/N):");
        Scanner input = new Scanner(System.in);
        String discountInput = input.next();
        char discountClub = discountInput.charAt(0);   
        if (discountClub == 'y' || discountClub == 'Y'){
           discount = subtotal * 0.20;//discount 2%
        }   
        double tax = ((subtotal - discount) * 0.075);
        double finalCost = subtotal - discount + tax;
        System.out.println("*************************************************************");
		System.out.println("\t\t\t\t\t\t\t\tReceipt");
		System.out.println("*************************************************************");
        System.out.println("Subtotal \t\t\t: RM " + (int)(subtotal * 100) / 100.0);
        System.out.println("Member's Discount \t\t: RM " + (int) (discount * 100) / 100.0);
        System.out.println("Sales Tax \t\t\t: RM " + (int)(tax* 100) / 100.0);
        System.out.println("Total Cost \t\t\t: RM " + finalCost);
        System.out.print("Enter Amount Payment \t\t: RM");
        Scanner input1 = new Scanner(System.in);
        double payment = input.nextInt();
        System.out.println("Payment \t\t\t: RM " + payment);
        double balance = payment - finalCost ;
        System.out.println("Balance \t\t\t: RM " + balance);
}
}