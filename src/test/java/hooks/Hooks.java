package hooks;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.PageContext;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.AfterStep;
import cucumber.api.java.Before;
import cucumber.api.java.BeforeStep;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks {
	
	private PageContext context;
	public Hooks(PageContext context) {
		// TODO Auto-generated constructor stub
		this.context=context;
	}
	
    @AfterStep
	public void AfterStep(Scenario scenario) {
        // scenario.write("finished ----Mani");
         
	}
    @BeforeStep
	public void BeforeStep(Scenario scenario) {
    	//scenario.write("started ---Mani");
    	
	}


	@Before
	public void beforeScenario(Scenario scenario) {
		WebDriverManager.edgedriver().setup();
		//driver = new ChromeDriver();
		EdgeDriver driver = new EdgeDriver();
		context.setDriver(driver);
		context.getDriver().manage().window().maximize();
		context.getDriver().get("https://bookcart.azurewebsites.net/");
		WebDriverWait wait = new WebDriverWait(driver, 30);
		context.setWait(wait);
		context.getDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//driver.findElement(By.xpath("//span[text()='Login']")).click();
//		String name = scenario.getName();
//		System.out.println("Scenario " + name);
		System.out.println("ID " + scenario.getId());
		System.out.println("Lines " + scenario.getLines());
		System.out.println("source line " + scenario.getSourceTagNames());
		System.out.println("status " + scenario.getStatus());
		System.out.println("uri " + scenario.getUri());
		System.out.println("class " + scenario.getClass());
	}

//	@After(order=1)
//	public void clearData(Scenario scenario) throws InterruptedException {
//		boolean isFailed = scenario.isFailed();
//		System.out.println("isFailed" + isFailed);
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//button[contains(@class, \"mat-focus-indicator \")]//mat-icon[text()='book']")).click();
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//button[contains(@class, \"mat-focus-indicator \")]/span[text()='Clear cart']")).click();
//		String text = driver.findElement(By.cssSelector("mat-card-title[class=\"mat-card-title\"]")).getText();
//		Assert.assertEquals(text, "Shopping cart is empty");
//	}

	@After
	public void afterScenario(Scenario scenario) throws IOException{
		 
		boolean isFailed = scenario.isFailed();
			System.out.println("isFailed" + isFailed);
              
			byte[] scs = context.getDriver().getScreenshotAs(OutputType.BYTES);
			scenario.embed(scs, "images/png");
              
//			TakesScreenshot ts = (TakesScreenshot) driver;
//		       byte[] src = ts.getScreenshotAs(OutputType.BYTES);
              context.getDriver().quit();
			
//		
	}
	
}
