package Assignment_201to224;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class headless_mode {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeOptions options=new ChromeOptions();
    	options.addArguments("--headless");
    	WebDriver driver=new ChromeDriver(options);
    	
    	driver.get("http://www.google.com");
		driver.manage().window().maximize();
		WebElement g1=driver.findElement(By.id("APjFqb"));
		g1.sendKeys("india");
			
		List<WebElement> g2=driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));
		System.out.println(g2.size());		
			
		for(int i=0;i<g2.size();i++)
		{
			WebElement g3=g2.get(i);
			System.out.println(g3.getText());	
		}
	}

}


