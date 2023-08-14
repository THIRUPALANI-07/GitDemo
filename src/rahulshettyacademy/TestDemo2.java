package rahulshettyacademy;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestDemo2 {
	
	@Test
	public void checkTitleGoogle() throws MalformedURLException
	{
		// https://github.com/browserstack/testng-browserstack/ -> dependency, plugins
		// https://automate.browserstack.com/dashboard/v2/quick-start/setup-browserstack-sdk -> .yml file
		MutableCapabilities caps= new MutableCapabilities();
		WebDriver driver = new RemoteWebDriver(new URL("https://hub.browserstack.com/wd/hub"),caps);
		driver.get("https://google.com");
		//String title= driver.getTitle();
		Assert.assertTrue(driver.getTitle().matches("Google"));
		//System.out.println(title);
		
	}

}
