package Selenium1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignDropdown2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		    System.setProperty("webdriver.driver.chrome","E:\\Sukhada\\automationClass\\Selenium\\setup\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.vsp.com/create-account");
			Thread.sleep(7000);
            WebElement w1=driver.findElement(By.id("preferred-language"));
            w1.click();
            List<WebElement> ls = driver.findElements(By.xpath("//span[@class='ng-option-label ng-star-inserted']"));
            for(WebElement abc:ls)
            {
            	String list=abc.getText();
            	System.out.println(list);
            	if(list.equals("Farsi"))
            	{
            		abc.click();
            		break;
            	}
            }
            
	}

}
