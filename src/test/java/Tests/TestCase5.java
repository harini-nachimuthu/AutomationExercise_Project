package Tests;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import Base.base;
import Pages.TestCase1_page;
import Pages.TestCase2_page;
import Pages.TestCase5_page;

public class TestCase5 extends base{
  @Test(priority=5,description="Register User with existing email")
  public void Test5() {
	  TestCase1_page tc1=new TestCase1_page(driver);
	  tc1.Test1();
	  tc1.Test1_1();
	  TestCase5_page tc5=new TestCase5_page(driver);
	  tc5.Test5();
	  tc5.Test5_1();
	  TestCase2_page tc2=new TestCase2_page(driver);
	  tc2.Test2_1();
	  System.out.println(".........................Testcase 5 Completed.........................");
  }
}
