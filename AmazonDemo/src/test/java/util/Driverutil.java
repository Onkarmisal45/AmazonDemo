package util;

 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

 public class Driverutil {
	static public WebDriver getBrowserInstance(String browserName)
	{
		if (browserName.equals("chrome"))
         {
			 System.setProperty("webdriver.chrome.driver","src/test/resources/Drivers/chromedriver.exe");
			 return new ChromeDriver();
	 
         }
		else
		{
			return null;
		}
	}
	
}
