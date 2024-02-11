package pom;

import Generic.FileLib;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    FileLib filLibrary = new FileLib();
public LoginPage(WebDriver driver){
    super();
    PageFactory.initElements(driver,this);
}
@FindBy(xpath="//input[@name='userName']")
private WebElement username;

@FindBy(xpath = "//input[@name='password']")
private WebElement password;

@FindBy(xpath = "//button[@aria-label='LOG IN']")
private WebElement loginButton;
    public void doLogin() {
        username.sendKeys("meeshosxtest1");
        password.sendKeys("Kapture@1");
        loginButton.click();

    }
}
