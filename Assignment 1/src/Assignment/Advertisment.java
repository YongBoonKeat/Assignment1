package Assignment;
import java.util.Scanner;
public class Advertisment {//1.3 User Define Class
	//1.2 Pre-define class
	double voucher,discount;
	
	Scanner input = new Scanner(System.in);
	public Advertisment() {//1.4 Constructor with non-argument
		System.out.print("Enter Discount: ");
		this.discount = input.nextDouble();//get discount
		
		System.out.print("Enter Voucher: ");
		this.voucher = input.nextDouble();//get voucher
		System.out.println("=====================================================================================================================");
		System.out.println("\t\t\t\t\t\t\tHot Promotion");
		System.out.println("=====================================================================================================================");
		System.out.println("If you buy more than RM200 can get discount " +discount + "% and Voucher RM" + voucher);
		
	}
	
	public Advertisment(double discount) {//1.4 Constructor with one argument
		System.out.print("Enter Voucher: ");
		this.voucher = input.nextDouble();//get voucher
		System.out.println("=====================================================================================================================");
		System.out.println("\t\t\t\t\t\t\tHot Promotion");
		System.out.println("=====================================================================================================================");
		System.out.println("If you buy more than RM200 can get discount " +discount + "% and Voucher RM" + voucher);
		
	}
	public Advertisment(double discount,double voucher) {//1.4 Constructor with two argument
		this.discount = discount;//discount 3%
		this.voucher = voucher ;//Get voucher RM50
		System.out.println("=====================================================================================================================");
		System.out.println("\t\t\t\t\t\t\tHot Promotion");
		System.out.println("=====================================================================================================================");
		System.out.println("If you buy more than RM200 can get discount " +discount + "% and Voucher RM" + voucher);
		
	}
	
	void SocialMedia(String s1,String s2,String s3) {//Method print
		System.out.println("You can find more information about us on numerous social media platforms, including " 
							+ s1 +", "+ s2 + " and " + s3);
		System.out.println("=====================================================================================================================");
	}
}
