package day_1;   

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_HYR {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver obj = new ChromeDriver();
		obj.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html#");
		
		obj.findElement(By.xpath("//label[text()='First Name ']/following-sibling::input[1]")).sendKeys("Vanisri");

		obj.findElement(By.xpath("//label[text()='Last Name']/following-sibling::input[1]")).sendKeys("Shanmugam");
		
//		//div[@class='buttons']/button[text()='Register'] -> one way
		obj.findElement(By.xpath("//div[@class='container']/descendant::button[text()='Register']")).click();
		
		JavascriptExecutor js = (JavascriptExecutor) obj;
		js.executeScript("window.scrollBy(0,750)");
		Thread.sleep(5000);
		obj.findElement(By.xpath("//td[text()='Roland Mendel']/preceding-sibling::td/child::input")).click();

//		CSS - not using // & @ in syntax - 
//	xpath - //div[@class='container']/	CSS -div[class='container'] - need to use By.CSS
		
//		if we have Id then we can use #then ID Ex- #name  ->By.CSSselector
//		* will give exact match some time - tagname [attribute*='value'] - > By. both Xpath and CSSsele
	
		obj.findElement(By.cssSelector("#ID name")).sendKeys("Testing");
	
		// div[@class='buttons']/ancestor::div
	
	}

}

