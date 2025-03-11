package AdvanceScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingMouseACtions {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Actions act = new Actions(driver);

		// driver.get("https://www.flipkart.com");
		// method1:-moveToElement()
		// WebElement ele = driver.findElement(By.xpath("//span[text()='Fashion']"));
		// Actions act = new Actions(driver);
		// act.moveToElement(ele).perform();

//		WebElement ele1 = driver.findElement(By.xpath("//a[@title='Login']"));
//		Actions act = new Actions(driver);
//		act.moveToElement(ele1).perform();

		// method2:-contextClick()
//		WebElement data = driver.findElement(By.xpath("//span[text()='Kilos']"));
//		act.contextClick(data).perform();

//		driver.get("https://www.saucedemo.com/v1");
//		WebElement USERNAME = driver.findElement(By.name("user-name"));
//		WebElement PASSWORD = driver.findElement(By.id("password"));
//		WebElement LOGIN = driver.findElement(By.id("login-button"));
		
		//case1:-
//		act.sendKeys(USERNAME, "standard_user").perform();
//		act.sendKeys(PASSWORD, "secret_sauce").perform();
//		act.click(LOGIN).perform();
		
		//or
		
		//case2:-
//	act.sendKeys(USERNAME, "standard_user").sendKeys(PASSWORD, "secret_sauce").click(LOGIN).build().perform();

//		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
//		WebElement drag = driver.findElement(By.id("draggable"));
//		WebElement drop = driver.findElement(By.id("droppable"));
		
//		act.clickAndHold(drag).perform();
//		act.release(drop).perform();
		
		//or
//		act.clickAndHold(drag).release(drop).build().perform();
		
		//or
//		act.dragAndDrop(drag, drop).perform();
		
//		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
//		WebElement ele = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
//		act.doubleClick(ele).perform();
		
		driver.get("https://www.makemytrip.com");
		act.moveByOffset(10, 20).click().perform();
		
	}

}
