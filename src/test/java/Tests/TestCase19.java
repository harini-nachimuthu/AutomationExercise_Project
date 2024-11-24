package Tests;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import Base.base;
import Pages.TestCase18_page;
import Pages.TestCase19_page;

public class TestCase19 extends base{
  @Test(priority=19,description="View & Cart Brand Products")
  public void Test19() {
	  TestCase19_page tc19=new TestCase19_page(driver);
	  tc19.Test19();
	  System.out.println(".........................Testcase 19 Completed.........................");
  }
}
