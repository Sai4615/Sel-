package day_1;

import java.util.List;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) {
		ChromeDriver obj = new ChromeDriver();
		obj.get("https://selenium08.blogspot.com/2019/07/check-box-and-radio-buttons.html");
//		obj.findElement(By.xpath("//input[@value=\"red\"]")).click();
//		findElement"s" - S need to use then only we can find the size.
//		obj.findElements(By.xpath("//input[@type='checkbox']")).size();
//		System.out.println(
//				"To find the count of Checkbox - " + obj.findElements(By.xpath("//input[@type='checkbox']")).size());
		
		// input[@value='blue']
		
//		Below is "for" loop to select all the check box and need to change local var and apply in loops
//		to Click all the checkbox use below Syntax
		
		  List<WebElement> elements = obj.findElements(By.xpath("//input[@type='checkbox' and contains(@name,'color')]")); 
		  for (int i=0; i<elements.size();i++) {
		  
		  elements.get(i).click(); }
//		 
//	Randow checkbox to select =
		
		  List<WebElement> elements1 = obj.findElements(By.
		  xpath("//input[@type='checkbox' and contains(@name,'color')]"));
		  
		  for (WebElement random: elements1) {
			  String attribute = random.getAttribute("value"); 
			  if (attribute.equals("green") ||
		  attribute.equals("red"))  
			  {
				  random.click();
			  }}
		 
		
		  // Last 2 checkbox need to select 
//		List<WebElement> elements = obj.findElements(By.xpath("//input[@type='checkbox' and contains(@name,'color')]"));
//		  int size = elements.size();
//		  for (int i=size-2; i<size; i++)
//		  { 
//			  elements.get(i).click(); 
//			  }
		 

//		List<WebElement> elements1 = obj.findElements(By.xpath("//input[@type='checkbox' and contains(@name,'color')]"));
//
//		int size = elements1.size();
//		for (int j = 0; j < size; j++) {
//			if(j<3) {
//			elements1.get(j).click();
//		}
//	}}
}
}
