package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.Select;

public class Handeldropdown {

    public static void main(String[] args) {

        //Lanuch Firfox browser
        System.setProperty("webdriver.gecko.driver", "C:\\GeckoDriver.exe");
        FirefoxOptions firefoxOptions = new FirefoxOptions();
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver(firefoxOptions);

        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        //Select dropdown with select tag

        WebElement saticdropdown =driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
        Select dropdown =new Select(saticdropdown);
        dropdown.selectByIndex(3);
        System.out.println(dropdown.getFirstSelectedOption().getText());




    }
}