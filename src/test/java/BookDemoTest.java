import base.BaseTest;
import org.testng.annotations.Test;
import setup.DriverManager;

public class BookDemoTest extends BaseTest {

    @Test
    public void testMethod() {
//        navigation.openMainPage();
        DriverManager.getWebDriver().get("https://salussafety.io/");
        System.out.println("Works");
    }
}
