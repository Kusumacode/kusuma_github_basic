package Assignment_101to200; 
/*WAP to launch google & click on G-mail using 
link text/partial link text locator*/

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Se_133_google_ltex_pltex
{
	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		WebElement gmail_link=driver.findElement(By.linkText("Gmail"));
		//It should have complete link text
		
		//WebElement gmail_link=driver.findElement(By.partialLinkText("Gm"));
		//It needs to have partials of link text first or last texts
		
		gmail_link.click();
	}

}
