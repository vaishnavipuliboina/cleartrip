package com.cleartrip.utils;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {

    static WebDriver driver;

    public static WebDriver getDriver() {

        ConfigReader config =
                new ConfigReader();

        if(config.getBrowser()
                .equalsIgnoreCase(
                        "chrome")) {

            WebDriverManager
                    .chromedriver()
                    .setup();

            driver =
                    new ChromeDriver();

            driver.manage()
                    .window()
                    .maximize();
        }

        return driver;
    }
}