package Pages;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Base.base;

public class TestCase6_page extends base{
  
	@FindBy(xpath="//a[.=' Contact us']")
	WebElement contactusbtn;
	
	@FindBy(xpath="//h2[.='Get In Touch']")
	WebElement getintouch;
	
	@FindBy(css="input[name='name']")
	WebElement name;
	
	@FindBy(css="input[name='email']")
	WebElement email;
	
	@FindBy(css="input[name='subject']")
	WebElement subject;

	@FindBy(xpath="//textarea[@id='message']")
	WebElement messagebox;
	
	@FindBy(name="upload_file")
	WebElement uploadfilebtn;
	
	@FindBy(xpath="//input[@name='submit']")
	WebElement submitbtn;
	
	@FindBy(xpath="//div[.='Success! Your details have been submitted successfully.']")
	WebElement successtext;
	
	@FindBy(xpath="//div[@id='form-section']/a/span[.=' Home']")
	WebElement homebtntoclick;
	
	
	public TestCase6_page(WebDriver driver) {
		this.driver=driver;
		this.js=(JavascriptExecutor) driver;
		PageFactory.initElements(driver, this);
		wait=new WebDriverWait(driver,Duration.ofSeconds(55));
	}

	public TestCase6_page Test6() throws InterruptedException, IOException {
		equalchecktext("Automation Exercise");
		webelementclickbtn(contactusbtn);
		ifelsechecking(getintouch);
		webelementsendkey(name,"Harini");
		webelementsendkey(email,"Harini@gmail.com");
		webelementsendkey(subject,"Automation testing");
		webelementsendkey(messagebox,"Selenium Automation testing practice session with java as programming language and used selenium tool for this automation testing.");
		webelementsendkey(uploadfilebtn,"C:\\Users\\harin\\eclipse-workspace\\Automation_excercise\\Software Testing_dummy.pdf");
		webelementclickbtn(submitbtn);
		
		driver.switchTo().alert().accept();
		
		ifelsechecking(successtext);
		webelementclickbtn(homebtntoclick);
		equalchecktext("Automation Exercise");
		
		return this;
	}
}
