package SeleniumPackage.SeleniumRS;

import java.io.IOException;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import PageObjectModel.DropdownPOM;
import Utility.Base;

public class DropdownTest extends Base {
	@Test
	public void dropdownmethod() throws IOException {
		
		Logger log = LogManager.getLogger(Base.class.getName());
		
		driver = initializedriver();
		log.info("Start dropdown");

		DropdownPOM dropd = new DropdownPOM(driver);

		Select s = new Select(dropd.drop());
		s.selectByValue("option2");
		List<WebElement> l = s.getOptions();
		
		//Assert.assertTrue(false);
		log.info("after getoptions");

		for (int i = 0; i < l.size(); i++) {
			String word = l.get(i).getText();
			System.out.println(word);
		}
		
		log.info("End dropdown");
		
	}
}