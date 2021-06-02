package Sample;
public class ProductDescription {//1.3 User Define Class //Sub class
	
	//1.2 Pre-define class
	String itemNumber,itemName;    //  variable that stores the item name, item number
	double itemPrice;   //  variable that stores the item price
	String department;   //  variable that stores the department
		
		public ProductDescription() {// Constructor with non-arguments
				System.out.println("Package Food and Frozen Food are categories of prepare food in grocery store.");
		}
		public ProductDescription(String d) { //1.4 Constructor with one argument
			department = d;
			System.out.println("**********************************************************");
			System.out.println("\t\tDepartment " + d);
			System.out.println("**********************************************************");
			
		if (department == "Package Food") {
				System.out.println("====================Details of Product====================");
				System.out.println("ItemNumber\t: PF-914");
				System.out.println("ItemName\t: Maggi Instant Noodles Flavour Curry");
				System.out.println("ItemBrand\t: Maggi");
				System.out.println("ItemFlavour\t: Curry");
				System.out.println("ItemPrice\t: RM3.5");
				System.out.println("ItemNetWeight\t: 80g x 5 = 400gram");
				System.out.println("==========================================================");
				System.out.println();
	
				System.out.println("====================Details of Product====================");
				System.out.println("ItemNumber\t: PF-925");
				System.out.println("ItemName\t: Mamee Chef Instant Noodles Flavour Tom Yam");
				System.out.println("ItemBrand\t: Mamee Chef");
				System.out.println("ItemFlavour\t: Curry");
				System.out.println("ItemPrice\t: RM6.5");
				System.out.println("ItemNetWeight\t: 72g x 4 = 288gram");
				System.out.println("==========================================================");
				System.out.println();

				System.out.println("====================Details of Product====================");
				System.out.println("ItemNumber\t: PF-936");
				System.out.println("ItemName\t: Indomie Instant Noodles Flavour Hot Spicy");
				System.out.println("ItemBrand\t: Indomie");
				System.out.println("ItemFlavour\t: Hot Spicy");
				System.out.println("ItemPrice\t: RM4.5");
				System.out.println("ItemNetWeight\t: 80g x 5 = 400gram");
				System.out.println("==========================================================");
				System.out.println();
			 }
		
		else if (department == "Frozen Food") {
				System.out.println("====================Details of Product====================");
				System.out.println("TypeItem\t: Frozen Meat");
				System.out.println("TypeItemNumber\t: FF-821");
				System.out.println("ItemName\t: Ayamas Hot Crispy Fried Chicken");
				System.out.println("ItemBrand\t: Ayamas");
				System.out.println("ItemPrice\t: RM13.3");
				System.out.println("ItemNetWeight\t: 850gram");
				System.out.println("==========================================================");
				System.out.println();
		
				System.out.println("====================Details of Product====================");
				System.out.println("TypeItem\t: Frozen Fish");
				System.out.println("TypeItemNumber\t: FF-849");
				System.out.println("ItemName\t: Figo Fried Fish Ball");
				System.out.println("ItemBrand\t: Figo");
				System.out.println("ItemPrice\t: RM16.5");
				System.out.println("ItemNetWeight\t: 1kg");
				System.out.println("==========================================================");
				System.out.println();
			}
		}//End ProductDescription Constructor with one argument
		
		
		public ProductDescription( String itemNumber,String itemName, double itemPrice,String department) {// Constructor with arguments
				this.itemNumber = itemNumber;	
				this.itemName = itemName;
				this.itemPrice = itemPrice;
				this.department = department;
				
				System.out.println(getItemNumber()+ "\t\t|\t" + getItemName() + "\t\t|\t" + getItemPrice() 
				+ "\t\t|\t" + getDepartment() + "\t\t|");
		}
			
		public String getItemNumber(){  // Method to get the item number
			return this.itemNumber;
		}	
		public String getItemName() { // Method to get the item name
				return this.itemName;
		}					
		public double getItemPrice(){  // Method to get the item price
			return this.itemPrice;
		}
		public String getDepartment() { // Method to get the item name
			return this.department;
		}
		
		public String toString() {
			return  getItemNumber() + "\t\t|\t" + getItemName() + "\t\t|\t" 
					+ getItemPrice() + "\t\t|\t" + getDepartment() + "\t\t|";
	}
}  //end class Product

