package day_1;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Brklink2 {

	public static void main(String[] args) throws IOException {
		ChromeDriver obj= new ChromeDriver();
		obj.get("https://demo.guru99.com/test/newtours/");
		List<WebElement> tag = obj.findElements(By.tagName("a"));
		tag.size();
		System.out.println("URL count - " +tag.size());
		
		for (WebElement link:tag) {
		
			String attribute = link.getAttribute("href");
			URL wait = new URL(attribute);
			URLConnection OC = wait.openConnection();
			HttpURLConnection http = (HttpURLConnection) OC;
			http.connect();
			
			if (http.getResponseCode()==200) 
			
			{
				
				System.out.println(attribute+"_"+http.getResponseMessage());
			}
			else
			{
				System.err.println(attribute+"_"+http.getResponseMessage());
			}
			
			
			
		}
		

	}

}
