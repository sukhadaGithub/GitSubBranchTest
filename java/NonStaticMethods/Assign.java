package NonStaticMethods;



	import java.awt.image.BufferedImage;
	import java.io.File;
	import java.io.IOException;
	import java.text.SimpleDateFormat;
	import java.time.Duration;
	import java.util.Date;
	import java.util.List;

	import javax.imageio.ImageIO;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	import ru.yandex.qatools.ashot.AShot;
	import ru.yandex.qatools.ashot.Screenshot;
	import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

	public class Assign {
		public void goibiboApplication(String fromCity, String toCity, String expectedmonthYear, String date, String adultTraveller, String travellerClass) throws IOException
		{
			//connect to actual browser
			//upcasting
			WebDriver driver = new ChromeDriver();
			
			//open a url
			driver.get("https://www.goibibo.com/");
			
			driver.findElement(By.xpath("//span[@class='logSprite icClose']")).click();
			driver.findElement(By.xpath("//p[@class='sc-jlwm9r-1 ewETUe']")).click();
			//maximize the window
			driver.manage().window().maximize();
			
			//add wait
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
			//Find from City Elementby using findElement() method
			WebElement wb = driver.findElement(By.xpath("//span[text()='From']/following-sibling::p"));
			wb.click();
			
			WebElement wb1 = driver.findElement(By.xpath("//input[@type='text']"));
			wb1.sendKeys(fromCity);
			
			driver.findElement(By.xpath("//li[@tabindex='0']")).click();
			
			//find tocity textbox
			WebElement wb2 =driver.findElement(By.xpath("//input[@type='text']"));
			wb2.sendKeys(toCity);
			
			driver.findElement(By.xpath("//li[@tabindex='0']")).click();
			
			//find date object
			driver.findElement(By.xpath("//span[text()='Departure']/following-sibling::p[@class='sc-12foipm-4 czGBLf fswWidgetTitle']")).click();
		
			//use infinite while loop
			while(true)
			{
				//find the month year webelement value
				WebElement monthYearwb = driver.findElement(By.xpath("//div[@class='DayPicker-Month']/preceding-sibling::div/child::div[@class='DayPicker-Caption']/child::div"));
				
				String monthYear = monthYearwb.getText();
				System.out.println(monthYear);
				
				if(monthYear.equals(expectedmonthYear))
				{
					//find webElement for date 20
					WebElement datewb = driver.findElement(By.xpath("//div[@class='DayPicker-Month']/preceding-sibling::div/descendant::p[text()='"+date+"']"));
					datewb.click();
					break;
					
				}else 
				{
					//find out web element for next button
					WebElement nextwb = driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']"));
					nextwb.click();
					
				}
				
			}
			//find the element for traveller class
			driver.findElement(By.xpath("//span[text()='Travellers & Class']/following-sibling::p[@class='sc-12foipm-4 czGBLf fswWidgetTitle']")).click();
			WebElement wb3 = driver.findElement(By.xpath("//span[text()='1']/following-sibling::span[@class='sc-12foipm-51 kZvHQU']"));
			
			int a = Integer.parseInt(adultTraveller);
			for(int i=1; i<a; i++)
			{
				wb3.click();
			}
			
			List<WebElement> ls = driver.findElements(By.xpath("//ul[@class='sc-12foipm-45 caZeZT']/child::li"));
			for(WebElement abc:ls)
			{
				String pqr = abc.getText();
				if(pqr.equalsIgnoreCase(travellerClass))
				{
					abc.click();
				}
			}
			
			driver.findElement(By.xpath("//a[text()='Done']")).click();
			//driver.findElement(By.xpath("//span[text()='SEARCH FLIGHTS']")).click();
			
			//take full screen shot
			AShot ashot = new AShot();
			ashot.shootingStrategy(ShootingStrategies.viewportPasting(1000));
			Screenshot sc = ashot.takeScreenshot(driver);
			SimpleDateFormat simple = new SimpleDateFormat("ddMMyyyy_HHmmss");
			String date1 = simple.format(new Date());
			
			
			BufferedImage src = sc.getImage();
			File dest = new File(System.getProperty("user.dir")+"\\Screenshots\\goibibo"+date1+".png");
			ImageIO.write(src, "PNG", dest);
			
			
		}
		
		public static void main(String[] args) throws IOException {
			Assign obj = new Assign();
			obj.goibiboApplication("Mumbai","Delhi","June 2024","27","7","Economy");
			
//			Open a application 	https://www.goibibo.com/
//				- create non static method without return type and  6 arguments
//					- enter from city name
//					- enter to city name
//					- select date .month and year
//					- select adult traveller
//					- select travel class
//					- click on search button
//					- take screenshot
	//
//				at the time of calling this method it should ask for, from city name, to city name, expected date, expected month and year, total adult traveller, and travel class.

		}

	}


