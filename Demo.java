package day_1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/V4/");
		driver.findElement(By.name("uid")).sendKeys("mngr598470");
		driver.findElement(By.name("password")).sendKeys("qynUted");
		driver.findElement(By.name("btnLogin")).click();
		driver.findElement(By.linkText("New Customer")).click();
		driver.findElement(By.name("name")).sendKeys("kahbd");
		driver.findElement(By.name("rad1")).isSelected();
		driver.findElement(By.name("dob")).sendKeys("20-03-1995");
		driver.findElement(By.name("addr")).sendKeys("Chefsfgsck");
		driver.findElement(By.name("city")).sendKeys("Chesgfck");
		driver.findElement(By.name("state")).sendKeys("Csgsheck");
		driver.findElement(By.name("pinno")).sendKeys("600064");
		driver.findElement(By.name("telephoneno")).sendKeys("9568925278");
		driver.findElement(By.name("emailid")).sendKeys("vanisri4433@gmail.com");
		driver.findElement(By.name("password")).sendKeys("rytEgEd");
		driver.findElement(By.name("sub")).click();
		driver.findElement(By.name("Continue")).click();
		driver.findElement(By.name("Edit Customer")).click();
		driver.findElement(By.name("cusid")).sendKeys("12345");
	}
}
