package com.focus.testcases;

import java.awt.AWTException;
import java.io.IOException;


import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.focus.Pages.TransactionAuthorizationDefinitionOptionsPage;
import com.focus.Pages.preferenceMiscellinousOptionPage;
import com.focus.base.BaseEngine;

public class preferenceMiscellinousOptionTest extends BaseEngine 
{

	preferenceMiscellinousOptionPage mp;
	
	
	  /*@Test(priority=101)
	  public void checkLoginAndRestoreOptionsCompanyAndLogin() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	  {
		  mp=new preferenceMiscellinousOptionPage(getDriver());
		  Assert.assertEquals(mp.checkLoginAndRestoreOptionsCompanyAndLogin(), true);
	  }*/
	 
	  
	  @Test(priority=100)
	  public void checkLogin() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mp=new preferenceMiscellinousOptionPage(getDriver());
		 Assert.assertEquals(mp.checkLogin(), true);
	  }
	  
	  @Test(priority=102)
	  public void checkPreferencesOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mp=new preferenceMiscellinousOptionPage(getDriver());
		  Assert.assertEquals(mp.checkPreferencesOption(), true);
	  }
	

	  @Test(priority=103)
	  public void checkMiscellaneousInPreferences() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		 mp=new preferenceMiscellinousOptionPage(getDriver());
		  Assert.assertEquals(mp.checkMiscellaneousInPreferences(), true);
	  }
	

	  @Test(priority=103)
	  public void checkMiscellaneousOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		 mp=new preferenceMiscellinousOptionPage(getDriver());
		  Assert.assertEquals(mp.checkMiscellaneousOptions(), true);
	  }
	
	  
	  @Test(priority=104)
	  public void checkdontRefreshDescACProdDocChkBoxOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		 mp=new preferenceMiscellinousOptionPage(getDriver());
		  Assert.assertEquals(mp.checkdontRefreshDescACProdDocChkBoxOptions(), true);
	  }
	 
	 
	 @Test(priority=105)
	  public void checkSavingExtraFieldinVoucherBody() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		 mp=new preferenceMiscellinousOptionPage(getDriver());
		  Assert.assertEquals(mp.checkSavingExtraFieldinVoucherBody(), true);
	  }
	  
	 
	  @Test(priority=106)
	  public void checkSavingMasterItemWithDescrption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		 mp=new preferenceMiscellinousOptionPage(getDriver());
		  Assert.assertEquals(mp.checkSavingMasterItemWithDescrption(), true);
	  }
	  
	  
	
	  
	  @Test(priority=107)
	  public void checkDescrpitionFieldAddedinVoucherBody() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		 mp=new preferenceMiscellinousOptionPage(getDriver());
		  Assert.assertEquals(mp.checkDescrpitionFieldAddedinVoucherBody(), true);
	  }
	 
	  
	  @Test(priority=108)
	  public void checkshowStatusMessageInPopUpChkoxOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		 mp=new preferenceMiscellinousOptionPage(getDriver());
		  Assert.assertEquals(mp.checkshowStatusMessageInPopUpChkoxOptions(), true);
	  }
	
	   
	  
	  @Test(priority=109)//Expected Fail
	  public void checkshowStatusMessageInPopUpOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		 mp=new preferenceMiscellinousOptionPage(getDriver());
		  Assert.assertEquals(mp.checkshowStatusMessageInPopUpOption(), true);
	  }
	
	 
	  @Test(priority=110)
	  public void checkdonotLoadDocInExlusivemodeChkBoxOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		 mp=new preferenceMiscellinousOptionPage(getDriver());
		  Assert.assertEquals(mp.checkdonotLoadDocInExlusivemodeChkBoxOptions(), true);
	  }
	
	  
	  @Test(priority=111)
	  public void checkdonotLoadDocInExlusivemodeInVoucher() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	  {
		 mp=new preferenceMiscellinousOptionPage(getDriver());
		  Assert.assertEquals(mp.checkdonotLoadDocInExlusivemodeInVoucher(), true);
	  }
	   
	  
	  @Test(priority=112)
	  public void checkShowExchangeRateDifferenceInLedgerOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	  {
		 mp=new preferenceMiscellinousOptionPage(getDriver());
		  Assert.assertEquals(mp.checkDoNoModifiedDocumentIfTriggerIsRaisedOptions(), true);
	  }
	   
	  
	  @Test(priority=113)
	  public void checkSavingVoucherInPVVATView() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	  {
		 mp=new preferenceMiscellinousOptionPage(getDriver());
		  Assert.assertEquals(mp.checkSavingVoucherInPVVATView(), true);
	  }
	  
	   
	  @Test(priority=114)
	  public void checkEnableStayOnSameVoucherNumberAfterDeletingOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	  {
		 mp=new preferenceMiscellinousOptionPage(getDriver());
		  Assert.assertEquals(mp.checkEnableStayOnSameVoucherNumberAfterDeletingOptions(), true);
	  }
	  
	 
	  
	  @Test(priority=115)
	  public void checkStayOnSameVoucherNumberAfterDeletingFunctionality() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	  {
		 mp=new preferenceMiscellinousOptionPage(getDriver());
		  Assert.assertEquals(mp.checkStayOnSameVoucherNumberAfterDeletingFunctionality(), true);
	  }
	    
	  @Test(priority=116)
	  public void checkEnableCalculatedueDateFromLRDateChkBoxOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	  {
		 mp=new preferenceMiscellinousOptionPage(getDriver());
		  Assert.assertEquals(mp.checkEnableCalculatedueDateFromLRDateChkBoxOptions(), true);
	  }
	  
	
	  
	  @Test(priority=117)
	  public void checkCreatingLRExtraFiledAndCheckItsFunctionality() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	  {
		 mp=new preferenceMiscellinousOptionPage(getDriver());
		  Assert.assertEquals(mp.checkCreatingLRExtraFiledAndCheckItsFunctionality(), true);
	  }
	  
	  @Test(priority=118)
	  public void checkEnablefiltercurrencyBasedondepartmentChkBoxOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	  {
		 mp=new preferenceMiscellinousOptionPage(getDriver());
		  Assert.assertEquals(mp.checkEnablefiltercurrencyBasedondepartmentChkBoxOptions(), true);
	  }
	  
	  @Test(priority=119)
	  public void checkfiltercurrencyBasedondepartmentChkBoxFunctionality() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	  {
		 mp=new preferenceMiscellinousOptionPage(getDriver());
		  Assert.assertEquals(mp.checkfiltercurrencyBasedondepartmentChkBoxFunctionality(), true);
	  }
	   
	  
	  @Test(priority=120)
	  public void checkEnableloadDateBasesonLastSavedVoucherChkBoxOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	  {
		 mp=new preferenceMiscellinousOptionPage(getDriver());
		  Assert.assertEquals(mp.checkEnableloadDateBasesonLastSavedVoucherChkBoxOptions(), true);
	  }
	 
	  
	  @Test(priority=121)
	  public void checkloadDateBasesonLastSavedVoucherChkBoxFunctionality() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	  {
		 mp=new preferenceMiscellinousOptionPage(getDriver());
		  Assert.assertEquals(mp.checkloadDateBasesonLastSavedVoucherChkBoxFunctionality(), true);
	  }
	  
	 
	  @Test(priority=122)
	  public void checkEnableopenSearchIfMasterNotFoundChkBoxOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	  {
		 mp=new preferenceMiscellinousOptionPage(getDriver());
		  Assert.assertEquals(mp.checkEnableopenSearchIfMasterNotFoundChkBoxOptions(), true);
	  }
	    
	  @Test(priority=123)
	  public void checkopenSearchIfMasterNotFoundChkBoxFunctionality() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	  {
		 mp=new preferenceMiscellinousOptionPage(getDriver());
		  Assert.assertEquals(mp.checkopenSearchIfMasterNotFoundChkBoxFunctionality(), true);
	  }
	  
	 
	  @Test(priority=124)
	  public void checkEnabledontStoreDatesEntriesChkBoxOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	  {
		 mp=new preferenceMiscellinousOptionPage(getDriver());
		  Assert.assertEquals(mp.checkEnabledontStoreDatesEntriesChkBoxOptions(), true);
	  }
	  
	  
	  @Test(priority=125)
	  public void checkdontStoreDatesEntriesChkBoxInVoucher() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	  {
		 mp=new preferenceMiscellinousOptionPage(getDriver());
		  Assert.assertEquals(mp.checkdontStoreDatesEntriesChkBoxInVoucher(), true);
	  }
	  

	  @Test(priority=126)
	  public void checkMiscelloiniousDefaultCurrencyOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	  {
		 mp=new preferenceMiscellinousOptionPage(getDriver());
		  Assert.assertEquals(mp.checkMiscelloiniousDefaultCurrencyOptions(), true);
	  }
	
	 
	  @Test(priority=127)
	  public void checkMiscelloiniousInvoiceEmailSettingSendAsAttachementWithVoucherLevel() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	  {
		 mp=new preferenceMiscellinousOptionPage(getDriver());
		  Assert.assertEquals(mp.checkMiscelloiniousInvoiceEmailSettingSendAsAttachementWithVoucherLevel(), true);
	  }
	   
	  
	  @Test(priority=128)
	  public void checkSentMailAsAttachement() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	  {
		 mp=new preferenceMiscellinousOptionPage(getDriver());
		  Assert.assertEquals(mp.checkSentMailAsAttachement(), true);
	  }
	
	 
	  @Test(priority=129)
	  public void checkMiscelloiniousInvoiceEmailSettingSendAsBodyWithVoucherLevel() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	  {
		 mp=new preferenceMiscellinousOptionPage(getDriver());
		  Assert.assertEquals(mp.checkMiscelloiniousInvoiceEmailSettingSendAsBodyWithVoucherLevel(), true);
	  }
	  
	  @Test(priority=130)
	  public void checkSentMailAsBody() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	  {
		 mp=new preferenceMiscellinousOptionPage(getDriver());
		  Assert.assertEquals(mp.checkSentMailAsBody(), true);
	  }
	     
	 
	  @Test(priority=131)
	  public void checkMiscelloiniousRepostOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	  {
		 mp=new preferenceMiscellinousOptionPage(getDriver());
		  Assert.assertEquals(mp.checkMiscelloiniousRepostOptions(), true);
	  }
	   
	  @Test(priority=132)
	  public void checkRepostVOucherScreen() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	  {
		 mp=new preferenceMiscellinousOptionPage(getDriver());
		  Assert.assertEquals(mp.checkRepostVOucherScreen(), true);
	  }
	  
	  @Test(priority=134)
	  public void checkRepostAllVoucherFromREpostScreen() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	  {
		 mp=new preferenceMiscellinousOptionPage(getDriver());
		  Assert.assertEquals(mp.checkRepostAllVoucherFromREpostScreen(), true);
	  }
	  
	
	  
	  @Test(priority=200)
	  public void checkLogout() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	  {
		 mp=new preferenceMiscellinousOptionPage(getDriver());
		  Assert.assertEquals(mp.checkLogout(), true);
	  }
	
	  
	  
	  
}
