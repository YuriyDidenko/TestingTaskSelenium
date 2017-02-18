package PageObjects;

import org.openqa.selenium.WebDriver;

/**
 * Should be realized to represent PageObject for Chapter4 page
 */
public class Chapter4Page extends Page {

    private final WebDriver driver;

    public Chapter4Page(WebDriver driver) {
        this.driver = driver;
    }
}
