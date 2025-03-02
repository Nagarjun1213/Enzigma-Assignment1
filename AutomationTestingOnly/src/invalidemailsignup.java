import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class invalidemailsignup {
	 public static void main(String args[]) throws InterruptedException {
	        System.setProperty("webdriver.chrome.driver", "F:\\AutomationTesting\\chrome-win64\\chromedriver-win64\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        
	        driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

	        driver.get("https://app-staging.nokodr.com/super/apps/auth/v1/index.html#/login");

	        driver.findElement(By.xpath("//a[normalize-space()='Sign up']")).click();
	        System.out.println("Clicked Sign Up");

	        driver.findElement(By.xpath("(//input[@name=\"username\"])[2]")).sendKeys("jomoper954bitflirt.com");
	        System.out.println("Entered Email");
	        
	        driver.findElement(By.xpath("//span[@class='slds-checkbox_faux']")).click();
	        
	        driver.findElement(By.xpath("//div[@title='Proceed']")).click();
			
	        Thread.sleep(5000);
	        driver.quit();
	 }

}
