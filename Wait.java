package day_1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait {

	public static void main(String[] args) {
		ChromeDriver wait = new ChromeDriver();
		wait.get("https://www.google.co.in/");
//		implicit wait syntax
		wait.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		wait.findElement(By.id("APjFqb")).sendKeys("Selenium");
		wait.findElement(By.id("APjFqb")).sendKeys(Keys.ENTER);
		wait.manage().window().maximize();
//		wait.findElement(By.xpath("//h3[text()='Selenium Testing: Detailed Guide']")).click();
//Explicit wait syntax
		WebDriverWait obj = new WebDriverWait (wait,Duration.ofSeconds(10));
		WebElement until = obj.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[text()='Selenium Testing: Detailed Guide']")));
	until.click();
	}

}
