package stevejobs;

import java.util.Scanner;

public class Scannerclass {

	public static void main(String[] args) {
		//Scanner Class in java
		int a , b , sum;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1 st number");
		a=sc.nextInt();
		System.out.println("Enter 2 nd number");
		b=sc.nextInt();
		sc.close();
		sum=a*b;
		System.out.println("Sum of these numbers:"+sum);

	}

}
