package Selenium1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignFb {
	
	public static void main(String[]args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// step 3: open a url
		driver.get("https://www.facebook.com/reg");
		Thread.sleep(5000);
		List<WebElement> linkList=driver.findElements(By.tagName("a"));
		for(WebElement links:linkList)
		{
			String linktitle=links.getText();
			System.out.println(linktitle);
			if(linktitle.contentEquals("Already have an account?"))
			{
				if((links.isDisplayed())&&(links.isEnabled()))
				{
					System.out.println("Link is displayed or enable");
					String link=links.getText();
					System.out.println("linktitle"+link);
					String bgcolor = links.getCssValue("backgroundColor");
					System.out.println(bgcolor);

				}
			}
			
		
		}
		
		
	}

}
