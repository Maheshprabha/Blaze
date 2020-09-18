package com.atmecs.selenium;

import java.util.Properties;

import com.atmecs.baseclass.BaseClass;
import com.atmecs.commonhelpers.CommonHelpers;
import com.atmecs.filepath.FilePath;
import com.atmecs.readerlocation.ReaderLocation;

public class ContactdetailsTest extends BaseClass {
	static Properties property;
	ReaderLocation read = new ReaderLocation(); 
	
		public void contactDetails() throws Exception {
			System.out.println("launch chrome");
			property = ReaderLocation.readLocation(FilePath.locator_path);
			property = ReaderLocation.readLocation(FilePath.User_path);

	    //
        CommonHelpers.clickAction(driver, property.getProperty("loc_contact"));
        //enter user mail id 
        CommonHelpers.sendText(driver, property.getProperty("loc_recipientmail"), property.getProperty("user_recipientmailid"));
        
        //enter user password
        CommonHelpers.sendText(driver, property.getProperty("loc_recipientmails"), property.getProperty("user_recipientname"));
        
        CommonHelpers.sendText(driver, property.getProperty("loc_text"), property.getProperty("user_text"));

        
        //click submit button
        CommonHelpers.clickAction(driver,  property.getProperty("loc_contactbutton"));
		}

}
