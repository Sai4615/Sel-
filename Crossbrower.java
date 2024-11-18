package day_1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Crossbrower {

	public static void main(String[] args) {
	ChromeDriver cd = new ChromeDriver();
	cd.manage().window().maximize();
	cd.get("https://www.google.com/");
	FirefoxDriver fd = new FirefoxDriver();
	fd.get("https://www.amazon.in");
	EdgeDriver ed = new EdgeDriver();
	ed.get("https://www.flipkart.com");
	}

}
