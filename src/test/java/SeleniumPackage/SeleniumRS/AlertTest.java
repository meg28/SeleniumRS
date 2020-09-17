package SeleniumPackage.SeleniumRS;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import PageObjectModel.AlertPOM;
import Utility.Base;


public class AlertTest extends Base {
	
	public static Logger log = LogManager.getLogger(AlertTest.class.getName());

	@Test @Parameters ({"alertp"}) 
	public void alertmethod(String alertpa) throws InterruptedException, IOException {

		driver = initializedriver();
		log.info("Driver initialized-Start Alert");
		
		Thread.sleep(2000);
		log.info("Start Alert");
		AlertPOM alerttest = new AlertPOM(driver); // this driver will go to listeners driver if this method /class fails

		alerttest.getname().sendKeys(alertpa);

		alerttest.getalert().click();
		driver.switchTo().alert().accept();

		alerttest.getconfirm().click();
		driver.switchTo().alert().dismiss();

		alerttest.getname().sendKeys(alertpa);
		log.info("End Alert");
		
	}

}
