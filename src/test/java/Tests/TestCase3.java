package Tests;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import Base.base;
import Pages.TestCase3_page;

public class TestCase3 extends base{
  @Test(priority=3,description="Login User with incorrect email and password")
  public void Test3() {
	  TestCase3_page tc3=new TestCase3_page(driver);
	  tc3.Test3();
	  System.out.println(".........................Testcase 3 Completed.........................");
  }
}
