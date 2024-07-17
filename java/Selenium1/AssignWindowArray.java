package Selenium1;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class AssignWindowArray {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.driver.chrome","E:\\Sukhada\\automationClass\\Selenium\\setup\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://prafpawar11.github.io/multiplewindows.html");
		Thread.sleep(7000);
		String parentwindow=driver.getWindowHandle();
		driver.findElement(By.name("fname")).sendKeys("sukhada");
		//driver.findElement(By.name("lname")).sendKeys("Shirke");
		//driver.findElement(By.name("address")).sendKeys("Thane");
		//--------------click on fb---------------------------
		driver.findElement(By.linkText("Visit Facebook")).click();
		
		Set<String> allWindow = driver.getWindowHandles();

		// step 7: convert the Set<String> into ArrayList<String>
		ArrayList<String> arr = new ArrayList<String>(allWindow);

		// step 8: switch focus to fb window
		driver.switchTo().window(arr.get(1));
		
		driver.findElement(By.name("firstname")).sendKeys("Sonal");
		driver.findElement(By.name("lastname")).sendKeys("Parab");
		Select sc=new Select(driver.findElement(By.id("day")));
		sc.selectByVisibleText("16");
		
		Select sc1=new Select(driver.findElement(By.id("month")));
		sc1.selectByVisibleText("Oct");
		
		Select sc2=new Select(driver.findElement(By.id("year")));
		sc2.selectByVisibleText("1982");
		driver.switchTo().window(parentwindow);
		driver.findElement(By.name("lname")).sendKeys("Shirke");
		driver.findElement(By.linkText("SauceDemo Link")).click();
		Set<String> allWindow1 = driver.getWindowHandles();
		arr = new ArrayList<String>(allWindow1);

		Thread.sleep(5000);
		// step 15: switch focus to SuceDemo window
		driver.switchTo().window(arr.get(2));
		Thread.sleep(5000);
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		
		//takescreenshots ts=new takescreenshots(driver);
		TakesScreenshot ts = (TakesScreenshot) driver;
         File src1 = ts.getScreenshotAs(OutputType.FILE);
        File dest1 = new File(System.getProperty("user.dir") + "\\Screenshots\\swaglab.png");
         FileUtils.copyFile(src1, dest1);
         Set<String> allWindow2 = driver.getWindowHandles();
 		arr = new ArrayList<String>(allWindow2);

 		Thread.sleep(5000);
 		// step 15: switch focus to fb window
 		driver.switchTo().window(arr.get(1));
 		//------------------------------------------------------tke full snap------
 		AShot a = new AShot();

		// step 5: use shootingStrategy() method to capture the visible part of the web
		// page screenshot and use viewPortPasting() method from ShootingStrategies
		// class to capture
		// screenshot of remaining web page by scrolling web page and by mentioning
		// scrolling to wait


		a.shootingStrategy(ShootingStrategies.viewportPasting(1000));
		Screenshot s = a.takeScreenshot(driver);
		BufferedImage scr = s.getImage();

		// step 8: store screenshot in destination location by creating object of File
		// class
		File f = new File(System.getProperty("user.dir") + "\\Screenshots\\fullfbpge.png");

		// step 8: copy the screenshot from source to destination location using write()
		// method and
		// by passing source location and image type and destination location.

		ImageIO.write(scr, "PNG", f);
		//-------------------switch to main window------------------
		
		driver.switchTo().window(parentwindow);



 		
		
	}

}
