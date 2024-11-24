package Tests;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import Base.base;
import Pages.TestCase21_page;
import Pages.TestCase22_page;

public class TestCase22 extends base{
  @Test(priority=22,description=" Add to cart from Recommended items")
  public void Test22() {
	  TestCase22_page tc22=new TestCase22_page(driver);
	  tc22.Test22();
	  System.out.println(".........................Testcase 22 Completed.........................");
  }
}
