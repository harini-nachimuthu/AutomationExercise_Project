package Tests;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import Base.base;
import Pages.TestCase17_page;

public class TestCase17 extends base{
  @Test(priority=17,description="Remove Products From Cart")
  public void Test17() throws InterruptedException {
	  TestCase17_page tc17=new TestCase17_page(driver);
	  tc17.Test17();
	  System.out.println(".........................Testcase 17 Completed.........................");
  }
}
