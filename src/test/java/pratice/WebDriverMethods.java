package pratice;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods {

	public static void main(String[] args) {
		// launching an empty browser
		WebDriver driver = new ChromeDriver();

		// method1:-get():----->launching the web application
		driver.get("https://www.flipkart.com");

		// method2:-getTitle()--->Fetching the title of the webpage
		String title = driver.getTitle();
		System.out.println(title);

		// mathod3:-getCurrentUrl()---->fetches the current Url of the webpage
		String URL = driver.getCurrentUrl();
		System.out.println(URL);

		// method4:-getPageSource()---->fetches the source code of the webpage like
		// css,html and javascript code
		String pageData = driver.getPageSource();
		// System.out.println(pageData);

		// method5:-manage()-------->it used to manage browser actions
//		Options opt = driver.manage();
//		Window win = opt.window();
//		win.maximize();
		// or
//		driver.manage().window().maximize();

//		driver.manage().window().minimize();

//		driver.manage().window().fullscreen();

		// fetch the height and width of the webpage
//		Dimension size = driver.manage().window().getSize();
//		System.out.println(size.getHeight());
//		System.out.println(size.getWidth());

		//setSize()--->used to set the Height and width of the Browser
		//negative values are not allowed ,it throws InvalidArgumentException 
//		Dimension size1 = new Dimension(700, 900);
//		driver.manage().window().setSize(size1);
		
		//getPosition()--->fetches the x and y co-ordinates of the webpage
//		Point position = driver.manage().window().getPosition();
//		System.out.println(position.getX());
//		System.out.println(position.getY());

		//setPosition()--->sets the x and y co-oridates of the webpage
//		Point pos = new Point(100, 100);
//		driver.manage().window().setPosition(pos);

		//method6:- close()----->used to close a single tab/window where driver is currently in focus
	//	driver.close();
		
		//method7:- quit()----->closes all the Tabs/Windows including Browser
		driver.quit();
		
		
	}

}
