package day_1;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;

public class FW {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//		Wait <WebDriver> wait = new FluentWait<WebDriver>(driver)
//				.withTimeout(Duration.ofSeconds(30))
//				.pollingEvery(Duration.ofSeconds(5))
//				.ignoring(Exception.class);
//		Wait<WebDriver> obj = new FluentWait<WebDriver> (flu).withTimeout(Duration.ofSeconds(30))
//				.pollingEvery(Duration.ofSeconds(5))
//						.ignoring(Exception.class);
		
	FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30))
			.pollingEvery(Duration.ofSeconds(5))
			.ignoring(Exception.class);
	driver.get("https://www.google.co.in");
	driver.findElement(By.id("APjFqb")).sendKeys("Selenium");
//	Keys. Return and Enter both are same meaning
	driver.findElement(By.id("APjFqb")).sendKeys(Keys.RETURN);
	WebElement FW = wait.until(new Function<WebDriver,WebElement>()
//			public WebElement apply(WebDriver driver) {
//		return driver.findElement(By.xpath("//h3[normalize-space()='Selenium Testing: Detailed Guide']"));
		{
		public WebElement apply (WebDriver driver) {
			return driver.findElement(By.xpath("//h3[text()='Selenium Testing: Detailed Guide']"));
			
		}});
	
	FW.click();
		
	}

}
