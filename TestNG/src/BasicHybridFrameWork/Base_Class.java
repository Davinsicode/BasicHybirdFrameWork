package BasicHybridFrameWork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Base_Class 
{
	public static WebDriver driver;
	public static WebDriverWait wait;
	
	@Parameters({"key","value","url"})
	@BeforeMethod
	public void openapp(String key, String value, String url)
	{
		System.setProperty(key, value);
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		wait = new WebDriverWait(driver, 10);
	}
	
	@AfterMethod
	public void closeapp()
	{
		driver.close();
	}
}
