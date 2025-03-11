package pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class WebElementMethodsEx {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		/*
		 driver.get("https://www.flipkart.com");
		  
		  // method1,2:--sendKeys(), submit() 
		  WebElement searchBox =driver.findElement(By.name("q"));
		  searchBox.sendKeys("Puma"); //
		  searchBox.submit();
		  
		  //method3:-click()
		  driver.findElement(By.xpath("//button[@type='submit']")).click();
		 */

		// *************************************************************************************************
//		driver.get("https://www.saucedemo.com/v1");

		// method4:-clear()
		/*
		 * WebElement UserTextField = driver.findElement(By.name("user-name"));
		 * UserTextField .sendKeys("standard_user");
		 *  Thread.sleep(1000);
		 * UserTextField.clear(); 
		 * Thread.sleep(1000); 
		 * UserTextField.sendKeys("Shobha");
		 */
//==========================================================================================================
		// method5:-isDisplayed()
		driver.get("https://www.facebook.com");
		/*
		 WebElement logo = driver.findElement(By.xpath("//img[contains(@class,'fb')]"));
		  if(logo.isDisplayed())
		   {
		    System.out.println("Element is displayed"); 
		   } 
		   else
		    {
		  System.out.println("Element is not displayed"); }
		 */

		/*
		 * //method6:-isEnabled()
		   WebElement ele = driver.findElement(By.xpath("//a[text()='Create new account']"));
		    if(ele.isEnabled())
		     {
		      ele.click(); 
		     }
		      else
		      {
		       System.out.println("Not enabled");
		  }
		 */

		/*
		 * //method7:-isSelected() 
		 WebElement radio = driver.findElement(By.xpath("//input[@value=\"1\"]")); 
		 radio.click();
		  if (radio.isSelected())
		  {
		  System.out.println("radio button is selected");
		   }
		  else
		   { System.out.println("radio button is not selected");
		    }
		 */

		// method8:-getLocation()
		
		/*  WebElement ele = driver.findElement(By.xpath("//a[text()='Games']"));
		  System.out.println(ele.getLocation().getX());
		  System.out.println(ele.getLocation().getY());
		  
		  //method9:-getSize()
		   System.out.println(ele.getSize().getHeight());
		  System.out.println(ele.getSize().getWidth());
		  
		  //method10:-getRect() 
		  System.out.println(ele.getRect().getX());
		  System.out.println(ele.getRect().getY());
		  System.out.println(ele.getRect().getHeight());
		  System.out.println(ele.getRect().getWidth());*/
		 
//----------------------------------------------------------------------------------------------------------
		// driver.get("https://www.amazon.in");
		/*
		 //method11:-getTagName()
		  String search =driver.findElement(By.name("field-keywords")).getTagName();
		  System.out.println(search);
		 
		  //method12-getAttribute()
		   WebElement search1 = driver.findElement(By.name("field-keywords"));
		 // System.out.println(search1.getAttribute("aria-controls"));
		 System.out.println(search1.getAttribute("id"));
		 */

		// method13;-getDomAttribute()
		// WebElement link = driver.findElement(By.xpath("//a[text()='MX Player']"));
		// System.out.println(link.getDomAttribute("class"));

		// method14:-getDomProperty()
		// System.out.println(link.getDomProperty("clientWidth"));

		// method15:-getAriaRole()
		// System.out.println(link.getAriaRole());

//		WebElement search1 = driver.findElement(By.name("field-keywords"));
//		System.out.println(search1.getAriaRole());

//-----------------------------------------------------------------------------------------------------------
		// driver.get("https://www.flipkart.com");

		// method16:-getAccessibleName()
		// String ele =
		// driver.findElement(By.xpath("//a[@aria-label=\"Kilos\"]")).getAccessibleName();
		// System.out.println(ele);

		// String name = driver.findElement(By.name("q")).getAccessibleName();
		// System.out.println(name);

//		driver.get("https://www.facebook.com");
//		//method17:-getCssValue()
		WebElement ele = driver.findElement(By.xpath("//img[@alt='Facebook']"));
//		System.out.println(ele.getCssValue("color"));
		
		
	//String ele1 = driver.findElement(By.xpath("//button[text()='Log in']")).getCssValue("background-colorx");
//	System.out.println(ele1);
	
		
		//driver.get("https://www.flipkart.com");
//	driver.findElement(By.name("q")).sendKeys("iphone");
//	driver.findElement(By.cssSelector("[type=\"submit\"]")).click();
	
	//method18:-getText()
//	String name = driver.findElement(By.xpath("//div[text()='Apple iPhone 13 (Midnight, 128 GB)']")).getText();
//	System.out.println(name);
	
	
	}

}
