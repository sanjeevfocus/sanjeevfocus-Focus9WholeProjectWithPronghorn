package com.focus.Pages;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import com.focus.base.BaseEngine;

public class ServiceTypeItemTransactionsAndReportsPage extends BaseEngine
{
	public ServiceTypeItemTransactionsAndReportsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}




	@FindBy (xpath="//*[@id='1']/div/span")
	private static WebElement homeMenu;

	@FindBy (xpath="//a[@id='1000']//span[contains(text(),'Masters')]")
	private static WebElement mastersMenu;

	@FindBy(xpath="//*[@id='221']/span")
	private static WebElement  homeMasterItemMenu;

	@FindBy(xpath="//*[@id='1105']/span")
	private static WebElement  homeMasterItem_ItemMenu;

	@FindBy(xpath="//i[@class='icon-font6 icon-new']")
	private static WebElement masterNewBtn;

	@FindBy(xpath="//input[@id='sName']")
	private static WebElement nameTxt;

	@FindBy(xpath="//input[@id='sCode']")
	private static WebElement codeTxt;

	@FindBy(xpath="//*[@id='btnMasterSaveClick']")
	private static WebElement saveBtn;

	@FindBy(xpath="//*[@id='GenerateNewMasterModel']/div/div[1]/div[2]/div/ul/li[2]/button[5]")
	private static WebElement masterCloseBtn;

	@FindBy(xpath="//select[@id='iProductType']")
	private static WebElement itemTypeDrpdwn;

	@FindBy(xpath="//tbody[@id='LandingGridBody']/tr/td[12]")
	private static List<WebElement> itemNameList;

	@FindBy(xpath="//tbody[@id='LandingGridBody']/tr/td[8]//input")
	private static List<WebElement> itemCheckboxList;

	@FindBy(xpath="//span[@id='btnProperties']")
	private static WebElement itemPropertiesBtn;

	@FindBy(xpath="//input[@id='chkDontMaintainStockbyBatch']")
	private static WebElement dontMaintainStockByBatchChkbox;

	@FindBy(xpath="//input[@id='chkDontinputBin']")
	private static WebElement dontInputBinChkbox;

	@FindBy(xpath="//input[@id='chkDontMaintainStocksByRMA']")
	private static WebElement dontMaintainStockByRMAChkbox;

	@FindBy(xpath="//span[@id='btnPropOk']")
	private static WebElement itemPropertiesOkBtn;

	@FindBy(xpath="//div[@id='divMasterProperty']/ul/li/span[2]")
	private static WebElement itemPropertiesCancelBtn;

	@FindBy(xpath="//span[@id='btnClose']")
	private static WebElement itemHomeCloseBtn;

	@FindBy(xpath="//*[@id='txtSearchMenu_MainLayout']")
	private static WebElement serachMenuTextHomePage;
	
	@FindBy(xpath="//div[contains(text(),'Inventory')]")
	private static WebElement  inventoryMenu; 

	@FindBy(xpath="//a[@id='137']//span[contains(text(),'Transactions')]")
	private static WebElement  inventoryTransactionsMenu; 

	@FindBy(xpath="//*[@id='139']/span")
	private static WebElement  inventoryTransactionsPurchasesMenu; 

	@FindBy(xpath="//*[@id='2010']/span")
	private static WebElement  requestForQuoteVoucher;

	@FindBy(xpath="//*[@id='2011']/span")
	private static WebElement  purchasesQuotationsVoucher;

	@FindBy(xpath="//*[@id='2012']/span")
	private static WebElement  purchasesOrdersVoucher;

	@FindBy(xpath="//*[@id='2013']/span")
	private static WebElement  materialReceiptNotesVoucher;

	@FindBy(xpath="//*[@id='140']/span")
	private static WebElement  inventoryTransactionsSalesMenu; 

	@FindBy(xpath="//*[@id='2018']/span")
	private static WebElement  salesQuotationsVoucher;

	@FindBy(xpath="//*[@id='2019']/span")
	private static WebElement  deliveryNotesVoucher;

	@FindBy(xpath="//*[@id='2022']/span")
	private static WebElement  posSalesVoucher;

	@FindBy(xpath="//*[@id='2045']/span")
	private static WebElement  productionOrdersVoucher;

	@FindBy(xpath="//*[@id='2017']/span")
	private static WebElement  salesOrdersVoucher;

	@FindBy(xpath="//a[@id='2033']//span[contains(text(),'Stocks')]")
	private static WebElement  inventoryTransactionsStocksMenu; 

	@FindBy(xpath="//span[contains(text(),'Shortages in Stock')]")
	private static WebElement  shortagesInStockVoucher;

	@FindBy(xpath="//span[contains(text(),'Excesses in Stocks')]")
	private static WebElement  excessesInStocksVoucher;

	@FindBy(xpath="//span[contains(text(),'Stock Transfers')]")
	private static WebElement  stockTransfersVoucher;

	@FindBy(xpath="//a[@id='2037']//span[contains(text(),'Opening Stocks')]")
	private static WebElement  openingStocksVoucher;

	@FindBy(xpath="//a[@id='2049']//span[contains(text(),'Opening Stocks New')]")
	private static WebElement  openingStocksNewVoucher;

	@FindBy(xpath="//*[@id='2038']/span")
	private static WebElement  materialRequisitionVoucher;

	@FindBy(xpath="//*[@id='2049']/span")
	private static WebElement  stockAdjustmentVoucher;

	@FindBy(xpath="//*[@id='164']/span")
	private static WebElement  holdAndUnholdStockVoucher;

	@FindBy(xpath="//*[@id='93']/span")
	private static WebElement  stockReconciliation;

	@FindBy(xpath="//*[@id='99']/span")
	private static WebElement  stockAllocation;
	
	@FindBy(xpath="//div[@id='myNavbar']//span[@class='icon-new icon-font6']")
	private static WebElement  newBtn;
	
	@FindBy(xpath="//div[@id='id_transaction_homescreen_edit']//span[@class='icon-edit icon-font6 ImagesinArabic']")
	private static WebElement  editBtn;

	@FindBy(xpath="//span[@class='icon-print icon-font6']")
	private static WebElement  printBtn;

	@FindBy(xpath="//div[@id='id_transaction_homescreen_Delete']//span[@class='icon-delete icon-font6']")
	private static WebElement  voucherHomeDeleteBtn;

	@FindBy(xpath="//span[@class='icon-authorize icon-font6']")
	private static WebElement  authorizeBtn;

	@FindBy(xpath="//*[@id='id_transactionentry_mobile_toolbar']/div/div[11]")
	private static WebElement  POauthorizeBtn;


	@FindBy(xpath="//span[@class='icon-suspend icon-font6']")
	private static WebElement  suspendBtn;

	@FindBy(xpath="//span[@class='icon-reject2 icon-font6']")
	private static WebElement  rejectBtn;

	@FindBy(xpath="//span[@class='icon-cheque icon-font6']")
	private static WebElement  chequeReturnBtn;

	@FindBy(xpath="//span[@class='icon-printbarcode icon-font6']")
	private static WebElement  printBarCodeBtn;

	@FindBy(xpath="//span[@class='icon-convert icon-font6']")
	private static WebElement  convertBtn;

	@FindBy(xpath="//span[@class='icon-export icon-font6']")
	private static WebElement  exportToXMLBtn;  

	@FindBy(xpath="//div[@id='myNavbar']//span[@class='icon-settings icon-font6']")
	private static WebElement  settingsBtn;

	@FindBy(xpath="//div[@id='dvHomeTransClose']//span[@class='icon-close icon-font6']")  
	private static WebElement  homeCloseBtn;

	//Voucher Entry Page Header Fields
	@FindBy(xpath="//input[@id='id_header_1']")
	private static WebElement  documentNumberTxt;

	@FindBy(xpath="//*[@id='id_header_1_input_image']/span")
	private static WebElement  documentNumberdropdown_ExpansionBtn;

	@FindBy(xpath="//input[@id='id_header_2']")
	private static WebElement  dateTxt;

	@FindBy(xpath="//td[@id='id_header_2_input_image']//span[@class='icon-calender theme_color-inverse datecontrol_arrow_margin datecontrol_arrow']")
	private static WebElement  dateTxt_CalenderBtn;

	@FindBy(xpath="//tr[@id='id_header_2_day_today']//span[@class='theme_color-inverse'][contains(text(),'Today')]")
	private static WebElement  calender_TodayBtn;


	@FindBy(xpath="//input[@id='id_body_536870916']")
	private static WebElement  enter_WarehouseTxt;

	@FindBy(xpath="//tbody[@id='id_header_268435460_table_body']/tr/td[2]")
	private static List<WebElement> warehouseHeaderComboList;

	@FindBy(xpath="//tbody[@id='id_body_23_table_body']/tr/td[2]")
	private static List<WebElement> itemComboList;


	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[2]")
	private static WebElement  select1stRow_1stColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[3]")
	private static WebElement  select1stRow_2ndColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[4]")
	private static WebElement  select1stRow_3rdColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[5]")
	private static WebElement  select1stRow_4thColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[6]")
	private static WebElement  select1stRow_5thColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[7]")
	private static WebElement  select1stRow_6thColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[8]")
	private static WebElement  select1stRow_7thColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[9]")
	private static WebElement  select1stRow_8thColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[10]")
	private static WebElement  select1stRow_9thColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[11]")
	private static WebElement  select1stRow_10thColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[12]")
	private static WebElement  select1stRow_11thColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[13]")
	private static WebElement  select1stRow_12thColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[14]")
	private static WebElement  select1stRow_13thColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[15]")
	private static WebElement  select1stRow_14thColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[16]")
	private static WebElement  select1stRow_15thColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[17]")
	private static WebElement  select1stRow_16thColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[18]")
	private static WebElement  select1stRow_17thColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[19]")
	private static WebElement  select1stRow_18thColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[20]")
	private static WebElement  select1stRow_19thColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[21]")
	private static WebElement  select1stRow_20thColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[22]")
	private static WebElement  select1stRow_21stColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[23]")
	private static WebElement  select1stRow_22ndColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[24]")
	private static WebElement  select1stRow_23rdColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[25]")
	private static WebElement  select1stRow_24thColumn;



	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[2]")
	private static WebElement  select2ndRow_1stColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[3]")
	private static WebElement  select2ndRow_2ndColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[4]")
	private static WebElement  select2ndRow_3rdColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[5]")
	private static WebElement  select2ndRow_4thColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[6]")
	private static WebElement  select2ndRow_5thColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[7]")
	private static WebElement  select2ndRow_6thColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[8]")
	private static WebElement  select2ndRow_7thColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[9]")
	private static WebElement  select2ndRow_8thColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[10]")
	private static WebElement  select2ndRow_9thColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[11]")
	private static WebElement  select2ndRow_10thColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[12]")
	private static WebElement  select2ndRow_11thColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[13]")
	private static WebElement  select2ndRow_12thColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[14]")
	private static WebElement  select2ndRow_13thColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[15]")
	private static WebElement  select2ndRow_14thColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[16]")
	private static WebElement  select2ndRow_15thColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[17]")
	private static WebElement  select2ndRow_16thColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[18]")
	private static WebElement  select2ndRow_17thColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[19]")
	private static WebElement  select2ndRow_18thColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[20]")
	private static WebElement  select2ndRow_19thColumn;
	
	
	@FindBy(xpath="//input[@id='id_body_23']")
	private static WebElement  enter_ItemTxt;

	@FindBy(xpath="//input[@id='id_body_12']")
	private static WebElement  enter_SalesAccountTxt;

	@FindBy(xpath="//input[@id='id_body_24']")
	private static WebElement  enter_UnitTxt;

	@FindBy(xpath="//input[@id='id_body_26']")
	private static WebElement  enter_Quantity;

	@FindBy(xpath="//input[@id='id_body_27']")
	private static WebElement  enter_Rate;

	@FindBy(xpath="//input[@id='id_body_28']")
	private static WebElement  enter_Gross;

	@FindBy (xpath="//input[@id='id_body_38']")
	private static WebElement enter_RMA;

	@FindBy(xpath="//input[@id='id_body_13']")
	private static WebElement  enter_Batch;

	@FindBy(xpath="//input[@id='id_body_12']")
	private static WebElement  enter_DebitACTxt;


	@FindBy(xpath="//input[@id='id_body_37']")
	private static WebElement enter_Expirydate;

	@FindBy(xpath="//input[@id='id_body_36']")
	private static WebElement enter_MfgDate;

	@FindBy(xpath="//input[@id='id_body_108']")
	private static WebElement enter_BatchRate;

	@FindBy(xpath="//input[@id='id_body_109']")
	private static WebElement enter_BatchRateValue1;

	@FindBy(xpath="//input[@id='id_body_110']")
	private static WebElement enter_BatchRateValue2;

	@FindBy(xpath="//*[@id='id_transactionentry_previous']")
	private static WebElement  previousBtn;

	@FindBy(xpath="//*[@id='id_transactionentry_next']")
	private static WebElement  nextBtn;

	@FindBy(xpath="//*[@id='id_transactionentry_print']")
	private static WebElement  new_PrintBtn;

	@FindBy(xpath="//*[@id='id_transactionentry_suspend']")
	private static WebElement  new_SuspendBtn;

	@FindBy(xpath="//*[@id='id_transactionentry_close']")
	private static WebElement  new_CloseBtn;

	@FindBy(xpath="//div[@id='id_transactionentry_delete']//span[contains(@class,'icon-delete icon-font6')]")
	private static WebElement  new_DeleteBtn;
	
	@FindBy(xpath="//*[@id='id_transactionentry_save']")
	private static WebElement  voucherSaveBtn;

	@FindBy(xpath="//div[@id='dvHomeTransClose']")  
	private static WebElement  voucherhomeCloseBtn;
	
	@FindBy(xpath="//*[@id='60']/div")
	private static WebElement  financialsMenu; 
	
	@FindBy(xpath="//*[@id='61']/span")
	private static WebElement  financialsTransactionMenu;

	@FindBy(xpath="//a[@id='2019']")
	private static WebElement  deliveryNotesBtn;
	
	@FindBy(xpath="//input[@id='id_header_4']")
	private static WebElement  customerAccountTxt;
	
	@FindBy(xpath="//span[@id='btnPick']")
	private static WebElement pickBtn;
	
	@FindBy(xpath="//input[@id='txtNewReference']")
	private static WebElement newReferenceTxt;
	
	@FindBy(xpath="//span[@id='btnOk']")
	private static WebElement Bill_OkBtn;
	
	@FindBy(xpath="//a[@id='200']//span[contains(text(),'Reports')]")
	private static WebElement  inventoryReportsMenu; 
   	
	@FindBy(xpath="//span[contains(text(),'Stock Ledger')]")
	private static WebElement  stockLedger;
	
	@FindBy(xpath="//select[@id='DateOptions_']")
	private static WebElement sl_DateOptionDropdown;
	
	@FindBy(xpath="//i[contains(@class,'icon-font6 icon-ok')]")
	private static WebElement sl_OkBtn;
	
	@FindBy(xpath="//input[@id='selectAllMasters_']")
	private static WebElement sl_SelectAllItemsChkBox;

	@FindBy(xpath="//div[@id='dvReportDetails']/div/table/tbody")
	private static WebElement reportsTable;
	
	@FindBy(xpath="//div[@id='REPORTRENDERNEWControls']/ul/li/span[12]")
	private static WebElement report_CloseBtn;
	
	@FindBy(xpath="//div[@id='REPORTRENDERNEWControls']/ul/li/span[13]")
	private static WebElement report_CloseWithLevelsBtn;
	
	@FindBy(xpath="//input[@id='RITCheckbox__3']")
	private static WebElement sl_IncludeServiceTypeItemChkBox;

	@FindBy(xpath="//input[@id='RITCheckbox__9']")
	private static WebElement sl_AgeingAnalysisIncludeServiceTypeItemChkBox;
	
	@FindBy(xpath="(//tr[@id='trRender_0'])[1]/td")
	private static List<WebElement> reportsRow1List;
	
	@FindBy(xpath="(//tr[@id='trRender_1'])[1]/td")
	private static List<WebElement> reportsRow2List;
	
	@FindBy(xpath="(//tr[@id='trRender_2'])[1]/td")
	private static List<WebElement> reportsRow3List;
	
	@FindBy(xpath="(//tr[@id='trRender_3'])[1]/td")
	private static List<WebElement> reportsRow4List;
	
	@FindBy(xpath="(//tr[@id='trRender_4'])[1]/td")
	private static List<WebElement> reportsRow5List;
	
	@FindBy(xpath="(//tr[@id='trRender_5'])[1]/td")
	private static List<WebElement> reportsRow6List;
	
	@FindBy(xpath="(//tr[@id='trRender_6'])[1]/td")
	private static List<WebElement> reportsRow7List;
	
	@FindBy(xpath="(//tr[@id='trRender_7'])[1]/td")
	private static List<WebElement> reportsRow8List;
	
	@FindBy(xpath="(//tr[@id='trRender_8'])[1]/td")
	private static List<WebElement> reportsRow9List;
	
	@FindBy(xpath="(//tr[@id='trRender_9'])[1]/td")
	private static List<WebElement> reportsRow10List;
	
	@FindBy(xpath="(//tr[@id='trRender_10'])[1]/td")
	private static List<WebElement> reportsRow11List;
	
	@FindBy(xpath="(//tr[@id='trRender_11'])[1]/td")
	private static List<WebElement> reportsRow12List;
	
	@FindBy(xpath="(//tr[@id='trRender_12'])[1]/td")
	private static List<WebElement> reportsRow13List;
	
	@FindBy(xpath="(//tr[@id='trRender_13'])[1]/td")
	private static List<WebElement> reportsRow14List;
	
	@FindBy(xpath="//span[contains(text(),'Stock Statement')]")
	private static WebElement  stockStatement;
	
	@FindBy(xpath="//i[contains(@class,'icon-font6 icon-close')]")
	private static WebElement sl_CloseBtn;
	
	@FindBy(xpath="//*[@id='575']/span")
	private static WebElement  stockMovement;
	
	@FindBy(xpath="//*[@id='576']/span")
	private static WebElement  multiLevelStockMovement;
	
	@FindBy(xpath="//a[@id='578']")
	private static WebElement  stockValuation;
	
	@FindBy(xpath="//span[contains(text(),'Stock ageing analysis')]")
	private static WebElement  stockAgeingAnalysisMenu;
		
	@FindBy(xpath="//*[@id='582']/span")
	private static WebElement  ageingAnalysis;
	


	public static boolean checkLogin() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
	{
		LoginPage lp=new LoginPage(getDriver()); 

		String unamelt="su";

		String pawslt="su";

		lp.enterUserName(unamelt);

		lp.enterPassword(pawslt);

		Thread.sleep(2000);

		lp.clickOnSignInBtn();

		Thread.sleep(7000);

		if(serachMenuTextHomePage.isDisplayed())
		{
			return true;
		}
		else
		{
			return false;
		}
	}




	public  boolean checkCreatingServiceTypeItem() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		System.out.println("********************checkCreatingServiceTypeItem************************");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
		homeMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersMenu));
		mastersMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMasterItemMenu));
		homeMasterItemMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMasterItem_ItemMenu));
		homeMasterItem_ItemMenu.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterNewBtn));
		masterNewBtn.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
		nameTxt.sendKeys("Service2370");
		nameTxt.sendKeys(Keys.TAB);

		Thread.sleep(1000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(codeTxt));
		codeTxt.sendKeys("2370");
		codeTxt.sendKeys(Keys.TAB);

		Thread.sleep(1000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemTypeDrpdwn));
		Select itemType = new Select(itemTypeDrpdwn);
		itemType.selectByVisibleText("Service");

		Thread.sleep(1000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
		saveBtn.click();

		String expMessage="Saved Successfully";

		String actMessage=checkValidationMessage(expMessage);

		System.out.println("Message     : "+actMessage+" Value Expected : "+expMessage);

		Thread.sleep(1000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterCloseBtn));
		masterCloseBtn.click();

		if(actMessage.equalsIgnoreCase(expMessage))
		{	
			return true;
		}	 
		else
		{
			return false;
		}
	}







	public  boolean checkChangingServiceItemPropertiesToIgnoreBatchBinRMA() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		System.out.println("************************checkChangingServiceItemPropertiesToIgnoreBatchBinRMA****************************");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterNewBtn));

		int count = itemNameList.size();

		for (int i = 0; i < count; i++) 
		{
			String itemName = itemNameList.get(i).getText();

			if (itemName.equalsIgnoreCase("Service2370")) 
			{
				itemCheckboxList.get(i).click();
				break;
			}
		}

		Thread.sleep(1000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemPropertiesBtn));
		itemPropertiesBtn.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dontMaintainStockByBatchChkbox));
		if (dontMaintainStockByBatchChkbox.isSelected()==false) 
		{
			dontMaintainStockByBatchChkbox.click();
		}

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dontInputBinChkbox));
		if (dontInputBinChkbox.isSelected()==false) 
		{
			dontInputBinChkbox.click();
		}

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dontMaintainStockByRMAChkbox));
		if (dontMaintainStockByRMAChkbox.isSelected()==false) 
		{
			dontMaintainStockByRMAChkbox.click();
		}

		Thread.sleep(2000);

		boolean actDontMaintainBatch = dontMaintainStockByBatchChkbox.isSelected();
		boolean expDontMaintainBatch = true;

		boolean actDontInputBins = dontInputBinChkbox.isSelected();
		boolean expDontInputBins = true;

		boolean actDontMaintainRMA = dontMaintainStockByRMAChkbox.isSelected();
		boolean expDontMaintainRMA = true;

		System.out.println("Dont Maintain Batch : "+actDontMaintainBatch  +"  Value Expected  "+expDontMaintainBatch);
		System.out.println("Dont Input Bins     : "+actDontInputBins      +"  Value Expected  "+expDontInputBins);
		System.out.println("Dont Maintain RMA   : "+actDontMaintainRMA    +"  Value Expected  "+expDontMaintainRMA);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemPropertiesOkBtn));
		itemPropertiesOkBtn.click();

		Thread.sleep(2000);

		if (actDontMaintainBatch==expDontMaintainBatch && actDontInputBins==expDontInputBins && actDontMaintainRMA==expDontMaintainRMA) 
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemHomeCloseBtn));
			itemHomeCloseBtn.click();
			Thread.sleep(1000);
			return true;
		} 
		else 
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemHomeCloseBtn));
			itemHomeCloseBtn.click();
			Thread.sleep(1000);
			return false;
		}
	}
	
	
	
	
	
	
	
	public boolean checkSavingOpeningStockVoucher1WithService2370Item() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		System.out.println("**************************checkSavingOpeningStockVoucher1WithService2370Item*************************");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
		inventoryMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsMenu));
		inventoryTransactionsMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsStocksMenu));
		inventoryTransactionsStocksMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(openingStocksVoucher));
		openingStocksVoucher.click();

		checkDeleteLinkStatus();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();

		checkValidationMessage("Screen opened");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
		select1stRow_1stColumn.click();
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_WarehouseTxt));
		enter_WarehouseTxt.sendKeys("HYDERABAD");
		Thread.sleep(2000);
		enter_WarehouseTxt.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
		enter_ItemTxt.sendKeys("Service2370");
		Thread.sleep(2000);
		enter_ItemTxt.sendKeys(Keys.TAB);
		
		Thread.sleep(1000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
		enter_Quantity.sendKeys("10");
		enter_Quantity.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
		enter_Rate.sendKeys("250");
		enter_Rate.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
		enter_Gross.sendKeys(Keys.TAB);

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherSaveBtn));
		voucherSaveBtn.click();

		HashSet<String> actMessage = new HashSet();

		for (int i = 0; i < 2; i++) 
		{
			String data = checkValidationMessage("");
			actMessage.add(data);
		}

		HashSet<String> expMessage = new HashSet();

		expMessage.add("Voucher saved successfully : 1");
		expMessage.add("Saving in background.");

		System.out.println("Actual Message    : "+actMessage);
		System.out.println("Expected Message  : "+expMessage);

		if(actMessage.equals(expMessage))
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
			new_CloseBtn.click();
			Thread.sleep(2000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherhomeCloseBtn));
			voucherhomeCloseBtn.click();
			return true;
		}
		else
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
			new_CloseBtn.click();
			Thread.sleep(2000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherhomeCloseBtn));
			voucherhomeCloseBtn.click();
			return false;
		}
	}

	
	
	
	
	
	
	
	
	
	public static boolean checkSavingDeliveryNotesVoucher1WithService2370Item() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		System.out.println("*************************************checkSavingDeliveryNotesVoucher1WithService2370Item**************************************");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
		inventoryMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsMenu));
		inventoryTransactionsMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsSalesMenu));
		inventoryTransactionsSalesMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(deliveryNotesBtn));
		deliveryNotesBtn.click();

		Thread.sleep(2000);
				
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();
		
		checkValidationMessage("Screen opened");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerAccountTxt));
		customerAccountTxt.sendKeys("Customer A");	
		Thread.sleep(2000);
		customerAccountTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
		select1stRow_1stColumn.click();
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_WarehouseTxt));
		enter_WarehouseTxt.sendKeys("HYDERABAD");
		Thread.sleep(2000);
		enter_WarehouseTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
		enter_ItemTxt.sendKeys("Service2370");
        Thread.sleep(2000);
		enter_ItemTxt.sendKeys(Keys.TAB);	
		
        Thread.sleep(2000);
        
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_6thColumn));
		select1stRow_6thColumn.click();
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
		enter_Quantity.sendKeys("2");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_8thColumn));
		select1stRow_8thColumn.click();
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
		enter_Rate.sendKeys("25");
		enter_Rate.sendKeys(Keys.TAB);
						
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
		enter_Gross.sendKeys(Keys.TAB);
		
		Thread.sleep(2000);
		
		String actAvgRate = select1stRow_4thColumn.getText();
		String expAvgRate = "0.00";
		
		String actAvgRateO = select1stRow_5thColumn.getText();
		String expAvgRateO = "0.00";
		
		System.out.println("Avg Rate    : "+actAvgRate  +"  Value Expected  "+expAvgRate);
		System.out.println("Avg Rate(O) : "+actAvgRateO +"  Value Expected  "+expAvgRateO);
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherSaveBtn));
		voucherSaveBtn.click();
		
		HashSet<String> actMessage = new HashSet();
		
		for (int i = 0; i < 2; i++) 
		{
			String data = checkValidationMessage("");
			actMessage.add(data);
		}
		
		HashSet<String> expMessage = new HashSet();
		
		expMessage.add("Voucher saved successfully : 1");
		expMessage.add("Saving in background.");
		
		System.out.println("Actual Message    : "+actMessage);
		System.out.println("Expected Message  : "+expMessage);
		
		if(actAvgRate.equalsIgnoreCase(expAvgRate) && actAvgRateO.equalsIgnoreCase(expAvgRateO) && actMessage.equals(expMessage))
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
			new_CloseBtn.click();
			Thread.sleep(2000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherhomeCloseBtn));
			voucherhomeCloseBtn.click();
			return true;
		} 
		else 
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
			new_CloseBtn.click();
			Thread.sleep(2000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherhomeCloseBtn));
			voucherhomeCloseBtn.click();
			return false;
		}
	}
	
	
	
	
	




	
	public boolean checkSavingMaterialReceiptNoteVoucher1WithService2370Item() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
		inventoryMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsMenu));
		inventoryTransactionsMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsPurchasesMenu));
		inventoryTransactionsPurchasesMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(materialReceiptNotesVoucher));
		materialReceiptNotesVoucher.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();

		checkValidationMessage("Screen opened");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerAccountTxt));
		customerAccountTxt.sendKeys("Vendor A");
		Thread.sleep(2000);
		customerAccountTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
		select1stRow_1stColumn.click();
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_WarehouseTxt));
		enter_WarehouseTxt.sendKeys("HYDERABAD");
		Thread.sleep(2000);
		enter_WarehouseTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
		enter_ItemTxt.sendKeys("Service2370");
		Thread.sleep(2000);
		enter_ItemTxt.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_5thColumn));
		select1stRow_5thColumn.click();
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
		enter_Quantity.sendKeys("15");
		enter_Quantity.sendKeys(Keys.TAB);
		
		Thread.sleep(3000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
		enter_Rate.sendKeys("5");
		enter_Rate.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
		enter_Gross.sendKeys(Keys.TAB);
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherSaveBtn));
		voucherSaveBtn.click();

		HashSet<String> actMessage = new HashSet();

		for (int i = 0; i < 2; i++) 
		{
			String data = checkValidationMessage("");
			actMessage.add(data);
		}

		HashSet<String> expMessage = new HashSet();

		expMessage.add("Voucher saved successfully : 1");
		expMessage.add("Saving in background.");

		System.out.println("Actual Message    : "+actMessage);
		System.out.println("Expected Message  : "+expMessage);

		if(actMessage.equals(expMessage))
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
			new_CloseBtn.click();
			Thread.sleep(2000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherhomeCloseBtn));
			voucherhomeCloseBtn.click();
			return true;
		}
		else
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
			new_CloseBtn.click();
			Thread.sleep(2000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherhomeCloseBtn));
			voucherhomeCloseBtn.click();
			return false;
		}
	}




	
	
	
	
	
	public boolean checkStockLedgerReportWithoutIncludeServiceTypeItem() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
		inventoryMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryReportsMenu));
		inventoryReportsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(stockLedger));
		stockLedger.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByIndex(1);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_SelectAllItemsChkBox));
		sl_SelectAllItemsChkBox.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		
		Thread.sleep(3000);
		
		boolean actReportsTable = reportsTable.getText().isEmpty();
		boolean expReportsTable = true;

		System.out.println("Report Table : "+actReportsTable+" Value Expected : "+expReportsTable);
		
		if(actReportsTable==expReportsTable)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	
	
	
	
	public boolean checkStockLedgerReportWithIncludeServiceTypeItem() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
		report_CloseBtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_IncludeServiceTypeItemChkBox));
		sl_IncludeServiceTypeItemChkBox.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		
		Thread.sleep(3000);
		
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		Calendar cal=Calendar.getInstance();
		String VoucherDate=df.format(cal.getTime());
		
		int reportsRow1ListCount = reportsRow1List.size();
		ArrayList<String> reportsRow1ListArray = new ArrayList<String>();
		for(int i=1;i<reportsRow1ListCount;i++)
		{
			String data = reportsRow1List.get(i).getText();
			reportsRow1ListArray.add(data);
		}
		String actRow1List = reportsRow1ListArray.toString();
		String expRow1List = "[Service2370 2370]";
		

		
		int reportsRow2ListCount = reportsRow2List.size();
		ArrayList<String> reportsRow2ListArray = new ArrayList<String>();
		for(int i=1;i<reportsRow2ListCount;i++)
		{
			String data = reportsRow2List.get(i).getText();
			reportsRow2ListArray.add(data);
		}
		String actRow2List = reportsRow2ListArray.toString();
		String expRow2List = "[, Opening Balance, 10.00, , , , 10.00, , , , , , , ]";
		
		
		
		int reportsRow3ListCount = reportsRow3List.size();
		ArrayList<String> reportsRow3ListArray = new ArrayList<String>();
		for(int i=1;i<reportsRow3ListCount;i++)
		{
			String data = reportsRow3List.get(i).getText();
			reportsRow3ListArray.add(data);
		}
		String actRow3List = reportsRow3ListArray.toString();
		String expRow3List = "["+VoucherDate+", DelNts:1, , , 2.00, , 8.00, , , , , , , ]";
		
		
		
		int reportsRow4ListCount = reportsRow4List.size();
		ArrayList<String> reportsRow4ListArray = new ArrayList<String>();
		for(int i=1;i<reportsRow4ListCount;i++)
		{
			String data = reportsRow4List.get(i).getText();
			reportsRow4ListArray.add(data);
		}
		String actRow4List = reportsRow4ListArray.toString();
		String expRow4List = "["+VoucherDate+", MatRpt:1, 15.00, 5.00, , , 23.00, 75.00, , , , , , ]";
		
		
		
		int reportsRow5ListCount = reportsRow5List.size();
		ArrayList<String> reportsRow5ListArray = new ArrayList<String>();
		for(int i=1;i<reportsRow5ListCount;i++)
		{
			String data = reportsRow5List.get(i).getText();
			reportsRow5ListArray.add(data);
		}
		String actRow5List = reportsRow5ListArray.toString();
		String expRow5List = "[Total, , 25.00, 5.00, 2.00, , 23.00, 75.00, , , , , , ]";
		
		
		System.out.println("****************************checkStockLedgerReportWithIncludeServiceTypeItem********************************");
		
		System.out.println(actRow1List);
		System.out.println(expRow1List);
		
		System.out.println(actRow2List);
		System.out.println(expRow2List);
		
		System.out.println(actRow3List);
		System.out.println(expRow3List);
		
		System.out.println(actRow4List);
		System.out.println(expRow4List);
		
		System.out.println(actRow5List);
		System.out.println(expRow5List);
		
		if (actRow1List.equalsIgnoreCase(expRow1List) && actRow2List.equalsIgnoreCase(expRow2List) && actRow3List.equalsIgnoreCase(expRow3List) 
				&& actRow4List.equalsIgnoreCase(expRow4List) && actRow5List.equalsIgnoreCase(expRow5List)) 
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
			report_CloseBtn.click();
			Thread.sleep(2000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
			sl_CloseBtn.click();
			return true;
		} 
		else 
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
			report_CloseBtn.click();
			Thread.sleep(2000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
			sl_CloseBtn.click();
			return false;
		}
	}
	
	
	
	
	
	
	
	
	
	public boolean checkStockStatementReportWithoutIncludeServiceTypeItem() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
		inventoryMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryReportsMenu));
		inventoryReportsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(stockStatement));
		stockStatement.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByIndex(1);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_SelectAllItemsChkBox));
		sl_SelectAllItemsChkBox.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		
		Thread.sleep(3000);
		
		boolean actReportsTable = reportsTable.getText().isEmpty();
		boolean expReportsTable = true;

		System.out.println("Report Table : "+actReportsTable+" Value Expected : "+expReportsTable);
		
		if(actReportsTable==expReportsTable)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
	
	
	
	
	
	public boolean checkStockStatementReportWithIncludeServiceTypeItem() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
		report_CloseBtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_IncludeServiceTypeItemChkBox));
		sl_IncludeServiceTypeItemChkBox.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		
		Thread.sleep(3000);
		
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		Calendar cal=Calendar.getInstance();
		String VoucherDate=df.format(cal.getTime());
		
		int reportsRow1ListCount = reportsRow1List.size();
		ArrayList<String> reportsRow1ListArray = new ArrayList<String>();
		for(int i=1;i<reportsRow1ListCount;i++)
		{
			String data = reportsRow1List.get(i).getText();
			reportsRow1ListArray.add(data);
		}
		String actRow1List = reportsRow1ListArray.toString();
		String expRow1List = "[Service2370 2370]";
		

		
		int reportsRow2ListCount = reportsRow2List.size();
		ArrayList<String> reportsRow2ListArray = new ArrayList<String>();
		for(int i=1;i<reportsRow2ListCount;i++)
		{
			String data = reportsRow2List.get(i).getText();
			reportsRow2ListArray.add(data);
		}
		String actRow2List = reportsRow2ListArray.toString();
		String expRow2List = "["+VoucherDate+", 10.00, 15.00, 2.00, 23.00, ]";
		
		
		
		int reportsRow3ListCount = reportsRow3List.size();
		ArrayList<String> reportsRow3ListArray = new ArrayList<String>();
		for(int i=1;i<reportsRow3ListCount;i++)
		{
			String data = reportsRow3List.get(i).getText();
			reportsRow3ListArray.add(data);
		}
		String actRow3List = reportsRow3ListArray.toString();
		String expRow3List = "[Total, 10.00, 15.00, 2.00, 23.00, ]";
		
		
		System.out.println("****************************checkStockStatementReportWithIncludeServiceTypeItem********************************");
		
		System.out.println(actRow1List);
		System.out.println(expRow1List);
		
		System.out.println(actRow2List);
		System.out.println(expRow2List);
		
		System.out.println(actRow3List);
		System.out.println(expRow3List);
		
		if (actRow1List.equalsIgnoreCase(expRow1List) && actRow2List.equalsIgnoreCase(expRow2List) && actRow3List.equalsIgnoreCase(expRow3List)) 
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
			report_CloseBtn.click();
			Thread.sleep(2000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
			sl_CloseBtn.click();
			return true;
		} 
		else 
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
			report_CloseBtn.click();
			Thread.sleep(2000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
			sl_CloseBtn.click();
			return false;
		}
	}





	
	
	
	
	public boolean checkStockMovementReportWithoutIncludeServiceTypeItem() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
		inventoryMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryReportsMenu));
		inventoryReportsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(stockMovement));
		stockMovement.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByIndex(1);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_SelectAllItemsChkBox));
		sl_SelectAllItemsChkBox.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		
		Thread.sleep(3000);
		
		boolean actReportsTable = reportsTable.getText().isEmpty();
		boolean expReportsTable = true;

		System.out.println("Report Table : "+actReportsTable+" Value Expected : "+expReportsTable);
		
		if(actReportsTable==expReportsTable)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
	
	
	
	
	
	public boolean checkStockMovementReportWithIncludeServiceTypeItem() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
		report_CloseBtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_IncludeServiceTypeItemChkBox));
		sl_IncludeServiceTypeItemChkBox.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		
		Thread.sleep(3000);
		
		int reportsRow1ListCount = reportsRow1List.size();
		ArrayList<String> reportsRow1ListArray = new ArrayList<String>();
		for(int i=1;i<reportsRow1ListCount;i++)
		{
			String data = reportsRow1List.get(i).getText();
			reportsRow1ListArray.add(data);
		}
		String actRow1List = reportsRow1ListArray.toString();
		String expRow1List = "[Service2370, 10.00, , 15.00, 75.00, 2.00, 75.00, 23.00, , ]";
		

		int reportsRow2ListCount = reportsRow2List.size();
		ArrayList<String> reportsRow2ListArray = new ArrayList<String>();
		for(int i=1;i<reportsRow2ListCount;i++)
		{
			String data = reportsRow2List.get(i).getText();
			reportsRow2ListArray.add(data);
		}
		String actRow2List = reportsRow2ListArray.toString();
		String expRow2List = "[Total, 10.00, , 15.00, 75.00, 2.00, 75.00, 23.00, , ]";
		
		
		System.out.println("****************************checkStockMovementReportWithIncludeServiceTypeItem********************************");
		
		System.out.println(actRow1List);
		System.out.println(expRow1List);
		
		System.out.println(actRow2List);
		System.out.println(expRow2List);
		
		if (actRow1List.equalsIgnoreCase(expRow1List) && actRow2List.equalsIgnoreCase(expRow2List)) 
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
			report_CloseBtn.click();
			Thread.sleep(2000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
			sl_CloseBtn.click();
			return true;
		} 
		else 
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
			report_CloseBtn.click();
			Thread.sleep(2000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
			sl_CloseBtn.click();
			return false;
		}
	}

	
	
	
	
	
	
	
	public boolean checkStockValuationReportWithoutIncludeServiceTypeItem() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
		inventoryMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryReportsMenu));
		inventoryReportsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(stockValuation));
		stockValuation.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByIndex(1);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_SelectAllItemsChkBox));
		sl_SelectAllItemsChkBox.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		
		Thread.sleep(3000);
		
		boolean actReportsTable = reportsTable.getText().isEmpty();
		boolean expReportsTable = true;

		System.out.println("Report Table : "+actReportsTable+" Value Expected : "+expReportsTable);
		
		if(actReportsTable==expReportsTable)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
	
	
	
	
	
	public boolean checkStockValuationReportWithIncludeServiceTypeItem() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
		report_CloseBtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_IncludeServiceTypeItemChkBox));
		sl_IncludeServiceTypeItemChkBox.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		
		Thread.sleep(3000);
		
		int reportsRow1ListCount = reportsRow1List.size();
		ArrayList<String> reportsRow1ListArray = new ArrayList<String>();
		for(int i=1;i<reportsRow1ListCount;i++)
		{
			String data = reportsRow1List.get(i).getText();
			reportsRow1ListArray.add(data);
		}
		String actRow1List = reportsRow1ListArray.toString();
		String expRow1List = "[Service2370, 2370, Service2370, 23.00, , , ]";
		

		int reportsRow2ListCount = reportsRow2List.size();
		ArrayList<String> reportsRow2ListArray = new ArrayList<String>();
		for(int i=1;i<reportsRow2ListCount;i++)
		{
			String data = reportsRow2List.get(i).getText();
			reportsRow2ListArray.add(data);
		}
		String actRow2List = reportsRow2ListArray.toString();
		String expRow2List = "[Grand Total, , , 23.00, , , ]";
		
		
		System.out.println("****************************checkStockValuationReportWithIncludeServiceTypeItem********************************");
		
		System.out.println(actRow1List);
		System.out.println(expRow1List);
		
		System.out.println(actRow2List);
		System.out.println(expRow2List);
		
		if (actRow1List.equalsIgnoreCase(expRow1List) && actRow2List.equalsIgnoreCase(expRow2List)) 
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
			report_CloseBtn.click();
			Thread.sleep(2000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
			sl_CloseBtn.click();
			return true;
		} 
		else 
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
			report_CloseBtn.click();
			Thread.sleep(2000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
			sl_CloseBtn.click();
			return false;
		}
	}

	
	
	
	
	
	
	
	
	
	
	public boolean checkStockAgeingAnalysisReportWithoutIncludeServiceTypeItem() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
		inventoryMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryReportsMenu));
		inventoryReportsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(stockAgeingAnalysisMenu));
		stockAgeingAnalysisMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ageingAnalysis));
		ageingAnalysis.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByIndex(1);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_SelectAllItemsChkBox));
		sl_SelectAllItemsChkBox.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		
		Thread.sleep(3000);
		
		boolean actReportsTable = reportsTable.getText().isEmpty();
		boolean expReportsTable = true;

		System.out.println("Report Table : "+actReportsTable+" Value Expected : "+expReportsTable);
		
		if(actReportsTable==expReportsTable)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
	
	
	
	
	
	public boolean checkStockAgeingAnalysisReportWithIncludeServiceTypeItem() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
		report_CloseBtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_AgeingAnalysisIncludeServiceTypeItemChkBox));
		sl_AgeingAnalysisIncludeServiceTypeItemChkBox.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		
		Thread.sleep(3000);
		
		int reportsRow1ListCount = reportsRow1List.size();
		ArrayList<String> reportsRow1ListArray = new ArrayList<String>();
		for(int i=1;i<reportsRow1ListCount;i++)
		{
			String data = reportsRow1List.get(i).getText();
			reportsRow1ListArray.add(data);
		}
		String actRow1List = reportsRow1ListArray.toString();
		String expRow1List = "[Service2370, 23.00, , 15.00, , , , , , , , , , , , , , 8.00, , ]";
		

		int reportsRow2ListCount = reportsRow2List.size();
		ArrayList<String> reportsRow2ListArray = new ArrayList<String>();
		for(int i=1;i<reportsRow2ListCount;i++)
		{
			String data = reportsRow2List.get(i).getText();
			reportsRow2ListArray.add(data);
		}
		String actRow2List = reportsRow2ListArray.toString();
		String expRow2List = "[Total, 23.00, , 15.00, , , , , , , , , , , , , , 8.00, , ]";
		
		
		System.out.println("****************************checkStockAgeingAnalysisReportWithIncludeServiceTypeItem********************************");
		
		System.out.println(actRow1List);
		System.out.println(expRow1List);
		
		System.out.println(actRow2List);
		System.out.println(expRow2List);
		
		if (actRow1List.equalsIgnoreCase(expRow1List) && actRow2List.equalsIgnoreCase(expRow2List)) 
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
			report_CloseBtn.click();
			Thread.sleep(2000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
			sl_CloseBtn.click();
			return true;
		} 
		else 
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
			report_CloseBtn.click();
			Thread.sleep(2000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
			sl_CloseBtn.click();
			return false;
		}
	}
	
	
	
	
	
	
	
	
	public boolean checkMultiLevelStockMovementReportWithoutIncludeServiceTypeItem() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
		inventoryMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryReportsMenu));
		inventoryReportsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(multiLevelStockMovement));
		multiLevelStockMovement.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByIndex(1);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_SelectAllItemsChkBox));
		sl_SelectAllItemsChkBox.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		
		Thread.sleep(3000);
		
		boolean actReportsTable = reportsTable.getText().isEmpty();
		boolean expReportsTable = true;

		System.out.println("Report Table : "+actReportsTable+" Value Expected : "+expReportsTable);
		
		if(actReportsTable==expReportsTable)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
	
	
	
	
	
	public boolean checkMultiLevelStockMovementReportWithIncludeServiceTypeItem() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseWithLevelsBtn));
		report_CloseWithLevelsBtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_IncludeServiceTypeItemChkBox));
		sl_IncludeServiceTypeItemChkBox.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		
		Thread.sleep(3000);
		
		int reportsRow1ListCount = reportsRow1List.size();
		ArrayList<String> reportsRow1ListArray = new ArrayList<String>();
		for(int i=1;i<reportsRow1ListCount;i++)
		{
			String data = reportsRow1List.get(i).getText();
			reportsRow1ListArray.add(data);
		}
		String actRow1List = reportsRow1ListArray.toString();
		String expRow1List = "[Service2370, 10.00, , 15.00, 75.00, 2.00, , 23.00, , ]";
		

		int reportsRow2ListCount = reportsRow2List.size();
		ArrayList<String> reportsRow2ListArray = new ArrayList<String>();
		for(int i=1;i<reportsRow2ListCount;i++)
		{
			String data = reportsRow2List.get(i).getText();
			reportsRow2ListArray.add(data);
		}
		String actRow2List = reportsRow2ListArray.toString();
		String expRow2List = "[Grand Total, 10.00, , 15.00, 75.00, 2.00, , 23.00, , ]";
		
		
		System.out.println("****************************checkMultiLevelStockMovementReportWithIncludeServiceTypeItem********************************");
		
		System.out.println(actRow1List);
		System.out.println(expRow1List);
		
		System.out.println(actRow2List);
		System.out.println(expRow2List);
		
		if (actRow1List.equalsIgnoreCase(expRow1List) && actRow2List.equalsIgnoreCase(expRow2List)) 
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseWithLevelsBtn));
			report_CloseWithLevelsBtn.click();
			Thread.sleep(2000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
			sl_CloseBtn.click();
			return true;
		} 
		else 
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseWithLevelsBtn));
			report_CloseWithLevelsBtn.click();
			Thread.sleep(2000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
			sl_CloseBtn.click();
			return false;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	






}
