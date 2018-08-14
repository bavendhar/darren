package copy;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Practisexl {

	public static void main(String[] args) throws IOException {
		
		XSSFWorkbook workbook=new XSSFWorkbook("./data/datadata.xlsx");
		XSSFSheet sheetAt = workbook.getSheetAt(0);
		
		int lastRowNum = sheetAt.getLastRowNum();
		System.out.println(lastRowNum);
		int lastCellNum = sheetAt.getRow(0).getLastCellNum();
		System.out.println(lastCellNum);
		
		Object[][] data=new Object[5][5];
		for (int i=1; i<=lastRowNum ; i++) {
		
			XSSFRow row = sheetAt.getRow(i);
			
			for (int j =0; j <lastCellNum; j++) {
				XSSFCell cell = row.getCell(j);
				data[i][j]=cell.getStringCellValue();
				System.out.println(data[i][j]);
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		workbook.close();
		//	return data;
		
		
		
		
		
		
		
		
		
		
		
		
	/*	
		XSSFWorkbook workbook=new XSSFWorkbook("./data/book.xlsx");
		XSSFSheet sheet = workbook.getSheetAt(0);
		int lastRowNum = sheet.getLastRowNum();
		System.out.println(lastRowNum);
		int lastCellNum = sheet.getRow(0).getLastCellNum();
		System.out.println(lastCellNum);
	*/
		
		
		

	}

}
