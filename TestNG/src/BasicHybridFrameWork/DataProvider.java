package BasicHybridFrameWork;

public class DataProvider 
{
	@org.testng.annotations.DataProvider(name = "signuptestdata")
	public String[][] data()
	{
		String value[][] = {{"Suresh","Kumar","sureshroshan2@gmail.com","12345"}};
		return value;
	}
}
