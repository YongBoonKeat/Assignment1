package A1;

public class FrozenFood extends Food{
	protected String item;
	
	public FrozenFood(String type,String item) {
		 super(type);
		 this.item = item;
		 System.out.println(item + " are one type of frozen foods in grocery store.");
		 System.out.println(type + "is a food kept frozen until used.");
		 System.out.println("");
	}
	
}
