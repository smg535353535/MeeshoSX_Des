package pom;

import Generic.ElementsClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Generic.BaseClass;

import static Generic.BaseClass.driver;

public class LogoutPage {

public LogoutPage(WebDriver driver){
  super();
  PageFactory.initElements(driver,this);
}
@FindBy(xpath = "//span[@class='MuiButton-label-220']")
private WebElement empNameButton;

@FindBy(xpath = "//span[text()='Logout']")
private WebElement logoutButton;



  public void doLogout()throws Throwable {
    Thread.sleep(5000);
    empNameButton.click();
    Thread.sleep(5000);
    logoutButton.click();

  }
}
