package Assignment_101to200;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*WAP to launch amazon, select books from the drop down 
 menu then search for power using Keys function*/

public class Se_152_KeysFuns
{
	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement sDB=driver.findElement(By.id("searchDropdownBox"));
		for(int i=1;i<=10;i++)
		{
			//Thread.sleep(500);
			sDB.sendKeys(Keys.ARROW_DOWN);
		}
		WebElement tobook=driver.findElement(By.id("twotabsearchtextbox"));
		tobook.sendKeys("power");
		tobook.sendKeys(Keys.ENTER);
		
	}
}
