package pro.tender;

import com.codeborne.selenide.Configuration;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumber-report/smoketest", "json:target/cucumber.json"},
        features = "src/test/java/pro/tender/features",
        glue = "pro/tender/step",
        tags = "@all"
)

public class AutoTest {
    @BeforeClass
    static public void setupTimeout() throws MalformedURLException {
        Configuration.timeout = 10000;
        DesiredCapabilities capability = DesiredCapabilities.chrome();
        WebDriver driver = new RemoteWebDriver(new URL("http://188.225.18.7:4444/wd/hub"), capability);


    }
}
