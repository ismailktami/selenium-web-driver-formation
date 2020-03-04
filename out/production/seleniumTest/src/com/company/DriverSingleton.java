package com.company;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public  class  DriverSingleton {
    private  static WebDriver driver ;

    static public WebDriver getDriver(){
        if(driver==null) {
            System.setProperty("webdriver.gecko.driver","C:\\Users\\iktami\\geckodriver-v0.26.0-win64\\geckodriver.exe");
            driver = new FirefoxDriver();
        }
        return driver;

    }
    static public WebDriverWait getDriverWait(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20).getSeconds());
        return wait;
    }
}
