package Pages;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Base.base;

public class TestCase23_page extends base{
  
	public TestCase23_page(WebDriver driver) {
		this.driver=driver;
		this.js=(JavascriptExecutor) driver;
		PageFactory.initElements(driver, this);
		wait=new WebDriverWait(driver,Duration.ofSeconds(55));
	}
	
	@FindBy(xpath="(//a[.='Add to cart'])[1]")
	WebElement addingproducttocart;
	
	@FindBy(xpath="//button[.='Continue Shopping']")
	WebElement continueshopping;
	
	@FindBy(xpath="//a[.=' Cart']")
	WebElement cartbtn;
	
	@FindBy(xpath="//a[.='Proceed To Checkout']")
	WebElement checoutbtn;
	
	@FindBy(xpath="//ul[@id='address_delivery']")
	WebElement adressdetails;
	
	@FindBy(xpath="//ul[@id='address_invoice']")
	WebElement invoicedetails;
	
	public TestCase23_page Test23() {
		webelementclickbtn(addingproducttocart);
		webelementclickbtn(continueshopping);
		webelementclickbtn(cartbtn);
		equalchecktext("Automation Exercise - Checkout");
		webelementclickbtn(checoutbtn);
		ifelsechecking(adressdetails);
		ifelsechecking(invoicedetails);
		return this;
	}
	@FindBy(xpath="//ul[@class='address item box']/li[2]")
	WebElement delname;
	
	@FindBy(xpath="//ul[@class='address item box']/li[3]")
	WebElement delcompany;
	
	@FindBy(xpath="//ul[@class='address item box']/li[4]")
	WebElement deladdress;
	
//	@FindBy(xpath="//ul[@class='address item box']/li[5]")
//	WebElement delcity;
	
	@FindBy(xpath="//ul[@class='address item box']/li[6]")
	WebElement delcitystate;
	
	@FindBy(xpath="//ul[@class='address item box']/li[7]")
	WebElement delcountry;
	
	@FindBy(xpath="//ul[@class='address item box']/li[8]")
	WebElement delnumber;
	
	@FindBy(xpath="//ul[@class='address alternate_item box']/li[2]")
	WebElement invoicename;
	
	@FindBy(xpath="//ul[@class='address alternate_item box']/li[3]")
	WebElement invoicecompany;
	
	@FindBy(xpath="//ul[@class='address alternate_item box']/li[4]")
	WebElement invoiceaddress;
	
//	@FindBy(xpath="//ul[@class='address alternate_item box']/li[5]")
//	WebElement invoicecity;
	
	@FindBy(xpath="//ul[@class='address alternate_item box']/li[6]")
	WebElement invoicecitystate;
	
	@FindBy(xpath="//ul[@class='address alternate_item box']/li[7]")
	WebElement invoicecountry;
	
	@FindBy(xpath="//ul[@class='address alternate_item box']/li[8]")
	WebElement invoicenumber;
	
	public TestCase23_page Test23_1() {
		String delnameText=delname.getText();
        String invoicenameText=invoicename.getText();

        String delcompanyText=delcompany.getText();
        String invoicecompanyText=invoicecompany.getText();

        String deladdressText=deladdress.getText();
        String invoiceaddressText=invoiceaddress.getText();

        String delcitystateText=delcitystate.getText();
        String invoicecitystateText=invoicecitystate.getText();

        String delcountryText=delcountry.getText();
        String invoicecountryText=invoicecountry.getText();

        String delnumberText=delnumber.getText();
        String invoicenumberText=invoicenumber.getText();

        if (delnameText.equals(invoicenameText)) {
            System.out.println("Delivery name matches Invoice name.");
        } else {
            System.out.println("Delivery name does not match Invoice name.");
        }

        if (delcompanyText.equals(invoicecompanyText)) {
            System.out.println("Delivery company matches Invoice company.");
        } else {
            System.out.println("Delivery company does not match Invoice company.");
        }

        if (deladdressText.equals(invoiceaddressText)) {
            System.out.println("Delivery address matches Invoice address.");
        } else {
            System.out.println("Delivery address does not match Invoice address.");
        }

        if (delcitystateText.equals(invoicecitystateText)) {
            System.out.println("Delivery city and state match Invoice city and state.");
        } else {
            System.out.println("Delivery city and state do not match Invoice city and state.");
        }

        if (delcountryText.equals(invoicecountryText)) {
            System.out.println("Delivery country matches Invoice country.");
        } else {
            System.out.println("Delivery country does not match Invoice country.");
        }

        if (delnumberText.equals(invoicenumberText)) {
            System.out.println("Delivery number matches Invoice number.");
        } else {
            System.out.println("Delivery number does not match Invoice number.");
        }
		return this;
	}
}
