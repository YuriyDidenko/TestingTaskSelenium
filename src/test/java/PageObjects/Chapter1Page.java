package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Realized to represent PageObject for Chapter1 page
 */
public class Chapter1Page extends Page {

    public static final String URL = HomePage.URL + "chapter1";

    @FindBy(id = "radiobutton")
    private WebElement radioButton;

    @FindBy(id = "selecttype")
    private WebElement dropDownListSelector;

    @FindBy(name = "selected(1234)")
    private WebElement checkBox;

    @FindBy(xpath = "//a[@href='/']")
    private WebElement homePageLink;

    @FindBy(id = "hiddenTextBox")
    private WebElement hiddenInputTextBox;

    @FindBy(id = "divontheleft")
    private WebElement verifiableTextElement;

    // ...
    // other elements on the page

    public boolean selectRadioButton() {
        radioButton.click();
        return radioButton.isSelected();
    }

    public boolean selectCheckBox() {
        checkBox.click();
        return checkBox.isSelected();
    }

    public void clickHomePageLink() {
        homePageLink.click();
    }

    public void setHiddenInputTextBoxValue(String value) {
        hiddenInputTextBox.clear();
        hiddenInputTextBox.sendKeys(value);
    }

    public String getTextFromVerifiableTextElement() {
        return verifiableTextElement.getText();
    }

    // ...
    // other possible actions with elements

}
