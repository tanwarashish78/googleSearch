package googleSearch;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import java.io.FileReader;
import java.util.Properties;

public class GoogleTextSearchValidData extends TestBase
{
    @Test(description="This TestCase will search valid data")
    public void checkValidData() throws Throwable
    {
        driver.findElement(By.name("q")).sendKeys("javatpoint tutorials");
        driver.findElement(By.name("btnK")).click();
        driver.navigate().back();

        Thread.sleep(5000);
    }

    @Test(description="This TC will perform check map")
    public void checkMapData() throws InterruptedException {
        driver.findElement(By.name("q")).sendKeys("Shimla map");
        driver.findElement(By.name("btnK")).click();
        driver.navigate().back();

        Thread.sleep(5000);
    }
    @Test(description="This TC will perform check map")
    public void clickGoogleSearchButton() throws InterruptedException {

        WebElement btnSearch = driver.findElement(By.name("btnK"));
        WebElement btnFeelingLucky = driver.findElement(By.name("btnK"));
        driver.findElement(By.name("q")).sendKeys("Shimla map");
        btnSearch.click();

    }



}