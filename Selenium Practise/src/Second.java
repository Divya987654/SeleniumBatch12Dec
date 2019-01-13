import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;



//@Listeners(TestListners.class)
public class Second  {

	
	
	/*@Test
	
	public void openPage()*/
	public static void main(String args[])
	{
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DIVYAPASU\\Downloads\\selenium softwares\\chromedriver_win32\\chromedriver.exe");
		
		Logger logger=Logger.getLogger("Second");
		PropertyConfigurator.configure("Log4j.properties");
		WebDriver driver=new ChromeDriver();
		logger.info("initializing chrome browser");
		driver.get("https://www.google.com/");
		logger.info("opening google site");
		System.out.println("browser launched");
		logger.info("app launched");
		
	}
	
	
	/*@Test
	public void passTest()
	{
		
		System.out.println("passing");
		Assert.assertTrue(true);
	}
	
	
	@Test
	public void failTest()
	{
		System.out.println("fail case passing");
		Assert.assertTrue(true);
	}*/
}
