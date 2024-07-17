package Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		    System.setProperty("webdriver.driver.chrome","E:\\Sukhada\\automationClass\\Selenium\\setup\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://demo.guru99.com/test/newtours/register.php");
			//enter first name
			WebElement w1=driver.findElement(By.name("firstName"));
			w1.sendKeys("sukhada");
					
			//enter last name
			WebElement w2=driver.findElement(By.name("lastName"));
			w2.sendKeys("Shirke");
			
			//Enter phone number
			WebElement w3=driver.findElement(By.name("phone"));
			w3.sendKeys("8954552551");
			
			//enter email
			WebElement w4=driver.findElement(By.name("userName"));
			w4.sendKeys("sukhada.shirke7@gmail.com");
			
			//enter address
			WebElement w5=driver.findElement(By.name("address1"));
			w5.sendKeys("sukhada");
			
			//enter city
			WebElement w6=driver.findElement(By.name("city"));
			w6.sendKeys("Thane");
			
			//enter state
			
			WebElement w7=driver.findElement(By.name("state"));
			w7.sendKeys("state");
			
			//enter code
			WebElement w8=driver.findElement(By.name("postalCode"));
			w8.sendKeys("411610");
			
			//select country
			Select s=new Select(driver.findElement(By.name("country")));
			s.selectByVisibleText("INDIA");
			//enter username
			WebElement w9=driver.findElement(By.name("email"));
			w9.sendKeys("sshirke");

			//enter password
			WebElement w10=driver.findElement(By.name("password"));
			w10.sendKeys("shirke@1234");

			//enter confirm passowrd
			WebElement w11=driver.findElement(By.name("confirmPassword"));
			w11.sendKeys("shirke@1234");
			Thread.sleep(5000);
			

			//click on submitk i
			WebElement w12=driver.findElement(By.name("submit"));
			w12.click();
			
			driver.quit();


	}

}
