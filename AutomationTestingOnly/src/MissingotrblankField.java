import java.time.Duration;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class MissingotrblankField {
	
        public static void main(String args[]) throws InterruptedException {
            System.setProperty("webdriver.chrome.driver", "F:\\AutomationTesting\\chrome-win64\\chromedriver-win64\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            
            driver.manage().window().maximize();
    		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

            driver.get("https://app-staging.nokodr.com/super/apps/auth/v1/index.html#/login");

        
            driver.findElement(By.xpath("//a[normalize-space()='Sign up']")).click();
            System.out.println("Clicked Sign Up");
            
            driver.findElement(By.xpath("(//input[@name=\"username\"])[2]")).sendKeys(""); //Missing
            System.out.println("Entered Email");
            
            driver.findElement(By.xpath("//span[@class='slds-checkbox_faux']")).click();
            
            driver.findElement(By.xpath("//div[@title='Proceed']")).click();
        
        Thread.sleep(5000);
        driver.quit();
	}

}
