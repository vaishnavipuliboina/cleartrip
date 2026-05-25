package com.cleartrip.tests;

import com.cleartrip.base.BaseTest;

import com.cleartrip.pages.HomePage;
import com.cleartrip.pages.ResultsPage;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.aventstack.extentreports.Status;

public class CleartripTest extends BaseTest {

    @Test

    public void cleartripTest()
            throws InterruptedException {

        // Home Page Object

        HomePage home =

                new HomePage(driver);

        // Results Page Object

        ResultsPage results =

                new ResultsPage(driver);
        
        test = extent.createTest(
                "Cleartrip Flight Search Test");

        // Close Popup

        home.closePopup();
        
       // home.selectRoundTrip();
       

     
        // Enter From City

        home.enterFromCity(
                "Hyderabad");

        

        // Enter To City

        home.enterToCity(
                "Delhi");

       

        // Select Departure Date

        home.selectDepartureDate();


        // Search Flights

        home.clickSearchFlights();

        System.out.println(
                "Flights Search Completed");

        // Validate Airline Displayed

        Assert.assertTrue(
                results.isAirlineDisplayed());

        System.out.println(
                "Airline Displayed Successfully");

        

        // Validate Price Displayed

        Assert.assertTrue(
                results.isPriceDisplayed());

        System.out.println(
                "Price Displayed Successfully");
        test.info("Popup Closed");

        test.info("From City Selected");

        test.info("To City Selected");

        test.info("Departure Date Selected");

        test.info("Search Flights Clicked");

        test.pass("Airline Displayed Successfully");

        test.pass("Price Displayed Successfully");

       
    }
}