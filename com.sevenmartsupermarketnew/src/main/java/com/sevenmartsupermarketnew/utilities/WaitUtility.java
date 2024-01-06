package com.sevenmartsupermarketnew.utilities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtility {
public static final long IMPLICIT_WAIT=10;
//static - to call using class name
public static final long EXPLICIT_WAIT=30;
public static WebDriverWait wait;
public void waitForButtonToBeClickable(WebDriver driver, WebElement element)
{
	wait=new WebDriverWait(driver,Duration.ofSeconds(EXPLICIT_WAIT));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h5[@class='card-title']")));
}
public static void waitForVisibilityOfElement(WebDriver driver,String xPath) {
	wait=new WebDriverWait(driver,Duration.ofSeconds(EXPLICIT_WAIT));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xPath)));
}
}