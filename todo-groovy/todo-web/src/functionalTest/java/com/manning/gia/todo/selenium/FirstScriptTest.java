package com.manning.gia.todo.selenium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class FirstScriptTest {
    public WebDriver driver;

    @Test
    public void eightComponents() {
        driver = new ChromeDriver();

        driver.get("https://www.baidu.com");

        System.out.println("driver.getTitle(): " + driver.getTitle().trim());

        driver.manage().timeouts().implicitlyWait(500, TimeUnit.MICROSECONDS);

        WebElement searchBox = driver.findElement(By.name("wd"));
        WebElement searchButton = driver.findElement(By.id("kw"));

        searchBox.sendKeys("Selenium");
        searchButton.click();

        searchBox = driver.findElement(By.name("wd"));
        Assertions.assertEquals("Selenium", searchBox.getAttribute("value"));

        driver.quit();
    }
}
