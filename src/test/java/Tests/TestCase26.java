package Tests;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import Base.base;
import Pages.TestCase25_page;
import Pages.TestCase26_page;

public class TestCase26 extends base {
  @Test(priority=26,description="Verify Scroll Up without 'Arrow' button and Scroll Down functionality")
  public void Test26() {
	  TestCase26_page tc26=new TestCase26_page(driver);
	  tc26.Test26();
	  System.out.println(".........................Testcase 26 Completed.........................");
	  
  }
}
