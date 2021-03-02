package stevejobs;

public class Print1to100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numbers=1;
		printNumbers(numbers);
	}
	public static void printNumbers(int num)
	{
		if (num<=100) {
			System.out.print(num+" ");
			printNumbers(num+1);
		}
		

	}

}
