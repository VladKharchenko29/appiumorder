package base;

import org.openqa.selenium.support.PageFactory;
import setup.DriverManager;

public class BasePage {

    public BasePage() {
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }
}
