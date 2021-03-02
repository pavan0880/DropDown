package stevejobs;

import java.io.File;
import java.io.FileInputStream;


import org.apache.poi.ss.usermodel.WorkbookFactory;

import jxl.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		File f=new File("F:\\pavan.xlsx");
		FileInputStream file=new FileInputStream(f);
		XSSFWorkbook wbks = new XSSFWorkbook(f);
		org.apache.poi.ss.usermodel.Workbook wb= WorkbookFactory.create(file);
		
		Sheet sh=(Sheet) wb.getSheet("Sheet1");
		
		int rowcount=sh.getRows();
		System.out.println(rowcount);
		for (int i=1; i<rowcount; i++) {
			String empid=sh.getCell(0,i).getContents();
			String name=sh.getCell(1,i).getContents();
			String num=sh.getCell(2,i).getContents();
			String email=sh.getCell(3,i).getContents();
			System.out.println(empid);
			System.out.println(name);
			System.out.println(num);
			System.out.println(email);
			
		}

	}

}
