package stevejobs;

public class Fibonacciseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0 , b=1 , num;
		System.out.print(a+" "+b);
		for (int i=1;i<=10;i++) {
			num =a+b;
			System.out.print(" "+num);
			a=b;
			b=num;
			
			
		}

	}

}
