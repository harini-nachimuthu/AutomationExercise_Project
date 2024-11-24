package Tests;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import Base.base;
import Pages.TestCase20_page;
import Pages.TestCase21_page;

public class TestCase21 extends base{
  @Test(priority=21,description="Add review on product")
  public void Test21() {
	  TestCase21_page tc21=new TestCase21_page(driver);
	  tc21.Test21();
	  System.out.println(".........................Testcase 21 Completed.........................");
  }
}
