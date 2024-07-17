package NonStaticMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Makemytrip {
	
	
	public void maketripMethod(String fromcity) throws InterruptedException
	{
		// Set up ChromeDriver
		        WebDriver driver = new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

				// Open URL
				driver.get("https://www.makemytrip.com/");

				driver.manage().window().maximize();
				
				Thread.sleep(5000);
				
				driver.findElement(By.xpath("//a[@href='https://www.makemytrip.com/flights/']")).click();
				driver.findElement(By.id("fromCity")).click();
				driver.findElement(By.xpath("//label[@for='fromCity']")).click();
				WebElement fromCityInput = driver.findElement(By.xpath("//input[@placeholder='From']"));
				fromCityInput.sendKeys(fromcity);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
