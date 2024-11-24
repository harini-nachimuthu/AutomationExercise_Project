package Tests;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import Base.base;
import Pages.TestCase24_page;
import Pages.TestCase25_page;

public class TestCase25 extends base{
  @Test(priority=25,description="Verify Scroll Up using 'Arrow' button and Scroll Down functionality")
  public void Test25() {
	  TestCase25_page tc25=new TestCase25_page(driver);
	  tc25.Test25();
	  System.out.println(".........................Testcase 25 Completed.........................");
  }
}
