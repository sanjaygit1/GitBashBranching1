package pratice;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethods {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver=new ChromeDriver();
		//method 9:-navigate()
	//	driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		
		//method1:-to()--->launching the application
	//	 driver.navigate().to("https://www.flipkart.com");

		Thread.sleep(2000);
	//	method2:-to(URL url)---->launching the application
		driver.navigate().to(new URL("https://www.flipkart.com"));
		
		Thread.sleep(2000);
		
		//method3:-back()----->Navigates back action on the webpage
		driver.navigate().back();
		
		Thread.sleep(2000);
		
		//method4:-forward()------>Navigates farward action on the webpage
		driver.navigate().forward();
	//	driver.navigate().forward();
		
		Thread.sleep(2000);
		//method5:-refresh()---->which refreshes the webpage
		driver.navigate().refresh();
	}

}
