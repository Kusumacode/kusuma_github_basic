package Assignment_101to200;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//WAP to launch amazon, search shoes then select 5th option
public class Se_155_select5th_option
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();	
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement f1= driver.findElement(By.name("field-keywords"));
		f1.sendKeys("Shoes");
		Thread.sleep(3000);
		f1.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(3000);
		f1.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(3000);
		f1.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(3000);
		f1.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(3000);
		f1.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(3000);
		f1.sendKeys(Keys.ENTER);
		
		Thread.sleep(3000);
		driver.close();
	}

}
