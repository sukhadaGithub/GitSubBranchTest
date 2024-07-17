package JavascriptExecutor;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.driver.chrome","E:\\Sukhada\\automationClass\\Selenium\\setup\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//window open using javascriptexecutor
		JavascriptExecutor js = (JavascriptExecutor) driver;

		// use executeScript() method by passing window.open('expected url')
		js.executeScript("window.location='https://www.saucedemo.com/'");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
       //----------------------screenshots--------------------------
        
        TakesScreenshot ts = (TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dest =new File(System.getProperty("user.dir")+"\\javascript\\sucedemo.png");
		FileUtils.copyFile(src, dest);
		Thread.sleep(5000);
		js.executeScript("document.getElementById('user-name').value='standard_user';");
		js.executeScript("document.getElementById('user-name').value='secret_sauce';");
		//js.executeScript("document.getElementById('login-button').click();");
		driver.findElement(By.id("login-button")).click();
		

	}

}
