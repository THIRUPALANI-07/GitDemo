package rahulshettyacademy;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestDemo {
	
	@Test
	public void checkTitle() throws MalformedURLException
	{
		// https://github.com/browserstack/testng-browserstack/ -> dependency, plugins
		// https://automate.browserstack.com/dashboard/v2/quick-start/setup-browserstack-sdk -> .yml file
		MutableCapabilities caps= new MutableCapabilities();
		WebDriver driver = new RemoteWebDriver(new URL("https://hub.browserstack.com/wd/hub"),caps);
		driver.get("https://rahulshettyacademy.com");
		String title= driver.getTitle();
		//Assert.assertTrue(driver.getTitle().matches("Selenium, API Testing, Software Testing & More QA Tutorials | Rahul Shetty Academy"));
		System.out.println(title);
		
	}

}
