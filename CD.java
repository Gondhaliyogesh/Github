package Webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class CD {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.ie.driver","C:\\Users\\Yogiii\\Downloads\\IEDriverServer_x64_3.8.0");
		WebDriver obj=new InternetExplorerDriver();
	}

}
