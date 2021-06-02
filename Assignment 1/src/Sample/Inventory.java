package Sample;

public class Inventory {//1.3 User Define Class //Sub class
	
	//1.2 Pre-define class
	String itemNumber,itemName;//  variable that stores itemNumber,itemName
	double itemPrice;//  variable that stores itemPrice
	int stock;   	//  variable that stores the quantity in stock
	
	public Inventory() {//1.4 Constructor with non-argument
		System.out.println("PF-914"+ "\t\t|\t" + "Maggi Instant Noodles Curry" + "\t\t|\t" + 3.5 + "\t\t|\t" + 200 + "\t\t|\t" + "-" + "\t\t|\t");
		System.out.println("PF-925"+ "\t\t|\t" + "Mamee Instant Noodles Spicy" + "\t\t|\t" + 6.5 + "\t\t|\t" + 200 + "\t\t|\t" + "-" + "\t\t|");
		System.out.println("PF-936"+ "\t\t|\t" + "Indomie Instant Noodles Chicken" + "\t\t|\t" + 4.5 + "\t\t|\t" + 200 + "\t\t|\t" + "-" + "\t\t|");
		System.out.println("FF-821"+ "\t\t|\t" + "Figo Fried Fish Ball\t" + "\t\t|\t" + 13.3 + "\t\t|\t" + 20 + "\t\t|\t" + "-" + "\t\t|");
		System.out.println("FF-822"+ "\t\t|\t" + "Ayamas Hot Crispy Fried Chicken" + "\t\t|\t" + 16.5 + "\t\t|\t" + 20 + "\t\t|\t" + "-" + "\t\t|");
		
	}
	
	public Inventory(String itemNumber,String itemName, double itemPrice,int stock) {//1.4 Constructor with argument
		this.itemNumber = itemNumber;	
		this.itemName = itemName;	
		this.itemPrice = itemPrice;	
		this.stock = stock;	
		
		
		System.out.println(getItemNumber()+ "\t\t|\t" + getItemName() + "\t\t|\t" + getItemPrice() 
		+ "\t\t|\t" + getInventoryStock() + "\t\t|\t" + getValueInventoryStock() + "\t\t|");
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
	
	public double getInventoryStock()  {// Method to get ItemPrice
		return this.stock;
	}
	
	public double getValueInventoryStock() {// Method to get ItemPrice
		return this.itemPrice * this.stock;
	}
	
	public String toString(){//overriding method
		return  getItemNumber() + "\t\t|\t" + getItemName() + "\t\t|\t" + getItemPrice() 
		+ "\t\t|\t" + getInventoryStock() + "\t\t|\t" + getValueInventoryStock() + "\t\t|";
	}
}
