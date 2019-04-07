package com.Utils;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;

public class Screenshots {
	
	public static String takeScreenshot(WebDriver driver, String fileName) throws IOException {
		fileName = fileName + ".png";
		String directory = "C:\\Users\\SACHIN\\Desktop\\";
		File sourceFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(sourceFile, new File(directory+ fileName));
		String destination = directory+ fileName;
		return destination;
	}

}
