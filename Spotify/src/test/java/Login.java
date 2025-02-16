import org.example.Signup;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class Login extends Signup {


    WebDriver driver;

    @BeforeMethod
    public void initilization() {
        driver = new ChromeDriver();
        driver.get("https://open.spotify.com/");
        driver.manage().window().maximize();
    }


    @Test
    public void fuul_scenario() {

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));

        WebElement Login = driver.findElement(By.xpath("//button[@data-testid='login-button']"));
        Login.click();
        WebElement Credentials = driver.findElement(By.id("login-username"));
        Credentials.sendKeys(EmailOfUser);
        WebElement ThePassword = driver.findElement(By.id("login-password"));
        ThePassword.sendKeys(PasswordOfUser);


        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement element = driver.findElement(By.linkText("Sign up for Spotify"));
        js.executeScript("arguments[0].scrollIntoView();", element);
        WebElement LoginButton = driver.findElement(By.xpath("//button[@data-testid='login-button']"));
        LoginButton.click();
        driver.findElement(By.xpath("//button[@data-testid='web-player-link']")).click();

    }


    @Test

    public void Add_Play_list() {

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));

       WebElement Play= driver.findElement(By.xpath("//button[@aria-hidden='true']"));
       Play.click();
       WebElement MyPlay= driver.findElement(By.xpath("//button[@data-encore-id='text']"));
       MyPlay.click();
       WebElement List = driver.findElement(By.id("text-input-77ca0aac787771a0"));
       List.sendKeys("my song");




    }



        }






