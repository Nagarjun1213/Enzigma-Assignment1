import java.time.Duration;
import java.util.Scanner;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignupPage {
    public static void main(String args[]) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "F:\\AutomationTesting\\chrome-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://app-staging.nokodr.com/super/apps/auth/v1/index.html#/login");

        driver.findElement(By.xpath("//a[normalize-space()='Sign up']")).click();
        System.out.println("Clicked Sign Up");

        driver.findElement(By.xpath("(//input[@name=\"username\"])[2]")).sendKeys("jomoper954@bitflirt.com");
        System.out.println("Entered Email");
        
        driver.findElement(By.xpath("//span[@class='slds-checkbox_faux']")).click();
        
        driver.findElement(By.xpath("//div[@title='Proceed']")).click();

		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(25));
		WebElement otpField = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Enter Code']")));
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the opt: ");
		String no = sc.nextLine();
		
		otpField.sendKeys(no);
	
		driver.findElement(By.xpath("(//button[@class='slds-button slds-button_brand'])[2]")).click();
		

				driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Nagarjun");
				
				driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Bhole");
				
				driver.findElement(By.xpath("(//input[@name='password'])[2]")).sendKeys("Nagarjun@098");
				
				driver.findElement(By.name("password-confirmpassword")).sendKeys("Nagarjun@098");
				
				driver.findElement(By.xpath("//div[@title='Register']")).click();

				wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[@class='slds-text-heading_small slds-p-bottom_xx-small']")));
				WebElement acc_msg=driver.findElement(By.xpath("//h1[@class='slds-text-heading_small slds-p-bottom_xx-small']"));
				
				
				if (acc_msg.isDisplayed()) {
					WebElement acc_message=driver.findElement(By.xpath("//h2[@class='slds-text-heading_small']"));
					System.out.println(acc_msg.getText() +" : "+acc_message.getText());
				}	
		
        Thread.sleep(5000);
        driver.quit();
    }
}
