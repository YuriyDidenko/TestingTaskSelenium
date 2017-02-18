package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Realized to represent PageObject for Home Page
 */
public class HomePage extends Page {

    public static final String URL = "http://book.theautomatedtester.co.uk/";

    @FindBy(xpath = "//*[@href='/chapter1']")
    private WebElement chapter1Link;

    @FindBy(xpath = "//*[@href='/chapter2']")
    private WebElement chapter2Link;

    @FindBy(xpath = "//*[@href='/chapter3']")
    private WebElement chapter3Link;

    @FindBy(xpath = "//*[@href='/chapter4']")
    private WebElement chapter4Link;

    @FindBy(xpath = "//*[@href='/chapter8']")
    private WebElement chapter8Link;

    @FindBy(id = "q")
    private WebElement inputTextBox;

    private final WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public Chapter1Page clickChapter1Link() {
        chapter1Link.click();
        return new Chapter1Page(driver);
    }

    public Chapter2Page clickChapter2Link() {
        chapter2Link.click();
        return new Chapter2Page(driver);
    }

    public Chapter3Page clickChapter3ink() {
        chapter3Link.click();
        return new Chapter3Page(driver);
    }

    public Chapter4Page clickChapter4Link() {
        chapter4Link.click();
        return new Chapter4Page(driver);
    }

    public Chapter8Page clickChapter8Link() {
        chapter8Link.click();
        return new Chapter8Page(driver);
    }

    public void setInputTextBoxValue(String value) {
        inputTextBox.clear();
        inputTextBox.sendKeys(value);
    }
}
