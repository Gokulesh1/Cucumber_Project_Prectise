package org.example;

import org.testng.Assert;

public class RegisterResultPage extends Utils{

    public void verifyRegisterPage(){
        //for verification
        Assert.assertEquals
                ("Your registration completed", "Your registration completed", "Your registration is completed");
    }
}
