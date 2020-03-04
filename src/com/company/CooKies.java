package com.company;

import org.openqa.selenium.WebDriver;

public class CooKies {
    public static void main(String[] args) {
        WebDriver driver= DriverSingleton.getDriver();
        driver.manage().getCookies().stream().forEach(System.out::println);

    }
}
