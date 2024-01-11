package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import base.PageContext;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class HeaderPage{
	private PageContext context;
	public HeaderPage(PageContext context) {
		// TODO Auto-generated constructor stub
		this.context = context;
	}
	
	
	
	@Given("user click on the login link")
	public void userClickOnTheLoginLink() {
		context.getDriver().findElement(By.xpath("//span[text()='Login']")).click();

	}
	@Given("user search a {string}")
	public void userSearchA(String book) {
	  
		context.getDriver().findElement(By.cssSelector("input[type=\"search\"]")).sendKeys(book);
	   
	    WebElement options = context.getDriver().findElement(By.xpath("//span[@class=\"mat-option-text\"]"));
		   context.getWait().until(ExpectedConditions.visibilityOf(options)).click();

	}
	@Then("cart badge should be updated")
	public void cartBadgeShouldBeUpdated() {
		WebElement snackbar = context.getDriver().findElement(By.cssSelector("div[class=\"cdk-overlay-container\"]"));
		context.getWait().until(ExpectedConditions.visibilityOf(snackbar));
		context.getWait().until(ExpectedConditions.invisibilityOf(snackbar));

         String text = context.getDriver().findElement(By.cssSelector("#mat-badge-content-0")).getText();
           System.out.println("no:of books in cart " + text);
          Assert.assertEquals(Integer.parseInt(text) > 0, true);
		//driver.quit();
	}
}
