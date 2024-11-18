package day_1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver ale = new ChromeDriver();
		ale.get("https://demo.guru99.com/test/delete_customer.php");
		ale.findElement(By.xpath("//input[@name='cusid']")).sendKeys("443363");
		ale.findElement(By.name("submit")).click();
		Thread.sleep(1000);
		ale.switchTo().alert().getText();
		System.out.println("Alert msg:-" +ale.switchTo().alert().getText());
	
//		ale.switchTo().alert().accept();
//		Thread.sleep(1000);
//		ale.switchTo().alert().accept();

	}

}
