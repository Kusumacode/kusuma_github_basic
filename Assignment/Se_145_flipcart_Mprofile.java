package Assignment_101to200;
//WAP to launch flipkart & hoverover login & click on 'my profile'

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Se_145_flipcart_Mprofile
{
	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		//Howerover on Login
		WebElement Flogin=driver.findElement(By.xpath("//span[.='Login']"));
		Actions Fl=new Actions(driver);
		Fl.moveToElement(Flogin).perform();
		Thread.sleep(3000);
		
		//Click on My Profile
		WebElement MyProfile=driver.findElement(By.linkText("My Profile"));
		MyProfile.click();
		
	}

}
