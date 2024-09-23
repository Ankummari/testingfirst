package MobileAutomationPractice.MobileAutomationPractice;

import java.net.MalformedURLException;
import java.net.URL;


import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;

import io.appium.java_client.android.AndroidDriver;

public class BaseClass {
	public AndroidDriver ad;  //initialize android driver
  @BeforeTest
  public void setUp() throws MalformedURLException, InterruptedException {
	  DesiredCapabilities dc = new DesiredCapabilities(); 
	  dc.setCapability("platformName","Android");
	  dc.setCapability("deviceName", "Pixel 4 API 30");
	  dc.setCapability("automationName", "UiAutomator2");
	  dc.setCapability("app","C:\\Users\\anilk\\SeleniumTesting\\MobileAutomationPractice\\Resource\\ApiDemos-debug.apk");
	  ad= new AndroidDriver(new URL("http://127.0.0.1:4723/"),dc);
	  Thread.sleep(5000);
	  //ad.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Preference\"]")).click();
  
  
  
  }
  
}
