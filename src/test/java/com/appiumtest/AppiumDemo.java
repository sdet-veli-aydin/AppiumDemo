package com.appiumtest;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class AppiumDemo {

    public static AppiumDriver driver;

    public static void main(String[] args) {
        appiumTest1();
    }

    public static void appiumTest1(){

        DesiredCapabilities Pixel4_Caps = new DesiredCapabilities();
        Pixel4_Caps.setCapability("platformName", "android");
        Pixel4_Caps.setCapability("platformVersion", "10");
        Pixel4_Caps.setCapability("deviceName", "Android SDK built for x86");
        //Pixel4_Caps.setCapability("udid", "emulator-5554");
        Pixel4_Caps.setCapability("automationName", "UiAutomator2");
        Pixel4_Caps.setCapability("appPackage", "com.android.contacts");
        Pixel4_Caps.setCapability("appActivity", "com.android.contacts.activities.PeopleActivity");

try {
    URL url = new URL("http://127.0.0.1:4723/wd/hub/");
    driver = new AppiumDriver(url, Pixel4_Caps);
}
catch (MalformedURLException e){
e.printStackTrace();
}



    }
}
