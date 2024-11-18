package day_1;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import javax.swing.text.html.HTML.Tag;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLink {

	public static void main(String[] args) throws IOException {
		ChromeDriver obj = new ChromeDriver();
		obj.get("https://www.hyrtutorials.com/");
		List<WebElement> brok = obj.findElements(By.tagName("a"));
		brok.size();
		System.out.println("Size of link - " + brok.size());
		for (WebElement link:brok) {
	
			String name = link.getAttribute("href");
			URL url = new URL(name);
			URLConnection openConnection = url.openConnection();
			HttpURLConnection httpURLconnection= (HttpURLConnection) openConnection;
			httpURLconnection.connect();
			if (httpURLconnection.getResponseCode()==200)
			{
				System.out.println(name+"_"+httpURLconnection.getResponseMessage());
			}
				else 
				{
					System.err.println(name+"_"+httpURLconnection.getResponseMessage());
						
			}
		}
		
	}

}
