package PopUps;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp {

	public static void main(String[] args) {

		// Alert popup is called as conformation popup/javascript popup.
		// Alert popup are not Draggable/inspectable
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");

		//case1:- alert accept
		// driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
        //  Alert alt = driver.switchTo().alert();
       
		//	alt.accept();//--------->//Accept alert popup(clicking OK button)
		
		//case2:-
		//driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		//Alert alt = driver.switchTo().alert();
		
		//alt.dismiss();----------->//To cancel the alert popup(clicking Cancel button)
		
		//or
		//driver.switchTo().alert().accept();
		
		//case3:-
		//driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		
		//String text = driver.switchTo().alert().getText();//--------->fetching the alert message
	    //System.out.println(text);
	
		//case4:-.
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		Alert alt = driver.switchTo().alert();
		
		alt.sendKeys("Im accpeting the alert popup");//------>sending the text message into alert popup
		alt.accept();
	}

}
