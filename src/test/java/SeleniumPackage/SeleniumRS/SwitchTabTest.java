package SeleniumPackage.SeleniumRS;

import java.util.ArrayList;
import org.testng.annotations.Test;
import PageObjectModel.SwitchTabPOM;
import Utility.Base;

public class SwitchTabTest extends Base {

	@Test
	public void SwitchTabmethod() {
		SwitchTabPOM stab = new SwitchTabPOM(driver);

		stab.optab().click();

		System.out.println(driver.getTitle()); // SOP1

		// Get the current window handle
		String windowHandle = driver.getWindowHandle();

		// Get the list of window handles
		ArrayList<String> windows = new ArrayList<String>(driver.getWindowHandles());

		System.out.println(windows.size()); // SOP2
		// Use the list of window handles to switch between windows
		driver.switchTo().window((String) windows.get(1));

		System.out.println(driver.getTitle()); // SOP3

		stab.cours().click();

		System.out.println(driver.getCurrentUrl()); // SOP4
		driver.switchTo().window((String) windows.get(0));
		System.out.println(driver.getCurrentUrl());
	}

}
