package day_1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon {
public static void main(String[] args) {
	ChromeDriver ama = new ChromeDriver();
	ama.get("https://www.amazon.in");
//	ama.findElement(By.linkText("Best Sellers")).click();
//	ama.findElement(By.partialLinkText("Best")).click();
	
//	xpath syntax - //tagname[@attribute='value']
	//input[@type='text']
//	ama.findElement(By.xpath("//input[@type='text']")).sendKeys("Mobile");
	
//	Actions - mouse handlying interaction or mouse over
//	double click / Context click/ drag and drop
	Actions obj= new Actions (ama);
//	ama.findElement(By.xpath("//input[@type='text']")).click()
obj.moveToElement(ama.findElement(By.xpath("//input[@type='text']"))).click().keyDown(Keys.SHIFT).sendKeys("Mobile").doubleClick().perform();
WebElement element = ama.findElement(By.id("nav-link-accountList"));
obj.moveToElement(element).contextClick().build().perform();
}}