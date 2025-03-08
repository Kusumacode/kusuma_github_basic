package Assignment_101to200;
//WAP to automate https://grotechminds.com/registeration-form/

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Se_136_GTM_regform_relativeXpath
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		
		WebElement Fname=driver.findElement(By.xpath("//input[@name='fname']"));
		Fname.sendKeys("kusuma");
		Thread.sleep(2000);
		WebElement Lname=driver.findElement(By.xpath("//input[@name='lname']"));
		Lname.sendKeys("k");
		Thread.sleep(2000);
		WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys("regform@gmail.com");
		Thread.sleep(2000);
		WebElement pwd=driver.findElement(By.xpath("//input[@id='password']"));
		pwd.sendKeys("1294wpq");
		Thread.sleep(2000);
		WebElement female=driver.findElement(By.xpath("//input[@id='Female']"));
		female.click();
		Thread.sleep(2000);
		WebElement relocate=driver.findElement(By.xpath("//input[@id='relocate']"));
		relocate.click();	
		
		Thread.sleep(5000);
		driver.close();
	}

}
