package Assignment1;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

//GroceryStore
 		System.out.println("(Grocery Store)");
		PreparedFoodShop PFS = new PreparedFoodShop ();
		PreparedFoodShop PFS1 = new PreparedFoodShop ("YBK");
		System.out.println();
		
//Product	
 		System.out.println("(Product)");
		ProductDescription P = new ProductDescription();
		System.out.println("=========================================================================================================================");
		System.out.println(" \t\t\t\t\t\tList of Prepared Food"); 
		System.out.println("=========================================================================================================================");
		System.out.println("Item Code\t|\t\tSubcategory \t\t| \t  Category\t\t| \tDeparment \t\t|");
		ProductDescription FF1 = new ProductDescription("PF-86","\tIce Cream","Frozen Desserts","Frozen Foods");
		ProductDescription FF2 = new ProductDescription("PF-87","\tPancakes","Frozen Desserts","Frozen Foods");
		ProductDescription FF3 = new ProductDescription("PF-88","\t Pizza \t","Frozen Pizza","Frozen Foods");
		ProductDescription FF4 = new ProductDescription("FF-89","\tFrozen Chicken","Frozen Meat","Frozen Foods");
		System.out.println("=========================================================================================================================");
		
		Scanner input = new Scanner(System.in);
		System.out.println("Department Frozen Foods");
		System.out.println("1.IceCream");
		System.out.println("2.Pancakes");
		System.out.println("3.Pizza");
		System.out.println("4.Chicken");
		System.out.println("5.All");
		System.out.println("Please Enter Your Choice:");
		int choice = input.nextInt();
			if (choice==1) {
							P.IceCreamInfo();
		}//End Choice 1
			else if (choice==2) {
							P.PancakesInfo();
		}//End Choice 2
			else if (choice==3) {
							P.PizzaInfo();
		}//End Choice 3
			else if (choice==4) {
							P.ChickenInfo();
		}//End Choice 4
			else {
				P.IceCreamInfo();
				P.PancakesInfo();
				P.PizzaInfo();
				P.ChickenInfo();
		}//End Choice
		
//Customer
  		System.out.println("(Customer)");
  		//Customer C = new Customer("Tom","013-5262963","No 116, Taman Kobis, 09600 Lunas, Kedah");
		Customer C1 = new Customer();
		System.out.println("=========================================================================================================================================");
		System.out.println("\t\t\tItem Name\t\t\t\t|\tItem Quantity \t|\tItem Price \t| \t Subtotal \t|");
		System.out.println("=========================================================================================================================================");
		C1.OrderItem("Nestlé Ice Cream Vanilla \t\t\t",5,8);
		C1.OrderItem("Nestlé Ice Cream Chocolate \t\t\t",6,8);
		C1.OrderItem("Nestlé Ice Cream Strawberry \t\t\t",7,8);
		C1.OrderItem("Dr.Oetker Nona Original Pancake \t\t",5,9);
		C1.OrderItem("Dr.Oetker Nona Buttermilk Pancake Mix \t\t",6,9);
		C1.OrderItem("Dr.Oetker Nona Marble Butter Cake Mix \t\t",7,9);
		C1.OrderItem("Lotus's Chicken Mushroom Pizza \t\t\t",5,9);
		C1.OrderItem("Lotus's Four Cheese Pizza \t\t\t",5,9);
		C1.OrderItem("Lotus's Hawaiian Chicken Pizza \t\t\t",6,10);
		C1.OrderItem("Ayamas Premium Mushroom Chicken Cocktail Sausages",1,10);
		C1.OrderItem("Ayamas Premium Black Pepper Chicken Cocktail Sausages",1,10);
		
		System.out.println("_________________________________________________________________________________________________________________________________________");
		System.out.println("Total Price Order Item\t\t\t\t\t\t\t\t\t\t\t\t      RM " + (C1.getTotalPriceOrderItem()) );
		System.out.println("=========================================================================================================================================");
		System.out.println();
		 
//Employee
		System.out.println("(Employee)");
		Employee E = new Employee();
		Employee E1 = new Employee("Yong Boon Keat", 666 ,"Manager",2000);
		System.out.println();

//Inventory
		System.out.println("(Inventory)");
		Inventory I = new Inventory("Yong Boon Keat", "Stock Controller");
		System.out.println("=========================================================================================================================================");
		System.out.println("\t\t\tItem Name\t\t\t\t|\tItem Quantity \t|\tItem Price \t| \t Subtotal \t|");
		System.out.println("=========================================================================================================================================");
		I.StockInventory("Nestlé Ice Cream Vanilla \t\t\t",100,4);
		I.StockInventory("Nestlé Ice Cream Chocolate \t\t\t",100,4);
		I.StockInventory("Nestlé Ice Cream Strawberry \t\t\t",100,4);
		I.StockInventory("Dr.Oetker Nona Original Pancake \t\t",100,5);
		I.StockInventory("Dr.Oetker Nona Buttermilk Pancake Mix \t\t",100,5);
		I.StockInventory("Dr.Oetker Nona Marble Butter Cake Mix \t\t",100,5);
		I.StockInventory("Lotus's Chicken Mushroom Pizza \t\t\t",100,5);
		I.StockInventory("Lotus's Four Cheese Pizza \t\t\t",100,5);
		I.StockInventory("Lotus's Hawaiian Chicken Pizza \t\t\t",100,6);
		I.StockInventory("Ayamas Premium Mushroom Chicken Cocktail Sausages",100,6);
		I.StockInventory("Ayamas Premium Black Pepper Chicken Cocktail Sausages",100,6);
		System.out.println("_________________________________________________________________________________________________________________________________________");
		System.out.println("Total Price Purchase\t\t\t\t\t\t\t\t\t\t\t\t      RM " + (I.getTotalPricePurchase()) );
		System.out.println("=========================================================================================================================================");
		System.out.println();
			
//Finance
		System.out.println("(Finance)");
		//Finance F = new Finance();
		//Finance F = new Finance(50000,9900,5500,500);//Total Income,Total Salary, Total Price Inventory,Incidental Charges
		
//Advertisment
		System.out.println("(Advertisment)");
		Advertisment A = new Advertisment(3,50);//discount,voucher
		A.SocialMedia("Facebook","Instragram","Twitter");
	}

}
