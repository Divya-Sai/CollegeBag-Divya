package PageObjects;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

public class BasePage {

    WebDriver driver;
    public void setBrowserName(String name){

        if (name.equalsIgnoreCase("Chrome")){
            WebDriverManager.chromedriver().setup();

        }
        else if (name.equalsIgnoreCase("Firefox")){
            WebDriverManager.firefoxdriver().setup();
            // driver = new FirefoxDriver();
        }
        else if (name.equalsIgnoreCase("Edge")){
            WebDriverManager.edgedriver().setup();
            // driver = new EdgeDriver();
        }


    }

    public void verifyTitleofthePage(){

    }
}
