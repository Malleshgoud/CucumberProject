$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/main/resources/Features/Login.feature");
formatter.feature({
  "name": "Validate Login Functionality of the MyStore Application",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Validate Login Scenario",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User is on home page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.stepDefinition.LoginSteps.launchBrower()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on Login button",
  "keyword": "When "
});
formatter.match({
  "location": "com.stepDefinition.LoginSteps.click_signIn()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: Cannot locate an element using link text\u003dSign in\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027MALLI-PC\u0027, ip: \u0027192.168.2.12\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u002711.0.11\u0027\nDriver info: driver.version: RemoteWebDriver\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:327)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByLinkText(RemoteWebDriver.java:380)\r\n\tat org.openqa.selenium.By$ByLinkText.findElement(By.java:220)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat com.stepDefinition.LoginSteps.click_signIn(LoginSteps.java:42)\r\n\tat ✽.User click on Login button(file:///F:/Selenium_Practice/Cucumber_project/src/main/resources/Features/Login.feature:7)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "User enter UserName and Password",
  "keyword": "And "
});
formatter.match({
  "location": "com.stepDefinition.LoginSteps.login_test()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User should be navigate Index page",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepDefinition.LoginSteps.user_should_be_navigate_index_page()"
});
formatter.result({
  "status": "skipped"
});
});