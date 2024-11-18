package day_1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Autosug {

	public static void main(String[] args) throws InterruptedException {
		 ChromeDriver ED = new ChromeDriver();
		 ED.get("https://www.google.co.in");
		 ED.findElement(By.id("APjFqb")).sendKeys("Selenium");
		 Thread.sleep(2000);
		 String exptext  = "selenium webdriver";
		 
		 List<WebElement> elements = ED.findElements(By.xpath("(//ul[@class='G43f7e'])[1]/li"));
		 for (WebElement eachobj: elements) {
			 System.out.println(eachobj.getText());
			 String actualtext = eachobj.getText();
			 if (actualtext.equals(exptext)) {
//			 if (eachobj.getText().equals("selenium interview questions")) {
			 eachobj.click();
			 break;
			 }
		 }

	}

}
