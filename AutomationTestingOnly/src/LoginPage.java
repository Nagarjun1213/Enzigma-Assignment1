import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {
	public static void main(String args[]) throws InterruptedException {
		
        System.setProperty("webdriver.chrome.driver", "F:\\AutomationTesting\\chrome-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        
		driver.get("https://app-staging.nokodr.com/super/apps/auth/v1/index.html#/login");
		System.out.println("We are in login page");
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("nagarjunbhole@gmail.com");
		System.out.println("Successfully Enterd Email Adderes");
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Nagarjun@098");
		System.out.println("Successfully Enterd Password");
		
		driver.findElement(By.id("rememberMe")).click();
		System.out.println("Successfully Click on Checkbox");
		
		driver.findElement(By.xpath("//div[@title='Log In']")).click();
		System.out.println("Successfully Click on Login Button");
		
		WebElement msg=driver.findElement(By.xpath("//h1[@class='slds-text-heading_small slds-p-bottom_xx-small']"));
		
		
		if (msg.isDisplayed()) {
			WebElement message=driver.findElement(By.xpath("//h2[@class='slds-text-heading_small']"));
			System.out.println(msg.getText()+" : "+message.getText());
		}else{
		System.out.println("We are not Right Page");
		System.out.println(driver.getTitle());
	}
	Thread.sleep(2000);
	driver.quit();
	}
}
