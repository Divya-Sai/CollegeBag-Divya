package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DashboardPage {

    WebDriver driver;

    // .//div[@class='boxHeader1' and contains(text(),'Students')]
    //   //tr[@id='row-students']//td[contains(text(),'2022')]
    // .//section[@class='sub-container']/div[@class='boxHeader1' and contains(text(),'Students')]
    //  //tr[@id='row-students']
    // //tr[@id='row-students']//td[contains(text(),'2022')]




    public DashboardPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public void table(){

    List<WebElement> table=driver.findElements(By.xpath(".//table[@class='table']"));
       // List<WebElement> table_row=driver.findElements(By.xpath(".//table[@class='table']/thead/tr/th"));

    //System.out.println("total header in the Dashboard is:"+table.get(0));

    for (WebElement header :table)

    {
        System.out.println(header.getText());
    }

   /* for (WebElement row :table_row){
        System.out.println(row.getText());
    }*/
    }


}
