package PageObjects;

import org.openqa.selenium.WebDriver;

/**
 * Should be realized to represent PageObject for Chapter2 page
 */
class Chapter2Page extends Page {

    private final WebDriver driver;

    public Chapter2Page(WebDriver driver) {
        this.driver = driver;
    }
}
