# Mobile App Test Automation with Appium and TestNG

This project demonstrates automated testing of a Android mobile application using Appium and TestNG for TrustWallet Application sample Test Cases.

## Prerequisites

1. **Appium Server**: Install and start the Appium server on your machine.

2. **Mobile Device**: Set up a android development bridge typically known as adb and connect a physical device for testing.
   - Ensure USB debugging is enabled for Android devices.
   - Ensure device is getting detected from adb by using command as "adb devices"

3. **Maven**: Install Maven to manage project dependencies and build the project.

## Getting Started

1. **Clone the Repository:**
   ```bash
   git clone [https://github.com/your-username/your-appium-test-project.git](https://github.com/Karan-QA/AppiumProject.git
   cd clone-appium-test-project
   NOTE*- clone-appium-test-project depends on your local repository

2. **Update Device Specs**:
   i) go to - cd {PROJECT_DIR}\src\test\java\tests\java\com\karora\
   ii) Update "Device name, UDID, Platform Name, Android Platform Version" for the device on which you want to execute the script in Desired capabilities under AbstractTest.java file. below is the sample device information i have added in this project. As of now I have made it hardcoded, as a part of further improvements and refactoring i will pick these settings/device details from one config file.
"deviceName","Galaxy A71";
"udid","RZ8N70LZ9LJ";
"platformName","ANDROID";
"platformVersion", "12";

3. **Run Testng Test**
    Run trustwallet.xml available in project directory(by eclipse,any IDE or command prompt) as testng
