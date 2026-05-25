package com.cleartrip.utils;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitUtils {

    WebDriver driver;

    WebDriverWait wait;

    ConfigReader config =
            new ConfigReader();

    public WaitUtils(WebDriver driver) {

        this.driver = driver;

        wait =
                new WebDriverWait(
                        driver,
                        Duration.ofSeconds(
                                config.getWait()));
    }

    public void click(By locator) {

        WebElement element =

                wait.until(

                        ExpectedConditions.refreshed(

                                ExpectedConditions
                                        .elementToBeClickable(locator)));

        element.click();
    }

    public void type(By locator,
                     String value) {

        wait.until(
                ExpectedConditions
                        .visibilityOfElementLocated(locator))
                .sendKeys(value);
    }

    public String getText(By locator) {

        return wait.until(
                ExpectedConditions
                        .visibilityOfElementLocated(locator))
                .getText();
    }
}             