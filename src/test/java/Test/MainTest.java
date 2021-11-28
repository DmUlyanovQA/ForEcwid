package Test;

import Page.MainPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class MainTest {
    WebDriver driver;
    public MainPage MainPage;


    @BeforeEach
    public void Start() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        MainPage = PageFactory.initElements(driver, MainPage.class);
        //System.out.println("before each test");
    }

    @AfterEach
    public  void Finish() {
        //driver.navigate().back();
        //driver.quit();
    }
}
