 package testClass;

import org.testng.annotations.Test;

import baseClass.BaseClass;
import pageObjects.ChooseCityPage;
import pageObjects.FlightReserve;
import pageObjects.SelectFlight;

public class FlightBooking extends BaseClass {
	
	@Test
	public void BookFlight() {
		
		logger.debug("-----Select destination city and departure city-----");
		ChooseCityPage ccp = new ChooseCityPage(driver);
		ccp.selectCities();
		SelectFlight sf = new SelectFlight(driver);
		logger.debug("-----verify table data-----");
		sf.tabledata();
		FlightReserve fr = new FlightReserve(driver);
		logger.debug("-----SeEnter required flight reserve details-----");
		fr.purchaseDetails(randomString(), randomString(), randomString(), randomString(), randomNumber(), randomNumber(), randomNumberof2(), randomNumberof4(), randomString());
		fr.successmsgverify();
		logger.debug("-----verify confirmation msg and exit-----");
	}

}
