package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class MainPage extends Methods {
    String SITE_URL = "https://buy-in-10-seconds.company.site/search";

    public MainPage(WebDriver driver) {
        super(driver);
    }


    public void go(){
        driver.get(SITE_URL);
    }

    public void ClickSaleCheckBox(){

        Click(By.xpath("//input[@id='checkbox-on_sale']"));
    }

    public void FindElement1(){
        IsElementDisplayed(By.xpath("//div[text()='Распродажа']"));
    }

    public void WriteText(String text){

        WriteText(By.xpath("//input[@name='keyword']"), text);
    }

    public void FindElement2(){
        IsElementDisplayed(By.xpath("//div[text()='Товар 2']"));
    }

    public void DragAndDrop1() {
        DragAndDrop();
    }
}

