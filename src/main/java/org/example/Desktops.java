package org.example;

import org.openqa.selenium.By;

public class Desktops extends Utils {

    private By _clickondesktop = By.xpath("\"//h2/a[@title=\\\"Show products in category Desktops\\\"]\"");

    public void ClickOnAddToBasket(){

        //click on desktop
       clickOnElement(_clickondesktop);
    }



}
