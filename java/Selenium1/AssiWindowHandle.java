package Selenium1;

import java.awt.Desktop.Action;
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

public class AssiWindowHandle {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		  System.setProperty("webdriver.driver.chrome","E:\\Sukhada\\automationClass\\Selenium\\setup\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://prafpawar11.github.io/multiplewindows.html");
			Thread.sleep(7000);
			String parentwindow=driver.getWindowHandle();
			driver.findElement(By.name("fname")).sendKeys("sukhada");
			Thread.sleep(5000);
			TakesScreenshot ts = (TakesScreenshot)driver;
			File src=ts.getScreenshotAs(OutputType.FILE);
			File dest =new File(System.getProperty("user.dir")+"\\Screenshots\\b1.png");
			FileUtils.copyFile(src, dest);
            Thread.sleep(5000);
            //-----------------------click on saucedemo--------------------
            driver.findElement(By.linkText("SauceDemo Link")).click();
            Thread.sleep(8000);
            Set<String> allWindowId = driver.getWindowHandles();
            String swaglab=null;
            for(String abc: allWindowId)
			{
					//it check condition as if parentWindowId not equal to other id number then run the if block of code.
					if(!abc.equals(parentwindow))
					{
							swaglab=abc;
					}
			}
            driver.switchTo().window(swaglab);



            driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
            driver.findElement(By.id("password")).sendKeys("secret_sauce");
            driver.findElement(By.id("login-button")).click();
            Thread.sleep(5000);
            TakesScreenshot ts1 = (TakesScreenshot)driver;
			File src1=ts1.getScreenshotAs(OutputType.FILE);
            File dest1 =new File(System.getProperty("user.dir")+"\\Screenshots\\b2.png");
            FileUtils.copyFile(src1, dest1);
            driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
            driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt")).click();
            driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket")).click();
            Thread.sleep(5000);
            driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
            
            TakesScreenshot ts2 = (TakesScreenshot)driver;
			File src2=ts2.getScreenshotAs(OutputType.FILE);
            File dest2 =new File(System.getProperty("user.dir")+"\\Screenshots\\cart.png");
            FileUtils.copyFile(src2, dest2);
            Thread.sleep(7000);
            driver.findElement(By.id("checkout")).click();
            Thread.sleep(5000);
            driver.findElement(By.id("first-name")).sendKeys("Sonal");
            driver.findElement(By.id("last-name")).sendKeys("Parab");
            driver.findElement(By.id("postal-code")).sendKeys("852364");
            driver.findElement(By.id("continue")).click();
            driver.findElement(By.id("finish")).click();
            TakesScreenshot ts3 = (TakesScreenshot)driver;
			File src3=ts3.getScreenshotAs(OutputType.FILE);
            File dest3 =new File(System.getProperty("user.dir")+"\\Screenshots\\finish.png");
            FileUtils.copyFile(src3, dest3);
            //-----------------------swith to main window-------------------
            driver.switchTo().window(parentwindow);
            driver.findElement(By.name("lname")).sendKeys("shirke");
            TakesScreenshot ts4 = (TakesScreenshot)driver;
			File src4=ts4.getScreenshotAs(OutputType.FILE);
            File dest4 =new File(System.getProperty("user.dir")+"\\Screenshots\\MainWindow.png");
            FileUtils.copyFile(src4, dest4);
            //---------------click on Cogmento link---------------------------
            driver.findElement(By.linkText("cogmento CRM Link")).click();
            
            Thread.sleep(5000);
            String cogmento=null;
            Set<String> allWindowIDNumber = driver.getWindowHandles();
            for(String abc1: allWindowIDNumber)
			{
					//it check condition as if parentWindowId not equal to other id number then run the if block of code.
					if(!(abc1.equals(parentwindow))||abc1.equals(swaglab))
					{
						cogmento=abc1;
					}
			}
            driver.switchTo().window(cogmento);
            Thread.sleep(5000);
            driver.findElement(By.name("email")).sendKeys("prafulp1010@gmail.com");
            driver.findElement(By.name("password")).sendKeys("Pr@ful0812");
            driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
            Thread.sleep(7000);
            TakesScreenshot ts5 = (TakesScreenshot)driver;
			File src5=ts5.getScreenshotAs(OutputType.FILE);
            File dest5 =new File(System.getProperty("user.dir")+"\\Screenshots\\Cogmento CRM_Link.png");
            FileUtils.copyFile(src5, dest5);
            WebElement wb = driver.findElement(By.id("main-nav"));
    		Actions act = new Actions(driver);
    		act.moveToElement(wb).build().perform();
    		driver.findElement(By.linkText("Contacts")).click();
    		driver.findElement(By.xpath("//a[@href='/contacts/new']")).click();
    		driver.findElement(By.name("first_name")).sendKeys("Sukhada");
    		driver.findElement(By.name("last_name")).sendKeys("Shirke");
    		driver.findElement(By.name("do_not_call")).click();
    		
    		
//11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111   		


            
            
            
            
            


	}

	

}
