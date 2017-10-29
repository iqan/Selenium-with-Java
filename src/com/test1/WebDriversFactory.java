package com.test1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class WebDriversFactory {
	public static WebDriver getWebDriver(WebDriverTypes type) {
		switch (type) {
		case Chrome:
			return getChromeDriver();
		case FireFox:
			return getFireFoxDriver();
		case IE:
			return getIEDriver();
		default:
			return getChromeDriver();
		}
	}
	
	private static WebDriver getChromeDriver() {
		System.setProperty("webdriver.chrome.driver", "E:\\WebDrivers\\driver_exes\\chromedriver.exe");
		return new ChromeDriver();
	}
	
	private static WebDriver getFireFoxDriver() {
		System.setProperty("webdriver.gecko.driver", "E:\\WebDrivers\\driver_exes\\geckodriver.exe");
		return new FirefoxDriver();
	}
	
	private static WebDriver getIEDriver() {
		System.setProperty("webdriver.ie.driver", "E:\\WebDrivers\\driver_exes\\IEDriverServer.exe");
		return new InternetExplorerDriver();
	}
}
