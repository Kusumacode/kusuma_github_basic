package TestNG_Multipletimes_Testcases;
//WAP using @Test(enabled) in a single class
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNG_enable_Assign_182
{
@Test(enabled=false)
public void testcase1()
{
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://www.google.com");
	driver.manage().window().maximize();
	driver.findElement(By.name("q")).sendKeys("Books");
	driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
}
@Test(priority=1, invocationCount=2)
public void testcase2()
{
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://www.google.com");
	driver.manage().window().maximize();
	driver.findElement(By.name("q")).sendKeys("Books");
	driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
}
@Test
public void add()
{
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://www.google.com");
	driver.manage().window().maximize();
}
}

