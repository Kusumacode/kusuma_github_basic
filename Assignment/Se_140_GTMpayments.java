package Assignment_101to200;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//WAP to automate https://grotechminds.com/payments/using Xpath by Attribute
public class Se_140_GTMpayments
{

	public static void main(String[] args) throws InterruptedException 
	{
			ChromeDriver driver=new ChromeDriver();
			driver.get("https://grotechminds.com/payments/");
			driver.manage().window().maximize();
			
			WebElement cardno=driver.findElement(By.xpath("//input[@name='cardNumber']"));	
			cardno.sendKeys("374245455400126");
			
			WebElement expirydt=driver.findElement(By.xpath("//input[@placeholder='MM/YYYY']"));	
			expirydt.sendKeys("05/2026");
			
			WebElement cvv=driver.findElement(By.xpath("//input[@maxlength='3']"));	
			cvv.sendKeys("05/2026");
			
			WebElement amt=driver.findElement(By.xpath("//input[@id='amount']"));	
			amt.sendKeys("0.01");
					
			WebElement savecard=driver.findElement(By.xpath("//input[@name='saveCard']"));	
			savecard.click();
			
			WebElement mpay=driver.findElement(By.xpath("//input[@value='Make Payment']"));	
			mpay.click();
			
			Thread.sleep(3000);
			driver.close();
				 
	}

}
