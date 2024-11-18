package day_1;

import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AdvLocator {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver obj = new ChromeDriver();
		obj.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
//		obj.findElement(with(By.tagName("")).above(null))
		Thread.sleep(1000);
		WebElement element = obj.findElement(By.xpath("(//input[@name='name'])[1]"));
		obj.findElement(with(By.tagName("label")).above(element)).getText();
		System.out.println("To find header - " + obj.findElement(with(By.tagName("label")).above(element)).getText());
WebElement element2 = obj.findElement(By.xpath("//label[text()='Last Name']"));
obj.findElement(with(By.tagName("input")).below(element2)).sendKeys("Name");
element.getRect().getDimension().getHeight();
System.out.println("To find height - " +element.getRect().getDimension().getHeight() );
element.getRect().getDimension().getWidth();
System.out.println("To find width - " + element.getRect().getDimension().getWidth());
	WebElement element3 = obj.findElement(By.xpath("//td[text()='Maria Anders']"));
	obj.findElement(with(By.tagName("input")).toLeftOf(element3)).click();
	
	//same for toRightof
	}

}
