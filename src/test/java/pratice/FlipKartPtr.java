package pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipKartPtr {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
//driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Nike");
//driver.findElement(By.xpath("//button[@type='submit']")).click();

//	driver.findElement(By.xpath("//span[text()='Kilos']")).click();

//		driver.findElement(By.xpath("//input[contains(@placeholder,'S')]")).sendKeys("puma");
	
	}

}
