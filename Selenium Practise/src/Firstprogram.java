
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firstprogram {

	public static void main(String args[])
	
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DIVYAPASU\\Downloads\\selenium softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		System.out.println("browser launched");
	}
}
