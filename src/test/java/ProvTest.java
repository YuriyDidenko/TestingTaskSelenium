import PageObjects.Chapter1Page;
import PageObjects.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class ProvTest {

    private WebDriver firefoxDriver;
    private HomePage homePage;
    private Chapter1Page chapter1Page;

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("@BeforeSuite");

        firefoxDriver = new FirefoxDriver();

        homePage = PageFactory.initElements(firefoxDriver, HomePage.class);
        chapter1Page = PageFactory.initElements(firefoxDriver, Chapter1Page.class);
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("@BeforeMethod");

        // go to home page
        firefoxDriver.get(HomePage.URL);
    }

    @Test(description = "checks availability of text")
    public void testTextAvailability() {
        System.out.println("test");

        Assert.assertEquals(firefoxDriver.getCurrentUrl(), HomePage.URL);

        homePage.clickChapter1Link();
        Assert.assertEquals(firefoxDriver.getCurrentUrl(), Chapter1Page.URL);

        String actualValue = chapter1Page.getTextFromVerifiableTextElement();
        String expectedValue = "Assert that this text is on the page";
        Assert.assertEquals(actualValue, expectedValue);

        // this action and assertion is not necessary, cause we make the same before each test method
        chapter1Page.clickHomePageLink();
        Assert.assertEquals(firefoxDriver.getCurrentUrl(), HomePage.URL);
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("@AfterSuite");
        firefoxDriver.quit();
    }

}
