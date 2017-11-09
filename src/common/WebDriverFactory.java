package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class WebDriverFactory {
	
	private static String driversDirectory = "drivers";
	
	public static WebDriver getWebDriver(WebDriverTypes type) {
		switch (type) {
		case Chrome:
			return getChromeDriver();
		case Firefox:
			return getFireFoxDriver();
		case IE:
			return getIEDriver();
		default:
			return getChromeDriver();
		}
	}
	
	private static WebDriver getChromeDriver() {
		System.setProperty("webdriver.chrome.driver", driversDirectory + "\\chromedriver.exe");
		return new ChromeDriver();
	}
	
	private static WebDriver getFireFoxDriver() {
		System.setProperty("webdriver.gecko.driver", driversDirectory + "\\geckodriver.exe");
		return new FirefoxDriver();
	}
	
	private static WebDriver getIEDriver() {
		System.setProperty("webdriver.ie.driver", driversDirectory + "\\IEDriverServer.exe");
		return new InternetExplorerDriver();
	}
}
