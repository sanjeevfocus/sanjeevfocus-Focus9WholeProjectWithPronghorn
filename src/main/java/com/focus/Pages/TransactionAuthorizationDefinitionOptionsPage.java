package com.focus.Pages;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.handler.interactions.touch.Scroll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import com.focus.base.BaseEngine;

public class TransactionAuthorizationDefinitionOptionsPage extends BaseEngine
{
	
		
		public static String checkValidationMessage(String ExpMessage) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			Thread.sleep(1050);
			try
			{
				getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(errorMessage));
				String actErrorMessage=errorMessage.getText();
				String expErrorMessage=ExpMessage;
				
				try
				{
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(errorMessageCloseBtn));
					errorMessageCloseBtn.click();
					
					System.out.println("ValidationMessage  :  "+actErrorMessage +" Value Expected : "+expErrorMessage);
					
					return actErrorMessage;
				}
				catch(Exception ee)
				{
					
					System.out.println("ValidationMessage  :  "+actErrorMessage +" Value Expected : "+expErrorMessage);
					
					return actErrorMessage;
				}
			}
			catch(Exception e)
			{
				System.err.println("Error Message NOT Found or NOT Clickable");
				System.err.println(e.getMessage());
		                
				String Exception=e.getMessage();
				
				return Exception;	
			} 
		  }	
		
		
		
    public static void checkPopUpWindow() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
    {
    	 Thread.sleep(5000);
           
           try 
           {
    			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(doNotShowCheckbox));
    			doNotShowCheckbox.click();
    			
    			Thread.sleep(2000);
    			
    			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeBtnInDemoPopupScreen));
    			closeBtnInDemoPopupScreen.click(); 
    			
    			System.err.println("POP UP DISPLAYED AND CLOSED SUCCESSFULLY");
    			
    		} 
           catch (Exception e)
           {
           	System.err.println("NO POP UP DISPLAYED");
    		}

       	
       	Thread.sleep(4000);
    }
    		 



    		


    	
    	
    	
    	public static void checkRefershPopOnlogin() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
    	{
    	
    	try 
    	{
    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(loginRefreshOkBtn));
    	loginRefreshOkBtn.click();
    	
    	
    	} 
    	catch (Exception e)
    	{
    	System.err.println("NO ALERT POP UP DISPLAYED");
    	}
    	
    	
    	Thread.sleep(4000);
    	}
    	

    	
    	

    	     
    	private static int cSize;

    	public boolean checkLogin() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
    	{
    		LoginPage lp=new LoginPage(getDriver()); 
    		
    	    String unamelt="su";
    	  
    	    String pawslt="su";
    	      
    	    lp.enterUserName(unamelt);
    	    
    	    lp.enterPassword(pawslt);
    	    
    	    lp.clickOnSignInBtn();
    	    
    	    //checkRefershPopOnlogin();
    	    
    	    //checkPopUpWindow();
    	  
    		Thread.sleep(5000);
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplay));
    		String actUserInfo=userNameDisplay.getText();
    		
    		System.out.println("User Info  : "+actUserInfo);
    		
    		System.out.println("User Info Capture Text  :  "+userNameDisplay.getText());
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(companyLogo));
    		companyLogo.click();
    		
    		String getCompanyTxt=companyName.getText();
    		String getLoginCompanyName=getCompanyTxt.substring(0, 19);
    		System.out.println("company name  :  "+ getLoginCompanyName);
    		companyLogo.click();
    		
    		boolean actDashboard = dashboard.isDisplayed();
    		
    		
    		String expUserInfo           ="SU";
    		String expLoginCompanyName   ="Automation";
    		boolean expDashboard = true;

    		if (actUserInfo.equalsIgnoreCase(expUserInfo) && getLoginCompanyName.contains(expLoginCompanyName) && actDashboard==expDashboard) 
    		{
				return true;
			}
    		else
    		{
    			return false;
			}
    	}
    	
    	
    	
    	

    	public boolean checkLoginAndRestoreOptionsCompanyAndLogin() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
    	{
    		LoginPage lp=new LoginPage(getDriver()); 
    		
    	    String unamelt="su";
    	  
    	    String pawslt="su";
    	      
    	    lp.enterUserName(unamelt);
    	    
    	    lp.enterPassword(pawslt);
    	    
    	    lp.clickOnSignInBtn();
    	    
    	    //checkRefershPopOnlogin();
    	    
    	    //checkPopUpWindow();
    	  
    		Thread.sleep(8000);
    		
    		String actUserInfo=userNameDisplay.getText();
    		
    		System.out.println("User Info  : "+actUserInfo);
    		
    		System.out.println("User Info Capture Text  :  "+userNameDisplay.getText());
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(companyLogo));
    		companyLogo.click();
    		
    		String getCompanyTxt=companyName.getText();
    		String getLoginCompanyName=getCompanyTxt.substring(0, 19);
    		System.out.println("company name  :  "+ getLoginCompanyName);
    		companyLogo.click();
    		
    		
    		String expUserInfo           ="SU";
    		String expLoginCompanyName   ="Automation";
    		
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
    		homeMenu.click();
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dataMangementMenu));
    		dataMangementMenu.click();
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(restore));
    		restore.click();
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(folderpathExpandBtn));
    		folderpathExpandBtn.click();
    		
    		Thread.sleep(3000);
    	     
    	     Runtime.getRuntime().exec(getBaseDir()+"\\autoIt\\scripts\\optionsCompanyRestore.exe");
    	     
    	     Thread.sleep(3000);
    	     
    	     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(restoreCompanyBtn));
    	     restoreCompanyBtn.click();
    	     
    	     try
    	     {
    	    	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(overRideYesBtn));
    	 		 overRideYesBtn.click();
    	 		 Thread.sleep(20000);
    	     }
    	     catch(Exception e)
    	     {
    	    	 System.err.println("NO OLDER COMPANY EXISTS");
    	     }
    	     
    	     Thread.sleep(3000);
    	     
    	     if(getIsAlertPresent())
    	     {
    	    	 getWaitForAlert();
    	    	 
    	    	 getAlert().accept();
    	     }
    	     
    	     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplay));
    	     userNameDisplay.click();
    		
    		
    	     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
    	     logoutOption.click();

    	     Thread.sleep(3000);
    	     
    	     lp.enterUserName(unamelt);
    	     
    	     lp.enterPassword(pawslt);
    	     
    	     Thread.sleep(2000);
    	     
    	     Select s = new Select(companyDropDownList);
    	     int size=s.getOptions().size();
    	     
    	     System.err.println("SIZE : "+size);
    	     
    	     for(int i=0;i<size;i++)
    	     {
    	    	 String data;
    	    	 
    	    	 data=s.getOptions().get(i).getText();
    	    	 
    	    	 System.err.println("DATA : "+data);
    	    	 
    	    	 if(data.contains("Automation Options"))
    	    	 {
    	    		 
    	    		 s.selectByVisibleText(data);
    	    		 
    	    		 break;
    	    	 }
    	     }
    	     
    	     lp.clickOnSignInBtn();
    	     
    	     Thread.sleep(8000);
    	     
    	     String actUserInfo1=userNameDisplay.getText();
    			
    		System.out.println("User Info  : "+actUserInfo1);
    		
    		System.out.println("User Info Capture Text  :  "+userNameDisplay.getText());
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(companyLogo));
    		companyLogo.click();
    		
    		String getCompanyTxt1=companyName.getText();
    		String getLoginCompanyName1=getCompanyTxt1.substring(0, 19);
    		System.out.println("company name  :  "+ getLoginCompanyName1);
    		companyLogo.click();
    		
    		String expUserInfo1           ="SU";
    		String expLoginCompanyName1   ="Automation Options ";
    	     
    	     
    		System.out.println("UserInfo             : "+actUserInfo            +" Value Expected : "+expUserInfo);
    		System.out.println("LoginCompanyName     : "+getLoginCompanyName    +" Value Expected : "+expLoginCompanyName);
    		
    		System.out.println("UserInfo1             : "+actUserInfo1            +" Value Expected : "+expUserInfo1);
    		System.out.println("LoginCompanyName1     : "+getLoginCompanyName1    +" Value Expected : "+expLoginCompanyName1);
    		
    		if(actUserInfo.equalsIgnoreCase(expUserInfo) && getLoginCompanyName.contains(expLoginCompanyName) 
    				&& actUserInfo1.equalsIgnoreCase(expUserInfo1) && getLoginCompanyName1.contains(expLoginCompanyName1))
    		{
    	
    			return true;
    		}
    		else
    		{
    			return false;
    		}
    	}
    	
    	
    	    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	// Condition Not Required Option
    	public boolean 	checkConditonNotRequiredIsSelectedInTransactionAuthorizationConditionTab() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
    	{
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsmenuBtn));
    		settingsmenuBtn.click();
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(transactionAuthorizationBtn));
    		transactionAuthorizationBtn.click();
    		
    		Thread.sleep(2000);
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNameDropdown));
    		documentNameDropdown.sendKeys(" ");
    		
    		Thread.sleep(1000);
    			
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchasevoucherExpandbutton));
    		purchasevoucherExpandbutton.click();
    	
            getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchasevoucherTypeCreatedVoucher));
    		purchasevoucherTypeCreatedVoucher.click();
    		
    		Thread.sleep(3000);
    				
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
    		nameTxt.click();
    		
    		nameTxt.sendKeys(Keys.SPACE);
    		
    		int namecount=tranAuthNameList.size();
			
			for(int i=0 ; i < namecount ;i++)
			{
				String data=tranAuthNameList.get(i).getText();
				
				if(data.equalsIgnoreCase("Purchase"))
				{
					tranAuthNameList.get(i).click();
					
					break;
				}
			}
				
    		nameTxt.sendKeys(Keys.TAB);
    			
    		Thread.sleep(3000);
    		
    		//click(cnrBtn);
    		doubleClick(cnrBtn);
    		
    		Thread.sleep(1000);
    		//getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(Level1editBtn));
    		//Level1editBtn.click();
    		
    		Thread.sleep(2000);
    		
    		if(conditionNotRequiredChkBox.isSelected()==false)
    		{
    			conditionNotRequiredChkBox.click();
    		}

    		boolean actConditionNotRequiredIsSelected = conditionNotRequiredChkBox.isSelected();
    		boolean expConditionNotRequiredIsSelected = true;
    		
    		System.out.println("Condition Not Required IsSelected  : "+actConditionNotRequiredIsSelected+" Value Expected "+expConditionNotRequiredIsSelected);
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(definitionOkBtn));
    		definitionOkBtn.click();
    		
    		Thread.sleep(2000);
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(tranAuthSaveBtn));
    		tranAuthSaveBtn.click();
    		
    		Thread.sleep(1000);
    		String expValidationMsg = "Authorization Flow saved successfully.";
    		String actValidationMsg = checkValidationMessage(expValidationMsg);
    		
    		System.out.println("Validation Message : "+actValidationMsg+"  Value Expected : "+"True");
    		
    		if(actConditionNotRequiredIsSelected==expConditionNotRequiredIsSelected && actValidationMsg.equalsIgnoreCase(expValidationMsg))
    		{
    			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(tranAuthCancelBtn));
    			tranAuthCancelBtn.click();
    			return true;
    		}
    		else
    		{
    			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(tranAuthCancelBtn));
    			tranAuthCancelBtn.click();
    			return false;
    		}
    	}
    	
    	
    	
    	
    	
    	
    	public static boolean checkSavingPurchaseVoucherNWithConditionsNotRequiredOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
			financialsMenu.click();
					
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
			financialsTransactionMenu.click();
				
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
			financialsTransactionsPurchaseMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVoucherNew));
			purchaseVoucherNew.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
			newBtn.click();
			
			checkValidationMessage("Screen opened");
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseAccountTxt));
			purchaseAccountTxt.click();
			purchaseAccountTxt.sendKeys("Purchase");
			
			Thread.sleep(2000);
			
			purchaseAccountTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
			vendorAccountTxt.click();
			vendorAccountTxt.sendKeys("Vendor A");
			
			Thread.sleep(2000);
			
			vendorAccountTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
			departmentTxt.click();
			departmentTxt.sendKeys("INDIA");
			
			Thread.sleep(2000);
			
			departmentTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(wareHouseTxt));
			wareHouseTxt.click();
			wareHouseTxt.sendKeys("HYDERABAD");
			
			Thread.sleep(2000);
			
			wareHouseTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
			select1stRow_1stColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
			enter_ItemTxt.sendKeys("BR COGS ITEM");
			Thread.sleep(3000);
			enter_ItemTxt.sendKeys(Keys.TAB);
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_5thColumn));
			select1stRow_5thColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
			enter_Quantity.sendKeys("1");
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_7thColumn));
			select1stRow_7thColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
			enter_Rate.sendKeys(Keys.END);
			enter_Rate.sendKeys(Keys.SHIFT, Keys.HOME);
			enter_Rate.sendKeys(Keys.BACK_SPACE);
			enter_Rate.sendKeys("10");
			enter_Rate.sendKeys(Keys.TAB);
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
			saveBtn.click();
			
			Thread.sleep(3000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
			billRefPickIcon.click();
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
			billRefOkBtn.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(errorMessage));
			
			String expMessage1= "Voucher saved successfully";
			String expMessage2= ": 1";
			
			String actMessage = checkValidationMessage(expMessage1);
			
		   System.out.println("************************************* checkSavingPurchaseVoucherNWithConditionsNotRequiredOption  *********************************");
		   
		   System.out.println("SavingMessage  :  "+actMessage +" Value Expected : "+expMessage1+" "+expMessage2);
	
		   if(actMessage.startsWith(expMessage1) && actMessage.endsWith(expMessage2))
    		{
    			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
    			new_CloseBtn.click();
    			Thread.sleep(2000);
    			return true;
    		}
    		else
    		{
    			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
    			new_CloseBtn.click();
    			Thread.sleep(2000);
    			return false;
    		}
    	}
    	
    	
    	
    	
    	
    	public boolean checkAuthorizationStatusInVoucherHomePageWithConditionsNotRequiredOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			int voucherGridDocNoCount = voucherGridDocNo.size();
			
			int actSavedVouchersCount = voucherGridDocNoCount-1;
			int expSavedVouchersCount = 1;
			
			
			String actAuthorizationStatus = voucherGridRow1AuthorizationStatus.getText();
			String expAuthorizationStatus = "Pending";
			
			System.out.println("************************************* checkAuthorizationStatusInVoucherHomePageWithConditionsNotRequiredOption  *********************************");
			
			System.out.println("SavedVouchersCount   : "+actSavedVouchersCount   +" Value Expected : "+expSavedVouchersCount);
			System.out.println("AuthorizationStatus  : "+actAuthorizationStatus  +" Value Expected : "+expAuthorizationStatus);
			
			
			if(actSavedVouchersCount==expSavedVouchersCount && actAuthorizationStatus.equalsIgnoreCase(expAuthorizationStatus))
			{
				System.out.println("Test Pass : Authorization Status Succesfully");
				//excelReader.setCellData(xlfile, "SmokeSalesOrder", 627, 9, resPass);
				return true;
			}
			else
			{
				System.out.println("Test Fail : Authorization Statusis NOT Succesfully");
				//excelReader.setCellData(xlfile, "SmokeSalesOrder", 627, 9, resFail);
				return false;
			}
		}
			
			
			
			
		
		
		public static boolean checkLogoutAndLoginWithUserAllOptionsWithConditionsNotRequiredOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
    	{
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplayLogo));
    		userNameDisplayLogo.click();
   		
   	     	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
   	     	logoutOption.click();

   	     	Thread.sleep(3000);
   	     	
    		LoginPage lp=new LoginPage(getDriver()); 
    		
    	    String unamelt="UserAllOptions";
    	  
    	    String pawslt="12345";
    	      
    	    lp.enterUserName(unamelt);
    	    
    	    lp.enterPassword(pawslt);
    	    
    	    lp.clickOnSignInBtn();
    	    
    	    //checkRefershPopOnlogin();
    	    
    	    //checkPopUpWindow();
    	  
    		Thread.sleep(6000);

    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplay));
    		String actUserInfo=userNameDisplay.getText();
    		
    		System.out.println("User Info  : "+actUserInfo);
    		
    		System.out.println("User Info Capture Text  :  "+userNameDisplay.getText());
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(companyLogo));
    		companyLogo.click();
    		
    		String getCompanyTxt=companyName.getText();
    		String getLoginCompanyName=getCompanyTxt.substring(0, 19);
    		System.out.println("company name  :  "+ getLoginCompanyName);
    		companyLogo.click();
    		
    		
    		String expUserInfo           ="UserAllOptions";
    		String expLoginCompanyName   ="Automation";
    		
    		boolean actDashboard = dashboard.isDisplayed();
    		boolean expDashboard = true;
    		
    		System.out.println("**********************************************checkLogoutAndLoginWithUserAllOptionsWithConditionsNotRequiredOption*********************************************");
    		
    		System.out.println("User Info               : "+actUserInfo         +" Value Expected "+expUserInfo);
    		System.out.println("Login Company           : "+getLoginCompanyName +" Value Expected "+expLoginCompanyName);
    		System.out.println("Dashboard is Displaying : "+actDashboard        +" Value Expected "+expDashboard );

    		if (actUserInfo.equalsIgnoreCase(expUserInfo) && getLoginCompanyName.contains(expLoginCompanyName) && actDashboard==expDashboard) 
    		{
    			System.out.println("Login Successful");
				return true;
			}
    		else
    		{
    			System.out.println("Login Not Successful");
    			return false;
			}
    	}
			
    	
    	
		
		
		
		
		
		public static boolean checkLogoutAndLoginWithUserTransactionAuthorization() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
    	{
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplayLogo));
    		userNameDisplayLogo.click();
   		
   	     	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
   	     	logoutOption.click();

   	     	Thread.sleep(3000);
   	     	
    		LoginPage lp=new LoginPage(getDriver()); 
    		
    	    String unamelt="UserTransactionAuthorization";
    	  
    	    String pawslt="12345";
    	      
    	    lp.enterUserName(unamelt);
    	    
    	    lp.enterPassword(pawslt);
    	    
    	    lp.clickOnSignInBtn();
    	    
    	    //checkRefershPopOnlogin();
    	    
    	    //checkPopUpWindow();
    	  
    		Thread.sleep(6000);

    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplay));
    		String actUserInfo=userNameDisplay.getText();
    		
    		System.out.println("User Info  : "+actUserInfo);
    		
    		System.out.println("User Info Capture Text  :  "+userNameDisplay.getText());
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(companyLogo));
    		companyLogo.click();
    		
    		String getCompanyTxt=companyName.getText();
    		String getLoginCompanyName=getCompanyTxt.substring(0, 19);
    		System.out.println("company name  :  "+ getLoginCompanyName);
    		companyLogo.click();
    		
    		String expUserInfo           ="UserTransactionAuthorization";
    		String expLoginCompanyName   ="Automation";
    		
    		boolean actDashboard = dashboard.isDisplayed();
    		boolean expDashboard = true;
    		
    		System.out.println("User Info               : "+actUserInfo         +" Value Expected "+expUserInfo);
    		System.out.println("Login Company           : "+getLoginCompanyName +" Value Expected "+expLoginCompanyName);
    		System.out.println("Dashboard is Displaying : "+actDashboard        +" Value Expected "+expDashboard );

    		if (actUserInfo.equalsIgnoreCase(expUserInfo) && getLoginCompanyName.contains(expLoginCompanyName) && actDashboard==expDashboard) 
    		{
    			System.out.println("Login Successful");
				return true;
			}
    		else
    		{
    			System.out.println("Login Not Successful");
    			return false;
			}
    	}
		
		
		
		
		
		public static boolean checkLogoutAndLoginWithSU() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
    	{
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplayLogo));
    		userNameDisplayLogo.click();
   		
   	     	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
   	     	logoutOption.click();

   	     	Thread.sleep(3000);
   	     	
    		LoginPage lp=new LoginPage(getDriver()); 
    		
    	    String unamelt="su";
    	  
    	    String pawslt="su";
    	      
    	    lp.enterUserName(unamelt);
    	    
    	    lp.enterPassword(pawslt);
    	    
    	    lp.clickOnSignInBtn();
    	    
    	    //checkRefershPopOnlogin();
    	    
    	    //checkPopUpWindow();
    	  
    		Thread.sleep(6000);

    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplay));
    		String actUserInfo=userNameDisplay.getText();
    		
    		System.out.println("User Info  : "+actUserInfo);
    		
    		System.out.println("User Info Capture Text  :  "+userNameDisplay.getText());
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(companyLogo));
    		companyLogo.click();
    		
    		String getCompanyTxt=companyName.getText();
    		String getLoginCompanyName=getCompanyTxt.substring(0, 19);
    		System.out.println("company name  :  "+ getLoginCompanyName);
    		companyLogo.click();
    		
    		
    		String expUserInfo           ="SU";
    		String expLoginCompanyName   ="Automation";
    		
    		boolean actDashboard = dashboard.isDisplayed();
    		boolean expDashboard = true;
    		
    		System.out.println("User Info               : "+actUserInfo         +" Value Expected "+expUserInfo);
    		System.out.println("Login Company           : "+getLoginCompanyName +" Value Expected "+expLoginCompanyName);
    		System.out.println("Dashboard is Displaying : "+actDashboard        +" Value Expected "+expDashboard );

    		if (actUserInfo.equalsIgnoreCase(expUserInfo) && getLoginCompanyName.contains(expLoginCompanyName) && actDashboard==expDashboard) 
    		{
    			System.out.println("Login Successful");
				return true;
			}
    		else
    		{
    			System.out.println("Login Not Successful");
    			return false;
			}
    	}
		
		
		
		
    	


		public static boolean checkPurchasesVoucherNAuthorizationStatusWithUserAllOptionsAndConditionsNotRequiredOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
			financialsMenu.click();
					
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
			financialsTransactionMenu.click();
				
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
			financialsTransactionsPurchaseMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVoucherNew));
			purchaseVoucherNew.click();
			
			Thread.sleep(3000);
			
			int voucherGridDocNoCount = voucherGridDocNo.size();
			
			int actSavedVouchersCount = voucherGridDocNoCount-1;
			int expSavedVouchersCount = 1;
			
			
			String actAuthorizationStatus = voucherGridRow1AuthorizationStatus.getText();
			String expAuthorizationStatus = "Pending";
			
			Thread.sleep(2000);
			
			click(homePageVoucherArrowBtn);
			Thread.sleep(1000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pendingAuthorizationPurchases));
			pendingAuthorizationPurchases.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherHomeRow1ChkBox));
			voucherHomeRow1ChkBox.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(authorizeBtn));
			authorizeBtn.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(authorizePopupOkBtn));
			authorizePopupOkBtn.click();
			
			Thread.sleep(2000);
			
			click(homePageVoucherArrowBtn);
			
			Thread.sleep(1000);
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homePageAllVouchersView));
			homePageAllVouchersView.click();
			
			Thread.sleep(2000);
			
			String actAfterAuthorizationStatus = voucherGridRow1AuthorizationStatus.getText();
			String expAfterAuthorizationStatus = "Authorized";
			
			System.out.println("************************************* checkPurchasesVoucherNAuthorizationStatusWithUserAllOptionsAndConditionsNotRequiredOption  *********************************");
			
			System.out.println("SavedVouchersCount        : "+actSavedVouchersCount        +" Value Expected : "+expSavedVouchersCount);
			System.out.println("AuthorizationStatus       : "+actAuthorizationStatus       +" Value Expected : "+expAuthorizationStatus);
			System.out.println("AfterAuthorizationStatus  : "+actAfterAuthorizationStatus  +" Value Expected : "+expAfterAuthorizationStatus);
			
			
			if(actSavedVouchersCount==expSavedVouchersCount && actAuthorizationStatus.equalsIgnoreCase(expAuthorizationStatus) 
				&& actAfterAuthorizationStatus.equalsIgnoreCase(expAfterAuthorizationStatus))
			{
				System.out.println("Test Pass : Authorized Succesfully");
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
				homeCloseBtn.click();
    			Thread.sleep(3000);
				//excelReader.setCellData(xlfile, "SmokeSalesOrder", 627, 9, resPass);
				return true;
			}
			else
			{
				System.out.println("Test Fail : NOT Authorized Succesfully");
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
				homeCloseBtn.click();
    			Thread.sleep(3000);
				//excelReader.setCellData(xlfile, "SmokeSalesOrder", 627, 9, resFail);
				return false;
			}
			
		}
			
		
		
		
	
		
		
		public static boolean checkLogoutAndLoginWithSUToCheckAuthorizationStatusWithConditionsNotRequiredOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
    	{
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplayLogo));
    		userNameDisplayLogo.click();
   		
   	     	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
   	     	logoutOption.click();

   	     	Thread.sleep(3000);
    		
    		LoginPage lp=new LoginPage(getDriver()); 
    		
    	    String unamelt="su";
    	  
    	    String pawslt="su";
    	      
    	    lp.enterUserName(unamelt);
    	    
    	    lp.enterPassword(pawslt);
    	    
    	    lp.clickOnSignInBtn();
    	    
    	    //checkRefershPopOnlogin();
    	    
    	    //checkPopUpWindow();
    	  
    		Thread.sleep(6000);

    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
			financialsMenu.click();
					
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
			financialsTransactionMenu.click();
				
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
			financialsTransactionsPurchaseMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVoucherNew));
			purchaseVoucherNew.click();
			
			Thread.sleep(3000);
			
			int voucherGridDocNoCount = voucherGridDocNo.size();
			
			int actSavedVouchersCount = voucherGridDocNoCount-1;
			int expSavedVouchersCount = 1;
			
			
			String actAuthorizationStatus = voucherGridRow1AuthorizationStatus.getText();
			String expAuthorizationStatus = "Authorized";
			
			System.out.println("************************************* checkLogoutAndLoginWithSUToCheckAuthorizationStatusWithConditionsNotRequiredOption  *********************************");
			
			System.out.println("SavedVouchersCount        : "+actSavedVouchersCount        +" Value Expected : "+expSavedVouchersCount);
			System.out.println("AuthorizationStatus       : "+actAuthorizationStatus       +" Value Expected : "+expAuthorizationStatus);
			
			if(actSavedVouchersCount==expSavedVouchersCount && actAuthorizationStatus.equalsIgnoreCase(expAuthorizationStatus))
			{
				System.out.println("Test Pass : Authorize Succesfully");
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
				homeCloseBtn.click();
    			Thread.sleep(2000);
				//excelReader.setCellData(xlfile, "SmokeSalesOrder", 627, 9, resPass);
				return true;
			}
			else
			{
				System.out.println("Test Fail : NOT Authorize Succesfully");
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
				homeCloseBtn.click();
    			Thread.sleep(2000);
				//excelReader.setCellData(xlfile, "SmokeSalesOrder", 627, 9, resFail);
				return false;
			}
			
		}
    		
    		
    	
		
		
		public boolean checkEraseAllTransactionsAfterCompletingConditionsNotRequiredOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
			homeMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dataMangementMenu));
			dataMangementMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(eraseAll));
			eraseAll.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(eraseTranscationsRadio));
			eraseTranscationsRadio.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(eraseAllOkBtn));
			eraseAllOkBtn.click();
			
			if(getIsAlertPresent())
			{
				getWaitForAlert();
				
				getAlert().accept();
			}
			
			String expMessage = "Data deleted successfully.";
			
			String actMessage = checkValidationMessage(expMessage);
			
			System.out.println("************************************* CheckSavingPurchaseVoucherWithCovertOptionWithAllMandatoryFields  *********************************");
			System.out.println("Message  :  "+actMessage +" Value Expected : "+expMessage);
			
			if (actMessage.equalsIgnoreCase(expMessage))
			{
				System.out.println("Voucher Saved");
				return true;
			}
			else
			{
				System.out.println("Voucher Not Saved");
				return false;
			}
		}
			
		
		
		
		
		
		// For Changing User when Voucher is in Pending.
		
		public boolean checkTransactionAuthorizationDeletingLevelAndChangingUser() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
    	{
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsmenuBtn));
    		settingsmenuBtn.click();
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(transactionAuthorizationBtn));
    		transactionAuthorizationBtn.click();
    		
    		Thread.sleep(2000);
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNameDropdown));
    		documentNameDropdown.sendKeys(" ");
    		
    		Thread.sleep(1000);
    			
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchasevoucherExpandbutton));
    		purchasevoucherExpandbutton.click();
    	
            getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchasevoucherTypeCreatedVoucher));
    		purchasevoucherTypeCreatedVoucher.click();
    		
    		Thread.sleep(3000);
    				
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
    		nameTxt.click();
    		
    		nameTxt.sendKeys(Keys.SPACE);
    		
    		int namecount=tranAuthNameList.size();
			
			for(int i=0 ; i < namecount ;i++)
			{
				String data=tranAuthNameList.get(i).getText();
				
				if(data.equalsIgnoreCase("Purchase"))
				{
					tranAuthNameList.get(i).click();
					
					break;
				}
			}
				
    		nameTxt.sendKeys(Keys.TAB);
    			
    		Thread.sleep(3000);
    		
    		click(utaBtn);
    		Thread.sleep(1000);
    		
    		//getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(Level2DeleteBtn));
    		//Level2DeleteBtn.click();
    		ClickUsingJs(Level2DeleteBtn);
    		
    		
    		getWaitForAlert();
    		
    		String actAlert = getAlert().getText();
    		String expAlert = "Would you like to delete the selected node ?";
    		
    		getAlert().accept();
    		
    		System.err.println("Alert Text : "+actAlert+"  Value Expected  "+expAlert);
    		
    		Thread.sleep(2000);
    		
    		click(cnrBtn);
    		
    		//getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(Level1editBtn));
    		//Level1editBtn.click();
    		ClickUsingJs(Level1editBtn);
    		
    		Thread.sleep(2000);
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(conditionNotRequiredChkBox));
    		
    		if(conditionNotRequiredChkBox.isSelected()==false)
    		{
    			//conditionNotRequiredChkBox.click();
    			ClickUsingJs(conditionNotRequiredChkBox);
    		}
    		
    		Thread.sleep(1000);
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userSelectionTab));
    		userSelectionTab.click();
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userrow1));
    		userrow1.click();
    		Select user = new Select(userDropdown);
			user.selectByVisibleText("UserTransactionAuthorization");
    		
			Thread.sleep(2000);
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(definitionOkBtn));
    		definitionOkBtn.click();
    		
    		Thread.sleep(2000);
			
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(tranAuthSaveBtn));
    		tranAuthSaveBtn.click();
    		
    		String expValidationMsg = "Authorization Flow saved successfully.";
    		String actValidationMsg = checkValidationMessage(expValidationMsg);
    		
    		System.out.println("Validation Message : "+actValidationMsg+"  Value Expected : "+expValidationMsg);
    		
    		if(/*actAlert.equalsIgnoreCase(expAlert) &&*/ actValidationMsg.equalsIgnoreCase(expValidationMsg))
    		{
    			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(tranAuthCancelBtn));
    			tranAuthCancelBtn.click();
    			return true;
    		}
    		else
    		{
    			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(tranAuthCancelBtn));
    			tranAuthCancelBtn.click();
    			return false;
    		}
    	}
		
		
		
		
		
		
		public static boolean checkSavingPurchaseVoucherN1ForChangingUserWhileVoucherIsInPendingState() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			System.out.println("***************************checkSavingPurchaseVoucherN1ForChangingUserWhileVoucherIsInPendingState*********************************");
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
			financialsMenu.click();
					
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
			financialsTransactionMenu.click();
				
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
			financialsTransactionsPurchaseMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVoucherNew));
			purchaseVoucherNew.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
			newBtn.click();
			
			checkValidationMessage("Screen opened");
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseAccountTxt));
			purchaseAccountTxt.click();
			purchaseAccountTxt.sendKeys("Purchase");
			
			Thread.sleep(2000);
			
			purchaseAccountTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
			vendorAccountTxt.click();
			vendorAccountTxt.sendKeys("Vendor A");
			
			Thread.sleep(2000);
			
			vendorAccountTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
			departmentTxt.click();
			departmentTxt.sendKeys("INDIA");
			
			Thread.sleep(2000);
			
			departmentTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(wareHouseTxt));
			wareHouseTxt.click();
			wareHouseTxt.sendKeys("HYDERABAD");
			
			Thread.sleep(2000);
			
			wareHouseTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
			select1stRow_1stColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
			enter_ItemTxt.sendKeys("BR COGS ITEM");
			Thread.sleep(3000);
			enter_ItemTxt.sendKeys(Keys.TAB);
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_5thColumn));
			select1stRow_5thColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
			enter_Quantity.sendKeys("0.5");
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_7thColumn));
			select1stRow_7thColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
			enter_Rate.sendKeys(Keys.END);
			enter_Rate.sendKeys(Keys.SHIFT, Keys.HOME);
			enter_Rate.sendKeys(Keys.BACK_SPACE);
			enter_Rate.sendKeys("10");
			enter_Rate.sendKeys(Keys.TAB);
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
			saveBtn.click();
			
			Thread.sleep(3000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
			billRefPickIcon.click();
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
			billRefOkBtn.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(errorMessage));
			
			String expMessage1= "Voucher saved successfully";
			String expMessage2= ": 1";
			
			String actMessage = checkValidationMessage(expMessage1);
			
		   System.out.println("SavingMessage  :  "+actMessage +" Value Expected : "+expMessage1+" "+expMessage2);
	
		   if(actMessage.startsWith(expMessage1) && actMessage.endsWith(expMessage2))
	 		{
	 			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
	 			new_CloseBtn.click();
	 			Thread.sleep(2000);
	 			return true;
	 		}
	 		else
	 		{
	 			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
	 			new_CloseBtn.click();
	 			Thread.sleep(2000);
	 			return false;
	 		}
	 	}
		
		
		
		
		
		
 	
 	
		public boolean checkAuthorizationStatusInVoucherHomePageWithChangingUserWhileVoucherIsInPendingStateCondition() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
 		    System.out.println("**********************checkAuthorizationStatusInVoucherHomePageWithChangingUserWhileVoucherIsInPendingStateCondition***********************");
 		
			int voucherGridDocNoCount = voucherGridDocNo.size();
			
			int actSavedVouchersCount = voucherGridDocNoCount-1;
			int expSavedVouchersCount = 1;
			
			String actRow1AuthorizationStatus = voucherGridRow1AuthorizationStatus.getText();
			String expRow1AuthorizationStatus = "Pending";
			
			System.out.println("SavedVouchersCount       : "+actSavedVouchersCount       +" Value Expected : "+expSavedVouchersCount);
			System.out.println("Row1AuthorizationStatus  : "+actRow1AuthorizationStatus  +" Value Expected : "+expRow1AuthorizationStatus);

			if(actSavedVouchersCount==expSavedVouchersCount && actRow1AuthorizationStatus.equalsIgnoreCase(expRow1AuthorizationStatus))
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
				homeCloseBtn.click();
				Thread.sleep(2000);
				return true;
			}
			else
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
				homeCloseBtn.click();
				Thread.sleep(2000);
				return false;
			}
		}
		
		
		
		
		
		
		
		public boolean checkChangingUserToUserAllOptionsInTransactionAuthorizationWhenPurchaseVoucherNIsInPending() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
    	{
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsmenuBtn));
    		settingsmenuBtn.click();
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(transactionAuthorizationBtn));
    		transactionAuthorizationBtn.click();
    		
    		Thread.sleep(2000);
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNameDropdown));
    		documentNameDropdown.sendKeys(" ");
    		
    		Thread.sleep(1000);
    			
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchasevoucherExpandbutton));
    		purchasevoucherExpandbutton.click();
    	
            getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchasevoucherTypeCreatedVoucher));
    		purchasevoucherTypeCreatedVoucher.click();
    		
    		Thread.sleep(3000);
    				
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
    		nameTxt.click();
    		
    		nameTxt.sendKeys(Keys.SPACE);
    		
    		int namecount=tranAuthNameList.size();
			
			for(int i=0 ; i < namecount ;i++)
			{
				String data=tranAuthNameList.get(i).getText();
				
				if(data.equalsIgnoreCase("Purchase"))
				{
					tranAuthNameList.get(i).click();
					
					break;
				}
			}
				
    		nameTxt.sendKeys(Keys.TAB);
    			
    		Thread.sleep(3000);
    		click(cnrBtn);
    		Thread.sleep(2000);
    		ClickUsingJs(Level1editBtn);
    		Thread.sleep(2000);
    		
    		//getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(Level1editBtn));
    		//Level1editBtn.click();
    		
    		
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userSelectionTab));
    		userSelectionTab.click();
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userrow1));
    		userrow1.click();
    		Select user = new Select(userDropdown);
			user.selectByVisibleText("UserAllOptions");
    		
			Thread.sleep(2000);
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(definitionOkBtn));
    		definitionOkBtn.click();
    		
    		Thread.sleep(2000);
			
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(tranAuthSaveBtn));
    		tranAuthSaveBtn.click();
    		
    		String expValidationMsg = "Template and user details updated successfully, Other details cannot be modified as authorization is in pending state";
    		String actValidationMsg = checkValidationMessage(expValidationMsg);
    		
    		System.out.println("Validation Message : "+actValidationMsg+"  Value Expected : "+expValidationMsg);
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(tranAuthCancelBtn));
			tranAuthCancelBtn.click();
			
			getWaitForAlert();
			
			String actAlert = getAlert().getText();
			String expAlert = "Would you like to Close this window , there are uncommited changes";
			
			getAlert().accept();
			
			Thread.sleep(2000);
			
			System.out.println("Alert Text : "+actAlert+"  Value Expected  "+expAlert);
    		
    		if(actAlert.equalsIgnoreCase(expAlert) && actValidationMsg.equalsIgnoreCase(expValidationMsg))
    		{
    			return true;
    		}
    		else
    		{
    			return false;
    		}
    	}
		
		
		
		
		
		
		
		
		
		public static boolean checkSavingPurchaseVoucherN2AfterChangingUserWhileVoucherIsInPendingState() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			System.out.println("***************************checkSavingPurchaseVoucherN2AfterChangingUserWhileVoucherIsInPendingState*********************************");
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
			financialsMenu.click();
					
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
			financialsTransactionMenu.click();
				
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
			financialsTransactionsPurchaseMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVoucherNew));
			purchaseVoucherNew.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
			newBtn.click();
			
			checkValidationMessage("Screen opened");
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseAccountTxt));
			purchaseAccountTxt.click();
			purchaseAccountTxt.sendKeys("Purchase");
			
			Thread.sleep(2000);
			
			purchaseAccountTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
			vendorAccountTxt.click();
			vendorAccountTxt.sendKeys("Vendor A");
			
			Thread.sleep(2000);
			
			vendorAccountTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
			departmentTxt.click();
			departmentTxt.sendKeys("INDIA");
			
			Thread.sleep(2000);
			
			departmentTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(wareHouseTxt));
			wareHouseTxt.click();
			wareHouseTxt.sendKeys("HYDERABAD");
			
			Thread.sleep(2000);
			
			wareHouseTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
			select1stRow_1stColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
			enter_ItemTxt.sendKeys("BR COGS ITEM");
			Thread.sleep(3000);
			enter_ItemTxt.sendKeys(Keys.TAB);
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_5thColumn));
			select1stRow_5thColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
			enter_Quantity.sendKeys("0.5");
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_7thColumn));
			select1stRow_7thColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
			enter_Rate.sendKeys(Keys.END);
			enter_Rate.sendKeys(Keys.SHIFT, Keys.HOME);
			enter_Rate.sendKeys(Keys.BACK_SPACE);
			enter_Rate.sendKeys("10");
			enter_Rate.sendKeys(Keys.TAB);
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
			saveBtn.click();
			
			Thread.sleep(3000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
			billRefPickIcon.click();
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
			billRefOkBtn.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(errorMessage));
			
			String expMessage1= "Voucher saved successfully";
			String expMessage2= ": 2";
			
			String actMessage = checkValidationMessage(expMessage1);
			
		   System.out.println("SavingMessage  :  "+actMessage +" Value Expected : "+expMessage1+" "+expMessage2);
	
		   if(actMessage.startsWith(expMessage1) && actMessage.endsWith(expMessage2))
	 		{
	 			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
	 			new_CloseBtn.click();
	 			Thread.sleep(2000);
	 			return true;
	 		}
	 		else
	 		{
	 			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
	 			new_CloseBtn.click();
	 			Thread.sleep(2000);
	 			return false;
	 		}
	 	}
		
		
		
		
		
 	
 	
		public boolean checkAuthorizationStatusInVoucherHomePageWithTwoVouchersChangingUserWhileVoucherIsInPendingStateCondition() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
 		    System.out.println("**********************checkAuthorizationStatusInVoucherHomePageWithTwoVouchersChangingUserWhileVoucherIsInPendingStateCondition***********************");
 		
			int voucherGridDocNoCount = voucherGridDocNo.size();
			
			int actSavedVouchersCount = voucherGridDocNoCount-1;
			int expSavedVouchersCount = 2;
			
			String actRow1AuthorizationStatus = voucherGridRow1AuthorizationStatus.getText();
			String expRow1AuthorizationStatus = "Pending";
			
			String actRow2AuthorizationStatus = voucherGridRow2AuthorizationStatus.getText();
			String expRow2AuthorizationStatus = "Pending";
			
			System.out.println("SavedVouchersCount       : "+actSavedVouchersCount       +" Value Expected : "+expSavedVouchersCount);
			System.out.println("Row1AuthorizationStatus  : "+actRow1AuthorizationStatus  +" Value Expected : "+expRow1AuthorizationStatus);
			System.out.println("Row2AuthorizationStatus  : "+actRow2AuthorizationStatus  +" Value Expected : "+expRow2AuthorizationStatus);

			if(actSavedVouchersCount==expSavedVouchersCount && actRow1AuthorizationStatus.equalsIgnoreCase(expRow1AuthorizationStatus)
					&& actRow2AuthorizationStatus.equalsIgnoreCase(expRow2AuthorizationStatus))
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
				homeCloseBtn.click();
				Thread.sleep(2000);
				return true;
			}
			else
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
				homeCloseBtn.click();
				Thread.sleep(2000);
				return false;
			}
		}
		
		
		
		
		
		
		public static boolean checkPurchasesVoucherNAuthorizationStatusWithUserAllOptionsAndChangingUserWhileVoucherIsInPendingStateCondition() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
			financialsMenu.click();
					
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
			financialsTransactionMenu.click();
				
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
			financialsTransactionsPurchaseMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVoucherNew));
			purchaseVoucherNew.click();
			
			Thread.sleep(3000);
			
			int voucherGridDocNoCount = voucherGridDocNo.size();
			
			int actSavedVouchersCount = voucherGridDocNoCount-1;
			int expSavedVouchersCount = 2;
			
			String actRow1AuthorizationStatus = voucherGridRow1AuthorizationStatus.getText();
			String expRow1AuthorizationStatus = "Pending";
			
			String actRow2AuthorizationStatus = voucherGridRow2AuthorizationStatus.getText();
			String expRow2AuthorizationStatus = "Pending";
			
			System.out.println("SavedVouchersCount       : "+actSavedVouchersCount       +" Value Expected : "+expSavedVouchersCount);
			System.out.println("Row1AuthorizationStatus  : "+actRow1AuthorizationStatus  +" Value Expected : "+expRow1AuthorizationStatus);
			System.out.println("Row2AuthorizationStatus  : "+actRow2AuthorizationStatus  +" Value Expected : "+expRow2AuthorizationStatus);
			
			if(actSavedVouchersCount==expSavedVouchersCount && actRow1AuthorizationStatus.equalsIgnoreCase(expRow1AuthorizationStatus)
					&& actRow2AuthorizationStatus.equalsIgnoreCase(expRow2AuthorizationStatus))
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		
		
    	
    	
    	
    	
    	
    	public static boolean checkPurchasesVoucherNAuthorizaingWithUserAllOptionsAndChangingUserWhileVoucherIsInPendingStateCondition() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));

    		int voucherGridDocNoCount = voucherGridDocNo.size();

    		for(int i=0;i<voucherGridDocNoCount;i++)
    		{
    			String data = voucherGridDocNo.get(i).getText();

    			if(data.equalsIgnoreCase("1"))
    			{
    				if (voucherGridIndexChkBox.get(i).isSelected()==false) 
    				{
    					voucherGridIndexChkBox.get(i).click();
    					break;
    				}
    			}
    		}

    		Thread.sleep(2000);
    		
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(authorizeBtn));
			authorizeBtn.click();
			
			String expUserCantAuthorize = "User can not authorize";
			String actUserCantAuthorize = checkValidationMessage(expUserCantAuthorize);
			
			Thread.sleep(2000);
			
			for(int i=0;i<voucherGridDocNoCount;i++)
    		{
    			String data = voucherGridDocNo.get(i).getText();

    			if(data.equalsIgnoreCase("1"))
    			{
    				if (voucherGridIndexChkBox.get(i).isSelected()==true) 
    				{
    					voucherGridIndexChkBox.get(i).click();
    				}
    			}
    			
    			if(data.equalsIgnoreCase("2"))
    			{
    				if (voucherGridIndexChkBox.get(i).isSelected()==false) 
    				{
    					voucherGridIndexChkBox.get(i).click();
    				}
    			}
    		}

    		Thread.sleep(2000);
			
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(authorizeBtn));
			authorizeBtn.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(authorizePopupOkBtn));
			authorizePopupOkBtn.click();
			
			Thread.sleep(2000);
			click(homePageVoucherArrowBtn);
			Thread.sleep(1000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homePageAllVouchersView));
			homePageAllVouchersView.click();
			
			Thread.sleep(2000);
			
			String actRow1AuthorizationStatus = voucherGridRow1AuthorizationStatus.getText();
			String expRow1AuthorizationStatus = "Authorized";
			
			String actRow2AuthorizationStatus = voucherGridRow2AuthorizationStatus.getText();
			String expRow2AuthorizationStatus = "Pending";
			
			System.out.println("Row1AuthorizationStatus  : "+actRow1AuthorizationStatus  +" Value Expected : "+expRow1AuthorizationStatus);
			System.out.println("Row2AuthorizationStatus  : "+actRow2AuthorizationStatus  +" Value Expected : "+expRow2AuthorizationStatus);
			
			if(actUserCantAuthorize.equalsIgnoreCase(expUserCantAuthorize) && actRow1AuthorizationStatus.equalsIgnoreCase(expRow1AuthorizationStatus)
					&& actRow2AuthorizationStatus.equalsIgnoreCase(expRow2AuthorizationStatus))
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
				homeCloseBtn.click();
    			Thread.sleep(2000);
				return true;
			}
			else
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
				homeCloseBtn.click();
    			Thread.sleep(2000);
				return false;
			}
		}
		
		
		
		
		
		
		
    	
    	public static boolean checkPurchasesVoucherNAuthorizationStatusWithUserTransactionAuthorizationAndChangingUserWhileVoucherIsInPendingStateCondition() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
			financialsMenu.click();
					
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
			financialsTransactionMenu.click();
				
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
			financialsTransactionsPurchaseMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVoucherNew));
			purchaseVoucherNew.click();
			
			Thread.sleep(3000);
			
			int voucherGridDocNoCount = voucherGridDocNo.size();
			
			int actSavedVouchersCount = voucherGridDocNoCount-1;
			int expSavedVouchersCount = 2;
			
			
			String actRow1AuthorizationStatus = voucherGridRow1AuthorizationStatus.getText();
			String expRow1AuthorizationStatus = "Authorized";
			
			String actRow2AuthorizationStatus = voucherGridRow2AuthorizationStatus.getText();
			String expRow2AuthorizationStatus = "Pending";
			
			System.out.println("SavedVouchersCount       : "+actSavedVouchersCount       +" Value Expected : "+expSavedVouchersCount);
			System.out.println("Row1AuthorizationStatus  : "+actRow1AuthorizationStatus  +" Value Expected : "+expRow1AuthorizationStatus);
			System.out.println("Row2AuthorizationStatus  : "+actRow2AuthorizationStatus  +" Value Expected : "+expRow2AuthorizationStatus);
			
			if(actSavedVouchersCount==expSavedVouchersCount && actRow1AuthorizationStatus.equalsIgnoreCase(expRow1AuthorizationStatus)
					&& actRow2AuthorizationStatus.equalsIgnoreCase(expRow2AuthorizationStatus))
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		
		
    	
    	
    	
    	
    	
    	public static boolean checkPurchasesVoucherNAuthorizaingWithUserTransactionAuthorizationAndChangingUserWhileVoucherIsInPendingStateCondition() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));

    		int voucherGridDocNoCount = voucherGridDocNo.size();

    		for(int i=0;i<voucherGridDocNoCount;i++)
    		{
    			String data = voucherGridDocNo.get(i).getText();

    			if(data.equalsIgnoreCase("1"))
    			{
    				if (voucherGridIndexChkBox.get(i).isSelected()==false) 
    				{
    					voucherGridIndexChkBox.get(i).click();
    					break;
    				}
    			}
    		}

    		Thread.sleep(2000);
    		
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(authorizeBtn));
			authorizeBtn.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(authorizePopupOkBtn));
			authorizePopupOkBtn.click();
			
			Thread.sleep(2000);
			click(homePageVoucherArrowBtn);
			Thread.sleep(1000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homePageAllVouchersView));
			homePageAllVouchersView.click();
			
			Thread.sleep(2000);
			
			String actRow1AuthorizationStatus = voucherGridRow1AuthorizationStatus.getText();
			String expRow1AuthorizationStatus = "Authorized";
			
			String actRow2AuthorizationStatus = voucherGridRow2AuthorizationStatus.getText();
			String expRow2AuthorizationStatus = "Authorized";
			
			System.out.println("Row1AuthorizationStatus  : "+actRow1AuthorizationStatus  +" Value Expected : "+expRow1AuthorizationStatus);
			System.out.println("Row2AuthorizationStatus  : "+actRow2AuthorizationStatus  +" Value Expected : "+expRow2AuthorizationStatus);
			
			if(actRow1AuthorizationStatus.equalsIgnoreCase(expRow1AuthorizationStatus) && actRow2AuthorizationStatus.equalsIgnoreCase(expRow2AuthorizationStatus))
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
				homeCloseBtn.click();
    			Thread.sleep(2000);
				return true;
			}
			else
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
				homeCloseBtn.click();
    			Thread.sleep(2000);
				return false;
			}
		}
		
    	
    	
    	
    	
    	
    	
    	
    	public static boolean checkPurchasesVoucherNAuthorizationStatusWithSUAfterAuthorizationChangingUserWhileVoucherIsInPendingStateCondition() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
			financialsMenu.click();
					
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
			financialsTransactionMenu.click();
				
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
			financialsTransactionsPurchaseMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVoucherNew));
			purchaseVoucherNew.click();
			
			Thread.sleep(3000);
			
			int voucherGridDocNoCount = voucherGridDocNo.size();
			
			int actSavedVouchersCount = voucherGridDocNoCount-1;
			int expSavedVouchersCount = 2;
			
			
			String actRow1AuthorizationStatus = voucherGridRow1AuthorizationStatus.getText();
			String expRow1AuthorizationStatus = "Authorized";
			
			String actRow2AuthorizationStatus = voucherGridRow2AuthorizationStatus.getText();
			String expRow2AuthorizationStatus = "Authorized";
			
			System.out.println("SavedVouchersCount       : "+actSavedVouchersCount       +" Value Expected : "+expSavedVouchersCount);
			System.out.println("Row1AuthorizationStatus  : "+actRow1AuthorizationStatus  +" Value Expected : "+expRow1AuthorizationStatus);
			System.out.println("Row2AuthorizationStatus  : "+actRow2AuthorizationStatus  +" Value Expected : "+expRow2AuthorizationStatus);
			
			if(actSavedVouchersCount==expSavedVouchersCount && actRow1AuthorizationStatus.equalsIgnoreCase(expRow1AuthorizationStatus)
					&& actRow2AuthorizationStatus.equalsIgnoreCase(expRow2AuthorizationStatus))
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
				homeCloseBtn.click();
    			Thread.sleep(2000);
				return true;
			}
			else
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
				homeCloseBtn.click();
    			Thread.sleep(2000);
				return false;
			}
		}
		
		
		
		
		
		
		
		
		
		
		// Condition With Quantity Greater Than or Equal to and Parallel Level
		
		public boolean 	checkTransactionAuthorizationAddingLevelAndGivingConditionsWithQuantity() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
    	{
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsmenuBtn));
    		settingsmenuBtn.click();
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(transactionAuthorizationBtn));
    		transactionAuthorizationBtn.click();
    		
    		Thread.sleep(2000);
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNameDropdown));
    		documentNameDropdown.sendKeys(" ");
    		
    		Thread.sleep(1000);
    			
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchasevoucherExpandbutton));
    		purchasevoucherExpandbutton.click();
    	
            getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchasevoucherTypeCreatedVoucher));
    		purchasevoucherTypeCreatedVoucher.click();
    		
    		Thread.sleep(3000);
    				
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
    		nameTxt.click();
    		
    		nameTxt.sendKeys(Keys.SPACE);
    		
    		int namecount=tranAuthNameList.size();
			
			for(int i=0 ; i < namecount ;i++)
			{
				String data=tranAuthNameList.get(i).getText();
				
				if(data.equalsIgnoreCase("Purchase"))
				{
					tranAuthNameList.get(i).click();
					
					break;
				}
			}
				
    		nameTxt.sendKeys(Keys.TAB);
    			
    		Thread.sleep(3000);
    		
    		//getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(Level1editBtn));
    		//Level1editBtn.click();
    		//click(cnrBtn);
    		doubleClick(cnrBtn);
    		
    		Thread.sleep(2000);
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(conditionNotRequiredChkBox));
    		
    		if(conditionNotRequiredChkBox.isSelected()==true)
    		{
    			//conditionNotRequiredChkBox.click();
    			ClickUsingJs(conditionNotRequiredChkBox);
    			
    		}
    		
    		Thread.sleep(2000);
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(Row1ConjunctionDropdown));
    		Select s1=new Select(Row1ConjunctionDropdown);
    		s1.selectByIndex(1);
    		
    		
    		//getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(Row1SelectFieldTxt));
    		//Row1SelectFieldTxt.click();
    		moveToElement(Row1SelectFieldTxt);
    		
    		Thread.sleep(2000);
    		
    		getAction().moveToElement(selectFieldQuantity).click().build().perform();
    		
    		Thread.sleep(1000);
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(Row1SelectOperatorDropdown));
    		Select s2=new Select(Row1SelectOperatorDropdown);
    		s2.selectByIndex(6);
    		
    		Thread.sleep(1000);
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(Row1CompareWithDropdown));
    		Select s3=new Select(Row1CompareWithDropdown);
    		s3.selectByIndex(1);
    		
    		Thread.sleep(2000);
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(Row1ValueTxt));
    		Row1ValueTxt.click();
    		Row1ValueTxt.sendKeys("10");
    		
    		Thread.sleep(2000);
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(Row1TransAuthConditionAddBtn));
    		Row1TransAuthConditionAddBtn.click();
    		
    		Thread.sleep(1000);
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(Row2SelectFieldTxt));
    		Row2SelectFieldTxt.click();
    		
    		Thread.sleep(2000);
    		
    		((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView(true);", selectFieldQuantity);
    		//getAction().moveToElement(selectFieldQuantity).build().perform();
    		//selectFieldQuantity.click();
    		ClickUsingJs(selectFieldQuantity);
    		
    		Thread.sleep(1000);
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(Row2SelectOperatorDropdown));
    		Select sR2=new Select(Row2SelectOperatorDropdown);
    		sR2.selectByIndex(5);
    		
    		Thread.sleep(1000);
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(Row2CompareWithDropdown));
    		Select R2S3=new Select(Row2CompareWithDropdown);
    		R2S3.selectByIndex(1);
    		
    		Thread.sleep(2000);
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(Row2ValueTxt));
    		Row2ValueTxt.click();
    		Row2ValueTxt.sendKeys("20");
    		
    		Thread.sleep(2000);
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(definitionOkBtn));
    		definitionOkBtn.click();
    		
    		Thread.sleep(2000);
    		click(cnrBtn);
    		Thread.sleep(1000);
    		
    		//getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(LevelCheck1ChkBox));
    		//LevelCheck1ChkBox.click();
    		ClickUsingJs(LevelCheck1ChkBox);
    		
    		Thread.sleep(1000);
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(addLevelBtn));
    		addLevelBtn.click();
    		
    		Thread.sleep(2000);
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(descriptionTxt));
    		descriptionTxt.click();
    		descriptionTxt.sendKeys("UTA");
    		
    		Thread.sleep(2000);
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(conditionNotRequiredChkBox));
    		
    		if(conditionNotRequiredChkBox.isSelected())
    		{
    			conditionNotRequiredChkBox.click();
    		}
    		
    		Thread.sleep(2000);
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(Row1ConjunctionDropdown));
    		Select Conjunction = new Select(Row1ConjunctionDropdown);
    		Conjunction.selectByIndex(1);
    		
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(Row1SelectFieldTxt));
    		Row1SelectFieldTxt.click();
    		
    		Thread.sleep(2000);
    		
    		//getAction().moveToElement(selectFieldQuantity).click().build().perform();
    		//moveToElement(selectFieldQuantity);
    		ScrollToElement(selectFieldQuantity);
    		ClickUsingJs(selectFieldQuantity);
    		
    		
    		Thread.sleep(1000);
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(Row1SelectOperatorDropdown));
    		Select Operator = new Select(Row1SelectOperatorDropdown);
    		Operator.selectByIndex(4);
    		
    		Thread.sleep(1000);
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(Row1CompareWithDropdown));
    		Select CompareWith = new Select(Row1CompareWithDropdown);
    		CompareWith.selectByIndex(1);
    		
    		Thread.sleep(2000);
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(Row1ValueTxt));
    		Row1ValueTxt.click();
    		Row1ValueTxt.sendKeys("20");
    		
    		Thread.sleep(2000);
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(askRemarksOnapprovalChkBox));

    		if (askRemarksOnapprovalChkBox.isSelected()==false) 
    		{
    			//askRemarksOnapprovalChkBox.click();
    			ClickUsingJs(askRemarksOnapprovalChkBox);
			}
    		
    		Thread.sleep(1000);
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userSelectionTab));
    		userSelectionTab.click();
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userrow1));
    		userrow1.click();
    		Thread.sleep(2000);
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userDropdown));
    		Select user = new Select(userDropdown);
			user.selectByVisibleText("UserTransactionAuthorization");
    		
			Thread.sleep(2000);
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(definitionOkBtn));
    		definitionOkBtn.click();
    		
    		Thread.sleep(2000);
			
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(tranAuthSaveBtn));
    		tranAuthSaveBtn.click();
    		
    		String expValidationMsg = "Authorization Flow saved successfully.";
    		String actValidationMsg = checkValidationMessage(expValidationMsg);
    		
    		System.out.println("Validation Message : "+actValidationMsg+"  Value Expected : "+expValidationMsg);
    		
    		if(actValidationMsg.equalsIgnoreCase(expValidationMsg))
    		{
    			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(tranAuthCancelBtn));
    			tranAuthCancelBtn.click();
    			return true;
    		}
    		else
    		{
    			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(tranAuthCancelBtn));
    			tranAuthCancelBtn.click();
    			return false;
    		}
    	}
    	
		
		
		
		
		
		
		


		public static boolean checkSavingPurchaseVoucherN1WithQuantityAs6() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			System.out.println("***************************checkSavingPurchaseVoucherN1WithQuantityAs6*********************************");
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
			financialsMenu.click();
					
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
			financialsTransactionMenu.click();
				
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
			financialsTransactionsPurchaseMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVoucherNew));
			purchaseVoucherNew.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
			newBtn.click();
			
			checkValidationMessage("Screen opened");
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseAccountTxt));
			purchaseAccountTxt.click();
			purchaseAccountTxt.sendKeys("Purchase");
			
			Thread.sleep(2000);
			
			purchaseAccountTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
			vendorAccountTxt.click();
			vendorAccountTxt.sendKeys("Vendor A");
			
			Thread.sleep(2000);
			
			vendorAccountTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
			departmentTxt.click();
			departmentTxt.sendKeys("INDIA");
			
			Thread.sleep(2000);
			
			departmentTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(wareHouseTxt));
			wareHouseTxt.click();
			wareHouseTxt.sendKeys("HYDERABAD");
			
			Thread.sleep(2000);
			
			wareHouseTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
			select1stRow_1stColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
			enter_ItemTxt.sendKeys("BR COGS ITEM");
			Thread.sleep(3000);
			enter_ItemTxt.sendKeys(Keys.TAB);
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_5thColumn));
			select1stRow_5thColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
			enter_Quantity.sendKeys("0.5");
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_7thColumn));
			select1stRow_7thColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
			enter_Rate.sendKeys(Keys.END);
			enter_Rate.sendKeys(Keys.SHIFT, Keys.HOME);
			enter_Rate.sendKeys(Keys.BACK_SPACE);
			enter_Rate.sendKeys("10");
			enter_Rate.sendKeys(Keys.TAB);
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
			saveBtn.click();
			
			Thread.sleep(3000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
			billRefPickIcon.click();
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
			billRefOkBtn.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(errorMessage));
			
			String expMessage1= "Voucher saved successfully";
			String expMessage2= ": 1";
			
			String actMessage = checkValidationMessage(expMessage1);
			
		   System.out.println("SavingMessage  :  "+actMessage +" Value Expected : "+expMessage1+" "+expMessage2);
	
		   if(actMessage.startsWith(expMessage1) && actMessage.endsWith(expMessage2))
    		{
    			return true;
    		}
    		else
    		{
    			return false;
    		}
    	}
		
		
		
		
		
		
		public static boolean checkSavingPurchaseVoucherN2WithQuantityAs12() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			System.out.println("**********************checkSavingPurchaseVoucherN2WithQuantityAs12*************************");
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseAccountTxt));
			purchaseAccountTxt.click();
			purchaseAccountTxt.sendKeys("Purchase");
			
			Thread.sleep(2000);
			
			purchaseAccountTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
			vendorAccountTxt.click();
			vendorAccountTxt.sendKeys("Vendor A");
			
			Thread.sleep(2000);
			
			vendorAccountTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
			departmentTxt.click();
			departmentTxt.sendKeys("INDIA");
			
			Thread.sleep(2000);
			
			departmentTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(wareHouseTxt));
			wareHouseTxt.click();
			wareHouseTxt.sendKeys("HYDERABAD");
			
			Thread.sleep(2000);
			
			wareHouseTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
			select1stRow_1stColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
			enter_ItemTxt.sendKeys("BR COGS ITEM");
			Thread.sleep(3000);
			enter_ItemTxt.sendKeys(Keys.TAB);
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_5thColumn));
			select1stRow_5thColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
			enter_Quantity.sendKeys("1");
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_7thColumn));
			select1stRow_7thColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
			enter_Rate.sendKeys(Keys.END);
			enter_Rate.sendKeys(Keys.SHIFT, Keys.HOME);
			enter_Rate.sendKeys(Keys.BACK_SPACE);
			enter_Rate.sendKeys("10");
			enter_Rate.sendKeys(Keys.TAB);
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
			saveBtn.click();
			
			Thread.sleep(3000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
			billRefPickIcon.click();
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
			billRefOkBtn.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(errorMessage));
			
			String expMessage1= "Voucher saved successfully";
			String expMessage2= ": 2";
			
			String actMessage = checkValidationMessage(expMessage1);
			
		   System.out.println("SavingMessage  :  "+actMessage +" Value Expected : "+expMessage1+" "+expMessage2);
	
		   if(actMessage.startsWith(expMessage1) && actMessage.endsWith(expMessage2))
    		{
    			return true;
    		}
    		else
    		{
    			return false;
    		}
    	}
    	
    	
    	
		
		
		
		public static boolean checkSavingPurchaseVoucherN3WithQuantityAs12() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			System.out.println("**********************checkSavingPurchaseVoucherN3WithQuantityAs12*************************");
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseAccountTxt));
			purchaseAccountTxt.click();
			purchaseAccountTxt.sendKeys("Purchase");
			
			Thread.sleep(2000);
			
			purchaseAccountTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
			vendorAccountTxt.click();
			vendorAccountTxt.sendKeys("Vendor A");
			
			Thread.sleep(2000);
			
			vendorAccountTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
			departmentTxt.click();
			departmentTxt.sendKeys("INDIA");
			
			Thread.sleep(2000);
			
			departmentTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(wareHouseTxt));
			wareHouseTxt.click();
			wareHouseTxt.sendKeys("HYDERABAD");
			
			Thread.sleep(2000);
			
			wareHouseTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
			select1stRow_1stColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
			enter_ItemTxt.sendKeys("BR COGS ITEM");
			Thread.sleep(3000);
			enter_ItemTxt.sendKeys(Keys.TAB);
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_5thColumn));
			select1stRow_5thColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
			enter_Quantity.sendKeys("1");
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_7thColumn));
			select1stRow_7thColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
			enter_Rate.sendKeys(Keys.END);
			enter_Rate.sendKeys(Keys.SHIFT, Keys.HOME);
			enter_Rate.sendKeys(Keys.BACK_SPACE);
			enter_Rate.sendKeys("10");
			enter_Rate.sendKeys(Keys.TAB);
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
			saveBtn.click();
			
			Thread.sleep(3000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
			billRefPickIcon.click();
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
			billRefOkBtn.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(errorMessage));
			
			String expMessage1= "Voucher saved successfully";
			String expMessage2= ": 3";
			
			String actMessage = checkValidationMessage(expMessage1);
			
		   System.out.println("SavingMessage  :  "+actMessage +" Value Expected : "+expMessage1+" "+expMessage2);
	
		   if(actMessage.startsWith(expMessage1) && actMessage.endsWith(expMessage2))
    		{
    			return true;
    		}
    		else
    		{
    			return false;
    		}
    	}
    	
		
		
		
		
		
		public static boolean checkSavingPurchaseVoucherN4WithQuantityAs24() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			System.out.println("**********************checkSavingPurchaseVoucherN4WithQuantityAs24*************************");
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseAccountTxt));
			purchaseAccountTxt.click();
			purchaseAccountTxt.sendKeys("Purchase");
			
			Thread.sleep(2000);
			
			purchaseAccountTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
			vendorAccountTxt.click();
			vendorAccountTxt.sendKeys("Vendor A");
			
			Thread.sleep(2000);
			
			vendorAccountTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
			departmentTxt.click();
			departmentTxt.sendKeys("INDIA");
			
			Thread.sleep(2000);
			
			departmentTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(wareHouseTxt));
			wareHouseTxt.click();
			wareHouseTxt.sendKeys("HYDERABAD");
			
			Thread.sleep(2000);
			
			wareHouseTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
			select1stRow_1stColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
			enter_ItemTxt.sendKeys("BR COGS ITEM");
			Thread.sleep(3000);
			enter_ItemTxt.sendKeys(Keys.TAB);
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_5thColumn));
			select1stRow_5thColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
			enter_Quantity.sendKeys("2");
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_7thColumn));
			select1stRow_7thColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
			enter_Rate.sendKeys(Keys.END);
			enter_Rate.sendKeys(Keys.SHIFT, Keys.HOME);
			enter_Rate.sendKeys(Keys.BACK_SPACE);
			enter_Rate.sendKeys("10");
			enter_Rate.sendKeys(Keys.TAB);
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
			saveBtn.click();
			
			Thread.sleep(3000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
			billRefPickIcon.click();
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
			billRefOkBtn.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(errorMessage));
			
			String expMessage1= "Voucher saved successfully";
			String expMessage2= ": 4";
			
			String actMessage = checkValidationMessage(expMessage1);
		   
		   System.out.println("SavingMessage  :  "+actMessage +" Value Expected : "+expMessage1+" "+expMessage2);
	
		   if(actMessage.startsWith(expMessage1) && actMessage.endsWith(expMessage2))
    		{
    			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
    			new_CloseBtn.click();
    			Thread.sleep(2000);
    			return true;
    		}
    		else
    		{
    			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
    			new_CloseBtn.click();
    			Thread.sleep(2000);
    			return false;
    		}
    	}
		
		
		
		
    	
    	
    	public boolean checkAuthorizationStatusInVoucherHomePageWithConditionsWithQuantity() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
    		System.out.println("**********************checkAuthorizationStatusInVoucherHomePageWithConditionsWithQuantity***********************");
    		
			int voucherGridDocNoCount = voucherGridDocNo.size();
			
			int actSavedVouchersCount = voucherGridDocNoCount-1;
			int expSavedVouchersCount = 4;
			
			String actRow1AuthorizationStatus = voucherGridRow1AuthorizationStatus.getText();
			String expRow1AuthorizationStatus = "Pending";
			
			String actRow2AuthorizationStatus = voucherGridRow2AuthorizationStatus.getText();
			String expRow2AuthorizationStatus = "Pending";
			
			String actRow3AuthorizationStatus = voucherGridRow3AuthorizationStatus.getText();
			String expRow3AuthorizationStatus = "Pending";
			
			String actRow4AuthorizationStatus = voucherGridRow4AuthorizationStatus.getText();
			String expRow4AuthorizationStatus = "Authorized";
			
			System.out.println("SavedVouchersCount       : "+actSavedVouchersCount       +" Value Expected : "+expSavedVouchersCount);
			System.out.println("Row1AuthorizationStatus  : "+actRow1AuthorizationStatus  +" Value Expected : "+expRow1AuthorizationStatus);
			System.out.println("Row2AuthorizationStatus  : "+actRow2AuthorizationStatus  +" Value Expected : "+expRow2AuthorizationStatus);
			System.out.println("Row3AuthorizationStatus  : "+actRow3AuthorizationStatus  +" Value Expected : "+expRow3AuthorizationStatus);
			System.out.println("Row4AuthorizationStatus  : "+actRow4AuthorizationStatus  +" Value Expected : "+expRow4AuthorizationStatus);
			
			if(actSavedVouchersCount==expSavedVouchersCount && actRow1AuthorizationStatus.equalsIgnoreCase(expRow1AuthorizationStatus)
					&& actRow2AuthorizationStatus.equalsIgnoreCase(expRow2AuthorizationStatus)
					&& actRow3AuthorizationStatus.equalsIgnoreCase(expRow3AuthorizationStatus)
					&& actRow4AuthorizationStatus.equalsIgnoreCase(expRow4AuthorizationStatus))
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
				homeCloseBtn.click();
    			Thread.sleep(2000);
				return true;
			}
			else
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
				homeCloseBtn.click();
    			Thread.sleep(2000);
				return false;
			}
		}
			
			
		
		
		
		
		
		
    	public static boolean checkPurchasesVoucherNAuthorizationStatusWithUserAllOptionsAndQuantityCondition() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
			financialsMenu.click();
					
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
			financialsTransactionMenu.click();
				
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
			financialsTransactionsPurchaseMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVoucherNew));
			purchaseVoucherNew.click();
			
			Thread.sleep(3000);
			
			int voucherGridDocNoCount = voucherGridDocNo.size();
			
			int actSavedVouchersCount = voucherGridDocNoCount-1;
			int expSavedVouchersCount = 4;
			
			String actRow1AuthorizationStatus = voucherGridRow1AuthorizationStatus.getText();
			String expRow1AuthorizationStatus = "Pending";
			
			String actRow2AuthorizationStatus = voucherGridRow2AuthorizationStatus.getText();
			String expRow2AuthorizationStatus = "Pending";
			
			String actRow3AuthorizationStatus = voucherGridRow3AuthorizationStatus.getText();
			String expRow3AuthorizationStatus = "Pending";
			
			String actRow4AuthorizationStatus = voucherGridRow4AuthorizationStatus.getText();
			String expRow4AuthorizationStatus = "Authorized";
			
			System.out.println("SavedVouchersCount       : "+actSavedVouchersCount       +" Value Expected : "+expSavedVouchersCount);
			System.out.println("Row1AuthorizationStatus  : "+actRow1AuthorizationStatus  +" Value Expected : "+expRow1AuthorizationStatus);
			System.out.println("Row2AuthorizationStatus  : "+actRow2AuthorizationStatus  +" Value Expected : "+expRow2AuthorizationStatus);
			System.out.println("Row3AuthorizationStatus  : "+actRow3AuthorizationStatus  +" Value Expected : "+expRow3AuthorizationStatus);
			System.out.println("Row4AuthorizationStatus  : "+actRow4AuthorizationStatus  +" Value Expected : "+expRow4AuthorizationStatus);
			
			if(actSavedVouchersCount==expSavedVouchersCount && actRow1AuthorizationStatus.equalsIgnoreCase(expRow1AuthorizationStatus)
					&& actRow2AuthorizationStatus.equalsIgnoreCase(expRow2AuthorizationStatus)
					&& actRow3AuthorizationStatus.equalsIgnoreCase(expRow3AuthorizationStatus)
					&& actRow4AuthorizationStatus.equalsIgnoreCase(expRow4AuthorizationStatus))
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		
		
    	
    	
    	
    	
    	
    	public static boolean checkPurchasesVoucherNAuthorizaingWithUserAllOptionsAndQuantityConditionOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));

    		int voucherGridDocNoCount = voucherGridDocNo.size();

    		for(int i=0;i<voucherGridDocNoCount;i++)
    		{
    			String data = voucherGridDocNo.get(i).getText();

    			if(data.equalsIgnoreCase("4"))
    			{
    				if (voucherGridIndexChkBox.get(i).isSelected()==false) 
    				{
    					voucherGridIndexChkBox.get(i).click();
    					break;
    				}
    			}
    		}

    		Thread.sleep(2000);
    		
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(authorizeBtn));
			authorizeBtn.click();
			
			String expUserCantAuthorize = "User can not authorize";
			String actUserCantAuthorize = checkValidationMessage(expUserCantAuthorize);
			
			Thread.sleep(2000);
			
			for(int i=0;i<voucherGridDocNoCount;i++)
    		{
    			String data = voucherGridDocNo.get(i).getText();

    			if(data.equalsIgnoreCase("4"))
    			{
    				if (voucherGridIndexChkBox.get(i).isSelected()==true) 
    				{
    					voucherGridIndexChkBox.get(i).click();
    				}
    			}
    			
    			if(data.equalsIgnoreCase("3"))
    			{
    				if (voucherGridIndexChkBox.get(i).isSelected()==false) 
    				{
    					voucherGridIndexChkBox.get(i).click();
    				}
    			}
    		}

    		Thread.sleep(2000);
			
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(authorizeBtn));
			authorizeBtn.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(authorizePopupOkBtn));
			authorizePopupOkBtn.click();
			
			Thread.sleep(2000);
			
			click(homePageVoucherArrowBtn);
			Thread.sleep(1000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homePageAllVouchersView));
			homePageAllVouchersView.click();
			
			Thread.sleep(2000);
			
			String actRow1AuthorizationStatus = voucherGridRow1AuthorizationStatus.getText();
			String expRow1AuthorizationStatus = "Pending";
			
			String actRow2AuthorizationStatus = voucherGridRow2AuthorizationStatus.getText();
			String expRow2AuthorizationStatus = "Authorized";
			
			String actRow3AuthorizationStatus = voucherGridRow3AuthorizationStatus.getText();
			String expRow3AuthorizationStatus = "Pending";
			
			String actRow4AuthorizationStatus = voucherGridRow4AuthorizationStatus.getText();
			String expRow4AuthorizationStatus = "Authorized";
			
			System.out.println("Row1AuthorizationStatus  : "+actRow1AuthorizationStatus  +" Value Expected : "+expRow1AuthorizationStatus);
			System.out.println("Row2AuthorizationStatus  : "+actRow2AuthorizationStatus  +" Value Expected : "+expRow2AuthorizationStatus);
			System.out.println("Row3AuthorizationStatus  : "+actRow3AuthorizationStatus  +" Value Expected : "+expRow3AuthorizationStatus);
			System.out.println("Row4AuthorizationStatus  : "+actRow4AuthorizationStatus  +" Value Expected : "+expRow4AuthorizationStatus);
			
			if(actUserCantAuthorize.equalsIgnoreCase(expUserCantAuthorize) && actRow1AuthorizationStatus.equalsIgnoreCase(expRow1AuthorizationStatus)
					&& actRow2AuthorizationStatus.equalsIgnoreCase(expRow2AuthorizationStatus) && actRow3AuthorizationStatus.equalsIgnoreCase(expRow3AuthorizationStatus)
					&& actRow4AuthorizationStatus.equalsIgnoreCase(expRow4AuthorizationStatus))
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
				homeCloseBtn.click();
    			Thread.sleep(2000);
				return true;
			}
			else
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
				homeCloseBtn.click();
    			Thread.sleep(2000);
				return false;
			}
		}
		
		
		
		
		
		
		
    	
    	public static boolean checkPurchasesVoucherNAuthorizationStatusWithUserTransactionAuthorizationAndQuantityCondition() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
			financialsMenu.click();
					
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
			financialsTransactionMenu.click();
				
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
			financialsTransactionsPurchaseMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVoucherNew));
			purchaseVoucherNew.click();
			
			Thread.sleep(3000);
			
			int voucherGridDocNoCount = voucherGridDocNo.size();
			
			int actSavedVouchersCount = voucherGridDocNoCount-1;
			int expSavedVouchersCount = 4;
			
			
			String actRow1AuthorizationStatus = voucherGridRow1AuthorizationStatus.getText();
			String expRow1AuthorizationStatus = "Pending";
			
			String actRow2AuthorizationStatus = voucherGridRow2AuthorizationStatus.getText();
			String expRow2AuthorizationStatus = "Authorized";
			
			String actRow3AuthorizationStatus = voucherGridRow3AuthorizationStatus.getText();
			String expRow3AuthorizationStatus = "Pending";
			
			String actRow4AuthorizationStatus = voucherGridRow4AuthorizationStatus.getText();
			String expRow4AuthorizationStatus = "Authorized";
			
			System.out.println("SavedVouchersCount       : "+actSavedVouchersCount       +" Value Expected : "+expSavedVouchersCount);
			System.out.println("Row1AuthorizationStatus  : "+actRow1AuthorizationStatus  +" Value Expected : "+expRow1AuthorizationStatus);
			System.out.println("Row2AuthorizationStatus  : "+actRow2AuthorizationStatus  +" Value Expected : "+expRow2AuthorizationStatus);
			System.out.println("Row3AuthorizationStatus  : "+actRow3AuthorizationStatus  +" Value Expected : "+expRow3AuthorizationStatus);
			System.out.println("Row4AuthorizationStatus  : "+actRow4AuthorizationStatus  +" Value Expected : "+expRow4AuthorizationStatus);
			
			if(actSavedVouchersCount==expSavedVouchersCount && actRow1AuthorizationStatus.equalsIgnoreCase(expRow1AuthorizationStatus)
					&& actRow2AuthorizationStatus.equalsIgnoreCase(expRow2AuthorizationStatus)
					&& actRow3AuthorizationStatus.equalsIgnoreCase(expRow3AuthorizationStatus)
					&& actRow4AuthorizationStatus.equalsIgnoreCase(expRow4AuthorizationStatus))
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		
		
    	
    	
    	
    	
    	
    	public static boolean checkPurchasesVoucherNAuthorizaingWithUserTransactionAuthorizationAndQuantityConditionOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));

    		int voucherGridDocNoCount = voucherGridDocNo.size();

    		for(int i=0;i<voucherGridDocNoCount;i++)
    		{
    			String data = voucherGridDocNo.get(i).getText();

    			if(data.equalsIgnoreCase("2"))
    			{
    				if (voucherGridIndexChkBox.get(i).isSelected()==false) 
    				{
    					voucherGridIndexChkBox.get(i).click();
    					break;
    				}
    			}
    		}

    		Thread.sleep(2000);
    		
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(authorizeBtn));
			authorizeBtn.click();
			
			String expUserCantAuthorize = "User can not authorize";
			String actUserCantAuthorize = checkValidationMessage(expUserCantAuthorize);
			
			Thread.sleep(2000);
			
			for(int i=0;i<voucherGridDocNoCount;i++)
    		{
    			String data = voucherGridDocNo.get(i).getText();

    			if(data.equalsIgnoreCase("2"))
    			{
    				if (voucherGridIndexChkBox.get(i).isSelected()==true) 
    				{
    					voucherGridIndexChkBox.get(i).click();
    				}
    			}
    			
    			if(data.equalsIgnoreCase("4"))
    			{
    				if (voucherGridIndexChkBox.get(i).isSelected()==false) 
    				{
    					voucherGridIndexChkBox.get(i).click();
    				}
    			}
    		}

    		Thread.sleep(2000);
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(authorizeBtn));
			authorizeBtn.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(authorizePopupOkBtn));
			authorizePopupOkBtn.click();
			
			Thread.sleep(2000);
			click(homePageVoucherArrowBtn);
			Thread.sleep(1000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homePageAllVouchersView));
			homePageAllVouchersView.click();
			
			Thread.sleep(2000);
			
			String actRow1AuthorizationStatus = voucherGridRow1AuthorizationStatus.getText();
			String expRow1AuthorizationStatus = "Authorized";
			
			String actRow2AuthorizationStatus = voucherGridRow2AuthorizationStatus.getText();
			String expRow2AuthorizationStatus = "Authorized";
			
			String actRow3AuthorizationStatus = voucherGridRow3AuthorizationStatus.getText();
			String expRow3AuthorizationStatus = "Pending";
			
			String actRow4AuthorizationStatus = voucherGridRow4AuthorizationStatus.getText();
			String expRow4AuthorizationStatus = "Authorized";
			
			System.out.println("Row1AuthorizationStatus  : "+actRow1AuthorizationStatus  +" Value Expected : "+expRow1AuthorizationStatus);
			System.out.println("Row2AuthorizationStatus  : "+actRow2AuthorizationStatus  +" Value Expected : "+expRow2AuthorizationStatus);
			System.out.println("Row3AuthorizationStatus  : "+actRow3AuthorizationStatus  +" Value Expected : "+expRow3AuthorizationStatus);
			System.out.println("Row4AuthorizationStatus  : "+actRow4AuthorizationStatus  +" Value Expected : "+expRow4AuthorizationStatus);
			
			if(actUserCantAuthorize.equalsIgnoreCase(expUserCantAuthorize) && actRow1AuthorizationStatus.equalsIgnoreCase(expRow1AuthorizationStatus) 
					&& actRow2AuthorizationStatus.equalsIgnoreCase(expRow2AuthorizationStatus) 
					&& actRow3AuthorizationStatus.equalsIgnoreCase(expRow3AuthorizationStatus)
					&& actRow4AuthorizationStatus.equalsIgnoreCase(expRow4AuthorizationStatus))
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
				homeCloseBtn.click();
    			Thread.sleep(2000);
				return true;
			}
			else
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
				homeCloseBtn.click();
    			Thread.sleep(2000);
				return false;
			}
		}
		
    	
    	
    	
    	
    	
    	
    	
    	public static boolean checkPurchasesVoucherNAuthorizationStatusWithSUAfterAuthorizationQuantityCondition() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
			financialsMenu.click();
					
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
			financialsTransactionMenu.click();
				
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
			financialsTransactionsPurchaseMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVoucherNew));
			purchaseVoucherNew.click();
			
			Thread.sleep(3000);
			
			int voucherGridDocNoCount = voucherGridDocNo.size();
			
			int actSavedVouchersCount = voucherGridDocNoCount-1;
			int expSavedVouchersCount = 4;
			
			
			String actRow1AuthorizationStatus = voucherGridRow1AuthorizationStatus.getText();
			String expRow1AuthorizationStatus = "Authorized";
			
			String actRow2AuthorizationStatus = voucherGridRow2AuthorizationStatus.getText();
			String expRow2AuthorizationStatus = "Authorized";
			
			String actRow3AuthorizationStatus = voucherGridRow3AuthorizationStatus.getText();
			String expRow3AuthorizationStatus = "Pending";
			
			String actRow4AuthorizationStatus = voucherGridRow4AuthorizationStatus.getText();
			String expRow4AuthorizationStatus = "Authorized";
			
			System.out.println("SavedVouchersCount       : "+actSavedVouchersCount       +" Value Expected : "+expSavedVouchersCount);
			System.out.println("Row1AuthorizationStatus  : "+actRow1AuthorizationStatus  +" Value Expected : "+expRow1AuthorizationStatus);
			System.out.println("Row2AuthorizationStatus  : "+actRow2AuthorizationStatus  +" Value Expected : "+expRow2AuthorizationStatus);
			System.out.println("Row3AuthorizationStatus  : "+actRow3AuthorizationStatus  +" Value Expected : "+expRow3AuthorizationStatus);
			System.out.println("Row4AuthorizationStatus  : "+actRow4AuthorizationStatus  +" Value Expected : "+expRow4AuthorizationStatus);
			
			if(actSavedVouchersCount==expSavedVouchersCount && actRow1AuthorizationStatus.equalsIgnoreCase(expRow1AuthorizationStatus)
					&& actRow2AuthorizationStatus.equalsIgnoreCase(expRow2AuthorizationStatus)
					&& actRow3AuthorizationStatus.equalsIgnoreCase(expRow3AuthorizationStatus)
					&& actRow4AuthorizationStatus.equalsIgnoreCase(expRow4AuthorizationStatus))
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
				homeCloseBtn.click();
    			Thread.sleep(2000);
				return true;
			}
			else
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
				homeCloseBtn.click();
    			Thread.sleep(2000);
				return false;
			}
		}
		
    	
    	
    	
    	
    	
    	
    	
    	
    	// With Warehouse Conditions
    	
    	public boolean 	checkTransactionAuthorizationGivingConditionsWithWarehouse() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
    	{
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsmenuBtn));
    		settingsmenuBtn.click();
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(transactionAuthorizationBtn));
    		transactionAuthorizationBtn.click();
    		
    		Thread.sleep(2000);
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNameDropdown));
    		documentNameDropdown.sendKeys(" ");
    		
    		Thread.sleep(1000);
    			
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchasevoucherExpandbutton));
    		purchasevoucherExpandbutton.click();
    	
            getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchasevoucherTypeCreatedVoucher));
    		purchasevoucherTypeCreatedVoucher.click();
    		
    		Thread.sleep(3000);
    				
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
    		nameTxt.click();
    		
    		nameTxt.sendKeys(Keys.SPACE);
    		
    		int namecount=tranAuthNameList.size();
			
			for(int i=0 ; i < namecount ;i++)
			{
				String data=tranAuthNameList.get(i).getText();
				
				if(data.equalsIgnoreCase("Purchase"))
				{
					tranAuthNameList.get(i).click();
					
					break;
				}
			}
				
    		nameTxt.sendKeys(Keys.TAB);
    			
    		Thread.sleep(3000);
    		
    		doubleClick(cnrBtn);
    		//getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(Level1editBtn));
    		//Level1editBtn.click();
    		
    		Thread.sleep(2000);
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(conditionNotRequiredChkBox));
    		
    		if(conditionNotRequiredChkBox.isSelected()==true)
    		{
    			System.out.println("============clicked----------");
    			conditionNotRequiredChkBox.click();
    		}
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(Row2TransAuthConditionDeleteBtn));
    		Row2TransAuthConditionDeleteBtn.click();
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(Row1TransAuthConditionDeleteBtn));
    		Row1TransAuthConditionDeleteBtn.click();
    		
    		Thread.sleep(2000);
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(Row1ConjunctionDropdown));
    		Select s1=new Select(Row1ConjunctionDropdown);
    		s1.selectByIndex(1);
    		
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(Row1SelectFieldTxt));
    		Row1SelectFieldTxt.click();
    		
    		Thread.sleep(2000);
    		
    		//getAction().moveToElement(selectFieldWarehouse).click().build().perform();
    		ClickUsingJs(selectFieldWarehouse);
    		Thread.sleep(1000);
    		
    		//getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(selectFieldWarehouseName));
    		//selectFieldWarehouseName.click();
    		ClickUsingJs(selectFieldWarehouseName);
    		
    		Thread.sleep(1000);
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(Row1SelectOperatorDropdown));
    		Select s2=new Select(Row1SelectOperatorDropdown);
    		s2.selectByIndex(1);
    		
    		Thread.sleep(1000);
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(Row1CompareWithDropdown));
    		Select s3=new Select(Row1CompareWithDropdown);
    		s3.selectByIndex(1);
    		
    		Thread.sleep(2000);
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(InputValueTxt));
    		InputValueTxt.sendKeys("Hyderabad");
    		Thread.sleep(2000);
    		InputValueTxt.sendKeys(Keys.TAB);
    		
    		Thread.sleep(2000);
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(definitionOkBtn));
    		definitionOkBtn.click();
    		
    		Thread.sleep(2000);
    		
    		//getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(Level2editBtn));
    		//Level2editBtn.click();
    		
    		doubleClick(Level2editBtn);
    		
    		Thread.sleep(2000);
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(conditionNotRequiredChkBox));
    		
    		if(conditionNotRequiredChkBox.isSelected())
    		{
    			conditionNotRequiredChkBox.click();
    		}
    		
    		Thread.sleep(2000);
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(Row1TransAuthConditionDeleteBtn));
    		Row1TransAuthConditionDeleteBtn.click();
    		
    		Thread.sleep(2000);
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(Row1ConjunctionDropdown));
    		Select s4=new Select(Row1ConjunctionDropdown);
    		s1.selectByIndex(1);
    		
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(Row1SelectFieldTxt));
    		Row1SelectFieldTxt.click();
    		
    		Thread.sleep(2000);
    		
    		//getAction().moveToElement(selectFieldWarehouse).click().build().perform();
    		ClickUsingJs(selectFieldWarehouse);
    		
    		Thread.sleep(1000);
    		
    		//getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(selectFieldWarehouseName));
    		//selectFieldWarehouseName.click();
    		ClickUsingJs(selectFieldWarehouseName);
    		
    		Thread.sleep(1000);
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(Row1SelectOperatorDropdown));
    		Select s5=new Select(Row1SelectOperatorDropdown);
    		s2.selectByIndex(1);
    		
    		Thread.sleep(1000);
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(Row1CompareWithDropdown));
    		Select s6=new Select(Row1CompareWithDropdown);
    		s3.selectByIndex(1);
    		
    		Thread.sleep(2000);
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(InputValueTxt));
    		InputValueTxt.sendKeys("Secunderabad");
    		Thread.sleep(2000);
    		InputValueTxt.sendKeys(Keys.TAB);
    		
    		Thread.sleep(2000);
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(definitionOkBtn));
    		definitionOkBtn.click();
    		
    		Thread.sleep(2000);
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(tranAuthSaveBtn));
    		tranAuthSaveBtn.click();
    		
    		String expValidationMsg = "Authorization Flow saved successfully.";
    		String actValidationMsg = checkValidationMessage(expValidationMsg);
    		
    		System.out.println("Validation Message : "+actValidationMsg+"  Value Expected : "+expValidationMsg);
    		
    		if(actValidationMsg.equalsIgnoreCase(expValidationMsg))
    		{
    			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(tranAuthCancelBtn));
    			tranAuthCancelBtn.click();
    			return true;
    		}
    		else
    		{
    			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(tranAuthCancelBtn));
    			tranAuthCancelBtn.click();
    			return false;
    		}
    	}
    	
		
		
    	
    	
    	
    	
    	
    	public static boolean checkSavingPurchaseVoucherN1WithWarehouseAsMumbai() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			System.out.println("***************************checkSavingPurchaseVoucherN1WithWarehouseAsMumbai*********************************");
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
			financialsMenu.click();
					
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
			financialsTransactionMenu.click();
				
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
			financialsTransactionsPurchaseMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVoucherNew));
			purchaseVoucherNew.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
			newBtn.click();
			
			checkValidationMessage("Screen opened");
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseAccountTxt));
			purchaseAccountTxt.click();
			purchaseAccountTxt.sendKeys("Purchase");
			
			Thread.sleep(2000);
			
			purchaseAccountTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
			vendorAccountTxt.click();
			vendorAccountTxt.sendKeys("Vendor A");
			
			Thread.sleep(2000);
			
			vendorAccountTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
			departmentTxt.click();
			departmentTxt.sendKeys("INDIA");
			
			Thread.sleep(2000);
			
			departmentTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(wareHouseTxt));
			wareHouseTxt.click();
			wareHouseTxt.sendKeys("MUMBAI");
			
			Thread.sleep(2000);
			
			wareHouseTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
			select1stRow_1stColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
			enter_ItemTxt.sendKeys("BR COGS ITEM");
			Thread.sleep(3000);
			enter_ItemTxt.sendKeys(Keys.TAB);
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_5thColumn));
			select1stRow_5thColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
			enter_Quantity.sendKeys("0.5");
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_7thColumn));
			select1stRow_7thColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
			enter_Rate.sendKeys(Keys.END);
			enter_Rate.sendKeys(Keys.SHIFT, Keys.HOME);
			enter_Rate.sendKeys(Keys.BACK_SPACE);
			enter_Rate.sendKeys("10");
			enter_Rate.sendKeys(Keys.TAB);
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
			saveBtn.click();
			
			Thread.sleep(3000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
			billRefPickIcon.click();
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
			billRefOkBtn.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(errorMessage));
			
			String expMessage1= "Voucher saved successfully";
			String expMessage2= ": 1";
			
			String actMessage = checkValidationMessage(expMessage1);
			
		   System.out.println("SavingMessage  :  "+actMessage +" Value Expected : "+expMessage1+" "+expMessage2);
	
		   if(actMessage.startsWith(expMessage1) && actMessage.endsWith(expMessage2))
    		{
    			return true;
    		}
    		else
    		{
    			return false;
    		}
    	}
		
		
		
		
		
		
		public static boolean checkSavingPurchaseVoucherN2WithWarehouseAsHyderabad() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			System.out.println("**********************checkSavingPurchaseVoucherN2WithWarehouseAsHyderabad*************************");
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseAccountTxt));
			purchaseAccountTxt.click();
			purchaseAccountTxt.sendKeys("Purchase");
			
			Thread.sleep(2000);
			
			purchaseAccountTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
			vendorAccountTxt.click();
			vendorAccountTxt.sendKeys("Vendor A");
			
			Thread.sleep(2000);
			
			vendorAccountTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
			departmentTxt.click();
			departmentTxt.sendKeys("INDIA");
			
			Thread.sleep(2000);
			
			departmentTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(wareHouseTxt));
			wareHouseTxt.click();
			wareHouseTxt.sendKeys("HYDERABAD");
			
			Thread.sleep(2000);
			
			wareHouseTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
			select1stRow_1stColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
			enter_ItemTxt.sendKeys("BR COGS ITEM");
			Thread.sleep(3000);
			enter_ItemTxt.sendKeys(Keys.TAB);
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_5thColumn));
			select1stRow_5thColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
			enter_Quantity.sendKeys("1");
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_7thColumn));
			select1stRow_7thColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
			enter_Rate.sendKeys(Keys.END);
			enter_Rate.sendKeys(Keys.SHIFT, Keys.HOME);
			enter_Rate.sendKeys(Keys.BACK_SPACE);
			enter_Rate.sendKeys("10");
			enter_Rate.sendKeys(Keys.TAB);
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
			saveBtn.click();
			
			Thread.sleep(3000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
			billRefPickIcon.click();
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
			billRefOkBtn.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(errorMessage));
			
			String expMessage1= "Voucher saved successfully";
			String expMessage2= ": 2";
			
			String actMessage = checkValidationMessage(expMessage1);
			
		   System.out.println("SavingMessage  :  "+actMessage +" Value Expected : "+expMessage1+" "+expMessage2);
	
		   if(actMessage.startsWith(expMessage1) && actMessage.endsWith(expMessage2))
    		{
    			return true;
    		}
    		else
    		{
    			return false;
    		}
    	}
    	
    	
    	
		
		
		
		public static boolean checkSavingPurchaseVoucherN3WithWarehouseAsHyderabad() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			System.out.println("**********************checkSavingPurchaseVoucherN3WithWarehouseAsHyderabad*************************");
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseAccountTxt));
			purchaseAccountTxt.click();
			purchaseAccountTxt.sendKeys("Purchase");
			
			Thread.sleep(2000);
			
			purchaseAccountTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
			vendorAccountTxt.click();
			vendorAccountTxt.sendKeys("Vendor A");
			
			Thread.sleep(2000);
			
			vendorAccountTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
			departmentTxt.click();
			departmentTxt.sendKeys("INDIA");
			
			Thread.sleep(2000);
			
			departmentTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(wareHouseTxt));
			wareHouseTxt.click();
			wareHouseTxt.sendKeys("HYDERABAD");
			
			Thread.sleep(2000);
			
			wareHouseTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
			select1stRow_1stColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
			enter_ItemTxt.sendKeys("BR COGS ITEM");
			Thread.sleep(3000);
			enter_ItemTxt.sendKeys(Keys.TAB);
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_5thColumn));
			select1stRow_5thColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
			enter_Quantity.sendKeys("1");
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_7thColumn));
			select1stRow_7thColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
			enter_Rate.sendKeys(Keys.END);
			enter_Rate.sendKeys(Keys.SHIFT, Keys.HOME);
			enter_Rate.sendKeys(Keys.BACK_SPACE);
			enter_Rate.sendKeys("10");
			enter_Rate.sendKeys(Keys.TAB);
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
			saveBtn.click();
			
			Thread.sleep(3000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
			billRefPickIcon.click();
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
			billRefOkBtn.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(errorMessage));
			
			String expMessage1= "Voucher saved successfully";
			String expMessage2= ": 3";
			
			String actMessage = checkValidationMessage(expMessage1);
			
		   System.out.println("SavingMessage  :  "+actMessage +" Value Expected : "+expMessage1+" "+expMessage2);
	
		   if(actMessage.startsWith(expMessage1) && actMessage.endsWith(expMessage2))
    		{
    			return true;
    		}
    		else
    		{
    			return false;
    		}
    	}
    	
		
		
		
		
		
		public static boolean checkSavingPurchaseVoucherN4WithWarehouseAsSecunderabad() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			System.out.println("**********************checkSavingPurchaseVoucherN4WithWarehouseAsSecunderabad*************************");
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseAccountTxt));
			purchaseAccountTxt.click();
			purchaseAccountTxt.sendKeys("Purchase");
			
			Thread.sleep(2000);
			
			purchaseAccountTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
			vendorAccountTxt.click();
			vendorAccountTxt.sendKeys("Vendor A");
			
			Thread.sleep(2000);
			
			vendorAccountTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
			departmentTxt.click();
			departmentTxt.sendKeys("INDIA");
			
			Thread.sleep(2000);
			
			departmentTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(wareHouseTxt));
			wareHouseTxt.click();
			wareHouseTxt.sendKeys("Secunderabad");
			
			Thread.sleep(2000);
			
			wareHouseTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
			select1stRow_1stColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
			enter_ItemTxt.sendKeys("BR COGS ITEM");
			Thread.sleep(3000);
			enter_ItemTxt.sendKeys(Keys.TAB);
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_5thColumn));
			select1stRow_5thColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
			enter_Quantity.sendKeys("2");
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_7thColumn));
			select1stRow_7thColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
			enter_Rate.sendKeys(Keys.END);
			enter_Rate.sendKeys(Keys.SHIFT, Keys.HOME);
			enter_Rate.sendKeys(Keys.BACK_SPACE);
			enter_Rate.sendKeys("10");
			enter_Rate.sendKeys(Keys.TAB);
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
			saveBtn.click();
			
			Thread.sleep(3000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
			billRefPickIcon.click();
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
			billRefOkBtn.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(errorMessage));
			
			String expMessage1= "Voucher saved successfully";
			String expMessage2= ": 4";
			
			String actMessage = checkValidationMessage(expMessage1);
		   
		   System.out.println("SavingMessage  :  "+actMessage +" Value Expected : "+expMessage1+" "+expMessage2);
	
		   if(actMessage.startsWith(expMessage1) && actMessage.endsWith(expMessage2))
    		{
    			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
    			new_CloseBtn.click();
    			Thread.sleep(2000);
    			return true;
    		}
    		else
    		{
    			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
    			new_CloseBtn.click();
    			Thread.sleep(2000);
    			return false;
    		}
    	}
    	
    	
    	
    	
    	
    	
    	
		public boolean checkAuthorizationStatusInVoucherHomePageWithWarehouseConditions() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
    		System.out.println("**********************checkAuthorizationStatusInVoucherHomePageWithWarehouseConditions***********************");
    		
			int voucherGridDocNoCount = voucherGridDocNo.size();
			
			int actSavedVouchersCount = voucherGridDocNoCount-1;
			int expSavedVouchersCount = 4;
			
			String actRow1AuthorizationStatus = voucherGridRow1AuthorizationStatus.getText();
			String expRow1AuthorizationStatus = "Pending";
			
			String actRow2AuthorizationStatus = voucherGridRow2AuthorizationStatus.getText();
			String expRow2AuthorizationStatus = "Pending";
			
			String actRow3AuthorizationStatus = voucherGridRow3AuthorizationStatus.getText();
			String expRow3AuthorizationStatus = "Pending";
			
			String actRow4AuthorizationStatus = voucherGridRow4AuthorizationStatus.getText();
			String expRow4AuthorizationStatus = "Authorized";
			
			System.out.println("SavedVouchersCount       : "+actSavedVouchersCount       +" Value Expected : "+expSavedVouchersCount);
			System.out.println("Row1AuthorizationStatus  : "+actRow1AuthorizationStatus  +" Value Expected : "+expRow1AuthorizationStatus);
			System.out.println("Row2AuthorizationStatus  : "+actRow2AuthorizationStatus  +" Value Expected : "+expRow2AuthorizationStatus);
			System.out.println("Row3AuthorizationStatus  : "+actRow3AuthorizationStatus  +" Value Expected : "+expRow3AuthorizationStatus);
			System.out.println("Row4AuthorizationStatus  : "+actRow4AuthorizationStatus  +" Value Expected : "+expRow4AuthorizationStatus);
			
			if(actSavedVouchersCount==expSavedVouchersCount && actRow1AuthorizationStatus.equalsIgnoreCase(expRow1AuthorizationStatus)
					&& actRow2AuthorizationStatus.equalsIgnoreCase(expRow2AuthorizationStatus)
					&& actRow3AuthorizationStatus.equalsIgnoreCase(expRow3AuthorizationStatus)
					&& actRow4AuthorizationStatus.equalsIgnoreCase(expRow4AuthorizationStatus))
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
				homeCloseBtn.click();
    			Thread.sleep(2000);
				return true;
			}
			else
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
				homeCloseBtn.click();
    			Thread.sleep(2000);
				return false;
			}
		}
			
			
		
		
		
		
		
		
    	public static boolean checkPurchasesVoucherNAuthorizationStatusWithUserAllOptionsAndWarehouseCondition() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
			financialsMenu.click();
					
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
			financialsTransactionMenu.click();
				
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
			financialsTransactionsPurchaseMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVoucherNew));
			purchaseVoucherNew.click();
			
			Thread.sleep(3000);
			
			int voucherGridDocNoCount = voucherGridDocNo.size();
			
			int actSavedVouchersCount = voucherGridDocNoCount-1;
			int expSavedVouchersCount = 4;
			
			String actRow1AuthorizationStatus = voucherGridRow1AuthorizationStatus.getText();
			String expRow1AuthorizationStatus = "Pending";
			
			String actRow2AuthorizationStatus = voucherGridRow2AuthorizationStatus.getText();
			String expRow2AuthorizationStatus = "Pending";
			
			String actRow3AuthorizationStatus = voucherGridRow3AuthorizationStatus.getText();
			String expRow3AuthorizationStatus = "Pending";
			
			String actRow4AuthorizationStatus = voucherGridRow4AuthorizationStatus.getText();
			String expRow4AuthorizationStatus = "Authorized";
			
			System.out.println("SavedVouchersCount       : "+actSavedVouchersCount       +" Value Expected : "+expSavedVouchersCount);
			System.out.println("Row1AuthorizationStatus  : "+actRow1AuthorizationStatus  +" Value Expected : "+expRow1AuthorizationStatus);
			System.out.println("Row2AuthorizationStatus  : "+actRow2AuthorizationStatus  +" Value Expected : "+expRow2AuthorizationStatus);
			System.out.println("Row3AuthorizationStatus  : "+actRow3AuthorizationStatus  +" Value Expected : "+expRow3AuthorizationStatus);
			System.out.println("Row4AuthorizationStatus  : "+actRow4AuthorizationStatus  +" Value Expected : "+expRow4AuthorizationStatus);
			
			if(actSavedVouchersCount==expSavedVouchersCount && actRow1AuthorizationStatus.equalsIgnoreCase(expRow1AuthorizationStatus)
					&& actRow2AuthorizationStatus.equalsIgnoreCase(expRow2AuthorizationStatus)
					&& actRow3AuthorizationStatus.equalsIgnoreCase(expRow3AuthorizationStatus)
					&& actRow4AuthorizationStatus.equalsIgnoreCase(expRow4AuthorizationStatus))
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		
		
    	
    	
    	
    	
    	
    	public static boolean checkPurchasesVoucherNAuthorizaingWithUserAllOptionsAndWarehouseConditionOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));

    		int voucherGridDocNoCount = voucherGridDocNo.size();

    		for(int i=0;i<voucherGridDocNoCount;i++)
    		{
    			String data = voucherGridDocNo.get(i).getText();

    			if(data.equalsIgnoreCase("4"))
    			{
    				if (voucherGridIndexChkBox.get(i).isSelected()==false) 
    				{
    					voucherGridIndexChkBox.get(i).click();
    					break;
    				}
    			}
    		}

    		Thread.sleep(2000);
    		
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(authorizeBtn));
			authorizeBtn.click();
			
			String expUserCantAuthorize = "User can not authorize";
			String actUserCantAuthorize = checkValidationMessage(expUserCantAuthorize);
			
			Thread.sleep(2000);
			
			for(int i=0;i<voucherGridDocNoCount;i++)
    		{
    			String data = voucherGridDocNo.get(i).getText();

    			if(data.equalsIgnoreCase("4"))
    			{
    				if (voucherGridIndexChkBox.get(i).isSelected()==true) 
    				{
    					voucherGridIndexChkBox.get(i).click();
    				}
    			}
    			
    			if(data.equalsIgnoreCase("3"))
    			{
    				if (voucherGridIndexChkBox.get(i).isSelected()==false) 
    				{
    					voucherGridIndexChkBox.get(i).click();
    				}
    			}
    		}

    		Thread.sleep(2000);
			
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(authorizeBtn));
			authorizeBtn.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(authorizePopupOkBtn));
			authorizePopupOkBtn.click();
			
			Thread.sleep(2000);
			click(homePageVoucherArrowBtn);
			Thread.sleep(1000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homePageAllVouchersView));
			homePageAllVouchersView.click();
			
			Thread.sleep(2000);
			
			String actRow1AuthorizationStatus = voucherGridRow1AuthorizationStatus.getText();
			String expRow1AuthorizationStatus = "Pending";
			
			String actRow2AuthorizationStatus = voucherGridRow2AuthorizationStatus.getText();
			String expRow2AuthorizationStatus = "Authorized";
			
			String actRow3AuthorizationStatus = voucherGridRow3AuthorizationStatus.getText();
			String expRow3AuthorizationStatus = "Pending";
			
			String actRow4AuthorizationStatus = voucherGridRow4AuthorizationStatus.getText();
			String expRow4AuthorizationStatus = "Authorized";
			
			System.out.println("Row1AuthorizationStatus  : "+actRow1AuthorizationStatus  +" Value Expected : "+expRow1AuthorizationStatus);
			System.out.println("Row2AuthorizationStatus  : "+actRow2AuthorizationStatus  +" Value Expected : "+expRow2AuthorizationStatus);
			System.out.println("Row3AuthorizationStatus  : "+actRow3AuthorizationStatus  +" Value Expected : "+expRow3AuthorizationStatus);
			System.out.println("Row4AuthorizationStatus  : "+actRow4AuthorizationStatus  +" Value Expected : "+expRow4AuthorizationStatus);
			
			if(actUserCantAuthorize.equalsIgnoreCase(expUserCantAuthorize) && actRow1AuthorizationStatus.equalsIgnoreCase(expRow1AuthorizationStatus)
					&& actRow2AuthorizationStatus.equalsIgnoreCase(expRow2AuthorizationStatus) && actRow3AuthorizationStatus.equalsIgnoreCase(expRow3AuthorizationStatus)
					&& actRow4AuthorizationStatus.equalsIgnoreCase(expRow4AuthorizationStatus))
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
				homeCloseBtn.click();
    			Thread.sleep(2000);
				return true;
			}
			else
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
				homeCloseBtn.click();
    			Thread.sleep(2000);
				return false;
			}
		}
		
		
		
		
		
		
		
    	
    	public static boolean checkPurchasesVoucherNAuthorizationStatusWithUserTransactionAuthorizationAndWarehouseCondition() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
			financialsMenu.click();
					
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
			financialsTransactionMenu.click();
				
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
			financialsTransactionsPurchaseMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVoucherNew));
			purchaseVoucherNew.click();
			
			Thread.sleep(3000);
			
			int voucherGridDocNoCount = voucherGridDocNo.size();
			
			int actSavedVouchersCount = voucherGridDocNoCount-1;
			int expSavedVouchersCount = 4;
			
			
			String actRow1AuthorizationStatus = voucherGridRow1AuthorizationStatus.getText();
			String expRow1AuthorizationStatus = "Pending";
			
			String actRow2AuthorizationStatus = voucherGridRow2AuthorizationStatus.getText();
			String expRow2AuthorizationStatus = "Authorized";
			
			String actRow3AuthorizationStatus = voucherGridRow3AuthorizationStatus.getText();
			String expRow3AuthorizationStatus = "Pending";
			
			String actRow4AuthorizationStatus = voucherGridRow4AuthorizationStatus.getText();
			String expRow4AuthorizationStatus = "Authorized";
			
			System.out.println("SavedVouchersCount       : "+actSavedVouchersCount       +" Value Expected : "+expSavedVouchersCount);
			System.out.println("Row1AuthorizationStatus  : "+actRow1AuthorizationStatus  +" Value Expected : "+expRow1AuthorizationStatus);
			System.out.println("Row2AuthorizationStatus  : "+actRow2AuthorizationStatus  +" Value Expected : "+expRow2AuthorizationStatus);
			System.out.println("Row3AuthorizationStatus  : "+actRow3AuthorizationStatus  +" Value Expected : "+expRow3AuthorizationStatus);
			System.out.println("Row4AuthorizationStatus  : "+actRow4AuthorizationStatus  +" Value Expected : "+expRow4AuthorizationStatus);
			
			if(actSavedVouchersCount==expSavedVouchersCount && actRow1AuthorizationStatus.equalsIgnoreCase(expRow1AuthorizationStatus)
					&& actRow2AuthorizationStatus.equalsIgnoreCase(expRow2AuthorizationStatus)
					&& actRow3AuthorizationStatus.equalsIgnoreCase(expRow3AuthorizationStatus)
					&& actRow4AuthorizationStatus.equalsIgnoreCase(expRow4AuthorizationStatus))
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		
		
    	
    	
    	
    	
    	
    	public static boolean checkPurchasesVoucherNAuthorizaingWithUserTransactionAuthorizationAndWarehouseConditionOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));

    		int voucherGridDocNoCount = voucherGridDocNo.size();

    		for(int i=0;i<voucherGridDocNoCount;i++)
    		{
    			String data = voucherGridDocNo.get(i).getText();

    			if(data.equalsIgnoreCase("2"))
    			{
    				if (voucherGridIndexChkBox.get(i).isSelected()==false) 
    				{
    					voucherGridIndexChkBox.get(i).click();
    					break;
    				}
    			}
    		}

    		Thread.sleep(2000);
    		
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(authorizeBtn));
			authorizeBtn.click();
			
			String expUserCantAuthorize = "User can not authorize";
			String actUserCantAuthorize = checkValidationMessage(expUserCantAuthorize);
			
			Thread.sleep(2000);
			
			for(int i=0;i<voucherGridDocNoCount;i++)
    		{
    			String data = voucherGridDocNo.get(i).getText();

    			if(data.equalsIgnoreCase("2"))
    			{
    				if (voucherGridIndexChkBox.get(i).isSelected()==true) 
    				{
    					voucherGridIndexChkBox.get(i).click();
    				}
    			}
    			
    			if(data.equalsIgnoreCase("4"))
    			{
    				if (voucherGridIndexChkBox.get(i).isSelected()==false) 
    				{
    					voucherGridIndexChkBox.get(i).click();
    				}
    			}
    		}

    		Thread.sleep(2000);
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(authorizeBtn));
			authorizeBtn.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(authorizePopupOkBtn));
			authorizePopupOkBtn.click();
			
			Thread.sleep(2000);
			click(homePageVoucherArrowBtn);
			Thread.sleep(1000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homePageAllVouchersView));
			homePageAllVouchersView.click();
			
			Thread.sleep(2000);
			
			String actRow1AuthorizationStatus = voucherGridRow1AuthorizationStatus.getText();
			String expRow1AuthorizationStatus = "Authorized";
			
			String actRow2AuthorizationStatus = voucherGridRow2AuthorizationStatus.getText();
			String expRow2AuthorizationStatus = "Authorized";
			
			String actRow3AuthorizationStatus = voucherGridRow3AuthorizationStatus.getText();
			String expRow3AuthorizationStatus = "Pending";
			
			String actRow4AuthorizationStatus = voucherGridRow4AuthorizationStatus.getText();
			String expRow4AuthorizationStatus = "Authorized";
			
			System.out.println("Row1AuthorizationStatus  : "+actRow1AuthorizationStatus  +" Value Expected : "+expRow1AuthorizationStatus);
			System.out.println("Row2AuthorizationStatus  : "+actRow2AuthorizationStatus  +" Value Expected : "+expRow2AuthorizationStatus);
			System.out.println("Row3AuthorizationStatus  : "+actRow3AuthorizationStatus  +" Value Expected : "+expRow3AuthorizationStatus);
			System.out.println("Row4AuthorizationStatus  : "+actRow4AuthorizationStatus  +" Value Expected : "+expRow4AuthorizationStatus);
			
			if(actUserCantAuthorize.equalsIgnoreCase(expUserCantAuthorize) && actRow1AuthorizationStatus.equalsIgnoreCase(expRow1AuthorizationStatus) 
					&& actRow2AuthorizationStatus.equalsIgnoreCase(expRow2AuthorizationStatus) 
					&& actRow3AuthorizationStatus.equalsIgnoreCase(expRow3AuthorizationStatus)
					&& actRow4AuthorizationStatus.equalsIgnoreCase(expRow4AuthorizationStatus))
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
				homeCloseBtn.click();
    			Thread.sleep(2000);
				return true;
			}
			else
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
				homeCloseBtn.click();
    			Thread.sleep(2000);
				return false;
			}
		}
		
    	
    	
    	
    	
    	
    	
    	
    	public static boolean checkPurchasesVoucherNAuthorizationStatusWithSUAfterAuthorizationWarehouseCondition() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
			financialsMenu.click();
					
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
			financialsTransactionMenu.click();
				
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
			financialsTransactionsPurchaseMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVoucherNew));
			purchaseVoucherNew.click();
			
			Thread.sleep(3000);
			
			int voucherGridDocNoCount = voucherGridDocNo.size();
			
			int actSavedVouchersCount = voucherGridDocNoCount-1;
			int expSavedVouchersCount = 4;
			
			
			String actRow1AuthorizationStatus = voucherGridRow1AuthorizationStatus.getText();
			String expRow1AuthorizationStatus = "Authorized";
			
			String actRow2AuthorizationStatus = voucherGridRow2AuthorizationStatus.getText();
			String expRow2AuthorizationStatus = "Authorized";
			
			String actRow3AuthorizationStatus = voucherGridRow3AuthorizationStatus.getText();
			String expRow3AuthorizationStatus = "Pending";
			
			String actRow4AuthorizationStatus = voucherGridRow4AuthorizationStatus.getText();
			String expRow4AuthorizationStatus = "Authorized";
			
			System.out.println("SavedVouchersCount       : "+actSavedVouchersCount       +" Value Expected : "+expSavedVouchersCount);
			System.out.println("Row1AuthorizationStatus  : "+actRow1AuthorizationStatus  +" Value Expected : "+expRow1AuthorizationStatus);
			System.out.println("Row2AuthorizationStatus  : "+actRow2AuthorizationStatus  +" Value Expected : "+expRow2AuthorizationStatus);
			System.out.println("Row3AuthorizationStatus  : "+actRow3AuthorizationStatus  +" Value Expected : "+expRow3AuthorizationStatus);
			System.out.println("Row4AuthorizationStatus  : "+actRow4AuthorizationStatus  +" Value Expected : "+expRow4AuthorizationStatus);
			
			if(actSavedVouchersCount==expSavedVouchersCount && actRow1AuthorizationStatus.equalsIgnoreCase(expRow1AuthorizationStatus)
					&& actRow2AuthorizationStatus.equalsIgnoreCase(expRow2AuthorizationStatus)
					&& actRow3AuthorizationStatus.equalsIgnoreCase(expRow3AuthorizationStatus)
					&& actRow4AuthorizationStatus.equalsIgnoreCase(expRow4AuthorizationStatus))
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
				homeCloseBtn.click();
    			Thread.sleep(2000);
				return true;
			}
			else
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
				homeCloseBtn.click();
    			Thread.sleep(2000);
				return false;
			}
		}
		
		
    	
		
		
		
		
		
		
		// Escalation
		
		
		
		public boolean 	checkTransactionAuthorizationAddingEscalationWithTimeLimit1DayAndEscalationTypeApproved() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
    	{
			System.out.println("***************************checkTransactionAuthorizationAddingEscalationWithTimeLimit1DayAndEscalationTypeApproved*****************************");
			
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsmenuBtn));
    		settingsmenuBtn.click();
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(transactionAuthorizationBtn));
    		transactionAuthorizationBtn.click();
    		
    		Thread.sleep(2000);
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNameDropdown));
    		documentNameDropdown.sendKeys(" ");
    		
    		Thread.sleep(1000);
    			
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchasevoucherExpandbutton));
    		purchasevoucherExpandbutton.click();
    	
            getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchasevoucherTypeCreatedVoucher));
    		purchasevoucherTypeCreatedVoucher.click();
    		
    		Thread.sleep(3000);
    				
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
    		nameTxt.click();
    		
    		nameTxt.sendKeys(Keys.SPACE);
    		
    		int namecount=tranAuthNameList.size();
			
			for(int i=0 ; i < namecount ;i++)
			{
				String data=tranAuthNameList.get(i).getText();
				
				if(data.equalsIgnoreCase("Purchase"))
				{
					tranAuthNameList.get(i).click();
					
					break;
				}
			}
				
    		nameTxt.sendKeys(Keys.TAB);
    			
    		Thread.sleep(3000);
    		
    		click(cnrBtn);
    		Thread.sleep(1000);
    		ClickUsingJs(Level1editBtn);
    		Thread.sleep(1000);
    		
    		
    		//getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(Level1editBtn));
    		//Level1editBtn.click();
    		
    		Thread.sleep(2000);
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(alertsTab));
    		alertsTab.click();
    		
    		Thread.sleep(1000);
    		
    		String alertColumnTxt = alertTabRow1AlertTxt.getText();
    		
    		System.err.println("Alert Column Txt : "+alertColumnTxt);
    		
    		String expTemplateSaveMessage = null;
    		String actTemplateSaveMessage = null;
    		
    		if (alertColumnTxt.equalsIgnoreCase(" ")) 
    		{
    			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(alertTabAlertHeadingLink));
    			alertTabAlertHeadingLink.click();
    			
    			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customizeTemplateTemplatestxt));
    			customizeTemplateTemplatestxt.sendKeys("createAlertsTemplate");
    			Thread.sleep(2000);
    			customizeTemplateTemplatestxt.sendKeys(Keys.TAB);
    			
    			Thread.sleep(1000);
    			
    			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customizeTemplateSaveBtn));
    			customizeTemplateSaveBtn.click();
    			
    			expTemplateSaveMessage = "Template saved successfully";
    			actTemplateSaveMessage = checkValidationMessage(expTemplateSaveMessage);
    			
    			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customizeTemplateCloseBtn));
    			customizeTemplateCloseBtn.click();
			}
    		
			System.out.println("Template Saved Message : "+actTemplateSaveMessage+"  Value Expected  "+expTemplateSaveMessage);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(alertTabRow1AlertTxt));
			alertTabRow1AlertTxt.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(alertTabRow1AlertDrpdwn));
			Select alert = new Select(alertTabRow1AlertDrpdwn);
			
			String actAlertSelected = alert.getFirstSelectedOption().getText();
			String expAlertSelected = "createAlertsTemplate";
			
			System.out.println("Alert Selected : "+actAlertSelected+"  Value Expected  "+expAlertSelected);
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(escalationTab));
			escalationTab.click();
			
			Thread.sleep(1000);
			
			if (EscalationLevelText.isDisplayed()==true) 
			{
				System.out.println("Escalation Level is Already Added");
			}
			else 
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(escalationLevelAddBtn));
				escalationLevelAddBtn.click();
			}
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(TimelimitTxt1));
			TimelimitTxt1.click();
			TimelimitTxt1.sendKeys(Keys.END);
			TimelimitTxt1.sendKeys(Keys.SHIFT, Keys.HOME);
			TimelimitTxt1.sendKeys("1");
			
			Thread.sleep(1000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(timelimitDropdown1));
			Select time = new Select(timelimitDropdown1);
			time.selectByVisibleText("Days");
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(EscalationType1));
			Select escalationType = new Select(EscalationType1);
			escalationType.selectByVisibleText("Approved");
				
			Thread.sleep(2000);
			
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(definitionOkBtn));
    		definitionOkBtn.click();
    		
    		Thread.sleep(2000);
    		
    		//getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(tranAuthSaveBtn));
    		//tranAuthSaveBtn.click();
    		
    		String expValidationMsg = "Authorization Flow saved successfully.";
    		
    		String actValidationMsg = checkValidationMessage(expValidationMsg);
    		
    		
    		if(actAlertSelected.equalsIgnoreCase(expAlertSelected) && actValidationMsg.equalsIgnoreCase(expValidationMsg))
    		{
    			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(tranAuthCancelBtn));
    			tranAuthCancelBtn.click();
    			return true;
    		}
    		else
    		{
    			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(tranAuthCancelBtn));
    			tranAuthCancelBtn.click();
    			return false;
    		}
    	}
		
		
		
		
		
		
		
		
		public static boolean checkSavingPurchaseVoucherNWithCurrentDateForEscalationTimeLimit1DayAndTypeApproved() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			 System.out.println("************************checkSavingPurchaseVoucherNWithCurrentDateForEscalationTimeLimit1DayAndTypeApproved*****************************");
			 
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
			financialsMenu.click();
					
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
			financialsTransactionMenu.click();
				
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
			financialsTransactionsPurchaseMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVoucherNew));
			purchaseVoucherNew.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
			newBtn.click();
			
			checkValidationMessage("Screen opened");
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseAccountTxt));
			purchaseAccountTxt.click();
			purchaseAccountTxt.sendKeys("Purchase");
			
			Thread.sleep(2000);
			
			purchaseAccountTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
			vendorAccountTxt.click();
			vendorAccountTxt.sendKeys("Vendor A");
			
			Thread.sleep(2000);
			
			vendorAccountTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
			departmentTxt.click();
			departmentTxt.sendKeys("INDIA");
			
			Thread.sleep(2000);
			
			departmentTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(wareHouseTxt));
			wareHouseTxt.click();
			wareHouseTxt.sendKeys("HYDERABAD");
			
			Thread.sleep(2000);
			
			wareHouseTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
			select1stRow_1stColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
			enter_ItemTxt.sendKeys("BR COGS ITEM");
			Thread.sleep(3000);
			enter_ItemTxt.sendKeys(Keys.TAB);
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_5thColumn));
			select1stRow_5thColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
			enter_Quantity.sendKeys("1");
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_7thColumn));
			select1stRow_7thColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
			enter_Rate.sendKeys(Keys.END);
			enter_Rate.sendKeys(Keys.SHIFT, Keys.HOME);
			enter_Rate.sendKeys(Keys.BACK_SPACE);
			enter_Rate.sendKeys("10");
			enter_Rate.sendKeys(Keys.TAB);
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
			saveBtn.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
			billRefPickIcon.click();
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
			billRefOkBtn.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(errorMessage));
			
			String expMessage1= "Voucher saved successfully";
			String expMessage2= ": 1";
			
			String actMessage = checkValidationMessage(expMessage1);
			
		   System.out.println("SavingMessage  :  "+actMessage +" Value Expected : "+expMessage1+" "+expMessage2);
	
		   if(actMessage.startsWith(expMessage1) && actMessage.endsWith(expMessage2))
    		{
    			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
    			new_CloseBtn.click();
    			Thread.sleep(2000);
    			return true;
    		}
    		else
    		{
    			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
    			new_CloseBtn.click();
    			Thread.sleep(2000);
    			return false;
    		}
    	}
		
		
		
		
		
		
		
		public boolean checkAuthorizationStatusInVoucherHomePageWithCurrentDateForEscalationTimeLimit1DayAndTypeApproved() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			System.out.println("*******************checkAuthorizationStatusInVoucherHomePageWithCurrentDateForEscalationTimeLimit1DayAndTypeApproved*****************");
			
			int voucherGridDocNoCount = voucherGridDocNo.size();
			
			int actSavedVouchersCount = voucherGridDocNoCount-1;
			int expSavedVouchersCount = 1;
			
			String actAuthorizationStatus = voucherGridRow1AuthorizationStatus.getText();
			String expAuthorizationStatus = "Pending";
			
			System.out.println("SavedVouchersCount   : "+actSavedVouchersCount   +" Value Expected : "+expSavedVouchersCount);
			System.out.println("AuthorizationStatus  : "+actAuthorizationStatus  +" Value Expected : "+expAuthorizationStatus);
			
			if(actSavedVouchersCount==expSavedVouchersCount && actAuthorizationStatus.equalsIgnoreCase(expAuthorizationStatus))
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
				homeCloseBtn.click();
    			Thread.sleep(1000);
				return true;
			}
			else
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
				homeCloseBtn.click();
    			Thread.sleep(1000);
				return false;
			}
		}
		
		
		
		
		
		
		
    	public static boolean checkPurchasesVoucherNAuthorizationStatusWithUserAllOptionsAndWithCurrentDateForEscalationTimeLimit1DayAndTypeApproved() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
    		System.out.println("*****************checkPurchasesVoucherNAuthorizationStatusWithUserAllOptionsAndWithCurrentDateForEscalationTimeLimit1DayAndTypeApproved******************");
    		
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
			financialsMenu.click();
					
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
			financialsTransactionMenu.click();
				
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
			financialsTransactionsPurchaseMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVoucherNew));
			purchaseVoucherNew.click();
			
			Thread.sleep(3000);
			
			int voucherGridDocNoCount = voucherGridDocNo.size();
			
			int actSavedVouchersCount = voucherGridDocNoCount-1;
			int expSavedVouchersCount = 1;
			
			String actAuthorizationStatus = voucherGridRow1AuthorizationStatus.getText();
			String expAuthorizationStatus = "Pending";
			
			Thread.sleep(2000);
			
			System.out.println("SavedVouchersCount        : "+actSavedVouchersCount        +" Value Expected : "+expSavedVouchersCount);
			System.out.println("AuthorizationStatus       : "+actAuthorizationStatus       +" Value Expected : "+expAuthorizationStatus);
			
			if(actSavedVouchersCount==expSavedVouchersCount && actAuthorizationStatus.equalsIgnoreCase(expAuthorizationStatus))
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
				homeCloseBtn.click();
    			Thread.sleep(1000);
				return true;
			}
			else
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
				homeCloseBtn.click();
    			Thread.sleep(1000);
				return false;
			}
		}
		
		
		
		
		
    	@FindBy (xpath="//tbody[@id='tblBodyTransRender']/tr/td[2]/input")
		private static List<WebElement> grid_CheckBoxList;
		
		@FindBy (xpath="//tbody[@id='tblBodyTransRender']/tr/td[5]")
		private static List<WebElement> grid_VoucherNoList;
		
    	public static boolean checkLogoutAndLoginWithSUAndResaveVoucherWithPreviousDateForEscalationTimeLimit1DayAndTypeApprovedValidateAuthorizationStatus() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
    	{
    		System.out.println("**********************checkLogoutAndLoginWithSUAndResaveVoucherWithPreviousDateForEscalationTimeLimit1DayAndTypeApprovedValidateAuthorizationStatus*********************");
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplay));
    		userNameDisplay.click();
   		
   	     	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
   	     	logoutOption.click();

   	     	Thread.sleep(3000);
    		
    		LoginPage lp=new LoginPage(getDriver()); 
    		
    	    String unamelt="su";
    	  
    	    String pawslt="su";
    	      
    	    lp.enterUserName(unamelt);
    	    
    	    lp.enterPassword(pawslt);
    	    
    	    lp.clickOnSignInBtn();
    	    
    		Thread.sleep(6000);

    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
			financialsMenu.click();
					
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
			financialsTransactionMenu.click();
				
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
			financialsTransactionsPurchaseMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVoucherNew));
			purchaseVoucherNew.click();
			
			Thread.sleep(3000);
			
			int count = grid_VoucherNoList.size();
            
            for (int i = 0; i < count; i++) 
            {
                String VoucherNo = grid_VoucherNoList.get(i).getText();
                
                if (VoucherNo.equalsIgnoreCase("1")) 
                {
                	getAction().doubleClick(grid_CheckBoxList.get(i)).build().perform();
                }
            }    
			
            checkValidationMessage("Voucher Loaded Successfully");
            
            DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
            Calendar cal = Calendar.getInstance();
            cal.add(Calendar.DATE, -1);
            
            String previousDate = format.format(cal.getTime());
            
            System.err.println("Previous Date : "+previousDate);
			
            getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dateTxt));
			dateTxt.click();
			dateTxt.sendKeys(Keys.HOME);
			dateTxt.sendKeys(previousDate);
            
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
			saveBtn.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
			billRefPickIcon.click();
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
			billRefOkBtn.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(errorMessage));
			
			String expMessage1= "Voucher saved successfully";
			String expMessage2= ": 1";
			
			String actMessage = checkValidationMessage(expMessage1);
			
		   System.out.println("SavingMessage  :  "+actMessage +" Value Expected : "+expMessage1+" "+expMessage2);
	
		   getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
		   new_CloseBtn.click();
		   
		   Thread.sleep(1000);
			
		   int voucherGridDocNoCount = voucherGridDocNo.size();
			
			int actSavedVouchersCount = voucherGridDocNoCount-1;
			int expSavedVouchersCount = 1;
			
			String actAuthorizationStatus = voucherGridRow1AuthorizationStatus.getText();
			String expAuthorizationStatus = "Authorized";
			
			Thread.sleep(2000);
			
			System.out.println("SavedVouchersCount        : "+actSavedVouchersCount        +" Value Expected : "+expSavedVouchersCount);
			System.out.println("AuthorizationStatus       : "+actAuthorizationStatus       +" Value Expected : "+expAuthorizationStatus);
			
			if(actMessage.startsWith(expMessage1) && actMessage.endsWith(expMessage2) && actSavedVouchersCount==expSavedVouchersCount 
					&& actAuthorizationStatus.equalsIgnoreCase(expAuthorizationStatus))
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
				homeCloseBtn.click();
    			Thread.sleep(2000);
				return true;
			}
			else
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
				homeCloseBtn.click();
    			Thread.sleep(2000);
				return false;
			}
		}
		
		
		
		
		
    	
    	
		// Escalating Time as 1 Week
    	
    	
		
		
		
		
    	
    	
    	    	
    	
    	

    	// Date Range Option
    	public boolean 	checkTransactionAuthorizationConditionTabDateRangeOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
    	{
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsmenuBtn));
    		settingsmenuBtn.click();
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(transactionAuthorizationBtn));
    		transactionAuthorizationBtn.click();
    		
    		Thread.sleep(2000);
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNameDropdown));
    		documentNameDropdown.sendKeys(" ");
    		
    		Thread.sleep(1000);
    			
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchasevoucherExpandbutton));
    		purchasevoucherExpandbutton.click();
    	
            getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchasevoucherTypeCreatedVoucher));
    		purchasevoucherTypeCreatedVoucher.click();
    		
    		Thread.sleep(3000);
    				
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
    		nameTxt.click();
    		
    		nameTxt.sendKeys(Keys.SPACE);
    		
    		int namecount=tranAuthNameList.size();
			
			for(int i=0 ; i < namecount ;i++)
			{
				String data=tranAuthNameList.get(i).getText();
				
				if(data.equalsIgnoreCase("Purchase"))
				{
					tranAuthNameList.get(i).click();
					
					break;
				}
			}
				
    		nameTxt.sendKeys(Keys.TAB);
    			
    		Thread.sleep(3000);
    		
    		click(cnrBtn);
    		Thread.sleep(1000);
    		
    		ClickUsingJs(Level1editBtn);
    		Thread.sleep(1000);
    		
    		//getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(Level1editBtn));
    		//Level1editBtn.click();
    		
    		Thread.sleep(2000);
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(transactionAuthorizationConditionTabDateRangeChkBox));
    		transactionAuthorizationConditionTabDateRangeChkBox.click();
    		
    		Thread.sleep(2000);
    		
    		boolean actDateRange = transactionAuthorizationConditionTabDateRangeChkBox.isSelected();
    		boolean expDateRange = true;
    		
    		
    		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
			Date date=new Date();
			
	    	String Currentdate=dateFormat.format(date);
    		
			Calendar c = Calendar.getInstance();
		
			c.add(Calendar.DAY_OF_MONTH, -5);  
			
			String FromDate = dateFormat.format(c.getTime());  
    		
			String ToDate = Currentdate;
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(transactionAuthorizationConditionTabFromDateTxt));
			transactionAuthorizationConditionTabFromDateTxt.click();
			transactionAuthorizationConditionTabFromDateTxt.sendKeys(Keys.HOME);
			Thread.sleep(2000);
			transactionAuthorizationConditionTabFromDateTxt.sendKeys(FromDate);
			transactionAuthorizationConditionTabFromDateTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(transactionAuthorizationConditionTabToDateTxt));
			transactionAuthorizationConditionTabToDateTxt.sendKeys(Keys.HOME);
			Thread.sleep(2000);
			transactionAuthorizationConditionTabToDateTxt.sendKeys(ToDate);
			transactionAuthorizationConditionTabToDateTxt.sendKeys(Keys.TAB);
			
			String actFromDate = transactionAuthorizationConditionTabFromDateTxt.getAttribute("value");
			String expFromDate = FromDate;
			
			String actToDate = transactionAuthorizationConditionTabToDateTxt.getAttribute("value");
			String expToDate = ToDate;
			
			
			System.out.println("****************************************checkTransactionAuthorizationConditionTabDateRangeOption*******************************************");
    		
			System.out.println("Date Range is Selected : "+actDateRange +" Value Expected "+expDateRange);
			System.out.println("From Date              : "+FromDate);
			System.out.println("To Date                : "+ ToDate);
			System.out.println("FromDate Entered       : "+actFromDate  +" Value Expected "+expFromDate);
			System.out.println("ToDate Entered         : "+actToDate    +" Value Expected "+expToDate);
			
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(definitionOkBtn));
    		definitionOkBtn.click();
    		
    		Thread.sleep(2000);
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(tranAuthSaveBtn));
    		tranAuthSaveBtn.click();
    		
    		String expValidationMsg = "Authorization Flow saved successfully.";
    		
    		String actValidationMsg = checkValidationMessage(expValidationMsg);
    		
    		
    		if(actDateRange==expDateRange && actFromDate.equalsIgnoreCase(expFromDate) && actToDate.equalsIgnoreCase(expToDate) && actValidationMsg.equalsIgnoreCase(expValidationMsg))
    		{
    			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(tranAuthCancelBtn));
    			tranAuthCancelBtn.click();
    			return true;
    		}
    		else
    		{
    			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(tranAuthCancelBtn));
    			tranAuthCancelBtn.click();
    			return false;
    		}
    	}
    	
    	
    	
    	
    	
    	public static boolean checkPurchaseVoucherNSavingVoucher1WithDateRangeOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
			financialsMenu.click();
					
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
			financialsTransactionMenu.click();
				
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
			financialsTransactionsPurchaseMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVoucherNew));
			purchaseVoucherNew.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
			newBtn.click();
			
			checkValidationMessage("Screen opened");
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
			
			DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
			Date date=new Date();
			
	    	String Currentdate=dateFormat.format(date);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dateTxt));
			dateTxt.click();
			dateTxt.sendKeys(Keys.HOME);
			dateTxt.sendKeys(Currentdate);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseAccountTxt));
			purchaseAccountTxt.click();
			purchaseAccountTxt.sendKeys("Purchase");
			
			Thread.sleep(2000);
			
			purchaseAccountTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
			vendorAccountTxt.click();
			vendorAccountTxt.sendKeys("Vendor A");
			
			Thread.sleep(2000);
			
			vendorAccountTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
			departmentTxt.click();
			departmentTxt.sendKeys("INDIA");
			
			Thread.sleep(2000);
			
			departmentTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(wareHouseTxt));
			wareHouseTxt.click();
			wareHouseTxt.sendKeys("HYDERABAD");
			
			Thread.sleep(2000);
			
			wareHouseTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
			select1stRow_1stColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
			enter_ItemTxt.sendKeys("BR COGS ITEM");
			Thread.sleep(3000);
			enter_ItemTxt.sendKeys(Keys.TAB);
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_5thColumn));
			select1stRow_5thColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
			enter_Quantity.sendKeys("1");
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_7thColumn));
			select1stRow_7thColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
			enter_Rate.sendKeys(Keys.END);
			enter_Rate.sendKeys(Keys.SHIFT, Keys.HOME);
			enter_Rate.sendKeys(Keys.BACK_SPACE);
			enter_Rate.sendKeys("10");
			enter_Rate.sendKeys(Keys.TAB);
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
			saveBtn.click();
			
			Thread.sleep(3000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
			billRefPickIcon.click();
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
			billRefOkBtn.click();
			
			Thread.sleep(1000);
			
			String expMessage1= "Voucher saved successfully";
			String expMessage2= ": 1";
			String actMessage = checkValidationMessage(expMessage1);
			
		   System.out.println("************************************* checkPurchaseVoucherNSavingVoucher1WithDateRangeOption  *********************************");
		   
		   System.out.println("SavingMessage  :  "+actMessage +" Value Expected : "+expMessage1+" "+expMessage2);
	
		   if(actMessage.startsWith(expMessage1) && actMessage.endsWith(expMessage2))
    		{
    			System.out.println("Error Message is As Expected");
    			return true;
    		}
    		else
    		{
    			System.out.println(" NO Error Message");
    			return false;
    		}
    	}
	
    	
    	
    	
    	
    	
    	
    	public static boolean checkPurchasesVoucherNSavingVoucher2WithDateRangeOptions() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
			
			
			DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    		
			Calendar c = Calendar.getInstance();
		
			c.add(Calendar.DAY_OF_MONTH, 2);  
			
			String Date = dateFormat.format(c.getTime());  
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dateTxt));
			dateTxt.click();
			dateTxt.sendKeys(Keys.HOME);
			dateTxt.sendKeys(Date);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseAccountTxt));
			purchaseAccountTxt.click();
			purchaseAccountTxt.sendKeys("Purchase");
			
			Thread.sleep(2000);
			
			purchaseAccountTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
			vendorAccountTxt.click();
			vendorAccountTxt.sendKeys("Vendor B");
			
			Thread.sleep(2000);
			
			vendorAccountTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
			departmentTxt.click();
			departmentTxt.sendKeys("INDIA");
			
			Thread.sleep(2000);
			
			departmentTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(wareHouseTxt));
			wareHouseTxt.click();
			wareHouseTxt.sendKeys("HYDERABAD");
			
			Thread.sleep(2000);
			
			wareHouseTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
			select1stRow_1stColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
			enter_ItemTxt.sendKeys("BR COGS ITEM");
			Thread.sleep(3000);
			enter_ItemTxt.sendKeys(Keys.TAB);
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_5thColumn));
			select1stRow_5thColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
			enter_Quantity.sendKeys("1");
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_7thColumn));
			select1stRow_7thColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
			enter_Rate.sendKeys(Keys.END);
			enter_Rate.sendKeys(Keys.SHIFT, Keys.HOME);
			enter_Rate.sendKeys(Keys.BACK_SPACE);
			enter_Rate.sendKeys("10");
			enter_Rate.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
			saveBtn.click();
			
			Thread.sleep(3000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
			billRefPickIcon.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
			billRefOkBtn.click();
			
			String expMessage1= "Voucher saved successfully";
			String expMessage2= ": 2";
			String actMessage = checkValidationMessage(expMessage1);
			
		   System.out.println("************************************* checkFinancialsPurchasesVoucherNSavingVoucher2  *********************************");
		   
		   System.out.println("SavingMessage  :  "+actMessage +" Value Expected : "+expMessage1+" "+expMessage2);
	
		   if(actMessage.startsWith(expMessage1) && actMessage.endsWith(expMessage2))
    		{
    			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
    			new_CloseBtn.click();
    			return true;
    		}
    		else
    		{
    			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
    			new_CloseBtn.click();
    			return false;
    		}
    	}
    	
    	
    	


    	public boolean checkAuthorizationStatusInHomePageWithDateRangeOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			int voucherGridDocNoCount = voucherGridDocNo.size();
			
			String actStatusRow1 = null;
			String actStatusRow2 = null;
			
			System.out.println("Size  : "+voucherGridDocNoCount);
			
			for (int i = 0; i < voucherGridDocNoCount; i++) 
			{
				String data = voucherGridDocNo.get(i).getText();
				
				if (data.equalsIgnoreCase("1")) 
				{
					 actStatusRow1 =  voucherGridAuthorizationStatus.get(i).getText();
				}
				
				if (data.equalsIgnoreCase("2")) 
				{
					 actStatusRow2 =  voucherGridAuthorizationStatus.get(i).getText();
				}
			}
			
			String expStatusRow1 = "Pending";
			String expStatusRow2 = "Authorized";
			
			System.out.println("************************************* checkAuthorizationStatusInHomePageWithDateRangeOption  *********************************");
			
			System.out.println("StatusRow1 : "+actStatusRow1+" Value Expected : "+expStatusRow1);
			System.out.println("StatusRow2 : "+actStatusRow2+" Value Expected : "+expStatusRow2);
			
			
			if(actStatusRow1.equalsIgnoreCase(expStatusRow1) && actStatusRow2.equalsIgnoreCase(expStatusRow2))
			{
				System.out.println("Test Pass : Authorize Succesfully");
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
				homeCloseBtn.click();
				return true;
			}
			else
			{
				System.out.println("Test Fail : NOT Authorize Succesfully");
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
				homeCloseBtn.click();
				return false;
			}
			
		}
			
			
			
			
		
		
		public static boolean checkLogoutAndLoginWithUserAllOptionsWithDateRangeOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
    	{
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplayLogo));
    		userNameDisplayLogo.click();
   		
   		
   	     	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
   	     	logoutOption.click();

   	     	Thread.sleep(3000);
    		
    		LoginPage lp=new LoginPage(getDriver()); 
    		
    	    String unamelt="UserAllOptions";
    	  
    	    String pawslt="12345";
    	      
    	    lp.enterUserName(unamelt);
    	    
    	    lp.enterPassword(pawslt);
    	    
    	    lp.clickOnSignInBtn();
    	    
    	    //checkRefershPopOnlogin();
    	    
    	    //checkPopUpWindow();
    	  
    		Thread.sleep(7000);

    		String actUserInfo=userNameDisplay.getText();
    		
    		System.out.println("User Info  : "+actUserInfo);
    		
    		System.out.println("User Info Capture Text  :  "+userNameDisplay.getText());
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(companyLogo));
    		companyLogo.click();
    		
    		String getCompanyTxt=companyName.getText();
    		String getLoginCompanyName=getCompanyTxt.substring(0, 19);
    		System.out.println("company name  :  "+ getLoginCompanyName);
    		companyLogo.click();
    		
    		boolean actDashboard = dashboard.isDisplayed();
    		
    		
    		String expUserInfo           ="UserAllOptions";
    		String expLoginCompanyName   ="Automation";
    		boolean expDashboard = true;

    		if (actUserInfo.equalsIgnoreCase(expUserInfo) && getLoginCompanyName.contains(expLoginCompanyName) && actDashboard==expDashboard) 
    		{
				return true;
			}
    		else
    		{
    			return false;
			}
    	}
    	
    	
    	
		
		
		public static boolean checkPurchasesVoucherNAuthorizationStatusWithUserAllOptionsWithDateRangeOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
			financialsMenu.click();
					
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
			financialsTransactionMenu.click();
				
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
			financialsTransactionsPurchaseMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVoucherNew));
			purchaseVoucherNew.click();
			
			Thread.sleep(3000);
			
			int voucherGridDocNoCount = voucherGridDocNo.size();
			
			String actStatusRow1 = null;
			String actStatusRow2 = null;
			
			System.out.println("Size  : "+voucherGridDocNoCount);
			
			for (int i = 0; i < voucherGridDocNoCount; i++) 
			{
				String data = voucherGridDocNo.get(i).getText();
				
				if (data.equalsIgnoreCase("1")) 
				{
					 actStatusRow1 =  voucherGridAuthorizationStatus.get(i).getText();
				}
				
				if (data.equalsIgnoreCase("2")) 
				{
					 actStatusRow2 =  voucherGridAuthorizationStatus.get(i).getText();
				}
			}
			
			String expStatusRow1 = "Pending";
			String expStatusRow2 = "Authorized";
			
			Thread.sleep(2000);
			click(homePageVoucherArrowBtn);
			Thread.sleep(1000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pendingAuthorizationPurchases));
			pendingAuthorizationPurchases.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherHomeRow1ChkBox));
			voucherHomeRow1ChkBox.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(authorizeBtn));
			authorizeBtn.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(authorizePopupOkBtn));
			authorizePopupOkBtn.click();
			
			Thread.sleep(2000);
			click(homePageVoucherArrowBtn);
			Thread.sleep(1000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homePageAllVouchersView));
			homePageAllVouchersView.click();
			
			Thread.sleep(2000);
			
			String actAfterAuthorizeStatusRow1 = null;
			String actAfterAuthorizeStatusRow2 = null;
			
			for (int i = 0; i < voucherGridDocNoCount; i++) 
			{
				String data = voucherGridDocNo.get(i).getText();
				
				if (data.equalsIgnoreCase("1")) 
				{
					 actAfterAuthorizeStatusRow1 =  voucherGridAuthorizationStatus.get(i).getText();
				}
				
				if (data.equalsIgnoreCase("2")) 
				{
					 actAfterAuthorizeStatusRow2 =  voucherGridAuthorizationStatus.get(i).getText();
				}
			}
			
			String expAfterAuthorizeStatusRow1 = "Authorized";
			String expAfterAuthorizeStatusRow2 = "Authorized";
			
			
			
			System.out.println("************************************* checkPurchasesVoucherNAuthorizationStatusWithUserAllOptionsWithDateRangeOption  *********************************");
			
			System.out.println("StatusRow1               : "+actStatusRow1				+" Value Expected : "+expStatusRow1);
			System.out.println("StatusRow2               : "+actStatusRow2				+" Value Expected : "+expStatusRow2);
			System.out.println("AfterAuthorizeStatusRow1 : "+actAfterAuthorizeStatusRow1+" Value Expected : "+expAfterAuthorizeStatusRow1);
			System.out.println("AfterAuthorizeStatusRow2 : "+actAfterAuthorizeStatusRow2+" Value Expected : "+expAfterAuthorizeStatusRow2);
			
			
			if(actStatusRow1.equalsIgnoreCase(expStatusRow1) && actStatusRow2.equalsIgnoreCase(expStatusRow2) 
				&& actAfterAuthorizeStatusRow1.equalsIgnoreCase(expAfterAuthorizeStatusRow1) && actAfterAuthorizeStatusRow2.equalsIgnoreCase(expAfterAuthorizeStatusRow2))
			{
				System.out.println("Test Pass : Authorized Succesfully");
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
				homeCloseBtn.click();
    			Thread.sleep(3000);
				//excelReader.setCellData(xlfile, "SmokeSalesOrder", 627, 9, resPass);
				return true;
			}
			else
			{
				System.out.println("Test Fail : NOT Authorized Succesfully");
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
				homeCloseBtn.click();
    			Thread.sleep(3000);
				//excelReader.setCellData(xlfile, "SmokeSalesOrder", 627, 9, resFail);
				return false;
			}
			
		}
			
	
		
		
		public static boolean checkLogoutAndLoginWithSUToCheckAuthorizationStatusWithDateRangeOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
    	{
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplayLogo));
    		userNameDisplayLogo.click();
   		
   	     	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
   	     	logoutOption.click();

   	     	Thread.sleep(3000);
    		
    		LoginPage lp=new LoginPage(getDriver()); 
    		
    	    String unamelt="su";
    	  
    	    String pawslt="su";
    	      
    	    lp.enterUserName(unamelt);
    	    
    	    lp.enterPassword(pawslt);
    	    
    	    lp.clickOnSignInBtn();
    	    
    	    //checkRefershPopOnlogin();
    	    
    	    //checkPopUpWindow();
    	  
    		Thread.sleep(7000);

    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
			financialsMenu.click();
					
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
			financialsTransactionMenu.click();
				
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
			financialsTransactionsPurchaseMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVoucherNew));
			purchaseVoucherNew.click();
			
			Thread.sleep(3000);
			
			int voucherGridDocNoCount = voucherGridDocNo.size();
			
			String actStatusRow1 = null;
			String actStatusRow2 = null;
			
			System.out.println("Size  : "+voucherGridDocNoCount);
			
			for (int i = 0; i < voucherGridDocNoCount; i++) 
			{
				String data = voucherGridDocNo.get(i).getText();
				
				if (data.equalsIgnoreCase("1")) 
				{
					 actStatusRow1 =  voucherGridAuthorizationStatus.get(i).getText();
				}
				
				if (data.equalsIgnoreCase("2")) 
				{
					 actStatusRow2 =  voucherGridAuthorizationStatus.get(i).getText();
				}
			}
			
			String expStatusRow1 = "Authorized";
			String expStatusRow2 = "Authorized";
			
			
			System.out.println("************************************* checkLogoutAndLoginWithSUToCheckAuthorizationStatusWithDateRangeOption  *********************************");
			
			System.out.println("StatusRow1 : "+actStatusRow1+" Value Expected : "+expStatusRow1);
			System.out.println("StatusRow2 : "+actStatusRow2+" Value Expected : "+expStatusRow2);
			
			if(actStatusRow1.equalsIgnoreCase(expStatusRow1) && actStatusRow2.equalsIgnoreCase(expStatusRow2))
			{
				System.out.println("Test Pass : Suspended Succesfully");
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
				homeCloseBtn.click();
    			Thread.sleep(2000);
				//excelReader.setCellData(xlfile, "SmokeSalesOrder", 627, 9, resPass);
				return true;
			}
			else
			{
				System.out.println("Test Fail : NOT Suspended Succesfully");
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
				homeCloseBtn.click();
    			Thread.sleep(2000);
				//excelReader.setCellData(xlfile, "SmokeSalesOrder", 627, 9, resFail);
				return false;
			}
			
		}
    		
    		
    	
		
		
		public boolean checkEraseAllTransactionsAfterDateRangeOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
			homeMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dataMangementMenu));
			dataMangementMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(eraseAll));
			eraseAll.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(eraseTranscationsRadio));
			eraseTranscationsRadio.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(eraseAllOkBtn));
			eraseAllOkBtn.click();
			
			if(getIsAlertPresent())
			{
				getWaitForAlert();
				
				getAlert().accept();
			}
			
			String expMessage = "Data deleted successfully.";
			String actMessage = checkValidationMessage(expMessage);
			  
			System.out.println("************************************* CheckSavingPurchaseVoucherWithCovertOptionWithAllMandatoryFields  *********************************");
			System.out.println("Message  :  "+actMessage +" Value Expected : "+expMessage);
			
			if (actMessage.equalsIgnoreCase(expMessage))
			{
				return true;
			}
			else
			{
				return false;
			}
		}
			
    	
    	
		
		
		
		// Time Range Option
    	public boolean 	checkTransactionAuthorizationConditionTabTimeRangeOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
    	{
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsmenuBtn));
    		settingsmenuBtn.click();
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(transactionAuthorizationBtn));
    		transactionAuthorizationBtn.click();
    		
    		Thread.sleep(2000);
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNameDropdown));
    		documentNameDropdown.sendKeys(" ");
    		
    		Thread.sleep(1000);
    			
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchasevoucherExpandbutton));
    		purchasevoucherExpandbutton.click();
    	
            getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchasevoucherTypeCreatedVoucher));
    		purchasevoucherTypeCreatedVoucher.click();
    		
    		Thread.sleep(3000);
    				
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
    		nameTxt.click();
    		
    		nameTxt.sendKeys(Keys.SPACE);
    		
    		int namecount=tranAuthNameList.size();
			
			for(int i=0 ; i < namecount ;i++)
			{
				String data=tranAuthNameList.get(i).getText();
				
				if(data.equalsIgnoreCase("Purchase"))
				{
					tranAuthNameList.get(i).click();
					
					break;
				}
			}
				
    		nameTxt.sendKeys(Keys.TAB);
    			
    		Thread.sleep(3000);
    		click(cnrBtn);
    		Thread.sleep(1000);
    		
    		ClickUsingJs(Level1editBtn);
    		Thread.sleep(1000);
    		
    		//getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(Level1editBtn));
    		//Level1editBtn.click();
    		
    		Thread.sleep(2000);
    		
    		
    		if (transactionAuthorizationConditionTabDateRangeChkBox.isSelected()==true) 
    		{
    			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(transactionAuthorizationConditionTabDateRangeChkBox));
        		transactionAuthorizationConditionTabDateRangeChkBox.click();
			}
    		
    		
    		if (transactionAuthorizationConditionTabTimeRangeChkBox.isSelected()==false) 
    		{
    			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(transactionAuthorizationConditionTabTimeRangeChkBox));
        		transactionAuthorizationConditionTabTimeRangeChkBox.click();
			}
    		
    		
    		Thread.sleep(2000);
    		
    		boolean actTimeRange = transactionAuthorizationConditionTabTimeRangeChkBox.isSelected();
    		boolean expTimeRange = true;
    		
    		DateFormat dateFormat = new SimpleDateFormat("HH:mm");
    		
			Calendar from = Calendar.getInstance();
			from.add(Calendar.MINUTE, -5);  
			String FromTime = dateFormat.format(from.getTime()); 
			
			Calendar to = Calendar.getInstance();
			to.add(Calendar.SECOND, 90);  
			String ToTime = dateFormat.format(to.getTime()); 
    		
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(transactionAuthorizationConditionTabFromTimeTxt));
			transactionAuthorizationConditionTabFromTimeTxt.click();
			transactionAuthorizationConditionTabFromTimeTxt.sendKeys(Keys.ARROW_LEFT);
			transactionAuthorizationConditionTabFromTimeTxt.sendKeys(FromTime);
			transactionAuthorizationConditionTabFromTimeTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(transactionAuthorizationConditionTabToTimeTxt));
			transactionAuthorizationConditionTabToTimeTxt.sendKeys(Keys.HOME);
			transactionAuthorizationConditionTabToTimeTxt.sendKeys(ToTime);
			transactionAuthorizationConditionTabToTimeTxt.sendKeys(Keys.ARROW_LEFT);
			
			String actFromTime = transactionAuthorizationConditionTabFromTimeTxt.getAttribute("value");
			String expFromTime = FromTime;
			
			String actToTime = transactionAuthorizationConditionTabToTimeTxt.getAttribute("value");
			String expToTime = ToTime;
			
			
			System.out.println("****************************************checkTransactionAuthorizationConditionTabTimeRangeOption*******************************************");
    		
			System.out.println("Time Range is Selected : "+actTimeRange +" Value Expected "+expTimeRange);
			System.out.println("From Time              : "+FromTime);
			System.out.println("To Time                : "+ ToTime);
			System.out.println("FromTime Entered       : "+actFromTime  +" Value Expected "+expFromTime);
			System.out.println("ToTime Entered         : "+actToTime    +" Value Expected "+expToTime);
			
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(definitionOkBtn));
    		definitionOkBtn.click();
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(tranAuthSaveBtn));
    		tranAuthSaveBtn.click();
    		
    		String expValidationMsg = "Authorization Flow saved successfully.";
    		
    		String actValidationMsg = checkValidationMessage(expValidationMsg);
    		
    		
    		if(actTimeRange==expTimeRange && actFromTime.equalsIgnoreCase(expFromTime) && actToTime.equalsIgnoreCase(expToTime) 
    				&& actValidationMsg.equalsIgnoreCase(expValidationMsg))
    		{
    			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(tranAuthCancelBtn));
    			tranAuthCancelBtn.click();
    			return true;
    		}
    		else
    		{
    			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(tranAuthCancelBtn));
    			tranAuthCancelBtn.click();
    			return false;
    		}
    	}
    	
    	
    	
    	
    	
    	public static boolean checkPurchaseVoucherNSavingVoucher1WithTimeRangeOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
			financialsMenu.click();
					
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
			financialsTransactionMenu.click();
				
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
			financialsTransactionsPurchaseMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVoucherNew));
			purchaseVoucherNew.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
			newBtn.click();
			
			checkValidationMessage("Screen opened");
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseAccountTxt));
			purchaseAccountTxt.click();
			purchaseAccountTxt.sendKeys("Purchase");
			
			Thread.sleep(2000);
			
			purchaseAccountTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
			vendorAccountTxt.click();
			vendorAccountTxt.sendKeys("Vendor A");
			
			Thread.sleep(2000);
			
			vendorAccountTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
			departmentTxt.click();
			departmentTxt.sendKeys("INDIA");
			
			Thread.sleep(2000);
			
			departmentTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(wareHouseTxt));
			wareHouseTxt.click();
			wareHouseTxt.sendKeys("HYDERABAD");
			
			Thread.sleep(2000);
			
			wareHouseTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
			select1stRow_1stColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
			enter_ItemTxt.sendKeys("BR COGS ITEM");
			Thread.sleep(2000);
			enter_ItemTxt.sendKeys(Keys.TAB);
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_5thColumn));
			select1stRow_5thColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
			enter_Quantity.sendKeys("1");
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_7thColumn));
			select1stRow_7thColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
			enter_Rate.sendKeys(Keys.END);
			enter_Rate.sendKeys(Keys.SHIFT, Keys.HOME);
			enter_Rate.sendKeys(Keys.BACK_SPACE);
			enter_Rate.sendKeys("10");
			enter_Rate.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
			saveBtn.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
			billRefPickIcon.click();
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
			billRefOkBtn.click();
			
			Thread.sleep(1000);
			String expMessage1= "Voucher saved successfully";
			String expMessage2= ": 1";
			
			String actMessage = checkValidationMessage(expMessage1);
			
		   System.out.println("************************************* checkPurchaseVoucherNSavingVoucher1WithTimeRangeOption  *********************************");
		   
		   System.out.println("SavingMessage  :  "+actMessage +" Value Expected : "+expMessage1+" "+expMessage2);
	
		   if(actMessage.startsWith(expMessage1) && actMessage.endsWith(expMessage2))
    		{
    			return true;
    		}
    		else
    		{
    			return false;
    		}
    	}
	
    	
    	
    	
    	
    	
    	
    	public static boolean checkPurchasesVoucherNSavingVoucher2WithTimeRangeOptions() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseAccountTxt));
			purchaseAccountTxt.click();
			purchaseAccountTxt.sendKeys("Purchase");
			
			Thread.sleep(3000);
			
			purchaseAccountTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
			vendorAccountTxt.click();
			vendorAccountTxt.sendKeys("Vendor B");
			
			Thread.sleep(3000);
			
			vendorAccountTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
			departmentTxt.click();
			departmentTxt.sendKeys("INDIA");
			
			Thread.sleep(5000);
			
			departmentTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(wareHouseTxt));
			wareHouseTxt.click();
			wareHouseTxt.sendKeys("HYDERABAD");
			
			Thread.sleep(5000);
			
			wareHouseTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
			select1stRow_1stColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
			enter_ItemTxt.sendKeys("BR COGS ITEM");
			Thread.sleep(3000);
			enter_ItemTxt.sendKeys(Keys.TAB);
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_5thColumn));
			select1stRow_5thColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
			enter_Quantity.sendKeys("1");
			
			Thread.sleep(5000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_7thColumn));
			select1stRow_7thColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
			enter_Rate.sendKeys(Keys.END);
			enter_Rate.sendKeys(Keys.SHIFT, Keys.HOME);
			enter_Rate.sendKeys(Keys.BACK_SPACE);
			enter_Rate.sendKeys("10");
			enter_Rate.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
			saveBtn.click();
			
			Thread.sleep(3000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
			billRefPickIcon.click();
			
			Thread.sleep(3000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
			billRefOkBtn.click();
			
			Thread.sleep(1000);
			String expMessage1= "Voucher saved successfully";
			String expMessage2= ": 2";
			
			String actMessage = checkValidationMessage(expMessage1);
			
		   System.out.println("************************************* checkPurchasesVoucherNSavingVoucher2WithTimeRangeOptions  *********************************");
		   
		   System.out.println("SavingMessage  :  "+actMessage +" Value Expected : "+expMessage1+" "+expMessage2);
	
		   if(actMessage.startsWith(expMessage1) && actMessage.endsWith(expMessage2))
    		{
    			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
    			new_CloseBtn.click();
    			Thread.sleep(2000);
    			return true;
    		}
    		else
    		{
    			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
    			new_CloseBtn.click();
    			Thread.sleep(2000);
    			return false;
    		}
    	}
    	
    	
    	


    	public boolean checkAuthorizationStatusInHomePageWithTimeRangeOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			
			
		
			int voucherGridDocNoCount = voucherGridDocNo.size();
			
			String actStatusRow1 = null;
			String actStatusRow2 = null;
			
			System.out.println("Size  : "+voucherGridDocNoCount);
			
			for (int i = 0; i < voucherGridDocNoCount; i++) 
			{
				String data = voucherGridDocNo.get(i).getText();
				
				if (data.equalsIgnoreCase("1")) 
				{
					 actStatusRow1 =  voucherGridAuthorizationStatus.get(i).getText();
				}
				
				if (data.equalsIgnoreCase("2")) 
				{
					 actStatusRow2 =  voucherGridAuthorizationStatus.get(i).getText();
				}
			}
			
			String expStatusRow1 = "Pending";
			String expStatusRow2 = "Authorized";
			
			System.out.println("************************************* checkAuthorizationStatusInHomePageWithTimeRangeOption  *********************************");
			
			System.out.println("StatusRow1 : "+actStatusRow1+" Value Expected : "+expStatusRow1);
			System.out.println("StatusRow2 : "+actStatusRow2+" Value Expected : "+expStatusRow2);
			
			
			if(actStatusRow1.equalsIgnoreCase(expStatusRow1) && actStatusRow2.equalsIgnoreCase(expStatusRow2))
			{
				System.out.println("Test Pass : Authorize Succesfully");
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
				homeCloseBtn.click();
				//excelReader.setCellData(xlfile, "SmokeSalesOrder", 627, 9, resPass);
				return true;
			}
			else
			{
				System.out.println("Test Fail : NOT Authorize Succesfully");
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
				homeCloseBtn.click();
				//excelReader.setCellData(xlfile, "SmokeSalesOrder", 627, 9, resFail);
				return false;
			}
			
		}
			
			
			
			
		
		
		public static boolean checkLogoutAndLoginWithUserAllOptionsWithTimeRangeOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
    	{
    		
    		
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplayLogo));
    		userNameDisplayLogo.click();
   		
   		
   	     	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
   	     	logoutOption.click();

   	     	Thread.sleep(3000);
    		
    		LoginPage lp=new LoginPage(getDriver()); 
    		
    	    String unamelt="UserAllOptions";
    	  
    	    String pawslt="12345";
    	      
    	    lp.enterUserName(unamelt);
    	    
    	    lp.enterPassword(pawslt);
    	    
    	    lp.clickOnSignInBtn();
    	    
    	    //checkRefershPopOnlogin();
    	    
    	    //checkPopUpWindow();
    	  
    		Thread.sleep(7000);

    		String actUserInfo=userNameDisplay.getText();
    		
    		System.out.println("User Info  : "+actUserInfo);
    		
    		System.out.println("User Info Capture Text  :  "+userNameDisplay.getText());
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(companyLogo));
    		companyLogo.click();
    		
    		String getCompanyTxt=companyName.getText();
    		String getLoginCompanyName=getCompanyTxt.substring(0, 19);
    		System.out.println("company name  :  "+ getLoginCompanyName);
    		companyLogo.click();
    		
    		boolean actDashboard = dashboard.isDisplayed();
    		
    		
    		String expUserInfo           ="UserAllOptions";
    		String expLoginCompanyName   ="Automation";
    		boolean expDashboard = true;

    		if (actUserInfo.equalsIgnoreCase(expUserInfo) && getLoginCompanyName.contains(expLoginCompanyName) && actDashboard==expDashboard) 
    		{
				return true;
			}
    		else
    		{
    			return false;
			}
    	}
    	
    	
    	
		
		
		public static boolean checkPurchasesVoucherNAuthorizationStatusWithUserAllOptionsWithTimeRangeOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
			financialsMenu.click();
					
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
			financialsTransactionMenu.click();
				
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
			financialsTransactionsPurchaseMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVoucherNew));
			purchaseVoucherNew.click();
			
			Thread.sleep(3000);
			
			int voucherGridDocNoCount = voucherGridDocNo.size();
			
			String actStatusRow1 = null;
			String actStatusRow2 = null;
			
			System.out.println("Size  : "+voucherGridDocNoCount);
			
			for (int i = 0; i < voucherGridDocNoCount; i++) 
			{
				String data = voucherGridDocNo.get(i).getText();
				
				if (data.equalsIgnoreCase("1")) 
				{
					 actStatusRow1 =  voucherGridAuthorizationStatus.get(i).getText();
				}
				
				if (data.equalsIgnoreCase("2")) 
				{
					 actStatusRow2 =  voucherGridAuthorizationStatus.get(i).getText();
				}
			}
			
			String expStatusRow1 = "Pending";
			String expStatusRow2 = "Authorized";
			
			Thread.sleep(2000);
			click(homePageVoucherArrowBtn);
			Thread.sleep(1000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pendingAuthorizationPurchases));
			pendingAuthorizationPurchases.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherHomeRow1ChkBox));
			voucherHomeRow1ChkBox.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(authorizeBtn));
			authorizeBtn.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(authorizePopupOkBtn));
			authorizePopupOkBtn.click();
			
			Thread.sleep(2000);
			click(homePageVoucherArrowBtn);
			Thread.sleep(1000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homePageAllVouchersView));
			homePageAllVouchersView.click();
			
			Thread.sleep(2000);
			
			String actAfterAuthorizeStatusRow1 = null;
			String actAfterAuthorizeStatusRow2 = null;
			
			for (int i = 0; i < voucherGridDocNoCount; i++) 
			{
				String data = voucherGridDocNo.get(i).getText();
				
				if (data.equalsIgnoreCase("1")) 
				{
					 actAfterAuthorizeStatusRow1 =  voucherGridAuthorizationStatus.get(i).getText();
				}
				
				if (data.equalsIgnoreCase("2")) 
				{
					 actAfterAuthorizeStatusRow2 =  voucherGridAuthorizationStatus.get(i).getText();
				}
			}
			
			String expAfterAuthorizeStatusRow1 = "Authorized";
			String expAfterAuthorizeStatusRow2 = "Authorized";
			
			
			
			System.out.println("************************************* checkPurchasesVoucherNAuthorizationStatusWithUserAllOptionsWithTimeRangeOption  *********************************");
			
			System.out.println("StatusRow1               : "+actStatusRow1				+" Value Expected : "+expStatusRow1);
			System.out.println("StatusRow2               : "+actStatusRow2				+" Value Expected : "+expStatusRow2);
			System.out.println("AfterAuthorizeStatusRow1 : "+actAfterAuthorizeStatusRow1+" Value Expected : "+expAfterAuthorizeStatusRow1);
			System.out.println("AfterAuthorizeStatusRow2 : "+actAfterAuthorizeStatusRow2+" Value Expected : "+expAfterAuthorizeStatusRow2);
			
			
			if(actStatusRow1.equalsIgnoreCase(expStatusRow1) && actStatusRow2.equalsIgnoreCase(expStatusRow2) 
				&& actAfterAuthorizeStatusRow1.equalsIgnoreCase(expAfterAuthorizeStatusRow1) && actAfterAuthorizeStatusRow2.equalsIgnoreCase(expAfterAuthorizeStatusRow2))
			{
				System.out.println("Test Pass : Authorized Succesfully");
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
				homeCloseBtn.click();
    			Thread.sleep(3000);
				//excelReader.setCellData(xlfile, "SmokeSalesOrder", 627, 9, resPass);
				return true;
			}
			else
			{
				System.out.println("Test Fail : NOT Authorized Succesfully");
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
				homeCloseBtn.click();
    			Thread.sleep(3000);
				//excelReader.setCellData(xlfile, "SmokeSalesOrder", 627, 9, resFail);
				return false;
			}
			
		}
			
	
		
		
		public static boolean checkLogoutAndLoginWithSUToCheckAuthorizationStatusWithTimeRangeOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
    	{
    		
    		
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplayLogo));
    		userNameDisplayLogo.click();
   		
   	     	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
   	     	logoutOption.click();

   	     	Thread.sleep(3000);
    		
    		LoginPage lp=new LoginPage(getDriver()); 
    		
    	    String unamelt="su";
    	  
    	    String pawslt="su";
    	      
    	    lp.enterUserName(unamelt);
    	    
    	    lp.enterPassword(pawslt);
    	    
    	    lp.clickOnSignInBtn();
    	    
    	    //checkRefershPopOnlogin();
    	    
    	    //checkPopUpWindow();
    	  
    		Thread.sleep(7000);

    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
			financialsMenu.click();
					
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
			financialsTransactionMenu.click();
				
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
			financialsTransactionsPurchaseMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVoucherNew));
			purchaseVoucherNew.click();
			
			Thread.sleep(3000);
			
			int voucherGridDocNoCount = voucherGridDocNo.size();
			
			String actStatusRow1 = null;
			String actStatusRow2 = null;
			
			System.out.println("Size  : "+voucherGridDocNoCount);
			
			for (int i = 0; i < voucherGridDocNoCount; i++) 
			{
				String data = voucherGridDocNo.get(i).getText();
				
				if (data.equalsIgnoreCase("1")) 
				{
					 actStatusRow1 =  voucherGridAuthorizationStatus.get(i).getText();
				}
				
				if (data.equalsIgnoreCase("2")) 
				{
					 actStatusRow2 =  voucherGridAuthorizationStatus.get(i).getText();
				}
			}
			
			String expStatusRow1 = "Authorized";
			String expStatusRow2 = "Authorized";
			
			
			System.out.println("************************************* checkLogoutAndLoginWithSUToCheckAuthorizationStatusWithTimeRangeOption  *********************************");
			
			System.out.println("StatusRow1 : "+actStatusRow1+" Value Expected : "+expStatusRow1);
			System.out.println("StatusRow2 : "+actStatusRow2+" Value Expected : "+expStatusRow2);
			
			if(actStatusRow1.equalsIgnoreCase(expStatusRow1) && actStatusRow2.equalsIgnoreCase(expStatusRow2))
			{
				System.out.println("Test Pass : Suspended Succesfully");
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
				homeCloseBtn.click();
    			Thread.sleep(2000);
				//excelReader.setCellData(xlfile, "SmokeSalesOrder", 627, 9, resPass);
				return true;
			}
			else
			{
				System.out.println("Test Fail : NOT Suspended Succesfully");
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
				homeCloseBtn.click();
    			Thread.sleep(2000);
				//excelReader.setCellData(xlfile, "SmokeSalesOrder", 627, 9, resFail);
				return false;
			}
			
		}
    		
    		
    	
		
		
		public boolean checkEraseAllTransactionsAfterTimeRangeOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
			homeMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dataMangementMenu));
			dataMangementMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(eraseAll));
			eraseAll.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(eraseTranscationsRadio));
			eraseTranscationsRadio.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(eraseAllOkBtn));
			eraseAllOkBtn.click();
			
			if(getIsAlertPresent())
			{
				getWaitForAlert();
				
				getAlert().accept();
			}
			
			String expValidationMsg="Data deleted successfully.";
			
			String actValidationMsg=checkValidationMessage(expValidationMsg);
			
			System.out.println("************************************* CheckSavingPurchaseVoucherWithCovertOptionWithAllMandatoryFields  *********************************");
			
			System.out.println("Message  :  "+actValidationMsg +" Value Expected : "+expValidationMsg);
			
			if (actValidationMsg.equalsIgnoreCase(expValidationMsg))
			{
				return true;
			}
			else
			{
				return false;
			}
		}
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	public boolean 	checkConditonForTransactionAuthorization() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
    	{
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsmenuBtn));
    		settingsmenuBtn.click();
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(transactionAuthorizationBtn));
    		transactionAuthorizationBtn.click();
    		
    		Thread.sleep(2000);
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNameDropdown));
    		documentNameDropdown.sendKeys(" ");
    		
    		Thread.sleep(1000);
    			
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchasevoucherExpandbutton));
    		purchasevoucherExpandbutton.click();
    	
            getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchasevoucherTypeCreatedVoucher));
    		purchasevoucherTypeCreatedVoucher.click();
    		
    		Thread.sleep(3000);
    				
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
    		nameTxt.click();
    		
    		nameTxt.sendKeys(Keys.SPACE);
    		
    		int namecount=tranAuthNameList.size();
			
			for(int i=0 ; i < namecount ;i++)
			{
				String data=tranAuthNameList.get(i).getText();
				
				if(data.equalsIgnoreCase("Purchase"))
				{
					tranAuthNameList.get(i).click();
					
					break;
				}
			}
				
    		nameTxt.sendKeys(Keys.TAB);
    			
    		Thread.sleep(3000);
    		click(cnrBtn);
    		Thread.sleep(1000);
    		
    		ClickUsingJs(Level1editBtn);
    		Thread.sleep(1000);
    		
    		//getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(Level1editBtn));
    		//Level1editBtn.click();
    		
    		Thread.sleep(2000);
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(transactionAuthorizationConditionTabDateRangeChkBox));
    		
    		if (transactionAuthorizationConditionTabDateRangeChkBox.isSelected()==true) 
    		{
        		transactionAuthorizationConditionTabDateRangeChkBox.click();
			}
    		
    		Thread.sleep(2000);
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(transactionAuthorizationConditionTabTimeRangeChkBox));
    		if (transactionAuthorizationConditionTabTimeRangeChkBox.isSelected()==true) 
    		{
    			transactionAuthorizationConditionTabTimeRangeChkBox.click();
			}
    		
    		Thread.sleep(2000);
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(conditionNotRequiredChkBox));
    		if(conditionNotRequiredChkBox.isSelected()==true)
    		{
    			//conditionNotRequiredChkBox.click();
    			ClickUsingJs(conditionNotRequiredChkBox);
    		}
    		
    		Thread.sleep(2000);
    		
    		Select s1=new Select(Row1ConjunctionDropdown);
    		
    		s1.selectByIndex(1);
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(Row1SelectFieldTxt));
    		Row1SelectFieldTxt.click();
    		Thread.sleep(1000);
    		//moveToElement(selectFieldVendorAC);
    		Thread.sleep(2000);
    		//ClickUsingJs(selectFieldVendorAC);
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(selectFieldVendorAC));
    		selectFieldVendorAC.click();
    		
    		Thread.sleep(1000);
    		//click(selectFieldVendorACName);
    		//ClickUsingJs(selectFieldVendorACName);
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(selectFieldVendorACName));
    		selectFieldVendorACName.click();
    		Thread.sleep(1000);
    		
    		Select s2=new Select(Row1SelectOperatorDropdown);
    		
    		s2.selectByIndex(1);
    		
    		Select s3=new Select(Row1CompareWithDropdown);
    		
    		s3.selectByIndex(1);
    		
    		Thread.sleep(3000);
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(InputValueTxt));
    		//Row1ValueTxt.click();
    		InputValueTxt.sendKeys("V");
    		
    		Thread.sleep(2000);
    		
    		int count=Row1ValueList.size();
			
			for(int i=0 ; i < count ;i++)
			{
				String data=Row1ValueList.get(i).getText();
				
				System.err.println(data);
				
				if(data.equalsIgnoreCase("Vendor A"))
				{
					Row1ValueList.get(i).click();
						
					break;
				}
			}	
					
			InputValueTxt.sendKeys(Keys.TAB);
    		
    		/*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(Row1ValueTxt));
    		Row1ValueTxt.sendKeys("Vendor A");
    		
    		Thread.sleep(3000);
    		
    		Row1ValueTxt.sendKeys(Keys.TAB);*/
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(definitionOkBtn));
    		definitionOkBtn.click();
    		
    		Thread.sleep(2000);
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(tranAuthSaveBtn));
    		tranAuthSaveBtn.click();
    		
    		String expValidationMsg = "Authorization Flow saved successfully.";
    		String actValidationMsg = checkValidationMessage(expValidationMsg);
    		
    		System.out.println("Validation Message : "+actValidationMsg+"  Value Expected : "+expValidationMsg);
    		
    		if(actValidationMsg.equalsIgnoreCase(expValidationMsg))
    		{
    			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(tranAuthCancelBtn));
    			tranAuthCancelBtn.click();
    			return true;
    		}
    		else
    		{
    			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(tranAuthCancelBtn));
    			tranAuthCancelBtn.click();
    			return false;
    		}
    	}
    	
    	
    	
    	
				
    	
    	public static boolean checkFinancialsPurchasesVoucherNSavingVoucher1() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
			financialsMenu.click();
					
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
			financialsTransactionMenu.click();
				
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
			financialsTransactionsPurchaseMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVoucherNew));
			purchaseVoucherNew.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
			newBtn.click();
			
			checkValidationMessage("Screen opened");
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseAccountTxt));
			purchaseAccountTxt.click();
			purchaseAccountTxt.sendKeys("Purchase");
			
			Thread.sleep(2000);
			
			purchaseAccountTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
			vendorAccountTxt.click();
			vendorAccountTxt.sendKeys("Vendor A");
			
			Thread.sleep(2000);
			
			vendorAccountTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
			departmentTxt.click();
			departmentTxt.sendKeys("INDIA");
			
			Thread.sleep(2000);
			
			departmentTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(wareHouseTxt));
			wareHouseTxt.click();
			wareHouseTxt.sendKeys("HYDERABAD");
			
			Thread.sleep(2000);
			
			wareHouseTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
			select1stRow_1stColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
			enter_ItemTxt.sendKeys("BR COGS ITEM");
			Thread.sleep(3000);
			enter_ItemTxt.sendKeys(Keys.TAB);
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_5thColumn));
			select1stRow_5thColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
			enter_Quantity.sendKeys("1");
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_7thColumn));
			select1stRow_7thColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
			enter_Rate.sendKeys(Keys.END);
			enter_Rate.sendKeys(Keys.SHIFT, Keys.HOME);
			enter_Rate.sendKeys(Keys.BACK_SPACE);
			enter_Rate.sendKeys("10");
			enter_Rate.sendKeys(Keys.TAB);
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
			saveBtn.click();
			
			Thread.sleep(3000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
			billRefPickIcon.click();
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
			billRefOkBtn.click();
			
			Thread.sleep(1000);
			String expMessage1= "Voucher saved successfully";
			String expMessage2= ": 1";
			
			String actMessage = checkValidationMessage(expMessage1);
			
		   System.out.println("************************************* checkFinancialsPurchasesVoucherNSavingVoucher1  *********************************");
		   
		   System.out.println("SavingMessage  :  "+actMessage +" Value Expected : "+expMessage1+" "+expMessage2);
	
		   if(actMessage.startsWith(expMessage1) && actMessage.endsWith(expMessage2))
    		{
    			return true;
    		}
    		else
    		{
    			return false;
    		}
    	}
	
    	
    	
    	
    	
    	public static boolean checkFinancialsPurchasesVoucherNSavingVoucher2() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseAccountTxt));
			purchaseAccountTxt.click();
			purchaseAccountTxt.sendKeys("Purchase");
			
			Thread.sleep(2000);
			
			purchaseAccountTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
			vendorAccountTxt.click();
			vendorAccountTxt.sendKeys("Vendor A");
			
			Thread.sleep(2000);
			
			vendorAccountTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
			departmentTxt.click();
			departmentTxt.sendKeys("INDIA");
			
			Thread.sleep(2000);
			
			departmentTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(wareHouseTxt));
			wareHouseTxt.click();
			wareHouseTxt.sendKeys("HYDERABAD");
			
			Thread.sleep(2000);
			
			wareHouseTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
			select1stRow_1stColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
			enter_ItemTxt.sendKeys("BR COGS ITEM");
			Thread.sleep(3000);
			enter_ItemTxt.sendKeys(Keys.TAB);
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_5thColumn));
			select1stRow_5thColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
			enter_Quantity.sendKeys("1");
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_7thColumn));
			select1stRow_7thColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
			enter_Rate.sendKeys(Keys.END);
			enter_Rate.sendKeys(Keys.SHIFT, Keys.HOME);
			enter_Rate.sendKeys(Keys.BACK_SPACE);
			enter_Rate.sendKeys("10");
			enter_Rate.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
			saveBtn.click();
			
			Thread.sleep(3000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
			billRefPickIcon.click();
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
			billRefOkBtn.click();
			Thread.sleep(1000);
			
			String expMessage1= "Voucher saved successfully";
			String expMessage2= ": 2";
			
			String actMessage = checkValidationMessage(expMessage1);
			
		   System.out.println("************************************* checkFinancialsPurchasesVoucherNSavingVoucher2  *********************************");
		   
		   System.out.println("SavingMessage  :  "+actMessage +" Value Expected : "+expMessage1+" "+expMessage2);
	
		   if(actMessage.startsWith(expMessage1) && actMessage.endsWith(expMessage2))
    		{
    			return true;
    		}
    		else
    		{
    			return false;
    		}
    	}
    	
    	
    	
    	
    	
    	public static boolean checkFinancialsPurchasesVoucherNSavingVoucher3() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseAccountTxt));
			purchaseAccountTxt.click();
			purchaseAccountTxt.sendKeys("Purchase");
			
			Thread.sleep(2000);
			
			purchaseAccountTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
			vendorAccountTxt.click();
			vendorAccountTxt.sendKeys("Vendor B");
			
			Thread.sleep(2000);
			
			vendorAccountTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
			departmentTxt.click();
			departmentTxt.sendKeys("INDIA");
			
			Thread.sleep(2000);
			
			departmentTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(wareHouseTxt));
			wareHouseTxt.click();
			wareHouseTxt.sendKeys("HYDERABAD");
			
			Thread.sleep(2000);
			
			wareHouseTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
			select1stRow_1stColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
			enter_ItemTxt.sendKeys("BR COGS ITEM");
			Thread.sleep(3000);
			enter_ItemTxt.sendKeys(Keys.TAB);
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_5thColumn));
			select1stRow_5thColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
			enter_Quantity.sendKeys("1");
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_7thColumn));
			select1stRow_7thColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
			enter_Rate.sendKeys(Keys.END);
			enter_Rate.sendKeys(Keys.SHIFT, Keys.HOME);
			enter_Rate.sendKeys(Keys.BACK_SPACE);
			enter_Rate.sendKeys("10");
			enter_Rate.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
			saveBtn.click();
			
			Thread.sleep(3000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
			billRefPickIcon.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
			billRefOkBtn.click();
			Thread.sleep(1000);
			
			String expMessage1= "Voucher saved successfully";
			String expMessage2= ": 3";
			
			String actMessage = checkValidationMessage(expMessage1);
			
		   System.out.println("************************************* checkFinancialsPurchasesVoucherNSavingVoucher3  *********************************");
		   
		   System.out.println("SavingMessage  :  "+actMessage +" Value Expected : "+expMessage1+" "+expMessage2);
	
		   if(actMessage.startsWith(expMessage1) && actMessage.endsWith(expMessage2))
    		{
    			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
    			new_CloseBtn.click();
    			Thread.sleep(2000);
    			return true;
    		}
    		else
    		{
    			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
    			new_CloseBtn.click();
    			Thread.sleep(2000);
    			return false;
    		}
    	}
	
    
    	
    	
    	
			
		public boolean checkAuthorizationStatusInHomePage() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			int voucherGridDocNoCount = voucherGridDocNo.size();
			
			String actStatusRow1 = null;
			String actStatusRow2 = null;
			String actStatusRow3 = null;
			
			System.out.println("Size  : "+voucherGridDocNoCount);
			
			for (int i = 0; i < voucherGridDocNoCount; i++) 
			{
				String data = voucherGridDocNo.get(i).getText();
				
				if (data.equalsIgnoreCase("1")) 
				{
					 actStatusRow1 =  voucherGridAuthorizationStatus.get(i).getText();
				}
				
				if (data.equalsIgnoreCase("2")) 
				{
					 actStatusRow2 =  voucherGridAuthorizationStatus.get(i).getText();
				}
				
				if (data.equalsIgnoreCase("3")) 
				{
					 actStatusRow3 =  voucherGridAuthorizationStatus.get(i).getText();
				}
			}
			
			String expStatusRow1 = "Pending";
			String expStatusRow2 = "Pending";
			String expStatusRow3 = "Authorized";
			
			System.out.println("************************************* checkAuthorizationStatusInHomePage  *********************************");
			
			System.out.println("StatusRow1 : "+actStatusRow1+" Value Expected : "+expStatusRow1);
			System.out.println("StatusRow2 : "+actStatusRow2+" Value Expected : "+expStatusRow2);
			System.out.println("StatusRow2 : "+actStatusRow3+" Value Expected : "+expStatusRow3);
			
			if(actStatusRow1.equalsIgnoreCase(expStatusRow1) && actStatusRow2.equalsIgnoreCase(expStatusRow2) && actStatusRow3.equalsIgnoreCase(expStatusRow3))
			{
				return true;
			}
			else
			{
				return false;
			}
			
		}
			
		
		
		
		
		
		public static boolean checkFinancialsPurchasesVoucherNSavingVoucher2EditVendorATOVendorB() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			
			
			
			
			int voucherGridDocNoCount = voucherGridDocNo.size();
			
			for (int i = 0; i < voucherGridDocNoCount; i++) 
			{
				String data = voucherGridDocNo.get(i).getText();
				
				if (data.equalsIgnoreCase("2")) 
				{
					getAction().doubleClick(voucherGridAuthorizationStatus.get(i)).build().perform();
				}
			}
			
			checkValidationMessage("Loding Message");
			
			/*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(errorMessage));
			String LoadingMessage = errorMessage.getText();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(errorMessageCloseBtn));
			errorMessageCloseBtn.click();*/
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
			vendorAccountTxt.sendKeys(Keys.END);
			vendorAccountTxt.sendKeys(Keys.SHIFT, Keys.HOME);
			vendorAccountTxt.sendKeys(Keys.BACK_SPACE);
			vendorAccountTxt.sendKeys("Vendor B");
			
			Thread.sleep(3000);
			
			vendorAccountTxt.sendKeys(Keys.TAB);
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
			saveBtn.click();
			
			Thread.sleep(3000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
			billRefPickIcon.click();
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
			billRefOkBtn.click();
			
			
			String expMessage1= "Voucher saved successfully";
			String expMessage2= ": 2";
			
			String actMessage = checkValidationMessage(expMessage1);
			
			Thread.sleep(2000);
			
		   System.out.println("************************************* checkFinancialsPurchasesVoucherNSavingVoucher2EditVendorATOVendorB  *********************************");
		   
		   System.out.println("SavingMessage  :  "+actMessage +" Value Expected : "+expMessage1+" "+expMessage2);
	
		   if(actMessage.startsWith(expMessage1) && actMessage.endsWith(expMessage2))
    		{
    			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
    			new_CloseBtn.click();
    			Thread.sleep(2000);
    			return true;
    		}
    		else
    		{
    			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
    			new_CloseBtn.click();
    			Thread.sleep(2000);
    			return false;
    		}
    	}
			
		
		
		
		
		
		public boolean checkAuthorizationStatusInHomePageAfterEditingVoucher2() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			
			
		
			int voucherGridDocNoCount = voucherGridDocNo.size();
			
			String actStatusRow1 = null;
			String actStatusRow2 = null;
			String actStatusRow3 = null;
			
			System.out.println("Size  : "+voucherGridDocNoCount);
			
			for (int i = 0; i < voucherGridDocNoCount; i++) 
			{
				String data = voucherGridDocNo.get(i).getText();
				
				if (data.equalsIgnoreCase("1")) 
				{
					 actStatusRow1 =  voucherGridAuthorizationStatus.get(i).getText();
				}
				
				if (data.equalsIgnoreCase("2")) 
				{
					 actStatusRow2 =  voucherGridAuthorizationStatus.get(i).getText();
				}
				
				if (data.equalsIgnoreCase("3")) 
				{
					 actStatusRow3 =  voucherGridAuthorizationStatus.get(i).getText();
				}
			}
			
			String expStatusRow1 = "Pending";
			String expStatusRow2 = "Authorized";
			String expStatusRow3 = "Authorized";
			
			System.out.println("************************************* checkAuthorizationStatusInHomePageAfterEditingVoucher2  *********************************");
			
			System.out.println("StatusRow1 : "+actStatusRow1+" Value Expected : "+expStatusRow1);
			System.out.println("StatusRow2 : "+actStatusRow2+" Value Expected : "+expStatusRow2);
			System.out.println("StatusRow2 : "+actStatusRow3+" Value Expected : "+expStatusRow3);
			
			
			if(actStatusRow1.equalsIgnoreCase(expStatusRow1) && actStatusRow2.equalsIgnoreCase(expStatusRow2) && actStatusRow3.equalsIgnoreCase(expStatusRow3))
			{
				System.out.println("Test Pass : Authorize Succesfully");
				//excelReader.setCellData(xlfile, "SmokeSalesOrder", 627, 9, resPass);
				return true;
			}
			else
			{
				System.out.println("Test Fail : NOT Authorize Succesfully");
				//excelReader.setCellData(xlfile, "SmokeSalesOrder", 627, 9, resFail);
				return false;
			}
			
		}
		
		
			
			
		
		
		public static boolean checkLogoutAndLoginWithUserAllOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
    	{
    		
    		
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplayLogo));
    		userNameDisplayLogo.click();
   		
   		
   	     	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
   	     	logoutOption.click();

   	     	Thread.sleep(3000);
    		
    		
    		LoginPage lp=new LoginPage(getDriver()); 
    		
    	    String unamelt="UserAllOptions";
    	  
    	    String pawslt="12345";
    	      
    	    lp.enterUserName(unamelt);
    	    
    	    lp.enterPassword(pawslt);
    	    
    	    lp.clickOnSignInBtn();
    	    
    	    //checkRefershPopOnlogin();
    	    
    	    //checkPopUpWindow();
    	  
    		Thread.sleep(10000);

    		if (dashboard.isDisplayed()) 
    		{
				return true;
			}
    		else
    		{
    			return false;
			}
    	}
			
		
		
		
		
		
		public static boolean checkFinancialsPurchasesVoucherNAuthorizationStatusWithUserAllOptions() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
			financialsMenu.click();
					
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
			financialsTransactionMenu.click();
				
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
			financialsTransactionsPurchaseMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVoucherNew));
			purchaseVoucherNew.click();
			
			Thread.sleep(3000);
			
			int voucherGridDocNoCount = voucherGridDocNo.size();
			
			String actStatusRow1 = null;
			String actStatusRow2 = null;
			String actStatusRow3 = null;
			
			System.out.println("Size  : "+voucherGridDocNoCount);
			
			for (int i = 0; i < voucherGridDocNoCount; i++) 
			{
				String data = voucherGridDocNo.get(i).getText();
				
				if (data.equalsIgnoreCase("1")) 
				{
					 actStatusRow1 =  voucherGridAuthorizationStatus.get(i).getText();
				}
				
				if (data.equalsIgnoreCase("2")) 
				{
					 actStatusRow2 =  voucherGridAuthorizationStatus.get(i).getText();
				}
				
				if (data.equalsIgnoreCase("3")) 
				{
					 actStatusRow3 =  voucherGridAuthorizationStatus.get(i).getText();
				}
			}
			
			String expStatusRow1 = "Pending";
			String expStatusRow2 = "Authorized";
			String expStatusRow3 = "Authorized";
			
			Thread.sleep(2000);
			
			click(homePageVoucherArrowBtn);
			Thread.sleep(1000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pendingAuthorizationPurchases));
			pendingAuthorizationPurchases.click();
			
			Thread.sleep(3000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherHomeRow1ChkBox));
			voucherHomeRow1ChkBox.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(authorizeBtn));
			authorizeBtn.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(authorizePopupOkBtn));
			authorizePopupOkBtn.click();
			
			Thread.sleep(2000);
			click(homePageVoucherArrowBtn);
			Thread.sleep(1000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homePageAllVouchersView));
			homePageAllVouchersView.click();
			
			Thread.sleep(2000);
			
			String actAfterAuthorizeStatusRow1 = null;
			String actAfterAuthorizeStatusRow2 = null;
			String actAfterAuthorizeStatusRow3 = null;
			
			for (int i = 0; i < voucherGridDocNoCount; i++) 
			{
				String data = voucherGridDocNo.get(i).getText();
				
				if (data.equalsIgnoreCase("1")) 
				{
					 actAfterAuthorizeStatusRow1 =  voucherGridAuthorizationStatus.get(i).getText();
				}
				
				if (data.equalsIgnoreCase("2")) 
				{
					 actAfterAuthorizeStatusRow2 =  voucherGridAuthorizationStatus.get(i).getText();
				}
				
				if (data.equalsIgnoreCase("3")) 
				{
					actAfterAuthorizeStatusRow3 =  voucherGridAuthorizationStatus.get(i).getText();
				}
			}
			
			String expAfterAuthorizeStatusRow1 = "Authorized";
			String expAfterAuthorizeStatusRow2 = "Authorized";
			String expAfterAuthorizeStatusRow3 = "Authorized";
			
			
			
			System.out.println("************************************* checkFinancialsPurchasesVoucherNAuthorizationStatusWithUserAllOptions  *********************************");
			
			System.out.println("StatusRow1               : "+actStatusRow1				+" Value Expected : "+expStatusRow1);
			System.out.println("StatusRow2               : "+actStatusRow2				+" Value Expected : "+expStatusRow2);
			System.out.println("StatusRow3               : "+actStatusRow3				+" Value Expected : "+expStatusRow3);
			System.out.println("AfterAuthorizeStatusRow1 : "+actAfterAuthorizeStatusRow1+" Value Expected : "+expAfterAuthorizeStatusRow1);
			System.out.println("AfterAuthorizeStatusRow2 : "+actAfterAuthorizeStatusRow2+" Value Expected : "+expAfterAuthorizeStatusRow2);
			System.out.println("AfterAuthorizeStatusRow3 : "+actAfterAuthorizeStatusRow3+" Value Expected : "+expAfterAuthorizeStatusRow3);
			
			if(actStatusRow1.equalsIgnoreCase(expStatusRow1) && actStatusRow2.equalsIgnoreCase(expStatusRow2) && actStatusRow3.equalsIgnoreCase(expStatusRow3) 
				&& actAfterAuthorizeStatusRow1.equalsIgnoreCase(expAfterAuthorizeStatusRow1) && actAfterAuthorizeStatusRow2.equalsIgnoreCase(expAfterAuthorizeStatusRow2)
				&& actAfterAuthorizeStatusRow3.equalsIgnoreCase(expAfterAuthorizeStatusRow3))
			{
				System.out.println("Test Pass : Authorized Succesfully");
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
				homeCloseBtn.click();
    			Thread.sleep(3000);
				//excelReader.setCellData(xlfile, "SmokeSalesOrder", 627, 9, resPass);
				return true;
			}
			else
			{
				System.out.println("Test Fail : NOT Authorized Succesfully");
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
				homeCloseBtn.click();
    			Thread.sleep(3000);
				//excelReader.setCellData(xlfile, "SmokeSalesOrder", 627, 9, resFail);
				return false;
			}
			
		}
			
	
		
		
		
		
		
		public static boolean checkLogoutAndLoginWithSUToCheckAuthorizationStatus() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
    	{
    		
    		
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplayLogo));
    		userNameDisplayLogo.click();
   		
   	     	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
   	     	logoutOption.click();

   	     	Thread.sleep(3000);
    		
    		LoginPage lp=new LoginPage(getDriver()); 
    		
    	    String unamelt="su";
    	  
    	    String pawslt="su";
    	      
    	    lp.enterUserName(unamelt);
    	    
    	    lp.enterPassword(pawslt);
    	    
    	    lp.clickOnSignInBtn();
    	    
    	    //checkRefershPopOnlogin();
    	    
    	    //checkPopUpWindow();
    	  
    		Thread.sleep(8000);

    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
			financialsMenu.click();
					
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
			financialsTransactionMenu.click();
				
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
			financialsTransactionsPurchaseMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVoucherNew));
			purchaseVoucherNew.click();
			
			Thread.sleep(3000);
			
			int voucherGridDocNoCount = voucherGridDocNo.size();
			
			String actStatusRow1 = null;
			String actStatusRow2 = null;
			String actStatusRow3 = null;
			
			System.out.println("Size  : "+voucherGridDocNoCount);
			
			for (int i = 0; i < voucherGridDocNoCount; i++) 
			{
				String data = voucherGridDocNo.get(i).getText();
				
				if (data.equalsIgnoreCase("1")) 
				{
					 actStatusRow1 =  voucherGridAuthorizationStatus.get(i).getText();
				}
				
				if (data.equalsIgnoreCase("2")) 
				{
					 actStatusRow2 =  voucherGridAuthorizationStatus.get(i).getText();
				}
				
				if (data.equalsIgnoreCase("3")) 
				{
					 actStatusRow3 =  voucherGridAuthorizationStatus.get(i).getText();
				}
			}
			
			String expStatusRow1 = "Authorized";
			String expStatusRow2 = "Authorized";
			String expStatusRow3 = "Authorized";
			
			
			System.out.println("************************************* checkLogoutAndLoginWithSUToCheckAuthorizationStatus  *********************************");
			
			System.out.println("StatusRow1 : "+actStatusRow1+" Value Expected : "+expStatusRow1);
			System.out.println("StatusRow2 : "+actStatusRow2+" Value Expected : "+expStatusRow2);
			System.out.println("StatusRow3 : "+actStatusRow3+" Value Expected : "+expStatusRow3);
			
			if(actStatusRow1.equalsIgnoreCase(expStatusRow1) && actStatusRow2.equalsIgnoreCase(expStatusRow2) && actStatusRow3.equalsIgnoreCase(expStatusRow3))
			{
				System.out.println("Test Pass : Authorize Succesfully");
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
				homeCloseBtn.click();
    			Thread.sleep(2000);
				//excelReader.setCellData(xlfile, "SmokeSalesOrder", 627, 9, resPass);
				return true;
			}
			else
			{
				System.out.println("Test Fail : NOT Authorize Succesfully");
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
				homeCloseBtn.click();
    			Thread.sleep(2000);
				//excelReader.setCellData(xlfile, "SmokeSalesOrder", 627, 9, resFail);
				return false;
			}
			
		}
    		
    		
    	
		
		
		public boolean checkEraseAllTransactionsAfterIntialCheck() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
			homeMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dataMangementMenu));
			dataMangementMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(eraseAll));
			eraseAll.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(eraseTranscationsRadio));
			eraseTranscationsRadio.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(eraseAllOkBtn));
			eraseAllOkBtn.click();
			
			if(getIsAlertPresent())
			{
				getWaitForAlert();
				
				getAlert().accept();
			}
			
			
			String expMessage = "Data deleted successfully.";
			
			String actMessage = checkValidationMessage(expMessage);
			  
			System.out.println("************************************* CheckSavingPurchaseVoucherWithCovertOptionWithAllMandatoryFields  *********************************");
			System.out.println("Message  :  "+actMessage +" Value Expected : "+expMessage);
			
			if (actMessage.equalsIgnoreCase(expMessage))
			{
				return true;
			}
			else
			{
				return false;
			}
		}
			
			
		
		
		
		
		// Condition Item as BR COGS ITEM and Quantity Greater Than 100

		public boolean 	checkEditAndChangingConditonForTransactionAuthorization() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
    	{
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsmenuBtn));
    		settingsmenuBtn.click();
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(transactionAuthorizationBtn));
    		transactionAuthorizationBtn.click();
    		
    		Thread.sleep(2000);
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNameDropdown));
    		documentNameDropdown.sendKeys(" ");
    		
    		Thread.sleep(1000);
    			
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchasevoucherExpandbutton));
    		purchasevoucherExpandbutton.click();
    	
            getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchasevoucherTypeCreatedVoucher));
    		purchasevoucherTypeCreatedVoucher.click();
    		
    		Thread.sleep(3000);
    				
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
    		nameTxt.click();
    		
    		nameTxt.sendKeys(Keys.SPACE);
    		
    		int namecount=tranAuthNameList.size();
			
			for(int i=0 ; i < namecount ;i++)
			{
				String data=tranAuthNameList.get(i).getText();
				
				if(data.equalsIgnoreCase("Purchase"))
				{
					tranAuthNameList.get(i).click();
					
					break;
				}
			}
				
    		nameTxt.sendKeys(Keys.TAB);
    			
    		Thread.sleep(3000);
    		click(cnrBtn);
    		Thread.sleep(1000);
    		
    		ClickUsingJs(Level1editBtn);
    		Thread.sleep(1000);
    		
    		//getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(Level1editBtn));
    		//Level1editBtn.click();
    		
    		Thread.sleep(2000);
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(Row1TransAuthConditionDeleteBtn));
    		Row1TransAuthConditionDeleteBtn.click();
    		
    		Thread.sleep(2000);
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(Row1TransAuthConditionAddBtn));
    		Row1TransAuthConditionAddBtn.click();
    		
    		Select s1=new Select(Row1ConjunctionDropdown);
    		
    		s1.selectByIndex(1);
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(Row1SelectFieldTxt));
    		Row1SelectFieldTxt.click();
    		
    		Thread.sleep(2000);
    		ClickUsingJs(selectFieldItem);
    		//getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(selectFieldItem));
    		//selectFieldItem.click();
    		
    		Thread.sleep(2000);
    		ClickUsingJs(selectFieldItemName);
    		//getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(selectFieldItemName));
    		//selectFieldItemName.click();
    		
    		Select s2=new Select(Row1SelectOperatorDropdown);
    		
    		s2.selectByIndex(1);
    		
    		Select s3=new Select(Row1CompareWithDropdown);
    		
    		s3.selectByIndex(1);
    		
    		Thread.sleep(1000);
    		
    		//enterText(InputValueTxt, "BR COGS ITEM"); //input[@id='advancefilter_master_68_0_']
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(InputValueTxt));
    		InputValueTxt.sendKeys("BR COGS ITEM");
    		
    		Thread.sleep(1000);
    		
    		InputValueTxt.sendKeys(Keys.TAB);
    		
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(Row2SelectFieldTxt));
    		Row2SelectFieldTxt.click();
    		
    		Thread.sleep(2000);
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(selectFieldQuantity));
    		((JavascriptExecutor)getDriver()).executeScript("arguments[0].scrollIntoView();", selectFieldQuantity);
    		ClickUsingJs(selectFieldQuantity);
    		//selectFieldQuantity.click();
    		
    		Thread.sleep(2000);
    		
    		Select s4=new Select(Row2SelectOperatorDropdown);
    		
    		s4.selectByIndex(4);
    		
    		Select s5=new Select(Row2CompareWithDropdown);
    		
    		s5.selectByIndex(1);
    		
    		Thread.sleep(2000);
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(Row2ValueTxt));
    		Row2ValueTxt.click();
    		Row2ValueTxt.sendKeys("100");
    		
    		Thread.sleep(2000);
    		
    		Row2ValueTxt.sendKeys(Keys.TAB);
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(definitionOkBtn));
    		definitionOkBtn.click();
    		
    		Thread.sleep(2000);
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(tranAuthSaveBtn));
    		tranAuthSaveBtn.click();
    		
    		String expValidationMsg="Authorization Flow saved successfully.";
    		
    		String actValidationMsg=checkValidationMessage(expValidationMsg);
    		
    		
    		System.out.println("Validation Message : "+actValidationMsg+"  Value Expected : "+expValidationMsg);
    		
    		if(actValidationMsg.equalsIgnoreCase(expValidationMsg))
    		{
    			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(tranAuthCancelBtn));
    			tranAuthCancelBtn.click();
    			return true;
    		}
    		else
    		{
    			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(tranAuthCancelBtn));
    			tranAuthCancelBtn.click();
    			return false;
    		}
    	}
    	
    	
		
		
		
		
		public static boolean checkFinancialsPurchasesVoucherNSavingVoucher1WithConditionItemAsBRCOGS() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
			financialsMenu.click();
					
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
			financialsTransactionMenu.click();
				
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
			financialsTransactionsPurchaseMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVoucherNew));
			purchaseVoucherNew.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
			newBtn.click();
			
			checkValidationMessage("Screen opened");
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseAccountTxt));
			purchaseAccountTxt.click();
			purchaseAccountTxt.sendKeys("Purchase");
			
			Thread.sleep(2000);
			
			purchaseAccountTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
			vendorAccountTxt.click();
			vendorAccountTxt.sendKeys("Vendor A");
			
			Thread.sleep(2000);
			
			vendorAccountTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
			departmentTxt.click();
			departmentTxt.sendKeys("INDIA");
			
			Thread.sleep(2000);
			
			departmentTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(wareHouseTxt));
			wareHouseTxt.click();
			wareHouseTxt.sendKeys("HYDERABAD");
			
			Thread.sleep(2000);
			
			wareHouseTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
			select1stRow_1stColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
			enter_ItemTxt.sendKeys("BR COGS ITEM");
			Thread.sleep(3000);
			enter_ItemTxt.sendKeys(Keys.TAB);
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_5thColumn));
			select1stRow_5thColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
			enter_Quantity.sendKeys("90");
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_7thColumn));
			select1stRow_7thColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
			enter_Rate.sendKeys(Keys.END);
			enter_Rate.sendKeys(Keys.SHIFT, Keys.HOME);
			enter_Rate.sendKeys(Keys.BACK_SPACE);
			enter_Rate.sendKeys("10");
			enter_Rate.sendKeys(Keys.TAB);
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
			saveBtn.click();
			
			Thread.sleep(3000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
			billRefPickIcon.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
			billRefOkBtn.click();
			
			Thread.sleep(1000);
			
			String expMessage1= "Voucher saved successfully";
			String expMessage2= ": 1";
			
			String actMessage = checkValidationMessage(expMessage1);
			
		   System.out.println("************************************* checkFinancialsPurchasesVoucherNSavingVoucher1WithConditionItemAsBRCOGS  *********************************");
		   
		   System.out.println("SavingMessage  :  "+actMessage +" Value Expected : "+expMessage1+" "+expMessage2);
	
		   if(actMessage.startsWith(expMessage1) && actMessage.endsWith(expMessage2))
    		{
    			return true;
    		}
    		else
    		{
    			return false;
    		}
    	}
	
    	
    	
    	
    	
    	public static boolean checkFinancialsPurchasesVoucherNSavingVoucher2WithConditionItemAsBRCOGS() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseAccountTxt));
			purchaseAccountTxt.click();
			purchaseAccountTxt.sendKeys("Purchase");
			
			Thread.sleep(2000);
			
			purchaseAccountTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
			vendorAccountTxt.click();
			vendorAccountTxt.sendKeys("Vendor A");
			
			Thread.sleep(2000);
			
			vendorAccountTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
			departmentTxt.click();
			departmentTxt.sendKeys("INDIA");
			
			Thread.sleep(2000);
			
			departmentTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(wareHouseTxt));
			wareHouseTxt.click();
			wareHouseTxt.sendKeys("HYDERABAD");
			
			Thread.sleep(2000);
			
			wareHouseTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
			select1stRow_1stColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
			enter_ItemTxt.sendKeys("BR COGS ITEM");
			Thread.sleep(3000);
			enter_ItemTxt.sendKeys(Keys.TAB);
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_5thColumn));
			select1stRow_5thColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
			enter_Quantity.sendKeys("101");
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_7thColumn));
			select1stRow_7thColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
			enter_Rate.sendKeys(Keys.END);
			enter_Rate.sendKeys(Keys.SHIFT, Keys.HOME);
			enter_Rate.sendKeys(Keys.BACK_SPACE);
			enter_Rate.sendKeys("10");
			enter_Rate.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
			saveBtn.click();
			
			Thread.sleep(3000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
			billRefPickIcon.click();
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
			billRefOkBtn.click();
			
			Thread.sleep(1000);
			
			String expMessage1= "Voucher saved successfully";
			String expMessage2= ": 2";
			
			String actMessage = checkValidationMessage(expMessage1);
			
		   System.out.println("************************************* checkFinancialsPurchasesVoucherNSavingVoucher2WithConditionItemAsBRCOGS  *********************************");
		   
		   System.out.println("SavingMessage  :  "+actMessage +" Value Expected : "+expMessage1+" "+expMessage2);
	
		   if(actMessage.startsWith(expMessage1) && actMessage.endsWith(expMessage2))
    		{
    			return true;
    		}
    		else
    		{
    			return false;
    		}
    	}
    	
    	
    	
    	
    	
    	public static boolean checkFinancialsPurchasesVoucherNSavingVoucher3WithConditionItemAsBRCOGS() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseAccountTxt));
			purchaseAccountTxt.click();
			purchaseAccountTxt.sendKeys("Purchase");
			
			Thread.sleep(2000);
			
			purchaseAccountTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
			vendorAccountTxt.click();
			vendorAccountTxt.sendKeys("Vendor A");
			
			Thread.sleep(2000);
			
			vendorAccountTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
			departmentTxt.click();
			departmentTxt.sendKeys("INDIA");
			
			Thread.sleep(2000);
			
			departmentTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(wareHouseTxt));
			wareHouseTxt.click();
			wareHouseTxt.sendKeys("HYDERABAD");
			
			Thread.sleep(2000);
			
			wareHouseTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
			select1stRow_1stColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
			enter_ItemTxt.sendKeys("STD RATE COGS ITEM");
			Thread.sleep(3000);
			enter_ItemTxt.sendKeys(Keys.TAB);
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_5thColumn));
			select1stRow_5thColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
			enter_Quantity.sendKeys("90");
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_7thColumn));
			select1stRow_7thColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
			enter_Rate.sendKeys(Keys.END);
			enter_Rate.sendKeys(Keys.SHIFT, Keys.HOME);
			enter_Rate.sendKeys(Keys.BACK_SPACE);
			enter_Rate.sendKeys("10");
			enter_Rate.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
			saveBtn.click();
			
			Thread.sleep(3000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
			billRefPickIcon.click();
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
			billRefOkBtn.click();
			
			Thread.sleep(1000);
			
			String expMessage1= "Voucher saved successfully";
			String expMessage2= ": 3";
			
			String actMessage = checkValidationMessage(expMessage1);
			
		   System.out.println("************************************* checkFinancialsPurchasesVoucherNSavingVoucher3WithConditionItemAsBRCOGS  *********************************");
		   
		   System.out.println("SavingMessage  :  "+actMessage +" Value Expected : "+expMessage1+" "+expMessage2);
	
		   if(actMessage.startsWith(expMessage1) && actMessage.endsWith(expMessage2))
    		{
    			return true;
    		}
    		else
    		{
    			return false;
    		}
    	}
	
    
    	
    	
    	
    	public static boolean checkFinancialsPurchasesVoucherNSavingVoucher4WithConditionItemAsBRCOGS() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseAccountTxt));
			purchaseAccountTxt.click();
			purchaseAccountTxt.sendKeys("Purchase");
			
			Thread.sleep(2000);
			
			purchaseAccountTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
			vendorAccountTxt.click();
			vendorAccountTxt.sendKeys("Vendor A");
			
			Thread.sleep(2000);
			
			vendorAccountTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
			departmentTxt.click();
			departmentTxt.sendKeys("INDIA");
			
			Thread.sleep(2000);
			
			departmentTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(wareHouseTxt));
			wareHouseTxt.click();
			wareHouseTxt.sendKeys("HYDERABAD");
			
			Thread.sleep(2000);
			
			wareHouseTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
			select1stRow_1stColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
			enter_ItemTxt.sendKeys("STD RATE COGS ITEM");
			Thread.sleep(3000);
			enter_ItemTxt.sendKeys(Keys.TAB);
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_5thColumn));
			select1stRow_5thColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
			enter_Quantity.sendKeys("101");
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_7thColumn));
			select1stRow_7thColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
			enter_Rate.sendKeys(Keys.END);
			enter_Rate.sendKeys(Keys.SHIFT, Keys.HOME);
			enter_Rate.sendKeys(Keys.BACK_SPACE);
			enter_Rate.sendKeys("10");
			enter_Rate.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
			saveBtn.click();
			
			Thread.sleep(3000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
			billRefPickIcon.click();
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
			billRefOkBtn.click();
			
			Thread.sleep(1000);
			
			String expMessage1= "Voucher saved successfully";
			String expMessage2= ": 4";
			
			String actMessage = checkValidationMessage(expMessage1);
			
		   System.out.println("************************************* checkFinancialsPurchasesVoucherNSavingVoucher4WithConditionItemAsBRCOGS  *********************************");
		   
		   System.out.println("SavingMessage  :  "+actMessage +" Value Expected : "+expMessage1+" "+expMessage2);
	
		   if(actMessage.startsWith(expMessage1) && actMessage.endsWith(expMessage2))
    		{
    			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
    			new_CloseBtn.click();
    			Thread.sleep(2000);
    			return true;
    		}
    		else
    		{
    			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
    			new_CloseBtn.click();
    			Thread.sleep(2000);
    			return false;
    		}
    	}
    	
    	
    	
    	
			
		public boolean checkAuthorizationStatusInHomePageAfterSavingVouchersWithConditionItemAsBRCOGS() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			int voucherGridDocNoCount = voucherGridDocNo.size();
			
			String actStatusRow1 = null;
			String actStatusRow2 = null;
			String actStatusRow3 = null;
			String actStatusRow4 = null;
			
			System.out.println("Size  : "+voucherGridDocNoCount);
			
			for (int i = 0; i < voucherGridDocNoCount; i++) 
			{
				String data = voucherGridDocNo.get(i).getText();
				
				if (data.equalsIgnoreCase("1")) 
				{
					 actStatusRow1 =  voucherGridAuthorizationStatus.get(i).getText();
				}
				
				if (data.equalsIgnoreCase("2")) 
				{
					 actStatusRow2 =  voucherGridAuthorizationStatus.get(i).getText();
				}
				
				if (data.equalsIgnoreCase("3")) 
				{
					 actStatusRow3 =  voucherGridAuthorizationStatus.get(i).getText();
				}
				
				if (data.equalsIgnoreCase("4")) 
				{
					 actStatusRow4 =  voucherGridAuthorizationStatus.get(i).getText();
				}
			}
			
			String expStatusRow1 = "Pending";
			String expStatusRow2 = "Pending";
			String expStatusRow3 = "Authorized";
			String expStatusRow4 = "Authorized";
			
			System.out.println("************************************* checkAuthorizationStatusInHomePageAfterSavingVouchersWithConditionItemAsBRCOGS  *********************************");
			
			System.out.println("StatusRow1 : "+actStatusRow1+" Value Expected : "+expStatusRow1);
			System.out.println("StatusRow2 : "+actStatusRow2+" Value Expected : "+expStatusRow2);
			System.out.println("StatusRow2 : "+actStatusRow3+" Value Expected : "+expStatusRow3);
			System.out.println("StatusRow4 : "+actStatusRow4+" Value Expected : "+expStatusRow4);
			
			
			if(actStatusRow1.equalsIgnoreCase(expStatusRow1) && actStatusRow2.equalsIgnoreCase(expStatusRow2) && actStatusRow3.equalsIgnoreCase(expStatusRow3)
				&& actStatusRow4.equalsIgnoreCase(expStatusRow4))
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
				homeCloseBtn.click();
				return true;
			}
			else
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
				homeCloseBtn.click();
				return false;
			}
		}
		
		
		
		
		
		
		
		public static boolean checkLogoutAndLoginWithUserAllOptionsWithConditionItemAsBRCOGS() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
    	{
    		
    		
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplayLogo));
    		userNameDisplayLogo.click();
   		
   		
   	     	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
   	     	logoutOption.click();

   	     	Thread.sleep(3000);
    		
    		
    		LoginPage lp=new LoginPage(getDriver()); 
    		
    	    String unamelt="UserAllOptions";
    	  
    	    String pawslt="12345";
    	      
    	    lp.enterUserName(unamelt);
    	    
    	    lp.enterPassword(pawslt);
    	    
    	    lp.clickOnSignInBtn();
    	    
    	    //checkRefershPopOnlogin();
    	    
    	    //checkPopUpWindow();
    	  
    		Thread.sleep(10000);

    		if (dashboard.isDisplayed()) 
    		{
				return true;
			}
    		else
    		{
    			return false;
			}
    	}
			
		
		
		
		
		
		public static boolean checkFinancialsPurchasesVoucherNAuthorizationStatusWithUserAllOptionsWithConditionItemAsBRCOGS() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
			financialsMenu.click();
					
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
			financialsTransactionMenu.click();
				
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
			financialsTransactionsPurchaseMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVoucherNew));
			purchaseVoucherNew.click();
			
			Thread.sleep(3000);
			
			int voucherGridDocNoCount = voucherGridDocNo.size();
			
			String actStatusRow1 = null;
			String actStatusRow2 = null;
			String actStatusRow3 = null;
			String actStatusRow4 = null;
			
			System.out.println("Size  : "+voucherGridDocNoCount);
			
			for (int i = 0; i < voucherGridDocNoCount; i++) 
			{
				String data = voucherGridDocNo.get(i).getText();
				
				if (data.equalsIgnoreCase("1")) 
				{
					 actStatusRow1 =  voucherGridAuthorizationStatus.get(i).getText();
				}
				
				if (data.equalsIgnoreCase("2")) 
				{
					 actStatusRow2 =  voucherGridAuthorizationStatus.get(i).getText();
				}
				
				if (data.equalsIgnoreCase("3")) 
				{
					 actStatusRow3 =  voucherGridAuthorizationStatus.get(i).getText();
				}
				
				if (data.equalsIgnoreCase("4")) 
				{
					 actStatusRow4 =  voucherGridAuthorizationStatus.get(i).getText();
				}
			}
			
			String expStatusRow1 = "Pending";
			String expStatusRow2 = "Pending";
			String expStatusRow3 = "Authorized";
			String expStatusRow4 = "Authorized";
			
			Thread.sleep(2000);
			
			click(homePageVoucherArrowBtn);
			Thread.sleep(1000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pendingAuthorizationPurchases));
			pendingAuthorizationPurchases.click();
			
			Thread.sleep(3000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(grid_HeaderChkBox));
			grid_HeaderChkBox.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(authorizeBtn));
			authorizeBtn.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(authorizePopupOkBtn));
			authorizePopupOkBtn.click();
			
			Thread.sleep(2000);
			click(homePageVoucherArrowBtn);
			Thread.sleep(1000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homePageAllVouchersView));
			homePageAllVouchersView.click();
			
			Thread.sleep(2000);
			
			String actAfterAuthorizeStatusRow1 = null;
			String actAfterAuthorizeStatusRow2 = null;
			String actAfterAuthorizeStatusRow3 = null;
			String actAfterAuthorizeStatusRow4 = null;
			
			for (int i = 0; i < voucherGridDocNoCount; i++) 
			{
				String data = voucherGridDocNo.get(i).getText();
				
				if (data.equalsIgnoreCase("1")) 
				{
					 actAfterAuthorizeStatusRow1 =  voucherGridAuthorizationStatus.get(i).getText();
				}
				
				if (data.equalsIgnoreCase("2")) 
				{
					 actAfterAuthorizeStatusRow2 =  voucherGridAuthorizationStatus.get(i).getText();
				}
				
				if (data.equalsIgnoreCase("3")) 
				{
					actAfterAuthorizeStatusRow3 =  voucherGridAuthorizationStatus.get(i).getText();
				}
				
				if (data.equalsIgnoreCase("4")) 
				{
					actAfterAuthorizeStatusRow4 =  voucherGridAuthorizationStatus.get(i).getText();
				}
			}
			
			String expAfterAuthorizeStatusRow1 = "Authorized";
			String expAfterAuthorizeStatusRow2 = "Authorized";
			String expAfterAuthorizeStatusRow3 = "Authorized";
			String expAfterAuthorizeStatusRow4 = "Authorized";
			
			
			
			System.out.println("************************************* checkFinancialsPurchasesVoucherNAuthorizationStatusWithUserAllOptions  *********************************");
			
			System.out.println("StatusRow1               : "+actStatusRow1				+" Value Expected : "+expStatusRow1);
			System.out.println("StatusRow2               : "+actStatusRow2				+" Value Expected : "+expStatusRow2);
			System.out.println("StatusRow3               : "+actStatusRow3				+" Value Expected : "+expStatusRow3);
			System.out.println("StatusRow4               : "+actStatusRow4				+" Value Expected : "+expStatusRow4);
			System.out.println("AfterAuthorizeStatusRow1 : "+actAfterAuthorizeStatusRow1+" Value Expected : "+expAfterAuthorizeStatusRow1);
			System.out.println("AfterAuthorizeStatusRow2 : "+actAfterAuthorizeStatusRow2+" Value Expected : "+expAfterAuthorizeStatusRow2);
			System.out.println("AfterAuthorizeStatusRow3 : "+actAfterAuthorizeStatusRow3+" Value Expected : "+expAfterAuthorizeStatusRow3);
			System.out.println("AfterAuthorizeStatusRow4 : "+actAfterAuthorizeStatusRow4+" Value Expected : "+expAfterAuthorizeStatusRow4);
			
			if(actStatusRow1.equalsIgnoreCase(expStatusRow1) && actStatusRow2.equalsIgnoreCase(expStatusRow2) && actStatusRow3.equalsIgnoreCase(expStatusRow3) 
				&& actStatusRow4.equalsIgnoreCase(expStatusRow4) && actAfterAuthorizeStatusRow1.equalsIgnoreCase(expAfterAuthorizeStatusRow1) 
				&& actAfterAuthorizeStatusRow2.equalsIgnoreCase(expAfterAuthorizeStatusRow2) && actAfterAuthorizeStatusRow3.equalsIgnoreCase(expAfterAuthorizeStatusRow3)
				&& actAfterAuthorizeStatusRow4.equalsIgnoreCase(expAfterAuthorizeStatusRow4))
			{
				System.out.println("Test Pass : Authorized Succesfully");
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
				homeCloseBtn.click();
    			Thread.sleep(3000);
				//excelReader.setCellData(xlfile, "SmokeSalesOrder", 627, 9, resPass);
				return true;
			}
			else
			{
				System.out.println("Test Fail : NOT Authorized Succesfully");
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
				homeCloseBtn.click();
    			Thread.sleep(3000);
				//excelReader.setCellData(xlfile, "SmokeSalesOrder", 627, 9, resFail);
				return false;
			}
			
		}
		
		
		
		
		
		
		public static boolean checkLogoutAndLoginWithSUToCheckAuthorizationStatusWithConditionItemAsBRCOGS() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
    	{
    		
    		
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplayLogo));
    		userNameDisplayLogo.click();
   		
   	     	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
   	     	logoutOption.click();

   	     	Thread.sleep(3000);
    		
    		LoginPage lp=new LoginPage(getDriver()); 
    		
    	    String unamelt="su";
    	  
    	    String pawslt="su";
    	      
    	    lp.enterUserName(unamelt);
    	    
    	    lp.enterPassword(pawslt);
    	    
    	    lp.clickOnSignInBtn();
    	    
    	    //checkRefershPopOnlogin();
    	    
    	    //checkPopUpWindow();
    	  
    		Thread.sleep(8000);

    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
			financialsMenu.click();
					
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
			financialsTransactionMenu.click();
				
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
			financialsTransactionsPurchaseMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVoucherNew));
			purchaseVoucherNew.click();
			
			Thread.sleep(3000);
			
			int voucherGridDocNoCount = voucherGridDocNo.size();
			
			String actStatusRow1 = null;
			String actStatusRow2 = null;
			String actStatusRow3 = null;
			String actStatusRow4 = null;
			
			System.out.println("Size  : "+voucherGridDocNoCount);
			
			for (int i = 0; i < voucherGridDocNoCount; i++) 
			{
				String data = voucherGridDocNo.get(i).getText();
				
				if (data.equalsIgnoreCase("1")) 
				{
					 actStatusRow1 =  voucherGridAuthorizationStatus.get(i).getText();
				}
				
				if (data.equalsIgnoreCase("2")) 
				{
					 actStatusRow2 =  voucherGridAuthorizationStatus.get(i).getText();
				}
				
				if (data.equalsIgnoreCase("3")) 
				{
					 actStatusRow3 =  voucherGridAuthorizationStatus.get(i).getText();
				}
				
				if (data.equalsIgnoreCase("4")) 
				{
					 actStatusRow4 =  voucherGridAuthorizationStatus.get(i).getText();
				}
			}
			
			String expStatusRow1 = "Authorized";
			String expStatusRow2 = "Authorized";
			String expStatusRow3 = "Authorized";
			String expStatusRow4 = "Authorized";
			
			
			System.out.println("************************************* checkLogoutAndLoginWithSUToCheckAuthorizationStatus  *********************************");
			
			System.out.println("StatusRow1 : "+actStatusRow1+" Value Expected : "+expStatusRow1);
			System.out.println("StatusRow2 : "+actStatusRow2+" Value Expected : "+expStatusRow2);
			System.out.println("StatusRow3 : "+actStatusRow3+" Value Expected : "+expStatusRow3);
			System.out.println("StatusRow4 : "+actStatusRow4+" Value Expected : "+expStatusRow4);
			
			if(actStatusRow1.equalsIgnoreCase(expStatusRow1) && actStatusRow2.equalsIgnoreCase(expStatusRow2) && actStatusRow3.equalsIgnoreCase(expStatusRow3)
				&& actStatusRow4.equalsIgnoreCase(expStatusRow4))
			{
				System.out.println("Test Pass : Authorize Succesfully");
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
				homeCloseBtn.click();
    			Thread.sleep(2000);
				//excelReader.setCellData(xlfile, "SmokeSalesOrder", 627, 9, resPass);
				return true;
			}
			else
			{
				System.out.println("Test Fail : NOT Authorize Succesfully");
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
				homeCloseBtn.click();
    			Thread.sleep(2000);
				//excelReader.setCellData(xlfile, "SmokeSalesOrder", 627, 9, resFail);
				return false;
			}
			
		}
    		
    		
    	
		
		
		public boolean checkEraseAllTransactionsAfterVerifyingTransactionsWithItemAsBRCOGS() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
			homeMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dataMangementMenu));
			dataMangementMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(eraseAll));
			eraseAll.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(eraseTranscationsRadio));
			eraseTranscationsRadio.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(eraseAllOkBtn));
			eraseAllOkBtn.click();
			
			if(getIsAlertPresent())
			{
				getWaitForAlert();
				
				getAlert().accept();
			}
			
			String expValidationMsg = "Data deleted successfully.";
			
			String actValidationMsg = checkValidationMessage(expValidationMsg);
			
			System.out.println("************************************* CheckSavingPurchaseVoucherWithCovertOptionWithAllMandatoryFields  *********************************");
			System.out.println("Message  :  "+actValidationMsg +" Value Expected : "+expValidationMsg);
			
			if (actValidationMsg.equalsIgnoreCase(expValidationMsg))
			{
				return true;
			}
			else
			{
				return false;
			}
		}
    	
			
		
		
		
		
		// Condition Tab Line wise Authorization Option

		public boolean 	checkEditAndChangingConditonAsLineWiseAuthorization() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
    	{
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsmenuBtn));
    		settingsmenuBtn.click();
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(transactionAuthorizationBtn));
    		transactionAuthorizationBtn.click();
    		
    		Thread.sleep(2000);
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNameDropdown));
    		documentNameDropdown.sendKeys(" ");
    			
    		Thread.sleep(1000);
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchasevoucherExpandbutton));
    		purchasevoucherExpandbutton.click();
    	
            getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchasevoucherTypeCreatedVoucher));
    		purchasevoucherTypeCreatedVoucher.click();
    		
    		Thread.sleep(3000);
    				
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
    		nameTxt.click();
    		
    		nameTxt.sendKeys(Keys.SPACE);
    		
    		int namecount=tranAuthNameList.size();
			
			for(int i=0 ; i < namecount ;i++)
			{
				String data=tranAuthNameList.get(i).getText();
				
				if(data.equalsIgnoreCase("Purchase"))
				{
					tranAuthNameList.get(i).click();
					
					break;
				}
			}
				
    		nameTxt.sendKeys(Keys.TAB);
    			
    		Thread.sleep(3000);
    		click(cnrBtn);
    		Thread.sleep(1000);
    		
    		ClickUsingJs(Level1editBtn);
    		Thread.sleep(1000);
    		
    		//getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(Level1editBtn));
    		//Level1editBtn.click();
    		
    		Thread.sleep(2000);
    		
    		if(conditionNotRequiredChkBox.isSelected()==false){
    		
    		//getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(conditionNotRequiredChkBox));
    		//conditionNotRequiredChkBox.click();
    			ClickUsingJs(conditionNotRequiredChkBox);
    		}
    		Thread.sleep(1000);
    		if(lineWiseAuthorizationChkBox.isSelected()==false){
    		moveToElement(lineWiseAuthorizationChkBox);
    		}
    		//getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(lineWiseAuthorizationChkBox));
    		//lineWiseAuthorizationChkBox.click();
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(definitionOkBtn));
    		definitionOkBtn.click();
    		
    		Thread.sleep(2000);
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(tranAuthSaveBtn));
    		tranAuthSaveBtn.click();
    		
    		String expValidationMsg="Authorization Flow saved successfully.";
    		
    		String actValidationMsg=checkValidationMessage(expValidationMsg);
    		
    		
    		System.out.println("Validation Message : "+actValidationMsg+"  Value Expected : "+expValidationMsg);
    		
    		if(actValidationMsg.equalsIgnoreCase(expValidationMsg))
    		{
    			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(tranAuthCancelBtn));
    			tranAuthCancelBtn.click();
    			return true;
    		}
    		else
    		{
    			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(tranAuthCancelBtn));
    			tranAuthCancelBtn.click();
    			return false;
    		}
    	}
    	
    	
		
		
		
		
		
		
		public static boolean checkFinancialsPurchasesVoucherNSavingVoucher1WithLineWiseAuthorizationCondition() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
			financialsMenu.click();
					
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
			financialsTransactionMenu.click();
				
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
			financialsTransactionsPurchaseMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVoucherNew));
			purchaseVoucherNew.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
			newBtn.click();
			
			checkValidationMessage("Screen opened");
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseAccountTxt));
			purchaseAccountTxt.click();
			purchaseAccountTxt.sendKeys("Purchase");
			
			Thread.sleep(2000);
			
			purchaseAccountTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
			vendorAccountTxt.click();
			vendorAccountTxt.sendKeys("Vendor A");
			
			Thread.sleep(2000);
			
			vendorAccountTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
			departmentTxt.click();
			departmentTxt.sendKeys("INDIA");
			
			Thread.sleep(2000);
			
			departmentTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(wareHouseTxt));
			wareHouseTxt.click();
			wareHouseTxt.sendKeys("HYDERABAD");
			
			Thread.sleep(2000);
			
			wareHouseTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
			select1stRow_1stColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
			enter_ItemTxt.sendKeys("BR COGS ITEM");
			Thread.sleep(3000);
			enter_ItemTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_5thColumn));
			select1stRow_5thColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
			enter_Quantity.sendKeys("1");
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_7thColumn));
			select1stRow_7thColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
			/*enter_Rate.sendKeys(Keys.END);
			enter_Rate.sendKeys(Keys.SHIFT, Keys.HOME);
			enter_Rate.sendKeys(Keys.BACK_SPACE);*/
			enter_Rate.sendKeys("10");
			enter_Rate.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
			enter_Gross.sendKeys(Keys.TAB);
			
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select2ndRow_1stColumn));
			select2ndRow_1stColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
			enter_ItemTxt.sendKeys("BR COGS ITEM");
			Thread.sleep(3000);
			enter_ItemTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select2ndRow_5thColumn));
			select2ndRow_5thColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
			enter_Quantity.sendKeys("1");
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select2ndRow_7thColumn));
			select2ndRow_7thColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
			/*enter_Rate.sendKeys(Keys.END);
			enter_Rate.sendKeys(Keys.SHIFT, Keys.HOME);
			enter_Rate.sendKeys(Keys.BACK_SPACE);*/
			enter_Rate.sendKeys("10");
			enter_Rate.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
			enter_Gross.sendKeys(Keys.TAB);

			
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select3rdRow_1stColumn));
			select3rdRow_1stColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
			enter_ItemTxt.sendKeys("BR COGS ITEM");
			Thread.sleep(3000);
			enter_ItemTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select3rdRow_5thColumn));
			select3rdRow_5thColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
			enter_Quantity.sendKeys("1");
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select3rdRow_7thColumn));
			select3rdRow_7thColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
			/*enter_Rate.sendKeys(Keys.END);
			enter_Rate.sendKeys(Keys.SHIFT, Keys.HOME);
			enter_Rate.sendKeys(Keys.BACK_SPACE);*/
			enter_Rate.sendKeys("10");
			enter_Rate.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
			enter_Gross.sendKeys(Keys.TAB);
			
			
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select4thRow_1stColumn));
			select4thRow_1stColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
			enter_ItemTxt.sendKeys("BR COGS ITEM");
			Thread.sleep(3000);
			enter_ItemTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select4thRow_5thColumn));
			select4thRow_5thColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
			enter_Quantity.sendKeys("1");
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select4thRow_7thColumn));
			select4thRow_7thColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
			/*enter_Rate.sendKeys(Keys.END);
			enter_Rate.sendKeys(Keys.SHIFT, Keys.HOME);
			enter_Rate.sendKeys(Keys.BACK_SPACE);*/
			enter_Rate.sendKeys("10");
			enter_Rate.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
			enter_Gross.sendKeys(Keys.TAB);
			
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select5thRow_1stColumn));
			select5thRow_1stColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
			enter_ItemTxt.sendKeys("BR COGS ITEM");
			Thread.sleep(3000);
			enter_ItemTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select5thRow_5thColumn));
			select5thRow_5thColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
			enter_Quantity.sendKeys("1");
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select5thRow_7thColumn));
			select5thRow_7thColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
			/*enter_Rate.sendKeys(Keys.END);
			enter_Rate.sendKeys(Keys.SHIFT, Keys.HOME);
			enter_Rate.sendKeys(Keys.BACK_SPACE);*/
			enter_Rate.sendKeys("10");
			enter_Rate.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
			enter_Gross.sendKeys(Keys.TAB);
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
			saveBtn.click();
			
			Thread.sleep(3000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
			billRefPickIcon.click();
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
			billRefOkBtn.click();
			
			Thread.sleep(1000);
			
			String expMessage1= "Voucher saved successfully";
			String expMessage2= ": 1";
			
			String actMessage = checkValidationMessage(expMessage1);
			
			Thread.sleep(2000);
			
		   System.out.println("************************************* checkFinancialsPurchasesVoucherNSavingVoucher1WithLineWiseAuthorizationCondition  *********************************");
		   
		   System.out.println("SavingMessage  :  "+actMessage +" Value Expected : "+expMessage1+" "+expMessage2);
	
		   if(actMessage.startsWith(expMessage1) && actMessage.endsWith(expMessage2))
    		{
    			return true;
    		}
    		else
    		{
    			return false;
    		}
    	}
		
		
			
		
		
		
		
		public static boolean checkFinancialsPurchasesVoucherNSavingVoucher2WithLineWiseAuthorizationCondition() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(previousBtn));
			previousBtn.click();
			
			checkValidationMessage("Voucher Loaded Successfully");
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(toggleBtn));
			toggleBtn.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(copyToClipBoardOption));
			copyToClipBoardOption.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_newBtn));
			new_newBtn.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(toggleBtn));
			toggleBtn.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pasteFromClipBoardOption));
			pasteFromClipBoardOption.click();
			
			
			String expCopyDocMsg = "Paste from clipboard completed successfully";
			
			String actCopyDocMsg = checkValidationMessage(expCopyDocMsg);
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
			saveBtn.click();
			
			Thread.sleep(3000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
			billRefPickIcon.click();
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
			billRefOkBtn.click();
			
			String expMessage1= "Voucher saved successfully";
			String expMessage2= ": 2";
			
			String actMessage = checkValidationMessage(expMessage1);
			
			Thread.sleep(2000);
			
		   System.out.println("************************************* checkFinancialsPurchasesVoucherNSavingVoucher2WithLineWiseAuthorizationCondition  *********************************");
		   
		   System.out.println("CopyDocMsg     :  "+actCopyDocMsg +" Value Expected : "+expCopyDocMsg);
		   System.out.println("SavingMessage  :  "+actMessage    +" Value Expected : "+expMessage1+" "+expMessage2);
	
		   if(actCopyDocMsg.contains(expCopyDocMsg) && actMessage.startsWith(expMessage1) && actMessage.endsWith(expMessage2))
    		{
    			return true;
    		}
    		else
    		{
    			return false;
    		}
    	}
		
		
		
		
		
		
		public static boolean checkFinancialsPurchasesVoucherNSavingVoucher3WithLineWiseAuthorizationCondition() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(toggleBtn));
			toggleBtn.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pasteFromClipBoardOption));
			pasteFromClipBoardOption.click();
			
			String expCopyDocMsg = "Paste from clipboard completed successfully";
			
			String actCopyDocMsg = checkValidationMessage(expCopyDocMsg);
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
			saveBtn.click();
			
			Thread.sleep(3000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
			billRefPickIcon.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
			billRefOkBtn.click();
			
			String expMessage1= "Voucher saved successfully";
			String expMessage2= ": 3";
			
			String actMessage = checkValidationMessage(expMessage1);
			
			Thread.sleep(2000);
			
		   System.out.println("************************************* checkFinancialsPurchasesVoucherNSavingVoucher3WithLineWiseAuthorizationCondition  *********************************");
		   
		   System.out.println("CopyDocMsg     :  "+actCopyDocMsg +" Value Expected : "+expCopyDocMsg);
		   System.out.println("SavingMessage  :  "+actMessage    +" Value Expected : "+expMessage1+" "+expMessage2);
	
		   if(actCopyDocMsg.contains(expCopyDocMsg) && actMessage.startsWith(expMessage1) && actMessage.endsWith(expMessage2))
    		{
    			return true;
    		}
    		else
    		{
    			return false;
    		}
    	}
			
		
		
		
		
		
		public static boolean checkFinancialsPurchasesVoucherNSavingVoucher4WithLineWiseAuthorizationCondition() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(toggleBtn));
			toggleBtn.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pasteFromClipBoardOption));
			pasteFromClipBoardOption.click();
			
			String expCopyDocMsg = "Paste from clipboard completed successfully";
			
			String actCopyDocMsg = checkValidationMessage(expCopyDocMsg);
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
			saveBtn.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
			billRefPickIcon.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
			billRefOkBtn.click();
			
			String expMessage1= "Voucher saved successfully";
			String expMessage2= ": 4";
			
			String actMessage = checkValidationMessage(expMessage1);
			
			Thread.sleep(2000);
			
		   System.out.println("************************************* checkFinancialsPurchasesVoucherNSavingVoucher4WithLineWiseAuthorizationCondition  *********************************");
		   
		   System.out.println("CopyDocMsg     :  "+actCopyDocMsg +" Value Expected : "+expCopyDocMsg);
		   System.out.println("SavingMessage  :  "+actMessage    +" Value Expected : "+expMessage1+" "+expMessage2);
	
		   if(actCopyDocMsg.contains(expCopyDocMsg) && actMessage.startsWith(expMessage1) && actMessage.endsWith(expMessage2))
    		{
    			return true;
    		}
    		else
    		{
    			return false;
    		}
    	}
			
		
		
		
		
		
		public static boolean checkFinancialsPurchasesVoucherNSavingVoucher5WithLineWiseAuthorizationCondition() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(toggleBtn));
			toggleBtn.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pasteFromClipBoardOption));
			pasteFromClipBoardOption.click();
			
			String expCopyDocMsg = "Paste from clipboard completed successfully";
			
			String actCopyDocMsg = checkValidationMessage(expCopyDocMsg);
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
			saveBtn.click();
			
			Thread.sleep(3000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
			billRefPickIcon.click();
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
			billRefOkBtn.click();
			
			String expMessage1= "Voucher saved successfully";
			String expMessage2= ": 5";
			
			String actMessage = checkValidationMessage(expMessage1);
			
			Thread.sleep(2000);
			
		   System.out.println("************************************* checkFinancialsPurchasesVoucherNSavingVoucher5WithLineWiseAuthorizationCondition  *********************************");
		   
		   System.out.println("CopyDocMsg     :  "+actCopyDocMsg +" Value Expected : "+expCopyDocMsg);
		   System.out.println("SavingMessage  :  "+actMessage    +" Value Expected : "+expMessage1+" "+expMessage2);
	
		   getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
			new_CloseBtn.click();
			
			Thread.sleep(2000);
			
		   if(actCopyDocMsg.contains(expCopyDocMsg) && actMessage.startsWith(expMessage1) && actMessage.endsWith(expMessage2))
    		{
    			return true;
    		}
    		else
    		{
    			return false;
    		}
    	}
			
			
    	
	
		
		
		
		
    	
    	
    	public static boolean checkFinancialsPurchasesVoucherNAuthorizationStatusWithLineWiseAuthorizationOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			int voucherGridDocNoCount = voucherGridDocNo.size();
			
			String actStatusRow1 = null;
			String actStatusRow2 = null;
			String actStatusRow3 = null;
			String actStatusRow4 = null;
			String actStatusRow5 = null;
			
			System.out.println("Size  : "+voucherGridDocNoCount);
			
			for (int i = 0; i < voucherGridDocNoCount; i++) 
			{
				String data = voucherGridDocNo.get(i).getText();
				
				if (data.equalsIgnoreCase("1")) 
				{
					 actStatusRow1 =  voucherGridAuthorizationStatus.get(i).getText();
				}
				
				if (data.equalsIgnoreCase("2")) 
				{
					 actStatusRow2 =  voucherGridAuthorizationStatus.get(i).getText();
				}
				
				if (data.equalsIgnoreCase("3")) 
				{
					 actStatusRow3 =  voucherGridAuthorizationStatus.get(i).getText();
				}
				
				if (data.equalsIgnoreCase("4")) 
				{
					 actStatusRow4 =  voucherGridAuthorizationStatus.get(i).getText();
				}
				
				if (data.equalsIgnoreCase("5")) 
				{
					 actStatusRow5 =  voucherGridAuthorizationStatus.get(i).getText();
				}
			}
			
			String expStatusRow1 = "Pending";
			String expStatusRow2 = "Pending";
			String expStatusRow3 = "Pending";
			String expStatusRow4 = "Pending";
			String expStatusRow5 = "Pending";
			
			Thread.sleep(2000);
			
			System.out.println("************************************* checkFinancialsPurchasesVoucherNAuthorizationStatusWithLineWiseAuthorizationOption  *********************************");
			
			System.out.println("StatusRow1               : "+actStatusRow1				+" Value Expected : "+expStatusRow1);
			System.out.println("StatusRow2               : "+actStatusRow2				+" Value Expected : "+expStatusRow2);
			System.out.println("StatusRow3               : "+actStatusRow3				+" Value Expected : "+expStatusRow3);
			System.out.println("StatusRow4               : "+actStatusRow4				+" Value Expected : "+expStatusRow4);
			System.out.println("StatusRow5               : "+actStatusRow5				+" Value Expected : "+expStatusRow5);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
			homeCloseBtn.click();
			
			Thread.sleep(2000);
			
			if(actStatusRow1.equalsIgnoreCase(expStatusRow1) && actStatusRow2.equalsIgnoreCase(expStatusRow2) && actStatusRow3.equalsIgnoreCase(expStatusRow3) 
				&& actStatusRow4.equalsIgnoreCase(expStatusRow4) && actStatusRow5.equalsIgnoreCase(expStatusRow5))
			{
				return true;
			}
			else
			{
				return false;
			}
			
		}
    	
    	
    	
    	
    	
    	
    	
    	
    	public static boolean checkLogoutAndLoginWithUserAllOptionsWithConditionLineWiseAuthorization() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
    	{
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplayLogo));
    		userNameDisplayLogo.click();
   		
   	     	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
   	     	logoutOption.click();

   	     	Thread.sleep(3000);
    		
    		LoginPage lp=new LoginPage(getDriver()); 
    		
    	    String unamelt="UserAllOptions";
    	  
    	    String pawslt="12345";
    	      
    	    lp.enterUserName(unamelt);
    	    
    	    lp.enterPassword(pawslt);
    	    
    	    lp.clickOnSignInBtn();
    	    
    		Thread.sleep(5000);

    		if (dashboard.isDisplayed()) 
    		{
				return true;
			}
    		else
    		{
    			return false;
			}
    	}
			
		
		
		
		
		
		public static boolean checkFinancialsPurchasesVoucherNAuthorizationStatusWithUserAllOptionsWithConditionLineWiseAuthorization() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
			financialsMenu.click();
					
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
			financialsTransactionMenu.click();
				
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
			financialsTransactionsPurchaseMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVoucherNew));
			purchaseVoucherNew.click();
			
			Thread.sleep(3000);
			
			int voucherGridDocNoCount = voucherGridDocNo.size();
			
			String actStatusRow1 = null;
			String actStatusRow2 = null;
			String actStatusRow3 = null;
			String actStatusRow4 = null;
			String actStatusRow5 = null;
			
			System.out.println("Size  : "+voucherGridDocNoCount);
			
			for (int i = 0; i < voucherGridDocNoCount; i++) 
			{
				String data = voucherGridDocNo.get(i).getText();
				
				if (data.equalsIgnoreCase("1")) 
				{
					 actStatusRow1 =  voucherGridAuthorizationStatus.get(i).getText();
				}
				
				if (data.equalsIgnoreCase("2")) 
				{
					 actStatusRow2 =  voucherGridAuthorizationStatus.get(i).getText();
				}
				
				if (data.equalsIgnoreCase("3")) 
				{
					 actStatusRow3 =  voucherGridAuthorizationStatus.get(i).getText();
				}
				
				if (data.equalsIgnoreCase("4")) 
				{
					 actStatusRow4 =  voucherGridAuthorizationStatus.get(i).getText();
				}
				
				if (data.equalsIgnoreCase("5")) 
				{
					 actStatusRow5 =  voucherGridAuthorizationStatus.get(i).getText();
				}
			}
			
			String expStatusRow1 = "Pending";
			String expStatusRow2 = "Pending";
			String expStatusRow3 = "Pending";
			String expStatusRow4 = "Pending";
			String expStatusRow5 = "Pending";
			
			Thread.sleep(2000);
			
			System.out.println("************************************* checkFinancialsPurchasesVoucherNAuthorizationStatusWithUserAllOptionsWithConditionLineWiseAuthorization  *********************************");
			
			System.out.println("StatusRow1               : "+actStatusRow1				+" Value Expected : "+expStatusRow1);
			System.out.println("StatusRow2               : "+actStatusRow2				+" Value Expected : "+expStatusRow2);
			System.out.println("StatusRow3               : "+actStatusRow3				+" Value Expected : "+expStatusRow3);
			System.out.println("StatusRow4               : "+actStatusRow4				+" Value Expected : "+expStatusRow4);
			System.out.println("StatusRow5               : "+actStatusRow5				+" Value Expected : "+expStatusRow5);
			
			if(actStatusRow1.equalsIgnoreCase(expStatusRow1) && actStatusRow2.equalsIgnoreCase(expStatusRow2) && actStatusRow3.equalsIgnoreCase(expStatusRow3) 
				&& actStatusRow4.equalsIgnoreCase(expStatusRow4) && actStatusRow5.equalsIgnoreCase(expStatusRow5))
			{
				System.out.println("Test Pass : Authorized Succesfully");
				//excelReader.setCellData(xlfile, "SmokeSalesOrder", 627, 9, resPass);
				return true;
			}
			else
			{
				System.out.println("Test Fail : NOT Authorized Succesfully");
				//excelReader.setCellData(xlfile, "SmokeSalesOrder", 627, 9, resFail);
				return false;
			}
		}
		
		
		
		
		
		
		
		public static boolean checkAuthorizingLineWiseInVoucher1() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
    	{
			Thread.sleep(1000);
			click(homePageVoucherArrowBtn);
			Thread.sleep(1000);
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pendingAuthorizationPurchases));
    		pendingAuthorizationPurchases.click();
    		
    		Thread.sleep(2000);

			int voucherGridDocNoCount = voucherGridDocNo.size();
			
			System.out.println("Size  : "+voucherGridDocNoCount);
			
			for (int i = 0; i < voucherGridDocNoCount; i++) 
			{
				String data = voucherGridDocNo.get(i).getText();
				
				if (data.equalsIgnoreCase("1")) 
				{
					getAction().doubleClick(voucherGridAuthorizationStatus.get(i)).build().perform();
				}
			}
			
			checkValidationMessage("Voucher Loaded Successfully");
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_AuthorizeBtn));
			new_AuthorizeBtn.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(lineWiseAuthHeaderChkBox));
			lineWiseAuthHeaderChkBox.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(lineWiseAuthHeaderAuthorizeBtn));
			lineWiseAuthHeaderAuthorizeBtn.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(lineWiseAuthorizationOkBtn));
			lineWiseAuthorizationOkBtn.click();
			
			Thread.sleep(2000);
			
			click(documentInfoExpandBtn);
			Thread.sleep(1000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_DocumentInfoStatusTxt));
			String actStatus = new_DocumentInfoStatusTxt.getText();
			String expStatus = "Approved";
			
			System.out.println("************************************* checkAuthorizingLineWiseInVoucher1  *********************************");
			
			System.out.println("Authorization Status in Voucher Entry Page : "+actStatus+" Value Expected : "+expStatus);
			
			if(actStatus.equalsIgnoreCase(expStatus))
			{
				System.out.println("Test Pass : Authorize Succesfully");
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
				new_CloseBtn.click();
				Thread.sleep(2000);
				//excelReader.setCellData(xlfile, "SmokeSalesOrder", 627, 9, resPass);
				return true;
			}
			else
			{
				System.out.println("Test Fail : NOT Authorize Succesfully");
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
				new_CloseBtn.click();
				Thread.sleep(2000);
				//excelReader.setCellData(xlfile, "SmokeSalesOrder", 627, 9, resFail);
				return false;
			}
		}
    		
		
		
		
		
		
		public static boolean checkAuthorizingLineWiseInVoucher2() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
    	{
    		
			Thread.sleep(1000);
			click(homePageVoucherArrowBtn);
			Thread.sleep(1000);
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pendingAuthorizationPurchases));
    		pendingAuthorizationPurchases.click();
    		
    		Thread.sleep(2000);

			int voucherGridDocNoCount = voucherGridDocNo.size();
			
			System.out.println("Size  : "+voucherGridDocNoCount);
			
			for (int i = 0; i < voucherGridDocNoCount; i++) 
			{
				String data = voucherGridDocNo.get(i).getText();
				
				if (data.equalsIgnoreCase("2")) 
				{
					getAction().doubleClick(voucherGridAuthorizationStatus.get(i)).build().perform();
				}
			}
			
			checkValidationMessage("Voucher Loaded Successfully");
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_AuthorizeBtn));
			new_AuthorizeBtn.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(lineWiseAuthHeaderChkBox));
			lineWiseAuthHeaderChkBox.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(lineWiseAuthHeaderRejectBtn));
			lineWiseAuthHeaderRejectBtn.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(lineWiseAuthorizationOkBtn));
			lineWiseAuthorizationOkBtn.click();
			
			Thread.sleep(2000);
			
			click(documentInfoExpandBtn);
			Thread.sleep(1000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_DocumentInfoStatusTxt));
			String actStatus = new_DocumentInfoStatusTxt.getText();
			String expStatus = "Rejected";
			
			System.out.println("************************************* checkAuthorizingLineWiseInVoucher2  *********************************");
			
			System.out.println("Authorization Status in Voucher Entry Page : "+actStatus+" Value Expected : "+expStatus);
			
			if(actStatus.equalsIgnoreCase(expStatus))
			{
				System.out.println("Test Pass : Authorize Succesfully");
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
				new_CloseBtn.click();
				Thread.sleep(2000);
				//excelReader.setCellData(xlfile, "SmokeSalesOrder", 627, 9, resPass);
				return true;
			}
			else
			{
				System.out.println("Test Fail : NOT Authorize Succesfully");
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
				new_CloseBtn.click();
				Thread.sleep(2000);
				//excelReader.setCellData(xlfile, "SmokeSalesOrder", 627, 9, resFail);
				return false;
			}
		}
		
		
		
		
		
		
		public static boolean checkAuthorizingLineWiseInVoucher3() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
    	{
    		
			Thread.sleep(1000);
			click(homePageVoucherArrowBtn);
			Thread.sleep(1000);
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pendingAuthorizationPurchases));
    		pendingAuthorizationPurchases.click();
    		
    		Thread.sleep(2000);

			int voucherGridDocNoCount = voucherGridDocNo.size();
			
			System.out.println("Size  : "+voucherGridDocNoCount);
			
			for (int i = 0; i < voucherGridDocNoCount; i++) 
			{
				String data = voucherGridDocNo.get(i).getText();
				
				if (data.equalsIgnoreCase("3")) 
				{
					getAction().doubleClick(voucherGridAuthorizationStatus.get(i)).build().perform();
				}
			}
			
			checkValidationMessage("Voucher Loaded Successfully");
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_AuthorizeBtn));
			new_AuthorizeBtn.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(lineWiseAuthHeaderChkBox));
			lineWiseAuthHeaderChkBox.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(lineWiseAuthHeaderBanBtn));
			lineWiseAuthHeaderBanBtn.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(lineWiseAuthorizationOkBtn));
			lineWiseAuthorizationOkBtn.click();
			
			Thread.sleep(2000);
			click(documentInfoExpandBtn);
			Thread.sleep(1000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_DocumentInfoStatusTxt));
			String actStatus = new_DocumentInfoStatusTxt.getText();
			String expStatus = "Stopped";
			
			System.out.println("************************************* checkAuthorizingLineWiseInVoucher3  *********************************");
			
			System.out.println("Authorization Status in Voucher Entry Page : "+actStatus+" Value Expected : "+expStatus);
			
			if(actStatus.equalsIgnoreCase(expStatus))
			{
				System.out.println("Test Pass : Authorize Succesfully");
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
				new_CloseBtn.click();
				Thread.sleep(2000);
				//excelReader.setCellData(xlfile, "SmokeSalesOrder", 627, 9, resPass);
				return true;
			}
			else
			{
				System.out.println("Test Fail : NOT Authorize Succesfully");
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
				new_CloseBtn.click();
				Thread.sleep(2000);
				//excelReader.setCellData(xlfile, "SmokeSalesOrder", 627, 9, resFail);
				return false;
			}
		}
		
		
		
		
		
		
		public static boolean checkAuthorizingLineWiseInVoucher4() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
    	{
    		
			Thread.sleep(1000);
			click(homePageVoucherArrowBtn);
			Thread.sleep(1000);
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pendingAuthorizationPurchases));
    		pendingAuthorizationPurchases.click();
    		
    		Thread.sleep(2000);

			int voucherGridDocNoCount = voucherGridDocNo.size();
			
			System.out.println("Size  : "+voucherGridDocNoCount);
			
			for (int i = 0; i < voucherGridDocNoCount; i++) 
			{
				String data = voucherGridDocNo.get(i).getText();
				
				if (data.equalsIgnoreCase("4")) 
				{
					getAction().doubleClick(voucherGridAuthorizationStatus.get(i)).build().perform();
				}
			}
			
			checkValidationMessage("Voucher Loaded Successfully");
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_AuthorizeBtn));
			new_AuthorizeBtn.click();
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(lineWiseAuthRow1ChkBox));
			lineWiseAuthRow1ChkBox.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(lineWiseAuthRow1AuthorizeBtn));
			lineWiseAuthRow1AuthorizeBtn.click();
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(lineWiseAuthRow2ChkBox));
			lineWiseAuthRow2ChkBox.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(lineWiseAuthRow2AuthorizeBtn));
			lineWiseAuthRow2AuthorizeBtn.click();
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(lineWiseAuthRow3ChkBox));
			lineWiseAuthRow3ChkBox.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(lineWiseAuthRow3AuthorizeBtn));
			lineWiseAuthRow3AuthorizeBtn.click();
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(lineWiseAuthorizationOkBtn));
			lineWiseAuthorizationOkBtn.click();
			
			Thread.sleep(2000);
			
			click(documentInfoExpandBtn);
			Thread.sleep(1000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_DocumentInfoStatusTxt));
			String actStatus = new_DocumentInfoStatusTxt.getText();
			String expStatus = "Partial";
			
			System.out.println("************************************* checkAuthorizingLineWiseInVoucher4  *********************************");
			
			System.out.println("Authorization Status in Voucher Entry Page : "+actStatus+" Value Expected : "+expStatus);
			
			if(actStatus.equalsIgnoreCase(expStatus))
			{
				System.out.println("Test Pass : Authorize Succesfully");
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
				new_CloseBtn.click();
				Thread.sleep(2000);
				//excelReader.setCellData(xlfile, "SmokeSalesOrder", 627, 9, resPass);
				return true;
			}
			else
			{
				System.out.println("Test Fail : NOT Authorize Succesfully");
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
				new_CloseBtn.click();
				Thread.sleep(2000);
				//excelReader.setCellData(xlfile, "SmokeSalesOrder", 627, 9, resFail);
				return false;
			}
		}
		
		
		
		
		
		
		public static boolean checkAuthorizingLineWiseInVoucher5() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
    	{
    		
			Thread.sleep(1000);
			click(homePageVoucherArrowBtn);
			Thread.sleep(1000);
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pendingAuthorizationPurchases));
    		pendingAuthorizationPurchases.click();
    		
    		Thread.sleep(2000);

			int voucherGridDocNoCount = voucherGridDocNo.size();
			
			System.out.println("Size  : "+voucherGridDocNoCount);
			
			for (int i = 0; i < voucherGridDocNoCount; i++) 
			{
				String data = voucherGridDocNo.get(i).getText();
				
				if (data.equalsIgnoreCase("5")) 
				{
					getAction().doubleClick(voucherGridAuthorizationStatus.get(i)).build().perform();
				}
			}
			
			checkValidationMessage("Voucher Loaded Successfully");
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_AuthorizeBtn));
			new_AuthorizeBtn.click();
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(lineWiseAuthRow1ChkBox));
			lineWiseAuthRow1ChkBox.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(lineWiseAuthRow1AuthorizeBtn));
			lineWiseAuthRow1AuthorizeBtn.click();
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(lineWiseAuthRow2ChkBox));
			lineWiseAuthRow2ChkBox.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(lineWiseAuthRow2AuthorizeBtn));
			lineWiseAuthRow2AuthorizeBtn.click();
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(lineWiseAuthRow3ChkBox));
			lineWiseAuthRow3ChkBox.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(lineWiseAuthRow3RejectBtn));
			lineWiseAuthRow3RejectBtn.click();
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(lineWiseAuthRow4ChkBox));
			lineWiseAuthRow4ChkBox.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(lineWiseAuthRow4RejectBtn));
			lineWiseAuthRow4RejectBtn.click();
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(lineWiseAuthRow5ChkBox));
			lineWiseAuthRow5ChkBox.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(lineWiseAuthRow5BanBtn));
			lineWiseAuthRow5BanBtn.click();
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(lineWiseAuthorizationOkBtn));
			lineWiseAuthorizationOkBtn.click();
			
			Thread.sleep(2000);
			
			click(documentInfoExpandBtn);
			Thread.sleep(1000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_DocumentInfoStatusTxt));
			String actStatus = new_DocumentInfoStatusTxt.getText();
			String expStatus = "Stopped";
			
			System.out.println("************************************* checkAuthorizingLineWiseInVoucher5  *********************************");
			
			System.out.println("Authorization Status in Voucher Entry Page : "+actStatus+" Value Expected : "+expStatus);
			
			if(actStatus.equalsIgnoreCase(expStatus))
			{
				System.out.println("Test Pass : Authorize Succesfully");
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
				new_CloseBtn.click();
				Thread.sleep(2000);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
				homeCloseBtn.click();
				Thread.sleep(2000);
				//excelReader.setCellData(xlfile, "SmokeSalesOrder", 627, 9, resPass);
				return true;
			}
			else
			{
				System.out.println("Test Fail : NOT Authorize Succesfully");
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
				new_CloseBtn.click();
				Thread.sleep(2000);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
				homeCloseBtn.click();
				Thread.sleep(2000);
				//excelReader.setCellData(xlfile, "SmokeSalesOrder", 627, 9, resFail);
				return false;
			}
		}
		
		
		
		
		
		
		public static boolean checkLogoutAndLoginWithSUToCheckAuthorizationStatusWithConditionLineWiseAuthorization() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
    	{
    		
    		
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplayLogo));
    		userNameDisplayLogo.click();
   		
   	     	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
   	     	logoutOption.click();

   	     	Thread.sleep(3000);
    		
    		LoginPage lp=new LoginPage(getDriver()); 
    		
    	    String unamelt="su";
    	  
    	    String pawslt="su";
    	      
    	    lp.enterUserName(unamelt);
    	    
    	    lp.enterPassword(pawslt);
    	    
    	    lp.clickOnSignInBtn();
    	    
    	    //checkRefershPopOnlogin();
    	    
    	    //checkPopUpWindow();
    	  
    		Thread.sleep(8000);

    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
			financialsMenu.click();
					
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
			financialsTransactionMenu.click();
				
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
			financialsTransactionsPurchaseMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVoucherNew));
			purchaseVoucherNew.click();
			
			Thread.sleep(3000);
			
			int voucherGridDocNoCount = voucherGridDocNo.size();
			
			String actStatusRow1 = null;
			String actStatusRow2 = null;
			String actStatusRow3 = null;
			String actStatusRow4 = null;
			String actStatusRow5 = null;
			
			System.out.println("Size  : "+voucherGridDocNoCount);
			
			for (int i = 0; i < voucherGridDocNoCount; i++) 
			{
				String data = voucherGridDocNo.get(i).getText();
				
				if (data.equalsIgnoreCase("1")) 
				{
					 actStatusRow1 =  voucherGridAuthorizationStatus.get(i).getText();
				}
				
				if (data.equalsIgnoreCase("2")) 
				{
					 actStatusRow2 =  voucherGridAuthorizationStatus.get(i).getText();
				}
				
				if (data.equalsIgnoreCase("3")) 
				{
					 actStatusRow3 =  voucherGridAuthorizationStatus.get(i).getText();
				}
				
				if (data.equalsIgnoreCase("4")) 
				{
					 actStatusRow4 =  voucherGridAuthorizationStatus.get(i).getText();
				}
				
				if (data.equalsIgnoreCase("5")) 
				{
					 actStatusRow5 =  voucherGridAuthorizationStatus.get(i).getText();
				}
			}
			
			String expStatusRow1 = "Authorized";
			String expStatusRow2 = "Rejected";
			String expStatusRow3 = "Stopped";
			String expStatusRow4 = "Partial";
			String expStatusRow5 = "Partial";
			
			
			System.out.println("************************************* checkLogoutAndLoginWithSUToCheckAuthorizationStatusWithConditionLineWiseAuthorization  *********************************");
			
			System.out.println("StatusRow1 : "+actStatusRow1+" Value Expected : "+expStatusRow1);
			System.out.println("StatusRow2 : "+actStatusRow2+" Value Expected : "+expStatusRow2);
			System.out.println("StatusRow3 : "+actStatusRow3+" Value Expected : "+expStatusRow3);
			System.out.println("StatusRow4 : "+actStatusRow4+" Value Expected : "+expStatusRow4);
			System.out.println("StatusRow5 : "+actStatusRow5+" Value Expected : "+expStatusRow5);
			
			if(actStatusRow1.equalsIgnoreCase(expStatusRow1) && actStatusRow2.equalsIgnoreCase(expStatusRow2) && actStatusRow3.equalsIgnoreCase(expStatusRow3)
				&& actStatusRow4.equalsIgnoreCase(expStatusRow4) && actStatusRow5.equalsIgnoreCase(expStatusRow5))
			{
				System.out.println("Test Pass : Authorize Succesfully");
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
				homeCloseBtn.click();
    			Thread.sleep(2000);
				//excelReader.setCellData(xlfile, "SmokeSalesOrder", 627, 9, resPass);
				return true;
			}
			else
			{
				System.out.println("Test Fail : NOT Authorize Succesfully");
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
				homeCloseBtn.click();
    			Thread.sleep(2000);
				//excelReader.setCellData(xlfile, "SmokeSalesOrder", 627, 9, resFail);
				return false;
			}
			
		}
    		
    		
    	
		
		
		public boolean checkEraseAllTransactionsAfterVerifyingTransactionsWithLineWiseAuthorization() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
			homeMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dataMangementMenu));
			dataMangementMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(eraseAll));
			eraseAll.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(eraseTranscationsRadio));
			eraseTranscationsRadio.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(eraseAllOkBtn));
			eraseAllOkBtn.click();
			
			if(getIsAlertPresent())
			{
				getWaitForAlert();
				
				getAlert().accept();
			}
			
			String expValidationMsg="Data deleted successfully.";
			
			String actValidationMsg=checkValidationMessage(expValidationMsg);
			
			System.out.println("************************************* CheckSavingPurchaseVoucherWithCovertOptionWithAllMandatoryFields  *********************************");
			System.out.println("Message  :  "+actValidationMsg +" Value Expected : "+expValidationMsg);
			
			if (actValidationMsg.equalsIgnoreCase(expValidationMsg))
			{
				return true;
			}
			else
			{
				return false;
			}
		}
    	
    	
		
		
		
		// Keep Unposted Options
		
		public boolean 	checkEditAndChangingConditonAsKeepUnpostedSelectingFinancialAccountingAndInventory() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
    	{
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsmenuBtn));
    		settingsmenuBtn.click();
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(transactionAuthorizationBtn));
    		transactionAuthorizationBtn.click();
    		
    		Thread.sleep(2000);
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNameDropdown));
    		documentNameDropdown.sendKeys(" ");
    		
    		Thread.sleep(1000);
    			
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchasevoucherExpandbutton));
    		purchasevoucherExpandbutton.click();
    	
            getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchasevoucherTypeCreatedVoucher));
    		purchasevoucherTypeCreatedVoucher.click();
    		
    		Thread.sleep(3000);
    				
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
    		nameTxt.click();
    		
    		nameTxt.sendKeys(Keys.SPACE);
    		
    		int namecount=tranAuthNameList.size();
			
			for(int i=0 ; i < namecount ;i++)
			{
				String data=tranAuthNameList.get(i).getText();
				
				if(data.equalsIgnoreCase("Purchase"))
				{
					tranAuthNameList.get(i).click();
					
					break;
				}
			}
				
    		nameTxt.sendKeys(Keys.TAB);
    			
    		Thread.sleep(3000);
    		
    		click(cnrBtn);
    		Thread.sleep(1000);
    		
    		ClickUsingJs(Level1editBtn);
    		Thread.sleep(1000);
    		
    		//getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(Level1editBtn));
    		//Level1editBtn.click();
    		
    		Thread.sleep(2000);
    		
    		//getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(lineWiseAuthorizationChkBox));
    		//lineWiseAuthorizationChkBox.click();
    		
    		if(lineWiseAuthorizationChkBox.isSelected()==true)
    		{
    			moveToElement(lineWiseAuthorizationChkBox);
    		}
    		
    		ScrollToElement(keepUnpostedfinancialAccountingChkBox);
    		
    		if(keepUnpostedfinancialAccountingChkBox.isSelected()==false) 
    		{
    			//getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(keepUnpostedfinancialAccountingChkBox));
        		//keepUnpostedfinancialAccountingChkBox.click();
    			ClickUsingJs(keepUnpostedfinancialAccountingChkBox);
    		}
    		
    		if(keepUnpostedInventoryChkBox.isSelected()==false) 
    		{
    			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(keepUnpostedInventoryChkBox));
        		keepUnpostedInventoryChkBox.click();
    		}
    		
    		
    		
    		Thread.sleep(2000);
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(definitionOkBtn));
    		definitionOkBtn.click();
    		
    		Thread.sleep(2000);
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(tranAuthSaveBtn));
    		tranAuthSaveBtn.click();
    		
    		String expValidationMsg="Authorization Flow saved successfully.";
    		
    		String actValidationMsg=checkValidationMessage(expValidationMsg);
    		
    		System.out.println("Validation Message : "+actValidationMsg+"  Value Expected : "+expValidationMsg);
    		
    		if(actValidationMsg.equalsIgnoreCase(expValidationMsg))
    		{
    			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(tranAuthCancelBtn));
    			tranAuthCancelBtn.click();
    			return true;
    		}
    		else
    		{
    			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(tranAuthCancelBtn));
    			tranAuthCancelBtn.click();
    			return false;
    		}
    	}
    	
    	
		
		
		
		
		
		
		public static boolean checkFinancialsPurchasesVoucherNSavingVoucher1WithKeepUnpostedFinancialAccountingAndInventoryOptions() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
			financialsMenu.click();
					
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
			financialsTransactionMenu.click();
				
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
			financialsTransactionsPurchaseMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVoucherNew));
			purchaseVoucherNew.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsBtn));
			settingsBtn.click();
			
			Thread.sleep(3000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(miscellaneousTab));
			miscellaneousTab.click();
			
			Thread.sleep(2000);
			click(postingDetailsBtn);
			Thread.sleep(1000);
			
			if(updateStockChkBox.isSelected()==false)
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(updateStockChkBox));
				updateStockChkBox.click();
			}
			
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settings_updateBtn));
			settings_updateBtn.click();
			
			checkValidationMessage("Data saved successfully");
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settings_closeBtn));
			settings_closeBtn.click();
			
			
			Thread.sleep(2000);
			/*
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
			financialsMenu.click();
					
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
			financialsTransactionMenu.click();
				
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
			financialsTransactionsPurchaseMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVoucherNew));
			purchaseVoucherNew.click(); */
			
			
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
			newBtn.click();
			
			checkValidationMessage("Screen opened");
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseAccountTxt));
			purchaseAccountTxt.click();
			purchaseAccountTxt.sendKeys("Purchase");
			
			Thread.sleep(2000);
			
			purchaseAccountTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
			vendorAccountTxt.click();
			vendorAccountTxt.sendKeys("Vendor A");
			
			Thread.sleep(2000);
			
			vendorAccountTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
			departmentTxt.click();
			departmentTxt.sendKeys("INDIA");
			
			Thread.sleep(2000);
			
			departmentTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(wareHouseTxt));
			wareHouseTxt.click();
			wareHouseTxt.sendKeys("HYDERABAD");
			
			Thread.sleep(2000);
			
			wareHouseTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
			select1stRow_1stColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
			enter_ItemTxt.sendKeys("STD RATE COGS ITEM");
			Thread.sleep(3000);
			enter_ItemTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_5thColumn));
			select1stRow_5thColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
			enter_Quantity.sendKeys("1");
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_7thColumn));
			select1stRow_7thColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
			enter_Rate.sendKeys(Keys.END);
			enter_Rate.sendKeys(Keys.SHIFT, Keys.HOME);
			enter_Rate.sendKeys(Keys.BACK_SPACE);
			enter_Rate.sendKeys("10");
			enter_Rate.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
			enter_Gross.sendKeys(Keys.TAB);
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
			saveBtn.click();
			
			Thread.sleep(3000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
			billRefPickIcon.click();
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
			billRefOkBtn.click();
			
			
			String expMessage1= "Voucher saved successfully";
			String expMessage2= ": 1";
			
			String actMessage = checkValidationMessage(expMessage1);
			
			Thread.sleep(2000);
			
		   System.out.println("************************************* checkFinancialsPurchasesVoucherNSavingVoucher1WithKeepUnpostedFinancialAccountingAndInventoryOptions  *********************************");
		   
		   System.out.println("SavingMessage  :  "+actMessage +" Value Expected : "+expMessage1+" "+expMessage2);
	
		   if(actMessage.startsWith(expMessage1) && actMessage.endsWith(expMessage2))
    		{
    			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
    			new_CloseBtn.click();
    			Thread.sleep(2000);
    			return true;
    		}
    		else
    		{
    			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
    			new_CloseBtn.click();
    			Thread.sleep(2000);
    			return false;
    		}
    	}
		
		
		
		
		
		
		
		public boolean checkAuthorizationStatusInHomePageAfterSavingVouchersWithConditionKeepUnpostedFinancialAccountingAndInventoryOptions() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			
			
		
			int voucherGridDocNoCount = voucherGridDocNo.size();
			
			String actStatusRow1 = null;
			
			System.out.println("Size  : "+voucherGridDocNoCount);
			
			for (int i = 0; i < voucherGridDocNoCount; i++) 
			{
				String data = voucherGridDocNo.get(i).getText();
				
				if (data.equalsIgnoreCase("1")) 
				{
					 actStatusRow1 =  voucherGridAuthorizationStatus.get(i).getText();
				}
			}
			
			String expStatusRow1 = "Pending";
			
			System.out.println("************************************* checkAuthorizationStatusInHomePageAfterSavingVouchersWithConditionKeepUnpostedFinancialAccountingAndInventoryOptions  *********************************");
			
			System.out.println("StatusRow1 : "+actStatusRow1+" Value Expected : "+expStatusRow1);
			
			if(actStatusRow1.equalsIgnoreCase(expStatusRow1))
			{
				System.out.println("Test Pass : Authorize Succesfully");
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
				homeCloseBtn.click();
				//excelReader.setCellData(xlfile, "SmokeSalesOrder", 627, 9, resPass);
				return true;
			}
			else
			{
				System.out.println("Test Fail : NOT Authorize Succesfully");
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
				homeCloseBtn.click();
				//excelReader.setCellData(xlfile, "SmokeSalesOrder", 627, 9, resFail);
				return false;
			}
		}
		
		
		
		
		
		
		
		public boolean checkFinancialLedgerReportWithConditionKeepUnpostedFinancialsAccountingAndInventoryOptions() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
			financialsMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsReportsMenu));
			financialsReportsMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ledger));
			ledger.click();
			
			Thread.sleep(3000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
			Select s=new Select(sl_DateOptionDropdown);
			s.selectByIndex(1);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_SearhItemTxt));
			sl_SearhItemTxt.click();
			sl_SearhItemTxt.sendKeys("Vendor A");
			sl_SearhItemTxt.sendKeys(Keys.ENTER);

			Thread.sleep(2000);
			
			int rowcount=stockLedgerHometableRowCount.size();
			
			System.out.println(rowcount);
			
			for (int i = 1; i <= rowcount; i++) 
			{
				WebElement name=getDriver().findElement(By.xpath("//tbody[@id='LandingGridBody']/tr["+i+"]/td[11]"));
				
				String actname=name.getAttribute("title");
				
				System.out.println("Ledger Account Selected : "+actname);
				
				if(actname.equalsIgnoreCase("Vendor A") )
				{
					WebElement index=getDriver().findElement(By.xpath("//tbody[@id='LandingGridBody']/tr["+i+"]/td[8]/div[1]//input"));
					index.click();
					
					break;
				}

			}
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
			sl_OkBtn.click();
			
			Thread.sleep(3000);
			
			System.out.println(report_Body.getText());
			
			boolean actTableData = report_Body.getText().isEmpty();
			boolean expTableData = true;
			
			System.out.println("*********************************checkFinancialLedgerReportWithConditionKeepUnpostedFinancialsAccountingAndInventoryOptions*****************************************");
			
			System.out.println("Table Data is Empty : "+actTableData+" Value Expected "+expTableData);
			
			if(actTableData==expTableData)
			{
				System.out.println("Test Pass : Reports Are As Expected");
				//excelReader.setCellData(xlfile, xlsheet, 992, 9, resPass);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
				report_CloseBtn.click();
				Thread.sleep(2000);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
				sl_CloseBtn.click();
				return true;
			}
			else
			{
				System.out.println("Test Fail : Reports Are NOT As Expected");
				//excelReader.setCellData(xlfile, xlsheet, 992, 9, resFail);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
				report_CloseBtn.click();
				Thread.sleep(2000);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
				sl_CloseBtn.click();
				return false;
			}
		}
		
		
		
		
		
			

		
		public boolean checkInventoryStockLedgerReportWithConditionKeepUnpostedFinancialsAccountingAndInventoryOptions() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
			inventoryMenu.click();
			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryReportsMenu));
			inventoryReportsMenu.click();
			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(stockLedger));
			stockLedger.click();
			
			Thread.sleep(3000);
			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
			Select s=new Select(sl_DateOptionDropdown);
			s.selectByIndex(1);
			
			Thread.sleep(2000);
			
			int rowcount=stockLedgerHometableRowCount.size();
			
			System.out.println(rowcount);
			
			for (int i = 1; i <= rowcount; i++) 
			{
				WebElement name=getDriver().findElement(By.xpath("//tbody[@id='LandingGridBody']/tr["+i+"]/td[12]"));
				
				String actname=name.getText();
				
				System.out.println(actname);
				
				if(actname.equalsIgnoreCase("STD RATE COGS ITEM"))
				{
					WebElement index=getDriver().findElement(By.xpath("//tbody[@id='LandingGridBody']/tr["+i+"]/td[8]/div/label/input"));
					index.click();
					Thread.sleep(2000);
					break;
				}
			}
			
			Thread.sleep(2000);
			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
			sl_OkBtn.click();
			
			Thread.sleep(3000);
			
			System.out.println(report_Body.getText());
			
			boolean actTableData = report_Body.getText().isEmpty();
			boolean expTableData = true;
			
			System.out.println("*********************************checkInventoryStockLedgerReportWithConditionKeepUnpostedFinancialsAccountingAndInventoryOptions*****************************************");
			
			System.out.println("Table Data is Empty : "+actTableData+" Value Expected "+expTableData);
			
			if(actTableData==expTableData)
			{
				System.out.println("Test Pass : Reports Are As Expected");
				//excelReader.setCellData(xlfile, xlsheet, 992, 9, resPass);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
				report_CloseBtn.click();
				Thread.sleep(2000);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
				sl_CloseBtn.click();
				return true;
			}
			else
			{
				System.out.println("Test Fail : Reports Are NOT As Expected");
				//excelReader.setCellData(xlfile, xlsheet, 992, 9, resFail);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
				report_CloseBtn.click();
				Thread.sleep(2000);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
				sl_CloseBtn.click();
				return false;
			}
		}
		
		
		
		
		
		
		
		public static boolean checkLogoutAndLoginWithUserAllOptionsWithConditionKeepUnpostedFinancialsAccountingAndInventoryOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
    	{
    		
    		
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplayLogo));
    		userNameDisplayLogo.click();
   		
   	     	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
   	     	logoutOption.click();

   	     	Thread.sleep(3000);
   	     	
    		LoginPage lp=new LoginPage(getDriver()); 
    		
    	    String unamelt="UserAllOptions";
    	  
    	    String pawslt="12345";
    	      
    	    lp.enterUserName(unamelt);
    	    
    	    lp.enterPassword(pawslt);
    	    
    	    lp.clickOnSignInBtn();
    	    
    	    //checkRefershPopOnlogin();
    	    
    	    //checkPopUpWindow();
    	  
    		Thread.sleep(6000);

    		String actUserInfo=userNameDisplay.getText();
    		
    		System.out.println("User Info  : "+actUserInfo);
    		
    		System.out.println("User Info Capture Text  :  "+userNameDisplay.getText());
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(companyLogo));
    		companyLogo.click();
    		
    		String getCompanyTxt=companyName.getText();
    		String getLoginCompanyName=getCompanyTxt.substring(0, 19);
    		System.out.println("company name  :  "+ getLoginCompanyName);
    		companyLogo.click();
    		
    		
    		String expUserInfo           ="UserAllOptions";
    		String expLoginCompanyName   ="Automation";
    		
    		
    		
    		boolean actDashboard = dashboard.isDisplayed();
    		boolean expDashboard = true;
    		
    		System.out.println("**********************************************checkLogoutAndLoginWithUserAllOptionsWithConditionKeepUnpostedFinancialsAccountingAndInventoryOptions*********************************************");
    		
    		System.out.println("User Info               : "+actUserInfo         +" Value Expected "+expUserInfo);
    		System.out.println("Login Company           : "+getLoginCompanyName +" Value Expected "+expLoginCompanyName);
    		System.out.println("Dashboard is Displaying : "+actDashboard        +" Value Expected "+expDashboard );

    		if (actUserInfo.equalsIgnoreCase(expUserInfo) && getLoginCompanyName.contains(expLoginCompanyName) && actDashboard==expDashboard) 
    		{
    			System.out.println("Login Successful");
				return true;
			}
    		else
    		{
    			System.out.println("Login Not Successful");
    			return false;
			}
    	}
			
    	
    	
    	


		public static boolean checkPurchasesVoucherNAuthorizationStatusWithUserAllOptionsWithKeepUnpostedFinancialAccountingAndInventoryOptions() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
			financialsMenu.click();
					
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
			financialsTransactionMenu.click();
				
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
			financialsTransactionsPurchaseMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVoucherNew));
			purchaseVoucherNew.click();
			
			Thread.sleep(3000);
			
			int voucherGridDocNoCount = voucherGridDocNo.size();
			
			String actStatusRow1 = null;
			
			System.out.println("Size  : "+voucherGridDocNoCount);
			
			for (int i = 0; i < voucherGridDocNoCount; i++) 
			{
				String data = voucherGridDocNo.get(i).getText();
				
				if (data.equalsIgnoreCase("1")) 
				{
					 actStatusRow1 =  voucherGridAuthorizationStatus.get(i).getText();
				}
			}
			
			String expStatusRow1 = "Pending";
			
			Thread.sleep(2000);
			
			click(homePageVoucherArrowBtn);
			Thread.sleep(1000);

			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pendingAuthorizationPurchases));
			pendingAuthorizationPurchases.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherHomeRow1ChkBox));
			voucherHomeRow1ChkBox.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(authorizeBtn));
			authorizeBtn.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(authorizePopupOkBtn));
			authorizePopupOkBtn.click();
			
			Thread.sleep(2000);
			click(homePageVoucherArrowBtn);
			Thread.sleep(1000);

			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homePageAllVouchersView));
			homePageAllVouchersView.click();
			
			Thread.sleep(2000);
			
			String actAfterAuthorizeStatusRow1 = null;
			
			for (int i = 0; i < voucherGridDocNoCount; i++) 
			{
				String data = voucherGridDocNo.get(i).getText();
				
				if (data.equalsIgnoreCase("1")) 
				{
					 actAfterAuthorizeStatusRow1 =  voucherGridAuthorizationStatus.get(i).getText();
				}
			}
			
			String expAfterAuthorizeStatusRow1 = "Authorized";
			
			System.out.println("************************************* checkPurchasesVoucherNAuthorizationStatusWithUserAllOptionsWithKeepUnpostedFinancialAccountingAndInventoryOptions  *********************************");
			
			System.out.println("StatusRow1               : "+actStatusRow1				+" Value Expected : "+expStatusRow1);
			System.out.println("AfterAuthorizeStatusRow1 : "+actAfterAuthorizeStatusRow1+" Value Expected : "+expAfterAuthorizeStatusRow1);
			
			
			if(actStatusRow1.equalsIgnoreCase(expStatusRow1) && actAfterAuthorizeStatusRow1.equalsIgnoreCase(expAfterAuthorizeStatusRow1))
			{
				System.out.println("Test Pass : Authorized Succesfully");
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
				homeCloseBtn.click();
    			Thread.sleep(3000);
				//excelReader.setCellData(xlfile, "SmokeSalesOrder", 627, 9, resPass);
				return true;
			}
			else
			{
				System.out.println("Test Fail : NOT Authorized Succesfully");
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
				homeCloseBtn.click();
    			Thread.sleep(3000);
				//excelReader.setCellData(xlfile, "SmokeSalesOrder", 627, 9, resFail);
				return false;
			}
			
		}
			
	
		
		
		public static boolean checkLogoutAndLoginWithSUToCheckAuthorizationStatusWithKeepUnpostedFinancialAccountingAndInventoryOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
    	{
    		
    		
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplayLogo));
    		userNameDisplayLogo.click();
   		
   	     	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
   	     	logoutOption.click();

   	     	Thread.sleep(3000);
    		
    		LoginPage lp=new LoginPage(getDriver()); 
    		
    	    String unamelt="su";
    	  
    	    String pawslt="su";
    	      
    	    lp.enterUserName(unamelt);
    	    
    	    lp.enterPassword(pawslt);
    	    
    	    lp.clickOnSignInBtn();
    	    
    	    //checkRefershPopOnlogin();
    	    
    	    //checkPopUpWindow();
    	  
    		Thread.sleep(7000);

    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
			financialsMenu.click();
					
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
			financialsTransactionMenu.click();
				
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
			financialsTransactionsPurchaseMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVoucherNew));
			purchaseVoucherNew.click();
			
			Thread.sleep(3000);
			
			int voucherGridDocNoCount = voucherGridDocNo.size();
			
			String actStatusRow1 = null;
			
			System.out.println("Size  : "+voucherGridDocNoCount);
			
			for (int i = 0; i < voucherGridDocNoCount; i++) 
			{
				String data = voucherGridDocNo.get(i).getText();
				
				if (data.equalsIgnoreCase("1")) 
				{
					 actStatusRow1 =  voucherGridAuthorizationStatus.get(i).getText();
				}
			}
			
			String expStatusRow1 = "Authorized";
			
			System.out.println("************************************* checkLogoutAndLoginWithSUToCheckAuthorizationStatusWithKeepUnpostedFinancialAccountingAndInventoryOptions  *********************************");
			
			System.out.println("StatusRow1 : "+actStatusRow1+" Value Expected : "+expStatusRow1);
			
			if(actStatusRow1.equalsIgnoreCase(expStatusRow1))
			{
				System.out.println("Test Pass : Suspended Succesfully");
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
				homeCloseBtn.click();
    			Thread.sleep(2000);
				//excelReader.setCellData(xlfile, "SmokeSalesOrder", 627, 9, resPass);
				return true;
			}
			else
			{
				System.out.println("Test Fail : NOT Suspended Succesfully");
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
				homeCloseBtn.click();
    			Thread.sleep(2000);
				//excelReader.setCellData(xlfile, "SmokeSalesOrder", 627, 9, resFail);
				return false;
			}
		}
		
		
		
		
		
		
		
		
		public boolean checkFinancialLedgerReportAfterAuthorizingWithConditionKeepUnpostedFinancialsAccountingAndInventoryOptions() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
			financialsMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsReportsMenu));
			financialsReportsMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ledger));
			ledger.click();
			
			Thread.sleep(3000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
			Select s=new Select(sl_DateOptionDropdown);
			s.selectByIndex(1);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_SearhItemTxt));
			sl_SearhItemTxt.click();
			sl_SearhItemTxt.sendKeys("Vendor A");
			sl_SearhItemTxt.sendKeys(Keys.ENTER);

			Thread.sleep(2000);
			
			int rowcount=stockLedgerHometableRowCount.size();
			
			System.out.println(rowcount);
			
			for (int i = 1; i <= rowcount; i++) 
			{
				WebElement name=getDriver().findElement(By.xpath("//tbody[@id='LandingGridBody']/tr["+i+"]/td[11]"));
				
				String actname=name.getAttribute("title");
				
				System.out.println("Ledger Account Selected : "+actname);
				
				if(actname.equalsIgnoreCase("Vendor A") )
				{
					WebElement index=getDriver().findElement(By.xpath("//tbody[@id='LandingGridBody']/tr["+i+"]/td[8]/div[1]//input"));
					index.click();
					
					break;
				}

			}
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
			sl_OkBtn.click();
			
			Thread.sleep(3000);
			
			String actAccountNameR1				=sl_1stRow1stCol.getText();
			
			String actVoucherR2					=sl_2ndRow2ndCol.getText();
			String actAccountR2				    =sl_2ndRow3rdCol.getText();
			boolean actTransactionDebitR2	    =sl_2ndRow4thCol.getText().isEmpty();
			String actTransactionCreditR2       =sl_2ndRow5thCol.getText();
			String actTransactionBalanceR2   	=sl_2ndRow6thCol.getText();
			boolean actLocalDebitR2  	    	=sl_2ndRow7thCol.getText().isEmpty();
			String actLocalCreditR2    		    =sl_2ndRow8thCol.getText();
			String actLocalBalanceR2	    	=sl_2ndRow9thCol.getText();
			boolean actBaseDebitR2 	    	    =sl_2ndRow10thCol.getText().isEmpty();
			String actBaseCreditR2   	    	=sl_2ndRow11thCol.getText();
			String actBaseBalanceR2             =sl_2ndRow12thCol.getText();
			String actAlternateIssuedValueR2    =sl_2ndRow13thCol.getText();
			
			
			boolean actVoucherR3				=sl_3rdRow2ndCol.getText().isEmpty();
			boolean actAccountR3				=sl_3rdRow3rdCol.getText().isEmpty();
			boolean actTransactionDebitR3	    =sl_3rdRow4thCol.getText().isEmpty();
			String actTransactionCreditR3       =sl_3rdRow5thCol.getText();
			String actTransactionBalanceR3   	=sl_3rdRow6thCol.getText();
			boolean actLocalDebitR3  	    	=sl_3rdRow7thCol.getText().isEmpty();
			String actLocalCreditR3    		    =sl_3rdRow8thCol.getText();
			String actLocalBalanceR3	    	=sl_3rdRow9thCol.getText();
			boolean actBaseDebitR3 	    	    =sl_3rdRow10thCol.getText().isEmpty();
			String actBaseCreditR3   	    	=sl_3rdRow11thCol.getText();
			String actBaseBalanceR3             =sl_3rdRow12thCol.getText();
			boolean actAlternateIssuedValueR3   =sl_3rdRow13thCol.getText().isEmpty();
			
			
			// Expected
			
			String expAccountNameR1				="Vendor A 033-001";
			
			String expVoucherR2					="NDT45 : 1";
			String expAccountR2				    ="Purchase";
			boolean expTransactionDebitR2	    =true;
			String expTransactionCreditR2       ="10.00";
			String expTransactionBalanceR2   	="10.00";
			boolean expLocalDebitR2  	    	=true;
			String expLocalCreditR2    		    ="0.70";
			String expLocalBalanceR2	    	="0.70";
			boolean expBaseDebitR2 	    	    =true;
			String expBaseCreditR2   	    	="10.00";
			String expBaseBalanceR2             ="10.00";
			String expAlternateIssuedValueR2    ="Indian Rupees";
			
			
			boolean expVoucherR3				=true;
			boolean expAccountR3				=true;
			boolean expTransactionDebitR3	    =true;
			String expTransactionCreditR3       ="10.00";
			String expTransactionBalanceR3   	="10.00";
			boolean expLocalDebitR3  	    	=true;
			String expLocalCreditR3    		    ="0.70";
			String expLocalBalanceR3	    	="0.70";
			boolean expBaseDebitR3 	    	    =true;
			String expBaseCreditR3   	    	="10.00";
			String expBaseBalanceR3             ="10.00";
			boolean expAlternateIssuedValueR3   =true;
			
			System.out.println("*********************************checkFinancialLedgerReportAfterAuthorizingWithConditionKeepUnpostedFinancialsAccountingAndInventoryOptions*****************************************");
			
			System.out.println("AccountNameR1           : "+actAccountNameR1           +" Value Expected : "+expAccountNameR1);
			System.out.println("VoucherR2               : "+actVoucherR2               +" Value Expected : "+expVoucherR2);
			System.out.println("AccountR2               : "+actAccountR2               +" Value Expected : "+expAccountR2);
			System.out.println("TransactionDebitR2      : "+actTransactionDebitR2      +" Value Expected : "+expTransactionDebitR2);
			System.out.println("TransactionCreditR2     : "+actTransactionCreditR2     +" Value Expected : "+expTransactionCreditR2);
			System.out.println("TransactionBalanceR2    : "+actTransactionBalanceR2    +" Value Expected : "+expTransactionBalanceR2);
			System.out.println("LocalDebitR2            : "+actLocalDebitR2            +" Value Expected : "+expLocalDebitR2);
			System.out.println("LocalCreditR2           : "+actLocalCreditR2           +" Value Expected : "+expLocalCreditR2);
			System.out.println("LocalBalanceR2          : "+actLocalBalanceR2          +" Value Expected : "+expLocalBalanceR2);
			System.out.println("BaseDebitR2             : "+actBaseDebitR2             +" Value Expected : "+expBaseDebitR2);
			System.out.println("BaseCreditR2            : "+actBaseCreditR2            +" Value Expected : "+expBaseCreditR2);
			System.out.println("BaseBalanceR2           : "+actBaseBalanceR2		   +" Value Expected : "+expBaseBalanceR2);
			System.out.println("AlternateIssuedValueR2  : "+actAlternateIssuedValueR2  +" Value Expected : "+expAlternateIssuedValueR2);
			
			System.out.println("VoucherR3               : "+actVoucherR3               +" Value Expected : "+expVoucherR3);
			System.out.println("AccountR3               : "+actAccountR3               +" Value Expected : "+expAccountR3);
			System.out.println("TransactionDebitR3      : "+actTransactionDebitR3      +" Value Expected : "+expTransactionDebitR3);
			System.out.println("TransactionCreditR3     : "+actTransactionCreditR3     +" Value Expected : "+expTransactionCreditR3);
			System.out.println("TransactionBalanceR3    : "+actTransactionBalanceR3    +" Value Expected : "+expTransactionBalanceR3);
			System.out.println("LocalDebitR3            : "+actLocalDebitR3            +" Value Expected : "+expLocalDebitR3);
			System.out.println("LocalCreditR3           : "+actLocalCreditR3           +" Value Expected : "+expLocalCreditR3);
			System.out.println("LocalBalanceR3          : "+actLocalBalanceR3          +" Value Expected : "+expLocalBalanceR3);
			System.out.println("BaseDebitR3             : "+actBaseDebitR3             +" Value Expected : "+expBaseDebitR3);
			System.out.println("BaseCreditR3            : "+actBaseCreditR3            +" Value Expected : "+expBaseCreditR3);
			System.out.println("BaseBalanceR3           : "+actBaseBalanceR3           +" Value Expected : "+expBaseBalanceR3);
			System.out.println("AlternateIssuedValueR3  : "+actAlternateIssuedValueR3  +" Value Expected : "+expAlternateIssuedValueR3);
			
			
			if(actAccountNameR1.equalsIgnoreCase(expAccountNameR1) 
				&& actVoucherR2.equalsIgnoreCase(expVoucherR2) && actAccountR2.equalsIgnoreCase(expAccountR2)
				&& actTransactionDebitR2==expTransactionDebitR2 && actTransactionCreditR2.equalsIgnoreCase(expTransactionCreditR2) 
				&& actTransactionBalanceR2.equalsIgnoreCase(expTransactionBalanceR2) && actLocalDebitR2==expLocalDebitR2
				&& actLocalCreditR2.equalsIgnoreCase(expLocalCreditR2) && actLocalBalanceR2.equalsIgnoreCase(expLocalBalanceR2)
				&& actBaseDebitR2==expBaseDebitR2 && actBaseCreditR2.equalsIgnoreCase(expBaseCreditR2)
				&& actBaseBalanceR2.equalsIgnoreCase(expBaseBalanceR2) && actAlternateIssuedValueR2.equalsIgnoreCase(expAlternateIssuedValueR2)
				
				&& actVoucherR3==expVoucherR3 && actAccountR3==expAccountR3 && actTransactionDebitR3==expTransactionDebitR3
				&& actTransactionCreditR3.equalsIgnoreCase(expTransactionCreditR3) && actTransactionBalanceR3.equalsIgnoreCase(expTransactionBalanceR3)
				&& actLocalDebitR3==expLocalDebitR3 && actLocalCreditR3.equalsIgnoreCase(expLocalCreditR3) && actLocalBalanceR3.equalsIgnoreCase(expLocalBalanceR3)
				&& actBaseDebitR3==expBaseDebitR3 && actBaseCreditR3.equalsIgnoreCase(expBaseCreditR3) && actBaseBalanceR3.equalsIgnoreCase(expBaseBalanceR3)
				&& actAlternateIssuedValueR3==expAlternateIssuedValueR3)
			{
				System.out.println("Test Pass : Reports Are As Expected");
				//excelReader.setCellData(xlfile, xlsheet, 992, 9, resPass);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
				report_CloseBtn.click();
				Thread.sleep(2000);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
				sl_CloseBtn.click();
				return true;
			}
			else
			{
				System.out.println("Test Fail : Reports Are NOT As Expected");
				//excelReader.setCellData(xlfile, xlsheet, 992, 9, resFail);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
				report_CloseBtn.click();
				Thread.sleep(2000);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
				sl_CloseBtn.click();
				return false;
			}
		}
		
		
		
		
		
			

		
		public boolean checkInventoryStockLedgerReportAfterAuthorizingWithConditionKeepUnpostedFinancialsAccountingAndInventoryOptions() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			
			
			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
			inventoryMenu.click();
			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryReportsMenu));
			inventoryReportsMenu.click();
			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(stockLedger));
			stockLedger.click();
			
			Thread.sleep(3000);
			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
			Select s=new Select(sl_DateOptionDropdown);
			s.selectByIndex(1);
			
			Thread.sleep(2000);
			
			int rowcount=stockLedgerHometableRowCount.size();
			
			System.out.println(rowcount);
			
			for (int i = 1; i <= rowcount; i++) 
			{
				WebElement name=getDriver().findElement(By.xpath("//tbody[@id='LandingGridBody']/tr["+i+"]/td[12]"));
				
				String actname=name.getText();
				
				System.out.println(actname);
				
				if(actname.equalsIgnoreCase("STD RATE COGS ITEM"))
				{
					WebElement index=getDriver().findElement(By.xpath("//tbody[@id='LandingGridBody']/tr["+i+"]/td[8]/div/label/input"));
					index.click();
					Thread.sleep(2000);
					break;
				}
			}
			
			Thread.sleep(2000);
			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
			sl_OkBtn.click();
			
			Thread.sleep(3000);
			
			String actItemNameR1				=sl_1stRow1stCol.getText();
			
			String actVoucherR2					=sl_2ndRow2ndCol.getText();
			String actReceivedQtyR2				=sl_2ndRow3rdCol.getText();
			String actReceivedRateR2	    	=sl_2ndRow4thCol.getText();
			boolean actIssuedQtyR2        		=sl_2ndRow5thCol.getText().isEmpty();
			boolean actIssuedRateR2	    		=sl_2ndRow6thCol.getText().isEmpty();
			String actBalanceQtyR2  	    	=sl_2ndRow7thCol.getText();
			String actReceivedValueR2    		=sl_2ndRow8thCol.getText();
			boolean actIssuedValueR2	    	=sl_2ndRow9thCol.getText().isEmpty();
			String actBalanceValueR2 	    	=sl_2ndRow10thCol.getText();
			String actAvgRateR2   	    		=sl_2ndRow11thCol.getText();
			boolean actAlternateReceivedQtyR2   =sl_2ndRow12thCol.getText().isEmpty();
			boolean actAlternateIssuedValueR2   =sl_2ndRow13thCol.getText().isEmpty();
			boolean actAlternatebalanceValueR2	=sl_2ndRow14thCol.getText().isEmpty();
			
			boolean actVoucherR3				=sl_3rdRow2ndCol.getText().isEmpty();
			String actReceivedQtyR3				=sl_3rdRow3rdCol.getText();
			String actReceivedRateR3	    	=sl_3rdRow4thCol.getText();
			boolean actIssuedQtyR3        		=sl_3rdRow5thCol.getText().isEmpty();
			boolean actIssuedRateR3	    		=sl_3rdRow6thCol.getText().isEmpty();
			String actBalanceQtyR3  	    	=sl_3rdRow7thCol.getText();
			String actReceivedValueR3    		=sl_3rdRow8thCol.getText();
			boolean actIssuedValueR3	    	=sl_3rdRow9thCol.getText().isEmpty();
			String actBalanceValueR3 	    	=sl_3rdRow10thCol.getText();
			String actAvgRateR3   	    		=sl_3rdRow11thCol.getText();
			boolean actAlternateReceivedQtyR3   =sl_3rdRow12thCol.getText().isEmpty();
			boolean actAlternateIssuedValueR3   =sl_3rdRow13thCol.getText().isEmpty();
			boolean actAlternatebalanceValueR3	=sl_3rdRow14thCol.getText().isEmpty();
			
			
			// Expected
			
			String expItemNameR1				="STD RATE COGS ITEM STD RATE COGS ITEM";
			
			String expVoucherR2					="NDT45:1";
			String expReceivedQtyR2				="12.00";
			String expReceivedRateR2	    	="10.00";
			boolean expIssuedQtyR2        		=true;
			boolean expIssuedRateR2	    		=true;
			String expBalanceQtyR2  	    	="12.00";
			String expReceivedValueR2    		="120.00";
			boolean expIssuedValueR2	    	=true;
			String expBalanceValueR2 	    	="120.00";
			String expAvgRateR2   	    		="10.00";
			boolean expAlternateReceivedQtyR2   =true;
			boolean expAlternateIssuedValueR2   =true;
			boolean expAlternatebalanceValueR2	=true;
			
			boolean expVoucherR3				=true;
			String expReceivedQtyR3				="12.00";
			String expReceivedRateR3	    	="10.00";
			boolean expIssuedQtyR3        		=true;
			boolean expIssuedRateR3	    		=true;
			String expBalanceQtyR3  	    	="12.00";
			String expReceivedValueR3    		="120.00";
			boolean expIssuedValueR3	    	=true;
			String expBalanceValueR3 	    	="120.00";
			String expAvgRateR3   	    		="10.00";
			boolean expAlternateReceivedQtyR3   =true;
			boolean expAlternateIssuedValueR3   =true;
			boolean expAlternatebalanceValueR3	=true;
			
			
			System.out.println("*********************************checkInventoryStockLedgerReportAfterAuthorizingWithConditionKeepUnpostedFinancialsAccountingAndInventoryOptions*****************************************");
			
			System.out.println("ItemNameR1   			: "+actItemNameR1				+" Value Expected : "+expItemNameR1);
			
			System.out.println("VoucherR2  				: "+actVoucherR2 				+" Value Expected : "+expVoucherR2);
			System.out.println("ReceivedQtyR2  			: "+actReceivedQtyR2 			+" Value Expected : "+expReceivedQtyR2);
			System.out.println("ReceivedRateR2  		: "+actReceivedRateR2 			+" Value Expected : "+expReceivedRateR2);
			System.out.println("IssuedQtyR2  			: "+actIssuedQtyR2 				+" Value Expected : "+expIssuedQtyR2);
			System.out.println("IssuedRateR2  			: "+actIssuedRateR2 			+" Value Expected : "+expIssuedRateR2);
			System.out.println("BalanceQtyR2  			: "+actBalanceQtyR2 			+" Value Expected : "+expBalanceQtyR2);
			System.out.println("ReceivedValueR2  		: "+actReceivedValueR2 			+" Value Expected : "+expReceivedValueR2);
			System.out.println("IssuedValueR2  			: "+actIssuedValueR2 			+" Value Expected : "+expIssuedValueR2);
			System.out.println("BalanceValueR2  		: "+actBalanceValueR2 			+" Value Expected : "+expBalanceValueR2);
			System.out.println("AvgRateR2  				: "+actAvgRateR2 				+" Value Expected : "+expAvgRateR2);
			System.out.println("AlternateReceivedQtyR2  : "+actAlternateReceivedQtyR2 	+" Value Expected : "+expAlternateReceivedQtyR2);
			System.out.println("AlternateIssuedValueR2  : "+actAlternateIssuedValueR2 	+" Value Expected : "+expAlternateIssuedValueR2);
			System.out.println("AlternatebalanceValueR2 : "+actAlternatebalanceValueR2	+" Value Expected : "+expAlternatebalanceValueR2);
			
			System.out.println("VoucherR3  				: "+actVoucherR3 				+" Value Expected : "+expVoucherR3);
			System.out.println("ReceivedQtyR3  			: "+actReceivedQtyR3 			+" Value Expected : "+expReceivedQtyR3);
			System.out.println("ReceivedRateR3  		: "+actReceivedRateR3 			+" Value Expected : "+expReceivedRateR3);
			System.out.println("IssuedQtyR3  			: "+actIssuedQtyR3 				+" Value Expected : "+expIssuedQtyR3);
			System.out.println("IssuedRateR3  			: "+actIssuedRateR3 			+" Value Expected : "+expIssuedRateR3);
			System.out.println("BalanceQtyR3  			: "+actBalanceQtyR3 			+" Value Expected : "+expBalanceQtyR3);
			System.out.println("ReceivedValueR3  		: "+actReceivedValueR3 			+" Value Expected : "+expReceivedValueR3);
			System.out.println("IssuedValueR3  			: "+actIssuedValueR3 			+" Value Expected : "+expIssuedValueR3);
			System.out.println("BalanceValueR3  		: "+actBalanceValueR3 			+" Value Expected : "+expBalanceValueR3);
			System.out.println("AvgRateR3  				: "+actAvgRateR3 				+" Value Expected : "+expAvgRateR3);
			System.out.println("AlternateReceivedQtyR3  : "+actAlternateReceivedQtyR3 	+" Value Expected : "+expAlternateReceivedQtyR3);
			System.out.println("AlternateIssuedValueR3  : "+actAlternateIssuedValueR3 	+" Value Expected : "+expAlternateIssuedValueR3);
			System.out.println("AlternatebalanceValueR3 : "+actAlternatebalanceValueR3	+" Value Expected : "+expAlternatebalanceValueR3);
			
			if(actItemNameR1.equalsIgnoreCase(expItemNameR1) && actVoucherR2.equalsIgnoreCase(expVoucherR2) && actReceivedQtyR2.equalsIgnoreCase(expReceivedQtyR2)
				&& actReceivedRateR2.equalsIgnoreCase(expReceivedRateR2) && actIssuedQtyR2==expIssuedQtyR2 && actIssuedRateR2==expIssuedRateR2
				&& actBalanceQtyR2.equalsIgnoreCase(expBalanceQtyR2) && actReceivedValueR2.equalsIgnoreCase(expReceivedValueR2) 
				&& actIssuedValueR2==expIssuedValueR2 && actBalanceValueR2.equalsIgnoreCase(expBalanceValueR2) && actAvgRateR2.equalsIgnoreCase(expAvgRateR2)
				&& actAlternateReceivedQtyR2==expAlternateReceivedQtyR2 && actAlternateIssuedValueR2==expAlternateIssuedValueR2
				&& actAlternatebalanceValueR2==expAlternatebalanceValueR2
				
				&& actVoucherR3==expVoucherR3 && actReceivedQtyR3.equalsIgnoreCase(expReceivedQtyR3) && actReceivedRateR3.equalsIgnoreCase(expReceivedRateR3)
				&& actIssuedQtyR3==expIssuedQtyR3 && actIssuedRateR3==expIssuedRateR3 && actBalanceQtyR3.equalsIgnoreCase(expBalanceQtyR3)
				&& actReceivedValueR3.equalsIgnoreCase(expReceivedValueR3) && actIssuedValueR3==expIssuedValueR3 && actBalanceValueR3.equalsIgnoreCase(expBalanceValueR3)
				&& actAvgRateR3.equalsIgnoreCase(expAvgRateR3) && actAlternateReceivedQtyR3==expAlternateReceivedQtyR3 
				&& actAlternateIssuedValueR3==expAlternateIssuedValueR3 && actAlternatebalanceValueR3==expAlternatebalanceValueR3)
			{
				System.out.println("Test Pass : Reports Are As Expected");
				//excelReader.setCellData(xlfile, xlsheet, 992, 9, resPass);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
				report_CloseBtn.click();
				Thread.sleep(2000);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
				sl_CloseBtn.click();
				return true;
			}
			else
			{
				System.out.println("Test Fail : Reports Are NOT As Expected");
				//excelReader.setCellData(xlfile, xlsheet, 992, 9, resFail);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
				report_CloseBtn.click();
				Thread.sleep(2000);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
				sl_CloseBtn.click();
				return false;
			}
		}
		
		
		
		
		
		
		public boolean checkEraseAllTransactionsAfterConditionKeepUnpostedFinancialsAccountingAndInventoryOptions() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
			homeMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dataMangementMenu));
			dataMangementMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(eraseAll));
			eraseAll.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(eraseTranscationsRadio));
			eraseTranscationsRadio.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(eraseAllOkBtn));
			eraseAllOkBtn.click();
			
			if(getIsAlertPresent())
			{
				getWaitForAlert();
				
				getAlert().accept();
			}
			
			String expValidationMsg="Data deleted successfully.";
			
			String actValidationMsg=checkValidationMessage(expValidationMsg);
			
			System.out.println("************************************* checkEraseAllTransactionsAfterConditionKeepUnpostedFinancialsAccountingAndInventoryOptions  *********************************");
			System.out.println("Message  :  "+actValidationMsg +" Value Expected : "+expValidationMsg);
			
			if (actValidationMsg.equalsIgnoreCase(expValidationMsg))
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		
		
		
		
		
		// Keep Unposted Links Base Options
		
		public boolean 	checkAddingSalesOrderDocumentAndConditonAsKeepUnpostedSelectingLinksBaseOptions() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
    	{
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsmenuBtn));
    		settingsmenuBtn.click();
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(transactionAuthorizationBtn));
    		transactionAuthorizationBtn.click();
    		
    		Thread.sleep(2000);
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNameDropdown));
    		documentNameDropdown.sendKeys(" ");
    		
    		Thread.sleep(1000);
    			
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNameSalesOrders));
    		documentNameSalesOrders.click();
    		
    		Thread.sleep(3000);
    				
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
    		nameTxt.click();
    		
    		Thread.sleep(1000);
    		
    		nameTxt.sendKeys("Sales");
    		nameTxt.sendKeys(Keys.TAB);
    			
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(addLevelBtn));
    		addLevelBtn.click();
    		
    		Thread.sleep(2000);
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(descriptionTxt));
    		descriptionTxt.click();
    		descriptionTxt.sendKeys("SO");
    		
    		
			/*
			 * if(conditionNotRequiredChkBox.isSelected()==false) {
			 * //getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(
			 * conditionNotRequiredChkBox)); //conditionNotRequiredChkBox.click();
			 */
    		ClickUsingJs(conditionNotRequiredChkBox);
    		
    		Thread.sleep(2000);
    		
    	
    		//getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(keepUnpostedlinkBaseChkBox));
    		//keepUnpostedlinkBaseChkBox.click();
    		moveToElement(keepUnpostedlinkBaseChkBox);
    		
    		Thread.sleep(2000);
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userSelectionTab));
    		userSelectionTab.click();
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userrow1));
    		userrow1.click();
    		Select user = new Select(userDropdown);
			user.selectByVisibleText("UserAllOptions");
    		
    		Thread.sleep(2000);
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(definitionOkBtn));
    		definitionOkBtn.click();
    		
    		Thread.sleep(2000);
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(tranAuthSaveBtn));
    		tranAuthSaveBtn.click();
    		
    		String expValidationMsg="Authorization Flow saved successfully.";
    		
    		String actValidationMsg=checkValidationMessage(expValidationMsg);
    		
    		
    		System.out.println("Validation Message : "+actValidationMsg+"  Value Expected : "+expValidationMsg);
    		
    		if(actValidationMsg.equalsIgnoreCase(expValidationMsg))
    		{
    			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(tranAuthCancelBtn));
    			tranAuthCancelBtn.click();
    			return true;
    		}
    		else
    		{
    			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(tranAuthCancelBtn));
    			tranAuthCancelBtn.click();
    			return false;
    		}
    	}
		
		
		
		
		
		
		
		
		public static boolean checkSavingSalesOrdersVoucher1WithKeepUnpostedLinksBaseOptions() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
			inventoryMenu.click();
					
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsMenu));
			inventoryTransactionsMenu.click();
				
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoyTransactionsSalesMenu));
			inventoyTransactionsSalesMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesOrders));
			salesOrders.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
			newBtn.click();
			
			checkValidationMessage("Screen opened");
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerAccountTxt));
			customerAccountTxt.click();
			customerAccountTxt.sendKeys("Customer A");
			
			Thread.sleep(3000);
			
			customerAccountTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
			select1stRow_1stColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pvWareHouseTxt));
			pvWareHouseTxt.sendKeys("HYDERABAD");
			Thread.sleep(3000);
			pvWareHouseTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
			enter_ItemTxt.sendKeys("STD RATE COGS ITEM");
			Thread.sleep(3000);
			enter_ItemTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_5thColumn));
			select1stRow_5thColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_AQ));
			enter_AQ.sendKeys("3");
			enter_AQ.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_FQ));
			enter_FQ.sendKeys("3");
			enter_FQ.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_10thColumn));
			select1stRow_10thColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
			enter_Rate.sendKeys(Keys.END);
			enter_Rate.sendKeys(Keys.SHIFT, Keys.HOME);
			enter_Rate.sendKeys(Keys.BACK_SPACE);
			enter_Rate.sendKeys("10");
			enter_Rate.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
			enter_Gross.sendKeys(Keys.TAB);
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
			saveBtn.click();
			
			
			String expMessage1= "Voucher saved successfully";
			String expMessage2= ": 1";

			String actMessage = checkValidationMessage(expMessage1);
			
			Thread.sleep(2000);
			
		   System.out.println("************************************* checkSavingSalesOrdersVoucher1WithKeepUnpostedLinkBaseOptions  *********************************");
		   
		   System.out.println("SavingMessage  :  "+actMessage +" Value Expected : "+expMessage1+" "+expMessage2);
	
		   if(actMessage.startsWith(expMessage1) && actMessage.endsWith(expMessage2))
    		{
    			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
    			new_CloseBtn.click();
    			Thread.sleep(2000);
    			return true;
    		}
    		else
    		{
    			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
    			new_CloseBtn.click();
    			Thread.sleep(2000);
    			return false;
    		}
    	}
		
		
		
		
		
		
		
		public boolean checkAuthorizationStatusInHomePageAfterSavingVouchersWithConditionKeepUnpostedLinksBaseOptions() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			int voucherGridDocNoCount = voucherGridDocNo.size();
			
			String actStatusRow1 = null;
			
			System.out.println("Size  : "+voucherGridDocNoCount);
			
			for (int i = 0; i < voucherGridDocNoCount; i++) 
			{
				String data = voucherGridDocNo.get(i).getText();
				
				if (data.equalsIgnoreCase("1")) 
				{
					 actStatusRow1 =  voucherGridAuthorizationStatus.get(i).getText();
				}
			}
			
			String expStatusRow1 = "Pending";
			
			System.out.println("************************************* checkAuthorizationStatusInHomePageAfterSavingVouchersWithConditionKeepUnpostedLinksBaseOptions  *********************************");
			
			System.out.println("StatusRow1 : "+actStatusRow1+" Value Expected : "+expStatusRow1);
			
			if(actStatusRow1.equalsIgnoreCase(expStatusRow1))
			{
				System.out.println("Test Pass : Authorize Succesfully");
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
				homeCloseBtn.click();
				Thread.sleep(2000);
				return true;
			}
			else
			{
				System.out.println("Test Fail : NOT Authorize Succesfully");
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
				homeCloseBtn.click();
				Thread.sleep(2000);
				return false;
			}
		}
		
		
		
		
		
		
		
		public boolean checkLinkInSalesInvoiceVATVoucher1WithConditionKeepUnpostedLinksBaseOptions() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
			financialsMenu.click();
					
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
			financialsTransactionMenu.click();
				
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsSalesMenu));
			financialsTransactionsSalesMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesInvoiceVATVoucher));
			salesInvoiceVATVoucher.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
			newBtn.click();
			
			checkValidationMessage("Screen opened");
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
			
			documentNumberTxt.sendKeys(Keys.CONTROL, "l");
			
			Thread.sleep(2000);
			boolean actWarehouseText  =pvWareHouseTxt.getText().isEmpty();
			boolean expWarehouseText = true;
			
			System.err.println("actWarehouseText       :"+actWarehouseText);
			System.err.println("expWarehouseText       :"+expWarehouseText);
		
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workFlowPopupCloseBtn));	
			workFlowPopupCloseBtn.click();
		
			Thread.sleep(2000);
			
			//boolean actPurchaseVoucherWorlFlowText = workflowTableBody.getText().isEmpty();
			
			//boolean expPurchaseVoucherWorlFlowText = true;
			   
			System.out.println("**************************************** checkLinkInSalesInvoiceVATVoucher1WithConditionKeepUnpostedLinksBaseOptions  ***************************************");
			
			//System.out.println("purchaseVoucherWorlFlowText  		: "+actPurchaseVoucherWorlFlowText		+" 	Value Expected : "+expPurchaseVoucherWorlFlowText);
			
			if(actWarehouseText==expWarehouseText)
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
				new_CloseBtn.click();
				Thread.sleep(2000);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
				homeCloseBtn.click();
				Thread.sleep(2000);
				return true;
			}
			else
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
				new_CloseBtn.click();
				Thread.sleep(2000);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
				homeCloseBtn.click();
				Thread.sleep(2000);
				return false;
			}
		}

		
		
		
		
		
		public static boolean checkLogoutAndLoginWithUserAllOptionsWithKeepUnpostedLinksBaseOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
    	{
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplayLogo));
    		userNameDisplayLogo.click();
   		
   		
   	     	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
   	     	logoutOption.click();

   	     	Thread.sleep(3000);
    		
    		LoginPage lp=new LoginPage(getDriver()); 
    		
    	    String unamelt="UserAllOptions";
    	  
    	    String pawslt="12345";
    	      
    	    lp.enterUserName(unamelt);
    	    
    	    lp.enterPassword(pawslt);
    	    
    	    lp.clickOnSignInBtn();
    	    
    	    //checkRefershPopOnlogin();
    	    
    	    //checkPopUpWindow();
    	  
    		Thread.sleep(7000);

    		String actUserInfo=userNameDisplay.getText();
    		
    		System.out.println("User Info  : "+actUserInfo);
    		
    		System.out.println("User Info Capture Text  :  "+userNameDisplay.getText());
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(companyLogo));
    		companyLogo.click();
    		
    		String getCompanyTxt=companyName.getText();
    		String getLoginCompanyName=getCompanyTxt.substring(0, 19);
    		System.out.println("company name  :  "+ getLoginCompanyName);
    		companyLogo.click();
    		
    		boolean actDashboard = dashboard.isDisplayed();
    		
    		
    		String expUserInfo           ="UserAllOptions";
    		String expLoginCompanyName   ="Automation";
    		boolean expDashboard = true;

    		if (actUserInfo.equalsIgnoreCase(expUserInfo) && getLoginCompanyName.contains(expLoginCompanyName) && actDashboard==expDashboard) 
    		{
				return true;
			}
    		else
    		{
    			return false;
			}
    	}
    	
    	
    	
		
		
		public static boolean checkSalesOrderAuthorizationStatusWithUserAllOptionsWithKeepUnpostedLinksBaseOptions() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
			inventoryMenu.click();
					
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsMenu));
			inventoryTransactionsMenu.click();
				
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoyTransactionsSalesMenu));
			inventoyTransactionsSalesMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesOrders));
			salesOrders.click();
			
			Thread.sleep(3000);
			
			int voucherGridDocNoCount = voucherGridDocNo.size();
			
			String actStatusRow1 = null;
			
			System.out.println("Size  : "+voucherGridDocNoCount);
			
			for (int i = 0; i < voucherGridDocNoCount; i++) 
			{
				String data = voucherGridDocNo.get(i).getText();
				
				if (data.equalsIgnoreCase("1")) 
				{
					 actStatusRow1 =  voucherGridAuthorizationStatus.get(i).getText();
				}
			}
			
			String expStatusRow1 = "Pending";
			
			Thread.sleep(2000);
			
			click(homePageVoucherArrowBtn);
			Thread.sleep(1000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pendingAuthorizationPurchases));
			pendingAuthorizationPurchases.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherHomeRow1ChkBox));
			voucherHomeRow1ChkBox.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(authorizeBtn));
			authorizeBtn.click();
			
			Thread.sleep(1000);
			click(homePageVoucherArrowBtn);
			Thread.sleep(1000);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homePageAllVouchersView));
			homePageAllVouchersView.click();

			Thread.sleep(2000);
			
			String actAfterAuthorizeStatusRow1 = null;
			
			for (int i = 0; i < voucherGridDocNoCount; i++) 
			{
				String data = voucherGridDocNo.get(i).getText();
				
				if (data.equalsIgnoreCase("1")) 
				{
					 actAfterAuthorizeStatusRow1 =  voucherGridAuthorizationStatus.get(i).getText();
				}
			}
			
			String expAfterAuthorizeStatusRow1 = "Authorized";
			
			System.out.println("************************************* checkSalesOrderAuthorizationStatusWithUserAllOptionsWithKeepUnpostedLinksBaseOptions  *********************************");
			
			System.out.println("StatusRow1               : "+actStatusRow1				+" Value Expected : "+expStatusRow1);
			System.out.println("AfterAuthorizeStatusRow1 : "+actAfterAuthorizeStatusRow1+" Value Expected : "+expAfterAuthorizeStatusRow1);
			
			
			if(actStatusRow1.equalsIgnoreCase(expStatusRow1) && actAfterAuthorizeStatusRow1.equalsIgnoreCase(expAfterAuthorizeStatusRow1))
			{
				System.out.println("Test Pass : Authorized Succesfully");
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
				homeCloseBtn.click();
    			Thread.sleep(3000);
				//excelReader.setCellData(xlfile, "SmokeSalesOrder", 627, 9, resPass);
				return true;
			}
			else
			{
				System.out.println("Test Fail : NOT Authorized Succesfully");
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
				homeCloseBtn.click();
    			Thread.sleep(3000);
				//excelReader.setCellData(xlfile, "SmokeSalesOrder", 627, 9, resFail);
				return false;
			}
			
		}
			
	
		
		
		public static boolean checkLogoutAndLoginWithSUToCheckAuthorizationStatusWithKeepUnpostedLinksBaseOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
    	{
    		
    		
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplayLogo));
    		userNameDisplayLogo.click();
   		
   	     	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
   	     	logoutOption.click();

   	     	Thread.sleep(3000);
    		
    		LoginPage lp=new LoginPage(getDriver()); 
    		
    	    String unamelt="su";
    	  
    	    String pawslt="su";
    	      
    	    lp.enterUserName(unamelt);
    	    
    	    lp.enterPassword(pawslt);
    	    
    	    lp.clickOnSignInBtn();
    	    
    	    //checkRefershPopOnlogin();
    	    
    	    //checkPopUpWindow();
    	  
    		Thread.sleep(7000);

    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
			inventoryMenu.click();
					
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsMenu));
			inventoryTransactionsMenu.click();
				
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoyTransactionsSalesMenu));
			inventoyTransactionsSalesMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesOrders));
			salesOrders.click();
			
			Thread.sleep(3000);
			
			int voucherGridDocNoCount = voucherGridDocNo.size();
			
			String actStatusRow1 = null;
			
			System.out.println("Size  : "+voucherGridDocNoCount);
			
			for (int i = 0; i < voucherGridDocNoCount; i++) 
			{
				String data = voucherGridDocNo.get(i).getText();
				
				if (data.equalsIgnoreCase("1")) 
				{
					 actStatusRow1 =  voucherGridAuthorizationStatus.get(i).getText();
				}
			}
			
			String expStatusRow1 = "Authorized";
			
			
			System.out.println("************************************* checkLogoutAndLoginWithSUToCheckAuthorizationStatusWithKeepUnpostedLinksBaseOptions  *********************************");
			
			System.out.println("StatusRow1 : "+actStatusRow1+" Value Expected : "+expStatusRow1);
			
			if(actStatusRow1.equalsIgnoreCase(expStatusRow1))
			{
				System.out.println("Test Pass : Suspended Succesfully");
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
				homeCloseBtn.click();
    			Thread.sleep(2000);
				//excelReader.setCellData(xlfile, "SmokeSalesOrder", 627, 9, resPass);
				return true;
			}
			else
			{
				System.out.println("Test Fail : NOT Suspended Succesfully");
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
				homeCloseBtn.click();
    			Thread.sleep(2000);
				//excelReader.setCellData(xlfile, "SmokeSalesOrder", 627, 9, resFail);
				return false;
			}
			
		}
		
		
		

		
		
		
		public boolean checkSavingSalesInvoiceVATVoucher1WithConditionKeepUnpostedLinksBaseOptions() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
			financialsMenu.click();
					
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
			financialsTransactionMenu.click();
				
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsSalesMenu));
			financialsTransactionsSalesMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesInvoiceVATVoucher));
			salesInvoiceVATVoucher.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
			newBtn.click();
			
			checkValidationMessage("Screen opened");
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
			
			Thread.sleep(2000);
			
			documentNumberTxt.sendKeys(Keys.CONTROL, "l");
			
			Thread.sleep(2000);
		
			//getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workFlowExpandBtn));	
			//workFlowExpandBtn.click();
		
			Thread.sleep(2000);
			
			boolean actPurchaseVoucherWorlFlowText = workflowTableBody.getText().isEmpty();
			
			boolean expPurchaseVoucherWorlFlowText = false;
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workFlowHeaderChkBoxCL));
			workFlowHeaderChkBoxCL.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workFlowOkBtnCL));
			workFlowOkBtnCL.click();
			
			Thread.sleep(2000);
			
			int voucherGridBodyListCount = voucherGridBodyList.size();
			
			ArrayList<String> voucherGridBodyListArray = new ArrayList<String>();
			
			for(int i=0;i<voucherGridBodyListCount;i++)
			{
    		 
				String data = voucherGridBodyList.get(i).getText();
    		 
				voucherGridBodyListArray.add(data);
			}	
				
    	 
			String actvoucherGridBodyList = voucherGridBodyListArray.toString();
			
			String expvoucherGridBodyList = "[1, HYDERABAD, STD RATE COGS ITEM, , Sales - Computers, Pcs, 10.00, 10.00, 3.00, 3.00, 0, 6.00, SalOrd:1, 0.00, 10.00, 60.00, 0.00, 0.00, 60.00, , , , , 2, , , , , , , , , , , , , , , , , , , , , , , 3, , , , , , , , , , , , , , , , , , , , , , , 4, , , , , , , , , , , , , , , , , , , , , , , 5, , , , , , , , , , , , , , , , , , , , , , ]";
			
			System.out.println("voucherGridBodyList Actual    : " + actvoucherGridBodyList);
			System.out.println("voucherGridBodyList Expected  : " + expvoucherGridBodyList);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
			new_CloseBtn.click();
			
			if(getIsAlertPresent())
			{
				getWaitForAlert();
				getAlert().accept();
			}
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
			homeCloseBtn.click();
			   
			System.out.println("**************************************** checkSavingSalesInvoiceVATVoucher1WithConditionKeepUnpostedLinksBaseOptions  ***************************************");
			
			System.out.println("purchaseVoucherWorlFlowText  		: "+actPurchaseVoucherWorlFlowText		+" 	Value Expected : "+expPurchaseVoucherWorlFlowText);
			
			if(actPurchaseVoucherWorlFlowText==expPurchaseVoucherWorlFlowText && actvoucherGridBodyList.equalsIgnoreCase(expvoucherGridBodyList))
			{
				return true;
			}
			else
			{
				return false;
			}
		}

		
		
		
		
		
		
		
		// Keep Unposted Reservation Option
		
		public boolean 	checkTransactionAuthorizationSalesOrderDocumentAndConditonAsKeepUnpostedSelectingReservationOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
    	{
    		
    		
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsmenuBtn));
    		settingsmenuBtn.click();
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(transactionAuthorizationBtn));
    		transactionAuthorizationBtn.click();
    		
    		Thread.sleep(2000);
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNameDropdown));
    		documentNameDropdown.sendKeys(" ");
    		
    		Thread.sleep(1000);
    			
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNameSalesOrders1));
    		documentNameSalesOrders1.click();
    		
    		Thread.sleep(3000);
    				
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
    		nameTxt.click();
    		
    		nameTxt.sendKeys(Keys.SPACE);
    		
    		int namecount=tranAuthNameList.size();
			
			for(int i=0 ; i < namecount ;i++)
			{
				String data=tranAuthNameList.get(i).getText();
				
				if(data.equalsIgnoreCase("Sales"))
				{
					tranAuthNameList.get(i).click();
					
					break;
				}
			}
				
    		nameTxt.sendKeys(Keys.TAB);
    			
    		Thread.sleep(2000);
    		
    		click(cnrBtn);
    		Thread.sleep(1000);
    		
    		ClickUsingJs(Level1editBtn);
    		Thread.sleep(1000);
    		
    		//getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(Level1editBtn));
    		//Level1editBtn.click();
    		
    		Thread.sleep(2000);
    		
    		//getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(keepUnpostedlinkBaseChkBox));
    		//keepUnpostedlinkBaseChkBox.click();
    		ScrollToElement(keepUnpostedlinkBaseChkBox);
    		ClickUsingJs(keepUnpostedlinkBaseChkBox);
    		
    		//getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(keepUnpostedReservationChkBox));
    		//keepUnpostedReservationChkBox.click();
    		ClickUsingJs(keepUnpostedReservationChkBox);
    		
    		Thread.sleep(2000);
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(definitionOkBtn));
    		definitionOkBtn.click();
    		
    		Thread.sleep(2000);
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(tranAuthSaveBtn));
    		tranAuthSaveBtn.click();
    		
    		
    		String expValidationMsg="Authorization Flow saved successfully.";
    		
    		String actValidationMsg=checkValidationMessage(expValidationMsg);
    		
    		System.out.println("Validation Message : "+actValidationMsg+"  Value Expected : "+expValidationMsg);
    		
    		if(actValidationMsg.equalsIgnoreCase(expValidationMsg))
    		{
    			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(tranAuthCancelBtn));
    			tranAuthCancelBtn.click();
    			return true;
    		}
    		else
    		{
    			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(tranAuthCancelBtn));
    			tranAuthCancelBtn.click();
    			return false;
    		}
    	}
		
		
		
		
		
		
		public static boolean checkSavingSalesOrdersVoucher1WithKeepUnpostedReservationOptions() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
			inventoryMenu.click();
					
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsMenu));
			inventoryTransactionsMenu.click();
				
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoyTransactionsSalesMenu));
			inventoyTransactionsSalesMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesOrders));
			salesOrders.click();
			
			Thread.sleep(3000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherHomeRow1ChkBox));
			voucherHomeRow1ChkBox.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(deleteBtn));
			deleteBtn.click();
			
			getWaitForAlert();
			
			getAlert().accept();
			
			checkValidationMessage("Voucher Deleted Successfully : 1");
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
			newBtn.click();
			
			checkValidationMessage("Screen opened");
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerAccountTxt));
			customerAccountTxt.click();
			customerAccountTxt.sendKeys("Customer A");
			
			Thread.sleep(3000);
			
			customerAccountTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
			select1stRow_1stColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pvWareHouseTxt));
			pvWareHouseTxt.sendKeys("HYDERABAD");
			Thread.sleep(3000);
			pvWareHouseTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
			enter_ItemTxt.sendKeys("STD RATE COGS ITEM");
			Thread.sleep(3000);
			enter_ItemTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_5thColumn));
			select1stRow_5thColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_AQ));
			enter_AQ.sendKeys("3");
			enter_AQ.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_FQ));
			enter_FQ.sendKeys("3");
			enter_FQ.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_10thColumn));
			select1stRow_10thColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
			enter_Rate.sendKeys(Keys.END);
			enter_Rate.sendKeys(Keys.SHIFT, Keys.HOME);
			enter_Rate.sendKeys(Keys.BACK_SPACE);
			enter_Rate.sendKeys("10");
			enter_Rate.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
			enter_Gross.sendKeys(Keys.TAB);
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
			saveBtn.click();
			
			
			String expMessage1= "Voucher saved successfully";
			String expMessage2= ": 1";
			
			String actMessage = checkValidationMessage(expMessage1);
			
			Thread.sleep(2000);
			
		   System.out.println("************************************* checkSavingSalesOrdersVoucher1WithKeepUnpostedReservationOptions  *********************************");
		   
		   System.out.println("SavingMessage  :  "+actMessage +" Value Expected : "+expMessage1+" "+expMessage2);
	
		   if(actMessage.startsWith(expMessage1) && actMessage.endsWith(expMessage2))
    		{
    			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
    			new_CloseBtn.click();
    			Thread.sleep(2000);
    			return true;
    		}
    		else
    		{
    			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
    			new_CloseBtn.click();
    			Thread.sleep(2000);
    			return false;
    		}
    	}
		
		
		
		
		
		
		
		public boolean checkAuthorizationStatusInHomePageAfterSavingVouchersWithConditionKeepUnpostedReservationOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			
			
		
			int voucherGridDocNoCount = voucherGridDocNo.size();
			
			String actStatusRow1 = null;
			
			System.out.println("Size  : "+voucherGridDocNoCount);
			
			for (int i = 0; i < voucherGridDocNoCount; i++) 
			{
				String data = voucherGridDocNo.get(i).getText();
				
				if (data.equalsIgnoreCase("1")) 
				{
					 actStatusRow1 =  voucherGridAuthorizationStatus.get(i).getText();
				}
			}
			
			String expStatusRow1 = "Pending";
			
			System.out.println("************************************* checkAuthorizationStatusInHomePageAfterSavingVouchersWithConditionKeepUnpostedReservationOption  *********************************");
			
			System.out.println("StatusRow1 : "+actStatusRow1+" Value Expected : "+expStatusRow1);
			
			if(actStatusRow1.equalsIgnoreCase(expStatusRow1))
			{
				System.out.println("Test Pass : Authorize Succesfully");
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
				homeCloseBtn.click();
				//excelReader.setCellData(xlfile, "SmokeSalesOrder", 627, 9, resPass);
				return true;
			}
			else
			{
				System.out.println("Test Fail : NOT Authorize Succesfully");
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
				homeCloseBtn.click();
				//excelReader.setCellData(xlfile, "SmokeSalesOrder", 627, 9, resFail);
				return false;
			}
		}
		
		
		
		
		
		
		
		public boolean checkLinkInSalesInvoiceVATVoucher1WithConditionKeepUnpostedReservationOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
			financialsMenu.click();
					
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
			financialsTransactionMenu.click();
				
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsSalesMenu));
			financialsTransactionsSalesMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesInvoiceVATVoucher));
			salesInvoiceVATVoucher.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
			newBtn.click();
			
			checkValidationMessage("Screen opened");
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
			
			Thread.sleep(2000);
			
			documentNumberTxt.sendKeys(Keys.CONTROL, "l");
			
			Thread.sleep(2000);
			
			documentNumberTxt.sendKeys(Keys.CONTROL, "l");
			
			Thread.sleep(2000);
			boolean actWarehouseText  =pvWareHouseTxt.getText().isEmpty();
			boolean expWarehouseText = true;
			
			System.err.println("actWarehouseText       :"+actWarehouseText);
			System.err.println("expWarehouseText       :"+expWarehouseText);
		
			//getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workFlowExpandBtn));	
			//workFlowExpandBtn.click();
		
			Thread.sleep(2000);
			
			//boolean actPurchaseVoucherWorlFlowText = workflowTableBody.getText().isEmpty();
			
			//boolean expPurchaseVoucherWorlFlowText = true;
			   
			System.out.println("**************************************** checkLinkInSalesInvoiceVATVoucher1WithConditionKeepUnpostedLinksBaseOptions  ***************************************");
			
			//System.out.println("purchaseVoucherWorlFlowText  		: "+actPurchaseVoucherWorlFlowText		+" 	Value Expected : "+expPurchaseVoucherWorlFlowText);
			
			if(actWarehouseText==expWarehouseText)
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
				new_CloseBtn.click();
				Thread.sleep(2000);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
				homeCloseBtn.click();
				Thread.sleep(2000);
				return true;
			}
			else
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
				new_CloseBtn.click();
				Thread.sleep(2000);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
				homeCloseBtn.click();
				Thread.sleep(2000);
				return false;
			}
			
		
			//getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workFlowExpandBtn));	
			//workFlowExpandBtn.click();
			/*
			Thread.sleep(2000);
			
			boolean actPurchaseVoucherWorlFlowText = workflowTableBody.getText().isEmpty();
			
			boolean expPurchaseVoucherWorlFlowText = true;
			   
			System.out.println("**************************************** checkLinkInSalesInvoiceVATVoucher1WithConditionKeepUnpostedReservationOption  ***************************************");
			
			System.out.println("purchaseVoucherWorlFlowText  		: "+actPurchaseVoucherWorlFlowText		+" 	Value Expected : "+expPurchaseVoucherWorlFlowText);
			
			if(actPurchaseVoucherWorlFlowText==expPurchaseVoucherWorlFlowText)
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
				new_CloseBtn.click();
				Thread.sleep(2000);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
				homeCloseBtn.click();
				Thread.sleep(2000);
				return true;
			}
			else
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
				new_CloseBtn.click();
				Thread.sleep(2000);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
				homeCloseBtn.click();
				Thread.sleep(2000);
				return false;
			}*/
		}

		
		
		
		
		
		public static boolean checkLogoutAndLoginWithUserAllOptionsWithKeepUnpostedReservationOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
    	{
    		
    		
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplayLogo));
    		userNameDisplayLogo.click();
   		
   		
   	     	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
   	     	logoutOption.click();

   	     	Thread.sleep(3000);
    		
    		LoginPage lp=new LoginPage(getDriver()); 
    		
    	    String unamelt="UserAllOptions";
    	  
    	    String pawslt="12345";
    	      
    	    lp.enterUserName(unamelt);
    	    
    	    lp.enterPassword(pawslt);
    	    
    	    lp.clickOnSignInBtn();
    	    
    	    //checkRefershPopOnlogin();
    	    
    	    //checkPopUpWindow();
    	  
    		Thread.sleep(7000);

    		String actUserInfo=userNameDisplay.getText();
    		
    		System.out.println("User Info  : "+actUserInfo);
    		
    		System.out.println("User Info Capture Text  :  "+userNameDisplay.getText());
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(companyLogo));
    		companyLogo.click();
    		
    		String getCompanyTxt=companyName.getText();
    		String getLoginCompanyName=getCompanyTxt.substring(0, 19);
    		System.out.println("company name  :  "+ getLoginCompanyName);
    		companyLogo.click();
    		
    		boolean actDashboard = dashboard.isDisplayed();
    		
    		
    		String expUserInfo           ="UserAllOptions";
    		String expLoginCompanyName   ="Automation";
    		boolean expDashboard = true;

    		if (actUserInfo.equalsIgnoreCase(expUserInfo) && getLoginCompanyName.contains(expLoginCompanyName) && actDashboard==expDashboard) 
    		{
				return true;
			}
    		else
    		{
    			return false;
			}
    	}
    	
    	
    	
		
		
		
		
		public static boolean checkSalesOrderAuthorizationStatusWithUserAllOptionsWithKeepUnpostedReservationOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
			inventoryMenu.click();
					
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsMenu));
			inventoryTransactionsMenu.click();
				
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoyTransactionsSalesMenu));
			inventoyTransactionsSalesMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesOrders));
			salesOrders.click();
			
			Thread.sleep(3000);
			
			int voucherGridDocNoCount = voucherGridDocNo.size();
			
			String actStatusRow1 = null;
			
			System.out.println("Size  : "+voucherGridDocNoCount);
			
			for (int i = 0; i < voucherGridDocNoCount; i++) 
			{
				String data = voucherGridDocNo.get(i).getText();
				
				if (data.equalsIgnoreCase("1")) 
				{
					 actStatusRow1 =  voucherGridAuthorizationStatus.get(i).getText();
				}
			}
			
			String expStatusRow1 = "Pending";
			
			Thread.sleep(2000);
			
			click(homePageVoucherArrowBtn);
			Thread.sleep(1000);

			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pendingAuthorizationPurchases));
			pendingAuthorizationPurchases.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherHomeRow1ChkBox));
			voucherHomeRow1ChkBox.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(authorizeBtn));
			authorizeBtn.click();
			
			Thread.sleep(2000);
			
			click(homePageVoucherArrowBtn);
			Thread.sleep(1000);

			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homePageAllVouchersView));
			homePageAllVouchersView.click();
			
			String actAfterAuthorizeStatusRow1 = null;
			
			for (int i = 0; i < voucherGridDocNoCount; i++) 
			{
				String data = voucherGridDocNo.get(i).getText();
				
				if (data.equalsIgnoreCase("1")) 
				{
					 actAfterAuthorizeStatusRow1 =  voucherGridAuthorizationStatus.get(i).getText();
				}
			}
			
			String expAfterAuthorizeStatusRow1 = "Authorized";
			
			System.out.println("************************************* checkSalesOrderAuthorizationStatusWithUserAllOptionsWithKeepUnpostedReservationOption  *********************************");
			
			System.out.println("StatusRow1               : "+actStatusRow1				+" Value Expected : "+expStatusRow1);
			System.out.println("AfterAuthorizeStatusRow1 : "+actAfterAuthorizeStatusRow1+" Value Expected : "+expAfterAuthorizeStatusRow1);
			
			if(actStatusRow1.equalsIgnoreCase(expStatusRow1) && actAfterAuthorizeStatusRow1.equalsIgnoreCase(expAfterAuthorizeStatusRow1))
			{
				System.out.println("Test Pass : Authorized Succesfully");
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
				homeCloseBtn.click();
    			Thread.sleep(3000);
				//excelReader.setCellData(xlfile, "SmokeSalesOrder", 627, 9, resPass);
				return true;
			}
			else
			{
				System.out.println("Test Fail : NOT Authorized Succesfully");
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
				homeCloseBtn.click();
    			Thread.sleep(3000);
				//excelReader.setCellData(xlfile, "SmokeSalesOrder", 627, 9, resFail);
				return false;
			}
			
		}
			
	
		
		
		
		
		
		public static boolean checkLogoutAndLoginWithSUToCheckAuthorizationStatusWithKeepUnpostedReservationOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
    	{
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplayLogo));
    		userNameDisplayLogo.click();
   		
   	     	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
   	     	logoutOption.click();

   	     	Thread.sleep(3000);
    		
    		LoginPage lp=new LoginPage(getDriver()); 
    		
    	    String unamelt="su";
    	  
    	    String pawslt="su";
    	      
    	    lp.enterUserName(unamelt);
    	    
    	    lp.enterPassword(pawslt);
    	    
    	    lp.clickOnSignInBtn();
    	    
    	    //checkRefershPopOnlogin();
    	    
    	    //checkPopUpWindow();
    	  
    		Thread.sleep(7000);

    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
			inventoryMenu.click();
					
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsMenu));
			inventoryTransactionsMenu.click();
				
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoyTransactionsSalesMenu));
			inventoyTransactionsSalesMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesOrders));
			salesOrders.click();
			
			Thread.sleep(3000);
			
			int voucherGridDocNoCount = voucherGridDocNo.size();
			
			String actStatusRow1 = null;
			
			System.out.println("Size  : "+voucherGridDocNoCount);
			
			for (int i = 0; i < voucherGridDocNoCount; i++) 
			{
				String data = voucherGridDocNo.get(i).getText();
				
				if (data.equalsIgnoreCase("1")) 
				{
					 actStatusRow1 =  voucherGridAuthorizationStatus.get(i).getText();
				}
			}
			
			String expStatusRow1 = "Authorized";
			
			
			System.out.println("************************************* checkLogoutAndLoginWithSUToCheckAuthorizationStatusWithKeepUnpostedReservationOption  *********************************");
			
			System.out.println("StatusRow1 : "+actStatusRow1+" Value Expected : "+expStatusRow1);
			
			if(actStatusRow1.equalsIgnoreCase(expStatusRow1))
			{
				System.out.println("Test Pass : Suspended Succesfully");
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
				homeCloseBtn.click();
    			Thread.sleep(2000);
				//excelReader.setCellData(xlfile, "SmokeSalesOrder", 627, 9, resPass);
				return true;
			}
			else
			{
				System.out.println("Test Fail : NOT Suspended Succesfully");
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
				homeCloseBtn.click();
    			Thread.sleep(2000);
				//excelReader.setCellData(xlfile, "SmokeSalesOrder", 627, 9, resFail);
				return false;
			}
			
		}
		
		
		

		
		
		
		public boolean checkSavingSalesInvoiceVATVoucher1WithConditionKeepUnpostedReservationOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
			financialsMenu.click();
					
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
			financialsTransactionMenu.click();
				
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsSalesMenu));
			financialsTransactionsSalesMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesInvoiceVATVoucher));
			salesInvoiceVATVoucher.click();
			
			Thread.sleep(3000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
			newBtn.click();
			
			checkValidationMessage("Screen opened");
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
			
			Thread.sleep(2000);
			
			documentNumberTxt.sendKeys(Keys.CONTROL, "l");
			
			Thread.sleep(2000);
		
			//getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workFlowExpandBtn));	
			//workFlowExpandBtn.click();
		
			Thread.sleep(2000);
			
			boolean actPurchaseVoucherWorlFlowText = workflowTableBody.getText().isEmpty();
			
			boolean expPurchaseVoucherWorlFlowText = false;
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workFlowHeaderChkBoxCL));
			workFlowHeaderChkBoxCL.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workFlowOkBtnCL));
			workFlowOkBtnCL.click();
			
			Thread.sleep(2000);
			
			int voucherGridBodyListCount = voucherGridBodyList.size();
			
			ArrayList<String> voucherGridBodyListArray = new ArrayList<String>();
			
			for(int i=0;i<voucherGridBodyListCount;i++)
			{
    		 
				String data = voucherGridBodyList.get(i).getText();
    		 
    		 
				voucherGridBodyListArray.add(data);
			}	
				
    	 
			String actvoucherGridBodyList = voucherGridBodyListArray.toString();
			
			String expvoucherGridBodyList = "[1, HYDERABAD, STD RATE COGS ITEM, , Sales - Computers, Pcs, 10.00, 10.00, 3.00, 3.00, 0, 6.00, SalOrd:1, 0.00, 10.00, 60.00, 0.00, 0.00, 60.00, , , , , 2, , , , , , , , , , , , , , , , , , , , , , , 3, , , , , , , , , , , , , , , , , , , , , , , 4, , , , , , , , , , , , , , , , , , , , , , , 5, , , , , , , , , , , , , , , , , , , , , , ]";
			
			System.out.println("voucherGridBodyList Actual    : " + actvoucherGridBodyList);
			System.out.println("voucherGridBodyList Expected  : " + expvoucherGridBodyList);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
			new_CloseBtn.click();
			
			if(getIsAlertPresent())
			{
				getWaitForAlert();
				getAlert().accept();
			}
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
			homeCloseBtn.click();
			   
			System.out.println("**************************************** checkSavingSalesInvoiceVATVoucher1WithConditionKeepUnpostedReservationOption  ***************************************");
			
			System.out.println("purchaseVoucherWorlFlowText  		: "+actPurchaseVoucherWorlFlowText		+" 	Value Expected : "+expPurchaseVoucherWorlFlowText);
			
			if(actPurchaseVoucherWorlFlowText==expPurchaseVoucherWorlFlowText && actvoucherGridBodyList.equalsIgnoreCase(expvoucherGridBodyList))
			{
				System.out.println("Test Pass : Error Message is Displayed ");
				//excelReader.setCellData(xlfile, "SmokeSalesInvoiceVATRelease", 785, 9, resPass);
				return true;
			}
			else
			{
				System.out.println("Test Fail : Error Message is Displayed ");
				//excelReader.setCellData(xlfile, "SmokeSalesInvoiceVATRelease", 785, 9, resFail);
				return false;
			}
		}

		
		
		
		
		
		
		public boolean checkEraseAllTransactionsAfterConditionKeepUnpostedReservationOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
			homeMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dataMangementMenu));
			dataMangementMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(eraseAll));
			eraseAll.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(eraseTranscationsRadio));
			eraseTranscationsRadio.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(eraseAllOkBtn));
			eraseAllOkBtn.click();
			
			if(getIsAlertPresent())
			{
				getWaitForAlert();
				
				getAlert().accept();
			}
			
			
			String expValidationMsg="Data deleted successfully.";
    		
    		String actValidationMsg=checkValidationMessage(expValidationMsg);
			
			
			System.out.println("************************************* checkEraseAllTransactionsAfterConditionKeepUnpostedReservationOption  *********************************");
			System.out.println("Message  :  "+actValidationMsg +" Value Expected : "+expValidationMsg);
			
			if (actValidationMsg.equalsIgnoreCase(expValidationMsg))
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		
		
		
		
		
		
		
		// Keep Unposted Links Option
		
		public static boolean checkSavingPurchaseOrderVoucher1WithOutKeepUnpostedLinksOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
			inventoryMenu.click();
					
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsMenu));
			inventoryTransactionsMenu.click();
				
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsPurchasesMenu));
			inventoryTransactionsPurchasesMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchasesOrdersVoucher));
			purchasesOrdersVoucher.click();
			
			Thread.sleep(3000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
			newBtn.click();
			
			checkValidationMessage("Screen opened");
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
			vendorAccountTxt.click();
			vendorAccountTxt.sendKeys("Vendor A");
			
			Thread.sleep(2000);
			
			vendorAccountTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
			select1stRow_1stColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pvWareHouseTxt));
			////pvWareHouseTxt.click();
			pvWareHouseTxt.sendKeys("HYDERABAD");
			
			Thread.sleep(2000);
			
			pvWareHouseTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
			enter_ItemTxt.sendKeys("STD RATE COGS ITEM");
			Thread.sleep(3000);
			enter_ItemTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_UnitTxt));
			enter_UnitTxt.sendKeys(Keys.TAB);
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
			enter_Quantity.sendKeys("1");
			enter_Quantity.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
			enter_Rate.sendKeys(Keys.END);
			enter_Rate.sendKeys(Keys.SHIFT, Keys.HOME);
			enter_Rate.sendKeys(Keys.BACK_SPACE);
			enter_Rate.sendKeys("10");
			enter_Rate.sendKeys(Keys.TAB);
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
			saveBtn.click();
			
			
			String expMessage1= "Voucher saved successfully";
			String expMessage2= ": 1";

			String actMessage = checkValidationMessage(expMessage1);
			
		   System.out.println("************************************* checkSavingPurchaseOrderVoucher1WithOutKeepUnpostedLinksOption  *********************************");
		   
		   System.out.println("SavingMessage  :  "+actMessage +" Value Expected : "+expMessage1+" "+expMessage2);
	
		   if(actMessage.startsWith(expMessage1) && actMessage.endsWith(expMessage2))
    		{
    			return true;
    		}
    		else
    		{
    			return false;
    		}
    	}
		
		
		
		
		
		
		
		public static boolean checkSavingPurchaseOrderVoucher2WithOutKeepUnpostedLinksOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
			vendorAccountTxt.click();
			vendorAccountTxt.sendKeys("Vendor A");
			
			Thread.sleep(2000);
			
			vendorAccountTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
			select1stRow_1stColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pvWareHouseTxt));
			//pvWareHouseTxt.click();
			pvWareHouseTxt.sendKeys("HYDERABAD");
			
			Thread.sleep(2000);
			
			pvWareHouseTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
			enter_ItemTxt.sendKeys("STD RATE COGS ITEM");
			Thread.sleep(3000);
			enter_ItemTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_UnitTxt));
			enter_UnitTxt.sendKeys(Keys.TAB);
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
			enter_Quantity.sendKeys("1");
			enter_Quantity.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
			enter_Rate.sendKeys(Keys.END);
			enter_Rate.sendKeys(Keys.SHIFT, Keys.HOME);
			enter_Rate.sendKeys(Keys.BACK_SPACE);
			enter_Rate.sendKeys("10");
			enter_Rate.sendKeys(Keys.TAB);
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
			saveBtn.click();
			
			
			String expMessage1= "Voucher saved successfully";
			String expMessage2= ": 2";

			String actMessage = checkValidationMessage(expMessage1);
			
		   System.out.println("************************************* checkSavingPurchaseOrderVoucher2WithOutKeepUnpostedLinksOption  *********************************");
		   
		   System.out.println("SavingMessage  :  "+actMessage +" Value Expected : "+expMessage1+" "+expMessage2);
	
		   if(actMessage.startsWith(expMessage1) && actMessage.endsWith(expMessage2))
    		{
    			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
    			new_CloseBtn.click();
    			Thread.sleep(2000);
    			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
    			homeCloseBtn.click();
    			return true;
    		}
    		else
    		{
    			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
    			new_CloseBtn.click();
    			Thread.sleep(2000);
    			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
    			homeCloseBtn.click();
    			return false;
    		}
    	}
		
		
		
		
		
		
		
		public static boolean checkSavingPurchaseVoucherN1WithOutKeepUnpostedLinksOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
			financialsMenu.click();
					
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
			financialsTransactionMenu.click();
				
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
			financialsTransactionsPurchaseMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVoucherNew));
			purchaseVoucherNew.click();
			
			Thread.sleep(3000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
			newBtn.click();
			
			checkValidationMessage("Screen opened");
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseAccountTxt));
			purchaseAccountTxt.click();
			purchaseAccountTxt.sendKeys("Purchase");
			
			Thread.sleep(2000);
			
			purchaseAccountTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
			vendorAccountTxt.click();
			vendorAccountTxt.sendKeys("Vendor A");
			
			Thread.sleep(2000);
			
			vendorAccountTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
			departmentTxt.click();
			departmentTxt.sendKeys("INDIA");
			
			Thread.sleep(2000);
			
			departmentTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(wareHouseTxt));
			wareHouseTxt.click();
			wareHouseTxt.sendKeys("HYDERABAD");
			
			Thread.sleep(2000);
			
			wareHouseTxt.sendKeys(Keys.TAB);
			
			//getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workFlowExpandBtn));	
			//workFlowExpandBtn.click();
			documentNumberTxt.sendKeys(Keys.CONTROL, "l");
			
			Thread.sleep(2000);
		
			
			
			boolean actPurchaseVoucherWorlFlowText = workflowTableBody.getText().isEmpty();
			
			boolean expPurchaseVoucherWorlFlowText = false;
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workFlowRow1ChkBoxCL));
			workFlowRow1ChkBoxCL.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workFlowOkBtnCL));
			workFlowOkBtnCL.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
			saveBtn.click();
			
			Thread.sleep(3000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
			billRefPickIcon.click();
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
			billRefOkBtn.click();
			
			
			String expMessage1= "Voucher saved successfully";
			String expMessage2= ": 1";

			String actMessage = checkValidationMessage(expMessage1);
			
		   System.out.println("************************************* checkSavingPurchaseVoucherN1WithOutKeepUnpostedLinksOption  *********************************");
		   
		   System.out.println("SavingMessage  :  "+actMessage +" Value Expected : "+expMessage1+" "+expMessage2);
	
		   if(actMessage.startsWith(expMessage1) && actMessage.endsWith(expMessage2))
    		{
    			return true;
    		}
    		else
    		{
    			return false;
    		}
    	}
		
		
		
		
		
		
		public static boolean checkSavingPurchaseVoucherN2WithOutKeepUnpostedLinksOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseAccountTxt));
			purchaseAccountTxt.click();
			purchaseAccountTxt.sendKeys("Purchase");
			
			Thread.sleep(2000);
			
			purchaseAccountTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
			vendorAccountTxt.click();
			vendorAccountTxt.sendKeys("Vendor A");
			
			Thread.sleep(2000);
			
			vendorAccountTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
			departmentTxt.click();
			departmentTxt.sendKeys("INDIA");
			
			Thread.sleep(2000);
			
			departmentTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(wareHouseTxt));
			wareHouseTxt.click();
			wareHouseTxt.sendKeys("HYDERABAD");
			
			Thread.sleep(2000);
			
			wareHouseTxt.sendKeys(Keys.TAB);
			
			//getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workFlowExpandBtn));	
			//workFlowExpandBtn.click();
			documentNumberTxt.sendKeys(Keys.CONTROL, "l");
			
			Thread.sleep(2000);
		
			Thread.sleep(2000);
			
			boolean actPurchaseVoucherWorlFlowText = workflowTableBody.getText().isEmpty();
			
			boolean expPurchaseVoucherWorlFlowText = false;
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workFlowRow1ChkBoxCL));
			workFlowRow1ChkBoxCL.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workFlowOkBtnCL));
			workFlowOkBtnCL.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
			saveBtn.click();
			
			Thread.sleep(3000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
			billRefPickIcon.click();
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
			billRefOkBtn.click();
			
			
			String expMessage1= "Voucher saved successfully";
			String expMessage2= ": 2";
			
			String actMessage = checkValidationMessage(expMessage1);
			
		   System.out.println("************************************* checkSavingPurchaseVoucherN2WithOutKeepUnpostedLinksOption  *********************************");
		   
		   System.out.println("SavingMessage  :  "+actMessage +" Value Expected : "+expMessage1+" "+expMessage2);
	
		   if(actMessage.startsWith(expMessage1) && actMessage.endsWith(expMessage2))
    		{
    			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
    			new_CloseBtn.click();
    			Thread.sleep(2000);
    			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
    			homeCloseBtn.click();
    			return true;
    		}
    		else
    		{
    			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
    			new_CloseBtn.click();
    			Thread.sleep(2000);
    			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
    			homeCloseBtn.click();
    			return false;
    		}
    	}
		
		
		
		
		
				

		
		public boolean checkInventoryOrderManagementAnalysisOfLinkedOrUnLinkedListingOfDocReportWithoutConditionKeepUnpostedLinkOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
			inventoryMenu.click();
			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(orderManagementMenu));
			orderManagementMenu.click();
			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(analysisOfLinkedORUnlinkedDocumentsMenu));
			analysisOfLinkedORUnlinkedDocumentsMenu.click();
			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(listingOfDocuments));
			listingOfDocuments.click();
			
			Thread.sleep(3000);
			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
			Select s=new Select(sl_DateOptionDropdown);
			s.selectByIndex(1);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(listingOfDocWorkFlowTxt));
			listingOfDocWorkFlowTxt.click();
			listingOfDocWorkFlowTxt.sendKeys("Purchases Orders vs Purchase Vouchers N");
			Thread.sleep(2000);
			listingOfDocWorkFlowTxt.sendKeys(Keys.TAB);
			
			Thread.sleep(2000);
			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
			sl_OkBtn.click();
			
			Thread.sleep(3000);
			
			// Actual
			String actVoucherR1				=listOfDoc_1stRow2ndCol.getText();
			String actItemR1				=listOfDoc_1stRow3rdCol.getText();
			String actLinkValueR1			=listOfDoc_1stRow4thCol.getText();
			boolean actBalanceR1			=listOfDoc_1stRow5thCol.getText().isEmpty();
			String actStatusR1				=listOfDoc_1stRow6thCol.getText();
			
			String actVoucherR2				=listOfDoc_2ndRow2ndCol.getText();
			String actItemR2				=listOfDoc_2ndRow3rdCol.getText();
			String actLinkValueR2			=listOfDoc_2ndRow4thCol.getText();
			boolean actBalanceR2			=listOfDoc_2ndRow5thCol.getText().isEmpty();
			String actStatusR2				=listOfDoc_2ndRow6thCol.getText();
			
			boolean actVoucherR3			=listOfDoc_3rdRow2ndCol.getText().isEmpty();
			boolean actItemR3				=listOfDoc_3rdRow3rdCol.getText().isEmpty();
			String actLinkValueR3			=listOfDoc_3rdRow4thCol.getText();
			boolean actBalanceR3			=listOfDoc_3rdRow5thCol.getText().isEmpty();
			boolean actStatusR3				=listOfDoc_3rdRow6thCol.getText().isEmpty();
			
			
			// Expected
			String expVoucherR1				="PurOrd:1";
			String expItemR1				="STD RATE COGS ITEM";
			String expLinkValueR1			="12";
			boolean expBalanceR1			=true;
			String expStatusR1				="Closed";
			
			String expVoucherR2				="PurOrd:2";
			String expItemR2				="STD RATE COGS ITEM";
			String expLinkValueR2			="12";
			boolean expBalanceR2			=true;
			String expStatusR2				="Closed";
			
			boolean expVoucherR3			=true;
			boolean expItemR3				=true;
			String expLinkValueR3			="24";
			boolean expBalanceR3			=true;
			boolean expStatusR3				=true;
		
			
			System.out.println("*********************************checkInventoryOrderManagementAnalysisOfLinkedOrUnLinkedListingOfDocReportWithoutConditionKeepUnpostedLinkOption*****************************************");
			
			System.out.println("VoucherR1   : "+actVoucherR1	+" Value Expected "+expVoucherR1);
			System.out.println("ItemR1      : "+actItemR1		+" Value Expected "+expItemR1);
			System.out.println("LinkValueR1 : "+actLinkValueR1	+" Value Expected "+expLinkValueR1);
			System.out.println("BalanceR1   : "+actBalanceR1	+" Value Expected "+expBalanceR1);
			System.out.println("StatusR1    : "+actStatusR1		+" Value Expected "+expStatusR1);
			System.out.println("VoucherR2   : "+actVoucherR2	+" Value Expected "+expVoucherR2);
			System.out.println("ItemR2      : "+actItemR2		+" Value Expected "+expItemR2);
			System.out.println("LinkValueR2 : "+actLinkValueR2	+" Value Expected "+expLinkValueR2);
			System.out.println("BalanceR2   : "+actBalanceR2	+" Value Expected "+expBalanceR2);
			System.out.println("StatusR2    : "+actStatusR2		+" Value Expected "+expStatusR2);
			System.out.println("VoucherR3   : "+actVoucherR3	+" Value Expected "+expVoucherR3);
			System.out.println("ItemR3      : "+actItemR3		+" Value Expected "+expItemR3);
			System.out.println("LinkValueR3 : "+actLinkValueR3	+" Value Expected "+expLinkValueR3);
			System.out.println("BalanceR3   : "+actBalanceR3	+" Value Expected "+expBalanceR3);
			System.out.println("StatusR3    : "+actStatusR3		+" Value Expected "+expStatusR3);
			
			if(actVoucherR1.equalsIgnoreCase(expVoucherR1) && actItemR1.equalsIgnoreCase(expItemR1) && actLinkValueR1.equalsIgnoreCase(expLinkValueR1)
				&& actBalanceR1==expBalanceR1 && actStatusR1.equalsIgnoreCase(expStatusR1) && actVoucherR2.equalsIgnoreCase(expVoucherR2)
				&& actItemR2.equalsIgnoreCase(expItemR2) && actLinkValueR2.equalsIgnoreCase(expLinkValueR2) && actBalanceR2==expBalanceR2
				&& actStatusR2.equalsIgnoreCase(expStatusR2) && actVoucherR3==expVoucherR3 && actItemR3==expItemR3 && actLinkValueR3.equalsIgnoreCase(expLinkValueR3)
				&& actBalanceR3==expBalanceR3 && actStatusR3==expStatusR3)
			{
				System.out.println("Test Pass : Reports Are As Expected");
				//excelReader.setCellData(xlfile, xlsheet, 992, 9, resPass);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
				report_CloseBtn.click();
				Thread.sleep(2000);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
				sl_CloseBtn.click();
				return true;
			}
			else
			{
				System.out.println("Test Fail : Reports Are NOT As Expected");
				//excelReader.setCellData(xlfile, xlsheet, 992, 9, resFail);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
				report_CloseBtn.click();
				Thread.sleep(2000);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
				sl_CloseBtn.click();
				return false;
			}
		}
		
		
	
		
		
		
		public boolean checkEraseAllTransactionsWithoutKeepUnpostedLinksOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
			homeMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dataMangementMenu));
			dataMangementMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(eraseAll));
			eraseAll.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(eraseTranscationsRadio));
			eraseTranscationsRadio.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(eraseAllOkBtn));
			eraseAllOkBtn.click();
			
			if(getIsAlertPresent())
			{
				getWaitForAlert();
				
				getAlert().accept();
			}
			
			String expValidationMsg="Data deleted successfully.";
    		
    		String actValidationMsg=checkValidationMessage(expValidationMsg);
			
			System.out.println("************************************* checkEraseAllTransactionsWithoutKeepUnpostedLinksOption  *********************************");
			System.out.println("Message  :  "+actValidationMsg +" Value Expected : "+expValidationMsg);
			
			if (actValidationMsg.equalsIgnoreCase(expValidationMsg))
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
				sl_CloseBtn.click();
				return true;
			}
			else
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
				sl_CloseBtn.click();
				return false;
			}
		}
		

		
		
		
		
		
		public boolean 	checkSelectingConditionAsLinksInTransactionAuthorizationConditionTab() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
    	{
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsmenuBtn));
    		settingsmenuBtn.click();
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(transactionAuthorizationBtn));
    		transactionAuthorizationBtn.click();
    		
    		Thread.sleep(2000);
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNameDropdown));
    		documentNameDropdown.sendKeys(" ");
    		
    		Thread.sleep(1000);
    			
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchasevoucherExpandbutton));
    		purchasevoucherExpandbutton.click();
    	
            getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchasevoucherTypeCreatedVoucher));
    		purchasevoucherTypeCreatedVoucher.click();
    		
    		Thread.sleep(3000);
    				
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
    		nameTxt.click();
    		
    		nameTxt.sendKeys(Keys.SPACE);
    		
    		int namecount=tranAuthNameList.size();
			
			for(int i=0 ; i < namecount ;i++)
			{
				String data=tranAuthNameList.get(i).getText();
				
				if(data.equalsIgnoreCase("Purchase"))
				{
					tranAuthNameList.get(i).click();
					
					break;
				}
			}
				
    		nameTxt.sendKeys(Keys.TAB);
    			
    		Thread.sleep(3000);
    		
    		click(cnrBtn);
    		Thread.sleep(1000);
    		
    		ClickUsingJs(Level1editBtn);
    		Thread.sleep(1000);
    		
    		//getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(Level1editBtn));
    		//Level1editBtn.click();
    		ScrollToElement(keepUnpostedfinancialAccountingChkBox);
    		
    		Thread.sleep(3000);
    		
    		if (keepUnpostedfinancialAccountingChkBox.isSelected()) 
    		{
    			//getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(keepUnpostedfinancialAccountingChkBox));
        		//keepUnpostedfinancialAccountingChkBox.click();
    			ClickUsingJs(keepUnpostedfinancialAccountingChkBox);
			}
    		
    		if (keepUnpostedInventoryChkBox.isSelected()) 
    		{
    			//getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(keepUnpostedInventoryChkBox));
        		//keepUnpostedInventoryChkBox.click();
    			ClickUsingJs(keepUnpostedInventoryChkBox);
    			
			}
    		
    		//getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(keepUnpostedLinksChkBox));
    		//keepUnpostedLinksChkBox.click();
    		ClickUsingJs(keepUnpostedLinksChkBox);
    		
    		Thread.sleep(2000);
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(definitionOkBtn));
    		definitionOkBtn.click();
    		
    		Thread.sleep(2000);
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(tranAuthSaveBtn));
    		tranAuthSaveBtn.click();
    		
    		String expValidationMsg="Authorization Flow saved successfully.";
    		
    		String actValidationMsg=checkValidationMessage(expValidationMsg);
    				
    		System.out.println("Validation Message : "+actValidationMsg+"  Value Expected : "+"True");
    		
    		if(actValidationMsg.equalsIgnoreCase(expValidationMsg))
    		{
    			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(tranAuthCancelBtn));
    			tranAuthCancelBtn.click();
    			return true;
    		}
    		else
    		{
    			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(tranAuthCancelBtn));
    			tranAuthCancelBtn.click();
    			return false;
    		}
    	}
		
		
		
		
		
		
		
		public static boolean checkSavingPurchaseOrderVoucher1WithKeepUnpostedLinksOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
			inventoryMenu.click();
					
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsMenu));
			inventoryTransactionsMenu.click();
				
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsPurchasesMenu));
			inventoryTransactionsPurchasesMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchasesOrdersVoucher));
			purchasesOrdersVoucher.click();
			
			Thread.sleep(3000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
			newBtn.click();
			
			checkValidationMessage("Screen opened");
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
			vendorAccountTxt.click();
			vendorAccountTxt.sendKeys("Vendor A");
			
			Thread.sleep(2000);
			
			vendorAccountTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
			select1stRow_1stColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pvWareHouseTxt));
			//pvWareHouseTxt.click();
			pvWareHouseTxt.sendKeys("HYDERABAD");
			
			Thread.sleep(2000);
			
			pvWareHouseTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
			enter_ItemTxt.sendKeys("STD RATE COGS ITEM");
			Thread.sleep(3000);
			enter_ItemTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_UnitTxt));
			enter_UnitTxt.sendKeys(Keys.TAB);
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
			enter_Quantity.sendKeys("1");
			enter_Quantity.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
			enter_Rate.sendKeys(Keys.END);
			enter_Rate.sendKeys(Keys.SHIFT, Keys.HOME);
			enter_Rate.sendKeys(Keys.BACK_SPACE);
			enter_Rate.sendKeys("10");
			enter_Rate.sendKeys(Keys.TAB);
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
			saveBtn.click();
			
			
			String expMessage1= "Voucher saved successfully";
			String expMessage2= ": 1";
			
			String actMessage = checkValidationMessage(expMessage1);
			
		   System.out.println("************************************* checkSavingPurchaseOrderVoucher1WithKeepUnpostedLinksOption  *********************************");
		   
		   System.out.println("SavingMessage  :  "+actMessage +" Value Expected : "+expMessage1+" "+expMessage2);
	
		   if(actMessage.startsWith(expMessage1) && actMessage.endsWith(expMessage2))
    		{
    			return true;
    		}
    		else
    		{
    			return false;
    		}
    	}
		
		
		
		
		
		
		
		public static boolean checkSavingPurchaseOrderVoucher2WithKeepUnpostedLinksOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
			vendorAccountTxt.click();
			vendorAccountTxt.sendKeys("Vendor A");
			
			Thread.sleep(2000);
			
			vendorAccountTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
			select1stRow_1stColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pvWareHouseTxt));
			//pvWareHouseTxt.click();
			pvWareHouseTxt.sendKeys("HYDERABAD");
			
			Thread.sleep(2000);
			
			pvWareHouseTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
			enter_ItemTxt.sendKeys("STD RATE COGS ITEM");
			Thread.sleep(3000);
			enter_ItemTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_UnitTxt));
			enter_UnitTxt.sendKeys(Keys.TAB);
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
			enter_Quantity.sendKeys("1");
			enter_Quantity.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
			enter_Rate.sendKeys(Keys.END);
			enter_Rate.sendKeys(Keys.SHIFT, Keys.HOME);
			enter_Rate.sendKeys(Keys.BACK_SPACE);
			enter_Rate.sendKeys("10");
			enter_Rate.sendKeys(Keys.TAB);
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
			saveBtn.click();
			
			String expMessage1= "Voucher saved successfully";
			String expMessage2= ": 2";
			
			String actMessage = checkValidationMessage(expMessage1);
			
		   System.out.println("************************************* checkSavingPurchaseOrderVoucher2WithKeepUnpostedLinksOption  *********************************");
		   
		   System.out.println("SavingMessage  :  "+actMessage +" Value Expected : "+expMessage1+" "+expMessage2);
	
		   if(actMessage.startsWith(expMessage1) && actMessage.endsWith(expMessage2))
    		{
    			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
    			new_CloseBtn.click();
    			Thread.sleep(2000);
    			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
    			homeCloseBtn.click();
    			return true;
    		}
    		else
    		{
    			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
    			new_CloseBtn.click();
    			Thread.sleep(2000);
    			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
    			homeCloseBtn.click();
    			return false;
    		}
    	}
		
		
		
		
		
		
		
		public static boolean checkSavingPurchaseVoucherN1WithKeepUnpostedLinksOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
			financialsMenu.click();
					
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
			financialsTransactionMenu.click();
				
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
			financialsTransactionsPurchaseMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVoucherNew));
			purchaseVoucherNew.click();
			
			Thread.sleep(3000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
			newBtn.click();
			
			checkValidationMessage("Screen opened");
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseAccountTxt));
			purchaseAccountTxt.click();
			purchaseAccountTxt.sendKeys("Purchase");
			
			Thread.sleep(2000);
			
			purchaseAccountTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
			vendorAccountTxt.click();
			vendorAccountTxt.sendKeys("Vendor A");
			
			Thread.sleep(2000);
			
			vendorAccountTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
			departmentTxt.click();
			departmentTxt.sendKeys("INDIA");
			
			Thread.sleep(2000);
			
			departmentTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(wareHouseTxt));
			wareHouseTxt.click();
			wareHouseTxt.sendKeys("HYDERABAD");
			
			Thread.sleep(2000);
			
			wareHouseTxt.sendKeys(Keys.TAB);
			
			//getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workFlowExpandBtn));	
			//workFlowExpandBtn.click();
			documentNumberTxt.sendKeys(Keys.CONTROL, "l");
			
			Thread.sleep(2000);
		
			//Thread.sleep(2000);
			
			boolean actPurchaseVoucherWorlFlowText = workflowTableBody.getText().isEmpty();
			
			boolean expPurchaseVoucherWorlFlowText = false;
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workFlowRow1ChkBoxCL));
			workFlowRow1ChkBoxCL.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workFlowOkBtnCL));
			workFlowOkBtnCL.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
			saveBtn.click();
			
			Thread.sleep(3000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
			billRefPickIcon.click();
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
			billRefOkBtn.click();
			
			
			String expMessage1= "Voucher saved successfully";
			String expMessage2= ": 1";
			
			String actMessage = checkValidationMessage(expMessage1);
			
		   System.out.println("************************************* checkSavingPurchaseVoucherN1WithKeepUnpostedLinksOption  *********************************");
		   
		   System.out.println("SavingMessage  :  "+actMessage +" Value Expected : "+expMessage1+" "+expMessage2);
	
		   if(actMessage.startsWith(expMessage1) && actMessage.endsWith(expMessage2))
    		{
    			return true;
    		}
    		else
    		{
    			return false;
    		}
    	}
		
		
		
		
		
		
		public static boolean checkSavingPurchaseVoucherN2WithKeepUnpostedLinksOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseAccountTxt));
			purchaseAccountTxt.click();
			purchaseAccountTxt.sendKeys("Purchase");
			
			Thread.sleep(2000);
			
			purchaseAccountTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
			vendorAccountTxt.click();
			vendorAccountTxt.sendKeys("Vendor A");
			
			Thread.sleep(2000);
			
			vendorAccountTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
			departmentTxt.click();
			departmentTxt.sendKeys("INDIA");
			
			Thread.sleep(2000);
			
			departmentTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(wareHouseTxt));
			wareHouseTxt.click();
			wareHouseTxt.sendKeys("HYDERABAD");
			
			Thread.sleep(2000);
			
			wareHouseTxt.sendKeys(Keys.TAB);
			
			//getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workFlowExpandBtn));	
			//workFlowExpandBtn.click();
			
			documentNumberTxt.sendKeys(Keys.CONTROL, "l");
			
			Thread.sleep(2000);
		
			Thread.sleep(2000);
			
			boolean actPurchaseVoucherWorlFlowText = workflowTableBody.getText().isEmpty();
			
			boolean expPurchaseVoucherWorlFlowText = false;
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workFlowRow2ChkBoxCL));
			workFlowRow2ChkBoxCL.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workFlowOkBtnCL));
			workFlowOkBtnCL.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
			saveBtn.click();
			
			Thread.sleep(3000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
			billRefPickIcon.click();
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
			billRefOkBtn.click();
			
			
			String expMessage1= "Voucher saved successfully";
			String expMessage2= ": 2";
			
			String actMessage = checkValidationMessage(expMessage1);
			
		   System.out.println("************************************* checkSavingPurchaseVoucherN2WithKeepUnpostedLinksOption  *********************************");
		   
		   System.out.println("SavingMessage  :  "+actMessage +" Value Expected : "+expMessage1+" "+expMessage2);
	
		   if(actMessage.startsWith(expMessage1) && actMessage.endsWith(expMessage2))
    		{
    			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
    			new_CloseBtn.click();
    			Thread.sleep(2000);
    			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
    			homeCloseBtn.click();
    			return true;
    		}
    		else
    		{
    			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
    			new_CloseBtn.click();
    			Thread.sleep(2000);
    			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
    			homeCloseBtn.click();
    			return false;
    		}
    	}
		
		
		
		
		


		
		public boolean checkInventoryOrderManagementAnalysisOfLinkedOrUnLinkedListingOfDocReportWithOutConditionKeepUnpostedLinkOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
			inventoryMenu.click();
			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(orderManagementMenu));
			orderManagementMenu.click();
			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(analysisOfLinkedORUnlinkedDocumentsMenu));
			analysisOfLinkedORUnlinkedDocumentsMenu.click();
			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(listingOfDocuments));
			listingOfDocuments.click();
			
			Thread.sleep(3000);
			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
			Select s=new Select(sl_DateOptionDropdown);
			s.selectByIndex(1);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(listingOfDocWorkFlowTxt));
			listingOfDocWorkFlowTxt.click();
			listingOfDocWorkFlowTxt.sendKeys("Purchases Orders vs Purchase Vouchers N");
			Thread.sleep(2000);
			listingOfDocWorkFlowTxt.sendKeys(Keys.TAB);
			
			Thread.sleep(2000);
			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
			sl_OkBtn.click();
			
			Thread.sleep(3000);
			
			// Actual
			String actVoucherR1				=listOfDoc_1stRow2ndCol.getText();
			String actItemR1				=listOfDoc_1stRow3rdCol.getText();
			String actLinkValueR1			=listOfDoc_1stRow4thCol.getText();
			String actBalanceR1		 		=listOfDoc_1stRow5thCol.getText();
			String actStatusR1				=listOfDoc_1stRow6thCol.getText();
			
			String actVoucherR2				=listOfDoc_2ndRow2ndCol.getText();
			String actItemR2				=listOfDoc_2ndRow3rdCol.getText();
			String actLinkValueR2			=listOfDoc_2ndRow4thCol.getText();
			String actBalanceR2				=listOfDoc_2ndRow5thCol.getText();
			String actStatusR2				=listOfDoc_2ndRow6thCol.getText();
			
			boolean actVoucherR3			=listOfDoc_3rdRow2ndCol.getText().isEmpty();
			boolean actItemR3				=listOfDoc_3rdRow3rdCol.getText().isEmpty();
			String actLinkValueR3			=listOfDoc_3rdRow4thCol.getText();
			String actBalanceR3				=listOfDoc_3rdRow5thCol.getText();
			boolean actStatusR3				=listOfDoc_3rdRow6thCol.getText().isEmpty();
			
			
			// Expected
			String expVoucherR1				="PurOrd:1";
			String expItemR1				="STD RATE COGS ITEM";
			String expLinkValueR1			="12.00";
			String expBalanceR1				="12.00";
			String expStatusR1				="Pending";
			
			String expVoucherR2				="PurOrd:2";
			String expItemR2				="STD RATE COGS ITEM";
			String expLinkValueR2			="12.00";
			String expBalanceR2				="12.00";
			String expStatusR2				="Pending";
			
			boolean expVoucherR3			=true;
			boolean expItemR3				=true;
			String expLinkValueR3			="24.00";
			String expBalanceR3				="24.00";
			boolean expStatusR3				=true;
		
			
			System.out.println("*********************************checkInventoryOrderManagementAnalysisOfLinkedOrUnLinkedListingOfDocReportWithOutConditionKeepUnpostedLinkOption*****************************************");
			
			System.out.println("VoucherR1   : "+actVoucherR1	+" Value Expected "+expVoucherR1);
			System.out.println("ItemR1      : "+actItemR1		+" Value Expected "+expItemR1);
			System.out.println("LinkValueR1 : "+actLinkValueR1	+" Value Expected "+expLinkValueR1);
			System.out.println("BalanceR1   : "+actBalanceR1	+" Value Expected "+expBalanceR1);
			System.out.println("StatusR1    : "+actStatusR1		+" Value Expected "+expStatusR1);
			System.out.println("VoucherR2   : "+actVoucherR2	+" Value Expected "+expVoucherR2);
			System.out.println("ItemR2      : "+actItemR2		+" Value Expected "+expItemR2);
			System.out.println("LinkValueR2 : "+actLinkValueR2	+" Value Expected "+expLinkValueR2);
			System.out.println("BalanceR2   : "+actBalanceR2	+" Value Expected "+expBalanceR2);
			System.out.println("StatusR2    : "+actStatusR2		+" Value Expected "+expStatusR2);
			System.out.println("VoucherR3   : "+actVoucherR3	+" Value Expected "+expVoucherR3);
			System.out.println("ItemR3      : "+actItemR3		+" Value Expected "+expItemR3);
			System.out.println("LinkValueR3 : "+actLinkValueR3	+" Value Expected "+expLinkValueR3);
			System.out.println("BalanceR3   : "+actBalanceR3	+" Value Expected "+expBalanceR3);
			System.out.println("StatusR3    : "+actStatusR3		+" Value Expected "+expStatusR3);
			
			
			
			
			if(actVoucherR1.equalsIgnoreCase(expVoucherR1) && actItemR1.equalsIgnoreCase(expItemR1) && actLinkValueR1.equalsIgnoreCase(expLinkValueR1)
				&& actBalanceR1.equalsIgnoreCase(expBalanceR1) && actStatusR1.equalsIgnoreCase(expStatusR1) && actVoucherR2.equalsIgnoreCase(expVoucherR2)
				&& actItemR2.equalsIgnoreCase(expItemR2) && actLinkValueR2.equalsIgnoreCase(expLinkValueR2) && actBalanceR2.equalsIgnoreCase(expBalanceR2)
				&& actStatusR2.equalsIgnoreCase(expStatusR2) && actVoucherR3==expVoucherR3 && actItemR3==expItemR3 && actLinkValueR3.equalsIgnoreCase(expLinkValueR3)
				&& actBalanceR3.equalsIgnoreCase(expBalanceR3) && actStatusR3==expStatusR3)
			{
				System.out.println("Test Pass : Reports Are As Expected");
				//excelReader.setCellData(xlfile, xlsheet, 992, 9, resPass);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
				report_CloseBtn.click();
				Thread.sleep(2000);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
				sl_CloseBtn.click();
				return true;
			}
			else
			{
				System.out.println("Test Fail : Reports Are NOT As Expected");
				//excelReader.setCellData(xlfile, xlsheet, 992, 9, resFail);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
				report_CloseBtn.click();
				Thread.sleep(2000);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
				sl_CloseBtn.click();
				return false;
			}
		}
		
		
	
		
		
		
		public static boolean checkLogoutAndLoginWithUserAllOptionsWithKeepUnpostedLinksOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
    	{
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplayLogo));
    		userNameDisplayLogo.click();
   		
   	     	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
   	     	logoutOption.click();

   	     	Thread.sleep(3000);
    		
    		LoginPage lp=new LoginPage(getDriver()); 
    		
    	    String unamelt="UserAllOptions";
    	  
    	    String pawslt="12345";
    	      
    	    lp.enterUserName(unamelt);
    	    
    	    lp.enterPassword(pawslt);
    	    
    	    lp.clickOnSignInBtn();
    	    
    	    //checkRefershPopOnlogin();
    	    
    	    //checkPopUpWindow();
    	  
    		Thread.sleep(7000);

    		String actUserInfo=userNameDisplay.getText();
    		
    		System.out.println("User Info  : "+actUserInfo);
    		
    		System.out.println("User Info Capture Text  :  "+userNameDisplay.getText());
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(companyLogo));
    		companyLogo.click();
    		
    		String getCompanyTxt=companyName.getText();
    		String getLoginCompanyName=getCompanyTxt.substring(0, 19);
    		System.out.println("company name  :  "+ getLoginCompanyName);
    		companyLogo.click();
    		
    		boolean actDashboard = dashboard.isDisplayed();
    		
    		
    		String expUserInfo           ="UserAllOptions";
    		String expLoginCompanyName   ="Automation";
    		boolean expDashboard = true;

    		if (actUserInfo.equalsIgnoreCase(expUserInfo) && getLoginCompanyName.contains(expLoginCompanyName) && actDashboard==expDashboard) 
    		{
				return true;
			}
    		else
    		{
    			return false;
			}
    	}
    	
    	
    	
		
		
		
		public static boolean checkPurchasesVoucherNAuthorizationStatusWithUserAllOptionsWithKeepUnpostedLinksOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
			financialsMenu.click();
					
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
			financialsTransactionMenu.click();
				
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
			financialsTransactionsPurchaseMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVoucherNew));
			purchaseVoucherNew.click();
			
			Thread.sleep(3000);
			
			int voucherGridDocNoCount = voucherGridDocNo.size();
			
			String actStatusRow1 = null;
			String actStatusRow2 = null;
			
			System.out.println("Size  : "+voucherGridDocNoCount);
			
			for (int i = 0; i < voucherGridDocNoCount; i++) 
			{
				String data = voucherGridDocNo.get(i).getText();
				
				if (data.equalsIgnoreCase("1")) 
				{
					 actStatusRow1 =  voucherGridAuthorizationStatus.get(i).getText();
				}
				
				if (data.equalsIgnoreCase("2")) 
				{
					 actStatusRow2 =  voucherGridAuthorizationStatus.get(i).getText();
				}
			}
			
			String expStatusRow1 = "Pending";
			String expStatusRow2 = "Pending";
			
			Thread.sleep(2000);
			
			click(homePageVoucherArrowBtn);
			Thread.sleep(1000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pendingAuthorizationPurchases));
			pendingAuthorizationPurchases.click();
			
			Thread.sleep(2000);
			
			for (int i = 0; i < voucherGridDocNoCount; i++) 
			{
				String data = voucherGridDocNo.get(i).getText();
				
				if (data.equalsIgnoreCase("1")) 
				{
					 voucherGridCheckBoxList.get(i).click();
				}
			}
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(authorizeBtn));
			authorizeBtn.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(authorizePopupOkBtn));
			authorizePopupOkBtn.click();
			
			Thread.sleep(2000);
			
			click(homePageVoucherArrowBtn);
			Thread.sleep(1000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homePageAllVouchersView));
			homePageAllVouchersView.click();
			
			Thread.sleep(2000);
			
			String actAfterAuthorizeStatusRow1 = null;
			String actAfterAuthorizeStatusRow2 = null;
			
			for (int i = 0; i < voucherGridDocNoCount; i++) 
			{
				String data = voucherGridDocNo.get(i).getText();
				
				if (data.equalsIgnoreCase("1")) 
				{
					 actAfterAuthorizeStatusRow1 =  voucherGridAuthorizationStatus.get(i).getText();
				}
				
				if (data.equalsIgnoreCase("2")) 
				{
					 actAfterAuthorizeStatusRow2 =  voucherGridAuthorizationStatus.get(i).getText();
				}
			}
			
			String expAfterAuthorizeStatusRow1 = "Authorized";
			String expAfterAuthorizeStatusRow2 = "Pending";
			
			System.out.println("************************************* checkPurchasesVoucherNAuthorizationStatusWithUserAllOptionsWithKeepUnpostedLinksOption  *********************************");
			
			System.out.println("StatusRow1               : "+actStatusRow1				+" Value Expected : "+expStatusRow1);
			System.out.println("StatusRow2               : "+actStatusRow2				+" Value Expected : "+expStatusRow2);
			System.out.println("AfterAuthorizeStatusRow1 : "+actAfterAuthorizeStatusRow1+" Value Expected : "+expAfterAuthorizeStatusRow1);
			System.out.println("AfterAuthorizeStatusRow2 : "+actAfterAuthorizeStatusRow2+" Value Expected : "+expAfterAuthorizeStatusRow2);
			
			
			if(actStatusRow1.equalsIgnoreCase(expStatusRow1) && actStatusRow2.equalsIgnoreCase(expStatusRow2) 
				&& actAfterAuthorizeStatusRow1.equalsIgnoreCase(expAfterAuthorizeStatusRow1) && actAfterAuthorizeStatusRow2.equalsIgnoreCase(expAfterAuthorizeStatusRow2))
			{
				System.out.println("Test Pass : Authorized Succesfully");
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
				homeCloseBtn.click();
    			Thread.sleep(3000);
				//excelReader.setCellData(xlfile, "SmokeSalesOrder", 627, 9, resPass);
				return true;
			}
			else
			{
				System.out.println("Test Fail : NOT Authorized Succesfully");
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
				homeCloseBtn.click();
    			Thread.sleep(3000);
				//excelReader.setCellData(xlfile, "SmokeSalesOrder", 627, 9, resFail);
				return false;
			}
			
		}
			
	
		
		
		public static boolean checkLogoutAndLoginWithSUToCheckAuthorizationStatusWithKeepUnpostedLinksOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
    	{
    		
    		
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplayLogo));
    		userNameDisplayLogo.click();
   		
   	     	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
   	     	logoutOption.click();

   	     	Thread.sleep(3000);
    		
    		LoginPage lp=new LoginPage(getDriver()); 
    		
    	    String unamelt="su";
    	  
    	    String pawslt="su";
    	      
    	    lp.enterUserName(unamelt);
    	    
    	    lp.enterPassword(pawslt);
    	    
    	    lp.clickOnSignInBtn();
    	    
    	    //checkRefershPopOnlogin();
    	    
    	    //checkPopUpWindow();
    	  
    		Thread.sleep(6000);

    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
			financialsMenu.click();
					
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
			financialsTransactionMenu.click();
				
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
			financialsTransactionsPurchaseMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVoucherNew));
			purchaseVoucherNew.click();
			
			Thread.sleep(3000);
			
			int voucherGridDocNoCount = voucherGridDocNo.size();
			
			String actStatusRow1 = null;
			String actStatusRow2 = null;
			
			System.out.println("Size  : "+voucherGridDocNoCount);
			
			for (int i = 0; i < voucherGridDocNoCount; i++) 
			{
				String data = voucherGridDocNo.get(i).getText();
				
				if (data.equalsIgnoreCase("1")) 
				{
					 actStatusRow1 =  voucherGridAuthorizationStatus.get(i).getText();
				}
				
				if (data.equalsIgnoreCase("2")) 
				{
					 actStatusRow2 =  voucherGridAuthorizationStatus.get(i).getText();
				}
			}
			
			String expStatusRow1 = "Authorized";
			String expStatusRow2 = "pending";
			
			
			System.out.println("************************************* checkLogoutAndLoginWithSUToCheckAuthorizationStatusWithKeepUnpostedLinksOption  *********************************");
			
			System.out.println("StatusRow1 : "+actStatusRow1+" Value Expected : "+expStatusRow1);
			System.out.println("StatusRow2 : "+actStatusRow2+" Value Expected : "+expStatusRow2);
			
			if(actStatusRow1.equalsIgnoreCase(expStatusRow1) && actStatusRow2.equalsIgnoreCase(expStatusRow2))
			{
				System.out.println("Test Pass : Suspended Succesfully");
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
				homeCloseBtn.click();
    			Thread.sleep(2000);
				//excelReader.setCellData(xlfile, "SmokeSalesOrder", 627, 9, resPass);
				return true;
			}
			else
			{
				System.out.println("Test Fail : NOT Suspended Succesfully");
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
				homeCloseBtn.click();
    			Thread.sleep(2000);
				//excelReader.setCellData(xlfile, "SmokeSalesOrder", 627, 9, resFail);
				return false;
			}
			
		}
		
		
		
		
		
		
		
		public boolean checkInventoryOrderManagementAnalysisOfLinkedOrUnLinkedListingOfDocReportWithConditionKeepUnpostedLinkOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
			inventoryMenu.click();
			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(orderManagementMenu));
			orderManagementMenu.click();
			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(analysisOfLinkedORUnlinkedDocumentsMenu));
			analysisOfLinkedORUnlinkedDocumentsMenu.click();
			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(listingOfDocuments));
			listingOfDocuments.click();
			
			Thread.sleep(3000);
			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
			Select s=new Select(sl_DateOptionDropdown);
			s.selectByIndex(1);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(listingOfDocWorkFlowTxt));
			listingOfDocWorkFlowTxt.click();
			listingOfDocWorkFlowTxt.sendKeys("Purchases Orders vs Purchase Vouchers N");
			Thread.sleep(2000);
			listingOfDocWorkFlowTxt.sendKeys(Keys.TAB);
			
			Thread.sleep(2000);
			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
			sl_OkBtn.click();
			
			Thread.sleep(3000);
			
			// Actual
			String actVoucherR1				=listOfDoc_1stRow2ndCol.getText();
			String actItemR1				=listOfDoc_1stRow3rdCol.getText();
			String actLinkValueR1			=listOfDoc_1stRow4thCol.getText();
			boolean actBalanceR1		 	=listOfDoc_1stRow5thCol.getText().isEmpty();
			String actStatusR1				=listOfDoc_1stRow6thCol.getText();
			
			String actVoucherR2				=listOfDoc_2ndRow2ndCol.getText();
			String actItemR2				=listOfDoc_2ndRow3rdCol.getText();
			String actLinkValueR2			=listOfDoc_2ndRow4thCol.getText();
			boolean actBalanceR2			=listOfDoc_2ndRow5thCol.getText().isEmpty();
			boolean actStatusR2				=listOfDoc_2ndRow6thCol.getText().isEmpty();
			
			String actVoucherR3				=listOfDoc_3rdRow2ndCol.getText();
			String actItemR3				=listOfDoc_3rdRow3rdCol.getText();
			String actLinkValueR3			=listOfDoc_3rdRow4thCol.getText();
			String actBalanceR3				=listOfDoc_3rdRow5thCol.getText();
			String actStatusR3				=listOfDoc_3rdRow6thCol.getText();
			
			boolean actVoucherR4			=listOfDoc_4thRow2ndCol.getText().isEmpty();
			boolean actItemR4				=listOfDoc_4thRow3rdCol.getText().isEmpty();
			String actLinkValueR4			=listOfDoc_4thRow4thCol.getText();
			String actBalanceR4				=listOfDoc_4thRow5thCol.getText();
			boolean actStatusR4				=listOfDoc_4thRow6thCol.getText().isEmpty();
			
			
			// Expected
			String expVoucherR1				="PurOrd:1";
			String expItemR1				="STD RATE COGS ITEM";
			String expLinkValueR1			="12.00";
			boolean expBalanceR1			=true;
			String expStatusR1				="Closed";
			
			String expVoucherR2				="NDT45:1";
			String expItemR2				="STD RATE COGS ITEM";
			String expLinkValueR2			="12.00";
			boolean expBalanceR2			=true;
			boolean expStatusR2				=true;
			
			String expVoucherR3				="PurOrd:2";
			String expItemR3				="STD RATE COGS ITEM";
			String expLinkValueR3			="12.00";
			String expBalanceR3				="12.00";
			String expStatusR3				="Pending";
			
			boolean expVoucherR4			=true;
			boolean expItemR4				=true;
			String expLinkValueR4			="36.00";
			String expBalanceR4				="12.00";
			boolean expStatusR4				=true;
		
			
			System.out.println("*********************************checkInventoryOrderManagementAnalysisOfLinkedOrUnLinkedListingOfDocReportWithConditionKeepUnpostedLinkOption*****************************************");
			
			System.out.println("VoucherR1   : "+actVoucherR1	+" Value Expected "+expVoucherR1);
			System.out.println("ItemR1      : "+actItemR1		+" Value Expected "+expItemR1);
			System.out.println("LinkValueR1 : "+actLinkValueR1	+" Value Expected "+expLinkValueR1);
			System.out.println("BalanceR1   : "+actBalanceR1	+" Value Expected "+expBalanceR1);
			System.out.println("StatusR1    : "+actStatusR1		+" Value Expected "+expStatusR1);
			System.out.println("VoucherR2   : "+actVoucherR2	+" Value Expected "+expVoucherR2);
			System.out.println("ItemR2      : "+actItemR2		+" Value Expected "+expItemR2);
			System.out.println("LinkValueR2 : "+actLinkValueR2	+" Value Expected "+expLinkValueR2);
			System.out.println("BalanceR2   : "+actBalanceR2	+" Value Expected "+expBalanceR2);
			System.out.println("StatusR2    : "+actStatusR2		+" Value Expected "+expStatusR2);
			System.out.println("VoucherR3   : "+actVoucherR3	+" Value Expected "+expVoucherR3);
			System.out.println("ItemR3      : "+actItemR3		+" Value Expected "+expItemR3);
			System.out.println("LinkValueR3 : "+actLinkValueR3	+" Value Expected "+expLinkValueR3);
			System.out.println("BalanceR3   : "+actBalanceR3	+" Value Expected "+expBalanceR3);
			System.out.println("StatusR3    : "+actStatusR3		+" Value Expected "+expStatusR3);
			System.out.println("VoucherR4   : "+actVoucherR4	+" Value Expected "+expVoucherR4);
			System.out.println("ItemR4      : "+actItemR4		+" Value Expected "+expItemR4);
			System.out.println("LinkValueR4 : "+actLinkValueR4	+" Value Expected "+expLinkValueR4);
			System.out.println("BalanceR4   : "+actBalanceR4	+" Value Expected "+expBalanceR4);
			System.out.println("StatusR4    : "+actStatusR4		+" Value Expected "+expStatusR4);
			
			if(actVoucherR1.equalsIgnoreCase(expVoucherR1) && actItemR1.equalsIgnoreCase(expItemR1) && actLinkValueR1.equalsIgnoreCase(expLinkValueR1) 
				&& actBalanceR1==expBalanceR1 && actStatusR1.equalsIgnoreCase(expStatusR1) && actVoucherR2.equalsIgnoreCase(expVoucherR2) 
				&& actItemR2.equalsIgnoreCase(expItemR2) && actLinkValueR2.equalsIgnoreCase(expLinkValueR2) && actBalanceR2==expBalanceR2
				&& actStatusR2==expStatusR2 && actVoucherR3.equalsIgnoreCase(expVoucherR3) && actItemR3.equalsIgnoreCase(expItemR3)
				&& actLinkValueR3.equalsIgnoreCase(expLinkValueR3) && actBalanceR3.equalsIgnoreCase(expBalanceR3) && actStatusR3.equalsIgnoreCase(expStatusR3)
				&& actVoucherR4==expVoucherR4 && actItemR4==expItemR4 && actLinkValueR4.equalsIgnoreCase(expLinkValueR4) && actBalanceR4.equalsIgnoreCase(expBalanceR4)
				&& actStatusR4==expStatusR4)
			{
				System.out.println("Test Pass : Reports Are As Expected");
				//excelReader.setCellData(xlfile, xlsheet, 992, 9, resPass);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
				report_CloseBtn.click();
				Thread.sleep(2000);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
				sl_CloseBtn.click();
				return true;
			}
			else
			{
				System.out.println("Test Fail : Reports Are NOT As Expected");
				//excelReader.setCellData(xlfile, xlsheet, 992, 9, resFail);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
				report_CloseBtn.click();
				Thread.sleep(2000);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
				sl_CloseBtn.click();
				return false;
			}
		}
		
		
		
		
		
		public boolean checkEraseAllTransactionsWithKeepUnpostedLinksOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
			homeMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dataMangementMenu));
			dataMangementMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(eraseAll));
			eraseAll.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(eraseTranscationsRadio));
			eraseTranscationsRadio.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(eraseAllOkBtn));
			eraseAllOkBtn.click();
			
			if(getIsAlertPresent())
			{
				getWaitForAlert();
				
				getAlert().accept();
			}
			
			
			String expValidationMsg="Data deleted successfully.";
			
			String actValidationMsg=checkValidationMessage(expValidationMsg);
			
			System.out.println("************************************* checkEraseAllTransactionsWithKeepUnpostedLinksOption  *********************************");
			System.out.println("Message  :  "+actValidationMsg +" Value Expected : "+expValidationMsg);
			
			if (actValidationMsg.equalsIgnoreCase(expValidationMsg))
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
				sl_CloseBtn.click();
				return true;
			}
			else
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
				sl_CloseBtn.click();
				return false;
			}
		}
		
		
		
		
		
		
		
		// Keep Unposted References
		
		public static boolean checkSavingPurchaseVoucherN1WithOutKeepUnpostedReferencesOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
			financialsMenu.click();
					
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
			financialsTransactionMenu.click();
				
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
			financialsTransactionsPurchaseMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVoucherNew));
			purchaseVoucherNew.click();
			
			Thread.sleep(3000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
			newBtn.click();
			
			checkValidationMessage("Screen opened");
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseAccountTxt));
			purchaseAccountTxt.click();
			purchaseAccountTxt.sendKeys("Purchase");
			
			Thread.sleep(2000);
			
			purchaseAccountTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
			vendorAccountTxt.click();
			vendorAccountTxt.sendKeys("Vendor A");
			
			Thread.sleep(2000);
			
			vendorAccountTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
			departmentTxt.click();
			departmentTxt.sendKeys("INDIA");
			
			Thread.sleep(2000);
			
			departmentTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(wareHouseTxt));
			wareHouseTxt.click();
			wareHouseTxt.sendKeys("HYDERABAD");
			
			Thread.sleep(2000);
			
			wareHouseTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
			select1stRow_1stColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
			enter_ItemTxt.sendKeys("STD RATE COGS ITEM");
			Thread.sleep(3000);
			enter_ItemTxt.sendKeys(Keys.TAB);
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_5thColumn));
			select1stRow_5thColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
			enter_Quantity.sendKeys("1");
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_7thColumn));
			select1stRow_7thColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
			enter_Rate.sendKeys(Keys.END);
			enter_Rate.sendKeys(Keys.SHIFT, Keys.HOME);
			enter_Rate.sendKeys(Keys.BACK_SPACE);
			enter_Rate.sendKeys("10");
			enter_Rate.sendKeys(Keys.TAB);
			
			Thread.sleep(2000);
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
			saveBtn.click();
			
			Thread.sleep(3000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
			billRefPickIcon.click();
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
			billRefOkBtn.click();
			
			
			String expMessage1= "Voucher saved successfully";
			String expMessage2= ": 1";
			
			String actMessage = checkValidationMessage(expMessage1);
			
		   System.out.println("************************************* checkSavingPurchaseVoucherN1WithOutKeepUnpostedReferencesOption  *********************************");
		   
		   System.out.println("SavingMessage  :  "+actMessage +" Value Expected : "+expMessage1+" "+expMessage2);
	
		   if(actMessage.startsWith(expMessage1) && actMessage.endsWith(expMessage2))
    		{
    			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
    			new_CloseBtn.click();
    			Thread.sleep(2000);
    			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
    			homeCloseBtn.click();
    			Thread.sleep(2000);
    			return true;
    		}
    		else
    		{
    			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
    			new_CloseBtn.click();
    			Thread.sleep(2000);
    			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
    			homeCloseBtn.click();
    			Thread.sleep(2000);
    			return false;
    		}
    	}
		
		
		
		
		
		
				
		
		public boolean checkPaymentVoucherWithoutKeepUnpostedReferenceOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
		    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		    financialsMenu.click();
		  
		    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		    financialsTransactionMenu.click();
		  
		    getWebDriverWait().until(ExpectedConditions.elementToBeClickable(cashAndBankMenu));
		    cashAndBankMenu.click();
				
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(paymentsVoucher));
			paymentsVoucher.click();
			
			Thread.sleep(3000);
			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
			newBtn.click();
			
			checkValidationMessage("Screen Opened");
			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newCashBankAccountTxt));
			newCashBankAccountTxt.click();
			newCashBankAccountTxt.sendKeys("Bank");
			
			Thread.sleep(3000);
			
			newCashBankAccountTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
			departmentTxt.click();
			departmentTxt.sendKeys("INDIA");
			
			Thread.sleep(3000); 
			
			departmentTxt.sendKeys(Keys.TAB);
				
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
			select1stRow_1stColumn.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_AccountTxt));
			enter_AccountTxt.click();
			enter_AccountTxt.sendKeys("Vendor A");
			Thread.sleep(3000);
			enter_AccountTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Amount));
			enter_Amount.sendKeys("5");
			enter_Amount.sendKeys(Keys.TAB);
		
			Thread.sleep(3000);
			
			int actAdjustbills=billRefAdjustBillsGrid.size();
			int expAdjustbills=1;

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
			billRefPickIcon.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
			billRefOkBtn.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
			saveBtn.click();
			
			String expMessage1= "Voucher saved successfully";
			String expMessage2= ": 1";
			
			String actMessage = checkValidationMessage(expMessage1);
			
		   System.out.println("************************************* checkPaymentVoucherWithoutKeepUnpostedReferenceOption  *********************************");
		   System.err.println("actAdjustbills : "+actAdjustbills +" Value Expected  : "+expAdjustbills);
		   System.out.println("SavingMessage  : "+actMessage     +" Value Expected  : "+expMessage1+" "+expMessage2);
	
		   if(actAdjustbills==expAdjustbills && actMessage.startsWith(expMessage1) && actMessage.endsWith(expMessage2))
			{
			   getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
			   new_CloseBtn.click();
			   Thread.sleep(2000);
			   getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
			   homeCloseBtn.click();
			   Thread.sleep(2000);
			   return true;
			}
			else 
			{
			   getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
			   new_CloseBtn.click();
			   Thread.sleep(2000);
			   getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
			   homeCloseBtn.click();
			   Thread.sleep(2000);
			   return false;
			}
		}
			
				
		
		
		
		
		
		public boolean checkEraseAllTransactionsWithoutKeepUnpostedReferencesOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
			homeMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dataMangementMenu));
			dataMangementMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(eraseAll));
			eraseAll.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(eraseTranscationsRadio));
			eraseTranscationsRadio.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(eraseAllOkBtn));
			eraseAllOkBtn.click();
			
			if(getIsAlertPresent())
			{
				getWaitForAlert();
				
				getAlert().accept();
			}
			
			String expValidationMsg="Data deleted successfully.";
			
			String actValidationMsg=checkValidationMessage(expValidationMsg);
			
			System.out.println("************************************* checkEraseAllTransactionsWithoutKeepUnpostedReferencesOption  *********************************");
			System.out.println("Message  :  "+actValidationMsg +" Value Expected : "+expValidationMsg);
			
			if (actValidationMsg.equalsIgnoreCase(expValidationMsg))
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
				sl_CloseBtn.click();
				return true;
			}
			else
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
				sl_CloseBtn.click();
				return false;
			}
		}
		
		
		
		
		
		
		
		public boolean 	checkSelectingConditionAsReferencesInTransactionAuthorizationConditionTab() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
    	{
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsmenuBtn));
    		settingsmenuBtn.click();
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(transactionAuthorizationBtn));
    		transactionAuthorizationBtn.click();
    		
    		Thread.sleep(2000);
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNameDropdown));
    		documentNameDropdown.sendKeys(" ");
    		
    		Thread.sleep(1000);
    			
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchasevoucherExpandbutton));
    		purchasevoucherExpandbutton.click();
    	
            getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchasevoucherTypeCreatedVoucher));
    		purchasevoucherTypeCreatedVoucher.click();
    		
    		Thread.sleep(3000);
    				
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
    		nameTxt.click();
    		
    		nameTxt.sendKeys(Keys.SPACE);
    		
    		int namecount=tranAuthNameList.size();
			
			for(int i=0 ; i < namecount ;i++)
			{
				String data=tranAuthNameList.get(i).getText();
				
				if(data.equalsIgnoreCase("Purchase"))
				{
					tranAuthNameList.get(i).click();
					
					break;
				}
			}
				
    		nameTxt.sendKeys(Keys.TAB);
    			
    		Thread.sleep(3000);
    		
    		click(cnrBtn);
    		Thread.sleep(1000);
    		
    		ClickUsingJs(Level1editBtn);
    		Thread.sleep(1000);
    		
    		//getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(Level1editBtn));
    		//Level1editBtn.click();
    		//keepUnpostedReferencesChkBox
    		
    		Thread.sleep(3000);
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(keepUnpostedfinancialAccountingChkBox));
    		((JavascriptExecutor)getDriver()).executeScript("arguments[0].scrollIntoView();", keepUnpostedfinancialAccountingChkBox);
    		
    		if (keepUnpostedfinancialAccountingChkBox.isSelected()) 
    		{
    			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(keepUnpostedfinancialAccountingChkBox));
        		keepUnpostedfinancialAccountingChkBox.click();
        		Thread.sleep(2000);
			}
    		
    		if (keepUnpostedInventoryChkBox.isSelected()) 
    		{
    			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(keepUnpostedInventoryChkBox));
        		keepUnpostedInventoryChkBox.click();
        		Thread.sleep(2000);
			}
    		
    		if (keepUnpostedLinksChkBox.isSelected()) 
    		{
    			//getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(keepUnpostedLinksChkBox));
        		//keepUnpostedLinksChkBox.click();
    			ClickUsingJs(keepUnpostedLinksChkBox);
    			Thread.sleep(2000);
			}
    		
    		//getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(keepUnpostedReferencesChkBox));
    		//keepUnpostedReferencesChkBox.click();
    		Thread.sleep(2000);
    		ClickUsingJs(keepUnpostedReferencesChkBox);
    		boolean act =keepUnpostedReferencesChkBox.isSelected();
    		System.err.println(act);
    		
    		Thread.sleep(2000);
    		
    		//moveToElement(definitionOkBtn);
    		ScrollToElement(definitionOkBtn);
    		ClickUsingJs(definitionOkBtn);
    		
    		//getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(definitionOkBtn));
    		//definitionOkBtn.click();
    		
    		Thread.sleep(2000);
    		ClickUsingJs(tranAuthSaveBtn);
    		
    		//getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(tranAuthSaveBtn));
    		//tranAuthSaveBtn.click();
    		
    		String expValidationMsg="Authorization Flow saved successfully.";
    		
    		String actValidationMsg=checkValidationMessage(expValidationMsg);
    				
    		System.out.println("Validation Message : "+actValidationMsg+"  Value Expected : "+"True");
    		
    		if(actValidationMsg.equalsIgnoreCase(expValidationMsg))
    		{
    			ClickUsingJs(tranAuthCancelBtn);
    			//getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(tranAuthCancelBtn));
    			//tranAuthCancelBtn.click();
    			return true;
    		}
    		else
    		{
    			ClickUsingJs(tranAuthCancelBtn);
    			//getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(tranAuthCancelBtn));
    			//tranAuthCancelBtn.click();
    			return false;
    		}
    	}
		
		
		
		
		
		
		
		public static boolean checkSavingPurchaseVoucherN1WithKeepUnpostedReferencesOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
			financialsMenu.click();
					
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
			financialsTransactionMenu.click();
				
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
			financialsTransactionsPurchaseMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVoucherNew));
			purchaseVoucherNew.click();
			
			Thread.sleep(3000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
			newBtn.click();
			
			checkValidationMessage("Screen opened");
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseAccountTxt));
			purchaseAccountTxt.click();
			purchaseAccountTxt.sendKeys("Purchase");
			
			Thread.sleep(2000);
			
			purchaseAccountTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
			vendorAccountTxt.click();
			vendorAccountTxt.sendKeys("Vendor A");
			
			Thread.sleep(2000);
			
			vendorAccountTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
			departmentTxt.click();
			departmentTxt.sendKeys("INDIA");
			
			Thread.sleep(2000);
			
			departmentTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(wareHouseTxt));
			wareHouseTxt.click();
			wareHouseTxt.sendKeys("HYDERABAD");
			
			Thread.sleep(2000);
			
			wareHouseTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
			select1stRow_1stColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
			enter_ItemTxt.sendKeys("STD RATE COGS ITEM");
			Thread.sleep(3000);
			enter_ItemTxt.sendKeys(Keys.TAB);
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_5thColumn));
			select1stRow_5thColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
			enter_Quantity.sendKeys("1");
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_7thColumn));
			select1stRow_7thColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
			enter_Rate.sendKeys(Keys.END);
			enter_Rate.sendKeys(Keys.SHIFT, Keys.HOME);
			enter_Rate.sendKeys(Keys.BACK_SPACE);
			enter_Rate.sendKeys("10");
			enter_Rate.sendKeys(Keys.TAB);
			
			Thread.sleep(2000);
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
			saveBtn.click();
			
			Thread.sleep(3000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
			billRefPickIcon.click();
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
			billRefOkBtn.click();
			
			
			String expMessage1= "Voucher saved successfully";
			String expMessage2= ": 1";
			
			String actMessage = checkValidationMessage(expMessage1);
			
		   System.out.println("************************************* checkSavingPurchaseVoucherN1WithKeepUnpostedReferencesOption  *********************************");
		   
		   System.out.println("SavingMessage  :  "+actMessage +" Value Expected : "+expMessage1+" "+expMessage2);
	
		   if(actMessage.startsWith(expMessage1) && actMessage.endsWith(expMessage2))
    		{
    			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
    			new_CloseBtn.click();
    			Thread.sleep(2000);
    			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
    			homeCloseBtn.click();
    			Thread.sleep(2000);
    			return true;
    		}
    		else
    		{
    			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
    			new_CloseBtn.click();
    			Thread.sleep(2000);
    			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
    			homeCloseBtn.click();
    			Thread.sleep(2000);
    			return false;
    		}
    	}
		
		
		
		
		
		
		
		
		public boolean checkPaymentVoucherWithKeepUnpostedReferenceOptionBeforeAuthorization() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
		    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		    financialsMenu.click();
		  
		    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		    financialsTransactionMenu.click();
		  
		    getWebDriverWait().until(ExpectedConditions.elementToBeClickable(cashAndBankMenu));
		    cashAndBankMenu.click();
				
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(paymentsVoucher));
			paymentsVoucher.click();
			
			Thread.sleep(3000);
			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
			newBtn.click();
			
			checkValidationMessage("Screen Opened");
			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newCashBankAccountTxt));
			newCashBankAccountTxt.click();
			newCashBankAccountTxt.sendKeys("Bank");
			
			Thread.sleep(3000);
			
			newCashBankAccountTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
			departmentTxt.click();
			departmentTxt.sendKeys("INDIA");
			
			Thread.sleep(3000); 
			
			departmentTxt.sendKeys(Keys.TAB);
				
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
			select1stRow_1stColumn.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_AccountTxt));
			enter_AccountTxt.click();
			enter_AccountTxt.sendKeys("Vendor A");
			Thread.sleep(3000);
			enter_AccountTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Amount));
			enter_Amount.sendKeys("5");
			enter_Amount.sendKeys(Keys.TAB);
		
			Thread.sleep(3000);
			
			boolean actAdjustbills = billRefAdjustBillsTable.getText().isEmpty();
			boolean expAdjustbills = true;
			
			if (actAdjustbills==expAdjustbills) 
			{
				System.err.println(billRefAdjustBillsTable.getText());
			}

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefcancel));
			billRefcancel.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
		    new_CloseBtn.click();
			   
			if (getIsAlertPresent()) 
			{
				getWaitForAlert();
				getAlert().accept();
			}
			
		   System.out.println("************************************* checkPaymentVoucherWithKeepUnpostedReferenceOption  *********************************");
		   System.err.println("Adjustbills isEmpty  : "+actAdjustbills +" Value Expected  : "+expAdjustbills);
	
		   if(actAdjustbills==expAdjustbills)
			{
			   getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
			   homeCloseBtn.click();
			   Thread.sleep(2000);
			   //excelReader.setCellData(xlfile, "SmokePayments", 16, 9, resPass);
			   return true;
			}
			else 
			{
			   getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
			   homeCloseBtn.click();
			   Thread.sleep(2000);
			   //excelReader.setCellData(xlfile, "SmokePayments", 16, 9, resFail);
			   return false;
			}
		}
		
		
		


		
		
		
		public static boolean checkLogoutAndLoginWithUserAllOptionsWithKeepUnpostedReferencesOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
    	{
    		
    		
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplayLogo));
    		userNameDisplayLogo.click();
   		
   	     	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
   	     	logoutOption.click();

   	     	Thread.sleep(3000);
    		
    		LoginPage lp=new LoginPage(getDriver()); 
    		
    	    String unamelt="UserAllOptions";
    	  
    	    String pawslt="12345";
    	      
    	    lp.enterUserName(unamelt);
    	    
    	    lp.enterPassword(pawslt);
    	    
    	    lp.clickOnSignInBtn();
    	    
    	    //checkRefershPopOnlogin();
    	    
    	    //checkPopUpWindow();
    	  
    		Thread.sleep(7000);

    		String actUserInfo=userNameDisplay.getText();
    		
    		System.out.println("User Info  : "+actUserInfo);
    		
    		System.out.println("User Info Capture Text  :  "+userNameDisplay.getText());
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(companyLogo));
    		companyLogo.click();
    		
    		String getCompanyTxt=companyName.getText();
    		String getLoginCompanyName=getCompanyTxt.substring(0, 19);
    		System.out.println("company name  :  "+ getLoginCompanyName);
    		companyLogo.click();
    		
    		boolean actDashboard = dashboard.isDisplayed();
    		
    		
    		String expUserInfo           ="UserAllOptions";
    		String expLoginCompanyName   ="Automation";
    		boolean expDashboard = true;

    		if (actUserInfo.equalsIgnoreCase(expUserInfo) && getLoginCompanyName.contains(expLoginCompanyName) && actDashboard==expDashboard) 
    		{
				return true;
			}
    		else
    		{
    			return false;
			}
    	}
    	
    	
    	
		
		
		
		public static boolean checkPurchasesVoucherNAuthorizationStatusWithUserAllOptionsWithKeepUnpostedReferencesOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
			financialsMenu.click();
					
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
			financialsTransactionMenu.click();
				
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
			financialsTransactionsPurchaseMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVoucherNew));
			purchaseVoucherNew.click();
			
			Thread.sleep(3000);
			
			int voucherGridDocNoCount = voucherGridDocNo.size();
			
			String actStatusRow1 = null;
			
			System.out.println("Size  : "+voucherGridDocNoCount);
			
			for (int i = 0; i < voucherGridDocNoCount; i++) 
			{
				String data = voucherGridDocNo.get(i).getText();
				
				if (data.equalsIgnoreCase("1")) 
				{
					 actStatusRow1 =  voucherGridAuthorizationStatus.get(i).getText();
				}
			}
			
			String expStatusRow1 = "Pending";
			
			Thread.sleep(2000);
			
			 click(homePageVoucherArrowBtn);
			 Thread.sleep(1000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pendingAuthorizationPurchases));
			pendingAuthorizationPurchases.click();
			
			Thread.sleep(2000);
			
			for (int i = 0; i < voucherGridDocNoCount; i++) 
			{
				String data = voucherGridDocNo.get(i).getText();
				
				if (data.equalsIgnoreCase("1")) 
				{
					 voucherGridCheckBoxList.get(i).click();
				}
			}
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(authorizeBtn));
			authorizeBtn.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(authorizePopupOkBtn));
			authorizePopupOkBtn.click();
			
			Thread.sleep(2000);
			
			 click(homePageVoucherArrowBtn);
				Thread.sleep(1000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homePageAllVouchersView));
			homePageAllVouchersView.click();
			
			Thread.sleep(2000);
			
			String actAfterAuthorizeStatusRow1 = null;
			
			for (int i = 0; i < voucherGridDocNoCount; i++) 
			{
				String data = voucherGridDocNo.get(i).getText();
				
				if (data.equalsIgnoreCase("1")) 
				{
					 actAfterAuthorizeStatusRow1 =  voucherGridAuthorizationStatus.get(i).getText();
				}
			}
			
			String expAfterAuthorizeStatusRow1 = "Authorized";
			
			System.out.println("************************************* checkPurchasesVoucherNAuthorizationStatusWithUserAllOptionsWithKeepUnpostedReferencesOption  *********************************");
			
			System.out.println("StatusRow1               : "+actStatusRow1				+" Value Expected : "+expStatusRow1);
			System.out.println("AfterAuthorizeStatusRow1 : "+actAfterAuthorizeStatusRow1+" Value Expected : "+expAfterAuthorizeStatusRow1);
			
			if(actStatusRow1.equalsIgnoreCase(expStatusRow1) && actAfterAuthorizeStatusRow1.equalsIgnoreCase(expAfterAuthorizeStatusRow1))
			{
				System.out.println("Test Pass : Authorized Succesfully");
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
				homeCloseBtn.click();
    			Thread.sleep(3000);
				//excelReader.setCellData(xlfile, "SmokeSalesOrder", 627, 9, resPass);
				return true;
			}
			else
			{
				System.out.println("Test Fail : NOT Authorized Succesfully");
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
				homeCloseBtn.click();
    			Thread.sleep(3000);
				//excelReader.setCellData(xlfile, "SmokeSalesOrder", 627, 9, resFail);
				return false;
			}
			
		}
			
	
		
		
		public static boolean checkLogoutAndLoginWithSUToCheckAuthorizationStatusWithKeepUnpostedReferencesOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
    	{
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplayLogo));
    		userNameDisplayLogo.click();
   		
   	     	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
   	     	logoutOption.click();

   	     	Thread.sleep(3000);
    		
    		LoginPage lp=new LoginPage(getDriver()); 
    		
    	    String unamelt="su";
    	  
    	    String pawslt="su";
    	      
    	    lp.enterUserName(unamelt);
    	    
    	    lp.enterPassword(pawslt);
    	    
    	    lp.clickOnSignInBtn();
    	    
    	    //checkRefershPopOnlogin();
    	    
    	    //checkPopUpWindow();
    	  
    		Thread.sleep(6000);

    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
			financialsMenu.click();
					
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
			financialsTransactionMenu.click();
				
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
			financialsTransactionsPurchaseMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVoucherNew));
			purchaseVoucherNew.click();
			
			Thread.sleep(3000);
			
			int voucherGridDocNoCount = voucherGridDocNo.size();
			
			String actStatusRow1 = null;
			
			System.out.println("Size  : "+voucherGridDocNoCount);
			
			for (int i = 0; i < voucherGridDocNoCount; i++) 
			{
				String data = voucherGridDocNo.get(i).getText();
				
				if (data.equalsIgnoreCase("1")) 
				{
					 actStatusRow1 =  voucherGridAuthorizationStatus.get(i).getText();
				}
			}
			
			String expStatusRow1 = "Authorized";
			
			System.out.println("************************************* checkLogoutAndLoginWithSUToCheckAuthorizationStatusWithKeepUnpostedReferencesOption  *********************************");
			
			System.out.println("StatusRow1 : "+actStatusRow1+" Value Expected : "+expStatusRow1);
			
			if(actStatusRow1.equalsIgnoreCase(expStatusRow1))
			{
				System.out.println("Test Pass : Suspended Succesfully");
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
				homeCloseBtn.click();
    			Thread.sleep(2000);
				//excelReader.setCellData(xlfile, "SmokeSalesOrder", 627, 9, resPass);
				return true;
			}
			else
			{
				System.out.println("Test Fail : NOT Suspended Succesfully");
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
				homeCloseBtn.click();
    			Thread.sleep(2000);
				//excelReader.setCellData(xlfile, "SmokeSalesOrder", 627, 9, resFail);
				return false;
			}
			
		}
		
		
		
		
		
		
		
		public boolean checkPaymentVoucherWithKeepUnpostedReferenceOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
		    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		    financialsMenu.click();
		  
		    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		    financialsTransactionMenu.click();
		  
		    getWebDriverWait().until(ExpectedConditions.elementToBeClickable(cashAndBankMenu));
		    cashAndBankMenu.click();
				
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(paymentsVoucher));
			paymentsVoucher.click();
			
			Thread.sleep(3000);
			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
			newBtn.click();
			
			checkValidationMessage("Screen Opened");
			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newCashBankAccountTxt));
			newCashBankAccountTxt.click();
			newCashBankAccountTxt.sendKeys("Bank");
			
			Thread.sleep(3000);
			
			newCashBankAccountTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
			departmentTxt.click();
			departmentTxt.sendKeys("INDIA");
			
			Thread.sleep(3000); 
			
			departmentTxt.sendKeys(Keys.TAB);
				
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
			select1stRow_1stColumn.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_AccountTxt));
			enter_AccountTxt.click();
			enter_AccountTxt.sendKeys("Vendor A");
			Thread.sleep(3000);
			enter_AccountTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Amount));
			enter_Amount.sendKeys("5");
			enter_Amount.sendKeys(Keys.TAB);
		
			Thread.sleep(3000);
			
			int actAdjustbills=billRefAdjustBillsGrid.size();
			int expAdjustbills=1;

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
			billRefPickIcon.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
			billRefOkBtn.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
			saveBtn.click();
			
			String expMessage1= "Voucher saved successfully";
			String expMessage2= ": 1";
			
			String actMessage = checkValidationMessage(expMessage1);
			
		   System.out.println("************************************* checkPaymentVoucherWithKeepUnpostedReferenceOption  *********************************");
		   System.err.println("actAdjustbills : "+actAdjustbills +" Value Expected  : "+expAdjustbills);
		   System.out.println("SavingMessage  : "+actMessage     +" Value Expected  : "+expMessage1+" "+expMessage2);
	
		   if(actAdjustbills==expAdjustbills && actMessage.startsWith(expMessage1) && actMessage.endsWith(expMessage2))
			{
			   getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
			   new_CloseBtn.click();
			   Thread.sleep(2000);
			   getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
			   homeCloseBtn.click();
			   Thread.sleep(2000);
			   return true;
			}
			else 
			{
			   getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
			   new_CloseBtn.click();
			   Thread.sleep(2000);
			   getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
			   homeCloseBtn.click();
			   Thread.sleep(2000);
			   return false;
			}
		}
			
				
		
		
		
		
		
		public boolean checkEraseAllTransactionsWithKeepUnpostedReferencesOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
			homeMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dataMangementMenu));
			dataMangementMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(eraseAll));
			eraseAll.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(eraseTranscationsRadio));
			eraseTranscationsRadio.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(eraseAllOkBtn));
			eraseAllOkBtn.click();
			
			if(getIsAlertPresent())
			{
				getWaitForAlert();
				
				getAlert().accept();
			}
			
			String expValidationMsg="Data deleted successfully.";
    		
    		String actValidationMsg=checkValidationMessage(expValidationMsg);
			
			System.out.println("************************************* checkEraseAllTransactionsWithKeepUnpostedReferencesOption  *********************************");
			System.out.println("Message  :  "+actValidationMsg +" Value Expected : "+expValidationMsg);
			
			if (actValidationMsg.equalsIgnoreCase(expValidationMsg))
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
				sl_CloseBtn.click();
				return true;
			}
			else
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
				sl_CloseBtn.click();
				return false;
			}
		}
		
		
		
		
		
		
		
		
		
		// Ask Remarks on Approval
		
		public boolean 	checkWithOutConditionAskRemarksOnApprovalInTransactionAuthorizationConditionTab() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
    	{
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsmenuBtn));
    		settingsmenuBtn.click();
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(transactionAuthorizationBtn));
    		transactionAuthorizationBtn.click();
    		
    		Thread.sleep(2000);
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNameDropdown));
    		documentNameDropdown.sendKeys(" ");
    		
    		Thread.sleep(1000);
    			
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchasevoucherExpandbutton));
    		purchasevoucherExpandbutton.click();
    	
            getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchasevoucherTypeCreatedVoucher));
    		purchasevoucherTypeCreatedVoucher.click();
    		
    		Thread.sleep(3000);
    				
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
    		nameTxt.click();
    		
    		nameTxt.sendKeys(Keys.SPACE);
    		
    		int namecount=tranAuthNameList.size();
			
			for(int i=0 ; i < namecount ;i++)
			{
				String data=tranAuthNameList.get(i).getText();
				
				if(data.equalsIgnoreCase("Purchase"))
				{
					tranAuthNameList.get(i).click();
					
					break;
				}
			}
				
    		nameTxt.sendKeys(Keys.TAB);
    			
    		Thread.sleep(3000);
    		
    		click(cnrBtn);
    		Thread.sleep(1000);
    		
    		ClickUsingJs(Level1editBtn);
    		Thread.sleep(1000);
    		
    		//getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(Level1editBtn));
    		//Level1editBtn.click();
    		
    		Thread.sleep(3000);
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(keepUnpostedReferencesChkBox));
    		((JavascriptExecutor)getDriver()).executeScript("arguments[0].scrollIntoView();", keepUnpostedReferencesChkBox);
    		
    		Thread.sleep(1000);
    		//keepUnpostedReferencesChkBox.click();
    		ClickUsingJs(keepUnpostedReferencesChkBox);
    		
    		Thread.sleep(1000);
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(askRemarksOnapprovalChkBox));
    		askRemarksOnapprovalChkBox.click();
    		
    		Thread.sleep(2000);
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(definitionOkBtn));
    		definitionOkBtn.click();
    		
    		Thread.sleep(2000);
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(tranAuthSaveBtn));
    		tranAuthSaveBtn.click();
    		
    		String expValidationMsg="Authorization Flow saved successfully.";
    		
    		String actValidationMsg=checkValidationMessage(expValidationMsg);
    		
    				
    		System.out.println("Validation Message : "+actValidationMsg+"  Value Expected : "+"True");
    		
    		if(actValidationMsg.equalsIgnoreCase(expValidationMsg))
    		{
    			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(tranAuthCancelBtn));
    			tranAuthCancelBtn.click();
    			return true;
    		}
    		else
    		{
    			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(tranAuthCancelBtn));
    			tranAuthCancelBtn.click();
    			return false;
    		}
    	}
		
		
		
		
		
		
		public static boolean checkSavingPurchaseVoucherN1WithOutAuthorizationModeAskRemarksOnApprovalOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
			financialsMenu.click();
					
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
			financialsTransactionMenu.click();
				
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
			financialsTransactionsPurchaseMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVoucherNew));
			purchaseVoucherNew.click();
			
			Thread.sleep(3000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
			newBtn.click();
			
			checkValidationMessage("Screen opened");
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseAccountTxt));
			purchaseAccountTxt.click();
			purchaseAccountTxt.sendKeys("Purchase");
			
			Thread.sleep(2000);
			
			purchaseAccountTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
			vendorAccountTxt.click();
			vendorAccountTxt.sendKeys("Vendor A");
			
			Thread.sleep(2000);
			
			vendorAccountTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
			departmentTxt.click();
			departmentTxt.sendKeys("INDIA");
			
			Thread.sleep(2000);
			
			departmentTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(wareHouseTxt));
			wareHouseTxt.click();
			wareHouseTxt.sendKeys("HYDERABAD");
			
			Thread.sleep(2000);
			
			wareHouseTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
			select1stRow_1stColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
			enter_ItemTxt.sendKeys("STD RATE COGS ITEM");
			Thread.sleep(3000);
			enter_ItemTxt.sendKeys(Keys.TAB);
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_5thColumn));
			select1stRow_5thColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
			enter_Quantity.sendKeys("1");
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_7thColumn));
			select1stRow_7thColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
			enter_Rate.sendKeys(Keys.END);
			enter_Rate.sendKeys(Keys.SHIFT, Keys.HOME);
			enter_Rate.sendKeys(Keys.BACK_SPACE);
			enter_Rate.sendKeys("10");
			enter_Rate.sendKeys(Keys.TAB);
			
			Thread.sleep(2000);
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
			saveBtn.click();
			
			Thread.sleep(3000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
			billRefPickIcon.click();
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
			billRefOkBtn.click();
			
			
			String expMessage1= "Voucher saved successfully";
			String expMessage2= ": 1";
			
			String actMessage = checkValidationMessage(expMessage1);
			
		   System.out.println("************************************* checkSavingPurchaseVoucherN1WithOutAuthorizationModeAskRemarksOnApprovalOption  *********************************");
		   
		   System.out.println("SavingMessage  :  "+actMessage +" Value Expected : "+expMessage1+" "+expMessage2);
	
		   if(actMessage.startsWith(expMessage1) && actMessage.endsWith(expMessage2))
    		{
    			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
    			new_CloseBtn.click();
    			Thread.sleep(2000);
    			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
    			homeCloseBtn.click();
    			Thread.sleep(2000);
    			return true;
    		}
    		else
    		{
    			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
    			new_CloseBtn.click();
    			Thread.sleep(2000);
    			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
    			homeCloseBtn.click();
    			Thread.sleep(2000);
    			return false;
    		}
    	}
		
		
		
		
		
		
		
		public static boolean checkLogoutAndLoginWithUserAllOptionsWithOutAuthorizationModeAskRemarksOnApprovalOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
    	{
    		
    		
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplayLogo));
    		userNameDisplayLogo.click();
   		
   	     	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
   	     	logoutOption.click();

   	     	Thread.sleep(3000);
    		
    		LoginPage lp=new LoginPage(getDriver()); 
    		
    	    String unamelt="UserAllOptions";
    	  
    	    String pawslt="12345";
    	      
    	    lp.enterUserName(unamelt);
    	    
    	    lp.enterPassword(pawslt);
    	    
    	    lp.clickOnSignInBtn();
    	    
    	    //checkRefershPopOnlogin();
    	    
    	    //checkPopUpWindow();
    	  
    		Thread.sleep(7000);

    		String actUserInfo=userNameDisplay.getText();
    		
    		System.out.println("User Info  : "+actUserInfo);
    		
    		System.out.println("User Info Capture Text  :  "+userNameDisplay.getText());
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(companyLogo));
    		companyLogo.click();
    		
    		String getCompanyTxt=companyName.getText();
    		String getLoginCompanyName=getCompanyTxt.substring(0, 19);
    		System.out.println("company name  :  "+ getLoginCompanyName);
    		companyLogo.click();
    		
    		boolean actDashboard = dashboard.isDisplayed();
    		
    		
    		String expUserInfo           ="UserAllOptions";
    		String expLoginCompanyName   ="Automation";
    		boolean expDashboard = true;

    		if (actUserInfo.equalsIgnoreCase(expUserInfo) && getLoginCompanyName.contains(expLoginCompanyName) && actDashboard==expDashboard) 
    		{
				return true;
			}
    		else
    		{
    			return false;
			}
    	}
		
		
		
		
		
		
		
		
		public static boolean checkPurchasesVoucherNAuthorizationStatusWithUserAllOptionsWithOutAuthorizationModeAskRemarksOnApprovalOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
			financialsMenu.click();
					
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
			financialsTransactionMenu.click();
				
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
			financialsTransactionsPurchaseMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVoucherNew));
			purchaseVoucherNew.click();
			
			Thread.sleep(3000);
			
			int voucherGridDocNoCount = voucherGridDocNo.size();
			
			String actStatusRow1 = null;
			
			System.out.println("Size  : "+voucherGridDocNoCount);
			
			for (int i = 0; i < voucherGridDocNoCount; i++) 
			{
				String data = voucherGridDocNo.get(i).getText();
				
				if (data.equalsIgnoreCase("1")) 
				{
					 actStatusRow1 =  voucherGridAuthorizationStatus.get(i).getText();
				}
			}
			
			String expStatusRow1 = "Pending";
			
			Thread.sleep(2000);
			
			click(homePageVoucherArrowBtn);
			Thread.sleep(1000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pendingAuthorizationPurchases));
			pendingAuthorizationPurchases.click();
			
			Thread.sleep(2000);
			
			for (int i = 0; i < voucherGridDocNoCount; i++) 
			{
				String data = voucherGridDocNo.get(i).getText();
				
				if (data.equalsIgnoreCase("1")) 
				{
					 voucherGridCheckBoxList.get(i).click();
				}
			}
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(authorizeBtn));
			authorizeBtn.click();
			
			boolean actRemarksPopup = authorizationRemarkPopup.isDisplayed();
			boolean expRemarksPopup = false;
			
			Thread.sleep(2000);
			
			click(homePageVoucherArrowBtn);
			Thread.sleep(1000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homePageAllVouchersView));
			homePageAllVouchersView.click();
			
			Thread.sleep(2000);
			
			String actAfterAuthorizeStatusRow1 = null;
			
			for (int i = 0; i < voucherGridDocNoCount; i++) 
			{
				String data = voucherGridDocNo.get(i).getText();
				
				if (data.equalsIgnoreCase("1")) 
				{
					 actAfterAuthorizeStatusRow1 =  voucherGridAuthorizationStatus.get(i).getText();
				}
			}
			
			String expAfterAuthorizeStatusRow1 = "Authorized";
			
			System.out.println("************************************* checkPurchasesVoucherNAuthorizationStatusWithUserAllOptionsWithKeepUnpostedReferencesOption  *********************************");
			
			System.out.println("StatusRow1               : "+actStatusRow1				+" Value Expected : "+expStatusRow1);
			System.out.println("RemarksPopup             : "+actRemarksPopup            +" Value Expected : "+expRemarksPopup);
			System.out.println("AfterAuthorizeStatusRow1 : "+actAfterAuthorizeStatusRow1+" Value Expected : "+expAfterAuthorizeStatusRow1);
			
			if(actStatusRow1.equalsIgnoreCase(expStatusRow1) && actRemarksPopup==expRemarksPopup && actAfterAuthorizeStatusRow1.equalsIgnoreCase(expAfterAuthorizeStatusRow1))
			{
				System.out.println("Test Pass : Authorized Succesfully");
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
				homeCloseBtn.click();
    			Thread.sleep(3000);
				//excelReader.setCellData(xlfile, "SmokeSalesOrder", 627, 9, resPass);
				return true;
			}
			else
			{
				System.out.println("Test Fail : NOT Authorized Succesfully");
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
				homeCloseBtn.click();
    			Thread.sleep(3000);
				//excelReader.setCellData(xlfile, "SmokeSalesOrder", 627, 9, resFail);
				return false;
			}
			
		}
			
	
		
		
		public static boolean checkLogoutAndLoginWithSUToCheckAuthorizationStatusWithOutAuthorizationModeAskRemarksOnApprovalOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
    	{
    		
    		
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplayLogo));
    		userNameDisplayLogo.click();
   		
   	     	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
   	     	logoutOption.click();

   	     	Thread.sleep(3000);
    		
    		LoginPage lp=new LoginPage(getDriver()); 
    		
    	    String unamelt="su";
    	  
    	    String pawslt="su";
    	      
    	    lp.enterUserName(unamelt);
    	    
    	    lp.enterPassword(pawslt);
    	    
    	    lp.clickOnSignInBtn();
    	    
    	    //checkRefershPopOnlogin();
    	    
    	    //checkPopUpWindow();
    	  
    		Thread.sleep(6000);

    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
			financialsMenu.click();
					
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
			financialsTransactionMenu.click();
				
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
			financialsTransactionsPurchaseMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVoucherNew));
			purchaseVoucherNew.click();
			
			Thread.sleep(3000);
			
			int voucherGridDocNoCount = voucherGridDocNo.size();
			
			String actStatusRow1 = null;
			
			System.out.println("Size  : "+voucherGridDocNoCount);
			
			for (int i = 0; i < voucherGridDocNoCount; i++) 
			{
				String data = voucherGridDocNo.get(i).getText();
				
				if (data.equalsIgnoreCase("1")) 
				{
					 actStatusRow1 =  voucherGridAuthorizationStatus.get(i).getText();
				}
			}
			
			String expStatusRow1 = "Authorized";
			
			System.out.println("************************************* checkLogoutAndLoginWithSUToCheckAuthorizationStatusWithOutAuthorizationModeAskRemarksOnApprovalOption  *********************************");
			
			System.out.println("StatusRow1 : "+actStatusRow1+" Value Expected : "+expStatusRow1);
			
			if(actStatusRow1.equalsIgnoreCase(expStatusRow1))
			{
				System.out.println("Test Pass : Suspended Succesfully");
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
				homeCloseBtn.click();
    			Thread.sleep(2000);
				//excelReader.setCellData(xlfile, "SmokeSalesOrder", 627, 9, resPass);
				return true;
			}
			else
			{
				System.out.println("Test Fail : NOT Suspended Succesfully");
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
				homeCloseBtn.click();
    			Thread.sleep(2000);
				//excelReader.setCellData(xlfile, "SmokeSalesOrder", 627, 9, resFail);
				return false;
			}
			
		}
		
		
		
		
		
		
		
		public boolean checkEraseAllTransactionsWithOutAuthorizationModeAskRemarksOnApprovalOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
			homeMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dataMangementMenu));
			dataMangementMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(eraseAll));
			eraseAll.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(eraseTranscationsRadio));
			eraseTranscationsRadio.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(eraseAllOkBtn));
			eraseAllOkBtn.click();
			
			if(getIsAlertPresent())
			{
				getWaitForAlert();
				
				getAlert().accept();
			}
			
    		String expValidationMsg="Data deleted successfully.";
    		
    		String actValidationMsg=checkValidationMessage(expValidationMsg);
			
			System.out.println("************************************* checkEraseAllTransactionsWithOutAuthorizationModeAskRemarksOnApprovalOption  *********************************");
			System.out.println("Message  :  "+actValidationMsg +" Value Expected : "+expValidationMsg);
			
			if (actValidationMsg.equalsIgnoreCase(expValidationMsg))
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
				sl_CloseBtn.click();
				return true;
			}
			else
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
				sl_CloseBtn.click();
				return false;
			}
		}
		
		
		
		
		
		
		public boolean 	checkWithConditionAskRemarksOnApprovalInTransactionAuthorizationConditionTab() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
    	{
    		
    		
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsmenuBtn));
    		settingsmenuBtn.click();
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(transactionAuthorizationBtn));
    		transactionAuthorizationBtn.click();
    		
    		Thread.sleep(2000);
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNameDropdown));
    		documentNameDropdown.sendKeys(" ");
    		
    		Thread.sleep(1000);
    			
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchasevoucherExpandbutton));
    		purchasevoucherExpandbutton.click();
    	
            getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchasevoucherTypeCreatedVoucher));
    		purchasevoucherTypeCreatedVoucher.click();
    		
    		Thread.sleep(3000);
    				
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
    		nameTxt.click();
    		
    		nameTxt.sendKeys(Keys.SPACE);
    		
    		int namecount=tranAuthNameList.size();
			
			for(int i=0 ; i < namecount ;i++)
			{
				String data=tranAuthNameList.get(i).getText();
				
				if(data.equalsIgnoreCase("Purchase"))
				{
					tranAuthNameList.get(i).click();
					
					break;
				}
			}
				
    		nameTxt.sendKeys(Keys.TAB);
    			
    		Thread.sleep(3000);
    		
    		click(cnrBtn);
    		Thread.sleep(1000);
    		
    		ClickUsingJs(Level1editBtn);
    		Thread.sleep(1000);
    		
    		//getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(Level1editBtn));
    		//Level1editBtn.click();
    		
    		Thread.sleep(3000);
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(keepUnpostedReferencesChkBox));
    		((JavascriptExecutor)getDriver()).executeScript("arguments[0].scrollIntoView();", keepUnpostedReferencesChkBox);
    		
    		Thread.sleep(2000);
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(askRemarksOnapprovalChkBox));
    		askRemarksOnapprovalChkBox.click();
    		
    		Thread.sleep(2000);
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(definitionOkBtn));
    		definitionOkBtn.click();
    		
    		Thread.sleep(2000);
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(tranAuthSaveBtn));
    		tranAuthSaveBtn.click();
    		
    		String expValidationMsg="Authorization Flow saved successfully.";
    		
    		String actValidationMsg=checkValidationMessage(expValidationMsg);
    				
    		System.out.println("Validation Message : "+actValidationMsg+"  Value Expected : "+"True");
    		
    		if(actValidationMsg.equalsIgnoreCase(expValidationMsg))
    		{
    			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(tranAuthCancelBtn));
    			tranAuthCancelBtn.click();
    			return true;
    		}
    		else
    		{
    			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(tranAuthCancelBtn));
    			tranAuthCancelBtn.click();
    			return false;
    		}
    	}
		
		
		
		
		
		
		public static boolean checkSavingPurchaseVoucherN1WithAuthorizationModeAskRemarksOnApprovalOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
			financialsMenu.click();
					
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
			financialsTransactionMenu.click();
				
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
			financialsTransactionsPurchaseMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVoucherNew));
			purchaseVoucherNew.click();
			
			Thread.sleep(3000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
			newBtn.click();
			
			checkValidationMessage("Screen opened");
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseAccountTxt));
			purchaseAccountTxt.click();
			purchaseAccountTxt.sendKeys("Purchase");
			
			Thread.sleep(2000);
			
			purchaseAccountTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
			vendorAccountTxt.click();
			vendorAccountTxt.sendKeys("Vendor A");
			
			Thread.sleep(2000);
			
			vendorAccountTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
			departmentTxt.click();
			departmentTxt.sendKeys("INDIA");
			
			Thread.sleep(2000);
			
			departmentTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(wareHouseTxt));
			wareHouseTxt.click();
			wareHouseTxt.sendKeys("HYDERABAD");
			
			Thread.sleep(2000);
			
			wareHouseTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
			select1stRow_1stColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
			enter_ItemTxt.sendKeys("STD RATE COGS ITEM");
			Thread.sleep(3000);
			enter_ItemTxt.sendKeys(Keys.TAB);
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_5thColumn));
			select1stRow_5thColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
			enter_Quantity.sendKeys("1");
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_7thColumn));
			select1stRow_7thColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
			enter_Rate.sendKeys(Keys.END);
			enter_Rate.sendKeys(Keys.SHIFT, Keys.HOME);
			enter_Rate.sendKeys(Keys.BACK_SPACE);
			enter_Rate.sendKeys("10");
			enter_Rate.sendKeys(Keys.TAB);
			
			Thread.sleep(2000);
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
			saveBtn.click();
			
			Thread.sleep(3000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
			billRefPickIcon.click();
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
			billRefOkBtn.click();
			
			
			String expMessage1= "Voucher saved successfully";
			String expMessage2= ": 1";
			
			String actMessage = checkValidationMessage(expMessage1);
			
		   System.out.println("************************************* checkSavingPurchaseVoucherN1WithAuthorizationModeAskRemarksOnApprovalOption  *********************************");
		   
		   System.out.println("SavingMessage  :  "+actMessage +" Value Expected : "+expMessage1+" "+expMessage2);
	
		   if(actMessage.startsWith(expMessage1) && actMessage.endsWith(expMessage2))
    		{
    			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
    			new_CloseBtn.click();
    			Thread.sleep(2000);
    			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
    			homeCloseBtn.click();
    			Thread.sleep(2000);
    			return true;
    		}
    		else
    		{
    			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
    			new_CloseBtn.click();
    			Thread.sleep(2000);
    			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
    			homeCloseBtn.click();
    			Thread.sleep(2000);
    			return false;
    		}
    	}
		
		
		
		
		
		
		
		public static boolean checkLogoutAndLoginWithUserAllOptionsWithAuthorizationModeAskRemarksOnApprovalOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
    	{
    		
    		
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplayLogo));
    		userNameDisplayLogo.click();
   		
   	     	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
   	     	logoutOption.click();

   	     	Thread.sleep(3000);
    		
    		LoginPage lp=new LoginPage(getDriver()); 
    		
    	    String unamelt="UserAllOptions";
    	  
    	    String pawslt="12345";
    	      
    	    lp.enterUserName(unamelt);
    	    
    	    lp.enterPassword(pawslt);
    	    
    	    lp.clickOnSignInBtn();
    	    
    	    //checkRefershPopOnlogin();
    	    
    	    //checkPopUpWindow();
    	  
    		Thread.sleep(7000);

    		String actUserInfo=userNameDisplay.getText();
    		
    		System.out.println("User Info  : "+actUserInfo);
    		
    		System.out.println("User Info Capture Text  :  "+userNameDisplay.getText());
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(companyLogo));
    		companyLogo.click();
    		
    		String getCompanyTxt=companyName.getText();
    		String getLoginCompanyName=getCompanyTxt.substring(0, 19);
    		System.out.println("company name  :  "+ getLoginCompanyName);
    		companyLogo.click();
    		
    		boolean actDashboard = dashboard.isDisplayed();
    		
    		
    		String expUserInfo           ="UserAllOptions";
    		String expLoginCompanyName   ="Automation";
    		boolean expDashboard = true;

    		if (actUserInfo.equalsIgnoreCase(expUserInfo) && getLoginCompanyName.contains(expLoginCompanyName) && actDashboard==expDashboard) 
    		{
				return true;
			}
    		else
    		{
    			return false;
			}
    	}
		
		
		
		
		
		
		
		
		public static boolean checkPurchasesVoucherNAuthorizationStatusWithUserAllOptionsWithAuthorizationModeAskRemarksOnApprovalOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
			financialsMenu.click();
					
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
			financialsTransactionMenu.click();
				
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
			financialsTransactionsPurchaseMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVoucherNew));
			purchaseVoucherNew.click();
			
			Thread.sleep(3000);
			
			int voucherGridDocNoCount = voucherGridDocNo.size();
			
			String actStatusRow1 = null;
			
			System.out.println("Size  : "+voucherGridDocNoCount);
			
			for (int i = 0; i < voucherGridDocNoCount; i++) 
			{
				String data = voucherGridDocNo.get(i).getText();
				
				if (data.equalsIgnoreCase("1")) 
				{
					 actStatusRow1 =  voucherGridAuthorizationStatus.get(i).getText();
				}
			}
			
			String expStatusRow1 = "Pending";
			
			Thread.sleep(2000);
			
			 click(homePageVoucherArrowBtn);
			 Thread.sleep(1000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pendingAuthorizationPurchases));
			pendingAuthorizationPurchases.click();
			
			Thread.sleep(2000);
			
			for (int i = 0; i < voucherGridDocNoCount; i++) 
			{
				String data = voucherGridDocNo.get(i).getText();
				
				if (data.equalsIgnoreCase("1")) 
				{
					 voucherGridCheckBoxList.get(i).click();
				}
			}
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(authorizeBtn));
			authorizeBtn.click();
			
			Thread.sleep(2000);
			
			boolean actRemarksPopup = authorizationRemarkPopup.isDisplayed();
			boolean expRemarksPopup = true;
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(authorizePopupOkBtn));
			authorizePopupOkBtn.click();
			
			Thread.sleep(2000);
			
			 click(homePageVoucherArrowBtn);
			 Thread.sleep(1000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homePageAllVouchersView));
			homePageAllVouchersView.click();
			
			Thread.sleep(2000);
			
			String actAfterAuthorizeStatusRow1 = null;
			
			for (int i = 0; i < voucherGridDocNoCount; i++) 
			{
				String data = voucherGridDocNo.get(i).getText();
				
				if (data.equalsIgnoreCase("1")) 
				{
					 actAfterAuthorizeStatusRow1 =  voucherGridAuthorizationStatus.get(i).getText();
				}
			}
			
			String expAfterAuthorizeStatusRow1 = "Authorized";
			
			System.out.println("************************************* checkPurchasesVoucherNAuthorizationStatusWithUserAllOptionsWithKeepUnpostedReferencesOption  *********************************");
			
			System.out.println("StatusRow1               : "+actStatusRow1				+" Value Expected : "+expStatusRow1);
			System.out.println("RemarksPopup             : "+actRemarksPopup            +" Value Expected : "+expRemarksPopup);
			System.out.println("AfterAuthorizeStatusRow1 : "+actAfterAuthorizeStatusRow1+" Value Expected : "+expAfterAuthorizeStatusRow1);
			
			if(actStatusRow1.equalsIgnoreCase(expStatusRow1) && actRemarksPopup==expRemarksPopup && actAfterAuthorizeStatusRow1.equalsIgnoreCase(expAfterAuthorizeStatusRow1))
			{
				System.out.println("Test Pass : Authorized Succesfully");
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
				homeCloseBtn.click();
    			Thread.sleep(3000);
				//excelReader.setCellData(xlfile, "SmokeSalesOrder", 627, 9, resPass);
				return true;
			}
			else
			{
				System.out.println("Test Fail : NOT Authorized Succesfully");
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
				homeCloseBtn.click();
    			Thread.sleep(3000);
				//excelReader.setCellData(xlfile, "SmokeSalesOrder", 627, 9, resFail);
				return false;
			}
			
		}
			
	
		
		
		public static boolean checkLogoutAndLoginWithSUToCheckAuthorizationStatusWithAuthorizationModeAskRemarksOnApprovalOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
    	{
    		
    		
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplayLogo));
    		userNameDisplayLogo.click();
   		
   	     	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
   	     	logoutOption.click();

   	     	Thread.sleep(3000);
    		
    		LoginPage lp=new LoginPage(getDriver()); 
    		
    	    String unamelt="su";
    	  
    	    String pawslt="su";
    	      
    	    lp.enterUserName(unamelt);
    	    
    	    lp.enterPassword(pawslt);
    	    
    	    lp.clickOnSignInBtn();
    	    
    	    //checkRefershPopOnlogin();
    	    
    	    //checkPopUpWindow();
    	  
    		Thread.sleep(6000);

    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
			financialsMenu.click();
					
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
			financialsTransactionMenu.click();
				
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
			financialsTransactionsPurchaseMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVoucherNew));
			purchaseVoucherNew.click();
			
			Thread.sleep(3000);
			
			int voucherGridDocNoCount = voucherGridDocNo.size();
			
			String actStatusRow1 = null;
			
			System.out.println("Size  : "+voucherGridDocNoCount);
			
			for (int i = 0; i < voucherGridDocNoCount; i++) 
			{
				String data = voucherGridDocNo.get(i).getText();
				
				if (data.equalsIgnoreCase("1")) 
				{
					 actStatusRow1 =  voucherGridAuthorizationStatus.get(i).getText();
				}
			}
			
			String expStatusRow1 = "Authorized";
			
			System.out.println("************************************* checkLogoutAndLoginWithSUToCheckAuthorizationStatusWithAuthorizationModeAskRemarksOnApprovalOption  *********************************");
			
			System.out.println("StatusRow1 : "+actStatusRow1+" Value Expected : "+expStatusRow1);
			
			if(actStatusRow1.equalsIgnoreCase(expStatusRow1))
			{
				System.out.println("Test Pass : Suspended Succesfully");
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
				homeCloseBtn.click();
    			Thread.sleep(2000);
				//excelReader.setCellData(xlfile, "SmokeSalesOrder", 627, 9, resPass);
				return true;
			}
			else
			{
				System.out.println("Test Fail : NOT Suspended Succesfully");
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
				homeCloseBtn.click();
    			Thread.sleep(2000);
				//excelReader.setCellData(xlfile, "SmokeSalesOrder", 627, 9, resFail);
				return false;
			}
			
		}
		
		
		
		
		
		
		
		public boolean checkEraseAllTransactionsWithAuthorizationModeAskRemarksOnApprovalOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
			homeMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dataMangementMenu));
			dataMangementMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(eraseAll));
			eraseAll.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(eraseTranscationsRadio));
			eraseTranscationsRadio.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(eraseAllOkBtn));
			eraseAllOkBtn.click();
			
			if(getIsAlertPresent())
			{
				getWaitForAlert();
				
				getAlert().accept();
			}
			
    		String expValidationMsg="Data deleted successfully.";
    		
    		String actValidationMsg=checkValidationMessage(expValidationMsg);
			
			System.out.println("************************************* checkEraseAllTransactionsWithAuthorizationModeAskRemarksOnApprovalOption  *********************************");
			System.out.println("Message  :  "+actValidationMsg +" Value Expected : "+expValidationMsg);
			
			if (actValidationMsg.equalsIgnoreCase(expValidationMsg))
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
				sl_CloseBtn.click();
				return true;
			}
			else
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
				sl_CloseBtn.click();
				return false;
			}
		}
		
		
		
		
		
		
		
		
		
		// Make Approval Remarks Mandatory
		
		public boolean 	checkWithConditionMakeApprovalRemarksMandatoryInTransactionAuthorizationConditionTab() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
    	{
    		
    		
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsmenuBtn));
    		settingsmenuBtn.click();
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(transactionAuthorizationBtn));
    		transactionAuthorizationBtn.click();
    		
    		Thread.sleep(2000);
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNameDropdown));
    		documentNameDropdown.sendKeys(" ");
    		
    		Thread.sleep(1000);
    			
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchasevoucherExpandbutton));
    		purchasevoucherExpandbutton.click();
    	
            getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchasevoucherTypeCreatedVoucher));
    		purchasevoucherTypeCreatedVoucher.click();
    		
    		Thread.sleep(3000);
    				
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
    		nameTxt.click();
    		
    		nameTxt.sendKeys(Keys.SPACE);
    		
    		int namecount=tranAuthNameList.size();
			
			for(int i=0 ; i < namecount ;i++)
			{
				String data=tranAuthNameList.get(i).getText();
				
				if(data.equalsIgnoreCase("Purchase"))
				{
					tranAuthNameList.get(i).click();
					
					break;
				}
			}
				
    		nameTxt.sendKeys(Keys.TAB);
    			
    		Thread.sleep(3000);
    		
    		click(cnrBtn);
    		Thread.sleep(1000);
    		
    		ClickUsingJs(Level1editBtn);
    		Thread.sleep(1000);
    		
    		//getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(Level1editBtn));
    		//Level1editBtn.click();
    		
    		Thread.sleep(3000);
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(keepUnpostedReferencesChkBox));
    		((JavascriptExecutor)getDriver()).executeScript("arguments[0].scrollIntoView();", keepUnpostedReferencesChkBox);
    		
    		Thread.sleep(2000);
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(makeApprovalRemarksmandatoryChkBox));
    		makeApprovalRemarksmandatoryChkBox.click();
    		
    		Thread.sleep(2000);
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(definitionOkBtn));
    		definitionOkBtn.click();
    		
    		Thread.sleep(2000);
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(tranAuthSaveBtn));
    		tranAuthSaveBtn.click();
    		
    		String expValidationMsg="Authorization Flow saved successfully.";
    		
    		String actValidationMsg=checkValidationMessage(expValidationMsg);
    				
    		System.out.println("Validation Message : "+actValidationMsg+"  Value Expected : "+"True");
    		
    		if(actValidationMsg.equalsIgnoreCase(expValidationMsg))
    		{
    			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(tranAuthCancelBtn));
    			tranAuthCancelBtn.click();
    			return true;
    		}
    		else
    		{
    			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(tranAuthCancelBtn));
    			tranAuthCancelBtn.click();
    			return false;
    		}
    	}
		
		
		
		
		
		
		public static boolean checkSavingPurchaseVoucherN1WithAuthorizationModeMakeApprovalRemarksMandatoryOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
			financialsMenu.click();
					
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
			financialsTransactionMenu.click();
				
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
			financialsTransactionsPurchaseMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVoucherNew));
			purchaseVoucherNew.click();
			
			Thread.sleep(3000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
			newBtn.click();
			
			checkValidationMessage("Screen opened");
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseAccountTxt));
			purchaseAccountTxt.click();
			purchaseAccountTxt.sendKeys("Purchase");
			
			Thread.sleep(2000);
			
			purchaseAccountTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
			vendorAccountTxt.click();
			vendorAccountTxt.sendKeys("Vendor A");
			
			Thread.sleep(2000);
			
			vendorAccountTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
			departmentTxt.click();
			departmentTxt.sendKeys("INDIA");
			
			Thread.sleep(2000);
			
			departmentTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(wareHouseTxt));
			wareHouseTxt.click();
			wareHouseTxt.sendKeys("HYDERABAD");
			
			Thread.sleep(2000);
			
			wareHouseTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
			select1stRow_1stColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
			enter_ItemTxt.sendKeys("STD RATE COGS ITEM");
			Thread.sleep(3000);
			enter_ItemTxt.sendKeys(Keys.TAB);
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_5thColumn));
			select1stRow_5thColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
			enter_Quantity.sendKeys("1");
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_7thColumn));
			select1stRow_7thColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
			enter_Rate.sendKeys(Keys.END);
			enter_Rate.sendKeys(Keys.SHIFT, Keys.HOME);
			enter_Rate.sendKeys(Keys.BACK_SPACE);
			enter_Rate.sendKeys("10");
			enter_Rate.sendKeys(Keys.TAB);
			
			Thread.sleep(2000);
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
			saveBtn.click();
			
			Thread.sleep(3000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
			billRefPickIcon.click();
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
			billRefOkBtn.click();
			
			
			String expMessage1= "Voucher saved successfully";
			String expMessage2= ": 1";
			
			String actMessage = checkValidationMessage(expMessage1);
			
		   System.out.println("************************************* checkSavingPurchaseVoucherN1WithAuthorizationModeMakeApprovalRemarksMandatoryOption  *********************************");
		   
		   System.out.println("SavingMessage  :  "+actMessage +" Value Expected : "+expMessage1+" "+expMessage2);
	
		   if(actMessage.startsWith(expMessage1) && actMessage.endsWith(expMessage2))
    		{
    			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
    			new_CloseBtn.click();
    			Thread.sleep(2000);
    			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
    			homeCloseBtn.click();
    			Thread.sleep(2000);
    			return true;
    		}
    		else
    		{
    			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
    			new_CloseBtn.click();
    			Thread.sleep(2000);
    			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
    			homeCloseBtn.click();
    			Thread.sleep(2000);
    			return false;
    		}
    	}
		
		
		
		
		
		
		
		public static boolean checkLogoutAndLoginWithUserAllOptionsWithAuthorizationModeMakeApprovalRemarksMandatoryOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
    	{
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplayLogo));
    		userNameDisplayLogo.click();
   		
   	     	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
   	     	logoutOption.click();

   	     	Thread.sleep(3000);
    		
    		LoginPage lp=new LoginPage(getDriver()); 
    		
    	    String unamelt="UserAllOptions";
    	  
    	    String pawslt="12345";
    	      
    	    lp.enterUserName(unamelt);
    	    
    	    lp.enterPassword(pawslt);
    	    
    	    lp.clickOnSignInBtn();
    	    
    	    //checkRefershPopOnlogin();
    	    
    	    //checkPopUpWindow();
    	  
    		Thread.sleep(7000);

    		String actUserInfo=userNameDisplay.getText();
    		
    		System.out.println("User Info  : "+actUserInfo);
    		
    		System.out.println("User Info Capture Text  :  "+userNameDisplay.getText());
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(companyLogo));
    		companyLogo.click();
    		
    		String getCompanyTxt=companyName.getText();
    		String getLoginCompanyName=getCompanyTxt.substring(0, 19);
    		System.out.println("company name  :  "+ getLoginCompanyName);
    		companyLogo.click();
    		
    		boolean actDashboard = dashboard.isDisplayed();
    		
    		
    		String expUserInfo           ="UserAllOptions";
    		String expLoginCompanyName   ="Automation";
    		boolean expDashboard = true;

    		if (actUserInfo.equalsIgnoreCase(expUserInfo) && getLoginCompanyName.contains(expLoginCompanyName) && actDashboard==expDashboard) 
    		{
				return true;
			}
    		else
    		{
    			return false;
			}
    	}
		
		
		
		
		
		
		
		
		public static boolean checkPurchasesVoucherNAuthorizationStatusWithUserAllOptionsWithAuthorizationModeMakeApprovalRemarksMandatoryOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
			financialsMenu.click();
					
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
			financialsTransactionMenu.click();
				
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
			financialsTransactionsPurchaseMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVoucherNew));
			purchaseVoucherNew.click();
			
			Thread.sleep(3000);
			
			int voucherGridDocNoCount = voucherGridDocNo.size();
			
			String actStatusRow1 = null;
			
			System.out.println("Size  : "+voucherGridDocNoCount);
			
			for (int i = 0; i < voucherGridDocNoCount; i++) 
			{
				String data = voucherGridDocNo.get(i).getText();
				
				if (data.equalsIgnoreCase("1")) 
				{
					 actStatusRow1 =  voucherGridAuthorizationStatus.get(i).getText();
				}
			}
			
			String expStatusRow1 = "Pending";
			
			Thread.sleep(2000);
			
			 click(homePageVoucherArrowBtn);
			 Thread.sleep(1000);

			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pendingAuthorizationPurchases));
			pendingAuthorizationPurchases.click();
			
			Thread.sleep(3000);
			
			for (int i = 0; i < voucherGridDocNoCount; i++) 
			{
				String data = voucherGridDocNo.get(i).getText();
				
				if (data.equalsIgnoreCase("1")) 
				{
					 voucherGridCheckBoxList.get(i).click();
				}
			}
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(authorizeBtn));
			authorizeBtn.click();
			
			Thread.sleep(3000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(authorizationRemarkPopup));
			boolean actRemarksPopup = authorizationRemarkPopup.isDisplayed();
			boolean expRemarksPopup = true;
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(authorizePopupOkBtn));
			authorizePopupOkBtn.click();
			
			String expMandatoryMsg = "Remark is mandatory.";
			
			String actMandatoryMsg = checkValidationMessage(expMandatoryMsg);
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(authorizePopupTextArea));
			authorizePopupTextArea.click();
			authorizePopupTextArea.sendKeys("Make Approval Remarks Mandatory");
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(authorizePopupOkBtn));
			authorizePopupOkBtn.click();
			
			Thread.sleep(2000);
			
			 click(homePageVoucherArrowBtn);
			 Thread.sleep(1000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homePageAllVouchersView));
			homePageAllVouchersView.click();
			
			Thread.sleep(2000);
			
			String actAfterAuthorizeStatusRow1 = null;
			
			for (int i = 0; i < voucherGridDocNoCount; i++) 
			{
				String data = voucherGridDocNo.get(i).getText();
				
				if (data.equalsIgnoreCase("1")) 
				{
					 actAfterAuthorizeStatusRow1 =  voucherGridAuthorizationStatus.get(i).getText();
				}
			}
			
			String expAfterAuthorizeStatusRow1 = "Authorized";
			
			System.out.println("************************************* checkPurchasesVoucherNAuthorizationStatusWithUserAllOptionsWithAuthorizationModeMakeApprovalRemarksMandatoryOption  *********************************");
			
			System.out.println("StatusRow1               : "+actStatusRow1				+" Value Expected : "+expStatusRow1);
			System.out.println("RemarksPopup             : "+actRemarksPopup            +" Value Expected : "+expRemarksPopup);
			System.out.println("MandatoryMsg             : "+actMandatoryMsg            +" Value Expected : "+expMandatoryMsg);
			System.out.println("AfterAuthorizeStatusRow1 : "+actAfterAuthorizeStatusRow1+" Value Expected : "+expAfterAuthorizeStatusRow1);
			
			if(actStatusRow1.equalsIgnoreCase(expStatusRow1) && actRemarksPopup==expRemarksPopup && actMandatoryMsg.equalsIgnoreCase(expMandatoryMsg) 
				&& actAfterAuthorizeStatusRow1.equalsIgnoreCase(expAfterAuthorizeStatusRow1))
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
				homeCloseBtn.click();
				return true;
			}
			else
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
				homeCloseBtn.click();
				return false;
			}
		}
			
		
		
		
		
	
		
		
		public static boolean checkLogoutAndLoginWithSUToCheckAuthorizationStatusWithAuthorizationModeMakeApprovalRemarksMandatoryOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
    	{
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplayLogo));
    		userNameDisplayLogo.click();
   		
   	     	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
   	     	logoutOption.click();

   	     	Thread.sleep(3000);
    		
    		LoginPage lp=new LoginPage(getDriver()); 
    		
    	    String unamelt="su";
    	  
    	    String pawslt="su";
    	      
    	    lp.enterUserName(unamelt);
    	    
    	    lp.enterPassword(pawslt);
    	    
    	    lp.clickOnSignInBtn();
    	    
    	    //checkRefershPopOnlogin();
    	    
    	    //checkPopUpWindow();
    	  
    		Thread.sleep(6000);

    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
			financialsMenu.click();
					
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
			financialsTransactionMenu.click();
				
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
			financialsTransactionsPurchaseMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVoucherNew));
			purchaseVoucherNew.click();
			
			Thread.sleep(3000);
			
			int voucherGridDocNoCount = voucherGridDocNo.size();
			
			String actStatusRow1 = null;
			
			System.out.println("Size  : "+voucherGridDocNoCount);
			
			for (int i = 0; i < voucherGridDocNoCount; i++) 
			{
				String data = voucherGridDocNo.get(i).getText();
				
				if (data.equalsIgnoreCase("1")) 
				{
					 actStatusRow1 =  voucherGridAuthorizationStatus.get(i).getText();
				}
			}
			
			String expStatusRow1 = "Authorized";
			
			System.out.println("************************************* checkLogoutAndLoginWithSUToCheckAuthorizationStatusWithAuthorizationModeMakeApprovalRemarksMandatoryOption  *********************************");
			
			System.out.println("StatusRow1 : "+actStatusRow1+" Value Expected : "+expStatusRow1);
			
			if(actStatusRow1.equalsIgnoreCase(expStatusRow1))
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
				homeCloseBtn.click();
    			Thread.sleep(2000);
				//excelReader.setCellData(xlfile, "SmokeSalesOrder", 627, 9, resPass);
				return true;
			}
			else
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
				homeCloseBtn.click();
    			Thread.sleep(2000);
				//excelReader.setCellData(xlfile, "SmokeSalesOrder", 627, 9, resFail);
				return false;
			}
			
		}
		
		
		
		
		
		
		
		public boolean checkEraseAllTransactionsWithAuthorizationModeMakeApprovalRemarksMandatoryOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
			homeMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dataMangementMenu));
			dataMangementMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(eraseAll));
			eraseAll.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(eraseTranscationsRadio));
			eraseTranscationsRadio.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(eraseAllOkBtn));
			eraseAllOkBtn.click();
			
			if(getIsAlertPresent())
			{
				getWaitForAlert();
				
				getAlert().accept();
			}
			
    		String expValidationMsg="Data deleted successfully.";
    		
    		String actValidationMsg=checkValidationMessage(expValidationMsg);
			
			System.out.println("************************************* checkEraseAllTransactionsWithAuthorizationModeMakeApprovalRemarksMandatoryOption  *********************************");
			System.out.println("Message  :  "+actValidationMsg +" Value Expected : "+expValidationMsg);
			
			if (actValidationMsg.equalsIgnoreCase(expValidationMsg))
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
				sl_CloseBtn.click();
				return true;
			}
			else
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
				sl_CloseBtn.click();
				return false;
			}
		}
		
		
		
		
		
		
		
		
		// Ask Remarks on Rejection
		
		public static boolean checkSavingPurchaseVoucherN1WithOutAuthorizationModeAskRemarksOnRejectionOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
			financialsMenu.click();
					
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
			financialsTransactionMenu.click();
				
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
			financialsTransactionsPurchaseMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVoucherNew));
			purchaseVoucherNew.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
			newBtn.click();
			
			checkValidationMessage("Screen opened");
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseAccountTxt));
			purchaseAccountTxt.click();
			purchaseAccountTxt.sendKeys("Purchase");
			
			Thread.sleep(2000);
			
			purchaseAccountTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
			vendorAccountTxt.click();
			vendorAccountTxt.sendKeys("Vendor A");
			
			Thread.sleep(2000);
			
			vendorAccountTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
			departmentTxt.click();
			departmentTxt.sendKeys("INDIA");
			
			Thread.sleep(2000);
			
			departmentTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(wareHouseTxt));
			wareHouseTxt.click();
			wareHouseTxt.sendKeys("HYDERABAD");
			
			Thread.sleep(2000);
			
			wareHouseTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
			select1stRow_1stColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
			enter_ItemTxt.sendKeys("STD RATE COGS ITEM");
			Thread.sleep(3000);
			enter_ItemTxt.sendKeys(Keys.TAB);
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_5thColumn));
			select1stRow_5thColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
			enter_Quantity.sendKeys("1");
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_7thColumn));
			select1stRow_7thColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
			enter_Rate.sendKeys(Keys.END);
			enter_Rate.sendKeys(Keys.SHIFT, Keys.HOME);
			enter_Rate.sendKeys(Keys.BACK_SPACE);
			enter_Rate.sendKeys("10");
			enter_Rate.sendKeys(Keys.TAB);
			
			Thread.sleep(2000);
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
			saveBtn.click();
			
			Thread.sleep(3000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
			billRefPickIcon.click();
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
			billRefOkBtn.click();
			
			
			String expMessage1= "Voucher saved successfully";
			String expMessage2= ": 1";
			
			String actMessage = checkValidationMessage(expMessage1);
			
		   System.out.println("************************************* checkSavingPurchaseVoucherN1WithOutAuthorizationModeAskRemarksOnRejectionOption  *********************************");
		   
		   System.out.println("SavingMessage  :  "+actMessage +" Value Expected : "+expMessage1+" "+expMessage2);
	
		   if(actMessage.startsWith(expMessage1) && actMessage.endsWith(expMessage2))
    		{
    			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
    			new_CloseBtn.click();
    			Thread.sleep(2000);
    			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
    			homeCloseBtn.click();
    			Thread.sleep(2000);
    			return true;
    		}
    		else
    		{
    			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
    			new_CloseBtn.click();
    			Thread.sleep(2000);
    			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
    			homeCloseBtn.click();
    			Thread.sleep(2000);
    			return false;
    		}
    	}
		
		
		
		
		
		
		
		public static boolean checkLogoutAndLoginWithUserAllOptionsWithOutAuthorizationModeAskRemarksOnRejectionOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
    	{
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplayLogo));
    		userNameDisplayLogo.click();
   		
   	     	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
   	     	logoutOption.click();

   	     	Thread.sleep(3000);
    		
    		LoginPage lp=new LoginPage(getDriver()); 
    		
    	    String unamelt="UserAllOptions";
    	  
    	    String pawslt="12345";
    	      
    	    lp.enterUserName(unamelt);
    	    
    	    lp.enterPassword(pawslt);
    	    
    	    lp.clickOnSignInBtn();
    	    
    	    //checkRefershPopOnlogin();
    	    
    	    //checkPopUpWindow();
    	  
    		Thread.sleep(7000);

    		String actUserInfo=userNameDisplay.getText();
    		
    		System.out.println("User Info  : "+actUserInfo);
    		
    		System.out.println("User Info Capture Text  :  "+userNameDisplay.getText());
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(companyLogo));
    		companyLogo.click();
    		
    		String getCompanyTxt=companyName.getText();
    		String getLoginCompanyName=getCompanyTxt.substring(0, 19);
    		System.out.println("company name  :  "+ getLoginCompanyName);
    		companyLogo.click();
    		
    		boolean actDashboard = dashboard.isDisplayed();
    		
    		
    		String expUserInfo           ="UserAllOptions";
    		String expLoginCompanyName   ="Automation";
    		boolean expDashboard = true;

    		if (actUserInfo.equalsIgnoreCase(expUserInfo) && getLoginCompanyName.contains(expLoginCompanyName) && actDashboard==expDashboard) 
    		{
				return true;
			}
    		else
    		{
    			return false;
			}
    	}
		
		
		
		
		
		
		
		
		public static boolean checkPurchasesVoucherNAuthorizationStatusWithUserAllOptionsWithOutAuthorizationModeAskRemarksOnRejectionOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
			financialsMenu.click();
					
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
			financialsTransactionMenu.click();
				
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
			financialsTransactionsPurchaseMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVoucherNew));
			purchaseVoucherNew.click();
			
			Thread.sleep(3000);
			
			int voucherGridDocNoCount = voucherGridDocNo.size();
			
			String actStatusRow1 = null;
			
			System.out.println("Size  : "+voucherGridDocNoCount);
			
			for (int i = 0; i < voucherGridDocNoCount; i++) 
			{
				String data = voucherGridDocNo.get(i).getText();
				
				if (data.equalsIgnoreCase("1")) 
				{
					 actStatusRow1 =  voucherGridAuthorizationStatus.get(i).getText();
				}
			}
			
			String expStatusRow1 = "Pending";
			
			Thread.sleep(2000);
			
			 click(homePageVoucherArrowBtn);
			 Thread.sleep(1000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pendingAuthorizationPurchases));
			pendingAuthorizationPurchases.click();
			
			Thread.sleep(2000);
			
			for (int i = 0; i < voucherGridDocNoCount; i++) 
			{
				String data = voucherGridDocNo.get(i).getText();
				
				if (data.equalsIgnoreCase("1")) 
				{
					 voucherGridCheckBoxList.get(i).click();
				}
			}
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rejectBtn));
			rejectBtn.click();
			
			boolean actRemarksPopup = authorizationRemarkPopup.isDisplayed();
			boolean expRemarksPopup = false;
			
			Thread.sleep(2000);
			
			 click(homePageVoucherArrowBtn);
			 Thread.sleep(1000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homePageAllVouchersView));
			homePageAllVouchersView.click();
			
			Thread.sleep(2000);
			
			String actAfterAuthorizeStatusRow1 = null;
			
			for (int i = 0; i < voucherGridDocNoCount; i++) 
			{
				String data = voucherGridDocNo.get(i).getText();
				
				if (data.equalsIgnoreCase("1")) 
				{
					 actAfterAuthorizeStatusRow1 =  voucherGridAuthorizationStatus.get(i).getText();
				}
			}
			
			String expAfterAuthorizeStatusRow1 = "Rejected";
			
			System.out.println("************************************* checkPurchasesVoucherNAuthorizationStatusWithUserAllOptionsWithKeepUnpostedReferencesOption  *********************************");
			
			System.out.println("StatusRow1               : "+actStatusRow1				+" Value Expected : "+expStatusRow1);
			System.out.println("RemarksPopup             : "+actRemarksPopup            +" Value Expected : "+expRemarksPopup);
			System.out.println("AfterAuthorizeStatusRow1 : "+actAfterAuthorizeStatusRow1+" Value Expected : "+expAfterAuthorizeStatusRow1);
			
			if(actStatusRow1.equalsIgnoreCase(expStatusRow1) && actRemarksPopup==expRemarksPopup && actAfterAuthorizeStatusRow1.equalsIgnoreCase(expAfterAuthorizeStatusRow1))
			{
				System.out.println("Test Pass : Authorized Succesfully");
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
				homeCloseBtn.click();
    			Thread.sleep(3000);
				//excelReader.setCellData(xlfile, "SmokeSalesOrder", 627, 9, resPass);
				return true;
			}
			else
			{
				System.out.println("Test Fail : NOT Authorized Succesfully");
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
				homeCloseBtn.click();
    			Thread.sleep(3000);
				//excelReader.setCellData(xlfile, "SmokeSalesOrder", 627, 9, resFail);
				return false;
			}
			
		}
			
	
		
		
		public static boolean checkLogoutAndLoginWithSUToCheckAuthorizationStatusWithOutAuthorizationModeAskRemarksOnRejectionOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
    	{
    		
    		
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplayLogo));
    		userNameDisplayLogo.click();
   		
   	     	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
   	     	logoutOption.click();

   	     	Thread.sleep(3000);
    		
    		LoginPage lp=new LoginPage(getDriver()); 
    		
    	    String unamelt="su";
    	  
    	    String pawslt="su";
    	      
    	    lp.enterUserName(unamelt);
    	    
    	    lp.enterPassword(pawslt);
    	    
    	    lp.clickOnSignInBtn();
    	    
    	    //checkRefershPopOnlogin();
    	    
    	    //checkPopUpWindow();
    	  
    		Thread.sleep(6000);

    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
			financialsMenu.click();
					
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
			financialsTransactionMenu.click();
				
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
			financialsTransactionsPurchaseMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVoucherNew));
			purchaseVoucherNew.click();
			
			Thread.sleep(3000);
			
			int voucherGridDocNoCount = voucherGridDocNo.size();
			
			String actStatusRow1 = null;
			
			System.out.println("Size  : "+voucherGridDocNoCount);
			
			for (int i = 0; i < voucherGridDocNoCount; i++) 
			{
				String data = voucherGridDocNo.get(i).getText();
				
				if (data.equalsIgnoreCase("1")) 
				{
					 actStatusRow1 =  voucherGridAuthorizationStatus.get(i).getText();
				}
			}
			
			String expStatusRow1 = "Rejected";
			
			System.out.println("************************************* checkLogoutAndLoginWithSUToCheckAuthorizationStatusWithOutAuthorizationModeAskRemarksOnRejectionOption  *********************************");
			
			System.out.println("StatusRow1 : "+actStatusRow1+" Value Expected : "+expStatusRow1);
			
			if(actStatusRow1.equalsIgnoreCase(expStatusRow1))
			{
				System.out.println("Test Pass : Suspended Succesfully");
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
				homeCloseBtn.click();
    			Thread.sleep(2000);
				//excelReader.setCellData(xlfile, "SmokeSalesOrder", 627, 9, resPass);
				return true;
			}
			else
			{
				System.out.println("Test Fail : NOT Suspended Succesfully");
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
				homeCloseBtn.click();
    			Thread.sleep(2000);
				//excelReader.setCellData(xlfile, "SmokeSalesOrder", 627, 9, resFail);
				return false;
			}
			
		}
		
		
		
		
		
		
		public boolean checkEraseAllTransactionsWithOutAuthorizationModeAskRemarksOnRejectionOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
			homeMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dataMangementMenu));
			dataMangementMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(eraseAll));
			eraseAll.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(eraseTranscationsRadio));
			eraseTranscationsRadio.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(eraseAllOkBtn));
			eraseAllOkBtn.click();
			
			if(getIsAlertPresent())
			{
				getWaitForAlert();
				
				getAlert().accept();
			}
			
    		String expValidationMsg="Data deleted successfully.";
    		
    		String actValidationMsg=checkValidationMessage(expValidationMsg);
			
			System.out.println("************************************* checkEraseAllTransactionsWithOutAuthorizationModeAskRemarksOnRejectionOption  *********************************");
			System.out.println("Message  :  "+actValidationMsg +" Value Expected : "+expValidationMsg);
			
			if (actValidationMsg.equalsIgnoreCase(expValidationMsg))
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
				sl_CloseBtn.click();
				return true;
			}
			else
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
				sl_CloseBtn.click();
				return false;
			}
		}
		
		
		
		
		
		
		
		
		
		public boolean 	checkWithConditionAskRemarksOnRejectionInTransactionAuthorizationConditionTab() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
    	{
    		
    		
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsmenuBtn));
    		settingsmenuBtn.click();
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(transactionAuthorizationBtn));
    		transactionAuthorizationBtn.click();
    		
    		Thread.sleep(2000);
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNameDropdown));
    		documentNameDropdown.sendKeys(" ");
    		
    		Thread.sleep(1000);
    			
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchasevoucherExpandbutton));
    		purchasevoucherExpandbutton.click();
    	
            getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchasevoucherTypeCreatedVoucher));
    		purchasevoucherTypeCreatedVoucher.click();
    		
    		Thread.sleep(3000);
    				
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
    		nameTxt.click();
    		
    		nameTxt.sendKeys(Keys.SPACE);
    		
    		int namecount=tranAuthNameList.size();
			
			for(int i=0 ; i < namecount ;i++)
			{
				String data=tranAuthNameList.get(i).getText();
				
				if(data.equalsIgnoreCase("Purchase"))
				{
					tranAuthNameList.get(i).click();
					
					break;
				}
			}
				
    		nameTxt.sendKeys(Keys.TAB);
    			
    		Thread.sleep(3000);
    		
    		click(cnrBtn);
    		Thread.sleep(1000);
    		
    		ClickUsingJs(Level1editBtn);
    		Thread.sleep(1000);
    		
    		//getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(Level1editBtn));
    		//Level1editBtn.click();
    		
    		Thread.sleep(3000);
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(keepUnpostedReferencesChkBox));
    		((JavascriptExecutor)getDriver()).executeScript("arguments[0].scrollIntoView();", keepUnpostedReferencesChkBox);
    		
    		Thread.sleep(2000);
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(askRemarksOnRejectionChkBox));
    		askRemarksOnRejectionChkBox.click();
    		
    		Thread.sleep(2000);
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(definitionOkBtn));
    		definitionOkBtn.click();
    		
    		Thread.sleep(2000);
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(tranAuthSaveBtn));
    		tranAuthSaveBtn.click();
    		
    		String expValidationMsg="Authorization Flow saved successfully.";
    		
    		String actValidationMsg=checkValidationMessage(expValidationMsg);
    		
    		System.out.println("Validation Message : "+actValidationMsg+"  Value Expected : "+"True");
    		
    		if(actValidationMsg.equalsIgnoreCase(expValidationMsg))
    		{
    			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(tranAuthCancelBtn));
    			tranAuthCancelBtn.click();
    			return true;
    		}
    		else
    		{
    			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(tranAuthCancelBtn));
    			tranAuthCancelBtn.click();
    			return false;
    		}
    	}
		
		
		
		
		
		
		
		
		public static boolean checkSavingPurchaseVoucherN1WithAuthorizationModeAskRemarksOnRejectionOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
			financialsMenu.click();
					
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
			financialsTransactionMenu.click();
				
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
			financialsTransactionsPurchaseMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVoucherNew));
			purchaseVoucherNew.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
			newBtn.click();
			
			checkValidationMessage("Screen opened");
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseAccountTxt));
			purchaseAccountTxt.click();
			purchaseAccountTxt.sendKeys("Purchase");
			
			Thread.sleep(2000);
			
			purchaseAccountTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
			vendorAccountTxt.click();
			vendorAccountTxt.sendKeys("Vendor A");
			
			Thread.sleep(2000);
			
			vendorAccountTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
			departmentTxt.click();
			departmentTxt.sendKeys("INDIA");
			
			Thread.sleep(2000);
			
			departmentTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(wareHouseTxt));
			wareHouseTxt.click();
			wareHouseTxt.sendKeys("HYDERABAD");
			
			Thread.sleep(2000);
			
			wareHouseTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
			select1stRow_1stColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
			enter_ItemTxt.sendKeys("STD RATE COGS ITEM");
			Thread.sleep(3000);
			enter_ItemTxt.sendKeys(Keys.TAB);
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_5thColumn));
			select1stRow_5thColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
			enter_Quantity.sendKeys("1");
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_7thColumn));
			select1stRow_7thColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
			enter_Rate.sendKeys(Keys.END);
			enter_Rate.sendKeys(Keys.SHIFT, Keys.HOME);
			enter_Rate.sendKeys(Keys.BACK_SPACE);
			enter_Rate.sendKeys("10");
			enter_Rate.sendKeys(Keys.TAB);
			
			Thread.sleep(2000);
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
			saveBtn.click();
			
			Thread.sleep(3000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
			billRefPickIcon.click();
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
			billRefOkBtn.click();
			
			String expMessage1= "Voucher saved successfully";
			String expMessage2= ": 1";
			
			String actMessage = checkValidationMessage(expMessage1);
			
		   System.out.println("************************************* checkSavingPurchaseVoucherN1WithAuthorizationModeAskRemarksOnRejectionOption  *********************************");
		   
		   System.out.println("SavingMessage  :  "+actMessage +" Value Expected : "+expMessage1+" "+expMessage2);
	
		   if(actMessage.startsWith(expMessage1) && actMessage.endsWith(expMessage2))
    		{
    			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
    			new_CloseBtn.click();
    			Thread.sleep(2000);
    			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
    			homeCloseBtn.click();
    			Thread.sleep(2000);
    			return true;
    		}
    		else
    		{
    			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
    			new_CloseBtn.click();
    			Thread.sleep(2000);
    			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
    			homeCloseBtn.click();
    			Thread.sleep(2000);
    			return false;
    		}
    	}
		
		
		
		
		
		
		
		public static boolean checkLogoutAndLoginWithUserAllOptionsWithAuthorizationModeAskRemarksOnRejectionOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
    	{
    		
    		
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplayLogo));
    		userNameDisplayLogo.click();
   		
   	     	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
   	     	logoutOption.click();

   	     	Thread.sleep(3000);
    		
    		LoginPage lp=new LoginPage(getDriver()); 
    		
    	    String unamelt="UserAllOptions";
    	  
    	    String pawslt="12345";
    	      
    	    lp.enterUserName(unamelt);
    	    
    	    lp.enterPassword(pawslt);
    	    
    	    lp.clickOnSignInBtn();
    	    
    	    //checkRefershPopOnlogin();
    	    
    	    //checkPopUpWindow();
    	  
    		Thread.sleep(7000);

    		String actUserInfo=userNameDisplay.getText();
    		
    		System.out.println("User Info  : "+actUserInfo);
    		
    		System.out.println("User Info Capture Text  :  "+userNameDisplay.getText());
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(companyLogo));
    		companyLogo.click();
    		
    		String getCompanyTxt=companyName.getText();
    		String getLoginCompanyName=getCompanyTxt.substring(0, 19);
    		System.out.println("company name  :  "+ getLoginCompanyName);
    		companyLogo.click();
    		
    		boolean actDashboard = dashboard.isDisplayed();
    		
    		
    		String expUserInfo           ="UserAllOptions";
    		String expLoginCompanyName   ="Automation";
    		boolean expDashboard = true;

    		if (actUserInfo.equalsIgnoreCase(expUserInfo) && getLoginCompanyName.contains(expLoginCompanyName) && actDashboard==expDashboard) 
    		{
				return true;
			}
    		else
    		{
    			return false;
			}
    	}
		
		
		
		
		
		
		
		
		public static boolean checkPurchasesVoucherNAuthorizationStatusWithUserAllOptionsWithAuthorizationModeAskRemarksOnRejectionOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
			financialsMenu.click();
					
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
			financialsTransactionMenu.click();
				
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
			financialsTransactionsPurchaseMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVoucherNew));
			purchaseVoucherNew.click();
			
			Thread.sleep(3000);
			
			int voucherGridDocNoCount = voucherGridDocNo.size();
			
			String actStatusRow1 = null;
			
			System.out.println("Size  : "+voucherGridDocNoCount);
			
			for (int i = 0; i < voucherGridDocNoCount; i++) 
			{
				String data = voucherGridDocNo.get(i).getText();
				
				if (data.equalsIgnoreCase("1")) 
				{
					 actStatusRow1 =  voucherGridAuthorizationStatus.get(i).getText();
				}
			}
			
			String expStatusRow1 = "Pending";
			
			Thread.sleep(2000);
			
			click(homePageVoucherArrowBtn);
			Thread.sleep(1000);

			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pendingAuthorizationPurchases));
			pendingAuthorizationPurchases.click();
			
			Thread.sleep(3000);
			
			for (int i = 0; i < voucherGridDocNoCount; i++) 
			{
				String data = voucherGridDocNo.get(i).getText();
				
				if (data.equalsIgnoreCase("1")) 
				{
					 voucherGridCheckBoxList.get(i).click();
				}
			}
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rejectBtn));
			rejectBtn.click();
			
			Thread.sleep(2000);
			
			boolean actRemarksPopup = authorizationRemarkPopup.isDisplayed();
			boolean expRemarksPopup = true;
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(authorizePopupOkBtn));
			authorizePopupOkBtn.click();
			
			Thread.sleep(2000);
			click(homePageVoucherArrowBtn);
			Thread.sleep(1000);

			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homePageAllVouchersView));
			homePageAllVouchersView.click();
			
			Thread.sleep(2000);
			
			String actAfterAuthorizeStatusRow1 = null;
			
			for (int i = 0; i < voucherGridDocNoCount; i++) 
			{
				String data = voucherGridDocNo.get(i).getText();
				
				if (data.equalsIgnoreCase("1")) 
				{
					 actAfterAuthorizeStatusRow1 =  voucherGridAuthorizationStatus.get(i).getText();
				}
			}
			
			String expAfterAuthorizeStatusRow1 = "Rejected";
			
			System.out.println("************************************* checkPurchasesVoucherNAuthorizationStatusWithUserAllOptionsWithAuthorizationModeAskRemarksOnRejectionOption  *********************************");
			
			System.out.println("StatusRow1               : "+actStatusRow1				+" Value Expected : "+expStatusRow1);
			System.out.println("RemarksPopup             : "+actRemarksPopup            +" Value Expected : "+expRemarksPopup);
			System.out.println("AfterAuthorizeStatusRow1 : "+actAfterAuthorizeStatusRow1+" Value Expected : "+expAfterAuthorizeStatusRow1);
			
			if(actStatusRow1.equalsIgnoreCase(expStatusRow1) && actRemarksPopup==expRemarksPopup && actAfterAuthorizeStatusRow1.equalsIgnoreCase(expAfterAuthorizeStatusRow1))
			{
				System.out.println("Test Pass : Authorized Succesfully");
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
				homeCloseBtn.click();
    			Thread.sleep(3000);
				//excelReader.setCellData(xlfile, "SmokeSalesOrder", 627, 9, resPass);
				return true;
			}
			else
			{
				System.out.println("Test Fail : NOT Authorized Succesfully");
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
				homeCloseBtn.click();
    			Thread.sleep(3000);
				//excelReader.setCellData(xlfile, "SmokeSalesOrder", 627, 9, resFail);
				return false;
			}
			
		}
			
	
		
		
		public static boolean checkLogoutAndLoginWithSUToCheckAuthorizationStatusWithAuthorizationModeAskRemarksOnRejectionOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
    	{
    		
    		
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplayLogo));
    		userNameDisplayLogo.click();
   		
   	     	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
   	     	logoutOption.click();

   	     	Thread.sleep(3000);
    		
    		LoginPage lp=new LoginPage(getDriver()); 
    		
    	    String unamelt="su";
    	  
    	    String pawslt="su";
    	      
    	    lp.enterUserName(unamelt);
    	    
    	    lp.enterPassword(pawslt);
    	    
    	    lp.clickOnSignInBtn();
    	    
    	    //checkRefershPopOnlogin();
    	    
    	    //checkPopUpWindow();
    	  
    		Thread.sleep(6000);

    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
			financialsMenu.click();
					
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
			financialsTransactionMenu.click();
				
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
			financialsTransactionsPurchaseMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVoucherNew));
			purchaseVoucherNew.click();
			
			Thread.sleep(3000);
			
			int voucherGridDocNoCount = voucherGridDocNo.size();
			
			String actStatusRow1 = null;
			
			System.out.println("Size  : "+voucherGridDocNoCount);
			
			for (int i = 0; i < voucherGridDocNoCount; i++) 
			{
				String data = voucherGridDocNo.get(i).getText();
				
				if (data.equalsIgnoreCase("1")) 
				{
					 actStatusRow1 =  voucherGridAuthorizationStatus.get(i).getText();
				}
			}
			
			String expStatusRow1 = "Rejected";
			
			System.out.println("************************************* checkLogoutAndLoginWithSUToCheckAuthorizationStatusWithAuthorizationModeAskRemarksOnRejectionOption  *********************************");
			
			System.out.println("StatusRow1 : "+actStatusRow1+" Value Expected : "+expStatusRow1);
			
			if(actStatusRow1.equalsIgnoreCase(expStatusRow1))
			{
				System.out.println("Test Pass : Suspended Succesfully");
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
				homeCloseBtn.click();
    			Thread.sleep(2000);
				//excelReader.setCellData(xlfile, "SmokeSalesOrder", 627, 9, resPass);
				return true;
			}
			else
			{
				System.out.println("Test Fail : NOT Suspended Succesfully");
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
				homeCloseBtn.click();
    			Thread.sleep(2000);
				//excelReader.setCellData(xlfile, "SmokeSalesOrder", 627, 9, resFail);
				return false;
			}
			
		}
		
		
		
		
		
		
		
		public boolean checkEraseAllTransactionsWithAuthorizationModeAskRemarksOnRejectionOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
			homeMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dataMangementMenu));
			dataMangementMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(eraseAll));
			eraseAll.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(eraseTranscationsRadio));
			eraseTranscationsRadio.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(eraseAllOkBtn));
			eraseAllOkBtn.click();
			
			if(getIsAlertPresent())
			{
				getWaitForAlert();
				
				getAlert().accept();
			}
			
    		String expValidationMsg="Data deleted successfully.";
    		
    		String actValidationMsg=checkValidationMessage(expValidationMsg);
			
			System.out.println("************************************* checkEraseAllTransactionsWithAuthorizationModeAskRemarksOnRejectionOption  *********************************");
			System.out.println("Message  :  "+actValidationMsg +" Value Expected : "+expValidationMsg);
			
			if (actValidationMsg.equalsIgnoreCase(expValidationMsg))
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
				sl_CloseBtn.click();
				return true;
			}
			else
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
				sl_CloseBtn.click();
				return false;
			}
		}
		
		
		
		
		
		
		
		
		
		// Make Rejection Remarks Mandatory
		
		public boolean 	checkWithConditionMakeRejectionRemarksMandatoryInTransactionAuthorizationConditionTab() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
    	{
    		
    		
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsmenuBtn));
    		settingsmenuBtn.click();
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(transactionAuthorizationBtn));
    		transactionAuthorizationBtn.click();
    		
    		Thread.sleep(2000);
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNameDropdown));
    		documentNameDropdown.sendKeys(" ");
    		
    		Thread.sleep(1000);
    			
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchasevoucherExpandbutton));
    		purchasevoucherExpandbutton.click();
    	
            getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchasevoucherTypeCreatedVoucher));
    		purchasevoucherTypeCreatedVoucher.click();
    		
    		Thread.sleep(3000);
    				
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
    		nameTxt.click();
    		
    		nameTxt.sendKeys(Keys.SPACE);
    		
    		int namecount=tranAuthNameList.size();
			
			for(int i=0 ; i < namecount ;i++)
			{
				String data=tranAuthNameList.get(i).getText();
				
				if(data.equalsIgnoreCase("Purchase"))
				{
					tranAuthNameList.get(i).click();
					
					break;
				}
			}
				
    		nameTxt.sendKeys(Keys.TAB);
    			
    		Thread.sleep(3000);
    		
    		click(cnrBtn);
    		Thread.sleep(1000);
    		
    		ClickUsingJs(Level1editBtn);
    		Thread.sleep(1000);
    		
    		//getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(Level1editBtn));
    		//Level1editBtn.click();
    		
    		Thread.sleep(3000);
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(keepUnpostedReferencesChkBox));
    		((JavascriptExecutor)getDriver()).executeScript("arguments[0].scrollIntoView();", keepUnpostedReferencesChkBox);
    		
    		Thread.sleep(2000);
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(makeRejectionRemarksMandatoryChkBox));
    		makeRejectionRemarksMandatoryChkBox.click();
    		
    		Thread.sleep(2000);
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(definitionOkBtn));
    		definitionOkBtn.click();
    		
    		Thread.sleep(2000);
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(tranAuthSaveBtn));
    		tranAuthSaveBtn.click();
    		
    		String expValidationMsg="Authorization Flow saved successfully.";
    		
    		String actValidationMsg=checkValidationMessage(expValidationMsg);
    				
    		System.out.println("Validation Message : "+actValidationMsg+"  Value Expected : "+"True");
    		
    		if(actValidationMsg.equalsIgnoreCase(expValidationMsg))
    		{
    			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(tranAuthCancelBtn));
    			tranAuthCancelBtn.click();
    			return true;
    		}
    		else
    		{
    			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(tranAuthCancelBtn));
    			tranAuthCancelBtn.click();
    			return false;
    		}
    	}
		
		
		
		
		
		
		
		
		public static boolean checkSavingPurchaseVoucherN1WithAuthorizationModeMakeRejectionRemarksMandatoryOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
			financialsMenu.click();
					
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
			financialsTransactionMenu.click();
				
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
			financialsTransactionsPurchaseMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVoucherNew));
			purchaseVoucherNew.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
			newBtn.click();
			
			checkValidationMessage("Screen opened");
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseAccountTxt));
			purchaseAccountTxt.click();
			purchaseAccountTxt.sendKeys("Purchase");
			
			Thread.sleep(2000);
			
			purchaseAccountTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
			vendorAccountTxt.click();
			vendorAccountTxt.sendKeys("Vendor A");
			
			Thread.sleep(2000);
			
			vendorAccountTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
			departmentTxt.click();
			departmentTxt.sendKeys("INDIA");
			
			Thread.sleep(2000);
			
			departmentTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(wareHouseTxt));
			wareHouseTxt.click();
			wareHouseTxt.sendKeys("HYDERABAD");
			
			Thread.sleep(2000);
			
			wareHouseTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
			select1stRow_1stColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
			enter_ItemTxt.sendKeys("STD RATE COGS ITEM");
			Thread.sleep(3000);
			enter_ItemTxt.sendKeys(Keys.TAB);
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_5thColumn));
			select1stRow_5thColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
			enter_Quantity.sendKeys("1");
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_7thColumn));
			select1stRow_7thColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
			enter_Rate.sendKeys(Keys.END);
			enter_Rate.sendKeys(Keys.SHIFT, Keys.HOME);
			enter_Rate.sendKeys(Keys.BACK_SPACE);
			enter_Rate.sendKeys("10");
			enter_Rate.sendKeys(Keys.TAB);
			
			Thread.sleep(2000);
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
			saveBtn.click();
			
			Thread.sleep(3000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
			billRefPickIcon.click();
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
			billRefOkBtn.click();
			
			String expMessage1= "Voucher saved successfully";
			String expMessage2= ": 1";
			
			String actMessage = checkValidationMessage(expMessage1);
			
		   System.out.println("************************************* checkSavingPurchaseVoucherN1WithAuthorizationModeMakeRejectionRemarksMandatoryOption  *********************************");
		   
		   System.out.println("SavingMessage  :  "+actMessage +" Value Expected : "+expMessage1+" "+expMessage2);
	
		   if(actMessage.startsWith(expMessage1) && actMessage.endsWith(expMessage2))
    		{
    			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
    			new_CloseBtn.click();
    			Thread.sleep(2000);
    			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
    			homeCloseBtn.click();
    			Thread.sleep(2000);
    			return true;
    		}
    		else
    		{
    			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
    			new_CloseBtn.click();
    			Thread.sleep(2000);
    			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
    			homeCloseBtn.click();
    			Thread.sleep(2000);
    			return false;
    		}
    	}
		
		
		
		
		
		
		
		public static boolean checkLogoutAndLoginWithUserAllOptionsWithAuthorizationModeMakeRejectionRemarksMandatoryOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
    	{
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplayLogo));
    		userNameDisplayLogo.click();
   		
   	     	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
   	     	logoutOption.click();

   	     	Thread.sleep(3000);
    		
    		LoginPage lp=new LoginPage(getDriver()); 
    		
    	    String unamelt="UserAllOptions";
    	  
    	    String pawslt="12345";
    	      
    	    lp.enterUserName(unamelt);
    	    
    	    lp.enterPassword(pawslt);
    	    
    	    lp.clickOnSignInBtn();
    	    
    	    //checkRefershPopOnlogin();
    	    
    	    //checkPopUpWindow();
    	  
    		Thread.sleep(7000);

    		String actUserInfo=userNameDisplay.getText();
    		
    		System.out.println("User Info  : "+actUserInfo);
    		
    		System.out.println("User Info Capture Text  :  "+userNameDisplay.getText());
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(companyLogo));
    		companyLogo.click();
    		
    		String getCompanyTxt=companyName.getText();
    		String getLoginCompanyName=getCompanyTxt.substring(0, 19);
    		System.out.println("company name  :  "+ getLoginCompanyName);
    		companyLogo.click();
    		
    		boolean actDashboard = dashboard.isDisplayed();
    		
    		String expUserInfo           ="UserAllOptions";
    		String expLoginCompanyName   ="Automation";
    		boolean expDashboard = true;

    		if (actUserInfo.equalsIgnoreCase(expUserInfo) && getLoginCompanyName.contains(expLoginCompanyName) && actDashboard==expDashboard) 
    		{
				return true;
			}
    		else
    		{
    			return false;
			}
    	}
		
		
		
		
		
		
		
		
		public static boolean checkPurchasesVoucherNAuthorizationStatusWithUserAllOptionsWithAuthorizationModeMakeRejectionRemarksMandatoryOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
			financialsMenu.click();
					
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
			financialsTransactionMenu.click();
				
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
			financialsTransactionsPurchaseMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVoucherNew));
			purchaseVoucherNew.click();
			
			Thread.sleep(3000);
			
			int voucherGridDocNoCount = voucherGridDocNo.size();
			
			String actStatusRow1 = null;
			
			System.out.println("Size  : "+voucherGridDocNoCount);
			
			for (int i = 0; i < voucherGridDocNoCount; i++) 
			{
				String data = voucherGridDocNo.get(i).getText();
				
				if (data.equalsIgnoreCase("1")) 
				{
					 actStatusRow1 =  voucherGridAuthorizationStatus.get(i).getText();
				}
			}
			
			String expStatusRow1 = "Pending";
			
			Thread.sleep(2000);
			
			click(homePageVoucherArrowBtn);
			Thread.sleep(1000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pendingAuthorizationPurchases));
			pendingAuthorizationPurchases.click();
			
			Thread.sleep(3000);
			
			for (int i = 0; i < voucherGridDocNoCount; i++) 
			{
				String data = voucherGridDocNo.get(i).getText();
				
				if (data.equalsIgnoreCase("1")) 
				{
					 voucherGridCheckBoxList.get(i).click();
				}
			}
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rejectBtn));
			rejectBtn.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(authorizationRemarkPopup));
			boolean actRemarksPopup = authorizationRemarkPopup.isDisplayed();
			boolean expRemarksPopup = true;
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(authorizePopupOkBtn));
			authorizePopupOkBtn.click();
			
			String expMandatoryMsg = "Remark is mandatory.";
			
			String actMandatoryMsg = checkValidationMessage(expMandatoryMsg);
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(authorizePopupTextArea));
			authorizePopupTextArea.click();
			authorizePopupTextArea.sendKeys("Make Rejection Remarks Mandatory");
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(authorizePopupOkBtn));
			authorizePopupOkBtn.click();
			
			Thread.sleep(2000);
			
			click(homePageVoucherArrowBtn);
			Thread.sleep(1000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homePageAllVouchersView));
			homePageAllVouchersView.click();
			
			Thread.sleep(2000);
			
			String actAfterAuthorizeStatusRow1 = null;
			
			for (int i = 0; i < voucherGridDocNoCount; i++) 
			{
				String data = voucherGridDocNo.get(i).getText();
				
				if (data.equalsIgnoreCase("1")) 
				{
					 actAfterAuthorizeStatusRow1 =  voucherGridAuthorizationStatus.get(i).getText();
				}
			}
			
			String expAfterAuthorizeStatusRow1 = "Rejected";
			
			System.out.println("************************************* checkPurchasesVoucherNAuthorizationStatusWithUserAllOptionsWithAuthorizationModeMakeRejectionRemarksMandatoryOption  *********************************");
			
			System.out.println("StatusRow1               : "+actStatusRow1				+" Value Expected : "+expStatusRow1);
			System.out.println("RemarksPopup             : "+actRemarksPopup            +" Value Expected : "+expRemarksPopup);
			System.out.println("MandatoryMsg             : "+actMandatoryMsg            +" Value Expected : "+expMandatoryMsg);
			System.out.println("AfterAuthorizeStatusRow1 : "+actAfterAuthorizeStatusRow1+" Value Expected : "+expAfterAuthorizeStatusRow1);
			
			if(actStatusRow1.equalsIgnoreCase(expStatusRow1) && actRemarksPopup==expRemarksPopup && actMandatoryMsg.equalsIgnoreCase(expMandatoryMsg) 
				&& actAfterAuthorizeStatusRow1.equalsIgnoreCase(expAfterAuthorizeStatusRow1))
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
				homeCloseBtn.click();
				return true;
			}
			else
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
				homeCloseBtn.click();
				return false;
			}
		}
			
	
		
		
		
		
		
		
		public static boolean checkLogoutAndLoginWithSUToCheckAuthorizationStatusWithAuthorizationModeMakeRejectionRemarksMandatoryOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
    	{
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplayLogo));
    		userNameDisplayLogo.click();
   		
   	     	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
   	     	logoutOption.click();

   	     	Thread.sleep(3000);
    		
    		LoginPage lp=new LoginPage(getDriver()); 
    		
    	    String unamelt="su";
    	  
    	    String pawslt="su";
    	      
    	    lp.enterUserName(unamelt);
    	    
    	    lp.enterPassword(pawslt);
    	    
    	    lp.clickOnSignInBtn();
    	    
    	    //checkRefershPopOnlogin();
    	    
    	    //checkPopUpWindow();
    	  
    		Thread.sleep(6000);

    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
			financialsMenu.click();
					
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
			financialsTransactionMenu.click();
				
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
			financialsTransactionsPurchaseMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVoucherNew));
			purchaseVoucherNew.click();
			
			Thread.sleep(3000);
			
			int voucherGridDocNoCount = voucherGridDocNo.size();
			
			String actStatusRow1 = null;
			
			System.out.println("Size  : "+voucherGridDocNoCount);
			
			for (int i = 0; i < voucherGridDocNoCount; i++) 
			{
				String data = voucherGridDocNo.get(i).getText();
				
				if (data.equalsIgnoreCase("1")) 
				{
					 actStatusRow1 =  voucherGridAuthorizationStatus.get(i).getText();
				}
			}
			
			String expStatusRow1 = "Rejected";
			
			System.out.println("************************************* checkLogoutAndLoginWithSUToCheckAuthorizationStatusWithAuthorizationModeMakeRejectionRemarksMandatoryOption  *********************************");
			
			System.out.println("StatusRow1 : "+actStatusRow1+" Value Expected : "+expStatusRow1);
			
			if(actStatusRow1.equalsIgnoreCase(expStatusRow1))
			{
				System.out.println("Test Pass : Suspended Succesfully");
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
				homeCloseBtn.click();
    			Thread.sleep(2000);
				//excelReader.setCellData(xlfile, "SmokeSalesOrder", 627, 9, resPass);
				return true;
			}
			else
			{
				System.out.println("Test Fail : NOT Suspended Succesfully");
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
				homeCloseBtn.click();
    			Thread.sleep(2000);
				//excelReader.setCellData(xlfile, "SmokeSalesOrder", 627, 9, resFail);
				return false;
			}
			
		}
		
		
		
		
		
		
		
		public boolean checkEraseAllTransactionsWithAuthorizationModeMakeRejectionRemarksMandatoryOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
			homeMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dataMangementMenu));
			dataMangementMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(eraseAll));
			eraseAll.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(eraseTranscationsRadio));
			eraseTranscationsRadio.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(eraseAllOkBtn));
			eraseAllOkBtn.click();
			
			if(getIsAlertPresent())
			{
				getWaitForAlert();
				
				getAlert().accept();
			}
			
    		String expValidationMsg="Data deleted successfully.";
    		
    		String actValidationMsg=checkValidationMessage(expValidationMsg);
			
			System.out.println("************************************* checkEraseAllTransactionsWithAuthorizationModeMakeRejectionRemarksMandatoryOption  *********************************");
			System.out.println("Message  :  "+actValidationMsg +" Value Expected : "+expValidationMsg);
			
			if (actValidationMsg.equalsIgnoreCase(expValidationMsg))
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
				sl_CloseBtn.click();
				return true;
			}
			else
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
				sl_CloseBtn.click();
				return false;
			}
		}
		
		
		
		
		
		
		
		
		
		// Undo Authorization on Editing 
		
		public static boolean checkSavingPurchaseVoucherN1WithOutUndoAuthorizationOnEditingAnyValueChangeOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
			financialsMenu.click();
					
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
			financialsTransactionMenu.click();
				
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
			financialsTransactionsPurchaseMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVoucherNew));
			purchaseVoucherNew.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
			newBtn.click();
			
			checkValidationMessage("Screen opened");
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseAccountTxt));
			purchaseAccountTxt.click();
			purchaseAccountTxt.sendKeys("Purchase");
			
			Thread.sleep(2000);
			
			purchaseAccountTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
			vendorAccountTxt.click();
			vendorAccountTxt.sendKeys("Vendor A");
			
			Thread.sleep(2000);
			
			vendorAccountTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
			departmentTxt.click();
			departmentTxt.sendKeys("INDIA");
			
			Thread.sleep(2000);
			
			departmentTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(wareHouseTxt));
			wareHouseTxt.click();
			wareHouseTxt.sendKeys("HYDERABAD");
			
			Thread.sleep(2000);
			
			wareHouseTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
			select1stRow_1stColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
			enter_ItemTxt.sendKeys("STD RATE COGS ITEM");
			Thread.sleep(3000);
			enter_ItemTxt.sendKeys(Keys.TAB);
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_5thColumn));
			select1stRow_5thColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
			enter_Quantity.sendKeys("1");
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_7thColumn));
			select1stRow_7thColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
			enter_Rate.sendKeys(Keys.END);
			enter_Rate.sendKeys(Keys.SHIFT, Keys.HOME);
			enter_Rate.sendKeys(Keys.BACK_SPACE);
			enter_Rate.sendKeys("10");
			enter_Rate.sendKeys(Keys.TAB);
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
			saveBtn.click();
			
			Thread.sleep(3000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
			billRefPickIcon.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
			billRefOkBtn.click();
			
			String expMessage1= "Voucher saved successfully";
			String expMessage2= ": 1";
			
			String actMessage = checkValidationMessage(expMessage1);
			
		   System.out.println("************************************* checkSavingPurchaseVoucherN1WithOutUndoAuthorizationOnEditingAnyValueChangeOption  *********************************");
		   
		   System.out.println("SavingMessage  :  "+actMessage +" Value Expected : "+expMessage1+" "+expMessage2);
	
		   if(actMessage.startsWith(expMessage1) && actMessage.endsWith(expMessage2))
    		{
    			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
    			new_CloseBtn.click();
    			Thread.sleep(2000);
    			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
    			homeCloseBtn.click();
    			Thread.sleep(2000);
    			return true;
    		}
    		else
    		{
    			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
    			new_CloseBtn.click();
    			Thread.sleep(2000);
    			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
    			homeCloseBtn.click();
    			Thread.sleep(2000);
    			return false;
    		}
    	}
		
		
		
		


		
		public static boolean checkLogoutAndLoginWithUserAllOptionsWithOutUndoAuthorizationOnEditingAnyValueChangeOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
    	{
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplayLogo));
    		userNameDisplayLogo.click();
   		
   	     	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
   	     	logoutOption.click();

   	     	Thread.sleep(3000);
    		
    		LoginPage lp=new LoginPage(getDriver()); 
    		
    	    String unamelt="UserAllOptions";
    	  
    	    String pawslt="12345";
    	      
    	    lp.enterUserName(unamelt);
    	    
    	    lp.enterPassword(pawslt);
    	    
    	    lp.clickOnSignInBtn();
    	    
    	    //checkRefershPopOnlogin();
    	    
    	    //checkPopUpWindow();
    	  
    		Thread.sleep(7000);

    		String actUserInfo=userNameDisplay.getText();
    		
    		System.out.println("User Info  : "+actUserInfo);
    		
    		System.out.println("User Info Capture Text  :  "+userNameDisplay.getText());
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(companyLogo));
    		companyLogo.click();
    		
    		String getCompanyTxt=companyName.getText();
    		String getLoginCompanyName=getCompanyTxt.substring(0, 19);
    		System.out.println("company name  :  "+ getLoginCompanyName);
    		companyLogo.click();
    		
    		boolean actDashboard = dashboard.isDisplayed();
    		
    		
    		String expUserInfo           ="UserAllOptions";
    		String expLoginCompanyName   ="Automation";
    		boolean expDashboard = true;

    		if (actUserInfo.equalsIgnoreCase(expUserInfo) && getLoginCompanyName.contains(expLoginCompanyName) && actDashboard==expDashboard) 
    		{
				return true;
			}
    		else
    		{
    			return false;
			}
    	}
		
		
		
		
		
		
		
		
		public static boolean checkPurchasesVoucherNAuthorizationStatusWithUserAllOptionsWithOutUndoAuthorizationOnEditingAnyValueChangeOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
			financialsMenu.click();
					
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
			financialsTransactionMenu.click();
				
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
			financialsTransactionsPurchaseMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVoucherNew));
			purchaseVoucherNew.click();
			
			Thread.sleep(3000);
			
			int voucherGridDocNoCount = voucherGridDocNo.size();
			
			String actStatusRow1 = null;
			
			System.out.println("Size  : "+voucherGridDocNoCount);
			
			for (int i = 0; i < voucherGridDocNoCount; i++) 
			{
				String data = voucherGridDocNo.get(i).getText();
				
				if (data.equalsIgnoreCase("1")) 
				{
					 actStatusRow1 =  voucherGridAuthorizationStatus.get(i).getText();
				}
			}
			
			String expStatusRow1 = "Pending";
			
			Thread.sleep(2000);
			
			click(homePageVoucherArrowBtn);
			Thread.sleep(1000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pendingAuthorizationPurchases));
			pendingAuthorizationPurchases.click();
			
			Thread.sleep(2000);
			
			for (int i = 0; i < voucherGridDocNoCount; i++) 
			{
				String data = voucherGridDocNo.get(i).getText();
				
				if (data.equalsIgnoreCase("1")) 
				{
					 voucherGridCheckBoxList.get(i).click();
				}
			}
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(authorizeBtn));
			authorizeBtn.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(authorizationRemarkPopup));
			boolean actRemarksPopup = authorizationRemarkPopup.isDisplayed();
			boolean expRemarksPopup = true;
			
			Thread.sleep(2000);
			
			authorizePopupTextArea.sendKeys("Without Option");
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(authorizePopupOkBtn));
			authorizePopupOkBtn.click();
			
			Thread.sleep(2000);
			
			click(homePageVoucherArrowBtn);
			Thread.sleep(1000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homePageAllVouchersView));
			homePageAllVouchersView.click();
			
			Thread.sleep(2000);
			
			String actAfterAuthorizeStatusRow1 = null;
			
			for (int i = 0; i < voucherGridDocNoCount; i++) 
			{
				String data = voucherGridDocNo.get(i).getText();
				
				if (data.equalsIgnoreCase("1")) 
				{
					 actAfterAuthorizeStatusRow1 =  voucherGridAuthorizationStatus.get(i).getText();
				}
			}
			
			String expAfterAuthorizeStatusRow1 = "Authorized";
			
			System.out.println("************************************* checkPurchasesVoucherNAuthorizationStatusWithUserAllOptionsWithOutUndoAuthorizationOnEditingAnyValueChangeOption  *********************************");
			
			System.out.println("StatusRow1               : "+actStatusRow1				+" Value Expected : "+expStatusRow1);
			System.out.println("RemarksPopup             : "+actRemarksPopup            +" Value Expected : "+expRemarksPopup);
			System.out.println("AfterAuthorizeStatusRow1 : "+actAfterAuthorizeStatusRow1+" Value Expected : "+expAfterAuthorizeStatusRow1);
			
			if(actStatusRow1.equalsIgnoreCase(expStatusRow1) && actRemarksPopup==expRemarksPopup && actAfterAuthorizeStatusRow1.equalsIgnoreCase(expAfterAuthorizeStatusRow1))
			{
				System.out.println("Test Pass : Authorized Succesfully");
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
				homeCloseBtn.click();
    			Thread.sleep(3000);
				//excelReader.setCellData(xlfile, "SmokeSalesOrder", 627, 9, resPass);
				return true;
			}
			else
			{
				System.out.println("Test Fail : NOT Authorized Succesfully");
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
				homeCloseBtn.click();
    			Thread.sleep(3000);
				//excelReader.setCellData(xlfile, "SmokeSalesOrder", 627, 9, resFail);
				return false;
			}
			
		}
			
	
		
		
		public static boolean checkLogoutAndLoginWithSUToCheckAuthorizationStatusWithOutUndoAuthorizationOnEditingAnyValueChangeOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
    	{
    		
    		
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplayLogo));
    		userNameDisplayLogo.click();
   		
   	     	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
   	     	logoutOption.click();

   	     	Thread.sleep(3000);
    		
    		LoginPage lp=new LoginPage(getDriver()); 
    		
    	    String unamelt="su";
    	  
    	    String pawslt="su";
    	      
    	    lp.enterUserName(unamelt);
    	    
    	    lp.enterPassword(pawslt);
    	    
    	    lp.clickOnSignInBtn();
    	    
    	    //checkRefershPopOnlogin();
    	    
    	    //checkPopUpWindow();
    	  
    		Thread.sleep(6000);

    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
			financialsMenu.click();
					
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
			financialsTransactionMenu.click();
				
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
			financialsTransactionsPurchaseMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVoucherNew));
			purchaseVoucherNew.click();
			
			Thread.sleep(3000);
			
			int voucherGridDocNoCount = voucherGridDocNo.size();
			
			String actStatusRow1 = null;
			
			System.out.println("Size  : "+voucherGridDocNoCount);
			
			for (int i = 0; i < voucherGridDocNoCount; i++) 
			{
				String data = voucherGridDocNo.get(i).getText();
				
				if (data.equalsIgnoreCase("1")) 
				{
					 actStatusRow1 =  voucherGridAuthorizationStatus.get(i).getText();
				}
			}
			
			String expStatusRow1 = "Authorized";
			
			System.out.println("************************************* checkLogoutAndLoginWithSUToCheckAuthorizationStatusWithOutUndoAuthorizationOnEditingAnyValueChangeOption  *********************************");
			
			System.out.println("StatusRow1 : "+actStatusRow1+" Value Expected : "+expStatusRow1);
			
			if(actStatusRow1.equalsIgnoreCase(expStatusRow1))
			{
				System.out.println("Test Pass : Suspended Succesfully");
				//excelReader.setCellData(xlfile, "SmokeSalesOrder", 627, 9, resPass);
				return true;
			}
			else
			{
				System.out.println("Test Fail : NOT Suspended Succesfully");
				//excelReader.setCellData(xlfile, "SmokeSalesOrder", 627, 9, resFail);
				return false;
			}
		}
		
		
		
		
		
		
		
		
		
		public static boolean checkEditingPurchaseVoucherNWithOutUndoAuthorizationOnEditingAnyValueChangeOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
    	{
    		
    		
    		
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(grid_ChkBox1));
			getAction().doubleClick(grid_ChkBox1).build().perform();
			
			checkValidationMessage("Screen Opened");
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(narrationTxt));
			narrationTxt.sendKeys("Any value change (Including extra fields)");
			narrationTxt.sendKeys(Keys.TAB);
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
			saveBtn.click();
			
			Thread.sleep(3000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
			billRefPickIcon.click();
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
			billRefOkBtn.click();
			
			
			String expMessage1= "Voucher saved successfully";
			String expMessage2= ": 1";
			
			String actMessage = checkValidationMessage(expMessage1);
			
		   System.out.println("************************************* checkSavingPurchaseVoucherN1WithOutUndoAuthorizationOnEditingAnyValueChangeOption  *********************************");
		   
		   System.out.println("SavingMessage  :  "+actMessage +" Value Expected : "+expMessage1+" "+expMessage2);
	
		   if(actMessage.startsWith(expMessage1) && actMessage.endsWith(expMessage2))
			{
			    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
			    new_CloseBtn.click();
			    Thread.sleep(2000);
				return true;
			}
			else
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
			    new_CloseBtn.click();
			    Thread.sleep(2000);
				return false;
			}
		}
		
		
		
		
		
		
		
		public static boolean checkAuthorizationStatusAfterEditingWithOutUndoAuthorizationOnEditingAnyValueChangeOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
    	{
			int voucherGridDocNoCount = voucherGridDocNo.size();
			
			String actStatusRow1 = null;
			
			System.out.println("Size  : "+voucherGridDocNoCount);
			
			for (int i = 0; i < voucherGridDocNoCount; i++) 
			{
				String data = voucherGridDocNo.get(i).getText();
				
				if (data.equalsIgnoreCase("1")) 
				{
					 actStatusRow1 =  voucherGridAuthorizationStatus.get(i).getText();
				}
			}
			
			String expStatusRow1 = "Authorized";
			
			System.out.println("************************************* checkAuthorizationStatusAfterEditingWithOutUndoAuthorizationOnEditingAnyValueChangeOption  *********************************");
			
			System.out.println("StatusRow1 : "+actStatusRow1+" Value Expected : "+expStatusRow1);
			
			if(actStatusRow1.equalsIgnoreCase(expStatusRow1))
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
				homeCloseBtn.click();
				Thread.sleep(2000);
				//excelReader.setCellData(xlfile, "SmokeSalesOrder", 627, 9, resPass);
				return true;
			}
			else
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
				homeCloseBtn.click();
				Thread.sleep(2000);
				//excelReader.setCellData(xlfile, "SmokeSalesOrder", 627, 9, resFail);
				return false;
			}
		}
		
		
		
		
		
		
		
		
		public boolean checkEraseAllTransactionsWithOutUndoAuthorizationOnEditingAnyValueChangeOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
			homeMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dataMangementMenu));
			dataMangementMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(eraseAll));
			eraseAll.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(eraseTranscationsRadio));
			eraseTranscationsRadio.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(eraseAllOkBtn));
			eraseAllOkBtn.click();
			
			if(getIsAlertPresent())
			{
				getWaitForAlert();
				
				getAlert().accept();
			}
			
			
    		String expValidationMsg="Data deleted successfully.";
    		
    		String actValidationMsg=checkValidationMessage(expValidationMsg);
			
			
			System.out.println("************************************* checkEraseAllTransactionsWithOutAuthorizationModeAskRemarksOnRejectionOption  *********************************");
			System.out.println("Message  :  "+actValidationMsg +" Value Expected : "+expValidationMsg);
			
			if (actValidationMsg.equalsIgnoreCase(expValidationMsg))
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
				sl_CloseBtn.click();
				return true;
			}
			else
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
				sl_CloseBtn.click();
				return false;
			}
		}
		
		
		
		
		
		
		
		
		public boolean 	checkWithConditionUndoAuthorizationOnEditingAnyValueChangeInTransactionAuthorizationConditionTab() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
    	{
    		
    		
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsmenuBtn));
    		settingsmenuBtn.click();
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(transactionAuthorizationBtn));
    		transactionAuthorizationBtn.click();
    		
    		Thread.sleep(2000);
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNameDropdown));
    		documentNameDropdown.sendKeys(" ");
    		
    		Thread.sleep(1000);
    			
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchasevoucherExpandbutton));
    		purchasevoucherExpandbutton.click();
    	
            getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchasevoucherTypeCreatedVoucher));
    		purchasevoucherTypeCreatedVoucher.click();
    		
    		Thread.sleep(3000);
    				
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
    		nameTxt.click();
    		
    		nameTxt.sendKeys(Keys.SPACE);
    		
    		int namecount=tranAuthNameList.size();
			
			for(int i=0 ; i < namecount ;i++)
			{
				String data=tranAuthNameList.get(i).getText();
				
				if(data.equalsIgnoreCase("Purchase"))
				{
					tranAuthNameList.get(i).click();
					
					break;
				}
			}
				
    		nameTxt.sendKeys(Keys.TAB);
    			
    		Thread.sleep(3000);
    		
    		click(cnrBtn);
    		Thread.sleep(1000);
    		
    		ClickUsingJs(Level1editBtn);
    		Thread.sleep(1000);
    		
    		//getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(Level1editBtn));
    		//Level1editBtn.click();
    		
    		Thread.sleep(3000);
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(keepUnpostedReferencesChkBox));
    		((JavascriptExecutor)getDriver()).executeScript("arguments[0].scrollIntoView();", keepUnpostedReferencesChkBox);
    		
    		Thread.sleep(2000);
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(makeApprovalRemarksmandatoryChkBox));
    		makeApprovalRemarksmandatoryChkBox.click();
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(makeRejectionRemarksMandatoryChkBox));
    		makeRejectionRemarksMandatoryChkBox.click();
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(anyValueChangeChkBox));
    		anyValueChangeChkBox.click();
    		
    		Select undoAuthEditingDrpdwn = new Select(undoAuthorizationEditingDropdown);
    		undoAuthEditingDrpdwn.selectByVisibleText("Full");
    		
    		Thread.sleep(2000);
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(definitionOkBtn));
    		definitionOkBtn.click();
    		
    		Thread.sleep(2000);
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(tranAuthSaveBtn));
    		tranAuthSaveBtn.click();
    		
    		
    		String expValidationMsg = "Authorization Flow saved successfully.";
    		
    		String actValidationMsg = checkValidationMessage(expValidationMsg);
    				
    		System.out.println("Validation Message : "+actValidationMsg+"  Value Expected : "+expValidationMsg);
    		
    		if(actValidationMsg.equalsIgnoreCase(expValidationMsg))
    		{
    			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(tranAuthCancelBtn));
    			tranAuthCancelBtn.click();
    			return true;
    		}
    		else
    		{
    			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(tranAuthCancelBtn));
    			tranAuthCancelBtn.click();
    			return false;
    		}
    	}
		
		
		
		

		public static boolean checkSavingPurchaseVoucherN1WithUndoAuthorizationOnEditingAnyValueChangeOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
			financialsMenu.click();
					
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
			financialsTransactionMenu.click();
				
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
			financialsTransactionsPurchaseMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVoucherNew));
			purchaseVoucherNew.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
			newBtn.click();
			
			checkValidationMessage("Screen opened");
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseAccountTxt));
			purchaseAccountTxt.click();
			purchaseAccountTxt.sendKeys("Purchase");
			
			Thread.sleep(2000);
			
			purchaseAccountTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
			vendorAccountTxt.click();
			vendorAccountTxt.sendKeys("Vendor A");
			
			Thread.sleep(2000);
			
			vendorAccountTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
			departmentTxt.click();
			departmentTxt.sendKeys("INDIA");
			
			Thread.sleep(2000);
			
			departmentTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(wareHouseTxt));
			wareHouseTxt.click();
			wareHouseTxt.sendKeys("HYDERABAD");
			
			Thread.sleep(2000);
			
			wareHouseTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
			select1stRow_1stColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
			enter_ItemTxt.sendKeys("STD RATE COGS ITEM");
			Thread.sleep(3000);
			enter_ItemTxt.sendKeys(Keys.TAB);
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_5thColumn));
			select1stRow_5thColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
			enter_Quantity.sendKeys("1");
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_7thColumn));
			select1stRow_7thColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
			enter_Rate.sendKeys(Keys.END);
			enter_Rate.sendKeys(Keys.SHIFT, Keys.HOME);
			enter_Rate.sendKeys(Keys.BACK_SPACE);
			enter_Rate.sendKeys("10");
			enter_Rate.sendKeys(Keys.TAB);
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
			saveBtn.click();
			
			Thread.sleep(3000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
			billRefPickIcon.click();
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
			billRefOkBtn.click();
			
			
			String expMessage1= "Voucher saved successfully";
			String expMessage2= ": 1";
			
			String actMessage = checkValidationMessage(expMessage1);

			System.out.println("************************************* checkSavingPurchaseVoucherN1WithUndoAuthorizationOnEditingAnyValueChangeOption  *********************************");
		   
		   System.out.println("SavingMessage  :  "+actMessage +" Value Expected : "+expMessage1+" "+expMessage2);
	
		   if(actMessage.startsWith(expMessage1) && actMessage.endsWith(expMessage2))
    		{
    			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
    			new_CloseBtn.click();
    			Thread.sleep(2000);
    			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
    			homeCloseBtn.click();
    			Thread.sleep(2000);
    			return true;
    		}
    		else
    		{
    			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
    			new_CloseBtn.click();
    			Thread.sleep(2000);
    			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
    			homeCloseBtn.click();
    			Thread.sleep(2000);
    			return false;
    		}
    	}
		
		
		
		


		
		public static boolean checkLogoutAndLoginWithUserAllOptionsWithUndoAuthorizationOnEditingAnyValueChangeOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
    	{
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplayLogo));
    		userNameDisplayLogo.click();
   		
   	     	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
   	     	logoutOption.click();

   	     	Thread.sleep(3000);
    		
    		LoginPage lp=new LoginPage(getDriver()); 
    		
    	    String unamelt="UserAllOptions";
    	  
    	    String pawslt="12345";
    	      
    	    lp.enterUserName(unamelt);
    	    
    	    lp.enterPassword(pawslt);
    	    
    	    lp.clickOnSignInBtn();
    	    
    	    //checkRefershPopOnlogin();
    	    
    	    //checkPopUpWindow();
    	  
    		Thread.sleep(7000);

    		String actUserInfo=userNameDisplay.getText();
    		
    		System.out.println("User Info  : "+actUserInfo);
    		
    		System.out.println("User Info Capture Text  :  "+userNameDisplay.getText());
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(companyLogo));
    		companyLogo.click();
    		
    		String getCompanyTxt=companyName.getText();
    		String getLoginCompanyName=getCompanyTxt.substring(0, 19);
    		System.out.println("company name  :  "+ getLoginCompanyName);
    		companyLogo.click();
    		
    		boolean actDashboard = dashboard.isDisplayed();
    		
    		
    		String expUserInfo           ="UserAllOptions";
    		String expLoginCompanyName   ="Automation";
    		boolean expDashboard = true;

    		if (actUserInfo.equalsIgnoreCase(expUserInfo) && getLoginCompanyName.contains(expLoginCompanyName) && actDashboard==expDashboard) 
    		{
				return true;
			}
    		else
    		{
    			return false;
			}
    	}
		
		
		
		
		
		
		
		
		public static boolean checkPurchasesVoucherNAuthorizationStatusWithUserAllOptionsWithUndoAuthorizationOnEditingAnyValueChangeOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
			financialsMenu.click();
					
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
			financialsTransactionMenu.click();
				
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
			financialsTransactionsPurchaseMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVoucherNew));
			purchaseVoucherNew.click();
			
			Thread.sleep(3000);
			
			int voucherGridDocNoCount = voucherGridDocNo.size();
			
			String actStatusRow1 = null;
			
			System.out.println("Size  : "+voucherGridDocNoCount);
			
			for (int i = 0; i < voucherGridDocNoCount; i++) 
			{
				String data = voucherGridDocNo.get(i).getText();
				
				if (data.equalsIgnoreCase("1")) 
				{
					 actStatusRow1 =  voucherGridAuthorizationStatus.get(i).getText();
				}
			}
			
			String expStatusRow1 = "Pending";
			
			Thread.sleep(2000);
			
			click(homePageVoucherArrowBtn);
			Thread.sleep(1000);

			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pendingAuthorizationPurchases));
			pendingAuthorizationPurchases.click();
			
			Thread.sleep(2000);
			
			for (int i = 0; i < voucherGridDocNoCount; i++) 
			{
				String data = voucherGridDocNo.get(i).getText();
				
				if (data.equalsIgnoreCase("1")) 
				{
					 voucherGridCheckBoxList.get(i).click();
				}
			}
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(authorizeBtn));
			authorizeBtn.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(authorizationRemarkPopup));
			boolean actRemarksPopup = authorizationRemarkPopup.isDisplayed();
			boolean expRemarksPopup = true;
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(authorizePopupOkBtn));
			authorizePopupOkBtn.click();
			
			Thread.sleep(2000);
			
			click(homePageVoucherArrowBtn);
			Thread.sleep(1000);

			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homePageAllVouchersView));
			homePageAllVouchersView.click();
			
			Thread.sleep(2000);
			
			String actAfterAuthorizeStatusRow1 = null;
			
			for (int i = 0; i < voucherGridDocNoCount; i++) 
			{
				String data = voucherGridDocNo.get(i).getText();
				
				if (data.equalsIgnoreCase("1")) 
				{
					 actAfterAuthorizeStatusRow1 =  voucherGridAuthorizationStatus.get(i).getText();
				}
			}
			
			String expAfterAuthorizeStatusRow1 = "Authorized";
			
			System.out.println("************************************* checkPurchasesVoucherNAuthorizationStatusWithUserAllOptionsWithUndoAuthorizationOnEditingAnyValueChangeOption  *********************************");
			
			System.out.println("StatusRow1               : "+actStatusRow1				+" Value Expected : "+expStatusRow1);
			System.out.println("RemarksPopup             : "+actRemarksPopup            +" Value Expected : "+expRemarksPopup);
			System.out.println("AfterAuthorizeStatusRow1 : "+actAfterAuthorizeStatusRow1+" Value Expected : "+expAfterAuthorizeStatusRow1);
			
			if(actStatusRow1.equalsIgnoreCase(expStatusRow1) && actRemarksPopup==expRemarksPopup && actAfterAuthorizeStatusRow1.equalsIgnoreCase(expAfterAuthorizeStatusRow1))
			{
				System.out.println("Test Pass : Authorized Succesfully");
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
				homeCloseBtn.click();
    			Thread.sleep(3000);
				//excelReader.setCellData(xlfile, "SmokeSalesOrder", 627, 9, resPass);
				return true;
			}
			else
			{
				System.out.println("Test Fail : NOT Authorized Succesfully");
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
				homeCloseBtn.click();
    			Thread.sleep(3000);
				//excelReader.setCellData(xlfile, "SmokeSalesOrder", 627, 9, resFail);
				return false;
			}
			
		}
			
	
		
		
		public static boolean checkLogoutAndLoginWithSUToCheckAuthorizationStatusWithUndoAuthorizationOnEditingAnyValueChangeOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
    	{
    		
    		
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplayLogo));
    		userNameDisplayLogo.click();
   		
   	     	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
   	     	logoutOption.click();

   	     	Thread.sleep(3000);
    		
    		LoginPage lp=new LoginPage(getDriver()); 
    		
    	    String unamelt="su";
    	  
    	    String pawslt="su";
    	      
    	    lp.enterUserName(unamelt);
    	    
    	    lp.enterPassword(pawslt);
    	    
    	    lp.clickOnSignInBtn();
    	    
    	    //checkRefershPopOnlogin();
    	    
    	    //checkPopUpWindow();
    	  
    		Thread.sleep(6000);

    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
			financialsMenu.click();
					
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
			financialsTransactionMenu.click();
				
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
			financialsTransactionsPurchaseMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVoucherNew));
			purchaseVoucherNew.click();
			
			Thread.sleep(3000);
			
			int voucherGridDocNoCount = voucherGridDocNo.size();
			
			String actStatusRow1 = null;
			
			System.out.println("Size  : "+voucherGridDocNoCount);
			
			for (int i = 0; i < voucherGridDocNoCount; i++) 
			{
				String data = voucherGridDocNo.get(i).getText();
				
				if (data.equalsIgnoreCase("1")) 
				{
					 actStatusRow1 =  voucherGridAuthorizationStatus.get(i).getText();
				}
			}
			
			String expStatusRow1 = "Authorized";
			
			System.out.println("************************************* checkLogoutAndLoginWithSUToCheckAuthorizationStatusWithUndoAuthorizationOnEditingAnyValueChangeOption  *********************************");
			
			System.out.println("StatusRow1 : "+actStatusRow1+" Value Expected : "+expStatusRow1);
			
			if(actStatusRow1.equalsIgnoreCase(expStatusRow1))
			{
				System.out.println("Test Pass : Suspended Succesfully");
				//excelReader.setCellData(xlfile, "SmokeSalesOrder", 627, 9, resPass);
				return true;
			}
			else
			{
				System.out.println("Test Fail : NOT Suspended Succesfully");
				//excelReader.setCellData(xlfile, "SmokeSalesOrder", 627, 9, resFail);
				return false;
			}
		}
		
		
		
		
		
		
		
		
		
		public static boolean checkEditingPurchaseVoucherNWithUndoAuthorizationOnEditingAnyValueChangeOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
    	{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(grid_ChkBox1));
			getAction().doubleClick(grid_ChkBox1).build().perform();
			
			checkValidationMessage("Screen Opened");
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(narrationTxt));
			narrationTxt.sendKeys("Any value change (Including extra fields)");
			narrationTxt.sendKeys(Keys.TAB);
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
			saveBtn.click();
			
			Thread.sleep(3000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
			billRefPickIcon.click();
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
			billRefOkBtn.click();
			
			
			String expMessage1= "Voucher saved successfully";
			String expMessage2= ": 1";
			
			String actMessage = checkValidationMessage(expMessage1);
			
		   System.out.println("************************************* checkSavingPurchaseVoucherN1WithUndoAuthorizationOnEditingAnyValueChangeOption  *********************************");
		   
		   System.out.println("SavingMessage  :  "+actMessage +" Value Expected : "+expMessage1+" "+expMessage2);
	
		   if(actMessage.startsWith(expMessage1) && actMessage.endsWith(expMessage2))
			{
			    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
			    new_CloseBtn.click();
				return true;
			}
			else
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
			    new_CloseBtn.click();
				return false;
			}
		}
		
		
		
		
		
		
		
		public static boolean checkAuthorizationStatusAfterEditingWithUndoAuthorizationOnEditingAnyValueChangeOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
    	{
			Thread.sleep(2000);
			
			int voucherGridDocNoCount = voucherGridDocNo.size();
			
			String actStatusRow1 = null;
			
			System.out.println("Size  : "+voucherGridDocNoCount);
			
			for (int i = 0; i < voucherGridDocNoCount; i++) 
			{
				String data = voucherGridDocNo.get(i).getText();
				
				if (data.equalsIgnoreCase("1")) 
				{
					 actStatusRow1 =  voucherGridAuthorizationStatus.get(i).getText();
				}
			}
			
			String expStatusRow1 = "Pending";
			
			System.out.println("************************************* checkAuthorizationStatusAfterEditingWithUndoAuthorizationOnEditingAnyValueChangeOption  *********************************");
			
			System.out.println("StatusRow1 : "+actStatusRow1+" Value Expected : "+expStatusRow1);
			
			if(actStatusRow1.equalsIgnoreCase(expStatusRow1))
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
				homeCloseBtn.click();
				Thread.sleep(2000);
				//excelReader.setCellData(xlfile, "SmokeSalesOrder", 627, 9, resPass);
				return true;
			}
			else
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
				homeCloseBtn.click();
				Thread.sleep(2000);
				//excelReader.setCellData(xlfile, "SmokeSalesOrder", 627, 9, resFail);
				return false;
			}
		}
		
		
		
		
		
		
		
		
		public boolean checkEraseAllTransactionsWithUndoAuthorizationOnEditingAnyValueChangeOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
			homeMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dataMangementMenu));
			dataMangementMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(eraseAll));
			eraseAll.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(eraseTranscationsRadio));
			eraseTranscationsRadio.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(eraseAllOkBtn));
			eraseAllOkBtn.click();
			
			if(getIsAlertPresent())
			{
				getWaitForAlert();
				
				getAlert().accept();
			}
			
			
			String expValidationMsg="Data deleted successfully.";
			
			String actValidationMsg=checkValidationMessage(expValidationMsg);
			
			System.out.println("************************************* checkEraseAllTransactionsWithOutAuthorizationModeAskRemarksOnRejectionOption  *********************************");
			System.out.println("Message  :  "+actValidationMsg +" Value Expected : "+expValidationMsg);
			
			if (actValidationMsg.equalsIgnoreCase(expValidationMsg))
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
				sl_CloseBtn.click();
				return true;
			}
			else
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
				sl_CloseBtn.click();
				return false;
			}
		}
		
		
		
		
		
		
		
		
		
		// Amounts or quantity or any other numeric fields
		
		public boolean 	checkWithConditionUndoAuthorizationOnEditingAmountOrQuantityOrAnyOtherNumericFieldsInTransactionAuthorizationConditionTab() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
    	{
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsmenuBtn));
    		settingsmenuBtn.click();
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(transactionAuthorizationBtn));
    		transactionAuthorizationBtn.click();
    		
    		Thread.sleep(2000);
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNameDropdown));
    		documentNameDropdown.sendKeys(" ");
    		
    		Thread.sleep(1000);
    			
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchasevoucherExpandbutton));
    		purchasevoucherExpandbutton.click();
    	
            getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchasevoucherTypeCreatedVoucher));
    		purchasevoucherTypeCreatedVoucher.click();
    		
    		Thread.sleep(3000);
    				
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
    		nameTxt.click();
    		
    		nameTxt.sendKeys(Keys.SPACE);
    		
    		int namecount=tranAuthNameList.size();
			
			for(int i=0 ; i < namecount ;i++)
			{
				String data=tranAuthNameList.get(i).getText();
				
				if(data.equalsIgnoreCase("Purchase"))
				{
					tranAuthNameList.get(i).click();
					
					break;
				}
			}
				
    		nameTxt.sendKeys(Keys.TAB);
    			
    		Thread.sleep(3000);
    		
    		click(cnrBtn);
    		Thread.sleep(1000);
    		
    		ClickUsingJs(Level1editBtn);
    		Thread.sleep(1000);
    		
    		//getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(Level1editBtn));
    		//Level1editBtn.click();
    		
    		Thread.sleep(3000);
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(keepUnpostedReferencesChkBox));
    		((JavascriptExecutor)getDriver()).executeScript("arguments[0].scrollIntoView();", keepUnpostedReferencesChkBox);
    		
    		Thread.sleep(2000);
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(anyValueChangeChkBox));
    		anyValueChangeChkBox.click();
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(amountsOrQuantityOrNumericChkBox));
    		amountsOrQuantityOrNumericChkBox.click();
    		
    		Select undoAuthEditingDrpdwn = new Select(undoAuthorizationEditingDropdown);
    		undoAuthEditingDrpdwn.selectByVisibleText("Full");
    		
    		Thread.sleep(2000);
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(definitionOkBtn));
    		definitionOkBtn.click();
    		
    		Thread.sleep(2000);
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(tranAuthSaveBtn));
    		tranAuthSaveBtn.click();
    		
    		
    		String expValidationMsg = "Authorization Flow saved successfully.";
    		
    		String actValidationMsg = checkValidationMessage(expValidationMsg);
    				
    		System.out.println("Validation Message : "+actValidationMsg+"  Value Expected : "+expValidationMsg);
    		
    		if(actValidationMsg.equalsIgnoreCase(expValidationMsg))
    		{
    			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(tranAuthCancelBtn));
    			tranAuthCancelBtn.click();
    			return true;
    		}
    		else
    		{
    			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(tranAuthCancelBtn));
    			tranAuthCancelBtn.click();
    			return false;
    		}
    	}
		
		
		
		
		
		
		

		public static boolean checkSavingPurchaseVoucherN1WithUndoAuthorizationOnEditingAmountOrQuantityOrAnyOtherNumericFieldsOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
			financialsMenu.click();
					
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
			financialsTransactionMenu.click();
				
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
			financialsTransactionsPurchaseMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVoucherNew));
			purchaseVoucherNew.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
			newBtn.click();
			
			checkValidationMessage("Screen opened");
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseAccountTxt));
			purchaseAccountTxt.click();
			purchaseAccountTxt.sendKeys("Purchase");
			
			Thread.sleep(2000);
			
			purchaseAccountTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
			vendorAccountTxt.click();
			vendorAccountTxt.sendKeys("Vendor A");
			
			Thread.sleep(2000);
			
			vendorAccountTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
			departmentTxt.click();
			departmentTxt.sendKeys("INDIA");
			
			Thread.sleep(2000);
			
			departmentTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(wareHouseTxt));
			wareHouseTxt.click();
			wareHouseTxt.sendKeys("HYDERABAD");
			
			Thread.sleep(2000);
			
			wareHouseTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
			select1stRow_1stColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
			enter_ItemTxt.sendKeys("STD RATE COGS ITEM");
			Thread.sleep(3000);
			enter_ItemTxt.sendKeys(Keys.TAB);
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_5thColumn));
			select1stRow_5thColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
			enter_Quantity.sendKeys("10");
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_7thColumn));
			select1stRow_7thColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
			enter_Rate.sendKeys(Keys.END);
			enter_Rate.sendKeys(Keys.SHIFT, Keys.HOME);
			enter_Rate.sendKeys(Keys.BACK_SPACE);
			enter_Rate.sendKeys("10");
			enter_Rate.sendKeys(Keys.TAB);
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
			saveBtn.click();
			
			Thread.sleep(3000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
			billRefPickIcon.click();
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
			billRefOkBtn.click();
			
			
			String expMessage1= "Voucher saved successfully";
			String expMessage2= ": 1";
			
			String actMessage = checkValidationMessage(expMessage1);
			
		   System.out.println("************************************* checkSavingPurchaseVoucherN1WithUndoAuthorizationOnEditingAmountOrQuantityOrAnyOtherNumericFieldsOption  *********************************");
		   
		   System.out.println("SavingMessage  :  "+actMessage +" Value Expected : "+expMessage1+" "+expMessage2);
	
		   if(actMessage.startsWith(expMessage1) && actMessage.endsWith(expMessage2))
    		{
    			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
    			new_CloseBtn.click();
    			Thread.sleep(2000);
    			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
    			homeCloseBtn.click();
    			Thread.sleep(2000);
    			return true;
    		}
    		else
    		{
    			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
    			new_CloseBtn.click();
    			Thread.sleep(2000);
    			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
    			homeCloseBtn.click();
    			Thread.sleep(2000);
    			return false;
    		}
    	}
		
		
		
		

		

		
		public static boolean checkLogoutAndLoginWithUserAllOptionsWithUndoAuthorizationOnEditingAmountOrQuantityOrAnyOtherNumericFieldsOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
    	{
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplayLogo));
    		userNameDisplayLogo.click();
   		
   	     	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
   	     	logoutOption.click();

   	     	Thread.sleep(3000);
    		
    		LoginPage lp=new LoginPage(getDriver()); 
    		
    	    String unamelt="UserAllOptions";
    	  
    	    String pawslt="12345";
    	      
    	    lp.enterUserName(unamelt);
    	    
    	    lp.enterPassword(pawslt);
    	    
    	    lp.clickOnSignInBtn();
    	    
    	    //checkRefershPopOnlogin();
    	    
    	    //checkPopUpWindow();
    	  
    		Thread.sleep(7000);

    		String actUserInfo=userNameDisplay.getText();
    		
    		System.out.println("User Info  : "+actUserInfo);
    		
    		System.out.println("User Info Capture Text  :  "+userNameDisplay.getText());
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(companyLogo));
    		companyLogo.click();
    		
    		String getCompanyTxt=companyName.getText();
    		String getLoginCompanyName=getCompanyTxt.substring(0, 19);
    		System.out.println("company name  :  "+ getLoginCompanyName);
    		companyLogo.click();
    		
    		boolean actDashboard = dashboard.isDisplayed();
    		
    		
    		String expUserInfo           ="UserAllOptions";
    		String expLoginCompanyName   ="Automation";
    		boolean expDashboard = true;

    		if (actUserInfo.equalsIgnoreCase(expUserInfo) && getLoginCompanyName.contains(expLoginCompanyName) && actDashboard==expDashboard) 
    		{
				return true;
			}
    		else
    		{
    			return false;
			}
    	}
		
		
		
		
		
		
		
		
		public static boolean checkPurchasesVoucherNAuthorizationStatusWithUserAllOptionsWithUndoAuthorizationOnEditingAmountOrQuantityOrAnyOtherNumericFieldsOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
			financialsMenu.click();
					
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
			financialsTransactionMenu.click();
				
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
			financialsTransactionsPurchaseMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVoucherNew));
			purchaseVoucherNew.click();
			
			Thread.sleep(3000);
			
			int voucherGridDocNoCount = voucherGridDocNo.size();
			
			String actStatusRow1 = null;
			
			System.out.println("Size  : "+voucherGridDocNoCount);
			
			for (int i = 0; i < voucherGridDocNoCount; i++) 
			{
				String data = voucherGridDocNo.get(i).getText();
				
				if (data.equalsIgnoreCase("1")) 
				{
					 actStatusRow1 =  voucherGridAuthorizationStatus.get(i).getText();
				}
			}
			
			String expStatusRow1 = "Pending";
			
			Thread.sleep(2000);
			
			click(homePageVoucherArrowBtn);
			Thread.sleep(1000);

			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pendingAuthorizationPurchases));
			pendingAuthorizationPurchases.click();
			
			Thread.sleep(2000);
			
			for (int i = 0; i < voucherGridDocNoCount; i++) 
			{
				String data = voucherGridDocNo.get(i).getText();
				
				if (data.equalsIgnoreCase("1")) 
				{
					 voucherGridCheckBoxList.get(i).click();
				}
			}
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(authorizeBtn));
			authorizeBtn.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(authorizationRemarkPopup));
			boolean actRemarksPopup = authorizationRemarkPopup.isDisplayed();
			boolean expRemarksPopup = true;
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(authorizePopupOkBtn));
			authorizePopupOkBtn.click();
			
			Thread.sleep(2000);
			
			click(homePageVoucherArrowBtn);
			Thread.sleep(1000);

			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homePageAllVouchersView));
			homePageAllVouchersView.click();
			
			Thread.sleep(2000);
			
			String actAfterAuthorizeStatusRow1 = null;
			
			for (int i = 0; i < voucherGridDocNoCount; i++) 
			{
				String data = voucherGridDocNo.get(i).getText();
				
				if (data.equalsIgnoreCase("1")) 
				{
					 actAfterAuthorizeStatusRow1 =  voucherGridAuthorizationStatus.get(i).getText();
				}
			}
			
			String expAfterAuthorizeStatusRow1 = "Authorized";
			
			System.out.println("************************************* checkPurchasesVoucherNAuthorizationStatusWithUserAllOptionsWithUndoAuthorizationOnEditingAmountOrQuantityOrAnyOtherNumericFieldsOption  *********************************");
			
			System.out.println("StatusRow1               : "+actStatusRow1				+" Value Expected : "+expStatusRow1);
			System.out.println("RemarksPopup             : "+actRemarksPopup            +" Value Expected : "+expRemarksPopup);
			System.out.println("AfterAuthorizeStatusRow1 : "+actAfterAuthorizeStatusRow1+" Value Expected : "+expAfterAuthorizeStatusRow1);
			
			if(actStatusRow1.equalsIgnoreCase(expStatusRow1) && actRemarksPopup==expRemarksPopup && actAfterAuthorizeStatusRow1.equalsIgnoreCase(expAfterAuthorizeStatusRow1))
			{
				System.out.println("Test Pass : Authorized Succesfully");
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
				homeCloseBtn.click();
    			Thread.sleep(3000);
				//excelReader.setCellData(xlfile, "SmokeSalesOrder", 627, 9, resPass);
				return true;
			}
			else
			{
				System.out.println("Test Fail : NOT Authorized Succesfully");
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
				homeCloseBtn.click();
    			Thread.sleep(3000);
				//excelReader.setCellData(xlfile, "SmokeSalesOrder", 627, 9, resFail);
				return false;
			}
			
		}
			
	
		
		
		public static boolean checkLogoutAndLoginWithSUToCheckAuthorizationStatusWithUndoAuthorizationOnEditingAmountOrQuantityOrAnyOtherNumericFieldsOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
    	{
    		
    		
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplayLogo));
    		userNameDisplayLogo.click();
   		
   	     	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
   	     	logoutOption.click();

   	     	Thread.sleep(3000);
    		
    		LoginPage lp=new LoginPage(getDriver()); 
    		
    	    String unamelt="su";
    	  
    	    String pawslt="su";
    	      
    	    lp.enterUserName(unamelt);
    	    
    	    lp.enterPassword(pawslt);
    	    
    	    lp.clickOnSignInBtn();
    	    
    	    //checkRefershPopOnlogin();
    	    
    	    //checkPopUpWindow();
    	  
    		Thread.sleep(6000);

    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
			financialsMenu.click();
					
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
			financialsTransactionMenu.click();
				
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
			financialsTransactionsPurchaseMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVoucherNew));
			purchaseVoucherNew.click();
			
			Thread.sleep(3000);
			
			int voucherGridDocNoCount = voucherGridDocNo.size();
			
			String actStatusRow1 = null;
			
			System.out.println("Size  : "+voucherGridDocNoCount);
			
			for (int i = 0; i < voucherGridDocNoCount; i++) 
			{
				String data = voucherGridDocNo.get(i).getText();
				
				if (data.equalsIgnoreCase("1")) 
				{
					 actStatusRow1 =  voucherGridAuthorizationStatus.get(i).getText();
				}
			}
			
			String expStatusRow1 = "Authorized";
			
			System.out.println("************************************* checkLogoutAndLoginWithSUToCheckAuthorizationStatusWithUndoAuthorizationOnEditingAmountOrQuantityOrAnyOtherNumericFieldsOption  *********************************");
			
			System.out.println("StatusRow1 : "+actStatusRow1+" Value Expected : "+expStatusRow1);
			
			if(actStatusRow1.equalsIgnoreCase(expStatusRow1))
			{
				//excelReader.setCellData(xlfile, "SmokeSalesOrder", 627, 9, resPass);
				return true;
			}
			else
			{
				//excelReader.setCellData(xlfile, "SmokeSalesOrder", 627, 9, resFail);
				return false;
			}
		}
		
		
		
		
		
		
		
		public static boolean checkEditingPurchaseVoucherNWithUndoAuthorizationOnEditingAmountOrQuantityOrAnyOtherNumericFieldsOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
    	{
    		
    		
    		
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(grid_ChkBox1));
			getAction().doubleClick(grid_ChkBox1).build().perform();
			
			checkValidationMessage("Screen Opened");
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_5thColumn));
			select1stRow_5thColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
			enter_Quantity.sendKeys(Keys.END);
			enter_Quantity.sendKeys(Keys.SHIFT,Keys.HOME);
			enter_Quantity.sendKeys("5");
			enter_Quantity.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
			enter_Rate.sendKeys(Keys.END);
			enter_Rate.sendKeys(Keys.SHIFT,Keys.HOME);
			enter_Rate.sendKeys("5");
			enter_Rate.sendKeys(Keys.TAB);
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
			saveBtn.click();
			
			Thread.sleep(3000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
			billRefPickIcon.click();
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
			billRefOkBtn.click();
			
			
			String expMessage1= "Voucher saved successfully";
			String expMessage2= ": 1";
			
			String actMessage = checkValidationMessage(expMessage1);
			
		   System.out.println("************************************* checkSavingPurchaseVoucherN1WithUndoAuthorizationOnEditingAmountOrQuantityOrAnyOtherNumericFieldsOption  *********************************");
		   
		   System.out.println("SavingMessage  :  "+actMessage +" Value Expected : "+expMessage1+" "+expMessage2);
	
		   if(actMessage.startsWith(expMessage1) && actMessage.endsWith(expMessage2))
			{
			    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
			    new_CloseBtn.click();
			    Thread.sleep(2000);
				return true;
			}
			else
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
			    new_CloseBtn.click();
			    Thread.sleep(2000);
				return false;
			}
		}
		
		
		
		
		
		
		
		
		public static boolean checkAuthorizationStatusAfterEditingWithUndoAuthorizationOnEditingAmountOrQuantityOrAnyOtherNumericFieldsOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
    	{
			int voucherGridDocNoCount = voucherGridDocNo.size();
			
			String actStatusRow1 = null;
			
			System.out.println("Size  : "+voucherGridDocNoCount);
			
			for (int i = 0; i < voucherGridDocNoCount; i++) 
			{
				String data = voucherGridDocNo.get(i).getText();
				
				if (data.equalsIgnoreCase("1")) 
				{
					 actStatusRow1 =  voucherGridAuthorizationStatus.get(i).getText();
				}
			}
			
			String expStatusRow1 = "Pending";
			
			System.out.println("************************************* checkAuthorizationStatusAfterEditingWithUndoAuthorizationOnEditingAmountOrQuantityOrAnyOtherNumericFieldsOption  *********************************");
			
			System.out.println("StatusRow1 : "+actStatusRow1+" Value Expected : "+expStatusRow1);
			
			if(actStatusRow1.equalsIgnoreCase(expStatusRow1))
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
				homeCloseBtn.click();
				Thread.sleep(2000);
				//excelReader.setCellData(xlfile, "SmokeSalesOrder", 627, 9, resPass);
				return true;
			}
			else
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
				homeCloseBtn.click();
				Thread.sleep(2000);
				//excelReader.setCellData(xlfile, "SmokeSalesOrder", 627, 9, resFail);
				return false;
			}
		}
		
		
		
		
		
		
		
		
		public boolean checkEraseAllTransactionsWithUndoAuthorizationOnEditingAmountOrQuantityOrAnyOtherNumericFieldsOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
			homeMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dataMangementMenu));
			dataMangementMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(eraseAll));
			eraseAll.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(eraseTranscationsRadio));
			eraseTranscationsRadio.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(eraseAllOkBtn));
			eraseAllOkBtn.click();
			
			if(getIsAlertPresent())
			{
				getWaitForAlert();
				
				getAlert().accept();
			}
			
			String expValidationMsg="Data deleted successfully.";
			
			String actValidationMsg=checkValidationMessage(expValidationMsg);
			
			System.out.println("************************************* checkEraseAllTransactionsWithUndoAuthorizationOnEditingAmountOrQuantityOrAnyOtherNumericFieldsOption  *********************************");
			System.out.println("Message  :  "+actValidationMsg +" Value Expected : "+expValidationMsg);
			
			if (actValidationMsg.equalsIgnoreCase(expValidationMsg))
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
				sl_CloseBtn.click();
				return true;
			}
			else
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
				sl_CloseBtn.click();
				return false;
			}
		}
		
		
		
		
		
		
		
		
		
		
		// Undo Authorization on Editing Links
		
		public boolean 	checkWithOutConditionUndoAuthorizationOnEditingLinksInTransactionAuthorizationConditionTab() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
    	{
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsmenuBtn));
    		settingsmenuBtn.click();
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(transactionAuthorizationBtn));
    		transactionAuthorizationBtn.click();
    		
    		Thread.sleep(2000);
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNameDropdown));
    		documentNameDropdown.sendKeys(" ");
    		
    		Thread.sleep(1000);
    			
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchasevoucherExpandbutton));
    		purchasevoucherExpandbutton.click();
    	
            getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchasevoucherTypeCreatedVoucher));
    		purchasevoucherTypeCreatedVoucher.click();
    		
    		Thread.sleep(3000);
    				
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
    		nameTxt.click();
    		
    		nameTxt.sendKeys(Keys.SPACE);
    		
    		int namecount=tranAuthNameList.size();
			
			for(int i=0 ; i < namecount ;i++)
			{
				String data=tranAuthNameList.get(i).getText();
				
				if(data.equalsIgnoreCase("Purchase"))
				{
					tranAuthNameList.get(i).click();
					
					break;
				}
			}
				
    		nameTxt.sendKeys(Keys.TAB);
    			
    		Thread.sleep(3000);
    		
    		click(cnrBtn);
    		Thread.sleep(1000);
    		
    		ClickUsingJs(Level1editBtn);
    		Thread.sleep(1000);
    		
    		//getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(Level1editBtn));
    		//Level1editBtn.click();
    		
    		Thread.sleep(3000);
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(keepUnpostedReferencesChkBox));
    		((JavascriptExecutor)getDriver()).executeScript("arguments[0].scrollIntoView();", keepUnpostedReferencesChkBox);
    		
    		Thread.sleep(2000);
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(amountsOrQuantityOrNumericChkBox));
    		amountsOrQuantityOrNumericChkBox.click();
    		
    		Select undoAuthEditingDrpdwn = new Select(undoAuthorizationEditingDropdown);
    		undoAuthEditingDrpdwn.selectByVisibleText("None");
    		
    		Thread.sleep(2000);
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(definitionOkBtn));
    		definitionOkBtn.click();
    		
    		Thread.sleep(2000);
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(tranAuthSaveBtn));
    		tranAuthSaveBtn.click();
    		
    		
    		String expValidationMsg = "Authorization Flow saved successfully.";
    		
    		String actValidationMsg = checkValidationMessage(expValidationMsg);
    				
    		System.out.println("Validation Message : "+actValidationMsg+"  Value Expected : "+expValidationMsg);
    		
    		if(actValidationMsg.equalsIgnoreCase(expValidationMsg))
    		{
    			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(tranAuthCancelBtn));
    			tranAuthCancelBtn.click();
    			return true;
    		}
    		else
    		{
    			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(tranAuthCancelBtn));
    			tranAuthCancelBtn.click();
    			return false;
    		}
    	}
		
		
		
		
		
		
		
		
		public static boolean checkSavingPurchaseOrderVoucher1WithOutUndoAuthorizationOnEditingLinksOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
			inventoryMenu.click();
					
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsMenu));
			inventoryTransactionsMenu.click();
				
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsPurchasesMenu));
			inventoryTransactionsPurchasesMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchasesOrdersVoucher));
			purchasesOrdersVoucher.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
			newBtn.click();
			
			checkValidationMessage("Screen opened");
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
			vendorAccountTxt.click();
			vendorAccountTxt.sendKeys("Vendor A");
			
			Thread.sleep(2000);
			
			vendorAccountTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
			select1stRow_1stColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pvWareHouseTxt));
			//pvWareHouseTxt.click();
			pvWareHouseTxt.sendKeys("HYDERABAD");
			
			Thread.sleep(2000);
			
			pvWareHouseTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
			enter_ItemTxt.sendKeys("STD RATE COGS ITEM");
			Thread.sleep(3000);
			enter_ItemTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_UnitTxt));
			enter_UnitTxt.sendKeys(Keys.TAB);
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
			enter_Quantity.sendKeys("2");
			enter_Quantity.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
			enter_Rate.sendKeys(Keys.END);
			enter_Rate.sendKeys(Keys.SHIFT, Keys.HOME);
			enter_Rate.sendKeys(Keys.BACK_SPACE);
			enter_Rate.sendKeys("10");
			enter_Rate.sendKeys(Keys.TAB);
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
			saveBtn.click();
			
			
			String expMessage1= "Voucher saved successfully";
			String expMessage2= ": 1";
			
			String actMessage = checkValidationMessage(expMessage1);
			
		   System.out.println("************************************* checkSavingPurchaseOrderVoucher1WithOutUndoAuthorizationOnEditingLinksOption  *********************************");
		   
		   System.out.println("SavingMessage  :  "+actMessage +" Value Expected : "+expMessage1+" "+expMessage2);
	
		   if(actMessage.startsWith(expMessage1) && actMessage.endsWith(expMessage2))
    		{
    			return true;
    		}
    		else
    		{
    			return false;
    		}
    	}
		
		
		
		
		
		
		
		
		public static boolean checkSavingPurchaseOrderVoucher2WithOutUndoAuthorizationOnEditingLinksOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
			vendorAccountTxt.click();
			vendorAccountTxt.sendKeys("Vendor A");
			
			Thread.sleep(2000);
			
			vendorAccountTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
			select1stRow_1stColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pvWareHouseTxt));
			//pvWareHouseTxt.click();
			pvWareHouseTxt.sendKeys("HYDERABAD");
			
			Thread.sleep(2000);
			
			pvWareHouseTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
			enter_ItemTxt.sendKeys("STD RATE COGS ITEM");
			Thread.sleep(3000);
			enter_ItemTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_UnitTxt));
			enter_UnitTxt.sendKeys(Keys.TAB);
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
			enter_Quantity.sendKeys("5");
			enter_Quantity.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
			enter_Rate.sendKeys(Keys.END);
			enter_Rate.sendKeys(Keys.SHIFT, Keys.HOME);
			enter_Rate.sendKeys(Keys.BACK_SPACE);
			enter_Rate.sendKeys("10");
			enter_Rate.sendKeys(Keys.TAB);
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
			saveBtn.click();
			
			
			String expMessage1= "Voucher saved successfully";
			String expMessage2= ": 2";
			
			String actMessage = checkValidationMessage(expMessage1);
			
		   System.out.println("************************************* checkSavingPurchaseOrderVoucher2WithOutUndoAuthorizationOnEditingLinksOption  *********************************");
		   
		   System.out.println("SavingMessage  :  "+actMessage +" Value Expected : "+expMessage1+" "+expMessage2);
	
		   if(actMessage.startsWith(expMessage1) && actMessage.endsWith(expMessage2))
    		{
    			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
    			new_CloseBtn.click();
    			Thread.sleep(2000);
    			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
    			homeCloseBtn.click();
    			return true;
    		}
    		else
    		{
    			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
    			new_CloseBtn.click();
    			Thread.sleep(2000);
    			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
    			homeCloseBtn.click();
    			return false;
    		}
    	}
		
		
		
		
		
		
		
		
		public static boolean checkSavingPurchaseVoucherN1WithOutUndoAuthorizationOnEditingLinksOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
			financialsMenu.click();
					
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
			financialsTransactionMenu.click();
				
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
			financialsTransactionsPurchaseMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVoucherNew));
			purchaseVoucherNew.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
			newBtn.click();
			
			checkValidationMessage("Screen opened");
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseAccountTxt));
			purchaseAccountTxt.click();
			purchaseAccountTxt.sendKeys("Purchase");
			
			Thread.sleep(2000);
			
			purchaseAccountTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
			vendorAccountTxt.click();
			vendorAccountTxt.sendKeys("Vendor A");
			
			Thread.sleep(2000);
			
			vendorAccountTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
			departmentTxt.click();
			departmentTxt.sendKeys("INDIA");
			
			Thread.sleep(2000);
			
			departmentTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(wareHouseTxt));
			wareHouseTxt.click();
			wareHouseTxt.sendKeys("HYDERABAD");
			
			Thread.sleep(2000);
			
			wareHouseTxt.sendKeys(Keys.TAB);
			
			//getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workFlowExpandBtn));	
			//workFlowExpandBtn.click();
            documentNumberTxt.sendKeys(Keys.CONTROL, "l");
			
			Thread.sleep(2000);
		
			Thread.sleep(2000);
			
			boolean actPurchaseVoucherWorlFlowText = workflowTableBody.getText().isEmpty();
			
			boolean expPurchaseVoucherWorlFlowText = false;
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workFlowRow1ChkBoxCL));
			workFlowRow1ChkBoxCL.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workFlowOkBtnCL));
			workFlowOkBtnCL.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
			saveBtn.click();
			
			Thread.sleep(3000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
			billRefPickIcon.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
			billRefOkBtn.click();
			
			
			String expMessage1= "Voucher saved successfully";
			String expMessage2= ": 1";
			
			String actMessage = checkValidationMessage(expMessage1);
			
		   System.out.println("************************************* checkSavingPurchaseVoucherN1WithOutUndoAuthorizationOnEditingLinksOption  *********************************");
		   
		   System.out.println("SavingMessage  :  "+actMessage +" Value Expected : "+expMessage1+" "+expMessage2);
	
		   if(actMessage.startsWith(expMessage1) && actMessage.endsWith(expMessage2))
    		{
    			return true;
    		}
    		else
    		{
    			return false;
    		}
    	}
		
		
		
		
		
		
		
		public static boolean checkLogoutAndLoginWithUserAllOptionsWithOutUndoAuthorizationOnEditLinksOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
    	{
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplayLogo));
    		userNameDisplayLogo.click();
   		
   	     	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
   	     	logoutOption.click();

   	     	Thread.sleep(3000);
    		
    		LoginPage lp=new LoginPage(getDriver()); 
    		
    	    String unamelt="UserAllOptions";
    	  
    	    String pawslt="12345";
    	      
    	    lp.enterUserName(unamelt);
    	    
    	    lp.enterPassword(pawslt);
    	    
    	    lp.clickOnSignInBtn();
    	    
    	    //checkRefershPopOnlogin();
    	    
    	    //checkPopUpWindow();
    	  
    		Thread.sleep(7000);

    		String actUserInfo=userNameDisplay.getText();
    		
    		System.out.println("User Info  : "+actUserInfo);
    		
    		System.out.println("User Info Capture Text  :  "+userNameDisplay.getText());
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(companyLogo));
    		companyLogo.click();
    		
    		String getCompanyTxt=companyName.getText();
    		String getLoginCompanyName=getCompanyTxt.substring(0, 19);
    		System.out.println("company name  :  "+ getLoginCompanyName);
    		companyLogo.click();
    		
    		boolean actDashboard = dashboard.isDisplayed();
    		
    		
    		String expUserInfo           ="UserAllOptions";
    		String expLoginCompanyName   ="Automation";
    		boolean expDashboard = true;

    		if (actUserInfo.equalsIgnoreCase(expUserInfo) && getLoginCompanyName.contains(expLoginCompanyName) && actDashboard==expDashboard) 
    		{
				return true;
			}
    		else
    		{
    			return false;
			}
    	}
    	
    	
    	
		
		
		
		public static boolean checkPurchasesVoucherNAuthorizationStatusWithUserAllOptionsWithOutUndoAuthorizationOnEditLinksOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
			financialsMenu.click();
					
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
			financialsTransactionMenu.click();
				
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
			financialsTransactionsPurchaseMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVoucherNew));
			purchaseVoucherNew.click();
			
			Thread.sleep(3000);
			
			int voucherGridDocNoCount = voucherGridDocNo.size();
			
			String actStatusRow1 = null;
			
			System.out.println("Size  : "+voucherGridDocNoCount);
			
			for (int i = 0; i < voucherGridDocNoCount; i++) 
			{
				String data = voucherGridDocNo.get(i).getText();
				
				if (data.equalsIgnoreCase("1")) 
				{
					 actStatusRow1 =  voucherGridAuthorizationStatus.get(i).getText();
				}
			}
			
			String expStatusRow1 = "Pending";
			
			Thread.sleep(2000);
			
			click(homePageVoucherArrowBtn);
			Thread.sleep(1000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pendingAuthorizationPurchases));
			pendingAuthorizationPurchases.click();
			
			Thread.sleep(2000);
			
			for (int i = 0; i < voucherGridDocNoCount; i++) 
			{
				String data = voucherGridDocNo.get(i).getText();
				
				if (data.equalsIgnoreCase("1")) 
				{
					 voucherGridCheckBoxList.get(i).click();
				}
			}
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(authorizeBtn));
			authorizeBtn.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(authorizePopupOkBtn));
			authorizePopupOkBtn.click();
			
			Thread.sleep(2000);
			
			click(homePageVoucherArrowBtn);
			Thread.sleep(1000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homePageAllVouchersView));
			homePageAllVouchersView.click();
			
			Thread.sleep(2000);
			
			String actAfterAuthorizeStatusRow1 = null;
			
			for (int i = 0; i < voucherGridDocNoCount; i++) 
			{
				String data = voucherGridDocNo.get(i).getText();
				
				if (data.equalsIgnoreCase("1")) 
				{
					 actAfterAuthorizeStatusRow1 =  voucherGridAuthorizationStatus.get(i).getText();
				}
			}
			
			String expAfterAuthorizeStatusRow1 = "Authorized";
			
			System.out.println("************************************* checkPurchasesVoucherNAuthorizationStatusWithUserAllOptionsWithOutUndoAuthorizationOnEditLinksOption  *********************************");
			
			System.out.println("StatusRow1               : "+actStatusRow1				+" Value Expected : "+expStatusRow1);
			System.out.println("AfterAuthorizeStatusRow1 : "+actAfterAuthorizeStatusRow1+" Value Expected : "+expAfterAuthorizeStatusRow1);
			
			
			if(actStatusRow1.equalsIgnoreCase(expStatusRow1) && actAfterAuthorizeStatusRow1.equalsIgnoreCase(expAfterAuthorizeStatusRow1))
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
				homeCloseBtn.click();
    			Thread.sleep(3000);
				//excelReader.setCellData(xlfile, "SmokeSalesOrder", 627, 9, resPass);
				return true;
			}
			else
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
				homeCloseBtn.click();
    			Thread.sleep(3000);
				//excelReader.setCellData(xlfile, "SmokeSalesOrder", 627, 9, resFail);
				return false;
			}
			
		}
			
	
		
		
		public static boolean checkLogoutAndLoginWithSUToCheckAuthorizationStatusWithOutUndoAuthorizationOnEditingLinksOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
    	{
    		
    		
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplayLogo));
    		userNameDisplayLogo.click();
   		
   	     	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
   	     	logoutOption.click();

   	     	Thread.sleep(3000);
    		
    		LoginPage lp=new LoginPage(getDriver()); 
    		
    	    String unamelt="su";
    	  
    	    String pawslt="su";
    	      
    	    lp.enterUserName(unamelt);
    	    
    	    lp.enterPassword(pawslt);
    	    
    	    lp.clickOnSignInBtn();
    	    
    	    //checkRefershPopOnlogin();
    	    
    	    //checkPopUpWindow();
    	  
    		Thread.sleep(6000);

    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
			financialsMenu.click();
					
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
			financialsTransactionMenu.click();
				
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
			financialsTransactionsPurchaseMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVoucherNew));
			purchaseVoucherNew.click();
			
			Thread.sleep(3000);
			
			int voucherGridDocNoCount = voucherGridDocNo.size();
			
			String actStatusRow1 = null;
			
			System.out.println("Size  : "+voucherGridDocNoCount);
			
			for (int i = 0; i < voucherGridDocNoCount; i++) 
			{
				String data = voucherGridDocNo.get(i).getText();
				
				if (data.equalsIgnoreCase("1")) 
				{
					 actStatusRow1 =  voucherGridAuthorizationStatus.get(i).getText();
				}
			}
			
			String expStatusRow1 = "Authorized";
			
			System.out.println("************************************* checkLogoutAndLoginWithSUToCheckAuthorizationStatusWithOutUndoAuthorizationOnEditingLinksOption  *********************************");
			
			System.out.println("StatusRow1 : "+actStatusRow1+" Value Expected : "+expStatusRow1);
			
			if(actStatusRow1.equalsIgnoreCase(expStatusRow1))
			{
				//excelReader.setCellData(xlfile, "SmokeSalesOrder", 627, 9, resPass);
				return true;
			}
			else
			{
				//excelReader.setCellData(xlfile, "SmokeSalesOrder", 627, 9, resFail);
				return false;
			}
		}
		
		
		
		
		
		
		
		
		public static boolean checkEditingPurchaseVoucherNWithOutUndoAuthorizationOnEditingLinksOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
    	{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(grid_ChkBox1));
			getAction().doubleClick(grid_ChkBox1).build().perform();
			
			checkValidationMessage("Screen Opened");
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_6thColumn));
			select1stRow_6thColumn.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_PurchasesOrders));
			enter_PurchasesOrders.sendKeys(Keys.SPACE);
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseOrderLinkHeaderChkBox));
			
			int vouchersCount = purchaseOrderLinkPopupVouchersList.size();
			
			System.out.println("Size  : "+vouchersCount);
			
			for (int i = 0; i < vouchersCount; i++) 
			{
				String data = purchaseOrderLinkPopupVouchersNoList.get(i).getText();
				
				if (data.equalsIgnoreCase("PurOrd:1")  && purchaseOrderLinkPopupChkBoxList.get(i).isSelected()) 
				{
					purchaseOrderLinkPopupChkBoxList.get(i).click();
				}
				
				if (data.equalsIgnoreCase("PurOrd:2") && purchaseOrderLinkPopupChkBoxList.get(i).isSelected()==false) 
				{
					purchaseOrderLinkPopupChkBoxList.get(i).click();
				}
			}
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseOrderLinkPopupOkBtn));
			purchaseOrderLinkPopupOkBtn.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_7thColumn));
			select1stRow_7thColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
			enter_Rate.sendKeys(Keys.TAB);
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
			saveBtn.click();
			
			Thread.sleep(3000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
			billRefPickIcon.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
			billRefOkBtn.click();
			
			
			String expMessage1= "Voucher saved successfully";
			String expMessage2= ": 1";
			
			String actMessage = checkValidationMessage(expMessage1);
			
		   System.out.println("************************************* checkEditingPurchaseVoucherNWithOutUndoAuthorizationOnEditingLinksOption  *********************************");
		   
		   System.out.println("SavingMessage  :  "+actMessage +" Value Expected : "+expMessage1+" "+expMessage2);
	
		   if(actMessage.startsWith(expMessage1) && actMessage.endsWith(expMessage2))
			{
			    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
			    new_CloseBtn.click();
				return true;
			}
			else
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
			    new_CloseBtn.click();
				return false;
			}
		}
		
		
		
		
		
		
		
		
		
		public static boolean checkAuthorizationStatusWithOutUndoAuthorizationOnEditingLinksOptionAfterEditingPurchaseVoucherN() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
    	{
			Thread.sleep(2000);
			
			int voucherGridDocNoCount = voucherGridDocNo.size();
			
			String actStatusRow1 = null;
			
			System.out.println("Size  : "+voucherGridDocNoCount);
			
			for (int i = 0; i < voucherGridDocNoCount; i++) 
			{
				String data = voucherGridDocNo.get(i).getText();
				
				if (data.equalsIgnoreCase("1")) 
				{
					 actStatusRow1 =  voucherGridAuthorizationStatus.get(i).getText();
				}
			}
			
			String expStatusRow1 = "Authorized";
			
			System.out.println("************************************* checkAuthorizationStatusWithOutUndoAuthorizationOnEditingLinksOptionAfterEditingPurchaseVoucherN  *********************************");
			
			System.out.println("StatusRow1 : "+actStatusRow1+" Value Expected : "+expStatusRow1);
			
			if(actStatusRow1.equalsIgnoreCase(expStatusRow1))
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
				homeCloseBtn.click();
				Thread.sleep(2000);
				//excelReader.setCellData(xlfile, "SmokeSalesOrder", 627, 9, resPass);
				return true;
			}
			else
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
				homeCloseBtn.click();
				Thread.sleep(2000);
				//excelReader.setCellData(xlfile, "SmokeSalesOrder", 627, 9, resFail);
				return false;
			}
		}
		
		
		
		
		
		
		
		
		public boolean checkEraseAllTransactionsWithOutUndoAuthorizationOnEditingLinksOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
			homeMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dataMangementMenu));
			dataMangementMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(eraseAll));
			eraseAll.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(eraseTranscationsRadio));
			eraseTranscationsRadio.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(eraseAllOkBtn));
			eraseAllOkBtn.click();
			
			if(getIsAlertPresent())
			{
				getWaitForAlert();
				getAlert().accept();
			}
			
			String expValidationMsg="Data deleted successfully.";
			
			String actValidationMsg=checkValidationMessage(expValidationMsg);
			
			System.out.println("************************************* checkEraseAllTransactionsWithOutUndoAuthorizationOnEditingLinksOption  *********************************");
			System.out.println("Message  :  "+actValidationMsg +" Value Expected : "+expValidationMsg);
			
			if (actValidationMsg.equalsIgnoreCase(expValidationMsg))
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
				sl_CloseBtn.click();
				return true;
			}
			else
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
				sl_CloseBtn.click();
				return false;
			}
		}
		
		
		
		
		
		
		
		
		public boolean 	checkWithConditionUndoAuthorizationOnEditingLinksInTransactionAuthorizationConditionTab() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
    	{
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsmenuBtn));
    		settingsmenuBtn.click();
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(transactionAuthorizationBtn));
    		transactionAuthorizationBtn.click();
    		
    		Thread.sleep(2000);
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNameDropdown));
    		documentNameDropdown.sendKeys(" ");
    		
    		Thread.sleep(1000);
    			
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchasevoucherExpandbutton));
    		purchasevoucherExpandbutton.click();
    	
            getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchasevoucherTypeCreatedVoucher));
    		purchasevoucherTypeCreatedVoucher.click();
    		
    		Thread.sleep(3000);
    				
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
    		nameTxt.click();
    		
    		nameTxt.sendKeys(Keys.SPACE);
    		
    		int namecount=tranAuthNameList.size();
			
			for(int i=0 ; i < namecount ;i++)
			{
				String data=tranAuthNameList.get(i).getText();
				
				if(data.equalsIgnoreCase("Purchase"))
				{
					tranAuthNameList.get(i).click();
					
					break;
				}
			}
				
    		nameTxt.sendKeys(Keys.TAB);
    			
    		Thread.sleep(3000);
    		
    		click(cnrBtn);
    		Thread.sleep(1000);
    		
    		ClickUsingJs(Level1editBtn);
    		Thread.sleep(1000);
    		
    		//getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(Level1editBtn));
    		//Level1editBtn.click();
    		
    		Thread.sleep(3000);
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(keepUnpostedReferencesChkBox));
    		((JavascriptExecutor)getDriver()).executeScript("arguments[0].scrollIntoView();", keepUnpostedReferencesChkBox);
    		
    		Thread.sleep(2000);
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(undoLinksChkBox));
    		undoLinksChkBox.click();
    		
    		Select undoAuthEditingDrpdwn = new Select(undoAuthorizationEditingDropdown);
    		undoAuthEditingDrpdwn.selectByVisibleText("Full");
    		
    		Thread.sleep(2000);
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(definitionOkBtn));
    		definitionOkBtn.click();
    		
    		Thread.sleep(2000);
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(tranAuthSaveBtn));
    		tranAuthSaveBtn.click();
    		
    		String expValidationMsg = "Authorization Flow saved successfully.";
    		
    		String actValidationMsg = checkValidationMessage(expValidationMsg);
    		
    		System.out.println("Validation Message : "+actValidationMsg+"  Value Expected : "+expValidationMsg);
    		
    		if(actValidationMsg.equalsIgnoreCase(expValidationMsg))
    		{
    			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(tranAuthCancelBtn));
    			tranAuthCancelBtn.click();
    			return true;
    		}
    		else
    		{
    			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(tranAuthCancelBtn));
    			tranAuthCancelBtn.click();
    			return false;
    		}
    	}
		
		
		
		
		
		
		
		
		public static boolean checkSavingPurchaseOrderVoucher1WithUndoAuthorizationOnEditingLinksOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
			inventoryMenu.click();
					
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsMenu));
			inventoryTransactionsMenu.click();
				
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsPurchasesMenu));
			inventoryTransactionsPurchasesMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchasesOrdersVoucher));
			purchasesOrdersVoucher.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
			newBtn.click();
			
			checkValidationMessage("Screen opened");
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
			vendorAccountTxt.click();
			vendorAccountTxt.sendKeys("Vendor A");
			
			Thread.sleep(2000);
			
			vendorAccountTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
			select1stRow_1stColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pvWareHouseTxt));
			//pvWareHouseTxt.click();
			pvWareHouseTxt.sendKeys("HYDERABAD");
			
			Thread.sleep(2000);
			
			pvWareHouseTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
			enter_ItemTxt.sendKeys("STD RATE COGS ITEM");
			Thread.sleep(3000);
			enter_ItemTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_UnitTxt));
			enter_UnitTxt.sendKeys(Keys.TAB);
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
			enter_Quantity.sendKeys("2");
			enter_Quantity.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
			enter_Rate.sendKeys(Keys.END);
			enter_Rate.sendKeys(Keys.SHIFT, Keys.HOME);
			enter_Rate.sendKeys(Keys.BACK_SPACE);
			enter_Rate.sendKeys("10");
			enter_Rate.sendKeys(Keys.TAB);
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
			saveBtn.click();
			
			
			String expMessage1= "Voucher saved successfully";
			String expMessage2= ": 1";
			
			String actMessage = checkValidationMessage(expMessage1);
			
		   System.out.println("************************************* checkSavingPurchaseOrderVoucher1WithUndoAuthorizationOnEditingLinksOption  *********************************");
		   
		   System.out.println("SavingMessage  :  "+actMessage +" Value Expected : "+expMessage1+" "+expMessage2);
	
		   if(actMessage.startsWith(expMessage1) && actMessage.endsWith(expMessage2))
    		{
    			return true;
    		}
    		else
    		{
    			return false;
    		}
    	}
		
		
		
		
		
		
		
		public static boolean checkSavingPurchaseOrderVoucher2WithUndoAuthorizationOnEditingLinksOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
			vendorAccountTxt.click();
			vendorAccountTxt.sendKeys("Vendor A");
			
			Thread.sleep(2000);
			
			vendorAccountTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
			select1stRow_1stColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pvWareHouseTxt));
			//pvWareHouseTxt.click();
			pvWareHouseTxt.sendKeys("HYDERABAD");
			
			Thread.sleep(2000);
			
			pvWareHouseTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
			enter_ItemTxt.sendKeys("STD RATE COGS ITEM");
			Thread.sleep(3000);
			enter_ItemTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_UnitTxt));
			enter_UnitTxt.sendKeys(Keys.TAB);
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
			enter_Quantity.sendKeys("5");
			enter_Quantity.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
			enter_Rate.sendKeys(Keys.END);
			enter_Rate.sendKeys(Keys.SHIFT, Keys.HOME);
			enter_Rate.sendKeys(Keys.BACK_SPACE);
			enter_Rate.sendKeys("10");
			enter_Rate.sendKeys(Keys.TAB);
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
			saveBtn.click();
			
			String expMessage1= "Voucher saved successfully";
			String expMessage2= ": 2";
			
			String actMessage = checkValidationMessage(expMessage1);
			
		   System.out.println("************************************* checkSavingPurchaseOrderVoucher2WithUndoAuthorizationOnEditingLinksOption  *********************************");
		   
		   System.out.println("SavingMessage  :  "+actMessage +" Value Expected : "+expMessage1+" "+expMessage2);
	
		   if(actMessage.startsWith(expMessage1) && actMessage.endsWith(expMessage2))
    		{
    			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
    			new_CloseBtn.click();
    			Thread.sleep(2000);
    			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
    			homeCloseBtn.click();
    			return true;
    		}
    		else
    		{
    			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
    			new_CloseBtn.click();
    			Thread.sleep(2000);
    			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
    			homeCloseBtn.click();
    			return false;
    		}
    	}
		
		
		
		
		
		
		
		public static boolean checkSavingPurchaseVoucherN1WithUndoAuthorizationOnEditingLinksOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
			financialsMenu.click();
					
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
			financialsTransactionMenu.click();
				
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
			financialsTransactionsPurchaseMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVoucherNew));
			purchaseVoucherNew.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
			newBtn.click();
			
			checkValidationMessage("Screen opened");
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseAccountTxt));
			purchaseAccountTxt.click();
			purchaseAccountTxt.sendKeys("Purchase");
			
			Thread.sleep(2000);
			
			purchaseAccountTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
			vendorAccountTxt.click();
			vendorAccountTxt.sendKeys("Vendor A");
			
			Thread.sleep(2000);
			
			vendorAccountTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
			departmentTxt.click();
			departmentTxt.sendKeys("INDIA");
			
			Thread.sleep(2000);
			
			departmentTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(wareHouseTxt));
			wareHouseTxt.click();
			wareHouseTxt.sendKeys("HYDERABAD");
			
			Thread.sleep(2000);
			
			wareHouseTxt.sendKeys(Keys.TAB);
			
			//getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workFlowExpandBtn));	
			//workFlowExpandBtn.click();
			
			documentNumberTxt.sendKeys(Keys.CONTROL, "l");
			
			Thread.sleep(2000);
		
			Thread.sleep(2000);
			
			boolean actPurchaseVoucherWorlFlowText = workflowTableBody.getText().isEmpty();
			
			boolean expPurchaseVoucherWorlFlowText = false;
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workFlowRow1ChkBoxCL));
			workFlowRow1ChkBoxCL.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workFlowOkBtnCL));
			workFlowOkBtnCL.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
			saveBtn.click();
			
			Thread.sleep(3000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
			billRefPickIcon.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
			billRefOkBtn.click();
			
			
			String expMessage1= "Voucher saved successfully";
			String expMessage2= ": 1";
			
			String actMessage = checkValidationMessage(expMessage1);
			
		   System.out.println("************************************* checkSavingPurchaseVoucherN1WithUndoAuthorizationOnEditingLinksOption  *********************************");
		   
		   System.out.println("SavingMessage  :  "+actMessage +" Value Expected : "+expMessage1+" "+expMessage2);
	
		   if(actMessage.startsWith(expMessage1) && actMessage.endsWith(expMessage2))
    		{
    			return true;
    		}
    		else
    		{
    			return false;
    		}
    	}
		
		
		
		
		
		
		
		public static boolean checkLogoutAndLoginWithUserAllOptionsWithUndoAuthorizationOnEditLinksOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
    	{
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplayLogo));
    		userNameDisplayLogo.click();
   		
   	     	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
   	     	logoutOption.click();

   	     	Thread.sleep(3000);
    		
    		LoginPage lp=new LoginPage(getDriver()); 
    		
    	    String unamelt="UserAllOptions";
    	  
    	    String pawslt="12345";
    	      
    	    lp.enterUserName(unamelt);
    	    
    	    lp.enterPassword(pawslt);
    	    
    	    lp.clickOnSignInBtn();
    	    
    	    //checkRefershPopOnlogin();
    	    
    	    //checkPopUpWindow();
    	  
    		Thread.sleep(7000);

    		String actUserInfo=userNameDisplay.getText();
    		
    		System.out.println("User Info  : "+actUserInfo);
    		
    		System.out.println("User Info Capture Text  :  "+userNameDisplay.getText());
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(companyLogo));
    		companyLogo.click();
    		
    		String getCompanyTxt=companyName.getText();
    		String getLoginCompanyName=getCompanyTxt.substring(0, 19);
    		System.out.println("company name  :  "+ getLoginCompanyName);
    		companyLogo.click();
    		
    		boolean actDashboard = dashboard.isDisplayed();
    		
    		
    		String expUserInfo           ="UserAllOptions";
    		String expLoginCompanyName   ="Automation";
    		boolean expDashboard = true;

    		if (actUserInfo.equalsIgnoreCase(expUserInfo) && getLoginCompanyName.contains(expLoginCompanyName) && actDashboard==expDashboard) 
    		{
				return true;
			}
    		else
    		{
    			return false;
			}
    	}
    	
    	
    	
		
		
		
		public static boolean checkPurchasesVoucherNAuthorizationStatusWithUserAllOptionsWithUndoAuthorizationOnEditLinksOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
			financialsMenu.click();
					
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
			financialsTransactionMenu.click();
				
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
			financialsTransactionsPurchaseMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVoucherNew));
			purchaseVoucherNew.click();
			
			Thread.sleep(3000);
			
			int voucherGridDocNoCount = voucherGridDocNo.size();
			
			String actStatusRow1 = null;
			
			System.out.println("Size  : "+voucherGridDocNoCount);
			
			for (int i = 0; i < voucherGridDocNoCount; i++) 
			{
				String data = voucherGridDocNo.get(i).getText();
				
				if (data.equalsIgnoreCase("1")) 
				{
					 actStatusRow1 =  voucherGridAuthorizationStatus.get(i).getText();
				}
			}
			
			String expStatusRow1 = "Pending";
			
			Thread.sleep(2000);
			
			click(homePageVoucherArrowBtn);
			Thread.sleep(1000);

			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pendingAuthorizationPurchases));
			pendingAuthorizationPurchases.click();
			
			Thread.sleep(2000);
			
			for (int i = 0; i < voucherGridDocNoCount; i++) 
			{
				String data = voucherGridDocNo.get(i).getText();
				
				if (data.equalsIgnoreCase("1")) 
				{
					 voucherGridCheckBoxList.get(i).click();
				}
			}
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(authorizeBtn));
			authorizeBtn.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(authorizePopupOkBtn));
			authorizePopupOkBtn.click();
			
			Thread.sleep(2000);
			
			click(homePageVoucherArrowBtn);
			Thread.sleep(1000);

			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homePageAllVouchersView));
			homePageAllVouchersView.click();
			
			Thread.sleep(2000);
			
			String actAfterAuthorizeStatusRow1 = null;
			
			for (int i = 0; i < voucherGridDocNoCount; i++) 
			{
				String data = voucherGridDocNo.get(i).getText();
				
				if (data.equalsIgnoreCase("1")) 
				{
					 actAfterAuthorizeStatusRow1 =  voucherGridAuthorizationStatus.get(i).getText();
				}
			}
			
			String expAfterAuthorizeStatusRow1 = "Authorized";
			
			System.out.println("************************************* checkPurchasesVoucherNAuthorizationStatusWithUserAllOptionsWithUndoAuthorizationOnEditLinksOption  *********************************");
			
			System.out.println("StatusRow1               : "+actStatusRow1				+" Value Expected : "+expStatusRow1);
			System.out.println("AfterAuthorizeStatusRow1 : "+actAfterAuthorizeStatusRow1+" Value Expected : "+expAfterAuthorizeStatusRow1);
			
			
			if(actStatusRow1.equalsIgnoreCase(expStatusRow1) && actAfterAuthorizeStatusRow1.equalsIgnoreCase(expAfterAuthorizeStatusRow1))
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
				homeCloseBtn.click();
    			Thread.sleep(3000);
				//excelReader.setCellData(xlfile, "SmokeSalesOrder", 627, 9, resPass);
				return true;
			}
			else
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
				homeCloseBtn.click();
    			Thread.sleep(3000);
				//excelReader.setCellData(xlfile, "SmokeSalesOrder", 627, 9, resFail);
				return false;
			}
			
		}
			
	
		
		
		
		
		public static boolean checkLogoutAndLoginWithSUToCheckAuthorizationStatusWithUndoAuthorizationOnEditingLinksOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
    	{
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplayLogo));
    		userNameDisplayLogo.click();
   		
   	     	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
   	     	logoutOption.click();

   	     	Thread.sleep(3000);
    		
    		LoginPage lp=new LoginPage(getDriver()); 
    		
    	    String unamelt="su";
    	  
    	    String pawslt="su";
    	      
    	    lp.enterUserName(unamelt);
    	    
    	    lp.enterPassword(pawslt);
    	    
    	    lp.clickOnSignInBtn();
    	    
    	    //checkRefershPopOnlogin();
    	    
    	    //checkPopUpWindow();
    	  
    		Thread.sleep(6000);

    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
			financialsMenu.click();
					
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
			financialsTransactionMenu.click();
				
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
			financialsTransactionsPurchaseMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVoucherNew));
			purchaseVoucherNew.click();
			
			Thread.sleep(3000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
					
			int voucherGridDocNoCount = voucherGridDocNo.size();
			
			String actStatusRow1 = null;
			
			System.out.println("Size  : "+voucherGridDocNoCount);
			
			for (int i = 0; i < voucherGridDocNoCount; i++) 
			{
				String data = voucherGridDocNo.get(i).getText();
				
				if (data.equalsIgnoreCase("1")) 
				{
					 actStatusRow1 =  voucherGridAuthorizationStatus.get(i).getText();
				}
			}
			
			String expStatusRow1 = "Authorized";
			
			System.out.println("************************************* checkLogoutAndLoginWithSUToCheckAuthorizationStatusWithOutUndoAuthorizationOnEditingLinksOption  *********************************");
			
			System.out.println("StatusRow1 : "+actStatusRow1+" Value Expected : "+expStatusRow1);
			
			if(actStatusRow1.equalsIgnoreCase(expStatusRow1))
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		
		
		
		
		
		
		
		
		public static boolean checkEditingPurchaseVoucherNWithUndoAuthorizationOnEditingLinksOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
    	{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(grid_ChkBox1));
			getAction().doubleClick(grid_ChkBox1).build().perform();
			
			checkValidationMessage("Screen Opened");
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_6thColumn));
			select1stRow_6thColumn.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_PurchasesOrders));
			enter_PurchasesOrders.sendKeys(Keys.SPACE);
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseOrderLinkHeaderChkBox));
			
			int vouchersCount = purchaseOrderLinkPopupVouchersList.size();
			
			System.out.println("Size  : "+vouchersCount);
			
			for (int i = 0; i < vouchersCount; i++) 
			{
				String data = purchaseOrderLinkPopupVouchersNoList.get(i).getText();
				
				if (data.equalsIgnoreCase("PurOrd:1")  && purchaseOrderLinkPopupChkBoxList.get(i).isSelected()) 
				{
					purchaseOrderLinkPopupChkBoxList.get(i).click();
				}
				
				if (data.equalsIgnoreCase("PurOrd:2") && purchaseOrderLinkPopupChkBoxList.get(i).isSelected()==false) 
				{
					purchaseOrderLinkPopupChkBoxList.get(i).click();
				}
			}
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseOrderLinkPopupOkBtn));
			purchaseOrderLinkPopupOkBtn.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_7thColumn));
			select1stRow_7thColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
			enter_Rate.sendKeys(Keys.TAB);
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
			saveBtn.click();
			
			Thread.sleep(3000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
			billRefPickIcon.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
			billRefOkBtn.click();
			
			Thread.sleep(2000);
			
			String expMessage1= "Voucher saved successfully";
			String expMessage2= ": 1";
			
			String actMessage = checkValidationMessage(expMessage1);
			
		   System.out.println("************************************* checkEditingPurchaseVoucherNWithOutUndoAuthorizationOnEditingLinksOption  *********************************");
		   
		   System.out.println("SavingMessage  :  "+actMessage +" Value Expected : "+expMessage1+" "+expMessage2);
	
		   getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
		   new_CloseBtn.click();
		   
		   Thread.sleep(2000);
		   
		   if(actMessage.startsWith(expMessage1) && actMessage.endsWith(expMessage2))
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		
		
		
		
		
		
		
		
		
		public static boolean checkAuthorizationStatusWithUndoAuthorizationOnEditingLinksOptionAfterEditingPurchaseVoucherN() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
    	{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
			
			/*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(allVouchersOption));
			allVouchersOption.click();*/
		    
		    Thread.sleep(3000);
		    
			int voucherGridDocNoCount = voucherGridDocNo.size();
			
			String actStatusRow1 = null;
			
			System.out.println("Size  : "+voucherGridDocNoCount);
			
			for (int i = 0; i < voucherGridDocNoCount; i++) 
			{
				String data = voucherGridDocNo.get(i).getText();
				
				if (data.equalsIgnoreCase("1")) 
				{
					actStatusRow1 =  voucherGridAuthorizationStatus.get(i).getText();
				}
			}
			
			String expStatusRow1 = "Pending";
			
			System.out.println("************************************* checkAuthorizationStatusWithOutUndoAuthorizationOnEditingLinksOptionAfterEditingPurchaseVoucherN  *********************************");
			
			System.out.println("StatusRow1 : "+actStatusRow1+" Value Expected : "+expStatusRow1);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
			homeCloseBtn.click();
			
			Thread.sleep(2000);
			
			if(actStatusRow1.equalsIgnoreCase(expStatusRow1))
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		
		
		
		
		
		
		
		public boolean checkEraseAllTransactionsWithUndoAuthorizationOnEditingLinksOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
			homeMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dataMangementMenu));
			dataMangementMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(eraseAll));
			eraseAll.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(eraseTranscationsRadio));
			eraseTranscationsRadio.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(eraseAllOkBtn));
			eraseAllOkBtn.click();
			
			if(getIsAlertPresent())
			{
				getWaitForAlert();
				getAlert().accept();
			}
			
			String expValidationMsg="Data deleted successfully.";

			String actValidationMsg=checkValidationMessage(expValidationMsg);
			
			System.out.println("************************************* checkEraseAllTransactionsWithUndoAuthorizationOnEditingLinksOption  *********************************");
			System.out.println("Message  :  "+actValidationMsg +" Value Expected : "+expValidationMsg);
			
			if (actValidationMsg.equalsIgnoreCase(expValidationMsg))
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
				sl_CloseBtn.click();
				return true;
			}
			else
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
				sl_CloseBtn.click();
				return false;
			}
		}
		
		
		
		
		
		
		
		
		// Undo Authorization on Editing Reservations
		
		public boolean 	checkTransactionAuthorizationSalesOrderDocumentUncheckKeepUnpostedReservationAndLinksBaseOptions() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
    	{
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsmenuBtn));
    		settingsmenuBtn.click();
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(transactionAuthorizationBtn));
    		transactionAuthorizationBtn.click();
    		
    		Thread.sleep(2000);
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNameDropdown));
    		documentNameDropdown.sendKeys(" ");
    		
    		Thread.sleep(1000);
    			
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNameSalesOrders1));
    		documentNameSalesOrders1.click();
    		
    		Thread.sleep(3000);
    				
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
    		nameTxt.click();
    		
    		nameTxt.sendKeys(Keys.SPACE);
    		
    		int namecount=tranAuthNameList.size();
			
			for(int i=0 ; i < namecount ;i++)
			{
				String data=tranAuthNameList.get(i).getText();
				
				if(data.equalsIgnoreCase("Sales"))
				{
					tranAuthNameList.get(i).click();
					
					break;
				}
			}
				
    		nameTxt.sendKeys(Keys.TAB);
    			
    		Thread.sleep(2000);
    		
    		click(cnrBtn);
    		Thread.sleep(1000);
    		
    		ClickUsingJs(Level1editBtn);
    		Thread.sleep(1000);
    		
    		//getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(Level1editBtn));
    		//Level1editBtn.click();
    		
    		Thread.sleep(2000);
    		ScrollToElement(keepUnpostedReservationChkBox);
    		Thread.sleep(2000);
    		
    		//getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(keepUnpostedReservationChkBox));
    		//keepUnpostedReservationChkBox.click();
    		ClickUsingJs(keepUnpostedReservationChkBox);
    		
    		Thread.sleep(2000);
    		
    		//getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(keepUnpostedlinkBaseChkBox));
    		//keepUnpostedlinkBaseChkBox.click();
    		ClickUsingJs(keepUnpostedlinkBaseChkBox);
    		
    		Thread.sleep(2000);
    		
    		//getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(definitionOkBtn));
    		//definitionOkBtn.click();
    		ClickUsingJs(definitionOkBtn);
    		
    		Thread.sleep(2000);
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(tranAuthSaveBtn));
    		tranAuthSaveBtn.click();
    		
    		String expValidationMsg="Authorization Flow saved successfully.";
    		
    		String actValidationMsg=checkValidationMessage(expValidationMsg);
    		
    		Thread.sleep(2000);
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNameDropdown));
    		documentNameDropdown.sendKeys(Keys.END);
    		documentNameDropdown.sendKeys(Keys.SHIFT, Keys.HOME);
    		documentNameDropdown.sendKeys(" ");
    		
    		Thread.sleep(1000);
    			
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchasevoucherExpandbutton));
    		purchasevoucherExpandbutton.click();
    	
            getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchasevoucherTypeCreatedVoucher));
    		purchasevoucherTypeCreatedVoucher.click();
    		
    		Thread.sleep(3000);
    				
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
    		nameTxt.click();
    		
    		nameTxt.sendKeys(Keys.SPACE);
    		
    		int namecount1=tranAuthNameList.size();
			
			for(int i=0 ; i < namecount1 ;i++)
			{
				String data=tranAuthNameList.get(i).getText();
				
				if(data.equalsIgnoreCase("Purchase"))
				{
					tranAuthNameList.get(i).click();
					
					break;
				}
			}
				
    		nameTxt.sendKeys(Keys.TAB);
    			
    		Thread.sleep(3000);
    		
    		click(cnrBtn);
    		Thread.sleep(1000);
    		
    		ClickUsingJs(Level1editBtn);
    		Thread.sleep(1000);
    		
    		//getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(Level1editBtn));
    		//Level1editBtn.click();
    		
    		Thread.sleep(3000);
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(keepUnpostedReferencesChkBox));
    		((JavascriptExecutor)getDriver()).executeScript("arguments[0].scrollIntoView();", keepUnpostedReferencesChkBox);
    		
    		Thread.sleep(2000);
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(undoLinksChkBox));
    		undoLinksChkBox.click();
    		
    		Select undoAuthEditingDrpdwn = new Select(undoAuthorizationEditingDropdown);
    		undoAuthEditingDrpdwn.selectByVisibleText("None");
    		
    		Thread.sleep(2000);
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(definitionOkBtn));
    		definitionOkBtn.click();
    		
    		Thread.sleep(2000);
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(tranAuthSaveBtn));
    		tranAuthSaveBtn.click();
    		
    		String expValidationMsg1 = "Authorization Flow saved successfully.";
    		
    		String actValidationMsg1 = checkValidationMessage(expValidationMsg1);
    		
    		System.out.println("Validation Message : "+actValidationMsg +"  Value Expected : "+expValidationMsg);
    		System.out.println("Validation Message : "+actValidationMsg1+"  Value Expected : "+expValidationMsg1);
    		
    		if(actValidationMsg.equalsIgnoreCase(expValidationMsg) && actValidationMsg1.equalsIgnoreCase(expValidationMsg1))
    		{
    			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(tranAuthCancelBtn));
    			tranAuthCancelBtn.click();
    			return true;
    		}
    		else
    		{
    			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(tranAuthCancelBtn));
    			tranAuthCancelBtn.click();
    			return false;
    		}
    	}
		
		
		
		
		
		
		
		
		public static boolean checkSavingPurchaseVoucherNWithOutUndoAuthorizationOnEditingReservationOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
			financialsMenu.click();
					
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
			financialsTransactionMenu.click();
				
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
			financialsTransactionsPurchaseMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVoucherNew));
			purchaseVoucherNew.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
			newBtn.click();
			
			checkValidationMessage("Screen opened");
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseAccountTxt));
			purchaseAccountTxt.click();
			purchaseAccountTxt.sendKeys("Purchase");
			
			Thread.sleep(2000);
			
			purchaseAccountTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
			vendorAccountTxt.click();
			vendorAccountTxt.sendKeys("Vendor A");
			
			Thread.sleep(2000);
			
			vendorAccountTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
			departmentTxt.click();
			departmentTxt.sendKeys("INDIA");
			
			Thread.sleep(2000);
			
			departmentTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(wareHouseTxt));
			wareHouseTxt.click();
			wareHouseTxt.sendKeys("HYDERABAD");
			
			Thread.sleep(2000);
			
			wareHouseTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
			select1stRow_1stColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
			enter_ItemTxt.sendKeys("STD RATE COGS ITEM");
			Thread.sleep(3000);
			enter_ItemTxt.sendKeys(Keys.TAB);
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_5thColumn));
			select1stRow_5thColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
			enter_Quantity.sendKeys("5");
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_7thColumn));
			select1stRow_7thColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
			enter_Rate.sendKeys(Keys.END);
			enter_Rate.sendKeys(Keys.SHIFT, Keys.HOME);
			enter_Rate.sendKeys(Keys.BACK_SPACE);
			enter_Rate.sendKeys("10");
			enter_Rate.sendKeys(Keys.TAB);
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
			saveBtn.click();
			
			Thread.sleep(3000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
			billRefPickIcon.click();
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
			billRefOkBtn.click();
			
			
			String expMessage1= "Voucher saved successfully";
			String expMessage2= ": 1";
			
			String actMessage = checkValidationMessage(expMessage1);
			
		   System.out.println("************************************* checkSavingPurchaseVoucherNWithOutUndoAuthorizationOnEditingReservationOption  *********************************");
		   
		   System.out.println("SavingMessage  :  "+actMessage +" Value Expected : "+expMessage1+" "+expMessage2);
	
		   if(actMessage.startsWith(expMessage1) && actMessage.endsWith(expMessage2))
    		{
    			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
    			new_CloseBtn.click();
    			return true;
    		}
    		else
    		{
    			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
    			new_CloseBtn.click();
    			return false;
    		}
    	}
    	
    	
    	
    	
    	
		
    	public boolean checkAuthorizationStatusInVoucherHomePageWithOutUndoAuthorizationOnEditingReservationOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			int voucherGridDocNoCount = voucherGridDocNo.size();
			
			int actSavedVouchersCount = voucherGridDocNoCount-1;
			int expSavedVouchersCount = 1;
			
			String actAuthorizationStatus = voucherGridRow1AuthorizationStatus.getText();
			String expAuthorizationStatus = "Pending";
			
			System.out.println("************************************* checkAuthorizationStatusInVoucherHomePageWithOutUndoAuthorizationOnEditingReservationOption  *********************************");
			
			System.out.println("SavedVouchersCount   : "+actSavedVouchersCount   +" Value Expected : "+expSavedVouchersCount);
			System.out.println("AuthorizationStatus  : "+actAuthorizationStatus  +" Value Expected : "+expAuthorizationStatus);
			
			
			if(actSavedVouchersCount==expSavedVouchersCount && actAuthorizationStatus.equalsIgnoreCase(expAuthorizationStatus))
			{
				System.out.println("Test Pass : Authorization Status Succesfully");
				//excelReader.setCellData(xlfile, "SmokeSalesOrder", 627, 9, resPass);
				return true;
			}
			else
			{
				System.out.println("Test Fail : Authorization Statusis NOT Succesfully");
				//excelReader.setCellData(xlfile, "SmokeSalesOrder", 627, 9, resFail);
				return false;
			}
			
		}
			
			
			
			
		
		
		public static boolean checkLogoutAndLoginWithUserAllOptionsWithOutUndoAuthorizationOnEditingReservationOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
    	{
    		
    		
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplayLogo));
    		userNameDisplayLogo.click();
   		
   	     	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
   	     	logoutOption.click();

   	     	Thread.sleep(3000);
   	     	
    		LoginPage lp=new LoginPage(getDriver()); 
    		
    	    String unamelt="UserAllOptions";
    	  
    	    String pawslt="12345";
    	      
    	    lp.enterUserName(unamelt);
    	    
    	    lp.enterPassword(pawslt);
    	    
    	    lp.clickOnSignInBtn();
    	    
    	    //checkRefershPopOnlogin();
    	    
    	    //checkPopUpWindow();
    	  
    		Thread.sleep(6000);

    		String actUserInfo=userNameDisplay.getText();
    		
    		System.out.println("User Info  : "+actUserInfo);
    		
    		System.out.println("User Info Capture Text  :  "+userNameDisplay.getText());
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(companyLogo));
    		companyLogo.click();
    		
    		String getCompanyTxt=companyName.getText();
    		String getLoginCompanyName=getCompanyTxt.substring(0, 19);
    		System.out.println("company name  :  "+ getLoginCompanyName);
    		companyLogo.click();
    		
    		
    		String expUserInfo           ="UserAllOptions";
    		String expLoginCompanyName   ="Automation";
    		
    		
    		
    		boolean actDashboard = dashboard.isDisplayed();
    		boolean expDashboard = true;
    		
    		System.out.println("**********************************************checkLogoutAndLoginWithUserAllOptionsWithOutUndoAuthorizationOnEditingReservationOption*********************************************");
    		
    		System.out.println("User Info               : "+actUserInfo         +" Value Expected "+expUserInfo);
    		System.out.println("Login Company           : "+getLoginCompanyName +" Value Expected "+expLoginCompanyName);
    		System.out.println("Dashboard is Displaying : "+actDashboard        +" Value Expected "+expDashboard );

    		if (actUserInfo.equalsIgnoreCase(expUserInfo) && getLoginCompanyName.contains(expLoginCompanyName) && actDashboard==expDashboard) 
    		{
    			System.out.println("Login Successful");
				return true;
			}
    		else
    		{
    			System.out.println("Login Not Successful");
    			return false;
			}
    	}
		
		



		
		
		public static boolean checkPurchasesVoucherNAuthorizationStatusWithUserAllOptionsWithOutUndoAuthorizationOnEditingReservationOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
			financialsMenu.click();
					
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
			financialsTransactionMenu.click();
				
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
			financialsTransactionsPurchaseMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVoucherNew));
			purchaseVoucherNew.click();
			
			Thread.sleep(3000);
			
			int voucherGridDocNoCount = voucherGridDocNo.size();
			
			String actStatusRow1 = null;
			
			System.out.println("Size  : "+voucherGridDocNoCount);
			
			for (int i = 0; i < voucherGridDocNoCount; i++) 
			{
				String data = voucherGridDocNo.get(i).getText();
				
				if (data.equalsIgnoreCase("1")) 
				{
					 actStatusRow1 =  voucherGridAuthorizationStatus.get(i).getText();
				}
			}
			
			String expStatusRow1 = "Pending";
			
			Thread.sleep(2000);
			
			click(homePageVoucherArrowBtn);
			Thread.sleep(1000);

			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pendingAuthorizationPurchases));
			pendingAuthorizationPurchases.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherHomeRow1ChkBox));
			voucherHomeRow1ChkBox.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(authorizeBtn));
			authorizeBtn.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(authorizePopupOkBtn));
			authorizePopupOkBtn.click();
			
			Thread.sleep(3000);
			
			click(homePageVoucherArrowBtn);
			Thread.sleep(1000);

			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homePageAllVouchersView));
			homePageAllVouchersView.click();
			
			Thread.sleep(2000);
			
			String actAfterAuthorizeStatusRow1 = null;
			
			for (int i = 0; i < voucherGridDocNoCount; i++) 
			{
				String data = voucherGridDocNo.get(i).getText();
				
				if (data.equalsIgnoreCase("1")) 
				{
					 actAfterAuthorizeStatusRow1 =  voucherGridAuthorizationStatus.get(i).getText();
				}
			}
			
			String expAfterAuthorizeStatusRow1 = "Authorized";

			System.out.println("************************************* checkPurchasesVoucherNAuthorizationStatusWithUserAllOptionsWithOutUndoAuthorizationOnEditingReservationOption  *********************************");
			
			System.out.println("StatusRow1               : "+actStatusRow1				+" Value Expected : "+expStatusRow1);
			System.out.println("AfterAuthorizeStatusRow1 : "+actAfterAuthorizeStatusRow1+" Value Expected : "+expAfterAuthorizeStatusRow1);
			
			
			if(actStatusRow1.equalsIgnoreCase(expStatusRow1) && actAfterAuthorizeStatusRow1.equalsIgnoreCase(expAfterAuthorizeStatusRow1))
			{
				System.out.println("Test Pass : Authorized Succesfully");
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
				homeCloseBtn.click();
    			Thread.sleep(3000);
				//excelReader.setCellData(xlfile, "SmokeSalesOrder", 627, 9, resPass);
				return true;
			}
			else
			{
				System.out.println("Test Fail : NOT Authorized Succesfully");
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
				homeCloseBtn.click();
    			Thread.sleep(3000);
				//excelReader.setCellData(xlfile, "SmokeSalesOrder", 627, 9, resFail);
				return false;
			}
		}
		
		
		
		
		


		public static boolean checkLogoutAndLoginWithSUWithOutUndoAuthorizationOnEditingReservationOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
    	{
    		
    		
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplayLogo));
    		userNameDisplayLogo.click();
   		
   	     	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
   	     	logoutOption.click();

   	     	Thread.sleep(3000);
   	     	
    		LoginPage lp=new LoginPage(getDriver()); 
    		
    	    String unamelt="su";
    	  
    	    String pawslt="su";
    	      
    	    lp.enterUserName(unamelt);
    	    
    	    lp.enterPassword(pawslt);
    	    
    	    lp.clickOnSignInBtn();
    	    
    	    //checkRefershPopOnlogin();
    	    
    	    //checkPopUpWindow();
    	  
    		Thread.sleep(6000);

    		String actUserInfo=userNameDisplay.getText();
    		
    		System.out.println("User Info  : "+actUserInfo);
    		
    		System.out.println("User Info Capture Text  :  "+userNameDisplay.getText());
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(companyLogo));
    		companyLogo.click();
    		
    		String getCompanyTxt=companyName.getText();
    		String getLoginCompanyName=getCompanyTxt.substring(0, 19);
    		System.out.println("company name  :  "+ getLoginCompanyName);
    		companyLogo.click();
    		
    		
    		String expUserInfo           ="su";
    		String expLoginCompanyName   ="Automation";
    		
    		boolean actDashboard = dashboard.isDisplayed();
    		boolean expDashboard = true;
    		
    		System.out.println("**********************************************checkLogoutAndLoginWithUserAllOptionsWithOutUndoAuthorizationOnEditingReservationOption*********************************************");
    		
    		System.out.println("User Info               : "+actUserInfo         +" Value Expected "+expUserInfo);
    		System.out.println("Login Company           : "+getLoginCompanyName +" Value Expected "+expLoginCompanyName);
    		System.out.println("Dashboard is Displaying : "+actDashboard        +" Value Expected "+expDashboard );

    		if (actUserInfo.equalsIgnoreCase(expUserInfo) && getLoginCompanyName.contains(expLoginCompanyName) && actDashboard==expDashboard) 
    		{
    			System.out.println("Login Successful");
				return true;
			}
    		else
    		{
    			System.out.println("Login Not Successful");
    			return false;
			}
    	}
		
		
		
		


		public static boolean checkSavingSalesOrdersVoucher1WithOutUndoAuthorizationOnEditingReservationOptions() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
			inventoryMenu.click();
					
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsMenu));
			inventoryTransactionsMenu.click();
				
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoyTransactionsSalesMenu));
			inventoyTransactionsSalesMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesOrders));
			salesOrders.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
			newBtn.click();
			
			checkValidationMessage("Screen opened");
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerAccountTxt));
			customerAccountTxt.click();
			customerAccountTxt.sendKeys("Customer A");
			
			Thread.sleep(3000);
			
			customerAccountTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
			select1stRow_1stColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pvWareHouseTxt));
			pvWareHouseTxt.sendKeys("HYDERABAD");
			Thread.sleep(3000);
			pvWareHouseTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
			enter_ItemTxt.sendKeys("STD RATE COGS ITEM");
			Thread.sleep(3000);
			enter_ItemTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_5thColumn));
			select1stRow_5thColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_AQ));
			enter_AQ.sendKeys("5");
			enter_AQ.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_FQ));
			enter_FQ.sendKeys("5");
			enter_FQ.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
			enter_Quantity.sendKeys(Keys.TAB);

			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(stockReservationLabel));
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(stockRes_QtyToReserveRow1));
			stockRes_QtyToReserveRow1.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(res_PickBtn));
			res_PickBtn.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(res_OkBtn));
			res_OkBtn.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_10thColumn));
			select1stRow_10thColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
			enter_Rate.sendKeys(Keys.END);
			enter_Rate.sendKeys(Keys.SHIFT, Keys.HOME);
			enter_Rate.sendKeys(Keys.BACK_SPACE);
			enter_Rate.sendKeys("10");
			enter_Rate.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
			enter_Gross.sendKeys(Keys.TAB);
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
			saveBtn.click();
			
			
			String expMessage1= "Voucher saved successfully";
			String expMessage2= ": 1";
			
			String actMessage = checkValidationMessage(expMessage1);
			
			Thread.sleep(2000);
			
		   System.out.println("************************************* checkSavingSalesOrdersVoucher1WithOutUndoAuthorizationOnEditingReservationOptions  *********************************");
		   
		   System.out.println("SavingMessage  :  "+actMessage +" Value Expected : "+expMessage1+" "+expMessage2);
	
		   if(actMessage.startsWith(expMessage1) && actMessage.endsWith(expMessage2))
    		{
    			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
    			new_CloseBtn.click();
    			return true;
    		}
    		else
    		{
    			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
    			new_CloseBtn.click();
    			return false;
    		}
    	}
		
		
		
		
		
		
		
		
		public boolean checkAuthorizationStatusInHomePageAfterSavingVouchersWithOutUndoAuthorizationOnEditingReservationOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			int voucherGridDocNoCount = voucherGridDocNo.size();
			
			String actStatusRow1 = null;
			
			System.out.println("Size  : "+voucherGridDocNoCount);
			
			for (int i = 0; i < voucherGridDocNoCount; i++) 
			{
				String data = voucherGridDocNo.get(i).getText();
				
				if (data.equalsIgnoreCase("1")) 
				{
					 actStatusRow1 =  voucherGridAuthorizationStatus.get(i).getText();
				}
			}
			
			String expStatusRow1 = "Pending";
			
			System.out.println("************************************* checkAuthorizationStatusInHomePageAfterSavingVouchersWithOutUndoAuthorizationOnEditingReservationOption  *********************************");
			
			System.out.println("StatusRow1 : "+actStatusRow1+" Value Expected : "+expStatusRow1);
			
			if(actStatusRow1.equalsIgnoreCase(expStatusRow1))
			{
				System.out.println("Test Pass : Authorize Succesfully");
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
				homeCloseBtn.click();
				//excelReader.setCellData(xlfile, "SmokeSalesOrder", 627, 9, resPass);
				return true;
			}
			else
			{
				System.out.println("Test Fail : NOT Authorize Succesfully");
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
				homeCloseBtn.click();
				//excelReader.setCellData(xlfile, "SmokeSalesOrder", 627, 9, resFail);
				return false;
			}
		}
		
		
		
		
		
		
		
		
		public static boolean checkLogoutAndLoginWithUserAllOptionsWithOutUndoAuthorizationOnEditingReservationOptionAfterSavingSalesOrder() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
    	{
    		
    		
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplayLogo));
    		userNameDisplayLogo.click();
   		
   		
   	     	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
   	     	logoutOption.click();

   	     	Thread.sleep(3000);
    		
    		LoginPage lp=new LoginPage(getDriver()); 
    		
    	    String unamelt="UserAllOptions";
    	  
    	    String pawslt="12345";
    	      
    	    lp.enterUserName(unamelt);
    	    
    	    lp.enterPassword(pawslt);
    	    
    	    lp.clickOnSignInBtn();
    	    
    	    //checkRefershPopOnlogin();
    	    
    	    //checkPopUpWindow();
    	  
    		Thread.sleep(7000);

    		String actUserInfo=userNameDisplay.getText();
    		
    		System.out.println("User Info  : "+actUserInfo);
    		
    		System.out.println("User Info Capture Text  :  "+userNameDisplay.getText());
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(companyLogo));
    		companyLogo.click();
    		
    		String getCompanyTxt=companyName.getText();
    		String getLoginCompanyName=getCompanyTxt.substring(0, 19);
    		System.out.println("company name  :  "+ getLoginCompanyName);
    		companyLogo.click();
    		
    		boolean actDashboard = dashboard.isDisplayed();
    		
    		
    		String expUserInfo           ="UserAllOptions";
    		String expLoginCompanyName   ="Automation";
    		boolean expDashboard = true;

    		if (actUserInfo.equalsIgnoreCase(expUserInfo) && getLoginCompanyName.contains(expLoginCompanyName) && actDashboard==expDashboard) 
    		{
				return true;
			}
    		else
    		{
    			return false;
			}
    	}
    	
    	
    	
		
		
		
		
		public static boolean checkSalesOrderAuthorizationStatusWithUserAllOptionsWithOutUndoAuthorizationOnEditingReservationOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
			inventoryMenu.click();
					
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsMenu));
			inventoryTransactionsMenu.click();
				
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoyTransactionsSalesMenu));
			inventoyTransactionsSalesMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesOrders));
			salesOrders.click();
			
			Thread.sleep(3000);
			
			int voucherGridDocNoCount = voucherGridDocNo.size();
			
			String actStatusRow1 = null;
			
			System.out.println("Size  : "+voucherGridDocNoCount);
			
			for (int i = 0; i < voucherGridDocNoCount; i++) 
			{
				String data = voucherGridDocNo.get(i).getText();
				
				if (data.equalsIgnoreCase("1")) 
				{
					 actStatusRow1 =  voucherGridAuthorizationStatus.get(i).getText();
				}
			}
			
			String expStatusRow1 = "Pending";
			
			Thread.sleep(2000);
			
			click(homePageVoucherArrowBtn);
			Thread.sleep(1000);

			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pendingAuthorizationPurchases));
			pendingAuthorizationPurchases.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherHomeRow1ChkBox));
			voucherHomeRow1ChkBox.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(authorizeBtn));
			authorizeBtn.click();
			
			Thread.sleep(3000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
			
			click(homePageVoucherArrowBtn);
			Thread.sleep(1000);

			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(allVouchersOption));
			allVouchersOption.click();
		    
		    Thread.sleep(3000);
			
			String actAfterAuthorizeStatusRow1 = null;
			
			for (int i = 0; i < voucherGridDocNoCount; i++) 
			{
				String data = voucherGridDocNo.get(i).getText();
				
				if (data.equalsIgnoreCase("1")) 
				{
					 actAfterAuthorizeStatusRow1 =  voucherGridAuthorizationStatus.get(i).getText();
				}
			}
			
			String expAfterAuthorizeStatusRow1 = "Authorized";
			
			System.out.println("************************************* checkSalesOrderAuthorizationStatusWithUserAllOptionsWithOutUndoAuthorizationOnEditingReservationOption  *********************************");
			
			System.out.println("StatusRow1               : "+actStatusRow1				+" Value Expected : "+expStatusRow1);
			System.out.println("AfterAuthorizeStatusRow1 : "+actAfterAuthorizeStatusRow1+" Value Expected : "+expAfterAuthorizeStatusRow1);
			
			
			if(actStatusRow1.equalsIgnoreCase(expStatusRow1) && actAfterAuthorizeStatusRow1.equalsIgnoreCase(expAfterAuthorizeStatusRow1))
			{
				System.out.println("Test Pass : Authorized Succesfully");
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
				homeCloseBtn.click();
    			Thread.sleep(3000);
				//excelReader.setCellData(xlfile, "SmokeSalesOrder", 627, 9, resPass);
				return true;
			}
			else
			{
				System.out.println("Test Fail : NOT Authorized Succesfully");
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
				homeCloseBtn.click();
    			Thread.sleep(3000);
				//excelReader.setCellData(xlfile, "SmokeSalesOrder", 627, 9, resFail);
				return false;
			}
			
		}
			
	
		
		
		
		
		
		public static boolean checkLogoutAndLoginWithSUToCheckAuthorizationStatusWithOutUndoAuthorizationOnEditingReservationOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
    	{
    		
    		
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplayLogo));
    		userNameDisplayLogo.click();
   		
   	     	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
   	     	logoutOption.click();

   	     	Thread.sleep(3000);
    		
    		LoginPage lp=new LoginPage(getDriver()); 
    		
    	    String unamelt="su";
    	  
    	    String pawslt="su";
    	      
    	    lp.enterUserName(unamelt);
    	    
    	    lp.enterPassword(pawslt);
    	    
    	    lp.clickOnSignInBtn();
    	    
    	    //checkRefershPopOnlogin();
    	    
    	    //checkPopUpWindow();
    	  
    		Thread.sleep(7000);

    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
			inventoryMenu.click();
					
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsMenu));
			inventoryTransactionsMenu.click();
				
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoyTransactionsSalesMenu));
			inventoyTransactionsSalesMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesOrders));
			salesOrders.click();
			
			Thread.sleep(3000);
			
			int voucherGridDocNoCount = voucherGridDocNo.size();
			
			String actStatusRow1 = null;
			
			System.out.println("Size  : "+voucherGridDocNoCount);
			
			for (int i = 0; i < voucherGridDocNoCount; i++) 
			{
				String data = voucherGridDocNo.get(i).getText();
				
				if (data.equalsIgnoreCase("1")) 
				{
					 actStatusRow1 =  voucherGridAuthorizationStatus.get(i).getText();
				}
			}
			
			String expStatusRow1 = "Authorized";
			
			
			System.out.println("************************************* checkLogoutAndLoginWithSUToCheckAuthorizationStatusWithOutUndoAuthorizationOnEditingReservationOption  *********************************");
			
			System.out.println("StatusRow1 : "+actStatusRow1+" Value Expected : "+expStatusRow1);
			
			if(actStatusRow1.equalsIgnoreCase(expStatusRow1))
			{
				//excelReader.setCellData(xlfile, "SmokeSalesOrder", 627, 9, resPass);
				return true;
			}
			else
			{
				//excelReader.setCellData(xlfile, "SmokeSalesOrder", 627, 9, resFail);
				return false;
			}
		}
		
		
		
		
		
		
		
		
		
		public static boolean checkEditingSalesOrdersVoucher1WithOutUndoAuthorizationOnEditingReservationOptions() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(grid_ChkBox1));
			getAction().doubleClick(grid_ChkBox1).build().perform();
					
			checkValidationMessage("Voucher loaded successfully");
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_5thColumn));
			select1stRow_5thColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_AQ));
			enter_AQ.sendKeys("6");
			enter_AQ.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_FQ));
			enter_FQ.sendKeys("6");
			enter_FQ.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
			enter_Quantity.sendKeys(Keys.TAB);

			Thread.sleep(2000);
			
			//getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Reserve));
			//enter_Reserve.sendKeys(Keys.SPACE);
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(stockReservationLabel));
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(stockRes_QtyToReserveRow1));
			stockRes_QtyToReserveRow1.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(res_PickBtn));
			res_PickBtn.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(res_OkBtn));
			res_OkBtn.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
			enter_Rate.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
			enter_Gross.sendKeys(Keys.TAB);
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
			saveBtn.click();
			
			
			String expMessage1= "Voucher saved successfully";
			String expMessage2= ": 1";
			
			String actMessage = checkValidationMessage(expMessage1);
			
			Thread.sleep(2000);
			
		   System.out.println("************************************* checkSavingSalesOrdersVoucher1WithOutUndoAuthorizationOnEditingReservationOptions  *********************************");
		   
		   System.out.println("SavingMessage  :  "+actMessage +" Value Expected : "+expMessage1+" "+expMessage2);
	
		   if(actMessage.startsWith(expMessage1) && actMessage.endsWith(expMessage2))
    		{
    			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
    			new_CloseBtn.click();
    			Thread.sleep(2000);
    			return true;
    		}
    		else
    		{
    			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
    			new_CloseBtn.click();
    			Thread.sleep(2000);
    			return false;
    		}
    	}
		
		
		
		
		
		
		
		
		
		public boolean checkAuthorizationStatusInHomePageAfterEditingVouchersWithOutUndoAuthorizationOnEditingReservationOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
			
			click(homePageVoucherArrowBtn);
			Thread.sleep(1000);

			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(allVouchersOption));
			allVouchersOption.click();
		    
		    Thread.sleep(3000);
		    
			int voucherGridDocNoCount = voucherGridDocNo.size();
			
			String actStatusRow1 = null;
			
			System.out.println("Size  : "+voucherGridDocNoCount);
			
			for (int i = 0; i < voucherGridDocNoCount; i++) 
			{
				String data = voucherGridDocNo.get(i).getText();
				
				if (data.equalsIgnoreCase("1")) 
				{
					 actStatusRow1 =  voucherGridAuthorizationStatus.get(i).getText();
				}
			}
			
			String expStatusRow1 = "Authorized";
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(grid_ChkBox1));
			grid_ChkBox1.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(deleteBtn));
			deleteBtn.click();

			getWaitForAlert();
			getAlert().accept();
			
			
			String expMsg = "VoucherNo - 1: Voucher deleted Successfully";
			
			String actMsg = checkValidationMessage(expMsg);
			
			System.out.println("************************************* checkAuthorizationStatusInHomePageAfterSavingVouchersWithOutUndoAuthorizationOnEditingReservationOption  *********************************");
			
			System.out.println("StatusRow1      : "+actStatusRow1+" Value Expected : "+expStatusRow1);
			System.out.println("Voucher Deleted : "+actMsg       +" Value Expected : "+expMsg);
			
			if(actStatusRow1.equalsIgnoreCase(expStatusRow1) && actMsg.equalsIgnoreCase(expMsg))
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
				homeCloseBtn.click();
				return true;
			}
			else
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
				homeCloseBtn.click();
				return false;
			}
		}
		
		
		
		
		
		
		
		
		
		public boolean 	checkTransactionAuthorizationSalesOrderDocumentWithUndoAuthorizationOnEditingReservationOptions() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
    	{
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsmenuBtn));
    		settingsmenuBtn.click();
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(transactionAuthorizationBtn));
    		transactionAuthorizationBtn.click();
    		
    		Thread.sleep(2000);
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNameDropdown));
    		documentNameDropdown.sendKeys(" ");
    		
    		Thread.sleep(1000);
    			
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNameSalesOrders1));
    		documentNameSalesOrders1.click();
    		
    		Thread.sleep(3000);
    				
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
    		nameTxt.click();
    		
    		nameTxt.sendKeys(Keys.SPACE);
    		
    		int namecount=tranAuthNameList.size();
			
			for(int i=0 ; i < namecount ;i++)
			{
				String data=tranAuthNameList.get(i).getText();
				
				if(data.equalsIgnoreCase("Sales"))
				{
					tranAuthNameList.get(i).click();
					
					break;
				}
			}
				
    		nameTxt.sendKeys(Keys.TAB);
    			
    		Thread.sleep(2000);
    		
    		click(cnrBtn);
    		Thread.sleep(1000);
    		
    		ClickUsingJs(Level1editBtn);
    		Thread.sleep(1000);

    		
    		//getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(Level1editBtn));
    		//Level1editBtn.click();
    		
    		Thread.sleep(2000);
    		ScrollToElement(undoReservationChkBox);
    		
    		//getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(undoReservationChkBox));
    		//undoReservationChkBox.click();
    		ClickUsingJs(undoReservationChkBox);
    		
    		Select undoAuthEditingDrpdwn = new Select(undoAuthorizationEditingDropdown);
    		undoAuthEditingDrpdwn.selectByVisibleText("Full");
    		
    		Thread.sleep(2000);
    		ScrollToElement(definitionOkBtn);
    		//getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(definitionOkBtn));
    		//definitionOkBtn.click();
    		ClickUsingJs(definitionOkBtn);
    		
    		Thread.sleep(2000);
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(tranAuthSaveBtn));
    		tranAuthSaveBtn.click();
    		
    		
    		String expValidationMsg="Authorization Flow saved successfully.";
    		
    		String actValidationMsg=checkValidationMessage(expValidationMsg);
    		
    		System.out.println("Validation Message : "+actValidationMsg +"  Value Expected : "+expValidationMsg);
    		
    		if(actValidationMsg.equalsIgnoreCase(expValidationMsg))
    		{
    			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(tranAuthCancelBtn));
    			tranAuthCancelBtn.click();
    			return true;
    		}
    		else
    		{
    			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(tranAuthCancelBtn));
    			tranAuthCancelBtn.click();
    			return false;
    		}
    	}
		
		
		
		
		


		
		
		public static boolean checkSavingSalesOrdersVoucher1WithUndoAuthorizationOnEditingReservationOptions() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
			inventoryMenu.click();
					
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsMenu));
			inventoryTransactionsMenu.click();
				
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoyTransactionsSalesMenu));
			inventoyTransactionsSalesMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesOrders));
			salesOrders.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
			newBtn.click();
			
			checkValidationMessage("Screen opened");
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerAccountTxt));
			customerAccountTxt.click();
			customerAccountTxt.sendKeys("Customer A");
			
			Thread.sleep(3000);
			
			customerAccountTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
			select1stRow_1stColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pvWareHouseTxt));
			pvWareHouseTxt.sendKeys("HYDERABAD");
			Thread.sleep(3000);
			pvWareHouseTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
			enter_ItemTxt.sendKeys("STD RATE COGS ITEM");
			Thread.sleep(3000);
			enter_ItemTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_5thColumn));
			select1stRow_5thColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_AQ));
			enter_AQ.sendKeys("5");
			enter_AQ.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_FQ));
			enter_FQ.sendKeys("5");
			enter_FQ.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
			enter_Quantity.sendKeys(Keys.TAB);

			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(stockReservationLabel));
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(stockRes_QtyToReserveRow1));
			stockRes_QtyToReserveRow1.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(res_PickBtn));
			res_PickBtn.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(res_OkBtn));
			res_OkBtn.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_10thColumn));
			select1stRow_10thColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
			enter_Rate.sendKeys(Keys.END);
			enter_Rate.sendKeys(Keys.SHIFT, Keys.HOME);
			enter_Rate.sendKeys(Keys.BACK_SPACE);
			enter_Rate.sendKeys("10");
			enter_Rate.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
			enter_Gross.sendKeys(Keys.TAB);
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
			saveBtn.click();
			
			
			String expMessage1= "Voucher saved successfully";
			String expMessage2= ": 1";
			
			String actMessage = checkValidationMessage(expMessage1);
			
			Thread.sleep(2000);
			
		   System.out.println("************************************* checkSavingSalesOrdersVoucher1WithUndoAuthorizationOnEditingReservationOptions  *********************************");
		   
		   System.out.println("SavingMessage  :  "+actMessage +" Value Expected : "+expMessage1+" "+expMessage2);
	
		   if(actMessage.startsWith(expMessage1) && actMessage.endsWith(expMessage2))
    		{
    			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
    			new_CloseBtn.click();
    			return true;
    		}
    		else
    		{
    			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
    			new_CloseBtn.click();
    			return false;
    		}
    	}
		
		
		
		
		
		
		
		
		
		
		public boolean checkAuthorizationStatusInHomePageAfterSavingVouchersWithUndoAuthorizationOnEditingReservationOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			int voucherGridDocNoCount = voucherGridDocNo.size();
			
			String actStatusRow1 = null;
			
			System.out.println("Size  : "+voucherGridDocNoCount);
			
			for (int i = 0; i < voucherGridDocNoCount; i++) 
			{
				String data = voucherGridDocNo.get(i).getText();
				
				if (data.equalsIgnoreCase("1")) 
				{
					 actStatusRow1 =  voucherGridAuthorizationStatus.get(i).getText();
				}
			}
			
			String expStatusRow1 = "Pending";
			
			System.out.println("************************************* checkAuthorizationStatusInHomePageAfterSavingVouchersWithUndoAuthorizationOnEditingReservationOption  *********************************");
			
			System.out.println("StatusRow1 : "+actStatusRow1+" Value Expected : "+expStatusRow1);
			
			if(actStatusRow1.equalsIgnoreCase(expStatusRow1))
			{
				System.out.println("Test Pass : Authorize Succesfully");
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
				homeCloseBtn.click();
				//excelReader.setCellData(xlfile, "SmokeSalesOrder", 627, 9, resPass);
				return true;
			}
			else
			{
				System.out.println("Test Fail : NOT Authorize Succesfully");
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
				homeCloseBtn.click();
				//excelReader.setCellData(xlfile, "SmokeSalesOrder", 627, 9, resFail);
				return false;
			}
		}
		
		
		
		
		
		
		
		
		public static boolean checkLogoutAndLoginWithUserAllOptionsWithUndoAuthorizationOnEditingReservationOptionAfterSavingSalesOrder() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
    	{
    		
    		
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplayLogo));
    		userNameDisplayLogo.click();
   		
   		
   	     	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
   	     	logoutOption.click();

   	     	Thread.sleep(3000);
    		
    		LoginPage lp=new LoginPage(getDriver()); 
    		
    	    String unamelt="UserAllOptions";
    	  
    	    String pawslt="12345";
    	      
    	    lp.enterUserName(unamelt);
    	    
    	    lp.enterPassword(pawslt);
    	    
    	    lp.clickOnSignInBtn();
    	    
    	    //checkRefershPopOnlogin();
    	    
    	    //checkPopUpWindow();
    	  
    		Thread.sleep(7000);

    		String actUserInfo=userNameDisplay.getText();
    		
    		System.out.println("User Info  : "+actUserInfo);
    		
    		System.out.println("User Info Capture Text  :  "+userNameDisplay.getText());
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(companyLogo));
    		companyLogo.click();
    		
    		String getCompanyTxt=companyName.getText();
    		String getLoginCompanyName=getCompanyTxt.substring(0, 19);
    		System.out.println("company name  :  "+ getLoginCompanyName);
    		companyLogo.click();
    		
    		boolean actDashboard = dashboard.isDisplayed();
    		
    		
    		String expUserInfo           ="UserAllOptions";
    		String expLoginCompanyName   ="Automation";
    		boolean expDashboard = true;

    		if (actUserInfo.equalsIgnoreCase(expUserInfo) && getLoginCompanyName.contains(expLoginCompanyName) && actDashboard==expDashboard) 
    		{
				return true;
			}
    		else
    		{
    			return false;
			}
    	}
    	
    	
    	
		
		
		
		
		public static boolean checkSalesOrderAuthorizationStatusWithUserAllOptionsWithUndoAuthorizationOnEditingReservationOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
			inventoryMenu.click();
					
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsMenu));
			inventoryTransactionsMenu.click();
				
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoyTransactionsSalesMenu));
			inventoyTransactionsSalesMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesOrders));
			salesOrders.click();
			
			Thread.sleep(3000);
			
			int voucherGridDocNoCount = voucherGridDocNo.size();
			
			String actStatusRow1 = null;
			
			System.out.println("Size  : "+voucherGridDocNoCount);
			
			for (int i = 0; i < voucherGridDocNoCount; i++) 
			{
				String data = voucherGridDocNo.get(i).getText();
				
				if (data.equalsIgnoreCase("1")) 
				{
					 actStatusRow1 =  voucherGridAuthorizationStatus.get(i).getText();
				}
			}
			
			String expStatusRow1 = "Pending";
			
			Thread.sleep(2000);
			
			click(homePageVoucherArrowBtn);
			Thread.sleep(1000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pendingAuthorizationPurchases));
			pendingAuthorizationPurchases.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherHomeRow1ChkBox));
			voucherHomeRow1ChkBox.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(authorizeBtn));
			authorizeBtn.click();
			
			Thread.sleep(3000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
			
			click(homePageVoucherArrowBtn);
			Thread.sleep(1000);
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(allVouchersOption));
			allVouchersOption.click();
		    
		    Thread.sleep(3000);
			
			String actAfterAuthorizeStatusRow1 = null;
			
			for (int i = 0; i < voucherGridDocNoCount; i++) 
			{
				String data = voucherGridDocNo.get(i).getText();
				
				if (data.equalsIgnoreCase("1")) 
				{
					 actAfterAuthorizeStatusRow1 =  voucherGridAuthorizationStatus.get(i).getText();
				}
			}
			
			String expAfterAuthorizeStatusRow1 = "Authorized";
			
			System.out.println("************************************* checkSalesOrderAuthorizationStatusWithUserAllOptionsWithUndoAuthorizationOnEditingReservationOption  *********************************");
			
			System.out.println("StatusRow1               : "+actStatusRow1				+" Value Expected : "+expStatusRow1);
			System.out.println("AfterAuthorizeStatusRow1 : "+actAfterAuthorizeStatusRow1+" Value Expected : "+expAfterAuthorizeStatusRow1);
			
			
			if(actStatusRow1.equalsIgnoreCase(expStatusRow1) && actAfterAuthorizeStatusRow1.equalsIgnoreCase(expAfterAuthorizeStatusRow1))
			{
				System.out.println("Test Pass : Authorized Succesfully");
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
				homeCloseBtn.click();
    			Thread.sleep(3000);
				//excelReader.setCellData(xlfile, "SmokeSalesOrder", 627, 9, resPass);
				return true;
			}
			else
			{
				System.out.println("Test Fail : NOT Authorized Succesfully");
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
				homeCloseBtn.click();
    			Thread.sleep(3000);
				//excelReader.setCellData(xlfile, "SmokeSalesOrder", 627, 9, resFail);
				return false;
			}
			
		}
			
	
		
		
		
		
		
		public static boolean checkLogoutAndLoginWithSUToCheckAuthorizationStatusWithUndoAuthorizationOnEditingReservationOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
    	{
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplayLogo));
    		userNameDisplayLogo.click();
   		
   	     	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
   	     	logoutOption.click();

   	     	Thread.sleep(3000);
    		
    		LoginPage lp=new LoginPage(getDriver()); 
    		
    	    String unamelt="su";
    	  
    	    String pawslt="su";
    	      
    	    lp.enterUserName(unamelt);
    	    
    	    lp.enterPassword(pawslt);
    	    
    	    lp.clickOnSignInBtn();
    	    
    	    //checkRefershPopOnlogin();
    	    
    	    //checkPopUpWindow();
    	  
    		Thread.sleep(6000);

    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
			inventoryMenu.click();
					
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsMenu));
			inventoryTransactionsMenu.click();
				
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoyTransactionsSalesMenu));
			inventoyTransactionsSalesMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesOrders));
			salesOrders.click();
			
			Thread.sleep(3000);
			
			int voucherGridDocNoCount = voucherGridDocNo.size();
			
			String actStatusRow1 = null;
			
			System.out.println("Size  : "+voucherGridDocNoCount);
			
			for (int i = 0; i < voucherGridDocNoCount; i++) 
			{
				String data = voucherGridDocNo.get(i).getText();
				
				if (data.equalsIgnoreCase("1")) 
				{
					 actStatusRow1 =  voucherGridAuthorizationStatus.get(i).getText();
				}
			}
			
			String expStatusRow1 = "Authorized";
			
			System.out.println("************************************* checkLogoutAndLoginWithSUToCheckAuthorizationStatusWithUndoAuthorizationOnEditingReservationOption  *********************************");
			
			System.out.println("StatusRow1 : "+actStatusRow1+" Value Expected : "+expStatusRow1);
			
			if(actStatusRow1.equalsIgnoreCase(expStatusRow1))
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		
		
		
		
		
		
		
		
		
		public static boolean checkEditingSalesOrdersVoucher1WithUndoAuthorizationOnEditingReservationOptions() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(grid_ChkBox1));
			getAction().doubleClick(grid_ChkBox1).build().perform();
					
			checkValidationMessage("Voucher loaded successfully");
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_5thColumn));
			select1stRow_5thColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_AQ));
			enter_AQ.sendKeys("6");
			enter_AQ.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_FQ));
			enter_FQ.sendKeys("6");
			enter_FQ.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
			enter_Quantity.sendKeys(Keys.TAB);

			Thread.sleep(2000);
			
			//getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Reserve));
			//enter_Reserve.sendKeys(Keys.SPACE);
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(stockReservationLabel));
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(stockRes_QtyToReserveRow1));
			stockRes_QtyToReserveRow1.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(res_PickBtn));
			res_PickBtn.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(res_OkBtn));
			res_OkBtn.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
			enter_Rate.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
			enter_Gross.sendKeys(Keys.TAB);
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
			saveBtn.click();
			
			
			String expMessage1= "Voucher saved successfully";
			String expMessage2= ": 1";
			
			String actMessage = checkValidationMessage(expMessage1);
			
			Thread.sleep(2000);
			
		   System.out.println("************************************* checkSavingSalesOrdersVoucher1WithUndoAuthorizationOnEditingReservationOptions  *********************************");
		   
		   System.out.println("SavingMessage  :  "+actMessage +" Value Expected : "+expMessage1+" "+expMessage2);
	
		   getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
		   new_CloseBtn.click();
			
		   Thread.sleep(2000);
			
		   if(actMessage.startsWith(expMessage1) && actMessage.endsWith(expMessage2))
    		{
    			return true;
    		}
    		else
    		{
    			return false;
    		}
    	}
		
		
		
		
		
		
		
		public boolean checkAuthorizationStatusInHomePageAfterEditingVouchersWithUndoAuthorizationOnEditingReservationOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
			
			/*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(allVouchersOption));
			allVouchersOption.click();*/
		    
		    Thread.sleep(3000);
		    
			int voucherGridDocNoCount = voucherGridDocNo.size();
			
			String actStatusRow1 = null;
			
			System.out.println("Size  : "+voucherGridDocNoCount);
			
			for (int i = 0; i < voucherGridDocNoCount; i++) 
			{
				String data = voucherGridDocNo.get(i).getText();
				
				if (data.equalsIgnoreCase("1")) 
				{
					 actStatusRow1 =  voucherGridAuthorizationStatus.get(i).getText();
				}
			}
			
			String expStatusRow1 = "Pending";
			
			System.out.println("************************************* checkAuthorizationStatusInHomePageAfterSavingVouchersWithUndoAuthorizationOnEditingReservationOption  *********************************");
			
			System.out.println("StatusRow1      : "+actStatusRow1+" Value Expected : "+expStatusRow1);
			
			if(actStatusRow1.equalsIgnoreCase(expStatusRow1))
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
				homeCloseBtn.click();
				Thread.sleep(2000);
				return true;
			}
			else
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
				homeCloseBtn.click();
				Thread.sleep(2000);
				return false;
			}
		}
		
		
		
		
		
		
		public boolean checkEraseAllTransactionsWithUndoAuthorizationOnEditingReservationOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
			homeMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dataMangementMenu));
			dataMangementMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(eraseAll));
			eraseAll.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(eraseTranscationsRadio));
			eraseTranscationsRadio.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(eraseAllOkBtn));
			eraseAllOkBtn.click();
			
			if(getIsAlertPresent())
			{
				getWaitForAlert();
				getAlert().accept();
			}
			
			String expValidationMsg="Data deleted successfully.";
			
			String actValidationMsg=checkValidationMessage(expValidationMsg);
			
			System.out.println("************************************* checkEraseAllTransactionsWithUndoAuthorizationOnEditingReservationOption  *********************************");
			System.out.println("Message  :  "+actValidationMsg +" Value Expected : "+expValidationMsg);
			
			if (actValidationMsg.equalsIgnoreCase(expValidationMsg))
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
				sl_CloseBtn.click();
				return true;
			}
			else
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
				sl_CloseBtn.click();
				return false;
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		// Undo Authorization on Editing Reservations Batch/RMA/Bin
		
		public static boolean checkSavingPurchaseVoucherNWithBatchItemWithOutUndoAuthorizationOnEditingBatchBinRMAOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
			financialsMenu.click();
					
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
			financialsTransactionMenu.click();
				
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
			financialsTransactionsPurchaseMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVoucherNew));
			purchaseVoucherNew.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
			newBtn.click();
			
			checkValidationMessage("Screen opened");
			

			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseAccountTxt));
			purchaseAccountTxt.click();
			purchaseAccountTxt.sendKeys("Purchase");
			
			Thread.sleep(2000);
			
			purchaseAccountTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
			vendorAccountTxt.click();
			vendorAccountTxt.sendKeys("Vendor A");
			
			Thread.sleep(2000);
			
			vendorAccountTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
			departmentTxt.click();
			departmentTxt.sendKeys("INDIA");
			
			Thread.sleep(2000);
			
			departmentTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(wareHouseTxt));
			wareHouseTxt.click();
			wareHouseTxt.sendKeys("HYDERABAD");
			
			Thread.sleep(2000);
			
			wareHouseTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
			select1stRow_1stColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
			enter_ItemTxt.sendKeys("BR COGS ITEM");
			Thread.sleep(3000);
			enter_ItemTxt.sendKeys(Keys.TAB);
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_5thColumn));
			select1stRow_5thColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
			enter_Quantity.sendKeys("1");
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_7thColumn));
			select1stRow_7thColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
			enter_Rate.sendKeys(Keys.END);
			enter_Rate.sendKeys(Keys.SHIFT, Keys.HOME);
			enter_Rate.sendKeys(Keys.BACK_SPACE);
			enter_Rate.sendKeys("10");
			enter_Rate.sendKeys(Keys.TAB);
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
			enter_Gross.sendKeys(Keys.TAB);
			
			Thread.sleep(2000);
			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_10thColumn));
			select1stRow_10thColumn.click();
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Batch));
			enter_Batch.sendKeys("Batch#1");
			enter_Batch.sendKeys(Keys.TAB);
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
			saveBtn.click();
			
			Thread.sleep(3000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
			billRefPickIcon.click();
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
			billRefOkBtn.click();
			
			
			String expMessage1= "Voucher saved successfully";
			String expMessage2= ": 1";
			
			String actMessage = checkValidationMessage(expMessage1);
			
		   System.out.println("************************************* checkSavingPurchaseVoucherNWithBatchItemWithOutUndoAuthorizationOnEditingBatchBinRMAOption  *********************************");
		   
		   System.out.println("SavingMessage  :  "+actMessage +" Value Expected : "+expMessage1+" "+expMessage2);
	
		   if(actMessage.startsWith(expMessage1) && actMessage.endsWith(expMessage2))
    		{
    			return true;
    		}
    		else
    		{
    			return false;
    		}
    	}
    	
		
		
		
		
		
		
		
		public static boolean checkSavingPurchaseVoucherNWithRMAItemWithOutUndoAuthorizationOnEditingBatchBinRMAOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseAccountTxt));
			purchaseAccountTxt.click();
			purchaseAccountTxt.sendKeys("Purchase");
			
			Thread.sleep(2000);
			
			purchaseAccountTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
			vendorAccountTxt.click();
			vendorAccountTxt.sendKeys("Vendor A");
			
			Thread.sleep(2000);
			
			vendorAccountTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
			departmentTxt.click();
			departmentTxt.sendKeys("INDIA");
			
			Thread.sleep(2000);
			
			departmentTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(wareHouseTxt));
			wareHouseTxt.click();
			wareHouseTxt.sendKeys("HYDERABAD");
			
			Thread.sleep(2000);
			
			wareHouseTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
			select1stRow_1stColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
			enter_ItemTxt.sendKeys("WA COGS ITEM");
			Thread.sleep(3000);
			enter_ItemTxt.sendKeys(Keys.TAB);
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_5thColumn));
			select1stRow_5thColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
			enter_Quantity.sendKeys("12");
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_7thColumn));
			select1stRow_7thColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
			enter_Rate.sendKeys(Keys.END);
			enter_Rate.sendKeys(Keys.SHIFT, Keys.HOME);
			enter_Rate.sendKeys(Keys.BACK_SPACE);
			enter_Rate.sendKeys("10");
			enter_Rate.sendKeys(Keys.TAB);
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
			enter_Gross.sendKeys(Keys.TAB);
			
			Thread.sleep(2000);
			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_13thColumn));
			select1stRow_13thColumn.click();
			
			enter_RMA.sendKeys(Keys.SPACE);
			
			getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(rmaScreenTitle));
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaSerialNumberTxtField));
			rmaSerialNumberTxtField.click();
			//rmaSerialNumberTxtField.sendKeys(Keys.SPACE);
			rmaSerialNumberTxtField.sendKeys("RMA#1,12");
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaAddBtn));
			rmaAddBtn.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaOkBtn));
			rmaOkBtn.click();
			
			Thread.sleep(2000);
			
			/*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_RMA));
			enter_RMA.sendKeys(Keys.TAB);*/
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
			saveBtn.click();
			
			Thread.sleep(3000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
			billRefPickIcon.click();
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
			billRefOkBtn.click();
			
			
			String expMessage1= "Voucher saved successfully";
			String expMessage2= ": 2";
			
			String actMessage = checkValidationMessage(expMessage1);
			
		   System.out.println("************************************* checkSavingPurchaseVoucherNWithRMAItemWithOutUndoAuthorizationOnEditingBatchBinRMAOption  *********************************");
		   
		   System.out.println("SavingMessage  :  "+actMessage +" Value Expected : "+expMessage1+" "+expMessage2);
	
		   if(actMessage.startsWith(expMessage1) && actMessage.endsWith(expMessage2))
    		{
    			return true;
    		}
    		else
    		{
    			return false;
    		}
    	}
		
		
		
		
		
		
		
		
		
		
		public static boolean checkSavingPurchaseVoucherNWithBinItemWithOutUndoAuthorizationOnEditingBatchBinRMAOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseAccountTxt));
			purchaseAccountTxt.click();
			purchaseAccountTxt.sendKeys("Purchase");
			
			Thread.sleep(2000);
			
			purchaseAccountTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
			vendorAccountTxt.click();
			vendorAccountTxt.sendKeys("Vendor A");
			
			Thread.sleep(2000);
			
			vendorAccountTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
			departmentTxt.click();
			departmentTxt.sendKeys("INDIA");
			
			Thread.sleep(2000);
			
			departmentTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(wareHouseTxt));
			wareHouseTxt.click();
			wareHouseTxt.sendKeys("HYDERABAD");
			
			Thread.sleep(2000);
			
			wareHouseTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
			select1stRow_1stColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
			enter_ItemTxt.sendKeys("FIFO COGS ITEM");
			Thread.sleep(3000);
			enter_ItemTxt.sendKeys(Keys.TAB);
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_5thColumn));
			select1stRow_5thColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
			enter_Quantity.sendKeys("1");
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_7thColumn));
			select1stRow_7thColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
			enter_Rate.sendKeys(Keys.END);
			enter_Rate.sendKeys(Keys.SHIFT, Keys.HOME);
			enter_Rate.sendKeys(Keys.BACK_SPACE);
			enter_Rate.sendKeys("10");
			enter_Rate.sendKeys(Keys.TAB);
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
			enter_Gross.sendKeys(Keys.TAB);
			
			Thread.sleep(2000);
			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_11thColumn));
			select1stRow_11thColumn.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binSearchTxt));
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binSearchBtn));
			binSearchBtn.click();
			
			Thread.sleep(2000);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binselect2ndRow_1stColumn));
			getAction().doubleClick(binselect2ndRow_1stColumn).build().perform();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binOkBtn));
			binOkBtn.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
			saveBtn.click();
			
			Thread.sleep(3000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
			billRefPickIcon.click();
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
			billRefOkBtn.click();
			
			
			String expMessage1= "Voucher saved successfully";
			String expMessage2= ": 3";
			
			String actMessage = checkValidationMessage(expMessage1);
			
		   System.out.println("************************************* checkSavingPurchaseVoucherNWithBinItemWithOutUndoAuthorizationOnEditingBatchBinRMAOption  *********************************");
		   
		   System.out.println("SavingMessage  :  "+actMessage +" Value Expected : "+expMessage1+" "+expMessage2);
	
		   if(actMessage.startsWith(expMessage1) && actMessage.endsWith(expMessage2))
    		{
			   getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
			   new_CloseBtn.click();
    			return true;
    		}
    		else
    		{
    			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
 			    new_CloseBtn.click();
    			return false;
    		}
    	}
		
		
		
		
		
		
		
		
		public boolean checkAuthorizationStatusInHomePageAfterSavingVouchersWithOutUndoAuthorizationOnEditingBatchBinRMAOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			int voucherGridDocNoCount = voucherGridDocNo.size();
			
			String actStatusRow1 = null;
			String actStatusRow2 = null;
			String actStatusRow3 = null;
			
			System.out.println("Size  : "+voucherGridDocNoCount);
			
			for (int i = 0; i < voucherGridDocNoCount; i++) 
			{
				String data = voucherGridDocNo.get(i).getText();
				
				if (data.equalsIgnoreCase("1")) 
				{
					 actStatusRow1 =  voucherGridAuthorizationStatus.get(i).getText();
				}
				
				if (data.equalsIgnoreCase("2")) 
				{
					 actStatusRow2 =  voucherGridAuthorizationStatus.get(i).getText();
				}
				
				if (data.equalsIgnoreCase("3")) 
				{
					 actStatusRow3 =  voucherGridAuthorizationStatus.get(i).getText();
				}
			}
			
			String expStatusRow1 = "Pending";
			String expStatusRow2 = "Pending";
			String expStatusRow3 = "Pending";
			
			System.out.println("************************************* checkAuthorizationStatusInHomePageAfterSavingVouchersWithOutUndoAuthorizationOnEditingBatchBinRMAOption  *********************************");
			
			System.out.println("StatusRow1   : "+actStatusRow1+" Value Expected : "+expStatusRow1);
			System.out.println("StatusRow2   : "+actStatusRow2+" Value Expected : "+expStatusRow2);
			System.out.println("StatusRow3   : "+actStatusRow3+" Value Expected : "+expStatusRow3);
			
			if(actStatusRow1.equalsIgnoreCase(expStatusRow1) && actStatusRow2.equalsIgnoreCase(expStatusRow2) && actStatusRow3.equalsIgnoreCase(expStatusRow3))
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
				homeCloseBtn.click();
				Thread.sleep(2000);
				//excelReader.setCellData(xlfile, "SmokeSalesOrder", 627, 9, resPass);
				return true;
			}
			else
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
				homeCloseBtn.click();
				Thread.sleep(2000);
				//excelReader.setCellData(xlfile, "SmokeSalesOrder", 627, 9, resFail);
				return false;
			}
		}
		
		
		
		
		
		
		
		
		
		public static boolean checkLogoutAndLoginWithUserAllOptionsWithOutUndoAuthorizationOnEditingBatchBinRMAOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
    	{
    		
    		
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplayLogo));
    		userNameDisplayLogo.click();
   		
   	     	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
   	     	logoutOption.click();

   	     	Thread.sleep(3000);
   	     	
    		LoginPage lp=new LoginPage(getDriver()); 
    		
    	    String unamelt="UserAllOptions";
    	  
    	    String pawslt="12345";
    	      
    	    lp.enterUserName(unamelt);
    	    
    	    lp.enterPassword(pawslt);
    	    
    	    lp.clickOnSignInBtn();
    	    
    	    //checkRefershPopOnlogin();
    	    
    	    //checkPopUpWindow();
    	  
    		Thread.sleep(6000);

    		String actUserInfo=userNameDisplay.getText();
    		
    		System.out.println("User Info  : "+actUserInfo);
    		
    		System.out.println("User Info Capture Text  :  "+userNameDisplay.getText());
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(companyLogo));
    		companyLogo.click();
    		
    		String getCompanyTxt=companyName.getText();
    		String getLoginCompanyName=getCompanyTxt.substring(0, 19);
    		System.out.println("company name  :  "+ getLoginCompanyName);
    		companyLogo.click();
    		
    		
    		String expUserInfo           ="UserAllOptions";
    		String expLoginCompanyName   ="Automation";
    		
    		
    		
    		boolean actDashboard = dashboard.isDisplayed();
    		boolean expDashboard = true;
    		
    		System.out.println("**********************************************checkLogoutAndLoginWithUserAllOptionsWithOutUndoAuthorizationOnEditingBatchBinRMAOption*********************************************");
    		
    		System.out.println("User Info               : "+actUserInfo         +" Value Expected "+expUserInfo);
    		System.out.println("Login Company           : "+getLoginCompanyName +" Value Expected "+expLoginCompanyName);
    		System.out.println("Dashboard is Displaying : "+actDashboard        +" Value Expected "+expDashboard );

    		if (actUserInfo.equalsIgnoreCase(expUserInfo) && getLoginCompanyName.contains(expLoginCompanyName) && actDashboard==expDashboard) 
    		{
    			System.out.println("Login Successful");
				return true;
			}
    		else
    		{
    			System.out.println("Login Not Successful");
    			return false;
			}
    	}
			
    	
    	
    	
		


		public static boolean checkPurchasesVoucherNAuthorizationStatusWithUserAllOptionsWithOutUndoAuthorizationOnEditingBatchBinRMAOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
			financialsMenu.click();
					
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
			financialsTransactionMenu.click();
				
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
			financialsTransactionsPurchaseMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVoucherNew));
			purchaseVoucherNew.click();
			
			Thread.sleep(3000);
			
			int voucherGridDocNoCount = voucherGridDocNo.size();
			
			String actStatusRow1 = null;
			String actStatusRow2 = null;
			String actStatusRow3 = null;
			
			System.out.println("Size  : "+voucherGridDocNoCount);
			
			for (int i = 0; i < voucherGridDocNoCount; i++) 
			{
				String data = voucherGridDocNo.get(i).getText();
				
				if (data.equalsIgnoreCase("1")) 
				{
					 actStatusRow1 =  voucherGridAuthorizationStatus.get(i).getText();
				}
				
				if (data.equalsIgnoreCase("2")) 
				{
					 actStatusRow2 =  voucherGridAuthorizationStatus.get(i).getText();
				}
				
				if (data.equalsIgnoreCase("3")) 
				{
					 actStatusRow3 =  voucherGridAuthorizationStatus.get(i).getText();
				}
			}
			
			String expStatusRow1 = "Pending";
			String expStatusRow2 = "Pending";
			String expStatusRow3 = "Pending";
			
			Thread.sleep(1000);
			
			click(homePageVoucherArrowBtn);
			Thread.sleep(1000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pendingAuthorizationPurchases));
			pendingAuthorizationPurchases.click();
			
			Thread.sleep(2000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(grid_HeaderChkBox));
			grid_HeaderChkBox.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(authorizeBtn));
			authorizeBtn.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(authorizePopupOkBtn));
			authorizePopupOkBtn.click();
			
			Thread.sleep(2000);
			
			click(homePageVoucherArrowBtn);
			Thread.sleep(1000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homePageAllVouchersView));
			homePageAllVouchersView.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homePageAllVouchersView));
			homePageAllVouchersView.click();
			
			Thread.sleep(2000);
			
			String actAfterAuthorizeStatusRow1 = null;
			String actAfterAuthorizeStatusRow2 = null;
			String actAfterAuthorizeStatusRow3 = null;
			
			for (int i = 0; i < voucherGridDocNoCount; i++) 
			{
				String data = voucherGridDocNo.get(i).getText();
				
				if (data.equalsIgnoreCase("1")) 
				{
					 actAfterAuthorizeStatusRow1 =  voucherGridAuthorizationStatus.get(i).getText();
				}
				
				if (data.equalsIgnoreCase("2")) 
				{
					 actAfterAuthorizeStatusRow2 =  voucherGridAuthorizationStatus.get(i).getText();
				}
				
				if (data.equalsIgnoreCase("3")) 
				{
					actAfterAuthorizeStatusRow3 =  voucherGridAuthorizationStatus.get(i).getText();
				}
			}
			
			String expAfterAuthorizeStatusRow1 = "Authorized";
			String expAfterAuthorizeStatusRow2 = "Authorized";
			String expAfterAuthorizeStatusRow3 = "Authorized";
			
			
			
			System.out.println("************************************* checkPurchasesVoucherNAuthorizationStatusWithUserAllOptionsWithOutUndoAuthorizationOnEditingBatchBinRMAOption  *********************************");
			
			System.out.println("StatusRow1               : "+actStatusRow1				+" Value Expected : "+expStatusRow1);
			System.out.println("StatusRow2               : "+actStatusRow2				+" Value Expected : "+expStatusRow2);
			System.out.println("StatusRow3               : "+actStatusRow3				+" Value Expected : "+expStatusRow3);
			System.out.println("AfterAuthorizeStatusRow1 : "+actAfterAuthorizeStatusRow1+" Value Expected : "+expAfterAuthorizeStatusRow1);
			System.out.println("AfterAuthorizeStatusRow2 : "+actAfterAuthorizeStatusRow2+" Value Expected : "+expAfterAuthorizeStatusRow2);
			System.out.println("AfterAuthorizeStatusRow3 : "+actAfterAuthorizeStatusRow3+" Value Expected : "+expAfterAuthorizeStatusRow3);
			
			
			if(actStatusRow1.equalsIgnoreCase(expStatusRow1) && actStatusRow2.equalsIgnoreCase(expStatusRow2) && actStatusRow3.equalsIgnoreCase(expStatusRow3) 
				&& actAfterAuthorizeStatusRow1.equalsIgnoreCase(expAfterAuthorizeStatusRow1) && actAfterAuthorizeStatusRow2.equalsIgnoreCase(expAfterAuthorizeStatusRow2)
				&& actAfterAuthorizeStatusRow3.equalsIgnoreCase(expAfterAuthorizeStatusRow3))
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
				homeCloseBtn.click();
    			Thread.sleep(3000);
				return true;
			}
			else
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
				homeCloseBtn.click();
    			Thread.sleep(3000);
				return false;
			}
		}
		
		
		
		
		
		
		
		
		public static boolean checkLogoutAndLoginWithSUToCheckAuthorizationStatusWithOutUndoAuthoizationOnEditingBatchBinRMAOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
    	{
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplayLogo));
    		userNameDisplayLogo.click();
   		
   	     	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
   	     	logoutOption.click();

   	     	Thread.sleep(3000);
    		
    		LoginPage lp=new LoginPage(getDriver()); 
    		
    	    String unamelt="su";
    	  
    	    String pawslt="su";
    	      
    	    lp.enterUserName(unamelt);
    	    
    	    lp.enterPassword(pawslt);
    	    
    	    lp.clickOnSignInBtn();
    	    
    	    //checkRefershPopOnlogin();
    	    
    	    //checkPopUpWindow();
    	  
    		Thread.sleep(6000);

    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
			financialsMenu.click();
					
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
			financialsTransactionMenu.click();
				
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
			financialsTransactionsPurchaseMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVoucherNew));
			purchaseVoucherNew.click();
			
			Thread.sleep(3000);
			
			int voucherGridDocNoCount = voucherGridDocNo.size();
			
			String actStatusRow1 = null;
			String actStatusRow2 = null;
			String actStatusRow3 = null;
			
			System.out.println("Size  : "+voucherGridDocNoCount);
			
			for (int i = 0; i < voucherGridDocNoCount; i++) 
			{
				String data = voucherGridDocNo.get(i).getText();
				
				if (data.equalsIgnoreCase("1")) 
				{
					 actStatusRow1 =  voucherGridAuthorizationStatus.get(i).getText();
				}
				
				if (data.equalsIgnoreCase("2")) 
				{
					 actStatusRow2 =  voucherGridAuthorizationStatus.get(i).getText();
				}
				
				if (data.equalsIgnoreCase("3")) 
				{
					 actStatusRow3 =  voucherGridAuthorizationStatus.get(i).getText();
				}
			}
			
			String expStatusRow1 = "Authorized";
			String expStatusRow2 = "Authorized";
			String expStatusRow3 = "Authorized";
			
			System.out.println("************************************* checkLogoutAndLoginWithSUToCheckAuthorizationStatusWithOutUndoAuthoizationOnEditingBatchBinRMAOption  *********************************");
			
			System.out.println("StatusRow1               : "+actStatusRow1				+" Value Expected : "+expStatusRow1);
			System.out.println("StatusRow2               : "+actStatusRow2				+" Value Expected : "+expStatusRow2);
			System.out.println("StatusRow3               : "+actStatusRow3				+" Value Expected : "+expStatusRow3);
			
			if(actStatusRow1.equalsIgnoreCase(expStatusRow1) && actStatusRow2.equalsIgnoreCase(expStatusRow2) && actStatusRow3.equalsIgnoreCase(expStatusRow3))
			{
				//excelReader.setCellData(xlfile, "SmokeSalesOrder", 627, 9, resPass);
				return true;
			}
			else
			{
				//excelReader.setCellData(xlfile, "SmokeSalesOrder", 627, 9, resFail);
				return false;
			}
		}
		
		
		
		
		
		
		
		
		
		public static boolean checkEditingPurchaseVoucherNWithBatchItemWithOutUndoAuthorizationOnEditingBatchBinRMAOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			int voucherGridDocNoCount = voucherGridDocNo.size();
			
			System.out.println("Size  : "+voucherGridDocNoCount);
			
			for (int i = 0; i < voucherGridDocNoCount; i++) 
			{
				String data = voucherGridDocNo.get(i).getText();
				
				if (data.equalsIgnoreCase("1")) 
				{
					getAction().doubleClick(voucherGridCheckBoxList.get(i)).build().perform();
				}
			}
			
			checkValidationMessage("Voucher loaded successfully");
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_10thColumn));
			select1stRow_10thColumn.click();
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Batch));
			enter_Batch.sendKeys(Keys.END);
			enter_Batch.sendKeys(Keys.SHIFT, Keys.HOME);
			enter_Batch.sendKeys("EditedBatch#1");
			enter_Batch.sendKeys(Keys.TAB);
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
			saveBtn.click();
			
			Thread.sleep(3000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
			billRefPickIcon.click();
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
			billRefOkBtn.click();
			
			
			String expMessage1= "Voucher saved successfully";
			String expMessage2= ": 1";
			
			String actMessage = checkValidationMessage(expMessage1);
			
		   System.out.println("************************************* checkEditingPurchaseVoucherNWithBatchItemWithOutUndoAuthorizationOnEditingBatchBinRMAOption  *********************************");
		   
		   System.out.println("SavingMessage  :  "+actMessage +" Value Expected : "+expMessage1+" "+expMessage2);
	
		   getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
		   new_CloseBtn.click();
		   
		   Thread.sleep(2000);
		    
		   if(actMessage.startsWith(expMessage1) && actMessage.endsWith(expMessage2))
    		{
    			return true;
    		}
    		else
    		{
    			return false;
    		}
    	}
    	
		
		
		
		
		
		
		
		public static boolean checkEditingPurchaseVoucherNWithRMAItemWithOutUndoAuthorizationOnEditingBatchBinRMAOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			int voucherGridDocNoCount = voucherGridDocNo.size();
			
			System.out.println("Size  : "+voucherGridDocNoCount);
			
			for (int i = 0; i < voucherGridDocNoCount; i++) 
			{
				String data = voucherGridDocNo.get(i).getText();
				
				if (data.equalsIgnoreCase("2")) 
				{
					getAction().doubleClick(voucherGridCheckBoxList.get(i)).build().perform();
				}
			}
			
			checkValidationMessage("Voucher loaded successfully");
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_13thColumn));
			select1stRow_13thColumn.click();
			
			Thread.sleep(1000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_RMA));
			enter_RMA.sendKeys(Keys.SPACE);
			
			Thread.sleep(1000);
			
			getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(rmaScreenTitle));
			
			getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(rmaClearBtn));
			rmaClearBtn.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaSerialNumberTxtField));
			rmaSerialNumberTxtField.click();
			rmaSerialNumberTxtField.sendKeys("EditedRMA#1,12");
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaAddBtn));
			rmaAddBtn.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaOkBtn));
			rmaOkBtn.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
			saveBtn.click();
			
			Thread.sleep(3000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
			billRefPickIcon.click();
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
			billRefOkBtn.click();
			
			String expMessage1= "Voucher saved successfully";
			String expMessage2= ": 2";
			
			String actMessage = checkValidationMessage(expMessage1);
			
		   System.out.println("************************************* checkEditingPurchaseVoucherNWithRMAItemWithOutUndoAuthorizationOnEditingBatchBinRMAOption  *********************************");
		   
		   System.out.println("SavingMessage  :  "+actMessage +" Value Expected : "+expMessage1+" "+expMessage2);
	
		   getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
		   new_CloseBtn.click();
		   
		   Thread.sleep(2000);
		    
		   if(actMessage.startsWith(expMessage1) && actMessage.endsWith(expMessage2))
    		{
    			return true;
    		}
    		else
    		{
    			return false;
    		}
    	}
		
		
		
		
		
		@FindBy (xpath="//tbody[@id='id_transaction_bins_grid_body']/tr/td[1]")
		private static List<WebElement> binPopupIndexList;
		
		@FindBy (xpath="//tbody[@id='id_transaction_bins_grid_body']/tr/td[2]")
		private static List<WebElement> binPopupBinsList;
		
		@FindBy (xpath="//tbody[@id='id_transaction_bins_grid_body']/tr/td[13]")
		private static List<WebElement> binPopupToBeAllocatedList;
		
		public static boolean checkEditingPurchaseVoucherNWithBinItemWithOutUndoAuthorizationOnEditingBatchBinRMAOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			int voucherGridDocNoCount = voucherGridDocNo.size();
			
			System.out.println("Size  : "+voucherGridDocNoCount);
			
			for (int i = 0; i < voucherGridDocNoCount; i++) 
			{
				String data = voucherGridDocNo.get(i).getText();
				
				if (data.equalsIgnoreCase("3")) 
				{
					getAction().doubleClick(voucherGridCheckBoxList.get(i)).build().perform();
				}
			}
			
			checkValidationMessage("Voucher loaded successfully");
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_11thColumn));
			select1stRow_11thColumn.click();
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Bin));
			enter_Bin.sendKeys(Keys.SPACE);
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binSearchTxt));
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binSearchBtn));
			binSearchBtn.click();
			
			Thread.sleep(2000);

			int count = binPopupBinsList.size();
			
			for (int i = 0; i < count; i++) 
			{
				String data = binPopupBinsList.get(i).getText();
				
				if (data.equalsIgnoreCase("Bin5")) 
				{
					getAction().doubleClick(binPopupIndexList.get(i)).build().perform();
				}
			}
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binOkBtn));
			binOkBtn.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
			saveBtn.click();
			
			Thread.sleep(3000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
			billRefPickIcon.click();
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
			billRefOkBtn.click();
			
			
			String expMessage1= "Voucher saved successfully";
			String expMessage2= ": 3";
			
			String actMessage = checkValidationMessage(expMessage1);
			
		   System.out.println("************************************* checkEditingPurchaseVoucherNWithBinItemWithOutUndoAuthorizationOnEditingBatchBinRMAOption  *********************************");
		   
		   System.out.println("SavingMessage  :  "+actMessage +" Value Expected : "+expMessage1+" "+expMessage2);
	
		   getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
		   new_CloseBtn.click();
		  
		   Thread.sleep(2000);
		   
		   if(actMessage.startsWith(expMessage1) && actMessage.endsWith(expMessage2))
    		{
    			return true;
    		}
    		else
    		{
    			return false;
    		}
    	}
		
		
		
		
		
		
		
		
		public boolean checkAuthorizationStatusInHomePageAfterEditingVouchersWithOutUndoAuthorizationOnEditingBatchBinRMAOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			int voucherGridDocNoCount = voucherGridDocNo.size();
			
			String actStatusRow1 = null;
			String actStatusRow2 = null;
			String actStatusRow3 = null;
			
			System.out.println("Size  : "+voucherGridDocNoCount);
			
			for (int i = 0; i < voucherGridDocNoCount; i++) 
			{
				String data = voucherGridDocNo.get(i).getText();
				
				if (data.equalsIgnoreCase("1")) 
				{
					 actStatusRow1 =  voucherGridAuthorizationStatus.get(i).getText();
				}
				
				if (data.equalsIgnoreCase("2")) 
				{
					 actStatusRow2 =  voucherGridAuthorizationStatus.get(i).getText();
				}
				
				if (data.equalsIgnoreCase("3")) 
				{
					 actStatusRow3 =  voucherGridAuthorizationStatus.get(i).getText();
				}
			}
			
			String expStatusRow1 = "Authorized";
			String expStatusRow2 = "Authorized";
			String expStatusRow3 = "Authorized";
			
			System.out.println("************************************* checkAuthorizationStatusInHomePageAfterEditingVouchersWithOutUndoAuthorizationOnEditingBatchBinRMAOption  *********************************");
			
			System.out.println("StatusRow1   : "+actStatusRow1+" Value Expected : "+expStatusRow1);
			System.out.println("StatusRow2   : "+actStatusRow2+" Value Expected : "+expStatusRow2);
			System.out.println("StatusRow3   : "+actStatusRow3+" Value Expected : "+expStatusRow3);
			
			if(actStatusRow1.equalsIgnoreCase(expStatusRow1) && actStatusRow2.equalsIgnoreCase(expStatusRow2) && actStatusRow3.equalsIgnoreCase(expStatusRow3))
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
				homeCloseBtn.click();
				Thread.sleep(2000);
				//excelReader.setCellData(xlfile, "SmokeSalesOrder", 627, 9, resPass);
				return true;
			}
			else
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
				homeCloseBtn.click();
				Thread.sleep(2000);
				//excelReader.setCellData(xlfile, "SmokeSalesOrder", 627, 9, resFail);
				return false;
			}
		}
		
		
		
		
		
		
		
		public boolean checkEraseAllTransactionsWithOutUndoAuthorizationOnEditingBatchBinRMAOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
			homeMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dataMangementMenu));
			dataMangementMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(eraseAll));
			eraseAll.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(eraseTranscationsRadio));
			eraseTranscationsRadio.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(eraseAllOkBtn));
			eraseAllOkBtn.click();
			
			if(getIsAlertPresent())
			{
				getWaitForAlert();
				getAlert().accept();
			}
			
			
			String expValidationMsg="Data deleted successfully.";

			String actValidationMsg=checkValidationMessage(expValidationMsg);
			
			
			System.out.println("************************************* checkEraseAllTransactionsWithOutUndoAuthorizationOnEditingBatchBinRMAOption  *********************************");
			System.out.println("Message  :  "+actValidationMsg +" Value Expected : "+expValidationMsg);
			
			if (actValidationMsg.equalsIgnoreCase(expValidationMsg))
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
				sl_CloseBtn.click();
				return true;
			}
			else
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
				sl_CloseBtn.click();
				return false;
			}
		}
		
		
		
		
		
		
		
		
		
		public boolean 	checkTransactionAuthorizationUndoAuthorizationOnEditingBatchBinRmaOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
    	{
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsmenuBtn));
    		settingsmenuBtn.click();
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(transactionAuthorizationBtn));
    		transactionAuthorizationBtn.click();
    		
    		Thread.sleep(2000);
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNameDropdown));
    		documentNameDropdown.sendKeys(" ");
    		
    		Thread.sleep(1000);
    			
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchasevoucherExpandbutton));
    		purchasevoucherExpandbutton.click();
    	
            getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchasevoucherTypeCreatedVoucher));
    		purchasevoucherTypeCreatedVoucher.click();
    		
    		Thread.sleep(3000);
    				
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
    		nameTxt.click();
    		
    		nameTxt.sendKeys(Keys.SPACE);
    		
    		int namecount=tranAuthNameList.size();
			
			for(int i=0 ; i < namecount ;i++)
			{
				String data=tranAuthNameList.get(i).getText();
				
				if(data.equalsIgnoreCase("Purchase"))
				{
					tranAuthNameList.get(i).click();
					
					break;
				}
			}
				
    		nameTxt.sendKeys(Keys.TAB);
    			
    		Thread.sleep(3000);
    		
    		click(cnrBtn);
    		Thread.sleep(1000);
    		
    		ClickUsingJs(Level1editBtn);
    		Thread.sleep(1000);
    		
    		//getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(Level1editBtn));
    		//Level1editBtn.click();
    		
    		Thread.sleep(3000);
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(keepUnpostedReferencesChkBox));
    		((JavascriptExecutor)getDriver()).executeScript("arguments[0].scrollIntoView();", keepUnpostedReferencesChkBox);
    		
    		Thread.sleep(2000);
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(batchRMABinChkBox));
    		batchRMABinChkBox.click();
    		
    		Select undoAuthEditingDrpdwn = new Select(undoAuthorizationEditingDropdown);
    		undoAuthEditingDrpdwn.selectByVisibleText("Full");
    		
    		Thread.sleep(2000);
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(definitionOkBtn));
    		definitionOkBtn.click();
    		
    		Thread.sleep(2000);
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(tranAuthSaveBtn));
    		tranAuthSaveBtn.click();
    		
    		
    		String expValidationMsg = "Authorization Flow saved successfully.";
    		
    		String actValidationMsg = checkValidationMessage(expValidationMsg);
    		
    		System.out.println("Validation Message : "+actValidationMsg+"  Value Expected : "+expValidationMsg);
    		
    		if(actValidationMsg.equalsIgnoreCase(expValidationMsg))
    		{
    			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(tranAuthCancelBtn));
    			tranAuthCancelBtn.click();
    			return true;
    		}
    		else
    		{
    			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(tranAuthCancelBtn));
    			tranAuthCancelBtn.click();
    			return false;
    		}
    	}
		
		
		
		
		
		
		
		
		
		
		public static boolean checkSavingPurchaseVoucherNWithBatchItemWithUndoAuthorizationOnEditingBatchBinRMAOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
			financialsMenu.click();
					
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
			financialsTransactionMenu.click();
				
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
			financialsTransactionsPurchaseMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVoucherNew));
			purchaseVoucherNew.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
			newBtn.click();
			
			checkValidationMessage("Screen opened");
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseAccountTxt));
			purchaseAccountTxt.click();
			purchaseAccountTxt.sendKeys("Purchase");
			
			Thread.sleep(2000);
			
			purchaseAccountTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
			vendorAccountTxt.click();
			vendorAccountTxt.sendKeys("Vendor A");
			
			Thread.sleep(2000);
			
			vendorAccountTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
			departmentTxt.click();
			departmentTxt.sendKeys("INDIA");
			
			Thread.sleep(2000);
			
			departmentTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(wareHouseTxt));
			wareHouseTxt.click();
			wareHouseTxt.sendKeys("HYDERABAD");
			
			Thread.sleep(2000);
			
			wareHouseTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
			select1stRow_1stColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
			enter_ItemTxt.sendKeys("BR COGS ITEM");
			Thread.sleep(3000);
			enter_ItemTxt.sendKeys(Keys.TAB);
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_5thColumn));
			select1stRow_5thColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
			enter_Quantity.sendKeys("1");
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_7thColumn));
			select1stRow_7thColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
			enter_Rate.sendKeys(Keys.END);
			enter_Rate.sendKeys(Keys.SHIFT, Keys.HOME);
			enter_Rate.sendKeys(Keys.BACK_SPACE);
			enter_Rate.sendKeys("10");
			enter_Rate.sendKeys(Keys.TAB);
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
			enter_Gross.sendKeys(Keys.TAB);
			
			Thread.sleep(2000);
			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_10thColumn));
			select1stRow_10thColumn.click();
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Batch));
			enter_Batch.sendKeys("Batch#1");
			enter_Batch.sendKeys(Keys.TAB);
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
			saveBtn.click();
			
			Thread.sleep(3000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
			billRefPickIcon.click();
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
			billRefOkBtn.click();
			
			
			String expMessage1= "Voucher saved successfully";
			String expMessage2= ": 1";
			
			String actMessage = checkValidationMessage(expMessage1);
			
		   System.out.println("************************************* checkSavingPurchaseVoucherNWithBatchItemWithUndoAuthorizationOnEditingBatchBinRMAOption  *********************************");
		   
		   System.out.println("SavingMessage  :  "+actMessage +" Value Expected : "+expMessage1+" "+expMessage2);
	
		   if(actMessage.startsWith(expMessage1) && actMessage.endsWith(expMessage2))
    		{
    			return true;
    		}
    		else
    		{
    			return false;
    		} 
    	}
    	
		
		
		
		
		
		
		public static boolean checkSavingPurchaseVoucherNWithRMAItemWithUndoAuthorizationOnEditingBatchBinRMAOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseAccountTxt));
			purchaseAccountTxt.click();
			purchaseAccountTxt.sendKeys("Purchase");
			
			Thread.sleep(2000);
			
			purchaseAccountTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
			vendorAccountTxt.click();
			vendorAccountTxt.sendKeys("Vendor A");
			
			Thread.sleep(2000);
			
			vendorAccountTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
			departmentTxt.click();
			departmentTxt.sendKeys("INDIA");
			
			Thread.sleep(2000);
			
			departmentTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(wareHouseTxt));
			wareHouseTxt.click();
			wareHouseTxt.sendKeys("HYDERABAD");
			
			Thread.sleep(2000);
			
			wareHouseTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
			select1stRow_1stColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
			enter_ItemTxt.sendKeys("WA COGS ITEM");
			Thread.sleep(3000);
			enter_ItemTxt.sendKeys(Keys.TAB);
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_5thColumn));
			select1stRow_5thColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
			enter_Quantity.sendKeys("12");
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_7thColumn));
			select1stRow_7thColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
			enter_Rate.sendKeys(Keys.END);
			enter_Rate.sendKeys(Keys.SHIFT, Keys.HOME);
			enter_Rate.sendKeys(Keys.BACK_SPACE);
			enter_Rate.sendKeys("10");
			enter_Rate.sendKeys(Keys.TAB);
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
			enter_Gross.sendKeys(Keys.TAB);
			
			Thread.sleep(2000);
			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_13thColumn));
			select1stRow_13thColumn.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(rmaScreenTitle));
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaSerialNumberTxtField));
			rmaSerialNumberTxtField.click();
			rmaSerialNumberTxtField.sendKeys("RMA#1,12");
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaAddBtn));
			rmaAddBtn.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaOkBtn));
			rmaOkBtn.click();
			
			Thread.sleep(2000);
			
			/*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_RMA));
			enter_RMA.sendKeys(Keys.TAB);*/
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
			saveBtn.click();
			
			Thread.sleep(3000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
			billRefPickIcon.click();
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
			billRefOkBtn.click();
			
			
			String expMessage1= "Voucher saved successfully";
			String expMessage2= ": 2";
			
			String actMessage = checkValidationMessage(expMessage1);
			
		   System.out.println("************************************* checkSavingPurchaseVoucherNWithRMAItemWithUndoAuthorizationOnEditingBatchBinRMAOption  *********************************");
		   
		   System.out.println("SavingMessage  :  "+actMessage +" Value Expected : "+expMessage1+" "+expMessage2);
	
		   if(actMessage.startsWith(expMessage1) && actMessage.endsWith(expMessage2))
    		{
    			return true;
    		}
    		else
    		{
    			return false;
    		}
    	}
		
		
		
		
		
		
		
		
		
		
		public static boolean checkSavingPurchaseVoucherNWithBinItemWithUndoAuthorizationOnEditingBatchBinRMAOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseAccountTxt));
			purchaseAccountTxt.click();
			purchaseAccountTxt.sendKeys("Purchase");
			
			Thread.sleep(2000);
			
			purchaseAccountTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
			vendorAccountTxt.click();
			vendorAccountTxt.sendKeys("Vendor A");
			
			Thread.sleep(2000);
			
			vendorAccountTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
			departmentTxt.click();
			departmentTxt.sendKeys("INDIA");
			
			Thread.sleep(2000);
			
			departmentTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(wareHouseTxt));
			wareHouseTxt.click();
			wareHouseTxt.sendKeys("HYDERABAD");
			
			Thread.sleep(2000);
			
			wareHouseTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
			select1stRow_1stColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
			enter_ItemTxt.sendKeys("FIFO COGS ITEM");
			Thread.sleep(3000);
			enter_ItemTxt.sendKeys(Keys.TAB);
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_5thColumn));
			select1stRow_5thColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
			enter_Quantity.sendKeys("1");
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_7thColumn));
			select1stRow_7thColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
			enter_Rate.sendKeys(Keys.END);
			enter_Rate.sendKeys(Keys.SHIFT, Keys.HOME);
			enter_Rate.sendKeys(Keys.BACK_SPACE);
			enter_Rate.sendKeys("10");
			enter_Rate.sendKeys(Keys.TAB);
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
			enter_Gross.sendKeys(Keys.TAB);
			
			Thread.sleep(2000);
			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_11thColumn));
			select1stRow_11thColumn.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binSearchTxt));
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binSearchBtn));
			binSearchBtn.click();
			
			Thread.sleep(2000);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binselect2ndRow_1stColumn));
			getAction().doubleClick(binselect2ndRow_1stColumn).build().perform();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binOkBtn));
			binOkBtn.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
			saveBtn.click();
			
			Thread.sleep(3000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
			billRefPickIcon.click();
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
			billRefOkBtn.click();
			
			
			String expMessage1= "Voucher saved successfully";
			String expMessage2= ": 3";
			
			String actMessage = checkValidationMessage(expMessage1);
			
		   System.out.println("************************************* checkSavingPurchaseVoucherNWithBinItemWithUndoAuthorizationOnEditingBatchBinRMAOption  *********************************");
		   
		   System.out.println("SavingMessage  :  "+actMessage +" Value Expected : "+expMessage1+" "+expMessage2);
	
		   if(actMessage.startsWith(expMessage1) && actMessage.endsWith(expMessage2))
    		{
			   getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
			   new_CloseBtn.click();
			   Thread.sleep(2000);
    			return true;
    		}
    		else
    		{
    			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
 			    new_CloseBtn.click();
 			    Thread.sleep(2000);
    			return false;
    		}
    	}
		
		
		
		
		
		
		
		
		public boolean checkAuthorizationStatusInHomePageAfterSavingVouchersWithUndoAuthorizationOnEditingBatchBinRMAOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			int voucherGridDocNoCount = voucherGridDocNo.size();
			
			String actStatusRow1 = null;
			String actStatusRow2 = null;
			String actStatusRow3 = null;
			
			System.out.println("Size  : "+voucherGridDocNoCount);
			
			for (int i = 0; i < voucherGridDocNoCount; i++) 
			{
				String data = voucherGridDocNo.get(i).getText();
				
				if (data.equalsIgnoreCase("1")) 
				{
					 actStatusRow1 =  voucherGridAuthorizationStatus.get(i).getText();
				}
				
				if (data.equalsIgnoreCase("2")) 
				{
					 actStatusRow2 =  voucherGridAuthorizationStatus.get(i).getText();
				}
				
				if (data.equalsIgnoreCase("3")) 
				{
					 actStatusRow3 =  voucherGridAuthorizationStatus.get(i).getText();
				}
			}
			
			String expStatusRow1 = "Pending";
			String expStatusRow2 = "Pending";
			String expStatusRow3 = "Pending";
			
			System.out.println("************************************* checkAuthorizationStatusInHomePageAfterSavingVouchersWithUndoAuthorizationOnEditingBatchBinRMAOption  *********************************");
			
			System.out.println("StatusRow1   : "+actStatusRow1+" Value Expected : "+expStatusRow1);
			System.out.println("StatusRow2   : "+actStatusRow2+" Value Expected : "+expStatusRow2);
			System.out.println("StatusRow3   : "+actStatusRow3+" Value Expected : "+expStatusRow3);
			
			if(actStatusRow1.equalsIgnoreCase(expStatusRow1) && actStatusRow2.equalsIgnoreCase(expStatusRow2) && actStatusRow3.equalsIgnoreCase(expStatusRow3))
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
				homeCloseBtn.click();
				Thread.sleep(2000);
				//excelReader.setCellData(xlfile, "SmokeSalesOrder", 627, 9, resPass);
				return true;
			}
			else
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
				homeCloseBtn.click();
				Thread.sleep(2000);
				//excelReader.setCellData(xlfile, "SmokeSalesOrder", 627, 9, resFail);
				return false;
			}
		}
		
		
		
		
		
		
		
		
		
		public static boolean checkLogoutAndLoginWithUserAllOptionsWithUndoAuthorizationOnEditingBatchBinRMAOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
    	{
    		
    		
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplayLogo));
    		userNameDisplayLogo.click();
   		
   	     	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
   	     	logoutOption.click();

   	     	Thread.sleep(3000);
   	     	
    		LoginPage lp=new LoginPage(getDriver()); 
    		
    	    String unamelt="UserAllOptions";
    	  
    	    String pawslt="12345";
    	      
    	    lp.enterUserName(unamelt);
    	    
    	    lp.enterPassword(pawslt);
    	    
    	    lp.clickOnSignInBtn();
    	    
    	    //checkRefershPopOnlogin();
    	    
    	    //checkPopUpWindow();
    	  
    		Thread.sleep(6000);

    		String actUserInfo=userNameDisplay.getText();
    		
    		System.out.println("User Info  : "+actUserInfo);
    		
    		System.out.println("User Info Capture Text  :  "+userNameDisplay.getText());
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(companyLogo));
    		companyLogo.click();
    		
    		String getCompanyTxt=companyName.getText();
    		String getLoginCompanyName=getCompanyTxt.substring(0, 19);
    		System.out.println("company name  :  "+ getLoginCompanyName);
    		companyLogo.click();
    		
    		
    		String expUserInfo           ="UserAllOptions";
    		String expLoginCompanyName   ="Automation";
    		
    		
    		
    		boolean actDashboard = dashboard.isDisplayed();
    		boolean expDashboard = true;
    		
    		System.out.println("**********************************************checkLogoutAndLoginWithUserAllOptionsWithUndoAuthorizationOnEditingBatchBinRMAOption*********************************************");
    		
    		System.out.println("User Info               : "+actUserInfo         +" Value Expected "+expUserInfo);
    		System.out.println("Login Company           : "+getLoginCompanyName +" Value Expected "+expLoginCompanyName);
    		System.out.println("Dashboard is Displaying : "+actDashboard        +" Value Expected "+expDashboard );

    		if (actUserInfo.equalsIgnoreCase(expUserInfo) && getLoginCompanyName.contains(expLoginCompanyName) && actDashboard==expDashboard) 
    		{
    			System.out.println("Login Successful");
				return true;
			}
    		else
    		{
    			System.out.println("Login Not Successful");
    			return false;
			}
    	}
			
    	
    	
    	
		


		public static boolean checkPurchasesVoucherNAuthorizationStatusWithUserAllOptionsWithUndoAuthorizationOnEditingBatchBinRMAOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
			financialsMenu.click();
					
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
			financialsTransactionMenu.click();
				
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
			financialsTransactionsPurchaseMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVoucherNew));
			purchaseVoucherNew.click();
			
			Thread.sleep(3000);
			
			int voucherGridDocNoCount = voucherGridDocNo.size();
			
			String actStatusRow1 = null;
			String actStatusRow2 = null;
			String actStatusRow3 = null;
			
			System.out.println("Size  : "+voucherGridDocNoCount);
			
			for (int i = 0; i < voucherGridDocNoCount; i++) 
			{
				String data = voucherGridDocNo.get(i).getText();
				
				if (data.equalsIgnoreCase("1")) 
				{
					 actStatusRow1 =  voucherGridAuthorizationStatus.get(i).getText();
				}
				
				if (data.equalsIgnoreCase("2")) 
				{
					 actStatusRow2 =  voucherGridAuthorizationStatus.get(i).getText();
				}
				
				if (data.equalsIgnoreCase("3")) 
				{
					 actStatusRow3 =  voucherGridAuthorizationStatus.get(i).getText();
				}
			}
			
			String expStatusRow1 = "Pending";
			String expStatusRow2 = "Pending";
			String expStatusRow3 = "Pending";
			
			click(homePageVoucherArrowBtn);
			Thread.sleep(1000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pendingAuthorizationPurchases));
			pendingAuthorizationPurchases.click();
			
			Thread.sleep(2000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(grid_HeaderChkBox));
			grid_HeaderChkBox.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(authorizeBtn));
			authorizeBtn.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(authorizePopupOkBtn));
			authorizePopupOkBtn.click();
			
			Thread.sleep(2000);
			
			click(homePageVoucherArrowBtn);
			Thread.sleep(1000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homePageAllVouchersView));
			homePageAllVouchersView.click();
			
			Thread.sleep(2000);
			
			String actAfterAuthorizeStatusRow1 = null;
			String actAfterAuthorizeStatusRow2 = null;
			String actAfterAuthorizeStatusRow3 = null;
			
			for (int i = 0; i < voucherGridDocNoCount; i++) 
			{
				String data = voucherGridDocNo.get(i).getText();
				
				if (data.equalsIgnoreCase("1")) 
				{
					 actAfterAuthorizeStatusRow1 =  voucherGridAuthorizationStatus.get(i).getText();
				}
				
				if (data.equalsIgnoreCase("2")) 
				{
					 actAfterAuthorizeStatusRow2 =  voucherGridAuthorizationStatus.get(i).getText();
				}
				
				if (data.equalsIgnoreCase("3")) 
				{
					actAfterAuthorizeStatusRow3 =  voucherGridAuthorizationStatus.get(i).getText();
				}
			}
			
			String expAfterAuthorizeStatusRow1 = "Authorized";
			String expAfterAuthorizeStatusRow2 = "Authorized";
			String expAfterAuthorizeStatusRow3 = "Authorized";
			
			
			
			System.out.println("************************************* checkPurchasesVoucherNAuthorizationStatusWithUserAllOptionsWithUndoAuthorizationOnEditingBatchBinRMAOption  *********************************");
			
			System.out.println("StatusRow1               : "+actStatusRow1				+" Value Expected : "+expStatusRow1);
			System.out.println("StatusRow2               : "+actStatusRow2				+" Value Expected : "+expStatusRow2);
			System.out.println("StatusRow3               : "+actStatusRow3				+" Value Expected : "+expStatusRow3);
			System.out.println("AfterAuthorizeStatusRow1 : "+actAfterAuthorizeStatusRow1+" Value Expected : "+expAfterAuthorizeStatusRow1);
			System.out.println("AfterAuthorizeStatusRow2 : "+actAfterAuthorizeStatusRow2+" Value Expected : "+expAfterAuthorizeStatusRow2);
			System.out.println("AfterAuthorizeStatusRow3 : "+actAfterAuthorizeStatusRow3+" Value Expected : "+expAfterAuthorizeStatusRow3);
			
			
			if(actStatusRow1.equalsIgnoreCase(expStatusRow1) && actStatusRow2.equalsIgnoreCase(expStatusRow2) && actStatusRow3.equalsIgnoreCase(expStatusRow3) 
				&& actAfterAuthorizeStatusRow1.equalsIgnoreCase(expAfterAuthorizeStatusRow1) && actAfterAuthorizeStatusRow2.equalsIgnoreCase(expAfterAuthorizeStatusRow2)
				&& actAfterAuthorizeStatusRow3.equalsIgnoreCase(expAfterAuthorizeStatusRow3))
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
				homeCloseBtn.click();
    			Thread.sleep(3000);
				//excelReader.setCellData(xlfile, "SmokeSalesOrder", 627, 9, resPass);
				return true;
			}
			else
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
				homeCloseBtn.click();
    			Thread.sleep(3000);
				//excelReader.setCellData(xlfile, "SmokeSalesOrder", 627, 9, resFail);
				return false;
			}
		}
		
		
		
		
		
		
		
		
		public static boolean checkLogoutAndLoginWithSUToCheckAuthorizationStatusWithUndoAuthoizationOnEditingBatchBinRMAOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
    	{
    		
    		
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplayLogo));
    		userNameDisplayLogo.click();
   		
   	     	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
   	     	logoutOption.click();

   	     	Thread.sleep(3000);
    		
    		LoginPage lp=new LoginPage(getDriver()); 
    		
    	    String unamelt="su";
    	  
    	    String pawslt="su";
    	      
    	    lp.enterUserName(unamelt);
    	    
    	    lp.enterPassword(pawslt);
    	    
    	    lp.clickOnSignInBtn();
    	    
    	    //checkRefershPopOnlogin();
    	    
    	    //checkPopUpWindow();
    	  
    		Thread.sleep(6000);

    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
			financialsMenu.click();
					
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
			financialsTransactionMenu.click();
				
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
			financialsTransactionsPurchaseMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVoucherNew));
			purchaseVoucherNew.click();
			
			Thread.sleep(3000);
			
			int voucherGridDocNoCount = voucherGridDocNo.size();
			
			String actStatusRow1 = null;
			String actStatusRow2 = null;
			String actStatusRow3 = null;
			
			System.out.println("Size  : "+voucherGridDocNoCount);
			
			for (int i = 0; i < voucherGridDocNoCount; i++) 
			{
				String data = voucherGridDocNo.get(i).getText();
				
				if (data.equalsIgnoreCase("1")) 
				{
					 actStatusRow1 =  voucherGridAuthorizationStatus.get(i).getText();
				}
				
				if (data.equalsIgnoreCase("2")) 
				{
					 actStatusRow2 =  voucherGridAuthorizationStatus.get(i).getText();
				}
				
				if (data.equalsIgnoreCase("3")) 
				{
					 actStatusRow3 =  voucherGridAuthorizationStatus.get(i).getText();
				}
			}
			
			String expStatusRow1 = "Authorized";
			String expStatusRow2 = "Authorized";
			String expStatusRow3 = "Authorized";
			
			System.out.println("************************************* checkLogoutAndLoginWithSUToCheckAuthorizationStatusWithUndoAuthoizationOnEditingBatchBinRMAOption  *********************************");
			
			System.out.println("StatusRow1               : "+actStatusRow1				+" Value Expected : "+expStatusRow1);
			System.out.println("StatusRow2               : "+actStatusRow2				+" Value Expected : "+expStatusRow2);
			System.out.println("StatusRow3               : "+actStatusRow3				+" Value Expected : "+expStatusRow3);
			
			if(actStatusRow1.equalsIgnoreCase(expStatusRow1) && actStatusRow2.equalsIgnoreCase(expStatusRow2) && actStatusRow3.equalsIgnoreCase(expStatusRow3))
			{
				//excelReader.setCellData(xlfile, "SmokeSalesOrder", 627, 9, resPass);
				return true;
			}
			else
			{
				//excelReader.setCellData(xlfile, "SmokeSalesOrder", 627, 9, resFail);
				return false;
			}
		}
		
		
		
		
		
		
		
		
		
		public static boolean checkEditingPurchaseVoucherNWithBatchItemWithUndoAuthorizationOnEditingBatchBinRMAOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			
			
			
			int voucherGridDocNoCount = voucherGridDocNo.size();
			
			System.out.println("Size  : "+voucherGridDocNoCount);
			
			for (int i = 0; i < voucherGridDocNoCount; i++) 
			{
				String data = voucherGridDocNo.get(i).getText();
				
				if (data.equalsIgnoreCase("1")) 
				{
					getAction().doubleClick(voucherGridCheckBoxList.get(i)).build().perform();
				}
			}
			
			checkValidationMessage("Voucher loaded successfully");
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_10thColumn));
			select1stRow_10thColumn.click();
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Batch));
			enter_Batch.sendKeys(Keys.END);
			enter_Batch.sendKeys(Keys.SHIFT, Keys.HOME);
			enter_Batch.sendKeys("EditedBatch#1");
			enter_Batch.sendKeys(Keys.TAB);
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
			saveBtn.click();
			
			Thread.sleep(3000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
			billRefPickIcon.click();
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
			billRefOkBtn.click();
			
			
			String expMessage1= "Voucher saved successfully";
			String expMessage2= ": 1";
			
			String actMessage = checkValidationMessage(expMessage1);
			
		   System.out.println("************************************* checkEditingPurchaseVoucherNWithBatchItemWithUndoAuthorizationOnEditingBatchBinRMAOption  *********************************");
		   
		   System.out.println("SavingMessage  :  "+actMessage +" Value Expected : "+expMessage1+" "+expMessage2);
	
		   if(actMessage.startsWith(expMessage1) && actMessage.endsWith(expMessage2))
    		{
			   getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
			    new_CloseBtn.click();
			    Thread.sleep(2000);
    			return true;
    		}
    		else
    		{
    			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
 			    new_CloseBtn.click();
 			    Thread.sleep(2000);
    			return false;
    		}
    	}
    	
		
		
		
		
		
		
		
		public static boolean checkEditingPurchaseVoucherNWithRMAItemWithUndoAuthorizationOnEditingBatchBinRMAOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			int voucherGridDocNoCount = voucherGridDocNo.size();
			
			System.out.println("Size  : "+voucherGridDocNoCount);
			
			for (int i = 0; i < voucherGridDocNoCount; i++) 
			{
				String data = voucherGridDocNo.get(i).getText();
				
				if (data.equalsIgnoreCase("2")) 
				{
					getAction().doubleClick(voucherGridCheckBoxList.get(i)).build().perform();
				}
			}
			
			checkValidationMessage("Voucher loaded successfully");
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_13thColumn));
			select1stRow_13thColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_RMA));
			enter_RMA.sendKeys(Keys.SPACE);
			
			getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(rmaScreenTitle));
			
			getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(rmaClearBtn));
			rmaClearBtn.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaSerialNumberTxtField));
			rmaSerialNumberTxtField.click();
			rmaSerialNumberTxtField.sendKeys("EditedRMA#1,12");
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaAddBtn));
			rmaAddBtn.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaOkBtn));
			rmaOkBtn.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
			saveBtn.click();
			
			Thread.sleep(3000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
			billRefPickIcon.click();
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
			billRefOkBtn.click();
			
			
			String expMessage1= "Voucher saved successfully";
			String expMessage2= ": 2";
			
			String actMessage = checkValidationMessage(expMessage1);
			
		   System.out.println("************************************* checkEditingPurchaseVoucherNWithRMAItemWithUndoAuthorizationOnEditingBatchBinRMAOption  *********************************");
		   
		   System.out.println("SavingMessage  :  "+actMessage +" Value Expected : "+expMessage1+" "+expMessage2);
	
		   if(actMessage.startsWith(expMessage1) && actMessage.endsWith(expMessage2))
    		{
			   getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
			    new_CloseBtn.click();
			    Thread.sleep(2000);
    			return true;
    		}
    		else
    		{
    			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
 			    new_CloseBtn.click();
 			    Thread.sleep(2000);
    			return false;
    		}
    	}
		
		
		
		
		
		
		
		public static boolean checkEditingPurchaseVoucherNWithBinItemWithUndoAuthorizationOnEditingBatchBinRMAOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			int voucherGridDocNoCount = voucherGridDocNo.size();
			
			System.out.println("Size  : "+voucherGridDocNoCount);
			
			for (int i = 0; i < voucherGridDocNoCount; i++) 
			{
				String data = voucherGridDocNo.get(i).getText();
				
				if (data.equalsIgnoreCase("3")) 
				{
					getAction().doubleClick(voucherGridCheckBoxList.get(i)).build().perform();
				}
			}
			
			checkValidationMessage("Voucher loaded successfully");
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_11thColumn));
			select1stRow_11thColumn.click();
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Bin));
			enter_Bin.sendKeys(Keys.SPACE);
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binSearchTxt));
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binSearchBtn));
			binSearchBtn.click();
			
			Thread.sleep(2000);

			int count = binPopupBinsList.size();
			
			for (int i = 0; i < count; i++) 
			{
				String data = binPopupBinsList.get(i).getText();
				
				if (data.equalsIgnoreCase("Bin5")) 
				{
					getAction().doubleClick(binPopupIndexList.get(i)).build().perform();
				}
			}
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binOkBtn));
			binOkBtn.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
			saveBtn.click();
			
			Thread.sleep(3000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
			billRefPickIcon.click();
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
			billRefOkBtn.click();
			
			
			String expMessage1= "Voucher saved successfully";
			String expMessage2= ": 3";
			
			String actMessage = checkValidationMessage(expMessage1);
			
		   System.out.println("************************************* checkEditingPurchaseVoucherNWithBinItemWithUndoAuthorizationOnEditingBatchBinRMAOption  *********************************");
		   
		   System.out.println("SavingMessage  :  "+actMessage +" Value Expected : "+expMessage1+" "+expMessage2);
	
		   if(actMessage.startsWith(expMessage1) && actMessage.endsWith(expMessage2))
    		{
			   getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
			   new_CloseBtn.click();
			   Thread.sleep(2000);
    			return true;
    		}
    		else
    		{
    			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
 			    new_CloseBtn.click();
 			    Thread.sleep(2000);
    			return false;
    		}
    	}
		
		
		
		
		
		
		
		
		public boolean checkAuthorizationStatusInHomePageAfterEditingVouchersWithUndoAuthorizationOnEditingBatchBinRMAOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			int voucherGridDocNoCount = voucherGridDocNo.size();
			
			String actStatusRow1 = null;
			String actStatusRow2 = null;
			String actStatusRow3 = null;
			
			System.out.println("Size  : "+voucherGridDocNoCount);
			
			for (int i = 0; i < voucherGridDocNoCount; i++) 
			{
				String data = voucherGridDocNo.get(i).getText();
				
				if (data.equalsIgnoreCase("1")) 
				{
					 actStatusRow1 =  voucherGridAuthorizationStatus.get(i).getText();
				}
				
				if (data.equalsIgnoreCase("2")) 
				{
					 actStatusRow2 =  voucherGridAuthorizationStatus.get(i).getText();
				}
				
				if (data.equalsIgnoreCase("3")) 
				{
					 actStatusRow3 =  voucherGridAuthorizationStatus.get(i).getText();
				}
			}
			
			String expStatusRow1 = "Pending";
			String expStatusRow2 = "Pending";
			String expStatusRow3 = "Pending";
			
			System.out.println("************************************* checkAuthorizationStatusInHomePageAfterEditingVouchersWithUndoAuthorizationOnEditingBatchBinRMAOption  *********************************");
			
			System.out.println("StatusRow1   : "+actStatusRow1+" Value Expected : "+expStatusRow1);
			System.out.println("StatusRow2   : "+actStatusRow2+" Value Expected : "+expStatusRow2);
			System.out.println("StatusRow3   : "+actStatusRow3+" Value Expected : "+expStatusRow3);
			
			if(actStatusRow1.equalsIgnoreCase(expStatusRow1) && actStatusRow2.equalsIgnoreCase(expStatusRow2) && actStatusRow3.equalsIgnoreCase(expStatusRow3))
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
				homeCloseBtn.click();
				Thread.sleep(2000);
				//excelReader.setCellData(xlfile, "SmokeSalesOrder", 627, 9, resPass);
				return true;
			}
			else
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
				homeCloseBtn.click();
				Thread.sleep(2000);
				//excelReader.setCellData(xlfile, "SmokeSalesOrder", 627, 9, resFail);
				return false;
			}
		}
		
		
		
		
		
		
		
		public boolean checkEraseAllTransactionsWithUndoAuthorizationOnEditingBatchBinRMAOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
			homeMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dataMangementMenu));
			dataMangementMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(eraseAll));
			eraseAll.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(eraseTranscationsRadio));
			eraseTranscationsRadio.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(eraseAllOkBtn));
			eraseAllOkBtn.click();
			
			if(getIsAlertPresent())
			{
				getWaitForAlert();
				getAlert().accept();
			}
			
			String expValidationMsg="Data deleted successfully.";
			
			String actValidationMsg=checkValidationMessage(expValidationMsg);
			
			System.out.println("************************************* checkEraseAllTransactionsWithUndoAuthorizationOnEditingBatchBinRMAOption  *********************************");
			System.out.println("Message  :  "+actValidationMsg +" Value Expected : "+expValidationMsg);
			
			if (actValidationMsg.equalsIgnoreCase(expValidationMsg))
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
				sl_CloseBtn.click();
				return true;
			}
			else
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
				sl_CloseBtn.click();
				return false;
			}
		}
		
		
		
		

		
		
		
		
		
		public boolean checkLogout() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
		{
		  getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplayLogo));
		  userNameDisplayLogo.click();
		 
		  getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
		  logoutOption.click();
		  
		  Thread.sleep(2000);
		  
		  System.out.println("Logout  Successfully");

		  getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(username));
		  boolean actUserName = username.isDisplayed();
		  boolean expUserName = true; 
				  
	      getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(password));
	      boolean actPassword = password.isDisplayed();
	      boolean expPassword = true;  
			
	      System.out.println("*************************CheckLogout***************************");
	      
	      System.out.println("UserName is Displaying : "+actUserName+"  Value Expected  "+expUserName);
	      System.out.println("Password is Displaying : "+actPassword+"  Value Expected  "+expPassword);
	      
		if(actUserName==expUserName && actPassword==expPassword)  
	      {
			return true;
		  }
	      else
	      {
			return false;
		  }
	    }

		
		
		
		
		
    	
	 public TransactionAuthorizationDefinitionOptionsPage(WebDriver driver)
   	 {
   		PageFactory.initElements(driver, this);	
   	 }  	
}
