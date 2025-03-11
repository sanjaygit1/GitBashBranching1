package pratice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EmptyBrowser {

	public static void main(String[] args) {

		// case1:-selenium:-3.141.59 with browser sever chromedriver.exe
		// Not Recommend because maintaining browser versions are tedious job
//		String key = "webdriver.chrome.driver";
//		String value = "./src/main/resources/chromedriver.exe";
//        System.setProperty(key, value);
//		WebDriver driver=new ChromeDriver();

		// case2:-Selenium:-3.141.59,webdrivermanager:-5.9.2

//		WebDriverManager.chromedriver().setup();
//		WebDriver driver=new ChromeDriver();

//		WebDriverManager.edgedriver().setup();
//		WebDriver driver=new EdgeDriver();

//		WebDriverManager.firefoxdriver().setup();
//		WebDriver driver=new FirefoxDriver();

		// case3:-Selenium :-4.28.1,webdrivermanager:-5.9.2

//		WebDriverManager.chromedriver().setup();
//		WebDriver driver=new ChromeDriver();

		// case4:- selenium:-4.28.1
		WebDriver driver = new ChromeDriver();
	}

}
