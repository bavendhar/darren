package testng;

import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class readExcelLogic {
	//@Test
	public Object[][] fetchExcelData(String fileName) throws IOException, InterruptedException { //fetch Data is the data Provider
		XSSFWorkbook wbook = new XSSFWorkbook(fileName);
		System.out.println("Enter Sheet number");
		Thread.sleep(3000);
		Scanner scan = new Scanner(System.in);
		int sheetNum=scan.nextInt();
		XSSFSheet sheet = wbook.getSheetAt(sheetNum); //get sheet 0 ,gets the first sheet
		int lastRowNum = sheet.getLastRowNum(); // get last row num ignores the header row. 
		int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();//get physical number of rows, counts the header row as well.
		System.out.println("Total Number of Rows including header: " + physicalNumberOfRows);
		System.out.println("Total Number of Rows: " + lastRowNum);

		int lastCellNum = sheet.getRow(0).getLastCellNum(); // to get the number of columns
		System.out.println("Total Number of Columns: " + lastCellNum);

		Object[][] data = new Object[lastRowNum][lastCellNum];

		for(int i=1; i<=lastRowNum; i++) {
			XSSFRow row = sheet.getRow(i);
			for(int j=0; j<lastCellNum;j++) {
				XSSFCell cell = row.getCell(j);
				//	String stringCellValue =cell.getStringCellValue(); //returns the cell value.
				//	System.out.println("Field Values: " + stringCellValue);//for numeric values in the excel sheet, format the cells to string or concatenate 'before the numeric, otherwise error will be thrown.
				data[i-1][j] = cell.getStringCellValue();
				/*if(cell.getCellTypeEnum()==cell.getCellType("String")) {

				}

				data[i-1][j] = cell.getStringCellValue();
				cell.getNumericCellValue();
				cell.getDateCellValue();
				cell.getBooleanCellValue();// for long */

				/*for (int k=1; k<=lastCellNum; k++) {
				if(k==lastCellNum)
				XSSFCell datecell=row.getCell(k);

			}
				Date getDate = datecell.getDateCellValue();*/
			}
		}
		wbook.close(); // close the work book
		scan.close();
		return data;
	}
}


