/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seleniumautomation;

import java.nio.file.Path;
import java.nio.file.Paths;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 *
 * @author mwaha
 */
public class SeleniumAutomation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
        // TODO code application logic here
        
        
        String str= System.getProperty("user.dir");
        System.out.println(str);
        System.setProperty("webdriver.chrome.driver", str.toString()+"\\Driver\\chromedriver.exe");        
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.google.com");
        driver.findElement(By.id("lst-ib")).sendKeys("Hi i am running with the help of Selenium Chrome driver");
        Thread.sleep(2000);
        driver.findElement(By.id("lst-ib")).sendKeys(Keys.ENTER);
        //window will close after 5 seconds
        Thread.sleep(5000);
        driver.quit();
    }
    
}
