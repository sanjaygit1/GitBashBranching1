package pratice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario1 {

	public static void main(String[] args) throws Throwable {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();

		driver.findElement(By.cssSelector("[name='q']")).sendKeys("iphone");
		driver.findElement(By.cssSelector("[type='submit']")).click();

		Thread.sleep(1000);
		List<WebElement> allNames = driver.findElements(By.cssSelector("[class='KzDlHZ']"));

		for (WebElement phnName : allNames) {
			System.out.println(phnName.getText());
		}

	}

}
