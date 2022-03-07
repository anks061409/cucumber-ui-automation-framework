
# cucumber-java
starter project for cucumber using selenium and Java


Introduction
------------
This project is made for anyone who is looking for a starting point for writing functional tests using Cucumber and Java.

This project was written using Eclipse IDEA Community Edition.   

Project Packages
-----
* PageObjects:  
Contains class files for each web page being tested.  Page element definitions / mappings, and functions for interacting with page elements.
 
* Initialize:  
Contains helper function to instantiate WebDriver to the appropriate browser type.  WebDriverExtensions class contains helper functions to handle driver waits for page elements conditions. 

* Helper:  
    - ConfigSettings: contains helper functions for reading config.properties.  
    - IoLibrary: contains helper functions used across tests.  
    - LoggingLibrary: contains custom functions for comparing actual to expected conditions.  
    - TestAssert: Is a custom assert, used to track if a verification point has failed.  The class variable is latched, once set to false it will remain false for the remainder of the test run. 

* CucumberOptions:
Contains the test runner class and function to execute all tests

* Features:  
Feature file containing test scenarios  

* StepDefinitions:  
Contains backgroun, hooks, and step definitions for executing tests


Test web page
-----
   https://sandbox.deltapath.com/


Selenium WebDriver
------------
This project is configured to use Firefox & Chrome WebDriver's.  The default is set to Chrome.  The WebDriver's added to this project will only work on macos.  


Page Object Model
-----
Page object model is used in this framework.  Each web page will have its own java.class and within each class contains page element mappings and functions / methods used to interact /verify a specific web page under test.  


Maven Java Project / Maven Wrapper
-----
This project is written in Java and tests can be executed using Maven commands. 

    ./mvn clean install  


Code Gen Step Definitions
-----
Used to code gen Step Definitions.  
feature file content to Tidy Gherkin and it will auto gen the Java code for Step Definitions   

   
