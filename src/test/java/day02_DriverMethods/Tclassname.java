package day02_DriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.List;

public class Tclassname {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // Amazon sayfasina gidelim.
        driver.get("http://www.trendyol.com");
       WebElement searchButonu = driver.findElement(By.className("V8wbcUhU"));

        searchButonu.sendKeys("abiye", Keys.ENTER);

        List<WebElement> kacTane = driver.findElements(By.className("dscrptn dscrptn-V2"));
        System.out.println("kacTane.get(0).getText() = " + kacTane.get(0).getText());
        
        String [] kac = kacTane.get(0).getText().split(" ");
        System.out.println("kaç tane = "+ kac[3]);
    }
}
