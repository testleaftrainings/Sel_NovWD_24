package testcases;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static String[][] readData(String fileName) throws IOException {
		// To Open the workbook
		XSSFWorkbook wb=new XSSFWorkbook("./Data/"+fileName+".xlsx");
		
		//Enter the Corresponding Worksheet
		XSSFSheet ws = wb.getSheet("Sheet1");
		
		//To count the row excluding header
		int rowCount = ws.getLastRowNum();
		System.out.println("Row count is: "+rowCount);
		
		//To Count the row including header
		int physicalNumberOfRows = ws.getPhysicalNumberOfRows();
		System.out.println("Including header is: "+physicalNumberOfRows);
		
		//To count the number of columns
		int columnCount = ws.getRow(0).getLastCellNum();
		System.out.println("Column count is: "+columnCount);
		
		//To retrieve value in a single cell
		String row1col1Data = ws.getRow(1).getCell(1).getStringCellValue();
		System.out.println("Data is: "+row1col1Data);
		
		//Declare String
		String[][] data=new String[rowCount][columnCount];
		
		//To retrieve the entire value
		for (int i = 1; i <= rowCount; i++) {
			XSSFRow row = ws.getRow(i);
			for (int j = 0; j < columnCount; j++) {
				String allData = row.getCell(j).getStringCellValue();
				System.out.println("All data are: "+allData);
				data[i-1][j]=allData;
			
			}
			
		}
		wb.close();
		return data;
	

	}

}
