package pages;

import base.BasePage;
import io.qameta.allure.Step;

public class MainPage extends BasePage {

    @Step("Test step description")
    public void testMethod() {
        System.out.println("Allure");
    }
}
