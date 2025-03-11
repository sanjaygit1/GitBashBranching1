package PopUps;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchingWindowUsingId {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();

		driver.findElement(By.name("q")).sendKeys("puma",Keys.ENTER);
	
		String mainId = driver.getWindowHandle();//win1
		System.out.println(mainId);
		
		driver.findElement(By.xpath("(//a[@class=\"WKTcLC\"])[1]")).click();
		
		Set<String> allWins = driver.getWindowHandles();//win1, win2
		System.out.println(allWins);
	
	for (String win : allWins)
	{
		if(!mainId.equals(win))//1  2
		{
			driver.switchTo().window(win);
		}
		
	}
	String price = driver.findElement(By.xpath("//div[@class='Nx9bqj CxhGGd']")).getText();
	System.out.println(price);
	}

}
