package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import base.PageContext;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginPage {
	private PageContext context;
	public LoginPage(PageContext context) {
		// TODO Auto-generated constructor stub
		this.context = context;
		
	}


	@When("user click on the login button")
	public void userClickOnTheLoginButton() {
		context.getDriver().findElement(By.cssSelector("button[color=\"primary\"]")).click();
	}


	@Then("Login should be success")
	public void loginShouldBeSuccess() {
		WebElement ele = context.getDriver().findElement(By.xpath("//button[contains(@class,\"mat-focus-indicator mat-menu-trigger \")]//span[1]"));
		context.getWait().until(ExpectedConditions.visibilityOf(ele));
		System.out.println("login label" + ele);

	}


	@But("Login should be failed")
	public void loginShouldBeFailed() {
		String error = context.getDriver().findElement(By.id("mat-error-0")).getText();
		System.out.println("error" + error);


	}

	@Given("user enter the username as {string}")
	public void userEnterTheUsernameAs(String username) {
		context.getDriver().findElement(By.cssSelector("input[formcontrolname=\"username\"]")).sendKeys(username);
	}

	@Given("user enter the password as {string}")
	public void userEnterThePasswordAs(String password) {
		context.getDriver().findElement(By.cssSelector("input[formcontrolname=\"password\"]")).sendKeys(password);
	}
	
	@Given("user should login with {string} and {string}")
	public void userShouldLoginWithAnd(String username, String password) throws InterruptedException {
		context.getDriver().findElement(By.xpath("//span[text()='Login']")).click();
        Thread.sleep(2000);
		context.getDriver().findElement(By.cssSelector("input[formcontrolname=\"username\"]")).sendKeys(username);
		context.getDriver().findElement(By.cssSelector("input[formcontrolname=\"password\"]")).sendKeys(password);
		context.getDriver().findElement(By.cssSelector("button[color=\"primary\"]")).click();
		Thread.sleep(2000);
	    
}
}
