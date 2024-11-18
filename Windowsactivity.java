package day_1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Windowsactivity {

	public static void main(String[] args) throws InterruptedException {
	ChromeDriver obj = new ChromeDriver();
//	we can use navigate().to or get
	obj.navigate().to("https://www.amazon.in");
	obj.navigate().back();
	Thread.sleep(2000);
	obj.navigate().forward();
	

	}

}
