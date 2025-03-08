package Assignment_101to200;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

//WAP to take a screenshot of any Web site
public class Se_161_Screenshot
{
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		/*TakesScreenshot SS=driver;
		File source=SS.getScreenshotAs(OutputType.FILE);
		File destination=new File("E:\\Kusuma Java Selenium\\ScreenshotFolder\\amazon.png");
		FileHandler.copy(source, destination);	*/
		
		TakesScreenshot SS=driver;
		File source=SS.getScreenshotAs(OutputType.FILE);
		File destination=new File("E:\\Kusuma Java Selenium\\ScreenshotFolder\\kusuma"+Math.random()+".png");
		FileHandler.copy(source, destination);
		
	}

}
