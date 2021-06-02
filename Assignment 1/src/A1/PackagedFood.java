package A1;

public class  PackagedFood extends Food {
	protected String item;
	protected String typeOfPackaging;
	protected String materialOfPackaging;
	
	public PackagedFood(String type,String item) {
		 super(type);
		 this.item = item;
		 System.out.println("===================Product Decription====================");
		 System.out.println("1." + item + " are one type of package foods in grocery store.");
		 System.out.println("2.Packaged foods are processed foods preserved in different ways.");
		 System.out.println("3.There are two forms of packaged "+ item +" one in a package or in a cup.");
		 System.out.println("4."+item + " products are seal packed; these can be reheated or eaten straight from the packet/container.");
	}
	
		 void printIngredients() {//Main ingredients of Instant noodles
			String a = "wheat flour";
			String b = "palm oil";
			String c = "salt";
			System.out.println("5.The main ingredients used in instant noodles are usually " + a + ","+ b + " and "+ c + ".");
	}
		 void printProcess() {//Step of process instant noodles 
			 System.out.println("=============Step of Process Instant Noodles==============");
				System.out.println("STEP 1.Mixing  >>>" +  " STEP 2.Rolling >>>" + " STEP 3.Slitting >>>" + " STEP 4.Steaming");
				System.out.println("STEP 5.Cutting >>>" + " STEP 6.Frying  >>>" + " STEP 7.Cooling  >>>" + " STEP 8.Packaging");
	}
		 
}	
