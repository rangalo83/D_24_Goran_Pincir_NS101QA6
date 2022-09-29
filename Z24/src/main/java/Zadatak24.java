import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Zadatak24 {

    /*
    Napisati program koji na sajtu:
    http://automationpractice.com
    dodaje najmanje 3 proizvoda u cart, nastavlja do cart-a, izbacuje jedan proizvod, a drugom povecava
    kolicinu za 1.

     */

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D:\\bootcamp\\browserDrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://automationpractice.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(200));
        driver.manage().window().maximize();

        //WebElement addToCart = driver.findElement(By.xpath("//*[@id='header']/div[3]/div/div/div[3]/div/a"));

        WebElement add1 = driver.findElement(By.xpath("//*[@id='homefeatured']/li[1]/div/div[2]/div[2]/a[1]"));
        add1.click();
        Thread.sleep(5000);
        WebElement continueShoping = driver.findElement(By.xpath("//*[@id='layer_cart']/div[1]/div[2]/div[4]/span"));
        continueShoping.click();

        WebElement add2 = driver.findElement(By.xpath("//*[@id='homefeatured']/li[2]/div/div[2]/div[2]/a[1]"));
        add2.click();
        Thread.sleep(5000);
        continueShoping.click();

        WebElement add3 = driver.findElement(By.xpath("//*[@id='homefeatured']/li[3]/div/div[2]/div[2]/a[1]"));
        add3.click();
        Thread.sleep(5000);
        WebElement proceedToCheckout = driver.findElement(By.xpath("//*[@id='layer_cart']/div[1]/div[2]/div[4]/a"));
        proceedToCheckout.click();
        WebElement minus = driver.findElement(By.className("icon-minus"));
        minus.click();
        Thread.sleep(5000);
        WebElement plus = driver.findElement(By.className("cart_quantity_up btn btn-default button-plus"));
        plus.click();
        Thread.sleep(5000);


        driver.quit();
     }

}
