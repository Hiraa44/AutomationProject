
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.RemoteWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.SessionId;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Pages.Base;
import Pages.Login;
import Pages.Register;

public class TestCase1 {
	// static WebDriver driver;
	// String url;

	public void Setup() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Hira\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		String url = "https://parabank.parasoft.com/parabank/overview.htm";

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Test(enabled=false)
	public void SignIn() {

		
		  System.setProperty("webdriver.chrome.driver",
		  "C:\\Users\\Hira\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		  String url = "https://parabank.parasoft.com/parabank/overview.htm";
		 
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		String url1 = driver.getCurrentUrl();
		Assert.assertEquals(url, url1);

		Login l1 = new Login(driver);
		l1.clickLogin("Bank");
		l1.EnterPasswors("123456");
		l1.ClickLogin();
		SessionId s = ((RemoteWebDriver) driver).getSessionId();
		System.out.println("Session Id is: " + s);

	}

	@Test(enabled=false)
	public void SignUp() {
		
		  System.setProperty("webdriver.chrome.driver",
		  "C:\\Users\\Hira\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		  String url = "https://parabank.parasoft.com/parabank/overview.htm";
		 
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Register r1 = new Register(driver);
		// r1.ClickRegister();
		// new WebDriverWait(driver,
		// 20).until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div[3]/div[1]/div/p[2]/a"))).click();

		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Assert.assertEquals(url,urls);
		r1.linkClick();
		String urls = driver.getCurrentUrl();
		System.out.println(urls);
		Assert.assertEquals(urls, urls);
		int len = urls.length();
		System.out.println(len);
		System.out.println("=======================");
		String session = urls.substring(52, 95);
		System.out.println(session);
		r1.EnterFirstname("Steve");
		r1.EnterLastName("Harvey");
		r1.EnterAddress("85, California Lahore");
		r1.EnterCity("San Fransisco");
		r1.EnterState("USA");
		r1.EnterZipCode(54000);
		r1.SSN(0000);
		r1.Phone("090078601");
		r1.Password("abcdef");
		r1.ConfirmPassword("abcdef");
		r1.EnterUsername("Hbank");
		r1.ClickRegsiter();
	
		String rurl = driver.getCurrentUrl();
		Assert.assertEquals(urls, "https://parabank.parasoft.com/parabank/register.htm;" + session);
		

		// new WebDriverWait(driver,
		// 20).until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div[3]/div[1]/div/p[2]/a"))).click();

	}
	@Test
	public void ClickButton() {
		  System.setProperty("webdriver.chrome.driver",
				  "C:\\Users\\Hira\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
				  String url = "https://parabank.parasoft.com/parabank/overview.htm";
				 
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get(url);
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				WebElement w=driver.findElement(By.xpath("//div[2]//ul[2]//li//a[1]"));
				w.click();
				String curl=driver.getCurrentUrl();
				System.out.println(curl.length());
				String session = curl.substring(49, 92);
				System.out.println(session);
				Assert.assertEquals(curl,"https://parabank.parasoft.com/parabank/index.htm;"+session);
				
	}

}
