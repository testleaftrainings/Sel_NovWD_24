package week3.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWebdriverMethods1 {

	public static void main(String[] args) {
		// Launch the browser
		ChromeDriver driver =new ChromeDriver();
		
		//Loading the URL
		driver.get("http://leaftaps.com/opentaps/control/main");
		
        //Maximize the Browser
		driver.manage().window().maximize();
		
		//to get the title
		String titleOfPage = driver.getTitle();
		System.out.println("Page title is : "+titleOfPage);
		
		//to get the url of the page
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Current url is: "+currentUrl);
		
        //To get html page source
		String pageSource = driver.getPageSource();
		System.out.println("Page source is :"+pageSource);
		
		//to close the browser
		driver.close();
	}

}
