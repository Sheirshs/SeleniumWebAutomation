package ExcelDataProvider;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class Dataprovider {
	public static String TESTDATA_SHEET_PATH = System.getProperty("user.dir")
			+ "\\src\\test\\resources\\dataexcel.xlsx";

	static Workbook book;
	static Sheet sheet;

	// for getting data from excel sheet
	public static Object[][] getTestData() {
		FileInputStream file = null;
		try {

			file = new FileInputStream(TESTDATA_SHEET_PATH);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {

			book = WorkbookFactory.create(file);

		} catch (IOException e) {
			e.printStackTrace();
		}
		sheet = book.getSheet("Sheet1");
		Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()]; // getting total no of
																								// rows and columns
		// System.out.println(sheet.getLastRowNum());
		// System.out.println(sheet.getRow(0).getLastCellNum());
		for (int i = 0; i < sheet.getLastRowNum(); i++) {
			for (int j = 0; j < sheet.getRow(0).getLastCellNum(); j++) {
				data[i][j] = sheet.getRow(i + 1).getCell(j).toString();
				// System.out.println(data[i][j]);
			}
		}

		return data;
	}

}
