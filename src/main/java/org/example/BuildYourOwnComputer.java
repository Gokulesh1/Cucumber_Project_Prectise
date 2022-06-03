package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import static org.example.BasePage.driver;

public class BuildYourOwnComputer extends Utils {




    public void UserShouldBeAbleToBuildOwnComputer(){

        //select on processor
        Select select = new Select(driver.findElement(By.className("product_attribute_1")));
        select.selectByVisibleText("Processor");

        //select RAM
        Select select1 = new Select(driver.findElement(By.id("product_attribute_2")));
        select1.selectByValue("2");

        //select HDD
        driver.findElement(By.id("product_attribute_3_6")).click();

        //select OS
        driver.findElement(By.id("product_attribute_4_8")).click();

        //select software
        driver.findElement(By.id("prVN  DTHoduct_attribute_5_10")).click();
        driver.findElement(By.id("product_attribute_5_11")).click();
        driver.findElement(By.id("product_attribute_5_12")).click();

        //click on AddToCart
        driver.findElement(By.id("add-to-cart-button-1"));

        //click on Shopping cart
        driver.findElement(By.className("ico-cart"));

        //assert for verification
        Assert.assertEquals("product add successfully", "product add successfully");






    }




}
