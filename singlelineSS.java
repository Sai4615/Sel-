package day_1;


	import java.io.File;
import java.io.IOException;
import java.util.Iterator;
	import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class singlelineSS {

		public static void main(String[] args) throws InterruptedException, IOException {
			ChromeDriver obj = new ChromeDriver ();
			obj.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			Thread.sleep(1000);
			obj.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
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
			WebElement element = obj.findElement(By.xpath("//input[@name='username']"));
			element.sendKeys(string);
			File screenshotAs = element.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screenshotAs, new File ("Single.png"));
		}

	}
	//right click ->Debug -> break point -> debug as -> watch -> write a code for split and trim for space reduction.
	//obj.findElement(By.xpath("//h1[text()='Peace of mind is just a few clicks away!']")).getText().split("is")[1].trim();	just a few clicks away!	


