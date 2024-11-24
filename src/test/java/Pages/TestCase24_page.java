package Pages;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Base.base;

public class TestCase24_page extends base{
  
	public TestCase24_page(WebDriver driver) {
		this.driver=driver;
		this.js=(JavascriptExecutor) driver;
		PageFactory.initElements(driver, this);
		wait=new WebDriverWait(driver,Duration.ofSeconds(55));
	}
	
	@FindBy(xpath="//a[.='Download Invoice']")
	WebElement downloadinvoice;
	
	@FindBy(xpath="//p[.='Congratulations! Your order has been confirmed!']")
	WebElement successmestext;
	
	@FindBy(xpath="//a[.='Continue']")
	WebElement continuebtn;
	
	public TestCase24_page Test24() throws IOException, InterruptedException {
		webelementclickbtn(downloadinvoice);
		String path="\"C:\\AutoIT_file\\Invoicedownload.exe\"";
		ProcessBuilder build=new ProcessBuilder(path);
		build.start();
		Thread.sleep(2000);
		ifelsechecking(successmestext);
		webelementclickbtn(continuebtn);
		return this;
	}
}
