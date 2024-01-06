package com.sevenmartsupermarketnew.utilities;

import java.io.File;

import java.text.SimpleDateFormat;

import java.util.Date;



import org.openqa.selenium.OutputType;

import org.openqa.selenium.TakesScreenshot;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.io.FileHandler;

import com.sevenmartsupermarketnew.constants.Constants;



public class ScreenShot {

	TakesScreenshot takesScreenshot;



	public void takeScreenShots(WebDriver driver, String imageName) {

		try {

			takesScreenshot = (TakesScreenshot) driver;

			File file = takesScreenshot.getScreenshotAs(OutputType.FILE);// captures screenshot

			String timeStamp = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss").format(new Date());

			String path = Constants.SCREENSHOT_FILE_PATH + imageName + "_" + timeStamp + ".png";

			File destination = new File(path);

			FileHandler.copy(file, destination);

		} catch (Exception e) {

			e.printStackTrace();

		}

	}

}