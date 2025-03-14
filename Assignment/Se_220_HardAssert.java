package Assignment_201to224;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.asserts.Assertion;

//WAP using HardAssert in main method
public class Se_220_HardAssert 
{
	public static void main(String[] args) 
	{
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		WebElement w1 = driver.findElement(By.id("twotabsearchtextbox"));
		w1.sendKeys("shoes"+Keys.ENTER);
		
		List<WebElement> f1=driver.findElements(By.xpath("//div[@class='a-section aok-relative s-image-tall-aspect']"));
		
		//HardAssert		
		Assertion a1=new Assertion();
		a1.assertTrue(f1.size()>1);
	}

}
