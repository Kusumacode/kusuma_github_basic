package Assign187_2Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Testcase1 extends BM_Launch_AM_Quit
{
	@Test
	public void categories()
	{
		WebElement cat=driver.findElement(By.id("searchDropdownBox"));
		Select s1=new Select(cat);
		s1.selectByVisibleText("Books");
	}
}
