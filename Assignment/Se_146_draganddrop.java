package Assignment_101to200;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//WAP to Drag postman to drop zone https://grotechminds.com/drag-and-drop/
public class Se_146_draganddrop
{
	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/drag-and-drop/");
		driver.manage().window().maximize();
		
		//Drag cucumber to drop zone
		Thread.sleep(3000);
		WebElement drag=driver.findElement(By.xpath("(//div[@id='container-6'])"));
		WebElement drop=driver.findElement(By.xpath("//div[@id='div2']"));
		Actions a1=new Actions(driver); 
		a1.dragAndDrop(drag,drop).perform();  //parameterized
		
		driver.close();
		}

}
