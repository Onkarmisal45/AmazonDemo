package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import util.Driverutil;

public class Amazon {
  
	 WebDriver driver;
	  @Test
	  public void FBLogin(){
	       
		    driver.findElement(By.xpath("//*[@id=\"nav-link-accountList-nav-line-1\"]")).click();
	  		driver.findElement(By.name("email")).sendKeys("onkarmisal80856@gmail.com");
	  		 
	  		driver.findElement(By.id("continue")).click();
	     	driver.findElement(By.name("password")).sendKeys("Onkar@007");
	  		driver.findElement(By.id("signInSubmit")).click();
	  		
	  		 driver.findElement(By.id("twotabsearchtextbox")).click();
		        driver.findElement(By.id("twotabsearchtextbox")).clear();
		        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("charger");
		        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		        driver.findElement(By.id("nav-search-bar-form")).submit();
		        driver.findElement(By.id("a-autoid-0-announce")).click();
		        driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div/div[1]/div/"
		                + "         span[3]/div[2]/div[2]/div/span/div/div/div/div/div[2]/div[2]/div/div[1]/h2/a/span")).click();
		        //driver.findElement(By.xpath("//*[@id=\"submit.add-to-cart-announce\"]")).click();
		       //driver.findElement(By.name("submit buy-now")).click();
		       driver.findElement(By.xpath("")).click();
	  	 
	  		//driver.findElement(By.xpath("//*[@id=\"nav-hamburger-menu\"]/i")).click();
	  	//	driver.findElement(By.xpath("//*[@id=\"hmenu-content\"]/ul[1]")).click();
	       // driver.findElement(By.partialLinkText("Sign Out")).click();
	      //  driver.findElement(By.xpath("//*[@id=\"hmenu-content\"]/ul[1]/li[30]/a")).click();
	      //  driver.findElement(By.linkText("Sign Out")).click();
	        
	        
	  }
	 
	@BeforeTest
	public void beforeTest() {
		driver=Driverutil.getBrowserInstance("chrome");
		driver.get("https://www.amazon.in\n" + 
				"");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}

	@AfterTest
	public void afterTest() {
		//driver.close();
	}
	 
	@Test
	  public void f() {
	  }
}
