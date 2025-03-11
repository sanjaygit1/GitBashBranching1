package PopUps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramePopupEx3 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/nested_frames");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.switchTo().frame("frame-top");
		driver.switchTo().frame("frame-left");
		String leftFrame = driver.findElement(By.xpath("//body[contains(text(),'LEFT')]")).getText();
        System.out.println(leftFrame);

//        driver.switchTo().frame("frame-top");
//        WebElement topFrame = driver.findElement(By.xpath("//frame[@name='frame-top']"));
//        driver.switchTo().frame(topFrame);
        
        driver.switchTo().parentFrame();
        
        WebElement Frame = driver.findElement(By.xpath("//frame[@name='frame-middle']"));
	    driver.switchTo().frame(Frame);
	    String middleFrame = driver.findElement(By.xpath("//div[text()='MIDDLE']")).getText();
	    System.out.println(middleFrame);
	    
	    driver.switchTo().defaultContent();
	    
	    driver.switchTo().frame("frame-bottom");
	    String bottomFrame = driver.findElement(By.xpath("//body[contains(text(),'BOTTOM')]")).getText();
	    System.out.println(bottomFrame);
	    
	}

}

