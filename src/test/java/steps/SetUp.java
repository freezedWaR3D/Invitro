package steps;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import org.openqa.selenium.chrome.ChromeOptions;

public class SetUp {


        @Before
        public void setUp() {
            Configuration.browser = "chrome";
            Configuration.browserSize = "1920x1080";
            Configuration.timeout = 30000;
            Configuration.screenshots = true;
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--incognito");
            Selenide.webdriver().driver().config().browserCapabilities()
                    .setCapability(ChromeOptions.CAPABILITY,options);
        }


        @After
        public void tearDown(){
            WebDriverRunner.getWebDriver().quit();
            //WebDriverRunner.getWebDriver().close();

        }

        //@AfterStep
        //public void makeScreenshot(){
            //Selenide.screenshot(System.currentTimeMillis() + "step");
        //}











    }

