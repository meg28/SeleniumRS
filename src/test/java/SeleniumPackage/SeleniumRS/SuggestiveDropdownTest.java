package SeleniumPackage.SeleniumRS;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import PageObjectModel.SuggestiveDropdownPOM;
import Utility.Base;

public class SuggestiveDropdownTest extends Base {

	SuggestiveDropdownPOM suggestdrop = new SuggestiveDropdownPOM(driver);

	@Test
	public void SuggestiveDropdownmethod() {
		suggestdrop.texttype().sendKeys("INDIA");

		JavascriptExecutor js = (JavascriptExecutor) driver;

		String script = "return document.getElementByID (\"text\").value);";
		System.out.println("2");

		String text = (String) js.executeScript(script);
		System.out.println("text");

		while (!text.equalsIgnoreCase("INDIA")) {
			suggestdrop.texttype().sendKeys(Keys.DOWN);

			text = (String) js.executeScript(script);
			suggestdrop.texttype().click();

			System.out.println(text);

		}

	}
}
