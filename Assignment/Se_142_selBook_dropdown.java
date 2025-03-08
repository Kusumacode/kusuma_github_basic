package Assignment_101to200;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//WAP to select books from the drop down in amazon 
public class Se_142_selBook_dropdown
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement sDB=driver.findElement(By.id("searchDropdownBox"));
				
		Select sel=new Select(sDB);
		Thread.sleep(5000);
		sel.selectByVisibleText("Books");
		
		Thread.sleep(5000);
		driver.close();
		
	}

}
