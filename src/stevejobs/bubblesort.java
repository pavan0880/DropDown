package stevejobs;

import java.util.Arrays;


public class bubblesort {
	static void bubblesort (int [] array) {
		for (int i=0; i<array.length; i++) {
			for(int j=0; j<array.length;j++) {
				if(array[j]<array[j-1]) {
					int temp = array [j];
							array[j]=array[j-1];
								array[j-1]=temp;
								
				}
			}
		}
	}
    public static void main(String[] args) {
	int [] number= {8,12,14,27,1,6,9,10,28,16,14};
	bubblesort(number);
	System.out.println(Arrays.toString(number));
	
	
}

}
