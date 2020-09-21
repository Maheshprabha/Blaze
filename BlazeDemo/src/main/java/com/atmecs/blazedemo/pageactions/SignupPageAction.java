package com.atmecs.blazedemo.pageactions;

import java.util.Properties;

import org.openqa.selenium.WebDriver;

import com.atmecs.blazedemo.commonhelpers.CommonHelpers;
import com.atmecs.blazedemo.filepath.FilePath;
import com.atmecs.blazedemo.readerlocation.ReaderLocation;

public class SignupPageAction {
	static Properties property;
	ReaderLocation read = new ReaderLocation(); 
	WebDriver driver;
		public void signupDetails() throws Exception {
			System.out.println("launch chrome");
			property = ReaderLocation.readLocation(FilePath.locator_path);
			property = ReaderLocation.readLocation(FilePath.User_path);

	    //
        CommonHelpers.clickAction(driver, property.getProperty("loc_signupusername"));
        //enter user mail id 
        CommonHelpers.sendText(driver, property.getProperty("loc_signupusernames"), property.getProperty("user_signupdata"));
        
        //enter user password
        CommonHelpers.sendText(driver, property.getProperty("loc_password"), property.getProperty("user_password"));
        
        //click submit button
        CommonHelpers.clickAction(driver,  property.getProperty("loc_signupbutton"));
		}

}
