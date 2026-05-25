package com.cleartrip.pages;

import com.cleartrip.utils.WaitUtils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ResultsPage {

    WebDriver driver;

    WaitUtils wait;

    public ResultsPage(WebDriver driver) {

        this.driver = driver;

        wait =
                new WaitUtils(driver);
    }

    // Airline Name

    By airlineName =

            By.xpath(
                    "//p[contains(text(),'IndiGo')]");

    // Flight Price

    By flightPrice =

            By.xpath(
                    "//h2[contains(text(),'₹')]");

    // Verify Airline Displayed

    public boolean isAirlineDisplayed() {

        return driver.findElement(
                airlineName)
                .isDisplayed();
    }

    // Verify Price Displayed

    public boolean isPriceDisplayed() {

        return driver.findElement(
                flightPrice)
                .isDisplayed();
    }
}