package Assignment_101to200;

import org.openqa.selenium.chrome.ChromeDriver;

//WAP to navigate Backward, forward and Refresh
public class Se_150_navigate
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		//navigate to URL
		driver.navigate().to("https://grotechminds.com/");
		Thread.sleep(3000);
		//navigate Backward
		driver.navigate().back();
		Thread.sleep(3000);
		
		//forward
		Thread.sleep(3000);
		driver.navigate().forward();
				
		//Refresh
		Thread.sleep(3000);
		driver.navigate().refresh();
		
		Thread.sleep(7000);
		driver.close();
	}

}
