package PopUps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) throws Throwable {
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
//		driver.findElement(By.xpath("//a[text()='Register']")).click();
//		
//		 JavascriptExecutor js = (JavascriptExecutor)driver;
//	       
//	       for (int i = 0; i < 3; i++) 
//	       {
//			js.executeScript("window.scrollBy(0,200)");
//			Thread.sleep(1000);
//		}
//		//driver.findElement(By.xpath("//div[@class='focusable optionWrap selected ']")).click();
//
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("(//div[@class='radioWrap']//div[@class=\"focusable optionWrap  \"])[1]")).click();
//		Thread.sleep(1000);
//	driver.findElement(By.xpath("//div[@class='narrowFormats']")).sendKeys("C:\\Users\\Shobha\\Documents\\Applications.docx");
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		WebElement exp = driver.findElement(By.xpath("(//div[@class='textWrap'])[1]"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView()",exp);
		http://exp.click();
		driver.findElement(By.xpath("//button[text()='Upload Resume']")).sendKeys("C:\\Users\\Documents\\Applications.docx"); 
	}

}
