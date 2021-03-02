package stevejobs;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=25;
		int y=35;
		System.out.println("Before Swapping x = "+x+"and y="+y);
		x = x + y;
		 
		y = x - y;
		 
		x = x - y;
		 
		System.out.println("After swapping x = " + x + " and y = " + y);

	}

}
