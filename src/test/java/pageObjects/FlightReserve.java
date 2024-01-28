package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class FlightReserve extends BasePage{
	
	public FlightReserve(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//input[@id='inputName']")
	WebElement name;
	@FindBy(xpath="//input[@id='address']")
	WebElement address;
	@FindBy(xpath="//input[@id='city']")
	WebElement city;
	@FindBy(xpath="//input[@id='state']")
	WebElement state;
	@FindBy(xpath="//input[@id='zipCode']")
	WebElement zipcode;
	@FindBy(xpath="//select[@id='cardType']")
	WebElement cardtype;
	@FindBy(xpath="//input[@id='creditCardNumber']")
	WebElement cardnum;
	@FindBy(xpath="//input[@id='creditCardMonth']")
	WebElement cardmonth;
	@FindBy(xpath="//input[@id='creditCardYear']")
	WebElement cardyear;
	@FindBy(xpath="//input[@id='nameOnCard']")
	WebElement cardname;
	@FindBy(xpath="//input[@id='rememberMe']")
	WebElement rememberme;
	@FindBy(xpath="//input[@type='submit']")
	WebElement purchasebtn;
	@FindBy(xpath="//h1[contains(text(),'Thank you for your purchase today!')]")
	WebElement successmsg;
	
	public void purchaseDetails(String nm,String add,String CT,String ST,String zip,String Cnum,String Cmon,String Cyear,String Cname) {
		name.sendKeys(nm);
		address.sendKeys(add);
		city.sendKeys(CT);
		state.sendKeys(ST);
		zipcode.sendKeys(zip);
		Select sc = new Select(cardtype);
		sc.selectByValue("amex");
		cardnum.sendKeys(Cnum);
		cardmonth.sendKeys(Cmon);
		cardyear.sendKeys(Cyear);
		cardname.sendKeys(Cname);
		rememberme.click();
		purchasebtn.click();
		
	}
	
	public String successmsgverify() {
		 String msg = successmsg.getText();
		 System.out.println(msg);
	
		return msg;
	}	
}


