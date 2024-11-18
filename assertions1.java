package day_1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;





public class assertions1 {

	public static void main(String[] args) {
		ChromeDriver obj = new ChromeDriver();
		obj.get("https://selenium08.blogspot.com/2019/07/check-box-and-radio-buttons.html");
Assert.assertTrue(obj.findElement(By.xpath("//input[@value = 'yellow']")).isDisplayed());
		obj.findElement(By.xpath("//input[@value = 'yellow']")).click();
	
		

	}

}
