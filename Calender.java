package day_1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Calender {

	public static void main(String[] args) {
		ChromeDriver cale = new ChromeDriver (); 
		cale.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		cale.findElement(By.id("datepicker")).click();
cale.findElement(By.id("ui-datepicker-div"));
WebDriverWait obj = new WebDriverWait (cale,Duration.ofSeconds(10));
obj.until(ExpectedConditions.visibilityOfElementLocated(By.id("ui-datepicker-div")));
String Month = cale.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
String Year = cale.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();

	while(!(Month.equals("November")&&Year.equals("2024")))
{
		cale.findElement(By.xpath("//a[@data-handler='next']")).click();
		Month = cale.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		Year = cale.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();

}
	cale.findElement(By.xpath("//td[@data-handler='selectDay']/a [text()='7']")).click();
			
	}

}
