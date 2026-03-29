package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PhotoPage {
    WebDriver driver;

    public PhotoPage(WebDriver driver) {
        this.driver = driver;
    }

    By searchBox = By.name("s");
    By results = By.cssSelector("img");

    public void searchPhoto(String name) {
        driver.findElement(searchBox).sendKeys(name);
        driver.findElement(searchBox).submit();
    }

    public boolean isImageDisplayed() {
        return driver.findElements(results).size() > 0;
    }
}
