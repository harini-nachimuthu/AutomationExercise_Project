package Tests;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.io.IOException;

import org.testng.annotations.Test;

import Base.base;
import Pages.TestCase6_page;

public class TestCase6 extends base{
  @Test(priority=6,description="Contact Us Form")
  public void Test6() throws InterruptedException, IOException {
	  TestCase6_page tc6=new TestCase6_page(driver);
	  tc6.Test6();
	  System.out.println(".........................Testcase 6 Completed.........................");
  }
}
