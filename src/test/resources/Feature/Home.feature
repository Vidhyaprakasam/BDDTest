@HomePage1
Feature: Going to validate NTL Taxi Home Page.
Scenario: Validate Home page with valid data.
Given Open Browser as Firefox
Then Enter URL as http://www.ntltaxi.com/
Then Enter UserName as Vidhya
And Enter MobileNo as 9192939495
Then Enter PickupAddress as TBM
And Enter DropAdd as Adyar
When Select the vehicle Type as EcoSport
Then Click the BookLater checkBox 
But Dont click Book button




