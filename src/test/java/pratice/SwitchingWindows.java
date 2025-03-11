package pratice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchingWindows {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();

		//method 10:-getWindowHandle()----->fetches the single window id where driver is currently in focus
		String id = driver.getWindowHandle();
		System.out.println(id);

	//	driver.close();
		
		driver.findElement(By.name("q")).sendKeys("puma", Keys.ENTER);
		driver.findElement(By.xpath("(//img[@class='_53J4C-'])[1]")).click();
		
		//method 11 :- getWindowHandles()--->fetches all window ids wins open in the application
		Set<String> wins = driver.getWindowHandles();
		
		System.out.println(wins);
		
		driver.quit();
	}

}
