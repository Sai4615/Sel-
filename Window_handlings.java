package day_1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_handlings {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver obj = new ChromeDriver ();
		obj.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(1000);
		obj.findElement(By.xpath("//a[text() ='OrangeHRM, Inc']")).click();
		Set<String> ora = obj.getWindowHandles();
		Iterator<String> iterator = ora.iterator();
		String parentid = iterator.next();
		String child = iterator.next();
		obj.switchTo().window(child);
		String text = obj.findElement(By.xpath("//h1[text()='Peace of mind is just a few clicks away!']")).getText();
		System.out.println("Text output - "+ text);
		obj.findElement(By.xpath("//h1[text()='Peace of mind is just a few clicks away!']")).getText();
		String string = obj.findElement(By.xpath("//h1[text()='Peace of mind is just a few clicks away!']")).getText().split("is")[0];
		Thread.sleep(1000);
		obj.switchTo().window(parentid);
		obj.findElement(By.xpath("//input[@name='username']")).sendKeys(string);
		

	}

}
//right click ->Debug -> break point -> debug as -> watch -> write a code for split and trim for space reduction.
//obj.findElement(By.xpath("//h1[text()='Peace of mind is just a few clicks away!']")).getText().split("is")[1].trim();	just a few clicks away!	
