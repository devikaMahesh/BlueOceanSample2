package blueocean.sample;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import blueocean.samplepage.LoginSite;


public class AccessToSite {
	
public WebDriver driver;
	
	@Test
	public void flightSite() { 
		
		DesiredCapabilities capab = DesiredCapabilities.chrome();
		capab.setCapability("dom.forms.number", false);
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver(capab);

		driver.get("http://newtours.demoaut.com");
		
		System.out.println("Browser is launched");
		
		LoginSite loginSite = PageFactory.initElements(driver, LoginSite.class);
		
		loginSite.loginApplication();
		
		System.out.println("Credentials entered")
	
	}
}
