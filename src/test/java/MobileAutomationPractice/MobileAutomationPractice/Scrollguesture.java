package MobileAutomationPractice.MobileAutomationPractice;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class Scrollguesture extends BaseClass {
	//public AndroidDriver driver;
	@Test
	
	public void Mobileguest() throws InterruptedException {
		ad.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc=\"Views\"]")).click();
		Thread.sleep(5000);
		ad.findElement(AppiumBy.androidUIAutomator("new UiScroallable(new UiSelector()).scrollIntoView(text(\"Search View\"))")).click();
	}
}
