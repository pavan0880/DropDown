package stevejobs;

public class Splitmethods {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		/*String str = "IamLucky"; 
        String[] arrOfStr = str.split(""); 
  
        for (String a : arrOfStr) 
            System.out.println(a);*/
		String s1="I AM PAVAN";  
		
		for(String w:s1.split("\\s",0)){  
		System.out.println(w);  
        

	}

}
}