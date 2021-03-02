package stevejobs;

public class HtmlUnitDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HtmlUnitDriver driver=new HtmlUnitDriver();
		driver.get("http://www.google.co.in");
		String t=driver.getTitle();
		System.out.println(t);
		driver.close();

	}

	private void close() {
		// TODO Auto-generated method stub
		
	}

	private String getTitle() {
		// TODO Auto-generated method stub
		return null;
	}

	private void get(String string) {
		// TODO Auto-generated method stub
		
	}

}
