package Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assidropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
       
		
		 System.setProperty("webdriver.driver.chrome","E:\\Sukhada\\automationClass\\Selenium\\setup\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("http://www.facebook.com/reg");
			driver.manage().window().maximize();
			Thread.sleep(7000);
			//driver.findElement(By.id("u_0_0_qH")).click();
			driver.findElement(By.name("firstname")).sendKeys("snehal");
			driver.findElement(By.name("lastname")).sendKeys("Naik");
			driver.findElement(By.name("reg_email__")).sendKeys("8563214578");
			driver.findElement(By.name("reg_passwd__")).sendKeys("Naik@1992");
			driver.findElement(By.xpath("//input[@value='1']")).click();
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
	}

}
