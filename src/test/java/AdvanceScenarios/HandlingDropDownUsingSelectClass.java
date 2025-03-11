package AdvanceScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDownUsingSelectClass {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();

		driver.findElement(By.linkText("Create new account")).click();
		WebElement dateList = driver.findElement(By.id("day"));
		WebElement monthList = driver.findElement(By.id("month"));
		WebElement yearList = driver.findElement(By.id("year"));
		
		//Select By Index ---->Index value starts from 0
		Select select = new Select(dateList);
	//	select.selectByIndex(14);
	//	select.selectByValue("20");
		select.selectByVisibleText("25");
		
		Select select1 = new Select(monthList);
	//	select1.selectByIndex(10);
	//	select1.selectByValue("8");
		select1.selectByVisibleText("Dec");
		
		Select select2 = new Select(yearList);
	//	select2.selectByIndex(27);
	//	select2.selectByValue("2015");
		select2.selectByVisibleText("2010");
		
	}

}
