package Assign187_2Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Testcase2 extends BM_Launch_AM_Quit
{
	@Test
	public void search()
	{
		WebElement search1=driver.findElement(By.id("twotabsearchtextbox"));
		search1.sendKeys("Automic Habit" +Keys.ENTER);
	}
}
