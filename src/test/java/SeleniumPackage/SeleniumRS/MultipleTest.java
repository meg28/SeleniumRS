package SeleniumPackage.SeleniumRS;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import PageObjectModel.MultiplePOM;
import Utility.Base;

public class MultipleTest extends Base {

	public static Logger log = LogManager.getLogger(Base.class.getName());

	MultiplePOM multipom = new MultiplePOM(driver);

	@Test
	public void checkboxmethod() throws IOException {
		driver = initializedriver();
		multipom.checkboxx().click();
		log.info("checkbox");

	}

	@Test
	public void hideshowmethod() throws IOException {
		driver = initializedriver();
		multipom.displayt().sendKeys("Hello");
		multipom.hidt().click();
		log.info("hideshow");
	}

	@Test
	public void mousehovermethod() throws IOException {
		driver = initializedriver();

		WebElement mouse = multipom.mouseHovr();

		Actions a = new Actions(driver);
		a.moveToElement(mouse).build().perform();
		// WebElement mousetop = driver.findElement(By.xpath("//div[@class =
		// 'mouse-hover-content']"));
		// mousetop.click();
		multipom.Reloa().click();
		;
		log.info("it will reload the page");
		log.info("mousehover");
	}

	@Test
	public void radiobuttonmethod() throws IOException {
		driver = initializedriver();

		if (driver.getPageSource().contains("Radio Button Example")) {
			System.out.println("Text is present:Radio Button Example");
		} else {
			System.out.println("Text is not present");
		}

		multipom.radio().click();

		log.info("radiobutton");
	}
}
