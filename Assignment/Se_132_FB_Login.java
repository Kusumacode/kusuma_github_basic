package Assignment_101to200;//WAP to login to Facebook with Id and Name locators

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Se_132_FB_Login
{
	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement username=driver.findElement(By.id("email"));
		username.sendKeys("kusumak206@gmail.com");
		WebElement password=driver.findElement(By.id("pass"));
		password.sendKeys("34353");
		WebElement loginbotton=driver.findElement(By.name("login"));
		loginbotton.click();
		
	}

}
