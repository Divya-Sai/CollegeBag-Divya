package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;
import java.util.List;

public class CoursePage {

    WebDriver driver;

    //WebElements
    @FindBy(xpath=".//input[@id='input-filter']")
    private WebElement txtFilter;

    @FindBy(xpath=".//button[@id='button-add']")
    private WebElement btnAdd;

    @FindBy(xpath=".//input[@id='input-courseName']")
    private WebElement txtCourseName;

    @FindBy(xpath=".//input[@id='input-acronym']")
    private WebElement txtAcronym;

    @FindBy(xpath=".//button[@id='button-save']")
    private WebElement btnSave;

    @FindBy(xpath=".//button[@id='button-cancel']")
    private WebElement btnCancel;

    //@FindBy(xpath=".//td[@id='course-courseName']")


    public CoursePage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    public void addNewCourse(String CourseNm, String AcronymNm){
        btnAdd.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        txtCourseName.sendKeys(CourseNm);
        txtAcronym.sendKeys(AcronymNm);
        btnSave.click();
    }

    public void getListofCourses(){

        List<WebElement> myElements = driver.findElements(By.xpath(".//td[@id='course-courseName']"));
        for(WebElement e:myElements){
           System.out.println(e.getText());
        }


    }




}
