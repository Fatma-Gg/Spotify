package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class Signup {

    WebDriver driver;

    public String EmailOfUser= "fatmaaa652@gmail.com";
    public String PasswordOfUser ="12305Ff$$$";

    @BeforeMethod
    public void initilization() {
        driver = new ChromeDriver();
        driver.get("https://open.spotify.com/");

    }


        @Test
public void fuul_scenario()  {



            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));

            WebElement SignUp=driver.findElement(By.xpath("//button[@data-testid='signup-button']"));
            SignUp.click();
            WebElement Emaill= driver.findElement(By.id("username"));
            Emaill.sendKeys(EmailOfUser);
            //WebElement Next= driver.findElement(By.xpath("//button[@data-testid='submit']"));
            driver.findElement(By.xpath("//button[contains(text(), 'Next')]")).click();
            //Next.click();

            WebElement Password=driver.findElement(By.id("new-password"));
            Password.sendKeys(PasswordOfUser);
            WebElement NextOfPassword= driver.findElement(By.xpath("//span[@class='ButtonInner-sc-14ud5tc-0 hvvTXU encore-bright-accent-set']"));
            NextOfPassword.click();

            WebElement Name= driver.findElement(By.id("displayName"));
            Name.sendKeys("Sara");
            WebElement Day=driver.findElement(By.id("day"));
            Day.sendKeys("1");
            WebElement monthDropdown = driver.findElement(By.id("month"));
            Select dropdown = new Select(monthDropdown);
            dropdown.selectByVisibleText("March");
            WebElement Year= driver.findElement(By.id("year"));
            Year.sendKeys("2000");
            WebElement Gender= driver.findElement(By.xpath("//span[@data-encore-id='text']"));
            Gender.click();
            WebElement Thenext= driver.findElement(By.xpath("//span[@class='ButtonInner-sc-14ud5tc-0 hvvTXU encore-bright-accent-set']"));
            Thenext.click();

            WebElement Option=driver.findElement(By.xpath("//span[@class='Indicator-sc-1airx73-0 lhZnAn']"));
            Option.click();
            WebElement SiningUp=driver.findElement(By.xpath("//button[@data-testid='submit']"));
            SiningUp.click();


        }

    @AfterMethod
    public void teardown() {
         driver.quit();


    }
    }
