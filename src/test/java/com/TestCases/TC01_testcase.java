package com.TestCases;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Genericfunctions.Genericfunctions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class TC01_testcase extends Genericfunctions{

	
// Opening Online Banking System through Firefox browser
	
	@Given("launch the application in firefox browser")
	public static void openbrowser() {
		System.out.println("Launching application");
		invokeapplication("ff","http://server/bank/");
	}
	
// Verifying the bank online Homepage title
	
	@And("verify the page title")
	public static void verifypagetitle() {
	String actualtitle="Online Banking System";
	String expectedtitle= driver.getTitle();
	System.out.println(expectedtitle);
	
	if(actualtitle.equals(expectedtitle))
	{
		System.out.println("the page is opened as expected");
	}
	
	}
	
// Verifying Home, Admin, Staff, Features, contact us tabs
	
	@Then ("validate the home screen tabs")
	public static void validatetabs() throws Exception {
		int count = 0;
		String[] expectedtabs = { "Home", "Admin", "Staff", "Features", "contact us" };

// Placing all list of tabs in actualtitle variable

		List<WebElement> actualtitle = driver.findElements(By.xpath("//div[@class='navbar']/ul/li/a"));
	
		for (int i = 0; i < actualtitle.size(); i++) {
			if (actualtitle.get(i).getText().trim().equalsIgnoreCase(expectedtabs[i])) {
				System.out.println(actualtitle.get(i).getText());
				String ele = actualtitle.get(i).getAttribute("href");
				System.out.println(ele);
				
// After opening each tab, Checking the Response if the tabs are valid				
				
			URL url = new URL(ele);
			HttpURLConnection con = (HttpURLConnection)url.openConnection();
			
			con.connect();
			int Res = con.getResponseCode();
			if (Res==200){
				System.out.println("Link is active");
			}
				else{
					System.out.println("link is inactive");
			}
			}
			
		}
		System.out.println("All tabs are present as expected");	
		
	}

}
