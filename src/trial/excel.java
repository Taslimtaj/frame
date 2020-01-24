package trial;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excel 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		File ff=new File("./Data/Input.xlsx");
		FileInputStream fis=new FileInputStream(ff);
		
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet("TC01");
		Row rc=sh.getRow(1);
		Cell cc=rc.getCell(0);
		String data = cc.toString();
		System.out.println(data);
	}

}
