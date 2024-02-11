package Generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pom.LoginPage;
import pom.LogoutPage;

public class BaseClass {
    public static WebDriver driver;

    @BeforeClass
    public void openBrowser() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        options.setHeadless(false);
        driver = new ChromeDriver(options);
        try {
            FileLib fileLibrary = new FileLib();
            driver.get("https://meeshosx.kapturecrm.com/nui_develop/des/login");
            driver.manage().window().maximize();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    ////@AfterClass(alwaysRun = false)
//public void closeBrowser(){
//    driver.close();
//}
    @BeforeMethod
    public void login() {
        LoginPage loginpage = new LoginPage(driver);
        loginpage.doLogin();
    }

//    @AfterMethod
//    public void logout() throws Throwable {
//        LogoutPage logout = new LogoutPage(driver);
//        logout.doLogout();
//    }

}
