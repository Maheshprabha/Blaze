package com.atmecs.blazedemo.testscript;



import com.atmecs.blazedemo.baseclass.BaseClass;
import com.atmecs.blazedemo.pageactions.AddtocartPageAction;


public class AddToCartTest extends BaseClass {
	AddtocartPageAction addtocart = new AddtocartPageAction(); 
	public void purchase() throws Exception {
		addtocart.addToCart();
	}
}









/*	static Properties property;
	ReaderLocation read = new ReaderLocation(); 
	
		public void addToCart() throws Exception {
			System.out.println("launch chrome");
			property = ReaderLocation.readLocation(FilePath.locator_path);
			property = ReaderLocation.readLocation(FilePath.User_path);
			property = ReaderLocation.readLocation(FilePath.Valid_path);

	        CommonHelpers.clickAction(driver, property.getProperty("loc_product"));

			CommonHelpers.validate(driver,property.getProperty("loc_mobile"), property.getProperty("loc_product"));
*/

		
