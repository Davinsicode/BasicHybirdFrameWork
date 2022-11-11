package BasicHybridFrameWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class testinArea
{
	@Test
	public void testarea() throws InterruptedException
	{
		System.setProperty("webdriver.edge.driver", "./Softwares/msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://demowebshop.tricentis.com/books");
		driver.findElement(By.xpath("//span[.='Wishlist']")).click();
	
	}
}
