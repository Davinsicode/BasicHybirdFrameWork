      package BasicHybridFrameWork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomClass 
{
	@FindBy(xpath="//a[.='Register']")
	private WebElement register;
	
	@FindBy(id="gender-male")
	private WebElement maleradio;
	
	@FindBy(id="FirstName")
	private WebElement firstname;
	
	@FindBy(id="LastName")
	private WebElement lastname;
	
	@FindBy(id="Email")
	private WebElement email;
	
	@FindBy(id="Password")
	private WebElement password;
	
	@FindBy(id="ConfirmPassword")
	private WebElement cpassword;
	
	@FindBy(id="register-button")
	private WebElement regbutton;
//........................................................................
	
	@FindBy(xpath = "(//strong[.='Categories']/../../../../preceding-sibling::div[2]//ul[1]//li[1]//a[1])[1]")
	private WebElement book;
	
	@FindBy(xpath = "//a[.='Computing and Internet']/../following-sibling::div[3]//div[2]//input")
	private WebElement computingbook;
	
	@FindBy(xpath = "//a[.='Fiction']/../following-sibling::div[3]//div[2]//input")
	private WebElement fictionbook;
	
	@FindBy(xpath = "//span[.='Wishlist']")
	private WebElement whist;
//.......................................................................	
	public PomClass(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void registerMethod()
	{
		register.click();
	}
	
	public void maleradioMethod() 
	{
		maleradio.click();
	}
	
	public void firstnameMethod(String first)
	{
		firstname.sendKeys(first);
	}
	
	public void lastnameMethod(String last)
	{
		lastname.sendKeys(last);
	}
	
	public void emailMethod(String mail)
	{
		email.sendKeys(mail);
	}
	
	public void passwordMethod(String pass)
	{
		password.sendKeys(pass);
	}
	
	public void cpasswordMethod(String pass)
	{
		cpassword.sendKeys(pass);
	}
	
	public void registerbuttonMethod()
	{
		regbutton.click();
	}
//......................................................................
	
	public void bookMethod()
	{
		book.click();
	}
	
	public void computingbookMethod()
	{
		computingbook.click();
	}
	
	public void fictionbookMethod()
	{
		fictionbook.click();
	}
	
	public void whistMethod()
	{
		whist.click();
	}
}
