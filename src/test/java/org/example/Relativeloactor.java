package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class Relativeloactor {
    public static void main(String[] args){

        /*System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        ChromeOptions options= new ChromeOptions();
      options.addArguments("--remote-allow-origins=*");
        WebDriver driver= new ChromeDriver();  */

        System.setProperty("webdriver.gecko.driver", "C:\\GeckoDriver.exe");

        FirefoxOptions firefoxOptions = new FirefoxOptions();
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver(firefoxOptions);

        driver.get("https://rahulshettyacademy.com/angularpractice/");

        //above
         WebElement nameEditBox =driver.findElement(By.cssSelector("[name='name']"));
           System.out.println(driver.findElement(with(By.tagName("label")).above(nameEditBox)).getText());

          //below
        WebElement dateofBirth = driver.findElement(By.cssSelector("[for='dateofBirth']"));
        driver.findElement(with(By.tagName("input")).below(dateofBirth)).click();

        //toLeftOf
        WebElement iceCreamLabel =driver.findElement(By.xpath("//label[text()='Check me out if you Love IceCreams!']"));
        driver.findElement(with(By.tagName("input")).toLeftOf(iceCreamLabel)).click();

        //toRightOf
        WebElement rdb = driver.findElement(By.id("inlineRadio1"));
        System.out.println(driver.findElement(with(By.tagName("label")).toRightOf(rdb)).getText());
    }
}
