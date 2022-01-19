package com.manning.gia.todo.selenium;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class OpenBrowserTest {
    public WebDriver driver;

    @Test
    public void chromeSession() {
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);

        driver.quit();
    }

//    @Test
//    public void firefoxSession() {
//        FirefoxOptions options = new FirefoxOptions();
//        driver = new FirefoxDriver(options);
//
//        driver.quit();
//    }
}
