package commonFunctions;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class baseClass {
	AppiumDriverLocalService service;
	protected AndroidDriver driver;
	
	  @SuppressWarnings("deprecation")
	public void launchAppTest() throws MalformedURLException {
		  service = new AppiumServiceBuilder().withAppiumJS(new File("C:\\Users\\COLLABERA.DIGITAL\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"))
				  .withIPAddress("127.0.0.1")
				  .usingPort(4723)
				  .build();
		  service.start();
		 
		    UiAutomator2Options options = new UiAutomator2Options();
			options.setDeviceName("Pixel4KaeTest");
			options.setApp("C:\\Users\\COLLABERA.DIGITAL\\eclipse-workspace\\testProjArt\\src\\main\\java\\resources\\APKFiles\\resources\\ApiDemos-debug.apk");
			driver = new AndroidDriver(new URL("http://127.0.0.1:4723"),options);
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
	    //throw new RuntimeException("Test not implemented");
	  }
	public void tearDown() {
		driver.quit();
		service.stop();
		
	}
	public void longClickGesture(WebElement e) {
		((JavascriptExecutor)driver).executeScript(
				"mobile: longClickGesture",
				ImmutableMap.of("elementId",
				((RemoteWebElement)e).getId(),
				"duration",2000));
	}
	
	public boolean scrollDownPossible() {
		// Java
		boolean canScrollMore = (Boolean) ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap.of(
		    "left", 100, "top", 100, "width", 200, "height", 200,
		    "direction", "down",
		    "percent", 3.0
		));
		return canScrollMore;
	}
	
	public void scrollToElementWithText(String s) {
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\""+s+"\"))"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	public boolean flingDownFromTarget(WebElement e) {
		boolean canFlingMore = (Boolean) ((JavascriptExecutor) driver).executeScript("mobile: flingGesture", ImmutableMap.of(
			    "elementId", ((RemoteWebElement) e).getId(),
			    "direction", "down",
			    "speed", 5000
			));
		return canFlingMore;
		
	}
	

	
}
