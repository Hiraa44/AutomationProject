package Pages;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

public class Register {
	WebDriver driver;
    //By register= By.xpath("//a[@href=\"register.htm\"]");
  //  By register=By.xpath("/html/body/div[1]/div[3]/div[1]/div/p[2]/a");
	By register=By.linkText("Register");
	By FirstName =By.name("customer.firstName");
	By LastName = By.name("customer.lastName");
	By address = By.name("customer.address.street");
	By City= By.name("customer.address.city");
	By state = By.name("customer.address.state");
	By zip_code= By.name("customer.address.zipCode");
	By phone = By.name("customer.phoneNumber");
	By SSN= By.name("customer.ssn");
	By username= By.name("customer.username");
	By password=By.name("customer.password");
	By confirmPassword=By.name("repeatedPassword");
	By ClickRegister= By.xpath("//input[@value=\"Register\"]");
	By GetError=By.name("customer.username.errors");
	
	
	
	
  public Register(WebDriver driver) {
			this.driver=driver;
  }
  public void linkClick() {
	  driver.findElement(register).click();
  }
  public void EnterFirstname(String fname) {
	  driver.findElement(FirstName).sendKeys(fname);
  }
  public void EnterLastName(String lname) {
	  
	  driver.findElement(LastName).sendKeys(lname);
  }
  public void EnterAddress(String add) {
	  driver.findElement(address).sendKeys(add);
  }
  public void EnterCity(String city) {
	  driver.findElement(City).sendKeys(city);
  }
  public void EnterState(String st) {
	  driver.findElement(state).sendKeys(st);
  }
 
  public void EnterZipCode(int zip) {
	  String szip=String.valueOf(zip);
	  driver.findElement(zip_code).sendKeys(szip);
  }
  public void Phone(String ph) {
	  driver.findElement(phone).sendKeys(ph);
  }
  public void SSN(int ssn) {
	 String assn=String.valueOf(ssn);
    driver.findElement(SSN).sendKeys(assn);
  }
  public void EnterUsername(String uname) {
	  driver.findElement(username).sendKeys(uname);
  }
  public void Password(String pass) {
	  driver.findElement(password).sendKeys(pass);
  }
  public void ConfirmPassword(String cpass) {
	  driver.findElement(confirmPassword).sendKeys(cpass);
  }
 // public String Error() {
//	 String error= driver.findElement(GetError).getText();
	// return error;
 // }
  public void ClickRegsiter() {
	  driver.findElement(ClickRegister).click();
  }
  
}
