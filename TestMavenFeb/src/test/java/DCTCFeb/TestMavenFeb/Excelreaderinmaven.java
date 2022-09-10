package DCTCFeb.TestMavenFeb;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelreaderinmaven {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Excelreaderinmaven xr=new Excelreaderinmaven();
	   // xr.excel_reader();
	}
	/*public void excel_reader() throws IOException
	{
		//File f=new File("E:\\test cases\\test cases for lift.xlsx");//to select file
		//FileInputStream fin=new FileInputStream(f);//to read file
		XSSFWorkbook workbook=new XSSFWorkbook(fin);//to open workbook
		XSSFSheet sheet = workbook.getSheet("testcases for lift");//to select sheet 
		String tc1=sheet.getRow(1).getCell(0).getStringCellValue();//to select row
		String typeoftc1=sheet.getRow(1).getCell(1).getStringCellValue();//to select column
		System.out.println(tc1+" : "+typeoftc1);
		
		String tc2 = sheet.getRow(9).getCell(0).getStringCellValue();
		//double valueoftc2 = sheet.getRow(9).getCell(1).getNumericCellValue();
		int valueoftc2 = (int)sheet.getRow(9).getCell(1).getNumericCellValue();//getnumeric returns double value therefore we converted to int from double
		System.out.println(tc2+" : "+valueoftc2);//like getstringcellvalue and getnumericcellvalue , getbooleancellvalue is also avilable
	    
		int numberofrows = sheet.getPhysicalNumberOfRows();//jevdya row madhe value ahe tyacha count return karaty
		System.out.println(numberofrows);
		
		int lastrownumber = sheet.getLastRowNum();
		System.out.println(lastrownumber);
		
		int lastcellnumberof3rdrow = sheet.getRow(4).getLastCellNum();
		System.out.println(lastcellnumberof3rdrow);
	
	
	
	}*/
}
