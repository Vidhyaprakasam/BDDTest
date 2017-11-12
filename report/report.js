$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Home.feature");
formatter.feature({
  "line": 2,
  "name": "Going to validate NTL Taxi Home Page.",
  "description": "",
  "id": "going-to-validate-ntl-taxi-home-page.",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@HomePage1"
    }
  ]
});
formatter.scenario({
  "line": 3,
  "name": "Validate Home page with valid data.",
  "description": "",
  "id": "going-to-validate-ntl-taxi-home-page.;validate-home-page-with-valid-data.",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "Open Browser as Firefox",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Enter URL as http://www.ntltaxi.com/",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "Enter UserName as Vidhya",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "Enter MobileNo as 9192939495",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Enter PickupAddress as TBM",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Enter DropAdd as Adyar",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Select the vehicle Type as EcoSport",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "Click the BookLater checkBox",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "Dont click Book button",
  "keyword": "But "
});
formatter.match({
  "arguments": [
    {
      "val": "Firefox",
      "offset": 16
    }
  ],
  "location": "CucumberTest.openBrowser(String)"
});
formatter.result({
  "duration": 3909960069,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://www.ntltaxi.com/",
      "offset": 13
    }
  ],
  "location": "CucumberTest.enterURL(String)"
});
formatter.result({
  "duration": 3072907551,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Vidhya",
      "offset": 18
    }
  ],
  "location": "CucumberTest.enterUserName(String)"
});
formatter.result({
  "duration": 407366147,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "9192939495",
      "offset": 18
    }
  ],
  "location": "CucumberTest.enterMoblieNo(String)"
});
formatter.result({
  "duration": 257747310,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "TBM",
      "offset": 23
    }
  ],
  "location": "CucumberTest.enterPicadd(String)"
});
formatter.result({
  "duration": 338758972,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Adyar",
      "offset": 17
    }
  ],
  "location": "CucumberTest.dropAdd(String)"
});
formatter.result({
  "duration": 562132720,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "EcoSport",
      "offset": 27
    }
  ],
  "location": "CucumberTest.vehicleType(String)"
});
formatter.result({
  "duration": 154468759,
  "error_message": "org.openqa.selenium.support.ui.UnexpectedTagNameException: Element should have been \"select\" but was \"option\"\nBuild info: version: \u00272.53.1\u0027, revision: \u0027a36b8b1cd5757287168e54b817830adce9b0158d\u0027, time: \u00272016-06-30 19:26:09\u0027\nSystem info: host: \u0027CHNSHL147852L\u0027, ip: \u0027192.168.0.117\u0027, os.name: \u0027Windows 8.1\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.3\u0027, java.version: \u00271.8.0_72\u0027\nDriver info: driver.version: unknown\r\n\tat org.openqa.selenium.support.ui.Select.\u003cinit\u003e(Select.java:47)\r\n\tat cucumberTest.CucumberTest.vehicleType(CucumberTest.java:68)\r\n\tat ✽.When Select the vehicle Type as EcoSport(Home.feature:10)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "CucumberTest.bookLater()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CucumberTest.bookButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/jpeg", "embedded0.jpg");
formatter.after({
  "duration": 483491620,
  "status": "passed"
});
});