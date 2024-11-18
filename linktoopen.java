package day_1;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class linktoopen {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver obj = new ChromeDriver();
		obj.get("https://www.selenium.dev/");
		List<WebElement> tag = obj.findElements(By.tagName("a"));
		tag.size();
		System.out.println("Tag size - " +tag.size());
//		footer link to know
		
		WebElement fo = obj.findElement(By.tagName("Footer"));
		List<WebElement> ta = fo.findElements(By.tagName("a"));
	
		System.out.println("Footer tagname Size =" + ta.size());
		WebElement level = obj.findElement(By.xpath("//div[@class='row justify-content-around pt-4 pb-5 px-5'][2]"));
		List<WebElement> tagname = level.findElements(By.tagName("a"));
		System.out.println("Level link size -" + tagname.size());
		
		for (int i=0; i<tagname.size(); i++)
		{
			String chord = Keys.chord(Keys.CONTROL,Keys.ENTER);
			level.findElements(By.tagName("a")).get(i).sendKeys(chord);
			Thread.sleep(1000);
			
		}
		Set<String> ora = obj.getWindowHandles();
		Iterator<String> iterator = ora.iterator();
		while(iterator.hasNext()) {
			obj.switchTo().window(iterator.next());
			System.out.println("1st link title - "  + obj.getTitle());
		}
		
	}

}
