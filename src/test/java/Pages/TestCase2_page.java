package Pages;

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

public class TestCase2_page extends base{
  
	@FindBy(xpath="//a[.=' Logout']")
	WebElement logoutbtn;
	
	@FindBy(xpath="//div/div/div/div[2]/div/ul/li[4]/a")
	WebElement homeloginbtn;
	
	@FindBy(xpath="//h2[normalize-space()='Login to your account']")
	WebElement loginvisible;
	
	@FindBy(xpath="(//input[@name='email'])[1]")
	WebElement loginemail;
	
	@FindBy(xpath="(//input[@name='password'])[1]")
	WebElement loginpassword;
	
	@FindBy(xpath="//button[normalize-space()='Login']")
	WebElement Loginbtn;
	
	@FindBy(xpath="//li[contains(.,'Logged in as Harini')]")
	WebElement loggedinas;
	
	public TestCase2_page(WebDriver driver) {
		this.driver=driver;
		this.js=(JavascriptExecutor)driver;
		wait=new WebDriverWait(driver,Duration.ofSeconds(55));
		PageFactory.initElements(driver, this);
	}

	public TestCase2_page Test2() {
//		webelementclickbtn(logoutbtn);
		webelementclickbtn(homeloginbtn);
		ifelsechecking(loginvisible);
		webelementsendkey(loginemail,"Harini@gmail.com");
		webelementsendkey(loginpassword,"password@12345");
		webelementclickbtn(Loginbtn);
		ifelsechecking(loggedinas);
		return this;
	}
	
	@FindBy(xpath="//a[normalize-space()='Delete Account']")
	WebElement deleteaccountbtn;
	
	@FindBy(xpath="//b[normalize-space()='Account Deleted!']")
	WebElement accountdeleted;
	
	@FindBy(xpath="//a[.='Continue']")
	WebElement afterdeletecontinue;
	
	public TestCase2_page Test2_1() {
		webelementclickbtn(deleteaccountbtn);
		ifelsechecking(accountdeleted);
		webelementclickbtn(afterdeletecontinue);
		return this;
	}
}
