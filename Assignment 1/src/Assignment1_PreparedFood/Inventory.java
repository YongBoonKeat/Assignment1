package Assignment1_PreparedFood;

public class Inventory {//1.3 User Define Class //Sub class
	
	//1.2 Pre-define class
	String itemNumber,itemName;//  variable that stores itemNumber,itemName
	double itemPrice;//  variable that stores itemPrice
	int stock;   	//  variable that stores the quantity in stock
	
	public Inventory() {//1.4 Constructor with non-argument
		System.out.println("PF-731"+ "\t\t|\t" + "Tuna" + "\t\t|\t" + 4.5 + "\t\t|\t" + 200 + "\t\t|\t" + "-" + "\t\t|\t");
		System.out.println("PF-753"+ "\t\t|\t" + "Soup" + "\t\t|\t" + 5.5 + "\t\t|\t" + 200 + "\t\t|\t" + "-" + "\t\t|");
		System.out.println("FF-864"+ "\t\t|\t" + "Ice Cream" + "\t\t|\t" + 8.0 + "\t\t|\t" + 200 + "\t\t|\t" + "-" + "\t\t|");
		System.out.println("FF-875"+ "\t\t|\t" + "Pancakes\t" + "\t\t|\t" + 9.0 + "\t\t|\t" + 200 + "\t\t|\t" + "-" + "\t\t|");
		System.out.println("FF-886"+ "\t\t|\t" + "Waffles" + "\t\t|\t" + 17.5 + "\t\t|\t" + 200 + "\t\t|\t" + "-" + "\t\t|");
		
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
	
	public int getInventoryStock()  {// Method to get ItemPrice
		return this.stock;
	}
	
	public double getValueInventoryStock() {// Method to get ItemPrice
		return this.itemPrice * this.stock;
	}
	
	public String toString(){//overriding method
		return  getItemNumber() + "\t\t|\t" + getItemName() + "\t\t|\t" + getItemPrice() 
		+ "\t\t|\t" + getInventoryStock() + "\t\t|\tRM" + getValueInventoryStock() + "\t\t|";
	}
}
