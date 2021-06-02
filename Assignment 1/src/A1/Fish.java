package A1;

public class Fish extends FrozenFood{
	String brand;
	int quantity;
	double price;
	double discount;

	public Fish(String type,String item,String brand,int quantity,double price) {//Constructor with argument
		super(type,item);
		this.brand = brand;
		this.quantity = quantity;
		this.price = price;
	}
	
	void printDetails(){//Methods to print details
		System.out.println("Brand\t\t\t: "+ brand);
		System.out.println("Item\t\t\t: "+ item);
		System.out.println("Quantity\t\t: " + quantity + "units");
		System.out.println("Price\t\t\t: RM" + price);
	}
	
	void CalTotalPrice(int d){//Methods	to calculate total price
		double subTotalPrice = quantity*price; //SubTotal price
		double discount=(subTotalPrice*d/100);//Get discount
		double totalprice= subTotalPrice-discount;//Total price after discount
		System.out.println("Subtotal Price\t\t: " + subTotalPrice);
		System.out.println("Discount\t\t: " + d + "%");
		System.out.println("Savings\t\t\t: RM" + discount);
		System.out.println("Total Price\t\t: RM" + totalprice);
	}
	
	void CalTotalWeight(double weight){//Methods to calculate total weight
		double totalweight = quantity * weight; 
		System.out.println("Weight per units\t: " + weight + "g");
		System.out.println("Total Weight\t\t: " + totalweight + "g");
	}	
}
