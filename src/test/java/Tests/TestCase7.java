package Tests;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import Base.base;
import Pages.TestCase7_page;

public class TestCase7 extends base {
  @Test(priority=7,description="Verify Test Cases Page")
  public void Test7() {
	  TestCase7_page tc7=new TestCase7_page(driver);
	  tc7.Test7();
	  System.out.println(".........................Testcase 7 Completed.........................");
  }
}
