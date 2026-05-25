package com.cleartrip.utils;

import com.aventstack.extentreports.ExtentReports;

import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {

    static ExtentReports extent;

    public static ExtentReports getReport() {

        if(extent == null) {

            ExtentSparkReporter spark =

                    new ExtentSparkReporter(
                            "test-output/ExtentReport.html");

            spark.config()
                    .setReportName(
                            "Cleartrip Automation Report");

            spark.config()
                    .setDocumentTitle(
                            "Automation Test Results");

            extent =
                    new ExtentReports();

            extent.attachReporter(
                    spark);
        }

        return extent;
    }
}