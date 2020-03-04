package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;

public class TestFacebook {
    public static void main(String[] args) {
        WebDriver driver =DriverSingleton.getDriver();
        try {
            String baseUrl = "https://github.com/ismailktami";
            String tagName = "";
            driver.get(baseUrl);

            WebElement firstResult = DriverSingleton.
                                                    getDriverWait()
                                                    .until(presenceOfElementLocated(By.className("p-note user-profile-bio js-user-profile-bio")));

            System.out.println("infos: "+firstResult);
        }
        catch (Exception e ){
            System.err.println("error  "+e.toString());
            new RuntimeException("error") ;
        }

        finally {
            driver.quit();
        }

    }
}
