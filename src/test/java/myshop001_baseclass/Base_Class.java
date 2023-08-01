package myshop001_baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Base_Class {

	public static WebDriver driver;

	public static WebDriver getbrower(String browser) {

		if (browser.equals("Chrome")) {

			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + ("\\Driver\\chromedriver.exe"));
			driver = new ChromeDriver();

		}

		else if (browser.equals(browser)) {
			System.setProperty("webdriver.gecko.driver",
					System.getProperty("user.dir") + ("\\Driver\\geckodriver.exe"));
			driver = new ChromeDriver();
		} else {
			System.out.println(".......Invalid Browser......");
		}
		driver.manage().window().maximize();
		return driver;

	}

	public static void url(String url) {
		driver.get(url);
		driver.manage().window().maximize();
	}

	public void click(WebElement element) {
		element.click();
	}

	public  Select selectelement( WebElement element) {
		Select sl = new Select(element);
		return sl;
	}
	
	

}