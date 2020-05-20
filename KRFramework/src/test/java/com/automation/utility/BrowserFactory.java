package com.automation.utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;

public class BrowserFactory {
	
	public static WebDriver startApplication(WebDriver driver,String browsername,String url) {
		
		if (browsername.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browsername.equals("FF")) {
			System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (browsername.equals("Opera")) {
			System.setProperty("webdriver.opera.driver", "./Drivers/operadriver.exe");
			driver = new OperaDriver();
		} else if (browsername.equals("IE")) {
			System.setProperty("webdriver.ie.driver", "./Drivers/IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		else {
			System.out.println("We do not support this browser");
		}
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(url);
		
		return driver;
		
	}
	public static void quitbrowser(WebDriver driver) {
		driver.quit();
	}
}
