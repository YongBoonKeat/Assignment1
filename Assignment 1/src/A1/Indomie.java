package A1;

public class Indomie extends PackagedFood{
	String brand,flavour;
	int quantity;
	double price;
	double discount;

	public Indomie(String type,String item,String brand, String flavour,int quantity,double price) {//Constructor with argument
		super(type,item);
		this.brand = brand;
		this.flavour =flavour;
		this.quantity = quantity;
		this.price = price;
	}
	
	void printDetails(){//Methods		
		System.out.println("Item\t\t\t: "+ brand + " " + flavour);
		System.out.println("Quantity\t\t: " + quantity + "units");
		System.out.println("Price\t\t\t: RM" + price);
	}
	
	void CalTotalPrice(int d){//Methods	
		double subTotalPrice = quantity*price; 
		double discount=(subTotalPrice*d/100);
		double totalprice= subTotalPrice-discount;
		System.out.println("Subtotal Price\t\t: " + subTotalPrice);
		System.out.println("Discount\t\t: " + d + "%");
		System.out.println("Savings\t\t\t: RM" + discount);
		System.out.println("Total Price\t\t: RM" + totalprice);
	}
	
	void CalTotalWeight(double weight){//Methods	
		int pack = 5;//How many pack in one unit,it is 5 pack
		double weightPerUnits = pack * weight;//1 unit have 5 pack and 1 pack is 80gram so the net weight 1units is 400g 
		double totalweight = quantity*weightPerUnits;//How many units buy and calculate the total weight
		System.out.println("Weight per packs\t: " + weight + "g");
		System.out.println("Net weight per units\t: " + weightPerUnits + "g");
		System.out.println("Total Weight\t\t: " + totalweight + "g");
	}	
}
