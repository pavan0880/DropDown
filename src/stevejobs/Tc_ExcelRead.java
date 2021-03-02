package stevejobs;

import java.io.File;
import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;



public class Tc_ExcelRead {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		File f=new File("F:\\pavan.xlsx");
		FileInputStream file=new FileInputStream(f);
		org.apache.poi.ss.usermodel.Workbook wb= WorkbookFactory.create(file);
		Sheet sh=(Sheet) wb.getSheet("Sheet1");
		int nour=sh.getPhysicalNumberOfRows();
		int nouc=sh.getRow(0).getLastCellNum();
		SimpleDateFormat sf=new SimpleDateFormat("dd-MM-yy-hh-mm-ss");
		Date d=new Date();
	Cell c=sh.getRow(0).createCell(nouc);
c.setCellValue(sf.format(d));
	sh.autoSizeColumn(nouc);
	
CellStyle cs=	wb.createCellStyle();
cs.getWrapText();
	
		for(int i=1; i<nouc; i++)
		{
			
		String id=	sh.getRow(i).getCell(0).getStringCellValue();
		String name=sh.getRow(i).getCell(1).getStringCellValue();
		String num=sh.getRow(i).getCell(2).getStringCellValue();
		String mail=sh.getRow(i).getCell(3).getStringCellValue();
		System.out.println(id);
		System.out.println(name);
		System.out.println(num);
		System.out.println(mail);
		}
		
			
			
			
			
			
			
			
			
			
			
			
			
		}
		
		


}
