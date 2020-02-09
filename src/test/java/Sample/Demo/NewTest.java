package Sample.Demo;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() {
	  System.out.println("print C");
	  Assert.assertTrue(true);
  }
  @Test
  public void tf() {
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
