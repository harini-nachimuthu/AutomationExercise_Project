package Tests;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import Base.base;
import Pages.TestCase12_page;
import Pages.TestCase14_page;
import Pages.TestCase1_page;

public class TestCase14 extends base{
	
  @Test(priority=14,description="Place Order: Register while Checkout")
  public void Test14() {
	  TestCase14_page tc14=new TestCase14_page(driver);
	  tc14.Test14();
	  TestCase1_page tc1=new TestCase1_page(driver);
	  tc1.Test1();
	  tc1.Test1_1();
	  tc14.Test14_1();
	  tc14.Test14_2();
	  tc1.Test1_2();
	  System.out.println(".........................Testcase 14 Completed.........................");
  }
}
