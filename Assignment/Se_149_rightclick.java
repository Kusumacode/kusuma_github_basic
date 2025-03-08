package Assignment_101to200;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//WAP to launch google & right-click on G-mail
public class Se_149_rightclick
{
	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		//launch google
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		
		//Right-click on Gmail
		WebElement gmailrc=driver.findElement(By.linkText("Gmail"));
		Actions gRC=new Actions(driver);
		gRC.contextClick(gmailrc).perform();
		
		Thread.sleep(7000);
		driver.close();
		
	}

}
