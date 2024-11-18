package day_1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Pra_Guru99 {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver obj = new ChromeDriver ();
		obj.navigate().to("https://demo.guru99.com/test/newtours/register.php");
		Thread.sleep(1000);
		obj.manage().window().maximize();
		obj.findElement(By.name("firstName")).sendKeys("Vanisri");
		obj.findElement(By.name("lastName")).sendKeys("Karthik");
		obj.findElement(By.xpath("//input [@name= 'phone']")).sendKeys("5987456321");
		obj.findElement(By.id("userName")).sendKeys("vaisijfo@gmail.com");
		obj.findElement(By.name("address1")).sendKeys("Chrompet");
		obj.findElement(By.name("city")).sendKeys("Chennai");
		obj.findElement(By.name("state")).sendKeys("TN");
		obj.findElement(By.name("postalCode")).sendKeys("600064");
		obj.findElement(By.name("country"));
		Select drop = new Select (obj.findElement(By.name("country")));
		drop.selectByValue("ANGOLA");
		obj.findElement(By.name("email")).sendKeys("mngr590145");
		obj.findElement(By.name("password")).sendKeys("Sai@123");
		obj.findElement(By.name("confirmPassword")).sendKeys("Sai@123");
		obj.findElement(By.name("submit")).click();

	}
	}
