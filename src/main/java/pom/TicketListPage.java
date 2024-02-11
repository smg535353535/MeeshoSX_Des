package pom;

import Generic.*;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.security.Key;

import static Generic.BaseClass.driver;

public class TicketListPage {
    public TicketListPage(WebDriver driver){
        super();
        PageFactory.initElements(driver,this);
    }

@FindBy(xpath = "//input[@placeholder='Search tickets...']")
private WebElement searchTextBox;


    @FindBy(xpath = "//div[@title='Expanded View']")
    private WebElement expandedView;


    @FindBy(xpath = "//div[contains(@id,'ticket-list-item')]")
    private WebElement clickOnSearchedTicketDetails;
public void doTicketSearchByTicketId(){
    ElementsClass.waitForElementToBeDisplay(driver,searchTextBox,10);
    searchTextBox.sendKeys("8707409663390");
    searchTextBox.sendKeys(Keys.ENTER);
}
public void expendView(){
    expandedView.click();
}
public void clickOnSearchedTicketDetails(){
    ElementsClass.waitForElementToBeDisplay(driver,clickOnSearchedTicketDetails,10);
   clickOnSearchedTicketDetails.click();
}

public void doTicketSearchByPhoneNumber(){
    ElementsClass.waitForElementToBeDisplay(driver,searchTextBox,10);
    searchTextBox.sendKeys("9955326756");
    searchTextBox.sendKeys(Keys.ENTER);
}

public void doTicketSearchByEmailID(){
    ElementsClass.waitForElementToBeDisplay(driver,searchTextBox,10);
    searchTextBox.sendKeys("sameTestmail@meesho.com");
    searchTextBox.sendKeys(Keys.ENTER);
}
}
