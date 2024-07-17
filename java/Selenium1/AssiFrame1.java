package Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssiFrame1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		 System.setProperty("webdriver.driver.chrome","E:\\Sukhada\\automationClass\\Selenium\\setup\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
			driver.manage().window().maximize();
			Thread.sleep(7000);
			driver.switchTo().frame("frame1");
            WebElement w1=driver.findElement(By.xpath("//input[@type='text']"));
            w1.sendKeys("java");
            
            
            driver.switchTo().frame("frame3");
            Thread.sleep(5000);
            driver.findElement(By.id("a")).click();
            Thread.sleep(5000);
            
            
            driver.switchTo().defaultContent();
            driver.switchTo().frame("frame2");
            Thread.sleep(5000);
            Select sel=new Select(driver.findElement(By.id("animals")));
            sel.selectByVisibleText("Avatar");
            Thread.sleep(5000);
            
            driver.switchTo().defaultContent();
            driver.switchTo().frame(0);
            String s=w1.getAttribute("value");
            System.out.println("entered value "+s);
            
            
            driver.switchTo().frame("frame3");
            Thread.sleep(5000);
            driver.findElement(By.id("a")).click();
            
	}

}
