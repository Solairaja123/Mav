package oranghrmcode;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import screenshort.screenshort;

public class code extends screenshort{
 WebDriver driver;
@Given("user is on login page")
public void userIsOnLoginPage()  {
	driver=new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    
}
@Given("user enter the username as {string}")
public void userEnterTheUsernameAs(String username) {
	driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(username);
    
}
@Given("user enter the password as {string}")
public void userEnterThePasswordAs(String password) {
	driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(password);
  
}
@When("user click  the login button")
public void userClickTheLoginButton() {
	driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
	
	
}

@When("user is go to user PIM page")
public void userIsGoToUserPIMPage() {
	driver.findElement(By.xpath("//span[text()='PIM']")).click();
	
    
}
@When("user is go  to the add employee")
public void userIsGoToTheAddEmployee() {
	driver.findElement(By.xpath("//a[text()='Add Employee']")).click();
    
}
@When("user is add the detail of the user")
public void userIsAddTheDetailOfTheUser() {
	
	
	driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("gopi");
	driver.findElement(By.xpath("//input[@placeholder='Middle Name']")).sendKeys("raja");
	driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("s");
	driver.findElement(By.xpath("//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']")).sendKeys("74225");
	driver.findElement(By.xpath("//div[@class='oxd-switch-wrapper']//label")).click();
	driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[3]")).sendKeys("gopliraja7411");
	driver.findElement(By.xpath("//div[@class='oxd-grid-item oxd-grid-item--gutters user-password-cell']//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@type='password']")).sendKeys("gopiraja898@");
	driver.findElement(By.xpath("//div[@class='oxd-grid-item oxd-grid-item--gutters']//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@type='password']")).sendKeys("gopiraja898@");
    
}
@When("user is save the detail")
public void userIsSaveTheDetail() {
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	
}
@When("user is go to the admin page")
public void userIsGoToTheAdminPage() {
	driver.findElement(By.xpath("//span[text()='Admin']")).click();
   
}
@When("Verifying the userdetail")
public void verifyingTheUserdetail() {
	
	
	driver.findElement(By.xpath("//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']")).sendKeys("gopliraja7411");
	driver.findElement(By.xpath("(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[1]")).click();
	driver.findElement(By.xpath("//span[contains(text(),'Admin')]")).click();
	
	WebElement username =driver.findElement(By.xpath("//input[@placeholder='Type for hints...']"));
	username.sendKeys("gopi raja s");
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	driver.findElement(By.xpath("//div[@role='option']")).click();
    driver.findElement(By.xpath("(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[2]")).click();
    driver.findElement(By.xpath("(//div[@role='option'])[3]")).click();

}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
   


}
