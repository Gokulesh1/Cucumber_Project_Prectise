package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import static org.example.BasePage.driver;

public class BuildYourOwnComputer extends Utils {

    private By _processor = By.className("product_attribute_1");
    private By _RAM  = By.id("product_attribute_2");
    private By _HDD = By.id("product_attribute_3_6");
    private By _OS = By.id("product_attribute_4_8");
    private By _software1 = By.id("prVN  DTHoduct_attribute_5_10");
    private By _software2 = By.id("product_attribute_5_11");
    private By _software3 = By.id("product_attribute_5_12");
    private By _AddToCart = By.id("add-to-cart-button-1");
    private By _ShoppingCart = By.className("ico-cart");




    public void UserShouldBeAbleToBuildOwnComputer(){

        //select on processor
        Select select = new Select(driver.findElement(_processor));
        select.selectByVisibleText("Processor");

        //select RAM
        Select select1 = new Select(driver.findElement(_RAM));
        select1.selectByValue("2");

        //select HDD
        driver.findElement(_HDD).click();

        //select OS
        driver.findElement(_OS).click();

        //select software
        driver.findElement(_software1).click();
        driver.findElement(_software2).click();
        driver.findElement(_software3).click();

        //click on AddToCart
        driver.findElement(_AddToCart);

        //click on Shopping cart
        driver.findElement(_ShoppingCart);

        //assert for verification of build for your owm computer
        String actualMassage = driver.findElement(By.className("content")).getText();
        String ExpectedMassage = "The product has been added to your shopping cart";
        Assert.assertEquals(actualMassage, ExpectedMassage, "The product has not been added to your shopping cart");
//
//
//

    }




}
