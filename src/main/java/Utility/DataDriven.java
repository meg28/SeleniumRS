package Utility;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven {

	public static Object[][] testData(String xlFilePath, String sheetName) throws IOException {
		// TODO Auto-generated method stub

		FileInputStream fs = new FileInputStream(xlFilePath);


		XSSFWorkbook wb = new XSSFWorkbook(fs);

		XSSFSheet xs = wb.getSheet(sheetName);
		DataFormatter formatter = new DataFormatter();

		int rows = xs.getPhysicalNumberOfRows(); //3
		int col = xs.getRow(1).getPhysicalNumberOfCells(); //5

		Object[][] data = new Object[rows][col]; // 3/5

		for (int i = 1; i < rows; i++) {
			for (int j = 0; j < col; j++) {

				XSSFCell cell = xs.getRow(i).getCell(j);
				
				data[i][j] = formatter.formatCellValue(cell);
				
			}

		}

		wb.close();
		return data;

	}

}
