 package pageObjects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SelectFlight extends BasePage {
	
	public SelectFlight(WebDriver driver) {
		
		super(driver);
		
	}
	
	@FindBy(xpath="//body/div[2]/table[1]")
	WebElement table;
	@FindBy(xpath="//form[@name='AL969']/following-sibling::*/input[@type='submit']")
	WebElement clickflightbtn;
	
	
	public void tabledata() {
		
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		List<WebElement> cols;		
	for(int i=1;i<rows.size();i++)
	{
		
		cols= rows.get(i).findElements(By.tagName("td"));
	
		String price = cols.get(5).getText();
	
		String price1 = price.replace("$","");
		  
	    System.out.println(Double.parseDouble(price1));
	}
		  int a[] = {472,432,200,765,233};
		  
		  Arrays.sort(a);
		  
			  System.out.println("smallest number is:"+a[0]); 
	 
			  
	
	   for (Object pricelist:a) {
		   
		   if(pricelist.equals(200)) {
			   
			   clickflightbtn.click();
			   
		   }
		   
	   }
	   System.out.println("$"+a[0]);
    	
    }	
    
}
	

