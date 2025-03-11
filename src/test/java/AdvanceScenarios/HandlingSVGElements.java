package AdvanceScenarios;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingSVGElements {

	public static void main(String[] args) {
		
		//SVG:-Scalable vector Graphics
		//* Noramal Approach of xpath is not applicable on svg element
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.kayak.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	
		//synatx:-- //*[name()='svg' and @AttributeName='AttributeValue']
		driver.findElement(By.xpath("//*[name()='svg' and @class=\"A_8a-icon\"]")).click();
	}

}
