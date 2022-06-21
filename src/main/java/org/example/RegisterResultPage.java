package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class RegisterResultPage extends Utils {




    public void verifyRegisterPage() {
        //for verification
        String actualMassage = driver.findElement(By.className("result")).getText();
        String expectedMassage = "Your registration completed";
        Assert.assertEquals(actualMassage, expectedMassage, "Your registration is not completed");
    }
}
