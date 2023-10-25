package testPkgMain;


import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import commonFunctions.baseClass;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class classLaunchTest extends baseClass {
	//private void printPerformanceData() {
		//List<List<Object>> performanceData = driver.getPerformanceData("io.appium.android.apis","cpuinfo",5);
		//System.out.println("\n                Performance Data           ");
		//System.out.println("---------------------------------------------");
	//}

	@Test
	public void launchAppMain() throws MalformedURLException {
		launchAppTest();
		/*----
		driver.findElement(AppiumBy.accessibilityId("Preference")).click();
		driver.findElement(AppiumBy.accessibilityId("App")).click();
		driver.findElement(AppiumBy.accessibilityId("Search")).click();
		driver.findElement(AppiumBy.accessibilityId("Invoke Search")).click();
		driver.findElement(AppiumBy.id("io.appium.android.apis:id/txt_query_prefill")).sendKeys("Test,1");
		driver.findElement(AppiumBy.id("io.appium.android.apis:id/txt_query_appdata")).sendKeys("2,Test,1");
		driver.navigate().back();
		driver.navigate().back();
		driver.navigate().back();
 		--*/
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		/*
		//For Long Click
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Expandable Lists\"]")).click();
		driver.findElement(AppiumBy.accessibilityId("1. Custom Adapter")).click();
		WebElement ele=driver.findElement(By.xpath("//android.widget.TextView[@text='People Names']"));
		longClickGesture(ele);
			 	 
		String val=driver.findElement(By.xpath("//android.widget.TextView[@text='Sample menu']")).getText();
		Assert.assertEquals(val, "Sample menu");
		Assert.assertTrue(driver.findElement(By.xpath("//android.widget.TextView[@text='Sample menu']")).isDisplayed());
		
		List<WebElement> elements = driver.findElements(By.className("android.widget.ExpandableListView"));
		
		for (WebElement element: elements) {
			System.out.println(element.getText());
		}
		*/
		//For Selecting in the same list
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Expandable Lists\"]")).click();
		driver.findElement(AppiumBy.accessibilityId("1. Custom Adapter")).click();
	    driver.findElement(By.xpath("//android.widget.TextView[@text='People Names']")).click();
			 	 
		List<WebElement> elements = driver.findElements(By.xpath("//android.widget.ExpandableListView/android.widget.TextView"));
		
		for (WebElement element: elements) {
			if(element.getText().contains("Names")) {
				
			}else{
				System.out.println(element.getText());
			}
		}
		
		}
		/*-
		//Scroll Gesture
		while(scrollDownPossible()) {
		 ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap.of(
				    "left", 100, "top", 100, "width", 200, "height", 200,
				    "direction", "down",
				    "percent", 20.0
				));
			 
		 }
		 Assert.assertFalse(scrollDownPossible());
		 //Assert.assertTrue(scrollDownPossible());
		
		//Scroll To Element
		 scrollToElementWithText("Expandable Lists");
		
		 //Fling
			driver.navigate().back();
			driver.findElement(AppiumBy.accessibilityId("Views")).click();
		WebElement flingTarget = driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Animation\"]"));
		while(flingDownFromTarget(flingTarget)) {
			System.out.println("target still visible, Flinging...");
		}
		Assert.assertFalse(flingDownFromTarget(flingTarget));
		
		//DoubleClick
		 
		
		 //PinchOpen
		 
		 -*/
		 
		//Close
		//tearDown();
  }



