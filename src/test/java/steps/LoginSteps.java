//package steps;
//
//import java.time.Duration;
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver.Options;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import cucumber.api.java.en.And;
//import cucumber.api.java.en.But;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//import drivers.DriversInstance;
//import hooks.Hooks;
//import io.github.bonigarcia.wdm.WebDriverManager;
//
//public class LoginSteps extends DriversInstance{
//
//
//	
//	@Given("user click on the login link")
//	public void userClickOnTheLoginLink() {
//		driver.findElement(By.xpath("//span[text()='Login']")).click();
//
//	}
//
//
//	@When("user click on the login button")
//	public void userClickOnTheLoginButton() {
//		driver.findElement(By.cssSelector("button[color=\"primary\"]")).click();
//	}
//
//
//	@Then("Login should be success")
//	public void loginShouldBeSuccess() {
//		WebElement ele = driver.findElement(By.xpath("//button[contains(@class,\"mat-focus-indicator mat-menu-trigger \")]//span[1]"));
//		wait.until(ExpectedConditions.visibilityOf(ele));
//		System.out.println("login label" + ele);
//		
//	}
//
//
//	@But("Login should be failed")
//	public void loginShouldBeFailed() {
//		String error = driver.findElement(By.id("mat-error-0")).getText();
//		System.out.println("error" + error);
//		
//
//	}
//	
//	@Given("user enter the username as {string}")
//	public void userEnterTheUsernameAs(String username) {
//		driver.findElement(By.cssSelector("input[formcontrolname=\"username\"]")).sendKeys(username);
//	}
//
//	@Given("user enter the password as {string}")
//	public void userEnterThePasswordAs(String password) {
//		driver.findElement(By.cssSelector("input[formcontrolname=\"password\"]")).sendKeys(password);
//	}
//
//
//
//}
