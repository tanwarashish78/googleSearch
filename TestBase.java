package googleSearch;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


public class TestBase
{
    WebDriver driver;

    @BeforeClass
    public void setupApplication() throws IOException {
        try{
        WebDriverManager.chromedriver().setup();
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--incognito");
        DesiredCapabilities capabilities=DesiredCapabilities.chrome();
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://google.com");
        Reporter.log("=====Application Started=====", true);
    }
        catch(Exception e)
        {
            e.printStackTrace();
            Assert.fail("Issue with browser opening");
        }
    }

    @AfterClass
    public void closeApplication()
    {
        driver.quit();
        Reporter.log("=====Browser Session End=====", true);
    }
}