package day_1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Siblings {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver sib = new ChromeDriver();
		sib.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html#");
		//td[text()="Maria Anders"]/preceding-sibling::td/child::input
//		JavascriptExecutor js = (JavascriptExecutor)driver; - for scroll the page need to use this line
		
		JavascriptExecutor js = (JavascriptExecutor)sib;
		
		//Thread we are using for wait the page to load and search/select the xpath data
		js.executeScript("window.scrollBy(0,750)");Thread.sleep(5000);
		sib.findElement(By.xpath("//td[text()='Maria Anders']/preceding-sibling::td/child::input")).click();

	}
	

}
