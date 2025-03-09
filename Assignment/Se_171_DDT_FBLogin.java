package Assignment_101to200;
//WAP to login to face book using DDT concept

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Se_171_DDT_FBLogin
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
	
	//Object of the FileInputStream
			FileInputStream f1=new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\Assignments\\DDT25\\Data1.xlsx");
			
			//Step 1
			Workbook w1=WorkbookFactory.create(f1);	
			String un=w1.getSheet("login").getRow(0).getCell(0).getStringCellValue();
			String pwd=w1.getSheet("login").getRow(0).getCell(1).getStringCellValue();
					
			ChromeDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			
			WebElement email_id = driver.findElement(By.xpath("//input[@id='email']"));
			email_id.sendKeys(un);
			WebElement password = driver.findElement(By.xpath("//input[@id='pass']"));
			password.sendKeys(pwd);
			WebElement login = driver.findElement(By.xpath("//button[@name='login']"));
			login.click();
}
}