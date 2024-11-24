package Tests;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import Base.base;
import Pages.TestCase14_page;
import Pages.TestCase15_page;
import Pages.TestCase1_page;
import Pages.TestCase2_page;

public class TestCase16 extends base{
  @Test(priority=16,description=" Place Order: Login before Checkout")
  public void Test16() {
	  TestCase1_page tc1=new TestCase1_page(driver);
	  tc1.Test1();
	  tc1.Test1_1();
	  TestCase2_page tc2=new TestCase2_page(driver);
	  tc2.Test2();
	  TestCase15_page tc15=new TestCase15_page(driver);
	  tc15.Test15();
	  TestCase14_page tc14=new TestCase14_page(driver);
	  tc14.Test14_2();
	  tc1.Test1_2();
	  System.out.println(".........................Testcase 16 Completed.........................");
  }
}
