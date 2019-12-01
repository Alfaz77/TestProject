package Noon;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cart {
	
	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver", "C:\\AL\\chromedriver_win32\\Updated Chrome\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://www.noon.com/");
	driver.manage().window().maximize();
	Thread.sleep(5000);
	driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/header/div[2]/div[3]/div/button/span")).click();
	driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/header/div[2]/div[3]/div/div/div[1]/button")).click();
	Thread.sleep(2000);
	System.out.println("Url Launched successfully");

	WebElement username = driver.findElement(By.id("tf_signin_email"));
	username.sendKeys("faz.7375@gmail.com");	
	driver.findElement(By.id("tf_signin_password")).sendKeys("Noon@123");
	driver.findElement(By.id("btn_signin_signin")).click();
	Thread.sleep(7000);
	driver.manage().window().maximize();
	System.out.println("Login successfully");
	
	WebElement Search = driver.findElement(By.id("searchBar"));
	Search.click();
	Thread.sleep(3000);
	Search.sendKeys("IPhone 11 Pro");
	Thread.sleep(5000);
	Search.sendKeys(Keys.ENTER);
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); 
	System.out.println("Searched Successfully");
	driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div[2]/div/div[2]/header/div/div[1]/div[1]/div/button/div")).click();
	
	
	driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div[2]/div/div[2]/header/div/div[1]/div[1]/div/div/ul/li[2]")).click();
	Thread.sleep(10000);
	System.out.println("Clicked on High to Low Price");
	
	driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div[2]/div/div[2]/div[1]/div[1]/div/button")).click();
	System.out.println("Added to wish list");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div[2]/div/div[2]/div[1]/div[1]/div/a/div[1]/div/div/img")).click();
	System.out.println("Phone Selected");
	Thread.sleep(7000);
	
	driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div[2]/div/div[1]/div[2]/div[1]/div[4]/div[2]/div/div[2]/div[1]/button/span[1]")).click();
	System.out.println("Added to Cart");
	Thread.sleep(5000);
	
    driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div[4]/div[2]/div[2]/div/div/div[3]/button[1]/span")).click();
	System.out.println("Checked Out");
	Thread.sleep(5000);
	
	driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/div/div[1]/div[2]/div[2]/div/div[2]/div[2]/div[1]/button[2]/i")).click();
	System.out.println("Removed");
	Thread.sleep(5000);
	
	driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/div/div[1]/div[3]")).click();
	System.out.println("Again Continue shopping");
	Thread.sleep(7000);
	
	WebElement Search1 = driver.findElement(By.id("searchBar"));
	Search1.click();
	Thread.sleep(3000);
	Search1.sendKeys("Apple Airpods Pro");
	Thread.sleep(5000);
	Search1.sendKeys(Keys.ENTER);
	Thread.sleep(7000);
	System.out.println("Searched Apple Airpods Pro");
	
	driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/header/div[2]/div[3]/div/button/span/span[2]")).click();
	Thread.sleep(2000);
	System.out.println("Clicked on Account");
	
	driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/header/div[2]/div[3]/div/div/button")).click();
	Thread.sleep(10000);
	
}

}
