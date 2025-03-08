package Assignment_101to200;
//WAP to Print all options of auto suggestion
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Se_174_Print_Options_AutoSugg 
{
	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
			
		WebElement g1=driver.findElement(By.id("APjFqb"));
		g1.sendKeys("7 wonders");
			
		List<WebElement> g2=driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));
		System.out.println(g2.size());		
			
		for(int i=0;i<g2.size();i++)
		{
			WebElement g3=g2.get(i);
			System.out.println(g3.getText());	
		} 

	}

}
