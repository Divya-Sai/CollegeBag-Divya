package stepDefinitions;

import PageObjects.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Steps {

    LoginPage lp;
    WebDriver driver;
    BasePage bp;
    HomePage hp;
    CoursePage cp;
    StudentsPage sp;
    DashboardPage dp;

   /* @Given("User should launch chrome browser")
    public void user_should_launch_chrome_browser() {

    }*/

    @Given("User should launch {string} browser")
    public void user_should_launch_browser(String browserName) {
        bp = new BasePage();
        bp.setBrowserName(browserName);
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @When("User launch the {string}")
    public void user_launch_the(String url) {
        driver.get(url);
        driver.manage().window().maximize();

    }
    @Then("User enter {string} and {string}")
    public void user_enter_and(String uname, String password) {
        lp = new LoginPage(driver);
        lp.enterLoginDetails(uname,password);
    }
    @Then("User click on Sign in Button")
    public void user_click_on_sign_in_button() {
        lp.clickOnLogin();
    }

    @Then("verify the title of the page")
    public void verify_the_title_of_the_page() {

        /*String HomepageTitle= driver.getTitle();
        System.out.println("The title of the homepage is ::"+HomepageTitle);
        Assert.assertEquals(HomepageTitle,"Portal | College Bag");*/
            }

    @Then("verify the title of the page {string}")
    public void verify_the_title_of_the_page(String titleofthepage) {
        lp.titleofthepage(titleofthepage);
    }

    @Then("Close the driver")
    public void tearDown() {
        driver.close();
    }

    @Then("User click on Sign Out from navigation Panel")
    public void user_click_on_sign_out_from_navigation_panel() throws InterruptedException {
        hp = new HomePage(driver);
        hp.Click_on_NavItem("Sign Out");

    }
    @Then("User verify the title of the page")
    public void user_verify_the_title_of_the_page() {

    }

    @Then("User click on {string} from navigation Panel")
    public void user_click_on_from_navigation_panel(String NavigationName) throws InterruptedException {
        Thread.sleep(3000);
        hp =new HomePage(driver);
        hp.Click_on_NavItem(NavigationName);

    }

    @Then("User should add a new course {string} with acroynm {string}")
    public void user_should_add_a_new_course_with_acroynm(String course, String acroynm) {
        cp = new CoursePage(driver);
        cp.addNewCourse(course,acroynm);
        cp.getListofCourses();
    }

    @Then("User click on Courses from navigation Panel")
    public void user_click_on_courses_from_navigation_panel() throws InterruptedException {
        hp =new HomePage(driver);
        hp.Click_on_NavItem("Courses");
    }

    @Then("user should add a new Student with  course type {string}")
    public void user_should_add_a_new_student_with_course_type(String courseName) throws InterruptedException {
        Thread.sleep(3000);
        sp = new StudentsPage(driver);
        sp.selctCOurse(courseName);
    }
    /*@Then("FirstName as {string} LastName as {string} Gender as {string}")
    public void first_name_as_last_name_as_gender_as(String fname, String lName, String string3) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }*/

    @Then("FirstName as {string} LastName as {string}")
    public void first_name_as_last_name_as(String fname, String lname) {
        sp = new StudentsPage(driver);
        sp.setName(fname,lname);
    }

    @Then("click on gender as {string}")
    public void click_on_gender_as(String genName) throws InterruptedException {
        sp.selectGender(genName);
    }

    @Then("get the size of Students table")
    public void get_the_size_of_students_table() {

    }

    @Then("fetch the values from the tables in Dashboard")
    public void fetch_the_values_from_the_tables_in_dashboard() {
        dp = new DashboardPage(driver);
        dp.table();
    }

}
