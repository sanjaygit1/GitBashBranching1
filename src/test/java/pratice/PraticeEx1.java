package pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PraticeEx1 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.amazon.in");
//        driver.manage().window().maximize();
//        driver.findElement(By.name("field-keywords")).sendKeys("Puma");
//		driver.findElement(By.linkText("MX Player")).click();

	driver.get("https://www.flipkart.com");
//	driver.findElement(By.linkText("Mobiles")).click();
//driver.findElement(By.partialLinkText("Mobil")).click();
	
	//driver.findElement(By.partialLinkText("Flight")).click();
	
}

}
