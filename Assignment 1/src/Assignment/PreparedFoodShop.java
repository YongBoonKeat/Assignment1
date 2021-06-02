package Assignment;
import java.util.Scanner;

public class PreparedFoodShop {//1.3 User Define Class //Super class
	//1.2 Pre-define class
	private String storeName;
	private int yearEstablished;
	private String PhoneNum;
	
	Scanner input = new Scanner(System.in);
	public PreparedFoodShop() {//1.4 Constructor with non-arguments
		
		System.out.print("Enter Name of Grocery Store: ");
		this.storeName = input.nextLine();		
		
		System.out.print("Enter Year Established: ");
		this.yearEstablished = input.nextInt();
		
		System.out.print("Enter Contact Number: ");
		this.PhoneNum = input.next();

		PreparedFoodShopInfo(storeName,yearEstablished,PhoneNum);
	}
	
	public PreparedFoodShop(String storeName) {//1.4 Constructor with one arguments	
		System.out.print("Enter Year Established: ");
		this.yearEstablished = input.nextInt();
		
		System.out.print("Enter Contact Number: ");
		this.PhoneNum = input.next();
		
		PreparedFoodShopInfo(storeName,yearEstablished,PhoneNum);
	}
	
	public PreparedFoodShop(String storeName, int yearEstablished) {//1.4 Constructor with two arguments
		System.out.print("Enter Contact Number: ");
		this.PhoneNum = input.next();
		
		PreparedFoodShopInfo(storeName,yearEstablished,PhoneNum);
		
	}
	
	public PreparedFoodShop(String storeName, int yearEstablished,String PhoneNum) {//1.4 Constructor with arguments
		this.storeName = storeName;
		this.yearEstablished = yearEstablished;
		this.PhoneNum = PhoneNum;
		System.out.println("Name of our Grocery Store is " + storeName + " and it was established in " 
				+ yearEstablished + " year. Our contact number is " + PhoneNum + ".");
	}	
	
	void PreparedFoodShopInfo(String storeName, int yearEstablished, String PhoneNum) {
		System.out.println("Name of our Grocery Store is " + storeName + " and it was established in " 
				+ yearEstablished + " year. Our contact number is " + PhoneNum + ".");
	}
}
