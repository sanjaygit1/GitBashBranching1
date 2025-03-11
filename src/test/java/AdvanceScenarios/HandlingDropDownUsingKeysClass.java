package AdvanceScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingDropDownUsingKeysClass {

	public static void main(String[] args) throws Throwable {

		// Handling DropDown
		// Three Approaches
		// * Using KeyBoardStrokes--->Keys class and Robot Class
		// * USing Select Class
		// * Using webElements

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();

		driver.findElement(By.linkText("Create new account")).click();
		WebElement dateList = driver.findElement(By.id("day"));
		dateList.click();
		dateList.sendKeys(Keys.ARROW_DOWN);
		dateList.sendKeys(Keys.ARROW_DOWN);
		dateList.sendKeys(Keys.ARROW_DOWN);
		dateList.sendKeys(Keys.ARROW_DOWN);

		WebElement monthList = driver.findElement(By.id("month"));
		monthList.click();
		monthList.sendKeys(Keys.ARROW_DOWN);
		monthList.sendKeys(Keys.ARROW_DOWN);

		Thread.sleep(1000);
		monthList.sendKeys(Keys.ARROW_UP);
		monthList.sendKeys(Keys.ARROW_UP);
		monthList.sendKeys(Keys.ARROW_UP);

	}

}
