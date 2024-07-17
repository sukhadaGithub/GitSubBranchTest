package Selenium1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class AssignDropdown3 
{
	public static void main(String[]args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// step 3: open a url
		driver.get("https://copyright.gov.in/UserRegistration/frmNewUser.aspx");
		Thread.sleep(5000);
		
		//select title by index
		WebElement title=driver.findElement(By.name("ctl00$ContentPlaceHolder1$ddlTitle"));
		Select sc=new Select(title);
		sc.selectByIndex(2);
		Thread.sleep(5000);
		
		//select country by visible Text
		WebElement country=driver.findElement(By.name("ctl00$ContentPlaceHolder1$ddlCountry"));
		Select sc1=new Select(country);
		sc1.selectByVisibleText("India");
		Thread.sleep(5000);
		
		//Select state by Value
		WebElement state=driver.findElement(By.name("ctl00$ContentPlaceHolder1$ddlState"));
		Select sc2=new Select(state);
		sc2.selectByValue("24");
		Thread.sleep(5000);
	   
		
		//select by javascriptExecutor
		JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("document.getElementsByName('ctl00$ContentPlaceHolder1$ddlQuestions')[0].value='71';");
        
      //select Disctrict by Action clas
      //WebElement district=driver.findElement(By.name("ctl00$ContentPlaceHolder1$ddlDistrict"));
  		Actions ac=new Actions(driver); 
  		ac.click(state).build().perform();
  		ac.keyDown(Keys.ARROW_DOWN).keyDown(Keys.ARROW_DOWN).keyDown(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
  		Thread.sleep(5000);		
  		
  		//iterating all drop down value and using condition
  		List<WebElement> questionlist=driver.findElements(By.xpath("//select[@name='ctl00$ContentPlaceHolder1$ddlQuestions']/child::option"));
  	    driver.findElement(By.name("ctl00$ContentPlaceHolder1$ddlQuestions")).click();
  		for (WebElement dropdown : questionlist) {
			// step 7: capture the actual drop down value.
			String actualValue = dropdown.getText();

			// step 8: compare actual value with expected value
			if (actualValue.contains("Who is your favorite Hero???")) {
				// step 9: click on drop down value
				dropdown.click();

				// step 10: break the loop
				break;
			}
		}

      		

	}
}
