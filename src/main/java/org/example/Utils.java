package org.example;

import org.apache.commons.io.FileUtils;
import org.jetbrains.annotations.NotNull;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

    public class Utils extends BasePage {
    //Click on Element

    public static void clickOnElement(By by) {driver.findElement(by).click();}

        //Send Text Values
    public static void sendvalue(By by, String value)
    {
        driver.findElement(by).sendKeys(value);
    }

    //Time stamp
    public static @NotNull String randomdate()
    {
        Date dat = new Date();
        SimpleDateFormat formate = new SimpleDateFormat("ddMMyyyyHHmmss");
        return formate.format(dat);
    }

    //wait for type text
    public static void typeText(By by, String text){
                driver.findElement(by).sendKeys(text);
          }


    //1.Wait for clickable
    public static void driverWaitsUntil(By by, int time) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        wait.until(ExpectedConditions.elementToBeClickable(by)).click();
    }

    //2.wait for locator
    public static void driverWaitUntilElementLocated(int time, By by) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(by));
    }

    //3.wait for title-contains
    public static void driverWaitUntilElementTitleContains(By by, int time) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(by));
    }

    //4.wait for url fraction
    public static void driverWaitUntilElementURLFraction(By by, int time, String fraction) {
        WebDriverWait frction = new WebDriverWait(driver, Duration.ofSeconds(time));
        frction.until(ExpectedConditions.urlContains(fraction));
    }

    //5.wait for element to be clickable
    public static void driverWaitUntilElementToBeClickable(By by, int time) {
        WebDriverWait click = new WebDriverWait(driver, Duration.ofSeconds(time));
        click.until(ExpectedConditions.elementToBeClickable(by));
    }

    //6.wait for present of elemeants
    public static void driverWaitUntilPrasentdOfElement(By by, int time) {
        WebDriverWait present = new WebDriverWait(driver, Duration.ofSeconds(time));
        present.until(ExpectedConditions.presenceOfElementLocated(by));
    }

    //7.wait for InvisibaleOfElement
    public static void driverWaitUntilInvisibaleOfElement(By by, int time) {
        WebDriverWait invisble = new WebDriverWait(driver, Duration.ofSeconds(time));
        invisble.until(ExpectedConditions.invisibilityOfAllElements());
    }

    //8.wait for alertispresent
    public static void driverWaitUntilElementAlertIsPresent(By by, int time) {
        WebDriverWait wait7 = new WebDriverWait(driver, Duration.ofSeconds(time));
        wait7.until(ExpectedConditions.alertIsPresent());
    }

    //9. take a sanpshot
    public void takeSnapShot(String a)
    {
        TakesScreenshot scrShot = ((TakesScreenshot) driver);
        File srcFile = scrShot.getScreenshotAs(OutputType.FILE);

        try
        {
            FileUtils.copyFile(srcFile, new File("Screenshots\\"+a+ randomdate()+".png"));
        }catch (IOException e)
           {
            e.printStackTrace();
           }

    }

    }

