package Tests;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import Base.base;
import Pages.TestCase14_page;
import Pages.TestCase15_page;
import Pages.TestCase1_page;

public class TestCase15 extends base{
	
  @Test(priority=15,description="Place Order: Register before Checkout")
  public void Test15() {
	  TestCase1_page tc1=new TestCase1_page(driver);
	  tc1.Test1();
	  tc1.Test1_1();
	  TestCase15_page tc15=new TestCase15_page(driver);
	  tc15.Test15();
	  TestCase14_page tc14=new TestCase14_page(driver);
	  tc14.Test14_2();
	  tc1.Test1_2();
	  System.out.println(".........................Testcase 15 Completed.........................");
  }
}
