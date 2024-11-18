package day_1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotCR {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ChromeDriver ss = new ChromeDriver();
		ss.get("https://www.google.com/");
		File var = ((TakesScreenshot)ss).getScreenshotAs(OutputType.FILE);
//	FileUtils.copyFile(var, new File("C:\\Users\\tjkar\\OneDrive\\Desktop\\SS_Class.png"));
	FileUtils.copyFile(var, new File(".//Folder//SS_class.png"));
	}

}
