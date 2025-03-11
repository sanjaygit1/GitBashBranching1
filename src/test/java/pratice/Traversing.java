package pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Traversing {

	public static void main(String[] args) {

		// Traversing using parent child relationship
		// /---->Traversing from parent to immd child
		// /..---->Traversing from child to parent
		// //------>Tarversing from parent to any child
		// text()->.
		// htmltag->*
		// /parent::htmltag ---->Traversing from child to parent
		// /child::htmltag----->Traversing from parent to immd child
		// /following-sibling::htmltag---->Traversing from elder sibling to younger
		// sibling
		// /preceding-sibling::htmltag---->Traversing from younger sibling to elder
		// sibling
		// /ancestor::htmltag----->Traversing from child to any parent
		// /descendant::htmltag--->Traversing from parent to any child

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.findElement(By.name("q")).sendKeys("iphone");
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		// String price = driver.findElement(By.xpath("//div[text()='Apple iPhone 13
		// (Blue, 128 GB)']/../..//div[@class='Nx9bqj _4b5DiR']")).getText();
		// System.out.println(price);

//String price = driver.findElement(By.xpath("//div[text()='Apple iPhone 13 (Midnight, 128 GB)']/../following-sibling::div[@class='col col-5-12 BfVC2z']//div[@class='Nx9bqj _4b5DiR']")).getText();
//System.out.println(price);

//		String price = driver.findElement(By.xpath("//div[text()='Apple iPhone 13 (Midnight, 128 GB)']/parent::div/parent::div//div[@class='hl05eU']/child::div[@class='Nx9bqj _4b5DiR']")).getText();
//		System.out.println(price);

String price = driver.findElement(By.xpath("//div[text()='Apple iPhone 13 (Midnight, 128 GB)']/ancestor::div[@class='yKfJKb row']/descendant::div[@class='Nx9bqj _4b5DiR']")).getText();
System.out.println(price);
	}

}
