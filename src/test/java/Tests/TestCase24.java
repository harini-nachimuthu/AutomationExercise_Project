package Tests;

import org.testng.annotations.Test;
import java.io.IOException;

import org.testng.annotations.Test;

import Base.base;
import Pages.TestCase14_page;
import Pages.TestCase1_page;
import Pages.TestCase23_page;
import Pages.TestCase24_page;

public class TestCase24 extends base{
  @Test(priority=24,description=" Download Invoice after purchase order")
  public void Test24() throws IOException, InterruptedException {
	  TestCase14_page tc14=new TestCase14_page(driver);
	  tc14.Test14();
	  TestCase1_page tc1=new TestCase1_page(driver);
	  tc1.Test1();
	  tc1.Test1_1();
	  tc14.Test14_1();
	  tc14.Test14_2();
	  TestCase24_page tc24=new TestCase24_page(driver);
	  tc24.Test24();
	  tc1.Test1_2();
	  System.out.println(".........................Testcase 24 Completed.........................");
  }
}
