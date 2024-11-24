package Tests;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import Base.base;
import Pages.TestCase10_page;
import Pages.TestCase9_page;

public class TestCase10 extends base {
	
  @Test(priority=10,description="Verify Subscription in home page")
  public void Test10() {
	  TestCase10_page tc10=new TestCase10_page(driver);
	  tc10.Test10();
	  System.out.println(".........................Testcase 10 Completed.........................");
  }
}
