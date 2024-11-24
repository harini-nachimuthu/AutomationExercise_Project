package Tests;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import Base.base;
import Pages.TestCase11_page;
import Pages.TestCase13_page;

public class TestCase13 extends base{
	
  @Test(priority=13,description="Verify Product quantity in Cart")
  public void Test13() {
	  TestCase13_page tc13=new TestCase13_page(driver);
	  tc13.Test13();
	  System.out.println(".........................Testcase 13 Completed.........................");
  }
}
