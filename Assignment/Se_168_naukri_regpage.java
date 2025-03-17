package Assignment_101to200;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*WAP to launch naukri registration page, 
 * click on google then close parent tab window */
public class Se_168_naukri_regpage 
{
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		WebElement naukri=driver.findElement(By.xpath("//button[@class='socialbtn google resman-btn-tertiary resman-btn-medium']"));
		naukri.click();
		
		Set<String> ids=driver.getWindowHandles();
		Iterator<String>id=ids.iterator();
		String parentid=id.next();
		System.out.println(parentid);
		String childid=id.next();
		driver.switchTo().window(childid);
		Thread.sleep(10000);
		driver.close();

	}

}
