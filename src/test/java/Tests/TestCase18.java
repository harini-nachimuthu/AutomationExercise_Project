package Tests;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import Base.base;
import Pages.TestCase17_page;
import Pages.TestCase18_page;

public class TestCase18 extends base{
	
  @Test(priority=18,description=" View Category Products")
  public void Test18() {
	  TestCase18_page tc18=new TestCase18_page(driver);
	  tc18.Test18();
	  System.out.println(".........................Testcase 18 Completed.........................");
  }
}
