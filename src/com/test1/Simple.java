package com.test1;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;

public class Simple {
	
	private static WebDriver driver;
	
	public static void main(String[] args){
		
		System.out.println("0: Chrome");
		System.out.println("1: FireFox");
		System.out.println("2: IE");
		System.out.println("Enter choice:");
		
		Scanner scanner = new Scanner(System.in);
		int in = scanner.nextInt();
		WebDriverTypes type = WebDriverTypes.values()[in];
		
		try {
			driver = WebDriversFactory.getWebDriver(type);
			
			navigateToGoogle(driver);
			waitFor5Seconds();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			driver.quit();
			scanner.close();
		}
	}
	
	private static void waitFor5Seconds() throws InterruptedException {
		Thread.sleep(5000);		
	}	
	
	private static void navigateToGoogle(WebDriver driver){
		driver.get("http://www.google.com");
	}
}
