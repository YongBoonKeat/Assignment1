package Assignment1_PreparedFood;
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
				System.out.println("TypeItem\t: Canned Food");
				System.out.println("ItemNumber\t: PF-731");
				System.out.println("ItemName\t: Tuna");
				System.out.println("ItemBrand\t: TC Boy Tuna Chilli Padi");
				System.out.println("ItemFlavour\t: Chilli Padi");
				System.out.println("ItemPrice\t: RM4.90");
				System.out.println("ItemNetWeight\t: 150g");
				System.out.println("==========================================================");
				System.out.println();

				System.out.println("====================Details of Product====================");
				System.out.println("TypeItem\t: Canned Food");
				System.out.println("ItemNumber\t: PF-753");
				System.out.println("ItemName\t: Soup");
				System.out.println("ItemBrand\t: Campbell's Tomato Condensed Soup");
				System.out.println("ItemFlavour\t: Tomato");
				System.out.println("ItemPrice\t: RM5.5");
				System.out.println("ItemNetWeight\t: 310g");
				System.out.println("==========================================================");
				System.out.println();
			 }
		
		else if (department == "Frozen Food") {
				System.out.println("====================Details of Product====================");
				System.out.println("TypeItem\t: Frozen Desserts");
				System.out.println("TypeItemNumber\t: FF-864");
				System.out.println("ItemName\t: Ice Cream");
				System.out.println("ItemBrand\t: Nestlé Ice Cream Vanilla");
				System.out.println("ItemPrice\t: RM8.00");
				System.out.println("ItemSize\t: 1.5L");
				System.out.println("==========================================================");
				System.out.println();
		
				System.out.println("====================Details of Product====================");
				System.out.println("TypeItem\t: Frozen Desserts");
				System.out.println("TypeItemNumber\t: FF-875");
				System.out.println("ItemName\t: Pancakes");
				System.out.println("ItemBrand\t: Dr. Oetker Nona Buttermilk Pancake Mix");
				System.out.println("ItemPrice\t: RM9.00");
				System.out.println("ItemNetWeight\t: 400g");
				System.out.println("==========================================================");
				System.out.println();
				
				System.out.println("====================Details of Product====================");
				System.out.println("TypeItem\t: Frozen Desserts");
				System.out.println("TypeItemNumber\t: FF-886");
				System.out.println("ItemName\t: Waffles");
				System.out.println("ItemBrand\t: Kellogg's Eggo Waffles");
				System.out.println("ItemPrice\t: RM17.00");
				System.out.println("ItemNetWeight\t: 349g");
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

