package pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TraversingUsingProKabadi {

	public static void main(String[] args) {
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.prokabaddi.com/standings");
		driver.manage().window().maximize();
	//Traversing using parent child relationship	
//String wonMatch = driver.findElement(By.xpath("//p[text()='Dabang Delhi K.C.']/../../../..//div[@class='table-data matches-won']")).getText();
//System.out.println("total num of matches won----->"+wonMatch);
	
//String lostMatch = driver.findElement(By.xpath("//p[text()='Dabang Delhi K.C.']/../../../..//div[@class='table-data matches-lost']")).getText();	
//System.out.println("total num of matches lost---->"+lostMatch);	

//String totalPoints = driver.findElement(By.xpath("//p[text()='Dabang Delhi K.C.']/../../../..//div[@class='table-data points']")).getText();
//System.out.println("total num of points----->"+totalPoints);	

		//Traversing using sibling concept---->following-sibling:- elder sibling taverlling to younger sibling
String won = driver.findElement(By.xpath("//p[text()='Haryana Steelers']/../../../following-sibling::div[@class='table-data matches-won']")).getText();
System.out.println("total numof matches won----->"+won);
	
	
	}

}
