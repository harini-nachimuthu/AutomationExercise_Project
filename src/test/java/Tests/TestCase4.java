package Tests;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import Base.base;
import Pages.TestCase1_page;
import Pages.TestCase2_page;
import Pages.TestCase4_page;

public class TestCase4 extends base{
	
  @Test(priority=4,description="Logout User")
  public void Test4() {
	  TestCase1_page tc1=new TestCase1_page(driver);
	  tc1.Test1();
	  tc1.Test1_1();
	  TestCase4_page tc4=new TestCase4_page(driver);
	  tc4.Test4();
	  TestCase2_page tc2=new TestCase2_page(driver);
	  tc2.Test2();
	  tc2.Test2_1();
	  System.out.println(".........................Testcase 4 Completed.........................");
  }
}
