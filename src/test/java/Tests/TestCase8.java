package Tests;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import Base.base;
import Pages.TestCase8_page;

public class TestCase8 extends base {
	
  @Test(priority=8,description="Verify All Products and product detail page")
  public void Test8() throws InterruptedException {
	  TestCase8_page tc8=new TestCase8_page(driver);
	  tc8.test8();
	  System.out.println(".........................Testcase 8 Completed.........................");
  }
}
