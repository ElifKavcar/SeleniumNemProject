package day03_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class T02_CssSelector {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

       driver.get("http://amazon.com/");

       driver.navigate().refresh();

       String actulaTitle = driver.getTitle();
       if(actulaTitle.contains("Spend Less")){
           System.out.println("Passed");
       }else System.out.println("Failed");
        driver.findElement(By.cssSelector("a[href='/gift-cards/b/?ie=UTF8&node=2238192011&ref_=nav_cs_gc']")).click();
driver.findElement(By.cssSelector("img[alt='Birthday']")).click();

driver.findElement(By.cssSelector("img[src='https://images-na.ssl-images-amazon.com/images/I/51DnSfdl5mL._AC_SX184_.jpg']")).click();
    }
}
