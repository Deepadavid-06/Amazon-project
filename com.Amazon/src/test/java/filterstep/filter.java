package filterstep;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class filter {
	WebDriver driver;
	@Given("user open amazon website")
	public void user_open_amazon_website() {
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    
	}
	@When("user search for {string}")
	public void user_search_for(String string) {
		driver.findElement(By.id("twotabsearchtextbox")).click();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("saree");
	   
	}
	@When("user apply filters {string}")
	public void user_apply_filters(String string) {
		driver.findElement(By.xpath("//input[@id=\"nav-search-submit-button\"]")).click();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement Seemore=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()=\"See more\"]")));
		Seemore.click();
	driver.findElement(By.xpath("//span[text()=\"Border\"]")).click();
	driver.findElement(By.xpath("//div[@style=\"background-image:url('https://m.media-amazon.com/images/G/31/nav2/images/gui/clothing-color-swatches._CB485944675_.png'); background-position:-1000px 0px;\"]")).click();
	}
	@Then("user see the expected result")
	public void user_see_the_expected_result() {
		driver.findElement(By.xpath("//a[@aria-label=\"Apply the filter Cotton to narrow results\"]")).click();
//	driver.quit();
	}
}



