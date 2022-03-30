package stepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import io.cucumber.junit.Cucumber;

import java.time.Duration;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@RunWith(Cucumber.class)
public class stepDefination {
public WebDriver driver;

    @Given("^RSA login page to login$")
    public void rsa_login_page_to_login() throws Throwable {
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\OneDrive\\Desktop\\Sagar.Selenium\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/#/index"); 
		driver.manage().window().maximize();
		}

    @When("^sign using (.+) and (.+)$")
    public void sign_using_and(String username, String password) throws Throwable {
    	driver.findElement(By.cssSelector("a[href*='sign_in']")).click();
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    	driver.findElement(By.name("email")).sendKeys(username);
    	driver.findElement(By.name("password")).sendKeys(password);
    	driver.findElement(By.cssSelector("input[value='Login']")).click();
    }

    @Then("^Account opens$")
    public void account_opens() throws Throwable {
    	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    	System.out.println(driver.getTitle());
    	}

    @And("^check more courses$")
    public void check_more_courses() throws Throwable {
    	driver.findElement(By.cssSelector("a[href*='practice-project']")).click();    
    	}   

}