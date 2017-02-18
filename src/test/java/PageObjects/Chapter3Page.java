package PageObjects;

import org.openqa.selenium.WebDriver;

/**
 * Should be realized to represent PageObject for Chapter3 page
 */
class Chapter3Page extends Page {

    private final WebDriver driver;

    public Chapter3Page(WebDriver driver) {
        this.driver = driver;
    }
}
