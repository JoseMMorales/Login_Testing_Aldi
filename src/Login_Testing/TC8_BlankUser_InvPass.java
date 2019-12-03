package Login_Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TC8_BlankUser_InvPass {

	public static void main(String[] args) {
		// Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/....../chromedriver");
		
		//Launch Chrome and maximise
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.aldi.co.uk/");
		
		//Wait until homepage is charged and click log in
		WebDriverWait wait = new WebDriverWait(driver, 10);
		 
		WebElement login = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Log in / Register")));
		
		login.click();
		
		//Wait until log in page is charged, enter password
		WebDriverWait wait1 = new WebDriverWait(driver, 10);
		
		WebElement password = wait1.until(ExpectedConditions.elementToBeClickable(By.id("j_password")));
		
		password.sendKeys("xxxxxxx");
		
		//Click Sign button
		WebElement sign = driver.findElement(By.xpath("//*[@id=\"returningCustomerForm\"]/div[4]/button"));
		
		sign.click();
		
		//Close Chrome
		driver.close();
	}
		
}

