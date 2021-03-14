package Steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static org.assertj.core.api.Assertions.assertThat;

public class SearchTest {
    WebDriver webDriver = null;

    @Given("^I open bunnings website$")
    public void iOpenChromeBrowser() throws Throwable {
       // System.setProperty("webdriver.chrome.driver", "C://Kanchan//Personal//IMP//Challange//chromedriver_win32//chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", "src//Driver//chromedriver.exe");
        webDriver= new ChromeDriver();
        webDriver.manage().window().maximize();
       webDriver.get("https://www.bunnings.com.au/");
    }

    @When("^I enter \"([^\"]*)\" in search box$")
    public void searchText(String searchtext) throws Throwable {
        webDriver.findElement(By.cssSelector("input[data-page='/search']")).sendKeys(searchtext);
    }

    @When("^I click on search button$")
    public void search() throws Throwable {
        webDriver.findElement(By.cssSelector("button[datav3-track-text='search']")).click();
    }

    @When("^I select the first suggestion$")
    public void selectfirstsuggestion() throws Throwable {
        WebDriverWait wait = new WebDriverWait(webDriver, 5000);
        Thread.sleep(1000);
        webDriver.findElement(By.cssSelector("#ui-id-1 li:nth-of-type(1)")).click();

       // js.executeScript("var element = document.querySelector('li[css='1']').click();");
        //WebDriverWait wait = new WebDriverWait(webDriver,30);
    }

    @Then("^Search result is displayed$")
    public void verifySearchResult() throws Throwable {
        WebDriverWait wait = new WebDriverWait(webDriver, 5000);
        Boolean nonzeroResult = true;
        wait.until(ExpectedConditions.elementToBeClickable(By.className(".responsive-search-title__count")));
        String numOfProducts = webDriver.findElement(By.cssSelector(".responsive-search-title__count")).getText();
        System.out.println(numOfProducts);
        int numberOfProducts=Integer.parseInt(numOfProducts);
        if(numberOfProducts == 0){
            nonzeroResult = false;
        }

        Assert.assertTrue(nonzeroResult);
        webDriver.close();
    }

    @Then("^Search result displayed$")
    public void verifySearchResultNew() throws Throwable {
        WebDriverWait wait = new WebDriverWait(webDriver, 1000);
        Boolean nonzeroResult = true;
      // wait.until(ExpectedConditions.presenceOfElementLocated(By.className("h1.responsive-search-title .responsive-search-title__count")));
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String numOfProducts = webDriver.findElement(By.cssSelector("h1.responsive-search-title .responsive-search-title__count")).getText();
        System.out.println(numOfProducts);
        int numberOfProducts=Integer.parseInt(numOfProducts);
        if(numberOfProducts == 0){
            nonzeroResult = false;
        }

        Assert.assertTrue(nonzeroResult);
        webDriver.close();
    }

    @Then("^Search result is not displayed$")
    public void NoSearchResult() throws Throwable {
        Boolean nonzeroResult = false;
        String numOfProducts = webDriver.findElement(By.cssSelector(".responsive-search-title__count")).getText();
        System.out.println(numOfProducts);
        int numberOfProducts=Integer.parseInt(numOfProducts);
        if(numberOfProducts == 0){
            nonzeroResult = true;
        }

        Assert.assertTrue(nonzeroResult);
        webDriver.close();
    }
}
