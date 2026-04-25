package cartstep;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Addtocart {
	WebDriver driver;
	@Given("user open amazon website")
	public void user_open_amazon_website() {
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    
	}
	@Given("search product")
	public void search_product() {
		driver.findElement(By.id("twotabsearchtextbox")).click();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("saree");
		driver.findElement(By.xpath("//input[@id=\"nav-search-submit-button\"]")).click();
	    
	}
	@When("choose the product")
	public void choose_the_product() {
		driver.findElement(By.id("a-autoid-3-announce")).click();
		driver.findElement(By.id("a-autoid-4-announce")).click();
	}
	@Then("click add to cart")
	public void click_add_to_cart() {
		driver.findElement(By.id("nav-cart-text-container")).click();
		driver.quit();
	   
	}


}
