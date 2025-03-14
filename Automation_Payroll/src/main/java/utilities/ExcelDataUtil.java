package utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.testng.annotations.DataProvider;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ExcelDataUtil extends Base {

	@DataProvider
	public Object[][] readExcel() throws IOException, BiffException {
		FileInputStream f = new FileInputStream("C:\\Users\\vinay\\OneDrive\\Documents\\Excel_Read\\ReadMyExcel.xls");
		Workbook w = Workbook.getWorkbook(f);
		Sheet s = w.getSheet("Sheet1");
		int row = s.getRows();
		int coloumn = s.getColumns();
		System.out.println("row= " + "" + row + "coloumn= " + coloumn);
		String[][] input = new String[row][coloumn];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < coloumn; j++) {
				Cell c = s.getCell(j, i);
				input[i][j] = c.getContents();

			}
		}
		return input;
	}

}
