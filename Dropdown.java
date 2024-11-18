package day_1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		ChromeDriver obj = new ChromeDriver ();
		obj.navigate().to("https://demo.guru99.com/test/newtours/register.php");
		Select drop = new Select(obj.findElement(By.name("country")));
//		drop.selectByIndex(2);
//		drop.selectByValue("CANADA");
//		Black color value from inspect for visible text
//		drop.selectByVisibleText("DENMARK"); 
//		System.out.println("To find in index - " +drop.getFirstSelectedOption().getText() );
//
//		drop.selectByIndex(2);
//		drop.selectByValue("ARGENTINA");
		
//		drop.selectByIndex(1);
//		drop.selectByValue("ANGUILLA");
		drop.selectByVisibleText("BOLIVIA");
		
	}

}
