package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;

public class Main {

    public static void main(String[] args) {
        WebDriver driver =DriverSingleton.getDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10).getSeconds());
        try {
            driver.get("https://google.com/ncr");
            System.err.println(driver.getTitle());
            driver.findElement(By.name("q")).sendKeys("cheese" + Keys.ENTER);
            WebElement firstResult = wait.until(presenceOfElementLocated(By.cssSelector("h3>div")));
            WebElement lastresult=wait.until(presenceOfElementLocated(By.id("res")));
            System.out.println("before searching ");
            System.out.println(firstResult.getAttribute("textContent"));

            System.out.println(lastresult.getAttribute("textContent"));
            System.out.println("after searching");

        } finally {
            //driver.quit();
        }
    }
}
