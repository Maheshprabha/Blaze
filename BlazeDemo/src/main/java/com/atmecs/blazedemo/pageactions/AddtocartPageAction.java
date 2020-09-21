package com.atmecs.blazedemo.pageactions;

import java.util.Properties;

import org.openqa.selenium.WebDriver;

import com.atmecs.blazedemo.commonhelpers.CommonHelpers;
import com.atmecs.blazedemo.filepath.FilePath;
import com.atmecs.blazedemo.readerlocation.ReaderLocation;

public class AddtocartPageAction {
	static Properties property;
	ReaderLocation read = new ReaderLocation(); 
	WebDriver driver;
	
		public void addToCart() throws Exception {
			System.out.println("launch chrome");
			property = ReaderLocation.readLocation(FilePath.locator_path);
			property = ReaderLocation.readLocation(FilePath.User_path);
			property = ReaderLocation.readLocation(FilePath.Valid_path);

	        CommonHelpers.clickAction(driver, property.getProperty("loc_product"));

			CommonHelpers.validate(driver,property.getProperty("loc_mobile"), property.getProperty("loc_product"));
		}

}
