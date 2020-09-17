package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebTablePOM {

	WebDriver driver;

	public WebTablePOM(WebDriver driver) {
		this.driver = driver;
	}

	By tdis = By.xpath("//table[@class = 'table-display']");
	By prod = By.xpath("//*[@id='product']table/tbody/tr[3]/td[3])");

	public WebElement tabdisp() {
		return driver.findElement(tdis);
	}

	public WebElement product() {
		return driver.findElement(prod);
	}

}
