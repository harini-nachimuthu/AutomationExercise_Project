package Pages;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Base.base;

public class TestCase1_page extends base {
  
	@FindBy(xpath="//a[normalize-space()='Home']")
	WebElement homebtn;
	
	@FindBy(xpath="//div/div/div/div[2]/div/ul/li[4]/a")
	WebElement homesignupbtn;

	@FindBy(xpath="//body[1]/section[1]/div[1]/div[1]/div[3]/div[1]/h2[contains(text(),'New User Signup!')]")
	WebElement newusersignup;
	
	@FindBy(xpath="//input[@name='name']")
	WebElement signupname;
	
	@FindBy(xpath="(//input[@name='email'])[2]")
	WebElement signupemail;
	
	@FindBy(xpath="(//button[@type='submit'])[2]")
	WebElement signupbtn;
	
	@FindBy(xpath="//b[contains(text(),'Enter Account Information')]")
	WebElement textinfo;
	
	@FindBy(xpath="//input[@id='id_gender2']")
	WebElement Titleclick;
	
	@FindBy(xpath="//input[@id='password']")
	WebElement passwordsend;
	
	@FindBy(xpath="//select[@id='days']")
	WebElement selectdays;
	
	@FindBy(xpath="//select[@id='months']")
	WebElement selectmonths;
	
	@FindBy(xpath="//select[@id='years']")
	WebElement selectyears;
	
	@FindBy(id="newsletter")
	WebElement checkboxnewsletter;
	
	@FindBy(id="optin")
	WebElement spcloffer;
	
	@FindBy(xpath="//p[normalize-space()='Email Address already exist!']")
	WebElement emailpresent;
	
	public TestCase1_page(WebDriver driver) {
		this.driver=driver;
		this.js=(JavascriptExecutor) driver;
		PageFactory.initElements(driver, this);
		wait=new WebDriverWait(driver,Duration.ofSeconds(55));
	}

	public TestCase1_page Test1() {
		webelementclickbtn(homebtn);
		equalchecktext("Automation Exercise");
		webelementclickbtn(homesignupbtn);
		ifelsechecking(newusersignup);	
		webelementsendkey(signupname,"Harini");
		webelementsendkey(signupemail,"Harini@gmail.com");
		webelementclickbtn(signupbtn);
		
		ifelsechecking(textinfo);			
		webelementclickbtn(Titleclick);
		webelementsendkey(passwordsend,"password@12345");
		
		Select selectday=new Select(selectdays);
		selectday.selectByValue("4");
		
		Select selectmonth=new Select(selectmonths);
		selectmonth.selectByValue("10");
		
		Select selectyear=new Select(selectyears);
		selectyear.selectByValue("2000");
		
		webelementclickbtn(checkboxnewsletter);
		webelementclickbtn(spcloffer);
		
		return this;
	}
	
	@FindBy(id="first_name")
	WebElement firstname;
	
	@FindBy(id="last_name")
	WebElement lastname;
	
	@FindBy(id="company")
	WebElement company;
	
	@FindBy(id="address1")
	WebElement address;
	
	@FindBy(id="country")
	WebElement selectcountrys;
	
	@FindBy(id="state")
	WebElement state;
	
	@FindBy(id="city")
	WebElement city;
	
	@FindBy(id="zipcode")
	WebElement zipcode;
	
	@FindBy(id="mobile_number")
	WebElement mobileno;
	
	@FindBy(xpath="//button[.='Create Account']")
	WebElement createacnt;
	
	@FindBy(xpath="//h2/b")
	WebElement accntcreated;
	
	@FindBy(xpath="//a[.='Continue']")
	WebElement continuebtn;
	
	@FindBy(xpath="//li[contains(.,'Logged in as Harini')]")
	WebElement loggedinas;
	
	@FindBy(xpath="//a[normalize-space()='Delete Account']")
	WebElement deleteaccountbtn;
	
	@FindBy(xpath="//b[normalize-space()='Account Deleted!']")
	WebElement accountdeleted;
	
	@FindBy(xpath="//a[.='Continue']")
	WebElement afterdeletecontinue;
	
	public TestCase1_page Test1_1() {
		webelementsendkey(firstname,"Harini");
		webelementsendkey(lastname,"Nachimuthu");
		webelementsendkey(company,"XYZ company");
		webelementsendkey(address,"No 1 Street Chennai");
		
		Select selectcountry=new Select(selectcountrys);
		selectcountry.selectByValue("India");
		
		webelementsendkey(state,"Tamil Nadu");
		webelementsendkey(city,"Chennai");
		webelementsendkey(zipcode,"600 025");
		webelementsendkey(mobileno,"7890543212");
		webelementclickbtn(createacnt);
		ifelsechecking(accntcreated);
		webelementclickbtn(continuebtn);
		ifelsechecking(loggedinas);
		return this;
	}
	
	public TestCase1_page Test1_2() {
		ifelsechecking(loggedinas);
		webelementclickbtn(deleteaccountbtn);
		ifelsechecking(accountdeleted);
		webelementclickbtn(afterdeletecontinue);
		return this;
	}
}
