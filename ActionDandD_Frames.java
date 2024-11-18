package day_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionDandD_Frames {

	public static void main(String[] args) {
		ChromeDriver obj = new ChromeDriver();
		obj.get("https://jqueryui.com/droppable/");
		int size = obj.findElements(By.tagName("iframe")).size();
		System.out.println("Size info -" + size );
		obj.switchTo().frame(obj.findElement(By.xpath("//iframe[@class='demo-frame']")));
		Actions DD = new Actions(obj);
		WebElement Source = obj.findElement(By.id("draggable"));
		WebElement target = obj.findElement(By.id("droppable"));
		
		DD.dragAndDrop(Source, target).perform();
		
	}

}
