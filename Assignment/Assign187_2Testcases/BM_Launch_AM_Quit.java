package Assign187_2Testcases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BM_Launch_AM_Quit 
{
 ChromeDriver driver;
 @BeforeMethod
 public void precondition_launch() 
 {
	 driver=new ChromeDriver();
	 driver.get("https://www.amazon.in");
	 driver.manage().window().maximize();
 }
 @AfterMethod
 public void postexecution_quit() throws InterruptedException
 {
	 Thread.sleep(2000);
	 driver.quit();
	 

 }
}
