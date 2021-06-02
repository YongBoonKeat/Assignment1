package A1;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		
		System.out.println("*********************Prepare Food*********************");
		System.out.println("1.Package Food");
		System.out.println("2.Frozen Food");
		System.out.println("Please Enter Your Choice:");
		Scanner input = new Scanner(System.in);
		int choice = input.nextInt();
		
if(choice==1) {
			System.out.println("1.Package Food");
			System.out.println("********************Instant noodles********************");
			System.out.println("1.Maggi");
			System.out.println("2.Mamee");
			System.out.println("3.Indomie");
			System.out.println("Please Enter Your Choice:");
			Scanner input1 = new Scanner(System.in);
			int noodle = input.nextInt();
			
			if(noodle==1) {
				Maggi M = new Maggi("Package Food","Instant noodles","Maggi Cintan","Curry",5,3.5);
				M.printIngredients();
				M.printProcess();
				System.out.println("====================Details of Product====================");
				M.printDetails();
				M.CalTotalPrice(5);
				M.CalTotalWeight(80);
				System.out.println("==========================================================");
				System.out.println("");	
			}
			else if(noodle==2) {
				Mamee MC = new Mamee("Package Food","Instant noodles","Mamee Chef","Spicy",5,6.5);
				MC.printIngredients();
				MC.printProcess();
				System.out.println("====================Details of Product====================");
				MC.printDetails();
				MC.CalTotalPrice(3);
				MC.CalTotalWeight(100);
				System.out.println("==========================================================");
				System.out.println("");	
			}
			else if(noodle==3) {
				Indomie I = new Indomie("Package Food","Instant noodles","Indomie","Chicken",5,4.5);
				I.printIngredients();
				I.printProcess();
				System.out.println("====================Details of Product====================");
				I.printDetails();
				I.CalTotalPrice(3);
				I.CalTotalWeight(100);
				System.out.println("==========================================================");
				System.out.println("");
			}
			else {
				
			}
		}	

else if(choice==2) {
	    	System.out.println("2.Frozen Food");
	    	System.out.println("********************Frozen Food********************");
			System.out.println("1.Frozen Meat");
			System.out.println("2.Frozen Fish");
			System.out.println("Please Enter Your Choice:");
			Scanner input1 = new Scanner(System.in);
			int product = input.nextInt();
			if(product==1) {
				Chicken C = new Chicken("Frozen Meat","Red Hot Crispy Fried Chicken","Ayamas",5,13.3); 
				System.out.println("====================Details of Product====================");
				C.printDetails();
				C.CalTotalPrice(5);
				C.CalTotalWeight(850);
				System.out.println("==========================================================");
				System.out.println("");	
			}
			else if(product==2) {
				Fish F = new Fish("Frozen Fish","Fried Fish Ball","Figo",5,16.5);
				System.out.println("====================Details of Product====================");
				F.printDetails();
				F.CalTotalPrice(3);
				F.CalTotalWeight(1000);
				System.out.println("==========================================================");
				System.out.println("");	
			}
			else {
				System.out.print("Exit");
			}
}
else{
	 System.out.print("Exit!!!");

}
}
}