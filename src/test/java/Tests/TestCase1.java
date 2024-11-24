package Tests;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import Base.base;
import Pages.TestCase1_page;

public class TestCase1 extends base{
	
  @Test(priority=1,description="Register User")
  public void Test1() {
	  TestCase1_page tc1=new TestCase1_page(driver);
	  tc1.Test1();
	  tc1.Test1_1();
	  tc1.Test1_2();
	  System.out.println(".........................Testcase 1 Completed.........................");
  }
}
