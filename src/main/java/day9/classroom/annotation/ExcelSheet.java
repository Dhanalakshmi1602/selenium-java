package day9.classroom.annotation;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelSheet {

	public String[][] readExcel(String filename) throws IOException {
		XSSFWorkbook excel = new XSSFWorkbook("./data/" + filename + ".xlsx");
		XSSFSheet sheet = excel.getSheetAt(0);
		int rowcount = sheet.getLastRowNum();
		System.out.println(rowcount);
		short colcount = sheet.getRow(0).getLastCellNum();
		String[][] data = new String[rowcount][colcount];
		System.out.println(colcount);
		for(int i=1; i<=rowcount; i++)
		{
			XSSFRow row = sheet.getRow(i);
			for(int j=0 ; j<colcount ; j++)
			{
				XSSFCell cell = row.getCell(j);
				String value = cell.getStringCellValue();
				data[i-1][j] = value;
				System.out.print(value +" ");
								
			}
			System.out.println();
			
		}
		
return data;
	}

}
