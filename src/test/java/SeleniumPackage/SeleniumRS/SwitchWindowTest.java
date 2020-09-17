package SeleniumPackage.SeleniumRS;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import PageObjectModel.SwitchWindowPOM;
import Utility.Base;

public class SwitchWindowTest extends Base {

	@Test
	public void SwitchWindowmethod() {
		SwitchWindowPOM switchpom = new SwitchWindowPOM(driver);
		switchpom.opwindow().click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		System.out.println(driver.getCurrentUrl());
		Set<String> window = driver.getWindowHandles();
		Iterator<String> id = window.iterator();

		String parentid = id.next();
		String childid = id.next();
		driver.switchTo().window(childid);
		System.out.println(driver.getCurrentUrl());

		WebElement dynamicElement = (new WebDriverWait(driver, 30)).until(ExpectedConditions
				.presenceOfElementLocated(By.className("sumome-react-wysiwyg-popup-animation-group")));

		switchpom.butntext().click();

		switchpom.veds().click();
		System.out.println(driver.getCurrentUrl());

		// driver.switchTo().window(parentid);
		// System.out.println(driver.getCurrentUrl());

	}

}
