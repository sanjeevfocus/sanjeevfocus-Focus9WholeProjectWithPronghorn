package com.focus.testcases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.focus.Pages.MasterAuthorOptionsPage;
import com.focus.base.BaseEngine;

public class MasterAuthorOptionsTest extends BaseEngine
{

	MasterAuthorOptionsPage maop;
	
	@Test(priority=101)
	public void checkLoginToCheckMasterAuthorization() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		maop=new MasterAuthorOptionsPage(getDriver());
		Assert.assertEquals(maop.checkLoginToCheckMasterAuthorization(), true);
	}
	
	@Test(priority=102)
	public void checkOpenMasterAuthorization() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		maop=new MasterAuthorOptionsPage(getDriver());
		Assert.assertEquals(maop.checkOpenMasterAuthorization(), true);
	}
	
	@Test(priority=103)
	public void checkMasterDropdownOptions() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		maop=new MasterAuthorOptionsPage(getDriver());
		Assert.assertEquals(maop.checkMasterDropdownOptions(), true);
	}
	
	@Test(priority=104)
	public void checkSaveWithoutSelectionOfMaster() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		maop=new MasterAuthorOptionsPage(getDriver());
		Assert.assertEquals(maop.checkSaveWithoutSelectionOfMaster(), true);
	}
	
	@Test(priority=105)
	public void CheckSAvingMasterAuthorisationWithCondition() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		maop=new MasterAuthorOptionsPage(getDriver());
		Assert.assertEquals(maop.CheckSAvingMasterAuthorisationWithCondition(), true);
	}
	
	@Test(priority=106)
	public void checkSavingItemInItemMaster() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		maop=new MasterAuthorOptionsPage(getDriver());
		Assert.assertEquals(maop.checkSavingItemInItemMaster(), true);
	}
	
	
	@Test(priority=107)
	public void checkItemListAtVoucherLevel() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		maop=new MasterAuthorOptionsPage(getDriver());
		Assert.assertEquals(maop.checkItemListAtVoucherLevel(), true);
	}
	
	@Test(priority=108)
	public void checkLoginToAuthoriseUserToAuthorise() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		maop=new MasterAuthorOptionsPage(getDriver());
		Assert.assertEquals(maop.checkLoginToAuthoriseUserToAuthorise(), true);
	}
	
	
	@Test(priority=109)
	public void checkItemListAfterAuthoriseItem() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		maop=new MasterAuthorOptionsPage(getDriver());
		Assert.assertEquals(maop.checkItemListAfterAuthoriseItem(), true);
	}
	
	@Test(priority=110)
	public void checkSelectbyAnyUserOptionInMaterAuthorisation() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		maop=new MasterAuthorOptionsPage(getDriver());
		Assert.assertEquals(maop.checkSelectbyAnyUserOptionInMaterAuthorisation(), true);
	}
	
	@Test(priority=111)
	public void checkItemCreationAndAuthorisation() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		maop=new MasterAuthorOptionsPage(getDriver());
		Assert.assertEquals(maop.checkItemCreationAndAuthorisation(), true);
	}
	
	@Test(priority=112)
	public void chechLoginTOUserAccPOTransRestrictionsUserToAuthorise() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		maop=new MasterAuthorOptionsPage(getDriver());
		Assert.assertEquals(maop.chechLoginTOUserAccPOTransRestrictionsUserToAuthorise(), true);
	}
	
	@Test(priority=113)
	public void checkItemAuthoriseStatusInSuperUser() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		maop=new MasterAuthorOptionsPage(getDriver());
		Assert.assertEquals(maop.checkItemAuthoriseStatusInSuperUser(), true);
	}
	
	
	
	@Test(priority=114)
	public void checkSelectingSelectedUserOptionInAuthorisation() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		maop=new MasterAuthorOptionsPage(getDriver());
		Assert.assertEquals(maop.checkSelectingSelectedUserOptionInAuthorisation(), true);
	}
	
	@Test(priority=115)
	public void checkItemCreationAndAuthorisationForSelectedUser() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		maop=new MasterAuthorOptionsPage(getDriver());
		Assert.assertEquals(maop.checkItemCreationAndAuthorisationForSelectedUser(), true);
	}
	
	@Test(priority=116)
	public void chechLoginTOUserAccPOTransRestrictionsUserToAuthoriseForSelectedUserOption() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		maop=new MasterAuthorOptionsPage(getDriver());
		Assert.assertEquals(maop.chechLoginTOUserAccPOTransRestrictionsUserToAuthoriseForSelectedUserOption(), true);
	}
	
	@Test(priority=117)
	public void checkItemAuthoriseStatusInSuperUserAfterOneUserAuthorised() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		maop=new MasterAuthorOptionsPage(getDriver());
		Assert.assertEquals(maop.checkItemAuthoriseStatusInSuperUserAfterOneUserAuthorised(), true);
	}
	
	
	@Test(priority=118)
	public void chechLoginTOUserAllOptionsUserToAuthoriseForSelectedUserOption() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		maop=new MasterAuthorOptionsPage(getDriver());
		Assert.assertEquals(maop.chechLoginTOUserAllOptionsUserToAuthoriseForSelectedUserOption(), true);
	}
	
	@Test(priority=119)
	public void checkItemAuthoriseStatusInSuperUserAfterTwoUserAuthorised() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		maop=new MasterAuthorOptionsPage(getDriver());
		Assert.assertEquals(maop.checkItemAuthoriseStatusInSuperUserAfterTwoUserAuthorised(), true);
	}
	
	
	@Test(priority=120)
	public void checkAddingLevelInMasterAuthorisation() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		maop=new MasterAuthorOptionsPage(getDriver());
		Assert.assertEquals(maop.checkAddingLevelInMasterAuthorisation(), true);
	}
	
	@Test(priority=121)
	public void checkSavingitemInItemMasterAfterAddingLevel() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		maop=new MasterAuthorOptionsPage(getDriver());
		Assert.assertEquals(maop.checkSavingitemInItemMasterAfterAddingLevel(), true);
	}
	
	@Test(priority=122)
	public void checkPendingStatusOFItemWithProductTypeRawMaterial() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		maop=new MasterAuthorOptionsPage(getDriver());
		Assert.assertEquals(maop.checkPendingStatusOFItemWithProductTypeRawMaterial(), true);
	}
	
	@Test(priority=123)
	public void checkItemStatusOFProductTypeSevice() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		maop=new MasterAuthorOptionsPage(getDriver());
		Assert.assertEquals(maop.checkItemStatusOFProductTypeSevice(), true);
	}
	
	
	@Test(priority=124)
	public void checkPendingItemsInUserAllOptionsUser() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		maop=new MasterAuthorOptionsPage(getDriver());
		Assert.assertEquals(maop.checkPendingItemsInUserAllOptionsUser(), true);
	}
	
	
	@Test(priority=125)
	public void checkPendingItemsInUserAccPOTransRestrictions() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		maop=new MasterAuthorOptionsPage(getDriver());
		Assert.assertEquals(maop.checkPendingItemsInUserAccPOTransRestrictions(), true);
	}
	
	@Test(priority=126)
	public void checkAuthorisationStatusOFItemsInSuperUserAfterTwoUserAuthorised() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		maop=new MasterAuthorOptionsPage(getDriver());
		Assert.assertEquals(maop.checkAuthorisationStatusOFItemsInSuperUserAfterTwoUserAuthorised(), true);
	}
	
	
	@Test(priority=127)
	public void checkAuthorisationInfoOfProductRawMaterial() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		maop=new MasterAuthorOptionsPage(getDriver());
		Assert.assertEquals(maop.checkAuthorisationInfoOfProductRawMaterial(), true);
	}
	
	@Test(priority=128)
	public void checkFullAuthorizationOptionInMasterAuthor() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		maop=new MasterAuthorOptionsPage(getDriver());
		Assert.assertEquals(maop.checkFullAuthorizationOptionInMasterAuthor(), true);
	}
	
	@Test(priority=129)
	public void checkSavingItemForFullAuthorisationOption() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		maop=new MasterAuthorOptionsPage(getDriver());
		Assert.assertEquals(maop.checkSavingItemForFullAuthorisationOption(), true);
	}
	
	@Test(priority=130)
	public void checkFullAuthorItemInSuperUserAfterLevel2UserAuthorisation() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		maop=new MasterAuthorOptionsPage(getDriver());
		Assert.assertEquals(maop.checkFullAuthorItemInSuperUserAfterLevel2UserAuthorisation(), true);
	}

	
	
	
}
