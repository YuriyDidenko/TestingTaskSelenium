package PageObjects;

import org.openqa.selenium.WebDriver;

/**
 * Should be realized to represent PageObject for Chapter8 page
 */
class Chapter8Page extends Page {

    private final WebDriver driver;

    public Chapter8Page(WebDriver driver) {
        this.driver = driver;
    }
}
