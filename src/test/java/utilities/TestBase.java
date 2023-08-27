package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public abstract class TestBase {

//driver objesini olustur. Driver ya public yada protected olmali. Sebebi child classlarda gorulmeli
    protected static WebDriver driver;

    // setUp
    @Before
    public void setUp()  {


        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    }

    //

    }





