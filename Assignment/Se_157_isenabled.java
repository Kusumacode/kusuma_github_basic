package Assignment_101to200;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*WAP to launch google, then click on G-mail 
only when it is enabled & displayed*/


public class Se_157_isenabled {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.Google.com/");
		driver.manage().window().maximize();
		
		WebElement gmail=driver.findElement(By.linkText("Gmail"));
		boolean link=gmail.isEnabled();
		gmail.click();
		
		System.out.println(link);
		
		

	}

}
