package day_1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_selecthub {

	public static void main(String[] args) {
		ChromeDriver sel = new ChromeDriver();
		sel.get ("https://selectorshub.com/xpath-practice-page/");
		sel.findElement(By.xpath("//label[text()='User Email']/following-sibling::input[1]")).sendKeys("Vanisri");
		sel.findElement(By.xpath("//label[text()='Password']/following-sibling::input[1]")).sendKeys("A123");
		sel.findElement(By.xpath("//div[@class='element-companyId']/parent::div[not (contains(@style, 'none'))]//input[@name='company']")).sendKeys("TCS");
		sel.findElement(By.xpath("//button[@value=\"Submit\"]")).click();

	}

}
