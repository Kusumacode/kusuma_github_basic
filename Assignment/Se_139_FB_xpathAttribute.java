package Assignment_101to200;
//WAP to login to face book using x-path by Attribute
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Se_139_FB_xpathAttribute
{
	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement email_id = driver.findElement(By.xpath("//input[@id='email']"));
		email_id.sendKeys("kusumak206@gmail.com");
		WebElement password = driver.findElement(By.xpath("//input[@id='pass']"));
		password.sendKeys("q38wiw");
		WebElement login = driver.findElement(By.xpath("//button[@name='login']"));
		login.click();
		
		/*For Forgot Password
		WebElement ForPas=driver.findElement(By.linkText("Forgotten password?"));
		ForPas.click();*/
	}
}
