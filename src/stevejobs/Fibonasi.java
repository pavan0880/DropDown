package stevejobs;

public class Fibonasi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=0,n2=1,n3,i,count=10;
		System.out.println(n1+" "+n2);//Printing 0 to 1
		for (i=2;i<count;i++) {
			n3=n1+n2;
			System.out.println(" "+n3);
			n1=n2;
			n2=n3;
			
		}
		 
		
		

	}
}


