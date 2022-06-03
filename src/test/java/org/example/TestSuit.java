package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSuit extends BaseTest {


        HomePage homePage = new HomePage();
        RegistrationPage registrationPage = new RegistrationPage();
        ProductAddToCart productAddToCart = new ProductAddToCart();
        DesktopFor desktopFor = new DesktopFor();
        RegisterResultPage registerResultPage = new RegisterResultPage();





    @Test
    public void userShouldBeAbleToChangeTheCurrencyToEuro(){

        // click on currency tab
        homePage.clickOnCurrencyButton();
        //select euro
        homePage.selectEuro();
        //currency check
        homePage.currencyCheck();
    }








    @Test
    public void userShouldBeAbleToRegisterSuccessfully() {

        // click on register button
        homePage.clickOnRegisterButtonOnHomePage();

        //enter registration details
      registrationPage.registrationDetails();

      //click on registration button
        registrationPage.clickOnRegistrationButton();

        //verify register successfully
        registerResultPage.verifyRegisterPage();

    }



    @Test
    public void userShouldBeAbleToAddToCard(){
        homePage.clickOnComputer();
    }

    @Test
    public static void UseShouldBeAbleToVote(){

    }

    @Test
    public static void UserShouldBeAbleToClickOnAddToCard() {

        //click on add to cart



        //click on computer
        clickOnElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[1]/a"));

        //click on desktop
        clickOnElement(By.xpath("/html/body/div[6]/div[3]/div/div[2]/div[1]/div[2]/ul/li[1]/ul/li[1]/a"));
//        driver.findElement(By.className("//li[@class='inactive']/a")).click();
//
//        //click on add to cart button
//        driver.findElement(By.className("//div[@class='buttons']/button")).click();
//
//        //select on processor
//        Select select = new Select(driver.findElement(By.id("//*[@id=\"product_attribute_1\"]")));
//        select.selectByVisibleText("Processor ");
//
//        //select RAM
//        Select select1 = new Select(driver.findElement(By.id("product_attribute_2")));
//        select1.selectByValue("2");
//
//        //select HDD
//        driver.findElement(By.id("product_attribute_3_6")).click();
//
//        //select OS
//        driver.findElement(By.id("product_attribute_4_8")).click();
//
//        //select software
//        driver.findElement(By.id("prVN  DTHoduct_attribute_5_10")).click();
//        driver.findElement(By.id("product_attribute_5_11")).click();
//        driver.findElement(By.id("product_attribute_5_12")).click();
    }


    @Test
    public void UseShouldBeAbleToReferToFriend(){

        //cilck on registartion button
        homePage.clickOnRegisterButtonOnHomePage();

        //enter registration details
        registrationPage.registrationDetails();

        //click on register button
        registrationPage.clickOnRegistrationButton();

        //click on product
        driver.findElement(By.className("button-2 product-box-add-to-cart-button"));

        //click on email a friend
        driver.findElement(By.className("button-2 email-a-friend-button"));


        //enter your friend email
        driver.findElement(By.className("friend-email")).sendKeys("anjli"+ randomdate()+"@gmail.com");


        //write personal massge
        driver.findElement(By.id("PersonalMessage")).sendKeys("really nice product to use");

        //click on send email
        driver.findElement(By.className("button-1 send-email-a-friend-button"));

        //for verification
        Assert.assertEquals("result" , "your email is send" , "your friend email is not send successfully");


    }





}
