import PageObjects.Chapter1Page;
import PageObjects.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.*;

public class ProvTest {

    private WebDriver driver;
    private HomePage homePage;
    private Chapter1Page chapter1Page;

    @BeforeTest
    @Parameters("browser")
    public void beforeTest(String browser) throws Exception {
        if ("firefox".equalsIgnoreCase(browser)) {
            driver = new FirefoxDriver();
        } else if ("chrome".equalsIgnoreCase(browser)) {
            System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
            driver = new ChromeDriver();
        } else {
            throw new Exception("Wrong parameter for browser.");
        }

        homePage = PageFactory.initElements(driver, HomePage.class);
        chapter1Page = PageFactory.initElements(driver, Chapter1Page.class);
    }

    @BeforeMethod
    public void beforeMethod() {
        driver.get(HomePage.URL);
    }

    @Test(description = "checks availability of text")
    public void testTextAvailability() {
        Assert.assertEquals(driver.getCurrentUrl(), HomePage.URL);

        homePage.clickChapter1Link();
        Assert.assertEquals(driver.getCurrentUrl(), Chapter1Page.URL);

        String actualValue = chapter1Page.getTextFromVerifiableTextElement();
        String expectedValue = "Assert that this text is on the page";
        Assert.assertEquals(actualValue, expectedValue);

        // this action and assertion is not necessary, cause we make the same before each test method
        chapter1Page.clickHomePageLink();
        Assert.assertEquals(driver.getCurrentUrl(), HomePage.URL);
    }

    @AfterTest
    public void afterTest() {
        driver.quit();
    }

}
