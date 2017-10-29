package pageObjects.google;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	private String url = "https://www.google.com";
	private WebDriver driver;
	
	@FindBy(id="lst-ib")
	WebElement searchInput;
		
	@FindBy(id="resultStats")
	WebElement searchResults;
	
	public HomePage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void navigate(){
		driver.get(url);
	}
	
	public Boolean isSearchBoxPresent(){
		return searchInput.isDisplayed();
	}
	
	public void enterSearchWord(String searchWord){
		searchInput.sendKeys(searchWord);
	}
	
	public void search(){
		searchInput.submit();
	}
	
	public String getSearchResults(){
		return searchResults.getText();
	}
}
