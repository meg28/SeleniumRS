package Utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class PropertyReader {

	public static String getname(String Key) throws IOException {

		FileInputStream fs = new FileInputStream("C:\\Users\\yes\\eclipse-workspace\\SeleniumRS\\data.properties");
		Properties pr = new Properties();
		pr.load(fs);
		 return pr.getProperty("key");
	}

}
