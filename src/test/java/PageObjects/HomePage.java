package PageObjects;

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


    public void clickChapter1Link() {
        chapter1Link.click();
    }

    public void clickChapter2Link() {
        chapter2Link.click();
    }

    public void clickChapter3ink() {
        chapter3Link.click();
    }

    public void clickChapter4Link() {
        chapter4Link.click();
    }

    public void clickChapter8Link() {
        chapter8Link.click();
    }

    public void setInputTextBoxValue(String value) {
        inputTextBox.clear();
        inputTextBox.sendKeys(value);
    }
}
