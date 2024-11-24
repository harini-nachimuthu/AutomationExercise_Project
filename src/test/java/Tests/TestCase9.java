package Tests;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import Base.base;
import Pages.TestCase8_page;
import Pages.TestCase9_page;

public class TestCase9 extends base {
  @Test(priority=9,description="Search Product")
  public void Test9() {
	  TestCase9_page tc9=new TestCase9_page(driver);
	  tc9.Test9();
	  System.out.println(".........................Testcase 9 Completed.........................");
  }
}
