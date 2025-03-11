package AdvanceScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingDropDownUsingWebElements {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();

		driver.findElement(By.linkText("Create new account")).click();

		driver.findElement(By.xpath("//option[text()='10']")).click();
	
		driver.findElement(By.xpath("(//option[@value=\"7\"])[2]")).click();
		
		driver.findElement(By.xpath("//option[.='2009']")).click();
	}

}
