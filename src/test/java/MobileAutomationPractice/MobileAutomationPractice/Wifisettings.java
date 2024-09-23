package MobileAutomationPractice.MobileAutomationPractice;


import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class Wifisettings extends BaseClass{
	@Test
	
	public  void setUpWifi() throws InterruptedException {

		ad.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc=\"Preference\"]")).click();
		Thread.sleep(5000);
		ad.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc=\"3. Preference dependencies\"]")).click();
		
	}

}
