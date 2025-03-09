package Assignment_101to200;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

//WAP to fetch user name, password from excel sheet
public class Se_169_DDT_fetch
{
public static void main(String[] args) throws EncryptedDocumentException, IOException 
{
	//Object of the FileInputStream
	FileInputStream f1=new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\Assignments\\DDT25\\Data1.xlsx");
	
	//Step 1
	Workbook w1=WorkbookFactory.create(f1);	
	Sheet s1=w1.getSheet("login");
	Row r1=s1.getRow(0);
	Cell c1=r1.getCell(0);	
	String un=c1.getStringCellValue();
	
	Sheet s2=w1.getSheet("login");
	Row r2=s2.getRow(0);
	Cell c2=r2.getCell(1);	
	String pwd=c2.getStringCellValue();

}
}
