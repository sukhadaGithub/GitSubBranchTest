package Selenium1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignCheckbox {
	public static void main(String[]args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// step 3: open a url
		driver.get("https://prafpawar11.github.io/checkbox.html");
		Thread.sleep(2000);
		List<WebElement> chekbox=driver.findElements(By.xpath("//input[@type='checkbox']"));
	    int count=chekbox.size();
	    for(int i=0; i<=chekbox.size();i++)
	    {	
	    		
	    				if(i%2!=0)
	    				{
	    					
	    					chekbox.get(i).click();
	    				}
	    }
	    			
	            	
	            
	    	
	    	
	    
	    
	}

}
