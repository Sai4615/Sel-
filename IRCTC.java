package day_1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IRCTC {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver obj = new ChromeDriver();
		obj.get("https://www.irctc.co.in/nget/train-search");
		Thread.sleep(1000);
		obj.manage().window().maximize();
//		obj.findElement(By.xpath("//input[@class= 'ng-tns-c57-8 ui-inputtext ui-widget ui-state-default ui-corner-all ui-autocomplete-input ng-star-inserted']")).sendKeys("Chennai");
//		obj.findElement(By.xpath("//input[@class = 'ng-tns-c57-9 ui-inputtext ui-widget ui-state-default ui-corner-all ui-autocomplete-input ng-star-inserted']")).sendKeys("TENKASI JN - TSI");
//		obj.findElement(By.xpath("//p-dropdown [@class ='ng-tns-c65-11 ng-pristine ng-valid ui-inputwrapper-filled ng-touched']"));
//		Select drop = new Select(obj.findElement(By.xpath("//p-dropdown [@class ='ng-tns-c65-11 ng-pristine ng-valid ui-inputwrapper-filled ng-touched']")));
//		drop.selectByIndex(3);
		
//		Date
//		obj.findElement(By.xpath("//input [@class = 'ng-tns-c58-10 ui-inputtext ui-widget ui-state-default ui-corner-all ng-star-inserted']")).click();
		obj.findElement(By.xpath("//input[@class= 'ng-tns-c58-10 ui-inputtext ui-widget ui-state-default ui-corner-all ng-star-inserted']")).click();
		WebDriverWait xx = new WebDriverWait (obj,Duration.ofSeconds(10));
xx.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//input[@class= 'ng-tns-c58-10 ui-inputtext ui-widget ui-state-default ui-corner-all ng-star-inserted']")));
	String month = obj.findElement(By.xpath("//span[@class= 'ui-datepicker-month ng-tns-c58-10 ng-star-inserted']")).getText();
	String yr = obj.findElement(By.xpath("//span[@class= 'ui-datepicker-year ng-tns-c58-10 ng-star-inserted']")).getText();
	while (!(month.equals("January")&&yr.equals("2025")));
	{
		obj.findElement(By.xpath("//span[@class= 'ui-datepicker-next-icon pi pi-chevron-right ng-tns-c58-10']")).click();
		month = obj.findElement(By.xpath("//span[@class= 'ui-datepicker-month ng-tns-c58-10 ng-star-inserted']")).getText();
		yr = obj.findElement(By.xpath("//span[@class= 'ui-datepicker-year ng-tns-c58-10 ng-star-inserted']")).getText();
	}
	obj.findElement(By.xpath("//a[@class= 'ui-state-default ng-tns-c58-10 ui-state-active ng-star-inserted']")).click();
	
	}

}
