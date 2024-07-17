package JavascriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.driver.chrome","E:\\Sukhada\\automationClass\\Selenium\\setup\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.navigate().to("https://www.facebook.com");
		driver.navigate().to("https://www.redbus.com");
		driver.navigate().to("https://www.amazon.in");
		
		//convert the WebDriver Object into the JavascriptExecutor
		JavascriptExecutor js =(JavascriptExecutor)driver;
		Thread .sleep(5000);
       
        js.executeScript("history.go(-1)");   //redbus
        Thread.sleep(5000);
        
        js.executeScript("history.go(1)");    //amazon
		Thread.sleep(5000);
		
		js.executeScript("history.go(0)");   //amazon
        Thread.sleep(5000);
        
        js.executeScript("history.go(+2)");
		Thread.sleep(5000);
		
		//navigate the browser 3 steps back in browser history
		js.executeScript("history.go(-3)");   //google
		Thread.sleep(5000);
		
		js.executeScript("history.go(+1)");  //fb
		Thread.sleep(5000);
		
		js.executeScript("history.go(+2)");    //amazon
		Thread.sleep(5000);
		
		
		



	}

}
