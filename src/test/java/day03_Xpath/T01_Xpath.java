package day03_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class T01_Xpath {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));



        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
        driver.findElement(By.xpath("//*[@onclick='addElement()']")).click();
        WebElement delete = driver.findElement(By.xpath("//*[@onclick='deleteElement()']"));
        if(delete.isDisplayed()){
            System.out.println("Test Passed");
        }else System.out.println("Test Failed");

        Thread.sleep(3000);
        delete.click();

        WebElement addRemove = driver.findElement(By.xpath("//h3"));
        if (addRemove.isDisplayed()) {
            System.out.println("passed");
        }else System.out.println("failed");


    }

}
