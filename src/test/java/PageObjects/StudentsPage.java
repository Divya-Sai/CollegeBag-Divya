package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class StudentsPage {

    WebDriver driver;

    //WebElements
    @FindBy(xpath=".//button[@id='button-add']")
    private WebElement btnAdd;

    @FindBy(xpath=".//input[@id='input-firstName']")
    private WebElement txtFirstName;

    @FindBy(xpath=".//input[@id='input-lastName']")
    private WebElement txtLastName;

    @FindBy(xpath=".//button[@id='button-save']")
    private WebElement btnSave;

    @FindBy(xpath=".//button[@id='button-cancel']")
    private WebElement btnCancel;

    @FindBy(xpath="//div[@class='col-1 mb-3']//input[@id='flexRadioDefault1']")
    private WebElement rdbtnMale;

    @FindBy(xpath="//div[@class='col-1 ml-2 mb-3']//input[@id='flexRadioDefault1']")
    private WebElement rdbtnFemale;

    public StudentsPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);

    }

    public void setName(String firstNm,String lastNm){
        txtFirstName.sendKeys(firstNm);
        txtLastName.sendKeys(lastNm);
    }

    public void selectGender(String NameoftheGender) throws InterruptedException {

        if(NameoftheGender.equalsIgnoreCase("Male")){
            rdbtnMale.click();
            Thread.sleep(3000);
        }
        else if(NameoftheGender.equalsIgnoreCase("Female")){
            rdbtnFemale.click();
            Thread.sleep(3000);
        }
     /*List<WebElement> Selectgender = driver.findElements(By.xpath(".//input[@id='flexRadioDefault1']"));

     for(WebElement e :Selectgender){

     }

     if(NameoftheGender.equalsIgnoreCase("Male")){
         Selectgender.get(1
     }
       male  //div[@class='col-1 mb-3']//input[@id='flexRadioDefault1']

        //div[@class='col-1 ml-2 mb-3']//input[@id='flexRadioDefault1']*/

    }

    public void selctCOurse(String CourseNm){
        btnAdd.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        Select course = new Select(driver.findElement(By.id("select-courses")));
        course.selectByVisibleText(CourseNm);
    }


}
