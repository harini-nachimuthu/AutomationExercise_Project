package Tests;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import Base.base;
import Pages.TestCase19_page;
import Pages.TestCase1_page;
import Pages.TestCase20_page;
import Pages.TestCase2_page;

public class TestCase20 extends base{
  @Test(priority=20,description="Search Products and Verify Cart After Login")
  public void Test20() {
	  TestCase20_page tc20=new TestCase20_page(driver);
	  tc20.Test20();
	  TestCase1_page tc1=new TestCase1_page(driver);
	  tc1.Test1();
	  tc1.Test1_1();
	  TestCase2_page tc2=new TestCase2_page(driver);
	  tc2.Test2();
	  tc20.Test20_1();
	  tc2.Test2_1();
	  System.out.println(".........................Testcase 20 Completed.........................");
  }
}
