package Assignment_101to200;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/*WAP to search anything in 
https://pharmeasy.in/ & select the 3rd option*/
public class Se_165_Pharmacy 
{
	public static void main(String[] args) throws InterruptedException 
	{
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://pharmeasy.in/");
	driver.manage().window().maximize();
	
	Thread.sleep(3000);
	WebElement search=driver.findElement(By.xpath("//div[@class='c-PJLV c-bXbWpx c-bXbWpx-joLzpF-justify-center c-bXbWpx-joJbDg-align-center c-bXbWpx-igmEmyC-css']"));
	search.click();
	WebElement Phsearch=driver.findElement(By.id("topBarInput"));
	Phsearch.sendKeys("Soaps");
	List<WebElement> auto3=driver.findElements(By.xpath("//div[@class='c-PJLV c-bXbWpx c-bXbWpx-bZJlhX-direction-column c-bXbWpx-idIeDmn-css']"));
	for (int i=0;i<auto3.size();i++)
	{
		WebElement w1=auto3.get(i);
		System.out.println(w1.getText());
	}
	}
}

/*int count3=auto3.size();
auto3.get(1).click();
System.out.println(count3);*/

