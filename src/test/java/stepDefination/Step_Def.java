package stepDefination;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Step_Def {
    public WebDriver driver;
    @Given("^customer is on homepage$")
    public void customer_is_on_homepage() throws Throwable {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

        String title = driver.getTitle();
        Assert.assertEquals("My Store", title);
    }

    @When("^customer enters desired product$")
    public void customer_enters_desired_product() throws Throwable {
        driver.findElement(By.id("search_query_top")).sendKeys("Printed Dress");
        driver.findElement(By.name("submit_search")).click();

    }

    @Then("^customer should see desired product$")
    public void customer_should_see_desired_product() throws Throwable {
        String headline= driver.findElement(By.className("heading-counter")).getText();
        System.out.println(headline);
        Assert.assertEquals("5 results have been found.",headline);

        boolean image = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[1]/div/a[1]/img")).isDisplayed();
        Assert.assertTrue(image);
    }

}
