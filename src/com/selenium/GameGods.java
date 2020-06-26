package com.selenium;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GameGods 
{
	public static WebDriver driver =null;

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver",".\\driver\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		System.out.println("Testing Website");
		
		//Open the web app
		driver.get("https://gamegods.com/pages");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		
		if(title.equalsIgnoreCase("GameGods"))
		{
			System.out.println("Title matches");
		}
		else
		{
			System.out.println(title);
		}
		
		driver.findElement(By.linkText("LOGIN")).click(); 
		
		driver.findElement(By.id("RequestUserCode")).sendKeys("202001279324396136AT");
		
		//driver.wait(2000);
		driver.findElement(By.xpath("//*[@id='CheckCode']/div/div/button")).click();
		
		Thread.sleep(2000);
		
		//Login
		driver.findElement(By.name("username")).sendKeys("ankit09lt");
		driver.findElement(By.name("password")).sendKeys("Developers*&94715");
		
		driver.findElement(By.id("LoginSubmit")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Home")).click();
		//Scroll down
		
		JavascriptExecutor js =(JavascriptExecutor) driver;
		js.executeScript("window,scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(1000);
		String strFirstWindowHandle = driver.getWindowHandle();
		
		System.out.println(strFirstWindowHandle);
		/*String text=driver.findElement(By.xpath("//span[@class='sprite social_facebook_png']")).getText();
		System.out.println(text);
		Thread.sleep(2000);
		
		/*ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		//below code will switch to new tab
		driver.switchTo().window(tabs.get(1));
		//perform whatever actions you want in new tab then close it
		driver.close();
		//Switch back to your original tab
		driver.switchTo().window(tabs.get(0));*/
		
		
		
		//Thread.sleep(1000);
		
		driver.findElement(By.linkText("About GameGods")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Contact")).click();
		Thread.sleep(2000);
		
		
		
		driver.findElement(By.id("ContactName")).sendKeys("Ankit");
		driver.findElement(By.id("ContactLastName")).sendKeys("Tiwari");
		driver.findElement(By.id("ContactEmail")).sendKeys("ankit.ltiwari09@gmail.com");
		driver.findElement(By.id("ContactPhone")).sendKeys("9324396136");
		driver.findElement(By.id("ContactText")).sendKeys("Ok, GoodBye!");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id='ContactUs']/div/div/div/p/button")).click();
		
		driver.findElement(By.linkText("Logout")).click();
		Thread.sleep(2000);
		
		driver.close();
		
		

	}
	//*[@id="ContactUs"]/div/div/div/p/button
}
