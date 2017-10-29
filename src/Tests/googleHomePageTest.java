package Tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import common.WebDriverFactory;
import common.WebDriverTypes;
import pageObjects.google.HomePage;

public class googleHomePageTest {
	
	HomePage homePage;
	WebDriver driver;
	
	@BeforeTest
	public void Initialize(){
		this.driver = WebDriverFactory.getWebDriver(WebDriverTypes.Chrome);
		this.homePage = new HomePage(driver);
	}
	
	@Test
	public void Should_Navigate_To_Home_Page() {
		this.homePage.navigate();
		Boolean searchBoxDisplayed = this.homePage.isSearchBoxPresent();
		Assert.assertTrue(searchBoxDisplayed);
	}
	
	@Test
	public void Should_Search_For_Word(){
		this.homePage.navigate();
		this.homePage.enterSearchWord("hello");
		this.homePage.search();
		String results = this.homePage.getSearchResults();
		Assert.assertTrue(results.contains("results"));
	}
	
	@AfterTest
	public void cleanUp(){
		this.driver.quit();
		this.homePage = null;
		this.driver = null;		
	}
}
