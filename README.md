# Aldi_Testing_Project

This is a project to verify outcome of Aldi Login functionality entering different inputs as <b>Username</b> and <b>Password </b>.
Automatizing actions from user, using Webdriver, Selenium and Java. Presenting all tests on Google Chrome. 

Also, you will be able to find manual testing Test Case uploaded under name  "Aldi-login-test-caseCase.xlsx" proving all Test Scenarios possible, comparing expected results and actual results, preconditions, test data and postconditions of the test run.

## Clone Project

$ git clone https://github.com/JoseMMorales/Aldi_Login_Testing.git

$ cd Aldi_Login_Testing/

## Built with

* Webdriver
* Java JDK 13
* Eclipse IDE 2019‑09
* Selenium Java Client 3.141.59

## Installation

1. First step would be to install Java JDK 13 in your system. Download <a href = "https://www.oracle.com/technetwork/java/javase/downloads/index.html">here</a> to start setting up.

![image](https://1.bp.blogspot.com/-3oAtLkgP0t8/XZSCy2IkKII/AAAAAAAAC_Y/WBKGmNN0l6o3EMkNuPcKY-5SXLnsPgAZgCLcBGAsYHQ/s1600/java-download.png)

2. Next step would be to download latest version of "Eclipse IDE for Java Developers" which can be downloaded <a href = "https://www.eclipse.org/downloads/">here</a>

![image](https://www.iri.com/blog/wp-content/uploads/2012/06/eclipse-logo-730x350.png)

### Steps:

-Download an exe file named "eclipse-inst-win64"
-Click Eclipse IDE for Java Developers
-Click folder icon and click install
-After installation procedure, click on Launch

3. Download Selenium Java Client Driver <a href = "https://selenium.dev/">here</a> to finish with installation

![image](https://toolsqa.com/wp-content/uploads/2014/02/Download-Webdriver-Java-Client-1.png)

Selenium will be downloaded in ZIP file named "selenium-2.25.0.zip". You need to extract contact and keep in your drive (C:)

## Chromedriver 

Install ChromeDriver from here and add its location to your system <a href = "http://chromedriver.chromium.org/">PATH</a>

* Chromedriver.exe

## After installation you need to Configure Eclipse with WebDriver.

- Accept work space as the default location.

- Create a new project <b>File > New > Java Project.</b>

- New window will pop up in your screen.
  Add steps below:

    1.Project Name

    2.Use default location

    3.Use default execution JRE

    4.Select layout project option

    5.Click on Finish button

- Right-click on the new project, click new and click new Package.

- Enter name of the package and click Finish button.
 
- Create a new Java class by right-clicking on newpackage <b> New > Class, </b> creating "MyClass".

- Name the class and Click finish button.

## Last Step is Building path to get Selenium WebDriver's into Java

- Right-click on "newproject" and select Properties.

- On the Properties dialog, click "Java Build Path".

- Click Libraries tab.
  
- Click "Add External JARs.."

- Pop up window will be open. 

- Select the JAR files you want to add.

* <b>client-combined-3.141.59.jar</b>

- Click on OK.

- Click lib folder to select JAR to add.

* <b>okio-1.14.0.jar

* okhttp-3.11.0.jar

* guava-25.0-jre.jar

* commons-exec-1.3.jar

* byte-buddy-1.8.15.jar</b>

- Click on OK.

- Click "Apply and Close" button.

## You can also follow up complete installation and setting up on link below:

https://www.guru99.com/installing-selenium-webdriver.html

# Test

## Run an example test

cd src/TC1_ValUser_ValPass_LogOut.java

cd src/TC2_ValUser_InvPass.java

cd src/TC3_ValUser_BlankPass.java

cd src/TC4_InvUser_ValPass.java

cd src/TC5_InvUser_InvPass.java

cd src/TC6_InvUser_BlankPass.java

cd src/TC7_BlankUser_ValPass.java

cd src/TC8_BlankUser_InvPass.java

cd src/TC9_BlankUser_BlankPass.java

## Locators, constractor, methods and commands used in the project:

ID Locator:

Tag Name Locator:

Link Text Locator:

XPath Locator:

click()

close()

manage()

window()

maximize()

get()

findElement(By, by)

sendKeys()

elementToBeClickable(By,)

ExpectedConditions()

WebDriverWait()
