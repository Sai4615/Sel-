package day_1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radio_Checkbox {

	public static void main(String[] args) throws InterruptedException {
	ChromeDriver obj = new ChromeDriver();
	obj.get("https://demo.guru99.com/test/radio.html");
//	int size = obj.findElements(By.xpath("//input[@type='radio']")).size();
//	System.out.println("Radio size - " +size);
//	
//	int size2 = obj.findElements(By.xpath("//input[@type='checkbox']")).size();
//	System.out.println("Checkbox size - "+size2);

	 List<WebElement> all = obj.findElements(By.xpath("//input[@type='radio' and contains (@name, 'webform')]"));
		for (int i=0; i<all.size(); i++) {
			Thread.sleep(500);
			all.get(i).click();

		}
	
	List<WebElement> volume = obj.findElements(By.xpath("//input[@type='checkbox' and contains (@name, 'webform')]"));
//	for(int i=0; i<volume.size();i++)
//	{
//		volume.get(i).click();
//	}

//	int size = volume.size();
//	for (int j=0; j<size-1; j++)
//	{
//		volume.get(j).click();
//			
//	}
	
	int size = volume.size();
	for(int k=size-2; k<size ; k++) {
//		if(k<4);
		volume.get(k).click();
	}
	}

}
