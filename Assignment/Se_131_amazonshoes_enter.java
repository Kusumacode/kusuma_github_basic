package Assignment_101to200;
//WAP to launch amazon & type shoes & press enter

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Se_131_amazonshoes_enter
{
	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.findElement(By.name("field-keywords")).sendKeys("Formal Shoes");
		driver.findElement(By.name("field-keywords")).sendKeys(Keys.ENTER);
		//driver.close();
	}

}
