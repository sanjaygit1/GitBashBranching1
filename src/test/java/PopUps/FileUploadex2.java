package PopUps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadex2 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://omayo.blogspot.com/");
		
		driver.findElement(By.id("uploadfile")).sendKeys("C:\\Users\\Shobha\\Documents\\Applications.docx");
	}

}
