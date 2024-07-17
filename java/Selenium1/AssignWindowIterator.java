package Selenium1;

import java.util.ArrayList;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignWindowIterator {
	
	static WebDriver driver;
	
	public static void switchToWindow(int indexnumber)
	{
		Iterator it=driver.getWindowHandles().iterator();
		
		ArrayList<String> allwindow=new ArrayList<String>();
		
		while(it.hasNext())
		{
			
			allwindow.add((String) it.next());
		}
		driver.switchTo().window(allwindow.get(indexnumber));
		
		
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://prafpawar11.github.io/multiplewindows.html");
		driver.findElement(By.name("fname")).sendKeys("Rohit");
		Thread.sleep(4000);
		// click on Orange HRM link
		driver.findElement(By.partialLinkText("Orange")).click();

		AssignWindowIterator.switchToWindow(1);

		Thread.sleep(7000);
		// find and enter valid credentails of Orange HRM application
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();

		Thread.sleep(5000);
		AssignWindowIterator.switchToWindow(0);
		// find and enter last name
		driver.findElement(By.name("lname")).sendKeys("Patil");
		Thread.sleep(5000);
		// find and click on sauce demo link
		driver.findElement(By.partialLinkText("Sauce")).click();

		AssignWindowIterator.switchToWindow(2);

		Thread.sleep(5000);
		// find and enter valid credentails of Orange HRM application
		driver.findElement(By.name("user-name")).sendKeys("standard_user");
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		Thread.sleep(3000);
		driver.findElement(By.name("login-button")).click();

		Thread.sleep(3000);
		AssignWindowIterator.switchToWindow(1);

		Thread.sleep(3000);
		// find and click on pim link, add employee
		driver.findElement(By.xpath("//span[text()='PIM']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Add Employee']")).click();
		Thread.sleep(3000);
		// find and enter firstname and last name and click on save buttob

		driver.findElement(By.name("firstName")).sendKeys("Aboli");
		driver.findElement(By.name("lastName")).sendKeys("shinde");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()=' Save ']")).click();
		Thread.sleep(3000);

		// switch focus to main window
		AssignWindowIterator.switchToWindow(0);

		// find and enter address
		driver.findElement(By.name("address")).sendKeys("pune");

	}


}
