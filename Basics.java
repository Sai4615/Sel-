package day_1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Basics {
public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
//	WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.amazon.in/");
driver.getTitle();
System.out.println("Title to verify - " +driver.getTitle());
}
}
