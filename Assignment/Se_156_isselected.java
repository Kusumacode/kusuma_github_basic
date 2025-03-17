package Assignment_101to200;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//WAP to check whether radio button is selected or not https://grotechminds.com/is-selected/
public class Se_156_isselected 
{
	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/is-selected/");
		driver.manage().window().maximize();
		WebElement radio=driver.findElement(By.xpath("//input[@id='Female']"));
		radio.click();
		boolean rbutton=radio.isSelected();
		System.out.println(rbutton);
	}

}
