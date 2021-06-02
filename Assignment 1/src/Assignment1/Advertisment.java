package Assignment1;

public class Advertisment {//1.3 User Define Class
	//1.2 Pre-define class
	double voucher,discount;
	
	public Advertisment() {//1.4 Constructor with non-argument
		this.discount = 3;//discount 3%
		this.voucher = 50;//Get voucher RM50
		System.out.println("If you buy more than RM200 can get discount " +discount + "% and free voucher RM" + voucher);
		
	}
	
	public Advertisment(double discount) {//1.4 Constructor with one argument
		this.discount = discount;//discount 3%
		this.voucher = 50;//Get voucher RM50
		System.out.println("If you buy more than RM200 can get discount " +discount + "% and Voucher RM" + voucher);
		
	}
	public Advertisment(double discount,double voucher) {//1.4 Constructor with two argument
		this.discount = discount;//discount 3%
		this.voucher = voucher ;//Get voucher RM50
		System.out.println("If you buy more than RM200 can get discount " +discount + "% and Voucher RM" + voucher);
		
	}
	
	void SocialMedia(String s1,String s2,String s3) {//Method print
		System.out.println("Our grocery also have build a presence on numerous social media platforms, including " 
							+ s1 +", "+ s2 + " and " + s3);
	}
}
