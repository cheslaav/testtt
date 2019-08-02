package pro.tender;

import com.codeborne.selenide.Configuration;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.chrome.ChromeDriver;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumber-report/smoketest", "json:target/cucumber.json"},
        features = "src/test/java/pro/tender/features",
        glue = "pro/tender/step",
        tags = "@all"
)

public class AutoTest {
    @BeforeClass
    static public void setupTimeout()
    {
        Configuration.timeout = 10000;
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");

        Configuration.browser = "chrome";
    }
}
