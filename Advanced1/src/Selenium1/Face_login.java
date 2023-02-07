package Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Face_login 
{
  public static void main(String[] args) throws InterruptedException 
  {
	  System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		WebDriver diver= new ChromeDriver();
		diver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		diver.findElement(By.id("email")).sendKeys("8970487919");
		Thread.sleep(2000);
		diver.findElement(By.id("pass")).sendKeys("886713502711222");
		Thread.sleep(2000);
		diver.findElement(By.name("login")).click();
}
}
