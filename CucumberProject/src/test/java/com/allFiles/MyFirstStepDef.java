package com.allfilesinsamefolder;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyFirstStepDef 
{	
	@Given("^open facebook page$")//^,$ is used for exact comparison  
	public void open_facebook_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "E:\\Radical\\SeleniumSoftwares\\chromedriver_win32_B39\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
	
	}

	@When("^I enter Login name$")
	public void i_enter_Login_name() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		System.setProperty("webdriver.chrome.driver", "E:\\Radical\\SeleniumSoftwares\\chromedriver_win32_B39\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("neha.pawar93@gmail.com");
	}

	@Then("^I verify textbox value$")
	public void i_verify_textbox_value() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	
	}

}
