package PopUps;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowSwitchingUsingTitle {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Windows.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.linkText("Open New Seperate Windows")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();

		Set<String> allWins = driver.getWindowHandles();// win1 win2

		for (String win : allWins) {
			driver.switchTo().window(win);
			String title = driver.getTitle();
			// System.out.println(title);

			if (title.contains("Selenium")) {
				break;
			}
		}
		driver.findElement(By.xpath("//a[text()='Read more']")).click();
	//--------------------------------------------------------------------------------------------------------	
		Set<String> allwins1 = driver.getWindowHandles();
	
	for (String win1 : allwins1)
	{
		driver.switchTo().window(win1);
		String title1 = driver.getTitle();
		System.out.println(title1);
		if(title1.contains("Selenium Community Live"))
		{
			break;
		}
	}
	driver.findElement(By.xpath("//a[text()='Join now']")).click();
	//--------------------------------------------------------------------------------------------------------
	
	}

}
