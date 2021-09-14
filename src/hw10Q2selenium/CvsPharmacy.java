package hw10Q2selenium;

import org.openqa.selenium.Dimension;

/*/*Create a package "hw10Q2selenium" inside the Selenium project and execute the remaining. Read the question very carefully. Create a class and give a name. choose a website (from the project list, you can use multiple website to show below messages, just create different class) and try to use the below methods. get(), maximize(), click(), isDisplayed(), isEnabled(), isSelected(), navigate(), sendKeys(). Also use all types of locator which are unique (1 of 1).*/

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CvsPharmacy {
	WebDriver driver;

	@BeforeTest
	public void setup() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\shaki\\eclipse-workspace\\SeleniumMethod\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cvs.com/");
		Thread.sleep(3000);
	}

	@Test(enabled = true, priority = 1)
	public void shop() throws InterruptedException {
		WebElement shop = driver.findElement(By.xpath("(//a[@rel='noopener'])[4]"));
		shop.isEnabled();
		Thread.sleep(3000);
		shop.click();
		driver.navigate().back();
		driver.manage().deleteAllCookies();
		Thread.sleep(3000);

	}

	@Test(enabled = true, priority = 2)
	public void search() throws InterruptedException {
		WebElement searchfield = driver.findElement(By.id("cvs-search-input"));
		searchfield.sendKeys("Shampoo");

		Thread.sleep(3000);

	}

	@Test(enabled = true, priority = 3)
	public void navigation() throws InterruptedException {
		Dimension dimension=new Dimension(600,600);
		driver.manage().window().setSize(dimension);
		driver.navigate().to("https://www.facebook.com");
		Thread.sleep(3000);
	}

	@AfterTest
	public void close() {
		driver.quit();
	}

}
