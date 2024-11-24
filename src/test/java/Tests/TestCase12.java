package Tests;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import Base.base;
import Pages.TestCase12_page;
import Pages.TestCase13_page;

public class TestCase12 extends base{
	
  @Test(priority=12,description="Add Products in Cart")
  public void Test12() {
	  TestCase12_page tc12=new TestCase12_page(driver);
	  tc12.Test12();
	  System.out.println(".........................Testcase 12 Completed.........................");
  }
}
