package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class HomePage {
    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    By downloadMenu = By.linkText("Download & Extend");
    By getWordPress = By.linkText("Get WordPress");
    By community = By.linkText("Community");
    By photoDirectory = By.linkText("Photo Directory");

    public void clickGetWordPress() {
        Actions act = new Actions(driver);
        act.moveToElement(driver.findElement(downloadMenu)).perform();
        driver.findElement(getWordPress).click();
    }

    public void goToPhotoDirectory() {
        driver.findElement(community).click();
        driver.findElement(photoDirectory).click();
    }
}
