package Page;

import javafx.scene.control.Slider;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.jupiter.api.Assertions.assertTrue;



public class Methods {
        public WebDriver driver;
        public WebDriverWait wait;

    public Methods(WebDriver driver) {
            this.driver = driver;
            wait = new WebDriverWait(driver, 30);
        }


        //Wait Wrapper Method
        public void waitVisibility(By elementBy) {
            wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(elementBy));
        }

        //ClickMethod
        public void Click(By elementBy){
            driver.findElement(elementBy).click();
        }

        //IsElementDisplayed
        public void IsElementDisplayed(By elementBy){
            waitVisibility(elementBy);
            assertTrue(driver.findElement(elementBy).isDisplayed());
            //driver.navigate().back();
        }

        //WriteText
        public void  WriteText(By elementBy, String text) {
            waitVisibility(elementBy);
            WebElement element = driver.findElement(elementBy);
            element.clear();
            element.sendKeys(text);
            element.sendKeys(Keys.ENTER);
    }

        public void DragAndDrop(){
            WebElement button1 = driver.findElement(By.xpath("//div[@style='left: 0%;']"));
            WebElement button2 = driver.findElement(By.xpath("//div[@style='left: 100%;']"));

            Actions move = new Actions(driver);
            move.moveToElement(button1).clickAndHold().moveToElement(button1,100,0).release().perform();
            move.moveToElement(button2).clickAndHold().moveToElement(button2,-100,0).release().perform();


        }

}
