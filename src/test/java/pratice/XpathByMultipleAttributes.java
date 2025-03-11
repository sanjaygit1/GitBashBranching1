package pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByMultipleAttributes {

	public static void main(String[] args) {

		//AND         OR
		//F F=F      //F F=F
		//F T=F      //F T=T
		//T F=F      //T F=T
		//T T=T      //T T=T

//	XpathByMultipleAttributes:- writting the path for a single element using multiple locators
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		
		//synatx:- AND   //htmltag[@AttributeNAme='AttributeValue' and @AttributeName='AttributeValue')]
		//	driver.findElement(By.xpath("//input[@title='Search for Products, Brands and More' and @name='q']")).sendKeys("Puma");
	
		//synatx:- OR   //htmltag[@AttributeNAme='AttributeValue' or @AttributeName='AttributeValue')]
	//	driver.findElement(By.xpath("//input[@title='Search for Products, Brands and ' or @name='q']")).sendKeys("Nike");
		driver.findElement(By.xpath("//input[contains(@title,'Search') and @name='q']")).sendKeys("Bluetooth");
       driver.findElement(By.xpath("//button[@type='submit' or contains(@aria-label,'Search')]")).click();
	
       driver.findElement(By.xpath("//a[text()='Aroma NB119 Pro Belief Upto 48H Playtime* Fast Charging...' and @class='wjcEIp']")).click();
	}

	
}
