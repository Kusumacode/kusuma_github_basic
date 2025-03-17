package Assignment_201to224;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Se_216_Scrolling_concept 
{
	@Test
	public void scrolling() 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.amazon.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement s1=driver.findElement(By.linkText("About Us"));
		s1.click();
		Point p1=s1.getLocation();
		int x=p1.getX();
		int y=p1.getY();
		System.out.println(x);
		System.out.println(y);
		//With getLocation method we can find the coordinates of a particular component
		//return type of getLocation is Point*/
	}

}
