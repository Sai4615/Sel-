package day_1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoQA_practice {
public static void main(String[] args) {
	ChromeDriver obj = new ChromeDriver();
	obj.get("https://demoqa.com/automation-practice-form");
	obj.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Vanisri");
	obj.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Karthik");
	obj.findElement(By.xpath("//label[text() ='Female']")).click();

}
}
