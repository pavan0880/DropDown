package stevejobs;

import java.util.Scanner;

public class Test34 
{
	public static void main(String[] args)
	{
		//Take  a number from key board 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int x=sc.nextInt();
		//Multiply with 10
		int y=x<<2;
		System.out.println(y);
		sc.close();
		
	}

}
