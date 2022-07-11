package CurrentReferance;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ParametrizationClass {

public static String getData(String SheetName , int row,int cell) throws EncryptedDocumentException, IOException {
		
		FileInputStream file=new FileInputStream("C:\\Users\\Prashish Ingole\\OneDrive\\Desktop\\Parametrize.xlsx");
		String value =WorkbookFactory.create(file).getSheet(SheetName).getRow(row).getCell(cell).getStringCellValue();
		System.out.println(value);
		return value;
  }                                                                   
}
