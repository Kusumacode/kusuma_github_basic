package Assignment_101to200;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//WAP to launch google & double-click on gmail
public class Se_148_doubleclick
{
	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		//launch google
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		
		//double-click on Gmail
		WebElement gmail=driver.findElement(By.linkText("Gmail"));
		Actions doclick=new Actions(driver);
		doclick.doubleClick(gmail).perform();
		
		Thread.sleep(7000);
		driver.close();
	}
}
