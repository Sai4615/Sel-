package day_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class draganddrop {

	public static void main(String[] args) throws Exception {
		ChromeDriver dd = new ChromeDriver ();
		dd.get("https://www.globalsqa.com/demo-site/draganddrop/");
		int size = dd.findElements(By.xpath("//iframe[@class='demo-frame lazyloaded']")).size();
		System.out.println("To know size - " + size);
		dd.switchTo().frame(dd.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']")));
		Actions New = new Actions(dd);
		WebElement img1 = dd.findElement(By.xpath("//ul[@id='gallery']/li[1]"));
		WebElement tar1 = dd.findElement(By.id("trash"));
		
		
		New.dragAndDrop(img1, tar1).perform();
		WebElement img2 = dd.findElement(By.xpath("//ul[@id='gallery']/li[2]"));
		
		New.dragAndDrop(img2, tar1).perform();
		Thread.sleep(100);
WebElement img3 = dd.findElement(By.xpath("//ul[@id='gallery']/li[3]"));
		
		New.dragAndDrop(img3, tar1).perform();
		Thread.sleep(100);
		
WebElement img4 = dd.findElement(By.xpath("//ul[@id='gallery']/li[4]"));
		
		New.dragAndDrop(img4, tar1).perform();
	}

}
