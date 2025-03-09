package iframe_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;


public class Youtube_subscribe 
	
{
	public static void main(String[] args) throws InterruptedException
	{
		EdgeDriver driver=new EdgeDriver();
		Thread.sleep(3000);
		/* Using i-frame: Using TestNG 
		1. Launch Google
		2. Type"Grotechminds" and press enter button */
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement GTM=driver.findElement(By.id("APjFqb"));
		GTM.sendKeys("GroTechminds");
		GTM.sendKeys(Keys.ENTER);
		
		//3. Click on hamburger button available on right TOP corner(9 dots)
		WebElement hamburger=driver.findElement(By.xpath("//div[@class='gb_C']"));
		hamburger.click();
	
		WebElement icon=driver.findElement(By.name("app"));
		driver.switchTo().frame(icon);
		
		//4. Click on You tube
		WebElement youtube=driver.findElement(By.xpath("//div[@class='LVal7b ']/ul/li[4]"));
		youtube.click();
		
		//5. Search for GroTechminds
		WebElement search1=driver.findElement(By.name("search-query"));
		search1.sendKeys("GroTechMinds");
		search1.sendKeys(Keys.ENTER);
	
		//6. Click on "Subscribe" button of GroTechMinds you tube channel 
		WebElement subscribe=driver.findElement(By.xpath("//div[@class='yt-spec-touch-feedback-shape__fill'][6]"));
		subscribe.click();
}
}
