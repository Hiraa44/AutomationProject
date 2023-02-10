package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;

public class Login {
WebDriver driver;
	
	//Constructor that will be automatically called as soon as the object of the class is created
	public Login(WebDriver driver) {
		this.driver=driver;
	}
	@DataProvider(name = "data-provider")
	   public static Object [] [] dataProviderMethod () {
           
	     return new Object[][] { { "first Object " }, { "second Object" } };
	   }
	
	
	//Locator for login button
	By Username = By.name("username");
	By Password=By.name("password");
	By button=By.xpath("//input[@class=\"button\"]");
	
	//Method to click login button
	public void clickLogin(String name) {
		driver.findElement(Username).sendKeys(name);
	}
	public void EnterPasswors(String pass) {
		driver.findElement(Password).sendKeys("pass");
	}
	public void ClickLogin() {
		driver.findElement(button).click();
	}
}
