package BasicHybridFrameWork;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class TestScript extends Base_Class
{
	@Test(dataProvider = "signuptestdata", dataProviderClass = DataProvider.class)
	public void signup(String first, String last, String mail, String pass) throws InterruptedException
	{
		PomClass pmc = new PomClass(driver);
		
		pmc.registerMethod();
		pmc.firstnameMethod(first);
		pmc.lastnameMethod(last);
		pmc.emailMethod(mail);
		pmc.passwordMethod(pass);
		pmc.cpasswordMethod(pass);
		pmc.registerbuttonMethod();
		
		/*pmc.bookMethod();
	
		JavascriptExecutor java = (JavascriptExecutor)driver;
		java.executeScript("window.scrollBy(0,200)");
		
		pmc.computingbookMethod();
		pmc.fictionbookMethod();
		
		pmc.whistMethod();*/
		
		Thread.sleep(10000);
	}
}
