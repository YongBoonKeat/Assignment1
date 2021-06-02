package Assignment1;

public class ProductDescription {//1.3 User Define Class 
	
	//1.2 Pre-define class
	private String itemCode,itemSubcategory,itemCategory,department;//  variable that stores the itemCode,itemSubcategory,itemCategory,department

	public ProductDescription() {//1.4 Constructor with non-arguments
		this.itemCode = "-";	
		this.itemSubcategory = "-";
		this.itemCategory = "-";
		this.department = "-";
	}
	
	public ProductDescription( String itemCode,String itemSubcategory, String itemCategory,String department) {//1.4 Constructor with arguments
		this.itemCode = itemCode;	
		this.itemSubcategory = itemSubcategory;
		this.itemCategory = itemCategory;
		this.department = department;
		
		
		System.out.println(getItemCode()+ "\t\t|\t" + getItemSubcategory() + "\t\t|\t" + getItemCategory() 
		+ "\t\t|\t" + getDepartment() + "\t\t|");
	}
	
	public String getItemCode(){  // Method to get the item code
		return this.itemCode;
	}	
	public String getItemSubcategory() { // Method to get the item Sub-category
			return this.itemSubcategory;
	}					
	public String getItemCategory(){  // Method to get the item category
		return this.itemCategory;
	}
	public String getDepartment(){  // Method to get the item department
		return this.department;
	}
	
	void IceCreamInfo() {	// Method to print Info IceCream
		System.out.println("=========================================================================================================================");
		System.out.println(" \t\t\t\t\t\tList of Ice Cream"); 
		System.out.println("=========================================================================================================================");
		System.out.println("Item Code\t| \t\t Item Name \t\t\t|\tItem Price \t| \t    Item Size \t\t|");
		System.out.println("FF-864\t\t|" + "\tNestlé Ice Cream Vanilla\t\t|" + "\t RM8.00 \t|" + "\t\t1.5L\t\t|");
		System.out.println("FF-865\t\t|" + "\tNestlé Ice Cream Chocolate\t\t|" + "\t RM8.00 \t|" + "\t\t1.5L\t\t|");
		System.out.println("FF-866\t\t|" + "\tNestlé Ice Cream Strawberry\t\t|" + "\t RM8.00 \t|" + "\t\t1.5L\t\t|");
		System.out.println("=========================================================================================================================");
		System.out.println();
	}
	
	void PancakesInfo() {// Method to print Info Pancakes
		System.out.println("=========================================================================================================================");
		System.out.println(" \t\t\t\t\t\tList of Pancakes"); 
		System.out.println("=========================================================================================================================");
		System.out.println("Item Code\t| \t\t    Item Name \t\t\t|\tItem Price \t| \t    Item Size \t\t|");
		System.out.println("FF-874\t\t|" + "\tDr.Oetker Nona Original Pancake\t\t|" + "\t RM9.00 \t|" + "\t\t400g\t\t|");
		System.out.println("FF-875\t\t|" + "\tDr.Oetker Nona Buttermilk Pancake Mix\t|" + "\t RM9.00 \t|" + "\t\t400g\t\t|");
		System.out.println("FF-876\t\t|" + "\tDr.Oetker Nona Marble Butter Cake Mix\t|" + "\t RM9.00 \t|" + "\t\t400g\t\t|");
		System.out.println("=========================================================================================================================");
		System.out.println();
	}
	
	void PizzaInfo() {// Method to print Info Pizza
		System.out.println("=========================================================================================================================");
		System.out.println(" \t\t\t\t\t\tList of Pizza"); 
		System.out.println("=========================================================================================================================");
		System.out.println("Item Code\t| \t\t Item Name \t\t\t|\tItem Price \t| \t  Item Size \t\t|");
		System.out.println("FF-884\t\t|" + "\tLotus's Chicken Mushroom Pizza\t\t|" + "\t RM10.00 \t|" + "\t    300g\t\t|");
		System.out.println("FF-885\t\t|" + "\tLotus's Four Cheese Pizza\t\t|" + "\t RM10.00 \t|" + "\t    285g\t\t|");
		System.out.println("FF-886\t\t|" + "\tLotus's Hawaiian Chicken Pizza\t\t|" + "\t RM10.00 \t|" + "\t    310g\t\t|");
		System.out.println("=========================================================================================================================");
		System.out.println();
	}
	
	void ChickenInfo() {// Method to print Info Chicken
		System.out.println("=========================================================================================================================");
		System.out.println(" \t\t\t\t\t\tList of Frozen Chicken"); 
		System.out.println("=========================================================================================================================");
		System.out.println("Item Code\t| \t\t Item Name \t\t\t\t\t|\tItem Price \t|   Item Size \t|");
		System.out.println("FF-894\t\t|" + "\tAyamas Premium Mushroom Chicken Cocktail Sausages\t|" + "\t RM11.00 \t|" + "\t500g\t|");
		System.out.println("FF-895\t\t|" + "\tAyamas Premium Black Pepper Chicken Cocktail Sausages\t|" + "\t RM10.00 \t|" + "\t500g\t|");
		System.out.println("=========================================================================================================================");
		System.out.println();
	}

}
