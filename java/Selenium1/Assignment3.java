package Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
     
		 System.setProperty("webdriver.driver.chrome","E:\\Sukhada\\automationClass\\Selenium\\setup\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.saucedemo.com/inventory.html");
			driver.manage().window().maximize();
			//Find username field
			WebElement w=driver.findElement(By.id("user-name"));
			//check username displayed
			boolean b1=w.isDisplayed();
			System.out.println("usernme displyed "+b1);
			
			//check username enabled
			boolean b2=w.isEnabled();
			System.out.println("username is enable "+b2);
			
			//enter username
			w.sendKeys("standard_user");
			//capture username value
			String uservalue=w.getAttribute("value");
			System.out.println("entered username "+uservalue);
			
			//-----------------------------------------------------
			
			//Find password field
			WebElement w2=driver.findElement(By.id("password"));
			//check username displayed
			boolean b3=w2.isDisplayed();
			System.out.println("usernme displyed "+b3);
			
			//check username enabled
			boolean b4=w.isEnabled();
			System.out.println("username is enable "+b4);
			
			//enter username
			w2.sendKeys("secret_sauce");
			//capture username value
			String passvalue=w.getAttribute("value");
			System.out.println("entered username  "+passvalue);
			
			//----------------------------------------------------
			
			//Find login button
			WebElement w3=driver.findElement(By.id("login-button"));
			//ogin button displayed
			boolean b5=w3.isDisplayed();
			System.out.println("login button displayed " +b5);
			
			//ogin button displayed
			boolean b6=w3.isEnabled();
			System.out.println("login button enabled " +b6);
			
			//click on login
			w3.click();
			Thread.sleep(7000);
			//capture current url
			System.out.println("current url "+driver.getCurrentUrl());
			System.out.println("Home page title "+driver.getTitle());
			
			//click on sauce labs backpack
			WebElement w4=driver.findElement(By.className("inventory_item_name"));
			w4.click();
			
			Thread.sleep(7000);
			//click on Add to cart
			WebElement w5=driver.findElement(By.name("add-to-cart"));
			w5.click();
			
			//back to home page
			driver.navigate().back();
			
			Thread.sleep(7000);
			
			//click on sauce labs bike light add to cart
			WebElement w6=driver.findElement(By.name("add-to-cart-sauce-labs-bike-light"));
			w6.click();
			
			driver.quit();
			
			
			
			
			
			
			
			
			
			
			
	}

}
