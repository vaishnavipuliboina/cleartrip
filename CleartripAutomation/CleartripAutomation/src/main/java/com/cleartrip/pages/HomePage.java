package com.cleartrip.pages;

import com.cleartrip.utils.WaitUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class HomePage {

    WebDriver driver;

    WaitUtils wait;

    public HomePage(WebDriver driver) {

        this.driver = driver;

        wait =
                new WaitUtils(driver);
    }

    // Close Popup

    By popupCloseButton =

            By.xpath(
                    "//div[@class='pb-1 px-1 flex flex-middle nmx-1']");
    
    // From City Textbox

    By fromCityTextbox =

            By.xpath(
                    "//input[@placeholder='Where from?']");


    // To City Textbox

    By toCityTextbox =

            By.xpath(
                    "//input[@placeholder='Where to?']");
    By departureDateField =

            By.xpath(
                    "//div[@data-testid='dateSelectOnward']");
    
    By searchFlightsButton =

            By.xpath(
                    "//h4[text()='Search flights']");
    // Round Trip Radio Button


    public void closePopup() {

        try {

            wait.click(
                    popupCloseButton);

        } catch(Exception e) {

            System.out.println(
                    "Popup Not Displayed");
        }
    }
    // Select Round Trip

 
    public void enterFromCity(String city) {

        // Click Textbox

        wait.click(fromCityTextbox);

        // Type City

        wait.type(
                fromCityTextbox,
                city);

        // Select Suggestion

        By suggestion =

                By.xpath(
                        "(//p[contains(text(),'"
                                + city +
                                "')])[1]");

        wait.click(suggestion);
    }
    
    
    public void enterToCity(String city) {

        wait.click(
                toCityTextbox);

        wait.type(
                toCityTextbox,
                city);

        By suggestion =

                By.xpath(
                        "(//p[contains(text(),'"
                                + city +
                                "')])[1]");

        // Retry Handling

        for(int i = 0; i < 3; i++) {

            try {

                wait.click(suggestion);

                break;

            } catch(Exception e) {

                System.out.println(
                        "Retrying Suggestion Click");
            }
        }
    }
    public void selectDepartureDate() {

        // Open Calendar
        wait.click(
                departureDateField);

        // Select Future Date

        By futureDate =
        		

                By.xpath(
                        "//div[contains(@class,'Day-grid')]//div[text()='26']");

        wait.click(futureDate);
    }
    public void clickSearchFlights() {

        wait.click(
                searchFlightsButton);
    }
}