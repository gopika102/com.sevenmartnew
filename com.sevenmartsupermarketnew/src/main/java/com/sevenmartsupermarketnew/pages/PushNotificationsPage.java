package com.sevenmartsupermarketnew.pages;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sevenmartsupermarketnew.utilities.WaitUtility;

public class PushNotificationsPage {
WebDriver driver;

	

	@FindBy(xpath="//ul[@class='nav nav-pills nav-sidebar flex-column']//li[6]")
    WebElement pushNotificationsElement;
    @FindBy(xpath="//input[@id='title']")
    WebElement titleElement;
    @FindBy(xpath="//input[@id='description']")
    WebElement descriptionElement;
   @FindBy(xpath="//button[@class='btn btn-block-sm btn-info']")
   WebElement sendButton;
  public PushNotificationsPage(WebDriver driver) {

		this.driver=driver;

		PageFactory.initElements(driver, this);

	}

	

	public void clickOnPushNotifications() {
pushNotificationsElement.click();

	}

	

	public void enterTitle(String title){

		titleElement.sendKeys(title);

	}

	public void enterDescription(String description){

		descriptionElement.sendKeys(description);

	}

	

	public void clickOnSendButton() {
	

		sendButton.click();

	}
}
