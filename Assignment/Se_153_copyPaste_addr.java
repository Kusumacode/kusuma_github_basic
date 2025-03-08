package Assignment_101to200;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*WAP to Copy & Paste the Present address to Permanent address 
 https://grotechminds.com/registration/*/
public class Se_153_copyPaste_addr
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		
		WebElement present=driver.findElement(By.id("Present-Address"));
		present.sendKeys("Bengaluru");
		present.sendKeys(Keys.CONTROL+"a");
		present.sendKeys(Keys.CONTROL+"c");
		WebElement parmanent=driver.findElement(By.id("Permanent-Address"));
		parmanent.sendKeys(Keys.CONTROL+"v");
		
		Thread.sleep(5000);
		driver.close();
	}

}
