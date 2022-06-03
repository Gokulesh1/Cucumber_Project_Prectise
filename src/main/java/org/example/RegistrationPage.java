package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPage extends Utils {

    public  void registrationDetails(){
        //select on gender
        clickOnElement(By.id("gender-male"));
       // driver.findElement(By.id("gender-male")).click();

        //Enter First name
       // driver.findElement(By.xpath("//input[@name='FirstName']")).sendKeys("amit");
        sendvalue(By.xpath("//input[@name='FirstName']"), "amit");

        //Enter Last name
        //driver.findElement(By.id("LastName")).sendKeys("Patel");
        sendvalue(By.id("LastName"), "Patel");

        //select birth day
        Select birthday = new Select(driver.findElement(By.xpath("//select[@name='DateOfBirthDay']")));
        birthday.selectByIndex(10);

        //select birth month
        Select birthMonth = new Select(driver.findElement(By.name("DateOfBirthMonth")));
        birthMonth.selectByValue("5");

        //select birth year
        Select birthYear = new Select(driver.findElement(By.xpath("//select[@name='DateOfBirthYear']")));
        birthYear.selectByValue("1950");


        //Enter Email and Printout Time
       // driver.findElement(By.id("Email")).sendKeys("abc0111@gmail.com");
        sendvalue(By.id("Email"), "abc" + randomdate() + "@gmail.com");
        System.out.println(randomdate());

        //Enter password
       // driver.findElement(By.id("Password")).sendKeys("xyz@123");
        sendvalue(By.id("Password"), "xyz@123");

        //Enter Confirmed Password
       // driver.findElement(By.id("ConfirmPassword")).sendKeys("xyz@123");
        sendvalue(By.id("ConfirmPassword"), "xyz@123");


    }



    public void clickOnRegistrationButton(){
        //Click on Register button
        driver.findElement(By.id("register-button")).click();

    }

}