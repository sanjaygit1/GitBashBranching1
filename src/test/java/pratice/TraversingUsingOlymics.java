package pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TraversingUsingOlymics {

	public static void main(String[] args) throws Throwable {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.olympics.com/en/olympic-games/paris-2024/medals");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		// driver.findElement(By.xpath("//button[text()='Yes, I am happy']")).click();

		String goldMedal = driver.findElement(By.xpath("//span[text()='Algeria']/../../div[12][@title='Gold']"))
				.getText();
		System.out.println(goldMedal);
	}

}
