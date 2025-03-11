package pratice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagNamesEx {

	public static void main(String[] args) {

		//tagName:-it is used to capture the tagname of the webelement
		//return type is string
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();

		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
        System.out.println(allLinks.size());
		
        for (WebElement link : allLinks)
        {
			System.out.println(link.getText());
		}
	}

}
