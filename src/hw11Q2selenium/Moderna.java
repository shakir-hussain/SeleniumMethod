package hw11Q2selenium;
/*
 * Create a package "hw11Q2selenium" inside the Selenium project and execute the remaining. Read the question very carefully. Create a class and give a name. choose a website (from the project list, you can use multiple website to show below messages, just create different class) and try to use the below methods. get(), maximize(), click(), isDisplayed(), isEnabled(), isSelected(), navigate(), sendKeys(). Also use all types of locator which are unique (1 of 1). also implements clear(), close(), quit(), Keys.ENTER, Actions class methods, getText(), fullScreen(), getSize(), deleteAllCookies(), Dimension Class, setSize() methods. */
import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
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
		driver.manage().window().maximize();       // maximize()
		driver.get("https://www.modernatx.com/");  // get method
    }
    
    @Test (enabled = true,priority = 1)
    public void search() throws InterruptedException {
 	   WebElement searchfield =driver.findElement(By.name("keys_1"));
 	   searchfield.sendKeys("vaccine");           //send keys()
 	   Thread.sleep(3000);
    }
 	@Test (enabled = true, priority = 2)
 	public void searchbarclick() throws InterruptedException {
 		WebElement searchClick =driver.findElement(By.id("edit-submit-1"));
 		searchClick.click();
 		Thread.sleep(8000);
 		driver.findElement(By.xpath("//a[text()='Home']")).click(); //click()
 		Thread.sleep(5000);
 	}
 	@Test (enabled = true,priority = 3)
 	public void actionPipeline() throws InterruptedException {
 		Actions actions=new Actions(driver);
 		driver.manage().window().fullscreen();                 //fullScreen method
 		WebElement pipeline =driver.findElement(By.xpath("(//a[text()='Pipeline'])[2]"));
 		Thread.sleep(4000);
 		actions.moveToElement(pipeline).build().perform();   //action class method
 		Thread.sleep(4000);
 	}
 	@Test (enabled = true, priority = 4)
 	public void getTextInvestors() {
 		WebElement investors=driver.findElement(By.xpath("(//a[text()='Investors'])[2]"));
 		investors.getText();                                  //getText()
 		System.out.println("\nThe text of this web element is: "+ investors.getText());
 		
 	}@Test(enabled = true,priority = 5)
 	public void navigation () throws InterruptedException {
 		driver.navigate().to("https://www.amazon.com/");    //navigate()
 		driver.manage().deleteAllCookies();                  //deleteAllCookies()
 		Thread.sleep(3000);
 		driver.manage().window().maximize();
 		Thread.sleep(3000);
 		driver.navigate().back();
 		Thread.sleep(3000);
 		
 	}@Test(enabled = true,priority = 6)
 	public void dimensionSet() throws InterruptedException {
 		Dimension dimension=new Dimension(700,700);
 		driver.manage().window().setSize(dimension);       //dimension class setSize()
 		driver.get("https://www.modernatx.com/");
 		Thread.sleep(3000);
 		driver.manage().window().getSize();
 		System.out.println("Dimension of the window= "+driver.manage().window().getSize());  //getSize()
 		
 		
 		
 	}
 	
     
 	@AfterTest
 	public void tearup() {
 		driver.close();                          //close ()
 	}
 }