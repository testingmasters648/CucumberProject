package com.TestCases;   

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.Genericfunctions.Genericfunctions;
import com.ScreenFunctions.Admin_Page;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class TC02_testcase extends Admin_Page{

//Launching application
	@Given("launch the application") 
	public static void openbrowser(DataTable testdata) {
		
		List<List<String>> data = testdata.raw();
		System.out.println(data.get(0).get(0));
		System.out.println(data.get(0).get(1));
		
		String Browser = data.get(0).get(0);
		String url = data.get(0).get(1);
		
		System.out.println("Launching application");
		invokeapplication(Browser,url);
	}
	
//click on admintab
	
	@And("click on admintab")       
	
	public static void navigateToAdmintab(){
		
		Admin_Page ap = PageFactory.initElements(driver, Admin_Page.class);
		ap.clickOnAdmin();
	}
	
//enter username and password
	
	@And("enter username, password")
	
	public static boolean usernameandpassword(DataTable testdata1){
		boolean status=true;
		try{
			
			List<List<String>> data = testdata1.raw();
			System.out.println(data.get(0).get(0));
			System.out.println(data.get(0).get(1));
			
			String username = data.get(0).get(0);
			String password = data.get(0).get(1);
			
			Edi_Username.sendKeys(username);
			Edi_Password.sendKeys(password);
			Btn_Login.click();
			}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		return false;
		
}
	//add staff details

@Then("enter the staff details")

public static boolean Givestaffdetails(DataTable testdata2){
	boolean status = true;
	try{
		List<List<String>> data = testdata2.raw();
		
		for(int i=0;i<=data.size();i++){
			
			for(int j=0;j<=i;j++){
				
				
			}
		}
		
		add_staff.click();
		add_staffname.sendKeys("name1");
		staff_gender.click();
		staff_job.sendKeys("16JUN2016");
		relation_married.click();
		dep.click();
		doj.sendKeys("16JUN2019");
		staff_address.sendKeys("line1");
		staff_mobile.sendKeys("26665545");
		staff_email.sendKeys("adsd@gmail.com");
		staff_pwd.sendKeys("sds545@1");
		staff_add.click();
	}
	catch(Exception e){
		System.out.println(e.getMessage());
	}
	return false;
	
	}

}
