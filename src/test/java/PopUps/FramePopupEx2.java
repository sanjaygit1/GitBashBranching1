package PopUps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramePopupEx2 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();

		//switching frame using index
//		driver.switchTo().frame(1);
//        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Welcome");
    
		//switching frame using id Attribute
//		driver.switchTo().frame("singleframe");
//		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Gud mrng");
		
		//switching frame using name Attribute
//		driver.switchTo().frame("SingleFrame");
//		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Hi");
	
		//switching frame using webElement
	    WebElement frameEle = driver.findElement(By.xpath("//iframe[@id='singleframe']"));
	    driver.switchTo().frame(frameEle);
	    driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Qspiders");
	
	}

}
