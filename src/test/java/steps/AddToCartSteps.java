//package steps;
//
//import java.time.Duration;
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver.Options;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.Assert;
//
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//import drivers.DriversInstance;
//import io.github.bonigarcia.wdm.WebDriverManager;
//
//public class AddToCartSteps extends DriversInstance {
//	
////	WebDriver driver;
//	//WebDriverWait wait;
//	
////	@Given("user navigate to the book application")	
////	public void userNavigateToTheBookApplication() {
////		WebDriverManager.chromedriver().setup();
////		driver = new ChromeDriver();
////		//driver = new EdgeDriver();
////		driver.manage().window().maximize();
////		driver.get("https://bookcart.azurewebsites.net/");
////		wait = new WebDriverWait(driver, Duration.ofSeconds(25));
////		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));	
////		System.out.println(driver.getTitle());
////
////	}
//	
//	
//	@Given("user should login with {string} and {string}")
//	public void userShouldLoginWithAnd(String username, String password) throws InterruptedException {
//		driver.findElement(By.xpath("//span[text()='Login']")).click();
//        Thread.sleep(2000);
//		driver.findElement(By.cssSelector("input[formcontrolname=\"username\"]")).sendKeys(username);
//		driver.findElement(By.cssSelector("input[formcontrolname=\"password\"]")).sendKeys(password);
//		driver.findElement(By.cssSelector("button[color=\"primary\"]")).click();
//		Thread.sleep(2000);
//	    
//	}
//
//	@Given("user search a {string}")
//	public void userSearchA(String book) {
//	  
//		driver.findElement(By.cssSelector("input[type=\"search\"]")).sendKeys(book);
//	   
//	    WebElement options = driver.findElement(By.xpath("//span[@class=\"mat-option-text\"]"));
//		   wait.until(ExpectedConditions.visibilityOf(options)).click();
//
//	}
//
//	@When("user add the book to the cart")
//	public void userAddTheBookToTheCart() {
//	    WebElement addToaCrt = driver.findElement(By.cssSelector("button[color=\"primary\"]"));
//		   wait.until(ExpectedConditions.elementToBeClickable(addToaCrt)).click();
//
////	    try {
////			Thread.sleep(1000);
////		} catch (InterruptedException e) {
////			// TODO Auto-generated catch block
////			e.printStackTrace();
////		}
//	}
//
//	@Then("cart badge should be updated")
//	public void cartBadgeShouldBeUpdated() {
//		WebElement snackbar = driver.findElement(By.cssSelector("div[class=\"cdk-overlay-container\"]"));
//		wait.until(ExpectedConditions.visibilityOf(snackbar));
//		wait.until(ExpectedConditions.invisibilityOf(snackbar));
//
//         String text = driver.findElement(By.cssSelector("#mat-badge-content-0")).getText();
//           System.out.println("no:of books in cart " + text);
//          Assert.assertEquals(Integer.parseInt(text) > 0, true);
//		//driver.quit();
//	}
//	
//
//}
