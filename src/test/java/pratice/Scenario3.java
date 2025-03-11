package pratice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario3 {

	public static void main(String[] args) throws Throwable {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bigbasket.com");
		driver.manage().window().maximize();

		// driver.findElement(By.xpath("//input[@placeholder='Search for
		// Products...']")).sendKeys("Apples");

		// driver.findElement(By.xpath("(//input[@placeholder='Search for
		// Products...'])[1]")).sendKeys("Apples");

		driver.findElement(By.xpath("(//input[@placeholder='Search for Products...'])[2]")).sendKeys("Apples",
				Keys.ENTER);

		Thread.sleep(2000);

		List<WebElement> names = driver.findElements(By.xpath("//div[@class='break-words h-10 w-full']"));
		List<WebElement> price = driver
				.findElements(By.xpath("//div[@class='Pricing___StyledDiv-sc-pldi2d-0 bUnUzR']"));

		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i).getText() + "----------->" + price.get(i).getText());

		} 

	}

}
