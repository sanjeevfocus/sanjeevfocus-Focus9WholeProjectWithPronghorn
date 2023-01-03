package com.focus.testcases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.focus.Pages.BatchWithAllOptionsPage;
import com.focus.Pages.BinOptionsPage;
import com.focus.base.BaseEngine;

public class BinOptionsTest extends BaseEngine
{


	 //Starting of Bin Options
	
	 BinOptionsPage bop;
	
	 /*@Test(priority=90040)
	 public void checkLoginForOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 bop=new BinOptionsPage(getDriver());
		 Assert.assertEquals(bop.checkLogin(), true);
	 }
	
	@Test(priority=90041) 
  	public void checkEraseAllTransation() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		bop=new BinOptionsPage(getDriver());
  		Assert.assertEquals(bop.checkEraseAllTransation(), true);
  	   
  	}*/
	
	
	@Test(priority=90000) 
  	public void checkLoginAndRestoreOptionsCompanyAndLogin() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		bop=new BinOptionsPage(getDriver());
  		Assert.assertEquals(bop.checkLoginAndRestoreOptionsCompanyAndLogin(), true);
  	   
  	}
	
	
	
	
	@Test(priority=90042) 
  	public void CheckEnabletheOptionItemsArePlacedInBinsBasedOnTheirCategory() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		bop=new BinOptionsPage(getDriver());
  		Assert.assertEquals(bop.CheckEnabletheOptionItemsArePlacedInBinsBasedOnTheirCategory(), true);
  	   
  	}
	
	
	@Test(priority=90043) 
  	public void CheckSavingUnderTwoCategorysC1AndC2UnderPointOFSale() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		bop=new BinOptionsPage(getDriver());
  		Assert.assertEquals(bop.CheckSavingUnderTwoCategorysC1AndC2UnderPointOFSale(), true);
  	   
  	}
	
	@Test(priority=90044) 
  	public void CheckSavingBinsWithCategories() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		bop=new BinOptionsPage(getDriver());
  		Assert.assertEquals(bop.CheckSavingBinsWithCategories(), true);
  	   
  	}
	
	@Test(priority=90045) 
  	public void CheckSavingProductWithCategories() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		bop=new BinOptionsPage(getDriver());
  		Assert.assertEquals(bop.CheckSavingProductWithCategories(), true);
  	   
  	}
	
	
	@Test(priority=90046) 
  	public void CheckSavingWarehousesWithBinsAllocation() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		bop=new BinOptionsPage(getDriver());
  		Assert.assertEquals(bop.CheckSavingWarehousesWithBinsAllocation(), true);
  	   
  	}
	
	@Test(priority=90047) 
  	public void checkSavingVoucherInOpeningStocksNewWithProductA() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		bop=new BinOptionsPage(getDriver());
  		Assert.assertEquals(bop.checkSavingVoucherInOpeningStocksNewWithProductA(), true);
  	}
	
	@Test(priority=90048) 
  	public void checkSavingVoucherInOpeningStocksNewWithProductB() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		bop=new BinOptionsPage(getDriver());
  		Assert.assertEquals(bop.checkSavingVoucherInOpeningStocksNewWithProductB(), true);
  	   
  	}
	
	@Test(priority=90049) 
  	public void chekSalesInvoiceBinScreenValidationWithProductA() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		bop=new BinOptionsPage(getDriver());
  		Assert.assertEquals(bop.chekSalesInvoiceBinScreenValidationWithProductA(), true);
  	   
  	}
	
	@Test(priority=90050) 
  	public void chekSalesInvoiceBinScreenValidationWithProductB() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		bop=new BinOptionsPage(getDriver());
  		Assert.assertEquals(bop.chekSalesInvoiceBinScreenValidationWithProductB(), true);
  	   
  	}
	
	@Test(priority=90051) 
  	public void CheckEnabletheOptionTwoDifferentItemsCannotBePlacedInsameBIN() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		bop=new BinOptionsPage(getDriver());
  		Assert.assertEquals(bop.CheckEnabletheOptionTwoDifferentItemsCannotBePlacedInsameBIN(), true);
  	   
  	}
	
	 @Test(priority=90052)
	 public void checkLoginAfterEnableOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 bop=new BinOptionsPage(getDriver());
		 Assert.assertEquals(bop.checkLogin(), true);
	 }
	
	 @Test(priority=90053)
	 public void checkEnteringDateIntoSecoundRowInOpeningStocksAfterOptionEnable() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 bop=new BinOptionsPage(getDriver());
		 Assert.assertEquals(bop.checkEnteringDateIntoSecoundRowInOpeningStocksAfterOptionEnable(), true);
	 }
	 
	 
	 
	 //Method Reuse
	 @Test(priority=90054) 
  	 public void checkEraseAllTransationForTwoDifferentBatchescannotBePlacedInSameBIN() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	 {
  		bop=new BinOptionsPage(getDriver());
  		Assert.assertEquals(bop.checkEraseAllTransation(), true);
  	   
  	 }
 
	 @Test(priority=90055) 
  	 public void CheckEnableOptionsForProductAsBatchBin() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	 {
  		bop=new BinOptionsPage(getDriver());
  		Assert.assertEquals(bop.CheckEnableOptionsForProductAsBatchBin(), true);
  	   
  	 }
  	 
	//Method Reuse
	 @Test(priority=90056) 
  	 public void checkLoginForTwoDifferentBatchescannotBePlacedInSameBIN() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	 {
  		bop=new BinOptionsPage(getDriver());
  		Assert.assertEquals(bop.checkLogin(), true);
  	   
  	 }
	  
	 @Test(priority=90057) 
  	 public void checkSavingVoucherInOpeningStocksNewWithBatchBinProductBeforeEnableOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	 {
  		bop=new BinOptionsPage(getDriver());
  		Assert.assertEquals(bop.checkSavingVoucherInOpeningStocksNewWithBatchBinProductBeforeEnableOption(), true);
  	   
  	 }
	  
	 @Test(priority=90059) 
  	 public void CheckEnabletheOptionTwoDifferentBatchescannotBePlacedInSameBIN() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	 {
  		bop=new BinOptionsPage(getDriver());
  		Assert.assertEquals(bop.CheckEnabletheOptionTwoDifferentBatchescannotBePlacedInSameBIN(), true);
  	   
  	 }
	 
	 @Test(priority=90060) 
  	 public void checkLoginAfterEnableTwoDifferentBatchescannotBePlacedInSameBIN() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	 {
  		bop=new BinOptionsPage(getDriver());
  		Assert.assertEquals(bop.checkLogin(), true);
  	   
  	 }
	 
	
	 
	 
	 
	//Method Reuse
	 @Test(priority=90062) 
  	 public void checkEraseAllTransationForAllocateIntoPartiallyFilledBinsFirst() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	 {
  		bop=new BinOptionsPage(getDriver());
  		Assert.assertEquals(bop.checkEraseAllTransation(), true);
  	   
  	 }
	 
	 @Test(priority=90063) 
  	 public void CheckEnabletheOptionAllocateIntoPartiallyWithWithBinFirst() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	 {
  		bop=new BinOptionsPage(getDriver());
  		Assert.assertEquals(bop.CheckEnabletheOptionAllocateIntoPartiallyWithWithBinFirst(), true);
  	   
  	 }
	 
	 
	 @Test(priority=90064) 
  	 public void checkLoginAfterEnableAllocateIntoPartiallyWithWithBinFirst() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	 {
  		bop=new BinOptionsPage(getDriver());
  		Assert.assertEquals(bop.checkLogin(), true);
  	   
  	 }
	 
	 
	 @Test(priority=90065) 
  	 public void checkEditingInBinsByIncreasingCapacity() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	 {
  		bop=new BinOptionsPage(getDriver());
  		Assert.assertEquals(bop.checkEditingInBinsByIncreasingCapacity(), true);
  	   
  	 } 
	 
	 
	 @Test(priority=90066) 
  	 public void checkSavingVoucherInOpeningStocksNewWithFIFOBinProductWithAllowPartallyEnableOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	 {
  		bop=new BinOptionsPage(getDriver());
  		Assert.assertEquals(bop.checkSavingVoucherInOpeningStocksNewWithFIFOBinProductWithAllowPartallyEnableOption(), true);
  	   
  	 }

	 
	 @Test(priority=90067) 
  	 public void checkSavingVoucherInOpeningStocksNewWithAutoAllocateOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	 {
  		bop=new BinOptionsPage(getDriver());
  		Assert.assertEquals(bop.checkSavingVoucherInOpeningStocksNewWithAutoAllocateOption(), true);
  	   
  	 }
	 
	 
	 
	 @Test(priority=90068) 
  	 public void checkEraseAllTransationForPickFromPartiallyFilledBins() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	 {
  		bop=new BinOptionsPage(getDriver());
  		Assert.assertEquals(bop.checkEraseAllTransation(), true);
  	   
  	 }
	 
	 
	 @Test(priority=90069) 
  	 public void CheckEnabletheOptionPickFromPartiallyFilledBinsFirst() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	 {
  		bop=new BinOptionsPage(getDriver());
  		Assert.assertEquals(bop.CheckEnabletheOptionPickFromPartiallyFilledBinsFirst(), true);
  	   
  	 }
	 
	 @Test(priority=90070) 
  	 public void checkLoginAfterEnablePickFromPartiallyFilledBinsFirst() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	 {
  		bop=new BinOptionsPage(getDriver());
  		Assert.assertEquals(bop.checkLogin(), true);
  	   
  	 }
	 
	 @Test(priority=90071) 
  	 public void checkSavingVoucherInOpeningStocksAfterEnablePickFromPartiallyFilledBinsFirst() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	 {
  		bop=new BinOptionsPage(getDriver());
  		Assert.assertEquals(bop.checkSavingVoucherInOpeningStocksAfterEnablePickFromPartiallyFilledBinsFirst(), true);
  	   
  	 }
	 
	 
	 @Test(priority=90072) 
  	 public void checkSavingVoucher2InOpeningStocksAfterEnablePickFromPartiallyFilledBinsFirst() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	 {
  		bop=new BinOptionsPage(getDriver());
  		Assert.assertEquals(bop.checkSavingVoucher2InOpeningStocksAfterEnablePickFromPartiallyFilledBinsFirst(), true);
  	   
  	 }
	 
	 
	 @Test(priority=90073) 
  	 public void checkSavingSalesInvoiceVoucherWithpickFromPartiallyFilledFirst() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	 {
  		bop=new BinOptionsPage(getDriver());
  		Assert.assertEquals(bop.checkSavingSalesInvoiceVoucherWithpickFromPartiallyFilledFirst(), true);
  	   
  	 }
	 
	
	 
	 
    @Test(priority=90074) 
  	 public void checkEraseAllTransationForPickFromPartiallyFilledBinsFirst() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	 {
  		bop=new BinOptionsPage(getDriver());
  		Assert.assertEquals(bop.checkEraseAllTransation(), true);
  	   
  	 }
	 
     
     @Test(priority=90075) 
  	 public void checkSavingVoucher3InOpeningStocksAfterEnablePickFromPartiallyFilledBinsFirst() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	 {
  		bop=new BinOptionsPage(getDriver());
  		Assert.assertEquals(bop.checkSavingVoucherInOpeningStocksAfterEnablePickFromPartiallyFilledBinsFirst(), true);
  	   
  	 }
  	 
     @Test(priority=90076) 
  	 public void checkSavingVoucher4InOpeningStocksAfterEnablePickFromPartiallyFilledBinsFirst() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	 {
  		bop=new BinOptionsPage(getDriver());
  		Assert.assertEquals(bop.checkSavingVoucher4InOpeningStocksAfterEnablePickFromPartiallyFilledBinsFirst(), true);
  	   
  	 }
     
     
     @Test(priority=90077) 
  	 public void checkReservingFullInwardQtyInSalesOrder() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	 {
  		bop=new BinOptionsPage(getDriver());
  		Assert.assertEquals(bop.checkReservingFullInwardQtyInSalesOrder(), true);
  	   
  	 }
	
     
     @Test(priority=90078) 
  	 public void checkSavingSalesInvoiceVoucherWithReservedQtyFromBin1() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	 {
  		bop=new BinOptionsPage(getDriver());
  		Assert.assertEquals(bop.checkSavingSalesInvoiceVoucherWithReservedQtyFromBin1(), true);
  	   
  	 }
     
     @Test(priority=90079) 
  	 public void checkSavingSalesInvoiceVoucherWithReservedQtyWithClickOnAutoAllocate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	 {
  		bop=new BinOptionsPage(getDriver());
  		Assert.assertEquals(bop.checkSavingSalesInvoiceVoucherWithReservedQtyWithClickOnAutoAllocate(), true);
  	   
  	 }
      
     
	
	 @Test(priority=90080) 
  	 public void checkEraseAllTransationForAllocateIntoPartiallyWithClosest() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	 {
  		bop=new BinOptionsPage(getDriver());
  		Assert.assertEquals(bop.checkEraseAllTransation(), true);
  	   
  	 }
	 
	 @Test(priority=90081) 
  	 public void CheckEnabletheOptionAllocateIntoPartiallyWithClosest() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	 {
  		bop=new BinOptionsPage(getDriver());
  		Assert.assertEquals(bop.CheckEnabletheOptionAllocateIntoPartiallyWithClosest(), true);
  	   
  	 } 
	 
	 
	 @Test(priority=90082) 
  	 public void checkLoginAfterEnableAllocateIntoPartiallyWithClosest() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	 {
  		bop=new BinOptionsPage(getDriver());
  		Assert.assertEquals(bop.checkLogin(), true);
  	   
  	 }
	 
	//Resuse
	

	 @Test(priority=90083) 
  	 public void checkSavingVoucherInOpeningStocksWithProductAByUsingAutoAllocate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	 {
  		bop=new BinOptionsPage(getDriver());
  		Assert.assertEquals(bop.checkSavingVoucherInOpeningStocksWithProductAByUsingAutoAllocate(), true);
  	   
  	 }

	 @Test(priority=90084) 
  	 public void checkSavingSalesInvoiceVoucherWithClosetOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	 {
  		bop=new BinOptionsPage(getDriver());
  		Assert.assertEquals(bop.checkSavingSalesInvoiceVoucherWithClosetOption(), true);
  	   
  	 }
	 
	 @Test(priority=90085) 
  	 public void checkSavingVoucherInOpeningStocksWithOptionCloset() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	 {
  		bop=new BinOptionsPage(getDriver());
  		Assert.assertEquals(bop.checkSavingVoucherInOpeningStocksWithOptionCloset(), true);
  	   
  	 }
	 
	 
	 //Reports
	 
	 @Test(priority=90086) 
  	 public void checkItemQueryOfFIFOItemWithClosetOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	 {
  		bop=new BinOptionsPage(getDriver());
  		Assert.assertEquals(bop.checkItemQueryOfFIFOItemWithClosetOption(), true);
  	   
  	 }
	 
	 @Test(priority=90087) 
  	 public void checkStockLedgerReportByClosetOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	 {
  		bop=new BinOptionsPage(getDriver());
  		Assert.assertEquals(bop.checkStockLedgerReportByClosetOption(), true);
  	   
  	 }
	 
	 @Test(priority=90088) 
  	 public void checkOpeningStockRegisterReportWithClosetOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	 {
  		bop=new BinOptionsPage(getDriver());
  		Assert.assertEquals(bop.checkOpeningStockRegisterReportWithClosetOption(), true);
  	   
  	 }
	 
	 @Test(priority=90089) 
  	 public void checkStockDetailsByBinsReportsWithClosetOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	 {
  		bop=new BinOptionsPage(getDriver());
  		Assert.assertEquals(bop.checkStockDetailsByBinsReportsWithClosetOption(), true);
  	   
  	 }
	 
	 @Test(priority=90090) 
  	 public void checkStockBalanaceByBinsReportsWithCLosetOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	 {
  		bop=new BinOptionsPage(getDriver());
  		Assert.assertEquals(bop.checkStockBalanaceByBinsReportsWithCLosetOption(), true);
  	   
  	 }
	 
	 
	 @Test(priority=90091) 
  	 public void checkStockBalancesByItemByBinsReportsWithCLosetOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	 {
  		bop=new BinOptionsPage(getDriver());
  		Assert.assertEquals(bop.checkStockBalancesByItemByBinsReportsWithCLosetOption(), true);
  	   
  	 }
	 
	 
	 
	 @Test(priority=90092) 
  	 public void checkEraseAllTransationForAllocateOIntoPartiallyFilledBinsFirstWithFarthest() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	 {
  		bop=new BinOptionsPage(getDriver());
  		Assert.assertEquals(bop.checkEraseAllTransation(), true);
  	   
  	 }
	 
	 
	 @Test(priority=90093) 
  	 public void CheckEnabletheOptionAllocateIntoPartiallyWithFarthest() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	 {
  		bop=new BinOptionsPage(getDriver());
  		Assert.assertEquals(bop.CheckEnabletheOptionAllocateIntoPartiallyWithFarthest(), true);
  	   
  	 } 
	 
	 
	 @Test(priority=90094) 
  	 public void checkLoginAfterEnableAllocateIntoPartiallyWithFarthest() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	 {
  		bop=new BinOptionsPage(getDriver());
  		Assert.assertEquals(bop.checkLogin(), true);
  	   
  	 }
	 
	 
	 @Test(priority=90095) 
  	 public void CheckSavingBinsWithDistances() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	 {
  		bop=new BinOptionsPage(getDriver());
  		Assert.assertEquals(bop.CheckSavingBinsWithDistances(), true);
  	   
  	 }
	 
	 

	 @Test(priority=90096) 
  	 public void checkSavingVoucherInOpeningStocksNewWithFIFOWithFarthest() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	 {
  		bop=new BinOptionsPage(getDriver());
  		Assert.assertEquals(bop.checkSavingVoucherInOpeningStocksNewWithFIFOWithFarthest(), true);
  	   
  	 }
	 
	 @Test(priority=90097) 
  	 public void checkSavingSalesInvoiceVoucherWithFarthestOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	 {
  		bop=new BinOptionsPage(getDriver());
  		Assert.assertEquals(bop.checkSavingSalesInvoiceVoucherWithFarthestOption(), true);
  	   
  	 }
	 
	 @Test(priority=90098) 
  	 public void checkSavingVoucher2InOpeningStocksNewWithFIFOWithFarthest() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	 {
  		bop=new BinOptionsPage(getDriver());
  		Assert.assertEquals(bop.checkSavingVoucher2InOpeningStocksNewWithFIFOWithFarthest(), true);
  	   
  	 }
	 
	 
	 @Test(priority=90099) 
  	 public void checkStockLedgerReportByFarthestOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	 {
  		bop=new BinOptionsPage(getDriver());
  		Assert.assertEquals(bop.checkStockLedgerReportByFarthestOption(), true);
  	   
  	 }
	 
	 @Test(priority=90100) 
  	 public void checkOpeningStockRegisterReportWithFarthestOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	 {
  		bop=new BinOptionsPage(getDriver());
  		Assert.assertEquals(bop.checkOpeningStockRegisterReportWithFarthestOption(), true);
  	   
  	 }
	 
	 @Test(priority=90101) 
  	 public void checkStockDetailsByBinsReportsWithFarthestOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	 {
  		bop=new BinOptionsPage(getDriver());
  		Assert.assertEquals(bop.checkStockDetailsByBinsReportsWithFarthestOption(), true);
  	   
  	 }
	 
	 @Test(priority=90102) 
  	 public void checkStockBalanaceByBinsReportsWithFarthestOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	 {
  		bop=new BinOptionsPage(getDriver());
  		Assert.assertEquals(bop.checkStockBalanaceByBinsReportsWithFarthestOption(), true);
  	   
  	 }
	 
	 
	 @Test(priority=90103) 
  	 public void checkStockBalancesByItemByBinsReportsWithFarthestOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	 {
  		bop=new BinOptionsPage(getDriver());
  		Assert.assertEquals(bop.checkStockBalancesByItemByBinsReportsWithFarthestOption(), true);
  	   
  	 }
	
	 
	 
	
	 //Method Reuse
	 @Test(priority=90104) 
  	 public void checkEraseAllTransationForAllocateOIntoPartiallyFilledBinsFirstWithClosestAndFromTop() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	 {
  		bop=new BinOptionsPage(getDriver());
  		Assert.assertEquals(bop.checkEraseAllTransation(), true);
  	   
  	 }
	 
	 
	 @Test(priority=90105) 
  	 public void CheckEnabletheOptionAllocateIntoPartiallyWithClosestAndFromTop() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	 {
  		bop=new BinOptionsPage(getDriver());
  		Assert.assertEquals(bop.CheckEnabletheOptionAllocateIntoPartiallyWithClosestAndFromTop(), true);
  	   
  	 } 
	 
	 
	 @Test(priority=90106) 
  	 public void checkLoginAfterEnableAllocateIntoPartiallyWithClosestAndFromTop() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	 {
  		bop=new BinOptionsPage(getDriver());
  		Assert.assertEquals(bop.checkLogin(), true);
  	   
  	 }
	 
	 
	 @Test(priority=90107) 
  	 public void CheckSavingBinsWithLevels() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	 {
  		bop=new BinOptionsPage(getDriver());
  		Assert.assertEquals(bop.CheckSavingBinsWithLevels(), true);
  	   
  	 }
	 
	 @Test(priority=90108) 
  	 public void checkSavingVoucherInOpeningStocksNewWithFIFOWithClosestAndFromTop() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	 {
  		bop=new BinOptionsPage(getDriver());
  		Assert.assertEquals(bop.checkSavingVoucherInOpeningStocksNewWithFIFOWithClosestAndFromTop(), true);
  	   
  	 }
	 
	
	 
	//Method Reuse
	 @Test(priority=90109) 
  	 public void checkEraseAllTransationForAllocateOIntoPartiallyFilledBinsFirstWithClosestAndFromBottom() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	 {
  		bop=new BinOptionsPage(getDriver());
  		Assert.assertEquals(bop.checkEraseAllTransation(), true);
  	   
  	 }
	 
	 
	 @Test(priority=90110) 
  	 public void CheckEnabletheOptionAllocateIntoPartiallyWithClosestAndFromBottom() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	 {
  		bop=new BinOptionsPage(getDriver());
  		Assert.assertEquals(bop.CheckEnabletheOptionAllocateIntoPartiallyWithClosestAndFromBottom(), true);
  	   
  	 } 
	 
	 
	 @Test(priority=90111) 
  	 public void checkLoginAfterEnableAllocateIntoPartiallyWithClosestAndFromBottom() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	 {
  		bop=new BinOptionsPage(getDriver());
  		Assert.assertEquals(bop.checkLogin(), true);
  	   
  	 }
	 
	 @Test(priority=90112) 
  	 public void CheckSavingBinsWithLevelsWithClosestAndFromBottom() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	 {
  		bop=new BinOptionsPage(getDriver());
  		Assert.assertEquals(bop.CheckSavingBinsWithLevelsClosestAndFromBottom(), true);
  	   
  	 }
	 
	 
	 @Test(priority=90113) 
  	 public void checkSavingVoucherInOpeningStocksNewWithFIFOWithClosestAndFromBottom() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	 {
  		bop=new BinOptionsPage(getDriver());
  		Assert.assertEquals(bop.checkSavingVoucherInOpeningStocksNewWithFIFOWithClosestAndFromBottom(), true);
  	   
  	 }
	 
	 
	 //Method Reuse
	 @Test(priority=90114) 
  	 public void checkEraseAllTransationForAllocateOIntoPartiallyFilledBinsFirstWithFarthestAndFromTop() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	 {
  		bop=new BinOptionsPage(getDriver());
  		Assert.assertEquals(bop.checkEraseAllTransation(), true);
  	   
  	 }
	 
	 
	 @Test(priority=90115) 
  	 public void CheckEnabletheOptionAllocateIntoPartiallyWithFarthestAndFromTop() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	 {
  		bop=new BinOptionsPage(getDriver());
  		Assert.assertEquals(bop.CheckEnabletheOptionAllocateIntoPartiallyWithFarthestAndFromTop(), true);
  	   
  	 } 
	 
	 
	 @Test(priority=90116) 
  	 public void checkLoginAfterEnableAllocateIntoPartiallyWithFarthestAndFromTop() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	 {
  		bop=new BinOptionsPage(getDriver());
  		Assert.assertEquals(bop.checkLogin(), true);
  	   
  	 }
	 
	 @Test(priority=90117) 
  	 public void checkSavingVoucherInOpeningStocksNewWithFIFOWithFarthestAndFromTop() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	 {
  		bop=new BinOptionsPage(getDriver());
  		Assert.assertEquals(bop.checkSavingVoucherInOpeningStocksNewWithFIFOWithFarthestAndFromTop(), true);
  	   
  	 }

	 
	 //Method Reuse
	 @Test(priority=90118) 
  	 public void checkEraseAllTransationForAllocateOIntoPartiallyFilledBinsFirstWithFarthestAndFromBottom() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	 {
  		bop=new BinOptionsPage(getDriver());
  		Assert.assertEquals(bop.checkEraseAllTransation(), true);
  	   
  	 }
	 
	 
	 @Test(priority=90119) 
  	 public void CheckEnabletheOptionAllocateIntoPartiallyWithFarthestAndFromBottom() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	 {
  		bop=new BinOptionsPage(getDriver());
  		Assert.assertEquals(bop.CheckEnabletheOptionAllocateIntoPartiallyWithFarthestAndFromBottom(), true);
  	   
  	 } 
	 
	 @Test(priority=90120) 
  	 public void checkLoginAfterEnableAllocateIntoPartiallyWithFarthestAndFromBottom() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	 {
  		bop=new BinOptionsPage(getDriver());
  		Assert.assertEquals(bop.checkLogin(), true);
  	   
  	 }
	 
	 @Test(priority=90121) 
  	 public void checkSavingVoucherInOpeningStocksNewWithFIFOWithFarthestAndFromBottom() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	 {
  		bop=new BinOptionsPage(getDriver());
  		Assert.assertEquals(bop.checkSavingVoucherInOpeningStocksNewWithFIFOWithFarthestAndFromBottom(), true);
  	 
  	 }
	
	 
	 
	 @Test(priority=90121) 
  	 public void checkEraseAllTransationForPickFrompartiallyFilledBinsFirst() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	 {
  		bop=new BinOptionsPage(getDriver());
  		Assert.assertEquals(bop.checkEraseAllTransation(), true);
  	   
  	 }
	 
	 
	 @Test(priority=90122) 
  	 public void CheckEnabletheOptionPickFrompartiallyFilledBinsFirstWithCLoset() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	 {
  		bop=new BinOptionsPage(getDriver());
  		Assert.assertEquals(bop.CheckEnabletheOptionPickFrompartiallyFilledBinsFirstWithCLoset(), true);
  	   
  	 } 
	 
	 @Test(priority=90123) 
  	 public void checkLoginAfterEnablePickFrompartiallyFilledBinsFirstWithCLoset() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	 {
  		bop=new BinOptionsPage(getDriver());
  		Assert.assertEquals(bop.checkLogin(), true);
  	   
  	 }
	 
	 @Test(priority=90124) 
  	 public void checkSavingVoucherInOpeningStocksNewWithPickFrompartiallyFilledBinsFirstWithCLoset() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	 {
  		bop=new BinOptionsPage(getDriver());
  		Assert.assertEquals(bop.checkSavingVoucherInOpeningStocksNewWithPickFrompartiallyFilledBinsFirstWithCLoset(), true);
  	 
  	 }
	
	 @Test(priority=90125) 
  	 public void checkSavingSalesInvoiceVoucherWithithPickFrompartiallyFilledBinsFirstWithCLoset() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	 {
  		bop=new BinOptionsPage(getDriver());
  		Assert.assertEquals(bop.checkSavingSalesInvoiceVoucherWithithPickFrompartiallyFilledBinsFirstWithCLoset(), true);
  	 
  	 }
	 
	 
	 @Test(priority=90126) 
  	 public void checkEraseAllTransationForPickFrompartiallyFilledBinsFirstWithFarthest() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	 {
  		bop=new BinOptionsPage(getDriver());
  		Assert.assertEquals(bop.checkEraseAllTransation(), true);
  	   
  	 }
	 
	 
	 @Test(priority=90127) 
  	 public void CheckEnabletheOptionPickFrompartiallyFilledBinsFirstWithFarthest() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	 {
  		bop=new BinOptionsPage(getDriver());
  		Assert.assertEquals(bop.CheckEnabletheOptionPickFrompartiallyFilledBinsFirstWithFarthest(), true);
  	   
  	 } 
	 
	 @Test(priority=90128) 
  	 public void checkLoginAfterEnablePickFrompartiallyFilledBinsFirstWithFarthest() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	 {
  		bop=new BinOptionsPage(getDriver());
  		Assert.assertEquals(bop.checkLogin(), true);
  	   
  	 }
	 
	 @Test(priority=90129) 
  	 public void checkSavingVoucherInOpeningStocksNewWithPickFrompartiallyFilledBinsFirstWithFarthest() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	 {
  		bop=new BinOptionsPage(getDriver());
  		Assert.assertEquals(bop.checkSavingVoucherInOpeningStocksNewWithPickFrompartiallyFilledBinsFirstWithFarthest(), true);
  	 
  	 }
	
	 @Test(priority=90130) 
  	 public void checkSavingSalesInvoiceVoucherWithithPickFrompartiallyFilledBinsFirstWithFarthest() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	 {
  		bop=new BinOptionsPage(getDriver());
  		Assert.assertEquals(bop.checkSavingSalesInvoiceVoucherWithithPickFrompartiallyFilledBinsFirstWithFarthest(), true);
  	 
  	 }
	 
	 
	 @Test(priority=90131) 
  	 public void checkEraseAllTransationForPickFrompartiallyFilledBinsFirstWithClosestAndFromTop() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	 {
  		bop=new BinOptionsPage(getDriver());
  		Assert.assertEquals(bop.checkEraseAllTransation(), true);
  	   
  	 }
	 
	 
	 @Test(priority=90132) 
  	 public void CheckEnabletheOptionPickFrompartiallyFilledBinsFirstWithClosestAndFromTop() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	 {
  		bop=new BinOptionsPage(getDriver());
  		Assert.assertEquals(bop.CheckEnabletheOptionPickFrompartiallyFilledBinsFirstWithClosestAndFromTop(), true);
  	   
  	 } 
	 
	 @Test(priority=90133) 
  	 public void checkLoginAfterEnablePickFrompartiallyFilledBinsFirstWithClosestAndFromTop() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	 {
  		bop=new BinOptionsPage(getDriver());
  		Assert.assertEquals(bop.checkLogin(), true);
  	   
  	 }
	 
	 @Test(priority=90134) 
  	 public void checkSavingVoucherInOpeningStocksNewWithPickFrompartiallyFilledBinsFirstWithClosestAndFromTop() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	 {
  		bop=new BinOptionsPage(getDriver());
  		Assert.assertEquals(bop.checkSavingVoucherInOpeningStocksNewWithPickFrompartiallyFilledBinsFirstWithClosestAndFromTop(), true);
  	 
  	 }
	
	 @Test(priority=90135) 
  	 public void checkSavingSalesInvoiceVoucherWithithPickFrompartiallyFilledBinsFirstWithClosestAndFromTop() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	 {
  		bop=new BinOptionsPage(getDriver());
  		Assert.assertEquals(bop.checkSavingSalesInvoiceVoucherWithithPickFrompartiallyFilledBinsFirstWithClosestAndFromTop(), true);
  	 
  	 }
	 
	 @Test(priority=90136) 
  	 public void checkEraseAllTransationForPickFrompartiallyFilledBinsFirstWithClosestAndFromBottom() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	 {
  		bop=new BinOptionsPage(getDriver());
  		Assert.assertEquals(bop.checkEraseAllTransation(), true);
  	   
  	 }
	 
	 
	 @Test(priority=90137) 
  	 public void CheckEnabletheOptionPickFrompartiallyFilledBinsFirstWithClosestAndFromBottom() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	 {
  		bop=new BinOptionsPage(getDriver());
  		Assert.assertEquals(bop.CheckEnabletheOptionPickFrompartiallyFilledBinsFirstWithClosestAndFromBottom(), true);
  	   
  	 } 
	 
	 @Test(priority=90138) 
  	 public void checkLoginAfterEnablePickFrompartiallyFilledBinsFirstWithClosestAndFromBottom() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	 {
  		bop=new BinOptionsPage(getDriver());
  		Assert.assertEquals(bop.checkLogin(), true);
  	   
  	 }
	 
	 @Test(priority=90139) 
  	 public void checkSavingVoucherInOpeningStocksNewWithPickFrompartiallyFilledBinsFirstWithClosestAndFromBottom() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	 {
  		bop=new BinOptionsPage(getDriver());
  		Assert.assertEquals(bop.checkSavingVoucherInOpeningStocksNewWithPickFrompartiallyFilledBinsFirstWithClosestAndFromBottom(), true);
  	 
  	 }
	
	 @Test(priority=90140) 
  	 public void checkSavingSalesInvoiceVoucherWithithPickFrompartiallyFilledBinsFirstWithClosestAndFromBottom() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	 {
  		bop=new BinOptionsPage(getDriver());
  		Assert.assertEquals(bop.checkSavingSalesInvoiceVoucherWithithPickFrompartiallyFilledBinsFirstWithClosestAndFromBottom(), true);
  	 
  	 }
	 
	
	 
	 @Test(priority=90141) 
  	 public void checkEraseAllTransationForPickFrompartiallyFilledBinsFirstWithFarthestAndFromTop() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	 {
  		bop=new BinOptionsPage(getDriver());
  		Assert.assertEquals(bop.checkEraseAllTransation(), true);
  	   
  	 }
	 
	 
	 @Test(priority=90142) 
  	 public void CheckEnabletheOptionPickFrompartiallyFilledBinsFirstWithFarthestAndFromTop() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	 {
  		bop=new BinOptionsPage(getDriver());
  		Assert.assertEquals(bop.CheckEnabletheOptionPickFrompartiallyFilledBinsFirstWithFarthestAndFromTop(), true);
  	   
  	 } 
	 
	 @Test(priority=90143) 
  	 public void checkLoginAfterEnablePickFrompartiallyFilledBinsFirstWithFarthestAndFromTop() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	 {
  		bop=new BinOptionsPage(getDriver());
  		Assert.assertEquals(bop.checkLogin(), true);
  	   
  	 }
	 
	 @Test(priority=90144) 
  	 public void checkSavingVoucherInOpeningStocksNewWithPickFrompartiallyFilledBinsFirstWithFarthestAndFromTop() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	 {
  		bop=new BinOptionsPage(getDriver());
  		Assert.assertEquals(bop.checkSavingVoucherInOpeningStocksNewWithPickFrompartiallyFilledBinsFirstWithFarthestAndFromTop(), true);
  	 
  	 }
	
	 @Test(priority=90145) 
  	 public void checkSavingSalesInvoiceVoucherWithithPickFrompartiallyFilledBinsFirstWithFarthestAndFromTop() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	 {
  		bop=new BinOptionsPage(getDriver());
  		Assert.assertEquals(bop.checkSavingSalesInvoiceVoucherWithithPickFrompartiallyFilledBinsFirstWithFarthestAndFromTop(), true);
  	 
  	 }
	 
	 
	 
	 @Test(priority=90146) 
  	 public void checkEraseAllTransationForPickFrompartiallyFilledBinsFirstWithFarthestAndFromBottom() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	 {
  		bop=new BinOptionsPage(getDriver());
  		Assert.assertEquals(bop.checkEraseAllTransation(), true);
  	   
  	 }
	 
	 
	 @Test(priority=90147) 
  	 public void CheckEnabletheOptionPickFrompartiallyFilledBinsFirstWithFarthestAndFromBottom() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	 {
  		bop=new BinOptionsPage(getDriver());
  		Assert.assertEquals(bop.CheckEnabletheOptionPickFrompartiallyFilledBinsFirstWithFarthestAndFromBottom(), true);
  	   
  	 } 
	 
	 @Test(priority=90148) 
  	 public void checkLoginAfterEnablePickFrompartiallyFilledBinsFirstWithFarthestAndFromBottom() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	 {
  		bop=new BinOptionsPage(getDriver());
  		Assert.assertEquals(bop.checkLogin(), true);
  	   
  	 }
	 
	 @Test(priority=90149) 
  	 public void checkSavingVoucherInOpeningStocksNewWithPickFrompartiallyFilledBinsFirstWithFarthestAndFromBottom() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	 {
  		bop=new BinOptionsPage(getDriver());
  		Assert.assertEquals(bop.checkSavingVoucherInOpeningStocksNewWithPickFrompartiallyFilledBinsFirstWithFarthestAndFromBottom(), true);
  	 
  	 }
	
	 @Test(priority=90150) 
  	 public void checkSavingSalesInvoiceVoucherWithithPickFrompartiallyFilledBinsFirstWithFarthestAndFromBottom() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	 {
  		bop=new BinOptionsPage(getDriver());
  		Assert.assertEquals(bop.checkSavingSalesInvoiceVoucherWithithPickFrompartiallyFilledBinsFirstWithFarthestAndFromBottom(), true);
   	 }
	 
	 @Test(priority=99999) 
  	 public void checkLogout() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	 {
  		bop=new BinOptionsPage(getDriver());
  		Assert.assertEquals(bop.checkLogout(), true);
   	 }
	 
	 
	 
	 
	 

	
}
