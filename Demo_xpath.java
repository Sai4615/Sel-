package day_1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_xpath {

	public static void main(String[] args) {
	ChromeDriver xpath = new ChromeDriver();
	xpath.get("https://demo.guru99.com/V4/");
//	xpath.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("mngr590145");
	xpath.findElement(By.name("uid")).sendKeys("mngr590145");
	xpath.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("UhaqesA");
	xpath.findElement(By.xpath("//input[@type=\"submit\"]")).click();
//	xpath.findElement(By.xpath("//a[text()='New Customer']")).click();
//	xpath.findElement(By.partialLinkText("Customer")).click();
	xpath.findElement(By.linkText("New Customer")).click();
	
	
	//input[@type='text'][@name='name']
//	xpath.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td[2]/input")).sendKeys("testing");
	xpath.findElement(By.xpath("//input[@type='text'][@name='name']")).sendKeys("Vanisri");
//	xpath.findElement(By.xpath("//input[@type='text'][@name='name']"))
	xpath.findElement(By.xpath("//input[@type='radio'][@value='f']")).click();
	xpath.findElement(By.xpath("//input[@type='date']")).sendKeys("15-04-2000");
	xpath.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[7]/td[2]/textarea")).sendKeys("Chrompet");
	xpath.findElement(By.xpath("//input[@type='text'][@name='city']")).sendKeys("Chennai");
	xpath.findElement(By.xpath("//input[@type='text'][@name='state']")).sendKeys("TN");
	xpath.findElement(By.xpath("//input[@type='text'][@name='pinno']")).sendKeys("600025");
	xpath.findElement(By.xpath("//input[@type='text'][@name='telephoneno']")).sendKeys("9597868552");
	xpath.findElement(By.xpath("//input[@type='text'][@name='emailid']")).sendKeys("vanisri123@gmail.com");
	xpath.findElement(By.xpath("//input[@type='password']")).sendKeys("rytEgEd");
	xpath.findElement(By.xpath("//input[@type='submit']")).click();
			

	}

}
