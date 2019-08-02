package pro.tender;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.chrome.ChromeDriver;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumber-report/smoketest", "json:target/cucumber.json"},
        features = "src/test/java/pro/tender/features",
        glue = "steps",
        tags = "@all"
)

public class AutoTest {


   public void firstTest() {
       System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
       ChromeDriver driver = new ChromeDriver();
       driver.get("https://new.tender.pro/");
       driver.quit();
   }
}
