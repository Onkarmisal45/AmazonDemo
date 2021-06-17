package util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
//import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtil {

	static public Object[][] readDataFromExcel(String sheetName)
	{
		File file =new File("src/test/resources/testdata/NewExcelFile.xlsx");
		Object[][] obj=null;
		try {
			FileInputStream fis = new FileInputStream(file);
			XSSFWorkbook workBook = new XSSFWorkbook(fis);
			XSSFSheet testdata = workBook.getSheet(sheetName);
			obj = new Object[testdata.getLastRowNum()][];
			for(int i=1; i<=testdata.getLastRowNum(); i++)
			{
				obj[i-1] = new Object[testdata.getRow(i).getPhysicalNumberOfCells()];
				for(int j=0; j<testdata.getRow(i).getPhysicalNumberOfCells(); j++)
				{
					System.out.print(testdata.getRow(1).getCell(j).getStringCellValue());
					obj[i-1][j]=testdata.getRow(1).getCell(j).getStringCellValue();
				}
			}

			workBook.close();
			fis.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return obj;
	}
}
