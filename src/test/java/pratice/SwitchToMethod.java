package pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToMethod {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://the-internet.herokuapp.com/javascript_alerts");

	driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();

	//method8:- switchTo()--->swtching to alert popup,windows or frames
		driver.switchTo().alert().accept();

	
	}

}
