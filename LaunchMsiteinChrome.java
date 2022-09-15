package com.appium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import com.google.common.collect.ImmutableMap;
import com.google.errorprone.annotations.Immutable;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class LaunchMsiteinChrome {

	public static void main(String[] args) throws MalformedURLException {
		
		DesiredCapabilities cap=new DesiredCapabilities();
		
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME,MobilePlatform.ANDROID);
		
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Pravinemulator");
		
		cap.setCapability(MobileCapabilityType.BROWSER_NAME, "chrome");
		
		cap.setCapability("chromeOptions", ImmutableMap.of("w3c",false));
		
		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub/"),cap);
		
		driver.get("https://www.amazon.com");
		
	}

}
