package hw11Q2selenium;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Moderna {
	WebDriver driver;
	
    @BeforeTest
    public void setup() {
    	System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\shaki\\eclipse-workspace\\SeleniumMethod\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.modernatx.com/");
    }
    
   @Test (enabled = true,priority = 1)
   public void search() throws InterruptedException {
	   WebElement searchfield =driver.findElement(By.name("keys_1"));
	   searchfield.sendKeys("vaccine");
	   Thread.sleep(3000);
   }
	@Test (enabled = true, priority = 2)
	public void searchbarclick() throws InterruptedException {
		WebElement searchClick =driver.findElement(By.id("edit-submit-1"));
		searchClick.click();
		Thread.sleep(8000);
		driver.findElement(By.xpath("//a[text()='Home']")).click();
		Thread.sleep(5000);
	}
	@Test (enabled = true,priority = 3)
	public void actionPipeline() throws InterruptedException {
		Actions actions=new Actions(driver);
		driver.manage().window().fullscreen();
		WebElement pipeline =driver.findElement(By.xpath("(//a[text()='Pipeline'])[2]"));
		Thread.sleep(4000);
		actions.moveToElement(pipeline).build().perform();
		Thread.sleep(4000);
	}
	@Test (enabled = true, priority = 4)
	public void getTextInvestors() {
		WebElement investors=driver.findElement(By.xpath("(//a[text()='Investors'])[2]"));
		investors.getText();
		System.out.println("\nThe text of this web element is: "+ investors.getText());
		
	}
	
    
	@AfterTest
	public void tearup() {
		driver.close();
	}
}
