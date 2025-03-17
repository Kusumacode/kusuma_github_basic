package TestNG_Multipletimes_Testcases;
//WAP using @Test Annotation
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//All annotation in single class
public class TestNG_Annotations_Assign_178 
{
@Test
public void test_case()
{
	System.out.println("TestCase");
}
@BeforeSuite
public void bs()
{
	System.out.println("BeforeSuite");
}
@AfterSuite
public void as()
{
	System.out.println("AfterSuite");
}
@BeforeTest
public void bt()
{
	System.out.println("BeforeTest");
}
@AfterTest
public void at()
{
	System.out.println("AfterTest");
}
@BeforeClass
public void bc()
{
	System.out.println("BeforeClass");
}
@AfterClass
public void ac()
{
	System.out.println("AfterClass");
}
@AfterMethod
public void am()
{
	System.out.println("AfterMethod");
}
@BeforeMethod
public void bm()
{
	System.out.println("BeforeMethod");
}
}
