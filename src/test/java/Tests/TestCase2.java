package Tests;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import Base.base;
import Pages.TestCase1_page;
import Pages.TestCase2_page;

public class TestCase2 extends base{
  @Test(priority=2,description="Login User with correct email and password")
  public void Test2() {
	  TestCase1_page tc1=new TestCase1_page(driver);
	  tc1.Test1();
	  tc1.Test1_1();
	  TestCase2_page tc2=new TestCase2_page(driver);
	  tc2.Test2();
	  tc2.Test2_1();
	  System.out.println(".........................Testcase 2 Completed.........................");
  }
}
