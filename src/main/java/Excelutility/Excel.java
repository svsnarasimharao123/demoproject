package Excelutility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Excel {
	public  String excel_username(int a) throws IOException {
		  
		  FileInputStream fil = new FileInputStream(new File("D:\\adh\\Project\\src\\test\\resources\\Testdata\\Book2.xlsx"));
		  XSSFWorkbook workbook = new XSSFWorkbook(fil);
		  XSSFSheet sheet=workbook.getSheet("Sheet1");
			  String un=sheet.getRow(a).getCell(0).getStringCellValue();
			  
            
		return un;
}
	public  String excel_password(int b) throws IOException {
		  
		  FileInputStream fil = new FileInputStream(new File("D:\\adh\\Project\\src\\test\\resources\\Testdata\\Book2.xlsx"));
		  XSSFWorkbook workbook = new XSSFWorkbook(fil);
		  XSSFSheet sheet=workbook.getSheet("Sheet1");
		  String pwd=sheet.getRow(b).getCell(1).getStringCellValue();
		  
          
		return pwd;
}
}





