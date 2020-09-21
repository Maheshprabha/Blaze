package com.atmecs.blazedemo.pageactions;

import java.util.Properties;

import org.openqa.selenium.WebDriver;

import com.atmecs.blazedemo.commonhelpers.CommonHelpers;
import com.atmecs.blazedemo.filepath.FilePath;
import com.atmecs.blazedemo.readerlocation.ReaderLocation;

public class ContactDetailsPageAction {
	static Properties property;
	ReaderLocation read = new ReaderLocation();
	WebDriver driver;
	
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
