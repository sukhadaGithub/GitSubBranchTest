package Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssiFrame2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.driver.chrome","E:\\Sukhada\\automationClass\\Selenium\\setup\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		Thread.sleep(7000);
		
		driver.findElement(By.xpath("//a[@class='analystic']")).click();
		driver.switchTo().frame("singleframe");
		WebElement w1=driver.findElement(By.xpath("//input[@type='text']"));
		w1.sendKeys("Selenium");
		
		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Iframe with in an Iframe")).click();
		driver.switchTo().frame(0);
		driver.switchTo().frame(1);
		WebElement w2=driver.findElement(By.xpath("//input[@type='text']"));
		w2.sendKeys("Selenium");

	}

}
