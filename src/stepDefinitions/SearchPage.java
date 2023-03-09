package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import junit.framework.Assert;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class SearchPage {
	
	public WebDriver driver;
	
@Given("user is in search page")
public void testingMultipleScenarioCase1() {
	
}


@Given("user is in search page")
public void testingMultipleScenarioCase2() {
	
}

@Given("user is in search page")
public void navigateSearchPage() {
	
	System.out.println("we are in given section");
		
	System.setProperty("webdriver.chrome.driver", "C:\\eclipse-java-2022-12-R-win32-x86_64\\eclipse-workspace\\FST_Selenium\\resources\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("http://tutorialsninja.com/demo/");
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	
	
}

@When("user enters {string} product")
public void enterProduct(String product) {
	
	System.out.println("we are in when section");
	driver.findElement(By.xpath("//input[@name='search']")).sendKeys(product);
	
}

@And("click on search button")
public void clickSearch() {
	System.out.println("we are in and section");
	driver.findElement(By.xpath("//input[@name='search']/parent::div/span/button")).click();
	
}

@Then("product {string} should be displayed")
public void verifyProduct(String product) {
	
	System.out.println("we are in then section");
	Boolean validate =driver.findElement(By.xpath("//a[text()='"+product+"']")).isDisplayed();
	System.out.println(validate);
	String value = driver.findElement(By.xpath("//a[text()='iPhone']")).getText();
	if(value.contains("iPhone")) {
		System.out.println("Product is dispalyed");}
		else
			System.out.println("Product is not dispalyed");
	
	driver.quit();
}


}
