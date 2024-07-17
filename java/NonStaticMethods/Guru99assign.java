package NonStaticMethods;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Guru99assign {
	
	
	public String testGuru99(String fname,String lname,String phone,String user,String address,String city,String state,String code,String email,String pwd,String cpwd) throws InterruptedException, IOException
	{
		WebDriver driver = new ChromeDriver();
		
		//open a url
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.findElement(By.name("firstName")).sendKeys(fname);
		driver.findElement(By.name("lastName")).sendKeys(lname);
		driver.findElement(By.name("phone")).sendKeys(phone);
		driver.findElement(By.id("userName")).sendKeys(user);
		driver.findElement(By.name("address1")).sendKeys(address);
		driver.findElement(By.name("city")).sendKeys(city);
		driver.findElement(By.name("state")).sendKeys(state);
		driver.findElement(By.name("postalCode")).sendKeys(code);
		Select sc=new Select(driver.findElement(By.name("country")));
		sc.selectByVisibleText("INDIA");
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.name("password")).sendKeys(pwd);
		driver.findElement(By.name("confirmPassword")).sendKeys(cpwd);
		driver.findElement(By.name("submit")).click();
		Thread.sleep(7000);
		
	

		TakesScreenshot ts= (TakesScreenshot) driver;
		File src= ts.getScreenshotAs(OutputType.FILE);
		SimpleDateFormat simple = new SimpleDateFormat("ddMMyyyy_HHmmss");
		String date1 = simple.format(new Date());
		File dest = new File(System.getProperty("user.dir") + "\\Screenshots\\Guru99Assign"+date1+".png");
		FileUtils.copyFile(src,dest);
	    WebElement wbname= driver.findElement(By.xpath("//b[contains(text(),'Sujal')]"));
    	
		String str=wbname.getText();
		return str;

	}
	

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		Guru99assign ga=new Guru99assign();
		String label=ga.testGuru99("Sujal","Naik","9632587410","sujal@gmail.com","Pune","hane","MH","741258","SujalN","sujal@92","sujal@92");
		System.out.println(label);

	}

}
