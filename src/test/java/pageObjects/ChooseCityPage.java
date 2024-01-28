package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ChooseCityPage extends BasePage {
	
	public ChooseCityPage(WebDriver driver) {
		
		super(driver);
	}
	
	@FindBy(xpath="//select[@name='fromPort']//option")
	List<WebElement> departurecity;
	@FindBy(xpath="//select[@name='toPort']//option")
	List<WebElement> destinationcity;
	@FindBy(xpath="//input[@type='submit']")
	WebElement findflightsbtn;
	
   public void selectCities() {
	   
	   for(WebElement dep:departurecity) {
		   String text=dep.getText();
		   if(text.equalsIgnoreCase("Portland")) {
			   dep.click();
			   break;
		   }
		   
	   }
	   
	   for(WebElement dep:destinationcity) {
		   String text=dep.getText();
		   if(text.equalsIgnoreCase("New York")) {
			   dep.click();
			   break;
		   }
		   
	   }
	   findflightsbtn.click();
   }
   
}
