package TestNG_Multipletimes_Testcases;
//WAP using @Test(invocationCount) in a single class
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNG_Invocation_Assign_181 
{
	@Test(invocationCount=10)
	public void testcase1()
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("Books");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}
}

/*Note:@Test(invocationCount=10) should be in camel case
 (camel case: second word first letter should be capital)*/
 