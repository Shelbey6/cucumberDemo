package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import base.DriversInstance;
import base.PageContext;
import cucumber.api.java.en.When;

public class HomePage {
	private PageContext context;
	public HomePage(PageContext context) {
		// TODO Auto-generated constructor stub
		this.context = context;
		
	}
	@When("user add the book to the cart")
	public void userAddTheBookToTheCart() {
	    WebElement addToaCrt = context.getDriver().findElement(By.cssSelector("button[color=\"primary\"]"));
		   context.getWait().until(ExpectedConditions.elementToBeClickable(addToaCrt)).click();
	}
}
