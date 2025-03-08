package Assignment_101to200;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
/*Assignment 146 Continue WAP to revert it back the postman to its original place 
 https://grotechminds.com/drag-and-drop/ */
public class Se_147_draganddrop_revert
{
	public static void main(String[] args) throws InterruptedException
	{
			ChromeDriver driver=new ChromeDriver();
			driver.get("https://grotechminds.com/drag-and-drop/");
			driver.manage().window().maximize();
			
			//Drag cucumber to drop zone
			
			WebElement drag=driver.findElement(By.xpath("(//div[@id='container'])[1]"));
			WebElement drop=driver.findElement(By.xpath("//div[@id='div2']"));
			Actions a1=new Actions(driver); 
			a1.dragAndDrop(drag,drop).perform();  //parameterized
			
			//revert it back the cucumber to its original place
			Thread.sleep(4000);
			Actions a2=new Actions(driver); 
			WebElement drag1=driver.findElement(By.xpath("//div[@id='div2']"));
			WebElement drop1=driver.findElement(By.xpath("(//div[@id='container'])[1]"));
			a2.dragAndDrop(drag1,drop1).perform(); 
			
			Thread.sleep(4000);
			driver.close();
		}
	}

