package pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.saucedemo.com/v1");

		// syntax1:- [AttributeName='AttributeValue']
		// driver.findElement(By.cssSelector("[data-test='username']")).sendKeys("standard_user");

		// syntax2:- htmltag[AttrributeName='AttributeValue']
		// driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("secret_sauce");

		// syntax3: supports only id Attribute, shortcut of id ------>#
		// ---->#AttributeValue
		driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");

		// syntax4:- supports only id Attribute, shortcut of id ------>#
		// ------>html#AttributeValue
		driver.findElement(By.cssSelector("input#password")).sendKeys("secret_sauce");

		// syntax5:- supports only className Attribute, shortcut of className------>.
		// ------>.AttributeValue
		// driver.findElement(By.cssSelector(".btn_action")).click();

		// syntax6:- supports only className Attribute, shortcut of className------>.
		// ------>htmltag.AttributeValue
		driver.findElement(By.cssSelector("input.btn_action")).click();

	}

}
