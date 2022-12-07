package googleSearch;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import java.io.FileReader;
import java.util.List;
import java.util.Properties;

public class GoogleTextSearchValidData extends TestBase
{
    @Test(description="This TestCase will search valid data")
    public void checkValidData() throws Throwable
    {
        WebElement element12 = driver.findElement(By.name("q"));
        element12.sendKeys("javatpoint tutorials");
        driver.findElement(By.name("btnK")).click();
        driver.navigate().back();



        Thread.sleep(5000);

        List<WebElement> elements = element12.findElements(By.xpath("//*[contains(text(),'Java')]"));
        for (WebElement e : elements) {
            System.out.println(e.getText());
        }

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
        driver.findElement(By.name("q")).sendKeys("Srinagar map");
        btnSearch.click();

    }



}