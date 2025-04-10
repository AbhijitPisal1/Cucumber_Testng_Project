package stepDefinitions;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserLoginStepDefs {
	WebDriver driver;
	
	@Given("User is on Login Page")
	public void user_is_on_login_page() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/login");
	}
	//Parameterization and Scenario Outline
	@When("User enters {string} and {string}")
	public void user_enters_and(String strUser, String strPwd) {
		driver.findElement(By.id("username")).sendKeys(strUser);
		driver.findElement(By.name("password")).sendKeys(strPwd);
		driver.findElement(By.className("radius")).click();
	}
	
	@Then("Should display the success message")
	public void should_display_the_success_message() {
		boolean isValid = driver.findElement(By.cssSelector("div.flash.success")).isDisplayed();
		Assert.assertTrue(isValid);
	}
	
	@When("User enters credentials")
	public void user_enters_credentials() {
		driver.findElement(By.id("username")).sendKeys("tomsmith");
		driver.findElement(By.name("password")).sendKeys("SuperSecretPassword!");
		driver.findElement(By.className("radius")).click();
	}
	
	// DataTable
	@When("User provides credentials")
	public void User_provides_credentials(DataTable userData) {
		List<List<String>> data = userData.asLists();
		String strUser = data.get(0).get(0);
		String strPass = data.get(0).get(1);
		driver.findElement(By.id("username")).sendKeys(strUser);
		driver.findElement(By.name("password")).sendKeys(strPass);
		driver.findElement(By.className("radius")).click();
	}
	
	// DataTable with Maps
		@When("User provides login credentials")
		public void User_provides_login_credentials(DataTable userData) {
			List<Map<String, String>> data = userData.asMaps();
			String strUser = data.get(0).get("username");
			String strPass = data.get(0).get("password");
			driver.findElement(By.id("username")).sendKeys(strUser);
			driver.findElement(By.name("password")).sendKeys(strPass);
			driver.findElement(By.className("radius")).click();
		}
	
	@When("Should display secure message")
	public void Should_display_secure_message(DataTable userData) {
		List<List<String>> data = userData.asLists();
		String strMsg = data.get(0).get(0);
		boolean isValid = driver.findElement(By.xpath("//div[contains(text(),'"+ strMsg +"')]")).isDisplayed();
		Assert.assertTrue(isValid);
		
	}
	
	

}
