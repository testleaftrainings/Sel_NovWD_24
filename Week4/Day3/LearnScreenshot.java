package week4.day3;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnScreenshot {

	public static void main(String[] args) throws IOException {
		ChromeDriver driver =new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		//To take the screenshot - source
		File source = driver.getScreenshotAs(OutputType.FILE);
		
		//Set up the path to store the image -destination
		File destination=new File("./screenshots/homepage.png");
		
		//Combine the source and destination
          FileUtils.copyFile(source, destination);
	}

}
