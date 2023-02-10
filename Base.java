package Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	public void SetUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hira\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		String url="https://parabank.parasoft.com/parabank/overview.htm";
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	}

}
