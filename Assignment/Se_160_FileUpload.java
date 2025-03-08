package Assignment_101to200;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//WAP to handle file upload https://grotechminds.com/registration/
public class Se_160_FileUpload 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get(" https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		WebElement Fname=driver.findElement(By.xpath("//input[@name='fname']"));
		Fname.sendKeys("kusuma");
		Thread.sleep(2000);
		WebElement Lname=driver.findElement(By.xpath("//input[@name='lname']"));
		Lname.sendKeys("k");
		Thread.sleep(2000);
		WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys("regform@gmail.com");
		Thread.sleep(2000);
		WebElement pwd=driver.findElement(By.xpath("//input[@id='password']"));
		pwd.sendKeys("1294wpq");
		Thread.sleep(2000);
		WebElement female=driver.findElement(By.xpath("//input[@id='Female']"));
		female.click();
		Thread.sleep(2000);
		WebElement skill=driver.findElement(By.xpath("//select[@id='Skills']"));
		skill.sendKeys(Keys.ARROW_DOWN);
		skill.sendKeys(Keys.ARROW_DOWN);
		skill.click();
		Thread.sleep(2000);
		WebElement country=driver.findElement(By.xpath("//select[id='Country']"));
		for(int i=0;i<=8;i++)
		{
			country.sendKeys(Keys.ARROW_DOWN);
		}
		WebElement tocountry=driver.findElement(By.xpath("//option[value='India']"));
		tocountry.click();
		
		WebElement present=driver.findElement(By.id("Present-Address"));
		present.sendKeys("Bengaluru");
		present.sendKeys(Keys.CONTROL+"a");
		present.sendKeys(Keys.CONTROL+"c");
		WebElement parmanent=driver.findElement(By.id("Permanent-Address"));
		parmanent.sendKeys(Keys.CONTROL+"v");
		WebElement pincode=driver.findElement(By.id("Pincode"));
		pincode.sendKeys("580009");
		WebElement rel=driver.findElement(By.xpath("//option[@id='Relegion']"));
		rel.sendKeys(Keys.ARROW_DOWN);
		rel.click();
		WebElement relocate=driver.findElement(By.xpath("//input[@id='relocate']"));
		relocate.click();	
		WebElement choosefile=driver.findElement(By.xpath("//input[@id='file']"));
		choosefile.sendKeys("E:\\Administrator\\Desktop\\Pic 1.jpg");
		WebElement sub=driver.findElement(By.xpath("//button[@type='submit']"));
		sub.click();
	}

}
