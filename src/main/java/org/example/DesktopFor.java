package org.example;

import org.openqa.selenium.By;

public class DesktopFor extends Utils {

    public void ClickOnAddToBasket(){

        //click on desktop
       clickOnElement(By.xpath("\"//h2/a[@title=\\\"Show products in category Desktops\\\"]\""));
    }


}
