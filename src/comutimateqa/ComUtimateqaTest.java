package comutimateqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ComUtimateqaTest {
    public static void main(String[] args) throws InterruptedException {
        String baseUrl = "https://courses.ultimateqa.com/";
        // launch the Chrome Browser
        WebDriver driver = new ChromeDriver();

        // Open the URL into browser
        driver.get(baseUrl);

        // Maximum the Broswer
        driver.manage().window().maximize();
        Thread.sleep(5000);

        // We give Impicit wait to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        Thread.sleep(5000);

        //Get the title of the page
        String title = driver.getTitle();
        System.out.println(title);
        Thread.sleep(5000);

        String signinUrl = "https://courses.ultimateqa.com/users/sign_in";

        driver.navigate().to(signinUrl);
        System.out.println("Get Current URL " + driver.getCurrentUrl());

        // Get page Source
        System.out.println(driver.getPageSource());

        // Click on sign in link
        WebElement signInLink = driver.findElement(By.linkText("Sign In"));
        signInLink.click();
        Thread.sleep(3000);

        //Get current URL
        driver.navigate().to(signinUrl);
        System.out.println(" Get Current URL " + driver.getCurrentUrl());

        // Find email field element and type the email
        WebElement emailField = driver.findElement(By.name("user[email]"));
        emailField.sendKeys("abc123@gmail.com");
        Thread.sleep(3000);

        WebElement passwordField = driver.findElement(By.name("user[password]"));
        passwordField.sendKeys("abc123");
        Thread.sleep(3000);

        //  Click on Login
        WebElement loginButton = driver.findElement(By.xpath("//button@type='submit']"));
        loginButton.click();
        Thread.sleep(3000);

        // Forward
        Thread.sleep(3000);
        driver.navigate().forward();
        System.out.println("Get Current URL " + driver.getCurrentUrl());

        // navigate backward
        Thread.sleep(3000);
        driver.navigate().back();
        System.out.println("Get Current URL " + driver.getCurrentUrl());

        // Refresh
        Thread.sleep(5000);
        driver.navigate().refresh();

        // close
        driver.quit();
    }

    }





    //1. Setup Chrome browser

    //2. Open URL

    //3. Print the title of the page

    //4. Print the current url

    //5. Print the page source

    // 6. Click on 'Sign in' link

    //7. Print the current url

    //8. Enter the email into email field


    //9. Enter the password to password field

    //10. Click on login button

    // 11. Navigate to baseURl

    //12. Navigate forward to homepage

    //13. Navigate back to baseUrl

    //14. Refresh the page

    //15. close the



