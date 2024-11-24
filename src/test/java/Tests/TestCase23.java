package Tests;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import Base.base;
import Pages.TestCase1_page;
import Pages.TestCase22_page;
import Pages.TestCase23_page;

public class TestCase23 extends base{
  @Test(priority=23,description=" Verify address details in checkout page")
  public void Test23() {
	  TestCase1_page tc1=new TestCase1_page(driver);
	  tc1.Test1();
	  tc1.Test1_1();
	  TestCase23_page tc23=new TestCase23_page(driver);
	  tc23.Test23();
	  tc23.Test23_1();
	  tc1.Test1_2();
	  System.out.println(".........................Testcase 23 Completed.........................");
  }
}
