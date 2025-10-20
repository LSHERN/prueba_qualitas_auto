package com.api;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) throws InterruptedException {



        System.out.println("Empieza prueba");


        //Configure ruote  chormedriver
        WebDriverManager.chromedriver().setup();


        //create instance
        WebDriver driver =  new ChromeDriver();

        //brouser  goolge

        //driver.get("https://onecompiler.com/html/3xfmfsrwk");
        driver.get("https://www.facebook.com/?locale=es_LA");

        WebDriver newTab = driver.switchTo().newWindow(WindowType.TAB);
        newTab.get("https://www.facebook.com/help/568137493302217");

        String original =  driver.getWindowHandle();
        String OtherTab = newTab.getWindowHandle();

        Thread.sleep(4000);
        driver.switchTo().window(original);
    }
}