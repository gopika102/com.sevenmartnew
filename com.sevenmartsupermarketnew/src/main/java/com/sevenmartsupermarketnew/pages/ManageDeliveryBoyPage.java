package com.sevenmartsupermarketnew.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sevenmartsupermarketnew.utilities.GeneralUtility;
import com.sevenmartsupermarketnew.utilities.PageUtility;

public class ManageDeliveryBoyPage {
	WebDriver driver;
	GeneralUtility generalUtility;
	PageUtility pageUtility;
	@FindBy(xpath="//ul[@class='nav nav-pills nav-sidebar flex-column']//li[13]")
    WebElement manageDeliveryElement;
	@FindBy(xpath="//table[@class='table table-bordered table-hover table-sm']//tbody//tr//td[1]")
	List<WebElement> nameElements;
	public ManageDeliveryBoyPage(WebDriver driver)
	{
		this.driver =driver;
		PageFactory.initElements(driver, this);
		
	}
	public void clickOnManageDeliveryBoy()
	{
		manageDeliveryElement.click();
	}
	public void editDeliveryBoy(String deliveryBoyName)
	{
		generalUtility = new GeneralUtility(driver);
		pageUtility = new PageUtility(driver);
		
		int index=0;
		List<String> names = new ArrayList<String>();
		names = generalUtility.getTextOfElements(nameElements);
		for(index=0;index<names.size();index++)
		{
			if(deliveryBoyName.equals(names.get(index)))
			{
				index++;
				break;
			}
		}
		WebElement editDeliveryBoyElement = driver.findElement(By.xpath("//table[@class='table table-bordered table-hover table-sm']//tbody/tr[\"+index+\"]/td[8]//a[1]"));
		pageUtility.scroll_AndClick(editDeliveryBoyElement);
		
	}
}
