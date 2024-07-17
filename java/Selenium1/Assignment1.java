package Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
 
		
		    System.setProperty("webdriver.driver.chrome","E:\\Sukhada\\automationClass\\Selenium\\setup\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("http://www.facebook.com");
			WebElement w1=driver.findElement(By.name("email"));
			w1.sendKeys("sukhadashirke@gmail.com");
	 		
			WebElement w2=driver.findElement(By.name("pass"));
			w2.sendKeys("Pass123");
            
		    Thread.sleep(5000);	
			WebElement w3=driver.findElement(By.name("login"));
			w3.click();
			
			

	
	}

}
