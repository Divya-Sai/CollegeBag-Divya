package PageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    WebDriver driver;
    //WebElements
    @FindBy(xpath=".//li[@class='nav-item']/a[contains(.,'Sign Out')]")
    private WebElement nav_SignOut;

    @FindBy(xpath=".//li[@class='nav-item']/a[contains(.,'Students')]")
    private WebElement nav_Students;

    @FindBy(xpath=".//li[@class='nav-item']/a[contains(.,'Courses')]")
    private WebElement nav_Courses;

    @FindBy(xpath=".//li[@class='nav-item']/a[contains(.,'Dashboard')]")
    private WebElement nav_Dashboard;

    public HomePage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public void Click_on_NavItem(String navName) throws InterruptedException {

        if(navName.equalsIgnoreCase("Sign Out")){
            Thread.sleep(3000);
            nav_SignOut.click();
            System.out.println("The titel of the sign out page is::"+driver.getTitle());
            Assert.assertEquals(driver.getTitle(),"Portal | College Bag");

        }
        else if (navName.equalsIgnoreCase("Students")){
            nav_Students.click();
            System.out.println("The titel of the Students page is::"+driver.getTitle());
            Assert.assertEquals(driver.getTitle(),"Portal | College Bag");
        }
        else if (navName.equalsIgnoreCase("Courses")) {
            nav_Courses.click();
            System.out.println("The titel of the Course page is::"+driver.getTitle());
            Assert.assertEquals(driver.getTitle(), "Portal | College Bag");
        }
        else if (navName.equalsIgnoreCase("Dashboard")){
            nav_Dashboard.click();
            System.out.println("The titel of the DashBoard page is::"+driver.getTitle());
            Assert.assertEquals(driver.getTitle(),"Portal | College Bag");
        }



    }



}
