package com.atmecs.blazedemo.pageactions;

import java.util.Properties;

import org.openqa.selenium.WebDriver;

import com.atmecs.blazedemo.commonhelpers.CommonHelpers;
import com.atmecs.blazedemo.filepath.FilePath;
import com.atmecs.blazedemo.readerlocation.ReaderLocation;

public class LoginPageAction {
	static Properties property;
	ReaderLocation read = new ReaderLocation();
	WebDriver driver;

	public void loginDetails() throws Exception {
		property = ReaderLocation.readLocation(FilePath.locator_path);
		property = ReaderLocation.readLocation(FilePath.User_path);

    
    CommonHelpers.clickAction(driver, property.getProperty("loc_login"));
    //enter user mail id 
    CommonHelpers.sendText(driver, property.getProperty("loc_username"), property.getProperty("user_mailid"));
    
    //enter user password
    CommonHelpers.sendText(driver, property.getProperty("loc_password"), property.getProperty("user_password"));
    
    //click submit button
    CommonHelpers.clickAction(driver,  property.getProperty("loc_submitbutton"));


}

}


