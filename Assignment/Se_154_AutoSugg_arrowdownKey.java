package Assignment_101to200;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//WAP to launch google, type India, select 4th auto suggestion from drop

public class Se_154_AutoSugg_arrowdownKey
{
	public static void main(String[] args) throws InterruptedException 
	{
	ChromeDriver driver=new ChromeDriver();	
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	
	WebElement txa=driver.findElement(By.name("q"));
	txa.sendKeys("India");
	Thread.sleep(3000);
	txa.sendKeys(Keys.ARROW_DOWN);
	Thread.sleep(3000);
	txa.sendKeys(Keys.ARROW_DOWN);
	Thread.sleep(3000);
	txa.sendKeys(Keys.ARROW_DOWN);
	Thread.sleep(3000);
	txa.sendKeys(Keys.ARROW_DOWN);
	
	Thread.sleep(3000);
	driver.close();
	}
}
