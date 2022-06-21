package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class ProductAddToCart extends Utils {





    public static void UserShouldBeAbleToAddProductOnAddToCard() {

        //click on build your own computer on home page
        clickOnElement(By.xpath("//img[@alt='Picture of Build your own computer"));

        //select on processor
        clickOnElement(By.xpath("//*[@id=\"product_attribute_1\"]"));

        //select ram
        clickOnElement(By.xpath("//option[@value=\"5\"]"));

        //select HDD
        clickOnElement(By.id("product_attribute_3_6"));
        //driver.findElement(By.id("product_attribute_3_6")).click();

        //select OS
        clickOnElement(By.id("product_attribute_4_8"));
       // driver.findElement(By.id("product_attribute_4_8")).click();

        //select softwares
        clickOnElement(By.xpath("//input[@id=\"product_attribute_5_10\"]"));
        clickOnElement(By.xpath("//input[@id=\"product_attribute_5_11\"]"));
        clickOnElement(By.xpath("//input[@id=\"product_attribute_5_12\"]"));
        //driver.findElement(By.xpath("//input[@id=\"product_attribute_5_10\"]"));
        //driver.findElement(By.xpath("//input[@id=\"product_attribute_5_11\"]"));
        //driver.findElement(By.xpath("//input[@id=\"product_attribute_5_12\"]"));

        //click on add to cart button
        clickOnElement(By.xpath("//*[@id=\"add-to-cart-button-1\"]"));
        //  driver.findElement(By.id("add-to-cart-button-1"));

        //click on shopping cart button
        clickOnElement(By.className("cart-label"));

        //for verify add to basket
        String actualMassage = driver.findElement(By.className("content")).getText();
        String expectedMassage = "The product has been added to your shopping cart";

        Assert.assertEquals(actualMassage, expectedMassage, "product is not able to add in shopping cart");

    }







}





