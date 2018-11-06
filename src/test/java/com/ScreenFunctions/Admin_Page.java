package com.ScreenFunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.Genericfunctions.Genericfunctions;

public class Admin_Page extends Genericfunctions{
	
	
	@FindBy(how=How.XPATH,using="//a[normalize-space(text())='Admin']")
	public static WebElement Tab_Admin;
	
	@FindBy(how=How.XPATH,using="//input[@name='uname']")
	public static WebElement Edi_Username;
	
	@FindBy(how=How.XPATH,using="//input[@name='pwd']")
	public static WebElement Edi_Password;
	
	@FindBy(how=How.XPATH,using="//input[@value='Log In']")
	public static WebElement Btn_Login;
	
	@FindBy(how=How.XPATH,using="//a[text()='Add staff member']")
	public static WebElement add_staff;
	
	@FindBy (how=How.XPATH,using="//input[@name='staff_name']")
	public static WebElement add_staffname;
	
	@FindBy (how=How.XPATH,using="//input[@name='staff_gender'][@value='F']")
	public static WebElement staff_gender;
	
	@FindBy (how=How.XPATH,using="//input[@name='staff_dob']")
	public static WebElement staff_job;
	
	@FindBy (how=How.XPATH,using="//option[text()='married']")
	public static WebElement relation_married;
	
	@FindBy (how=How.XPATH,using="//option[text()='revenue']")
	public static WebElement dep;
	
	@FindBy (how=How.XPATH, using="//input[@name='staff_doj']")
	public static WebElement doj;
	
	@FindBy (how=How.XPATH,using="//textarea[@name='staff_address']")
	public static WebElement staff_address;
	
	@FindBy (how=How.XPATH,using="//input[@name='staff_mobile']")
	public static WebElement staff_mobile;
	
	@FindBy (how=How.XPATH,using="//input[@name='staff_email']")
	public static WebElement staff_email;
	
	@FindBy (how=How.XPATH,using="//input[@name='staff_pwd']")
	public static WebElement staff_pwd;
	
	@FindBy (how=How.XPATH,using="//input[@name='add_staff']")
	public static WebElement staff_add;
	
	
	//a[text()='Add staff member']
	
	
	public static boolean clickOnAdmin(){
		boolean status=true;
		try
		{
			status=hoverandclick(Tab_Admin) ;
			
			if(status)
			{
				System.out.println("Clicked sucessfully on Admin Tab");
				
				wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()='Admin Login']")));
			}
			
			
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		return status;
		}
	
	
}
