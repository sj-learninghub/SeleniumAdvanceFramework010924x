package org.sjn.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sjn.driver.DriverManagerTL;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class CommonToAllPage {


    public CommonToAllPage() {
    }
    public void implicitWait(){
        DriverManagerTL.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
public void clickElement(By by){
        DriverManagerTL.getDriver().findElement(by).click();
}

public void sendKeys(By by,String text){
        DriverManagerTL.getDriver().findElement(by).sendKeys(text);
}
public WebElement presenceOfElement(final By elementLocation) {
        return new WebDriverWait(DriverManagerTL.getDriver(), Duration.ofSeconds(20)).until(ExpectedConditions.presenceOfElementLocated(elementLocation));
    }
    public WebElement visibilityOfElement(final By elementLocation) {
        return new WebDriverWait(DriverManagerTL.getDriver(), Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOfElementLocated(elementLocation));
    }
    protected void enterInput(By by, String key) {
        DriverManagerTL.getDriver().findElement(by).sendKeys(key);
    }
    protected WebElement getElement(By key) {
        return DriverManagerTL.getDriver().findElement(key);
    }
    public void iWaitForElementToBeVisible(WebElement loc,String url) {
        try {
            WebDriverWait wait = new WebDriverWait(DriverManagerTL.getDriver(),Duration.ofSeconds(20));
            wait.until(ExpectedConditions.visibilityOfAllElements(loc));
            wait.until(ExpectedConditions.urlContains(url));
        } catch (Exception e) {
            System.out.println("Failed to Wait!: " + e.toString());
        }
    }


    //Waits
    //implicit waits
    //Driver call
    //common functions
}

