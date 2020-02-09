package Sample.Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo2 {

	@Test
	  public void f() {
		  System.out.println("print B");
		  Assert.assertTrue(true);
	  }
	  @Test
	  public void tf() {
		  System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.google.com/intl/en_in/gmail/about/");
			driver.manage().window().maximize();
			//Thread.sleep(3000);
		  System.out.println("print tf");
		  Assert.assertTrue(true);
	  }
	  @Test
	  public void fff() {
		  System.out.println("print fff");
		  Assert.assertTrue(true);
	  }
	  @BeforeMethod
	  public void bf() {
		  System.out.println("bf");
	  }
	  @AfterMethod
	  public void bf1() {
		  System.out.println("bf1");
	  }
	}
