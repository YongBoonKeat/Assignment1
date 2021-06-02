package Assignment1;
import java.util.Scanner;

public class Customer{//1.3 User Define Class //Sub class
	
	//1.2 Pre-define class
	String customerName,phoneNumber,address,orderItem;											// Variable to store itemNumber,itemName
	int choice,orderQuantity;																	// Variable to store quantity,choice
	double itemPrice,TotalPrice;																// Variable to priceItem,subTotalItem,TotalPric
	int iq1,iq2,iq3,iq4,iq5,iq6,iq7,iq8,iq9,iq10,iq11;											//Variable to store quantity different item
	double sti1,sti2,sti3,sti4,sti5,sti6,sti7,sti8,sti9,sti10,sti11;							//Variable to store sub-total price different item
	
	Scanner input = new Scanner(System.in);
	public Customer(){																			//1.4 Constructor with non-argument
		System.out.print("Enter Your Name: ");
		this.customerName = input.nextLine();		
				
		System.out.print("Enter Your Phone Number: ");
		this.phoneNumber = input.nextLine();
				
		System.out.print("Enter Your Address: ");
		this.address = input.nextLine();
		
		CustomerInfo(customerName,phoneNumber,address);
	}
	
	public Customer(String customerName) {														//1.4 Constructor with one argument		
		System.out.print("Enter Your Phone Number: ");
		this.phoneNumber = input.nextLine();
				
		System.out.print("Enter Your Address: ");
		this.address = input.nextLine();
		
		CustomerInfo(customerName,phoneNumber,address);
		OrderItem();
	}
	
	public Customer(String customerName,String phoneNumber) {									//1.4 Constructor with two argument		
		System.out.print("Enter Your Address: ");
		this.address = input.nextLine();
		
		CustomerInfo(customerName,phoneNumber,address);
		OrderItem();
	}
	
	public Customer(String customerName,String phoneNumber,String address) {					//1.4 Constructor with argument
		CustomerInfo(customerName,phoneNumber,address);
		OrderItem();
	}
	
	public int getOrderQuantity() {																//Method to get Quantity Item
		return this.orderQuantity;
	}
	
	public double getItemPrice() {																//Method to get Price Item
		return this.itemPrice;
	}
	
	public double getSubtotalItem() {															//Method to get Subtotal Item
		return this.orderQuantity * this.itemPrice;
	}
	
	public double getTotalPriceOrderItem() {													//Method to get Total Price order item from customer
		return TotalPrice;
	}
	
	void CustomerInfo(String customerName,String phoneNumber,String address) {					//Method to print Customer Info
		System.out.println("=================================================================================");
		System.out.println("\t\t\t\tInfo Customer");
		System.out.println("=================================================================================");
		System.out.println("Customer Name \t:" + customerName);
		System.out.println("Phone Number \t:" + phoneNumber);
		System.out.println("Address \t:" + address);
		System.out.println("=================================================================================");
		System.out.println();
	}
	
	void OrderItem() {																			//Method to print OrderItem
		System.out.println();
		System.out.println("===================================================================================");
		System.out.println("1. Nestlé Ice Cream Vanilla\t\t\t\t\t\t" + "RM8.00");
        System.out.println("2. Nestlé Ice Cream Chocolate\t\t\t\t\t\t" + "RM8.00");
        System.out.println("3. Nestlé Ice Cream Strawberry\t\t\t\t\t\t" + "RM8.00");
        System.out.println("4. Dr.Oetker Nona Original Pancake\t\t\t\t\t"+ "RM9.00");
   		System.out.println("5. Dr.Oetker Nona Buttermilk Pancake Mix\t\t\t\t" + "RM9.00");
   		System.out.println("6. Dr.Oetker Nona Marble Butter Cake Mix\t\t\t\t"+ "RM9.00");
        System.out.println("7. Lotus's Chicken Mushroom Pizza\t\t\t\t\t" + "RM9.00");
        System.out.println("8. Lotus's Four Cheese Pizza\t\t\t\t\t\t" + "RM9.00");
        System.out.println("9. Lotus's Hawaiian Chicken Pizza\t\t\t\t\t" + "RM9.00");
        System.out.println("10. Ayamas Premium Mushroom Chicken Cocktail Sausages\t\t\t" + "RM10.00" );
        System.out.println("11. Ayamas Premium Black Pepper Chicken Cocktail Sausages\t\t" + "RM10.00");     
        System.out.println("0. Quit");
        System.out.println("===================================================================================");
    do {  System.out.print("Enter choice: ");
		choice = input.nextInt();
		
    if (choice == 0 || choice > 11)
    	break;
    	System.out.print("Enter Quantity:");
    	this.orderQuantity = input.nextInt();
    				switch (choice) {
    				
    				case 1:
    						orderItem = "Nestlé Ice Cream Vanilla";
    						itemPrice = 8.0;
						    iq1 = orderQuantity;
						    sti1 = orderQuantity * itemPrice ;
    						break;
    				case 2:
    						orderItem ="Nestlé Ice Cream Chocolate";
    						itemPrice = 8.0;
    						iq2 = orderQuantity;
    						sti2 = orderQuantity * itemPrice  ;
    						break;
    				case 3:
    						orderItem ="Nestlé Ice Cream Strawberry";
    						itemPrice = 8.0;
    						iq3 = orderQuantity;
    						sti3 = orderQuantity * itemPrice ;
    						break;
    				case 4:
							orderItem ="Dr.Oetker Nona Buttermilk Pancake Mix";
							itemPrice = 9.0;
							iq4 = orderQuantity;
							sti4 = orderQuantity * itemPrice ;
							break;
    				case 5:
							orderItem ="Dr.Oetker Nona Original Pancake ";
							itemPrice = 9.0;
							iq5 = orderQuantity;
							sti5 = orderQuantity * itemPrice ;
							break;
    				case 6:
							orderItem ="Dr.Oetker Nona Original Pancake ";
							itemPrice = 9.0;
							iq6 = orderQuantity;
							sti6 = orderQuantity * itemPrice ;
							break;
    				case 7:
    						orderItem ="Lotus's Chicken Mushroom Pizza";
    						itemPrice = 9.0;
    						iq7 = orderQuantity;
    						sti7 = orderQuantity * itemPrice ;
    						break;
    				case 8:	
    						orderItem ="Lotus's Four Cheese Pizza";
    						itemPrice = 9.0;
    						iq8 = orderQuantity;
    						sti8 = orderQuantity * itemPrice;
    						break;
    				case 9:
    						orderItem ="Lotus's Hawaiian Chicken Pizza";
    						itemPrice = 9.0;
							iq9 = orderQuantity;
							sti9 = orderQuantity * itemPrice ;
							break;		
    				case 10:
    						orderItem = "Ayamas Premium Mushroom Chicken Cocktail Sausages";
    						itemPrice = 10.0;
							iq10 = orderQuantity;
							sti10 = orderQuantity * itemPrice ;
							break;
    				case 11:
    						orderItem ="Ayamas Premium Black Pepper Chicken Cocktail Sausages";
    						itemPrice = 10.0;
							iq11 = orderQuantity;
							sti11 = orderQuantity * itemPrice ;
							break;
    			} //End switch (choice) 
    				TotalPrice = TotalPrice + (this.orderQuantity * itemPrice);	
	}while(choice > 0);
     System.out.println();
     System.out.println("=========================================================================================================================================");
	 System.out.println("\t\t\tItem Name\t\t\t\t|\tItem Quantity \t|\tItem Price \t| \t Subtotal \t|");
	 System.out.println("=========================================================================================================================================");
     System.out.println("Nestlé Ice Cream Vanilla\t\t\t\t\t|\t\t"+ iq1 + "\t|\t" + "RM8.00\t\t|\t  " +sti1 + "\t\t|");
	 System.out.println("Nestlé Ice Cream Chocolate\t\t\t\t\t|\t\t"+ iq2 + "\t|\t" + "RM8.00\t\t|\t  " +sti2 + "\t\t|");
	 System.out.println("Nestlé Ice Cream Strawberry\t\t\t\t\t|\t\t"+ iq3 + "\t|\t" + "RM8.00\t\t|\t  " +sti3 + "\t\t|");
	 System.out.println("Dr.Oetker Nona Original Pancake\t\t\t\t\t|\t\t"+ iq4 + "\t|\t" + "RM9.00\t\t|\t  " +sti4 + "\t\t|");
	 System.out.println("Dr.Oetker Nona Buttermilk Pancake Mix\t\t\t\t|\t\t"+ iq5 + "\t|\t" + "RM9.00\t\t|\t  " +sti5 + "\t\t|");
	 System.out.println("Dr.Oetker Nona Marble Butter Cake Mix\t\t\t\t|\t\t"+ iq6 + "\t|\t" + "RM9.00\t\t|\t  " +sti6 + "\t\t|");
	 System.out.println("Lotus's Chicken Mushroom Pizza\t\t\t\t\t|\t\t" + iq7 + "\t|\t" + "RM9.00\t\t|\t  "+ sti7 + "\t\t|");
	 System.out.println("Lotus's Four Cheese Pizza\t\t\t\t\t|\t\t" + iq8 + "\t|\t" + "RM9.00\t\t|\t  " + sti8 + "\t\t|");
	 System.out.println("Lotus's Hawaiian Chicken Pizza\t\t\t\t\t|\t\t" + iq9 + "\t|\t" + "RM9.00\t\t|\t  "+ sti9 + "\t\t|");
	 System.out.println ("Ayamas Premium Mushroom Chicken Cocktail Sausages\t\t|\t\t" + iq10 + "\t|\t" + "RM10.00\t\t|\t  " + sti10 + "\t\t|");
	 System.out.println("Ayamas Premium Black Pepper Chicken Cocktail Sausages\t\t|\t\t" + iq11 + "\t|\t" + "RM10.00\t\t|\t  " + sti11 + "\t\t|");
	 System.out.println("_________________________________________________________________________________________________________________________________________");
	 System.out.println("Total Price\t\t\t\t\t\t\t\t\t\t\t\t\t        RM " + TotalPrice);
	 System.out.println("=========================================================================================================================================");
     System.out.println();
}
	void OrderItem(String orderItem,int orderQuantity,double itemPrice) {											//Method to print Order item from customer
		this.orderItem = orderItem;
		this.orderQuantity = orderQuantity;
		this.itemPrice = itemPrice;
		System.out.println(orderItem +"\t\t|\t"+ orderQuantity + "\t\t|\t" + itemPrice+ "\t\t|\t" + getSubtotalItem() +"\t\t|");
		TotalPrice = TotalPrice + (this.orderQuantity * this.itemPrice);
	}
	
}