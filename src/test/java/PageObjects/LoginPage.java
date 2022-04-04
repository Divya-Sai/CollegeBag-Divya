package PageObjects;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class LoginPage {

    WebDriver driver;

    //WebElements for Login Page

    @FindBy(xpath=".//input[@id='input-userName']")
    private WebElement txtUserName;

    @FindBy(xpath=".//input[@id='input-password']")
    private WebElement txtPassword;

    @FindBy(xpath=".//button[@id='button-submit']")
    private WebElement btnSignIn;

    public LoginPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    public void setBrowserName(String browserName) {

        if (browserName.equalsIgnoreCase("Chrome")) {
            WebDriverManager.chromedriver().setup();

        } else if (browserName.equalsIgnoreCase("Firefox")) {
            WebDriverManager.firefoxdriver().setup();
            // driver = new FirefoxDriver();
        } else if (browserName.equalsIgnoreCase("Edge")) {
            WebDriverManager.edgedriver().setup();
            // driver = new EdgeDriver();
        }

    }

    public void enterLoginDetails(String Uname,String Password){
        txtUserName.sendKeys(Uname);
        txtPassword.sendKeys(Password);

    }

    public void clickOnLogin(){
        btnSignIn.click();
    }

    public void titleofthepage(String title){

        if (driver.getPageSource().contains("Invalid Credentials") ){
           driver.close();
            Assert.assertTrue(false);
        }
        else
        {
            Assert.assertEquals(title,driver.getTitle());
        }
    }




}
