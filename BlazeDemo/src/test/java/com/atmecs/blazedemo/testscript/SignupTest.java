package com.atmecs.blazedemo.testscript;


import com.atmecs.blazedemo.baseclass.BaseClass;
import com.atmecs.blazedemo.pageactions.SignupPageAction;


public class SignupTest extends BaseClass {
	SignupPageAction signup = new SignupPageAction();
	public void signup() throws Exception {
		signup.signupDetails();
	}
}

/*	static Properties property;
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
*/

		

