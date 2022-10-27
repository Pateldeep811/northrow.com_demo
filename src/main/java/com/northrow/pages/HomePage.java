package com.northrow.pages;

import com.northrow.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//a[@class='hero-button-dark hvr-bounce-to-right']")
    WebElement clickwatchvideo;

    @CacheLookup
    @FindBy(xpath = "//p[text()='Yes, I want to see a demo of NorthRow…']")
    WebElement verifytext;

    @CacheLookup
    @FindBy (xpath = "//div[@class='menu-main-menu-container']/child::ul[1]/li/a")
    List<WebElement> topmenu;

    public void clickOnTopmenu (String module) throws InterruptedException {
        for (WebElement listmenu : topmenu){
            if (listmenu.getText().equalsIgnoreCase(module)){
                Thread.sleep(2000);
                listmenu.click();
                break;
            }
        }
    }
    public void clickOnwatchvideobutton () {
        clickOnElement(clickwatchvideo);
    }

    public String setVerifyText() {
        return getTextFromElement(verifytext);
    }
    @CacheLookup
    @FindBy(xpath = "//li[@id='menu-item-1383']")
    WebElement clickGetStarted;

    public void setClickGetStarted(){
        clickOnElement(clickGetStarted);
    }
}

