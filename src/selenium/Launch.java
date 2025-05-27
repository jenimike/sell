package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Launch {
	
public static void main(String[] args) {
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.omrbranch.com/");
	String title=driver.getTitle();
	String url1 =driver.getCurrentUrl();
	System.out.println(url1);
	
	driver.get("https://www.traininginomr.co.in");
	String title2 = driver.getTitle();
	System.out.println(title2);
	String url2 = driver.getCurrentUrl();
	System.out.println(url2);
	
	driver.get("https://greenstech.in");
	String title5 = driver.getTitle();
	System.out.println(title5);
	String url3 = driver.getCurrentUrl();
	System.out.println(url3);
	
	
	
}
}
