package day03_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_Xpath {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // 1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");

        //2- Add Element butonuna basin
         driver.findElement(By.xpath("//*[@onclick='addElement()']")).click();

         //Xpath kullaniminda locate edeceginiz webelement text'e sahipse asagidaki sekilde kullanabiliriz.
        // driver.findElement(By.xpath("//*<[text()='Add Element']")

        // 3 Delete butonu’nun gorunur oldugunu test edin
        WebElement deleteButonu = driver.findElement(By.xpath("//*[@onclick='deleteElement()']"));
        if(deleteButonu.isDisplayed()) {
            System.out.println( "Test Passed ");
        }else System.out.println("Test Failed ");


        // 4 Delete tusuna basin
        Thread.sleep(3000);
        deleteButonu.click();

        //5 “Add/Remove Elements” yazisinin gorunur oldugunu test edin
        WebElement addButonu = driver.findElement(By.xpath("//h3"));
        if(addButonu.isDisplayed()) {
            System.out.println( "Test Passed ");
        }else System.out.println("Test Failed ");






    }
}
