package Assignment_101to200;
//WAP to automate https://grotechminds.com/registration/
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Se_137_GTM_reg
{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/registeration-form/");
		driver.manage().window().maximize();
		
		WebElement Firstname=driver.findElement(By.xpath("//input[@name='firstName']"));
		Firstname.sendKeys("kusuma");
		
		WebElement Lastname=driver.findElement(By.xpath("//input[@name='lastName']"));
		Lastname.sendKeys("k");
		
		WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys("kusumak206@gmail.com");
		
		WebElement mobno=driver.findElement(By.xpath("//input[@pattern='[0-9]{10}']"));
		mobno.sendKeys("9012344321");
		
		WebElement aadhar=driver.findElement(By.xpath("//input[@pattern='[0-9]{12}']"));
		aadhar.sendKeys("901234431121");
		
		WebElement pan=driver.findElement(By.xpath("//input[@pattern='[A-Z]{5}[0-9]{4}[A-Z]{1}']"));
		pan.sendKeys("AAAPZ1234C");
		Thread.sleep(3000);
		
		WebElement TndC=driver.findElement(By.xpath("//input[@type='checkbox']"));
		TndC.click();
		
		WebElement submit=driver.findElement(By.name("Submit"));
		submit.click();
		
		Thread.sleep(3000);
		driver.close();
	}

}
