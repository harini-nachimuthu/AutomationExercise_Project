package Tests;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import Base.base;
import Pages.TestCase10_page;
import Pages.TestCase11_page;

public class TestCase11 extends base {
  @Test(priority=11,description="Verify Subscription in Cart page")
  public void Test11() {
	  TestCase11_page tc11=new TestCase11_page(driver);
	  tc11.Test11();
	  System.out.println(".........................Testcase 11 Completed.........................");
  }
}
