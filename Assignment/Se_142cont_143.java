package Assignment_101to200;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//Continue Assignment 142 after selecting books, search for book & press enter
public class Se_142cont_143 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement sDB=driver.findElement(By.id("searchDropdownBox"));
		
		Select sel=new Select(sDB);
		sel.selectByVisibleText("Books");
		WebElement Sbook=driver.findElement(By.name("field-keywords"));
		Sbook.sendKeys("Automic Habit");
		WebElement Sbook1=driver.findElement(By.name("field-keywords"));
		Sbook1.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		driver.close();
	}

}
