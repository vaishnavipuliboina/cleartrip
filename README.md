# Cleartrip Automation Framework

## Project Overview

This project automates the flight search functionality of the Cleartrip website using Selenium WebDriver with Java.

The framework follows:
- Page Object Model (POM)
- Layered Framework Architecture
- Explicit Waits
- Reusable Utilities
- Extent Reports

---

# Features

- Open Cleartrip website
- Close login popup
- Enter From and To cities
- Handle dynamic auto-suggestions
- Select departure date
- Search flights
- Validate airline and flight price
- Generate HTML Extent Reports

---

# Technologies Used

- Java
- Selenium WebDriver
- TestNG
- Maven
- Extent Reports
- WebDriverManager

---

# Framework Architecture

```text
CleartripAutomation
│
├── src/main/java
│   ├── com.cleartrip.base
│   │      └── BaseTest.java
│   │
│   ├── com.cleartrip.pages
│   │      ├── HomePage.java
│   │      └── ResultsPage.java
│   │
│   └── com.cleartrip.utils
│          ├── DriverFactory.java
│          ├── WaitUtils.java
│          ├── ConfigReader.java
│          └── ExtentManager.java
│
├── src/test/java
│   └── com.cleartrip.tests
│          └── CleartripTest.java
│
├── src/test/resources
│      └── config.properties
│
├── pom.xml
├── testng.xml
└── README.md
