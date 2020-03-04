package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertControl {
    public static void main(String[] args) {
        WebDriver driver= DriverSingleton.getDriver();
        WebDriverWait wait=DriverSingleton.getDriverWait();


        try {
            driver.get("http://jsbin.com/usidix/1");
            driver.findElement(By.cssSelector("input[value=\"Go!\"]")).click();
            String alertMessage = driver.switchTo().alert().getText();
            System.out.println(alertMessage);
            driver.switchTo().alert().accept();
            driver.manage().getCookies().stream().forEach(System.out::println);
        }
        catch (Exception e ){
            e.printStackTrace();
        }
        finally {

        }
    }
}
