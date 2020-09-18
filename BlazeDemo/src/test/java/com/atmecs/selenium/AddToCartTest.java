package com.atmecs.selenium;

import java.util.Properties;

import com.atmecs.baseclass.BaseClass;
import com.atmecs.commonhelpers.CommonHelpers;
import com.atmecs.filepath.FilePath;
import com.atmecs.readerlocation.ReaderLocation;

public class AddToCartTest extends BaseClass {
	static Properties property;
	ReaderLocation read = new ReaderLocation(); 
	
		public void addToCart() throws Exception {
			System.out.println("launch chrome");
			property = ReaderLocation.readLocation(FilePath.locator_path);
			property = ReaderLocation.readLocation(FilePath.User_path);
			property = ReaderLocation.readLocation(FilePath.Valid_path);

	        CommonHelpers.clickAction(driver, property.getProperty("loc_product"));

			CommonHelpers.validate(driver,property.getProperty("loc_mobile"), property.getProperty("loc_product"));


		}

}
