package Assignment_101to200;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*WAP to launch amazon & click on customer service & 
mobile using link text/partial link text locator*/

public class Se_134_Amazon_ltex_pltex
{
	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		
		//click on customer service using link text locator
		WebElement partialtxcust=driver.findElement(By.partialLinkText("Cust"));
		partialtxcust.click();
		//click on mobile using link text locator
		WebElement partialtxmob=driver.findElement(By.partialLinkText("Mob"));
		partialtxmob.click();
		
		/*click on customer service using linktext locator
		WebElement partialtxcust=driver.findElement(By.partialLinkText("Cust"));
		partialtxcust.click();
		//click on mobliles using linktext locator
		WebElement partialtxmob=driver.findElement(By.partialLinkText("Mob"));
		partialtxmob.click();*/
	}

}
