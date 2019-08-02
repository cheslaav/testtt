package pro.tender;

import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoTest {

    @Test
    public void firstTest() {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver");
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://new.tender.pro/");

        driver.quit();
    }
}
