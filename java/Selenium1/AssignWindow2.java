package Selenium1;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AssignWindow2 {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.driver.chrome","E:\\Sukhada\\automationClass\\Selenium\\setup\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(7000);
		WebElement w1=driver.findElement(By.xpath("//div[@aria-label='Electronics']"));
		Actions ac =new Actions(driver);
		ac.moveToElement(w1).build().perform();
		//Move to gaming
		WebElement w2=driver.findElement(By.linkText("Gaming"));
		ac.moveToElement(w2).build().perform();
		driver.findElement(By.linkText("Gaming Mouse")).click();
		
		driver.findElement(By.xpath(
				"//a[@rel='noopener noreferrer'][@class='wjcEIp'][@title='Logitech B175 / Optical Tracking, 12-Months Battery Life, Ambidextrous Wireless Optical Mouse']"))
				.click();

		Thread.sleep(3000);

		// capture the price
		WebElement wbPrice = driver.findElement(By.xpath("//div[text()='₹479']"));
		String p1 = wbPrice.getText();
		System.out.println("Price of prod1" + p1);

//		take screenshot
		TakesScreenshot ts = (TakesScreenshot) driver;


		File src1 = ts.getScreenshotAs(OutputType.FILE);

		File dest1 = new File(System.getProperty("user.dir") + "\\Screenshots\\flip2.png");

		FileUtils.copyFile(src1, dest1);
		String parentWinId = driver.getWindowHandle();

		Set<String> allWinId = driver.getWindowHandles();

		// capture child window id
		String childWinId = null;

		for (String abc : allWinId) {
			if (!abc.equals(parentWinId)) {
				childWinId = abc;
			}
		}

//			go to main window or search window
		driver.switchTo().window(parentWinId);

		Thread.sleep(3000);
//			click on 2nd item
		driver.findElement(By.xpath("//a[@title='HP S1000 Silent / Lightweight, upto 1600 DPI Wireless Optical Mouse']")).click();

		// capture child window id
		String childWinId1 = null;

		for (String abc : allWinId) {
			if (!abc.equals(parentWinId) || abc.equals(childWinId)) {
				childWinId1 = abc;
			}
		}

		Thread.sleep(3000);
//			capture the price
		WebElement wbPrice2 = driver.findElement(By.xpath("//div[text()='₹499'][@class='Nx9bqj'][1]"));
		String p2 = wbPrice2.getText();
		System.out.println("Price of prod2" + p2);

		// take screenshot
		File src2 = ts.getScreenshotAs(OutputType.FILE);

		File dest2 = new File(System.getProperty("user.dir") + "\\Screenshots\\flip3.png");

		FileUtils.copyFile(src2, dest2);

//
//			compare the captured price
		if (p1.equals(p2)) {
			System.out.println("TC pass");
		} else {
			System.out.println("TC fail");
		}

        
	}

}