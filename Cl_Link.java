 package day_1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cl_Link {

	public static void main(String[] args) {
	ChromeDriver obj = new ChromeDriver ();
	obj.get("https://www.amazon.in");
	List<WebElement> link = obj.findElements(By.tagName("a"));
	link.size();
	System.out.println("Size of link - "+ link.size());
	for (int i=0; i<link.size(); i++)
	{
//		link is to get link name - gettext
		 link.get(i).getText();
		 System.out.println("All links -"+  link.get(i).getText());
		 
//		 Attribute for to know the link - getattribute
		 link.get(i).getAttribute("href");
		 System.out.println("All Attributes -" +  link.get(i).getAttribute("href"));
	}
	
	
	}

}
