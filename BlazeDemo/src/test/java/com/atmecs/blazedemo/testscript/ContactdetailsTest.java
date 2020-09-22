package com.atmecs.blazedemo.testscript;



import com.atmecs.blazedemo.baseclass.BaseClass;
import com.atmecs.blazedemo.pageactions.ContactDetailsPageAction;


public class ContactdetailsTest extends BaseClass {
	ContactDetailsPageAction contact = new ContactDetailsPageAction();
	public void contactTest() throws Exception {
		contact.contactDetails();
	}
	
	
	
	
	
	
	
	
/*	static Properties property;
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
*/		}


