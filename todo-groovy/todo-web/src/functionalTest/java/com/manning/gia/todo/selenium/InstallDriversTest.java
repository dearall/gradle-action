package com.manning.gia.todo.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class InstallDriversTest {
    @Test
    public void chromeSession() {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.quit();
    }
//    @Test
//    public void firefoxSession() {
//        WebDriverManager.firefoxdriver().setup();
//
//        WebDriver driver = new FirefoxDriver();
//
//        driver.quit();
//    }
}
