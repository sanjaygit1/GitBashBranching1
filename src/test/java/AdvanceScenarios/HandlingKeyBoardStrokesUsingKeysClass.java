package AdvanceScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingKeyBoardStrokesUsingKeysClass {

	public static void main(String[] args) {
		
		//Handling keyboard STrokes---->Handling system keyboard
		//2 approaches:--->keys class and Robot Class
		//Keys class---->statics in nature
		//Robot class---->non static in nature
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1");
		driver.manage().window().maximize();
		
		//case1:-
//		driver.findElement(By.name("user-name")).sendKeys("standard_user");
//		WebElement PassWord = driver.findElement(By.name("password"));
//		PassWord.sendKeys("secret_sauce");
//		PassWord.sendKeys(Keys.ENTER);
		//or
		
//		driver.findElement(By.name("user-name")).sendKeys("standard_user");
//		WebElement PassWord = driver.findElement(By.name("password"));
//		PassWord.sendKeys("secret_sauce",Keys.ENTER);
		
		//or
//		driver.findElement(By.name("user-name")).sendKeys("standard_user");
//		driver.findElement(By.name("password")).sendKeys("secret_sauce",Keys.ENTER);
		
		//case2:-
//		WebElement USERNAME = driver.findElement(By.name("user-name"));
//		USERNAME.sendKeys("standard_user");
//		USERNAME.sendKeys(Keys.TAB,"secret_sauce",Keys.ENTER);
		
	    //case3:-
		driver.findElement(By.name("user-name")).sendKeys("standard_user",Keys.TAB,"secret_sauce",Keys.ENTER);
	
	
	}

}
