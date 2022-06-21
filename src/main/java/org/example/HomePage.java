package org.example;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;


import java.util.ArrayList;
import java.util.List;

public class

HomePage extends Utils {

private  By _registrationButton = By.xpath("//a[@class='ico-register']");
    private  By _clickOnCurrency = By.id("customerCurrency");
    private  By _selectEuro = By.id("customerCurrency");
   private  By _clickOnGoodButton = By.id("//input[@id='pollanswers-2']");
   private  By _clickOnComputer = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']");
   private  By _clickOnVoteButton = By.id("vote-poll-1");
    private By _AddToCart = By.xpath("lickOnElement(By.xpath(\"/html/body/div[6]/div[2]/ul[2]/li[1]/a\"));\n");
    private By _registerShouldBeVote = By.className("poll-vote-error");
    private By _clickOnFacebookButton = By.xpath("/html/body/div[6]/div[4]/div[1]/div[4]/div[1]/ul/li[1]/a");
    private By _clickOnNewRelease = By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[5]/div[2]/div[2]/div[1]/a");
    private  By _typetitle = By.id("AddNewComment_CommentTitle");
    private By _typeComment = By.id("AddNewComment_CommentText");



//    public void verifyUserIsOnHomPage(){

  //  }


    public void clickOnRegisterButtonOnHomePage() {
        //Click on Register button
        clickOnElement(_registrationButton);
    }

    public void registrationDetails() {
       // clickOnElement();
    }
    public void clickOnComputer(){
        clickOnElement(_clickOnComputer);
    }

    public  void clickOnCurrencyButton(){
        // click on currency tab
        driver.findElement(_clickOnCurrency).click();
    }
    public  void selectEuro(){
        //select euro
        Select euro = new Select(driver.findElement(_selectEuro));
        euro.selectByVisibleText("Euro");
    }

    public  void verifyCurrencyIsDoller(){
        //currency check
       String actualMassage = driver.findElement(By.className("actual-price")).getText();
       Assert.assertTrue(actualMassage.startsWith("$"),"$ is not selected");

    }
    public void clickOnGoodButton(){
        //click on good button
       clickOnElement(By.id(String.valueOf(_clickOnGoodButton)));

    }
    public void clickOnVoteButton(){
        //click on vote button
        clickOnElement(By.id(String.valueOf(_clickOnVoteButton)));
    }
    public void registerShouldBeVote(){
        //register should be able to vote
        clickOnElement(By.className(String.valueOf(_registerShouldBeVote)));
    }

    public void verifyCurrencyIsEuro(){
        String actualMassage = driver.findElement(By.xpath("//*[@id=\"customerCurrency\"]")).getText();
        Assert.assertTrue(actualMassage.contains("Euro"),"Euro is not selected");


    }
    public void enterProductNameToSearch(String product){

        //type product in search bar
        typeText(By.id("small-searchterms"));
        //click on search button
        clickOnElement(By.className("search-box-button"));
        //verification for URL
String expectedMassage = "https://demo.nopcommerce.com/search?q=" + product;
String actualMassage = driver.getCurrentUrl();
Assert.assertEquals(actualMassage,expectedMassage,"URL not found");


    }

    private void typeText(By id)
    {
    }

//    public void verifyProductListContainProductNameRequest(){
//
//        List<WebElement> productTitle = driver.findElement(By.xpath("//div[contains(@class,'product-grid')]//div[@class='item-box']//h2"));
//        for (WebElement e:productTitle) {
//            System.out.println(e.getText());
//
//
//        }
//    }
    public void verifyUserShouldBeAbleClickOnFacebookButton(){

        clickOnElement(_clickOnFacebookButton);


    }
    public void verifyUserShouldBeAbleTOClickOnNews(){

        //click on nopcommerce news release
        clickOnElement(_clickOnNewRelease);
        String actualPageURL = driver.getCurrentUrl();
        String expectedPageURL = "https://demo.nopcommerce.com/nopcommerce-new-release";
        Assert.assertEquals(actualPageURL, expectedPageURL, "page URL is not match");
        //type title
        String title = "amit";
       typeText(_typetitle,title);
       //type comments
       typeText(_typeComment, "easy to protect");
       //click on new comment
        clickOnElement(By.className("result"));
        WebElement actualMassage = driver.findElement(By.className("result"));
        String expectedMassage = "News comment is successfully added";
        Assert.assertEquals(actualMassage,expectedMassage,"news comment is not successfully added");
        //verification of comments
        List<WebElement>comments=driver.findElements((By) driver.findElement(By.className("result")));

        List<String>commentList=new ArrayList<>();
        for (WebElement e : comments) {
            commentList.add(e.getText());}
        Assert.assertTrue(commentList.contains(title));
    }

}
