package pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpath {

	public static void main(String[] args) {

		// Basic Relative Xpath:- supports all the attributes,all the htmltags and all
		// the visible text.
		// symbols:- //----->Traversing entire html doc/traversing from parent to any
		// child.
		// []---->Back ends
		// @---->Attribute Symbol
		// text()---->visible text
		// contains()--->removing the space ,special characters,numbers from the path

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");

		// xpath by Attribute AttributeName="AttributeValue"
		// syntax1:---> //htmltag[@AttributeName='AttributeValue']

		// driver.findElement(By.xpath("//input[@placeholder='Search
		// Amazon.in']")).sendKeys("puma");
		// driver.findElement(By.xpath("//input[@value='Go']")).click();

		// xpath by visibleText >visibleText<
		// syntax:----> //htmltag[text()='AttributeValue']

		// driver.findElement(By.xpath("//a[text()=\"Today's Deals\"]")).click();

		// xpath contains Attribute
		// syntax:----->//htmltag[contains(@AttributeName,'AttributeValue')]
		// driver.findElement(By.xpath("//input[contains(@aria-label,'S')]")).sendKeys("bluetooth");

		// xpath contains visible text
		// syntax1;------->htmltag(contains(text(),'AttributeValue')]
		driver.findElement(By.xpath("//a[contains(text(),\"Tod\")]")).click();

	}

}
