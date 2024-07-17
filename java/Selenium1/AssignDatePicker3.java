package Selenium1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AssignDatePicker3 {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		
		// step 1: up casting
		WebDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		// step 2: open a url
		driver.get("https://www.redbus.in/");

		// step 3: find the date object or icon and click it
		WebElement wb = driver.findElement(By.id("onwardCal"));
		wb.click();

		Thread.sleep(4000);
		// step 4: run infinite loop to find the expected month and year
		while (true) {
			Thread.sleep(2000);
			// step 5: find month and year and capture actual month and year
			String actualMonthAndYear = driver.findElement(By.xpath("(//div[@class='DayNavigator__IconBlock-qj8jdz-2 iZpveD'])[2]")).getText();

			// step 6: compare actual month and year with expected month and year
			if (actualMonthAndYear.contains("Mar 2025")) {
				// step 7: break the loop
				break;
			} else {
				// step 8: find next button and click on it
				driver.findElement(By.xpath("(//div[@class='DayNavigator__IconBlock-qj8jdz-2 iZpveD'])[3]")).click();
			}
		}

		// step 9: find all dates
		List<WebElement> listDates = driver.findElements(By.xpath("//span[@class='DayTiles__CalendarDaysSpan-sc-1xum02u-1 dkWAbH' or @class='DayTiles__CalendarDaysSpan-sc-1xum02u-1 bwoYtA']"));

		// step 10: iterate all dates
		for (WebElement date : listDates) {
			// ste 12: capture actual date
			String actualDate = date.getText();

			// step 13: compare actual Date with expected date
			if (actualDate.equalsIgnoreCase("10")) {
				// step 14: click on date
				date.click();
				//step 15: break the loop
				break;
			}
		}

	}

}
