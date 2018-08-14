package xlsheet;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcel {
//@Test
	public Object[][] fetchdata(String excelFileName) throws IOException {
		
		XSSFWorkbook wbook=new XSSFWorkbook(excelFileName);
		XSSFSheet sheet = wbook.getSheetAt(0);
		int lastRowNum = sheet.getLastRowNum();
		System.out.println(lastRowNum);
		//get last cell number using the header row=>row(0)
		int lastCellNum = sheet.getRow(0).getLastCellNum();
		System.out.println(lastCellNum);
		Object[][] data =new Object[lastRowNum][lastCellNum];
		//loop through rows
		for (int i = 1; i <=lastRowNum; i++) {
			//get each row
			XSSFRow row = sheet.getRow(i);
			//loop through column

			for (int j = 0; j <lastCellNum; j++) {
				//get each cell
				XSSFCell cell = row.getCell(j);
				//print the value
				//String stringCellValue = cell.getStringCellValue();
				data[i-1][j]=cell.getStringCellValue();
				System.out.println(data[i-1][j]);
			}	
		}

		wbook.close();
	//	return data;
		return data;
	}


}


