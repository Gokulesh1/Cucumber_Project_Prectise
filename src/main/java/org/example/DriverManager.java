package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.HashMap;


public class DriverManager extends Utils {
    LoadProperty loadProp = new LoadProperty();
    DesiredCapabilities caps = new DesiredCapabilities();

    public final String USERNAME = loadProp.getProperty("bsUsername");
    public final String AUTOMATE_KEY = loadProp.getProperty("bsPassword");
    public final String BrowserStackURL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

    //boolean condition apply
//    boolean cloud = Boolean.parseBoolean(System.getProperty("cloud"));

    boolean cloud = false;
    String browserName ="chrome";

//    String browserName = System.getProperty("browser");

    public void openBrowser() {

        //this will be run if cloud true (In cloud)
        if (cloud) {
            System.out.println("running in cloud");
            //applying conditional loop for different browser options
            if (browserName.equalsIgnoreCase("Chrome")) {
                caps.setCapability("browser", "Chrome");
                caps.setCapability("browser_version", "latest");
                HashMap<String, Object> browserstackOption = new HashMap<String, Object>();
                browserstackOption.put("os", "windows");
                browserstackOption.put("osVersion", "10");
                caps.setCapability("bstack:options", browserstackOption);
            }
            if (browserName.equalsIgnoreCase("safari")) {
                caps.setCapability("os", "os x");
                caps.setCapability("osVersion", "catalina");
                caps.setCapability("browser", "safari");
                caps.setCapability("browser_version", "13");
                caps.setCapability("browserstack,local", "false");
                caps.setCapability("browserstack.selenium_version", "4.1.0");
            } else {
                System.out.println("wrong browser name");
            }
            try {
                driver = new RemoteWebDriver(new URL(BrowserStackURL), caps);
            } catch (MalformedURLException e) {
                throw new RuntimeException(e);
            }
        }else{
                System.out.println();
            }

        //WebDriverManager.chromedriver().Setup();
        if(browserName.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver", "src/test/java/drivers/chromedriver.exe");//Open Chrome
            driver = new ChromeDriver();// import chrome web-Driver dependency (In 'POM' file)
        } else if (browserName.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", "src/test/java/drivers/geckodriver.exe");//Open firefox
            driver = new FirefoxDriver();
        }else {

            System.out.println("Provide a browser name or enter browser name correctly" + browserName);
        }


                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//Duration to be wait
                driver.manage().window().maximize();  //Maximize the screen
                driver.get("https://demo.nopcommerce.com/"); //Open Web page

        }

    public void closeBrowser(){

        driver.quit();
    }


    }
