package hw10Q2selenium;
/*Create a package "hw10Q2selenium" inside the Selenium project and execute the remaining. Read the question very carefully. Create a class and give a name. choose a website (from the project list, you can use multiple website to show below messages, just create different class) and try to use the below methods. get(), maximize(), click(), isDisplayed(), isEnabled(), isSelected(), navigate(), sendKeys(). Also use all types of locator which are unique (1 of 1).
*/
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnitedHealth {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\shaki\\eclipse-workspace\\SeleniumMethod\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.uhc.com/");
		Thread.sleep(5000);
		WebElement medicare = driver.findElement(By.xpath("(//a[@class='color-blueDark lg-color-white size-14'])[1]"));
		medicare.click();
	

		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.quit();
	}

}
