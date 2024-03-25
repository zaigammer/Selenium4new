package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Locators {
    public static void main(String[] args) {
        //WebDriverManager.chromedriver().setup();

       /* System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options); */
        System.setProperty("webdriver.gecko.driver", "C:\\GeckoDriver.exe");
        FirefoxOptions firefoxOptions = new FirefoxOptions();
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver(firefoxOptions);

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        // Sibling Child to parent Traverse
        System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button")).getText());

        // Sibling parent to child Traverse
        // In css we can not move back
        System.out.println(driver.findElement(By.xpath("//header/div/button[1]/parent::div")).getText());

        // Close the browser
        driver.quit();

    }

}
