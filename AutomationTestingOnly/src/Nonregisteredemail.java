import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Nonregisteredemail {
public static void main(String args[]) throws InterruptedException {
		
        System.setProperty("webdriver.chrome.driver", "F:\\AutomationTesting\\chrome-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://app-staging.nokodr.com/super/apps/auth/v1/index.html#/login");
		System.out.println("We are in ForgotPassword page");
		
		driver.findElement(By.xpath("//a[text()='Forgot Password?']")).click();
		System.out.println("Click on Forgot Password Link");
		
		driver.findElement(By.xpath("(//input[@type='email'])[2]")).sendKeys("nagarjun@gmail.com");//Non Registered email
		System.out.println("Enter Email");
		
		driver.findElement(By.xpath("//div[@title='Proceed']")).click();
		System.out.println("Click on Proceed");
		System.out.println("User does not exists");
		
		
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(25));
		WebElement otpField = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Enter Code']")));
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the opt: ");
		String no = sc.nextLine();
		
		otpField.sendKeys(no);
	
		driver.findElement(By.xpath("(//button[@class='slds-button slds-button_brand'])[2]")).click();
		
		driver.findElement(By.xpath("(//input[@name='password'])[2]")).sendKeys("Nagarjun@09");
		
		driver.findElement(By.name("password-confirmpassword")).sendKeys("Nagarjun@09"); 
		
		driver.findElement(By.xpath("(//button[@name='undefined'])[4]")).click();	
		System.out.println("Click on Confirm");
		System.out.println("Displayed Dashboard");
		
		 Thread.sleep(5000);
	        driver.quit();
		
	}

}
