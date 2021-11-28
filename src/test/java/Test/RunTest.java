package Test;

import Page.MainPage;
import Page.Methods;
import org.junit.jupiter.api.Test;

public class RunTest extends MainTest {

    @Test
    public void test1() {
        MainPage.go();
        MainPage.ClickSaleCheckBox();
        MainPage.FindElement1();
    }

    @Test
    public void test2() {
        MainPage.go();
        MainPage.WriteText("2");
        MainPage.FindElement2();
    }

    @Test
    public void test3(){
        MainPage.go();
        MainPage.DragAndDrop1();
    }
}
