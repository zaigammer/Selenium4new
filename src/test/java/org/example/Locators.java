package org.example;

import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Locators {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        WebDriver driver = new ChromeDriver(options);

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        //Sibling Child to parent Traverse
      System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button"))
              .getText());

        //Sibling  parent to child Traverse
        //In css we can not move back
        System.out.println(driver.findElement(By.xpath("//header/div/button[1]/parent::div"))
                .getText());
    }

}
