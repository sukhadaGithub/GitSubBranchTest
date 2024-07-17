package staticM;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class StaticM1 {
	
	public static void dateCompre() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// step 3: open a url
		driver.get("https://www.google.com");
		Thread.sleep(5000);
		WebElement w=driver.findElement(By.id("APjFqb"));
		w.sendKeys("Pushpa");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Pushpa: The Rise']")).click();
		//Actions ac= new Actions(driver);
		//ac.sendKeys(Keys.ENTER).build().perform();
		driver.findElement(By.xpath("//a[@href='https://en.wikipedia.org/wiki/Pushpa:_The_Rise']")).click();
		String dt=driver.findElement(By.xpath("//div[@class='plainlist film-date']")).getText();
		System.out.println(dt);
		driver.navigate().back();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@href='https://www.imdb.com/title/tt9389998/']")).click();
		Thread.sleep(5000);
		String dt1=driver.findElement(By.xpath("//a[text()='December 17, 2021 (United States)']")).getText();
		System.out.println(dt1);
		String newdt=dt1.replaceAll(" (United States)", " ");
		System.out.println(newdt);
		driver.close();
	
		
		
		
		
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//StaticM1 sm=new StaticM1();
		StaticM1.dateCompre();

	}

}
