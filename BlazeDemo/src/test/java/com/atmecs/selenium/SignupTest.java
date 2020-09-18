package com.atmecs.selenium;

import java.util.Properties;

import com.atmecs.baseclass.BaseClass;
import com.atmecs.commonhelpers.CommonHelpers;
import com.atmecs.filepath.FilePath;
import com.atmecs.readerlocation.ReaderLocation;

public class SignupTest extends BaseClass {
	static Properties property;
	ReaderLocation read = new ReaderLocation(); 
	
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
