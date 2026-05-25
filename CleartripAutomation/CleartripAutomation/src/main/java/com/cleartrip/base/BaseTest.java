package com.cleartrip.base;

import com.cleartrip.utils.ConfigReader;

import com.cleartrip.utils.DriverFactory;

import org.openqa.selenium.WebDriver;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import com.cleartrip.utils.ExtentManager;

public class BaseTest {

    protected WebDriver driver;
    protected ExtentReports extent;

    protected ExtentTest test;

    ConfigReader config =
            new ConfigReader();

    @BeforeMethod

    public void setup() {

        driver =
                DriverFactory.getDriver();

        driver.navigate().to(
                config.getUrl());
        extent =
                ExtentManager.getReport();
    }

    @AfterMethod

    public void tearDown() {

        if(driver != null) {

        	extent.flush();
            driver.quit();
        }
    }
}