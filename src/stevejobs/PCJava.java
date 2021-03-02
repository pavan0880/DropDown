package stevejobs;

public class PCJava {

	
		// TODO Auto-generated method stub
		
			  
		    // Function to print all the distinct 
		    // permutations of str 
		    static void printDistinctPermutn(String str,  
		                                     String ans) 
		    { 
		  
		        // If string is empty 
		        if (str.length() == 0) { 
		  
		            // print ans 
		            System.out.print(ans + " "); 
		            return; 
		        } 
		  
		        // Make a boolean array of size '26' which 
		        // stores false by default and make true  
		        // at the position which alphabet is being 
		        // used 
		        boolean alpha[] = new boolean[26]; 
		  
		        for (int j = 0; j < str.length(); j++) { 
		  
		            // ith character of str 
		            char ch = str.charAt(j); 
		  
		            // Rest of the string after excluding  
		            // the ith character 
		            String ros = str.substring(0, j) +  
		                         str.substring(j + 1); 
		  
		            // If the character has not been used  
		            // then recursive call will take place.  
		            // Otherwise, there will be no recursive 
		            // call 
		            if (alpha[ch - 'A'] == false) 
		                printDistinctPermutn(ros, ans + ch); 
		            alpha[ch - 'A'] = true; 
		        } 
		    } 
		  
		    // Driver code 
		    public static void main(String[] args) 
		    { 
		        String s = "PAVAN"; 
		        printDistinctPermutn(s, ""); 
		        System.out.println(s);
		    } 
		

	

}
