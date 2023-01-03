package com.focus.testcases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.focus.Pages.BatchWithAllOptionsPage;
import com.focus.base.BaseEngine;

public class BatchWithAllOptionsTest extends BaseEngine 
{
	
	BatchWithAllOptionsPage batch;

	
	 @Test(priority=543001)
	 public void checkLogin() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		batch=new BatchWithAllOptionsPage(getDriver());
		 Assert.assertEquals(batch.checkLogin(), true);
	 }
	
	
	 /*@Test(priority=543001)
	 public void checkLoginAndRestoreOptionsCompanyAndLogin() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		batch=new BatchWithAllOptionsPage(getDriver());
		 Assert.assertEquals(batch.checkLoginAndRestoreOptionsCompanyAndLogin(), true);
	 }*/
	 
	 
	 // Options Starts Here
	 
	 @Test(priority=553096)
	 public void checkSettingsConfigureTransactionsPreferencesBatchUpdatingAllowNegativeBatchQuantitieOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		batch=new BatchWithAllOptionsPage(getDriver());
		Assert.assertEquals(batch.checkSettingsConfigureTransactionsPreferencesBatchUpdatingAllowNegativeBatchQuantitieOption(), true);
	 }
	 
	 @Test(priority=553097)
	 public void checkLogoutAndLoginAfterUpdatingAllowNegativeBatchQuantitieOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		batch=new BatchWithAllOptionsPage(getDriver());
		Assert.assertEquals(batch.checkLogoutAndLoginAfterUpdatingAllowNegativeBatchQuantitieOption(), true);
	 }
	 
	 @Test(priority=553098)
	 public void checkSavingPurchaseVoucherVATVoucher1AfterUpdatingAllowingNegativeBatchQuantityOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		batch=new BatchWithAllOptionsPage(getDriver());
		Assert.assertEquals(batch.checkSavingPurchaseVoucherVATVoucher1AfterUpdatingAllowingNegativeBatchQuantityOption(), true);
	 }
	 
	 @Test(priority=553099)
	 public void checkSavingSalesInvoiceVATVoucher1WithAboveAvailableQuantityAfterAllowNegativeBatchQuantities() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		batch=new BatchWithAllOptionsPage(getDriver());
		Assert.assertEquals(batch.checkSavingSalesInvoiceVATVoucher1WithAboveAvailableQuantityAfterAllowNegativeBatchQuantities(), true);
	 }
	 
	 @Test(priority=553100)
	 public void checkEraseAllTransactionsAfterCompletingAllowingNegativeBatchQuantities() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		batch=new BatchWithAllOptionsPage(getDriver());
		Assert.assertEquals(batch.checkEraseAllTransactionsAfterCompletingAllowingNegativeBatchQuantities(), true);
	 }
	 
	
	
	 @Test(priority=553101)
	 public void checkSettingsConfigureTransactionsPreferencesBatchSelectDoNotAcceptDuplicateBatchesInInwardsDoc() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		batch=new BatchWithAllOptionsPage(getDriver());
		Assert.assertEquals(batch.checkSettingsConfigureTransactionsPreferencesBatchSelectDoNotAcceptDuplicateBatchesInInwardsDoc(), true);
	 }
	 
	 @Test(priority=553102)
	 public void checkLogoutAndLoginAfterUpdatingDoNotAcceptDuplicateBatchesInInwardDoc() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		batch=new BatchWithAllOptionsPage(getDriver());
		Assert.assertEquals(batch.checkLogoutAndLoginAfterUpdatingDoNotAcceptDuplicateBatchesInInwardDoc(), true);
	 }
	 
	 @Test(priority=553103)
	 public void checkSavingPurchaseVoucherVATVoucher1WithDoNotAcceptDuplicateBatcesInInwardDocument() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		batch=new BatchWithAllOptionsPage(getDriver());
		Assert.assertEquals(batch.checkSavingPurchaseVoucherVATVoucher1WithDoNotAcceptDuplicateBatcesInInwardDocument(), true);
	 }
	 
	 @Test(priority=553104)
	 public void checkPurchaseVoucher2TryingToSaveVoucherWithDuplicateBatchNo() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		batch=new BatchWithAllOptionsPage(getDriver());
		Assert.assertEquals(batch.checkPurchaseVoucher2TryingToSaveVoucherWithDuplicateBatchNo(), true);
	 }
	 
	 @Test(priority=553105)
	 public void checkEraseAllTransactionsAfterCompletingDoNotAcceptDuplicateBatchesInInwardsDocument() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		batch=new BatchWithAllOptionsPage(getDriver());
		Assert.assertEquals(batch.checkEraseAllTransactionsAfterCompletingDoNotAcceptDuplicateBatchesInInwardsDocument(), true);
	 }
	 
	 
	 
	 @Test(priority=553106)
	 public void checkSettingsConfigureTransactionsPreferencesBatchSelectManufacturingDatesByBatch() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		batch=new BatchWithAllOptionsPage(getDriver());
		Assert.assertEquals(batch.checkSettingsConfigureTransactionsPreferencesBatchSelectManufacturingDatesByBatch(), true);
	 }
	 
	 @Test(priority=553107)
	 public void checkLogoutAndLoginAfterUpdatingManufacturingDateByBatch() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		batch=new BatchWithAllOptionsPage(getDriver());
		Assert.assertEquals(batch.checkLogoutAndLoginAfterUpdatingManufacturingDateByBatch(), true);
	 }
	 
	 @Test(priority=553108)// Error message is displaying as MFGDate {0} cannot be more than {1} document date.
	 public void checkSavingPurchaseVoucherVATVoucher1WithManufactureDateAsMoreThanCurrentDate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		batch=new BatchWithAllOptionsPage(getDriver());
		Assert.assertEquals(batch.checkSavingPurchaseVoucherVATVoucher1WithManufactureDateAsMoreThanCurrentDate(), true);
	 }
	 
	 @Test(priority=553109)
	 public void checkSavingPurchaseVoucherVATVoucher1WithManufacturingDateAsCurrentDate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		batch=new BatchWithAllOptionsPage(getDriver());
		Assert.assertEquals(batch.checkSavingPurchaseVoucherVATVoucher1WithManufacturingDateAsCurrentDate(), true);
	 }
	 
	 @Test(priority=553110)
	 public void checkSavingSalesInvoiceVATVoucher1AfterUpdatingManufacturingDatesForBatches() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		batch=new BatchWithAllOptionsPage(getDriver());
		Assert.assertEquals(batch.checkSavingSalesInvoiceVATVoucher1AfterUpdatingManufacturingDatesForBatches(), true);
	 }
	 
	 @Test(priority=553111)
	 public void checkEraseAllTransactionsAfterCompletingManufacturingDatesByBatches() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		batch=new BatchWithAllOptionsPage(getDriver());
		Assert.assertEquals(batch.checkEraseAllTransactionsAfterCompletingManufacturingDatesByBatches(), true);
	 }
	 
	 
	 
	 
	 @Test(priority=553112)
	 public void checkSettingsConfigureTransactionsPreferencesBatchSelectExpiryDatesOptional() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		batch=new BatchWithAllOptionsPage(getDriver());
		Assert.assertEquals(batch.checkSettingsConfigureTransactionsPreferencesBatchSelectExpiryDatesOptional(), true);
	 }
	 
	 @Test(priority=553113)
	 public void checkLogoutAndLoginAfterUpdatingExpiryDatesOptional() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		batch=new BatchWithAllOptionsPage(getDriver());
		Assert.assertEquals(batch.checkLogoutAndLoginAfterUpdatingExpiryDatesOptional(), true);
	 }
	 
	 @Test(priority=553114)
	 public void checkSavingPurchaseVoucherVATVoucher1WithoutExpiryDateAfterUpdatingExpiryDatesOptional() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		batch=new BatchWithAllOptionsPage(getDriver());
		Assert.assertEquals(batch.checkSavingPurchaseVoucherVATVoucher1WithoutExpiryDateAfterUpdatingExpiryDatesOptional(), true);
	 }
	 
	 @Test(priority=553115)
	 public void checkSavingSalesInvoiceVATVoucher1WithExpiryDatesOptional() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		batch=new BatchWithAllOptionsPage(getDriver());
		Assert.assertEquals(batch.checkSavingSalesInvoiceVATVoucher1WithExpiryDatesOptional(), true);
	 }
	 
	 @Test(priority=553116)
	 public void checkEraseAllTransactionsAfterCompletingExpiryDatesOptional() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		batch=new BatchWithAllOptionsPage(getDriver());
		Assert.assertEquals(batch.checkEraseAllTransactionsAfterCompletingExpiryDatesOptional(), true);
	 }
	 
	 

	 
	 @Test(priority=553117)
	 public void checkSettingsConfigureTransactionsPreferencesBatchSelectIgnoreDateInExpiry() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		batch=new BatchWithAllOptionsPage(getDriver());
		Assert.assertEquals(batch.checkSettingsConfigureTransactionsPreferencesBatchSelectIgnoreDateInExpiry(), true);
	 }
	 
	 @Test(priority=553118)
	 public void checkLogoutAndLoginAfterUpdatingIgnoreDaysInExpiry() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		batch=new BatchWithAllOptionsPage(getDriver());
		Assert.assertEquals(batch.checkLogoutAndLoginAfterUpdatingIgnoreDaysInExpiry(), true);
	 }
	 
	 @Test(priority=553119)
	 public void checkSavingPurchaseVoucherVATVoucher1WithIgnoreDaysInExpiry() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		batch=new BatchWithAllOptionsPage(getDriver());
		Assert.assertEquals(batch.checkSavingPurchaseVoucherVATVoucher1WithIgnoreDaysInExpiry(), true);
	 }
	 
	 @Test(priority=553120)
	 public void checkSavingSalesInvoiceVATVoucher1WithIgnoreDayInExpiry() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		batch=new BatchWithAllOptionsPage(getDriver());
		Assert.assertEquals(batch.checkSavingSalesInvoiceVATVoucher1WithIgnoreDayInExpiry(), true);
	 }
	 
	 @Test(priority=553121)
	 public void checkEraseAllTransactionsAfterCompletingIgnoreDateInExpiry() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		batch=new BatchWithAllOptionsPage(getDriver());
		Assert.assertEquals(batch.checkEraseAllTransactionsAfterCompletingIgnoreDateInExpiry(), true);
	 }
	 
	 
	 
	 
	 @Test(priority=553122)
	 public void checkSettingsConfigureTransactionsPreferencesBatchSelectCalculateExpiryDateFromItem() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		batch=new BatchWithAllOptionsPage(getDriver());
		Assert.assertEquals(batch.checkSettingsConfigureTransactionsPreferencesBatchSelectCalculateExpiryDateFromItem(), true);
	 }
	 
	 @Test(priority=553123)
	 public void checkLogoutAndLoginAfterUpdatingCalculateExpiryDateFromItem() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		batch=new BatchWithAllOptionsPage(getDriver());
		Assert.assertEquals(batch.checkLogoutAndLoginAfterUpdatingCalculateExpiryDateFromItem(), true);
	 }
	  
	 @Test(priority=553124)
	 public void checkUpdatingItemExpiryDateBy5Days() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		batch=new BatchWithAllOptionsPage(getDriver());
		Assert.assertEquals(batch.checkUpdatingItemExpiryDateBy5Days(), true);
	 }
	
	 @Test(priority=553125)
	 public void checkPurchaseVoucherVATVoucher1ShowingExpiryDate5DaysAboveFromCurrentDate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		batch=new BatchWithAllOptionsPage(getDriver());
		Assert.assertEquals(batch.checkPurchaseVoucherVATVoucher1ShowingExpiryDate5DaysAboveFromCurrentDate(), true);
	 }
	 
	 @Test(priority=553126)
	 public void checkChangingBackItemExpiryDateTo0Days() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		batch=new BatchWithAllOptionsPage(getDriver());
		Assert.assertEquals(batch.checkChangingBackItemExpiryDateTo0Days(), true);
	 }
	 
	 
	 
	 
	 
	 
	 @Test(priority=553127)
	 public void checkSettingsConfigureTransactionsPreferencesBatchSelectCannotSellBatchesThatWouldExpireInNext2days() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		batch=new BatchWithAllOptionsPage(getDriver());
		Assert.assertEquals(batch.checkSettingsConfigureTransactionsPreferencesBatchSelectCannotSellBatchesThatWouldExpireInNext2days(), true);
	 }
	 
	 @Test(priority=553128)
	 public void checkLogoutAndLoginAfterUpdatingCannotSellBatchesThatWouldExpireInNext2days() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		batch=new BatchWithAllOptionsPage(getDriver());
		Assert.assertEquals(batch.checkLogoutAndLoginAfterUpdatingCannotSellBatchesThatWouldExpireInNext2days(), true);
	 }
	 
	 @Test(priority=553129)
	 public void checkSavingPurchaseVoucherVATVoucher1WithCannotSellBatchesThatWouldExpity2Days() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		batch=new BatchWithAllOptionsPage(getDriver());
		Assert.assertEquals(batch.checkSavingPurchaseVoucherVATVoucher1WithCannotSellBatchesThatWouldExpity2Days(), true);
	 }
	 
	 @Test(priority=553130)
	 public void checkSalesInvoiceVATVoucher1BatchPopupWithCannotSellBatchesThatWouldExpiryIn2Days() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		batch=new BatchWithAllOptionsPage(getDriver());
		Assert.assertEquals(batch.checkSalesInvoiceVATVoucher1BatchPopupWithCannotSellBatchesThatWouldExpiryIn2Days(), true);
	 }
	 
	 @Test(priority=553131)
	 public void checkEditingPurchaseVoucherVATVoucher1AndSavingWithExpireDate3DaysAfterCurrentDate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		batch=new BatchWithAllOptionsPage(getDriver());
		Assert.assertEquals(batch.checkEditingPurchaseVoucherVATVoucher1AndSavingWithExpireDate3DaysAfterCurrentDate(), true);
	 }
	 
	 @Test(priority=553132)
	 public void checkSavingSalesInvoiceVATVoucher1AfterUpdatingExpireDateTo3Days() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		batch=new BatchWithAllOptionsPage(getDriver());
		Assert.assertEquals(batch.checkSavingSalesInvoiceVATVoucher1AfterUpdatingExpireDateTo3Days(), true);
	 }
	 
	 @Test(priority=553133)
	 public void checkEraseAllTransactionsAfterCompletingCannotSellBatchesThatWouldExpireInNext2Days() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		batch=new BatchWithAllOptionsPage(getDriver());
		Assert.assertEquals(batch.checkEraseAllTransactionsAfterCompletingCannotSellBatchesThatWouldExpireInNext2Days(), true);
	 }
	 
	 
	 
	 @Test(priority=553134)
	 public void checkSettingsConfigureTransactionsPreferencesBatchSelectCannotSellBatchesThatWouldExpireInNext2Weeks() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		batch=new BatchWithAllOptionsPage(getDriver());
		Assert.assertEquals(batch.checkSettingsConfigureTransactionsPreferencesBatchSelectCannotSellBatchesThatWouldExpireInNext2Weeks(), true);
	 }
	 
	 @Test(priority=553135)
	 public void checkLogoutAndLoginAfterUpdatingCannotSellBatchesThatWouldExpireInNext2Weeks() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		batch=new BatchWithAllOptionsPage(getDriver());
		Assert.assertEquals(batch.checkLogoutAndLoginAfterUpdatingCannotSellBatchesThatWouldExpireInNext2Weeks(), true);
	 }
	 
	 @Test(priority=553136)
	 public void checkSavingPurchaseVoucherVATVoucher1WithCannotSellBatchesThatWouldExpiry2Weeks() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		batch=new BatchWithAllOptionsPage(getDriver());
		Assert.assertEquals(batch.checkSavingPurchaseVoucherVATVoucher1WithCannotSellBatchesThatWouldExpiry2Weeks(), true);
	 } 
	 
	 @Test(priority=553137)
	 public void checkSalesInvoiceVATVoucher1WithCannotSellBatchesThatWouldExpireIn2Weeks() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		batch=new BatchWithAllOptionsPage(getDriver());
		Assert.assertEquals(batch.checkSalesInvoiceVATVoucher1WithCannotSellBatchesThatWouldExpireIn2Weeks(), true);
	 }
	 
	 @Test(priority=553138)
	 public void checkEditingPurchaseVoucher1SavingWithExpiryDateAs15DaysAfterCurrentDate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		batch=new BatchWithAllOptionsPage(getDriver());
		Assert.assertEquals(batch.checkEditingPurchaseVoucher1SavingWithExpiryDateAs15DaysAfterCurrentDate(), true);
	 }
	 
	 @Test(priority=553139)
	 public void checkSavingSalesInvoiceVATVoucher1WithCannotSellBatchesThatWouldExpireIn2Weeks() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		batch=new BatchWithAllOptionsPage(getDriver());
		Assert.assertEquals(batch.checkSavingSalesInvoiceVATVoucher1WithCannotSellBatchesThatWouldExpireIn2Weeks(), true);
	 }
	 
	 @Test(priority=553140)
	 public void checkEraseAllTransactionsAfterCompletingCannotSellBatchesThatWouldExpireInNext2Weeks() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		batch=new BatchWithAllOptionsPage(getDriver());
		Assert.assertEquals(batch.checkEraseAllTransactionsAfterCompletingCannotSellBatchesThatWouldExpireInNext2Weeks(), true);
	 }
	 
	 
	 
	 
	 @Test(priority=553141)
	 public void checkSettingsConfigureTransactionsPreferencesBatchSelectCannotSellBatchesThatWouldExpireInNext2Months() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		batch=new BatchWithAllOptionsPage(getDriver());
		Assert.assertEquals(batch.checkSettingsConfigureTransactionsPreferencesBatchSelectCannotSellBatchesThatWouldExpireInNext2Months(), true);
	 }
	 
	 @Test(priority=553142)
	 public void checkLogoutAndLoginAfterUpdatingCannotSellBatchesThatWouldExpireInNext2Months() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		batch=new BatchWithAllOptionsPage(getDriver());
		Assert.assertEquals(batch.checkLogoutAndLoginAfterUpdatingCannotSellBatchesThatWouldExpireInNext2Months(), true);
	 }
	 
	 @Test(priority=553143)
	 public void checkSavingPurchaseVoucherVATVoucher1WithCannotSellBatchesThatWouldExpiryIn2Months() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		batch=new BatchWithAllOptionsPage(getDriver());
		Assert.assertEquals(batch.checkSavingPurchaseVoucherVATVoucher1WithCannotSellBatchesThatWouldExpiryIn2Months(), true);
	 }
	 
	 @Test(priority=553144)
	 public void checkSalesInvoiceVATVoucher1WithCannotSellBatchesThatWouldExpire2Months() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		batch=new BatchWithAllOptionsPage(getDriver());
		Assert.assertEquals(batch.checkSalesInvoiceVATVoucher1WithCannotSellBatchesThatWouldExpire2Months(), true);
	 }
	 
	 @Test(priority=553145)
	 public void checkEditingPurchaseVoucherVATVoucher1AndSavingWithExpireDateMonthsAfterCurrentDate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		batch=new BatchWithAllOptionsPage(getDriver());
		Assert.assertEquals(batch.checkEditingPurchaseVoucherVATVoucher1AndSavingWithExpireDateMonthsAfterCurrentDate(), true);
	 }
	 
	 @Test(priority=553146)
	 public void checkSavingSalesInvoiceVATVoucher16AfterUpdatingExpireDate3MonthsAfterCurrentDate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		batch=new BatchWithAllOptionsPage(getDriver());
		Assert.assertEquals(batch.checkSavingSalesInvoiceVATVoucher16AfterUpdatingExpireDate3MonthsAfterCurrentDate(), true);
	 }
	 
	 @Test(priority=553147)
	 public void checkEraseAllTransactionsAfterCompletingCannotSellBatchesThatWouldExpireInNext2Months() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		batch=new BatchWithAllOptionsPage(getDriver());
		Assert.assertEquals(batch.checkEraseAllTransactionsAfterCompletingCannotSellBatchesThatWouldExpireInNext2Months(), true);
	 }
	 
	 
	 
	 
	 @Test(priority=553148)
	 public void checkSettingsConfigureTransactionsPreferencesBatchSelectSortBatchesByExpiryDate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		batch=new BatchWithAllOptionsPage(getDriver());
		Assert.assertEquals(batch.checkSettingsConfigureTransactionsPreferencesBatchSelectSortBatchesByExpiryDate(), true);
	 }
	 
	 @Test(priority=553149)
	 public void checkLogoutAndLoginAfterUpdatingSortBatchByExpireDate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		batch=new BatchWithAllOptionsPage(getDriver());
		Assert.assertEquals(batch.checkLogoutAndLoginAfterUpdatingSortBatchByExpireDate(), true);
	 }
	 
	 @Test(priority=553150)
	 public void checkPurchaseVoucherVATVoucher1EnteringDataIntoRow1() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		batch=new BatchWithAllOptionsPage(getDriver());
		Assert.assertEquals(batch.checkPurchaseVoucherVATVoucher1EnteringDataIntoRow1(), true);
	 }
	 
	 @Test(priority=553151)
	 public void checkPurchaseVoucherVATVoucher1EnteringDataInRow2() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		batch=new BatchWithAllOptionsPage(getDriver());
		Assert.assertEquals(batch.checkPurchaseVoucherVATVoucher1EnteringDataInRow2(), true);
	 }
	 
	 @Test(priority=553152)
	 public void checkPurchaseVoucherVATVoucher1EnteringDataInRow3() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		batch=new BatchWithAllOptionsPage(getDriver());
		Assert.assertEquals(batch.checkPurchaseVoucherVATVoucher1EnteringDataInRow3(), true);
	 }
	 
	 @Test(priority=553153)
	 public void checkPurchaseVoucherVATVoucher1EnteringDataInRow4() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		batch=new BatchWithAllOptionsPage(getDriver());
		Assert.assertEquals(batch.checkPurchaseVoucherVATVoucher1EnteringDataInRow4(), true);
	 }
	 
	 @Test(priority=553154)
	 public void checkSavingPurchaseVoucherVATVoucher1With4Rows() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		batch=new BatchWithAllOptionsPage(getDriver());
		Assert.assertEquals(batch.checkSavingPurchaseVoucherVATVoucher1With4Rows(), true);
	 }
	
	 @Test(priority=553155) // Not Sorting according to the Expiry Date
	 public void checkSalesInvoiceVATVoucher1BatchPopupData() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		batch=new BatchWithAllOptionsPage(getDriver());
		Assert.assertEquals(batch.checkSalesInvoiceVATVoucher1BatchPopupData(), true);
	 }
	 
	 @Test(priority=553156) // Failed Due to Previous Method.
	 public void checkSavingSalesInvoiceVATVoucher1() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		batch=new BatchWithAllOptionsPage(getDriver());
		Assert.assertEquals(batch.checkSavingSalesInvoiceVATVoucher1(), true);
	 }
	 
	 @Test(priority=553157)
	 public void checkEraseAllTransactionsAfterCompletingSortBatchesByExpiryDates() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		batch=new BatchWithAllOptionsPage(getDriver());
		Assert.assertEquals(batch.checkEraseAllTransactionsAfterCompletingSortBatchesByExpiryDates(), true);
	 }
	 
	 
	 
	 
	 @Test(priority=553158)
	 public void checkSettingsConfigureTransactionsPreferencesBatchSelectConsolidateBatchesByBatchNo() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		batch=new BatchWithAllOptionsPage(getDriver());
		Assert.assertEquals(batch.checkSettingsConfigureTransactionsPreferencesBatchSelectConsolidateBatchesByBatchNo(), true);
	 }
	 
	 @Test(priority=553159)
	 public void checkLogoutAndLoginAfterUpdatingConsolidateBatchesByBatchNo() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		batch=new BatchWithAllOptionsPage(getDriver());
		Assert.assertEquals(batch.checkLogoutAndLoginAfterUpdatingConsolidateBatchesByBatchNo(), true);
	 }
	 
	 @Test(priority=553160)
	 public void checkPurchaseVoucherVATVoucher1EnteringDataIntoRow1ConsolidateBatch() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		batch=new BatchWithAllOptionsPage(getDriver());
		Assert.assertEquals(batch.checkPurchaseVoucherVATVoucher1EnteringDataIntoRow1ConsolidateBatch(), true);
	 }
	 
	 @Test(priority=553161)
	 public void checkPurchaseVoucherVATVoucher1EnteringDataInRow2ConsolidateBatches() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		batch=new BatchWithAllOptionsPage(getDriver());
		Assert.assertEquals(batch.checkPurchaseVoucherVATVoucher1EnteringDataInRow2ConsolidateBatches(), true);
	 }
	 
	 @Test(priority=553162)
	 public void checkPurchaseVoucherVATVoucher1EnteringDataInRow3ConsolidateBatches() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		batch=new BatchWithAllOptionsPage(getDriver());
		Assert.assertEquals(batch.checkPurchaseVoucherVATVoucher1EnteringDataInRow3ConsolidateBatches(), true);
	 }
	 
	 @Test(priority=553163)
	 public void checkPurchaseVoucherVATVoucher1EnteringDataInRow4ConsolidateBatches() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		batch=new BatchWithAllOptionsPage(getDriver());
		Assert.assertEquals(batch.checkPurchaseVoucherVATVoucher1EnteringDataInRow4ConsolidateBatches(), true);
	 }
	 
	 @Test(priority=553164)
	 public void checkSavingPurchaseVoucherVATVoucher1With4RowsConsolidateBatches() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		batch=new BatchWithAllOptionsPage(getDriver());
		Assert.assertEquals(batch.checkSavingPurchaseVoucherVATVoucher1With4RowsConsolidateBatches(), true);
	 }
	 
	 @Test(priority=553165)
	 public void checkSavingSalesInvoiceVATVoucher1AfterUpdatingConsolidateBatchesByBatchNo() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		batch=new BatchWithAllOptionsPage(getDriver());
		Assert.assertEquals(batch.checkSavingSalesInvoiceVATVoucher1AfterUpdatingConsolidateBatchesByBatchNo(), true);
	 }
	 
	 @Test(priority=553166)
	 public void checkEraseAllTransactionsAfterCompletingConsolidateBatchesByBatchNos() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		batch=new BatchWithAllOptionsPage(getDriver());
		Assert.assertEquals(batch.checkEraseAllTransactionsAfterCompletingConsolidateBatchesByBatchNos(), true);
	 }
	 
	 
	 
	 
	 @Test(priority=553167)
	 public void checkSettingsConfigureTransactionsPreferencesBatchSelectSuggestNextBatchNoInInwardDoc() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		batch=new BatchWithAllOptionsPage(getDriver());
		Assert.assertEquals(batch.checkSettingsConfigureTransactionsPreferencesBatchSelectSuggestNextBatchNoInInwardDoc(), true);
	 }
	 
	 @Test(priority=553168)
	 public void checkLogoutAndLoginAfterUpdatingSuggestNextBatchNoInInwardDoc() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		batch=new BatchWithAllOptionsPage(getDriver());
		Assert.assertEquals(batch.checkLogoutAndLoginAfterUpdatingSuggestNextBatchNoInInwardDoc(), true);
	 }
	 
	 @Test(priority=553169)
	 public void checkPurchaseVoucherVATVoucher1EnteringDataInRow1() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		batch=new BatchWithAllOptionsPage(getDriver());
		Assert.assertEquals(batch.checkPurchaseVoucherVATVoucher1EnteringDataInRow1(), true);
	 }
	 
	 @Test(priority=553170)
	 public void checkPurchaseVoucherVATVoucher1EnteringDataInRow2SuggestNextBatch() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		batch=new BatchWithAllOptionsPage(getDriver());
		Assert.assertEquals(batch.checkPurchaseVoucherVATVoucher1EnteringDataInRow2SuggestNextBatch(), true);
	 }
	 
	 @Test(priority=553171)
	 public void checkPurchaseVoucherVATVoucher1EnteringDataInRow3SuggestNext() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		batch=new BatchWithAllOptionsPage(getDriver());
		Assert.assertEquals(batch.checkPurchaseVoucherVATVoucher1EnteringDataInRow3SuggestNext(), true);
	 }
	 
	 @Test(priority=553172)
	 public void checkSavingPurchaseVoucherVATVoucher1With3RowsSuggestNext() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		batch=new BatchWithAllOptionsPage(getDriver());
		Assert.assertEquals(batch.checkSavingPurchaseVoucherVATVoucher1With3RowsSuggestNext(), true);
	 }
	 
	 @Test(priority=553173) // Rows are up and down
	 public void checkSavingSalesInvoiceVATVoucher1AfterUpdatingSuggestNextBatchInInwardsDocument() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		batch=new BatchWithAllOptionsPage(getDriver());
		Assert.assertEquals(batch.checkSavingSalesInvoiceVATVoucher1AfterUpdatingSuggestNextBatchInInwardsDocument(), true);
	 }
	 
	 @Test(priority=553174)
	 public void checkEraseAllTransactionsAfterCompletingSuggestNextBatchNoInInwardDoc() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		batch=new BatchWithAllOptionsPage(getDriver());
		Assert.assertEquals(batch.checkEraseAllTransactionsAfterCompletingSuggestNextBatchNoInInwardDoc(), true);
	 }
	 
	 
	 
	 
	 @Test(priority=553175)
	 public void checkSettingsConfigureTransactionsPreferencesBatchSelectHideRate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		batch=new BatchWithAllOptionsPage(getDriver());
		Assert.assertEquals(batch.checkSettingsConfigureTransactionsPreferencesBatchSelectHideRate(), true);
	 }
	 
	 @Test(priority=553176)
	 public void checkLogoutAndLoginAfterUpdatingHideRate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		batch=new BatchWithAllOptionsPage(getDriver());
		Assert.assertEquals(batch.checkLogoutAndLoginAfterUpdatingHideRate(), true);
	 }
	 
	 @Test(priority=553177)
	 public void checkSavingPurchaseVoucherVATVoucher1AfterUpdatingHideRate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		batch=new BatchWithAllOptionsPage(getDriver());
		Assert.assertEquals(batch.checkSavingPurchaseVoucherVATVoucher1AfterUpdatingHideRate(), true);
	 }
	 
	 @Test(priority=553178)
	 public void checkSavingSalesInvoiceVATVoucher1AfterUpdatingHideRate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		batch=new BatchWithAllOptionsPage(getDriver());
		Assert.assertEquals(batch.checkSavingSalesInvoiceVATVoucher1AfterUpdatingHideRate(), true);
	 }
	 
	 @Test(priority=553179)
	 public void checkEraseAllTransactionsAfterCompletingHideRate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		batch=new BatchWithAllOptionsPage(getDriver());
		Assert.assertEquals(batch.checkEraseAllTransactionsAfterCompletingHideRate(), true);
	 }
	 
	 
	 
	 
	 @Test(priority=553180)
	 public void checkSettingsConfigureTransactionsPreferencesBatchSelectInputBatchRetailPrice() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		batch=new BatchWithAllOptionsPage(getDriver());
		Assert.assertEquals(batch.checkSettingsConfigureTransactionsPreferencesBatchSelectInputBatchRetailPrice(), true);
	 }
	 
	 @Test(priority=553181)
	 public void checkLogoutAndLoginAfterUpdatingInputBatchRetailPrice() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		batch=new BatchWithAllOptionsPage(getDriver());
		Assert.assertEquals(batch.checkLogoutAndLoginAfterUpdatingInputBatchRetailPrice(), true);
	 }
	 
	 @Test(priority=553182)
	 public void checkSavingPurchaseVoucherVATVoucher1AfterUpdatingInputBatchRetailPrice() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		batch=new BatchWithAllOptionsPage(getDriver());
		Assert.assertEquals(batch.checkSavingPurchaseVoucherVATVoucher1AfterUpdatingInputBatchRetailPrice(), true);
	 }
	
	 @Test(priority=553183)
	 public void checkUpdatingSalesInvoiceVATVoucherSettingsEditScreenSelectBehaviourDropDownAsBatchRate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		batch=new BatchWithAllOptionsPage(getDriver());
		Assert.assertEquals(batch.checkUpdatingSalesInvoiceVATVoucherSettingsEditScreenSelectBehaviourDropDownAsBatchRate(), true);
	 }
	 
	 @Test(priority=553184)
	 public void checkSavingSalesInvoiceVATVoucher1AfterUpdatingInputBatchRetailPrice() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		batch=new BatchWithAllOptionsPage(getDriver());
		Assert.assertEquals(batch.checkSavingSalesInvoiceVATVoucher1AfterUpdatingInputBatchRetailPrice(), true);
	 }
	 
	 @Test(priority=553185)
	 public void checkEraseAllTransactionsAfterCompletingInputBatchRetailPrice() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		batch=new BatchWithAllOptionsPage(getDriver());
		Assert.assertEquals(batch.checkEraseAllTransactionsAfterCompletingInputBatchRetailPrice(), true);
	 }
	 
	 
	 
	 
	 @Test(priority=553186)
	 public void checkSettingsConfigureTransactionsPreferencesBatchSelectDoNotShowBatchesConsumedInSuspendedAndPendingDocuments() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		batch=new BatchWithAllOptionsPage(getDriver());
		Assert.assertEquals(batch.checkSettingsConfigureTransactionsPreferencesBatchSelectDoNotShowBatchesConsumedInSuspendedAndPendingDocuments(), true);
	 }
	 
	 @Test(priority=553187)
	 public void checkLogoutAndLoginAfterUpdatingDoNotShowBatchesConsumedInSuspendedAndPendingDocuments() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		batch=new BatchWithAllOptionsPage(getDriver());
		Assert.assertEquals(batch.checkLogoutAndLoginAfterUpdatingDoNotShowBatchesConsumedInSuspendedAndPendingDocuments(), true);
	 }
	 
	 @Test(priority=553188)
	 public void checkSavingPurchaseVoucherVATVoucher1AfterUpdatingDoNotShowBatchesConsumedInSuspendedAndPendingDocuments() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		batch=new BatchWithAllOptionsPage(getDriver());
		Assert.assertEquals(batch.checkSavingPurchaseVoucherVATVoucher1AfterUpdatingDoNotShowBatchesConsumedInSuspendedAndPendingDocuments(), true);
	 }
	 
	 @Test(priority=553189)
	 public void checkSavingSalesInvoiceVATVoucher1AfterUpdatingDoNotShowBatchesConsumedInSuspendedAndPendingDocuments() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		batch=new BatchWithAllOptionsPage(getDriver());
		Assert.assertEquals(batch.checkSavingSalesInvoiceVATVoucher1AfterUpdatingDoNotShowBatchesConsumedInSuspendedAndPendingDocuments(), true);
	 }
	 
	 @Test(priority=553190)
	 public void checkSuspendingSalesInvoiceVATVoucher1() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		batch=new BatchWithAllOptionsPage(getDriver());
		Assert.assertEquals(batch.checkSuspendingSalesInvoiceVATVoucher1(), true);
	 }
	 
	 @Test(priority=553191)
	 public void checkSalesInvoiceVATVoucher2BatchPopupIsEmpty() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		batch=new BatchWithAllOptionsPage(getDriver());
		Assert.assertEquals(batch.checkSalesInvoiceVATVoucher2BatchPopupIsEmpty(), true);
	 }
	 
	 @Test(priority=553192)
	 public void checkEraseAllTransactionsAfterCompletingDoNotShowBatchesConsumedInSuspendedAndPendingDocuments() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		batch=new BatchWithAllOptionsPage(getDriver());
		Assert.assertEquals(batch.checkEraseAllTransactionsAfterCompletingDoNotShowBatchesConsumedInSuspendedAndPendingDocuments(), true);
	 }
	 
	 
	 
	 
	 @Test(priority=553193)
	 public void checkSettingsConfigureTransactionsPreferencesBatchSelectDoNotConvertToUpperCase() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		batch=new BatchWithAllOptionsPage(getDriver());
		Assert.assertEquals(batch.checkSettingsConfigureTransactionsPreferencesBatchSelectDoNotConvertToUpperCase(), true);
	 }
	 
	 @Test(priority=553194)
	 public void checkLogoutAndLoginAfterUpdatingDoNotConvertToUpperCase() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		batch=new BatchWithAllOptionsPage(getDriver());
		Assert.assertEquals(batch.checkLogoutAndLoginAfterUpdatingDoNotConvertToUpperCase(), true);
	 }
	 
	 @Test(priority=553195)
	 public void checkSavingPurchaseVoucherVATVoucher1AfterUpdatingDoNotConvertToUpperCase() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		batch=new BatchWithAllOptionsPage(getDriver());
		Assert.assertEquals(batch.checkSavingPurchaseVoucherVATVoucher1AfterUpdatingDoNotConvertToUpperCase(), true);
	 }
	 
	 @Test(priority=553196)
	 public void checkSavingSalesInvoiceVATVoucher1AfterUpdatingDoNotConvertToUpperCase() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		batch=new BatchWithAllOptionsPage(getDriver());
		Assert.assertEquals(batch.checkSavingSalesInvoiceVATVoucher1AfterUpdatingDoNotConvertToUpperCase(), true);
	 }
	 
	 @Test(priority=553197)
	 public void checkEraseAllTransactionsAfterCompletingDoNotConvertToUpperCase() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		batch=new BatchWithAllOptionsPage(getDriver());
		Assert.assertEquals(batch.checkEraseAllTransactionsAfterCompletingDoNotConvertToUpperCase(), true);
	 }
	 
	 
	 
	 
	 @Test(priority=553198)
	 public void checkSettingsConfigureTransactionsPreferencesBatchUnSelectingDoNotConvertToUpperCase() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		batch=new BatchWithAllOptionsPage(getDriver());
		Assert.assertEquals(batch.checkSettingsConfigureTransactionsPreferencesBatchUnSelectingDoNotConvertToUpperCase(), true);
	 }
	 
	 @Test(priority=553199)
	 public void checkLogoutAndLoginAfterUnSelectingDoNotConvertToUpperCase() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		batch=new BatchWithAllOptionsPage(getDriver());
		Assert.assertEquals(batch.checkLogoutAndLoginAfterUnSelectingDoNotConvertToUpperCase(), true);
	 }
	 
	 @Test(priority=553200)
	 public void checkSavingPurchaseVoucherVATVoucher1WithVoucherDateAs3DaysBefore() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		batch=new BatchWithAllOptionsPage(getDriver());
		Assert.assertEquals(batch.checkSavingPurchaseVoucherVATVoucher1WithVoucherDateAs3DaysBefore(), true);
	 }
	 
	 @Test(priority=553201)
	 public void checkSavingPurchaseVoucherVATVoucher2WithVoucherDateAs2DaysBefore() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		batch=new BatchWithAllOptionsPage(getDriver());
		Assert.assertEquals(batch.checkSavingPurchaseVoucherVATVoucher2WithVoucherDateAs2DaysBefore(), true);
	 }
	 
	 @Test(priority=553202)
	 public void checkSavingPurchaseVoucherVATVoucher3WithVoucherDateAsTodaysDate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		batch=new BatchWithAllOptionsPage(getDriver());
		Assert.assertEquals(batch.checkSavingPurchaseVoucherVATVoucher3WithVoucherDateAsTodaysDate(), true);
	 }
	 
	 @Test(priority=553203)
	 public void checkSalesInvoiceVATVoucher1BatchPopupAfterSaving3PurchaseVoucherWithDifferentDates() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		batch=new BatchWithAllOptionsPage(getDriver());
		Assert.assertEquals(batch.checkSalesInvoiceVATVoucher1BatchPopupAfterSaving3PurchaseVoucherWithDifferentDates(), true);
	 }
	 
	 @Test(priority=553204)
	 public void checkEditingPurchaseVoucherVATVoucher1WithVoucherDateAs1DaysBefore() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		batch=new BatchWithAllOptionsPage(getDriver());
		Assert.assertEquals(batch.checkEditingPurchaseVoucherVATVoucher1WithVoucherDateAs1DaysBefore(), true);
	 }
	 
	 @Test(priority=553205)
	 public void checkEditingPurchaseVoucherVATVoucher2WithVoucherDateAs3DaysBefore() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		batch=new BatchWithAllOptionsPage(getDriver());
		Assert.assertEquals(batch.checkEditingPurchaseVoucherVATVoucher2WithVoucherDateAs3DaysBefore(), true);
	 }
	 
	 @Test(priority=553206)
	 public void checkEditingPurchaseVoucherVATVoucher3WithVoucherDateAs2DaysBefore() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		batch=new BatchWithAllOptionsPage(getDriver());
		Assert.assertEquals(batch.checkEditingPurchaseVoucherVATVoucher3WithVoucherDateAs2DaysBefore(), true);
	 }
	   
	 @Test(priority=553207)
	 public void checkSavingSalesInvoiceVATVoucher1BatchPopupAfterEditing3PurchaseVouchersDates() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		batch=new BatchWithAllOptionsPage(getDriver());
		Assert.assertEquals(batch.checkSavingSalesInvoiceVATVoucher1BatchPopupAfterEditing3PurchaseVouchersDates(), true);
	 }
	 
	 @Test(priority=553208)
	 public void checkEraseAllTransactions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		batch=new BatchWithAllOptionsPage(getDriver());
		Assert.assertEquals(batch.checkEraseAllTransactions(), true);
	 }
	 
	 
	 @Test(priority=553209)
	 public void checkPurchaseVoucherVATEditScreenAddingField() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		batch=new BatchWithAllOptionsPage(getDriver());
		Assert.assertEquals(batch.checkPurchaseVoucherVATEditScreenAddingField(), true);
	 }
	 
	 @Test(priority=553210)
	 public void checkSalesInvoiceVATVoucherEditScreenAddingFieldFromPurchaseVoucherVAT() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		batch=new BatchWithAllOptionsPage(getDriver());
		Assert.assertEquals(batch.checkSalesInvoiceVATVoucherEditScreenAddingFieldFromPurchaseVoucherVAT(), true);
	 }
	 
	 @Test(priority=553211)
	 public void checkLogoutAndLoginAfterAddingFieldsInPurchaseVoucherAndSalesInvoiceVoucher() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		batch=new BatchWithAllOptionsPage(getDriver());
		Assert.assertEquals(batch.checkLogoutAndLoginAfterAddingFieldsInPurchaseVoucherAndSalesInvoiceVoucher(), true);
	 }
	  
	 @Test(priority=553212)
	 public void checkSavingPurchaseVoucherVATVoucher1WithLoadScreenIntoIssues() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		batch=new BatchWithAllOptionsPage(getDriver());
		Assert.assertEquals(batch.checkSavingPurchaseVoucherVATVoucher1WithLoadScreenIntoIssues(), true);
	 }
	
	 @Test(priority=553213)
	 public void checkSalesInvoiceVATVoucher1WithoutLoadScreenIntoIssues() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		batch=new BatchWithAllOptionsPage(getDriver());
		Assert.assertEquals(batch.checkSalesInvoiceVATVoucher1WithoutLoadScreenIntoIssues(), true);
	 }
	
	 @Test(priority=553214)
	 public void checkSettingsConfigureTransactionsPreferencesBatchSelectingUpdatingLoadScreenFieldDetailsRetatedToBatchIntoIssue() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		batch=new BatchWithAllOptionsPage(getDriver());
		Assert.assertEquals(batch.checkSettingsConfigureTransactionsPreferencesBatchSelectingUpdatingLoadScreenFieldDetailsRetatedToBatchIntoIssue(), true);
	 }
	 
	 @Test(priority=553215)
	 public void checkLogoutAndLoginAfterUpdatingLoadScreenFieldDetailsRelatedToBatchIntoIssues() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		batch=new BatchWithAllOptionsPage(getDriver());
		Assert.assertEquals(batch.checkLogoutAndLoginAfterUpdatingLoadScreenFieldDetailsRelatedToBatchIntoIssues(), true);
	 }
	
	 @Test(priority=553216) //
	 public void checkSavingSalesInvoiceVATVoucher1WithLoadScreenIntoIssues() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		batch=new BatchWithAllOptionsPage(getDriver());
		Assert.assertEquals(batch.checkSavingSalesInvoiceVATVoucher1WithLoadScreenIntoIssues(), true);
	 }
	 
	 @Test(priority=553217)
	 public void checkEraseAllTransactionsAfterCompletingLoadScreenDetailsIntoIssues() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		batch=new BatchWithAllOptionsPage(getDriver());
		Assert.assertEquals(batch.checkEraseAllTransactionsAfterCompletingLoadScreenDetailsIntoIssues(), true);
	 }
	 
	 
	 @Test(priority=553218)
	 public void checkPurchaseVoucherVATEditScreenDeletingField() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		batch=new BatchWithAllOptionsPage(getDriver());
		Assert.assertEquals(batch.checkPurchaseVoucherVATEditScreenDeletingField(), true);
	 }
	 
	 @Test(priority=553219)
	 public void checkSalesInvoiceVATVoucherEditScreenDeletingLoadScreenIntoIssuesField() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		batch=new BatchWithAllOptionsPage(getDriver());
		Assert.assertEquals(batch.checkSalesInvoiceVATVoucherEditScreenDeletingLoadScreenIntoIssuesField(), true);
	 }
	 
	 @Test(priority=553220)
	 public void checkSettingsConfigureTransactionsPreferencesBatchUnSelectingUpdatingLoadScreenFieldDetailsRetatedToBatchIntoIssue() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		batch=new BatchWithAllOptionsPage(getDriver());
		Assert.assertEquals(batch.checkSettingsConfigureTransactionsPreferencesBatchUnSelectingUpdatingLoadScreenFieldDetailsRetatedToBatchIntoIssue(), true);
	 }
	 
	 @Test(priority=553221)
	 public void checkLogoutAndLoginAfterUnSelectingLoadScreenFieldDetailsRelatedToBatchIntoIssues() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		batch=new BatchWithAllOptionsPage(getDriver());
		Assert.assertEquals(batch.checkLogoutAndLoginAfterUnSelectingLoadScreenFieldDetailsRelatedToBatchIntoIssues(), true);
	 }
	 
	 
	 
	 
	 @Test(priority=553222)
	 public void checkPurchaseVoucherVATEditLayoutAddingFieldInBody() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		batch=new BatchWithAllOptionsPage(getDriver());
		Assert.assertEquals(batch.checkPurchaseVoucherVATEditLayoutAddingFieldInBody(), true);
	 }
	 
	 @Test(priority=553223)
	 public void checkSalesInvoiceVATVoucherEditLayoutAddingFieldFromPurchaseVoucherVAT() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		batch=new BatchWithAllOptionsPage(getDriver());
		Assert.assertEquals(batch.checkSalesInvoiceVATVoucherEditLayoutAddingFieldFromPurchaseVoucherVAT(), true);
	 }
	 
	 @Test(priority=553224)
	 public void checkLogoutAndLoginAfterAddingLayoutFieldsInPurchaseVoucherAndSalesInvoiceVoucher() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		batch=new BatchWithAllOptionsPage(getDriver());
		Assert.assertEquals(batch.checkLogoutAndLoginAfterAddingLayoutFieldsInPurchaseVoucherAndSalesInvoiceVoucher(), true);
	 }
	
	 @Test(priority=553225)
	 public void checkSavingPurchaseVoucherVATVoucher1WithLoadLayoutIntoIssues() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		batch=new BatchWithAllOptionsPage(getDriver());
		Assert.assertEquals(batch.checkSavingPurchaseVoucherVATVoucher1WithLoadLayoutIntoIssues(), true);
	 }
	 
	 @Test(priority=553226)
	 public void checkSalesInvoiceVATVoucher1WithoutLoadLayoutIntoIssues() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		batch=new BatchWithAllOptionsPage(getDriver());
		Assert.assertEquals(batch.checkSalesInvoiceVATVoucher1WithoutLoadLayoutIntoIssues(), true);
	 }
	 
	 @Test(priority=553227)
	 public void checkSettingsConfigureTransactionsPreferencesBatchSelectingUpdatingLoadLayoutFieldDetailsRetatedToBatchIntoIssue() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		batch=new BatchWithAllOptionsPage(getDriver());
		Assert.assertEquals(batch.checkSettingsConfigureTransactionsPreferencesBatchSelectingUpdatingLoadLayoutFieldDetailsRetatedToBatchIntoIssue(), true);
	 }
	 
	 @Test(priority=553228)
	 public void checkLogoutAndLoginAfterUpdatingLoadLayoutFieldDetailsRelatedToBatchIntoIssues() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		batch=new BatchWithAllOptionsPage(getDriver());
		Assert.assertEquals(batch.checkLogoutAndLoginAfterUpdatingLoadLayoutFieldDetailsRelatedToBatchIntoIssues(), true);
	 } 
	 
	 @Test(priority=553229) //
	 public void checkSavingSalesInvoiceVATVoucher1WithLoadLayoutIntoIssues() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		batch=new BatchWithAllOptionsPage(getDriver());
		Assert.assertEquals(batch.checkSavingSalesInvoiceVATVoucher1WithLoadLayoutIntoIssues(), true);
	 }
	
	 @Test(priority=553230)
	 public void checkEraseAllTransactionsAfterCompletingLoadLayoutDetailsIntoIssues() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		batch=new BatchWithAllOptionsPage(getDriver());
		Assert.assertEquals(batch.checkEraseAllTransactionsAfterCompletingLoadLayoutDetailsIntoIssues(), true);
	 }
	 
	 @Test(priority=553231)
	 public void checkPurchaseVoucherVATEditLayoutDeletingField() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		batch=new BatchWithAllOptionsPage(getDriver());
		Assert.assertEquals(batch.checkPurchaseVoucherVATEditLayoutDeletingField(), true);
	 }
	 
	 @Test(priority=553232)
	 public void checkSalesInvoiceVATVoucherEditLayoutDeletingLoadLayoutIntoIssuesField() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		batch=new BatchWithAllOptionsPage(getDriver());
		Assert.assertEquals(batch.checkSalesInvoiceVATVoucherEditLayoutDeletingLoadLayoutIntoIssuesField(), true);
	 }
	 
	 
	 
	 @Test(priority=553233)
	 public void checkSettingsConfigureTransactionsPreferencesBatchUpdatingLoadAllDetailsRetatedToBatchIntoIssue() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		batch=new BatchWithAllOptionsPage(getDriver());
		Assert.assertEquals(batch.checkSettingsConfigureTransactionsPreferencesBatchUpdatingLoadAllDetailsRetatedToBatchIntoIssue(), true);
	 }
	 
	 @Test(priority=553234)
	 public void checkLogoutAndLoginAfterUnSelectingLoadLayoutFieldDetailsRelatedToBatchIntoIssues() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		batch=new BatchWithAllOptionsPage(getDriver());
		Assert.assertEquals(batch.checkLogoutAndLoginAfterUnSelectingLoadLayoutFieldDetailsRelatedToBatchIntoIssues(), true);
	 }
	 
	 @Test(priority=553235)
	 public void checkPurchaseVoucherVATEditScreenAddingFieldAndEditLayoutAddingField() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		batch=new BatchWithAllOptionsPage(getDriver());
		Assert.assertEquals(batch.checkPurchaseVoucherVATEditScreenAddingFieldAndEditLayoutAddingField(), true);
	 }
	 
	 @Test(priority=553236)
	 public void checkSalesInvoiceVATVoucherEditScreenAddingFieldAndEditLayoutAddingFieldFromPurchaseVoucherVAT() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		batch=new BatchWithAllOptionsPage(getDriver());
		Assert.assertEquals(batch.checkSalesInvoiceVATVoucherEditScreenAddingFieldAndEditLayoutAddingFieldFromPurchaseVoucherVAT(), true);
	 }
	 
	 @Test(priority=553237)
	 public void checkLogoutAndLoginAfterAddingScreenAndLayoutInPurchaseVoucherAndSalesInvoiceVoucher() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		batch=new BatchWithAllOptionsPage(getDriver());
		Assert.assertEquals(batch.checkLogoutAndLoginAfterAddingScreenAndLayoutInPurchaseVoucherAndSalesInvoiceVoucher(), true);
	 }
	 
	 @Test(priority=553238)
	 public void checkSavingPurchaseVoucherVATVoucher1WithLoadScreenIntoIssuesAndLoadLayoutIntoIssue() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		batch=new BatchWithAllOptionsPage(getDriver());
		Assert.assertEquals(batch.checkSavingPurchaseVoucherVATVoucher1WithLoadScreenIntoIssuesAndLoadLayoutIntoIssue(), true);
	 }
	 
	 @Test(priority=553239) //
	 public void checkSavingSalesInvoiceVATVoucher1WithLoadScreenIntoIssuesAndLoadLayoutIntoIssues() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		batch=new BatchWithAllOptionsPage(getDriver());
		Assert.assertEquals(batch.checkSavingSalesInvoiceVATVoucher1WithLoadScreenIntoIssuesAndLoadLayoutIntoIssues(), true);
	 }
	 
	 @Test(priority=553240) 
	 public void checkEraseAllTransactionsAfterCompletingLoadScreenDetailsIntoIssuesAndLoadLayoutDetailsIntoIssues() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		batch=new BatchWithAllOptionsPage(getDriver());
		Assert.assertEquals(batch.checkEraseAllTransactionsAfterCompletingLoadScreenDetailsIntoIssuesAndLoadLayoutDetailsIntoIssues(), true);
	 }
	 
	 @Test(priority=553241)
	 public void checkPurchaseVoucherVATDeletingLoadScreenIntoIssuesAndLoadLayoutIntoIssuesFields() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		batch=new BatchWithAllOptionsPage(getDriver());
		Assert.assertEquals(batch.checkPurchaseVoucherVATDeletingLoadScreenIntoIssuesAndLoadLayoutIntoIssuesFields(), true);
	 }
	 
	 @Test(priority=553242)
	 public void checkSalesInvoiceVATVoucherDeletingLoadScreenIntoIssuesAndLoadLayoutIntoIssuesFields() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		batch=new BatchWithAllOptionsPage(getDriver());
		Assert.assertEquals(batch.checkSalesInvoiceVATVoucherDeletingLoadScreenIntoIssuesAndLoadLayoutIntoIssuesFields(), true);
	 }
	 
	 @Test(priority=553243)
	 public void checkSettingsConfigureTransactionsPreferencesBatchUnSelectingLoadAllDetailsRetatedToBatchIntoIssue() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		batch=new BatchWithAllOptionsPage(getDriver());
		Assert.assertEquals(batch.checkSettingsConfigureTransactionsPreferencesBatchUnSelectingLoadAllDetailsRetatedToBatchIntoIssue(), true);
	 }
	 
	 @Test(priority=553244)
	 public void checkLogoutAndLoginAfterUnSelectingLoadAllFieldDetailsRelatedToBatchIntoIssues() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		batch=new BatchWithAllOptionsPage(getDriver());
		Assert.assertEquals(batch.checkLogoutAndLoginAfterUnSelectingLoadAllFieldDetailsRelatedToBatchIntoIssues(), true);
	 }
	 
	 
	 
	 
	
	
	
	
	
	
	
	
	
	
	
}
