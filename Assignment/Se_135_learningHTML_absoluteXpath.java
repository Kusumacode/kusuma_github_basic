package Assignment_101to200;

/*WAP to automate the user name, hint, password, your first name, 
boy,girl,baby, male&female relocate & click to know fields in learningHTML1 link*/

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Se_135_learningHTML_absoluteXpath
{

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/LENOVO/Desktop/learningHTML1.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement Username=driver.findElement(By.xpath("(/html/body/input)[1]"));
		Username.sendKeys("Kusuma");
		Thread.sleep(3000);
		
		WebElement hint=driver.findElement(By.xpath("(/html/body/input)[2]"));
		hint.sendKeys("hello");
		Thread.sleep(3000);
		
		WebElement pwd=driver.findElement(By.xpath("(/html/body/input)[3]"));
		pwd.sendKeys("hello123");
		Thread.sleep(3000);
		
		WebElement Fname=driver.findElement(By.xpath("(/html/body/form/input)[1]"));
		Fname.sendKeys("K");
		Thread.sleep(3000);
		
		WebElement Boy=driver.findElement(By.xpath("(/html/body/form/input)[4]"));
		Boy.click();
		Thread.sleep(3000);
		
		WebElement Girl=driver.findElement(By.xpath("(/html/body/form/input)[5]"));
		Girl.click();
		Thread.sleep(3000);
		
		WebElement Baby=driver.findElement(By.xpath("(/html/body/form/input)[6]"));
		Baby.click();
		Thread.sleep(3000); 
		
		WebElement Male=driver.findElement(By.xpath("(/html/body/input)[4]"));
		Male.click();
		Thread.sleep(3000);
		
		WebElement Female=driver.findElement(By.xpath("(/html/body/input)[5]"));
		Female.click();
		Thread.sleep(3000);
				
		WebElement relocate=driver.findElement(By.xpath("(/html/body/input)[6]"));
		relocate.click();
		Thread.sleep(3000);
		
		WebElement Aboutus=driver.findElement(By.xpath("(/html/body/a)")); //linktext
		Aboutus.click();
		Thread.sleep(3000);
		
	}

}
