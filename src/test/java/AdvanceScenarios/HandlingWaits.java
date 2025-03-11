package AdvanceScenarios;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingWaits {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/v1");

		// syntax version3:-
//		Options opt = driver.manage();
//		Timeouts time = opt.timeouts();
//		time.implicitlyWait(10,TimeUnit.SECONDS);
//		//or
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

//		syntax version4:-
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.name("user-name")).sendKeys("standard_user");
		driver.findElement(By.name("password")).sendKeys("secret_sauce");

		WebElement login = driver.findElement(By.className("btn_action"));

		// explicit wait
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.elementToBeClickable(login));
//		login.click();

//		wait.until(ExpectedConditions.titleContains("Home"));
//
//		driver.findElement(By.xpath("(//button[text()='ADD TO CART'])[1]")).click();

		//------------FluentWait-------------------------------
		FluentWait wait = new FluentWait(driver);
		wait.withTimeout(Duration.ofSeconds(10));
		wait.pollingEvery(Duration.ofSeconds(1));
		wait.until(ExpectedConditions.elementToBeClickable(login));
		login.click();
	}

}
