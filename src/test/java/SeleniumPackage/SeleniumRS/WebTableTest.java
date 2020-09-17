package SeleniumPackage.SeleniumRS;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import PageObjectModel.WebTablePOM;
import Utility.Base;

public class WebTableTest extends Base {

	@Test
	public void WebTablemethod() {
		WebTablePOM webpom = new WebTablePOM(driver);

		WebElement table = webpom.tabdisp();

		List<WebElement> rows = table.findElements((By.tagName("tr")));
		int rowcount = rows.size();
		System.out.println("Rowcount is \t" + rowcount);
		// for(int i = 1; i<rowcount;i++)
		// {
		// List<WebElement> columns = table.findElements((By.tagName("td")));
		// int colcount = columns.size();

		// *[@id="product"]/tbody/tr[3]/td[3]

		System.out.println(webpom.product());

		// }
	}
}