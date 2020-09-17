package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DropdownPOM {

	WebDriver driver;

	public DropdownPOM(WebDriver driver) {
		this.driver = driver;
	}

	By dropdown = By.id("dropdown-class-example");

	public WebElement drop()

	{
		return driver.findElement(dropdown);
	}

}
