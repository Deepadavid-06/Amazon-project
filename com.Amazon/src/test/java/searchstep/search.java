package searchstep;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class search {
	RemoteWebDriver driver;
	@Given("user open amazon website")
	public void user_open_amazon_website() {
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    }
	@When("user search for {string}")
	public void user_search_for(String string) {
		driver.findElement(By.id("twotabsearchtextbox")).click();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("saree");
	   
	}
	@Then("user see the expected result")
	public void user_see_the_expected_result() {
		driver.findElement(By.xpath("//input[@id=\"nav-search-submit-button\"]")).click();
	    driver.quite();
	}
}


