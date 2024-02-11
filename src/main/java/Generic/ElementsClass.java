package Generic;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;

public class ElementsClass {

    public void performMoveToElement(WebDriver driver, WebElement element)
    {
        Actions a=new Actions(driver);
        a.moveToElement(element).perform();
    }
    public void performDoubleClick(WebDriver driver,WebElement element)
    {
        Actions a=new Actions(driver);
        a.doubleClick(element).perform();
    }
    public void performDragAndDrop(WebDriver driver,WebElement source,WebElement target)
    {
        Actions a=new Actions(driver);
        a.dragAndDrop(source, target).perform();
    }
    public void performContextClick(WebDriver driver,WebElement element) throws InterruptedException
    {
        Actions a=new Actions(driver);
        a.contextClick(element).perform();
        Thread.sleep(2000);
    }
    public void performSelectByIndex(WebElement element,int index)
    {
        Select s=new Select(element);
        s.selectByIndex(index);
    }
    public void performSelectByValue(WebElement element,String value)
    {
        Select s=new Select(element);
        s.selectByValue(value);
    }
    public void performSelectByVisibleText(WebElement element,String text)
    {
        Select s=new Select(element);
        s.selectByVisibleText(text);
    }
    public void performDeselectByIndex(WebElement element,int index)
    {
        Select s=new Select(element);
        s.deselectByIndex(index);
    }
    public void performDeselectByValue(WebElement element,String value)
    {
        Select s=new Select(element);
        s.deselectByValue(value);
    }
    public void performDeselectByVisibleText(WebElement element,String text)
    {
        Select s=new Select(element);
        s.deselectByVisibleText(text);
    }
    public void performDeselectAll(WebElement element)
    {
        Select s=new Select(element);
        s.deselectAll();
    }
    public String performGetFirstSelectedOption(WebElement element)
    {
        Select s=new Select(element);
        WebElement ele = s.getFirstSelectedOption();
        return ele.getText();
    }
    public List<WebElement> performGetAllSelectedOptions(WebElement element)
    {
        Select s=new Select(element);
        List<WebElement> ele = s.getAllSelectedOptions();
        return ele;
    }
    public boolean performIsMultiple(WebElement element)
    {
        Select s=new Select(element);
        boolean res = s.isMultiple();
        return res;
    }
    public List<WebElement>  performGetAllOptions(WebElement element)
    {
        Select s=new Select(element);
        List<WebElement> options = s.getOptions();
        return options;
    }
    public String performGetWrappedElement(WebElement element)
    {
        Select s=new Select(element);
        WebElement ele = s.getWrappedElement();
        return ele.getText();
    }

    /**
     * This method is used to verify locator element is present on the page or not
     * @param element
     */
    public static void isElementDisplayed(WebElement element)
    {
        boolean flag = false;
        for (int i = 0; i < 5; i++) {
            if (element.isDisplayed()) {
                System.out.println("Verified " + element + " is displayed on the page");
                flag = true;
                break;
            }
        }
        if (!flag) {
            Assert.fail();
        }
    }

    /**
     * This method is used for wait for located element to be display
     * @param driver
     * @param element
     * @param time
     */
    public static void waitForElementToBeDisplay(WebDriver driver,WebElement element, int time) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    /**
     * This method is used to wait until element to be clickable
     */
    public static void waitForElementToBeClickable(WebDriver driver,WebElement element,int time)
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    /**
     * This method is used to click on particular element
     * @param element
     */
    public static void click(WebElement element)
    {
        element.click();
    }

    /**
     * This method is used to send the values into text box
     */
    public static void enterData(WebElement element, String value) {
        element.sendKeys(value);
    }

    /**
     * This method is used to press enter button
     */
    public static void pressEnterButton() {
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void scrollToElement(WebDriver driver, WebElement element) {
        Actions act = new Actions(driver);
        act.moveToElement(element).perform();
    }

    public static void clickThroughJs(WebDriver driver,WebElement element)
    {
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].click();", element);
    }
}
