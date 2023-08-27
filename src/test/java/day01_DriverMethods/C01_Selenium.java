package day01_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class C01_Selenium {
    public static void main(String[] args) {

    System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        /*
            En temel haliyle otomasyon yapmak için  Class'ımıza otaomasyon için gerekli olan
        webdriver'in yerini göstermemiz gerekir. Bunun için java kütüphanesinden System.setProperty()
        methodunun içine ilk olarak driver'i yazarız. İkinci olarak driver'in fiziki yolunu kopyalarız
         */
    WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));//Bos bir browser actik

    driver.get("https://www.amazon.com");//ilk olarak gitmek istedigimiz sayfayi belirtiriz.
    System.out.println("Sayfa Basligi: " + driver.getTitle());
    System.out.println("Sayfa Url 'i :" + driver.getCurrentUrl());
    // System.out.println(driver.getPageSource());
    System.out.println(driver.getWindowHandle());//Bize o windows ait hash degerini verir.
    // Biz bu hash degerlerini bir stringe atayip pencereler arasi gecis yapabiliriz



}
}
