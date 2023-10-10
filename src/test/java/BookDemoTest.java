import base.BaseTest;
import io.qameta.allure.Step;
import org.testng.annotations.Test;
import setup.DriverManager;

public class BookDemoTest extends BaseTest {

    @Test
    @Step("Launches test")
    public void testMethod() {
//        navigation.openMainPage();
        DriverManager.getWebDriver().get("https://salussafety.io/");
        System.out.println("Works");
    }
}
