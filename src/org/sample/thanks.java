package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class thanks {

	public static void main(String[] args) {
	
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Avinash\\eclipse-workspace\\xpath\\drivers\\chromedriver.exe");

		    WebDriver driver = new ChromeDriver();  

		    driver.get("https://www.flipkart.com/");
		    
          Actions m = new Actions(driver);
          
        
       
     
       WebElement  click1 =driver.findElement(By.xpath("(//div[@class='xtXmba'])[4]"));
      m.moveToElement(click1).perform();
      
      WebElement  click11 =driver.findElement(By.xpath("(//span[text()='Hello, Sign in'])[1]"));
      m.moveToElement(click11).perform();
      
      WebElement sigin =driver.findElement(By.xpath("//input[@type='email']"));
   sigin.click();

	}}
