package com.selenium.furkan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Demo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:/Users/Temsilci01/Documents/selenium dependencies/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver(); driver.manage().window().maximize();
        driver.get("https://www.lcwaikiki.com/tr-TR/TR");

        WebElement username = driver.findElement(By.id("LoginEmail"));
        WebElement password = driver.findElement(By.id("Password"));
        WebElement login=driver.findElement(By.xpath("button bc-blue login-button-link bold"));
        username.sendKeys("example@gmail.com"); password.sendKeys("password");
        login.click(); String actualUrl="https://www.lcwaikiki.com/tr-TR/TR";
        String expectedUrl= driver.getCurrentUrl();
    }
}
