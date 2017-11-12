package cucumberTest;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import screenshotgenerator.Screenshotgenerator;

public class CucumberTest {
	WebDriver wd;
	@Given("^Open Browser as (.*)$")
	public void openBrowser(String Browser ) {
	//all functions are non-static here
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vidhya_prakasam\\eclipse-workspace\\WebDriverTest\\browser\\chromedriver.exe");
		wd= new ChromeDriver();
		//System.out.println("I am Opening the Browser"+Browser);
	}
	
	@Then ("^Enter URL as (.*)$")
	public void enterURL(String URL) {
		wd.get(URL);
		//System.out.println("Entering URL"+URL);
	}
	
	@Then ("^Enter UserName as (.*)$")
	public void enterUserName(String userName) {
		WebElement input=wd.findElement(By.xpath("//input[@id='nameid']"));
		input.sendKeys(userName);
		//System.out.println("Entered User Name"+userName);
	}
	
	@cucumber.api.java.en.And ("^Enter MobileNo as (.*)$")
	public void enterMoblieNo(String mobileno) {
		WebElement input1=wd.findElement(By.xpath("//input[@id='mobid']"));
		input1.sendKeys(mobileno);
		//System.out.println("Entered MObile Number"+mobileno);
	}
	@Then ("^Enter PickupAddress as (.*)$")
	public void enterPicadd(String pickup) {
		WebElement input2=wd.findElement(By.xpath("//input[@id='pickid']"));
		input2.sendKeys(pickup);
		//System.out.println("My Pickup Address"+pickup);
	}
	@And ("^Enter DropAdd as (.*)$")
	public void dropAdd(String droploc) {
		WebElement input3=wd.findElement(By.xpath("//input[@id='dropid']"));
		input3.sendKeys(droploc);
		//System.out.println("My Drop Point"+droploc);
	}
	@When ("^Select the vehicle Type as (.*)$")
	public void vehicleType(String vehicleType)
	{
		WebElement input4=wd.findElement(By.xpath("//option[@value='Type 2']"));
		//input4.sendKeys(vehicleType);
		//System.out.println("selecting Vehicle Type"+vehicleType);
		Select s=new Select(input4);
		s.selectByVisibleText(vehicleType);
	
	}
	@Then ("^Click the BookLater checkBox$")
	public void bookLater(){
		WebElement input5=wd.findElement(By.xpath("//input[@id='bookLater']"));
		//System.out.println("Clicking Book Later");
		input5.click();
	}
	@But ("^Dont click Book button$")
	public void bookButton() {
		System.out.println("Confirm Booking");
	}
	@After
	public void teardown(Scenario s) throws IOException {
		Screenshotgenerator.generateScreenshot(wd, s);
		
	}
}
