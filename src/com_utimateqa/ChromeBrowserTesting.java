package com_utimateqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowserTesting {
    public static void main(String[] args) {


        String baseUrl = "https://courses.ultimateqa.com/users/sign_in";
        //launch the Chrome browser
        WebDriver driver = new ChromeDriver();

        //open the Url into Browser
        driver.get(baseUrl);

        // Maximise Browser
        driver.manage().window().maximize();

        // We give Implicit wait to Driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

        //Print  the title of the page
        System.out.println("Title of the page :" + driver.getTitle());

        //Print the current url
        System.out.println("Current URL : " + driver.getCurrentUrl());

        //Print the page source
        System.out.println("Page Source " + driver.getPageSource());

        //Enter the email to email field
        WebElement emailField = driver.findElement(By.id("user[email]"));
        //Action
        emailField.sendKeys("anupatel14@gmail.com");

        // Enter the password to password field
        WebElement passwordField = driver.findElement(By.id("user[password]"));
        //Action
        passwordField.sendKeys("123456");

        //Close the Browser
        driver.close();

    }
}


