package Assignment_101to200;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

//WAP to launch google, type India & select the 5th auto-suggestion
public class Se_162_Auto_suggestion
{
	public static void main(String args[]) throws InterruptedException
	{
	EdgeDriver driver=new EdgeDriver();
	driver.get("http://www.google.com");
	driver.manage().window().maximize();
	WebElement search=driver.findElement(By.id("APjFqb"));
	search.sendKeys("India");
	
	List<WebElement> auto=driver.findElements(By.xpath("div[@class='OBMEnb']/ul/li"));
	Thread.sleep(6000);
	int count=auto.size();
	System.out.println(count);
	auto.get(5).click();
	//auto.get(count-9).click();
	}
}


/*while writing X path for auto suggestion
always start from the grandparents tag name
grandparent is div*/
