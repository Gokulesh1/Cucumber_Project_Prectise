package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPage extends Utils {

    LoadProperty loadProperty = new LoadProperty();
private By _gender = By.id("gender-male");
private By _firstname =By.xpath("//input[@name='FirstName']");
private By _Lastname =By.id("LastName");
private By _birthday = By.name("DateOfBirthDay");
private By _birthMonth = By.name("DateOfBirthMonth");
private By _birthYear = By.name("DateOfBirthYear");
private By _yourEmailId = By.id("Email");
private By _password = By.id("Password");
private By _confirmPassword = By.id("ConfirmPassword");
private  By _registerButton  = By.id("register-button");


    public  void registrationDetails(){
        //select on gender
        clickOnElement(_gender);
       // driver.findElement(By.id("gender-male")).click();

        //Enter First name
       driver.findElement(By.xpath("//input[@name='FirstName']")).sendKeys("amit");
       //typeText(_firstname,"amit");

        //Enter Last name
        driver.findElement(By.id("LastName")).sendKeys("Patel");
        //typeText(_Lastname,"patel");

        //select birth day
        Select birthday = new Select(driver.findElement(_birthday));
        birthday.selectByIndex(10);

        //select birth month
        Select birthMonth = new Select(driver.findElement(_birthMonth));
        birthMonth.selectByValue("5");

        //select birth year
        Select birthYear = new Select(driver.findElement(_birthYear));
        birthYear.selectByValue("1950");


        //Enter Email and Printout Time
     driver.findElement(_yourEmailId).sendKeys("abc011123@gmail.com");
        //sendvalue((_yourEmailId), ("abc" + randomdate() + "@gmail.com");
      //  System.out.println(randomdate());

        //Enter password
        driver.findElement(By.id("Password")).sendKeys("xyz@123");
       //typeText(_password,"xyz@123");

        //Enter Confirmed Password
        driver.findElement(By.id("ConfirmPassword")).sendKeys("xyz@123");
       //typeText(_confirmPassword,"xyz@123");


    }



    public void clickOnRegistrationButton(){
        //Click on Register button
        driver.findElement(_registerButton).click();

    }

}