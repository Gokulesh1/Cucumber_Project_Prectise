package org.example;


import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class HomePage extends Utils {

private  By _registrationButton = By.xpath("//a[@class='ico-register']");
    private  By _clickOnCurrency = By.id("customerCurrency");
    private  By _selectEuro = By.id("customerCurrency");
   private  By _clickOnGoodButton = By.id("//input[@id='pollanswers-2']");
   private  By _clickOnComputer = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']");
  // private  By _clickOnVoteButton = By.id("vote-poll-1");
    private By _AddToCart = By.xpath("lickOnElement(By.xpath(\"/html/body/div[6]/div[2]/ul[2]/li[1]/a\"));\n");


    public  void clickOnCurrencyButton(){
        // click on currency tab
        driver.findElement(_clickOnCurrency).click();
    }
    public  void selectEuro(){
        //select euro
        Select euro = new Select(driver.findElement(_selectEuro));
        euro.selectByVisibleText("Euro");

    }
    public  void currencyCheck(){
        //currency check
        String actualmassage = driver.findElement()
        Assert.assertEquals("€", "€" ,"currency is match successfully");
    }


    public void clickOnRegisterButtonOnHomePage() {
        //Click on Register button
        clickOnElement(_registrationButton);
    }



    public void clickOnComputer() {

        //click on computer
        clickOnElement(_AddToCart);
       // driver.findElement(_registrationButton).click();
    }


//    public void clickOnComputer(){
//        //click on computer
//      clickOnElement(By.xpath(String.valueOf(_clickOnComputer)));
//        //Assert.assertEquals();}
//
//    }
    public void clickOnGoodButton(){
        //click on good button
       clickOnElement(By.id(String.valueOf(_clickOnGoodButton)));

    }
//    public void clickOnVoteButton(){
//        //click on vote button
//        clickOnElement(By.id(String.valueOf(_clickOnVoteButton)));
//    }
    public void registerShouldBeVote(){
        //register should be able to vote
        clickOnElement(By.className("poll-vote-error"));
    }




}
