package day_1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Adactin {

	public static void main(String[] args) throws Exception {
		ChromeDriver obj = new ChromeDriver();
		obj.get("https://adactinhotelapp.com/SearchHotel.php");
		Thread.sleep(2000);
		obj.findElement(By.xpath("//input[@id='username']")).sendKeys("Vanisri443363");
		obj.findElement(By.xpath("//input[@id='password']")).sendKeys("0I4XW6");
		obj.findElement(By.id("login")).click();
		obj.manage().window().maximize();
		Select drop = new Select (obj.findElement(By.name("location")));
//		Select drop =new Select (obj.findElement(By.xpath("//td[@id='location']")));
		drop.selectByValue("London");
		obj.findElement(By.id("hotels"));
		Select drop1 = new Select (obj.findElement(By.id("hotels")));
		drop1.selectByIndex(3);
		obj.findElement(By.name("room_type"));
		Select drop2 = new Select (obj.findElement(By.name("room_type")));
		drop2.selectByVisibleText("Double");
		Select drop3 = new Select (obj.findElement(By.name("room_nos")));
		drop3.selectByIndex(3);
		obj.findElement(By.name("datepick_in")).sendKeys("08/10/2024");
		obj.findElement(By.name("datepick_out")).sendKeys("09/10/2024");
		Select drop4 = new Select (obj.findElement(By.name("adult_room")));
		drop4.selectByIndex(2);
		Select drop5 = new Select (obj.findElement(By.id("child_room")));
		drop5.selectByIndex(1);
		obj.findElement(By.id("Submit")).click();
		obj.findElement(By.id("radiobutton_0")).click();
		obj.findElement(By.id("continue")).click();
		obj.findElement(By.id("first_name")).sendKeys("Vanisri");
		obj.findElement(By.id("last_name")).sendKeys("Karthik");
		obj.findElement(By.id("address")).sendKeys("Chrompet");
		obj.findElement(By.id("cc_num")).sendKeys("1234567890123456");
		Select drop6 =new Select (obj.findElement(By.id("cc_type")));
		drop6.selectByIndex(2);
		Select mnth = new Select(obj.findElement(By.id("cc_exp_month")));
		mnth.selectByIndex(2);
		
		Select yr= new Select (obj.findElement(By.id("cc_exp_year")));
		yr.selectByValue("2025");

		obj.findElement(By.id("cc_cvv")).sendKeys("456");
		obj.findElement(By.id("book_now")).click();
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) obj;
		js.executeScript("window.scrollBy(0,700)");
//		obj.findElement(By.id("search_hotel")).click();
		obj.findElement(By.xpath("//input[@id='my_itinerary']")).click();
		
//		obj.findElement(By.id("logout")).click();
		
		  obj.findElement(By.id("1278780")).click();
		  obj.findElement(By.id("search_hotel")).click();
		 	}

}
