package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.time.Duration;


public class DriverManager extends Utils{
    String browserName = "firefox";

    public void openBrowser() {

    //WebDriverManager.chromedriver().Setup();

        if(browserName.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver", "src/test/java/drivers/chromedriver.exe");//Open Chrome
            driver = new ChromeDriver();// import chrome web-Driver dependency (In 'POM' file)
        } else if (browserName.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", "src/test/java/drivers/geckodriver.exe");//Open firefox
            driver = new FirefoxDriver();
        }else {

            System.out.println("Provide a browser name or enter browser name correctly" +("browsweName"));
        }


        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//Duration to be wait
        driver.manage().window().maximize();  //Maximize the screen
        driver.get("https://demo.nopcommerce.com/"); //Open Web page


    }

    public void closeBrowser() {

        driver.quit();
    }
}

