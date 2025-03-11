package AdvanceScenarios;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAutoSuggUsingBisBasket {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bigbasket.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//input[@placeholder='Search for Products...'])[2]")).sendKeys("Apples");

		Thread.sleep(2000);
		List<WebElement> allApples = driver.findElements(By.xpath("//span[@class='Label-sc-15v1nk5-0 QuickSearch___StyledLabel2-sc-rtz2vl-7 gJxZPQ gFDEBU']"));
	
	for (WebElement apple : allApples)
	{
		System.out.println(apple.getText());
		if(apple.getText().equals("Apple - Royal Gala, Premium"))
		{
			apple.click();
		}
	}
	}

}
