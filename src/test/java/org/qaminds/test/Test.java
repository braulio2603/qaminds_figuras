package org.qaminds.test;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.implementation.bind.annotation.RuntimeType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import java.nio.file.WatchEvent;

public class Test {

    public void openBrowser() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://google.com");


        driver.manage().window().maximize();
        driver.navigate().to("https://mvnrepository.com/");
        //driver.close();
    }
    @BeforeTest
    public void beforeTest(){
    }

    @BeforeClass

   @org.testng.annotations.Test()
   public void openBroserTest(){
       openBrowser();

    }
}
