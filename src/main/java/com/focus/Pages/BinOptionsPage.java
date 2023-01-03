package com.focus.Pages;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import com.focus.Pages.LoginPage;
import com.focus.base.BaseEngine;
import com.focus.supporters.ExcelReader;
import com.focus.utilities.POJOUtility;

public class BinOptionsPage extends BaseEngine 
{

	
	
	@FindBy(xpath="//*[@id='2033']/span")
	private static WebElement  invTransStocksMenu; 
	
	@FindBy(xpath="//a[@id='2049']//span[contains(text(),'Opening Stocks New')]")
	private static WebElement  openingStocksNewVoucher;
	
	@FindBy(xpath="//div[@id='dv_TranHomeHeading']//span[@id='dv_sVoucherName']")
	private static WebElement  openingStocksLabel;
	
	@FindBy(xpath="//div[@id='dv_TranHomeHeading']//span[@id='dv_sVoucherName']")
	private static WebElement  stocksTransferLabel;
	
	
	@FindBy(xpath="//span[@class='icon-printbarcode icon-font6']")
	private static WebElement  printBarCodeBtn;
	
	@FindBy(xpath="//div[@id='dvHomeTransClose']//span[@class='icon-close icon-font6']")  
	private static WebElement  homeCloseBtn;
			
	
	@FindBy(xpath="//input[@id='id_body_536870916']")
	private static WebElement  pvWareHouseTxt;
	
	@FindBy(xpath="//input[@id='id_header_268435460']")
	private static WebElement  wareHouseTxt;
	
	
	@FindBy(xpath="//*[@id='id_header_87']")
	private static WebElement  stockTransferWareHouse2InHeaderTxt;
	           
	
	
	@FindBy(xpath="//*[@id='id_transactionentry_printbarcode']")
	private static WebElement  printBarCodeOption;
	
  
	@FindBy(xpath="//span[contains(text(),'Inventory Options')]")
	private static WebElement  inventoryTab;
	
	
	@FindBy(xpath="//input[@id='inventoryOpt_chkStocktransferInput']")
	private static WebElement  warehouse2HeaderChkBox;
	
	
	
	@FindBy(xpath="//div[@id='myNavbar']//span[@class='icon-new icon-font6']")
	private static WebElement  newBtn;
	
	@FindBy(xpath="//div[@id='id_transaction_homescreen_edit']//span[@class='icon-edit icon-font6 ImagesinArabic']")
	private static WebElement  editBtn;
	
	
	@FindBy(xpath="//span[@class='icon-print icon-font6']")
	private static WebElement  printBtn;
	
	
	@FindBy(xpath="//div[@id='id_transaction_homescreen_Delete']//span[@class='icon-delete icon-font6']")
	private static WebElement  deleteBtn;
	
	
	@FindBy(xpath="//span[@class='icon-authorize icon-font6']")
	private static WebElement  authorizeBtn;
	
	
	@FindBy(xpath="//span[@class='icon-suspend icon-font6']")
	private static WebElement  suspendBtn;
	
	
	@FindBy(xpath="//span[@class='icon-reject2 icon-font6']")
	private static WebElement  rejectBtn;
	
	
	@FindBy(xpath="//span[@class='icon-cheque icon-font6']")
	private static WebElement  chequeReturnBtn;
	
	@FindBy(xpath="//span[@class='icon-printbarcode icon-font6']")
	private static WebElement  printBarcodeBtn;
	
	@FindBy(xpath="//span[@class='icon-convert icon-font6']")
	private static WebElement  convertBtn;
	
	@FindBy(xpath="//span[@class='icon-export icon-font6']")
	private static WebElement  exportToXMLBtn;  
		
	
	@FindBy(xpath="//div[@id='myNavbar']//span[@class='icon-settings icon-font6']")
	private static WebElement  settingsBtn;
	
	@FindBy(xpath="//div[@id='dvHomeTransClose']")  
	private static WebElement  voucherhomeCloseBtn;
			
	// Header Section Completed
	
	
	//Main Section
	
	@FindBy(xpath="//a[@class='transaction_viewname_anchor theme_color-inverse font-5']")
	private static WebElement  allVouchersOption;
	
	@FindBy(xpath="//a[@class='transaction_viewname_anchor font-5']")
	private static WebElement  pendingBillsOption;
	
	@FindBy(xpath="//input[@id='SelectDefaultView']")
	private static WebElement  selectDefaultViewChkBox;
	
	
	@FindBy(xpath="//span[@class='icon-sorting icon-font6 toolbar_button_image theme_button_color dropdown-toggle']")
	private static WebElement  sortingBtn;
	
	
   @FindBy(xpath="//div[@id='btnCreateView']//span[@class='icon-new icon-font6']")
   private static WebElement  createViewBtn;

   @FindBy(xpath="//div[@id='btnCustomize']//span[@class='icon-settings icon-font6']")
   private static WebElement  customizeBtn;
   
   @FindBy(xpath="//span[@class='icon-filter icon-font6']")
   private static WebElement  filterBtn;
   
   @FindBy(xpath="//span[@id='transhomeRefresh']")
   private static WebElement  refreshBtn;
   
   @FindBy(xpath="//i[@class='icon-font6 icon-export']")
   private static WebElement  exportBtn;
   
 
	///// Options Btn  (Display Option)	
   @FindBy(xpath="//span[@id='transOptions']")
   private static WebElement  optionsBtn;
   
   @FindBy(xpath="//a[contains(text(),'Auto Adjust Width')]")
   private static WebElement  autoAdjustWidthBtn;
   
   @FindBy(xpath="//a[contains(text(),'Fit To Screen')]")
   private static WebElement  fitToScreenBtn;
   
   @FindBy(xpath="//a[contains(text(),'Normal')]")
   private static WebElement  normalBtn;
   

	
   // Grid Elements
			

				
	//Grid Header CheckBox
	@FindBy(xpath="//input[@id='HeaderChkBox']")
	private static WebElement  grid_HeaderChkBox;	
	
	
	@FindBy(xpath="//*[@id='tblHeadTransRenderRow']/th[3]")
	private static WebElement  grid_Header_Date;
	
	@FindBy(xpath="//*[@id='tblHeadTransRenderRow']/th[4]")
	private static WebElement  grid_Header_VoucherNumber;
	
	@FindBy(xpath="//*[@id='tblHeadTransRenderRow']/th[5]")
	private static WebElement  grid_Header_CreatedBy;
	
	@FindBy(xpath="//*[@id='tblHeadTransRenderRow']/th[6]")
	private static WebElement  grid_Header_ModifiedBy;
	
	@FindBy(xpath="//*[@id='tblHeadTransRenderRow']/th[7]")
	private static WebElement  grid_Header_CreatedDate;
	
	@FindBy(xpath="//*[@id='tblHeadTransRenderRow']/th[8]")
	private static WebElement  grid_Header_ModifiedDate;
	
	@FindBy(xpath="//*[@id='tblHeadTransRenderRow']/th[9]")
	private static WebElement  grid_Header_CreatedTime;
	
	@FindBy(xpath="//*[@id='tblHeadTransRenderRow']/th[10]")
	private static WebElement  grid_Header_ModifiedTime;
	
	@FindBy(xpath="//*[@id='tblHeadTransRenderRow']/th[11]")
	private static WebElement  grid_Header_Suspended;
	
	@FindBy(xpath="//*[@id='tblHeadTransRenderRow']/th[12]")
	private static WebElement  grid_Header_Cancelled;
	
	@FindBy(xpath="//*[@id='tblHeadTransRenderRow']/th[13]")
	private static WebElement  grid_Header_AuthorizationStatus;
	
	
	
	
	//Grid Voucher DetailsBtn
	@FindBy(xpath="//tr[@id='trRender_1']//i[@class='icon-info icon-font7']")
	private static WebElement  grid_VoucherDetailsBtn1;
	
	@FindBy(xpath="//tr[@id='trRender_2']//i[@class='icon-info icon-font7']")
	private static WebElement  grid_VoucherDetailsBtn2;
	
	
	
	//Grid CheckBox 1 And 2
	@FindBy(xpath="//tr[@id='trRender_1']//td//input")
	private static WebElement  grid_ChkBox1;
	
	@FindBy(xpath="//tr[@id='trRender_2']//td//input")
	private static WebElement  grid_ChkBox2;
				
	////////////////
	
	// Footer Section
	
	@FindBy(xpath="//div[@id='tblFooterReportRender']//input[@id='txtSearch']")
	private static WebElement  searchField;
							
	@FindBy(xpath="//button[@id='frstPage']")
	private static WebElement  firstPageBtn;

	@FindBy(xpath="//button[@id='id_previousPage']")
	private static WebElement  previousPageBtn;

	@FindBy(xpath="//button[@id='id_pagenumber']")
	private static WebElement  currentPageNo;

	@FindBy(xpath="//button[@id='id_nextPage']")
	private static WebElement  nextPageBtn;

	@FindBy(xpath="//button[@id='lstPage']")
	private static WebElement  lastPageBtn;
	
	
	////////////////
	
	//New Screen Elements
	
	

	// Vouchers_New Header Section
	
	@FindBy(xpath="//span[@class='icon-scroll icon-font6']")
	private static WebElement  freeFlowBtn;
	
	@FindBy(xpath="//span[@class='icon-header icon-font6']")
	private static WebElement  jumpToHeaderSectionBtn;
	
	@FindBy(xpath="//span[@class='icon-panel icon-font6']")
	private static WebElement  jumpToBodySectionBtn;
	
	@FindBy(xpath="//span[@class='icon-footer icon-font6']")
	private static WebElement  jumpToFooterBtn;
	
	@FindBy(xpath="//*[@id='id_transactionentry_new']")
	private static WebElement  new_newBtn;
	
	@FindBy(xpath="//*[@id='id_transactionentry_save']")
	private static WebElement  saveBtn;
	
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
	
	
	
	@FindBy(xpath="//span[@class='icon-menu icon-font4']")
	private static WebElement  toggleBtn;
	
	@FindBy(xpath="//*[@id='id_transactionentry_copydocument']")
	private static WebElement  copyDocumentOption;
	
	@FindBy(xpath="//*[@id='id_transactionentry_copytoclipboard']")
	private static WebElement  copyToClipBoardOption;
	
	@FindBy(xpath="//*[@id='id_transactionentry_pastefromclipboard']")
	private static WebElement  pasteFromClipBoardOption;
	
	@FindBy(xpath="//*[@id='id_transactionentry_raisechequereturn']")
	private static WebElement  raiseCheckReturnOption;
	
	@FindBy(xpath="//*[@id='id_transactionentry_addtostock']")
	private static WebElement  addToStockOption;
	
	@FindBy(xpath="//*[@id='id_transactionentry_markconvert']")
	private static WebElement  markConvertedOption;
	
	@FindBy(xpath="//*[@id='id_transactionentry_bominput']")
	private static WebElement  bomInputOption;
	
	@FindBy(xpath="//*[@id='id_transactionentry_autoallocate']")
	private static WebElement  autoAllocateOption;
	
	@FindBy(xpath="//*[@id='id_transactionentry_reverseentry']")
	private static WebElement  reverseEntryOption;
	
	@FindBy(xpath="//*[@id='id_transactionentry_printbarcode']")
	private static WebElement  printBarcodeOption;
	
	@FindBy(xpath="//*[@id='id_transactionentry_postingdetails']")
	private static WebElement  postingDetailsOption;
	
	@FindBy(xpath="//*[@id='id_transactionentry_exporttoxml']")
	private static WebElement  exportToXMLOption;
	
	@FindBy(xpath="//*[@id='id_transactionentry_settings']")
	private static WebElement  settingsOption;
	
	
	////// Header Section Completed
	
	// Main Section
	@FindBy(xpath="//input[@id='id_header_1']")
	private static WebElement  documentNumberTxt;
	
	
	
	@FindBy(xpath="//*[@id='id_header_1_input_image']/span")
	private static WebElement  documentNumberDropdown_ExpansionBtn;
	
	@FindBy(xpath="//input[@id='id_header_2']")
	private static WebElement  dateTxt;
	
	@FindBy(xpath="//td[@id='id_header_2_input_image']//span[@class='icon-calender theme_color-inverse datecontrol_arrow_margin datecontrol_arrow']")
	private static WebElement  dateTxt_CalenderBtn;
	
	@FindBy(xpath="//tr[@id='id_header_2_day_today']//span[@class='theme_color-inverse'][contains(text(),'Today')]")
	private static WebElement  calender_TodayBtn;
	
	
	@FindBy(xpath="//input[@id='id_header_4']")
	private static WebElement  cashBankAccountTxt;
	
	@FindBy(xpath="//*[@id='id_header_4_input_image']/span")
	private static WebElement  cashBankAccount_ExpansionBtn;
	
	@FindBy(xpath="//*[@id='id_header_4_input_settings']/span")
	private static WebElement  cashBankAccount_SettingsBtn;
	
				@FindBy(xpath="//div[@id='id_header_4_customize_popup_container']")
				private static WebElement  cashBankAccount_Settings_Container;
										
				@FindBy(xpath="//div[@id='id_header_4_customize_popup_footer']//input[1]")
				private static WebElement  cashBankAccount_Settings_StandardFieldsBtn;
										
							@FindBy(xpath="//select[@id='id_header_4_customize_popup_standardfields_list']")
							private static WebElement  cashBankAccount_Settings_StandardFieldsBtn_Fielddropdown;
																
							@FindBy(xpath="//input[@id='id_header_4_customize_popup_standardfields_header']")
							private static WebElement  cashBankAccount_Settings_StandardFieldsBtn_HeaderTxt;
															
							@FindBy(xpath="//select[@id='id_header_4_customize_popup_standardfields_alignment']")
							private static WebElement  cashBankAccount_Settings_StandardFieldsBtn_Alignmentdropdown;
																
							@FindBy(xpath="//input[@id='id_header_4_customize_popup_standardfields_width']")
							private static WebElement  cashBankAccount_Settings_StandardFieldsBtn_WidthTxt;
																
							@FindBy(xpath="//div[@class='panel']//input[3]")
							private static WebElement  cashBankAccount_Settings_StandardFieldsBtn_OkBtn;
																
							@FindBy(xpath="//div[@class='panel']//input[4]")
							private static WebElement  cashBankAccount_Settings_StandardFieldsBtn_CancelBtn;
										
										
				@FindBy(xpath="//div[@id='id_header_4_search_container']//input[2]")
				private static WebElement  cashBankAccount_Settings_DeleteColumnBtn;
										
				@FindBy(xpath="//div[@class='panel']//input[3]")
				private static WebElement  cashBankAccount_Settings_OkBtn;
								
				@FindBy(xpath="//div[@class='panel']//input[4]")
				private static WebElement  cashBankAccount_Settings_CancelBtn;
					
	@FindBy(xpath="//input[@id='id_header_268435459']")
	private static WebElement  departmentTxt;
	
	@FindBy(xpath="//*[@id='id_header_268435459_input_image']/span")
	private static WebElement  department_ExpansionBtn;
	
	@FindBy(xpath="//*[@id='id_header_268435459_input_settings']/span")
	private static WebElement  department_SettingsBtn;
	
				@FindBy(xpath="//div[@id='id_header_268435459_customize_popup_container']")
				private static WebElement  department_Settings_Container;
										
				@FindBy(xpath="//div[@id='id_header_268435459_customize_popup_footer']//input[1]")
				private static WebElement  department_Settings_StandardFieldsBtn;
										
							@FindBy(xpath="//select[@id='id_header_268435459_customize_popup_standardfields_list']")
							private static WebElement  department_Settings_StandardFieldsBtn_Fielddropdown;
																
							@FindBy(xpath="//input[@id='id_header_268435459_customize_popup_standardfields_header']")
							private static WebElement  department_Settings_StandardFieldsBtn_HeaderTxt;
															
							@FindBy(xpath="//select[@id='id_header_268435459_customize_popup_standardfields_alignment']")
							private static WebElement  department_Settings_StandardFieldsBtn_Alignmentdropdown;
																
							@FindBy(xpath="//input[@id='id_header_268435459_customize_popup_standardfields_width']")
							private static WebElement  department_Settings_StandardFieldsBtn_WidthTxt;
																
							@FindBy(xpath="//div[@class='panel']//input[3]")
							private static WebElement  department_Settings_StandardFieldsBtn_OkBtn;
																
							@FindBy(xpath="//div[@class='panel']//input[4]")
							private static WebElement  department_Settings_StandardFieldsBtn_CancelBtn;
										
										
				@FindBy(xpath="//div[@id='id_header_268435459_search_container']//input[2]")
				private static WebElement  department_Settings_DeleteColumnBtn;
										
				@FindBy(xpath="//div[@class='panel']//input[3]")
				private static WebElement  department_Settings_OkBtn;
								
				@FindBy(xpath="//div[@class='panel']//input[4]")
				private static WebElement  department_Settings_CancelBtn;
	
	@FindBy(xpath="//*[@id='id_header_6']")
	private static WebElement  maturityDateTxt;
	
	@FindBy(xpath="//*[@id='id_header_6_input_image']/span']")
	private static WebElement  maturityDateTxt_CalenderBtn;
	
	@FindBy(xpath="//input[@id='id_header_3']")
	private static WebElement  purchaseAccountTxt;
	
	@FindBy(xpath="//*[@id='id_header_3_input_image']/span")
	private static WebElement  purchaseAccount_ExpansionBtn;
	
	@FindBy(xpath="//*[@id='id_header_3_input_settings']/span")
	private static WebElement  purchaseAccount_SettingsBtn;
	
				@FindBy(xpath="//div[@id='id_header_3_customize_popup_container']")
				private static WebElement  purchaseAccount_Settings_Container;
										
				@FindBy(xpath="//div[@id='id_header_3_customize_popup_footer']//input[1]")
				private static WebElement  purchaseAccount_Settings_StandardFieldsBtn;
										
							@FindBy(xpath="//select[@id='id_header_3_customize_popup_standardfields_list']")
							private static WebElement  purchaseAccount_Settings_StandardFieldsBtn_Fielddropdown;
																
							@FindBy(xpath="//input[@id='id_header_3_customize_popup_standardfields_header']")
							private static WebElement  purchaseAccount_Settings_StandardFieldsBtn_HeaderTxt;
															
							@FindBy(xpath="//select[@id='id_header_3_customize_popup_standardfields_alignment']")
							private static WebElement  purchaseAccount_Settings_StandardFieldsBtn_Alignmentdropdown;
																
							@FindBy(xpath="//input[@id='id_header_3_customize_popup_standardfields_width']")
							private static WebElement  purchaseAccount_Settings_StandardFieldsBtn_WidthTxt;
																
							@FindBy(xpath="//div[@class='panel']//input[3]")
							private static WebElement  purchaseAccount_Settings_StandardFieldsBtn_OkBtn;
																
							@FindBy(xpath="//div[@class='panel']//input[4]")
							private static WebElement  purchaseAccount_Settings_StandardFieldsBtn_CancelBtn;
										
										
				@FindBy(xpath="//div[@id='id_header_3_search_container']//input[2]")
				private static WebElement  purchaseAccount_Settings_DeleteColumnBtn;
										
				@FindBy(xpath="//div[@class='panel']//input[3]")
				private static WebElement  purchaseAccount_Settings_OkBtn;
								
				@FindBy(xpath="//div[@class='panel']//input[4]")
				private static WebElement  purchaseAccount_Settings_CancelBtn;
	
	
	@FindBy(xpath="//input[@id='id_header_4']")
	private static WebElement  vendorAccountTxt;
	
	@FindBy(xpath="//*[@id='id_header_4_input_image']/span")
	private static WebElement  vendorAccount_ExpansionBtn;
	
	@FindBy(xpath="//*[@id='id_header_4_input_settings']/span")
	private static WebElement  vendorAccount_SettingsBtn;
	
				@FindBy(xpath="//div[@id='id_header_4_customize_popup_container']")
				private static WebElement  vendorAccount_Settings_Container;
										
				@FindBy(xpath="//div[@id='id_header_4_customize_popup_footer']//input[1]")
				private static WebElement  vendorAccount_Settings_StandardFieldsBtn;
										
							@FindBy(xpath="//select[@id='id_header_4_customize_popup_standardfields_list']")
							private static WebElement  vendorAccount_Settings_StandardFieldsBtn_Fielddropdown;
																
							@FindBy(xpath="//input[@id='id_header_4_customize_popup_standardfields_header']")
							private static WebElement  vendorAccount_Settings_StandardFieldsBtn_HeaderTxt;
															
							@FindBy(xpath="//select[@id='id_header_4_customize_popup_standardfields_alignment']")
							private static WebElement  vendorAccount_Settings_StandardFieldsBtn_AlignmentDropdown;
																
							@FindBy(xpath="//input[@id='id_header_4_customize_popup_standardfields_width']")
							private static WebElement  vendorAccount_Settings_StandardFieldsBtn_WidthTxt;
																
							@FindBy(xpath="//div[@class='panel']//input[3]")
							private static WebElement  vendorAccount_Settings_StandardFieldsBtn_OkBtn;
																
							@FindBy(xpath="//div[@class='panel']//input[4]")
							private static WebElement  vendorAccount_Settings_StandardFieldsBtn_CancelBtn;
										
										
				@FindBy(xpath="//div[@id='id_header_4_search_container']//input[2]")
				private static WebElement  vendorAccount_Settings_DeleteColumnBtn;
										
				@FindBy(xpath="//div[@class='panel']//input[3]")
				private static WebElement  vendorAccount_Settings_OkBtn;
								
				@FindBy(xpath="//div[@class='panel']//input[4]")
				private static WebElement  vendorAccount_Settings_CancelBtn;
	
	@FindBy(xpath="//input[@id='id_header_3']")
	private static WebElement  salesAccountTxt;
	
	@FindBy(xpath="//*[@id='id_header_3_input_image']/span")
	private static WebElement  salesAccount_ExpansionBtn;
	
	@FindBy(xpath="//*[@id='id_header_3_input_settings']/span")
	private static WebElement  salesAccount_SettingsBtn;
	
				@FindBy(xpath="//div[@id='id_header_3_customize_popup_container']")
				private static WebElement  salesAccount_Settings_Container;
										
				@FindBy(xpath="//div[@id='id_header_3_customize_popup_footer']//input[1]")
				private static WebElement  salesAccount_Settings_StandardFieldsBtn;
										
							@FindBy(xpath="//select[@id='id_header_3_customize_popup_standardfields_list']")
							private static WebElement  salesAccount_Settings_StandardFieldsBtn_Fielddropdown;
																
							@FindBy(xpath="//input[@id='id_header_3_customize_popup_standardfields_header']")
							private static WebElement  salesAccount_Settings_StandardFieldsBtn_HeaderTxt;
															
							@FindBy(xpath="//select[@id='id_header_3_customize_popup_standardfields_alignment']")
							private static WebElement  salesAccount_Settings_StandardFieldsBtn_Alignmentdropdown;
																
							@FindBy(xpath="//input[@id='id_header_3_customize_popup_standardfields_width']")
							private static WebElement  salesAccount_Settings_StandardFieldsBtn_WidthTxt;
																
							@FindBy(xpath="//div[@class='panel']//input[3]")
							private static WebElement  salesAccount_Settings_StandardFieldsBtn_OkBtn;
																
							@FindBy(xpath="//div[@class='panel']//input[4]")
							private static WebElement  salesAccount_Settings_StandardFieldsBtn_CancelBtn;
										
										
				@FindBy(xpath="//div[@id='id_header_3_search_container']//input[2]")
				private static WebElement  salesAccount_Settings_DeleteColumnBtn;
										
				@FindBy(xpath="//div[@class='panel']//input[3]")
				private static WebElement  salesAccount_Settings_OkBtn;
								
				@FindBy(xpath="//div[@class='panel']//input[4]")
				private static WebElement  salesAccount_Settings_CancelBtn;
	
	@FindBy(xpath="//input[@id='id_header_4']")
	private static WebElement  customerAccountTxt;
	
	@FindBy(xpath="//*[@id='id_header_4_input_image']/span")
	private static WebElement  customerAccount_ExpansionBtn;
	
	@FindBy(xpath="//*[@id='id_header_4_input_settings']/span")
	private static WebElement  customerAccount_SettingsBtn;
	
				@FindBy(xpath="//div[@id='id_header_4_customize_popup_container']")
				private static WebElement  customerAccount_Settings_Container;
										
				@FindBy(xpath="//div[@id='id_header_4_customize_popup_footer']//input[1]")
				private static WebElement  customerAccount_Settings_StandardFieldsBtn;
										
							@FindBy(xpath="//select[@id='id_header_4_customize_popup_standardfields_list']")
							private static WebElement  customerAccount_Settings_StandardFieldsBtn_FieldDrpdwn;
																
							@FindBy(xpath="//input[@id='id_header_4_customize_popup_standardfields_header']")
							private static WebElement  customerAccount_Settings_StandardFieldsBtn_HeaderTxt;
															
							@FindBy(xpath="//select[@id='id_header_4_customize_popup_standardfields_alignment']")
							private static WebElement  customerAccount_Settings_StandardFieldsBtn_AlignmentDrpdwn;
																
							@FindBy(xpath="//input[@id='id_header_4_customize_popup_standardfields_width']")
							private static WebElement  customerAccount_Settings_StandardFieldsBtn_WidthTxt;
																
							@FindBy(xpath="//div[@class='panel']//input[3]")
							private static WebElement  customerAccount_Settings_StandardFieldsBtn_OkBtn;
																
							@FindBy(xpath="//div[@class='panel']//input[4]")
							private static WebElement  customerAccount_Settings_StandardFieldsBtn_CancelBtn;
										
										
				@FindBy(xpath="//div[@id='id_header_4_search_container']//input[2]")
				private static WebElement  customerAccount_Settings_DeleteColumnBtn;
										
				@FindBy(xpath="//div[@class='panel']//input[3]")
				private static WebElement  customerAccount_Settings_OkBtn;
								
				@FindBy(xpath="//div[@class='panel']//input[4]")
				private static WebElement  customerAccount_Settings_CancelBtn;
	
	@FindBy(xpath="//input[@id='id_header_12']")
	private static WebElement  accountTxt;
	
	@FindBy(xpath="//*[@id='id_header_12_input_image']/span")
	private static WebElement  account_ExpansionBtn;
	
	@FindBy(xpath="//*[@id='id_header_4_input_settings']/span")
	private static WebElement  account_SettingsBtn;
	
				@FindBy(xpath="//div[@id='id_header_4_customize_popup_container']")
				private static WebElement  account_Settings_Container;
										
				@FindBy(xpath="//div[@id='id_header_4_customize_popup_footer']//input[1]")
				private static WebElement  account_Settings_StandardFieldsBtn;
										
							@FindBy(xpath="//select[@id='id_header_4_customize_popup_standardfields_list']")
							private static WebElement  account_Settings_StandardFieldsBtn_FieldDrpdwn;
																
							@FindBy(xpath="//input[@id='id_header_4_customize_popup_standardfields_header']")
							private static WebElement  account_Settings_StandardFieldsBtn_HeaderTxt;
															
							@FindBy(xpath="//select[@id='id_header_4_customize_popup_standardfields_alignment']")
							private static WebElement  account_Settings_StandardFieldsBtn_Alignmentdrpdwn;
																
							@FindBy(xpath="//input[@id='id_header_4_customize_popup_standardfields_width']")
							private static WebElement  account_Settings_StandardFieldsBtn_WidthTxt;
																
							@FindBy(xpath="//div[@class='panel']//input[3]")
							private static WebElement  account_Settings_StandardFieldsBtn_OkBtn;
																
							@FindBy(xpath="//div[@class='panel']//input[4]")
							private static WebElement  account_Settings_StandardFieldsBtn_CancelBtn;
										
										
				@FindBy(xpath="//div[@id='id_header_4_search_container']//input[2]")
				private static WebElement  account_Settings_DeleteColumnBtn;
										
				@FindBy(xpath="//div[@class='panel']//input[3]")
				private static WebElement  account_Settings_OkBtn;
								
				@FindBy(xpath="//div[@class='panel']//input[4]")
				private static WebElement  account_Settings_CancelBtn;
	
	@FindBy(xpath="//input[@id='id_header_31']")
	private static WebElement  issuesReceiptsTxt;
	
	@FindBy(xpath="//input[@id='id_header_268435460']")
	private static WebElement  warehouseTxt;
	
	@FindBy(xpath="//*[@id='id_header_268435460_input_image']/span")
	private static WebElement  warehouse_ExpansionBtn;
	
	@FindBy(xpath="//*[@id='id_header_268435460_input_settings']/span")
	private static WebElement  warehouse_SettingsBtn;
	
				@FindBy(xpath="//div[@id='id_header_268435460_customize_popup_container']")
				private static WebElement  warehouse_Settings_Container;
										
				@FindBy(xpath="//div[@id='id_header_268435460_customize_popup_footer']//input[1]")
				private static WebElement  warehouse_Settings_StandardFieldsBtn;
										
							@FindBy(xpath="//select[@id='id_header_268435460_customize_popup_standardfields_list']")
							private static WebElement  warehouse_Settings_StandardFieldsBtn_Fielddropdown;
																
							@FindBy(xpath="//input[@id='id_header_268435460_customize_popup_standardfields_header']")
							private static WebElement  warehouse_Settings_StandardFieldsBtn_HeaderTxt;
															
							@FindBy(xpath="//select[@id='id_header_268435460_customize_popup_standardfields_alignment']")
							private static WebElement  warehouse_Settings_StandardFieldsBtn_Alignmentdropdown;
																
							@FindBy(xpath="//input[@id='id_header_268435460_customize_popup_standardfields_width']")
							private static WebElement  warehouse_Settings_StandardFieldsBtn_WidthTxt;
																
							@FindBy(xpath="//div[@class='panel']//input[3]")
							private static WebElement  warehouse_Settings_StandardFieldsBtn_OkBtn;
																
							@FindBy(xpath="//div[@class='panel']//input[4]")
							private static WebElement  warehouse_Settings_StandardFieldsBtn_CancelBtn;
										
				@FindBy(xpath="//div[@id='id_header_268435460_search_container']//input[2]")
				private static WebElement  warehouse_Settings_DeleteColumnBtn;
										
				@FindBy(xpath="//div[@class='panel']//input[3]")
				private static WebElement  warehouse_Settings_OkBtn;
								
				@FindBy(xpath="//div[@class='panel']//input[4]")
				private static WebElement  warehouse_Settings_CancelBtn;
	
	@FindBy(xpath="//span[contains(text(),'sName')]")
	private static WebElement  customize_sName;
	
	@FindBy(xpath="//span[@class='vcenter'][contains(text(),'Code')]")
	private static WebElement  customize_sCode;
	
	@FindBy(xpath="//span[contains(text(),'Alias')]")
	private static WebElement  customize_Alias;
	
	@FindBy(xpath="//span[@class='vcenter'][contains(text(),'Group')]")
	private static WebElement  customize_bGroup;
	
	@FindBy(xpath="//span[contains(@class,'vcenter')][contains(text(),'Balance')]")
	private static WebElement  customize_Balance;
	
	@FindBy(xpath="//input[@id='id_header_67108920']")
	private static WebElement  appropriateBasedOnDrpdwn;
	
	@FindBy(xpath="//input[@id='id_header_67108921']")
	private static WebElement  additionalValueTxt;
	
	@FindBy(xpath="//input[@id='id_header_21']")
	private static WebElement  raiseReceiptsChkBox;
	
	@FindBy(xpath="//input[@id='id_header_67108865']")
	private static WebElement  receipts_NarrationTxt;
	
	@FindBy(xpath="//input[@id='id_header_67108868']")
	private static WebElement  payments_NarrationTxt;
	
	@FindBy(xpath="//input[@id='id_header_67108871']")
	private static WebElement  pettyCash_NarrationTxt;
	
	@FindBy(xpath="//input[@id='id_header_67108874']")
	private static WebElement  postDatedReceipts_NarrationTxt;
	
	@FindBy(xpath="//input[@id='id_header_67108865']")
	private static WebElement  postDatedPayments_NarrationTxt;
	
	@FindBy(xpath="//input[@id='id_header_67108880']")
	private static WebElement  purchaseVouchers_NarrationTxt;
	
	@FindBy(xpath="//input[@id='id_header_67108881']")
	private static WebElement  purchaseReturns_NarrationTxt;
	
	@FindBy(xpath="//input[@id='id_header_67108884']")
	private static WebElement  salesInvoice_NarrationTxt;
	
	@FindBy(xpath="//input[@id='id_header_67108885']")
	private static WebElement  salesReturns_NarrationTxt;
	
	@FindBy(xpath="//input[@id='id_header_67108913']")
	private static WebElement  cashSales_NarrationTxt;
	
	@FindBy(xpath="//input[@id='id_header_67108914']")
	private static WebElement  hirePurchaseSales_NarrationTxt;
	
	@FindBy(xpath="//input[@id='id_header_67108890']")
	private static WebElement  journalEntries_NarrationTxt;
	
	@FindBy(xpath="//input[@id='id_header_67108916']")
	private static WebElement  forexJV_NarrationTxt;
	
	@FindBy(xpath="//input[@id='id_header_67108910']")
	private static WebElement  interDepartmentalJV_NarrationTxt;
	
	@FindBy(xpath="//input[@id='id_header_67108888']")
	private static WebElement  nonStandardJournalEntries_NarrationTxt;
	
	@FindBy(xpath="//input[@id='id_header_67108892']")
	private static WebElement  debitNotes_NarrationTxt;
	
	@FindBy(xpath="//input[@id='id_header_67108911']")
	private static WebElement  debitNotesLineWise_NarrationTxt;
	
	@FindBy(xpath="//input[@id='id_header_67108893']")
	private static WebElement  creditNotes_NarrationTxt;
	
	@FindBy(xpath="//input[@id='id_header_67108912']")
	private static WebElement  creditNotesLineWisePayroll_NarrationTxt;
	
	@FindBy(xpath="//input[@id='id_header_67108894']")
	private static WebElement  openingBalance_NarrationTxt;
	
	@FindBy(xpath="//input[@id='id_header_67108891']")
	private static WebElement  fixedAssetDepreciationVoucher_NarrationTxt;
	
	@FindBy(xpath="//input[@id='id_header_67108909']")
	private static WebElement  requestForQuote_NarrationTxt;
	
	@FindBy(xpath="//input[@id='id_header_67108903']")
	private static WebElement  purchasesQuotations_NarrationTxt;
	
	@FindBy(xpath="//input[@id='id_header_67108882']")
	private static WebElement  purchasesOrders_NarrationTxt;
	
	@FindBy(xpath="//input[@id='id_header_67108882']")
	private static WebElement  materialReceiptsNotes_NarrationTxt;

	@FindBy(xpath="//input[@id='id_header_67108904']")
	private static WebElement  salesQuotations_NarrationTxt;

	@FindBy(xpath="//input[@id='id_header_67108887']")
	private static WebElement  deliveryNotes_NarrationTxt;

	@FindBy(xpath="//input[@id='id_header_67108917']")
	private static WebElement  posSales_NarrationTxt;

	@FindBy(xpath="//input[@id='id_header_67108918']")
	private static WebElement  productionOrder_NarrationTxt;

	@FindBy(xpath="//input[@id='id_header_67108886']")
	private static WebElement  salesOrders_NarrationTxt;

	@FindBy(xpath="//input[@id='id_header_67108895']")
	private static WebElement  shortageInStock_NarrationTxt;

	@FindBy(xpath="//input[@id='id_header_67108896']")
	private static WebElement  excessesInStock_NarrationTxt;

	@FindBy(xpath="//input[@id='id_header_67108897']")
	private static WebElement  stockTransfers_NarrationTxt;

	@FindBy(xpath="//input[@id='id_header_67108898']")
	private static WebElement  openingStocks_NarrationTxt;
	
	@FindBy(xpath="//input[@id='id_header_67108923']")
	private static WebElement  openingStocksNEW_NarrationTxt;

	@FindBy(xpath="//input[@id='id_header_67108908']")
	private static WebElement  materialRequisition_NarrationTxt;

	@FindBy(xpath="//input[@id='id_header_67108866']")
	private static WebElement  receipts_ChequeNoTxt;
	
	@FindBy(xpath="//input[@id='id_header_67108869']")
	private static WebElement  payments_ChequeNoTxt;
	
	@FindBy(xpath="//input[@id='id_header_67108872']")
	private static WebElement  pettyCash_ChequeNoTxt;
	
	@FindBy(xpath="//input[@id='id_header_67108875']")
	private static WebElement  postDatedReceipts_ChequeNoTxt;
	
	@FindBy(xpath="//input[@id='id_header_67108878']")
	private static WebElement  postDatedPayments_ChequeNoTxt;

	
	
	@FindBy(xpath="//input[@id='id_body_536870916']")
	private static WebElement  pvWarehouseTxt;
	
	@FindBy(xpath="//td[@id='id_body_536870916_input_image']//span[@class='icon-down-arrow optioncontrol_arrow_margin']")
	private static WebElement  pvWarehouse_ExpansionBtn;
	
	@FindBy(xpath="//td[@id='id_body_536870916_input_settings']//span[@class='icon-settings optioncontrol_settings_margin']")
	private static WebElement  pvWarehouse_SettingsBtn;
	
				@FindBy(xpath="//div[@id='id_body_536870916_customize_popup_container']")
				private static WebElement  pvWarehouse_Settings_Container;
										
				@FindBy(xpath="//div[@id='id_body_536870916_customize_popup_footer']//input[1]")
				private static WebElement  pvWarehouse_Settings_StandardFieldsBtn;
										
							@FindBy(xpath="//select[@id='id_body_536870916_customize_popup_standardfields_list']")
							private static WebElement  pvWarehouse_Settings_StandardFieldsBtn_Fielddropdown;
																
							@FindBy(xpath="//input[@id='id_body_536870916_customize_popup_standardfields_header']")
							private static WebElement  pvWarehouse_Settings_StandardFieldsBtn_HeaderTxt;
															
							@FindBy(xpath="//select[@id='id_body_536870916_customize_popup_standardfields_alignment']")
							private static WebElement  pvWarehouse_Settings_StandardFieldsBtn_Alignmentdropdown;
																
							@FindBy(xpath="//input[@id='id_body_536870916_customize_popup_standardfields_width']")
							private static WebElement  pvWarehouse_Settings_StandardFieldsBtn_WidthTxt;
																
							@FindBy(xpath="//div[@class='panel']//input[3]")
							private static WebElement  pvWarehouse_Settings_StandardFieldsBtn_OkBtn;
																
							@FindBy(xpath="//div[@class='panel']//input[4]")
							private static WebElement  pvWarehouse_Settings_StandardFieldsBtn_CancelBtn;
										
				@FindBy(xpath="//div[@id='id_body_536870916_search_container']//input[2]")
				private static WebElement  pvWarehouse_Settings_DeleteColumnBtn;
										
				@FindBy(xpath="//div[@class='panel']//input[3]")
				private static WebElement  pvWarehouse_Settings_OkBtn;
								
				@FindBy(xpath="//div[@class='panel']//input[4]")
				private static WebElement  pvWarehouse_Settings_CancelBtn;
	
	// Grid Elements
	
					
	@FindBy(xpath="//th[@id='id_transaction_entry_detail_table_control_heading_1']")
	private static WebElement  grid_Header_Account;
	
	@FindBy(xpath="//th[@id='id_transaction_entry_detail_table_control_heading_1']")
	private static WebElement  grid_Header_Item;
	
	@FindBy(xpath="//th[@id='id_transaction_entry_detail_table_control_heading_1']")
	private static WebElement  grid_Header_DebitAC;
	
	@FindBy(xpath="//th[@id='id_transaction_entry_detail_table_control_heading_2']")
	private static WebElement  Grid_Header_CreditAC;
	
	//
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[1]")
	private static WebElement  firstRowIndex;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[1]")
	private static WebElement  secondRowIndex;
	
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[1]")
	private static WebElement  thirdRowIndex;
	
	@FindBy(xpath="//span[@class='icon-delete icon-font8']")
	private static WebElement  deleteRowBtn;
	
	@FindBy(xpath="//span[@class='icon-insertrow icon-font8']")
	private static WebElement  insertRowBtn;
	
	@FindBy(xpath="//span[@class='icon-selectall icon-font8']")
	private static WebElement  selectRowBtn;
	
	@FindBy(xpath="//span[@class='icon-unselectall1 icon-font8']")
	private static WebElement  unSelectRowBtn;
	
	@FindBy(xpath="//span[@class='icon-clone icon-font8']")
	private static WebElement  duplicateRowBtn;

	//
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_control_heading_14']")
	private static WebElement  pvEntryPageTableHeader14thCol;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_control_heading_15']")
	private static WebElement  pvEntryPageTableHeader15thCol;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_control_heading_16']")
	private static WebElement  pvEntryPageTableHeader16thCol;
	

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

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[12]")
	private static WebElement  select2ndRow_11thColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[13]")
	private static WebElement  select2ndRow_12thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[11]")
	private static WebElement  select2ndRow_10thColumn;
	
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
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[21]")
	private static WebElement  select2ndRow_20thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[22]")
	private static WebElement  select2ndRow_21thColumn;

	
	
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[2]")
	private static WebElement  select3rdRow_1stColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[3]")
	private static WebElement  select3rdRow_2ndColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[4]")
	private static WebElement  select3rdRow_3rdColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[5]")
	private static WebElement  select3rdRow_4thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[6]")
	private static WebElement  select3rdRow_5thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[7]")
	private static WebElement  select3rdRow_6thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[8]")
	private static WebElement  select3rdRow_7thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[9]")
	private static WebElement  select3rdRow_8thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[10]")
	private static WebElement  select3rdRow_9thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[11]")
	private static WebElement  select3rdRow_10thColumn;

    @FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[12]")
	private static WebElement  select3rdRow_11thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[13]")
	private static WebElement  select3rdRow_12thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[14]")
	private static WebElement  select3rdRow_13thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[15]")
	private static WebElement  select3rdRow_14thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[16]")
	private static WebElement  select3rdRow_15thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[17]")
	private static WebElement  select3rdRow_16thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[18]")
	private static WebElement  select3rdRow_17thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[19]")
	private static WebElement  select3rdRow_18thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[20]")
	private static WebElement  select3rdRow_19thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[21]")
	private static WebElement  select3rdRow_20thColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[22]")
	private static WebElement  select3rdRow_21thColumn;


	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[4]/td[2]")
	private static WebElement  select4thRow_1stColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[4]/td[3]")
	private static WebElement  select4thRow_2ndColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[4]/td[4]")
	private static WebElement  select4thRow_3rdColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[4]/td[5]")
	private static WebElement  select4thRow_4thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[4]/td[6]")
	private static WebElement  select4thRow_5thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[4]/td[7]")
	private static WebElement  select4thRow_6thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[4]/td[8]")
	private static WebElement  select4thRow_7thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[4]/td[9]")
	private static WebElement  select4thRow_8thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[4]/td[10]")
	private static WebElement  select4thRow_9thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[4]/td[11]")
	private static WebElement  select4thRow_10thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[4]/td[12]")
	private static WebElement  select4thRow_11thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[4]/td[13]")
	private static WebElement  select4thRow_12thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[4]/td[14]")
	private static WebElement  select4thRow_13thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[4]/td[15]")
	private static WebElement  select4thRow_14thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[4]/td[16]")
	private static WebElement  select4thRow_15thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[4]/td[17]")
	private static WebElement  select4thRow_16thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[4]/td[18]")
	private static WebElement  select4thRow_17thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[4]/td[19]")
	private static WebElement  select4thRow_18thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[4]/td[20]")
	private static WebElement  select4thRow_19thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[4]/td[21]")
	private static WebElement  select4thRow_20thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[4]/td[22]")
	private static WebElement  select4thRow_21thColumn;



	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[5]/td[2]")
	private static WebElement  select5thRow_1stColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[5]/td[3]")
	private static WebElement  select5thRow_2ndColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[5]/td[4]")
	private static WebElement  select5thRow_3rdColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[5]/td[5]")
	private static WebElement  select5thRow_4thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[5]/td[6]")
	private static WebElement  select5thRow_5thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[5]/td[7]")
	private static WebElement  select5thRow_6thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[5]/td[8]")
	private static WebElement  select5thRow_7thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[5]/td[9]")
	private static WebElement  select5thRow_8thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[5]/td[10]")
	private static WebElement  select5thRow_9thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[5]/td[11]")
	private static WebElement  select5thRow_10thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[5]/td[12]")
	private static WebElement  select5thRow_11thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[5]/td[13]")
	private static WebElement  select5thRow_12thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[5]/td[14]")
	private static WebElement  select5thRow_13thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[5]/td[15]")
	private static WebElement  select5thRow_14thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[5]/td[16]")
	private static WebElement  select5thRow_15thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[5]/td[17]")
	private static WebElement  select5thRow_16thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[5]/td[18]")
	private static WebElement  select5thRow_17thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[5]/td[19]")
	private static WebElement  select5thRow_18thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[5]/td[20]")
	private static WebElement  select5thRow_19thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[5]/td[21]")
	private static WebElement  select5thRow_20thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[5]/td[22]")
	private static WebElement  select5thRow_21thColumn;




	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[6]/td[2]")
	private static WebElement  select6thRow_1stColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[6]/td[3]")
	private static WebElement  select6thRow_2ndColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[6]/td[4]")
	private static WebElement  select6thRow_3rdColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[6]/td[5]")
	private static WebElement  select6thRow_4thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[6]/td[6]")
	private static WebElement  select6thRow_5thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[6]/td[7]")
	private static WebElement  select6thRow_6thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[6]/td[8]")
	private static WebElement  select6thRow_7thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[6]/td[9]")
	private static WebElement  select6thRow_8thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[6]/td[10]")
	private static WebElement  select6thRow_9thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[6]/td[11]")
	private static WebElement  select6thRow_10thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[6]/td[12]")
	private static WebElement  select6thRow_11thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[6]/td[13]")
	private static WebElement  select6thRow_12thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[6]/td[14]")
	private static WebElement  select6thRow_13thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[6]/td[15]")
	private static WebElement  select6thRow_14thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[6]/td[16]")
	private static WebElement  select6thRow_15thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[6]/td[17]")
	private static WebElement  select6thRow_16thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[6]/td[18]")
	private static WebElement  select6thRow_17thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[6]/td[19]")
	private static WebElement  select6thRow_18thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[6]/td[20]")
	private static WebElement  select6thRow_19thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[6]/td[21]")
	private static WebElement  select6thRow_20thColumn;


	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[7]/td[2]")
	private static WebElement  select7thRow_1stColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[7]/td[3]")
	private static WebElement  select7thRow_2ndColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[7]/td[4]")
	private static WebElement  select7thRow_3rdColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[7]/td[5]")
	private static WebElement  select7thRow_4thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[7]/td[6]")
	private static WebElement  select7thRow_5thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[7]/td[7]")
	private static WebElement  select7thRow_6thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[7]/td[8]")
	private static WebElement  select7thRow_7thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[7]/td[9]")
	private static WebElement  select7thRow_8thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[7]/td[10]")
	private static WebElement  select7thRow_9thColumn;



	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[8]/td[2]")
	private static WebElement  select8thRow_1stColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[8]/td[3]")
	private static WebElement  select8thRow_2ndColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[8]/td[4]")
	private static WebElement  select8thRow_3rdColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[8]/td[5]")
	private static WebElement  select8thRow_4thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[8]/td[6]")
	private static WebElement  select8thRow_5thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[8]/td[7]")
	private static WebElement  select8thRow_6thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[8]/td[8]")
	private static WebElement  select8thRow_7thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[8]/td[9]")
	private static WebElement  select8thRow_8thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[8]/td[10]")
	private static WebElement  select8thRow_9thColumn;


	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[9]/td[2]")
	private static WebElement  select9thRow_1stColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[9]/td[3]")
	private static WebElement  select9thRow_2ndColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[9]/td[4]")
	private static WebElement  select9thRow_3rdColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[9]/td[5]")
	private static WebElement  select9thRow_4thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[9]/td[6]")
	private static WebElement  select9thRow_5thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[9]/td[7]")
	private static WebElement  select9thRow_6thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[9]/td[8]")
	private static WebElement  select9thRow_7thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[9]/td[9]")
	private static WebElement  select9thRow_8thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[9]/td[10]")
	private static WebElement  select9thRow_9thColumn;



	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[10]/td[2]")
	private static WebElement  select10thRow_1stColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[10]/td[3]")
	private static WebElement  select10thRow_2ndColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[10]/td[4]")
	private static WebElement  select10thRow_3rdColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[10]/td[5]")
	private static WebElement  select10thRow_4thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[10]/td[6]")
	private static WebElement  select10thRow_5thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[10]/td[7]")
	private static WebElement  select10thRow_6thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[10]/td[8]")
	private static WebElement  select10thRow_7thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[10]/td[9]")
	private static WebElement  select10thRow_8thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[10]/td[10]")
	private static WebElement  select10thRow_9thColumn;


	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[11]/td[2]")
	private static WebElement  select11thRow_1stColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[11]/td[3]")
	private static WebElement  select11thRow_2ndColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[11]/td[4]")
	private static WebElement  select11thRow_3rdColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[11]/td[5]")
	private static WebElement  select11thRow_4thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[11]/td[6]")
	private static WebElement  select11thRow_5thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[11]/td[7]")
	private static WebElement  select11thRow_6thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[11]/td[8]")
	private static WebElement  select11thRow_7thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[11]/td[9]")
	private static WebElement  select11thRow_8thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[11]/td[10]")
	private static WebElement  select11thRow_9thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[12]/td[2]")
	private static WebElement  select12thRow_1stColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[12]/td[3]")
	private static WebElement  select12thRow_2ndColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[12]/td[4]")
	private static WebElement  select12thRow_3rdColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[12]/td[5]")
	private static WebElement  select12thRow_4thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[12]/td[6]")
	private static WebElement  select12thRow_5thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[12]/td[7]")
	private static WebElement  select12thRow_6thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[12]/td[8]")
	private static WebElement  select12thRow_7thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[12]/td[9]")
	private static WebElement  select12thRow_8thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[12]/td[10]")
	private static WebElement  select12thRow_9thColumn;
	
	
	
	
	
	@FindBy(xpath="//input[@id='MasterGroup__101']")
	private static WebElement  subLedgerAccountTxt;
	
	@FindBy(xpath="//span[@class='optioncontrol_arrow_margin icon-down-arrow']")
	private static WebElement  subLedgerAccount_ExpansionBtn;
	
	@FindBy(xpath="//td[@id='MasterGroup__101_input_settings']//span[@class='icon-settings optioncontrol_settings_margin']")
	private static WebElement  subLedgerAccount_SettingsBtn;
	
				@FindBy(xpath="//div[@id='MasterGroup__101_customize_popup_container']")
				private static WebElement  subLedgerAccount_Settings_Container;
										
				@FindBy(xpath="//div[@id='MasterGroup__101_customize_popup_footer']//input[1]")
				private static WebElement  subLedgerAccount_Settings_StandardFieldsBtn;
										
							@FindBy(xpath="//select[@id='MasterGroup__101_customize_popup_standardfields_list']")
							private static WebElement  subLedgerAccount_Settings_StandardFieldsBtn_Fielddropdown;
																
							@FindBy(xpath="//input[@id='MasterGroup__101_customize_popup_standardfields_header']")
							private static WebElement  subLedgerAccount_Settings_StandardFieldsBtn_HeaderTxt;
															
							@FindBy(xpath="//select[@id='MasterGroup__101_customize_popup_standardfields_alignment']")
							private static WebElement  subLedgerAccount_Settings_StandardFieldsBtn_Alignmentdropdown;
																
							@FindBy(xpath="//input[@id='MasterGroup__101_customize_popup_standardfields_width']")
							private static WebElement  subLedgerAccount_Settings_StandardFieldsBtn_WidthTxt;
																
							@FindBy(xpath="//section[@id='reportView']//input[3]")
							private static WebElement  subLedgerAccount_Settings_StandardFieldsBtn_OkBtn;
																
							@FindBy(xpath="//section[@id='reportView']//input[4]")
							private static WebElement  subLedgerAccount_Settings_StandardFieldsBtn_CancelBtn;
										
										
				@FindBy(xpath="//div[@id='MasterGroup__101_search_container']//input[2]")
				private static WebElement  subLedgerAccount_Settings_DeleteColumnBtn;
										
				@FindBy(xpath="//section[@id='reportView']//input[3]")
				private static WebElement  subLedgerAccount_Settings_OkBtn;
								
				@FindBy(xpath="//section[@id='reportView']//input[4]")
				private static WebElement  subLedgerAccount_Settings_CancelBtn;
	
	
	
				@FindBy(xpath="//*[@id='1']/div/div")
				private static WebElement  homeMenu;   

				@FindBy(xpath="//*[@id='25']/span")
				private static WebElement  dataMangementMenu;   
				
				@FindBy(xpath="//*[@id='115']/span")
				private static WebElement  eraseAllMenu;   

				@FindBy(xpath="//*[@id='idEraseTransaction']")
				private static WebElement  EraseAllTansactionChkbox;   

				@FindBy(xpath="//input[@id='idErasedata']")
				private static WebElement  EraseAllDataChkbox;
				
				
				@FindBy(xpath="//*[@id='myNavbar']/ul/li/span[1]/i")
				private static WebElement  EraseAllOKBtn;   

				@FindBy(xpath="//*[@id='myNavbar']/ul/li/span[2]/i")
				private static WebElement  eraseAllCancelBtn;   

				
				@FindBy(xpath="//*[@id='1000']/span")
				private static WebElement  homeMasterMenu;

				@FindBy(xpath="//a[@id='1115']")
				private static WebElement  binsMenu;
				
				
				
				@FindBy(xpath="//*[@id='221']/span")
				private static WebElement  homeMasterItemMenu;

				@FindBy(xpath="//*[@id='1105']/span")
				private static WebElement  homeMasterItem_ItemMenu;

				@FindBy(xpath="//*[@id='1114']/span")
				private static WebElement  ItemUnitsMenu;

				@FindBy(xpath="//*[@id='72']/span")
				private static WebElement  ItemUnitConversionMenu;
			
				@FindBy(xpath="//*[@id='76']/span")
				private static WebElement  ItemSellerPriceBookMenu;

				@FindBy(xpath="//*[@id='80']/span")
				private static WebElement  ItemBuyerPriceBookMenu;

			    @FindBy(xpath="//*[@id='18']/span")
				private static WebElement  ItemBarcodeDefinitionMenu;


			     //Item Master
				
			     @FindBy(xpath="//*[@id='spnHeaderText']")
			     private static WebElement item_ItemLabel;

			     @FindBy(xpath="//*[@id='btnNew']")
			     private static WebElement itemNewBtn;

				     @FindBy(xpath="//*[@id='divBtnGroup0']/div/a")
				     private static WebElement ItemNewnewGeneralBtn;
							     
					     @FindBy(xpath="//input[@id='sName']")
					     private static WebElement newGeneralName;
					     
					     @FindBy(xpath="//input[@id='sCode']")
					     private static WebElement newGeneralCode;
					     
					     @FindBy(xpath="//select[@id='iProductType']")
					     private static WebElement newGeneralItemTypeDropDown;
					     
					     @FindBy(xpath="//input[@id='fReorderLevel']")
					     private static WebElement newGeneralReorderLevel;
					     
					     @FindBy(xpath="//input[@id='iBinCapacity']")
					     private static WebElement newGeneralBinCapacity;
					     
					     @FindBy(xpath="//select[@id='iValuationMethod']")
					     private static WebElement newGeneralValuationMethodDropDown;
					     
					     @FindBy(xpath="//input[@id='iCategory']")
					     private static WebElement newGeneralCategoryDropDown;
					     
					     @FindBy(xpath="//td[@id='iCategory_input_settings']//span[@class='icon-settings optioncontrol_settings_margin']")
					     private static WebElement newGeneralCategorySettingBtn;
					     
					     @FindBy(xpath="//select[@id='iProductMake']")
					     private static WebElement newGeneralItemMakeDropDown;
					     
					     @FindBy(xpath="//input[@id='Printer']")
					     private static WebElement newGeneralPrint;
					     
					     @FindBy(xpath="//input[@id='iAlternateCategory']")
					     private static WebElement newGeneralAlternativeCategoryDropdown;
					     
					     @FindBy(xpath="//td[@id='iAlternateCategory_input_settings']//span[@class='icon-settings optioncontrol_settings_margin']")
					     private static WebElement newGeneralAlternativeCategoryDropdownSettingBtn;
					     
					     @FindBy(xpath="//textarea[@id='sDescription']")
					     private static WebElement newGeneralDescription;
					     
					     @FindBy(xpath="//input[@id='bPerishableItem']")
					     private static WebElement newGeneralPerishableItemCheckBox;
					     
					     @FindBy(xpath="//input[@id='iBin']")
					     private static WebElement newGeneralBinDropdown;
					     
					     @FindBy(xpath="//td[@id='iBin_input_settings']//span[@class='icon-settings optioncontrol_settings_margin']")
					     private static WebElement newGeneralBinDropdownSettingBtn;

					     @FindBy(xpath="//input[@id='pImage']")
					     private static WebElement newGeneralUploadImageOrFileBtn;
					     
					     @FindBy(xpath="//*[@id='btnMasterSaveClick']/i")
					     private static WebElement newGeneralSaveBtn;
					     
					     @FindBy(xpath="//*[@id='GenerateNewMasterModel']/div/div[1]/div[2]/div/ul/li[2]/button[5]")
					     private static WebElement newGeneralCLoseBtn;
					     		     
							     
				   @FindBy(xpath="//*[@id='divBtnGroup1']/div/a")
				   private static WebElement ItemNewUnitsBtn;	     
					     
						 @FindBy(xpath="//input[@id='iDefaultBaseUnit']")
					     private static WebElement itemUnitsDefaultBaseUnitDropdown;
							     
						 @FindBy(xpath="//td[@id='iDefaultBaseUnit_input_settings']//span[@class='icon-settings optioncontrol_settings_margin']")
					     private static WebElement itemUnitsDefaultBaseUnitSetting;
						 
						 @FindBy(xpath="//input[@id='iDefaultSalesUnit']")
					     private static WebElement itemUnitsDefaultSalesUnitDropdown;
							 
						 @FindBy(xpath="//td[@id='iDefaultSalesUnit_input_settings']//span[@class='icon-settings optioncontrol_settings_margin']")
					     private static WebElement itemUnitsDefaultSalesUnitSettingsBtn;
						 
						 @FindBy(xpath="//input[@id='iDefaultPurchaseUnit']")
					     private static WebElement itemUnitsDefaultPurchaseUnitDropDown;
						 
						 @FindBy(xpath="//td[@id='iDefaultPurchaseUnit_input_settings']//span[@class='icon-settings optioncontrol_settings_margin']")
					     private static WebElement itemUnitsDefaultPurchaseUnitSettingsBtn;
						 
						 @FindBy(xpath="//input[@id='fLength']")
					     private static WebElement itemUnitsLength;
						 
						 @FindBy(xpath="//input[@id='fWidth']")
					     private static WebElement itemUnitswidth;
						 
						 @FindBy(xpath="//input[@id='fHeight']")
					     private static WebElement itemUnitsHeight;
						 
						 @FindBy(xpath="//*[@id='fCBM']")
					     private static WebElement itemUnitsCBM;
						 
						 @FindBy(xpath="//input[@id='fWeight']")
					     private static WebElement itemUnitsWeight;
						 
						 @FindBy(xpath="//input[@id='iPalletUnit']")
					     private static WebElement itemUnitsPalletUnitTxt;
						 
						 @FindBy(xpath="//input[@id='fPalletQty']")
					     private static WebElement itemUnitsPalletQtyTxt;
						 
						 @FindBy(xpath="//input[@id='fPalletLength']")
					     private static WebElement itemUnitsPalletLengthTXt;
						 
						 @FindBy(xpath="//input[@id='fPalletWidth']")
					     private static WebElement itemUnitsPalletWidthTxt;
						 
						 @FindBy(xpath="//input[@id='fPalletHeight']")
					     private static WebElement itemUnitsPalletHeightTxt;
							 
						
				     @FindBy(xpath="//*[@id='divBtnGroup2']/div/a")
				     private static WebElement itemNewSettingsBtn;
				     
					     @FindBy(xpath="//*[@id='fStandardCost']")
					     private static WebElement NewSettingsStandardCost;
					     
					     @FindBy(xpath="//*[@id='fOverheadCost']")
					     private static WebElement NewSettingsOverheadCost;
					     	     
					     @FindBy(xpath="//*[@id='fIndirectCost']")
					     private static WebElement NewSettingsIndirectCost;
					     		     
					     @FindBy(xpath="//*[@id='fProfit']")
					     private static WebElement NewSettingsProfit;		     
					     
					     @FindBy(xpath="//*[@id='iDontshowproductexpireddays']")
					     private static WebElement NewSettingsDontshowproductexpireddays;
					     
					     @FindBy(xpath="//*[@id='iTaxCode']")
					     private static WebElement NewSettingsTaxCode;
					     
					     @FindBy(xpath="//*[@id='iTaxCode_input_settings']/span")
					     private static WebElement NewSettingsTaxCodeSttingsBtn;
					     
					     @FindBy(xpath="//*[@id='btnMasterSaveClick']")
					     private static WebElement NewSettingsSaveBtn; 
					     
					     @FindBy(xpath="//*[@id='GenerateNewMasterModel']/div/div[1]/div[2]/div/ul/li[2]/button[5]")
					     private static WebElement NewSettingsCloseBtn;
					    
				    @FindBy(xpath="//*[@id='divBtnGroup3']/div/a")
				    private static WebElement ItemNewClassificationBtn;
				          
					     @FindBy(xpath="//*[@id='iABCCodeValue']")
					     private static WebElement newItemClassificationABC_CodeValueDropdown;
					     
					     @FindBy(xpath="//*[@id='iABCCodeMargin']")
					     private static WebElement newItemClassificationABC_CodeMarginDropdOwn;
					     
					     @FindBy(xpath="//*[@id='iABCCodeRevenue']")
					     private static WebElement newItemClassificationABCCodeRevenueDropdown;
					     
					     @FindBy(xpath="//*[@id='iABCCodeCarryingCost']")
					     private static WebElement newItemClassificationABCCodeCarryingCostDropdown;
					    
					     @FindBy(xpath="//*[@id='sBarcode1']")
					     private static WebElement newItemClassificationBarcode1;
					     
					     @FindBy(xpath="//*[@id='sBarcode2']")
					     private static WebElement newItemClassificationBarcode2;
					     
					     @FindBy(xpath="//*[@id='sBarcode3']")
					     private static WebElement newItemClassificationBarcode3;
					     
					     @FindBy(xpath="//*[@id='iUnit1']")
						 private static WebElement newItemgridFirstrowUnit;
						
						 @FindBy(xpath="//*[@id='sBarcode1']")
						 private static WebElement newItemgridFirstrowBarcode;
						
						 //Grid element
								 
						 @FindBy(xpath="//*[@id='sBatch1']")
						 private static WebElement newItemClassificationgridFirstrowBatch;
						
						 @FindBy(xpath="//*[@id='iUnit2']")
						 private static WebElement newItemClassificationgridSecondrowUnit;
						
						 @FindBy(xpath="//*[@id='sBarcode2']")
						 private static WebElement newItemClassificationgridSecondrowBarcode;
						
						 @FindBy(xpath="//*[@id='sBatch2']")
						 private static WebElement newItemClassificationgridSecondrowBatch;
						
						 @FindBy(xpath="//*[@id='iUnit3']")
						 private static WebElement newItemClassificationgridThridrowUnit;
						
						 @FindBy(xpath="//*[@id='sBarcode3']")
						 private static WebElement newItemClassificationgridThridrowBarcode;
						
						 @FindBy(xpath="//*[@id='sBatch3']")
						 private static WebElement newItemClassificationgridThridrowBatch;
						
						 @FindBy(xpath="//*[@id='iUnit_input_settings']")
						 private static WebElement newItemClassificationgridUnitSettings;
					     
				     @FindBy(xpath="//*[@id='divBtnGroup4']/div/a")
				     private static WebElement ItemNewOtherDetailsBtn;
			     
					     @FindBy(xpath="//input[@id='iCostOfIssueAccount']")
					     private static WebElement newOtherDetailsCostOfIssueitem;
					     
					     @FindBy(xpath="//td[@id='iCostOfIssueAccount_input_settings']//span[@class='icon-settings optioncontrol_settings_margin']")
					     private static WebElement newOtherDetailsCostOfIssueitemsettingsBtn;
					     
					     @FindBy(xpath="//input[@id='iStocksAccount']")
					     private static WebElement newOtherDetailsStocksitem;
					     
					     @FindBy(xpath="//td[@id='iStocksAccount_input_settings']//span[@class='icon-settings optioncontrol_settings_margin']")
					     private static WebElement newOtherDetailsiStocksitemsettingsBtn;
					     
					     @FindBy(xpath="//input[@id='iSalesAccount']")
					     private static WebElement newOtherDetailsSalesAccount;
					     
					     @FindBy(xpath="//td[@id='iSalesAccount_input_settings']//span[@class='icon-settings optioncontrol_settings_margin']")
					     private static WebElement newOtherDetailsSalesitemsettingsBtn;
					     
					     @FindBy(xpath="//input[@id='iWIPAccount']")
					     private static WebElement newOtherDetailsWIPitem;
					     
					     @FindBy(xpath="//td[@id='iWIPAccount_input_settings']//span[contains(@class,'icon-settings optioncontrol_settings_margin')]")
					     private static WebElement newOtherDetailsWIPitemsettingsBtn;
					     
					     @FindBy(xpath="//input[@id='iCostofShortageStockAC']")
					     private static WebElement newOtherDetailsCostofShortageStockAC;
					     
					     @FindBy(xpath="//td[@id='iCostofShortageStockAC_input_settings']//span[contains(@class,'icon-settings optioncontrol_settings_margin')]")
					     private static WebElement newOtherDetailsCostofShortageStockACsettingsBtn;
					     
					     @FindBy(xpath="//input[@id='iCostofExcessStockAC']")
					     private static WebElement newOtherDetailsCostofExcessStockAC;
					     
					     @FindBy(xpath="//td[@id='iCostofExcessStockAC_input_settings']//span[contains(@class,'icon-settings optioncontrol_settings_margin')]")
					     private static WebElement OtherDetailsCostofExcessStockACsettingsBtn;
					    
					     @FindBy(xpath="//input[@id='iCostofSaleReturnAC']")
					     private static WebElement OtherDetailsCostofSaleReturnAC;
					     
					     @FindBy(xpath="//td[@id='iCostofSaleReturnAC_input_settings']//span[contains(@class,'icon-settings optioncontrol_settings_margin')]")
					     private static WebElement OtherDetailsCostofSaleReturnACsettingsBtn;
					     
					     @FindBy(xpath="//input[@id='iPurchaseVarianceAC']")
					     private static WebElement OtherDetailsPurchaseVarianceAC;
					     
					     @FindBy(xpath="//td[@id='iPurchaseVarianceAC_input_settings']//span[contains(@class,'icon-settings optioncontrol_settings_margin')]")
					     private static WebElement OtherDetailsPurchaseVarianceACsettingsBtn;
					     
					     @FindBy(xpath="//*[@id='btnMasterSaveClick']")
					     private static WebElement newOtherDetailsSaveBtn;
					     
					     @FindBy(xpath="//*[@id='GenerateNewMasterModel']/div/div[1]/div[2]/div/ul/li[2]/button[5]")
					     private static WebElement newOtherDetailsCloseBtn;
	
	
	
	//
	
	@FindBy(xpath="//input[@id='id_body_12']")
	private static WebElement  enter_AccountTxt;
	
	@FindBy(xpath="//*[@id='id_body_12_input_image']/span")
	private static WebElement  enter_Account_ExpansionBtn;
	
	@FindBy(xpath="//*[@id='id_body_12_input_settings']/span")
	private static WebElement  enter_Account_SettingsBtn;
	
				@FindBy(xpath="//div[@id='id_header_12_customize_popup_container']")
				private static WebElement  enter_Account_Settings_Container;
										
				@FindBy(xpath="//div[@id='id_header_12_customize_popup_footer']//input[1]")
				private static WebElement  enter_Account_Settings_StandardFieldsBtn;
										
							@FindBy(xpath="//select[@id='id_header_12_customize_popup_standardfields_list']")
							private static WebElement  enter_Account_Settings_StandardFieldsBtn_FieldDrpdwn;
																
							@FindBy(xpath="//input[@id='id_header_12_customize_popup_standardfields_header']")
							private static WebElement  enter_Account_Settings_StandardFieldsBtn_HeaderTxt;
															
							@FindBy(xpath="//select[@id='id_header_12_customize_popup_standardfields_alignment']")
							private static WebElement  enter_Account_Settings_StandardFieldsBtn_AlignmentDrpdwn;
																
							@FindBy(xpath="//input[@id='id_header_12_customize_popup_standardfields_width']")
							private static WebElement  enter_Account_Settings_StandardFieldsBtn_WidthTxt;
																
							@FindBy(xpath="//div[contains(@class,'panel')]//input[3]")
							private static WebElement  enter_Account_Settings_StandardFieldsBtn_OkBtn;
																
							@FindBy(xpath="//div[contains(@class,'panel')]//input[4]")
							private static WebElement  enter_Account_Settings_StandardFieldsBtn_CancelBtn;
										
				@FindBy(xpath="//div[@id='id_header_12_search_container']//input[2]")
				private static WebElement  enter_Account_Settings_DeleteColumnBtn;
										
				@FindBy(xpath="//div[contains(@class,'panel')]//input[3]")
				private static WebElement  enter_Account_Settings_OkBtn;
								
				@FindBy(xpath="//div[contains(@class,'panel')]//input[4]")
				private static WebElement  enter_Account_Settings_CancelBtn;
	
	@FindBy(xpath="//input[@id='id_body_16']")
	private static WebElement  enter_Amount;
	
	@FindBy(xpath="//textarea[@id='id_body_16777219']")
	private static WebElement  enter_Receipts_Remarks;
	
	@FindBy(xpath="//textarea[@id='id_body_16777222']")
	private static WebElement  enter_Payments_Remarks;
	
	@FindBy(xpath="//textarea[@id='id_body_16777225']")
	private static WebElement  enter_PettyCash_Remarks;
	
	@FindBy(xpath="//textarea[@id='id_body_16777228']")
	private static WebElement  enter_PostDatedReceipts_Remarks;
	
	@FindBy(xpath="//textarea[@id='id_body_16777231']")
	private static WebElement  enter_PostDatedPaymentss_Remarks;
	
	@FindBy(xpath="//input[@id='id_body_23']")
	private static WebElement  enter_ItemTxt;
	
	@FindBy(xpath="//*[@id='id_body_23_input_image']/span")
	private static WebElement  item_ExpansionBtn;
	
	@FindBy(xpath="//*[@id='id_body_23_input_settings']/span")
	private static WebElement  item_SettingsBtn;
	
				@FindBy(xpath="//div[@id='id_body_23_customize_popup_container']")
				private static WebElement  item_Settings_Container;
										
				@FindBy(xpath="//div[@id='id_body_23_customize_popup_footer']//input[1]")
				private static WebElement  item_Settings_StandardFieldsBtn;
										
							@FindBy(xpath="//select[@id='id_body_23_customize_popup_standardfields_list']")
							private static WebElement  item_Settings_StandardFieldsBtn_FieldDrpdwn;
																
							@FindBy(xpath="//input[@id='id_body_23_customize_popup_standardfields_header']")
							private static WebElement  item_Settings_StandardFieldsBtn_HeaderTxt;
															
							@FindBy(xpath="//select[@id='id_body_23_customize_popup_standardfields_alignment']")
							private static WebElement  item_Settings_StandardFieldsBtn_AlignmentDrpdwn;
																
							@FindBy(xpath="//input[@id='id_body_23_customize_popup_standardfields_width']")
							private static WebElement  item_Settings_StandardFieldsBtn_WidthTxt;
																
							@FindBy(xpath="//div[contains(@class,'panel')]//input[3]")
							private static WebElement  item_Settings_StandardFieldsBtn_OkBtn;
																
							@FindBy(xpath="//div[contains(@class,'panel')]//input[4]")
							private static WebElement  item_Settings_StandardFieldsBtn_CancelBtn;
										
				@FindBy(xpath="//div[@id='id_body_23_search_container']//input[2]")
				private static WebElement  item_Settings_DeleteColumnBtn;
										
				@FindBy(xpath="//div[contains(@class,'panel')]//input[3]")
				private static WebElement  item_Settings_OkBtn;
								
				@FindBy(xpath="//div[contains(@class,'panel')]//input[4]")
				private static WebElement  item_Settings_CancelBtn;

	


	@FindBy(xpath="//input[@id='id_body_24']")
	private static WebElement  enter_UnitTxt;
	
	@FindBy(xpath="//*[@id='id_body_24_input_image']/span")
	private static WebElement  unit_ExpansionBtn;
	
	@FindBy(xpath="//*[@id='id_body_24_input_settings']/span")
	private static WebElement  unit_SettingsBtn;
	
				@FindBy(xpath="//div[@id='id_body_24_customize_popup_container']")
				private static WebElement  unit_Settings_Container;
										
				@FindBy(xpath="//div[@id='id_body_24_customize_popup_footer']//input[1]")
				private static WebElement  unit_Settings_StandardFieldsBtn;
										
							@FindBy(xpath="//select[@id='id_body_24_customize_popup_standardfields_list']")
							private static WebElement  unit_Settings_StandardFieldsBtn_FieldDrpdwn;
																
							@FindBy(xpath="//input[@id='id_body_24_customize_popup_standardfields_header']")
							private static WebElement  unit_Settings_StandardFieldsBtn_HeaderTxt;
															
							@FindBy(xpath="//select[@id='id_body_24_customize_popup_standardfields_alignment']")
							private static WebElement  unit_Settings_StandardFieldsBtn_AlignmentDrpdwn;
																
							@FindBy(xpath="//input[@id='id_body_24_customize_popup_standardfields_width']")
							private static WebElement  unit_Settings_StandardFieldsBtn_WidthTxt;
																
							@FindBy(xpath="//div[contains(@class,'panel')]//input[3]")
							private static WebElement  unit_Settings_StandardFieldsBtn_OkBtn;
																
							@FindBy(xpath="//div[contains(@class,'panel')]//input[4]")
							private static WebElement  unit_Settings_StandardFieldsBtn_CancelBtn;
										
				@FindBy(xpath="//div[@id='id_body_24_search_container']//input[2]")
				private static WebElement  unit_Settings_DeleteColumnBtn;
										
				@FindBy(xpath="//div[contains(@class,'panel')]//input[3]")
				private static WebElement  unit_Settings_OkBtn;
								
				@FindBy(xpath="//div[contains(@class,'panel')]//input[4]")
				private static WebElement  unit_Settings_CancelBtn;

				
	@FindBy(xpath="//input[@id='id_body_26']")
	private static WebElement  enter_Quantity;
	
	@FindBy(xpath="//input[@id='id_body_27']")
	private static WebElement  enter_Rate;
	
	@FindBy(xpath="//input[@id='id_body_28']")
	private static WebElement  enter_Gross;
	
	@FindBy(xpath="//input[@id='id_body_33554439']")
	private static WebElement  enter_Discount;
	
	
	@FindBy(xpath="//input[@id='id_body_33554436']")
	private static WebElement  PurReturnsenter_Discount;
	
	
	
	@FindBy (xpath="//input[@id='id_body_38']")
	private static WebElement enter_RMA;
	
	@FindBy (xpath="//input[@id='id_body_85']")
	private static WebElement enter_Bin;
	
	@FindBy(xpath="//input[@id='id_body_13']")
	private static WebElement  enter_Batch;
	
	@FindBy(xpath="//input[@id='id_body_12']")
	private static WebElement  enter_DebitACTxt;
	
	@FindBy(xpath="//*[@id='id_body_12_input_image']/span")
	private static WebElement  enter_DebitAC_ExpansionBtn;
	
	@FindBy(xpath="//*[@id='id_body_12_input_settings']/span")
	private static WebElement  enter_DebitAC_SettingsBtn;
	
				@FindBy(xpath="//div[@id='id_header_12_customize_popup_container']")
				private static WebElement  enter_DebitAC_Settings_Container;
										
				@FindBy(xpath="//div[@id='id_header_12_customize_popup_footer']//input[1]")
				private static WebElement  enter_DebitAC_Settings_StandardFieldsBtn;
										
							@FindBy(xpath="//select[@id='id_header_12_customize_popup_standardfields_list']")
							private static WebElement  enter_DebitAC_Settings_StandardFieldsBtn_FieldDrpdwn;
																
							@FindBy(xpath="//input[@id='id_header_12_customize_popup_standardfields_header']")
							private static WebElement  enter_DebitAC_Settings_StandardFieldsBtn_HeaderTxt;
															
							@FindBy(xpath="//select[@id='id_header_12_customize_popup_standardfields_alignment']")
							private static WebElement  enter_DebitAC_Settings_StandardFieldsBtn_AlignmentDrpdwn;
																
							@FindBy(xpath="//input[@id='id_header_12_customize_popup_standardfields_width']")
							private static WebElement  enter_DebitAC_Settings_StandardFieldsBtn_WidthTxt;
																
							@FindBy(xpath="//div[contains(@class,'panel')]//input[3]")
							private static WebElement  enter_DebitAC_Settings_StandardFieldsBtn_OkBtn;
																
							@FindBy(xpath="//div[contains(@class,'panel')]//input[4]")
							private static WebElement  enter_DebitAC_Settings_StandardFieldsBtn_CancelBtn;
										
				@FindBy(xpath="//div[@id='id_header_12_search_container']//input[2]")
				private static WebElement  enter_DebitAC_Settings_DeleteColumnBtn;
										
				@FindBy(xpath="//div[contains(@class,'panel')]//input[3]")
				private static WebElement  enter_DebitAC_Settings_OkBtn;
								
				@FindBy(xpath="//div[contains(@class,'panel')]//input[4]")
				private static WebElement  enter_DebitAC_Settings_CancelBtn;
	
	@FindBy(xpath="//input[@id='id_body_39']")
	private static WebElement  enter_CreditACTxt;
	
	@FindBy(xpath="//*[@id='id_body_39_input_image']/span")
	private static WebElement  enter_CreditAC_ExpansionBtn;
	
	@FindBy(xpath="//*[@id='id_body_39_input_settings']/span")
	private static WebElement  enter_CreditAC_SettingsBtn;

				@FindBy(xpath="//div[@id='id_header_39_customize_popup_container']")
				private static WebElement  enter_CreditAC_Settings_Container;
										
				@FindBy(xpath="//div[@id='id_header_39_customize_popup_footer']//input[1]")
				private static WebElement  enter_CreditAC_Settings_StandardFieldsBtn;
										
							@FindBy(xpath="//select[@id='id_header_39_customize_popup_standardfields_list']")
							private static WebElement  enter_CreditAC_Settings_StandardFieldsBtn_Fielddropdown;
																
							@FindBy(xpath="//input[@id='id_header_39_customize_popup_standardfields_header']")
							private static WebElement  enter_CreditAC_Settings_StandardFieldsBtn_HeaderTxt;
															
							@FindBy(xpath="//select[@id='id_header_39_customize_popup_standardfields_alignment']")
							private static WebElement  enter_CreditAC_Settings_StandardFieldsBtn_Alignmentdropdown;
																
							@FindBy(xpath="//input[@id='id_header_39_customize_popup_standardfields_width']")
							private static WebElement  enter_CreditAC_Settings_StandardFieldsBtn_WidthTxt;
																
							@FindBy(xpath="//div[contains(@class,'panel')]//input[3]")
							private static WebElement  enter_CreditAC_Settings_StandardFieldsBtn_OkBtn;
																
							@FindBy(xpath="//div[contains(@class,'panel')]//input[4]")
							private static WebElement  enter_CreditAC_Settings_StandardFieldsBtn_CancelBtn;
										
				@FindBy(xpath="//div[@id='id_header_39_search_container']//input[2]")
				private static WebElement  enter_CreditAC_Settings_DeleteColumnBtn;
										
				@FindBy(xpath="//div[contains(@class,'panel')]//input[3]")
				private static WebElement  enter_CreditAC_Settings_OkBtn;
								
				@FindBy(xpath="//div[contains(@class,'panel')]//input[4]")
				private static WebElement  enter_CreditAC_Settings_CancelBtn;
	
	@FindBy(xpath="//input[@id='id_body_18']")
	private static WebElement  enter_DebitTxt;
	
	@FindBy(xpath="//input[@id='id_body_19']")
	private static WebElement  enter_CreditTxt;
	
	@FindBy(xpath="//textarea[@id='id_body_16777241']")
	private static WebElement  enter_NonStandardJournalEntries_RemarksTxt;
	
	@FindBy(xpath="//input[@id='id_body_87']")
	private static WebElement  enter_Warehouse2Txt;
	
	@FindBy(xpath="//*[@id='id_body_87_input_image']/span")
	private static WebElement  enter_Warehouse2_ExpansionBtn;
	
	@FindBy(xpath="//*[@id='id_body_87_input_settings']/span")
	private static WebElement  enter_Warehouse2_SettingsBtn;
	
				@FindBy(xpath="//div[@id='id_header_87_customize_popup_container']")
				private static WebElement  enter_WareHouse2_Settings_Container;
										
				@FindBy(xpath="//div[@id='id_header_87_customize_popup_footer']//input[1]")
				private static WebElement  enter_WareHouse2_Settings_StandardFieldsBtn;
										
							@FindBy(xpath="//select[@id='id_header_87_customize_popup_standardfields_list']")
							private static WebElement  enter_WareHouse2_Settings_StandardFieldsBtn_Fielddropdown;
																
							@FindBy(xpath="//input[@id='id_header_87_customize_popup_standardfields_header']")
							private static WebElement  enter_WareHouse2_Settings_StandardFieldsBtn_HeaderTxt;
															
							@FindBy(xpath="//select[@id='id_header_87_customize_popup_standardfields_alignment']")
							private static WebElement  enter_WareHouse2_Settings_StandardFieldsBtn_Alignmentdropdown;
																
							@FindBy(xpath="//input[@id='id_header_87_customize_popup_standardfields_width']")
							private static WebElement  enter_WareHouse2_Settings_StandardFieldsBtn_WidthTxt;
																
							@FindBy(xpath="//div[contains(@class,'panel')]//input[3]")
							private static WebElement  enter_WareHouse2_Settings_StandardFieldsBtn_OkBtn;
																
							@FindBy(xpath="//div[contains(@class,'panel')]//input[4]")
							private static WebElement  enter_WareHouse2_Settings_StandardFieldsBtn_CancelBtn;
										
				@FindBy(xpath="//div[@id='id_header_87_search_container']//input[2]")
				private static WebElement  enter_WareHouse2_Settings_DeleteColumnBtn;
										
				@FindBy(xpath="//div[contains(@class,'panel')]//input[3]")
				private static WebElement  enter_WareHouse2_Settings_OkBtn;
								
				@FindBy(xpath="//div[contains(@class,'panel')]//input[4]")
				private static WebElement  enter_WareHouse2_Settings_CancelBtn;
	
	
	////////////
	
	// Right Panel*** InfoSide Bar
				

	@FindBy(xpath="//*[@id='id_transactionentry_infopanel_container']/div[1]/div[2]/span")
	private static WebElement  infoSideBarCustomizeBtn;
	
				@FindBy(xpath="//*[@id='id_transactionentry_infopanel_container']/div[1]/div[2]/span")
				private static WebElement  customizeCloseBtn;
				
				@FindBy(xpath="//div[@id='id_transactionentry_infopanel_customize_container']//li[@id='Dash_Save']")
				private static WebElement  customizeSaveBtn;
				
				@FindBy(xpath="//div[@id='id_transactionentry_infopanel_customize_container']//li[@id='Dash_Close']")
				private static WebElement  customizeCancelBtn;
				
				@FindBy(xpath="//input[@id='searchBoxTrans']")
				private static WebElement  customizeSearchTxt;
							
				@FindBy(xpath="//*[@id='Dashboard_Graph_panelID_Trans']/div[1]/i")
				private static WebElement  customizeSearchBtn;
							
				@FindBy(xpath="//div[@id='Dashboard_Graph_panelID_Trans']//a[@id='GraphOption']")
				private static WebElement  graphBtn;
							
							@FindBy(xpath="//div[@id='Dashboard_Graph_panelID_Trans']//li[@id='Newgraph']")
							private static WebElement  newGraphOption;
							
				@FindBy(xpath="//div[@id='Dashboard_Graph_panelID_Trans']//a[@id='ReportOption']")
				private static WebElement  reportBtn;
							
							@FindBy(xpath="//div[@id='Dashboard_Graph_panelID_Trans']//li[@id='NewReport']")
							private static WebElement  newReportOption;
							
				@FindBy(xpath="//div[@id='Dashboard_Graph_panelID_Trans']//a[@id='InfopanelOption']")
				private static WebElement  infoPanelBtn;
							
							@FindBy(xpath="//div[@id='Dashboard_Graph_panelID_Trans']//li[@id='NewInfopanel']")
							private static WebElement  newInfoPanelOption;
							
				@FindBy(xpath="//div[@id='Dashboard_Graph_panelID_Trans']//a[@id='workflow']")
				private static WebElement  workFlowBtn;
							
							@FindBy(xpath="//div[@id='Dashboard_Graph_panelID_Trans']//li[@id='NewWorkflow']")
							private static WebElement  newWorkFlowOption;
							
				@FindBy(xpath="//a[@id='DocumentInfoOption']")
				private static WebElement  docInfoBtn;
							
							@FindBy(xpath="//li[@id='id_Dashlet0']//a")
							private static WebElement  newDocInfoOption;
	
	@FindBy(xpath="//span[@class='icon-left-and-right-panel-icon icon-font6 no_padding_left_right']")
	private static WebElement  infoSideBarExpandBtn;
	
	
	
	
	
	
	// Footer Section
	

	@FindBy(xpath="//label[@id='id_transactionentry_footer_panel_summary_value_net']")
	private static WebElement  netLabel;
	

	@FindBy(xpath="//*[@id='id_transactionentry_footer_panel_summary_value_net']/span[2]")
	private static WebElement  net_Amount;

	
/////////////////////////////////////////////////////		
	
	
    @FindBy(xpath="//*[@id='81']/span")
    private static WebElement  financialsReportsMenu; 
    
	    @FindBy(xpath="//a[@id='500']//span[contains(text(),'Ledger')]")
		private static WebElement  ledger;

		@FindBy(xpath="//*[@id='658']/span")
		private static WebElement  ledgerDetail;

		@FindBy(xpath="//*[@id='501']/span")
		private static WebElement  subLedger;
		
		@FindBy(xpath="//*[@id='82']/span")
		private static WebElement  cashAndBankBooksMenu;
		
			@FindBy(xpath="//*[@id='510']/span")
			private static WebElement  cashBookReport;
			
			@FindBy(xpath="//*[@id='511']/span")
			private static WebElement  bankBookReport;
			
			@FindBy(xpath="//*[@id='512']/span")
			private static WebElement  pettyCashBokReport;
			
			@FindBy(xpath="//*[@id='513']/span")
			private static WebElement  dayBookReport;
			
			@FindBy(xpath="//*[@id='83']/span")
			private static WebElement  bankReconciliationReport;
			
			@FindBy(xpath="//*[@id='84']/span")
			private static WebElement  bankReconciliationImport;
			
			@FindBy(xpath="//*[@id='85']/span")
			private static WebElement  customerVendorReconciliation;
		
			@FindBy(xpath="//*[@id='537']/span")
			private static WebElement  bankReconciliationStatement;
				
			@FindBy(xpath="//*[@id='162']/span")
			private static WebElement chequeDiscountingMenu;
		
		@FindBy(xpath="//*[@id='502']/span")
		private static WebElement  salesReportsMenu;
		
			@FindBy(xpath="//*[@id='503']/span")
			private static WebElement  salesRegisterReport;

			@FindBy(xpath="//*[@id='504']/span")
			private static WebElement  salesReturnRegisterReport;
			
			@FindBy(xpath="//*[@id='505']/span")
			private static WebElement summarySalesBookReport;
			
			@FindBy(xpath="//*[@id='628']/span")
			private static WebElement monthlySalesBookReport;
			
			@FindBy(xpath="//*[@id='629']/span")
			private static WebElement  topCustomersListReport;
		
		@FindBy(xpath="//*[@id='506']/span")
		private static WebElement  purchaseReportsMenu;
		
			@FindBy(xpath="//*[@id='507']/span")
			private static WebElement  purchaseRegisterReport;
			
			@FindBy(xpath="//*[@id='508']/span")
			private static WebElement  purchaseReturnRegisteReport;
			
			@FindBy(xpath="//*[@id='509']/span")
			private static WebElement  summaryPurchaseBookReport;
					
		@FindBy(xpath="//*[@id='514']/span")
		private static WebElement  registersReportMenu;
		
			@FindBy(xpath="//*[@id='516']/span")
			private static WebElement  openingBalanceRegisterReport;
			
			@FindBy(xpath="//*[@id='515']/span")
			private static WebElement journalEntriesRegisterReport;
			
			@FindBy(xpath="//span[contains(text(),'Credit Note Register')]")
			private static WebElement creditNoteRegisterReport;
			
			@FindBy(xpath="//*[@id='610']/span")
			private static WebElement  debitNoteRegisterReport;
			
			@FindBy(xpath="//*[@id='598']/span")
			private static WebElement  receiptsRegisterReport;
			
			@FindBy(xpath="//*[@id='599']/span")
			private static WebElement  paymentRegisterReport;
			
			@FindBy(xpath="//*[@id='518']/span")
			private static WebElement  pdcReceiptsRegisterReport;
			
			@FindBy(xpath="//*[@id='519']/span")
			private static WebElement pdcPaymentsRegisterReport;
			
			@FindBy(xpath="//*[@id='517']/span")
			private static WebElement  entryJournalRegisterMenu;
					
		@FindBy(xpath="//*[@id='523']/span")
		private static WebElement  salesAndPurchasesReportMenu;
		
			@FindBy(xpath="//*[@id='524']/span")
			private static WebElement  salesGroupedByCustomerReport;
			
			@FindBy(xpath="//*[@id='525']/span")
			private static WebElement  salesGroupedByProductReport;
			
			@FindBy(xpath="//*[@id='526']/span")
			private static WebElement  salesGroupedByDepartmentReport;
			
			@FindBy(xpath="//*[@id='527']/span")
			private static WebElement  purchasesGroupedByVendorReport;
			
			@FindBy(xpath="//*[@id='528']/span")
			private static WebElement  purchasesGroupedByProductReport;
			
			@FindBy(xpath="//*[@id='529']/span")
			private static WebElement  purchasesGroupedByDepartmentReport;		
		
		@FindBy(xpath="//*[@id='568']/span")
		private static WebElement  MiscellaneousAnalysisReportMenu;
		
			@FindBy(xpath="//*[@id='569']/span")
			private static WebElement  peakAndLowBalancesReport;
			
			@FindBy(xpath="//*[@id='570']/span")
			private static WebElement  comprativeAnalysisReport;
			
			@FindBy(xpath="//*[@id='571']/span")
			private static WebElement  transactionsTypeAnalysisReport;
			
			@FindBy(xpath="//*[@id='572']/span")
			private static WebElement  abcAnalysisReport;
			
			@FindBy(xpath="//*[@id='597']/span")
			private static WebElement  interestCalculationReport;

		@FindBy(xpath="//*[@id='536']/span")
		private static WebElement  mastersInformationMenu;
		
	     	@FindBy(xpath="//*[@id='538']/span")
			private static WebElement  masterInfoMenu;
			
			@FindBy(xpath="//*[@id='144']/span")
			private static WebElement  productLabelMenu;
			
			@FindBy(xpath="//*[@id='573']/span")
			private static WebElement  unitConversionMenu;
				
			@FindBy(xpath="//*[@id='147']/span")
			private static WebElement  skidDefinitionMenu;
							
		@FindBy(xpath="//*[@id='520']/span")
		private static WebElement  auditTrailMenu;
		
			@FindBy(xpath="//*[@id='521']/span")
			private static WebElement  auditTrailtransactionsReport;
			
			@FindBy(xpath="//*[@id='522']/span")
			private static WebElement  aAuditTrailloginsReport;
		
		@FindBy(xpath="//*[@id='204']/span")
		private static WebElement  accountQuery;
	
	
	
	@FindBy (xpath="//select[@id='RITCombobox__1']")
	private static WebElement includePDCDrpDwn;
	
	@FindBy (xpath="//select[@id='RITCombobox__1']")
	private static WebElement stockTypeOrValidation;

	@FindBy (xpath="//select[@id='RITCombobox__10']")
	private static WebElement includeNonAuthorizeDataDrpDwn;
	
	@FindBy (xpath="//select[@id='RITCombobox__5']")
	private static WebElement sortingDrpDwn;
	
	@FindBy (xpath="//input[@id='RITCheckbox__2']")
	private static WebElement movedAccountOnlyChkBox;
	
	@FindBy (xpath="//input[@id='RITCheckbox__3']")
	private static WebElement printAccountIndexChkBox;
	
	@FindBy (xpath="//input[@id='RITCheckbox__9']")
	private static WebElement freshAccountForEachPageChkBox;
	
	@FindBy (xpath="//input[@id='RITCheckbox__11']")
	private static WebElement printAsStatmentOfAccountChkBox;
	
	@FindBy (xpath="//input[@id='RITCheckbox__6']")
	private static WebElement displayUnrealizedLossOrGainChkBox;


	
	
	@FindBy(xpath="//div[@class='theme_color font-6']")
	public static WebElement errorMessage;
	 
	@FindBy(xpath="//span[@class='icon-reject2 theme_color']")
	public static WebElement errorMessageCloseBtn;
	
	//Dash board Page
	@FindBy(xpath="//*[@id='dashName']")
    private static WebElement labelDashboard ;
	
	@FindBy(xpath="//*[@id='Select_dash']")
	private static WebElement selectDashboard ;
		
	@FindBy(xpath="//*[@id='Dashboard_AddDash']")
    private static WebElement newAddDashBoard;
	 
    @FindBy(xpath="//*[@id='Dashboard_Dash_Config']")
    private static WebElement dashboardCustomizationSettings;
	
    
    /////////////////////
    
    //Settings Screen
  
	@FindBy(xpath="//span[@id='updateButton']")
	private static WebElement  updateBtn;
	
	@FindBy(xpath="//i[@class='icon-close icon-font6']")
	private static WebElement  settings_closeBtn;
	
	
	//Documents Tab


	@FindBy(xpath="//div[@class='font-5 theme_background-color-inverse theme_color-inverse']")
	private static WebElement  documentsTab;
	
	@FindBy(xpath="//li[@id='navigationtab1']")
	private static WebElement  documentsTabForMaterialReceiptNotes;
	

	@FindBy(xpath="//span[@id='DocumentLoadMasterPopupBtn']")
	private static WebElement  loadMastersBtn;
	
				@FindBy(xpath="//select[@id='doc_voucherDropDown']")
				private static WebElement  loadmasterDropDown;
				
				@FindBy(xpath="//button[@id='btnSelectDependMaster']")
				private static WebElement  selectAllBtn;
				
				@FindBy(xpath="//button[contains(text(),'Reset')]")
				private static WebElement  resetBtn;
				
				@FindBy(xpath="//button[@class='Fbutton pull-right'][contains(text(),'Ok')]")
				private static WebElement  okBtn;
	
	@FindBy(xpath="//*[@id='editScreen_CustomizeButtons']/span[1]")
	private static WebElement  deleteTagBtn;
	
	@FindBy(xpath="//span[@id='DocumentAddGroupPopupBtn']")
	private static WebElement  addGroupBtn;
	
				@FindBy(xpath="//input[@id='doc_GroupName']")
				private static WebElement  groupNameTXt;
				
				@FindBy(xpath="//button[contains(text(),'Add')]")
				private static WebElement  addBtn;
				
				@FindBy(xpath="//div[@class='col-xs-12 form-group']//button[@id='btnCancel']")
				private static WebElement  cancelBtn;

	@FindBy(xpath="//div[@id='voucherTabContent']//span[2]")
	private static WebElement  deletegroupBtn;
	
	@FindBy(xpath="//input[@id='doc_title']")
	private static WebElement  titleTxt;
	
	
	/*@FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]")
	private static WebElement  titleTxt;*/
	
	@FindBy(xpath="//input[@id='doc_baseDocument']")
	private static WebElement  baseDocumentTxt;
	
	@FindBy(xpath="//input[@id='txtbox_doc_Accountdepandency']")
	private static WebElement  accountDependencyTxt;
	
				@FindBy(xpath="//span[contains(text(),'iExchangeAdjustmentGainAC')]")
				private static WebElement  iExchangeAdjustmentGainACChkBox;
				
				@FindBy(xpath="//span[contains(text(),'iExchangeAdjustmentLossAC')]")
				private static WebElement  iExchangeAdjustmentLossACChkBox;
				
				@FindBy(xpath="//span[contains(text(),'iPrimaryAccount')]")
				private static WebElement  iPrimaryAccountChkBox;
				
				@FindBy(xpath="//span[contains(text(),'iCity')]")
				private static WebElement  iCityChkBox;
				
				@FindBy(xpath="//span[contains(text(),'iDeliveryCity')]")
				private static WebElement  iDeliverycityChkBox;
				
				@FindBy(xpath="//span[contains(text(),'iBankAc')]")
				private static WebElement  iBankACChkBox;
				
				@FindBy(xpath="//span[contains(text(),'iPDCDiscountedAC')]")
				private static WebElement  iPDCDiscountedACChkBox;
				
	@FindBy(xpath="//input[@id='txtbox_doc_Productdepandency']")
	private static WebElement  itemDependencyTxt;
	
				@FindBy(xpath="//span[contains(text(),'Outlet__')]")
				private static WebElement  outletChkBox;
				
				@FindBy(xpath="//span[contains(text(),'iCostofShortageStockAC')]")
				private static WebElement  iCostofShortageStockACChkBox;
				
				@FindBy(xpath="//span[contains(text(),'iCostofExcessStockAC')]")
				private static WebElement  iCostofExcessStockACChkBox;
				
				@FindBy(xpath="//span[contains(text(),'iCostofSaleReturnAC')]")
				private static WebElement  iCostofSaleReturnACChkBox;
				
				@FindBy(xpath="//span[contains(text(),'iPurchaseVarianceAC')]")
				private static WebElement  iPurchaseVarianceACChkBox;
				
				@FindBy(xpath="//span[contains(text(),'iDefaultBaseUnit')]")
				private static WebElement  iDefaultBaseUnitChkBox;
				
				@FindBy(xpath="//span[contains(text(),'iDefaultSalesUnit')]")
				private static WebElement  iDefaultSalesUnitChkBox;
				
				@FindBy(xpath="//span[contains(text(),'iDefaultPurchaseUnit')]")
				private static WebElement  iDefaultPurchaseUnitChkBox;
				
				@FindBy(xpath="//span[contains(text(),'iCostOfIssueAccount')]")
				private static WebElement  iCostOfIssueAccountChkBox;
				
				@FindBy(xpath="//span[contains(text(),'iStocksAccount')]")
				private static WebElement  iStocksAccountChkBox;
				
				@FindBy(xpath="//span[contains(text(),'iSalesAccount')]")
				private static WebElement  iSalesAccountChkBox;
				
				@FindBy(xpath="//li[12]//div[1]//label[1]//span[1]")
				private static WebElement  otherdetails1Box;
				
				@FindBy(xpath="//li[13]//div[1]//label[1]//span[1]")
				private static WebElement  replenishment1ChkBox;
				
				@FindBy(xpath="//span[contains(text(),'Reorder__')]")
				private static WebElement  reorderChkBox;
				
				@FindBy(xpath="//span[contains(text(),'iCategory')]")
				private static WebElement  iCategoryChkBox;
				
				@FindBy(xpath="//span[contains(text(),'iWIPAccount')]")
				private static WebElement  iWIPAccountChkBox;
				
				@FindBy(xpath="//span[contains(text(),'Classification__')]")
				private static WebElement  classificationChkBox;
				
				@FindBy(xpath="//li[18]//div[1]//label[1]//span[1]")
				private static WebElement  repelenishment2ChkBox;
				
				@FindBy(xpath="//li[19]//div[1]//label[1]//span[1]")
				private static WebElement  otherDetails2ChkBox;
				
				@FindBy(xpath="//span[contains(text(),'iBin')]")
				private static WebElement  iBinChkBox;
				
				@FindBy(xpath="//span[contains(text(),'iAlternateCategory')]")
				private static WebElement  iAlternateCategoryChkBox;
				
				@FindBy(xpath="//span[contains(text(),'iTaxCode')]")
				private static WebElement  iTaxCodeChkBox;
	
	@FindBy(xpath="//select[@id='doc_Accountdepandency_Filter']")
	private static WebElement  accountfilterDropdown;
	
	@FindBy(xpath="//select[@id='doc_Itemdepandency_Filter']")
	private static WebElement  itemfilterDropdown;
	
	
	// Documents Grid Elements
	
		// first row 
	
	@FindBy(xpath="//td[@id='doc_TagsTable_col_1-0']")
	private static WebElement  firstrow;
	
	@FindBy(xpath="//div[contains(text(),'Delete Row')]")
	private static WebElement  Doc_deleterowBtn;
	
	@FindBy(xpath="//div[contains(text(),'Insert Row')]")
	private static WebElement  Doc_insertRowBtn;
	
	@FindBy(xpath="//td[@id='doc_TagsTable_col_1-1']")
	private static WebElement  masters1;
	
	@FindBy(xpath="//td[@id='doc_TagsTable_col_1-2']")
	private static WebElement  position1;
	
	@FindBy(xpath="//td[@id='doc_TagsTable_col_1-3']")
	private static WebElement  showDependency1;
	
	@FindBy(xpath="//td[@id='doc_TagsTable_col_1-4']")
	private static WebElement  group1;
	
	@FindBy(xpath="//td[@id='doc_TagsTable_col_1-5']")
	private static WebElement  filter1;
	
	@FindBy(xpath="//td[@id='doc_TagsTable_col_1-6']")
	private static WebElement  mandatory1;
	
	
	// Second Row... delete and insert row are same
	
	@FindBy(xpath="//td[@id='doc_TagsTable_col_2-0']")
	private static WebElement  secondRow;
	
	@FindBy(xpath="//td[@id='doc_TagsTable_col_2-1']")
	private static WebElement  masters2;
	
	@FindBy(xpath="//td[@id='doc_TagsTable_col_2-2']")
	private static WebElement  position2;
	
	@FindBy(xpath="//td[@id='doc_TagsTable_col_2-3']")
	private static WebElement  showDependency2;
	
	@FindBy(xpath="//td[@id='doc_TagsTable_col_2-4']")
	private static WebElement  group2;
	
	@FindBy(xpath="//td[@id='doc_TagsTable_col_2-5']")
	private static WebElement  filter2;
	
	@FindBy(xpath="//td[@id='doc_TagsTable_col_2-6']")
	private static WebElement  mandatory2;
	
	// After clicking *** Properties Changes which are same for all rows
	
	@FindBy(xpath="//select[@id='doc_TagsTableMasterDropDown']")
	private static WebElement  masterDropDown;
	
	@FindBy(xpath="//select[@id='doc_TagsPositionDropDown']")
	private static WebElement  positionDropdown;
	
	@FindBy(xpath="//input[@id='txtbox_doc_TagsDepedencyDropDown']")
	private static WebElement  showDependencyDropdown;
	
	@FindBy(xpath="//input[@id='doc_TagsGroupTxtbox']")
	private static WebElement  groupTxt;
	
	@FindBy(xpath="//select[@id='docFilter']")
	private static WebElement  filterDropdown;
	
	@FindBy(xpath="//select[@id='doc_MandatoryDropDown']")
	private static WebElement  mandatoryDropDown;
	
	// Grid Elements completed
	
	// Right Panel 
	
	// Home ***************************
	
	@FindBy(xpath="//*[@id='id_menu_tree_1']/a/i")
	private static WebElement  homeExpandBtn;
	
				@FindBy(xpath="//*[@id='id_menu_tree_2']/a/i")
				private static WebElement  companyExpandBtn;
				
							@FindBy(xpath="//*[@id='id_menu_tree_3']/a/i")
							private static WebElement  newComapanyBtn;
							
							@FindBy(xpath="//*[@id='id_menu_tree_131']/a/i")
							private static WebElement  yearEndProcesBtn;
							
							@FindBy(xpath="//*[@id='id_menu_tree_125']/a/i")
							private static WebElement  interComapnyTransactionBtn;
							
							@FindBy(xpath="//*[@id='id_menu_tree_134']/a/i")
							private static WebElement  synchronizationBtn;
							
				@FindBy(xpath="//*[@id='id_menu_tree_6']/a/i")
				private static WebElement  securityBtn;
				
				@FindBy(xpath="//*[@id='id_menu_tree_1000']/a/i")
				private static WebElement  mastersExpandBtn;
			
							@FindBy(xpath="//*[@id='id_menu_tree_220']/a/i")
							private static WebElement  currencyBtn;
							
							@FindBy(xpath="//*[@id='id_menu_tree_221']/a/i")
							private static WebElement  itemBtn;
				
							@FindBy(xpath="//*[@id='id_menu_tree_8002']/a/i")
							private static WebElement  schemesExpandBtn;
							
										@FindBy(xpath="//*[@id='id_menu_tree_8015']/a/i")
										private static WebElement  discountDefinitionBtn;
							
							@FindBy(xpath="//*[@id='id_menu_tree_224']/a/i")
							private static WebElement  mrpBtn;
							
							@FindBy(xpath="//*[@id='id_menu_tree_225']/a/i")
							private static WebElement  qcBtn;
							
							@FindBy(xpath="//*[@id='id_menu_tree_234']/a/i")
							private static WebElement  warehouseManagementSystemBtn;
							
							@FindBy(xpath="//*[@id='id_menu_tree_251']/a/i")
							private static WebElement  maintainceBtn;
							
							@FindBy(xpath="//*[@id='id_menu_tree_8001']/a/i")
							private static WebElement  pointofSaleExpandBtn;
							
										@FindBy(xpath="//*[@id='id_menu_tree_8005']/a/i")
										private static WebElement  memberBtn;
										
										@FindBy(xpath="//*[@id='id_menu_tree_8006']/a/i")
										private static WebElement  giftVoucherBtn;
										
										@FindBy(xpath="//*[@id='id_menu_tree_1025']/a/i")
										private static WebElement  pointOfSaleTableManagementBtn;
							
							@FindBy(xpath="//*[@id='id_menu_tree_1103']/a/i")
							private static WebElement  payrollBtn;
							
							@FindBy(xpath="//*[@id='id_menu_tree_1056']/a/i")
							private static WebElement  tdsAnnexureBtn;
							
				@FindBy(xpath="//*[@id='id_menu_tree_16']/a/i")
				private static WebElement  settingsExpandBtn;
				
							@FindBy(xpath="//*[@id='id_menu_tree_66']/a/i")
							private static WebElement  authorizationBtn;
				
				@FindBy(xpath="//*[@id='id_menu_tree_25']/a/i")
				private static WebElement  datamanagementBtn;
				
				@FindBy(xpath="//*[@id='id_menu_tree_20']/a/i")
				private static WebElement  utilitiesBtn;
	
				
	// Finance *************************			
				
	/*@FindBy(xpath="//*[@id='id_menu_tree_60']/a/i")
	private static WebElement  financeExpandBtn;
	
				@FindBy(xpath="//*[@id='id_menu_tree_61']/a/i")
				private static WebElement  financeTransactionExpandBtn;
				
							@FindBy(xpath="//*[@id='id_menu_tree_2001']/a/i")
							private static WebElement  cashBankBtn;
							
							@FindBy(xpath="//*[@id='id_menu_tree_2007']/a/i")
							private static WebElement  financePurchasesBtn;
							
							@FindBy(xpath="//*[@id='id_menu_tree_2014']/a/i")
							private static WebElement  financeSalesBtn;
							
							@FindBy(xpath="//*[@id='id_menu_tree_2023']/a/i")
							private static WebElement  journalsBtn;
							
							@FindBy(xpath="//*[@id='id_menu_tree_2039']/a/i")
							private static WebElement  manufacturingBtn;
							
							@FindBy(xpath="//*[@id='id_menu_tree_219']/a/i")
							private static WebElement  autoPostingsBtn;
							
				@FindBy(xpath="//*[@id='id_menu_tree_62']/a/i")
				private static WebElement  creditManagementExpandBtn;
				
							@FindBy(xpath="//*[@id='id_menu_tree_217']/a/i")
							private static WebElement  delinquencyBtn;
				
				@FindBy(xpath="//*[@id='id_menu_tree_81']/a/i")
				private static WebElement  financeReportsExpandBtn;
				
							@FindBy(xpath="//*[@id='id_menu_tree_82']/a/i")
							private static WebElement  cashAndBankBookBtn;
							
							@FindBy(xpath="//*[@id='id_menu_tree_502']/a/i")
							private static WebElement  salesReportBtn;
							
							@FindBy(xpath="//*[@id='id_menu_tree_506']/a/i")
							private static WebElement  purchaseReportBtn;
							
							@FindBy(xpath="//*[@id='id_menu_tree_207']/a/i")
							private static WebElement  vatBtn;
							
							@FindBy(xpath="//*[@id='id_menu_tree_514']/a/i")
							private static WebElement  registersBtn;
							
							@FindBy(xpath="//*[@id='id_menu_tree_523']/a/i")
							private static WebElement  salesAndPurchaseAnalysisBtn;
							
							@FindBy(xpath="//*[@id='id_menu_tree_568']/a/i")
							private static WebElement  miscellaneousAnalysisBtn;
							
							@FindBy(xpath="//*[@id='id_menu_tree_536']/a/i")
							private static WebElement  masterInformationBtn;
							
							@FindBy(xpath="//*[@id='id_menu_tree_520']/a/i")
							private static WebElement  financeReportsAuditTrialBtn;
				
				@FindBy(xpath="//*[@id='id_menu_tree_50001']/a/i")
				private static WebElement  fixedAssetBtn;
				
				@FindBy(xpath="//*[@id='id_menu_tree_530']/a/i")
				private static WebElement  finalAccountsBtn;
				
				@FindBy(xpath="//*[@id='id_menu_tree_558']/a/i")
				private static WebElement  receiveableAndPayableAnalysisExpandBtn;
				
							@FindBy(xpath="//*[@id='id_menu_tree_605']/a/i")
							private static WebElement  customerDetailBtn;
							
							@FindBy(xpath="//*[@id='id_menu_tree_607']/a/i")
							private static WebElement  customerSummaryBtn;
							
							@FindBy(xpath="//*[@id='id_menu_tree_606']/a/i")
							private static WebElement  vendorDetailBtn;
							
							@FindBy(xpath="//*[@id='id_menu_tree_608']/a/i")
							private static WebElement  vendorSummaryBtn;
				
				@FindBy(xpath="//*[@id='id_menu_tree_3301']/a/i")
				private static WebElement  budgetExpandBtn;
				
							@FindBy(xpath="//*[@id='id_menu_tree_3304']/a/i")
							private static WebElement  reviseBudgetBtn;
							
							@FindBy(xpath="//*[@id='id_menu_tree_3321']/a/i")
							private static WebElement  budgetReportsBtn;
				
				@FindBy(xpath="//*[@id='id_menu_tree_3311']/a/i")
				private static WebElement  onlinepaymentsBtn;*/
				
				
				// Financial Menu and Sub Menus
				@FindBy(xpath="//*[@id='60']/div/span")
				private static WebElement  financialsMenu;
				
				
				
					@FindBy(xpath="//*[@id='61']/span")
					private static WebElement  financialsTransactionMenu; 		

						@FindBy(xpath="//*[@id='2001']/span")
						private static WebElement  cashAndBankMenu; 
						
				     		@FindBy(xpath="//*[@id='2002']/span")
							private static WebElement  receiptsVoucher;
							
							@FindBy(xpath="//*[@id='2003']/span")
							private static WebElement  paymentsVoucher;
							
							@FindBy(xpath="//*[@id='2004']/span")
							private static WebElement  pettyVoucher;
							
							@FindBy(xpath="//*[@id='2005']/span")
							private static WebElement  postDatedReceiptsVoucher;
										
							@FindBy(xpath="//*[@id='2006']/span")
							private static WebElement  postDatedPaymentsVoucher;
							
							@FindBy(xpath="//*[@id='108']/span")
							private static WebElement  defineChequeSeries;
							
							@FindBy(xpath="//*[@id='109']/span")
							private static WebElement  cancelCheque;
						

						@FindBy(xpath="//*[@id='2007']/span")
						private static WebElement  financialsTransactionsPurchaseMenu; 
						
							@FindBy(xpath="//*[@id='2008']/span")
							private static WebElement  purchaseVoucher;
							
							@FindBy(xpath="//*[@id='2009']/span")
							private static WebElement  purchaseReturnsVoucher;
							
									
						@FindBy(xpath="//*[@id='2014']/span")
						private static WebElement  financialsTransactionsSalesMenu;
							
							@FindBy(xpath="//*[@id='2015']/span")
							private static WebElement  salesInvoicesVoucher;
							
							@FindBy(xpath="//*[@id='2016']/span")
							private static WebElement  salesReturnsVoucher;
							
							@FindBy(xpath="//*[@id='2020']/span")
							private static WebElement  cashSales;
									
							@FindBy(xpath="//*[@id='2021']/span")
							private static WebElement  hirePurchaseSales;
						
						@FindBy(xpath="//*[@id='2023']/span")
						private static WebElement  financialsTransactionsJournalsMenu;
						
						    @FindBy(xpath="//*[@id='2032']/span")
							private static WebElement  journalsEntriesVoucher;
							
							@FindBy(xpath="//*[@id='2025']/span")
							private static WebElement  forexJVVoucher;
							
							@FindBy(xpath="//*[@id='2029']/span")
							private static WebElement  interdepartmentaljvVoucher;
							
							@FindBy(xpath="//*[@id='2024']/span")
							private static WebElement  oldJouranlEntriesVoucher;
							
							@FindBy(xpath="//*[@id='2026']/span")
							private static WebElement  debitNotesVoucher;
							
							@FindBy(xpath="//*[@id='2030']/span")
							private static WebElement  debitNotesLinewiseVoucher;
							
							@FindBy(xpath="//*[@id='2027']/span")
							private static WebElement  creditNotesVoucher;
							
							@FindBy(xpath="//*[@id='2031']/span")
							private static WebElement  creditNotesLinewiseVoucher;
							
							@FindBy(xpath="//*[@id='2028']/span")
							private static WebElement  openingBalancesVoucher;
							
							@FindBy(xpath="//*[@id='2046']/span")
							private static WebElement  fixedAssetsDepreciationVoucher;
						
						@FindBy(xpath="//*[@id='219']/span")
						private static WebElement  financialsTransactionsAutoPostingsMenu;
						
							@FindBy(xpath="//*[@id='77']/span")
							private static WebElement  recurringJournalVoucher;
							
							@FindBy(xpath="//*[@id='79']/span")
							private static WebElement  postRecurringJournal;
							
							@FindBy(xpath="//*[@id='92']/span")
							private static WebElement  recurringJournalTemplate;
							
							@FindBy(xpath="//*[@id='91']/span")
							private static WebElement  postInterest;
							
							@FindBy(xpath="//*[@id='90']/span")
							private static WebElement  convertMaturedPDCs;
							
							@FindBy(xpath="//*[@id='161']/span")
							private static WebElement assignPDCLimit;
							
							@FindBy(xpath="//*[@id='166']/span")
							private static WebElement  stockReplenishment;

					@FindBy(xpath="//*[@id='62']/span")
					private static WebElement  financialsCreditManagementMenu; 
					
						@FindBy(xpath="//*[@id='63']/span")
						private static WebElement  paymentTerms;
						
						@FindBy(xpath="//*[@id='64']/span")
						private static WebElement  financeTerms;
						
						@FindBy(xpath="//*[@id='65']/span")
						private static WebElement  reminderTerms;		
						
						@FindBy(xpath="//*[@id='89']/span")
						private static WebElement  sendReminder;
						
						@FindBy(xpath="//*[@id='217']/span")
						private static WebElement  delinquency;
						
							@FindBy(xpath="//*[@id='73']/span")
							private static WebElement  questionnarie;
							
							@FindBy(xpath="//*[@id='218']/span")
							private static WebElement  delinquencyMgmt;
							
						@FindBy(xpath="//*[@id='35']/span")
						private static WebElement  creidtApproval;
				
			
								
					

				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
//Inventory   *************************
				
	@FindBy(xpath="//*[@id='id_menu_tree_135']/a/i")
	private static WebElement  inventoryExpandBtn;
	
				
				
							@FindBy(xpath="//*[@id='id_menu_tree_139']/a/i")
							private static WebElement  inventoryPurchasesBtn;
							
							@FindBy(xpath="//*[@id='id_menu_tree_140']/a/i")
							private static WebElement  inventorySalesBtn;
							
							@FindBy(xpath="//*[@id='id_menu_tree_2033']/a/i")
							private static WebElement  stocksBtn;
							
							@FindBy(xpath="//*[@id='id_menu_tree_200']/a/i")
				private static WebElement  inventoryReportsExpandBtn;
				
							@FindBy(xpath="//*[@id='id_menu_tree_540']/a/i")
							private static WebElement  binsReportBtn;
							
							@FindBy(xpath="//*[@id='id_menu_tree_621']/a/i")
							private static WebElement  stockAgeingAnalysisBtn;
				
				@FindBy(xpath="//*[@id='id_menu_tree_550']/a/i")
				private static WebElement  ordermanagementExpandBtn;
				
							@FindBy(xpath="//*[@id='id_menu_tree_600']/a/i")
							private static WebElement  analysisOfLinkedUnlinkedDocumentsBtn;
							
//Fixed Asset************************							
	
	@FindBy(xpath="//*[@id='id_menu_tree_136']/a/i")
	private static WebElement  fixedAssetExpandBtn;
	
				@FindBy(xpath="//*[@id='id_menu_tree_138']/a/i")
				private static WebElement  fixedAssetTransactionExpandBtn;
				
							@FindBy(xpath="//*[@id='id_menu_tree_50010']/a/i")
							private static WebElement  fixedAssetReportsBtn;
							
//Production ***********************							
	
	@FindBy(xpath="//*[@id='id_menu_tree_3000']/a/i")
	private static WebElement  productionExpandBtn;
	
				@FindBy(xpath="//*[@id='id_menu_tree_3001']/a/i")
				private static WebElement  productionTransactionBtn;
				
				@FindBy(xpath="//*[@id='id_menu_tree_625']/a/i")
				private static WebElement  productionReportBtn;
				
				@FindBy(xpath="//*[@id='id_menu_tree_3006']/a/i")
				private static WebElement  mrpSettingsBtn;
				
//Point Of Sale ***********************************				
	
	@FindBy(xpath="//*[@id='id_menu_tree_8000']/a/i")
	private static WebElement  pointofSale_ExpandBtn;
	
				@FindBy(xpath="//*[@id='id_menu_tree_8004']/a/i")
				private static WebElement  mainScreenBtn;
				
				@FindBy(xpath="//*[@id='id_menu_tree_8500']/a/i")
				private static WebElement  posReportsExpandBtn;
				
							@FindBy(xpath="//*[@id='id_menu_tree_8501']/a/i")
							private static WebElement  retailSaleReportBtn;
							
							@FindBy(xpath="//*[@id='id_menu_tree_8507']/a/i")
							private static WebElement  summarysalesReportBtn;
							
							@FindBy(xpath="//*[@id='id_menu_tree_8513']/a/i")
							private static WebElement  preOrderReportsBtn;
							
							@FindBy(xpath="//*[@id='id_menu_tree_8523']/a/i")
							private static WebElement  memberReportsBtn;
							
							@FindBy(xpath="//*[@id='id_menu_tree_8530']/a/i")
							private static WebElement  memberPointsReportsBtn;
							
							@FindBy(xpath="//*[@id='id_menu_tree_8535']/a/i")
							private static WebElement  itemReportsBtn;
							
							@FindBy(xpath="//*[@id='id_menu_tree_8540']/a/i")
							private static WebElement  cashReportsBtn;
							
							@FindBy(xpath="//*[@id='id_menu_tree_8545']/a/i")
							private static WebElement  stockReportsBtn;
							
							@FindBy(xpath="//*[@id='id_menu_tree_8550']/a/i")
							private static WebElement  periodicSalesReportsBtn;
							
							@FindBy(xpath="//*[@id='id_menu_tree_8556']/a/i")
							private static WebElement  lastYearComaprisionReportsBtn;
							
							@FindBy(xpath="//*[@id='id_menu_tree_8562']/a/i")
							private static WebElement  miscellaneousReportsBtn;
							
							@FindBy(xpath="//*[@id='id_menu_tree_8571']/a/i")
							private static WebElement  restaurantReportsBtn;
				
				@FindBy(xpath="//*[@id='id_menu_tree_8900']/a/i")
				private static WebElement  reportsTableManagementBtn;
				
				@FindBy(xpath="//*[@id='id_menu_tree_8003']/a/i")
				private static WebElement  utilitiesExpandBtn;
				
							@FindBy(xpath="//*[@id='id_menu_tree_8027']/a/i")
							private static WebElement  bbqConversionBtn;
	
	
//Quality Control *****************  	
	
	
	
	@FindBy(xpath="//*[@id='id_menu_tree_150']/a/i")
	private static WebElement  qualityControlExpandBtn;
	
				@FindBy(xpath="//*[@id='id_menu_tree_151']/a/i")
				private static WebElement  qualityControlTransactionBtn;
				
				@FindBy(xpath="//*[@id='id_menu_tree_152']/a/i")
				private static WebElement  qualityControlReportsBtn;


    
 // Views Tab
	
    
	@FindBy(xpath="//span[@class='icon-views'")
	private static WebElement  viewsTab;
	

	
// Export Fields 
	
	@FindBy(xpath="//span[contains(text(),'Export Fields')]")
	private static WebElement exportFieldsTab;
	
// Triggers
	
	@FindBy(xpath="//span[@class='icon-trigger icon-font7']")
	private static WebElement  triggersTab;	
	
//  Document Numbering
	
	@FindBy(xpath="//span[contains(text(),'Document Numbering')]")
	private static WebElement  documentNumberingTab;
	
// Hire Purchase	
	
	@FindBy(xpath="//span[contains(text(),'Hire Purchase')]")
	private static WebElement hirePurchasetab;
	

	
// Reports Tab	
	
	@FindBy(xpath="//span[@class='icon-text70 icon-font7']")
	private static WebElement  reportsTab;	
	
// Schemes

	@FindBy(xpath="//span[contains(text(),'Schemes')]")
	private static WebElement schemestab;	
		
	
	
	
////////////////////
	
	@FindBy(xpath="//div[contains(text(),'Inventory')]")
	private static WebElement  inventoryMenu; 
	
		@FindBy(xpath="//a[@id='137']//span[contains(text(),'Transactions')]")
		private static WebElement  invTransactionsMenu; 
			
			@FindBy(xpath="//*[@id='139']/span")
			private static WebElement  invTransPurchasesMenu; 
		
				@FindBy(xpath="//*[@id='2010']/span")
				private static WebElement  requestForQuoteVoucher;
				
				@FindBy(xpath="//*[@id='2011']/span")
				private static WebElement  purchasesQuotationsVoucher;
					
				@FindBy(xpath="//*[@id='2012']/span")
				private static WebElement  purchasesOrdersVoucher;
			
				@FindBy(xpath="//*[@id='2013']/span")
				private static WebElement  materialReceiptNotesVoucher;
			
			@FindBy(xpath="//*[@id='140']/span")
			private static WebElement  invTransSalesMenu; 
		
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
					
			
				
				@FindBy(xpath="//*[@id='2034']/span")
				private static WebElement  shortagesInStockVoucher;
				
				@FindBy(xpath="//*[@id='2035']/span")
				private static WebElement  excessesInStocksVoucher;
					
				@FindBy(xpath="//*[@id='2036']/span")
				private static WebElement  stockTransfersVoucher;
				
				@FindBy(xpath="//a[@id='2037']//span[contains(text(),'Opening Stocks')]")
				private static WebElement  openingStocksVoucher;
				
				@FindBy(xpath="//a[@id='2049']//span[contains(text(),'Opening Stocks New')]")
				private static WebElement  openingStocksNEWVoucher;
				
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
			
		@FindBy(xpath="//a[@id='200']//span[contains(text(),'Reports')]")
		private static WebElement  inventoryReportsMenu; 
		
			@FindBy(xpath="//a[@id='202']//span[contains(text(),'Item Query')]")
			private static WebElement itemQuery;
			
			@FindBy(xpath="//span[contains(text(),'Stock Ledger')]")
			private static WebElement  stockLedger;
			
			@FindBy(xpath="//span[contains(text(),'Opening Stocks Register')]")
			private static WebElement  openingStocksRegister;
			
			@FindBy(xpath="//span[contains(text(),'Stock Statement')]")
			private static WebElement  stockStatement;
					
			@FindBy(xpath="//a[@id='575']//span[contains(text(),'Stock Movement')]")
			private static WebElement  stockMovement;
			
			@FindBy(xpath="//span[contains(text(),'Multi Level Stock Movement')]")
			private static WebElement  multiLevelStockMovement;
			
			@FindBy(xpath="//span[contains(text(),'Virtual Stock Analysis')]")
			private static WebElement  virtualStockAnalysis;
			
			@FindBy(xpath="//a[@id='578']")
			private static WebElement  stockValuation;
			
			@FindBy(xpath="//a[@id='656']")
			private static WebElement  stockReportByTag;
			
			@FindBy(xpath="//a[@id='579']//span[contains(text(),'ABC Analysis')]")
			private static WebElement  abcAnalysis;
			
			@FindBy(xpath="//span[contains(text(),'Stock Analysis by Batch')]")
			private static WebElement  stockAnalysisByBatch;
			
			@FindBy(xpath="//span[contains(text(),'Stock Analysis by RMA')]")
			private static WebElement  stockAnalysisByRMA;
			
			@FindBy(xpath="//span[contains(text(),'Bins Report')]")
			private static WebElement  binsReportMenu;
			
				@FindBy(xpath="//*[@id='587']/span")
				private static WebElement  stockDetailsByBins;
			
				@FindBy(xpath="//*[@id='588']/span")
				private static WebElement  stockBalancesByBins;
				
				@FindBy(xpath="//*[@id='589']/span")
				private static WebElement  stockBalancesByItemByBins;
				
				@FindBy(xpath="//*[@id='590']/span")
				private static WebElement  expiredStockByBins;		
			
			@FindBy(xpath="//span[contains(text(),'Stock balance by warehouse')]")
			private static WebElement  stockBalanceByWarehouse;
			
			@FindBy(xpath="//span[contains(text(),'Stock ageing analysis')]")
			private static WebElement  stockAgeingAnalysisMenu;
				
				@FindBy(xpath="//*[@id='582']/span")
				private static WebElement  ageingAnalysis;
				
				@FindBy(xpath="//*[@id='622']/span")
				private static WebElement  ageingAnalysisByBatch;
				
				@FindBy(xpath="//*[@id='623']/span")
				private static WebElement  ageingAnalysisByRMA;		
				
				@FindBy(xpath="//*[@id='591']/span")
				private static WebElement  ageingStockByBins;
						
				@FindBy(xpath="//*[@id='646']/span")
				private static WebElement  ageingByItemByBins;		

			@FindBy(xpath="//span[contains(text(),'Reorder Report')]")
			private static WebElement reorderReport;
			
			@FindBy(xpath="//a[@id='584']//span[contains(text(),'Fast Moving Item')]")
			private static WebElement  fastMovingItem;
					
			@FindBy(xpath="//a[@id='585']//span[contains(text(),'Slow Moving Item')]")
			private static WebElement  slowMovingItem;
			
			@FindBy(xpath="//span[contains(text(),'Peak/Low Balances')]")
			private static WebElement  peakORLowBalances;
			
			@FindBy(xpath="//span[contains(text(),'Best Selling Item')]")
			private static WebElement  bestSellingItem;
		
			@FindBy(xpath="//span[contains(text(),'Raise Indent Item with Low Stock')]")
			private static WebElement  raiseIndentItemWithLowStock;
			
			@FindBy(xpath="//span[contains(text(),'Stock transfer report')]")
			private static WebElement  stockTransferReport;
			
			@FindBy(xpath="//span[contains(text(),'Raise request for quote')]")
			private static WebElement  raiseRequestForQuote;
			
			@FindBy(xpath="//span[contains(text(),'Stock reservation report')]")
			private static WebElement  stockReservationReport;
			
			@FindBy(xpath="//span[contains(text(),'Transaction type-wise stock report')]")
			private static WebElement  transactionTypeWiseStockReport;
		
		@FindBy(xpath="//span[contains(text(),'Order Management')]")
		private static WebElement  orderManagementMenu; 
	
			@FindBy(xpath="//*[@id='600']/span")
			private static WebElement  analysisOfLinkedORUnlinkedDocumentsMenu;
					
				@FindBy(xpath="//*[@id='601']/span")
				private static WebElement  listingOfDocuments;
				
				@FindBy(xpath="//*[@id='602']/span")
				private static WebElement listingOfDocumentsByDueDate;
						
				@FindBy(xpath="//*[@id='603']/span")
				private static WebElement  ageingOfPendingDocuments;
				
				@FindBy(xpath="//*[@id='604']/span")
				private static WebElement  ageingofPendingDocumentsByDueDate;
				
				@FindBy(xpath="//*[@id='624']/span")
				private static WebElement  linkChainAnalysis;
				
				@FindBy(xpath="//*[@id='657']/span")
				private static WebElement  pendingVoucherReport;
			
			@FindBy(xpath="//*[@id='201']/span")
			private static WebElement  quotationAnalysis;
			
			@FindBy(xpath="//*[@id='555']/span")
			private static WebElement  purchasesQuotation;
			
			@FindBy(xpath="//*[@id='556']/span")
			private static WebElement  salesQuotation;
			
			@FindBy(xpath="//*[@id='574']/span")
			private static WebElement  lowestQuotation;
			
			@FindBy(xpath="//*[@id='553']/span")
			private static WebElement  purchasesOrders;		
			
			@FindBy(xpath="//*[@id='554']/span")
			private static WebElement  salesOrders;
			
	///////////////////////////////////////////////////////////////////
			
	
	// Item Query Elements
			
	@FindBy(xpath="//input[@id='productQuery']")
	private static WebElement IQ_ItemTxt;
	
	@FindBy(xpath="//button[contains(text(),'GetStock')]")
	private static WebElement IQ_getStockBtn;
	
	@FindBy(xpath="//button[contains(text(),'Customize')]")
	private static WebElement IQ_customizeBtn;
	
	@FindBy(xpath="//span[@id='id_productquery_button_clear']")
	private static WebElement IQ_clearBtn;
	
	@FindBy(xpath="//span[@id='id_productquery_button_close']")
	private static WebElement IQ_closeBtn;
	
	@FindBy(xpath="//label[contains(text(),'Opening Stock Quantity:')]")
	private static WebElement IQ_OpeningStockQtyLable;
	
	@FindBy(xpath="//label[contains(text(),'Pending purchases orders :')]")
	private static WebElement IQ_PendingPurchaseOrdersLable;
	
	@FindBy(xpath="//label[contains(text(),'Current Stock :')]")
	private static WebElement IQ_CurrentStockLable;
	
	@FindBy(xpath="//label[contains(text(),'Pending Sales Orders :')]")
	private static WebElement IQ_PendingSalesOrdersLable;
	
	@FindBy(xpath="//label[contains(text(),'Avg. Stock Rate :')]")
	private static WebElement IQ_AvgStockRateLable;
	
	@FindBy(xpath="//label[contains(text(),'Qty to be Ordered :')]")
	private static WebElement IQ_QtytobeOrderedLable;
	
	@FindBy(xpath="//label[contains(text(),'Base Unit :')]")
	private static WebElement IQ_BaseUnitLable;
	
	@FindBy(xpath="//label[contains(text(),'Value :')]")
	private static WebElement IQ_ValueLable;
	
	@FindBy(xpath="//table[@id='purchaseTable']//th[contains(text(),'Date')]")
	private static WebElement IQ_PurDate;
	
	@FindBy(xpath="//table[@id='purchaseTable']//th[contains(text(),'Voucher No')]")
	private static WebElement IQ_PurVoucherNo;
	
	@FindBy(xpath="//th[contains(text(),'Vendor')]")
	private static WebElement IQ_PurVendor;
	
	@FindBy(xpath="//table[@id='purchaseTable']//th[contains(text(),'Quantity')]")
	private static WebElement IQ_PurQty;
	
	@FindBy(xpath="//table[@id='purchaseTable']//th[contains(text(),'Rate')]")
	private static WebElement IQ_PurRate;
	
	@FindBy(xpath="//table[@id='purchaseTable']//th[contains(text(),'Currency')]")
	private static WebElement IQ_PurCurrency;
	
	@FindBy(xpath="//table[@id='salesTable']//th[contains(text(),'Date')]")
	private static WebElement IQ_SaleDate;
	
	@FindBy(xpath="//table[@id='salesTable']//th[contains(text(),'Voucher No')]")
	private static WebElement IQ_SaleVoucherNo;
	
	@FindBy(xpath="//th[contains(text(),'Customer')]")
	private static WebElement IQ_SaleCustomer;
	
	@FindBy(xpath="//table[@id='salesTable']//th[contains(text(),'Quantity')]")
	private static WebElement IQ_SaleQty;
	
	@FindBy(xpath="//table[@id='salesTable']//th[contains(text(),'Rate')]")
	private static WebElement IQ_SaleRate;
	
	@FindBy(xpath="//table[@id='salesTable']//th[contains(text(),'Currency')]")
	private static WebElement IQ_SaleCurrency;
	
	@FindBy(xpath="//span[@id='openingStock']")
	private static WebElement IQ_OpeningStockQuantity;
	
	@FindBy(xpath="//span[@id='currentStock']")
	private static WebElement IQ_CurrentStock;
	
	@FindBy(xpath="//span[@id='avgStockRate']")
	private static WebElement IQ_AvgStockRate;
	
	@FindBy(xpath="//span[@id='value']")
	private static WebElement IQ_Value;
	
	@FindBy(xpath="//span[@id='iBaseUnit']")
	private static WebElement IQ_BaseUnit;
	
	@FindBy(xpath="//span[@id='purchaseOrdered']")
	private static WebElement IQ_PendingPurchaseOrders;
	
	@FindBy(xpath="//span[@id='salesOrdered']")
	private static WebElement IQ_PendingSalesOrders;
	
	@FindBy(xpath="//span[@id='quantityToBeOrdered']")
	private static WebElement IQ_QtyToBeOrdered;
	
	
	// Purchase Table
	
	@FindBy(xpath="//*[@id='purchaseTable']/tbody/tr[1]/td[1]")
	private static WebElement Pur1strow_1stColumn;
	
	@FindBy(xpath="//*[@id='purchaseTable']/tbody/tr[1]/td[2]")
	private static WebElement Pur1strow_2ndColumn;
	
	@FindBy(xpath="//*[@id='purchaseTable']/tbody/tr[1]/td[3]")
	private static WebElement Pur1strow_3rdColumn;
	
	@FindBy(xpath="//*[@id='purchaseTable']/tbody/tr[1]/td[4]")
	private static WebElement Pur1strow_4thColumn;
	
	@FindBy(xpath="//*[@id='purchaseTable']/tbody/tr[1]/td[5]")
	private static WebElement Pur1strow_5thColumn;
	
	@FindBy(xpath="//*[@id='purchaseTable']/tbody/tr[1]/td[6]")
	private static WebElement Pur1strow_6thColumn;
	
	
	
	@FindBy(xpath="//*[@id='purchaseTable']/tbody/tr[2]/td[1]")
	private static WebElement Pur2ndrow_1stColumn;
	
	@FindBy(xpath="//*[@id='purchaseTable']/tbody/tr[2]/td[2]")
	private static WebElement Pur2ndrow_2ndColumn;
	
	@FindBy(xpath="//*[@id='purchaseTable']/tbody/tr[2]/td[3]")
	private static WebElement Pur2ndrow_3rdColumn;
	
	@FindBy(xpath="//*[@id='purchaseTable']/tbody/tr[2]/td[4]")
	private static WebElement Pur2ndrow_4thColumn;
	
	@FindBy(xpath="//*[@id='purchaseTable']/tbody/tr[2]/td[5]")
	private static WebElement Pur2ndrow_5thColumn;
	
	@FindBy(xpath="//*[@id='purchaseTable']/tbody/tr[2]/td[6]")
	private static WebElement Pur2ndrow_6thColumn;
	
	
	
	@FindBy(xpath="//*[@id='purchaseTable']/tbody/tr[3]/td[1]")
	private static WebElement Pur3rdrow_1stColumn;
	
	@FindBy(xpath="//*[@id='purchaseTable']/tbody/tr[3]/td[2]")
	private static WebElement Pur3rdrow_2ndColumn;
	
	@FindBy(xpath="//*[@id='purchaseTable']/tbody/tr[3]/td[3]")
	private static WebElement Pur3rdrow_3rdColumn;
	
	@FindBy(xpath="//*[@id='purchaseTable']/tbody/tr[3]/td[4]")
	private static WebElement Pur3rdrow_4thColumn;
	
	@FindBy(xpath="//*[@id='purchaseTable']/tbody/tr[3]/td[5]")
	private static WebElement Pur3rdrow_5thColumn;
	
	@FindBy(xpath="//*[@id='purchaseTable']/tbody/tr[3]/td[6]")
	private static WebElement Pur3rdrow_6thColumn;
	
	
	
	@FindBy(xpath="//td[contains(text(),'Quantity Purchased Till Date:')]")
	private static WebElement QtyPurchasedTillDate;
	
	@FindBy(xpath="//div[@class='form-group col-xs-12']//tr[4]//td[2]")
	private static WebElement PurTotal;
			
			
	
	
	
	
	@FindBy(xpath="//*[@id='tagWiseData']//tr[1]/td[2]")
	private static WebElement IQ_WH1stRow1stCol;
	
	@FindBy(xpath="//*[@id='tagWiseData']//tr[1]/td[3]")
	private static WebElement IQ_WH1stRow2ndCol;
	
	@FindBy(xpath="//*[@id='tagWiseData']//tr[1]/td[4]")
	private static WebElement IQ_WH1stRow3rdCol;
	
	@FindBy(xpath="//*[@id='tagWiseData']//tr[1]/td[5]")
	private static WebElement IQ_WH1stRow4thCol;
	
	
	
	@FindBy(xpath="//*[@id='tagWiseData']//tr[2]/td[2]")
	private static WebElement IQ_WH2ndRow1stCol;
	
	@FindBy(xpath="//*[@id='tagWiseData']//tr[2]/td[3]")
	private static WebElement IQ_WH2ndRow2ndCol;
	
	@FindBy(xpath="//*[@id='tagWiseData']//tr[2]/td[4]")
	private static WebElement IQ_WH2ndRow3rdCol;
	
	@FindBy(xpath="//*[@id='tagWiseData']//tr[2]/td[5]")
	private static WebElement IQ_WH2ndRow4thCol;
	
	
	
	
	@FindBy(xpath="//table[@id='BinTableData']//tr[1]/td[2]")
	private static WebElement iq_Bin1stRow1stCol;
	
	@FindBy(xpath="//table[@id='BinTableData']//tr[1]/td[3]")
	private static WebElement iq_Bin1stRow2ndCol;
	
	@FindBy(xpath="//table[@id='BinTableData']//tr[1]/td[4]")
	private static WebElement iq_Bin1stRow3rdCol;
	
	@FindBy(xpath="//table[@id='BinTableData']//tr[1]/td[5]")
	private static WebElement iq_Bin1stRow4thCol;
	
	
	@FindBy(xpath="//table[@id='BinTableData']//tr[2]/td[2]")
	private static WebElement iq_Bin2ndRow1stCol;
	
	@FindBy(xpath="//table[@id='BinTableData']//tr[2]/td[3]")
	private static WebElement iq_Bin2ndRow2ndCol;
	
	@FindBy(xpath="//table[@id='BinTableData']//tr[2]/td[4]")
	private static WebElement iq_Bin2ndRow3rdCol;
	
	@FindBy(xpath="//table[@id='BinTableData']//tr[2]/td[5]")
	private static WebElement iq_Bin2ndRow4thCol;
	
	
	@FindBy(xpath="//table[@id='BinTableData']//tr[3]/td[2]")
	private static WebElement iq_Bin3rdRow1stCol;
	
	@FindBy(xpath="//table[@id='BinTableData']//tr[3]/td[3]")
	private static WebElement iq_Bin3rdRow2ndCol;
	
	@FindBy(xpath="//table[@id='BinTableData']//tr[3]/td[4]")
	private static WebElement iq_Bin3rdRow3rdCol;
	
	@FindBy(xpath="//table[@id='BinTableData']//tr[3]/td[5]")
	private static WebElement iq_Bin3rdRow4thCol;
	
	
	
	/*@FindBy(xpath="//*[@id='1']/td[2]")
	private static WebElement WH1strow_2ndColumn;
	
	@FindBy(xpath="//*[@id='1']/td[3]")
	private static WebElement WH1strow_3rdColumn;
	
	@FindBy(xpath="//*[@id='1']/td[4]")
	private static WebElement WH1strow_4thColumn;
	
	@FindBy(xpath="//*[@id='1']/td[5]")
	private static WebElement WH1strow_5thColumn;
	
	@FindBy(xpath="//*[@id='1']/td[6]")
	private static WebElement WH1strow_6thColumn;*/
	
	
	
	/*@FindBy(xpath="//*[@id='2']/td[2]")
	private static WebElement WH2ndrow_2ndColumn;
	
	@FindBy(xpath="//*[@id='2']/td[3]")
	private static WebElement WH2ndrow_3rdColumn;
	
	@FindBy(xpath="//*[@id='2']/td[4]")
	private static WebElement WH2ndrow_4thColumn;
	
	@FindBy(xpath="//*[@id='2']/td[5]")
	private static WebElement WH2ndrow_5thColumn;
	
	@FindBy(xpath="//*[@id='2']/td[6]")
	private static WebElement WH2ndrow_6thColumn;
	
	
	
	
	@FindBy(xpath="//*[@id='7']/td[2]")
	private static WebElement WH3rdrow_2ndColumn;
	
	@FindBy(xpath="//*[@id='7']/td[3]")
	private static WebElement WH3rdrow_3rdColumn;
	
	@FindBy(xpath="//*[@id='7']/td[4]")
	private static WebElement WH3rdrow_4thColumn;
	
	@FindBy(xpath="//*[@id='7']/td[5]")
	private static WebElement WH3rdrow_5thColumn;
	
	@FindBy(xpath="//*[@id='7']/td[6]")
	private static WebElement WH3rdrow_6thColumn;*/
	
	
	
	@FindBy(xpath="//*[@id='tagWiseData']/tbody/tr[4]/td[2]")
	private static WebElement WHStockTotal;
	
	@FindBy(xpath="//*[@id='tagWiseData']/tbody/tr[4]/td[4]")
	private static WebElement WHValueTotal;
	
	// Balance by bins
	
	@FindBy (xpath="//div[@id='PrdtDetails']/div[4]/div/span")
	private static WebElement BalancebyBinsExpandBtn;
	
	
	@FindBy (xpath="//span[@id='ProdQuery_ShowSellandBuyRatesPopup']")
	private static WebElement sellingRatesAndBuyingRateExpansionBtn;
	
	///////////////////////////////////////
	
	
	
	// Stock Ledger Elements 
	
	@FindBy(xpath="//div[@id='spnhiererchy']//select[@id='iTreeId']")
	private static WebElement sl_Dropdown1;
	
	@FindBy(xpath="//div[@id='spnhiererchy']//select[@id='iTreeViewId']")
	private static WebElement sl_Dropdown2;
	
	@FindBy(xpath="//label[@id='oncheckaccorderan']")
	private static WebElement sl_oncheckBtn;
	
	@FindBy(xpath="//input[@id='txtsrch-term']")
	private static WebElement sl_SearchItemTxt;
	
	@FindBy(xpath="//i[contains(@class,'icon-search theme_color-inverse')]")
	private static WebElement sl_SearchBtn;
	
	@FindBy(xpath="//input[@id='cmbUserTypeMaster']")
	private static WebElement sl_MasterTypeTxt;
	
	@FindBy(xpath="//span[contains(@class,'icon-font6 icon-external-module theme_icon-color')]")
	private static WebElement sl_AutoAdjustColumnsBtn;
	
	/*@FindBy(xpath="//a[contains(@class,'clsMasterName')][contains(text(),'ITEMS GROUP')]")
	private static WebElement sl_SearchItemTxt;*/

	@FindBy(xpath="//input[@id='txtsrch-term']")
	private static WebElement sl_SearhItemTxt;
	
	@FindBy(xpath="//a[contains(@class,'clsMasterName')][contains(text(),'ITEMS GROUP')]")
	private static WebElement sl_ItemGroupsBtn;
	
	@FindBy(xpath="//input[@id='liSelectAllMasters']")
	private static WebElement sl_HeaderSelectChkBox;
	
	@FindBy(xpath="//i[contains(@class,'icon-font6 icon-schedule')]")
	private static WebElement sl_ScheduleBtn;
	
	@FindBy(xpath="//i[contains(@class,'icon-font6 icon-custamize')]")
	private static WebElement sl_CustomizeBtn;
	
	@FindBy(xpath="//i[contains(@class,'icon-font6 icon-filter')]")
	private static WebElement sl_FilterBtn;
	
	@FindBy(xpath="//i[contains(@class,'icon-font6 icon-ok')]")
	private static WebElement sl_OkBtn;
	
	@FindBy(xpath="//i[contains(@class,'icon-font6 icon-close')]")
	private static WebElement sl_CloseBtn;
	
	@FindBy(xpath="//select[@id='DateOptions_']")
	private static WebElement sl_DateOptionDropdown;
	
	@FindBy(xpath="//input[@id='id_starting_date_']")
	private static WebElement sl_StartDateTxt;
	
	@FindBy(xpath="//td[@id='id_starting_date__input_image']//span[contains(@class,'icon-calender theme_color-inverse datecontrol_arrow_margin datecontrol_arrow')]")
	private static WebElement sl_StartDateCalanderBtn;
	
	@FindBy(xpath="//input[@id='id_ending_date_']")
	private static WebElement sl_EndDateTxt;
	
	@FindBy(xpath="//td[@id='id_ending_date__input_image']//span[contains(@class,'icon-calender theme_color-inverse datecontrol_arrow_margin datecontrol_arrow')]")
	private static WebElement sl_EndDateCalanderBtn;
	
	@FindBy(xpath="//*[@id='MasterSingle__101']")
	private static WebElement sl_WarehouseTxt;
	
	@FindBy(xpath="//*[@id='MasterGroup__101']")
	private static WebElement sl_AgeingAnalysisWarehouseTxt;
	
	@FindBy(xpath="//*[@id='RITCheckbox__6']")
	private static WebElement sl_IgnoreInternalTransferForAgeingChkbox;
	
	@FindBy(xpath="//*[@id='RITCombobox__2']")
	private static WebElement sl_ReportingLevelDropdown;
	
	@FindBy(xpath="//*[@id='RITCheckbox__4']")
	private static WebElement sl_DisplayLinearReportChkbox;
	
	@FindBy(xpath="//*[@id='RITCombobox__1']")
	private static WebElement sl_StockValuationDropdown;
	
	@FindBy(xpath="//*[@id='RITCombobox__1']")
	private static WebElement sl_StockTypeDropdown;
	
	@FindBy(xpath="//input[@id='RITCheckbox__3']")
	private static WebElement sl_IncludeServiceTypeItemChkBox;
	
	@FindBy(xpath="//input[@id='RITCheckbox__9']")
	private static WebElement sl_AgeingIncludeServiceTypeItemChkBox;
	
	@FindBy(xpath="//select[@id='RITLayout_']")
	private static WebElement sl_LayoutDropdown;
	
	@FindBy(xpath="//select[@id='RITOutput_']")
	private static WebElement sl_OutputDropdown;
	
	@FindBy(xpath="//input[@id='selectAllMasters_']")
	private static WebElement sl_SelectAllItemsChkBox;
	
	@FindBy(xpath="//div[contains(@class,'first')]//input[contains(@class,'btn btn-xs Fbutton')]")
	private static WebElement sl_FirstBtn;
	
	@FindBy(xpath="//div[contains(@class,'prev')]//input[contains(@class,'btn btn-xs Fbutton')]")
	private static WebElement sl_PreviousBtn;
	
	@FindBy(xpath="//input[@id='btn1']")
	private static WebElement sl_PageBtn;
	
	@FindBy(xpath="//div[contains(@class,'next')]//input[contains(@class,'btn btn-xs Fbutton')]")
	private static WebElement sl_NextBtn;
	
	@FindBy(xpath="//div[contains(@class,'End')]//input[contains(@class,'btn btn-xs Fbutton')]")
	private static WebElement sl_EndBtn;
	
	@FindBy(xpath="//tr[1]//td[8]//div[1]//label[1]//input")
	private static WebElement sl_1stRowChkBox;
	
	@FindBy(xpath="//tr[2]//td[8]//div[1]//label[1]//input")
	private static WebElement sl_2ndRowChkBox;
	
	@FindBy(xpath="//tr[3]//td[8]//div[1]//label[1]//input")
	private static WebElement sl_3rdRowChkBox;
	
	@FindBy(xpath="//tr[4]//td[8]//div[1]//label[1]//input")
	private static WebElement sl_4thRowChkBox;
	
	
	////////
	
	@FindBy(xpath="//span[@id='reportSort']")
	private static WebElement report_sortingBtn;
			
	@FindBy(xpath="//span[@id='reportRefresh']")
	private static WebElement report_RefreshBtn;
			
	@FindBy(xpath="//span[@id='print_report_']")
	private static WebElement report_PrintBtn;
			
	@FindBy(xpath="//span[@class='dropdown']")
	private static WebElement report_ExportBtn;
			
	@FindBy(xpath="//span[@id='GraphIcon']")
	private static WebElement report_GraphBtn;
			
	@FindBy(xpath="//span[@id='BackTrackIcon']")
	private static WebElement report_BackTrackBtn;
			
	@FindBy(xpath="//span[@id='reportCustomize']")
	private static WebElement report_ReportCustomizeBtn;
			
	@FindBy(xpath="//span[@id='filterIcon']")
	private static WebElement report_FilterBtn;
			
	@FindBy(xpath="//div[@id='dvfilter']//span[contains(@class,'icon-down-arrow icon-font8 dropdown-toggle theme_button_color')]")
	private static WebElement report_FilterDownBtn;
			
	@FindBy(xpath="//span[@id='analyzeIcon']")
	private static WebElement report_AnalyzeBtn;
			
	@FindBy(xpath="//span[@id='CrossrefrenceIcon']")
	private static WebElement report_CrossReferenceBtn;
			
	@FindBy(xpath="//span[contains(text(),'Options')]")
	private static WebElement report_OptionsBtn;
			
	@FindBy(xpath="//div[@id='dvoptions']//span[contains(@class,'icon-down-arrow icon-font8 dropdown-toggle theme_button_color')]")
	private static WebElement report_OptionsDownBtn;
			
	@FindBy(xpath="//span[@id='reportClose_']//i[@class='icon-font6 icon-close']")
	private static WebElement report_CloseBtn;
			
	@FindBy(xpath="//button[@id='frstPage_']")
	private static WebElement report_FirstBtn;
			
	@FindBy(xpath="//button[@id='prvPage_']")
	private static WebElement report_PreviousBtn;
			
	@FindBy(xpath="//button[@id='pgnumber_']")
	private static WebElement report_PageNoBtn;
			
	@FindBy(xpath="//button[@id='nxtPage_']")
	private static WebElement report_NextBtn;
			
	@FindBy(xpath="//button[@id='lstPage_']")
	private static WebElement report_LastBtn;
	
	@FindBy(xpath="//input[@id='txtSearchReport']")
	private static WebElement report_SearchTxt;
	
	
	
	@FindBy(xpath="//*[@id='trRender_0']/td[1]")
	private static WebElement sl_1stRow1stCol;
			
	@FindBy(xpath="//tr[@id='trRender_0']/td[2]")
	private static WebElement sl_1stRow2ndCol;
	
	@FindBy(xpath="//*[@id='trRender_0']/td[3]")
	private static WebElement sl_1stRow3rdCol;
	
	@FindBy(xpath="//*[@id='trRender_0']/td[4]")
	private static WebElement sl_1stRow4thCol;
	
	@FindBy(xpath="//*[@id='trRender_0']/td[5]")
	private static WebElement sl_1stRow5thCol;
	
	@FindBy(xpath="//*[@id='trRender_0']/td[6]")
	private static WebElement sl_1stRow6thCol;
	
	@FindBy(xpath="//*[@id='trRender_0']/td[7]")
	private static WebElement sl_1stRow7thCol;
	
	@FindBy(xpath="//*[@id='trRender_0']/td[8]")
	private static WebElement sl_1stRow8thCol;
	
	@FindBy(xpath="//*[@id='trRender_0']/td[9]")
	private static WebElement sl_1stRow9thCol;
	
	@FindBy(xpath="//*[@id='trRender_0']/td[10]")
	private static WebElement sl_1stRow10thCol;
	
	@FindBy(xpath="//*[@id='trRender_0']/td[11]")
	private static WebElement sl_1stRow11thCol;
	
	@FindBy(xpath="//*[@id='trRender_0']/td[12]")
	private static WebElement sl_1stRow12thCol;
	
	@FindBy(xpath="//*[@id='trRender_0']/td[13]")
	private static WebElement sl_1stRow13thCol;
	
	@FindBy(xpath="//*[@id='trRender_0']/td[14]")
	private static WebElement sl_1stRow14thCol;
	
	@FindBy(xpath="//*[@id='trRender_0']/td[15]")
	private static WebElement sl_1stRow15thCol;
	
	@FindBy(xpath="//*[@id='trRender_0']/td[16]")
	private static WebElement sl_1stRow16thCol;
	
	@FindBy(xpath="//*[@id='trRender_0']/td[17]")
	private static WebElement sl_1stRow17thCol;
	
	@FindBy(xpath="//*[@id='trRender_0']/td[18]")
	private static WebElement sl_1stRow18thCol;
	
	@FindBy(xpath="//*[@id='trRender_0']/td[19]")
	private static WebElement sl_1stRow19thCol;
	
	@FindBy(xpath="//*[@id='trRender_0']/td[20]")
	private static WebElement sl_1stRow20thCol;
	
	
	
	@FindBy(xpath="//*[@id='trRender_1']/td[1]")
	private static WebElement sl_2ndRow1stCol;
			
	@FindBy(xpath="//*[@id='trRender_1']/td[2]")
	private static WebElement sl_2ndRow2ndCol;
	
	@FindBy(xpath="//*[@id='trRender_1']/td[3]")
	private static WebElement sl_2ndRow3rdCol;
	
	@FindBy(xpath="//*[@id='trRender_1']/td[4]")
	private static WebElement sl_2ndRow4thCol;
	
	@FindBy(xpath="//*[@id='trRender_1']/td[5]")
	private static WebElement sl_2ndRow5thCol;
	
	@FindBy(xpath="//*[@id='trRender_1']/td[6]")
	private static WebElement sl_2ndRow6thCol;
	
	@FindBy(xpath="//*[@id='trRender_1']/td[7]")
	private static WebElement sl_2ndRow7thCol;
	
	@FindBy(xpath="//*[@id='trRender_1']/td[8]")
	private static WebElement sl_2ndRow8thCol;
	
	@FindBy(xpath="//*[@id='trRender_1']/td[9]")
	private static WebElement sl_2ndRow9thCol;
	
	@FindBy(xpath="//*[@id='trRender_1']/td[10]")
	private static WebElement sl_2ndRow10thCol;
	
	@FindBy(xpath="//*[@id='trRender_1']/td[11]")
	private static WebElement sl_2ndRow11thCol;
	
	@FindBy(xpath="//*[@id='trRender_1']/td[12]")
	private static WebElement sl_2ndRow12thCol;
	
	@FindBy(xpath="//*[@id='trRender_1']/td[13]")
	private static WebElement sl_2ndRow13thCol;
	
	@FindBy(xpath="//*[@id='trRender_1']/td[14]")
	private static WebElement sl_2ndRow14thCol;
	
	@FindBy(xpath="//*[@id='trRender_1']/td[15]")
	private static WebElement sl_2ndRow15thCol;
	
	@FindBy(xpath="//*[@id='trRender_1']/td[16]")
	private static WebElement sl_2ndRow16thCol;
	
	@FindBy(xpath="//*[@id='trRender_1']/td[17]")
	private static WebElement sl_2ndRow17thCol;
	
	@FindBy(xpath="//*[@id='trRender_1']/td[18]")
	private static WebElement sl_2ndRow18thCol;
	
	@FindBy(xpath="//*[@id='trRender_1']/td[19]")
	private static WebElement sl_2ndRow19thCol;
	
	@FindBy(xpath="//*[@id='trRender_1']/td[20]")
	private static WebElement sl_2ndRow20thCol;
	
	
	
	
	
	@FindBy(xpath="//*[@id='trRender_2']/td[1]")
	private static WebElement sl_3rdRow1stCol;
			
	@FindBy(xpath="//*[@id='trRender_2']/td[2]")
	private static WebElement sl_3rdRow2ndCol;
	
	@FindBy(xpath="//*[@id='trRender_2']/td[3]")
	private static WebElement sl_3rdRow3rdCol;
	
	@FindBy(xpath="//*[@id='trRender_2']/td[4]")
	private static WebElement sl_3rdRow4thCol;
	
	@FindBy(xpath="//*[@id='trRender_2']/td[5]")
	private static WebElement sl_3rdRow5thCol;
	
	@FindBy(xpath="//*[@id='trRender_2']/td[6]")
	private static WebElement sl_3rdRow6thCol;
	
	@FindBy(xpath="//*[@id='trRender_2']/td[7]")
	private static WebElement sl_3rdRow7thCol;
	
	@FindBy(xpath="//*[@id='trRender_2']/td[8]")
	private static WebElement sl_3rdRow8thCol;
	
	@FindBy(xpath="//*[@id='trRender_2']/td[9]")
	private static WebElement sl_3rdRow9thCol;
	
	@FindBy(xpath="//*[@id='trRender_2']/td[10]")
	private static WebElement sl_3rdRow10thCol;
	
	@FindBy(xpath="//*[@id='trRender_2']/td[11]")
	private static WebElement sl_3rdRow11thCol;
	
	@FindBy(xpath="//*[@id='trRender_2']/td[12]")
	private static WebElement sl_3rdRow12thCol;
	
	@FindBy(xpath="//*[@id='trRender_2']/td[13]")
	private static WebElement sl_3rdRow13thCol;
	
	@FindBy(xpath="//*[@id='trRender_2']/td[14]")
	private static WebElement sl_3rdRow14thCol;
	
	@FindBy(xpath="//*[@id='trRender_2']/td[15]")
	private static WebElement sl_3rdRow15thCol;
	
	@FindBy(xpath="//*[@id='trRender_2']/td[16]")
	private static WebElement sl_3rdRow16thCol;
	
	@FindBy(xpath="//*[@id='trRender_2']/td[17]")
	private static WebElement sl_3rdRow17thCol;
	
	@FindBy(xpath="//*[@id='trRender_2']/td[18]")
	private static WebElement sl_3rdRow18thCol;
	
	@FindBy(xpath="//*[@id='trRender_2']/td[19]")
	private static WebElement sl_3rdRow19thCol;
	
	@FindBy(xpath="//*[@id='trRender_2']/td[20]")
	private static WebElement sl_3rdRow20thCol;
	
	
	
	
	@FindBy(xpath="//*[@id='trRender_3']/td[1]")
	private static WebElement sl_4thRow1stCol;
			
	@FindBy(xpath="//*[@id='trRender_3']/td[2]")
	private static WebElement sl_4thRow2ndCol;
	
	@FindBy(xpath="//*[@id='trRender_3']/td[3]")
	private static WebElement sl_4thRow3rdCol;
	
	@FindBy(xpath="//*[@id='trRender_3']/td[4]")
	private static WebElement sl_4thRow4thCol;
	
	@FindBy(xpath="//*[@id='trRender_3']/td[5]")
	private static WebElement sl_4thRow5thCol;
	
	@FindBy(xpath="//*[@id='trRender_3']/td[6]")
	private static WebElement sl_4thRow6thCol;
	
	@FindBy(xpath="//*[@id='trRender_3']/td[7]")
	private static WebElement sl_4thRow7thCol;
	
	@FindBy(xpath="//*[@id='trRender_3']/td[8]")
	private static WebElement sl_4thRow8thCol;
	
	@FindBy(xpath="//*[@id='trRender_3']/td[9]")
	private static WebElement sl_4thRow9thCol;
	
	@FindBy(xpath="//*[@id='trRender_3']/td[10]")
	private static WebElement sl_4thRow10thCol;
	
	@FindBy(xpath="//*[@id='trRender_3']/td[11]")
	private static WebElement sl_4thRow11thCol;
	
	@FindBy(xpath="//*[@id='trRender_3']/td[12]")
	private static WebElement sl_4thRow12thCol;
	
	@FindBy(xpath="//*[@id='trRender_3']/td[13]")
	private static WebElement sl_4thRow13thCol;
	
	@FindBy(xpath="//*[@id='trRender_3']/td[14]")
	private static WebElement sl_4thRow14thCol;
	
	@FindBy(xpath="//*[@id='trRender_3']/td[15]")
	private static WebElement sl_4thRow15thCol;
	
	@FindBy(xpath="//*[@id='trRender_3']/td[16]")
	private static WebElement sl_4thRow16thCol;
	
	@FindBy(xpath="//*[@id='trRender_3']/td[17]")
	private static WebElement sl_4thRow17thCol;
	
	@FindBy(xpath="//*[@id='trRender_3']/td[18]")
	private static WebElement sl_4thRow18thCol;
	
	@FindBy(xpath="//*[@id='trRender_3']/td[19]")
	private static WebElement sl_4thRow19thCol;
	
	@FindBy(xpath="//*[@id='trRender_3']/td[20]")
	private static WebElement sl_4thRow20thCol;
	
	
	
	
	
	@FindBy(xpath="//*[@id='trRender_4']/td[1]")
	private static WebElement sl_5thRow1stCol;
			
	@FindBy(xpath="//*[@id='trRender_4']/td[2]")
	private static WebElement sl_5thRow2ndCol;
	
	@FindBy(xpath="//*[@id='trRender_4']/td[3]")
	private static WebElement sl_5thRow3rdCol;
	
	@FindBy(xpath="//*[@id='trRender_4']/td[4]")
	private static WebElement sl_5thRow4thCol;
	
	@FindBy(xpath="//*[@id='trRender_4']/td[5]")
	private static WebElement sl_5thRow5thCol;
	
	@FindBy(xpath="//*[@id='trRender_4']/td[6]")
	private static WebElement sl_5thRow6thCol;
	
	@FindBy(xpath="//*[@id='trRender_4']/td[7]")
	private static WebElement sl_5thRow7thCol;
	
	@FindBy(xpath="//*[@id='trRender_4']/td[8]")
	private static WebElement sl_5thRow8thCol;
	
	@FindBy(xpath="//*[@id='trRender_4']/td[9]")
	private static WebElement sl_5thRow9thCol;
	
	@FindBy(xpath="//*[@id='trRender_4']/td[10]")
	private static WebElement sl_5thRow10thCol;
	
	@FindBy(xpath="//*[@id='trRender_4']/td[11]")
	private static WebElement sl_5thRow11thCol;
	
	@FindBy(xpath="//*[@id='trRender_4']/td[12]")
	private static WebElement sl_5thRow12thCol;
	
	@FindBy(xpath="//*[@id='trRender_4']/td[13]")
	private static WebElement sl_5thRow13thCol;
	
	@FindBy(xpath="//*[@id='trRender_4']/td[14]")
	private static WebElement sl_5thRow14thCol;
	
	@FindBy(xpath="//*[@id='trRender_4']/td[15]")
	private static WebElement sl_5thRow15thCol;
	
	@FindBy(xpath="//*[@id='trRender_4']/td[16]")
	private static WebElement sl_5thRow16thCol;
	
	@FindBy(xpath="//*[@id='trRender_4']/td[17]")
	private static WebElement sl_5thRow17thCol;
	
	@FindBy(xpath="//*[@id='trRender_4']/td[18]")
	private static WebElement sl_5thRow18thCol;
	
	@FindBy(xpath="//*[@id='trRender_4']/td[19]")
	private static WebElement sl_5thRow19thCol;
	
	@FindBy(xpath="//*[@id='trRender_4']/td[20]")
	private static WebElement sl_5thRow20thCol;
	
	
	
	
	
	@FindBy(xpath="//*[@id='trRender_5']/td[1]")
	private static WebElement sl_6thRow1stCol;
			
	@FindBy(xpath="//*[@id='trRender_5']/td[2]")
	private static WebElement sl_6thRow2ndCol;
	
	@FindBy(xpath="//*[@id='trRender_5']/td[3]")
	private static WebElement sl_6thRow3rdCol;
	
	@FindBy(xpath="//*[@id='trRender_5']/td[4]")
	private static WebElement sl_6thRow4thCol;
	
	@FindBy(xpath="//*[@id='trRender_5']/td[5]")
	private static WebElement sl_6thRow5thCol;
	
	@FindBy(xpath="//*[@id='trRender_5']/td[6]")
	private static WebElement sl_6thRow6thCol;
	
	@FindBy(xpath="//*[@id='trRender_5']/td[7]")
	private static WebElement sl_6thRow7thCol;
	
	@FindBy(xpath="//*[@id='trRender_5']/td[8]")
	private static WebElement sl_6thRow8thCol;
	
	@FindBy(xpath="//*[@id='trRender_5']/td[9]")
	private static WebElement sl_6thRow9thCol;
	
	@FindBy(xpath="//*[@id='trRender_5']/td[10]")
	private static WebElement sl_6thRow10thCol;
	
	@FindBy(xpath="//*[@id='trRender_5']/td[11]")
	private static WebElement sl_6thRow11thCol;
	
	@FindBy(xpath="//*[@id='trRender_5']/td[12]")
	private static WebElement sl_6thRow12thCol;
	
	@FindBy(xpath="//*[@id='trRender_5']/td[13]")
	private static WebElement sl_6thRow13thCol;
	
	@FindBy(xpath="//*[@id='trRender_5']/td[14]")
	private static WebElement sl_6thRow14thCol;
	
	@FindBy(xpath="//*[@id='trRender_5']/td[15]")
	private static WebElement sl_6thRow15thCol;
	
	@FindBy(xpath="//*[@id='trRender_5']/td[16]")
	private static WebElement sl_6thRow16thCol;
	
	@FindBy(xpath="//*[@id='trRender_5']/td[17]")
	private static WebElement sl_6thRow17thCol;
	
	@FindBy(xpath="//*[@id='trRender_5']/td[18]")
	private static WebElement sl_6thRow18thCol;
	
	@FindBy(xpath="//*[@id='trRender_5']/td[19]")
	private static WebElement sl_6thRow19thCol;
	
	@FindBy(xpath="//*[@id='trRender_5']/td[20]")
	private static WebElement sl_6thRow20thCol;
	
	
	
	
	
	
	
	@FindBy(xpath="//*[@id='trRender_7']/td[1]")
	private static WebElement sl_7thRow1stCol;
			
	@FindBy(xpath="//*[@id='trRender_7']/td[2]")
	private static WebElement sl_7thRow2ndCol;
	
	@FindBy(xpath="//*[@id='trRender_7']/td[3]")
	private static WebElement sl_7thRow3rdCol;
	
	@FindBy(xpath="//*[@id='trRender_7']/td[4]")
	private static WebElement sl_7thRow4thCol;
	
	@FindBy(xpath="//*[@id='trRender_7']/td[5]")
	private static WebElement sl_7thRow5thCol;
	
	@FindBy(xpath="//*[@id='trRender_7']/td[6]")
	private static WebElement sl_7thRow6thCol;
	
	@FindBy(xpath="//*[@id='trRender_7']/td[7]")
	private static WebElement sl_7thRow7thCol;
	
	@FindBy(xpath="//*[@id='trRender_7']/td[8]")
	private static WebElement sl_7thRow8thCol;
	
	@FindBy(xpath="//*[@id='trRender_7']/td[9]")
	private static WebElement sl_7thRow9thCol;
	
	@FindBy(xpath="//*[@id='trRender_7']/td[10]")
	private static WebElement sl_7thRow10thCol;

	@FindBy(xpath="//*[@id='trRender_7']/td[11]")
	private static WebElement sl_7thRow11thCol;
	
	@FindBy(xpath="//*[@id='trRender_7']/td[12]")
	private static WebElement sl_7thRow12thCol;
	
	@FindBy(xpath="//*[@id='trRender_7']/td[13]")
	private static WebElement sl_7thRow13thCol;
	
	@FindBy(xpath="//*[@id='trRender_7']/td[14]")
	private static WebElement sl_7thRow14thCol;
	
	@FindBy(xpath="//*[@id='trRender_7']/td[15]")
	private static WebElement sl_7thRow15thCol;
	
	@FindBy(xpath="//*[@id='trRender_7']/td[16]")
	private static WebElement sl_7thRow16thCol;
	
	@FindBy(xpath="//*[@id='trRender_7']/td[17]")
	private static WebElement sl_7thRow17thCol;
	
	
	
	@FindBy(xpath="//*[@id='trRender_8']/td[1]")
	private static WebElement sl_8thRow1stCol;
			
	@FindBy(xpath="//*[@id='trRender_8']/td[2]")
	private static WebElement sl_8thRow2ndCol;
	
	@FindBy(xpath="//*[@id='trRender_8']/td[3]")
	private static WebElement sl_8thRow3rdCol;
	
	@FindBy(xpath="//*[@id='trRender_8']/td[4]")
	private static WebElement sl_8thRow4thCol;
	
	@FindBy(xpath="//*[@id='trRender_8']/td[5]")
	private static WebElement sl_8thRow5thCol;
	
	@FindBy(xpath="//*[@id='trRender_8']/td[6]")
	private static WebElement sl_8thRow6thCol;
	
	@FindBy(xpath="//*[@id='trRender_8']/td[7]")
	private static WebElement sl_8thRow7thCol;
	
	@FindBy(xpath="//*[@id='trRender_8']/td[8]")
	private static WebElement sl_8thRow8thCol;
	
	@FindBy(xpath="//*[@id='trRender_8']/td[9]")
	private static WebElement sl_8thRow9thCol;
	
	@FindBy(xpath="//*[@id='trRender_8']/td[10]")
	private static WebElement sl_8thRow10thCol;

	@FindBy(xpath="//*[@id='trRender_8']/td[11]")
	private static WebElement sl_8thRow11thCol;
	
	@FindBy(xpath="//*[@id='trRender_8']/td[12]")
	private static WebElement sl_8thRow12thCol;
	
	@FindBy(xpath="//*[@id='trRender_8']/td[13]")
	private static WebElement sl_8thRow13thCol;
	
	@FindBy(xpath="//*[@id='trRender_8']/td[14]")
	private static WebElement sl_8thRow14thCol;
	
	@FindBy(xpath="//*[@id='trRender_8']/td[15]")
	private static WebElement sl_8thRow15thCol;
	
	@FindBy(xpath="//*[@id='trRender_8']/td[16]")
	private static WebElement sl_8thRow16thCol;
	
	@FindBy(xpath="//*[@id='trRender_8']/td[17]")
	private static WebElement sl_8thRow17thCol;
	
	
	
	@FindBy(xpath="//*[@id='trRender_9']/td[1]")
	private static WebElement sl_9thRow1stCol;
			
	@FindBy(xpath="//*[@id='trRender_9']/td[2]")
	private static WebElement sl_9thRow2ndCol;
	
	@FindBy(xpath="//*[@id='trRender_9']/td[3]")
	private static WebElement sl_9thRow3rdCol;
	
	@FindBy(xpath="//*[@id='trRender_9']/td[4]")
	private static WebElement sl_9thRow4thCol;
	
	@FindBy(xpath="//*[@id='trRender_9']/td[5]")
	private static WebElement sl_9thRow5thCol;
	
	@FindBy(xpath="//*[@id='trRender_9']/td[6]")
	private static WebElement sl_9thRow6thCol;
	
	@FindBy(xpath="//*[@id='trRender_9']/td[7]")
	private static WebElement sl_9thRow7thCol;
	
	@FindBy(xpath="//*[@id='trRender_9']/td[8]")
	private static WebElement sl_9thRow8thCol;
	
	@FindBy(xpath="//*[@id='trRender_9']/td[9]")
	private static WebElement sl_9thRow9thCol;
	
	@FindBy(xpath="//*[@id='trRender_9']/td[10]")
	private static WebElement sl_9thRow10thCol;

	@FindBy(xpath="//*[@id='trRender_9']/td[11]")
	private static WebElement sl_9thRow11thCol;
	
	@FindBy(xpath="//*[@id='trRender_9']/td[12]")
	private static WebElement sl_9thRow12thCol;
	
	@FindBy(xpath="//*[@id='trRender_9']/td[13]")
	private static WebElement sl_9thRow13thCol;
	
	@FindBy(xpath="//*[@id='trRender_9']/td[14]")
	private static WebElement sl_9thRow14thCol;
	
	@FindBy(xpath="//*[@id='trRender_9']/td[15]")
	private static WebElement sl_9thRow15thCol;
	
	@FindBy(xpath="//*[@id='trRender_9']/td[16]")
	private static WebElement sl_9thRow16thCol;
	
	@FindBy(xpath="//*[@id='trRender_9']/td[17]")
	private static WebElement sl_9thRow17thCol;
	
	
	
	
	
	@FindBy(xpath="//*[@id='trRender_10']/td[1]")
	private static WebElement sl_10thRow1stCol;
			
	@FindBy(xpath="//*[@id='trRender_10']/td[2]")
	private static WebElement sl_10thRow2ndCol;
	
	@FindBy(xpath="//*[@id='trRender_10']/td[3]")
	private static WebElement sl_10thRow3rdCol;
	
	@FindBy(xpath="//*[@id='trRender_10']/td[4]")
	private static WebElement sl_10thRow4thCol;
	
	@FindBy(xpath="//*[@id='trRender_10']/td[5]")
	private static WebElement sl_10thRow5thCol;
	
	@FindBy(xpath="//*[@id='trRender_10']/td[6]")
	private static WebElement sl_10thRow6thCol;
	
	@FindBy(xpath="//*[@id='trRender_10']/td[7]")
	private static WebElement sl_10thRow7thCol;
	
	@FindBy(xpath="//*[@id='trRender_10']/td[8]")
	private static WebElement sl_10thRow8thCol;
	
	@FindBy(xpath="//*[@id='trRender_10']/td[9]")
	private static WebElement sl_10thRow9thCol;
	
	@FindBy(xpath="//*[@id='trRender_10']/td[10]")
	private static WebElement sl_10thRow10thCol;

	@FindBy(xpath="//*[@id='trRender_10']/td[11]")
	private static WebElement sl_10thRow11thCol;
	
	@FindBy(xpath="//*[@id='trRender_10']/td[12]")
	private static WebElement sl_10thRow12thCol;
	
	@FindBy(xpath="//*[@id='trRender_10']/td[13]")
	private static WebElement sl_10thRow13thCol;
	
	@FindBy(xpath="//*[@id='trRender_10']/td[14]")
	private static WebElement sl_10thRow14thCol;
	
	@FindBy(xpath="//*[@id='trRender_10']/td[15]")
	private static WebElement sl_10thRow15thCol;
	
	@FindBy(xpath="//*[@id='trRender_10']/td[16]")
	private static WebElement sl_10thRow16thCol;
	
	@FindBy(xpath="//*[@id='trRender_10']/td[17]")
	private static WebElement sl_10thRow17thCol;
	
	
	
	
	@FindBy(xpath="//*[@id='trRender_11']/td[1]")
	private static WebElement sl_11thRow1stCol;
			
	@FindBy(xpath="//*[@id='trRender_11']/td[2]")
	private static WebElement sl_11thRow2ndCol;
	
	@FindBy(xpath="//*[@id='trRender_11']/td[3]")
	private static WebElement sl_11thRow3rdCol;
	
	@FindBy(xpath="//*[@id='trRender_11']/td[4]")
	private static WebElement sl_11thRow4thCol;
	
	@FindBy(xpath="//*[@id='trRender_11']/td[5]")
	private static WebElement sl_11thRow5thCol;
	
	@FindBy(xpath="//*[@id='trRender_11']/td[6]")
	private static WebElement sl_11thRow6thCol;
	
	@FindBy(xpath="//*[@id='trRender_11']/td[7]")
	private static WebElement sl_11thRow7thCol;
	
	@FindBy(xpath="//*[@id='trRender_11']/td[8]")
	private static WebElement sl_11thRow8thCol;
	
	@FindBy(xpath="//*[@id='trRender_11']/td[9]")
	private static WebElement sl_11thRow9thCol;
	
	@FindBy(xpath="//*[@id='trRender_11']/td[10]")
	private static WebElement sl_11thRow10thCol;

	@FindBy(xpath="//*[@id='trRender_11']/td[11]")
	private static WebElement sl_11thRow11thCol;
	
	@FindBy(xpath="//*[@id='trRender_11']/td[12]")
	private static WebElement sl_11thRow12thCol;
	
	@FindBy(xpath="//*[@id='trRender_11']/td[13]")
	private static WebElement sl_11thRow13thCol;
	
	@FindBy(xpath="//*[@id='trRender_11']/td[14]")
	private static WebElement sl_11thRow14thCol;
	
	@FindBy(xpath="//*[@id='trRender_11']/td[15]")
	private static WebElement sl_11thRow15thCol;
	
	@FindBy(xpath="//*[@id='trRender_11']/td[16]")
	private static WebElement sl_11thRow16thCol;
	
	@FindBy(xpath="//*[@id='trRender_11']/td[17]")
	private static WebElement sl_11thRow17thCol;
	
	
	@FindBy(xpath="//*[@id='trRender_12']/td[1]")
	private static WebElement sl_12thRow1stCol;
			
	@FindBy(xpath="//*[@id='trRender_12']/td[2]")
	private static WebElement sl_12thRow2ndCol;
	
	@FindBy(xpath="//*[@id='trRender_12']/td[3]")
	private static WebElement sl_12thRow3rdCol;
	
	@FindBy(xpath="//*[@id='trRender_12']/td[4]")
	private static WebElement sl_12thRow4thCol;
	
	@FindBy(xpath="//*[@id='trRender_12']/td[5]")
	private static WebElement sl_12thRow5thCol;
	
	@FindBy(xpath="//*[@id='trRender_12']/td[6]")
	private static WebElement sl_12thRow6thCol;
	
	@FindBy(xpath="//*[@id='trRender_12']/td[7]")
	private static WebElement sl_12thRow7thCol;
	
	@FindBy(xpath="//*[@id='trRender_12']/td[8]")
	private static WebElement sl_12thRow8thCol;
	
	@FindBy(xpath="//*[@id='trRender_12']/td[9]")
	private static WebElement sl_12thRow9thCol;
	
	@FindBy(xpath="//*[@id='trRender_12']/td[10]")
	private static WebElement sl_12thRow10thCol;

	@FindBy(xpath="//*[@id='trRender_12']/td[11]")
	private static WebElement sl_12thRow11thCol;
	
	@FindBy(xpath="//*[@id='trRender_12']/td[12]")
	private static WebElement sl_12thRow12thCol;
	
	@FindBy(xpath="//*[@id='trRender_12']/td[13]")
	private static WebElement sl_12thRow13thCol;
	
	@FindBy(xpath="//*[@id='trRender_12']/td[14]")
	private static WebElement sl_12thRow14thCol;
	
	@FindBy(xpath="//*[@id='trRender_12']/td[15]")
	private static WebElement sl_12thRow15thCol;
	
	@FindBy(xpath="//*[@id='trRender_12']/td[16]")
	private static WebElement sl_12thRow16thCol;
	
	@FindBy(xpath="//*[@id='trRender_12']/td[17]")
	private static WebElement sl_12thRow17thCol;
	
	
	
	@FindBy(xpath="//*[@id='trRender_13']/td[1]")
	private static WebElement sl_13thRow1stCol;
			
	@FindBy(xpath="//*[@id='trRender_13']/td[2]")
	private static WebElement sl_13thRow2ndCol;
	
	@FindBy(xpath="//*[@id='trRender_13']/td[3]")
	private static WebElement sl_13thRow3rdCol;
	
	@FindBy(xpath="//*[@id='trRender_13']/td[4]")
	private static WebElement sl_13thRow4thCol;
	
	@FindBy(xpath="//*[@id='trRender_13']/td[5]")
	private static WebElement sl_13thRow5thCol;
	
	@FindBy(xpath="//*[@id='trRender_13']/td[6]")
	private static WebElement sl_13thRow6thCol;
	
	@FindBy(xpath="//*[@id='trRender_13']/td[7]")
	private static WebElement sl_13thRow7thCol;
	
	@FindBy(xpath="//*[@id='trRender_13']/td[8]")
	private static WebElement sl_13thRow8thCol;
	
	@FindBy(xpath="//*[@id='trRender_13']/td[9]")
	private static WebElement sl_13thRow9thCol;
	
	@FindBy(xpath="//*[@id='trRender_13']/td[10]")
	private static WebElement sl_13thRow10thCol;

	@FindBy(xpath="//*[@id='trRender_13']/td[11]")
	private static WebElement sl_13thRow11thCol;
	
	@FindBy(xpath="//*[@id='trRender_13']/td[12]")
	private static WebElement sl_13thRow12thCol;
	
	@FindBy(xpath="//*[@id='trRender_13']/td[13]")
	private static WebElement sl_13thRow13thCol;
	
	@FindBy(xpath="//*[@id='trRender_13']/td[14]")
	private static WebElement sl_13thRow14thCol;
	
	@FindBy(xpath="//*[@id='trRender_13']/td[15]")
	private static WebElement sl_13thRow15thCol;
	
	@FindBy(xpath="//*[@id='trRender_13']/td[16]")
	private static WebElement sl_13thRow16thCol;
	
	@FindBy(xpath="//*[@id='trRender_13']/td[17]")
	private static WebElement sl_13thRow17thCol;
	
	
	
	
	
	@FindBy(xpath="//*[@id='trRender_14']/td[1]")
	private static WebElement sl_14thRow1stCol;
			
	@FindBy(xpath="//*[@id='trRender_14']/td[2]")
	private static WebElement sl_14thRow2ndCol;
	
	@FindBy(xpath="//*[@id='trRender_14']/td[3]")
	private static WebElement sl_14thRow3rdCol;
	
	@FindBy(xpath="//*[@id='trRender_14']/td[4]")
	private static WebElement sl_14thRow4thCol;
	
	@FindBy(xpath="//*[@id='trRender_14']/td[5]")
	private static WebElement sl_14thRow5thCol;
	
	@FindBy(xpath="//*[@id='trRender_14']/td[6]")
	private static WebElement sl_14thRow6thCol;
	
	@FindBy(xpath="//*[@id='trRender_14']/td[7]")
	private static WebElement sl_14thRow7thCol;
	
	@FindBy(xpath="//*[@id='trRender_14']/td[8]")
	private static WebElement sl_14thRow8thCol;
	
	@FindBy(xpath="//*[@id='trRender_14']/td[9]")
	private static WebElement sl_14thRow9thCol;
	
	@FindBy(xpath="//*[@id='trRender_14']/td[10]")
	private static WebElement sl_14thRow10thCol;

	@FindBy(xpath="//*[@id='trRender_14']/td[11]")
	private static WebElement sl_14thRow11thCol;
	
	@FindBy(xpath="//*[@id='trRender_14']/td[12]")
	private static WebElement sl_14thRow12thCol;
	
	@FindBy(xpath="//*[@id='trRender_14']/td[13]")
	private static WebElement sl_14thRow13thCol;
	
	@FindBy(xpath="//*[@id='trRender_14']/td[14]")
	private static WebElement sl_14thRow14thCol;
	
	@FindBy(xpath="//*[@id='trRender_14']td[15]")
	private static WebElement sl_14thRow15thCol;
	
	@FindBy(xpath="//*[@id='trRender_14']/td[16]")
	private static WebElement sl_14thRow16thCol;
	
	@FindBy(xpath="//*[@id='trRender_14']/td[17]")
	private static WebElement sl_14thRow17thCol;
	
	
	
	@FindBy(xpath="//*[@id='trRender_15']/td[1]")
	private static WebElement sl_15thRow1stCol;
			
	@FindBy(xpath="//*[@id='trRender_15']/td[2]")
	private static WebElement sl_15thRow2ndCol;
	
	@FindBy(xpath="//*[@id='trRender_15']/td[3]")
	private static WebElement sl_15thRow3rdCol;
	
	@FindBy(xpath="//*[@id='trRender_15']/td[4]")
	private static WebElement sl_15thRow4thCol;
	
	@FindBy(xpath="//*[@id='trRender_15']/td[5]")
	private static WebElement sl_15thRow5thCol;
	
	@FindBy(xpath="//*[@id='trRender_15']/td[6]")
	private static WebElement sl_15thRow6thCol;
	
	@FindBy(xpath="//*[@id='trRender_15']/td[7]")
	private static WebElement sl_15thRow7thCol;
	
	@FindBy(xpath="//*[@id='trRender_15']/td[8]")
	private static WebElement sl_15thRow8thCol;
	
	@FindBy(xpath="//*[@id='trRender_15']/td[9]")
	private static WebElement sl_15thRow9thCol;
	
	@FindBy(xpath="//*[@id='trRender_15']/td[10]")
	private static WebElement sl_15thRow10thCol;

	@FindBy(xpath="//*[@id='trRender_15']/td[11]")
	private static WebElement sl_15thRow11thCol;
	
	@FindBy(xpath="//*[@id='trRender_15']/td[12]")
	private static WebElement sl_15thRow12thCol;
	
	
	
	/////////////////////////////////
	
	// Opening Stock Register Elements
	
	@FindBy (xpath="//li[@id='154']/a[2]")
	private static WebElement osr_ItemsGroupBtn;
	
	@FindBy(xpath="//select[@id='DateOptions_']")
	private static WebElement osr_dateOptionDropdown;
	
	@FindBy(xpath="//input[@id='id_starting_date_']")
	private static WebElement osr_StartDateTxt;
	
	@FindBy(xpath="//td[@id='id_starting_date__input_image']//span[@class='icon-calender theme_color-inverse datecontrol_arrow_margin datecontrol_arrow']")
	private static WebElement osr_startdateCalanderBtn;
	
	@FindBy(xpath="//input[@id='id_ending_date_']")
	private static WebElement osr_EndDateTxt;
	
	@FindBy(xpath="//td[@id='id_ending_date__input_image']//span[@class='icon-calender theme_color-inverse datecontrol_arrow_margin datecontrol_arrow']")
	private static WebElement osr_EndDateCalanderBtn;
	
	@FindBy(xpath="//select[@id='RITLayout_']")
	private static WebElement osr_layoutDropdown;
	
	@FindBy(xpath="//select[@id='RITOutput_']")
	private static WebElement osr_outputDropdown;
	
	@FindBy(xpath="//i[@class='icon-font6 icon-schedule']")
	private static WebElement osr_ScheduleBtn;
	
	@FindBy(xpath="//i[@class='icon-font6 icon-custamize']")
	private static WebElement osr_CustomizeBtn;
	
	@FindBy(xpath="//i[@class='icon-font6 icon-filter']")
	private static WebElement osr_FilterBtn;
	
	@FindBy(xpath="//i[@class='icon-font6 icon-ok']")
	private static WebElement osr_OkBtn;
	
	@FindBy(xpath="//i[@class='icon-font6 icon-close']")
	private static WebElement osr_CloseBtn;
	
	///////
	
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
	
	
	////////////////////////
	
	// Finance Reports Almost Common Some Fields Are Added Below
	
	@FindBy (xpath="//li[@id='18']/a[1]")
	private static WebElement assetsExpandOrCollepseBtn;
	
	@FindBy(xpath="//li[@id='18']/a[2]")
	private static WebElement assets;
	
	@FindBy(xpath="//li[@id='17']/a[2]")
	private static WebElement fixedAssets;
	
	@FindBy (xpath="//li[@id='23']/a[1]")
	private static WebElement currentAssetsExpandOrCollepseBtn;	
			
	@FindBy(xpath="//li[@id='23']/a[2]")
	private static WebElement currentAssets;
	
	@FindBy(xpath="//li[@id='8']/a[2]")
	private static WebElement cashAndBank;
	
	@FindBy(xpath="//li[@id='13']/a[2]")
	private static WebElement inventories;
	
	@FindBy(xpath="//li[@id='22']/a[2]")
	private static WebElement accountsReceivable;
	
	@FindBy (xpath="//li[@id='83']/a[2]")
	private static WebElement customerUpdateGroup;
	
	@FindBy(xpath="//li[@id='72']/a[2]")
	private static WebElement investments;
	
	@FindBy (xpath="//li[@id='25']/a[1]")
	private static WebElement expensesExpensionOrCollepseBtn;
	
	@FindBy(xpath="//li[@id='25']/a[2]")
	private static WebElement expenses;
	
	@FindBy(xpath="//li[@id='24']/a[2]")
	private static WebElement directExpenses;
	
	@FindBy (xpath="//li[@id='73']/a[1]")
	private static WebElement indirectExpensesExpandOrCollepseBtn; 
	
	@FindBy(xpath="//li[@id='73']/a[2]")
	private static WebElement indirectExpenses;
	
	@FindBy(xpath="//li[@id='54']/a[2]")
	private static WebElement administrativeExpenses;
	
	@FindBy(xpath="//li[@id='60']/a[2]")
	private static WebElement employeeBenefits;
	
	@FindBy(xpath="//li[@id='64']/a[2]")
	private static WebElement financialCharges;
	
	@FindBy(xpath="//li[@id='69']/a[2]")
	private static WebElement gainAndLoss;
	
	@FindBy(xpath="//li[@id='26']/a[2]")
	private static WebElement controlAccounts;
	
	@FindBy (xpath="//li[@id='29']/a[1]")
	private static WebElement revenueExpandOrCollepseBtn;
	
	@FindBy(xpath="//li[@id='29']/a[2]")
	private static WebElement revenue;
	
	@FindBy (xpath="//li[@id='28']/a[2]")
	private static WebElement sales;
	
	@FindBy (xpath="//li[@id='33']/a[1]")
	private static WebElement equitiesExpandOrCollepseBtn;
	
	@FindBy(xpath="//li[@id='33']/a[2]")
	private static WebElement equities;
	
	@FindBy (xpath="//li[@id='32']/a[2]")
	private static WebElement capital;
	
	@FindBy (xpath="//li[@id='39']/a[1]")
	private static WebElement liabilitiesExpandOrCollepseBtn;
	
	@FindBy (xpath="//li[@id='39']/a[2]")
	private static WebElement liabilities;
	
	@FindBy (xpath="//li[@id='38']/a[1]")
	private static WebElement loansAndBorrowingsExpandOrCollepseBtn;
	
	@FindBy (xpath="//li[@id='38']/a[2]")
	private static WebElement loansAndBorrowings;
	
	@FindBy (xpath="//li[@id='37']/a[2]")
	private static WebElement loans;
	
	@FindBy (xpath="//li[@id='42']/a[2]")
	private static WebElement accruedLiabilities;
	
	@FindBy (xpath="//li[@id='45']/a[2]")
	private static WebElement tradePayable;
	
	@FindBy (xpath="//li[@id='48']/a[2]")
	private static WebElement provisions;
	
	/////////////////////////////////////////////////////////////////////////
	
	
	@FindBy (xpath="//input[@id='txtSerialNo']")
	private static WebElement RMAPopupSerialNumberTxtField;

	@FindBy (xpath="//input[@id='txtQuantity']")
	private static WebElement RMAPopupQuantityTxtField;
	
	@FindBy (xpath="//div[@id='img_add']/span")
	private static WebElement RMAPopupAddBtn;
		
	@FindBy (xpath="//div[@id='Modal_Search_Body']/div[3]/label")
	private static WebElement RMAPopupNumberofItemsLabel;
	
	@FindBy (xpath="//label[@id='lblItems']")
	private static WebElement RMAPopupNumberOfItems;
	
	@FindBy (xpath="//th[@id='RMA_Table_control_heading_1']/div")
	private static WebElement RMAPopupTableHeadingRMA;
	
	@FindBy (xpath="//th[@id='RMA_Table_control_heading_2']/div")
	private static WebElement RMAPopupTableHeadingDocumentNo;
	
	@FindBy (xpath="//th[@id='RMA_Table_control_heading_3']/div")
	private static WebElement RMAPopupTableHeadingDocumentDate;
	
	@FindBy (xpath="//div[@id='RMAModel_Bottom']/div[1]/label")
	private static WebElement RMAPopupClearBtn;
	
	@FindBy (xpath="//div[@id='RMAModel_Bottom']/div[2]/label")
	private static WebElement RMAPopupOkBtn;
	
	@FindBy (xpath="//div[@id='RMAModel_Bottom']/div[3]/label")
	private static WebElement RMAPopupCancelBtn;
	
	@FindBy (xpath="//div[@id='Modal_Header']/div[2]/span/i")
	private static WebElement RMAPopupCloseBtn;
	
	@FindBy (xpath="//td[@id='RMA_Table_col_1-1']")
	private static WebElement RMAPopupTableRow1Column1;
	
	@FindBy (xpath="//td[@id='RMA_Table_col_2-1']")
	private static WebElement RMAPopupTableRow2Column1;
	
	@FindBy (xpath="//td[@id='RMA_Table_col_3-1']")
	private static WebElement RMAPopupTableRow3Column1;
	
	@FindBy (xpath="//td[@id='RMA_Table_col_4-1']")
	private static WebElement RMAPopupTableRow4Column1;
	
	@FindBy (xpath="//td[@id='RMA_Table_col_5-1']")
	private static WebElement RMAPopupTableRow5Column1;
	
	@FindBy (xpath="//td[@id='RMA_Table_col_6-1']")
	private static WebElement RMAPopupTableRow6Column1;
	
	@FindBy (xpath="//td[@id='RMA_Table_col_7-1']")
	private static WebElement RMAPopupTableRow7Column1;
	
	@FindBy (xpath="//td[@id='RMA_Table_col_8-1']")
	private static WebElement RMAPopupTableRow8Column1;
	
	@FindBy (xpath="//td[@id='RMA_Table_col_9-1']")
	private static WebElement RMAPopupTableRow9Column1;
	
	@FindBy (xpath="//td[@id='RMA_Table_col_10-1']")
	private static WebElement RMAPopupTableRow10Column1;
	
	@FindBy (xpath="//td[@id='RMA_Table_col_11-1']")
	private static WebElement RMAPopupTableRow11Column1;
	
	@FindBy (xpath="//td[@id='RMA_Table_col_12-1']")
	private static WebElement RMAPopupTableRow12Column1;
	
	@FindBy (xpath="//td[@id='RMA_Table_col_13-1']")
	private static WebElement RMAPopupTableRow13Column1;
	
	@FindBy (xpath="//td[@id='RMA_Table_col_14-1']")
	private static WebElement RMAPopupTableRow14Column1;
	
	@FindBy (xpath="//td[@id='RMA_Table_col_15-1']")
	private static WebElement RMAPopupTableRow15Column1;
	
	@FindBy (xpath="//td[@id='RMA_Table_col_16-1']")
	private static WebElement RMAPopupTableRow16Column1;
	
	@FindBy (xpath="//td[@id='RMA_Table_col_17-1']")
	private static WebElement RMAPopupTableRow17Column1;
	
	@FindBy (xpath="//td[@id='RMA_Table_col_18-1']")
	private static WebElement RMAPopupTableRow18Column1;
	
	@FindBy (xpath="//td[@id='RMA_Table_col_19-1']")
	private static WebElement RMAPopupTableRow19Column1;
	
	@FindBy (xpath="//td[@id='RMA_Table_col_20-1']")
	private static WebElement RMAPopupTableRow20Column1;
	
	@FindBy (xpath="//td[@id='RMA_Table_col_21-1']")
	private static WebElement RMAPopupTableRow21Column1;
	
	@FindBy (xpath="//td[@id='RMA_Table_col_22-1']")
	private static WebElement RMAPopupTableRow22Column1;
	
	@FindBy (xpath="//td[@id='RMA_Table_col_1-2']")
	private static WebElement RMAPopupTableRow1Column2;
	
	@FindBy (xpath="//td[@id='RMA_Table_col_1-3']")
	private static WebElement RMAPopupTableRow1Column3;
	
	@FindBy (xpath="//td[@id='id_body_38_input_image']/img")
	private static WebElement RMAPopupExpansionBtn;
	
	@FindBy (xpath="//*[@id='id_transactionentry_infopanel_container']/div[1]/div[3]/span")
	private static WebElement infoSideBarBtn;
	
	@FindBy (xpath="//tr[@id='trRender_1']/td[4]")
	private static WebElement savedVoucher1stRowVoucherNumer;
	
	@FindBy (xpath="//span[@id='reportClose']")
	private static WebElement sl_ReportsCloseBtn;
	
	@FindBy (xpath="//tr[@id='trRender_3']/td[2]")
	private static WebElement stockStatmentReportOpeningBalance;
	
	@FindBy (xpath="//tr[@id='trRender_3']/td[5]")
	private static WebElement stockStatmentReportBalanceQuantity;
	
	@FindBy (xpath="//tr[@id='trRender_3']/td[6]")
	private static WebElement stockStatmentReportValue;
	
	@FindBy (xpath="//tr[@id='trRender_1']/td[2]")
	private static WebElement stockMovementOpeningBalanceQty;
	
	@FindBy (xpath="//tr[@id='trRender_1']/td[3]")
	private static WebElement stockMovementOpeningBalanceValue;
	
	@FindBy (xpath="//tr[@id='trRender_2']/td[8]")
	private static WebElement stockMovementBalanceQuantity;
	
	@FindBy (xpath="//tr[@id='trRender_2']/td[9]")
	private static WebElement stockMovementBalanceStockValue;
	
	@FindBy (xpath="//tr[@id='trRender_2']/td[10]")
	private static WebElement stockMovementAverageRate;
	
	@FindBy (xpath="//tr[@id='trRender_3']/td[2]")
	private static WebElement multiLevelStockMovementOpeningBalanceQty;
	
	@FindBy (xpath="//tr[@id='trRender_3']/td[3]")
	private static WebElement multiLevelStockMovementOpeningBalanceValue;
	
	@FindBy (xpath="//tr[@id='trRender_3']/td[8]")
	private static WebElement multiLevelStockMovementBalanceQuantity;
	
	@FindBy (xpath="//tr[@id='trRender_3']/td[9]")
	private static WebElement multiLevelStockMovementBalanceStockValue;
	
	@FindBy (xpath="//tr[@id='trRender_3']/td[10]")
	private static WebElement multiLevelStockMovementAverageRate;
	
	@FindBy (xpath="//tr[@id='trRender_2']/td[2]")
	private static WebElement virtualStockAnalysisStockBal;
	
	@FindBy (xpath="//tr[@id='trRender_2']/td[6]")
	private static WebElement virtualStockAnalysisVirtualStock;
	
	@FindBy (xpath="//span[contains(text(),'Stock valuation of')]")
	private static WebElement stockValidationReportsLabel;
	
	@FindBy (xpath="//tr[@id='trRender_2']/td[4]")
	private static WebElement stockValidationQuantity;
	
	@FindBy (xpath="//tr[@id='trRender_2']/td[5]")
	private static WebElement stockValidationStockValue;
	
	@FindBy (xpath="//tr[@id='trRender_2']/td[6]")
	private static WebElement stockValidationUnitPrice;
	

	//Stock Analysis by RMA Reports Table
	//RMA Number
	@FindBy (xpath="//tr[@id='trRender_1']/td[1]")
	private static WebElement rmaNumber1stRow;
	
	@FindBy (xpath="//tr[@id='trRender_2']/td[1]")
	private static WebElement rmaNumber2ndRow;
	
	@FindBy (xpath="//tr[@id='trRender_3']/td[1]")
	private static WebElement rmaNumber3rdRow;
	
	@FindBy (xpath="//tr[@id='trRender_4']/td[1]")
	private static WebElement rmaNumber4thRow;
	
	@FindBy (xpath="//tr[@id='trRender_5']/td[1]")
	private static WebElement rmaNumber5thRow;
	
	@FindBy (xpath="//tr[@id='trRender_6']/td[1]")
	private static WebElement rmaNumber6thRow;
	
	@FindBy (xpath="//tr[@id='trRender_7']/td[1]")
	private static WebElement rmaNumbeR9thRow;
	
	@FindBy (xpath="//tr[@id='trRender_8']/td[1]")
	private static WebElement rmaNumber8thRow;
	
	@FindBy (xpath="//tr[@id='trRender_9']/td[1]")
	private static WebElement rmaNumber9thRow;
	
	@FindBy (xpath="//tr[@id='trRender_10']/td[1]")
	private static WebElement rmaNumber10thRow;
	
	@FindBy (xpath="//tr[@id='trRender_11']/td[1]")
	private static WebElement rmaNumber11thRow;
	
	@FindBy (xpath="//tr[@id='trRender_12']/td[1]")
	private static WebElement rmaNumber12thRow;
	
	@FindBy (xpath="//tr[@id='trRender_13']/td[1]")
	private static WebElement rmaNumber13thRow;
	
	@FindBy (xpath="//tr[@id='trRender_14']/td[1]")
	private static WebElement rmaNumber14thRow;
	
	@FindBy (xpath="//tr[@id='trRender_1']/td[1]")
	private static WebElement rmaNumberPg2_1stRow;
	
	@FindBy (xpath="//tr[@id='trRender_2']/td[1]")
	private static WebElement rmaNumberPg2_2ndRow;
	
	@FindBy (xpath="//tr[@id='trRender_3']/td[1]")
	private static WebElement rmaNumberPg2_3rdRow;
	
	@FindBy (xpath="//tr[@id='trRender_4']/td[1]")
	private static WebElement rmaNumberPg2_4thRow;
	
	@FindBy (xpath="//tr[@id='trRender_5']/td[1]")
	private static WebElement rmaNumberPg2_5thRow;
	
	@FindBy (xpath="//tr[@id='trRender_6']/td[1]")
	private static WebElement rmaNumberPg2_6thRow;
	
	
	//Quantity
	@FindBy (xpath="//tr[@id='trRender_1']/td[2]")
	private static WebElement quantity1stRow;
	
	@FindBy (xpath="//tr[@id='trRender_2']/td[2]")
	private static WebElement quantity2ndRow;
	
	@FindBy (xpath="//tr[@id='trRender_3']/td[2]")
	private static WebElement quantity3rdRow;
	
	@FindBy (xpath="//tr[@id='trRender_4']/td[2]")
	private static WebElement quantity4thRow;
	
	@FindBy (xpath="//tr[@id='trRender_5']/td[2]")
	private static WebElement quantity5thRow;
	
	@FindBy (xpath="//tr[@id='trRender_6']/td[2]")
	private static WebElement quantity6thRow;
	
	@FindBy (xpath="//tr[@id='trRender_7']/td[2]")
	private static WebElement quantity7thRow;
	
	@FindBy (xpath="//tr[@id='trRender_8']/td[2]")
	private static WebElement quantity8thRow;
	
	@FindBy (xpath="//tr[@id='trRender_9']/td[2]")
	private static WebElement quantity9thRow;
	
	@FindBy (xpath="//tr[@id='trRender_10']/td[2]")
	private static WebElement quantity10thRow;
	
	@FindBy (xpath="//tr[@id='trRender_11']/td[2]")
	private static WebElement quantity11thRow;
	
	@FindBy (xpath="//tr[@id='trRender_12']/td[2]")
	private static WebElement quantity12thRow;
	
	@FindBy (xpath="//tr[@id='trRender_13']/td[2]")
	private static WebElement quantity13thRow;
	
	@FindBy (xpath="//tr[@id='trRender_14']/td[2]")
	private static WebElement quantity14thRow;
	
	@FindBy (xpath="//tr[@id='trRender_1']/td[2]")
	private static WebElement quantityPg2_1stRow;
	
	@FindBy (xpath="//tr[@id='trRender_2']/td[2]")
	private static WebElement quantityPg2_2ndRow;
	
	@FindBy (xpath="//tr[@id='trRender_3']/td[2]")
	private static WebElement quantityPg2_3rdRow;
	
	@FindBy (xpath="//tr[@id='trRender_4']/td[2]")
	private static WebElement quantityPg2_4thRow;
	
	@FindBy (xpath="//tr[@id='trRender_5']/td[2]")
	private static WebElement quantityPg2_5thRow;
	
	@FindBy (xpath="//tr[@id='trRender_6']/td[2]")
	private static WebElement quantityPg2_6thRow;
	
	//Rate
	@FindBy (xpath="//tr[@id='trRender_1']/td[3]")
	private static WebElement rate1stRow;
	
	@FindBy (xpath="//tr[@id='trRender_2']/td[3]")
	private static WebElement rate2ndRow;
	
	@FindBy (xpath="//tr[@id='trRender_3']/td[3]")
	private static WebElement rate3rdRow;
	
	@FindBy (xpath="//tr[@id='trRender_4']/td[3]")
	private static WebElement rate4thRow;
	
	@FindBy (xpath="//tr[@id='trRender_5']/td[3]")
	private static WebElement rate5thRow;
	
	@FindBy (xpath="//tr[@id='trRender_6']/td[3]")
	private static WebElement rate6thRow;
	
	@FindBy (xpath="//tr[@id='trRender_7']/td[3]")
	private static WebElement rate7thRow;
	
	@FindBy (xpath="//tr[@id='trRender_8']/td[3]")
	private static WebElement rate8thRow;
	
	@FindBy (xpath="//tr[@id='trRender_9']/td[3]")
	private static WebElement rate9thRow;
	
	@FindBy (xpath="//tr[@id='trRender_10']/td[3]")
	private static WebElement rate10thRow;
	
	@FindBy (xpath="//tr[@id='trRender_11']/td[3]")
	private static WebElement rate11thRow;
	
	@FindBy (xpath="//tr[@id='trRender_12']/td[3]")
	private static WebElement rate12thRow;
	
	@FindBy (xpath="//tr[@id='trRender_13']/td[3]")
	private static WebElement rate13thRow;
	
	@FindBy (xpath="//tr[@id='trRender_14']/td[3]")
	private static WebElement rate14thRow;
	
	@FindBy (xpath="//tr[@id='trRender_1']/td[3]")
	private static WebElement ratePg2_1stRow;
	
	@FindBy (xpath="//tr[@id='trRender_2']/td[3]")
	private static WebElement ratePg2_2ndRow;
	
	@FindBy (xpath="//tr[@id='trRender_3']/td[3]")
	private static WebElement ratePg2_3rdRow;
	
	@FindBy (xpath="//tr[@id='trRender_4']/td[3]")
	private static WebElement ratePg2_4thRow;
	
	@FindBy (xpath="//tr[@id='trRender_5']/td[3]")
	private static WebElement ratePg2_5thRow;
	
	@FindBy (xpath="//tr[@id='trRender_6']/td[3]")
	private static WebElement ratePg2_6thRow;
	
	//Stock Value
	@FindBy (xpath="//tr[@id='trRender_1']/td[4]")
	private static WebElement stockValue1stRow;
	
	@FindBy (xpath="//tr[@id='trRender_2']/td[4]")
	private static WebElement stockValue2ndRow;
	
	@FindBy (xpath="//tr[@id='trRender_3']/td[4]")
	private static WebElement stockValue3rdRow;
	
	@FindBy (xpath="//tr[@id='trRender_4']/td[4]")
	private static WebElement stockValue4thRow;
	
	@FindBy (xpath="//tr[@id='trRender_5']/td[4]")
	private static WebElement stockValue5thRow;
	
	@FindBy (xpath="//tr[@id='trRender_6']/td[4]")
	private static WebElement stockValue6thRow;
	
	@FindBy (xpath="//tr[@id='trRender_7']/td[4]")
	private static WebElement stockValue7thRow;
	
	@FindBy (xpath="//tr[@id='trRender_8']/td[4]")
	private static WebElement stockValue8thRow;
	
	@FindBy (xpath="//tr[@id='trRender_9']/td[4]")
	private static WebElement stockValue9thRow;
	
	@FindBy (xpath="//tr[@id='trRender_10']/td[4]")
	private static WebElement stockValue10thRow;
	
	@FindBy (xpath="//tr[@id='trRender_11']/td[4]")
	private static WebElement stockValue11thRow;
	
	@FindBy (xpath="//tr[@id='trRender_12']/td[4]")
	private static WebElement stockValue12thRow;
	
	@FindBy (xpath="//tr[@id='trRender_13']/td[4]")
	private static WebElement stockValue13thRow;
	
	@FindBy (xpath="//tr[@id='trRender_14']/td[4]")
	private static WebElement stockValue14thRow;
	
	@FindBy (xpath="//tr[@id='trRender_1']/td[4]")
	private static WebElement stockValuePg2_1stRow;
	
	@FindBy (xpath="//tr[@id='trRender_2']/td[4]")
	private static WebElement stockValuePg2_2ndRow;
	
	@FindBy (xpath="//tr[@id='trRender_3']/td[4]")
	private static WebElement stockValuePg2_3rdRow;
	
	@FindBy (xpath="//tr[@id='trRender_4']/td[4]")
	private static WebElement stockValuePg2_4thRow;
	
	@FindBy (xpath="//tr[@id='trRender_5']/td[4]")
	private static WebElement stockValuePg2_5thRow;
	
	@FindBy (xpath="//tr[@id='trRender_6']/td[4]")
	private static WebElement stockValuePg2_6thRow;
	
	@FindBy (xpath="//button[@id='pgnumber_']")
	private static WebElement rmaReportsCurrentPageBtn;
	
	@FindBy (xpath="//td[@id='RMA_Table_col_8-4']")
	private static WebElement RMAPopupTable8thRowClrBtn;
	
	@FindBy (xpath="//tr[@id='trRender_1']/td[2]")
	private static WebElement savedVoucher1stRowChkBox;
	
		
	
			
	@FindBy (xpath="//input[@id='RITNumber__11']")
	private static WebElement slab1;
	
	@FindBy (xpath="//input[@id='RITNumber__12']")
	private static WebElement slab2;
	
	@FindBy (xpath="//input[@id='RITNumber__13']")
	private static WebElement slab3;
	
	@FindBy (xpath="//input[@id='RITNumber__14']")
	private static WebElement slab4;
	
	@FindBy (xpath="//input[@id='RITNumber__15']")
	private static WebElement slab5;
	
	@FindBy (xpath="//input[@id='RITNumber__16']")
	private static WebElement slab6;
	
	@FindBy (xpath="//input[@id='RITNumber__17']")
	private static WebElement slab7;
	
	@FindBy (xpath="//select[@id='RITCombobox__8']")
	private static WebElement slabUptoDrpdwn;
	
	
	
	/*@FindBy(xpath="//tr[@id='id_header_2_day_grid']")
	private static WebElement cal;
	
	
	@FindBy(xpath="//select[@id='id_header_2_month']")
	private static WebElement month;
	
	@FindBy(xpath="//select[@id='id_header_2_year']")
	private static WebElement year;
	*/
	
	

	@FindBy(xpath="//input[contains(@name,'chkRowCheck')]")
	private static WebElement selectGridFirstRow;


	@FindBy(xpath="//*[@id='lblnchecked']/input")
	private static WebElement selectGridSecondRow;


	@FindBy(xpath="//select[@id='iValuationMethod']")
	private static WebElement validationMethodDropdown;

    @FindBy(xpath="//*[@id='btnMasterEdit']")
    private static WebElement itemEditBtn;
    
    @FindBy(xpath="//*[@id='btnDelete']")
    private static WebElement itemDeleteBtn;
    
    @FindBy(xpath="//*[@id='btnClose']")
    private static WebElement itemCloseBtn;

    @FindBy(xpath="//*[@id='toggle_ribbon']")
    private static WebElement itemToggleRibbonBtn;
    
    
	     @FindBy(xpath="//*[@id='btnMasterSaveClick']")
	     private static WebElement itemEditSaveBtn;
	     
	     @FindBy(xpath="//*[@id='btnMasterCopy']")
	     private static WebElement itemEditCpoyBtn;
	     
	     @FindBy(xpath="//*[@id='btnMasterClone']")
	     private static WebElement itemEditCloneBtn;
	     
	     @FindBy(xpath="//*[@id='GenerateNewMasterModel']/div/div[1]/div[2]/div/ul/li[2]/button[6]")
	     private static WebElement itemEditCloseBtn;
	     
	     @FindBy(xpath="//*[@id='divBtnGroup0']/div/a")
	     private static WebElement ItemEditGeneralBtn;
	 	     
		     @FindBy(xpath="//*[@id='sName']")
		     private static WebElement EditGeneralName;
		     
		     @FindBy(xpath="//*[@id='sCode']")
		     private static WebElement EditGeneralCode;
		     
		     @FindBy(xpath="//*[@id='iProductType']")
		     private static WebElement EditGeneralItemTypeDropDown;
		     
		     @FindBy(xpath="//*[@id='fReorderLevel']")
		     private static WebElement EditGeneralReorderLevel;
		     
		     @FindBy(xpath="//*[@id='iBinCapacity']")
		     private static WebElement EditGeneralBinCapacity;
		     
		     @FindBy(xpath="//*[@id='iValuationMethod']")
		     private static WebElement EditGeneralValuationMethodDropDown;
		     
		     @FindBy(xpath="//*[@id='iCategory']")
		     private static WebElement EditGeneralCategoryDropDown;
		     
		     @FindBy(xpath="//*[@id='iCategory_input_settings']/span")
		     private static WebElement EditGeneralCategorySettingBtn;
		     
		     @FindBy(xpath="//*[@id='iProductMake']")
		     private static WebElement EditGeneralItemMakeDropDown;
		     
		     @FindBy(xpath="//*[@id='Printer']")
		     private static WebElement EditGeneralPrint;
		     
		     @FindBy(xpath="//*[@id='iAlternateCategory']")
		     private static WebElement EditGeneralAlternativeCategoryDropdown;
		     
		     @FindBy(xpath="//*[@id='iAlternateCategory_input_settings']/span")
		     private static WebElement EditGeneralAlternativeCategoryDropdownSettingBtn;
		     
		     @FindBy(xpath="//*[@id='sDescription']")
		     private static WebElement EditGeneralDescription;
		     
		     @FindBy(xpath="//*[@id='bPerishableItem']")
		     private static WebElement EditGeneralPerishableItemCheckBox;
		     
		     @FindBy(xpath="//*[@id='iBin']")
		     private static WebElement EditGeneralBinDropdown;
		     
		     @FindBy(xpath="//*[@id='iBin_input_settings']/span")
		     private static WebElement EditGeneralBinDropdownSettingBtn;
		     		     
		     @FindBy(xpath="//*[@id='BrowsepImage']")
		     private static WebElement EditGeneralUploadImageOrFileBtn;
		     
		     @FindBy(xpath="//*[@id='btnMasterSaveClick']/i")
		     private static WebElement EditGeneralSaveBtn;
		     
		     @FindBy(xpath="//*[@id='GenerateEditMasterModel']/div/div[1]/div[2]/div/ul/li[2]/button[5]")
		     private static WebElement EditGeneralCLoseBtn;
		     
	
	
	
	@FindBy (xpath="//span[@id='sp_search']")
	private static WebElement RMAPopupSerialNoExpansionBtn;
	
	@FindBy (xpath="//input[@id='Search_txtSearchBox']")
	private static WebElement searchRMASearchTxtField;
	
	@FindBy (xpath="//input[@id='Search_txtQuantity']")
	private static WebElement searchRMAQuantityTxtField;
	
	@FindBy (xpath="//label[@id='Search_lblItems']")
	private static WebElement searchRMANoOfItemsTxt;
	
	@FindBy (xpath="//input[@id='chkSelectALL']")
	private static WebElement searchRMASelectAllChkBox;
	
	@FindBy (xpath="//*[@id='RMASearchTable']/tbody/tr[4]/td[1]/input")
	private static WebElement searchRMA4ChkBox;
	
	@FindBy (xpath="//*[@id='RMASearchTable']/tbody/tr[101]/td[1]/input")
	private static WebElement searchRMA101ChkBox;
	
	@FindBy (xpath="//*[@id='RMASearchTable']/tbody/tr[102]/td[1]/input")
	private static WebElement searchRMA102ChkBox;
	
	@FindBy (xpath="//*[@id='RMASearchTable']/tbody/tr[103]/td[1]/input")
	private static WebElement searchRMA103ChkBox;
	
	@FindBy (xpath="//*[@id='RMASearchTable']/tbody/tr[2]/td[1]/input")
	private static WebElement searchRMA2ndRowChkBox;
	
	@FindBy (xpath="//table[@id='RMASearchTable']/thead/tr/td[2]")
	private static WebElement searchRMATableHeadingSerialNo;
	
	@FindBy (xpath="//table[@id='RMASearchTable']/thead/tr/td[3]")
	private static WebElement searchRMATableHeadingDocNo;
	
	@FindBy (xpath="//table[@id='RMASearchTable']/thead/tr/td[4]")
	private static WebElement searchRMATableHeadingDate;
	
	@FindBy (xpath="//*[@id='SearchModal_Content']/div[3]/div/div[1]/label")
	private static WebElement searchRMAOkBtn;
	
	@FindBy (xpath="//*[@id='SearchModal_Content']/div[3]/div/div[2]/label")
	private static WebElement searchRMACancelBtn;
	
	@FindBy (xpath="//*[@id='SearchModal_Content']/div[1]/div[2]/span/i")
	private static WebElement searchRMACloseBtn;
	
	
	
	@FindBy(xpath="//a[@id='16']//div[@class='form-group theme_menu_color']")
	private static WebElement  SettingsmenuBtn;
	
	@FindBy(xpath="//span[contains(text(),'Configure Transactions')]")
	private static WebElement  ConfigureTransactionBtn;
	
	
	@FindBy(xpath="//label[contains(text(),'Preferences')]")
	private static WebElement  PreferencesBtn;
	
	@FindBy(xpath="//div[@id='docCustomization']")
	private static WebElement  DocumentCustomizationBtn;
	
	@FindBy(xpath="//a[@id='0']")
	private static WebElement  TagsBtn;
	
	@FindBy(xpath="//ul[@id='preferenceUL']//a[@id='1']")
	private static WebElement  AccountsBtn;
	
	@FindBy(xpath="//ul[@id='preferenceUL']//ul//li//a[@id='2']")
	private static WebElement  BudgetBtn;
	
	@FindBy(xpath="//ul[@id='preferenceUL']//ul//li//a[@id='3']")
	private static WebElement  ARAPBtn;
	
	@FindBy(xpath="//a[@id='4']")
	private static WebElement  MiselleanousBtn;
	
	@FindBy(xpath="//a[@id='5']")
	private static WebElement  PDCBtn;
	
	@FindBy(xpath="//ul[@id='preferenceUL']//a[@id='6']")
	private static WebElement  InventoryBtn;
	
	@FindBy(xpath="//ul[@id='preferenceUL']//ul//li//a[@id='7']")
	private static WebElement  BatchBtn;
	
	@FindBy(xpath="//ul[@id='preferenceUL']//ul//li//a[@id='30']")
	private static WebElement  RMABtn;
	
	@FindBy(xpath="//ul[@id='preferenceUL']//ul//li//a[@id='8']")
	private static WebElement  BinsBtn;
	
	@FindBy(xpath="//ul[@id='preferenceUL']//ul//li//a[@id='9']")
	private static WebElement  HirePurchaseBtn;
	
	@FindBy(xpath="//ul[@id='preferenceUL']//ul//li//a[@id='10']")
	private static WebElement  QuotationAnalysisBtn;
	
	@FindBy(xpath="//ul[@id='preferenceUL']//ul//li//a[@id='34']")
	private static WebElement  RFIDBtn;
	
	@FindBy(xpath="//ul[@id='preferenceUL']//ul//li//a[@id='29']")
	private static WebElement  AutoIndentBtn;
	
	@FindBy(xpath="//ul[@id='preferenceUL']//ul//li//a[@id='14']")
	private static WebElement  ABCAnalysisBtn;
	
	@FindBy(xpath="//ul[@id='preferenceUL']//a[@id='11']")
	private static WebElement  ReportBtn;
	
	@FindBy(xpath="//ul[@id='preferenceUL']//a[@id='12']")
	private static WebElement  InternetBtn;
	
	@FindBy(xpath="//ul[@id='preferenceUL']//ul//li//a[@id='13']")
	private static WebElement  MailSettingsBtn;
	
	@FindBy(xpath="//ul[@id='preferenceUL']//a[@id='16']")
	private static WebElement  MastersBtn;
	
	@FindBy(xpath="//ul[@id='preferenceUL']//a[@id='17']")
	private static WebElement  ExternalModulesBtn;
	
	@FindBy(xpath="//ul[@id='preferenceUL']//a[@id='18']")
	private static WebElement  InfoBtn;
	
	@FindBy(xpath="//ul[@id='preferenceUL']//a[@id='19']")
	private static WebElement  ProductionBtn;
	
	@FindBy(xpath="//ul[@id='preferenceUL']//a[@id='20']")
	private static WebElement  MrpBtn;
	
	@FindBy(xpath="//ul[@id='preferenceUL']//a[@id='22']")
	private static WebElement  FixedAssetsBtn;
	
	@FindBy(xpath="//ul[@id='preferenceUL']//a[@id='25']")
	private static WebElement  VatBtn;
	
	@FindBy(xpath="//a[@id='28']")
	private static WebElement  PosBtn;
	
	@FindBy(xpath="//ul[@id='preferenceUL']//a[@id='35']")
	private static WebElement  WareHouseManagementBtn;
	
	@FindBy(xpath="//a[@id='36']")
	private static WebElement  LetterForCreditBtn;
	
	@FindBy(xpath="//ul[@id='preferenceUL']//a[@id='37']")
	private static WebElement  PronghornBnt;
	
	@FindBy(xpath="//input[@id='txtVoucherWizard']")
	private static WebElement  SearchTxt;
	
	@FindBy(xpath="//span[@id='updateButton']")
	private static WebElement  UpdateBtn;
	
	@FindBy(xpath="//i[@class='icon-close icon-font6']")
	private static WebElement  CloseBtn;



		@FindBy(xpath="//input[@id='chkRMASupport']")
		private static WebElement  RmaSupportChkBox;
		
		@FindBy(xpath="//input[@id='chkRMAbasedalternateQuantity']")
		private static WebElement  RMAbasedalternateQuantityChkBox;
		
		@FindBy(xpath="//input[@id='chkRMANumberAlwaysnumeric']")
		private static WebElement  RMANumberAlwaysnumericChkBox;
		
		@FindBy(xpath="//input[@id='chkRMANumberUniqueAcrossAllItems']")
		private static WebElement  RMANumberUniqueAcrossAllItemsChkBox;
		
		@FindBy(xpath="//input[@id='chkInputRMANo']")
		private static WebElement  InputRMANoChkBox;
		
		@FindBy(xpath="//input[@id='chkRMANumberCantBeUsed']")
		private static WebElement  RMANumberCantBeUsedChkBox;
		
		@FindBy(xpath="//input[@id='PrefixVoucherNo']")
		private static WebElement  PrefixVoucherNoChkBox;



		
		@FindBy(xpath="//*[@id='txtUsername']")
		private static WebElement username;

		@FindBy(id="txtPassword")
		private static WebElement password;

		@FindBy(id="btnSignin")
		private static WebElement signIn;

	    @FindBy(id="ddlCompany")
	    private static WebElement companyDropDownList;

		@FindBy(xpath="//span[@class='hidden-xs']")
		private static WebElement userNameDisplay;

		@FindBy(xpath="//*[@id='companyLogo']")
		private static WebElement companyLogo;

		@FindBy(xpath="//*[@id='ulCompanyDetails_HomePage']/li[1]")
		private static WebElement companyName;

	    @FindBy(xpath="//*[@id='userprofile']/li/span[2]")
		private static WebElement logoutOption;
	    
	    
	    
	    @FindBy (xpath="//*[@id='RMA_Table_body']/tr[1]/td[2]")
		private static WebElement stockTransferRMA1stRow1stColumn;
		
		@FindBy (xpath="//*[@id='RMA_Table_body']/tr[2]/td[2]")
		private static WebElement stockTransferRMA2ndRow1stColumn;
		
		@FindBy (xpath="//*[@id='RMA_Table_body']/tr[3]/td[2]")
		private static WebElement stockTransferRMA3rdRow1stColumn;
		
		@FindBy (xpath="//*[@id='RMA_Table_body']/tr[4]/td[2]")
		private static WebElement stockTransferRMA4thRow1stColumn;
		
		@FindBy (xpath="//*[@id='RMA_Table_body']/tr[5]/td[2]")
		private static WebElement stockTransferRMA5thRow1stColumn;
		
		@FindBy (xpath="//*[@id='RMA_Table_body']/tr[6]/td[2]")
		private static WebElement stockTransferRMA6thRow1stColumn;
		
		@FindBy (xpath="//*[@id='RMA_Table_body']/tr[7]/td[2]")
		private static WebElement stockTransferRMA7thRow1stColumn;
		
		@FindBy (xpath="//*[@id='RMA_Table_body']/tr[8]/td[2]")
		private static WebElement stockTransferRMA8thRow1stColumn;
		
		@FindBy (xpath="//*[@id='RMA_Table_body']/tr[9]/td[2]")
		private static WebElement stockTransferRMA9thRow1stColumn;
		
		@FindBy (xpath="//*[@id='RMA_Table_body']/tr[10]/td[2]")
		private static WebElement stockTransferRMA10thRow1stColumn;
		

		@FindBy (xpath="//*[@id='RMA_Table_body']/tr[1]/td[3]")
		private static WebElement stockTransferRMA1stRow2ndColumn;
		
		@FindBy (xpath="//*[@id='RMA_Table_body']/tr[2]/td[3]")
		private static WebElement stockTransferRMA2ndRow2ndColumn;
		
		@FindBy (xpath="//*[@id='RMA_Table_body']/tr[1]/td[4]")
		private static WebElement stockTransferRMA1stRow3rdColumn;
		
		@FindBy (xpath="//*[@id='RMA_Table_body']/tr[2]/td[4]")
		private static WebElement stockTransferRMA2ndRow3rdColumn;
		

		
	
        @FindBy(xpath="//input[@id='donotshow']")
        private static WebElement DontShowChkBox;
        
        
        @FindBy(xpath="//a[@id='2014']//span[contains(text(),'Sales')]")
    	private static WebElement  financialTransactionSalesMenu;
    	
    	@FindBy(xpath="//span[contains(text(),'Sales invoice VAT')]")
    	private static WebElement  salesInvoiceVATVoucher;
        
        @FindBy(xpath="//a[@id='137']//span[contains(text(),'Transactions')]")
		private static WebElement  inventoryTransactionsMenu; 

		@FindBy(xpath="//a[@id='2033']//span[contains(text(),'Stocks')]")
		private static WebElement  inventoryTransactionsStocksMenu; 
        
			
			
		@FindBy(xpath="//tr[@id='id_header_2_day_grid']")
		private static WebElement calDates;
		
		
		@FindBy(xpath="//select[@id='id_header_2_month']")
		private static WebElement monthDropDwn;
		
		@FindBy(xpath="//select[@id='id_header_2_year']")
		private static WebElement yearDropDwn;
		
		
		@FindBy(xpath="//tr[@id='id_header_2_day_grid']")
		private static WebElement salesInvoiceCalenderDates;
		
		
		@FindBy(xpath="//select[@id='id_header_2_month']")
		private static WebElement salesInvoiceCalenderMonthDropdwn;
		
		@FindBy(xpath="//select[@id='id_header_2_year']")
		private static WebElement salesInvoiceCalenderYearDropdwn;
			
		
		@FindBy(xpath="//input[@id='id_header_6']")
		private static WebElement  voucherHeaderDueDate;
		
		@FindBy(xpath="//input[@id='id_header_10']")
		private static WebElement  voucherHeaderCurrency;
		
		@FindBy(xpath="//input[@id='id_header_11']")
		private static WebElement  voucherHeaderExchangeRate;
		
		@FindBy(xpath="//input[@id='id_header_145']")
		private static WebElement  voucherHeaderLocalExchangeRate;

		
		// Batch Popup Elements
		
		@FindBy(xpath="//label[@id='lblitem']")
		private static WebElement batchItemName;
		
		@FindBy(xpath="//label[@id='lblTotalQty']")
		private static WebElement batchTotalQtyAmt;
		
		@FindBy(xpath="//label[@id='lblAdjustQty']")
		private static WebElement batchAdjustQtyAmt;
		
		
		@FindBy(xpath="//label[@id='lblBalnceQty']")
		private static WebElement batchBalanceAmt;
		
		@FindBy(xpath="//div[contains(@class,'col-xs-12 col-sm-12 col-md-12 col-lg-12 P_ingBottom')]//div[2]//input[1]")
		private static WebElement batchExipiringInRadioBtn;
		             
		@FindBy(xpath="//section[@id='page_Content']//div[@class='row']//div//div[3]//input[1]")
		private static WebElement batchExipiringAfetrRadioBtn;
		
		@FindBy(xpath="//input[@id='txtWithin']")
		private static WebElement batchWithInTxt;
		
		@FindBy(xpath="//*[@id='Id_MRPBatch_Grid_control_heading_6']")
		private static WebElement batchTableHeaderRateColumn;
		
		@FindBy(xpath="//td[@id='Id_MRPBatch_Grid_col_1-1']")
		private static WebElement batchTable1stRow1stCol;
		
		@FindBy(xpath="//td[@id='Id_MRPBatch_Grid_col_1-2']")
		private static WebElement batchTable1stRow2ndCol;
		
		@FindBy(xpath="//td[@id='Id_MRPBatch_Grid_col_1-5']")
		private static WebElement batchTable1stRow3rdCol;
		
		@FindBy(xpath="//td[@id='Id_MRPBatch_Grid_col_1-6']")
		private static WebElement batchTable1stRow4thCol;
		
		@FindBy(xpath="//td[@id='Id_MRPBatch_Grid_col_1-7']")
		private static WebElement batchTable1stRow5thCol;
		
		@FindBy(xpath="//td[@id='Id_MRPBatch_Grid_col_1-7']/input")
		private static WebElement enter_BatchTableQtyAdjusted;
		
		
		@FindBy(xpath="//td[@id='Id_MRPBatch_Grid_col_1-13']")
		private static WebElement batchTable1stRow6thCol;
		
		
		@FindBy(xpath="//*[@id='Id_MRPBatch_Grid_col_2-1']")
		private static WebElement batchTable2ndRow1stCol;
		
		@FindBy(xpath="//td[@id='Id_MRPBatch_Grid_col_2-2']")
		private static WebElement batchTable2ndRow2ndCol;
		
		@FindBy(xpath="//td[@id='Id_MRPBatch_Grid_col_2-5']")
		private static WebElement batchTable2ndRow3rdCol;
		
		@FindBy(xpath="//td[@id='Id_MRPBatch_Grid_col_2-6']")
		private static WebElement batchTable2ndRow4thCol;
		
		@FindBy(xpath="//td[@id='Id_MRPBatch_Grid_col_2-7']")
		private static WebElement batchTable2ndRow5thCol;
		
		@FindBy(xpath="//td[@id='Id_MRPBatch_Grid_col_2-13']")
		private static WebElement batchTable2ndRow6thCol;
		
		
		@FindBy(xpath="//*[@id='Id_MRPBatch_Grid_col_3-1']")
		private static WebElement batchTable3rdRow1stCol;
		
		@FindBy(xpath="//td[@id='Id_MRPBatch_Grid_col_3-2']")
		private static WebElement batchTable3rdRow2ndCol;
		
		@FindBy(xpath="//td[@id='Id_MRPBatch_Grid_col_3-5']")
		private static WebElement batchTable3rdRow3rdCol;
		
		@FindBy(xpath="//td[@id='Id_MRPBatch_Grid_col_3-6']")
		private static WebElement batchTable3rdRow4thCol;
		
		@FindBy(xpath="//td[@id='Id_MRPBatch_Grid_col_3-7']")
		private static WebElement batchTable3rdRow5thCol;
		
		@FindBy(xpath="//td[@id='Id_MRPBatch_Grid_col_3-13']")
		private static WebElement batchTable3rdRow6thCol;
		
		
		
		@FindBy(xpath="//*[@id='Id_MRPBatch_Grid_col_4-1']")
		private static WebElement batchTable4thRow1stCol;
		
		@FindBy(xpath="//td[@id='Id_MRPBatch_Grid_col_4-2']")
		private static WebElement batchTable4thRow2ndCol;
		
		@FindBy(xpath="//td[@id='Id_MRPBatch_Grid_col_4-5']")
		private static WebElement batchTable4thRow3rdCol;
		
		@FindBy(xpath="//td[@id='Id_MRPBatch_Grid_col_4-6']")
		private static WebElement batchTable4thRow4thCol;
		
		@FindBy(xpath="//td[@id='Id_MRPBatch_Grid_col_4-7']")
		private static WebElement batchTable4thRow5thCol;
		
		@FindBy(xpath="//td[@id='Id_MRPBatch_Grid_col_4-13']")
		private static WebElement batchTable4thRow6thCol;
		
		@FindBy(xpath="//*[@id='MRPBatch_AdjBatchQty']")
		private static WebElement batchTableEnterQtyAdjusted;
		
		
		@FindBy(xpath="//tbody[@id='Id_MRPBatch_Grid_body']/tr")
		private static List<WebElement> batchPopupTable;
		
		
		
		@FindBy(xpath="//i[@class='icon-refresh icon-font7']")
		private static WebElement batchRefreshBtn;
		
		@FindBy(xpath="//input[@id='Batch_Search']")
		private static WebElement batchSearchTxt;
		
		@FindBy(xpath="//input[@class='Fcheckbox']")
		private static WebElement batchShowAllAvalibleBatches;
		
		@FindBy(xpath="//label[contains(text(),'Customization')]")
		private static WebElement batchCustomizationIcon;
		
		@FindBy(xpath="//i[@class='icon-pick icon-font5']")
		private static WebElement batchPickOnFIFOIcon;
		
		@FindBy(xpath="//label[@id='div_Ok']")
		private static WebElement batchOkIcon;

		@FindBy(xpath="//div[@class='col-xs-12 col-sm-12 col-md-12 col-lg-12']//div[6]//label[1]")
		private static WebElement batchTotalAdjustedQty;
		
		@FindBy(xpath="//*[@id='MBatch_Content']/div[3]/div/div[3]/div[4]/label")
		private static WebElement batchCancelIcon;
		
		@FindBy(xpath="//*[@id='MBatch_Content']/div[1]/div[2]/span/i")
		private static WebElement batchCloseIcon;
		
		@FindBy(xpath="//*[@id='MBatch_Content']/div[2]/div/div[5]/div/div[3]")
		private static WebElement batchTotalQuantity;
		
		
		
		@FindBy(xpath="//span[@id='btnPick']")
		private static WebElement pickBtn;
		
		@FindBy(xpath="//input[@id='txtNewReference']")
		private static WebElement newReferenceTxt;
		
		@FindBy(xpath="//span[@id='btnOk']")
		private static WebElement Bill_OkBtn;
		
		
		@FindBy (xpath="//*[@id='salesTable']/tbody/tr[1]/td[1]")
		private static WebElement iq_stockTransaction1stRow1stColumn;
		
		@FindBy (xpath="//*[@id='salesTable']/tbody/tr[1]/td[2]")
		private static WebElement iq_stockTransaction1stRow2ndColumn;
		
		@FindBy (xpath="//*[@id='salesTable']/tbody/tr[1]/td[3]")
		private static WebElement iq_stockTransaction1stRow3rdColumn;
		
		@FindBy (xpath="//*[@id='salesTable']/tbody/tr[1]/td[4]")
		private static WebElement iq_stockTransaction1stRow4thColumn;
		
		@FindBy (xpath="//*[@id='salesTable']/tbody/tr[1]/td[5]")
		private static WebElement iq_stockTransaction1stRow5thColumn;
		
		@FindBy (xpath="//*[@id='salesTable']/tbody/tr[1]/td[6]")
		private static WebElement iq_stockTransaction1stRow6thColumn;
		
		
		@FindBy (xpath="//*[@id='salesTable']/tbody/tr[2]/td[1]")
		private static WebElement iq_stockTransaction2ndRow1stColumn;
		
		@FindBy (xpath="//*[@id='salesTable']/tbody/tr[2]/td[2]")
		private static WebElement iq_stockTransaction2ndRow2ndColumn;
		
		@FindBy (xpath="//*[@id='salesTable']/tbody/tr[2]/td[3]")
		private static WebElement iq_stockTransaction2ndRow3rdColumn;
		
		@FindBy (xpath="//*[@id='salesTable']/tbody/tr[2]/td[4]")
		private static WebElement iq_stockTransaction2ndRow4thColumn;
		
		@FindBy (xpath="//*[@id='salesTable']/tbody/tr[2]/td[5]")
		private static WebElement iq_stockTransaction2ndRow5thColumn;
		
		@FindBy (xpath="//*[@id='salesTable']/tbody/tr[2]/td[6]")
		private static WebElement iq_stockTransaction2ndRow6thColumn;
		
		
		@FindBy (xpath="//*[@id='salesTable']/tbody/tr[3]/td[1]")
		private static WebElement iq_stockTransaction3rdRow1stColumn;
		
		@FindBy (xpath="//*[@id='salesTable']/tbody/tr[3]/td[2]")
		private static WebElement iq_stockTransaction3rdRow2ndColumn;
		
		@FindBy (xpath="//*[@id='salesTable']/tbody/tr[3]/td[3]")
		private static WebElement iq_stockTransaction3rdRow3rdColumn;
		
		@FindBy (xpath="//*[@id='salesTable']/tbody/tr[3]/td[4]")
		private static WebElement iq_stockTransaction3rdRow4thColumn;
		
		@FindBy (xpath="//*[@id='salesTable']/tbody/tr[3]/td[5]")
		private static WebElement iq_stockTransaction3rdRow5thColumn;
		
		@FindBy (xpath="//tr[@id='id_ending_date__day_today']//span[@class='theme_color-inverse'][contains(text(),'Today')]")
		private static WebElement sl_EndDateCalender_TodayBtn;
		
		

		@FindBy (xpath="//*[@id='id_ending_date__month']")
		private static WebElement endDateCalMonthDrpdwn;
		
		@FindBy (xpath="//*[@id='id_ending_date__year']")
		private static WebElement endDateCalYearDrpdwn;
		
		@FindBy (xpath="//*[@id='id_ending_date__day_grid']/td/table/tbody")
		private static WebElement endDateCalDates;
		
		
		@FindBy (xpath="//*[@id='id_starting_date__month']")
		private static WebElement startDateCalMonthDrpdwn;
		
		@FindBy (xpath="//*[@id='id_starting_date__year']")
		private static WebElement startDateCalYearDrpdwn;
		
		@FindBy (xpath="//*[@id='id_starting_date__day_grid']/td/table/tbody")
		private static WebElement startDateCalDates;
		
		
		
		@FindBy(xpath="//tbody[@id='tblBodyReportRender']/tr")
		private static List<WebElement> reportsBodyGridRowsCount;

		
		@FindBy (xpath="//*[@id='tblBodyTransRender']/tr[1]/td[11]")
		private static WebElement grid_1stRowSuspendStatus;
		
		@FindBy (xpath="//*[@id='tblBodyTransRender']/tr[2]/td[11]")
		private static WebElement grid_2ndRowSuspendStatus;
		
		
		@FindBy (xpath="//*[@id='id_transaction_entry_detail_table_control_heading_1']/div[1]")
		private static WebElement stockTransferWarehouse2TableHeader;
		
		
		@FindBy (xpath="//input[@id='id_header_86']")
		private static WebElement stockTransferWarehouse1;
		
		@FindBy (xpath="//div[@id='dvReportDetails']/div/table/tbody/tr")
		private static List<WebElement> reports_TableBody;
		
		
		
		@FindBy(xpath="//input[@id='chkEnableBatchNumbers']")
		private static WebElement  EnableBatchesNoChkBox;
		
		@FindBy(xpath="//input[@id='chkAllowNegativeQuantity']")
		private static WebElement  AllowNegativeBatchesQtyChkBox;
		
		@FindBy(xpath="//input[@id='chkDontAcceptDupDoc']")
		private static WebElement  DontAcceptDuplicateBatchesChkBox;
		
		@FindBy(xpath="//input[@id='chkExpiryDatesBatches']")
		private static WebElement  ExpiryDatesOfBatchesChkBox;
		
		@FindBy(xpath="//input[@id='chkExpiryDatesOptional']")
		private static WebElement  ExpiryDateOptionalChkBox;
		
		@FindBy(xpath="//input[@id='chkIgnoreDayInExpiry']")
		private static WebElement  IgnoringDayInExpiryChkBox;
		
		@FindBy(xpath="//input[@id='chkCalculateExpiryDateFromItem']")
		private static WebElement  CalculateExpiryDateFromItemChkBox;
		
		@FindBy(xpath="//input[@id='chkCantSellBatchesNxt']")
		private static WebElement  CantSellBatchesNxtChkBox;
		
		@FindBy(xpath="//input[@id='chkDontClubBatchesMfDt']")
		private static WebElement  DontClubBatchesMfDtChkBox;
		
		@FindBy(xpath="//input[@id='chkSortBatchesExpDate']")
		private static WebElement  SortBatchesExpDateChkBox;
		
		@FindBy(xpath="//input[@id='chkInputBatchMrp']")
		private static WebElement  InputBatchMrpChkBox;
		
		@FindBy(xpath="//input[@id='chkLoadAllDtlsBatch']")
		private static WebElement  LoadAllDtlsBatchChkBox;
		
		@FindBy(xpath="//input[@id='chkManufacturingDateByBaches']")
		private static WebElement  ManufacturingDateByBatchesChkBox;
		
		@FindBy(xpath="//input[@id='chkSuggestNextBatchNoDoc']")
		private static WebElement  SuggestNextBatchNoDocChkBox;
		
		@FindBy(xpath="//input[@id='chkConsolidateBatchesByBatchNo']")
		private static WebElement  ConsolidateBatchesByBatchNoChkBox;
		
		@FindBy(xpath="//input[@id='chkHideRatesOption']")
		private static WebElement  HideRatesOptionChkBox;
		
		@FindBy(xpath="//input[@id='chkDonotshowbatchesconsumedinsuspendedandpendingdocuments']")
		private static WebElement  donotshowbatchesconsumedinsuspendedandpendingdocumentsChkBox;
		
		@FindBy(xpath="//input[@id='txtValue1']")
		private static WebElement  InputBatch_Value1Txt;
		
		@FindBy(xpath="//input[@id='txtValue2']")
		private static WebElement  InputBatch_Value2Txt;
		
		@FindBy(xpath="//input[@id='txtNoofbatch']")
		private static WebElement  CantSellBatches_Txt;
		
		@FindBy(xpath="//select[@id='cmbBatchExpire']")
		private static WebElement  CantSellBatches_Dropdown;
		
		
		@FindBy(xpath="//td[@id='Id_MRPBatch_Grid_col_1-4']")
        private static WebElement batchTableManufactureDate;
		
		
		@FindBy(xpath="//*[@id='iExpiryDays']")
        private static WebElement itemCreationSettingsTabExpiryDaysTxt;
		
		
		@FindBy(xpath="//span[contains(text(),'Edit Screen')]")
	   	private static WebElement  editScreenTab; 
		
		@FindBy(xpath="//*[@id='cmbBehaviour']")
		private static WebElement editScreenAddFieldsBehaviourDropdown;
		
		@FindBy(xpath="//*[@id='id_footer_134217731']")
		private static WebElement pvVoucherFooterDiscountTxt;
		
	
	
	
		@FindBy(xpath="//table[@id='id_transaction_bins_grid']")
		private static WebElement  binPopGrid;
		
		// Bin Inward Elements

		@FindBy (xpath="//input[@id='id_bins_totalquantity']")
		private static WebElement binTotalQty;
		
		@FindBy (xpath="//div[@class='modal-body']//div[4]")
		private static WebElement binBaseUOM;
		
		@FindBy (xpath="//input[@id='srch_bin']")
		private static WebElement binSearchTxt;
		
		/*@FindBy (xpath="//i[@class='icon-search']")
		private static WebElement binSearchBtn; */
		                 
		@FindBy (xpath="//*[@id='TransactionNewBin']/div/div/div[2]/div[1]/div[7]/button")
		private static WebElement binSearchBtn; 
		
		
		@FindBy(xpath="//td[@id='id_transaction_bins_grid_col_1-0']")
		private static WebElement  binselect1stRow_1stColumn;
		
		@FindBy(xpath="//td[@id='id_transaction_bins_grid_col_1-1']")
		private static WebElement  binselect1stRow_2ndColumn;
		
		@FindBy(xpath="//td[@id='id_transaction_bins_grid_col_1-3']")
		private static WebElement  binselect1stRow_3rdColumn;
		
		@FindBy(xpath="//td[@id='id_transaction_bins_grid_col_1-5']")
		private static WebElement  binselect1stRow_4thColumn;
		
		@FindBy(xpath="//td[@id='id_transaction_bins_grid_col_1-6']")
		private static WebElement  binselect1stRow_5thColumn;
		
		@FindBy(xpath="//td[@id='id_transaction_bins_grid_col_1-7']")
		private static WebElement  binselect1stRow_6thColumn;
		
		@FindBy(xpath="//td[@id='id_transaction_bins_grid_col_1-8']")
		private static WebElement  binselect1stRow_7thColumn;
		              
		@FindBy(xpath="//td[@id='id_transaction_bins_grid_col_1-12']")
		private static WebElement  binselect1stRow_8thColumn;
		
		
		
		
		@FindBy(xpath="//td[@id='id_transaction_bins_grid_col_1-0']")
		private static WebElement  sl_Binselect1stRow_1stColumn;
		
		@FindBy(xpath="//td[@id='id_transaction_bins_grid_col_1-1']")
		private static WebElement  sl_Binselect1stRow_2ndColumn;
		
		@FindBy(xpath="//td[@id='id_transaction_bins_grid_col_1-3']")
		private static WebElement  sl_Binselect1stRow_3rdColumn;
		
		@FindBy(xpath="//td[@id='id_transaction_bins_grid_col_1-4']")
		private static WebElement  sl_Binselect1stRow_4thColumn;
		
		@FindBy(xpath="//td[@id='id_transaction_bins_grid_col_1-5']")
		private static WebElement  sl_Binselect1stRow_5thColumn;
		
		@FindBy(xpath="//td[@id='id_transaction_bins_grid_col_1-6']")
		private static WebElement  sl_Binselect1stRow_6thColumn;
		
		@FindBy(xpath="//td[@id='id_transaction_bins_grid_col_1-7']")
		private static WebElement  sl_Binselect1stRow_7thColumn;
		              
		@FindBy(xpath="//td[@id='id_transaction_bins_grid_col_1-8']")
		private static WebElement  sl_Binselect1stRow_8thColumn;
		
		@FindBy(xpath="//td[@id='id_transaction_bins_grid_col_1-12']")
		private static WebElement  sl_Binselect1stRow_9thColumn;
		
		
		@FindBy(xpath="//td[@id='id_transaction_bins_grid_col_2-0']")
		private static WebElement  binselect2ndRow_1stColumn;
		
		@FindBy(xpath="//td[@id='id_transaction_bins_grid_col_2-1']")
		private static WebElement  binselect2ndRow_2ndColumn;
		
		@FindBy(xpath="//td[@id='id_transaction_bins_grid_col_2-3']")
		private static WebElement  binselect2ndRow_3rdColumn;
		
		@FindBy(xpath="//td[@id='id_transaction_bins_grid_col_2-5']")
		private static WebElement  binselect2ndRow_4thColumn;
		
		@FindBy(xpath="//td[@id='id_transaction_bins_grid_col_2-6']")
		private static WebElement  binselect2ndRow_5thColumn;
		
		@FindBy(xpath="//td[@id='id_transaction_bins_grid_col_2-7']")
		private static WebElement  binselect2ndRow_6thColumn;
		
		@FindBy(xpath="//td[@id='id_transaction_bins_grid_col_2-8']")
		private static WebElement  binselect2ndRow_7thColumn;
		
		@FindBy(xpath="//td[@id='id_transaction_bins_grid_col_2-12']")
		private static WebElement  binselect2ndRow_8thColumn;
		
		
		@FindBy(xpath="//td[@id='id_transaction_bins_grid_col_3-0']")
		private static WebElement  binselect3rdRow_1stColumn;
		
		@FindBy(xpath="//td[@id='id_transaction_bins_grid_col_3-1']")
		private static WebElement  binselect3rdRow_2ndColumn;
		
		@FindBy(xpath="//td[@id='id_transaction_bins_grid_col_3-3']")
		private static WebElement  binselect3rdRow_3rdColumn;
		
		@FindBy(xpath="//td[@id='id_transaction_bins_grid_col_3-5']")
		private static WebElement  binselect3rdRow_4thColumn;
		
		@FindBy(xpath="//td[@id='id_transaction_bins_grid_col_3-6']")
		private static WebElement  binselect3rdRow_5thColumn;
		
		@FindBy(xpath="//td[@id='id_transaction_bins_grid_col_3-7']")
		private static WebElement  binselect3rdRow_6thColumn;
		
		@FindBy(xpath="//td[@id='id_transaction_bins_grid_col_3-8']")
		private static WebElement  binselect3rdRow_7thColumn;
		
		@FindBy(xpath="//td[@id='id_transaction_bins_grid_col_3-12']")
		private static WebElement  binselect3rdRow_8thColumn;
		
		@FindBy(xpath="//input[@id='id_transaction_bins_grid_control_heading_ctrl_12']")
		private static WebElement  binEnter8thColumn;
		
		
		
		@FindBy(xpath="//td[@id='id_transaction_bins_grid_col_4-0']")
		private static WebElement  binselect4thRow_1stColumn;
		
		@FindBy(xpath="//td[@id='id_transaction_bins_grid_col_4-1']")
		private static WebElement  binselect4thRow_2ndColumn;
		
		@FindBy(xpath="//td[@id='id_transaction_bins_grid_col_4-3']")
		private static WebElement  binselect4thRow_3rdColumn;
		
		@FindBy(xpath="//td[@id='id_transaction_bins_grid_col_4-5']")
		private static WebElement  binselect4thRow_4thColumn;
		
		@FindBy(xpath="//td[@id='id_transaction_bins_grid_col_4-6']")
		private static WebElement  binselect4thRow_5thColumn;
		
		@FindBy(xpath="//td[@id='id_transaction_bins_grid_col_4-7']")
		private static WebElement  binselect4thRow_6thColumn;
		
		@FindBy(xpath="//td[@id='id_transaction_bins_grid_col_4-8']")
		private static WebElement  binselect4thRow_7thColumn;
		
		@FindBy(xpath="//td[@id='id_transaction_bins_grid_col_4-12']")
		private static WebElement  binselect4thRow_8thColumn;
		
		
		@FindBy(xpath="//td[@id='id_transaction_bins_grid_col_5-0']")
		private static WebElement  binselect5thRow_1stColumn;
		
		@FindBy(xpath="//td[@id='id_transaction_bins_grid_col_5-1']")
		private static WebElement  binselect5thRow_2ndColumn;
		
		@FindBy(xpath="//td[@id='id_transaction_bins_grid_col_5-3']")
		private static WebElement  binselect5thRow_3rdColumn;
		
		@FindBy(xpath="//td[@id='id_transaction_bins_grid_col_5-5']")
		private static WebElement  binselect5thRow_4thColumn;
		
		@FindBy(xpath="//td[@id='id_transaction_bins_grid_col_5-6']")
		private static WebElement  binselect5thRow_5thColumn;
		
		@FindBy(xpath="//td[@id='id_transaction_bins_grid_col_5-7']")
		private static WebElement  binselect5thRow_6thColumn;
		
		@FindBy(xpath="//td[@id='id_transaction_bins_grid_col_5-8']")
		private static WebElement  binselect5thRow_7thColumn;
		
		@FindBy(xpath="//td[@id='id_transaction_bins_grid_col_5-12']")
		private static WebElement  binselect5thRow_8thColumn;
		
		
		
		@FindBy(xpath="//td[@id='id_transaction_bins_grid_col_6-0']")
		private static WebElement  binselect6thRow_1stColumn;
		
		@FindBy(xpath="//td[@id='id_transaction_bins_grid_col_6-1']")
		private static WebElement  binselect6thRow_2ndColumn;
		
		@FindBy(xpath="//td[@id='id_transaction_bins_grid_col_6-3']")
		private static WebElement  binselect6thRow_3rdColumn;
		
		@FindBy(xpath="//td[@id='id_transaction_bins_grid_col_6-5']")
		private static WebElement  binselect6thRow_4thColumn;
		
		@FindBy(xpath="//td[@id='id_transaction_bins_grid_col_6-6']")
		private static WebElement  binselect6thRow_5thColumn;
		
		@FindBy(xpath="//td[@id='id_transaction_bins_grid_col_6-7']")
		private static WebElement  binselect6thRow_6thColumn;
		
		@FindBy(xpath="//td[@id='id_transaction_bins_grid_col_6-8']")
		private static WebElement  binselect6thRow_7thColumn;
		
		@FindBy(xpath="//td[@id='id_transaction_bins_grid_col_6-12']")
		private static WebElement  binselect6thRow_8thColumn;
		

		@FindBy(xpath="//td[@id='id_transaction_bins_grid_col_7-0']")
		private static WebElement  binselect7thRow_1stColumn;
		
		@FindBy(xpath="//td[@id='id_transaction_bins_grid_col_7-1']")
		private static WebElement  binselect7thRow_2ndColumn;
		
		@FindBy(xpath="//td[@id='id_transaction_bins_grid_col_7-3']")
		private static WebElement  binselect7thRow_3rdColumn;
		
		@FindBy(xpath="//td[@id='id_transaction_bins_grid_col_7-5']")
		private static WebElement  binselect7thRow_4thColumn;
		
		@FindBy(xpath="//td[@id='id_transaction_bins_grid_col_7-6']")
		private static WebElement  binselect7thRow_5thColumn;
		
		@FindBy(xpath="//td[@id='id_transaction_bins_grid_col_7-7']")
		private static WebElement  binselect7thRow_6thColumn;
		
		@FindBy(xpath="//td[@id='id_transaction_bins_grid_col_7-8']")
		private static WebElement  binselect7thRow_7thColumn;
		
		@FindBy(xpath="//td[@id='id_transaction_bins_grid_col_7-12']")
		private static WebElement  binselect7thRow_8thColumn;
		
		
		
		@FindBy(xpath="//td[@id='id_transaction_bins_grid_col_8-0']")
		private static WebElement  binselect8thRow_1stColumn;
		
		@FindBy(xpath="//td[@id='id_transaction_bins_grid_col_8-1']")
		private static WebElement  binselect8thRow_2ndColumn;
		
		@FindBy(xpath="//td[@id='id_transaction_bins_grid_col_8-3']")
		private static WebElement  binselect8thRow_3rdColumn;
		
		@FindBy(xpath="//td[@id='id_transaction_bins_grid_col_8-5']")
		private static WebElement  binselect8thRow_4thColumn;
		
		@FindBy(xpath="//td[@id='id_transaction_bins_grid_col_8-6']")
		private static WebElement  binselect8thRow_5thColumn;
		
		@FindBy(xpath="//td[@id='id_transaction_bins_grid_col_8-7']")
		private static WebElement  binselect8thRow_6thColumn;
		
		@FindBy(xpath="//td[@id='id_transaction_bins_grid_col_8-8']")
		private static WebElement  binselect8thRow_7thColumn;
		
		@FindBy(xpath="//td[@id='id_transaction_bins_grid_col_8-12']")
		private static WebElement  binselect8thRow_8thColumn;
		
		
		
		
		
		
		@FindBy(xpath="//span[@class='icon-sum']")
		private static WebElement  binRowSum;
		
		@FindBy(xpath="//tfoot[@id='id_transaction_bins_grid_foot']//td[2]")
		private static WebElement  binRowSum_2ndColumn;
		
		@FindBy(xpath="//tfoot[@id='id_transaction_bins_grid_foot']//td[4]")
		private static WebElement  binSelect4htRow_3rdColumn;
		
		@FindBy(xpath="//tfoot[@id='id_transaction_bins_grid_foot']//td[6]")
		private static WebElement  binRowSum_4thColumn;
		
		@FindBy(xpath="//tfoot[@id='id_transaction_bins_grid_foot']//td[7]")
		private static WebElement  binRowSum_5thColumn;
		
		@FindBy(xpath="//tfoot[@id='id_transaction_bins_grid_foot']//td[8]")
		private static WebElement  binRowSum_6thColumn;
		
		@FindBy(xpath="//tfoot[@id='id_transaction_bins_grid_foot']//td[9]")
		private static WebElement  binRowSum_7thColumn;
		
		@FindBy(xpath="//tfoot[@id='id_transaction_bins_grid_foot']//td[12]")
		private static WebElement  binRowSum_8thColumn;
		
		@FindBy(xpath="//tfoot[@id='id_transaction_bins_grid_foot']//td[13]")
		private static WebElement  binRowTotalToBeAllocated;
		
		
		
		@FindBy (xpath="//input[@id='id_bins_balance']")
		private static WebElement binBalanceTxt;
		
		@FindBy (xpath="//div[@id='id_btnalternatecategorycheck']//div[@class='toolbar_button_image']")
		private static WebElement binAlternateCategoryCheckBtn;
		
		@FindBy (xpath="//div[@id='id_btnautoallocate']//div[@class='toolbar_button_image']")
		private static WebElement binAutoAllocateBtn;
		
		@FindBy (xpath="//span[@class='icon-pick icon-font4']")
		private static WebElement binPickBtn; 
		
		@FindBy (xpath="//div[@id='id_btnautoallocategroup']//div[@class='toolbar_button_image']")
		private static WebElement binAutoAllocateWithinGroupBtn;
		
		@FindBy (xpath="//div[@id='id_bins_ok']//span[@class='icon-ok icon-font6']")
		private static WebElement binOkBtn;
		
		@FindBy (xpath="//div[@class='col-xs-9 pull-right']//span[@class='icon-close icon-font6']")
		private static WebElement binCancelBtn;
		
		@FindBy (xpath="//tfoot[@id='id_transaction_bins_grid_foot']//td[13]")
		private static WebElement binSumInward;
		
		
		// Bin OutWard Elements
	 	

		@FindBy(xpath="//th[@id='id_transaction_bins_grid_control_heading_1']//div[contains(text(),'Bin')]")
		private static WebElement  binHeader_Bin;
		
		@FindBy(xpath="//th[@id='id_transaction_bins_grid_control_heading_3']//div[contains(text(),'Stock')]")
		private static WebElement  binHeader_Stock;
		
		@FindBy(xpath="//div[contains(text(),'Stock(Pcs)')]")
		private static WebElement  binHeader_StockPcs;
		
		@FindBy(xpath="//div[contains(text(),'Capacity')]")
		private static WebElement  binHeader_Capacity;
		
		@FindBy(xpath="//div[contains(text(),'Load')]")
		private static WebElement  binHeader_Load;
		
		@FindBy(xpath="//div[contains(text(),'Free space')]")
		private static WebElement  binHeader_FreeSpace;
		
		@FindBy(xpath="//div[contains(text(),'Free Quantity')]")
		private static WebElement  binHeader_FreeQty;
		
		@FindBy(xpath="//div[contains(text(),'To be Picked')]")
		private static WebElement  binHeader_ToBePicked;
					
		@FindBy(xpath="//td[@id='id_transaction_bins_grid_col_1-0']")
		private static WebElement  binoutwardRow1Index;
		
		@FindBy(xpath="//td[@id='id_transaction_bins_grid_col_1-1']")
		private static WebElement  binoutwardRow1Bin;
		
		@FindBy(xpath="//td[@id='id_transaction_bins_grid_col_1-3']")
		private static WebElement  binoutwardRow1Stock;
		
		@FindBy(xpath="//td[@id='id_transaction_bins_grid_col_1-4']")
		private static WebElement  binoutwardRow1StockPcs;
		
		@FindBy(xpath="//td[@id='id_transaction_bins_grid_col_1-5']")
		private static WebElement  binoutwardRow1Capacity;
		
		@FindBy(xpath="//td[@id='id_transaction_bins_grid_col_1-6']")
		private static WebElement  binoutwardRow1Load;
		
		@FindBy(xpath="//td[@id='id_transaction_bins_grid_col_1-7']")
		private static WebElement  binoutwardRow1FreeSpace;
		
		@FindBy(xpath="//td[@id='id_transaction_bins_grid_col_1-8']")
		private static WebElement  binoutwardRow1FreeQty;
		
		@FindBy(xpath="//td[@id='id_transaction_bins_grid_col_1-12']")
		private static WebElement  binoutwardRow1ToBePicked;
		
		@FindBy(xpath="//input[@id='id_transaction_bins_grid_control_heading_ctrl_12']")
		private static WebElement  binoutwardToInputInToBePicked;
		
		@FindBy(xpath="//td[@id='id_transaction_bins_grid_col_2-0']")
		private static WebElement  binoutwardRow2Index;
		
		@FindBy(xpath="//td[@id='id_transaction_bins_grid_col_2-1']")
		private static WebElement  binoutwardRow2Bin;
		
		@FindBy(xpath="//td[@id='id_transaction_bins_grid_col_2-3']")
		private static WebElement  binoutwardRow2Stock;
		
		@FindBy(xpath="//td[@id='id_transaction_bins_grid_col_2-4']")
		private static WebElement  binoutwardRow2StockPcs;
		
		@FindBy(xpath="//td[@id='id_transaction_bins_grid_col_2-5']")
		private static WebElement  binoutwardRow2Capacity;
		
		@FindBy(xpath="//td[@id='id_transaction_bins_grid_col_2-6']")
		private static WebElement  binoutwardRow2Load;
		
		@FindBy(xpath="//td[@id='id_transaction_bins_grid_col_2-7']")
		private static WebElement  binoutwardRow2FreeSpace;
		
		@FindBy(xpath="//td[@id='id_transaction_bins_grid_col_2-8']")
		private static WebElement  binoutwardRow2FreeQty;
		
		@FindBy(xpath="//td[@id='id_transaction_bins_grid_col_2-12']")
		private static WebElement  binoutwardRow2ToBePicked;
		
		
		@FindBy(xpath="//td[@id='id_transaction_bins_grid_col_3-0']")
		private static WebElement  binoutwardRow3Index;
		
		@FindBy(xpath="//td[@id='id_transaction_bins_grid_col_3-1']")
		private static WebElement  binoutwardRow3Bin;
		
		@FindBy(xpath="//td[@id='id_transaction_bins_grid_col_3-3']")
		private static WebElement  binoutwardRow3Stock;
		
		@FindBy(xpath="//td[@id='id_transaction_bins_grid_col_3-4']")
		private static WebElement  binoutwardRow3StockPcs;
		
		@FindBy(xpath="//td[@id='id_transaction_bins_grid_col_3-5']")
		private static WebElement  binoutwardRow3Capacity;
		
		@FindBy(xpath="//td[@id='id_transaction_bins_grid_col_3-6']")
		private static WebElement  binoutwardRow3Load;
		
		@FindBy(xpath="//td[@id='id_transaction_bins_grid_col_3-7']")
		private static WebElement  binoutwardRow3FreeSpace;
		
		@FindBy(xpath="//td[@id='id_transaction_bins_grid_col_3-8']")
		private static WebElement  binoutwardRow3FreeQty;
		
		@FindBy(xpath="//td[@id='id_transaction_bins_grid_col_3-12']")
		private static WebElement  binoutwardRow3ToBePicked;
		
		
		
		@FindBy(xpath="//tfoot[@id='id_transaction_bins_grid_foot']//td[13]")
		private static WebElement  binoutwardRowTotalToBePicked;


		@FindBy(xpath="//*[@id='id_bins_ok']")
		private static WebElement  binOkButtonStatus;
		
		
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_workflow_popup_col_1-1']/input")
		private static WebElement  enterL_ExcessInStocksPopupRow1ChkBox;
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_workflow_popup_col_2-1']/input")
		private static WebElement  enterL_ExcessInStocksPopupRow2ChkBox;
		
		
		@FindBy(xpath="//*[@id='id_transaction_workflow_popup_heading']/div/ul/li[3]/div/div[1]/span")
		private static WebElement  enterL_ExcessInStocksPopupOkBtn;
		
		
		
		
		public static String checkValidationMessage(String ExpMessage) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
		        try
		        {
		        		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(errorMessage));
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
		
		
		 public boolean checkVoucherSavingMessage(String docno) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		  {
			try
			{
				getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(errorMessage));
				String actErrorMessage=errorMessage.getText();
				String expErrorMessage="Voucher saved successfully";
				String expErrorMessage1=": "+docno;
				
				System.out.println("SavingMessage  :  "+actErrorMessage +" Value Expected : "+expErrorMessage+" "+expErrorMessage1);
				
				if(actErrorMessage.startsWith(expErrorMessage) && actErrorMessage.endsWith(expErrorMessage1))
				{
					try
					{
						getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(errorMessageCloseBtn));
						errorMessageCloseBtn.click();
						
						return  true;
					}
					catch(Exception ee)
					{
						return true;
					}	
				}
				else
				{
					return false;
				}	
			}
			catch(Exception e)
			{
				System.err.println("UNABLE TO COMPARE");
				return false;
			}
		  }
		

		  public static void checkUserFriendlyMessage() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		  {
			try
			{
				getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(errorMessage));
				String actErrorMessage=errorMessage.getText();
				
				System.out.println("Open Page then Message Display  :  " + actErrorMessage);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(errorMessageCloseBtn));
				errorMessageCloseBtn.click();
				
				/*try
				{	
					System.out.println("In Try Block Validation Message  :  " + actErrorMessage);
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(errorMessageCloseBtn));
					errorMessageCloseBtn.click();
				}
				catch(Exception ee)
				{
					System.out.println("In Catch Block Validation Message  :  " + actErrorMessage);	
				}*/
			}
			catch(Exception e)
			{
				System.err.println("Error Message NOT Found or NOT Clickable");
				System.err.println(e.getMessage());
				
				String Exception=e.getMessage();
			}
		  }
		
		  
		  
		  public boolean checkLoadingMessage() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		  {
			try
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(errorMessage));
				String actVoucherLoadingMessage=errorMessage.getText();
				String expVoucherLoadingMessage="Voucher loaded successfully";
				
				System.out.println("VoucherLoadingMessage  : " + actVoucherLoadingMessage + " Value Expected : " + expVoucherLoadingMessage);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(errorMessageCloseBtn));
				errorMessageCloseBtn.click();

				if(actVoucherLoadingMessage.startsWith(expVoucherLoadingMessage))
				{
					return true;
				}
				else
				{
					return false;
				}
			}
			catch(Exception e)
			{
				System.err.println("UNABLE TO COMPARE");
				return false;
			}
		  }
	
	
	
	
	public boolean checkLogin() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
        LoginPage lp=new LoginPage(getDriver()); 
		
		String unamelt="su";
				      
		String pawslt="su";
				      
		lp.enterUserName(unamelt);
				
		lp.enterPassword(pawslt);
				  
		lp.clickOnSignInBtn();
				       
		
      /*   try 
        {
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(doNotShowCheckbox));
			doNotShowCheckbox.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeBtnInDemoPopupScreen));
			closeBtnInDemoPopupScreen.click(); 
			
		} 
        catch (Exception e)
        {
        	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplay));
		}*/
			
		Thread.sleep(8000);	
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplay));
		String userInfo=userNameDisplay.getText();
				    			
		System.out.println("User Info : "+userInfo);
				    	
	    System.out.println("User Info Capture Text :"+userNameDisplay.getText());		    	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(companyLogo));
				    	
		companyLogo.click();
				    	
		String getCompanyTxt=companyName.getText();
		String getLoginCompanyName=getCompanyTxt.substring(0, 19);
		System.out.println("company name :"+ getLoginCompanyName);
		companyLogo.click();
				    	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(labelDashboard));
				    	
		String getDashboard=labelDashboard.getText();
	   
		System.out.println("getDashboard"+getDashboard);
		
		if(userInfo.equalsIgnoreCase("SU") /*&& getLoginCompanyName.equalsIgnoreCase("Automation Company ") && getDashboard.equalsIgnoreCase("Dashboard")*/)
		{

			System.out.println("Test Pass : Transaction Authorization is Displayed");
			//excelReader.setCellData(xlfile, "Sheet6", 7, 9, resPass);
			return true;
			
		}
		else
		{
			System.out.println("Test Fail : Transaction Authorization is Displayed");
			//excelReader.setCellData(xlfile, "Sheet6", 7, 9, resFail);
			return false;

		}
	}
	// Sales Table
	
	@FindBy(xpath="//*[@id='salesTable']/tbody/tr[1]/td[1]")
	private static WebElement sal1strow_1stColumn;
	
	@FindBy(xpath="//*[@id='salesTable']/tbody/tr[1]/td[2]")
	private static WebElement sal1strow_2ndColumn;
	
	@FindBy(xpath="//*[@id='salesTable']/tbody/tr[1]/td[3]")
	private static WebElement sal1strow_3rdColumn;
	
	@FindBy(xpath="//*[@id='salesTable']/tbody/tr[1]/td[4]")
	private static WebElement sal1strow_4thColumn;
	
	@FindBy(xpath="//*[@id='salesTable']/tbody/tr[1]/td[5]")
	private static WebElement sal1strow_5thColumn;
	
	@FindBy(xpath="//*[@id='salesTable']/tbody/tr[1]/td[6]")
	private static WebElement sal1strow_6thColumn;
	
	@FindBy(xpath="//*[@id='salesTable']/tbody/tr[1]/td[7]")
	private static WebElement sal1strow_7thColumn;
	
	@FindBy(xpath="//*[@id='salesTable']/tbody/tr[1]/td[8]")
	private static WebElement sal1strow_8thColumn;
	
	@FindBy(xpath="//*[@id='salesTable']/tbody/tr[1]/td[9]")
	private static WebElement sal1strow_9thColumn;
	
	@FindBy(xpath="//*[@id='salesTable']/tbody/tr[1]/td[10]")
	private static WebElement sal1strow_10thColumn;
	
	// 2nd
	
	@FindBy(xpath="//*[@id='salesTable']/tbody/tr[2]/td[1]")
	private static WebElement sal2ndrow_1stColumn;
	
	@FindBy(xpath="//*[@id='salesTable']/tbody/tr[2]/td[2]")
	private static WebElement sal2ndrow_2ndColumn;
	
	@FindBy(xpath="//*[@id='salesTable']/tbody/tr[2]/td[3]")
	private static WebElement sal2ndrow_3rdColumn;
	
	@FindBy(xpath="//*[@id='salesTable']/tbody/tr[2]/td[4]")
	private static WebElement sal2ndrow_4thColumn;
	
	@FindBy(xpath="//*[@id='salesTable']/tbody/tr[2]/td[5]")
	private static WebElement sal2ndrow_5thColumn;
	
	@FindBy(xpath="//*[@id='salesTable']/tbody/tr[2]/td[6]")
	private static WebElement sal2ndrow_6thColumn;
	
	@FindBy(xpath="//*[@id='salesTable']/tbody/tr[2]/td[7]")
	private static WebElement sal2ndrow_7thColumn;
	
	@FindBy(xpath="//*[@id='salesTable']/tbody/tr[2]/td[8]")
	private static WebElement sal2ndrow_8thColumn;
	
	@FindBy(xpath="//*[@id='salesTable']/tbody/tr[2]/td[9]")
	private static WebElement sal2ndrow_9thColumn;
	
	@FindBy(xpath="//*[@id='salesTable']/tbody/tr[2]/td[10]")
	private static WebElement sal2ndrow_10thColumn;
	
	// 3rd
	
	@FindBy(xpath="//*[@id='salesTable']/tbody/tr[3]/td[1]")
	private static WebElement sal3rdrow_1stColumn;
	
	@FindBy(xpath="//*[@id='salesTable']/tbody/tr[3]/td[2]")
	private static WebElement sal3rdrow_2ndColumn;
	
	@FindBy(xpath="//*[@id='salesTable']/tbody/tr[3]/td[3]")
	private static WebElement sal3rdrow_3rdColumn;
	
	@FindBy(xpath="//*[@id='salesTable']/tbody/tr[3]/td[4]")
	private static WebElement sal3rdrow_4thColumn;
	
	@FindBy(xpath="//*[@id='salesTable']/tbody/tr[3]/td[5]")
	private static WebElement sal3rdrow_5thColumn;
	
	@FindBy(xpath="//*[@id='salesTable']/tbody/tr[3]/td[6]")
	private static WebElement sal3rdrow_6thColumn;
	
	@FindBy(xpath="//*[@id='salesTable']/tbody/tr[3]/td[7]")
	private static WebElement sal3rdrow_7thColumn;
	
	@FindBy(xpath="//*[@id='salesTable']/tbody/tr[3]/td[8]")
	private static WebElement sal3rdrow_8thColumn;
	
	@FindBy(xpath="//*[@id='salesTable']/tbody/tr[3]/td[9]")
	private static WebElement sal3rdrow_9thColumn;
	
	@FindBy(xpath="//*[@id='salesTable']/tbody/tr[3]/td[10]")
	private static WebElement sal3rdrow_10thColumn;
	
	// 4th
	
	@FindBy(xpath="//*[@id='salesTable']/tbody/tr[4]/td[1]")
	private static WebElement sal4throw_1stColumn;
	
	@FindBy(xpath="//*[@id='salesTable']/tbody/tr[4]/td[2]")
	private static WebElement sal4throw_2ndColumn;
	
	@FindBy(xpath="//*[@id='salesTable']/tbody/tr[4]/td[3]")
	private static WebElement sal4throw_3rdColumn;
	
	@FindBy(xpath="//*[@id='salesTable']/tbody/tr[4]/td[4]")
	private static WebElement sal4throw_4thColumn;
	
	@FindBy(xpath="//*[@id='salesTable']/tbody/tr[4]/td[5]")
	private static WebElement sal4throw_5thColumn;
	
	@FindBy(xpath="//*[@id='salesTable']/tbody/tr[4]/td[6]")
	private static WebElement sal4throw_6thColumn;
	
	@FindBy(xpath="//*[@id='salesTable']/tbody/tr[4]/td[7]")
	private static WebElement sal4throw_7thColumn;
	
	@FindBy(xpath="//*[@id='salesTable']/tbody/tr[4]/td[8]")
	private static WebElement sal4throw_8thColumn;
	
	@FindBy(xpath="//*[@id='salesTable']/tbody/tr[4]/td[9]")
	private static WebElement sal4throw_9thColumn;
	
	@FindBy(xpath="//*[@id='salesTable']/tbody/tr[4]/td[10]")
	private static WebElement sal4throw_10thColumn;
	
	//5th
	
	@FindBy(xpath="//*[@id='salesTable']/tbody/tr[5]/td[1]")
	private static WebElement sal5throw_1stColumn;
	
	@FindBy(xpath="//*[@id='salesTable']/tbody/tr[5]/td[2]")
	private static WebElement sal5throw_2ndColumn;
	
	@FindBy(xpath="//*[@id='salesTable']/tbody/tr[5]/td[3]")
	private static WebElement sal5throw_3rdColumn;
	
	@FindBy(xpath="//*[@id='salesTable']/tbody/tr[5]/td[4]")
	private static WebElement sal5throw_4thColumn;
	
	@FindBy(xpath="//*[@id='salesTable']/tbody/tr[5]/td[5]")
	private static WebElement sal5throw_5thColumn;
	
	@FindBy(xpath="//*[@id='salesTable']/tbody/tr[5]/td[6]")
	private static WebElement sal5throw_6thColumn;
	
	@FindBy(xpath="//*[@id='salesTable']/tbody/tr[5]/td[7]")
	private static WebElement sal5throw_7thColumn;
	
	@FindBy(xpath="//*[@id='salesTable']/tbody/tr[5]/td[8]")
	private static WebElement sal5throw_8thColumn;
	
	@FindBy(xpath="//*[@id='salesTable']/tbody/tr[5]/td[9]")
	private static WebElement sal5throw_9thColumn;
	
	@FindBy(xpath="//*[@id='salesTable']/tbody/tr[5]/td[10]")
	private static WebElement sal5throw_10thColumn;
	
	//6th
	
	@FindBy(xpath="//*[@id='salesTable']/tbody/tr[6]/td[1]")
	private static WebElement sal6throw_1stColumn;
	
	@FindBy(xpath="//*[@id='salesTable']/tbody/tr[6]/td[2]")
	private static WebElement sal6throw_2ndColumn;
	
	@FindBy(xpath="//*[@id='salesTable']/tbody/tr[6]/td[3]")
	private static WebElement sal6throw_3rdColumn;
	
	@FindBy(xpath="//*[@id='salesTable']/tbody/tr[6]/td[4]")
	private static WebElement sal6throw_4thColumn;
	
	@FindBy(xpath="//*[@id='salesTable']/tbody/tr[6]/td[5]")
	private static WebElement sal6throw_5thColumn;
	
	@FindBy(xpath="//*[@id='salesTable']/tbody/tr[6]/td[6]")
	private static WebElement sal6throw_6thColumn;
	
	@FindBy(xpath="//*[@id='salesTable']/tbody/tr[6]/td[7]")
	private static WebElement sal6throw_7thColumn;
	
	@FindBy(xpath="//*[@id='salesTable']/tbody/tr[6]/td[8]")
	private static WebElement sal6throw_8thColumn;
	
	@FindBy(xpath="//*[@id='salesTable']/tbody/tr[6]/td[9]")
	private static WebElement sal6throw_9thColumn;
	
	@FindBy(xpath="//*[@id='salesTable']/tbody/tr[6]/td[10]")
	private static WebElement sal6throw_10thColumn;
	
	// 7th
	
	@FindBy(xpath="//*[@id='salesTable']/tbody/tr[7]/td[1]")
	private static WebElement sal7throw_1stColumn;
	
	@FindBy(xpath="//*[@id='salesTable']/tbody/tr[7]/td[2]")
	private static WebElement sal7throw_2ndColumn;
	
	@FindBy(xpath="//*[@id='salesTable']/tbody/tr[7]/td[3]")
	private static WebElement sal7throw_3rdColumn;
	
	@FindBy(xpath="//*[@id='salesTable']/tbody/tr[7]/td[4]")
	private static WebElement sal7throw_4thColumn;
	
	@FindBy(xpath="//*[@id='salesTable']/tbody/tr[7]/td[5]")
	private static WebElement sal7throw_5thColumn;
	
	@FindBy(xpath="//*[@id='salesTable']/tbody/tr[7]/td[6]")
	private static WebElement sal7throw_6thColumn;
	
	@FindBy(xpath="//*[@id='salesTable']/tbody/tr[7]/td[7]")
	private static WebElement sal7throw_7thColumn;
	
	@FindBy(xpath="//*[@id='salesTable']/tbody/tr[7]/td[8]")
	private static WebElement sal7throw_8thColumn;
	
	@FindBy(xpath="//*[@id='salesTable']/tbody/tr[7]/td[9]")
	private static WebElement sal7throw_9thColumn;
	
	@FindBy(xpath="//*[@id='salesTable']/tbody/tr[7]/td[10]")
	private static WebElement sal7throw_10thColumn;

	
	@FindBy(xpath="//td[contains(text(),'Quantity Sold Till Date:')]")
	private static WebElement qtySoldTillDate;
	
	@FindBy(xpath="//*[@id='salesTable']/tbody/tr[5]/td[2]")
	private static WebElement salTotalWa;
			
	
	
	// Warehouse Table
	
	@FindBy(xpath="//div[contains(text(),'Warehouse')]")
	private static WebElement BalancebyWareHouselable;
	
	@FindBy(xpath="//div[@id='PrdtDetails']//div[1]//div[1]//span[1]")
	private static WebElement BalancebyWareHouseExpandBtn;
	
	@FindBy(xpath="//*[@id='2']/td[2]")
	private static WebElement wh1strow_2ndColumn;
	
	@FindBy(xpath="//*[@id='2']/td[3]")
	private static WebElement wh1strow_3rdColumn;
	
	@FindBy(xpath="//*[@id='2']/td[4]")
	private static WebElement wh1strow_4thColumn;
	
	@FindBy(xpath="//*[@id='2']/td[5]")
	private static WebElement wh1strow_5thColumn;
	
	@FindBy(xpath="//*[@id='2']/td[6]")
	private static WebElement wh1strow_6thColumn;
	
	
	
	@FindBy(xpath="//*[@id='tagWiseData']/tbody/tr[2]/td[2]")
	private static WebElement wh2ndrow_2ndColumn;
	
	@FindBy(xpath="//*[@id='3']/td[3]")
	private static WebElement wh2ndrow_3rdColumn;
	
	@FindBy(xpath="//*[@id='tagWiseData']/tbody/tr[2]/td[4]")
	private static WebElement wh2ndrow_4thColumn;
	
	@FindBy(xpath="//*[@id='3']/td[5]")
	private static WebElement wh2ndrow_5thColumn;
	
	@FindBy(xpath="//*[@id='3']/td[6]")
	private static WebElement wh2ndrow_6thColumn;
	
	
	
	@FindBy(xpath="//*[@id='4']/td[2]")
	private static WebElement wh3rdrow_2ndColumn;
	
	@FindBy(xpath="//*[@id='4']/td[3]")
	private static WebElement wh3rdrow_3rdColumn;
	
	@FindBy(xpath="//*[@id='4']/td[4]")
	private static WebElement wh3rdrow_4thColumn;
	
	@FindBy(xpath="//*[@id='4']/td[5]")
	private static WebElement wh3rdrow_5thColumn;
	
	@FindBy(xpath="//*[@id='4']/td[6]")
	private static WebElement wh3rdrow_6thColumn;
	
	
	@FindBy(xpath="//*[@id='8']/td[2]")
	private static WebElement wh4throw_2ndColumn;
	
	@FindBy(xpath="//*[@id='8']/td[3]")
	private static WebElement wh4throw_3rdColumn;
	
	@FindBy(xpath="//*[@id='8']/td[4]")
	private static WebElement wh4throw_4thColumn;
	
	@FindBy(xpath="//*[@id='8']/td[5]")
	private static WebElement wh4throw_5thColumn;
	
	@FindBy(xpath="//*[@id='8']/td[6]")
	private static WebElement wh4throw_6thColumn;
	
	
	@FindBy(xpath="//*[@id='9']/td[2]")
	private static WebElement wh5throw_2ndColumn;
	
	@FindBy(xpath="//*[@id='9']/td[3]")
	private static WebElement wh5throw_3rdColumn;
	
	@FindBy(xpath="//*[@id='9']/td[4]")
	private static WebElement wh5throw_4thColumn;
	
	@FindBy(xpath="//*[@id='9']/td[5]")
	private static WebElement wh5throw_5thColumn;
	
	@FindBy(xpath="//*[@id='9']/td[6]")
	private static WebElement wh5throw_6thColumn;
	
	
	
	@FindBy(xpath="//*[@id='tagWiseData']/tbody/tr[6]/td[2]")
	private static WebElement whStockTotal;
	
	@FindBy(xpath="//*[@id='tagWiseData']/tbody/tr[6]/td[4]")
	private static WebElement whValueTotal;
	
	
	// Selling rate and buying rates
	
	@FindBy(xpath="//div[contains(text(),'Selling rates and Buying rates')]")
	private static WebElement sellingAndBuyingRateslable;
	
	
	@FindBy(xpath="//div[@id='div_BalanceByBins']//span[@id='ProdQuery_ShowPopup']")
	private static WebElement balanceByBinsExpandBtn;
	
	
	
	
	@FindBy(xpath="//span[@id='ProdQuery_ShowSellandBuyRatesPopup']")
	private static WebElement sellingAndBuyingRatesExpandBtn;
	
	// 1st 
	
	@FindBy(xpath="//*[@id='ratesWiseData']/tbody/tr[1]/td[2]")
	private static WebElement sbr1strow_2ndColumn;
	
	@FindBy(xpath="//*[@id='ratesWiseData']/tbody/tr[1]/td[3]")
	private static WebElement sbr1strow_3rdColumn;
	
	@FindBy(xpath="//*[@id='ratesWiseData']/tbody/tr[1]/td[4]")
	private static WebElement sbr1strow_4thColumn;
	
	@FindBy(xpath="//*[@id='ratesWiseData']/tbody/tr[1]/td[5]")
	private static WebElement sbr1strow_5thColumn;
	
	// 2nd 
	
	@FindBy(xpath="//*[@id='ratesWiseData']/tbody/tr[2]/td[2]")
	private static WebElement sbr2ndrow_2ndColumn;
	
	@FindBy(xpath="//*[@id='ratesWiseData']/tbody/tr[2]/td[3]")
	private static WebElement sbr2ndrow_3rdColumn;
	
	@FindBy(xpath="//*[@id='ratesWiseData']/tbody/tr[2]/td[4]")
	private static WebElement sbr2ndrow_4thColumn;
	
	@FindBy(xpath="//*[@id='ratesWiseData']/tbody/tr[2]/td[5]")
	private static WebElement sbr2ndrow_5thColumn;
	
	//3rd
	@FindBy(xpath="//*[@id='ratesWiseData']/tbody/tr[3]/td[2]")
	private static WebElement sbr3rdrow_2ndColumn;
	
	@FindBy(xpath="//*[@id='ratesWiseData']/tbody/tr[3]/td[3]")
	private static WebElement sbr3rdrow_3rdColumn;
	
	@FindBy(xpath="//*[@id='ratesWiseData']/tbody/tr[3]/td[4]")
	private static WebElement sbr3rdrow_4thColumn;
	
	@FindBy(xpath="//*[@id='ratesWiseData']/tbody/tr[3]/td[5]")
	private static WebElement sbr3rdrow_5thColumn;
	
	// 4th
	
	@FindBy(xpath="//*[@id='ratesWiseData']/tbody/tr[4]/td[2]")
	private static WebElement sbr4throw_2ndColumn;
	
	@FindBy(xpath="//*[@id='ratesWiseData']/tbody/tr[4]/td[3]")
	private static WebElement sbr4throw_3rdColumn;
	
	@FindBy(xpath="//*[@id='ratesWiseData']/tbody/tr[4]/td[4]")
	private static WebElement sbr4throw_4thColumn;
	
	@FindBy(xpath="//*[@id='ratesWiseData']/tbody/tr[4]/td[5]")
	private static WebElement sbr4throw_5thColumn;
	
	
	
	// 5th
	
	@FindBy(xpath="//*[@id='ratesWiseData']/tbody/tr[5]/td[2]")
	private static WebElement sbr5throw_2ndColumn;
	
	@FindBy(xpath="//*[@id='ratesWiseData']/tbody/tr[5]/td[3]")
	private static WebElement sbr5throw_3rdColumn;
	
	@FindBy(xpath="//*[@id='ratesWiseData']/tbody/tr[5]/td[4]")
	private static WebElement sbr5throw_4thColumn;
	
	@FindBy(xpath="//*[@id='ratesWiseData']/tbody/tr[5]/td[5]")
	private static WebElement sbr5throw_5thColumn;
		
		
	// 6th
	
	@FindBy(xpath="//*[@id='ratesWiseData']/tbody/tr[6]/td[2]")
	private static WebElement sbr6throw_2ndColumn;
	
	@FindBy(xpath="//*[@id='ratesWiseData']/tbody/tr[6]/td[3]")
	private static WebElement sbr6throw_3rdColumn;
	
	@FindBy(xpath="//*[@id='ratesWiseData']/tbody/tr[6]/td[4]")
	private static WebElement sbr6throw_4thColumn;
	
	@FindBy(xpath="//*[@id='ratesWiseData']/tbody/tr[6]/td[5]")				
	private static WebElement sbr6throw_5thColumn;
		
	
	
	// 7th

	@FindBy(xpath="//*[@id='ratesWiseData']/tbody/tr[7]/td[2]")
	private static WebElement sbr7throw_2ndColumn;
	
	@FindBy(xpath="//*[@id='ratesWiseData']/tbody/tr[7]/td[3]")
	private static WebElement sbr7throw_3rdColumn;
	
	@FindBy(xpath="//*[@id='ratesWiseData']/tbody/tr[7]/td[4]")
	private static WebElement sbr7throw_4thColumn;
	
	@FindBy(xpath="//*[@id='ratesWiseData']/tbody/tr[7]/td[5]")
	private static WebElement sbr7throw_5thColumn;
		
		
	// 8th
	
	@FindBy(xpath="//*[@id='ratesWiseData']/tbody/tr[8]/td[2]")
	private static WebElement sbr8throw_2ndColumn;
	
	@FindBy(xpath="//*[@id='ratesWiseData']/tbody/tr[8]/td[3]")
	private static WebElement sbr8throw_3rdColumn;
	
	@FindBy(xpath="//*[@id='ratesWiseData']/tbody/tr[8]/td[4]")
	private static WebElement sbr8throw_4thColumn;
	
	@FindBy(xpath="//*[@id='ratesWiseData']/tbody/tr[8]/td[5]")
	private static WebElement sbr8throw_5thColumn;
		
		
	
	// 9th
	
	@FindBy(xpath="//*[@id='ratesWiseData']/tbody/tr[9]/td[2]")
	private static WebElement sbr9throw_2ndColumn;
	
	@FindBy(xpath="//*[@id='ratesWiseData']/tbody/tr[9]/td[3]")
	private static WebElement sbr9throw_3rdColumn;
	
	@FindBy(xpath="//*[@id='ratesWiseData']/tbody/tr[9]/td[4]")
	private static WebElement sbr9throw_4thColumn;
	
	@FindBy(xpath="//*[@id='ratesWiseData']/tbody/tr[9]/td[5]")
	private static WebElement sbr9throw_5thColumn;
		
		
	// 10th
	
		@FindBy(xpath="//*[@id='ratesWiseData']/tbody/tr[10]/td[2]")
		private static WebElement sbr10throw_2ndColumn;
		
		@FindBy(xpath="//*[@id='ratesWiseData']/tbody/tr[10]/td[3]")
		private static WebElement sbr10throw_3rdColumn;
		
		@FindBy(xpath="//*[@id='ratesWiseData']/tbody/tr[10]/td[4]")
		private static WebElement sbr10throw_4thColumn;
		
		@FindBy(xpath="//*[@id='ratesWiseData']/tbody/tr[10]/td[5]")
		private static WebElement sbr10throw_5thColumn;
		

		// Item Query Elements
		
		@FindBy(xpath="//input[@id='productQuery']")
		private static WebElement iq_ItemTxt;
		
		@FindBy(xpath="//button[contains(text(),'GetStock')]")
		private static WebElement iq_getStockBtn;
		
		@FindBy(xpath="//button[contains(text(),'Customize')]")
		private static WebElement iq_customizeBtn;
		
		@FindBy(xpath="//span[@id='id_productquery_button_clear']")
		private static WebElement iq_clearBtn;
		
		@FindBy(xpath="//span[@id='id_productquery_button_close']")
		private static WebElement iq_closeBtn;
		
		@FindBy(xpath="//label[contains(text(),'Opening Stock Quantity:')]")
		private static WebElement iq_OpeningStockQtyLable;
		
		@FindBy(xpath="//label[contains(text(),'Pending purchases orders :')]")
		private static WebElement iq_PendingPurchaseOrdersLable;
		
		@FindBy(xpath="//label[contains(text(),'Current Stock :')]")
		private static WebElement iq_CurrentStockLable;
		
		@FindBy(xpath="//label[contains(text(),'Pending Sales Orders :')]")
		private static WebElement iq_PendingSalesOrdersLable;
		
		@FindBy(xpath="//label[contains(text(),'Avg. Stock Rate :')]")
		private static WebElement iq_AvgStockRateLable;
		
		@FindBy(xpath="//label[contains(text(),'Qty to be Ordered :')]")
		private static WebElement iq_QtytobeOrderedLable;
		
		@FindBy(xpath="//label[contains(text(),'Base Unit :')]")
		private static WebElement iq_BaseUnitLable;
		
		@FindBy(xpath="//label[contains(text(),'Value :')]")
		private static WebElement iq_ValueLable;
		
		@FindBy(xpath="//table[@id='purchaseTable']//th[contains(text(),'Date')]")
		private static WebElement iq_PurDate;
		
		@FindBy(xpath="//table[@id='purchaseTable']//th[contains(text(),'Voucher No')]")
		private static WebElement iq_PurVoucherNo;
		
		@FindBy(xpath="//th[contains(text(),'Vendor')]")
		private static WebElement iq_PurVendor;
		
		@FindBy(xpath="//table[@id='purchaseTable']//th[contains(text(),'Quantity')]")
		private static WebElement iq_PurQty;
		
		@FindBy(xpath="//table[@id='purchaseTable']//th[contains(text(),'Unit')]")
		private static WebElement iq_PurUnit;
		
		@FindBy(xpath="//table[@id='purchaseTable']//th[contains(text(),'Rate')]")
		private static WebElement iq_PurRate;
		
		@FindBy(xpath="//table[@id='purchaseTable']//th[contains(text(),'Currency')]")
		private static WebElement iq_PurCurrency;
		
		@FindBy(xpath="//table[@id='purchaseTable']//th[contains(text(),'Quantity In Base')]")
		private static WebElement iq_PurQtyInBase;
		
		@FindBy(xpath="//table[@id='salesTable']//th[contains(text(),'Date')]")
		private static WebElement iq_SaleDate;
		
		@FindBy(xpath="//table[@id='salesTable']//th[contains(text(),'Voucher No')]")
		private static WebElement iq_SaleVoucherNo;
		
		@FindBy(xpath="//th[contains(text(),'Customer')]")
		private static WebElement iq_SaleCustomer;
		
		@FindBy(xpath="//table[@id='salesTable']//th[contains(text(),'Quantity')]")
		private static WebElement iq_SaleQty;
		
		@FindBy(xpath="//table[@id='salesTable']//th[contains(text(),'Unit')]")
		private static WebElement iq_SaleUnit;
		
		@FindBy(xpath="//table[@id='salesTable']//th[contains(text(),'Rate')]")
		private static WebElement iq_SaleRate;
		
		@FindBy(xpath="//table[@id='salesTable']//th[contains(text(),'Currency')]")
		private static WebElement iq_SaleCurrency;
		
		@FindBy(xpath="//table[@id='salesTable']//th[contains(text(),'Quantity In Base')]")
		private static WebElement iq_SaleQtyInBase;
		
		
		@FindBy(xpath="//span[@id='openingStock']")
		private static WebElement iq_OpeningStocks;
		
		@FindBy(xpath="//span[@id='currentStock']")
		private static WebElement iq_CurrentStock;
		
		@FindBy(xpath="//span[@id='avgStockRate']")
		private static WebElement iq_AvgStockRate;
		
		@FindBy(xpath="//span[@id='value']")
		private static WebElement iq_Value;
		
		@FindBy(xpath="//span[@id='iBaseUnit']")
		private static WebElement iq_BaseUnit;
		
		@FindBy(xpath="//span[@id='purchaseOrdered']")
		private static WebElement iq_PendingPurchaseOrders;
		
		@FindBy(xpath="//span[@id='salesOrdered']")
		private static WebElement iq_PendingSalesOrders;
		
		@FindBy(xpath="//span[@id='quantityToBeOrdered']")
		private static WebElement iq_QtyToBeOrdered;

	
		// Purchase Table
		
		@FindBy(xpath="//*[@id='purchaseTable']/tbody/tr[1]/td[1]")
		private static WebElement pur1strow_1stColumn;
		
		@FindBy(xpath="//*[@id='purchaseTable']/tbody/tr[1]/td[2]")
		private static WebElement pur1strow_2ndColumn;
		
		@FindBy(xpath="//*[@id='purchaseTable']/tbody/tr[1]/td[3]")
		private static WebElement pur1strow_3rdColumn;
		
		@FindBy(xpath="//*[@id='purchaseTable']/tbody/tr[1]/td[4]")
		private static WebElement pur1strow_4thColumn;
		
		@FindBy(xpath="//*[@id='purchaseTable']/tbody/tr[1]/td[5]")
		private static WebElement pur1strow_5thColumn;
		
		@FindBy(xpath="//*[@id='purchaseTable']/tbody/tr[1]/td[6]")
		private static WebElement pur1strow_6thColumn;
		
		@FindBy(xpath="//*[@id='purchaseTable']/tbody/tr[1]/td[7]")
		private static WebElement pur1strow_7thColumn;
		
		@FindBy(xpath="//*[@id='purchaseTable']/tbody/tr[1]/td[8]")
		private static WebElement pur1strow_8thColumn;
		
		@FindBy(xpath="//*[@id='purchaseTable']/tbody/tr[1]/td[9]")
		private static WebElement pur1strow_9thColumn;
		
		@FindBy(xpath="//*[@id='purchaseTable']/tbody/tr[1]/td[10]")
		private static WebElement pur1strow_10thColumn;
		
		
		
		@FindBy(xpath="//*[@id='purchaseTable']/tbody/tr[2]/td[1]")
		private static WebElement pur2ndrow_1stColumn;
		
		@FindBy(xpath="//*[@id='purchaseTable']/tbody/tr[2]/td[2]")
		private static WebElement pur2ndrow_2ndColumn;
		
		@FindBy(xpath="//*[@id='purchaseTable']/tbody/tr[2]/td[3]")
		private static WebElement pur2ndrow_3rdColumn;
		
		@FindBy(xpath="//*[@id='purchaseTable']/tbody/tr[2]/td[4]")
		private static WebElement pur2ndrow_4thColumn;
		
		@FindBy(xpath="//*[@id='purchaseTable']/tbody/tr[2]/td[5]")
		private static WebElement pur2ndrow_5thColumn;
		
		@FindBy(xpath="//*[@id='purchaseTable']/tbody/tr[2]/td[6]")
		private static WebElement pur2ndrow_6thColumn;
		
		@FindBy(xpath="//*[@id='purchaseTable']/tbody/tr[2]/td[7]")
		private static WebElement pur2ndrow_7thColumn;
		
		@FindBy(xpath="//*[@id='purchaseTable']/tbody/tr[2]/td[8]")
		private static WebElement pur2ndrow_8thColumn;
		
		@FindBy(xpath="//*[@id='purchaseTable']/tbody/tr[2]/td[9]")
		private static WebElement pur2ndrow_9thColumn;
		
		@FindBy(xpath="//*[@id='purchaseTable']/tbody/tr[2]/td[10]")
		private static WebElement pur2ndrow_10thColumn;
		
		
		
		@FindBy(xpath="//*[@id='purchaseTable']/tbody/tr[3]/td[1]")
		private static WebElement pur7thRow_1stColumn;
		
		@FindBy(xpath="//*[@id='purchaseTable']/tbody/tr[3]/td[2]")
		private static WebElement pur3rdrow_2ndColumn;
		
		@FindBy(xpath="//*[@id='purchaseTable']/tbody/tr[3]/td[3]")
		private static WebElement pur3rdrow_3rdColumn;
		
		@FindBy(xpath="//*[@id='purchaseTable']/tbody/tr[3]/td[4]")
		private static WebElement pur3rdrow_4thColumn;
		
		@FindBy(xpath="//*[@id='purchaseTable']/tbody/tr[3]/td[5]")
		private static WebElement pur3rdrow_5thColumn;
		
		@FindBy(xpath="//*[@id='purchaseTable']/tbody/tr[3]/td[6]")
		private static WebElement pur3rdrow_6thColumn;
		
		@FindBy(xpath="//*[@id='purchaseTable']/tbody/tr[3]/td[7]")
		private static WebElement pur3rdrow_7thColumn;
		
		@FindBy(xpath="//*[@id='purchaseTable']/tbody/tr[3]/td[8]")
		private static WebElement pur3rdrow_8thColumn;
		
		@FindBy(xpath="//*[@id='purchaseTable']/tbody/tr[3]/td[9]")
		private static WebElement pur3rdrow_9thColumn;
		
		@FindBy(xpath="//*[@id='purchaseTable']/tbody/tr[3]/td[10]")
		private static WebElement pur3rdrow_10thColumn;
		
		
		// 4TH
		
		@FindBy(xpath="//*[@id='purchaseTable']/tbody/tr[4]/td[1]")
		private static WebElement pur4throw_1stColumn;
		
		@FindBy(xpath="//*[@id='purchaseTable']/tbody/tr[4]/td[2]")
		private static WebElement pur4throw_2ndColumn;
		
		@FindBy(xpath="//*[@id='purchaseTable']/tbody/tr[4]/td[3]")
		private static WebElement pur4throw_3rdColumn;
		
		@FindBy(xpath="//*[@id='purchaseTable']/tbody/tr[4]/td[4]")
		private static WebElement pur4throw_4thColumn;
		
		@FindBy(xpath="//*[@id='purchaseTable']/tbody/tr[4]/td[5]")
		private static WebElement pur4throw_5thColumn;
		
		@FindBy(xpath="//*[@id='purchaseTable']/tbody/tr[4]/td[6]")
		private static WebElement pur4throw_6thColumn;
		
		@FindBy(xpath="//*[@id='purchaseTable']/tbody/tr[4]/td[7]")
		private static WebElement pur4throw_7thColumn;
		
		@FindBy(xpath="//*[@id='purchaseTable']/tbody/tr[4]/td[8]")
		private static WebElement pur4throw_8thColumn;
		
		@FindBy(xpath="//*[@id='purchaseTable']/tbody/tr[4]/td[9]")
		private static WebElement pur4throw_9thColumn;
		
		@FindBy(xpath="//*[@id='purchaseTable']/tbody/tr[4]/td[10]")
		private static WebElement pur4throw_10thColumn;
		
		// 5TH
		
		@FindBy(xpath="//*[@id='purchaseTable']/tbody/tr[5]/td[1]")
		private static WebElement pur5throw_1stColumn;
		
		@FindBy(xpath="//*[@id='purchaseTable']/tbody/tr[5]/td[2]")
		private static WebElement pur5throw_2ndColumn;
		
		@FindBy(xpath="//*[@id='purchaseTable']/tbody/tr[5]/td[3]")
		private static WebElement pur5throw_3rdColumn;
		
		@FindBy(xpath="//*[@id='purchaseTable']/tbody/tr[5]/td[4]")
		private static WebElement pur5throw_4thColumn;
		
		@FindBy(xpath="//*[@id='purchaseTable']/tbody/tr[5]/td[5]")
		private static WebElement pur5throw_5thColumn;
		
		@FindBy(xpath="//*[@id='purchaseTable']/tbody/tr[5]/td[6]")
		private static WebElement pur5throw_6thColumn;
		
		@FindBy(xpath="//*[@id='purchaseTable']/tbody/tr[5]/td[7]")
		private static WebElement pur5throw_7thColumn;
		
		@FindBy(xpath="//*[@id='purchaseTable']/tbody/tr[5]/td[8]")
		private static WebElement pur5throw_8thColumn;
		
		@FindBy(xpath="//*[@id='purchaseTable']/tbody/tr[5]/td[9]")
		private static WebElement pur5throw_9thColumn;
		
		@FindBy(xpath="//*[@id='purchaseTable']/tbody/tr[5]/td[10]")
		private static WebElement pur5throw_10thColumn;
		
		// 6TH
		
		@FindBy(xpath="//*[@id='purchaseTable']/tbody/tr[6]/td[1]")
		private static WebElement pur6throw_1stColumn;
		
		@FindBy(xpath="//*[@id='purchaseTable']/tbody/tr[6]/td[2]")
		private static WebElement pur6throw_2ndColumn;
		
		@FindBy(xpath="//*[@id='purchaseTable']/tbody/tr[6]/td[3]")
		private static WebElement pur6throw_3rdColumn;
		
		@FindBy(xpath="//*[@id='purchaseTable']/tbody/tr[6]/td[4]")
		private static WebElement pur6throw_4thColumn;
		
		@FindBy(xpath="//*[@id='purchaseTable']/tbody/tr[6]/td[5]")
		private static WebElement pur6throw_5thColumn;
		
		@FindBy(xpath="//*[@id='purchaseTable']/tbody/tr[6]/td[6]")
		private static WebElement pur6throw_6thColumn;
		
		@FindBy(xpath="//*[@id='purchaseTable']/tbody/tr[6]/td[7]")
		private static WebElement pur6throw_7thColumn;
		
		@FindBy(xpath="//*[@id='purchaseTable']/tbody/tr[6]/td[8]")
		private static WebElement pur6throw_8thColumn;
		
		@FindBy(xpath="//*[@id='purchaseTable']/tbody/tr[6]/td[9]")
		private static WebElement pur6throw_9thColumn;
		
		@FindBy(xpath="//*[@id='purchaseTable']/tbody/tr[6]/td[10]")
		private static WebElement pur6throw_10thColumn;
		
		
		@FindBy(xpath="//td[contains(text(),'Quantity Purchased Till Date:')]")
		private static WebElement qtyPurchasedTillDate;
		
		@FindBy(xpath="//*[@id='purchaseTable']/tbody/tr[6]/td[2]")
		private static WebElement purTotalWa;
				
		
	// Inventory Reports Starts from Here

	public boolean checkItemQueryOfFIFOItem() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
		inventoryMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryReportsMenu));
		inventoryReportsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemQuery));
		itemQuery.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(iq_ItemTxt));
		iq_ItemTxt.click();
		iq_ItemTxt.sendKeys("FIFO COGS ITEM");
		Thread.sleep(2000);
		iq_ItemTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(iq_getStockBtn));
		iq_getStockBtn.click();
		
		Thread.sleep(5000);
		
		String actiq_OpeningStocks				=iq_OpeningStocks.getText();
		String actiq_PendingPurchaseOrders		=iq_PendingPurchaseOrders.getText();
		String actiq_CurrentStock				=iq_CurrentStock.getText();
		String actiq_PendingSalesOrders			=iq_PendingSalesOrders.getText();
		String actiq_AvgStockRate				=iq_AvgStockRate.getText();
		String actiq_QtyToBeOrdered				=iq_QtyToBeOrdered.getText();
		String actiq_Value						=iq_Value.getText();
		String actiq_BaseUnit     				=iq_BaseUnit.getText();
		
		String expiq_OpeningStocks				="48.00";
		String expiq_PendingPurchaseOrders		="0.00";
		String expiq_CurrentStock				="24.00";
		String expiq_PendingSalesOrders			="0.00";
		String expiq_AvgStockRate				="1.04";
		String expiq_QtyToBeOrdered				="0.00";
		String expiq_Value						="25.00";
		String expiq_BaseUnit     				="Pcs";
		
		
		
		// Recent Stock Transaction -Purchases
		
		String actpurVoucherNoR1	=pur1strow_2ndColumn.getText();
		String actpurVendorR1		=pur1strow_3rdColumn.getText();
		String actpurQtyR1			=pur1strow_4thColumn.getText();
		String actpurUnitR1			=pur1strow_5thColumn.getText();
		String actpurRateR1			=pur1strow_6thColumn.getText();
		String actpurCurrencyR1		=pur1strow_7thColumn.getText();
		String actpurQtyInBaseR1	=pur1strow_8thColumn.getText();
		
		String actpurVoucherNoR2	=pur2ndrow_2ndColumn.getText();
		
		
		// Expected
		
		String exppurVoucherNoR1	="NDT52:1";
		String exppurVendorR1		="Vendor A";
		String exppurQtyR1			="1.00";
		String exppurUnitR1			="Dozs";
		String exppurRateR1			="10.00";
		String exppurCurrencyR1		="Indian Rupees";
		String exppurQtyInBaseR1	="12.0000000000";
		
		String exppurVoucherNoR2	="1.00";
		
		
		
		// Recent Stock Transaction -Sales
		
		String actsalVoucherNoR1	=sal1strow_2ndColumn.getText();
		String actsalCustomerR1		=sal1strow_3rdColumn.getText();
		String actsalQtyR1			=sal1strow_4thColumn.getText();
		String actsalUnitR1			=sal1strow_5thColumn.getText();
		String actsalRateR1			=sal1strow_6thColumn.getText();
		String actsalCurrencyR1		=sal1strow_7thColumn.getText();
		String actsalQtyInBaseR1	=sal1strow_8thColumn.getText();
		
		String actsalVoucherNoR2	=sal2ndrow_2ndColumn.getText();
		String actsalCustomerR2		=sal2ndrow_3rdColumn.getText();
		String actsalQtyR2			=sal2ndrow_4thColumn.getText();
		String actsalUnitR2			=sal2ndrow_5thColumn.getText();
		String actsalRateR2			=sal2ndrow_6thColumn.getText();
		String actsalCurrencyR2		=sal2ndrow_7thColumn.getText();
		String actsalQtyInBaseR2	=sal2ndrow_8thColumn.getText();
		
		String actsalVoucherNoR3	=sal3rdrow_2ndColumn.getText();
		String actsalCustomerR3		=sal3rdrow_3rdColumn.getText();
		String actsalQtyR3			=sal3rdrow_4thColumn.getText();
		String actsalUnitR3			=sal3rdrow_5thColumn.getText();
		String actsalRateR3			=sal3rdrow_6thColumn.getText();
		String actsalCurrencyR3		=sal3rdrow_7thColumn.getText();
		String actsalQtyInBaseR3	=sal3rdrow_8thColumn.getText();
		
		String actsalVoucherNoR4	=sal4throw_2ndColumn.getText();
		String actsalCustomerR4		=sal4throw_3rdColumn.getText();
		String actsalQtyR4			=sal4throw_4thColumn.getText();
		String actsalUnitR4			=sal4throw_5thColumn.getText();
		String actsalRateR4			=sal4throw_6thColumn.getText();
		String actsalCurrencyR4		=sal4throw_7thColumn.getText();
		String actsalQtyInBaseR4	=sal4throw_8thColumn.getText();
		
		
		String actsalTotalWa		=salTotalWa.getText();

		// Expected
		String expsalVoucherNoR1	="NDT55:1";
		String expsalCustomerR1		="Customer A";
		String expsalQtyR1			="5.00";
		String expsalUnitR1			="Pcs";
		String expsalRateR1			="1.50";
		String expsalCurrencyR1		="Indian Rupees";
		String expsalQtyInBaseR1	="5.0000000000";
		
		
		
		String expsalVoucherNoR2	="NDT55:2";
		String expsalCustomerR2 	="Customer A";
		String expsalQtyR2			="27.00";
		String expsalUnitR2			="Pcs";
		String expsalRateR2			="1.50";
		String expsalCurrencyR2		="Indian Rupees";
		String expsalQtyInBaseR2	="27.0000000000";
		
		
		String expsalVoucherNoR3	="NDT55:3";
		String expsalCustomerR3		="Customer A";
		String expsalQtyR3			="8.00";
		String expsalUnitR3			="Pcs";
		String expsalRateR3			="10.00";
		String expsalCurrencyR3		="Indian Rupees";
		String expsalQtyInBaseR3	="8.0000000000";
		
		
		String expsalVoucherNoR4	="NDT55:4";
		String expsalCustomerR4 	="Customer A";
		String expsalQtyR4			="8.00";
		String expsalUnitR4			="Pcs";
		String expsalRateR4			="10.00";
		String expsalCurrencyR4		="Indian Rupees";
		String expsalQtyInBaseR4	="8.0000000000";
		
		
		
		String expsalTotalWa		="48.00";
		
		// WareHouse Table
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(BalancebyWareHouseExpandBtn));
		BalancebyWareHouseExpandBtn.click();
		
		Thread.sleep(3000);
		
		getAction().sendKeys(Keys.CONTROL,Keys.END).build().perform();
		
		
		String actwareHouseR1		=wh1strow_2ndColumn.getText();
		String actstockR1			=wh1strow_3rdColumn.getText();
		String actrateR1			=wh1strow_4thColumn.getText();
		String actvalueR1			=wh1strow_5thColumn.getText();
		
		String actwareHouseR2		=wh2ndrow_2ndColumn.getText();
		
		String actrateR2			=wh2ndrow_4thColumn.getText();
		
		
		// Expected
		String expwareHouseR1		="HYDERABAD";
		String expstockR1			="24.00";
		String exprateR1			="1.04";
		String expvalueR1			="25.00";
		
		
		String expwareHouseR2		="24.00";
		String exprateR2			="25.00";

				
		// SBalance By Bins
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(balanceByBinsExpandBtn));
		balanceByBinsExpandBtn.click();
		
		Thread.sleep(2000);
		
		getAction().sendKeys(Keys.CONTROL,Keys.END).build().perform();
		
		Thread.sleep(2000);
		
		String actsellingRateR1		=wh4throw_2ndColumn.getText();
		String actsellingValueR1	=wh4throw_3rdColumn.getText();
		String actbuyingRateR1		=wh4throw_4thColumn.getText();
		String actbuyingValueR1		=wh4throw_5thColumn.getText();
		
		String actsellingRateR2		=binsSubTotal.getText();
		String actsellingValueR2	=binsTotal.getText();
				
		// Expected
		
		String expsellingRateR1		="Bin4";
		String expsellingValueR1	="24.00";
		String expbuyingRateR1		="1.04";
		String expbuyingValueR1		="24.96";
		
		
		String expsellingRateR2		="24.00";
		String expsellingValueR2	="24.96";
		
		
		System.out.println("************************************checkItemQueryOfFIFOItem*************************************");
		
		System.out.println("iq_OpeningStocks     		 :   "+actiq_OpeningStocks					+" Value Expected : "+expiq_OpeningStocks);
		System.out.println("iq_PendingPurchaseOrders     :   "+actiq_PendingPurchaseOrders			+" Value Expected : "+expiq_PendingPurchaseOrders);
		System.out.println("iq_CurrentStock     		 :   "+actiq_CurrentStock					+" Value Expected : "+expiq_CurrentStock);
		System.out.println("iq_PendingSalesOrders     	 :   "+actiq_PendingSalesOrders				+" Value Expected : "+expiq_PendingSalesOrders);
		System.out.println("iq_AvgStockRate     		 :   "+actiq_AvgStockRate					+" Value Expected : "+expiq_AvgStockRate);
		System.out.println("iq_QtyToBeOrdered     		 :   "+actiq_QtyToBeOrdered					+" Value Expected : "+expiq_QtyToBeOrdered);
		System.out.println("iq_Value     				 :   "+actiq_Value							+" Value Expected : "+expiq_Value);
		System.out.println("iq_BaseUnit     			 :   "+actiq_BaseUnit						+" Value Expected : "+expiq_BaseUnit);
		
		System.out.println("********************* Purchase ******************");
		
		System.out.println("purVoucherNoR1     			 :   "+actpurVoucherNoR1					+" Value Expected : "+exppurVoucherNoR1);
		System.out.println("purVendorR1     			 :   "+actpurVendorR1						+" Value Expected : "+exppurVendorR1);
		System.out.println("purQtyR1     				 :   "+actpurQtyR1							+" Value Expected : "+exppurQtyR1);
		System.out.println("purUnitR1     				 :   "+actpurUnitR1							+" Value Expected : "+exppurUnitR1);
		System.out.println("purRateR1     				 :   "+actpurRateR1							+" Value Expected : "+exppurRateR1);
		System.out.println("purCurrencyR1     			 :   "+actpurCurrencyR1						+" Value Expected : "+exppurCurrencyR1);
		System.out.println("purQtyInBaseR1     			 :   "+actpurQtyInBaseR1					+" Value Expected : "+exppurQtyInBaseR1);
		
		System.out.println("purVoucherNoR2     			 :   "+actpurVoucherNoR2					+" Value Expected : "+exppurVoucherNoR2);
		
		System.out.println("********************* Sales ******************");
		
		System.out.println("salVoucherNoR1     			 :   "+actsalVoucherNoR1					+" Value Expected : "+expsalVoucherNoR1);
		System.out.println("salCustomerR1     			 :   "+actsalCustomerR1						+" Value Expected : "+expsalCustomerR1);
		System.out.println("salQtyR1     				 :   "+actsalQtyR1							+" Value Expected : "+expsalQtyR1);
		System.out.println("salUnitR1     				 :   "+actsalUnitR1							+" Value Expected : "+expsalUnitR1);
		System.out.println("salRateR1     				 :   "+actsalRateR1							+" Value Expected : "+expsalRateR1);
		System.out.println("salCurrencyR1     			 :   "+actsalCurrencyR1						+" Value Expected : "+expsalCurrencyR1);
		System.out.println("salQtyInBaseR1     			 :   "+actsalQtyInBaseR1					+" Value Expected : "+expsalQtyInBaseR1);
		
		System.out.println("salVoucherNoR2     			 :   "+actsalVoucherNoR2					+" Value Expected : "+expsalVoucherNoR2);
		System.out.println("salCustomerR2     			 :   "+actsalCustomerR2						+" Value Expected : "+expsalCustomerR2);
		System.out.println("salQtyR2     				 :   "+actsalQtyR2							+" Value Expected : "+expsalQtyR2);
		System.out.println("salUnitR2     				 :   "+actsalUnitR2							+" Value Expected : "+expsalUnitR2);
		System.out.println("salRateR2     				 :   "+actsalRateR2							+" Value Expected : "+expsalRateR2);
		System.out.println("salCurrencyR2     			 :   "+actsalCurrencyR2						+" Value Expected : "+expsalCurrencyR2);
		System.out.println("salQtyInBaseR2     			 :   "+actsalQtyInBaseR2					+" Value Expected : "+expsalQtyInBaseR2);
		
		System.out.println("salVoucherNoR3     			 :   "+actsalVoucherNoR3					+" Value Expected : "+expsalVoucherNoR3);
		System.out.println("salCustomerR3     			 :   "+actsalCustomerR3						+" Value Expected : "+expsalCustomerR3);
		System.out.println("salQtyR3     				 :   "+actsalQtyR3							+" Value Expected : "+expsalQtyR3);
		System.out.println("salUnitR3     				 :   "+actsalUnitR3							+" Value Expected : "+expsalUnitR3);
		System.out.println("salRateR3     				 :   "+actsalRateR3							+" Value Expected : "+expsalRateR3);
		System.out.println("salCurrencyR3     			 :   "+actsalCurrencyR3						+" Value Expected : "+expsalCurrencyR3);
		System.out.println("salQtyInBaseR3     			 :   "+actsalQtyInBaseR3					+" Value Expected : "+expsalQtyInBaseR3);
		
		System.out.println("salVoucherNoR4     			 :   "+actsalVoucherNoR4					+" Value Expected : "+expsalVoucherNoR4);
		System.out.println("salCustomerR4     			 :   "+actsalCustomerR4						+" Value Expected : "+expsalCustomerR4);
		System.out.println("salQtyR4     				 :   "+actsalQtyR4							+" Value Expected : "+expsalQtyR4);
		System.out.println("salUnitR4     				 :   "+actsalUnitR4							+" Value Expected : "+expsalUnitR4);
		System.out.println("salRateR4     				 :   "+actsalRateR4							+" Value Expected : "+expsalRateR4);
		System.out.println("salCurrencyR4     			 :   "+actsalCurrencyR4						+" Value Expected : "+expsalCurrencyR4);
		System.out.println("salQtyInBaseR4     			 :   "+actsalQtyInBaseR4					+" Value Expected : "+expsalQtyInBaseR4);
		
		
		System.out.println("salTotalWa                   :   "+actsalTotalWa                        +" Value expected : "+expsalTotalWa);
		
		
		System.out.println("********************* WareHouse ******************");
		
		System.out.println("wareHouseR1     			 :   "+actwareHouseR1						+" Value Expected : "+expwareHouseR1);
		System.out.println("stockR1     				 :   "+actstockR1							+" Value Expected : "+expstockR1);
		System.out.println("rateR1     				 	 :   "+actrateR1							+" Value Expected : "+exprateR1);
		System.out.println("valueR1     				 :   "+actvalueR1							+" Value Expected : "+expvalueR1);
		
		System.out.println("wareHouseR2     			 :   "+actwareHouseR2						+" Value Expected : "+expwareHouseR2);
		
		System.out.println("*************************Selling and Buying rates********************");
		
		System.out.println("sellingRateR1     			 :   "+actsellingRateR1						+" Value Expected : "+expsellingRateR1);
		System.out.println("sellingValueR1  			 :   "+actsellingValueR1					+" Value Expected : "+expsellingValueR1);
		System.out.println("buyingRateR1     			 :   "+actbuyingRateR1						+" Value Expected : "+expbuyingRateR1);
		System.out.println("buyingValueR1     			 :   "+actbuyingValueR1						+" Value Expected : "+expbuyingValueR1);
		
		System.out.println("sellingRateR2     			 :   "+actsellingRateR2						+" Value Expected : "+expsellingRateR2);
		System.out.println("sellingValueR2  			 :   "+actsellingValueR2					+" Value Expected : "+expsellingValueR2);
		
		if(actiq_OpeningStocks.equalsIgnoreCase(expiq_OpeningStocks) && actiq_PendingPurchaseOrders.equalsIgnoreCase(expiq_PendingPurchaseOrders)
				&& actiq_CurrentStock.equalsIgnoreCase(expiq_CurrentStock) && actiq_PendingSalesOrders.equalsIgnoreCase(expiq_PendingSalesOrders)
				&& actiq_AvgStockRate.equalsIgnoreCase(expiq_AvgStockRate) && actiq_QtyToBeOrdered.equalsIgnoreCase(expiq_QtyToBeOrdered)
				&& actiq_Value.equalsIgnoreCase(expiq_Value) && actiq_BaseUnit.equalsIgnoreCase(expiq_BaseUnit)
				
				&& actpurVoucherNoR1.equalsIgnoreCase(exppurVoucherNoR1) && actpurVendorR1.equalsIgnoreCase(exppurVendorR1) && actpurQtyR1.equalsIgnoreCase(exppurQtyR1)
				&& actpurUnitR1.equalsIgnoreCase(exppurUnitR1) && actpurRateR1.equalsIgnoreCase(exppurRateR1) && actpurCurrencyR1.equalsIgnoreCase(exppurCurrencyR1)
				&& actpurQtyInBaseR1.equalsIgnoreCase(exppurQtyInBaseR1)
				
				&& actpurVoucherNoR2.equalsIgnoreCase(exppurVoucherNoR2) 
				
				&& actsalVoucherNoR1.equalsIgnoreCase(expsalVoucherNoR1) && actsalCustomerR1.equalsIgnoreCase(expsalCustomerR1) && actsalQtyR1.equalsIgnoreCase(expsalQtyR1)
				&& actsalUnitR1.equalsIgnoreCase(expsalUnitR1) && actsalRateR1.equalsIgnoreCase(expsalRateR1) && actsalCurrencyR1.equalsIgnoreCase(expsalCurrencyR1)
				&& actsalQtyInBaseR1.equalsIgnoreCase(expsalQtyInBaseR1)
				
				&& actsalVoucherNoR2.equalsIgnoreCase(expsalVoucherNoR2) && actsalCustomerR2.equalsIgnoreCase(expsalCustomerR2) && actsalQtyR2.equalsIgnoreCase(expsalQtyR2)
				&& actsalUnitR2.equalsIgnoreCase(expsalUnitR2) && actsalRateR2.equalsIgnoreCase(expsalRateR2) && actsalCurrencyR2.equalsIgnoreCase(expsalCurrencyR2)
				&& actsalQtyInBaseR2.equalsIgnoreCase(expsalQtyInBaseR2)
				
				&& actsalTotalWa.equalsIgnoreCase(expsalTotalWa)
				
				&& actwareHouseR1.equalsIgnoreCase(expwareHouseR1) && actstockR1.equalsIgnoreCase(expstockR1) 
				&& actrateR1.equalsIgnoreCase(exprateR1) && actvalueR1.equalsIgnoreCase(expvalueR1)
				
				&& actwareHouseR2.equalsIgnoreCase(expwareHouseR2) 
				
				&& actsellingRateR1.equalsIgnoreCase(expsellingRateR1) && actsellingValueR1.equalsIgnoreCase(expsellingValueR1)
				&& actbuyingRateR1.equalsIgnoreCase(expbuyingRateR1) && actbuyingValueR1.equalsIgnoreCase(expbuyingValueR1)
				
				&& actsellingRateR2.equalsIgnoreCase(expsellingRateR2) && actsellingValueR2.equalsIgnoreCase(expsellingValueR2))
		{
			System.out.println("Test Pass : Data Displayed As esxpected");
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(iq_closeBtn));
			iq_closeBtn.click();
			//excelReader.setCellData(xlfile, xlsheet, 14, 9, resPass);
			
			return true;
		}
		else
		{
			System.out.println("Test Fail : Data NOT Displayed As esxpected");
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(iq_closeBtn));
			iq_closeBtn.click();
			//excelReader.setCellData(xlfile, xlsheet, 14, 9, resFail);
			return false;
		}
		
		
	}
	
	
	
	
	
	@FindBy(xpath="//*[@id='BinTableData']/tbody/tr[2]/td[2]")
	private static WebElement binsSubTotal;
	
	@FindBy(xpath="//*[@id='BinTableData']/tbody/tr[2]/td[4]")
	private static WebElement binsTotal;
	
	
	@FindBy(xpath="//div[@id='dvReportDetails']/div/table/tbody/tr/td[1]")
	private static List<WebElement> report1stColList;
	
	@FindBy(xpath="//div[@id='dvReportDetails']/div/table/tbody/tr/td[2]")
	private static List<WebElement> report2ndColList;
	
	@FindBy(xpath="//div[@id='dvReportDetails']/div/table/tbody/tr/td[3]")
	private static List<WebElement> report3rdColList;
	
	@FindBy(xpath="//div[@id='dvReportDetails']/div/table/tbody/tr/td[4]")
	private static List<WebElement> report4thColList;
	
	@FindBy(xpath="//div[@id='dvReportDetails']/div/table/tbody/tr/td[5]")
	private static List<WebElement> report5thColList;
	
	@FindBy(xpath="//div[@id='dvReportDetails']/div/table/tbody/tr/td[6]")
	private static List<WebElement> report6thColList;
	
	@FindBy(xpath="//div[@id='dvReportDetails']/div/table/tbody/tr/td[7]")
	private static List<WebElement> report7thColList;
	
	@FindBy(xpath="//div[@id='dvReportDetails']/div/table/tbody/tr/td[8]")
	private 
	
	
	
	static List<WebElement> report8thColList;
	
	@FindBy(xpath="//div[@id='dvReportDetails']/div/table/tbody/tr/td[9]")
	private static List<WebElement> report9thColList;
	
	@FindBy(xpath="//div[@id='dvReportDetails']/div/table/tbody/tr/td[10]")
	private static List<WebElement> report10thColList;
	
	@FindBy(xpath="//div[@id='dvReportDetails']/div/table/tbody/tr/td[11]")
	private static List<WebElement> report11thColList;
	
	@FindBy(xpath="//div[@id='dvReportDetails']/div/table/tbody/tr/td[12]")
	private static List<WebElement> report12thColList;
	
	@FindBy(xpath="//div[@id='dvReportDetails']/div/table/tbody/tr/td[13]")
	private static List<WebElement> report13thColList;
	
	@FindBy(xpath="//div[@id='dvReportDetails']/div/table/tbody/tr/td[14]")
	private static List<WebElement> report14thColList;
	
	@FindBy(xpath="//div[@id='dvReportDetails']/div/table/tbody/tr/td[15]")
	private static List<WebElement> report15thColList;
	
	
	@FindBy(xpath="//tbody[@id='LandingGridBody']/tr/td[12]")
	private static List<WebElement> reportNameList;
	
	
	@FindBy(xpath="//tbody[@id='LandingGridBody']/tr/td[8]/div/label/input")
	private static List<WebElement> reportsChkboxList;
	
	
	
	// Stock Ledger

		public boolean checkStockLedgerReportWithInduvidualItemSelection() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			
			
			System.out.println("************************************checkStockLedgerReportWithInduvidualItemSelection********************************************");
			
			Thread.sleep(3000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
			inventoryMenu.click();
			
			Thread.sleep(3000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryReportsMenu));
			inventoryReportsMenu.click();
			
			Thread.sleep(3000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(stockLedger));
			stockLedger.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
			Select s=new Select(sl_DateOptionDropdown);
			s.selectByValue("1");
			
			
			Thread.sleep(2000);
			
			int rowcount=stockLedgerHometableRowCount.size();
			
			System.out.println(rowcount);
			
			for (int i = 0; i < rowcount; i++) 
			{
				String actname=reportNameList.get(i).getText();
				
				System.out.println(actname);
				
				Thread.sleep(2000);
				
				if (actname.equalsIgnoreCase("FIFO COGS ITEM")) 
				{
					reportsChkboxList.get(i).click();
					
					Thread.sleep(2000);
					
					break;
					
				}
				
			}
			
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
			sl_OkBtn.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_OptionsBtn));
			report_OptionsBtn.click();
			
			
			Thread.sleep(5000);
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_1stRow2ndCol));

			String actItemNameR1				= sl_1stRow2ndCol.getText();
			
			String expItemNameR1				= "FIFO COGS ITEM FIFO COGS ITEM";
			
			System.out.println("ItemNameR1   			: "+actItemNameR1					+" Value Expected : "+expItemNameR1);
			
			
            int report3rdColListCount = report3rdColList.size();
			
			ArrayList<String> report3rdColListArray = new ArrayList<String>();
			
			for(int i=0;i<report3rdColListCount;i++)
			{
				String data = report3rdColList.get(i).getText();
				report3rdColListArray.add(data);
				
			}
			
			String actreport3rdColList = report3rdColListArray.toString();
			String expreport3rdColList = "[, Opening Balance, NDT55:1, NDT52:1, NDT55:2, StkTrf:1, StkTrf:1, NDT55:3, SalRet:1, SalRet:2, NDT55:4, PurRet:1, ExeStk:1, ShoStk:1]";
			
	
			
			
			System.out.println("actreport3rdColList   : "+actreport3rdColList);
			System.out.println("expreport3rdColList   : "+expreport3rdColList);
			
			
            int report4thColListCount = report4thColList.size();
			
			ArrayList<String> report4thColListArray = new ArrayList<String>();
			
			for(int i=0;i<report4thColListCount;i++)
			{
				String data = report4thColList.get(i).getText();
				report4thColListArray.add(data);
				
			}
			
			String actreport4thColList = report4thColListArray.toString();
			String expreport4thColList = "[, 48.00, , 12.00, , , 8.00, , 5.00, 8.00, , , 12.00, ]";
			
			
			System.out.println("actreport4thColList   : "+actreport4thColList);
			System.out.println("expreport4thColList   : "+expreport4thColList);
			
			
            int report5thColListCount = report5thColList.size();
			
			ArrayList<String> report5thColListArray = new ArrayList<String>();
			
			for(int i=0;i<report5thColListCount;i++)
			{
				String data = report5thColList.get(i).getText();
				report5thColListArray.add(data);
				
			}
			
			String actreport5thColList = report5thColListArray.toString();
			String expreport5thColList = "[, , , 0.83, , , 1.25, , 1.25, 1.25, , , 0.83, ]";
			
			
			System.out.println("actreport5thColList   : "+actreport5thColList);
			System.out.println("expreport5thColList   : "+expreport5thColList);
			
			
			int report6thColListCount = report6thColList.size();
				
			ArrayList<String> report6thColListArray = new ArrayList<String>();
			
			for(int i=0;i<report6thColListCount;i++)
			{
				String data = report6thColList.get(i).getText();
				report6thColListArray.add(data);
				
			}
			
			String actreport6thColList = report6thColListArray.toString();
			String expreport6thColList = "[, , 5.00, , 27.00, 8.00, , 8.00, , , 8.00, 1.00, , 12.00]";
		
			
			System.out.println("actreport6thColList   : "+actreport6thColList);
			System.out.println("expreport6thColList   : "+expreport6thColList);
			
			
			int report7thColListCount = report7thColList.size();
			
			ArrayList<String> report7thColListArray = new ArrayList<String>();
			
			for(int i=0;i<report7thColListCount;i++)
			{
				String data = report7thColList.get(i).getText();
				report7thColListArray.add(data);
				
			}
			
			String actreport7thColList = report7thColListArray.toString();
			String expreport7thColList = "[, , 1.25, , 1.25, 1.25, , 1.25, , , 0.83, 0.83, , 1.15]";
			
			System.out.println("actreport7thColList   : "+actreport7thColList);
			System.out.println("expreport7thColList   : "+expreport7thColList);
			
			
			
            int report8thColListCount = report8thColList.size();
			
			ArrayList<String> report8thColListArray = new ArrayList<String>();
			
			for(int i=0;i<report8thColListCount;i++)
			{
				String data = report8thColList.get(i).getText();
				report8thColListArray.add(data);
				
			}
			
			String actreport8thColList = report8thColListArray.toString();
			String expreport8thColList = "[, 48.00, 43.00, 55.00, 28.00, 20.00, 28.00, 20.00, 25.00, 33.00, 25.00, 24.00, 36.00, 24.00]";
			
			
			System.out.println("actreport8thColList   : "+actreport8thColList);
			System.out.println("expreport8thColList   : "+expreport8thColList);
			
			
			int report9thColListCount = report9thColList.size();
				
			ArrayList<String> report9thColListArray = new ArrayList<String>();
			
			for(int i=0;i<report9thColListCount;i++)
			{
				String data = report9thColList.get(i).getText();
				report9thColListArray.add(data);
				
			}
			
			String actreport9thColList = report9thColListArray.toString();
			String expreport9thColList = "[, , , 10.00, , , 10.00, , 6.25, 10.00, , , 10.00, ]";
				
			

			System.out.println("actreport9thColList   : "+actreport9thColList);
			System.out.println("expreport9thColList   : "+expreport9thColList);
			
			int report10thColListCount = report10thColList.size();
			
			ArrayList<String> report10thColListArray = new ArrayList<String>();
			
			for(int i=0;i<report10thColListCount;i++)
			{
				String data = report10thColList.get(i).getText();
				report10thColListArray.add(data);
				
			}
			
			String actreport10thColList = report10thColListArray.toString();
			String expreport10thColList = "[, , 6.25, , 33.75, 10.00, , 10.00, , , 6.67, 0.83, , 13.75]";
			
			
			System.out.println("actreport10thColList   : "+actreport10thColList);
			System.out.println("expreport10thColList   : "+expreport10thColList);
			
			
            int report11thColListCount = report11thColList.size();
			
			ArrayList<String> report11thColListArray = new ArrayList<String>();
			
			for(int i=0;i<report11thColListCount;i++)
			{
				String data = report11thColList.get(i).getText();
				report11thColListArray.add(data);
				
			}
			
			String actreport11thColList = report11thColListArray.toString();
			String expreport11thColList = "[, 60.00, 53.75, 63.75, 30.00, 20.00, 30.00, 20.00, 26.25, 36.25, 29.58, 28.75, 38.75, 25.00]";
			
			
			System.out.println("actreport11thColList   : "+actreport11thColList);
			System.out.println("expreport11thColList   : "+expreport11thColList);
			
			
			Thread.sleep(2000);
			
			
			/*int report12thColListCount = report12thColList.size();
				
			ArrayList<String> report12thColListArray = new ArrayList<String>();
			
			for(int i=0;i<report12thColListCount;i++)
			{
				String data = report12thColList.get(i).getText();
				report11thColListArray.add(data);
				
			}
			
			String actreport12thColList = report12thColListArray.toString();
			String expreport12thColList = "[]";
			
			
			System.out.println("actreport12thColList   : "+actreport12thColList);
			System.out.println("expreport12thColList   : "+expreport12thColList);
			
			
			
			int report13thColListCount = report13thColList.size();
			
			ArrayList<String> report13thColListArray = new ArrayList<String>();
			
			for(int i=0;i<report13thColListCount;i++)
			{
				String data = report13thColList.get(i).getText();
				report13thColListArray.add(data);
				
			}
			
			String actreport13thColList = report13thColListArray.toString();
			String expreport13thColList = "";
			
			System.out.println("actreport13thColList   : "+actreport13thColList);
			System.out.println("expreport13thColList   : "+expreport13thColList);
			*/
			
		
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_NextBtn));
			report_NextBtn.click();
			
			Thread.sleep(2000);
			
			
            int report1stRowListCount = report1stRowList.size();
			
			ArrayList<String> report1stRowListArray = new ArrayList<String>();
			
			for(int i=0;i<report1stRowListCount;i++)
			{
				String data = report1stRowList.get(i).getText();
				report1stRowListArray.add(data);
				
			}
			
			String actreport1stRowList = report1stRowListArray.toString();
			String expreport1stRowList = "[15, , Reserved stock, , , 3.00, , 21.00, , , , , , , ]";
			
			System.out.println("actreport1stRowList   : "+actreport1stRowList);
			System.out.println("expreport1stRowList   : "+expreport1stRowList);
			
			
			 int report2ndRowListCount = report2ndRowList.size();
				
				ArrayList<String> report2ndRowListArray = new ArrayList<String>();
				
				for(int i=0;i<report2ndRowListCount;i++)
				{
					String data = report2ndRowList.get(i).getText();
					report2ndRowListArray.add(data);
					
				}
				
				String actreport2ndRowList = report2ndRowListArray.toString();
				String expreport2ndRowList = "[16, Total, , 93.00, 5.42, 72.00, 7.81, 21.00, 46.25, 81.25, 25.00, 14.62, , , ]";
				
				System.out.println("actreport1stRowList   : "+actreport2ndRowList);
				System.out.println("expreport1stRowList   : "+expreport2ndRowList);
				
			
			
           if(actItemNameR1.equalsIgnoreCase(expItemNameR1) && 
            		   actreport3rdColList.equalsIgnoreCase(expreport3rdColList) && actreport4thColList.equalsIgnoreCase(expreport4thColList) && 
            		   actreport5thColList.equalsIgnoreCase(expreport5thColList) && actreport6thColList.equalsIgnoreCase(expreport6thColList) && 
            		   actreport7thColList.equalsIgnoreCase(expreport7thColList) && actreport8thColList.equalsIgnoreCase(expreport8thColList) && 
            		   actreport9thColList.equalsIgnoreCase(expreport9thColList) && actreport10thColList.equalsIgnoreCase(expreport10thColList) && 
            		   actreport11thColList.equalsIgnoreCase(expreport11thColList) && /*actreport12thColList.equalsIgnoreCase(expreport12thColList) &&*/ 
            		   actreport2ndRowList.equalsIgnoreCase(expreport2ndRowList))
			{
				System.out.println("Test Pass : Output Options Are as Expected ");
				//excelReader.setCellData(xlfile, xlsheet, 149, 9, resPass);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
				report_CloseBtn.click();
				Thread.sleep(2000);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
				sl_CloseBtn.click();
				return true;
			}
			else
			{
				System.out.println("Test Fail : output Options Are NOT as Expected ");
				//excelReader.setCellData(xlfile, xlsheet, 149, 9, resFail);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
				report_CloseBtn.click();
				Thread.sleep(2000);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
				sl_CloseBtn.click();
				return false;
			}
		}
	
		
	
		public boolean checkStockLedgerReportBySelectingAllItem() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			
			System.out.println("************************************checkStockLedgerReportBySelectingAllItem********************************************");
			
			Thread.sleep(3000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
			inventoryMenu.click();
			
			Thread.sleep(3000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryReportsMenu));
			inventoryReportsMenu.click();
			
			Thread.sleep(3000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(stockLedger));
			stockLedger.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
			Select s=new Select(sl_DateOptionDropdown);
			s.selectByValue("1");
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_HeaderSelectChkBox));
			sl_HeaderSelectChkBox.click();
			
			
			/*int rowcount=stockLedgerHometableRowCount.size();
			
			System.out.println(rowcount);
			
			for (int i = 0; i < rowcount; i++) 
			{
				String actname=reportNameList.get(i).getText();
				
				System.out.println(actname);
				
				Thread.sleep(2000);
				
				if (actname.equalsIgnoreCase("FIFO COGS ITEM")) 
				{
					reportsChkboxList.get(i).click();
					
					Thread.sleep(2000);
					
					break;
					
				}
				
			}
			*/
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
			sl_OkBtn.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_OptionsBtn));
			report_OptionsBtn.click();
			
			
			Thread.sleep(5000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_1stRow2ndCol));

			String actItemNameR1				= sl_1stRow2ndCol.getText();
			
			String expItemNameR1				= "FIFO COGS ITEM FIFO COGS ITEM";
			
			System.out.println("ItemNameR1   			: "+actItemNameR1					+" Value Expected : "+expItemNameR1);
			
			
            int report3rdColListCount = report3rdColList.size();
			
			ArrayList<String> report3rdColListArray = new ArrayList<String>();
			
			for(int i=0;i<report3rdColListCount;i++)
			{
				String data = report3rdColList.get(i).getText();
				report3rdColListArray.add(data);
				
			}
			
			String actreport3rdColList = report3rdColListArray.toString();
			String expreport3rdColList = "[, Opening Balance, NDT55:1, NDT52:1, NDT55:2, StkTrf:1, StkTrf:1, NDT55:3, SalRet:1, SalRet:2, NDT55:4, PurRet:1, ExeStk:1, ShoStk:1]";
			
	
			
			
			System.out.println("actreport3rdColList   : "+actreport3rdColList);
			System.out.println("expreport3rdColList   : "+expreport3rdColList);
			
			
            int report4thColListCount = report4thColList.size();
			
			ArrayList<String> report4thColListArray = new ArrayList<String>();
			
			for(int i=0;i<report4thColListCount;i++)
			{
				String data = report4thColList.get(i).getText();
				report4thColListArray.add(data);
				
			}
			
			String actreport4thColList = report4thColListArray.toString();
			String expreport4thColList = "[, 48.00, , 12.00, , , 8.00, , 5.00, 8.00, , , 12.00, ]";
			
			
			System.out.println("actreport4thColList   : "+actreport4thColList);
			System.out.println("expreport4thColList   : "+expreport4thColList);
			
			
            int report5thColListCount = report5thColList.size();
			
			ArrayList<String> report5thColListArray = new ArrayList<String>();
			
			for(int i=0;i<report5thColListCount;i++)
			{
				String data = report5thColList.get(i).getText();
				report5thColListArray.add(data);
				
			}
			
			String actreport5thColList = report5thColListArray.toString();
			String expreport5thColList = "[, , , 0.83, , , 1.25, , 1.25, 1.25, , , 0.83, ]";
			
			
			System.out.println("actreport5thColList   : "+actreport5thColList);
			System.out.println("expreport5thColList   : "+expreport5thColList);
			
			
			int report6thColListCount = report6thColList.size();
				
			ArrayList<String> report6thColListArray = new ArrayList<String>();
			
			for(int i=0;i<report6thColListCount;i++)
			{
				String data = report6thColList.get(i).getText();
				report6thColListArray.add(data);
				
			}
			
			String actreport6thColList = report6thColListArray.toString();
			String expreport6thColList = "[, , 5.00, , 27.00, 8.00, , 8.00, , , 8.00, 1.00, , 12.00]";
		
			
			System.out.println("actreport6thColList   : "+actreport6thColList);
			System.out.println("expreport6thColList   : "+expreport6thColList);
			
			
			int report7thColListCount = report7thColList.size();
			
			ArrayList<String> report7thColListArray = new ArrayList<String>();
			
			for(int i=0;i<report7thColListCount;i++)
			{
				String data = report7thColList.get(i).getText();
				report7thColListArray.add(data);
				
			}
			
			String actreport7thColList = report7thColListArray.toString();
			String expreport7thColList = "[, , 1.25, , 1.25, 1.25, , 1.25, , , 0.83, 0.83, , 1.15]";
			
			System.out.println("actreport7thColList   : "+actreport7thColList);
			System.out.println("expreport7thColList   : "+expreport7thColList);
			
			
			
            int report8thColListCount = report8thColList.size();
			
			ArrayList<String> report8thColListArray = new ArrayList<String>();
			
			for(int i=0;i<report8thColListCount;i++)
			{
				String data = report8thColList.get(i).getText();
				report8thColListArray.add(data);
				
			}
			
			String actreport8thColList = report8thColListArray.toString();
			String expreport8thColList = "[, 48.00, 43.00, 55.00, 28.00, 20.00, 28.00, 20.00, 25.00, 33.00, 25.00, 24.00, 36.00, 24.00]";
			
			
			System.out.println("actreport8thColList   : "+actreport8thColList);
			System.out.println("expreport8thColList   : "+expreport8thColList);
			
			
			int report9thColListCount = report9thColList.size();
				
			ArrayList<String> report9thColListArray = new ArrayList<String>();
			
			for(int i=0;i<report9thColListCount;i++)
			{
				String data = report9thColList.get(i).getText();
				report9thColListArray.add(data);
				
			}
			
			String actreport9thColList = report9thColListArray.toString();
			String expreport9thColList = "[, , , 10.00, , , 10.00, , 6.25, 10.00, , , 10.00, ]";
				
			

			System.out.println("actreport9thColList   : "+actreport9thColList);
			System.out.println("expreport9thColList   : "+expreport9thColList);
			
			int report10thColListCount = report10thColList.size();
			
			ArrayList<String> report10thColListArray = new ArrayList<String>();
			
			for(int i=0;i<report10thColListCount;i++)
			{
				String data = report10thColList.get(i).getText();
				report10thColListArray.add(data);
				
			}
			
			String actreport10thColList = report10thColListArray.toString();
			String expreport10thColList = "[, , 6.25, , 33.75, 10.00, , 10.00, , , 6.67, 0.83, , 13.75]";
			
			
			System.out.println("actreport10thColList   : "+actreport10thColList);
			System.out.println("expreport10thColList   : "+expreport10thColList);
			
			
            int report11thColListCount = report11thColList.size();
			
			ArrayList<String> report11thColListArray = new ArrayList<String>();
			
			for(int i=0;i<report11thColListCount;i++)
			{
				String data = report11thColList.get(i).getText();
				report11thColListArray.add(data);
				
			}
			
			String actreport11thColList = report11thColListArray.toString();
			String expreport11thColList = "[, 60.00, 53.75, 63.75, 30.00, 20.00, 30.00, 20.00, 26.25, 36.25, 29.58, 28.75, 38.75, 25.00]";
			
			
			System.out.println("actreport11thColList   : "+actreport11thColList);
			System.out.println("expreport11thColList   : "+expreport11thColList);
			
			
			Thread.sleep(2000);
			
			
			/*int report12thColListCount = report12thColList.size();
				
			ArrayList<String> report12thColListArray = new ArrayList<String>();
			
			for(int i=0;i<report12thColListCount;i++)
			{
				String data = report12thColList.get(i).getText();
				report11thColListArray.add(data);
				
			}
			
			String actreport12thColList = report12thColListArray.toString();
			String expreport12thColList = "[]";
			
			
			System.out.println("actreport12thColList   : "+actreport12thColList);
			System.out.println("expreport12thColList   : "+expreport12thColList);
			
			
			
			int report13thColListCount = report13thColList.size();
			
			ArrayList<String> report13thColListArray = new ArrayList<String>();
			
			for(int i=0;i<report13thColListCount;i++)
			{
				String data = report13thColList.get(i).getText();
				report13thColListArray.add(data);
				
			}
			
			String actreport13thColList = report13thColListArray.toString();
			String expreport13thColList = "";
			
			System.out.println("actreport13thColList   : "+actreport13thColList);
			System.out.println("expreport13thColList   : "+expreport13thColList);
			*/
			
		
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_NextBtn));
			report_NextBtn.click();
			
			Thread.sleep(2000);
			
			
            int report1stRowListCount = report1stRowList.size();
			
			ArrayList<String> report1stRowListArray = new ArrayList<String>();
			
			for(int i=0;i<report1stRowListCount;i++)
			{
				String data = report1stRowList.get(i).getText();
				report1stRowListArray.add(data);
				
			}
			
			String actreport1stRowList = report1stRowListArray.toString();
			String expreport1stRowList = "[15, , Reserved stock, , , 3.00, , 21.00, , , , , , , ]";
			
			System.out.println("actreport1stRowList   : "+actreport1stRowList);
			System.out.println("expreport1stRowList   : "+expreport1stRowList);
			
			
			 int report2ndRowListCount = report2ndRowList.size();
				
				ArrayList<String> report2ndRowListArray = new ArrayList<String>();
				
				for(int i=0;i<report2ndRowListCount;i++)
				{
					String data = report2ndRowList.get(i).getText();
					report2ndRowListArray.add(data);
					
				}
				
				String actreport2ndRowList = report2ndRowListArray.toString();
				String expreport2ndRowList = "[16, Total, , 93.00, 5.42, 72.00, 7.81, 21.00, 46.25, 81.25, 25.00, 14.62, , , ]";
				
				System.out.println("actreport1stRowList   : "+actreport2ndRowList);
				System.out.println("expreport1stRowList   : "+expreport2ndRowList);
				
			
			
           if(actItemNameR1.equalsIgnoreCase(expItemNameR1) && 
            		   actreport3rdColList.equalsIgnoreCase(expreport3rdColList) && actreport4thColList.equalsIgnoreCase(expreport4thColList) && 
            		   actreport5thColList.equalsIgnoreCase(expreport5thColList) && actreport6thColList.equalsIgnoreCase(expreport6thColList) && 
            		   actreport7thColList.equalsIgnoreCase(expreport7thColList) && actreport8thColList.equalsIgnoreCase(expreport8thColList) && 
            		   actreport9thColList.equalsIgnoreCase(expreport9thColList) && actreport10thColList.equalsIgnoreCase(expreport10thColList) && 
            		   actreport11thColList.equalsIgnoreCase(expreport11thColList) && /*actreport12thColList.equalsIgnoreCase(expreport12thColList) &&*/ 
            		   actreport2ndRowList.equalsIgnoreCase(expreport2ndRowList))
			{
				System.out.println("Test Pass : Output Options Are as Expected ");
				//excelReader.setCellData(xlfile, xlsheet, 149, 9, resPass);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
				report_CloseBtn.click();
				Thread.sleep(2000);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
				sl_CloseBtn.click();
				return true;
			}
			else
			{
				System.out.println("Test Fail : output Options Are NOT as Expected ");
				//excelReader.setCellData(xlfile, xlsheet, 149, 9, resFail);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
				report_CloseBtn.click();
				Thread.sleep(2000);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
				sl_CloseBtn.click();
				return false;
			}
		}
	
		
		
		@FindBy(xpath="//div[@id='dvReportDetails']/div/table/tbody/tr[1]/td")
		private static List<WebElement> report1stRowList;
		
		@FindBy(xpath="//div[@id='dvReportDetails']/div/table/tbody/tr[2]/td")
		private static List<WebElement> report2ndRowList;
		
		@FindBy(xpath="//div[@id='dvReportDetails']/div/table/tbody/tr[3]/td")
		private static List<WebElement> report3rdRowList;
		
		@FindBy(xpath="//div[@id='dvReportDetails']/div/table/tbody/tr[4]/td")
		private static List<WebElement> report4thRowList;
		
		@FindBy(xpath="//div[@id='dvReportDetails']/div/table/tbody/tr[5]/td")
		private static List<WebElement> report5thRowList;
		
		@FindBy(xpath="//div[@id='dvReportDetails']/div/table/tbody/tr[6]/td")
		private static List<WebElement> report6thRowList;
		
		@FindBy(xpath="//div[@id='dvReportDetails']/div/table/tbody/tr[7]/td")
		private static List<WebElement> report7thRowList;
		
		
		@FindBy(xpath="//div[@id='dvReportDetails']/div/table/tbody/tr[8]/td")
		private static List<WebElement> report8thRowList;
		
		
		@FindBy(xpath="//div[@id='dvReportDetails']/div/table/tbody/tr[9]/td")
		private static List<WebElement> report9thRowList;
		
		
		@FindBy(xpath="//div[@id='dvReportDetails']/div/table/tbody/tr[10]/td")
		private static List<WebElement> report10thRowList;
		
		
		
		
		
	
		public boolean checkOpeningStockRegisterReport() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
		inventoryMenu.click();
		
		Thread.sleep(3000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryReportsMenu));
		inventoryReportsMenu.click();
		
		Thread.sleep(3000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(openingStocksRegister));
		openingStocksRegister.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByValue("1");
		
		String actsl_DateOptionDropdown    =s.getFirstSelectedOption().getText();
		String expsl_DateOptionDropdown    ="As on date";
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		
		Thread.sleep(3000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_1stRow2ndCol));
	
		Thread.sleep(2000);
		
		
        int report1stRowListCount = report1stRowList.size();
		
		ArrayList<String> report1stRowListArray = new ArrayList<String>();
		
		for(int i=0;i<report1stRowListCount;i++)
		{
			String data = report1stRowList.get(i).getText();
			
			if(i==1)
			{
				data="Date Field";
			}
			
			report1stRowListArray.add(data);
			
		}
		
		String actreport1stRowList = report1stRowListArray.toString();
		String expreport1stRowList = "[1, Date Field, FIFO COGS ITEM, 48.00, 15.00, 60.00]";
		
		System.out.println("actreport1stRowList   : "+actreport1stRowList);
		System.out.println("expreport1stRowList   : "+expreport1stRowList);
		
		
		 int report2ndRowListCount = report2ndRowList.size();
			
			ArrayList<String> report2ndRowListArray = new ArrayList<String>();
			
			for(int i=0;i<report2ndRowListCount;i++)
			{
				String data = report2ndRowList.get(i).getText();
				report2ndRowListArray.add(data);
				
			}
			
			String actreport2ndRowList = report2ndRowListArray.toString();
			String expreport2ndRowList = "[2, Grand Total, , 48.00, 15.00, 60.00]";
			
			System.out.println("actreport1stRowList   : "+actreport2ndRowList);
			System.out.println("expreport1stRowList   : "+expreport2ndRowList);
			
		
		
		if(actreport1stRowList.equalsIgnoreCase(expreport1stRowList) && actreport2ndRowList.equalsIgnoreCase(expreport2ndRowList) )
		{
			System.out.println("Test Pass : Report is As Expected");
			//excelReader.setCellData(xlfile, xlsheet, 288, 9, resPass);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
			report_CloseBtn.click();
			
			Thread.sleep(2000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
			sl_CloseBtn.click();
			
			return true;
		}
		else
		{
			System.out.println("Test Fail : Report is NOT As Expected");
			//excelReader.setCellData(xlfile, xlsheet, 288, 9, resFail);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
			report_CloseBtn.click();
			
			Thread.sleep(2000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
			sl_CloseBtn.click();
			
			return false;
		}
	}



@FindBy(xpath="//tbody[@id='LandingGridBody']/tr")
private static List<WebElement> stockLedgerHometableRowCount;



public boolean checkStockStatementReport() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
{
	
	System.out.println("**********************checkStockStatementReport************");
	
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
	inventoryMenu.click();
	
	Thread.sleep(3000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryReportsMenu));
	inventoryReportsMenu.click();
	
	Thread.sleep(3000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(stockStatement));
	stockStatement.click();
	
	Thread.sleep(2000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
	Select s=new Select(sl_DateOptionDropdown);
	s.selectByValue("1");
	
	String actsl_DateOptionDropdown    =s.getFirstSelectedOption().getText();
	String expsl_DateOptionDropdown    ="As on date";
	
	Thread.sleep(2000);
	
	int rowcount=stockLedgerHometableRowCount.size();
	
	System.out.println(rowcount);
	
	for (int i = 0; i < rowcount; i++) 
	{
		String actname=reportNameList.get(i).getText();
		
		System.out.println(actname);
		
		if (actname.equalsIgnoreCase("FIFO COGS ITEM")) 
		{
			reportsChkboxList.get(i).click();
			
			break;
		}
	}
	
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
	sl_OkBtn.click();
	
	Thread.sleep(3000);
	 int report1stRowListCount = report1stRowList.size();
		
		ArrayList<String> report1stRowListArray = new ArrayList<String>();
		
		for(int i=0;i<report1stRowListCount;i++)
		{
			String data = report1stRowList.get(i).getText();
			
			report1stRowListArray.add(data);
			
		}
		
		String actreport1stRowList = report1stRowListArray.toString();
		String expreport1stRowList = "[1, FIFO COGS ITEM FIFO COGS ITEM, , , , , ]";
		
		System.out.println("actreport1stRowList   : "+actreport1stRowList);
		System.out.println("expreport1stRowList   : "+expreport1stRowList);
		
		
		int report2ndRowListCount = report2ndRowList.size();
			
		ArrayList<String> report2ndRowListArray = new ArrayList<String>();
		
		for(int i=0;i<report2ndRowListCount;i++)
		{
			String data = report2ndRowList.get(i).getText();
			
			if(i==1)
			{
				data="Date Field";
			}
			
			
			report2ndRowListArray.add(data);
			
		}
		
		String actreport2ndRowList = report2ndRowListArray.toString();
		String expreport2ndRowList = "[2, Date Field, 48.00, 45.00, 69.00, 24.00, 25.00]";
		
		System.out.println("actreport2ndRowList   : "+actreport2ndRowList);
		System.out.println("expreport2ndRowList   : "+expreport2ndRowList);
		
		
		
		int report3rdRowListCount = report3rdRowList.size();
		
		ArrayList<String> report3rdRowListArray = new ArrayList<String>();
		
		for(int i=0;i<report3rdRowListCount;i++)
		{
			String data = report3rdRowList.get(i).getText();
			
			if(i==1)
			{
				data="Date Field";
			}
			
			
			report3rdRowListArray.add(data);
			
		}
		
		String actreport3rdRowList = report3rdRowListArray.toString();
		String expreport3rdRowList = "[3, Date Field, 48.00, 45.00, 69.00, 24.00, 25.00]";
		
		System.out.println("actreport3rdRowList   : "+actreport3rdRowList);
		System.out.println("expreport3rdRowList   : "+expreport3rdRowList);
		
		
       /*int report4thRowListCount = report4thRowList.size();
		
		ArrayList<String> report4thRowListArray = new ArrayList<String>();
		
		for(int i=0;i<report4thRowListCount;i++)
		{
			String data = report4thRowList.get(i).getText();
			
			if(i==1)
			{
				data="Date Field";
			}
			
			
			report4thRowListArray.add(data);
			
		}
		
		String actreport4thRowList = report4thRowListArray.toString();
		String expreport4thRowList = "[4, Date Field, 28.00, , 8.00, 20.00, 20.00]";
		
		System.out.println("actreport4thRowList   : "+actreport4thRowList);
		System.out.println("expreport4thRowList   : "+expreport4thRowList);
		
        int report5thRowListCount = report5thRowList.size();
		
		ArrayList<String> report5thRowListArray = new ArrayList<String>();
		
		for(int i=0;i<report5thRowListCount;i++)
		{
			String data = report5thRowList.get(i).getText();
			
			if(i==1)
			{
				data="Date Field";
			}
			
			
			report5thRowListArray.add(data);
			
		}
		
		String actreport5thRowList = report5thRowListArray.toString();
		String expreport5thRowList = "[5, Date Field, 20.00, 13.00, 8.00, 25.00, 29.58]";
		
		System.out.println("actreport5thRowList   : "+actreport5thRowList);
		System.out.println("expreport5thRowList   : "+expreport5thRowList);
		
       int report6thRowListCount = report6thRowList.size();
		
		ArrayList<String> report6thRowListArray = new ArrayList<String>();
		
		for(int i=0;i<report6thRowListCount;i++)
		{
			String data = report6thRowList.get(i).getText();
			
			if(i==1)
			{
				data="Date Field";
			}
			
			
			report6thRowListArray.add(data);
			
		}
		
		String actreport6thRowList = report6thRowListArray.toString();
		String expreport6thRowList = "[6, Date Field, 25.00, 12.00, 1.00, 36.00, 38.75]";
		
		System.out.println("actreport6thRowList   : "+actreport6thRowList);
		System.out.println("expreport6thRowList   : "+expreport6thRowList);
		
		
		int report7thRowListCount = report7thRowList.size();
			
		ArrayList<String> report7thRowListArray = new ArrayList<String>();
		
		for(int i=0;i<report7thRowListCount;i++)
		{
			String data = report7thRowList.get(i).getText();
			
			if(i==1)
			{
				data="Date Field";
			}
			
			
			report7thRowListArray.add(data);
			
		}
		
		String actreport7thRowList = report7thRowListArray.toString();
		String expreport7thRowList = "[7, Date Field, 36.00, , 12.00, 24.00, 25.00]";
		
		System.out.println("actreport7thRowList   : "+actreport7thRowList);
		System.out.println("expreport7thRowList   : "+expreport7thRowList);
		
		
		int report8thRowListCount = report8thRowList.size();
		
		ArrayList<String> report8thRowListArray = new ArrayList<String>();
		
		for(int i=0;i<report8thRowListCount;i++)
		{
			String data = report8thRowList.get(i).getText();
			
			report8thRowListArray.add(data);
			
		}
		
		String actreport8thRowList = report8thRowListArray.toString();
		String expreport8thRowList = "[8, Total, 200.00, 45.00, 69.00, 24.00, 25.00]";
		
		System.out.println("actreport8thRowList   : "+actreport8thRowList);
		System.out.println("expreport8thRowList   : "+expreport8thRowList);
		
		*/
		
	if(actreport1stRowList.equalsIgnoreCase(expreport1stRowList) && actreport2ndRowList.equalsIgnoreCase(expreport2ndRowList) && 
			actreport3rdRowList.equalsIgnoreCase(expreport3rdRowList)  /*&& actreport4thRowList.equalsIgnoreCase(expreport4thRowList) && 
			actreport5thRowList.equalsIgnoreCase(expreport5thRowList) && actreport6thRowList.equalsIgnoreCase(expreport6thRowList) && 
			actreport7thRowList.equalsIgnoreCase(expreport7thRowList) && actreport8thRowList.equalsIgnoreCase(expreport8thRowList)*/)
	{
		System.out.println("Test Pass : Report is As Expected");
		
		//excelReader.setCellData(xlfile, xlsheet, 309, 9, resPass);
		
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
		report_CloseBtn.click();
		
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
		sl_CloseBtn.click();
		
		return true;
	}
	else
	{
		System.out.println("Test Fail : Report is NOT As Expected");
		
		//excelReader.setCellData(xlfile, xlsheet, 309, 9, resFail);
		
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
		report_CloseBtn.click();
		
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
		sl_CloseBtn.click();
		
		return false;
	}
}

	
	
	// Stock Movement Reports
	
	@FindBy(xpath="//select[@id='RITCombobox__1']")
	private static WebElement stockMovementDropdown;
	
	
	public boolean checkStockMovementReports() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		
		System.out.println("************checkStockMovementReports*********************");
		
		
		Thread.sleep(3000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
		inventoryMenu.click();
		
		Thread.sleep(3000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryReportsMenu));
		inventoryReportsMenu.click();
		
		Thread.sleep(3000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(stockMovement));
		stockMovement.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByValue("1");
		
		String actsl_DateOptionDropdown    =s.getFirstSelectedOption().getText();
		String expsl_DateOptionDropdown    ="As on date";
		
		
		int rowcount=stockLedgerHometableRowCount.size();
		System.out.println(rowcount);
		
		for (int i = 0; i < rowcount; i++) 
		{
			String actname=reportNameList.get(i).getText();
			
			System.out.println(actname);
			
			if (actname.equalsIgnoreCase("FIFO COGS ITEM")) 
			{
				reportsChkboxList.get(i).click();
				
				break;
			}
		}
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		
		Thread.sleep(3000);
		
		 int report1stRowListCount = report1stRowList.size();
			
			ArrayList<String> report1stRowListArray = new ArrayList<String>();
			
			for(int i=0;i<report1stRowListCount;i++)
			{
				String data = report1stRowList.get(i).getText();
				
				report1stRowListArray.add(data);
				
			}
			
			String actreport1stRowList = report1stRowListArray.toString();
			String expreport1stRowList = "[1, FIFO COGS ITEM, 48.00, 60.00, 45.00, 46.25, 69.00, 81.25, 24.00, 25.00, 1.04]";
			
			System.out.println("actreport1stRowList   : "+actreport1stRowList);
			System.out.println("expreport1stRowList   : "+expreport1stRowList);
			
			
			int report2ndRowListCount = report2ndRowList.size();
				
			ArrayList<String> report2ndRowListArray = new ArrayList<String>();
			
			for(int i=0;i<report2ndRowListCount;i++)
			{
				String data = report2ndRowList.get(i).getText();
				
				report2ndRowListArray.add(data);
				
			}
			
			String actreport2ndRowList = report2ndRowListArray.toString();
			String expreport2ndRowList = "[2, Total, 48.00, 60.00, 45.00, 46.25, 69.00, 81.25, 24.00, 25.00, 1.04]";
			
			System.out.println("actreport2ndRowList   : "+actreport2ndRowList);
			System.out.println("expreport2ndRowList   : "+expreport2ndRowList);
			
		
		if(actreport1stRowList.equalsIgnoreCase(expreport1stRowList) && actreport2ndRowList.equalsIgnoreCase(expreport2ndRowList))
		{
			System.out.println("Test Pass : Reports Are As Expected");
			
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
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
			report_CloseBtn.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
			sl_CloseBtn.click();
			
			return false;
		}
	}
	
	
	
	
	
	
	// Multi Level Stock Movement
	
		@FindBy(xpath="//select[@id='RITCombobox__2']")
		private static WebElement reportingLevelDropdown;
		

		public boolean checkMultiLevelStockMovementReports() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			
			
			Thread.sleep(3000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
			inventoryMenu.click();
			
			Thread.sleep(3000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryReportsMenu));
			inventoryReportsMenu.click();
			
			Thread.sleep(3000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(multiLevelStockMovement));
			multiLevelStockMovement.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
			Select s=new Select(sl_DateOptionDropdown);
			s.selectByValue("1");
			
			String actsl_DateOptionDropdown    =s.getFirstSelectedOption().getText();
			String expsl_DateOptionDropdown    ="As on date";
			
			
			int rowcount=stockLedgerHometableRowCount.size();
			System.out.println(rowcount);
			
			for (int i = 0; i < rowcount; i++) 
			{
				String actname=reportNameList.get(i).getText();
				
				System.out.println(actname);
				
				if (actname.equalsIgnoreCase("FIFO COGS ITEM")) 
				{
					reportsChkboxList.get(i).click();
					
					break;
				}
			}
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
			sl_OkBtn.click();
			
			Thread.sleep(3000);
			
			
			 int report1stRowListCount = report1stRowList.size();
				
				ArrayList<String> report1stRowListArray = new ArrayList<String>();
				
				for(int i=0;i<report1stRowListCount;i++)
				{
					String data = report1stRowList.get(i).getText();
					
					report1stRowListArray.add(data);
					
				}
				
				String actreport1stRowList = report1stRowListArray.toString();
				String expreport1stRowList = "[1, FIFO COGS ITEM, 48.00, 60.00, 45.00, 46.25, 69.00, 82.22, 24.00, 25.00, 1.04]";
				
				System.out.println("actreport1stRowList   : "+actreport1stRowList);
				System.out.println("expreport1stRowList   : "+expreport1stRowList);
				
				
				int report2ndRowListCount = report2ndRowList.size();
					
				ArrayList<String> report2ndRowListArray = new ArrayList<String>();
				
				for(int i=0;i<report2ndRowListCount;i++)
				{
					String data = report2ndRowList.get(i).getText();
					
					report2ndRowListArray.add(data);
					
				}
				
				String actreport2ndRowList = report2ndRowListArray.toString();
				String expreport2ndRowList = "[2, Grand Total, 48.00, 60.00, 45.00, 46.25, 69.00, 82.22, 24.00, 25.00, 1.04]";
				
				System.out.println("actreport2ndRowList   : "+actreport2ndRowList);
				System.out.println("expreport2ndRowList   : "+expreport2ndRowList);
				
			
			if(actreport1stRowList.equalsIgnoreCase(expreport1stRowList) && actreport2ndRowList.equalsIgnoreCase(expreport2ndRowList))
			
			{
				System.out.println("Test Pass : Reports Are As Expected");
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
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
				report_CloseBtn.click();
				Thread.sleep(2000);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
				sl_CloseBtn.click();
				return false;
			}
			
		}
		
		

			
		
		// Virtual Stock Analysis
		
		@FindBy(xpath="//select[@id='RITCombobox__1']")
		private static WebElement stockTypeDropdown;
		

		public boolean checkVirtualStockAnalysisReports() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			
			
			Thread.sleep(3000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
			inventoryMenu.click();
			
			Thread.sleep(3000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryReportsMenu));
			inventoryReportsMenu.click();
			
			Thread.sleep(3000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(virtualStockAnalysis));
			virtualStockAnalysis.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
			Select s=new Select(sl_DateOptionDropdown);
			s.selectByValue("1");
			
			String actsl_DateOptionDropdown    =s.getFirstSelectedOption().getText();
			String expsl_DateOptionDropdown    ="As on date";
			
			
			int rowcount=stockLedgerHometableRowCount.size();
			System.out.println(rowcount);
			
			for (int i = 0; i < rowcount; i++) 
			{
				String actname=reportNameList.get(i).getText();
				
				System.out.println(actname);
				
				if (actname.equalsIgnoreCase("FIFO COGS ITEM")) 
				{
					reportsChkboxList.get(i).click();
					
					break;
				}
			}
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
			sl_OkBtn.click();
			
			Thread.sleep(3000);
			
			
			 int report1stRowListCount = report1stRowList.size();
				
				ArrayList<String> report1stRowListArray = new ArrayList<String>();
				
				for(int i=0;i<report1stRowListCount;i++)
				{
					String data = report1stRowList.get(i).getText();
					
					report1stRowListArray.add(data);
					
				}
				
				String actreport1stRowList = report1stRowListArray.toString();
				String expreport1stRowList = "[1, FIFO COGS ITEM, 24.00, , , 0.50, 24.50]";
				
				System.out.println("actreport1stRowList   : "+actreport1stRowList);
				System.out.println("expreport1stRowList   : "+expreport1stRowList);
				
				
				int report2ndRowListCount = report2ndRowList.size();
					
				ArrayList<String> report2ndRowListArray = new ArrayList<String>();
				
				for(int i=0;i<report2ndRowListCount;i++)
				{
					String data = report2ndRowList.get(i).getText();
					
					report2ndRowListArray.add(data);
					
				}
				
				String actreport2ndRowList = report2ndRowListArray.toString();
				String expreport2ndRowList = "[2, Grand Total, 24.00, , , 0.50, 24.50]";
				
				System.out.println("actreport2ndRowList   : "+actreport2ndRowList);
				System.out.println("expreport2ndRowList   : "+expreport2ndRowList);
				
			
			if(actreport1stRowList.equalsIgnoreCase(expreport1stRowList) && actreport2ndRowList.equalsIgnoreCase(expreport2ndRowList))
			{
				System.out.println("Test Pass : Reports Are As Expected");
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
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
				report_CloseBtn.click();
				
				Thread.sleep(2000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
				sl_CloseBtn.click();
				return false;
			}
			
		}
		
		
		
		
		// Stock Valuation Starts From Here
		
		
		@FindBy(xpath="//select[@id='RITCombobox__1']")
		private static WebElement StockvaluationDropdown;
		
		
		

		public boolean checkStockValuationReports() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			
			
			
			Thread.sleep(3000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
			inventoryMenu.click();
			
			Thread.sleep(3000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryReportsMenu));
			inventoryReportsMenu.click();
			
			Thread.sleep(3000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(stockValuation));
			stockValuation.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
			Select s=new Select(sl_DateOptionDropdown);
			s.selectByValue("1");
			
			int rowcount=stockLedgerHometableRowCount.size();
			System.out.println(rowcount);
			
			for (int i = 0; i < rowcount; i++) 
			{
				String actname=reportNameList.get(i).getText();
				
				System.out.println(actname);
				
				if (actname.equalsIgnoreCase("FIFO COGS ITEM")) 
				{
					reportsChkboxList.get(i).click();
					
					break;
				}
			}
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
			sl_OkBtn.click();
			
			Thread.sleep(3000);
			
			
			 int report1stRowListCount = report1stRowList.size();
				
				ArrayList<String> report1stRowListArray = new ArrayList<String>();
				
				for(int i=0;i<report1stRowListCount;i++)
				{
					String data = report1stRowList.get(i).getText();
					
					report1stRowListArray.add(data);
					
				}
				
				String actreport1stRowList = report1stRowListArray.toString();
				String expreport1stRowList = "[1, FIFO COGS ITEM, FIFO COGS ITEM, FIFO COGS ITEM, 24.00, 25.00, 1.04, ]";
				
				System.out.println("actreport1stRowList   : "+actreport1stRowList);
				System.out.println("expreport1stRowList   : "+expreport1stRowList);
				
				
				int report2ndRowListCount = report2ndRowList.size();
					
				ArrayList<String> report2ndRowListArray = new ArrayList<String>();
				
				for(int i=0;i<report2ndRowListCount;i++)
				{
					String data = report2ndRowList.get(i).getText();
					
					report2ndRowListArray.add(data);
					
				}
				
				String actreport2ndRowList = report2ndRowListArray.toString();
				String expreport2ndRowList = "[2, Total, , , 24.00, 25.00, 1.04, ]";
				
				System.out.println("actreport2ndRowList   : "+actreport2ndRowList);
				System.out.println("expreport2ndRowList   : "+expreport2ndRowList);
				
			
			if(actreport1stRowList.equalsIgnoreCase(expreport1stRowList) && actreport2ndRowList.equalsIgnoreCase(expreport2ndRowList))
			{
				System.out.println("Test Pass : Reports Are As Expected");
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
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
				report_CloseBtn.click();
				
				Thread.sleep(2000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
				sl_CloseBtn.click();
				return false;
			}
			
		}
		
		
		
		
		
		// Stock report By Tag
		
		public boolean checkStockReportbyTagReports() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			
			
			Thread.sleep(3000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
			inventoryMenu.click();
			
			Thread.sleep(3000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryReportsMenu));
			inventoryReportsMenu.click();
			
			Thread.sleep(3000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(stockReportByTag));
			stockReportByTag.click();
			
			Thread.sleep(2000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
			Select s=new Select(sl_DateOptionDropdown);
			s.selectByValue("1");
			
			int rowcount=stockLedgerHometableRowCount.size();
			System.out.println(rowcount);
			
			for (int i = 0; i < rowcount; i++) 
			{
				String actname=reportNameList.get(i).getText();
				
				System.out.println(actname);
				
				if (actname.equalsIgnoreCase("FIFO COGS ITEM")) 
				{
					reportsChkboxList.get(i).click();
					
					break;
				}
			}
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
			sl_OkBtn.click();
			
			Thread.sleep(3000);
			
			
			 int report1stRowListCount = report1stRowList.size();
				
				ArrayList<String> report1stRowListArray = new ArrayList<String>();
				
				for(int i=0;i<report1stRowListCount;i++)
				{
					String data = report1stRowList.get(i).getText();
					
					report1stRowListArray.add(data);
					
				}
				
				String actreport1stRowList = report1stRowListArray.toString();
				String expreport1stRowList = "[1, FIFO COGS ITEM, FIFO COGS ITEM, 24.00, 1.04, 25.00, , , , 24.00, 1.04, 25.00, , , , , , , , , , , , ]";
				
				System.out.println("actreport1stRowList   : "+actreport1stRowList);
				System.out.println("expreport1stRowList   : "+expreport1stRowList);
				
				
				int report2ndRowListCount = report2ndRowList.size();
					
				ArrayList<String> report2ndRowListArray = new ArrayList<String>();
				
				for(int i=0;i<report2ndRowListCount;i++)
				{
					String data = report2ndRowList.get(i).getText();
					
					report2ndRowListArray.add(data);
					
				}
				
				String actreport2ndRowList = report2ndRowListArray.toString();
				String expreport2ndRowList = "[2, Grand Total, , 24.00, 1.04, 25.00, , , , 24.00, 1.04, 25.00, , , , , , , , , , , , ]";
				
				System.out.println("actreport2ndRowList   : "+actreport2ndRowList);
				System.out.println("expreport2ndRowList   : "+expreport2ndRowList);
				
			
			if(actreport1stRowList.equalsIgnoreCase(expreport1stRowList) && actreport2ndRowList.equalsIgnoreCase(expreport2ndRowList))
			{
				System.out.println("Test Pass : Reports Are As Expected");
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
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
				report_CloseBtn.click();
				
				Thread.sleep(2000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
				sl_CloseBtn.click();
				return false;
			}
			
		}
				
		
		// ABC Analysis
		
		@FindBy(xpath="//select[@id='RITCombobox__1']")
		private static WebElement abcClassificationDropdown;
		
		@FindBy(xpath="//select[@id='RITCombobox__2']")
		private static WebElement abcCriteriaDropdown;
		

		public boolean checkABCAnalysisReports() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			
			
			System.out.println("*************************checkABCAnalysisReports**************");
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
			inventoryMenu.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryReportsMenu));
			inventoryReportsMenu.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(abcAnalysis));
			abcAnalysis.click();
			
			Thread.sleep(2000);
			
			int rowcount=stockLedgerHometableRowCount.size();
			System.out.println(rowcount);
			
			for (int i = 0; i < rowcount; i++) 
			{
				String actname=reportNameList.get(i).getText();
				
				System.out.println(actname);
				
				if (actname.equalsIgnoreCase("FIFO COGS ITEM")) 
				{
					reportsChkboxList.get(i).click();
					
					break;
				}
			}
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
			sl_OkBtn.click();
			
			Thread.sleep(3000);
			
			
			 int report1stRowListCount = report1stRowList.size();
				
				ArrayList<String> report1stRowListArray = new ArrayList<String>();
				
				for(int i=0;i<report1stRowListCount;i++)
				{
					String data = report1stRowList.get(i).getText();
					
					report1stRowListArray.add(data);
					
				}
				
				String actreport1stRowList = report1stRowListArray.toString();
				String expreport1stRowList = "[1, A Product, , ]";
				
				System.out.println("actreport1stRowList   : "+actreport1stRowList);
				System.out.println("expreport1stRowList   : "+expreport1stRowList);
				
				
				int report2ndRowListCount = report2ndRowList.size();
					
				ArrayList<String> report2ndRowListArray = new ArrayList<String>();
				
				for(int i=0;i<report2ndRowListCount;i++)
				{
					String data = report2ndRowList.get(i).getText();
					
					report2ndRowListArray.add(data);
					
				}
				
				String actreport2ndRowList = report2ndRowListArray.toString();
				String expreport2ndRowList = "[2, FIFO COGS ITEM, 24.00, 25.00]";
				
				System.out.println("actreport2ndRowList   : "+actreport2ndRowList);
				System.out.println("expreport2ndRowList   : "+expreport2ndRowList);
				
				
				int report3rdRowListCount = report3rdRowList.size();
				
				ArrayList<String> report3rdRowListArray = new ArrayList<String>();
				
				for(int i=0;i<report3rdRowListCount;i++)
				{
					String data = report3rdRowList.get(i).getText();
					
					report3rdRowListArray.add(data);
					
				}
				
				String actreport3rdRowList = report3rdRowListArray.toString();
				String expreport3rdRowList = "[3, Total, 24.00, 25.00]";
				
				System.out.println("actreport3rdRowList   : "+actreport3rdRowList);
				System.out.println("expreport3rdRowList   : "+expreport3rdRowList);
				
			
			if(actreport1stRowList.equalsIgnoreCase(expreport1stRowList) && actreport2ndRowList.equalsIgnoreCase(expreport2ndRowList) && 
					actreport3rdRowList.equalsIgnoreCase(expreport3rdRowList))
			{
				System.out.println("Test Pass : Reports Are As Expected");
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
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
				report_CloseBtn.click();
				
				Thread.sleep(2000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
				sl_CloseBtn.click();
				return false;
			}
			
		}
		
		
		
		// Stock Analysis By Batch 

		public boolean checkStockAnalysisByBatchReports() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
			inventoryMenu.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryReportsMenu));
			inventoryReportsMenu.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(stockAnalysisByBatch));
			stockAnalysisByBatch.click();
			
			Thread.sleep(2000);
			
			int rowcount=stockLedgerHometableRowCount.size();
			System.out.println(rowcount);
			
			for (int i = 0; i < rowcount; i++) 
			{
				String actname=reportNameList.get(i).getText();
				
				System.out.println(actname);
				
				if (actname.equalsIgnoreCase("FIFO COGS ITEM")) 
				{
					reportsChkboxList.get(i).click();
					
					break;
				}
			}
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
			sl_OkBtn.click();
			
			Thread.sleep(3000);
			
			
			int report1stRowListCount = report1stRowList.size();
				
			ArrayList<String> report1stRowListArray = new ArrayList<String>();
			
			for(int i=0;i<report1stRowListCount;i++)
			{
				String data = report1stRowList.get(i).getText();
				
				report1stRowListArray.add(data);
				
			}
			
			String actreport1stRowList = report1stRowListArray.toString();
			String expreport1stRowList = "[]";
			
			System.out.println("actreport1stRowList   : "+actreport1stRowList);
			System.out.println("expreport1stRowList   : "+expreport1stRowList);
				
				
			
			if(actreport1stRowList.equalsIgnoreCase(expreport1stRowList)  )
			{
				System.out.println("Test Pass : Reports Are As Expected");
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
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
				report_CloseBtn.click();
				
				Thread.sleep(2000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
				sl_CloseBtn.click();
				return false;
			}
			
		}
		
		
		// Stock Analysis By RMA
		
		public boolean checkStockAnalysisByRmaReports() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
			inventoryMenu.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryReportsMenu));
			inventoryReportsMenu.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(stockAnalysisByRMA));
			stockAnalysisByRMA.click();
			
			Thread.sleep(2000);
	
			
			int rowcount=stockLedgerHometableRowCount.size();
			System.out.println(rowcount);
			
			for (int i = 0; i < rowcount; i++) 
			{
				String actname=reportNameList.get(i).getText();
				
				System.out.println(actname);
				
				if (actname.equalsIgnoreCase("FIFO COGS ITEM")) 
				{
					reportsChkboxList.get(i).click();
					
					break;
				}
			}
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
			sl_OkBtn.click();
			
			Thread.sleep(3000);
			
			
			int report1stRowListCount = report1stRowList.size();
				
			ArrayList<String> report1stRowListArray = new ArrayList<String>();
			
			for(int i=0;i<report1stRowListCount;i++)
			{
				String data = report1stRowList.get(i).getText();
				
				report1stRowListArray.add(data);
				
			}
			
			String actreport1stRowList = report1stRowListArray.toString();
			String expreport1stRowList = "[]";
			
			System.out.println("actreport1stRowList   : "+actreport1stRowList);
			System.out.println("expreport1stRowList   : "+expreport1stRowList);
				
				
			
			if(actreport1stRowList.equalsIgnoreCase(expreport1stRowList)  )
			{
				System.out.println("Test Pass : Reports Are As Expected");
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
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
				report_CloseBtn.click();
				
				Thread.sleep(2000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
				sl_CloseBtn.click();
				return false;
			}
			
		}
		
		
		
		// Stock Details By Bins
		
		public boolean checkStockDetailsByBinsReports() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			
			
			Thread.sleep(2000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
			inventoryMenu.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryReportsMenu));
			inventoryReportsMenu.click();
			
			getAction().sendKeys(Keys.END).build().perform();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binsReportMenu));
			binsReportMenu.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(stockDetailsByBins));
			stockDetailsByBins.click();
			
			int rowcount=stockLedgerHometableRowCount.size();
			System.out.println(rowcount);
			
			for (int i = 0; i < rowcount; i++) 
			{
				String actname=reportNameList.get(i).getText();
				
				System.out.println(actname);
				
				if (actname.equalsIgnoreCase("FIFO COGS ITEM")) 
				{
					reportsChkboxList.get(i).click();
					
					break;
				}
			}
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
			sl_OkBtn.click();
			
			Thread.sleep(3000);
			
			
			 int report1stRowListCount = report1stRowList.size();
				
				ArrayList<String> report1stRowListArray = new ArrayList<String>();
				
				for(int i=0;i<report1stRowListCount;i++)
				{
					String data = report1stRowList.get(i).getText();
					
					report1stRowListArray.add(data);
					
				}
				
				String actreport1stRowList = report1stRowListArray.toString();
				String expreport1stRowList = "[1, FIFO COGS ITEM FIFO COGS ITEM, , , , , ]";
				
				System.out.println("actreport1stRowList   : "+actreport1stRowList);
				System.out.println("expreport1stRowList   : "+expreport1stRowList);
				
				
				int report2ndRowListCount = report2ndRowList.size();
					
				ArrayList<String> report2ndRowListArray = new ArrayList<String>();
				
				for(int i=0;i<report2ndRowListCount;i++)
				{
					String data = report2ndRowList.get(i).getText();
					
					report2ndRowListArray.add(data);
					
				}
				
				String actreport2ndRowList = report2ndRowListArray.toString();
				String expreport2ndRowList = "[2, Bin4, , , 24.00, 3.00, 27.00]";
				
				System.out.println("actreport2ndRowList   : "+actreport2ndRowList);
				System.out.println("expreport2ndRowList   : "+expreport2ndRowList);
				
				
				int report3rdRowListCount = report3rdRowList.size();
				
				ArrayList<String> report3rdRowListArray = new ArrayList<String>();
				
				for(int i=0;i<report3rdRowListCount;i++)
				{
					String data = report3rdRowList.get(i).getText();
					
					report3rdRowListArray.add(data);
					
				}
				
				String actreport3rdRowList = report3rdRowListArray.toString();
				String expreport3rdRowList = "[3, Total, , , 24.00, 3.00, 27.00]";
				
				System.out.println("actreport3rdRowList   : "+actreport3rdRowList);
				System.out.println("expreport3rdRowList   : "+expreport3rdRowList);
				
			
			if(actreport1stRowList.equalsIgnoreCase(expreport1stRowList) && actreport2ndRowList.equalsIgnoreCase(expreport2ndRowList) && 
					actreport3rdRowList.equalsIgnoreCase(expreport3rdRowList))
			{
				System.out.println("Test Pass : Reports Are As Expected");
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
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
				report_CloseBtn.click();
				
				Thread.sleep(2000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
				sl_CloseBtn.click();
				return false;
			}
			
		}		
		

		
		// Stock Balance By Bins
		

		public boolean checkStockBalanaceByBinsReports() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
			inventoryMenu.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryReportsMenu));
			inventoryReportsMenu.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binsReportMenu));
			binsReportMenu.click();
			
			getAction().sendKeys(Keys.END).build().perform();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(stockBalancesByBins));
			stockBalancesByBins.click();
			
			Thread.sleep(2000);
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
			Select s=new Select(sl_DateOptionDropdown);
			s.selectByValue("1");
			
			String actsl_DateOptionDropdown    =s.getFirstSelectedOption().getText();
			String expsl_DateOptionDropdown    ="As on date";
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_SelectAllItemsChkBox));
			sl_SelectAllItemsChkBox.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
			sl_OkBtn.click();
			
			Thread.sleep(3000);
			
			
			 int report1stRowListCount = report1stRowList.size();
				
				ArrayList<String> report1stRowListArray = new ArrayList<String>();
				
				for(int i=0;i<report1stRowListCount;i++)
				{
					String data = report1stRowList.get(i).getText();
					
					report1stRowListArray.add(data);
					
				}
				
				String actreport1stRowList = report1stRowListArray.toString();
				String expreport1stRowList = "[1, Bin4 Bin4, , , , , ]";
				
				System.out.println("actreport1stRowList   : "+actreport1stRowList);
				System.out.println("expreport1stRowList   : "+expreport1stRowList);
				
				
				int report2ndRowListCount = report2ndRowList.size();
					
				ArrayList<String> report2ndRowListArray = new ArrayList<String>();
				
				for(int i=0;i<report2ndRowListCount;i++)
				{
					String data = report2ndRowList.get(i).getText();
					
					report2ndRowListArray.add(data);
					
				}
				
				String actreport2ndRowList = report2ndRowListArray.toString();
				String expreport2ndRowList = "[2, FIFO COGS ITEM, , , 24.00, 3.00, 21.00]";
				
				System.out.println("actreport2ndRowList   : "+actreport2ndRowList);
				System.out.println("expreport2ndRowList   : "+expreport2ndRowList);
				
				
				int report3rdRowListCount = report3rdRowList.size();
				
				ArrayList<String> report3rdRowListArray = new ArrayList<String>();
				
				for(int i=0;i<report3rdRowListCount;i++)
				{
					String data = report3rdRowList.get(i).getText();
					
					report3rdRowListArray.add(data);
					
				}
				
				String actreport3rdRowList = report3rdRowListArray.toString();
				String expreport3rdRowList = "[3, Grand Total, , , 24.00, 3.00, 21.00]";
				
				System.out.println("actreport3rdRowList   : "+actreport3rdRowList);
				System.out.println("expreport3rdRowList   : "+expreport3rdRowList);
				
			
			if(actreport1stRowList.equalsIgnoreCase(expreport1stRowList) && actreport2ndRowList.equalsIgnoreCase(expreport2ndRowList) && 
					actreport3rdRowList.equalsIgnoreCase(expreport3rdRowList))
			{
				System.out.println("Test Pass : Reports Are As Expected");
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
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
				report_CloseBtn.click();
				
				Thread.sleep(2000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
				sl_CloseBtn.click();
				return false;
			}
			
		}		

		private static String xlfile;
		private static String resPass="Pass";
		private static String resFail="Fail";
		private static ExcelReader excelReader;
	
	//Stock Balance By Item By Bins
	
	
		public boolean checkStockBalancesByItemByBinsReports() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
			inventoryMenu.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryReportsMenu));
			inventoryReportsMenu.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binsReportMenu));
			binsReportMenu.click();
			
			getAction().sendKeys(Keys.END).build().perform();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(stockBalancesByItemByBins));
			stockBalancesByItemByBins.click();
			
			Thread.sleep(3000);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
			Select s=new Select(sl_DateOptionDropdown);
			s.selectByValue("1");
			
			String actsl_DateOptionDropdown    =s.getFirstSelectedOption().getText();
			String expsl_DateOptionDropdown    ="As on date";
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_SelectAllItemsChkBox));
			sl_SelectAllItemsChkBox.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
			sl_OkBtn.click();
			
			Thread.sleep(3000);
			
			
			 int report1stRowListCount = report1stRowList.size();
				
				ArrayList<String> report1stRowListArray = new ArrayList<String>();
				
				for(int i=0;i<report1stRowListCount;i++)
				{
					String data = report1stRowList.get(i).getText();
					
					report1stRowListArray.add(data);
					
				}
				
				String actreport1stRowList = report1stRowListArray.toString();
				String expreport1stRowList = "[1, FIFO COGS ITEM FIFO COGS ITEM, , , , , , ]";
				
				System.out.println("actreport1stRowList   : "+actreport1stRowList);
				System.out.println("expreport1stRowList   : "+expreport1stRowList);
				
				
				int report2ndRowListCount = report2ndRowList.size();
					
				ArrayList<String> report2ndRowListArray = new ArrayList<String>();
				
				for(int i=0;i<report2ndRowListCount;i++)
				{
					String data = report2ndRowList.get(i).getText();
					
					report2ndRowListArray.add(data);
					
				}
				
				String actreport2ndRowList = report2ndRowListArray.toString();
				String expreport2ndRowList = "[2, Bin4, , , 24.00, 3.00, , 21.00]";
				
				System.out.println("actreport2ndRowList   : "+actreport2ndRowList);
				System.out.println("expreport2ndRowList   : "+expreport2ndRowList);
				
				
				int report3rdRowListCount = report3rdRowList.size();
				
				ArrayList<String> report3rdRowListArray = new ArrayList<String>();
				
				for(int i=0;i<report3rdRowListCount;i++)
				{
					String data = report3rdRowList.get(i).getText();
					
					report3rdRowListArray.add(data);
					
				}
				
				String actreport3rdRowList = report3rdRowListArray.toString();
				String expreport3rdRowList = "[3, Grand Total, , , 24.00, 3.00, , 21.00]";
				
				System.out.println("actreport3rdRowList   : "+actreport3rdRowList);
				System.out.println("expreport3rdRowList   : "+expreport3rdRowList);
				
			
			if(actreport1stRowList.equalsIgnoreCase(expreport1stRowList) && actreport2ndRowList.equalsIgnoreCase(expreport2ndRowList) && 
					actreport3rdRowList.equalsIgnoreCase(expreport3rdRowList))
			{
				System.out.println("Test Pass : Reports Are As Expected");
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
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
				report_CloseBtn.click();
				
				Thread.sleep(2000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
				sl_CloseBtn.click();
				return false;
			}
			
		}		

		
		
		
		
		@FindBy(xpath="//tbody[@id='tblBodyReportRender']")
		private static WebElement report_Body;
		
		// Expired Stock By Bins

		public boolean checkExpiredStockByBinsReports() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
			xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
			inventoryMenu.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryReportsMenu));
			inventoryReportsMenu.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binsReportMenu));
			binsReportMenu.click();
			
			getAction().sendKeys(Keys.END).build().perform();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(expiredStockByBins));
			expiredStockByBins.click();
			
			Thread.sleep(2000);
			
			int rowcount=stockLedgerHometableRowCount.size();
			System.out.println(rowcount);
			
			for (int i = 0; i < rowcount; i++) 
			{
				String actname=reportNameList.get(i).getText();
				
				System.out.println(actname);
				
				if (actname.equalsIgnoreCase("FIFO COGS ITEM")) 
				{
					reportsChkboxList.get(i).click();
					
					break;
				}
			}
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
			sl_OkBtn.click();
			
			Thread.sleep(3000);
			
			
			int report1stRowListCount = report1stRowList.size();
				
			ArrayList<String> report1stRowListArray = new ArrayList<String>();
			
			for(int i=0;i<report1stRowListCount;i++)
			{
				String data = report1stRowList.get(i).getText();
				
				report1stRowListArray.add(data);
				
			}
			
			String actreport1stRowList = report1stRowListArray.toString();
			String expreport1stRowList = "[]";
			
			System.out.println("actreport1stRowList   : "+actreport1stRowList);
			System.out.println("expreport1stRowList   : "+expreport1stRowList);
				
				
			
			if(actreport1stRowList.equalsIgnoreCase(expreport1stRowList)  )
			{
				System.out.println("Test Pass : Reports Are As Expected");
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
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
				report_CloseBtn.click();
				
				Thread.sleep(2000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
				sl_CloseBtn.click();
				return false;
			}
			
		}
				
		@FindBy(xpath="//div[@id='dvReportDetails']/div/table/tbody/tr/td[2]")
		private static List<WebElement> reportsColumn1List; 
		
		@FindBy(xpath="//div[@id='dvReportDetails']/div/table/tbody/tr/td[3]")
		private static List<WebElement> reportsColumn2List; 
		
		@FindBy(xpath="//div[@id='dvReportDetails']/div/table/tbody/tr/td[4]")
		private static List<WebElement> reportsColumn3List; 
		
		@FindBy(xpath="//div[@id='dvReportDetails']/div/table/tbody/tr/td[5]")
		private static List<WebElement> reportsColumn4List; 
		
		@FindBy(xpath="//div[@id='dvReportDetails']/div/table/tbody/tr/td[6]")
		private static List<WebElement> reportsColumn5List; 
		
		@FindBy(xpath="//div[@id='dvReportDetails']/div/table/tbody/tr/td[7]")
		private static List<WebElement> reportsColumn6List; 
		
		@FindBy(xpath="//div[@id='dvReportDetails']/div/table/tbody/tr/td[8]")
		private static List<WebElement> reportsColumn7List; 
		
		@FindBy(xpath="//div[@id='dvReportDetails']/div/table/tbody/tr/td[9]")
		private static List<WebElement> reportsColumn8List; 
		
		@FindBy(xpath="//div[@id='dvReportDetails']/div/table/tbody/tr/td[10]")
		private static List<WebElement> reportsColumn9List; 
		
		@FindBy(xpath="//div[@id='dvReportDetails']/div/table/tbody/tr/td[11]")
		private static List<WebElement> reportsColumn10List; 
		
		@FindBy(xpath="//div[@id='dvReportDetails']/div/table/tbody/tr/td[12]")
		private static List<WebElement> reportsColumn11List; 
		
		@FindBy(xpath="//div[@id='dvReportDetails']/div/table/tbody/tr/td[13]")
		private static List<WebElement> reportsColumn12List; 
		
		@FindBy(xpath="//div[@id='dvReportDetails']/div/table/tbody/tr/td[14]")
		private static List<WebElement> reportsColumn13List; 
		
		@FindBy(xpath="//div[@id='dvReportDetails']/div/table/tbody/tr/td[15]")
		private static List<WebElement> reportsColumn14List; 
		
		@FindBy(xpath="//div[@id='dvReportDetails']/div/table/tbody/tr/td[16]")
		private static List<WebElement> reportsColumn15List; 
		
		@FindBy(xpath="//div[@id='dvReportDetails']/div/table/tbody/tr/td[17]")
		private static List<WebElement> reportsColumn16List; 
		
		@FindBy(xpath="//div[@id='dvReportDetails']/div/table/tbody/tr/td[18]")
		private static List<WebElement> reportsColumn17List; 
		
		@FindBy(xpath="//div[@id='dvReportDetails']/div/table/tbody/tr/td[19]")
		private static List<WebElement> reportsColumn18List; 
		
		@FindBy(xpath="//div[@id='dvReportDetails']/div/table/tbody/tr/td[20]")
		private static List<WebElement> reportsColumn19List; 
		
		@FindBy(xpath="//div[@id='dvReportDetails']/div/table/tbody/tr/td[21]")
		private static List<WebElement> reportsColumn20List; 
		
		
		
		// Stock Balance By WareHouse

		public boolean checkStockBalanceByWarehouseReports() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
			xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
			inventoryMenu.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryReportsMenu));
			inventoryReportsMenu.click();
			
			Thread.sleep(2000);
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(stockBalanceByWarehouse));
			stockBalanceByWarehouse.click();
			
			Thread.sleep(2000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
			Select s=new Select(sl_DateOptionDropdown);
			s.selectByValue("1");
			
			String actsl_DateOptionDropdown    =s.getFirstSelectedOption().getText();
			String expsl_DateOptionDropdown    ="As on date";
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_SelectAllItemsChkBox));
			sl_SelectAllItemsChkBox.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
			sl_OkBtn.click();
			
			Thread.sleep(3000);
			
			
			 int report1stRowListCount = report1stRowList.size();
				
				ArrayList<String> report1stRowListArray = new ArrayList<String>();
				
				for(int i=0;i<report1stRowListCount;i++)
				{
					String data = report1stRowList.get(i).getText();
					
					report1stRowListArray.add(data);
					
				}
				
				String actreport1stRowList = report1stRowListArray.toString();
				String expreport1stRowList = "[1, HYDERABAD HYDERABAD, , , , , ]";
				
				System.out.println("actreport1stRowList   : "+actreport1stRowList);
				System.out.println("expreport1stRowList   : "+expreport1stRowList);
				
				
				int report2ndRowListCount = report2ndRowList.size();
					
				ArrayList<String> report2ndRowListArray = new ArrayList<String>();
				
				for(int i=0;i<report2ndRowListCount;i++)
				{
					String data = report2ndRowList.get(i).getText();
					
					report2ndRowListArray.add(data);
					
				}
				
				String actreport2ndRowList = report2ndRowListArray.toString();
				String expreport2ndRowList = "[2, FIFO COGS ITEM, , , 24.00, 3.00, 21.00]";
				
				System.out.println("actreport2ndRowList   : "+actreport2ndRowList);
				System.out.println("expreport2ndRowList   : "+expreport2ndRowList);
				
				
				int report3rdRowListCount = report3rdRowList.size();
				
				ArrayList<String> report3rdRowListArray = new ArrayList<String>();
				
				for(int i=0;i<report3rdRowListCount;i++)
				{
					String data = report3rdRowList.get(i).getText();
					report3rdRowListArray.add(data);
					
				}
				
				String actreport3rdRowList = report3rdRowListArray.toString();
				String expreport3rdRowList = "[3, Grand Total, , , 24.00, 3.00, 21.00]";
				
				System.out.println("actreport3rdRowList   : "+actreport3rdRowList);
				System.out.println("expreport3rdRowList   : "+expreport3rdRowList);
				
			
			if(actreport1stRowList.equalsIgnoreCase(expreport1stRowList) && actreport2ndRowList.equalsIgnoreCase(expreport2ndRowList) && 
					actreport3rdRowList.equalsIgnoreCase(expreport3rdRowList))
			{
				System.out.println("Test Pass : Reports Are As Expected");
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
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
				report_CloseBtn.click();
				
				Thread.sleep(2000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
				sl_CloseBtn.click();
				return false;
			}
			
		}		

		
		
		
		
		
		// Stock Ageing Analysis
		
		// Ageing Analysis
		
		@FindBy(xpath="//input[@id='MasterGroup__101']")
		private static WebElement  reports_Ageing_wareHouseTxt;
		
		@FindBy(xpath="//input[@id='MasterSingle__101']")
		private static WebElement  reports_AgeingByBatch_wareHouseTxt;

		
		
		@FindBy(xpath="//input[@id='RITCheckbox__6']")
		private static WebElement  ignoreinternaltransferforAgeingChkBox;
		
		@FindBy(xpath="//input[@id='RITNumber__11']")
		private static WebElement  slab1Txt;
		
		@FindBy(xpath="//input[@id='RITNumber__12']")
		private static WebElement  slab2Txt;
		
		@FindBy(xpath="//input[@id='RITNumber__13']")
		private static WebElement  slab3Txt;
		
		@FindBy(xpath="//input[@id='RITNumber__14']")
		private static WebElement  slab4Txt;
		
		@FindBy(xpath="//input[@id='RITNumber__15']")
		private static WebElement  slab5Txt;
		
		@FindBy(xpath="//input[@id='RITNumber__16']")
		private static WebElement  slab6Txt;
		
		@FindBy(xpath="//input[@id='RITNumber__17']")
		private static WebElement  slab7Txt;
		
		@FindBy(xpath="//select[@id='RITCombobox__8']")
		private static WebElement  slabUptoDropdown;
		
		@FindBy(xpath="//div[6]//div[2]//select[1]")
		private static WebElement  stockingAgeingDropdown;
		
		@FindBy(xpath="//input[@id='RITCheckbox__9']")
		private static WebElement  includeServiceTypeItemChkBox;
		

		public boolean checkStockAgeingAnalysisReports() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
			xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
			inventoryMenu.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryReportsMenu));
			inventoryReportsMenu.click();
			
			Thread.sleep(2000);
			
			getAction().sendKeys(Keys.END).build().perform();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(stockAgeingAnalysisMenu));
			stockAgeingAnalysisMenu.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ageingAnalysis));
			ageingAnalysis.click();
			
			Thread.sleep(3000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
			Select s=new Select(sl_DateOptionDropdown);
			s.selectByValue("1");
			
			String actsl_DateOptionDropdown    =s.getFirstSelectedOption().getText();
			String expsl_DateOptionDropdown    ="As on date";
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_SelectAllItemsChkBox));
			sl_SelectAllItemsChkBox.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
			sl_OkBtn.click();
			
			Thread.sleep(3000);
			
			
			 int report1stRowListCount = report1stRowList.size();
				
				ArrayList<String> report1stRowListArray = new ArrayList<String>();
				
				for(int i=0;i<report1stRowListCount;i++)
				{
					String data = report1stRowList.get(i).getText();
					
					report1stRowListArray.add(data);
					
				}
				
				String actreport1stRowList = report1stRowListArray.toString();
				String expreport1stRowList = "[1, FIFO COGS ITEM, 24.00, 20.00, 24.00, 20.00, , , , , , , , , , , , , , , ]";
				
				System.out.println("actreport1stRowList   : "+actreport1stRowList);
				System.out.println("expreport1stRowList   : "+expreport1stRowList);
				
				
				int report2ndRowListCount = report2ndRowList.size();
					
				ArrayList<String> report2ndRowListArray = new ArrayList<String>();
				
				for(int i=0;i<report2ndRowListCount;i++)
				{
					String data = report2ndRowList.get(i).getText();
					
					report2ndRowListArray.add(data);
					
				}
				
				String actreport2ndRowList = report2ndRowListArray.toString();
				String expreport2ndRowList = "[2, Grand Total, 24.00, 20.00, 24.00, 20.00, , , , , , , , , , , , , , , ]";
				
				System.out.println("actreport2ndRowList   : "+actreport2ndRowList);
				System.out.println("expreport2ndRowList   : "+expreport2ndRowList);
				
				
				
			
			if(actreport1stRowList.equalsIgnoreCase(expreport1stRowList) && actreport2ndRowList.equalsIgnoreCase(expreport2ndRowList) )
			{
				System.out.println("Test Pass : Reports Are As Expected");
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
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
				report_CloseBtn.click();
				
				Thread.sleep(2000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
				sl_CloseBtn.click();
				return false;
			}
			
		}		

		

		
		
		// Ageing Analysis By Batch
		
		public boolean checkAgeingAnalysisByBatchReports() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
			xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
			inventoryMenu.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryReportsMenu));
			inventoryReportsMenu.click();
			Thread.sleep(2000);
			getAction().sendKeys(Keys.END).build().perform();
			
			Thread.sleep(2000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(stockAgeingAnalysisMenu));
			stockAgeingAnalysisMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ageingAnalysisByBatch));
			ageingAnalysisByBatch.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
			Select s=new Select(sl_DateOptionDropdown);
			s.selectByValue("1");
			
			String actsl_DateOptionDropdown    =s.getFirstSelectedOption().getText();
			String expsl_DateOptionDropdown    ="As on date";
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_SelectAllItemsChkBox));
			sl_SelectAllItemsChkBox.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
			sl_OkBtn.click();
			
			Thread.sleep(3000);
			
			
			 int report1stRowListCount = report1stRowList.size();
				
				ArrayList<String> report1stRowListArray = new ArrayList<String>();
				
				for(int i=0;i<report1stRowListCount;i++)
				{
					String data = report1stRowList.get(i).getText();
					
					report1stRowListArray.add(data);
					
				}
				
				String actreport1stRowList = report1stRowListArray.toString();
				String expreport1stRowList = "[]";
				
				System.out.println("actreport1stRowList   : "+actreport1stRowList);
				System.out.println("expreport1stRowList   : "+expreport1stRowList);
				

				if(actreport1stRowList.equalsIgnoreCase(expreport1stRowList)  )
				{
					System.out.println("Test Pass : Reports Are As Expected");
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
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
					report_CloseBtn.click();
					
					Thread.sleep(2000);
					
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
					sl_CloseBtn.click();
					return false;
				}
				
			}		
		
		
		
		// Ageing Analysis By Rma
		

		public boolean checkAgeingAnalysisByRmaReports() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
			xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
			inventoryMenu.click();
			
			Thread.sleep(3000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryReportsMenu));
			inventoryReportsMenu.click();
			Thread.sleep(2000);
			getAction().sendKeys(Keys.END).build().perform();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(stockAgeingAnalysisMenu));
			stockAgeingAnalysisMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ageingAnalysisByRMA));
			ageingAnalysisByRMA.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
			Select s=new Select(sl_DateOptionDropdown);
			s.selectByValue("1");
			
			String actsl_DateOptionDropdown    =s.getFirstSelectedOption().getText();
			String expsl_DateOptionDropdown    ="As on date";
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_SelectAllItemsChkBox));
			sl_SelectAllItemsChkBox.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
			sl_OkBtn.click();
			
			Thread.sleep(3000);
			
			
			 int report1stRowListCount = report1stRowList.size();
				
				ArrayList<String> report1stRowListArray = new ArrayList<String>();
				
				for(int i=0;i<report1stRowListCount;i++)
				{
					String data = report1stRowList.get(i).getText();
					
					report1stRowListArray.add(data);
					
				}
				
				String actreport1stRowList = report1stRowListArray.toString();
				String expreport1stRowList = "[]";
				
				System.out.println("actreport1stRowList   : "+actreport1stRowList);
				System.out.println("expreport1stRowList   : "+expreport1stRowList);
				

				if(actreport1stRowList.equalsIgnoreCase(expreport1stRowList)  )
				{
					System.out.println("Test Pass : Reports Are As Expected");
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
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
					report_CloseBtn.click();
					
					Thread.sleep(2000);
					
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
					sl_CloseBtn.click();
					return false;
				}
				
			}		
		
		

		
		// Ageing Stock ByBins

		public boolean checkAgeingStockByBinsReports() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
			xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			
			
			System.out.println("************checkAgeingStockByBinsReports*******************"); 
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
			inventoryMenu.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryReportsMenu));
			inventoryReportsMenu.click();
			Thread.sleep(2000);
			getAction().sendKeys(Keys.END).build().perform();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(stockAgeingAnalysisMenu));
			stockAgeingAnalysisMenu.click();
			Thread.sleep(3000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ageingStockByBins));
			ageingStockByBins.click();
			
			Thread.sleep(2000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
			Select s=new Select(sl_DateOptionDropdown);
			s.selectByValue("1");
			
			String actsl_DateOptionDropdown    =s.getFirstSelectedOption().getText();
			String expsl_DateOptionDropdown    ="As on date";
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_SelectAllItemsChkBox));
			sl_SelectAllItemsChkBox.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
			sl_OkBtn.click();
			
			Thread.sleep(3000);
			
			
			 int report1stRowListCount = report1stRowList.size();
				
				ArrayList<String> report1stRowListArray = new ArrayList<String>();
				
				for(int i=0;i<report1stRowListCount;i++)
				{
					String data = report1stRowList.get(i).getText();
					
					report1stRowListArray.add(data);
					
				}
				
				String actreport1stRowList = report1stRowListArray.toString();
				String expreport1stRowList = "[1, Bin Update Bin Update, , , , , , , , , , , , , , , , , , ]";
				
				System.out.println("actreport1stRowList   : "+actreport1stRowList);
				System.out.println("expreport1stRowList   : "+expreport1stRowList);
				
				
				int report2ndRowListCount = report2ndRowList.size();
					
				ArrayList<String> report2ndRowListArray = new ArrayList<String>();
				
				for(int i=0;i<report2ndRowListCount;i++)
				{
					String data = report2ndRowList.get(i).getText();
					
					report2ndRowListArray.add(data);
					
				}
				
				String actreport2ndRowList = report2ndRowListArray.toString();
				String expreport2ndRowList = "[2, FIFO COGS ITEM, , , , , , , , , , , , , , , , , , ]";
				
				System.out.println("actreport2ndRowList   : "+actreport2ndRowList);
				System.out.println("expreport2ndRowList   : "+expreport2ndRowList);
				
				int report3rdRowListCount = report3rdRowList.size();
				
				ArrayList<String> report3rdRowListArray = new ArrayList<String>();
				
				for(int i=0;i<report3rdRowListCount;i++)
				{
					String data = report3rdRowList.get(i).getText();
					report3rdRowListArray.add(data);
					
				}
				
				String actreport3rdRowList = report3rdRowListArray.toString();
				String expreport3rdRowList = "[3, Sub Total, , , , , , , , , , , , , , , , , , ]";
				
				System.out.println("actreport3rdRowList   : "+actreport3rdRowList);
				System.out.println("expreport3rdRowList   : "+expreport3rdRowList);
				
				
                int report4thRowListCount = report4thRowList.size();
				ArrayList<String> report4thRowListArray = new ArrayList<String>();
				
				for(int i=0;i<report4thRowListCount;i++)
				{
					String data = report4thRowList.get(i).getText();
					report4thRowListArray.add(data);
					
				}
				
				String actreport4thRowList = report4thRowListArray.toString();
				String expreport4thRowList = "[4, Bin4 Bin4, , , , , , , , , , , , , , , , , , ]";
				
				System.out.println("actreport4thRowList   : "+actreport4thRowList);
				System.out.println("expreport4thRowList   : "+expreport4thRowList);
				
				
				int report5thRowListCount = report5thRowList.size();
				ArrayList<String> report5thRowListArray = new ArrayList<String>();
				
				for(int i=0;i<report5thRowListCount;i++)
				{
					String data = report5thRowList.get(i).getText();
					report5thRowListArray.add(data);
					
				}
				
				String actreport5thRowList = report5thRowListArray.toString();
				String expreport5thRowList = "[5, FIFO COGS ITEM, 32.00, 26.67, 17.00, 14.17, , , , , , , , , , , 15.00, 12.50, , ]";
				
				System.out.println("actreport5thRowList   : "+actreport5thRowList);
				System.out.println("expreport5thRowList   : "+expreport5thRowList);
				
				
				int report6thRowListCount = report6thRowList.size();
				ArrayList<String> report6thRowListArray = new ArrayList<String>();
				
				for(int i=0;i<report6thRowListCount;i++)
				{
					String data = report6thRowList.get(i).getText();
					report6thRowListArray.add(data);
					
				}
				
				String actreport6thRowList = report6thRowListArray.toString();
				String expreport6thRowList = "[6, Sub Total, 32.00, 26.67, 17.00, 14.17, , , , , , , , , , , 15.00, 12.50, , ]";
				
				System.out.println("actreport6thRowList   : "+actreport6thRowList);
				System.out.println("expreport6thRowList   : "+expreport6thRowList);
				
				int report7thRowListCount = report7thRowList.size();
				ArrayList<String> report7thRowListArray = new ArrayList<String>();
				
				for(int i=0;i<report7thRowListCount;i++)
				{
					String data = report7thRowList.get(i).getText();
					report7thRowListArray.add(data);
					
				}
				
				String actreport7thRowList = report7thRowListArray.toString();
				String expreport7thRowList = "[7, BSTB BSTB, , , , , , , , , , , , , , , , , , ]";
				
				System.out.println("actreport7thRowList   : "+actreport7thRowList);
				System.out.println("expreport7thRowList   : "+expreport7thRowList);
				
				
				int report8thRowListCount = report8thRowList.size();
				ArrayList<String> report8thRowListArray = new ArrayList<String>();
				
				for(int i=0;i<report8thRowListCount;i++)
				{
					String data = report8thRowList.get(i).getText();
					report8thRowListArray.add(data);
					
				}
				
				String actreport8thRowList = report8thRowListArray.toString();
				String expreport8thRowList = "[8, FIFO COGS ITEM, , , , , , , , , , , , , , , , , , ]";
				
				System.out.println("actreport8thRowList   : "+actreport8thRowList);
				System.out.println("expreport8thRowList   : "+expreport8thRowList);
				
				
				int report9thRowListCount = report9thRowList.size();
				ArrayList<String> report9thRowListArray = new ArrayList<String>();
				
				for(int i=0;i<report9thRowListCount;i++)
				{
					String data = report9thRowList.get(i).getText();
					report9thRowListArray.add(data);
					
				}
				
				String actreport9thRowList = report9thRowListArray.toString();
				String expreport9thRowList = "[9, Sub Total, , , , , , , , , , , , , , , , , , ]";
				
				System.out.println("actreport9thRowList   : "+actreport9thRowList);
				System.out.println("expreport9thRowList   : "+expreport9thRowList);
				
				
				
				int report10thRowListCount = report10thRowList.size();
				ArrayList<String> report10thRowListArray = new ArrayList<String>();
				
				for(int i=0;i<report10thRowListCount;i++)
				{
					String data = report10thRowList.get(i).getText();
					report10thRowListArray.add(data);
					
				}
				
				String actreport10thRowList = report10thRowListArray.toString();
				String expreport10thRowList = "[10, Grand Total, 32.00, 26.67, 17.00, 14.17, , , , , , , , , , , 15.00, 12.50, , ]";
				
				System.out.println("actreport10thRowList  : "+actreport10thRowList);
				System.out.println("expreport10thRowList  : "+expreport10thRowList);
				
			if(actreport1stRowList.equalsIgnoreCase(expreport1stRowList) && actreport2ndRowList.equalsIgnoreCase(expreport2ndRowList) &&
					actreport3rdRowList.equalsIgnoreCase(expreport3rdRowList) && actreport4thRowList.equalsIgnoreCase(expreport4thRowList) && 
					actreport5thRowList.equalsIgnoreCase(expreport5thRowList) && actreport6thRowList.equalsIgnoreCase(expreport6thRowList) && 
					actreport7thRowList.equalsIgnoreCase(expreport7thRowList) && actreport8thRowList.equalsIgnoreCase(expreport8thRowList) && 
					actreport9thRowList.equalsIgnoreCase(expreport9thRowList) && actreport10thRowList.equalsIgnoreCase(expreport10thRowList))
				
			{
				System.out.println("Test Pass : Reports Are As Expected");
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
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
				report_CloseBtn.click();
				Thread.sleep(2000);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
				sl_CloseBtn.click();
				return false;
			}
			
		}
		
		
		
		
		
		
		// Ageing By Item By Bins

		public boolean checkAgeingByItemByBinsReports() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
			xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
			inventoryMenu.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryReportsMenu));
			inventoryReportsMenu.click();
			Thread.sleep(2000);
			getAction().sendKeys(Keys.END).build().perform();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(stockAgeingAnalysisMenu));
			stockAgeingAnalysisMenu.click();
			
			Thread.sleep(3000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ageingByItemByBins));
			ageingByItemByBins.click();
			
			Thread.sleep(3000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
			Select s=new Select(sl_DateOptionDropdown);
			s.selectByValue("1");
			
			String actsl_DateOptionDropdown    =s.getFirstSelectedOption().getText();
			String expsl_DateOptionDropdown    ="As on date";
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_SelectAllItemsChkBox));
			sl_SelectAllItemsChkBox.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
			sl_OkBtn.click();
			
			Thread.sleep(3000);
			

			 int report1stRowListCount = report1stRowList.size();
				
				ArrayList<String> report1stRowListArray = new ArrayList<String>();
				
				for(int i=0;i<report1stRowListCount;i++)
				{
					String data = report1stRowList.get(i).getText();
					
					report1stRowListArray.add(data);
					
				}
				
				String actreport1stRowList = report1stRowListArray.toString();
				String expreport1stRowList = "[1, FIFO COGS ITEM FIFO COGS ITEM, , , , , , , , , , , , , , , , , , ]";
				
				System.out.println("actreport1stRowList   : "+actreport1stRowList);
				System.out.println("expreport1stRowList   : "+expreport1stRowList);
				
				
				int report2ndRowListCount = report2ndRowList.size();
					
				ArrayList<String> report2ndRowListArray = new ArrayList<String>();
				
				for(int i=0;i<report2ndRowListCount;i++)
				{
					String data = report2ndRowList.get(i).getText();
					
					report2ndRowListArray.add(data);
					
				}
				
				String actreport2ndRowList = report2ndRowListArray.toString();
				String expreport2ndRowList = "[2, Bin Update, , , , , , , , , , , , , , , , , , ]";
				
				System.out.println("actreport2ndRowList   : "+actreport2ndRowList);
				System.out.println("expreport2ndRowList   : "+expreport2ndRowList);
				
				int report3rdRowListCount = report3rdRowList.size();
				
				ArrayList<String> report3rdRowListArray = new ArrayList<String>();
				
				for(int i=0;i<report3rdRowListCount;i++)
				{
					String data = report3rdRowList.get(i).getText();
					report3rdRowListArray.add(data);
					
				}
				
				String actreport3rdRowList = report3rdRowListArray.toString();
				String expreport3rdRowList = "[3, Bin4, 32.00, 26.67, 17.00, 14.17, , , , , , , , , , , , , 15.00, 12.50]";
				
				System.out.println("actreport3rdRowList   : "+actreport3rdRowList);
				System.out.println("expreport3rdRowList   : "+expreport3rdRowList);
				
				
               int report4thRowListCount = report4thRowList.size();
				ArrayList<String> report4thRowListArray = new ArrayList<String>();
				
				for(int i=0;i<report4thRowListCount;i++)
				{
					String data = report4thRowList.get(i).getText();
					report4thRowListArray.add(data);
					
				}
				
				String actreport4thRowList = report4thRowListArray.toString();
				String expreport4thRowList = "[4, BSTB, , , , , , , , , , , , , , , , , , ]";
				
				System.out.println("actreport4thRowList   : "+actreport4thRowList);
				System.out.println("expreport4thRowList   : "+expreport4thRowList);
				
				
				int report5thRowListCount = report5thRowList.size();
				ArrayList<String> report5thRowListArray = new ArrayList<String>();
				
				for(int i=0;i<report5thRowListCount;i++)
				{
					String data = report5thRowList.get(i).getText();
					report5thRowListArray.add(data);
					
				}
				
				String actreport5thRowList = report5thRowListArray.toString();
				String expreport5thRowList = "[5, Grand Total, 32.00, 26.67, 17.00, 14.17, , , , , , , , , , , , , 15.00, 12.50]";
				
				System.out.println("actreport5thRowList   : "+actreport5thRowList);
				System.out.println("expreport5thRowList   : "+expreport5thRowList);
				
					
			System.out.println("*****************************************checkAgeingByItemByBinsReports***************************************");
			
			if(actreport1stRowList.equalsIgnoreCase(expreport1stRowList) && actreport2ndRowList.equalsIgnoreCase(expreport2ndRowList)
					&& actreport3rdRowList.equalsIgnoreCase(expreport3rdRowList) && actreport4thRowList.equalsIgnoreCase(expreport4thRowList)
					&& actreport5thRowList.equalsIgnoreCase(expreport5thRowList) )
			{
				System.out.println("Test Pass : Reports Are As Expected");
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
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
				report_CloseBtn.click();
				Thread.sleep(2000);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
				sl_CloseBtn.click();
				return false;
			}
			
		}
	
		
		
		
	
		// Reorder Report


		public boolean checkReorderReports() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
			xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
			inventoryMenu.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryReportsMenu));
			inventoryReportsMenu.click();
			
			Thread.sleep(2000);
			
			getAction().sendKeys(Keys.END).build().perform();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(reorderReport));
			reorderReport.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
			Select s=new Select(sl_DateOptionDropdown);
			s.selectByValue("1");
			
			String actsl_DateOptionDropdown    =s.getFirstSelectedOption().getText();
			String expsl_DateOptionDropdown    ="As on date";
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_SelectAllItemsChkBox));
			sl_SelectAllItemsChkBox.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
			sl_OkBtn.click();
			
			Thread.sleep(3000);
			

			 int report1stRowListCount = report1stRowList.size();
				
				ArrayList<String> report1stRowListArray = new ArrayList<String>();
				
				for(int i=0;i<report1stRowListCount;i++)
				{
					String data = report1stRowList.get(i).getText();
					
					report1stRowListArray.add(data);
					
				}
				
			String actreport1stRowList = report1stRowListArray.toString();
			String expreport1stRowList = "[]";
			
			System.out.println("*********************************checkReorderReportReport*****************************************");
			
			System.out.println("actreport1stRowList   : "+actreport1stRowList);
			System.out.println("expreport1stRowList   : "+expreport1stRowList);
			
			if(actreport1stRowList.equalsIgnoreCase(expreport1stRowList))
			{
				System.out.println("Test Pass : Reports Are As Expected");
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
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
				report_CloseBtn.click();
				Thread.sleep(2000);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
				sl_CloseBtn.click();
				return false;
			}
			
		}
		

			
		
		
		
		// Fast Moving Item (XYZ Analysis)

		public boolean checkFastMovingItemsReports() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
			xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
			inventoryMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryReportsMenu));
			inventoryReportsMenu.click();
			Thread.sleep(2000);
			getAction().sendKeys(Keys.END).build().perform();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(fastMovingItem));
			fastMovingItem.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
			Select s=new Select(sl_DateOptionDropdown);
			s.selectByValue("1");
			
			String actsl_DateOptionDropdown    =s.getFirstSelectedOption().getText();
			String expsl_DateOptionDropdown    ="As on date";
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_SelectAllItemsChkBox));
			sl_SelectAllItemsChkBox.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
			sl_OkBtn.click();
			
			Thread.sleep(3000);
			

			 int report1stRowListCount = report1stRowList.size();
				
				ArrayList<String> report1stRowListArray = new ArrayList<String>();
				
				for(int i=0;i<report1stRowListCount;i++)
				{
					String data = report1stRowList.get(i).getText();
					
					report1stRowListArray.add(data);
					
				}
				
				String actreport1stRowList = report1stRowListArray.toString();
				String expreport1stRowList = "[1, FIFO COGS ITEM, FIFO COGS ITEM, FIFO COGS ITEM, 24.00, 25.00, 1.04, HYDERABAD]";
				
				System.out.println("actreport1stRowList   : "+actreport1stRowList);
				System.out.println("expreport1stRowList   : "+expreport1stRowList);
				
				
				int report2ndRowListCount = report2ndRowList.size();
					
				ArrayList<String> report2ndRowListArray = new ArrayList<String>();
				
				for(int i=0;i<report2ndRowListCount;i++)
				{
					String data = report2ndRowList.get(i).getText();
					
					report2ndRowListArray.add(data);
					
				}
				
				String actreport2ndRowList = report2ndRowListArray.toString();
				String expreport2ndRowList = "[2, Grand Total, , , 24.00, 25.00, 1.04, ]";
				
				System.out.println("actreport2ndRowList   : "+actreport2ndRowList);
				System.out.println("expreport2ndRowList   : "+expreport2ndRowList);
				
			if(actreport1stRowList.equalsIgnoreCase(expreport1stRowList) && actreport2ndRowList.equalsIgnoreCase(expreport2ndRowList))
			{
				System.out.println("Test Pass : Reports Are As Expected");
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
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
				report_CloseBtn.click();
				Thread.sleep(2000);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
				sl_CloseBtn.click();
				return false;
			}
		}
	
		
		
		
		// Slow Moving Item

		public boolean checkSlowMovingItemsReports() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
			xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			
			
			System.out.println("********************checkSlowMovingItemsReports*****************************");
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
			inventoryMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryReportsMenu));
			inventoryReportsMenu.click();
			Thread.sleep(2000);
			getAction().sendKeys(Keys.END).build().perform();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(slowMovingItem));
			slowMovingItem.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
			Select s=new Select(sl_DateOptionDropdown);
			s.selectByValue("1");
			
			String actsl_DateOptionDropdown    =s.getFirstSelectedOption().getText();
			String expsl_DateOptionDropdown    ="As on date";
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_SelectAllItemsChkBox));
			sl_SelectAllItemsChkBox.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
			sl_OkBtn.click();
			
			Thread.sleep(3000);
			

			 int report1stRowListCount = report1stRowList.size();
				
				ArrayList<String> report1stRowListArray = new ArrayList<String>();
				
				for(int i=0;i<report1stRowListCount;i++)
				{
					String data = report1stRowList.get(i).getText();
					
					report1stRowListArray.add(data);
					
				}
				
				String actreport1stRowList = report1stRowListArray.toString();
				String expreport1stRowList = "[1, FIFO COGS ITEM, FIFO COGS ITEM, FIFO COGS ITEM, 24.00, 25.00, 1.04, HYDERABAD]";
				
				System.out.println("actreport1stRowList   : "+actreport1stRowList);
				System.out.println("expreport1stRowList   : "+expreport1stRowList);
				
				
				int report2ndRowListCount = report2ndRowList.size();
					
				ArrayList<String> report2ndRowListArray = new ArrayList<String>();
				
				for(int i=0;i<report2ndRowListCount;i++)
				{
					String data = report2ndRowList.get(i).getText();
					
					report2ndRowListArray.add(data);
					
				}
				
				String actreport2ndRowList = report2ndRowListArray.toString();
				String expreport2ndRowList = "[2, Grand Total, , , 24.00, 25.00, 1.04, ]";
				
				System.out.println("actreport2ndRowList   : "+actreport2ndRowList);
				System.out.println("expreport2ndRowList   : "+expreport2ndRowList);
				
			if(actreport1stRowList.equalsIgnoreCase(expreport1stRowList) && actreport2ndRowList.equalsIgnoreCase(expreport2ndRowList))
			{
				System.out.println("Test Pass : Reports Are As Expected");
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
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
				report_CloseBtn.click();
				Thread.sleep(2000);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
				sl_CloseBtn.click();
				return false;
			}
		}
		
		
			
			
		
		// PeakAndLowBalances
		
		public boolean checkPeakAndLowBalancesReports() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
			xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			
			
			System.out.println("**********************checkPeakAndLowBalancesReports****************************");
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
			inventoryMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryReportsMenu));
			inventoryReportsMenu.click();
			Thread.sleep(2000);
			getAction().sendKeys(Keys.END).build().perform();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(peakORLowBalances));
			peakORLowBalances.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
			Select s=new Select(sl_DateOptionDropdown);
			s.selectByValue("1");
			
			String actsl_DateOptionDropdown    =s.getFirstSelectedOption().getText();
			String expsl_DateOptionDropdown    ="As on date";
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_SelectAllItemsChkBox));
			sl_SelectAllItemsChkBox.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
			sl_OkBtn.click();
			
			Thread.sleep(3000);
			

			 int report1stRowListCount = report1stRowList.size();
				
				ArrayList<String> report1stRowListArray = new ArrayList<String>();
				
				for(int i=0;i<report1stRowListCount;i++)
				{
					String data = report1stRowList.get(i).getText();
					if (i==4)
					{
						data="date Field";
					}
					if (i==6)
					{
						data="date Field";
					}
					
					
					report1stRowListArray.add(data);
					
				}
				
				String actreport1stRowList = report1stRowListArray.toString();
				String expreport1stRowList = "[1, FIFO COGS ITEM, , , date Field, 20.00, date Field, 55.00]";
				
				System.out.println("actreport1stRowList   : "+actreport1stRowList);
				System.out.println("expreport1stRowList   : "+expreport1stRowList);
				
				
				int report2ndRowListCount = report2ndRowList.size();
					
				ArrayList<String> report2ndRowListArray = new ArrayList<String>();
				
				for(int i=0;i<report2ndRowListCount;i++)
				{
					String data = report2ndRowList.get(i).getText();
					
					report2ndRowListArray.add(data);
					
				}
				
				String actreport2ndRowList = report2ndRowListArray.toString();
				String expreport2ndRowList = "[2, Grand Total, , , , 20.00, , 55.00]";
				
				System.out.println("actreport2ndRowList   : "+actreport2ndRowList);
				System.out.println("expreport2ndRowList   : "+expreport2ndRowList);
				
			if(actreport1stRowList.equalsIgnoreCase(expreport1stRowList) && actreport2ndRowList.equalsIgnoreCase(expreport2ndRowList))

			{
				System.out.println("Test Pass : Reports Are As Expected");
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
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
				report_CloseBtn.click();
				Thread.sleep(2000);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
				sl_CloseBtn.click();
				return false;
			}
			
		}
		

			
		
		// Best Selling Item
		
		@FindBy(xpath="//input[@id='RITNumber__1']")
		private static WebElement topItemTxt;
		
		@FindBy(xpath="//select[@id='RITCombobox__2']")
		private static WebElement sortingOnDropdown;
		
		@FindBy(xpath="//input[@id='RITCheckbox__3']")
		private static WebElement includeAllVoucherChkBox;
		


		public boolean checkBestSellingItemReports() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
			xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
			inventoryMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryReportsMenu));
			inventoryReportsMenu.click();
			Thread.sleep(2000);
			getAction().sendKeys(Keys.END).build().perform();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(bestSellingItem));
			bestSellingItem.click();
			
			Thread.sleep(3000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
			Select s=new Select(sl_DateOptionDropdown);
			s.selectByValue("1");
			
			String actsl_DateOptionDropdown    =s.getFirstSelectedOption().getText();
			String expsl_DateOptionDropdown    ="As on date";
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(includeAllVoucherChkBox));
			includeAllVoucherChkBox.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
			sl_OkBtn.click();
			
			Thread.sleep(3000);
			

			int report1stRowListCount = report1stRowList.size();
				
			ArrayList<String> report1stRowListArray = new ArrayList<String>();
			
			for(int i=0;i<report1stRowListCount;i++)
			{
				String data = report1stRowList.get(i).getText();
				
				report1stRowListArray.add(data);
				
			}
			
			String actreport1stRowList = report1stRowListArray.toString();
			String expreport1stRowList = "[1, FIFO COGS ITEM, 56.00, 9.10]";
			
			System.out.println("actreport1stRowList   : "+actreport1stRowList);
			System.out.println("expreport1stRowList   : "+expreport1stRowList);
			
				
			int report2ndRowListCount = report2ndRowList.size();
				
			ArrayList<String> report2ndRowListArray = new ArrayList<String>();
			
			for(int i=0;i<report2ndRowListCount;i++)
			{
				String data = report2ndRowList.get(i).getText();
				
				report2ndRowListArray.add(data);
				
			}
			
			String actreport2ndRowList = report2ndRowListArray.toString();
			String expreport2ndRowList = "[2, Grand Total, 56.00, 9.10]";
			
			System.out.println("actreport2ndRowList   : "+actreport2ndRowList);
			System.out.println("expreport2ndRowList   : "+expreport2ndRowList);
				
			if(actreport1stRowList.equalsIgnoreCase(expreport1stRowList) && actreport2ndRowList.equalsIgnoreCase(expreport2ndRowList))
			{
				System.out.println("Test Pass : Reports Are As Expected");
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
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
				report_CloseBtn.click();
				Thread.sleep(2000);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
				sl_CloseBtn.click();
				return false;
			}
			
		}
		

		
		
		
		
		// Stock Transfer Report
		

		public boolean checkStockTransferRegisterReports() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
			xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			
			
			System.out.println("*****************checkStockTransferRegisterReports*************************************");
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
			inventoryMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryReportsMenu));
			inventoryReportsMenu.click();
			Thread.sleep(2000);
			getAction().sendKeys(Keys.END).build().perform();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(stockTransferReport));
			stockTransferReport.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
			Select s=new Select(sl_DateOptionDropdown);
			s.selectByValue("1");
			
			String actsl_DateOptionDropdown    =s.getFirstSelectedOption().getText();
			String expsl_DateOptionDropdown    ="As on date";
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_SelectAllItemsChkBox));
			sl_SelectAllItemsChkBox.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
			sl_OkBtn.click();
			
			Thread.sleep(3000);
			

			int report1stRowListCount = report1stRowList.size();
				
			ArrayList<String> report1stRowListArray = new ArrayList<String>();
			
			for(int i=0;i<report1stRowListCount;i++)
			{
				String data = report1stRowList.get(i).getText();
				
				report1stRowListArray.add(data);
				
			}
			
			String actreport1stRowList = report1stRowListArray.toString();
			String expreport1stRowList = "[1, FIFO COGS ITEM FIFO COGS ITEM, , , , , , , , , ]";
			
			System.out.println("actreport1stRowList   : "+actreport1stRowList);
			System.out.println("expreport1stRowList   : "+expreport1stRowList);
			
				
			int report2ndRowListCount = report2ndRowList.size();
				
			ArrayList<String> report2ndRowListArray = new ArrayList<String>();
			
			for(int i=0;i<report2ndRowListCount;i++)
			{
				String data = report2ndRowList.get(i).getText();
				
				
				if (i==1) 
				{
					data="Date Field";
				}
				
				report2ndRowListArray.add(data);
				
			}
			
			String actreport2ndRowList = report2ndRowListArray.toString();
			String expreport2ndRowList = "[2, Date Field, , HYDERABAD, 8.00, , , , , , ]";
			
			System.out.println("actreport2ndRowList   : "+actreport2ndRowList);
			System.out.println("expreport2ndRowList   : "+expreport2ndRowList);
			
			
			int report3rdRowListCount = report3rdRowList.size();
			
			ArrayList<String> report3rdRowListArray = new ArrayList<String>();
			
			for(int i=0;i<report3rdRowListCount;i++)
			{
				String data = report3rdRowList.get(i).getText();
				
				report3rdRowListArray.add(data);
				
			}
			
			String actreport3rdRowList = report3rdRowListArray.toString();
			String expreport3rdRowList = "[3, Grand Total, , , 8.00, , , , , , ]";
			
			System.out.println("actreport3rdRowList   : "+actreport3rdRowList);
			System.out.println("expreport3rdRowList   : "+expreport3rdRowList);
				
			if(actreport1stRowList.equalsIgnoreCase(expreport1stRowList) && actreport2ndRowList.equalsIgnoreCase(expreport2ndRowList) && 
					actreport3rdRowList.equalsIgnoreCase(expreport3rdRowList))	
			{
				System.out.println("Test Pass : Reports Are As Expected");
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
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
				report_CloseBtn.click();
				Thread.sleep(2000);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
				sl_CloseBtn.click();
				return false;
			}
			
		}

		
		
		
		
		
		
		// Stock reservation register

		public boolean checkStockReservationReports() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
			xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
			inventoryMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryReportsMenu));
			inventoryReportsMenu.click();
			Thread.sleep(2000);
			getAction().sendKeys(Keys.END).build().perform();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(stockReservationReport));
			stockReservationReport.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
			Select s=new Select(sl_DateOptionDropdown);
			s.selectByValue("1");
			
			String actsl_DateOptionDropdown    =s.getFirstSelectedOption().getText();
			String expsl_DateOptionDropdown    ="As on date";
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_SelectAllItemsChkBox));
			sl_SelectAllItemsChkBox.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
			sl_OkBtn.click();
			
			Thread.sleep(3000);
			

			int report1stRowListCount = report1stRowList.size();
				
			ArrayList<String> report1stRowListArray = new ArrayList<String>();
			
			for(int i=0;i<report1stRowListCount;i++)
			{
				String data = report1stRowList.get(i).getText();
				
				report1stRowListArray.add(data);
				
			}
			
			String actreport1stRowList = report1stRowListArray.toString();
			String expreport1stRowList = "[1, FIFO COGS ITEM FIFO COGS ITEM, , , , , , ]";
			
			System.out.println("actreport1stRowList   : "+actreport1stRowList);
			System.out.println("expreport1stRowList   : "+expreport1stRowList);
			
				
			int report2ndRowListCount = report2ndRowList.size();
				
			ArrayList<String> report2ndRowListArray = new ArrayList<String>();
			
			for(int i=0;i<report2ndRowListCount;i++)
			{
				String data = report2ndRowList.get(i).getText();
				
				
				if (i==1) 
				{
					data="Date Field";
				}
				
				report2ndRowListArray.add(data);
				
			}
			
			String actreport2ndRowList = report2ndRowListArray.toString();
			String expreport2ndRowList = "[2, Date Field, Sales invoice VAT, 2, FIFO COGS ITEM, 27.00, 1.50, Customer A]";
			
			System.out.println("actreport2ndRowList   : "+actreport2ndRowList);
			System.out.println("expreport2ndRowList   : "+expreport2ndRowList);
			
			
			int report3rdRowListCount = report3rdRowList.size();
			
			ArrayList<String> report3rdRowListArray = new ArrayList<String>();
			
			for(int i=0;i<report3rdRowListCount;i++)
			{
				String data = report3rdRowList.get(i).getText();
				
				if (i==1) 
				{
					data="Date Field";
				}
				
				report3rdRowListArray.add(data);
				
			}
			
			String actreport3rdRowList = report3rdRowListArray.toString();
			String expreport3rdRowList = "[3, Date Field, Sales invoice VAT, 4, FIFO COGS ITEM, 8.00, 10.00, Customer A]";
			
			System.out.println("actreport3rdRowList   : "+actreport3rdRowList);
			System.out.println("expreport3rdRowList   : "+expreport3rdRowList);
				
			
            int report4thRowListCount = report4thRowList.size();
			
			ArrayList<String> report4thRowListArray = new ArrayList<String>();
			
			for(int i=0;i<report4thRowListCount;i++)
			{
				String data = report4thRowList.get(i).getText();
				
				if (i==1) 
				{
					data="Date Field";
				}
				
				report4thRowListArray.add(data);
				
			}
			
			String actreport4thRowList = report4thRowListArray.toString();
			String expreport4thRowList = "[4, Date Field, Sales invoice VAT, 3, FIFO COGS ITEM, 8.00, 10.00, Customer A]";
			
			System.out.println("actreport4thRowList   : "+actreport4thRowList);
			System.out.println("expreport4thRowList   : "+expreport4thRowList);
			
			
			
           int report5thRowListCount = report5thRowList.size();
			
			ArrayList<String> report5thRowListArray = new ArrayList<String>();
			
			for(int i=0;i<report5thRowListCount;i++)
			{
				String data = report5thRowList.get(i).getText();
				
				if (i==1) 
				{
					data="Date Field";
				}
				
				report5thRowListArray.add(data);
				
			}
			
			String actreport5thRowList = report5thRowListArray.toString();
			String expreport5thRowList = "[5, Date Field, Sales Orders, 1, FIFO COGS ITEM, 30.00, 10.00, Customer A]";
			
			System.out.println("actreport5thRowList   : "+actreport5thRowList);
			System.out.println("expreport5thRowList   : "+expreport5thRowList);
			
            int report6thRowListCount = report6thRowList.size();
			
			ArrayList<String> report6thRowListArray = new ArrayList<String>();
			
			for(int i=0;i<report6thRowListCount;i++)
			{
				String data = report6thRowList.get(i).getText();
				
				if (i==1) 
				{
					data="Date Field";
				}
				
				report6thRowListArray.add(data);
				
			}
			
			String actreport6thRowList = report6thRowListArray.toString();
			String expreport6thRowList = "[6, Date Field, Sales Orders, 3, FIFO COGS ITEM, 8.00, 10.00, Customer A]";
			
			System.out.println("actreport6thRowList   : "+actreport6thRowList);
			System.out.println("expreport6thRowList   : "+expreport6thRowList);
			
			int report7thRowListCount = report7thRowList.size();
				
			ArrayList<String> report7thRowListArray = new ArrayList<String>();
			
			for(int i=0;i<report7thRowListCount;i++)
			{
				String data = report7thRowList.get(i).getText();
				
				if (i==1) 
				{
					data="Date Field";
				}
				
				report7thRowListArray.add(data);
				
			}
			
			String actreport7thRowList = report7thRowListArray.toString();
			String expreport7thRowList = "[7, Date Field, Sales Orders, 2, FIFO COGS ITEM, 8.00, 10.00, Customer A]";
			
			System.out.println("actreport7thRowList   : "+actreport7thRowList);
			System.out.println("expreport7thRowList   : "+expreport7thRowList);
			
			

			int report8thRowListCount = report8thRowList.size();
				
			ArrayList<String> report8thRowListArray = new ArrayList<String>();
			
			for(int i=0;i<report8thRowListCount;i++)
			{
				String data = report8thRowList.get(i).getText();
				
				if (i==1) 
				{
					data="Date Field";
				}
				
				report8thRowListArray.add(data);
				
			}
			
			String actreport8thRowList = report8thRowListArray.toString();
			String expreport8thRowList = "[8, Date Field, , , , 3.00, 51.50, ]";
			
			System.out.println("actreport8thRowList   : "+actreport8thRowList);
			System.out.println("expreport8thRowList   : "+expreport8thRowList);
			
			
			if(actreport1stRowList.equalsIgnoreCase(expreport1stRowList) && actreport2ndRowList.equalsIgnoreCase(expreport2ndRowList) && 
					actreport3rdRowList.equalsIgnoreCase(expreport3rdRowList) && actreport4thRowList.equalsIgnoreCase(expreport4thRowList) && 
					actreport5thRowList.equalsIgnoreCase(expreport5thRowList) && actreport6thRowList.equalsIgnoreCase(expreport6thRowList) && 
					actreport7thRowList.equalsIgnoreCase(expreport7thRowList) && actreport8thRowList.equalsIgnoreCase(expreport8thRowList))	
			{
				System.out.println("Test Pass : Reports Are As Expected");
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
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
				report_CloseBtn.click();
				Thread.sleep(2000);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
				sl_CloseBtn.click();
				return false;
			}
			
		}
		

		
		
		@FindBy(xpath="//tbody[@id='tblBodyReportRender']/tr[1]/td")
		private static  List<WebElement> reportRow1ColumnList;
		
		@FindBy(xpath="//tbody[@id='tblBodyReportRender']/tr[2]/td")
		private static  List<WebElement> reportRow2ColumnList;
		
		@FindBy(xpath="//tbody[@id='tblBodyReportRender']/tr[3]/td")
		private static  List<WebElement> reportRow3ColumnList;
		
		@FindBy(xpath="//tbody[@id='tblBodyReportRender']/tr[4]/td")
		private static  List<WebElement> reportRow4ColumnList;
		
		@FindBy(xpath="//tbody[@id='tblBodyReportRender']/tr[5]/td")
		private static  List<WebElement> reportRow5ColumnList;
		
		
		
		
		
		// Transaction Type wise Stock report
		
		public boolean checkTransTypeWiseStockReports() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
			xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
			inventoryMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryReportsMenu));
			inventoryReportsMenu.click();
			Thread.sleep(2000);
			getAction().sendKeys(Keys.END).build().perform();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(transactionTypeWiseStockReport));
			transactionTypeWiseStockReport.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
			Select s=new Select(sl_DateOptionDropdown);
			s.selectByValue("1");
			
			String actsl_DateOptionDropdown    =s.getFirstSelectedOption().getText();
			String expsl_DateOptionDropdown    ="As on date";
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_SelectAllItemsChkBox));
			sl_SelectAllItemsChkBox.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
			sl_OkBtn.click();
			
			Thread.sleep(3000);
			

			int report1stRowListCount = report1stRowList.size();
				
			ArrayList<String> report1stRowListArray = new ArrayList<String>();
			
			for(int i=0;i<report1stRowListCount;i++)
			{
				String data = report1stRowList.get(i).getText();
				
				report1stRowListArray.add(data);
				
			}
			
			String actreport1stRowList = report1stRowListArray.toString();
			String expreport1stRowList = "[1, FIFO COGS ITEM, 24.00, 20.00, 0.83, , , 48.00, 60.00, , , 12.00, 10.00, , , , , , , , , , , , , , , 13.00, 16.25, , , 12.00, 10.00, , , , , , , , , , , , , , , 48.00, 58.79, 12.00, 12.33, , , 1.00, 1.10]";
			
			System.out.println("actreport1stRowList   : "+actreport1stRowList);
			System.out.println("expreport1stRowList   : "+expreport1stRowList);
			
				
			int report2ndRowListCount = report2ndRowList.size();
				
			ArrayList<String> report2ndRowListArray = new ArrayList<String>();
			
			for(int i=0;i<report2ndRowListCount;i++)
			{
				String data = report2ndRowList.get(i).getText();
				
				
				report2ndRowListArray.add(data);
				
			}
			
			String actreport2ndRowList = report2ndRowListArray.toString();
			String expreport2ndRowList = "[2, Grand Total, 24.00, 20.00, 0.83, , , 48.00, 60.00, , , 12.00, 10.00, , , , , , , , , , , , , , , 13.00, 16.25, , , 12.00, 10.00, , , , , , , , , , , , , , , 48.00, 58.79, 12.00, 12.33, , , 1.00, 1.10]";
			
			System.out.println("actreport2ndRowList   : "+actreport2ndRowList);
			System.out.println("expreport2ndRowList   : "+expreport2ndRowList);
			
			if(actreport1stRowList.equalsIgnoreCase(expreport1stRowList) && actreport2ndRowList.equalsIgnoreCase(expreport2ndRowList))
			
			{
				System.out.println("Test Pass : Reports Are As Expected");
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
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
				report_CloseBtn.click();
				Thread.sleep(2000);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
				sl_CloseBtn.click();
				return false;
			}
			
		}
		

		@FindBy(xpath="//span[contains(text(),'Actual consumption report')]")
		private static WebElement  actualConsumptionReport;
	
		
		
		// Actual Consumption Report

		public boolean checkActualConsumptionReports() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
			xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
			inventoryMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryReportsMenu));
			inventoryReportsMenu.click();
			Thread.sleep(2000);
			getAction().sendKeys(Keys.END).build().perform();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(actualConsumptionReport));
			actualConsumptionReport.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_SelectAllItemsChkBox));
			sl_SelectAllItemsChkBox.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
			sl_OkBtn.click();
			
			Thread.sleep(3000);
			

			int report1stRowListCount = report1stRowList.size();
				
			ArrayList<String> report1stRowListArray = new ArrayList<String>();
			
			for(int i=0;i<report1stRowListCount;i++)
			{
				String data = report1stRowList.get(i).getText();
				
				report1stRowListArray.add(data);
				
			}
			
			String actreport1stRowList = report1stRowListArray.toString();
			String expreport1stRowList = "[1, FIFO COGS ITEM, 48.00, 60.00, , , 12.00, 10.00, 12.00, 10.00, 13.00, 16.25, , , 48.00, 2,821.82, , , 1.00, 1.10, , , 36.00, 75.74, 2,726.67]";
			
			System.out.println("actreport1stRowList   : "+actreport1stRowList);
			System.out.println("expreport1stRowList   : "+expreport1stRowList);
			
				
			int report2ndRowListCount = report2ndRowList.size();
				
			ArrayList<String> report2ndRowListArray = new ArrayList<String>();
			
			for(int i=0;i<report2ndRowListCount;i++)
			{
				String data = report2ndRowList.get(i).getText();
				
				
				report2ndRowListArray.add(data);
				
			}
			
			String actreport2ndRowList = report2ndRowListArray.toString();
			String expreport2ndRowList = "[2, Grand Total, 48.00, 60.00, , , 12.00, 10.00, 12.00, 10.00, 13.00, 16.25, , , 48.00, 2,821.82, , , 1.00, 1.10, , , 36.00, 75.74, 2,726.67]";
			
			System.out.println("actreport2ndRowList   : "+actreport2ndRowList);
			System.out.println("expreport2ndRowList   : "+expreport2ndRowList);
			
			if(actreport1stRowList.equalsIgnoreCase(expreport1stRowList) && actreport2ndRowList.equalsIgnoreCase(expreport2ndRowList))
			
			{
				System.out.println("Test Pass : Reports Are As Expected");
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
				report_CloseBtn.click();
				Thread.sleep(2000);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
				sl_CloseBtn.click();
				
				
				Thread.sleep(2000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplay));
				userNameDisplay.click();
				
				Thread.sleep(2000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
				logoutOption.click();
				
				
				return true;
			}
			else
			{
				System.out.println("Test Fail : Reports Are NOT As Expected");
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
				report_CloseBtn.click();
				Thread.sleep(2000);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
				sl_CloseBtn.click();
				
				Thread.sleep(2000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplay));
				userNameDisplay.click();
				
				Thread.sleep(2000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
				logoutOption.click();
				return false;
			}
			
		}


		//Bin Options Starts From Here 
		
		
		public boolean checkEraseAllTransation() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			
			Thread.sleep(2000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
			homeMenu.click();
			
			Thread.sleep(2000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dataMangementMenu));
			dataMangementMenu.click();
			
			Thread.sleep(2000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(eraseAllMenu));
			eraseAllMenu.click();
			
			Thread.sleep(2000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(EraseAllTansactionChkbox));
			EraseAllTansactionChkbox.click();
			
			Thread.sleep(2000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(EraseAllOKBtn));
			EraseAllOKBtn.click();
			
            String actAlertTxt=getAlert().getText();
			
			getAlert().accept();
			
			String expAlertTxt1="Are you sure you want to delete all transactions? This process is irreversible!";
			
			
			System.out.println("***** Alert Text: "+actAlertTxt+"  value expected  "+expAlertTxt1);
			
			String expMessage="Data deleted successfully";
			
			String actMessage=checkValidationMessage(expMessage);
				
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(eraseAllCancelBtn));
			eraseAllCancelBtn.click();
			
			if (actMessage.equalsIgnoreCase(expMessage) && actAlertTxt.equals(expAlertTxt1))
			{
				System.out.println(" Test Pass: Data Erased Successfully");
				return true;
				
			}
			else
			{
				System.out.println(" Test Fail: Data Not Erased Successfully");
				return true;
			}
			
		}
		
		
		
		
		@FindBy(xpath="//input[@id='chkEnableBins']")
		private static WebElement  EnableBinsChkBox;
		
		@FindBy(xpath="//input[@id='chkBinsCat']")
		private static WebElement  ItemsArePlacedinTheCategoryChkBox;
		
		@FindBy(xpath="//input[@id='chkSameBin']")
		private static WebElement  TwoDifferentItemsCannotBePlacedInSameBinChkBox;
		
		@FindBy(xpath="//input[@id='ckhConsiderUnits']")
		private static WebElement  ConsiderUnitsChkBox;
		
		@FindBy(xpath="//input[@id='ckhSameBatch']")
		private static WebElement  TwoDifferentBatchesCannotBePlacedInSameBinChkbox;
		
		@FindBy(xpath="//input[@id='chkDiffAttribute']")
		private static WebElement  ItemWithTwoDifferentAttributeCannotBEPlacedInSameBinChkBox;
		
		@FindBy(xpath="//select[@id='cmbPlaceItemfirst']")
		private static WebElement  PlaceTheItemfirstDropdown;
		
		@FindBy(xpath="//*[@id='cmbPlaceItemfirst']/option")
		private static List<WebElement>  PlaceTheItemfirstDrpDwnList;
		
		@FindBy(xpath="//input[@id='ckhAllocPartBins']")
		private static WebElement  AllocateIntoPartiallyChkBox;
		
		@FindBy(xpath="//select[@id='cmbPlaceItemfirst1']")
		private static WebElement  PickTheItemFirstdropdown;
		
		@FindBy(xpath="//*[@id='cmbPlaceItemfirst1']/option")
		private static List<WebElement>  PickTheItemFirstdrpdwnList;
		
		
		@FindBy(xpath="//input[@id='ckhPickPartBins']")
		private static WebElement  PickfromPartiallychkbox;
		
		@FindBy(xpath="//input[@id='ckhPickItmExpMF']")
		private static WebElement  PickItmExpMFChkBox;
		
		@FindBy(xpath="//input[@id='chkIssueFIFO']")
		private static WebElement  IssueFromBinChkBox;
		
		@FindBy(xpath="//input[@id='rdoPickItems_0']")
		private static WebElement  PickItembasedOnExpiryRadio;
		
		@FindBy(xpath="//input[@id='rdoPickItems_1']")
		private static WebElement  PickItemsBasedOnManufactureRadio;
		
		@FindBy(xpath="//input[@id='txtDntShowExpireWithIn']")
		private static WebElement  DontShowExpireWithInTxt;
		
		@FindBy(xpath="//input[@id='chkSkidCat']")
		private static WebElement  ItemsArePlacedintheSkidsChkBox;
		
		@FindBy(xpath="//input[@id='chkSameSkidItems']")
		private static WebElement  TwoDifferentItemsCannotBePlacedInSameSkidChkBox;
		
		@FindBy(xpath="//input[@id='ckhSameSkidBatch']")
		private static WebElement  TwoDifferentBatchesCannotBePlacedInSameSkidChkBox;
		
		@FindBy(xpath="//input[@id='chkDiffSkidAttribute']")
		private static WebElement  ItemWithTwoDifferentBatchesCannotBePlacedInSameSkidChkBox;
		
		
		@FindBy(xpath="//input[@id='iCategory']")
		public static WebElement categoryTxt;
		
		@FindBy(xpath="//*[@id='divBtnGroup1']/div/a")
		public static WebElement unitsTab;
		
		@FindBy(xpath="//input[@id='iDefaultBaseUnit']")
		public static WebElement unitsTxt;
		
		
		
		@FindBy (xpath="//*[@id='26']/span")
		private static WebElement backup;
			
		@FindBy (xpath="//*[@id='27']/span")
		private static WebElement restore;
		
		@FindBy (xpath="//*[@id='111']/span")
		private static WebElement reindex;
		
		@FindBy (xpath="//*[@id='115']/span")
		private static WebElement eraseAll;
		
		@FindBy (xpath="//*[@id='216']/span")
		private static WebElement lockAndUnlock;
		
		@FindBy (xpath="//button[@class='btn Fbutton']")
    	private static WebElement folderpathExpandBtn;
    	
    	@FindBy (xpath="//div[@id='RestoreControls']//div[1]//div[1]")
    	private static WebElement restoreCompanyBtn;
    	
    	@FindBy (xpath="//button[@class='Fbutton'][contains(text(),'Yes')]")
    	private static WebElement overRideYesBtn;
    	
    	@FindBy (xpath="//button[@class='Fbutton'][contains(text(),'No')]")
    	private static WebElement overRideNoBtn;
    	
    	@FindBy (xpath="//button[@class='Fbutton'][contains(text(),'Cancel')]")
    	private static WebElement overRideCancelBtn;
		
		
		public static boolean checkLoginAndRestoreOptionsCompanyAndLogin() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
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
    	     
    	     Thread.sleep(5000);
    	     
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
    	     
	      	 getWaitForAlert();
	    	 System.out.println(getAlert().getText());
	    	 getAlert().accept();
    	         	     
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
    	         	     
    	     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplay));
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
		
		
		
		
	
	public boolean CheckEnabletheOptionItemsArePlacedInBinsBasedOnTheirCategory() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		Thread.sleep(4000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(SettingsmenuBtn));
		SettingsmenuBtn.click();
		
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ConfigureTransactionBtn));
		ConfigureTransactionBtn.click();
		
		
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(BinsBtn));
		BinsBtn.click();
		
		if (EnableBinsChkBox.isSelected()==false)
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(EnableBinsChkBox));
			EnableBinsChkBox.click();
			
		}
		
		if (ItemsArePlacedinTheCategoryChkBox.isSelected()==false)
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ItemsArePlacedinTheCategoryChkBox));
			ItemsArePlacedinTheCategoryChkBox.click();
			
		}

		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(UpdateBtn));
		UpdateBtn.click();
		
		getWaitForAlert();
		
		String actAlertMgs  =getAlert().getText();
		String expAlertMgs  ="Do you want to save the changes?";
		
		
		System.out.println("******************CheckEnabletheOptionItemsArePlacedInBinsBasedOnTheirCategory*************************");
		
		System.out.println("AlertMessage     : "+actAlertMgs    +" Value Expected : "+expAlertMgs);	
		
		getAlert().accept();
		
		
		 String expMessage="Data saved Successfully";
			
		 String actMessage=checkValidationMessage(expMessage);
		
		
		
		if(actAlertMgs.equalsIgnoreCase(expAlertMgs))
		{
			System.out.println("Test Pass :VerifyUpdatebutton Alert Pop_Up Displayed As Expected");
			return true;
			
		}
		else
		{
			System.out.println("Test Fail :VerifyUpdatebutton Alert Pop_Up Not Displayed As Expected");
			return false;
		}
	}
	
		
	
	
		
	@FindBy(xpath="//a[@id='8001']//span[contains(text(),'Point of Sale')]")
	private static WebElement  pointOFSaleMenu;
	
	@FindBy(xpath="//a[@id='1150']//span[contains(text(),'Category')]")
	private static WebElement  pointOFSale_CategoryMenu;
	
	//Master Main Header Fields		
	@FindBy(xpath="//i[@class='icon-font6 icon-new']")
	public static WebElement masterNewBtn;
	
	//Name
	@FindBy(xpath="//input[@id='sName']")
	public static WebElement nameTxt;
	
	
	//Code
	@FindBy(xpath="//input[@id='sCode']")
	public static WebElement codeTxt;
	
	
	@FindBy(xpath="//*[@id='GenerateNewMasterModel']/div/div[1]/div[2]/div/ul/li[2]/button[5]")
	public static WebElement closeBtn;

	
	@FindBy(xpath="//*[@id='GenerateNewMasterModel']/div/div[1]/div[2]/div/ul/li[2]/button[5]/i")
	public static WebElement newCloseBtn;

	
	
	
	public boolean CheckSavingUnderTwoCategorysC1AndC2UnderPointOFSale() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		Thread.sleep(4000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(SettingsmenuBtn));
		homeMenu.click();
		
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMasterMenu));
		homeMasterMenu.click();
		
		
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pointOFSaleMenu));
		pointOFSaleMenu.click();
		
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pointOFSale_CategoryMenu));
		pointOFSale_CategoryMenu.click();
		
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterNewBtn));
		masterNewBtn.click();
		 
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
		 nameTxt.click();
		 nameTxt.clear();
		 nameTxt.sendKeys("Catageory1");
		 nameTxt.sendKeys(Keys.TAB);
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(codeTxt));
		 codeTxt.click();
		 codeTxt.clear();
		 codeTxt.sendKeys("Catageory1");
	     codeTxt.sendKeys(Keys.TAB);
		 
	     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
         nameTxt.click();
         
	     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newGeneralSaveBtn));
	     newGeneralSaveBtn.click();
		 
		 String expMessage="Saved Successfully";
			
		 String actMessage=checkValidationMessage(expMessage);
		
		
		 Thread.sleep(4000);
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
		 nameTxt.click();
		 nameTxt.clear();
		 nameTxt.sendKeys("Catageory2");
		 nameTxt.sendKeys(Keys.TAB);
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(codeTxt));
		 codeTxt.click();
		 codeTxt.clear();
		 codeTxt.sendKeys("Catageory2");
	     codeTxt.sendKeys(Keys.TAB);
		 
	     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
         nameTxt.click();
         
	     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newGeneralSaveBtn));
	     newGeneralSaveBtn.click();
		 
		 String expMessage2="Saved Successfully";
			
		 String actMessage2=checkValidationMessage(expMessage2);
		 
		 
		 Thread.sleep(2000);
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeBtn));
		 closeBtn.click();
		 
		 
		 System.out.println("Message     : "+actMessage+" Value Expected : "+expMessage);
			
		 if(actMessage.equalsIgnoreCase(expMessage) && actMessage2.equalsIgnoreCase(expMessage2))
		 {
			 System.out.println(" Test Pass   :  Categories Created Successfully" );
			 return true;
		 }
		 
		 else
		 {
			 System.out.println(" Test Fail   :  Categories Created Successfully" );
			 return false;
		 }
		 }
	
	
	@FindBy(xpath="//input[@id='cmbUserTypeMaster']")
	public static WebElement mastercmbMasterTxt; 

		
	@FindBy(xpath="//i[@class='icon-font6 icon-edit']")
	public static WebElement masterEditBtn; 

	public boolean CheckSavingBinsWithCategories() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		System.out.println("********CheckSavingBinsWithCategories Method Executes *******************");
		
		Thread.sleep(4000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(SettingsmenuBtn));
		homeMenu.click();
		
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMasterMenu));
		homeMasterMenu.click();
		
		
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binsMenu));
		binsMenu.click();
		
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastercmbMasterTxt));
		mastercmbMasterTxt.click();
		mastercmbMasterTxt.sendKeys("bin1"); 
		
		
		 Thread.sleep(2000);
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterEditBtn));
		 masterEditBtn.click();
		 
		 
		 Thread.sleep(2000);
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
		 nameTxt.click();
		 nameTxt.sendKeys(Keys.TAB);
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(codeTxt));
	     codeTxt.sendKeys(Keys.TAB);
		 
	     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(categoryTxt));
	     categoryTxt.click();
	     categoryTxt.clear();
	     categoryTxt.sendKeys("Catageory1");
	     Thread.sleep(2000);
	     categoryTxt.sendKeys(Keys.TAB);
	     
	     
	     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
         nameTxt.click();
         
	     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newGeneralSaveBtn));
	     newGeneralSaveBtn.click();
		 
		 String expMessage="Updated Successfully";
			
		 String actMessage=checkValidationMessage(expMessage);
		
		
		 Thread.sleep(4000);
		 
		 
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastercmbMasterTxt));
		mastercmbMasterTxt.click();
		mastercmbMasterTxt.sendKeys("bin2"); 
			
			
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterEditBtn));
		masterEditBtn.click();
			 
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
		 nameTxt.click();
		 nameTxt.sendKeys(Keys.TAB);
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(codeTxt));
	     codeTxt.sendKeys(Keys.TAB);
		 
	     
	     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(categoryTxt));
	     categoryTxt.click();
	     categoryTxt.clear();
	     categoryTxt.sendKeys("Catageory2");
	     Thread.sleep(2000);
	     categoryTxt.sendKeys(Keys.TAB);
	     
	     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
         nameTxt.click();
         
	     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newGeneralSaveBtn));
	     newGeneralSaveBtn.click();
		 
		 String expMessage2="Updated Successfully";
			
		 String actMessage2=checkValidationMessage(expMessage2);
		 
		 
		 System.out.println("Message     : "+actMessage+" Value Expected : "+expMessage);
			
		 if(actMessage.equalsIgnoreCase(expMessage) && actMessage2.equalsIgnoreCase(expMessage2))
		 {
			 System.out.println(" Test Pass   :  Categories Created Successfully" );
			 return true;
		 }
		 
		 else
		 {
			 System.out.println(" Test Fail   :  Categories Created Successfully" );
			 return false;
		 }
		 }
	
		
	
	public boolean CheckSavingProductWithCategories() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		System.out.println("********CheckSavingProductWithCategories Method Executes *******************");
		
		Thread.sleep(4000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(SettingsmenuBtn));
		homeMenu.click();
		
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMasterMenu));
		homeMasterMenu.click();
		
		
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMasterItemMenu));
		homeMasterItemMenu.click();
		
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMasterItem_ItemMenu));
		homeMasterItem_ItemMenu.click();
		
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterNewBtn));
		masterNewBtn.click();
		 
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
		 nameTxt.click();
		 nameTxt.clear();
		 nameTxt.sendKeys("Product A");
		 nameTxt.sendKeys(Keys.TAB);
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(codeTxt));
		 codeTxt.click();
		 codeTxt.clear();
		 codeTxt.sendKeys("Product A");
	     codeTxt.sendKeys(Keys.TAB);
		 
	     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(categoryTxt));
	     categoryTxt.click();
	     categoryTxt.clear();
	     categoryTxt.sendKeys("Catageory1");
	     Thread.sleep(2000);
	     categoryTxt.sendKeys(Keys.TAB);
	     
	     
	     
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newGeneralValuationMethodDropDown));
			newGeneralValuationMethodDropDown.click();
			newGeneralValuationMethodDropDown.sendKeys("FIFO");
  			
	     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(unitsTab));
	     unitsTab.click();
	     Thread.sleep(2000);
	     
	     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(unitsTxt));
	     unitsTxt.click();
	     unitsTxt.sendKeys("Pcs");
	     Thread.sleep(2000);
	     unitsTxt.sendKeys(Keys.TAB);
	     
	    
         
	     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newGeneralSaveBtn));
	     newGeneralSaveBtn.click();
		 
		 String expMessage="Saved Successfully";
			
		 String actMessage=checkValidationMessage(expMessage);
		
		
		 Thread.sleep(4000);
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
		 nameTxt.click();
		 nameTxt.clear();
		 nameTxt.sendKeys("Product B");
		 nameTxt.sendKeys(Keys.TAB);
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(codeTxt));
		 codeTxt.click();
		 codeTxt.clear();
		 codeTxt.sendKeys("Product B");
	     codeTxt.sendKeys(Keys.TAB);
		 
	     
	     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(categoryTxt));
	     categoryTxt.click();
	     categoryTxt.clear();
	     categoryTxt.sendKeys("Catageory2");
	     Thread.sleep(2000);
	     categoryTxt.sendKeys(Keys.TAB);
	     
	     
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newGeneralValuationMethodDropDown));
			newGeneralValuationMethodDropDown.click();
			newGeneralValuationMethodDropDown.sendKeys("FIFO");
	     
	     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(unitsTab));
	     unitsTab.click();
	     
	     
	     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(unitsTxt));
	     unitsTxt.click();
	     unitsTxt.sendKeys("Pcs");
	     Thread.sleep(2000);
	     unitsTxt.sendKeys(Keys.TAB);
         
         Thread.sleep(2000);
         
	     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newGeneralSaveBtn));
	     newGeneralSaveBtn.click();
		 
	     Thread.sleep(2000);
	     
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newCloseBtn));
		 newCloseBtn.click();
		 
		 int itemListCount = itemList.size();
  	 		
  	 		for(int i=0;i<itemListCount;i++)
  	 		{
  	 			String data= itemList.get(i).getText();
  	 			
  	 			if(data.equalsIgnoreCase("Product A"))
  	 			{
  	 				itemList.get(i).click();
  	 				itemListChkBox.get(i).click();
  	 				
  	 				break;
  	 			}
  	 		}
  	 		
  	 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemPropertiesBtn));
  	 		itemPropertiesBtn.click();
  			
  	 		Thread.sleep(2000);
  	 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dontMaintainStockbyBatchCheckbox));
  	 		dontMaintainStockbyBatchCheckbox.click();
  			
  			Thread.sleep(2000);
  			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dontMaintainStocksByRMACheckbox));
  			dontMaintainStocksByRMACheckbox.click();
  			
  			Thread.sleep(2000);
  			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(reserveByRadioBtn));
  			reserveByRadioBtn.click();
  			
  			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(reserveByRadioBtn));
  			binCheckbox.click();
  			
  			//Thread.sleep(2000);
  			
  			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ItemPropertiesOkBtn));
  			ItemPropertiesOkBtn.click();	
		 
  	 		for(int i=0;i<itemListCount;i++)
  	 		{
  	 			String data= itemList.get(i).getText();
  	 			
  	 			if(data.equalsIgnoreCase("Product A"))
  	 			{
  	 				itemList.get(i).click();
  	 				itemListChkBox.get(i).click();
  	 				
  	 				break;
  	 			}
  	 		}
  			
  			
  			
            Thread.sleep(3000);
  	 		
  	 		for(int i=0;i<itemListCount;i++)
  	 		{
  	 			String data= itemList.get(i).getText();
  	 			
  	 			if(data.equalsIgnoreCase("Product B"))
  	 			{
  	 				itemList.get(i).click();
  	 				itemListChkBox.get(i).click();
  	 				
  	 				break;
  	 			}
  	 		}
  	 		
  	 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemPropertiesBtn));
  	 		itemPropertiesBtn.click();
  			
  	 		Thread.sleep(2000);
  	 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dontMaintainStockbyBatchCheckbox));
  	 		dontMaintainStockbyBatchCheckbox.click();
  			
  	 		Thread.sleep(2000);
  			
  			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dontMaintainStocksByRMACheckbox));
  			dontMaintainStocksByRMACheckbox.click();
  			
  			Thread.sleep(2000);
  			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(reserveByRadioBtn));
  			reserveByRadioBtn.click();
  			
  			Thread.sleep(2000);
  			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binCheckbox));
  			binCheckbox.click();
  			
  			//Thread.sleep(2000);
  			
  			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ItemPropertiesOkBtn));
  			ItemPropertiesOkBtn.click();	
  			
		 
		 System.out.println("Message     : "+actMessage+" Value Expected : "+expMessage);
			
		 if(actMessage.equalsIgnoreCase(expMessage) )
		 {
			 System.out.println(" Test Pass   :  Categories Created Successfully" );
			 return true;
		 }
		 
		 else
		 {
			 System.out.println(" Test Fail   :  Categories Created Successfully" );
			 return false;
		 }
		 }
	
	@FindBy(xpath="//input[@id='rbnReserveBy']")
	public static WebElement  reserveByRadioBtn;
	
	@FindBy(xpath="//input[@id='chkBatch']")
	public static WebElement batchCheckbox ;
	
	@FindBy(xpath="//input[@id='chkBin']")
	public static WebElement binCheckbox ;
	
	@FindBy(xpath="//input[@id='chkRMA']")
	public static WebElement  RMACheckbox;
	
	
	@FindBy(xpath="//input[@id='chkDontMaintainStockbyBatch']")
	public static WebElement dontMaintainStockbyBatchCheckbox ;
	
	@FindBy(xpath="//input[@id='chkDontinputBin']")
	public static WebElement  dontinputBinCheckbox;
	
	@FindBy(xpath="//input[@id='chkDontMaintainStocksByRMA']")
	public static WebElement dontMaintainStocksByRMACheckbox ;
	
	@FindBy(xpath="//*[@id='chkDontMaintainStockbyBatch']")
     private static WebElement PropertiesDontMaintainStockbyBatchChekbox;
     
     @FindBy(xpath="//*[@id='chkDontinputBin']")
     private static WebElement ItemPropertiesDontinputBinChekbox;
     
     @FindBy(xpath="//*[@id='chkDontMaintainStocksByRMA']")
     private static WebElement ItemPropertiesDontMaintainStocksByRMAChekbox;
     
     @FindBy(xpath="//*[@id='chkInputBreakupofQuantitiesForEachCategories']")
     private static WebElement ItemPropertiesInputBreakupofQuantitiesForEachCategoriesChekbox;
     
     @FindBy(xpath="//*[@id='chkDonotPrintBill']")
     private static WebElement ItemPropertiesDonotPrintBillIfRateIsZeroChekbox;
     
     @FindBy(xpath="//*[@id='chkNotAllowedforHomeDelivery']")
     private static WebElement ItemPropertiesNotAllowedforHomeDeliveryChekbox;
     
     @FindBy(xpath="//*[@id='chkStarProduct']")
     private static WebElement ItemPropertiesStarProductChekbox;
     
     @FindBy(xpath="//*[@id='chkDonotUpdateStock']")
     private static WebElement ItemPropertiesDonotUpdateStockChekbox;
     
     @FindBy(xpath="//*[@id='chkIgnoreExpiryforthisItem']")
     private static WebElement ItemPropertiesIgnoreExpiryforthisItemChekbox;
     
     @FindBy(xpath="//*[@id='chkIgnoreFractionInQty']")
     private static WebElement ItemPropertiesIgnoreFractionInQtyChekbox;
     
     @FindBy(xpath="//*[@id='rbnNone']")
     private static WebElement ItemPropertiesNoneRadioBtn;
     
     @FindBy(xpath="//*[@id='rbnQualities']")
     private static WebElement ItemPropertiesQualitesRadioBtn;
     
     @FindBy(xpath="//*[@id='rbnReserveBy']")
     private static WebElement ItemPropertiesReserverByRadioBtn;
     
     @FindBy(xpath="//*[@id='chkBatch']")
     private static WebElement ItemPropertiesBatchChekbox;
     
     @FindBy(xpath="//input[@id='chkBin']")
     private static WebElement ItemPropertiesBinChekbox;
     
     @FindBy(xpath="//input[@id='chkRMA']")
     private static WebElement ItemPropertiesRMAChekbox;
     
     @FindBy(xpath="//*[@id='ddlInventoryAllocation']")
     private static WebElement ItemPropertiesInventoryAllocationDropdown;
     
     @FindBy(xpath="//*[@id='ddlStatus']")
     private static WebElement ItemPropertiesActiveAndInactiveDropdown;

     @FindBy(xpath="//*[@id='chkDoNotRestrictSelectionEvenIfRightsNotAllotted'] ")
     private static WebElement ItemPropertiesDoNotRestrictSelectionEvenIfRightsNotAllottedChekbox;
     
     @FindBy(xpath="//*[@id='chkAllowOtherCompaniesToViewRecords']")
     private static WebElement ItemPropertiesAllowOtherCompaniesToViewRecordsChekbox;

	
	@FindBy(xpath="//*[@id='LandingGridBody']/tr/td[12]")
  	private static List<WebElement> itemList;
  	
  	@FindBy(xpath="//*[@id='LandingGridBody']/tr/td[8]/div/label/input")
  	private static List<WebElement> itemListChkBox;
  	
  	 @FindBy(xpath="//*[@id='btnProperties']")
     private static WebElement itemPropertiesBtn;

  	@FindBy(xpath=" //*[@id='btnPropOk']/i")
     private static WebElement ItemPropertiesOkBtn;
     
	
	@FindBy(xpath="//*[@id='1107']/span")
	public static WebElement warehouseMenu; 
	
	@FindBy(xpath="//*[@id='iBins']")
	private static WebElement binsCombobox;


	public boolean CheckSavingWarehousesWithBinsAllocation() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		System.out.println("****************CheckSavingWarehousesWithBinsAllocation*********************************");
		
		Thread.sleep(4000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(SettingsmenuBtn));
		homeMenu.click();
		
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMasterMenu));
		homeMasterMenu.click();
		
		
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(warehouseMenu));
		warehouseMenu.click();
		
		Thread.sleep(2000);
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterNewBtn));
		 masterNewBtn.click();
		
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
		 nameTxt.click();
		 nameTxt.clear();
		 nameTxt.sendKeys("Warehouse1");
		 nameTxt.sendKeys(Keys.TAB);
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(codeTxt));
		 codeTxt.click();
		 codeTxt.clear();
		 codeTxt.sendKeys("Warehouse1");
	     codeTxt.sendKeys(Keys.TAB);
		 
	     Thread.sleep(2000);
         getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binsCombobox));
         binsCombobox.click();
         binsCombobox.sendKeys("Bin1");
         
	     Thread.sleep(2000);
	     
	     binsCombobox.sendKeys(Keys.TAB);
	     
	     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
         nameTxt.click();
         
         Thread.sleep(2000);
	     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newGeneralSaveBtn));
	     newGeneralSaveBtn.click();
		 
	     
		 String expMessage="Saved Successfully";
			
		 String actMessage=checkValidationMessage(expMessage);
		
		
		 Thread.sleep(4000);
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
		 nameTxt.click();
		 nameTxt.clear();
		 nameTxt.sendKeys("Warehouse2");
		 nameTxt.sendKeys(Keys.TAB);
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(codeTxt));
		 codeTxt.click();
		 codeTxt.clear();
		 codeTxt.sendKeys("Warehouse2");
	     codeTxt.sendKeys(Keys.TAB);
		 
	     Thread.sleep(2000);
         getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binsCombobox));
         binsCombobox.click();
         binsCombobox.sendKeys("Bin2");
         
	     Thread.sleep(2000);
	     
	     binsCombobox.sendKeys(Keys.TAB);
		 
	     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
         nameTxt.click();
         
         Thread.sleep(2000);
	     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newGeneralSaveBtn));
	     newGeneralSaveBtn.click();
		 
		 String expMessage2="Saved Successfully";
			
		 String actMessage2=checkValidationMessage(expMessage2);
		 
		 
		 Thread.sleep(2000);
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeBtn));
		 closeBtn.click();
		 
		 
		 System.out.println("Message     : "+actMessage+" Value Expected : "+expMessage);
			
		 if(actMessage.equalsIgnoreCase(expMessage) && actMessage2.equalsIgnoreCase(expMessage2))
		 {
			 System.out.println(" Test Pass   :  Categories Created Successfully" );
			 return true;
		 }
		 
		 else
		 {
			 System.out.println(" Test Fail   :  Categories Created Successfully" );
			 return false;
		 }
		 }
	
	
	@FindBy(xpath="//tbody[@id='id_header_268435460_table_body']//tr/td")
	private static List<WebElement> warehouseHeaderComboList;
	
	@FindBy(xpath="//tbody[@id='id_body_23_table_body']/tr/td[2]")
	private static List<WebElement> itemComboList;
	
	@FindBy(xpath="//*[@id='id_transaction_bins_grid_body']/tr/td")
	  private static List<WebElement> binInwardGridList;
	
	public boolean checkSavingVoucherInOpeningStocksNewWithProductA() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		System.out.println("****************checkSavingVoucherInOpeningStocksNewWithProductA Method Executed ***********************");
		
			
		 Thread.sleep(2000);
		    
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
		inventoryMenu.click();
	    
		Thread.sleep(2000);
		
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(invTransactionsMenu));
	    invTransactionsMenu.click();
	    
	    Thread.sleep(2000);
	    
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(invTransStocksMenu));
	    invTransStocksMenu.click();
	    
	    Thread.sleep(2000);
		
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(openingStocksNewVoucher));
	    openingStocksNewVoucher.click();
	    
	    
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();
		
		checkUserFriendlyMessage();
		
        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(warehouseTxt));
		warehouseTxt.click();
		warehouseTxt.sendKeys(Keys.SPACE);
	    
		ArrayList<String> actWarehouseOpt = new ArrayList<String>(); 
		
		int warehouselist=warehouseHeaderComboList.size();
		
		String actWarehouseList= actWarehouseOpt.toString();
            
        for (int i = 0; i < warehouselist; i++) 
		{
					String warehouse=warehouseHeaderComboList.get(i).getText();
					
					
					
		     if (warehouse.equalsIgnoreCase("Warehouse1")) 
		     {
					System.out.println("Entered If Loop");
					
					warehouseHeaderComboList.get(i).click();
					
					warehouseTxt.sendKeys(Keys.TAB);
					
					break;
				}
		}

            getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
			select1stRow_1stColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
			enter_ItemTxt.sendKeys(Keys.SPACE);
			
			int itemsCount=itemComboList.size();
			
			for (int i = 0; i < itemsCount; i++) 
			{
				String item=itemComboList.get(i).getText();
				
				System.out.println(i+"  "+item);
				
				if (item.equalsIgnoreCase("Product A")) 
				{
					System.out.println("Entered If Loop");
					
					itemComboList.get(i).click();
					
					enter_ItemTxt.sendKeys(Keys.TAB);
					
					break;
				}
			}
			
            getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_UnitTxt));
			enter_UnitTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
			enter_Quantity.sendKeys(Keys.END,Keys.SHIFT,Keys.HOME);
			enter_Quantity.sendKeys("1");
			enter_Quantity.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
			enter_Rate.sendKeys(Keys.END,Keys.SHIFT,Keys.HOME);
			enter_Rate.sendKeys("15.00");
			enter_Rate.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
			enter_Gross.sendKeys(Keys.TAB);

			Thread.sleep(2000);

            getAction().doubleClick(binSearchBtn).build().perform();
			
			int binInwardGridListCount = binInwardGridList.size();
			
			ArrayList<String> binInwardGridListArray = new ArrayList<String>();
			
			for(int i=0;i<binInwardGridListCount;i++)
			{
				String data = binInwardGridList.get(i).getText();
				binInwardGridListArray.add(data);
			}
			
			
			String actbinInwardGridList=binInwardGridListArray.toString();
			
			String expbinInwardGridList="[, Bin1, , 0.00, , 9.00, 0.00, 9.00, 9.00, Catageory1, , , 0.00, , , , ]";
			
			System.out.println("ActbinInwardGridList : " + actbinInwardGridList);
			System.out.println("ExpbinInwardGridList : " + expbinInwardGridList);
		
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binAutoAllocateBtn));
			binAutoAllocateBtn.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binOkBtn));
			binOkBtn.click();
			
			Thread.sleep(2000);
			
			String docno=documentNumberTxt.getAttribute("value");
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
			saveBtn.click();
			

			boolean savingMessage=checkVoucherSavingMessage(docno);
			
			String actMessage=Boolean.toString(savingMessage);
			String expMessage="true";
			
			if (actMessage.equalsIgnoreCase(expMessage) && actbinInwardGridList.equalsIgnoreCase(expbinInwardGridList)) 
			{
				System.out.println("Test Pass: Voucher Saved Successfully");
				return true;
				
			}
			else
			{

				System.out.println("Test Fail: Voucher Saved Successfully");
				return false;
			}
	}
		
		
	public boolean checkSavingVoucherInOpeningStocksNewWithProductB() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		System.out.println("****************checkSavingVoucherInOpeningStocksNewWithProductB Method Executed ***********************");
		
			
		 Thread.sleep(2000);
		    
		
        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(warehouseTxt));
		warehouseTxt.click();
		warehouseTxt.sendKeys(Keys.SPACE);
	    
		ArrayList<String> actWarehouseOpt = new ArrayList<String>(); 
		
		int warehouselist=warehouseHeaderComboList.size();
		
		String actWarehouseList= actWarehouseOpt.toString();
            
        for (int i = 0; i < warehouselist; i++) 
		{
					String warehouse=warehouseHeaderComboList.get(i).getText();
					
					
					
		     if (warehouse.equalsIgnoreCase("Warehouse2")) 
		     {
					System.out.println("Entered If Loop");
					
					warehouseHeaderComboList.get(i).click();
					
					warehouseTxt.sendKeys(Keys.TAB);
					
					break;
				}
		}

            getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
			select1stRow_1stColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
			enter_ItemTxt.sendKeys(Keys.SPACE);
			
			int itemsCount=itemComboList.size();
			
			for (int i = 0; i < itemsCount; i++) 
			{
				String item=itemComboList.get(i).getText();
				
				System.out.println(i+"  "+item);
				
				if (item.equalsIgnoreCase("Product B")) 
				{
					System.out.println("Entered If Loop");
					
					itemComboList.get(i).click();
					
					enter_ItemTxt.sendKeys(Keys.TAB);
					
					break;
				}
			}
			
            getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_UnitTxt));
			enter_UnitTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
			enter_Quantity.sendKeys(Keys.END,Keys.SHIFT,Keys.HOME);
			enter_Quantity.sendKeys("1");
			enter_Quantity.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
			enter_Rate.sendKeys(Keys.END,Keys.SHIFT,Keys.HOME);
			enter_Rate.sendKeys("15.00");
			enter_Rate.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
			enter_Gross.sendKeys(Keys.TAB);

			Thread.sleep(3000);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binSearchBtn));
            getAction().doubleClick(binSearchBtn).build().perform();
			
			int binInwardGridListCount = binInwardGridList.size();
			
			ArrayList<String> binInwardGridListArray = new ArrayList<String>();
			
			for(int i=0;i<binInwardGridListCount;i++)
			{
				String data = binInwardGridList.get(i).getText();
				binInwardGridListArray.add(data);
			}
			
			
			String actbinInwardGridList=binInwardGridListArray.toString();
			
			String expbinInwardGridList="[, Bin2, , 0.00, , 9.00, 0.00, 9.00, 9.00, Catageory2, , , 0.00, , , , ]";
			
			System.out.println("ActbinInwardGridList : " + actbinInwardGridList);
			System.out.println("ExpbinInwardGridList : " + expbinInwardGridList);
		
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binAutoAllocateBtn));
			binAutoAllocateBtn.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binOkBtn));
			binOkBtn.click();
			
			Thread.sleep(2000);
			
			String docno=documentNumberTxt.getAttribute("value");
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
			saveBtn.click();
			

			boolean savingMessage=checkVoucherSavingMessage(docno);
			
			String actMessage=Boolean.toString(savingMessage);
			String expMessage="true";
			
			if (actMessage.equalsIgnoreCase(expMessage) && actbinInwardGridList.equalsIgnoreCase(expbinInwardGridList)) 
			{
				System.out.println("Test Pass: Voucher Saved Successfully With Product B");
				return true;
				
			}
			else
			{
				System.out.println("Test Fail: Voucher Saved Successfully With Product B");
				return false;
			}
	}
		
	
	@FindBy(xpath="//tbody[@id='id_header_4_table_body']//tr/td")
	private static List<WebElement> customerAccountComboList;
	
	@FindBy(xpath="//tbody[@id='id_header_10_table_body']//tr/td")
	private static List<WebElement> currencyComboList;
	
	@FindBy(xpath="//tbody[@id='id_header_268435459_table_body']//tr/td")
	private static List<WebElement> departmentComboList;
	
	@FindBy(xpath="//tbody[@id='id_body_536870916_table_body']//tr/td")
	private static List<WebElement> warehouseBodyComboList;
	
	@FindBy(xpath="//tbody[@id='id_header_86_table_body']//tr/td")
	private static List<WebElement> st_warehouse1HeaderComboList;
	
	@FindBy(xpath="//tbody[@id='id_body_87_table_body']//tr/td")
	private static List<WebElement> st_warehouse2BodyComboList;
	
	@FindBy(xpath="//input[@id='id_header_268435470']")
	private static WebElement  salesInvoiceVATPlaceOFSupply;
	
	@FindBy(xpath="//tbody[@id='id_header_268435470_table_body']/tr/td")
    private static List<WebElement> placeOFSupplyList;
	
	@FindBy(xpath="//input[@id='id_header_268435471']")
	private static WebElement  salesInvoiceVATJuridictionxt;
	
	@FindBy(xpath="//tbody[@id='id_header_268435471_table_body']/tr/td")
    private static List<WebElement> JuridictionList;
	
	

	@FindBy(xpath="//input[@id='id_body_12']")
	private static WebElement  enter_SalesAccount;
	
	@FindBy(xpath="//tbody[@id='id_body_12_table_body']//tr/td")
	private static List<WebElement>  salesAccountBodyComboList;
	
	 @FindBy(xpath="//input[@id='id_body_33554511']")
     private static WebElement enter_AQTxt;
	 
	 @FindBy(xpath="//input[@id='id_body_33554512']")
     private static WebElement enter_FQTxt;
	 
	 @FindBy(xpath="//input[@id='id_body_33554513']")
     private static WebElement enter_RDTxt;
	
	
	public boolean chekSalesInvoiceBinScreenValidationWithProductA() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		System.out.println("****************chekSalesInvoiceBinScreenValidationWithProductA Method Executed ***********************");
		
			
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		financialsTransactionMenu.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsSalesMenu));
		financialsTransactionsSalesMenu.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesInvoiceVATVoucher));
		salesInvoiceVATVoucher.click();
		
		Thread.sleep(3000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();

        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerAccountTxt));
		customerAccountTxt.click();
		customerAccountTxt.sendKeys("Customer A");
		Thread.sleep(3000);
		customerAccountTxt.sendKeys(Keys.TAB);
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
		departmentTxt.click();
		departmentTxt.sendKeys("India");
		Thread.sleep(3000);
		departmentTxt.sendKeys(Keys.TAB);
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesInvoiceVATPlaceOFSupply));
		salesInvoiceVATPlaceOFSupply.click();
		salesInvoiceVATPlaceOFSupply.sendKeys(Keys.END);
		salesInvoiceVATPlaceOFSupply.sendKeys(Keys.SHIFT,Keys.HOME);
		salesInvoiceVATPlaceOFSupply.sendKeys(Keys.SPACE);
		
		
		int placeOFSupplyListCount=placeOFSupplyList.size();
		
		System.err.println("placeOFSupplyListCount   : "+placeOFSupplyListCount);
			
		for(int i=0 ; i < placeOFSupplyListCount ;i++)
		{
			String data=placeOFSupplyList.get(i).getText();
			
			if(data.equalsIgnoreCase("Abu Dhabi"))
			{
				placeOFSupplyList.get(i).click();
				
				break;
			}
		}
			
		
		salesInvoiceVATPlaceOFSupply.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesInvoiceVATJuridictionxt));
		salesInvoiceVATJuridictionxt.click();
		salesInvoiceVATJuridictionxt.sendKeys(Keys.END);
		salesInvoiceVATJuridictionxt.sendKeys(Keys.SHIFT,Keys.HOME);
		salesInvoiceVATJuridictionxt.sendKeys(Keys.SPACE);
		
		
		int JuridictionListCount=JuridictionList.size();
		
		System.err.println("JuridictionList   : "+JuridictionListCount);
			
		for(int i=0 ; i < JuridictionListCount ;i++)
		{
			String data=JuridictionList.get(i).getText();
			
			if(data.equalsIgnoreCase("Abu Dhabi"))
			{
				JuridictionList.get(i).click();
				
				break;
			}
		}
			
		
		salesInvoiceVATJuridictionxt.sendKeys(Keys.TAB);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
		select1stRow_1stColumn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pvWarehouseTxt));
		pvWarehouseTxt.click();
		pvWarehouseTxt.sendKeys("Warehouse1");
        
         Thread.sleep(3000);
        
        pvWarehouseTxt.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
		enter_ItemTxt.sendKeys("Product A");
		Thread.sleep(3000);
		enter_ItemTxt.sendKeys(Keys.TAB);
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_4thColumn));
		select1stRow_4thColumn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_SalesAccount));
		enter_SalesAccount.sendKeys("Sales - Computers");
		Thread.sleep(3000);
		enter_SalesAccount.sendKeys(Keys.TAB);
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_UnitTxt));
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_5thColumn));
		select1stRow_5thColumn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_8thColumn));
		select1stRow_8thColumn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_AQTxt));
		enter_AQTxt.clear();
		enter_AQTxt.sendKeys("1");
		enter_AQTxt.sendKeys(Keys.TAB);
		
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_FQTxt));
		enter_FQTxt.sendKeys(Keys.TAB);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_14thColumn));
		select1stRow_14thColumn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
		enter_Rate.sendKeys("1.50");
		enter_Rate.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
		enter_Gross.sendKeys(Keys.TAB);
		
		Thread.sleep(3000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_20thColumn));
		select1stRow_20thColumn.click();
		
		Thread.sleep(3000);
		
	
            getAction().doubleClick(binSearchBtn).build().perform();
			
			int binInwardGridListCount = binInwardGridList.size();
			
			ArrayList<String> binInwardGridListArray = new ArrayList<String>();
			
			for(int i=0;i<binInwardGridListCount;i++)
			{
				String data = binInwardGridList.get(i).getText();
				binInwardGridListArray.add(data);
			}
			
			
			String actbinInwardGridList=binInwardGridListArray.toString();
			
			String expbinInwardGridList="[, Bin1, , 1.00, 1.00, 9.00, 0.00, 9.00, 9.00, Catageory1, , , 0.00, , , , ]";
			
			System.out.println("ActbinInwardGridList : " + actbinInwardGridList);
			System.out.println("ExpbinInwardGridList : " + expbinInwardGridList);
		
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binCancelBtn));
			binCancelBtn.click();
			
			if (actbinInwardGridList.equalsIgnoreCase(expbinInwardGridList)) 
			{
				System.out.println("Test Pass: Bin Pop Displayed As Exepcted ");
				return true;
			}
			else
			{

				System.out.println("Test Fail: Bin Pop Displayed As Exepcted");
				return false;
			}
	}

		
		
	
	public boolean chekSalesInvoiceBinScreenValidationWithProductB() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		System.out.println("****************chekSalesInvoiceBinScreenValidationWithProductB Method Executed ***********************");
		
			
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_newBtn));
		new_newBtn.click();
		
		
		getWaitForAlert();
		
		
		getAlert().accept();
		
		Thread.sleep(2000);

	       getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerAccountTxt));
			customerAccountTxt.click();
			customerAccountTxt.sendKeys("Customer A");
			Thread.sleep(3000);
			customerAccountTxt.sendKeys(Keys.TAB);
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
			departmentTxt.click();
			departmentTxt.sendKeys("India");
			Thread.sleep(3000);
			departmentTxt.sendKeys(Keys.TAB);
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesInvoiceVATPlaceOFSupply));
			salesInvoiceVATPlaceOFSupply.click();
			salesInvoiceVATPlaceOFSupply.sendKeys(Keys.END);
			salesInvoiceVATPlaceOFSupply.sendKeys(Keys.SHIFT,Keys.HOME);
			salesInvoiceVATPlaceOFSupply.sendKeys(Keys.SPACE);
			
			
			int placeOFSupplyListCount=placeOFSupplyList.size();
			
			System.err.println("placeOFSupplyListCount   : "+placeOFSupplyListCount);
				
			for(int i=0 ; i < placeOFSupplyListCount ;i++)
			{
				String data=placeOFSupplyList.get(i).getText();
				
				if(data.equalsIgnoreCase("Abu Dhabi"))
				{
					placeOFSupplyList.get(i).click();
					
					break;
				}
			}
				
			
			salesInvoiceVATPlaceOFSupply.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesInvoiceVATJuridictionxt));
			salesInvoiceVATJuridictionxt.click();
			salesInvoiceVATJuridictionxt.sendKeys(Keys.END);
			salesInvoiceVATJuridictionxt.sendKeys(Keys.SHIFT,Keys.HOME);
			salesInvoiceVATJuridictionxt.sendKeys(Keys.SPACE);
			
			
			int JuridictionListCount=JuridictionList.size();
			
			System.err.println("JuridictionList   : "+JuridictionListCount);
				
			for(int i=0 ; i < JuridictionListCount ;i++)
			{
				String data=JuridictionList.get(i).getText();
				
				if(data.equalsIgnoreCase("Abu Dhabi"))
				{
					JuridictionList.get(i).click();
					
					break;
				}
			}
				
			
			salesInvoiceVATJuridictionxt.sendKeys(Keys.TAB);
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
			select1stRow_1stColumn.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pvWarehouseTxt));
			pvWarehouseTxt.click();
			pvWarehouseTxt.sendKeys("Warehouse2");
            
             Thread.sleep(3000);
            
            pvWarehouseTxt.sendKeys(Keys.TAB);
    
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
			enter_ItemTxt.sendKeys("Product B");
			Thread.sleep(3000);
			enter_ItemTxt.sendKeys(Keys.TAB);
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_4thColumn));
			select1stRow_4thColumn.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_SalesAccount));
			enter_SalesAccount.sendKeys("Sales - Computers");
			Thread.sleep(3000);
			enter_SalesAccount.sendKeys(Keys.TAB);
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_UnitTxt));
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_5thColumn));
			select1stRow_5thColumn.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_8thColumn));
			select1stRow_8thColumn.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_AQTxt));
			enter_AQTxt.clear();
			enter_AQTxt.sendKeys("1");
			enter_AQTxt.sendKeys(Keys.TAB);
			
		
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_FQTxt));
			enter_FQTxt.sendKeys(Keys.TAB);
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_14thColumn));
			select1stRow_14thColumn.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
			enter_Rate.sendKeys("1.50");
			enter_Rate.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
			enter_Gross.sendKeys(Keys.TAB);
			
			Thread.sleep(3000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_20thColumn));
			select1stRow_20thColumn.click();
			
			Thread.sleep(2000);
			
		
                getAction().doubleClick(binSearchBtn).build().perform();
				
				int binInwardGridListCount = binInwardGridList.size();
				
				ArrayList<String> binInwardGridListArray = new ArrayList<String>();
				
				for(int i=0;i<binInwardGridListCount;i++)
				{
					String data = binInwardGridList.get(i).getText();
					binInwardGridListArray.add(data);
				}
				
				
				String actbinInwardGridList=binInwardGridListArray.toString();
				
				String expbinInwardGridList="[, Bin2, , 1.00, 1.00, 9.00, 0.00, 9.00, 9.00, Catageory2, , , 0.00, , , , ]";
				
				System.out.println("ActbinInwardGridList : " + actbinInwardGridList);
				System.out.println("ExpbinInwardGridList : " + expbinInwardGridList);		
				
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binCancelBtn));
			binCancelBtn.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_newBtn));
			new_newBtn.click();
			
			getWaitForAlert();
			
			getAlert().accept();
			
			
			if (actbinInwardGridList.equalsIgnoreCase(expbinInwardGridList)) 
			{
				System.out.println("Test Pass: Bin Pop Displayed As Exepcted ");
				return true;
			}
			else
			{

				System.out.println("Test Fail: Bin Pop Displayed As Exepcted");
				return false;
			}
	}

		

	public boolean CheckEnabletheOptionTwoDifferentItemsCannotBePlacedInsameBIN() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		System.out.println("*******CheckEnabletheOptionTwoDifferentItemsCannotBePlacedInsameBIN Method Excuted ******************");
		
		Thread.sleep(4000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(SettingsmenuBtn));
		SettingsmenuBtn.click();
		
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ConfigureTransactionBtn));
		ConfigureTransactionBtn.click();
		
		
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(BinsBtn));
		BinsBtn.click();
		
		if (EnableBinsChkBox.isSelected()==false)
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(EnableBinsChkBox));
			EnableBinsChkBox.click();
			
		}
		
		if (ItemsArePlacedinTheCategoryChkBox.isSelected()==true)
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ItemsArePlacedinTheCategoryChkBox));
			ItemsArePlacedinTheCategoryChkBox.click();
			
		}

		if (ItemsArePlacedinTheCategoryChkBox.isSelected()==false)
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(TwoDifferentItemsCannotBePlacedInSameBinChkBox));
			TwoDifferentItemsCannotBePlacedInSameBinChkBox.click();
			
		}
		
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(UpdateBtn));
		UpdateBtn.click();
		
		getWaitForAlert();
		
		String actAlertMgs  =getAlert().getText();
		String expAlertMgs  ="Do you want to save the changes?";
		
		
		System.out.println("******************CheckEnabletheOptionItemsArePlacedInBinsBasedOnTheirCategory*************************");
		
		System.out.println("AlertMessage     : "+actAlertMgs    +" Value Expected : "+expAlertMgs);	
		
		getAlert().accept();
		
		
		 String expMessage="";
			
		 String actMessage=checkValidationMessage(expMessage);
		
		
		 Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplay));
			userNameDisplay.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
			logoutOption.click();
		 
		 
		
		if(actAlertMgs.equalsIgnoreCase(expAlertMgs))
		{
			System.out.println("Test Pass :VerifyUpdatebutton Alert Pop_Up Displayed As Expected");
			return true;
			
		}
		else
		{
			System.out.println("Test Fail :VerifyUpdatebutton Alert Pop_Up Not Displayed As Expected");
			return false;
		}
	}
	
		
		
	public boolean checkEnteringDateIntoSecoundRowInOpeningStocksAfterOptionEnable() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		

		
		System.out.println("****************checkEnteringDateIntoSecoundRowInOpeningStocksAfterOptionEnable Method Executed ***********************");
		
			
		Thread.sleep(2000);
		    
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
		inventoryMenu.click();
	    
		Thread.sleep(2000);
		
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(invTransactionsMenu));
	    invTransactionsMenu.click();
	    
	    Thread.sleep(2000);
	    
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(invTransStocksMenu));
	    invTransStocksMenu.click();
	    
	    Thread.sleep(2000);
		
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(openingStocksNewVoucher));
	    openingStocksNewVoucher.click();
	    
	    
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(editBtn));
		editBtn.click();
		
		checkUserFriendlyMessage();
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(previousBtn));
		previousBtn.click();
		
		boolean loading=checkLoadingMessage();
		
        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(warehouseTxt));
		warehouseTxt.click();

            getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select2ndRow_1stColumn));
			select2ndRow_1stColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
			enter_ItemTxt.sendKeys(Keys.SPACE);
			
			int itemsCount=itemComboList.size();
			
			for (int i = 0; i < itemsCount; i++) 
			{
				String item=itemComboList.get(i).getText();
				
				if (item.equalsIgnoreCase("Product b")) 
				{
					System.out.println("Entered If Loop");
					
					itemComboList.get(i).click();
					
					enter_ItemTxt.sendKeys(Keys.TAB);
					
					break;
				}
			}
			
            getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_UnitTxt));
			enter_UnitTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
			enter_Quantity.sendKeys(Keys.END,Keys.SHIFT,Keys.HOME);
			enter_Quantity.sendKeys("1");
			enter_Quantity.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
			enter_Rate.sendKeys(Keys.END,Keys.SHIFT,Keys.HOME);
			enter_Rate.sendKeys("15.00");
			enter_Rate.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
			enter_Gross.sendKeys(Keys.TAB);

			Thread.sleep(2000);

            getAction().doubleClick(binSearchBtn).build().perform();
			
			int binInwardGridListCount = binInwardGridList.size();
			
			ArrayList<String> binInwardGridListArray = new ArrayList<String>();
			
			for(int i=0;i<binInwardGridListCount;i++)
			{
				String data = binInwardGridList.get(i).getText();
				binInwardGridListArray.add(data);
			}
			
			
			String actbinInwardGridList=binInwardGridListArray.toString();
			
			String expbinInwardGridList="[]";
			
			System.out.println("ActbinInwardGridList : " + actbinInwardGridList);
			System.out.println("ExpbinInwardGridList : " + expbinInwardGridList);
		
			
			Thread.sleep(2000);
			binCancelBtn.click();
			
			Thread.sleep(2000);
			new_newBtn.click();
			
			getWaitForAlert();
			
			Thread.sleep(2000);
			
			getAlert().accept();
							
			if ( actbinInwardGridList.equalsIgnoreCase(expbinInwardGridList)) 
			{
				System.out.println("Test Pass: Voucher Saved Successfully");
				return true;
				
			}
			else
			{

				System.out.println("Test Fail: Voucher Saved Successfully");
				return false;
			}
		
	}
		
		
	
	
	public boolean CheckEnableOptionsForProductAsBatchBin() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		System.out.println("********CheckEnableOptionsForProductAsBatchBin Method Executes *******************");
		
		Thread.sleep(4000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(SettingsmenuBtn));
		homeMenu.click();
		
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMasterMenu));
		homeMasterMenu.click();
		
		
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMasterItemMenu));
		homeMasterItemMenu.click();
		
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMasterItem_ItemMenu));
		homeMasterItem_ItemMenu.click();
		
		 
		Thread.sleep(2000);
		
		 int itemListCount = itemList.size();
  	 		
  	 		for(int i=0;i<itemListCount;i++)
  	 		{
  	 			String data= itemList.get(i).getText();
  	 			
  	 			if(data.equalsIgnoreCase("Product A"))
  	 			{
  	 				itemList.get(i).click();
  	 				itemListChkBox.get(i).click();
  	 				
  	 				break;
  	 			}
  	 		}
  	 		
  	 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemPropertiesBtn));
  	 		itemPropertiesBtn.click();
  			
  	 		
  	 		if (dontMaintainStockbyBatchCheckbox.isSelected()==true)
  	 		{
			
	  	 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dontMaintainStockbyBatchCheckbox));
	  	 		dontMaintainStockbyBatchCheckbox.click();
	  			
			}
  	 		
  	 		if (dontMaintainStocksByRMACheckbox.isSelected()==false)
  	 		{
			
	  			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dontMaintainStocksByRMACheckbox));
	  			dontMaintainStocksByRMACheckbox.click();
	  			
	  			
			}
  	 		
  	 		if (defaultRadioBtn.isSelected()==false)
  	 		{
			
	  			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(defaultRadioBtn));
	  			defaultRadioBtn.click();
	  			
	  			
			}
  			
  			
  		
  			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ItemPropertiesOkBtn));
  			ItemPropertiesOkBtn.click();	
		 
  	 		for(int i=0;i<itemListCount;i++)
  	 		{
  	 			String data= itemList.get(i).getText();
  	 			
  	 			if(data.equalsIgnoreCase("Product A"))
  	 			{
  	 				itemList.get(i).click();
  	 				itemListChkBox.get(i).click();
  	 				
  	 				break;
  	 			}
  	 		}
  			
  			
  			
            Thread.sleep(3000);
  	 		
  	 		for(int i=0;i<itemListCount;i++)
  	 		{
  	 			String data= itemList.get(i).getText();
  	 			
  	 			if(data.equalsIgnoreCase("Product B"))
  	 			{
  	 				itemList.get(i).click();
  	 				itemListChkBox.get(i).click();
  	 				
  	 				break;
  	 			}
  	 		}
  	 		
  	 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemPropertiesBtn));
  	 		itemPropertiesBtn.click();
  			

  	 		if (dontMaintainStockbyBatchCheckbox.isSelected()==true)
  	 		{
	  	 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dontMaintainStockbyBatchCheckbox));
	  	 		dontMaintainStockbyBatchCheckbox.click();
			}
  	 		
  	 		if (dontMaintainStocksByRMACheckbox.isSelected()==false)
  	 		{
	  			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dontMaintainStocksByRMACheckbox));
	  			dontMaintainStocksByRMACheckbox.click();
			}
  	 		
  	 		if (defaultRadioBtn.isSelected()==false)
  	 		{
	  			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(defaultRadioBtn));
	  			defaultRadioBtn.click();
			}
  			
  			
  			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ItemPropertiesOkBtn));
  			ItemPropertiesOkBtn.click();	
  			
  			Thread.sleep(2000);
  			
  			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplay));
  			userNameDisplay.click();
  			
  			Thread.sleep(2000);
  			
  			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
  			logoutOption.click();
  			
  			Thread.sleep(3000);
  			
		 if(username.isDisplayed()==true)
		 {
			 System.out.println(" Test Pass   :  Categories Created Successfully" );
			 return true;
		 }
		 
		 else
		 {
			 System.out.println(" Test Fail   :  Categories Created Successfully" );
			 return false;
		 }
		 }
	

	@FindBy(xpath="//input[@id='rbnDefault']")
	public static WebElement  defaultRadioBtn;

		
	
	
	
	public boolean checkSavingVoucherInOpeningStocksNewWithBatchBinProductBeforeEnableOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		System.out.println("****************checkSavingVoucherInOpeningStocksNewWithBatchBinProductBeforeEnableOption Method Executed ***********************");
		
			
		 Thread.sleep(2000);
		    
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
		inventoryMenu.click();
	    
		Thread.sleep(2000);
		
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(invTransactionsMenu));
	    invTransactionsMenu.click();
	    
	    Thread.sleep(2000);
	    
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(invTransStocksMenu));
	    invTransStocksMenu.click();
	    
	    Thread.sleep(2000);
		
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(openingStocksNewVoucher));
	    openingStocksNewVoucher.click();
	    
	    
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();
		
		checkUserFriendlyMessage();
		
        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(warehouseTxt));
		warehouseTxt.click();
		warehouseTxt.sendKeys(Keys.SPACE);
	    
		ArrayList<String> actWarehouseOpt = new ArrayList<String>(); 
		
		int warehouselist=warehouseHeaderComboList.size();
		
		String actWarehouseList= actWarehouseOpt.toString();
            
        for (int i = 0; i < warehouselist; i++) 
		{
					String warehouse=warehouseHeaderComboList.get(i).getText();
					
					
					
		     if (warehouse.equalsIgnoreCase("Warehouse1")) 
		     {
					System.out.println("Entered If Loop");
					
					warehouseHeaderComboList.get(i).click();
					
					warehouseTxt.sendKeys(Keys.TAB);
					
					break;
				}
		}

            getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
			select1stRow_1stColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
			enter_ItemTxt.sendKeys(Keys.SPACE);
			enter_ItemTxt.sendKeys("product");
			Thread.sleep(2000);
			int itemsCount=itemComboList.size();
			
			for (int i = 0; i < itemsCount; i++) 
			{
				String item=itemComboList.get(i).getText();
				
				System.out.println(i+"  "+item);
				
				if (item.equalsIgnoreCase("Product A")) 
				{
					System.out.println("Entered If Loop");
					
					itemComboList.get(i).click();
					
					enter_ItemTxt.sendKeys(Keys.TAB);
					
					break;
				}
			}
			
            getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_UnitTxt));
			enter_UnitTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
			enter_Quantity.sendKeys(Keys.END,Keys.SHIFT,Keys.HOME);
			enter_Quantity.sendKeys("1");
			enter_Quantity.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
			enter_Rate.sendKeys(Keys.END,Keys.SHIFT,Keys.HOME);
			enter_Rate.sendKeys("15.00");
			enter_Rate.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
			enter_Gross.sendKeys(Keys.TAB);

			Thread.sleep(2000);
			
			enter_Batch.click();
			
			enter_Batch.sendKeys("Batch");
			
			enter_Batch.sendKeys(Keys.TAB);

			
			Thread.sleep(2000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binSearchBtn));
            getAction().doubleClick(binSearchBtn).build().perform();
			
			int binInwardGridListCount = binInwardGridList.size();
			
			ArrayList<String> binInwardGridListArray = new ArrayList<String>();
			
			for(int i=0;i<binInwardGridListCount;i++)
			{
				String data = binInwardGridList.get(i).getText();
				binInwardGridListArray.add(data);
			}
			
			
			String actbinInwardGridList=binInwardGridListArray.toString();
			
			String expbinInwardGridList="[, Bin1, , 0.00, , 9.00, 0.00, 9.00, 9.00, , , , 0.00, , , , ]";
			
			System.out.println("ActbinInwardGridList : " + actbinInwardGridList);
			System.out.println("ExpbinInwardGridList : " + expbinInwardGridList);
		
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binAutoAllocateBtn));
			binAutoAllocateBtn.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binOkBtn));
			binOkBtn.click();
			
			Thread.sleep(2000);
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select2ndRow_1stColumn));
			select2ndRow_1stColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
			enter_ItemTxt.sendKeys(Keys.SPACE);
			
			
			enter_ItemTxt.sendKeys("product");
			Thread.sleep(2000);
			int itemsCount1=itemComboList.size();
			
			for (int i = 0; i < itemsCount1; i++) 
			{
				String item=itemComboList.get(i).getText();
				
				System.out.println(i+"  "+item);
				
				if (item.equalsIgnoreCase("Product A")) 
				{
					System.out.println("Entered If Loop");
					
					itemComboList.get(i).click();
					
					enter_ItemTxt.sendKeys(Keys.TAB);
					
					break;
				}
			}
			
            getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_UnitTxt));
			enter_UnitTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
			enter_Quantity.sendKeys(Keys.END,Keys.SHIFT,Keys.HOME);
			enter_Quantity.sendKeys("1");
			enter_Quantity.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
			enter_Rate.sendKeys(Keys.END,Keys.SHIFT,Keys.HOME);
			enter_Rate.sendKeys("15.00");
			enter_Rate.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
			enter_Gross.sendKeys(Keys.TAB);

			Thread.sleep(2000);
			
			enter_Batch.click();
			
			enter_Batch.sendKeys("Batch");
			
			enter_Batch.sendKeys(Keys.TAB);

			Thread.sleep(2000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binSearchBtn));
            getAction().doubleClick(binSearchBtn).build().perform();
			
			
			for(int i=0;i<binInwardGridListCount;i++)
			{
				String data = binInwardGridList.get(i).getText();
				binInwardGridListArray.add(data);
			}
			
			
			String actbinInwardGridList1=binInwardGridListArray.toString();
			
			String expbinInwardGridList1="[, Bin1, , 0.00, , 9.00, 0.00, 9.00, 9.00, , , , 0.00, , , , , , Bin1, , 0.00, , 9.00, 1.00, 8.00, 8.00, , , , 0.00, , , , ]";
			
			System.out.println("ActbinInwardGridList1 : " + actbinInwardGridList1);
			System.out.println("ExpbinInwardGridList1 : " + expbinInwardGridList1);
		
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binAutoAllocateBtn));
			binAutoAllocateBtn.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binOkBtn));
			binOkBtn.click();

			
			String docno=documentNumberTxt.getAttribute("value");
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
			saveBtn.click();
			

			boolean savingMessage=checkVoucherSavingMessage(docno);
			
			String actMessage=Boolean.toString(savingMessage);
			String expMessage="true";
			
			
			
			if (actMessage.equalsIgnoreCase(expMessage) && actbinInwardGridList.equalsIgnoreCase(expbinInwardGridList) && 
					actbinInwardGridList1.equalsIgnoreCase(expbinInwardGridList1)) 
			{
				System.out.println("Test Pass: Voucher Saved Successfully");
				return true;
				
			}
			else
			{

				System.out.println("Test Fail: Voucher Saved Successfully");
				return false;
			}
	}

	
	
	
	
	
	public boolean CheckEnabletheOptionTwoDifferentBatchescannotBePlacedInSameBIN() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		System.out.println("*******CheckEnabletheOptionTwoDifferentBatchescannotBePlacedInSameBIN Method Excuted ******************");
		
		Thread.sleep(4000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(SettingsmenuBtn));
		SettingsmenuBtn.click();
		
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ConfigureTransactionBtn));
		ConfigureTransactionBtn.click();
		
		
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(BinsBtn));
		BinsBtn.click();
		
		if (EnableBinsChkBox.isSelected()==false)
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(EnableBinsChkBox));
			EnableBinsChkBox.click();
			
		}
		
		if (TwoDifferentItemsCannotBePlacedInSameBinChkBox.isSelected()==true)
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(TwoDifferentItemsCannotBePlacedInSameBinChkBox));
			TwoDifferentItemsCannotBePlacedInSameBinChkBox.click();
			
		}

		if (TwoDifferentBatchesCannotBePlacedInSameBinChkbox.isSelected()==false)
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(TwoDifferentBatchesCannotBePlacedInSameBinChkbox));
			TwoDifferentBatchesCannotBePlacedInSameBinChkbox.click();
			
		}
		
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(UpdateBtn));
		UpdateBtn.click();
		
		getWaitForAlert();
		
		String actAlertMgs  =getAlert().getText();
		String expAlertMgs  ="Do you want to save the changes?";
		
		
		System.out.println("******************CheckEnabletheOptionItemsArePlacedInBinsBasedOnTheirCategory*************************");
		
		System.out.println("AlertMessage     : "+actAlertMgs    +" Value Expected : "+expAlertMgs);	
		
		getAlert().accept();
		
		
		 String expMessage="Data saved Successfully";
			
		 String actMessage=checkValidationMessage(expMessage);
		
		
		 Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplay));
			userNameDisplay.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
			logoutOption.click();
		 
		 
		
		if(actAlertMgs.equalsIgnoreCase(expAlertMgs))
		{
			System.out.println("Test Pass :VerifyUpdatebutton Alert Pop_Up Displayed As Expected");
			return true;
			
		}
		else
		{
			System.out.println("Test Fail :VerifyUpdatebutton Alert Pop_Up Not Displayed As Expected");
			return false;
		}
	}
	
	

	public boolean CheckEnabletheOptionAllocateIntoPartiallyWithWithBinFirst() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		System.out.println("*******CheckEnabletheOptionAllocateIntoPartiallyWithWithBinFirst Method Excuted ******************");
		
		Thread.sleep(3000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(SettingsmenuBtn));
		SettingsmenuBtn.click();
		
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ConfigureTransactionBtn));
		ConfigureTransactionBtn.click();
		
		
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(BinsBtn));
		BinsBtn.click();
		
		
		if (TwoDifferentBatchesCannotBePlacedInSameBinChkbox.isSelected()==true)
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(TwoDifferentBatchesCannotBePlacedInSameBinChkbox));
			TwoDifferentBatchesCannotBePlacedInSameBinChkbox.click();
			
		}
		
		
		if (AllocateIntoPartiallyChkBox.isSelected()==false)
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(AllocateIntoPartiallyChkBox));
			AllocateIntoPartiallyChkBox.click();
			
		}
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(UpdateBtn));
		UpdateBtn.click();
		
		getWaitForAlert();
		
		String actAlertMgs  =getAlert().getText();
		String expAlertMgs  ="Do you want to save the changes?";
		
		
		System.out.println("******************CheckEnabletheOptionAllocateIntoPartiallyWithWithBinFirst*************************");
		
		System.out.println("AlertMessage     : "+actAlertMgs    +" Value Expected : "+expAlertMgs);	
		
		getAlert().accept();
		
		
	    String expMessage="Data saved Successfully";
			
	   String actMessage=checkValidationMessage(expMessage);
		
		
		Thread.sleep(2000);
			
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplay));
		userNameDisplay.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
		logoutOption.click();
		 
		 
		
		if(actAlertMgs.equalsIgnoreCase(expAlertMgs))
		{
			System.out.println("Test Pass :VerifyUpdatebutton Alert Pop_Up Displayed As Expected");
			return true;
			
		}
		else
		{
			System.out.println("Test Fail :VerifyUpdatebutton Alert Pop_Up Not Displayed As Expected");
			return false;
		}
	}
	
	@FindBy(xpath="//input[@id='iCapacity']")
	private static WebElement  capacityTxt;
	
	
	
	public boolean checkEditingInBinsByIncreasingCapacity() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
        System.out.println("********checkEditingInBinsByIncreasingCapacity Method Executes *******************");
		
		Thread.sleep(4000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(SettingsmenuBtn));
		homeMenu.click();
		
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMasterMenu));
		homeMasterMenu.click();
		
		
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binsMenu));
		binsMenu.click();
		
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastercmbMasterTxt));
		mastercmbMasterTxt.click();
		mastercmbMasterTxt.sendKeys("Bin Update"); 
		
		
		 Thread.sleep(2000);
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterEditBtn));
		 masterEditBtn.click();
		 
		 
		 Thread.sleep(2000);
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
		 nameTxt.click();
		 nameTxt.sendKeys(Keys.TAB);
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(codeTxt));
	     codeTxt.sendKeys(Keys.TAB);
		 
	     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(capacityTxt));
		 capacityTxt.click();
		 capacityTxt.sendKeys(Keys.END,Keys.SHIFT,Keys.HOME);
		 capacityTxt.sendKeys("90");
	     Thread.sleep(2000);
	     capacityTxt.sendKeys(Keys.TAB);
	     
	     
	     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
         nameTxt.click();
         
         Thread.sleep(2000);
	     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newGeneralSaveBtn));
	     newGeneralSaveBtn.click();
		 
		 String expMessage="Updated Successfully";
			
		 String actMessage=checkValidationMessage(expMessage);
		
	
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastercmbMasterTxt));
		mastercmbMasterTxt.click();
		mastercmbMasterTxt.sendKeys("bin1"); 
			
			
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterEditBtn));
		masterEditBtn.click();
			 
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
		 nameTxt.click();
		 nameTxt.sendKeys(Keys.TAB);
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(codeTxt));
	     codeTxt.sendKeys(Keys.TAB);
		 
	     
	     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(capacityTxt));
		 capacityTxt.click();
		 capacityTxt.sendKeys(Keys.END,Keys.SHIFT,Keys.HOME);
		 capacityTxt.sendKeys("90");
	     Thread.sleep(2000);
	     capacityTxt.sendKeys(Keys.TAB);
	     
	     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
         nameTxt.click();
         
         Thread.sleep(2000);
	     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newGeneralSaveBtn));
	     newGeneralSaveBtn.click();
		 
		 String expMessage2="Updated Successfully";
			
		 String actMessage2=checkValidationMessage(expMessage2);
		 
		 
		 System.out.println("Message2     : "+actMessage2+" Value Expected : "+expMessage2);
			
		 
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastercmbMasterTxt));
			mastercmbMasterTxt.click();
			mastercmbMasterTxt.sendKeys("bin2"); 
				
				
			Thread.sleep(2000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterEditBtn));
			masterEditBtn.click();
				 
			 
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
			 nameTxt.click();
			 nameTxt.sendKeys(Keys.TAB);
			 
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(codeTxt));
		     codeTxt.sendKeys(Keys.TAB);
			 
		     
		     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(capacityTxt));
			 capacityTxt.click();
			 capacityTxt.sendKeys(Keys.END,Keys.SHIFT,Keys.HOME);
			 capacityTxt.sendKeys("90");
		     Thread.sleep(2000);
		     capacityTxt.sendKeys(Keys.TAB);
		     
		     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
	         nameTxt.click();
	         
	         
	         Thread.sleep(1000);
		     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newGeneralSaveBtn));
		     newGeneralSaveBtn.click();
			 
			 String expMessage3="Updated Successfully";
				
			 String actMessage3=checkValidationMessage(expMessage3);
			 
			 
			 System.out.println("Message     : "+actMessage3+" Value Expected : "+expMessage3);
		 
		 
		 if(actMessage.equalsIgnoreCase(expMessage) && actMessage2.equalsIgnoreCase(expMessage2))
		 {
			 System.out.println(" Test Pass   :  Categories Created Successfully" );
			 return true;
		 }
		 
		 else
		 {
			 System.out.println(" Test Fail   :  Categories Created Successfully" );
			 return false;
		 }
	
		
		
	}
	
	
	
	public boolean checkSavingVoucherInOpeningStocksNewWithFIFOBinProductWithAllowPartallyEnableOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		System.out.println("****************checkSavingVoucherInOpeningStocksNewWithFIFOBinProductWithAllowPartallyEnableOption Method Executed ***********************");
		
		
		 Thread.sleep(2000);
		    
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
		inventoryMenu.click();
	    
		Thread.sleep(2000);
		
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(invTransactionsMenu));
	    invTransactionsMenu.click();
	    
	    Thread.sleep(2000);
	    
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(invTransStocksMenu));
	    invTransStocksMenu.click();
	    
	    Thread.sleep(2000);
		
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(openingStocksNewVoucher));
	    openingStocksNewVoucher.click();
	    
	    
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();
		
			checkUserFriendlyMessage();
			
            getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(warehouseTxt));
			warehouseTxt.click();
			warehouseTxt.sendKeys(Keys.SPACE);
		    
			ArrayList<String> actWarehouseOpt = new ArrayList<String>(); 
			
			int warehouselist=warehouseHeaderComboList.size();
			
			String actWarehouseList= actWarehouseOpt.toString();
	            
	        for (int i = 0; i < warehouselist; i++) 
			{
						String warehouse=warehouseHeaderComboList.get(i).getText();
						
						
						
			     if (warehouse.equalsIgnoreCase("SECUNDERABAD")) 
			     {
						warehouseHeaderComboList.get(i).click();
						
						warehouseTxt.sendKeys(Keys.TAB);
						
						break;
					}
			}

                getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
				select1stRow_1stColumn.click();
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
				enter_ItemTxt.sendKeys(Keys.SPACE);
				
				int itemsCount=itemComboList.size();
				
				for (int i = 0; i < itemsCount; i++) 
				{
					String item=itemComboList.get(i).getText();
					
					
					
					if (item.equalsIgnoreCase("FIFO COGS ITEM")) 
					{
						System.out.println("Entered If Loop");
						
						itemComboList.get(i).click();
						
						enter_ItemTxt.sendKeys(Keys.TAB);
						
						break;
					}
				}
				
                getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_UnitTxt));
				enter_UnitTxt.sendKeys(Keys.TAB);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
				enter_Quantity.sendKeys(Keys.END,Keys.SHIFT,Keys.HOME);
				enter_Quantity.sendKeys("1");
				enter_Quantity.sendKeys(Keys.TAB);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
				enter_Rate.sendKeys(Keys.END,Keys.SHIFT,Keys.HOME);
				enter_Rate.sendKeys("10.00");
				enter_Rate.sendKeys(Keys.TAB);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
				enter_Gross.sendKeys(Keys.TAB);

				
				Thread.sleep(2000);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binSearchBtn));
                getAction().doubleClick(binSearchBtn).build().perform();
				
                Thread.sleep(3000);
                
                getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binselect2ndRow_8thColumn));
                binselect2ndRow_8thColumn.click();
                
                binEnter8thColumn.click();
                
                binEnter8thColumn.sendKeys(Keys.END,Keys.SHIFT,Keys.HOME);
                
                binEnter8thColumn.sendKeys("2");
                
                
                binEnter8thColumn.sendKeys(Keys.TAB);
                
              
               /* getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binselect3rdRow_8thColumn));
                binselect3rdRow_8thColumn.click();
                */
                binEnter8thColumn.click();
                
                binEnter8thColumn.sendKeys(Keys.END,Keys.SHIFT,Keys.HOME);
                
                binEnter8thColumn.sendKeys("10");
                
                
                binEnter8thColumn.sendKeys(Keys.TAB);
                
                
        		 Thread.sleep(2000);
                
				int binInwardGridListCount = binInwardGridList.size();
				
				ArrayList<String> binInwardGridListArray = new ArrayList<String>();
				
				for(int i=0;i<binInwardGridListCount;i++)
				{
					String data = binInwardGridList.get(i).getText();
					binInwardGridListArray.add(data);
				}
				
				
				String actbinInwardGridList=binInwardGridListArray.toString();
				
				String expbinInwardGridList="[, BG2, , 0.00, , 0.00, 0.00, 0.00, 0.00, , , , 0.00, , , , , , Bin Update, , 0.00, , 90.00, 0.00, 90.00, 90.00, , , , 2.00, , , , , , Bin1, , 0.00, , 90.00, 0.00, 90.00, 90.00, , , , 10.00, , , , , , Bin2, , 0.00, , 90.00, 0.00, 90.00, 90.00, , , , , , , , ]";
				
				System.out.println("ActbinInwardGridList : " + actbinInwardGridList);
				System.out.println("ExpbinInwardGridList : " + expbinInwardGridList);
			
				
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binOkBtn));
				binOkBtn.click();
				
				Thread.sleep(2000);
				
				String docno=documentNumberTxt.getAttribute("value");
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
				saveBtn.click();
				

				boolean savingMessage=checkVoucherSavingMessage(docno);
				
				String actMessage=Boolean.toString(savingMessage);
				String expMessage="true";
				
				if (actMessage.equalsIgnoreCase(expMessage) && actbinInwardGridList.equalsIgnoreCase(expbinInwardGridList)) 
				{
					System.out.println("Test Pass: Voucher Saved Successfully with Option Allocate into partially filled bins first");
					return true;
					
				}
				else
				{

					System.out.println("Test Fail: Voucher Saved Successfully Allocate into partially filled bins first");
					return false;
				}
	}


	
	
	public boolean checkSavingVoucherInOpeningStocksNewWithAutoAllocateOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		System.out.println("****************checkSavingVoucherInOpeningStocksNewWithAutoAllocateOption Method Executed ***********************");
		
		
		 
			
            getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(warehouseTxt));
			warehouseTxt.click();
			warehouseTxt.sendKeys(Keys.SPACE);
		    
			ArrayList<String> actWarehouseOpt = new ArrayList<String>(); 
			
			int warehouselist=warehouseHeaderComboList.size();
			
			String actWarehouseList= actWarehouseOpt.toString();
	            
	        for (int i = 0; i < warehouselist; i++) 
			{
						String warehouse=warehouseHeaderComboList.get(i).getText();
						
						
						
			     if (warehouse.equalsIgnoreCase("SECUNDERABAD")) 
			     {
						System.out.println("Entered If Loop");
						
						warehouseHeaderComboList.get(i).click();
						
						warehouseTxt.sendKeys(Keys.TAB);
						
						break;
					}
			}

                getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
				select1stRow_1stColumn.click();
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
				enter_ItemTxt.sendKeys(Keys.SPACE);
				
				int itemsCount=itemComboList.size();
				
				for (int i = 0; i < itemsCount; i++) 
				{
					String item=itemComboList.get(i).getText();
					
					System.out.println(i+"  "+item);
					
					if (item.equalsIgnoreCase("FIFO COGS ITEM")) 
					{
						System.out.println("Entered If Loop");
						
						itemComboList.get(i).click();
						
						enter_ItemTxt.sendKeys(Keys.TAB);
						
						break;
					}
				}
				
                getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_UnitTxt));
				enter_UnitTxt.sendKeys(Keys.TAB);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
				enter_Quantity.sendKeys(Keys.END,Keys.SHIFT,Keys.HOME);
				enter_Quantity.sendKeys("1");
				enter_Quantity.sendKeys(Keys.TAB);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
				enter_Rate.sendKeys(Keys.END,Keys.SHIFT,Keys.HOME);
				enter_Rate.sendKeys("10.00");
				enter_Rate.sendKeys(Keys.TAB);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
				enter_Gross.sendKeys(Keys.TAB);

				
				Thread.sleep(2000);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binSearchBtn));
                getAction().doubleClick(binSearchBtn).build().perform();
				
                Thread.sleep(3000);
                
                getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binAutoAllocateBtn));
                binAutoAllocateBtn.click();
                
                
        		 Thread.sleep(2000);
                
				int binInwardGridListCount = binInwardGridList.size();
				
				ArrayList<String> binInwardGridListArray = new ArrayList<String>();
				
				for(int i=0;i<binInwardGridListCount;i++)
				{
					String data = binInwardGridList.get(i).getText();
					binInwardGridListArray.add(data);
				}
				
				
				String actbinInwardGridList=binInwardGridListArray.toString();
				
				String expbinInwardGridList="[, BG2, , 0.00, , 0.00, 0.00, 0.00, 0.00, , , , 0.00, , , , , , Bin Update, , 2.00, , 90.00, 2.00, 88.00, 88.00, , , , 0.00, , , , , , Bin1, , 10.00, , 90.00, 10.00, 80.00, 80.00, , , , 12.00, , , , , , Bin2, , 0.00, , 90.00, 0.00, 90.00, 90.00, , , , 0.00, , , , ]";
				
				System.out.println("ActbinInwardGridList : " + actbinInwardGridList);
				System.out.println("ExpbinInwardGridList : " + expbinInwardGridList);
			
				
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binOkBtn));
				binOkBtn.click();
				
				Thread.sleep(2000);
				
				String docno=documentNumberTxt.getAttribute("value");
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
				saveBtn.click();
				

				boolean savingMessage=checkVoucherSavingMessage(docno);
				
				String actMessage=Boolean.toString(savingMessage);
				String expMessage="true";
				
				if (actMessage.equalsIgnoreCase(expMessage) && actbinInwardGridList.equalsIgnoreCase(expbinInwardGridList)) 
				{
					System.out.println("Test Pass: Voucher Saved Successfully with Option Allocate into partially filled bins first");
					return true;
					
				}
				else
				{

					System.out.println("Test Fail: Voucher Saved Successfully Allocate into partially filled bins first");
					return false;
				}
	}


	
	
	

	public boolean CheckEnabletheOptionPickFromPartiallyFilledBinsFirst() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		System.out.println("*******CheckEnabletheOptionPickFromPartiallyFilledBinsFirst Method Excuted ******************");
		
		Thread.sleep(3000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(SettingsmenuBtn));
		SettingsmenuBtn.click();
		
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ConfigureTransactionBtn));
		ConfigureTransactionBtn.click();
		
		
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(BinsBtn));
		BinsBtn.click();
		
		
		if (PickfromPartiallychkbox.isSelected()==false)
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(PickfromPartiallychkbox));
			PickfromPartiallychkbox.click();
			
		}
		
		
		if (AllocateIntoPartiallyChkBox.isSelected()==false)
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(AllocateIntoPartiallyChkBox));
			AllocateIntoPartiallyChkBox.click();
			
		}
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(UpdateBtn));
		UpdateBtn.click();
		
		getWaitForAlert();
		
		String actAlertMgs  =getAlert().getText();
		String expAlertMgs  ="Do you want to save the changes?";
		
		
		System.out.println("******************CheckEnabletheOptionPickFromPartiallyFilledBinsFirst*************************");
		
		System.out.println("AlertMessage     : "+actAlertMgs    +" Value Expected : "+expAlertMgs);	
		
		getAlert().accept();
		
		
	    String expMessage="Data saved Successfully";
			
	   String actMessage=checkValidationMessage(expMessage);
		
		
		Thread.sleep(2000);
			
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplay));
		userNameDisplay.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
		logoutOption.click();
		 
		 
		
		if(actAlertMgs.equalsIgnoreCase(expAlertMgs))
		{
			System.out.println("Test Pass :VerifyUpdatebutton Alert Pop_Up Displayed As Expected");
			return true;
			
		}
		else
		{
			System.out.println("Test Fail :VerifyUpdatebutton Alert Pop_Up Not Displayed As Expected");
			return false;
		}
	}
	
	
	
	
	
	
	public boolean checkSavingVoucherInOpeningStocksAfterEnablePickFromPartiallyFilledBinsFirst() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		System.out.println("****************checkSavingVoucherInOpeningStocksAfterEnablePickFromPartiallyFilledBinsFirst Method Executed ***********************");
		
		
		 Thread.sleep(4000);
		    
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
		inventoryMenu.click();
	    
		Thread.sleep(2000);
		
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(invTransactionsMenu));
	    invTransactionsMenu.click();
	    
	    Thread.sleep(2000);
	    
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(invTransStocksMenu));
	    invTransStocksMenu.click();
	    
	    Thread.sleep(2000);
		
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(openingStocksNewVoucher));
	    openingStocksNewVoucher.click();
	    
	    Thread.sleep(4000);
	    
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();
		
			checkUserFriendlyMessage();
			
            getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(warehouseTxt));
			warehouseTxt.click();
			warehouseTxt.sendKeys(Keys.SPACE);
		    
			ArrayList<String> actWarehouseOpt = new ArrayList<String>(); 
			
			int warehouselist=warehouseHeaderComboList.size();
			
			String actWarehouseList= actWarehouseOpt.toString();
	            
	        for (int i = 0; i < warehouselist; i++) 
			{
						String warehouse=warehouseHeaderComboList.get(i).getText();
						
						
						
			     if (warehouse.equalsIgnoreCase("SECUNDERABAD")) 
			     {
						warehouseHeaderComboList.get(i).click();
						
						warehouseTxt.sendKeys(Keys.TAB);
						
						break;
					}
			}

                getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
				select1stRow_1stColumn.click();
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
				enter_ItemTxt.sendKeys(Keys.SPACE);
				
				int itemsCount=itemComboList.size();
				
				for (int i = 0; i < itemsCount; i++) 
				{
					String item=itemComboList.get(i).getText();
					
					
					
					if (item.equalsIgnoreCase("FIFO COGS ITEM")) 
					{
						System.out.println("Entered If Loop");
						
						itemComboList.get(i).click();
						
						enter_ItemTxt.sendKeys(Keys.TAB);
						
						break;
					}
				}
				
                getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_UnitTxt));
				enter_UnitTxt.sendKeys(Keys.TAB);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
				enter_Quantity.sendKeys(Keys.END,Keys.SHIFT,Keys.HOME);
				enter_Quantity.sendKeys("7.5");
				enter_Quantity.sendKeys(Keys.TAB);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
				enter_Rate.sendKeys(Keys.END,Keys.SHIFT,Keys.HOME);
				enter_Rate.sendKeys("10.00");
				enter_Rate.sendKeys(Keys.TAB);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
				enter_Gross.sendKeys(Keys.TAB);

				
				Thread.sleep(2000);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binSearchBtn));
                getAction().doubleClick(binSearchBtn).build().perform();
				
                Thread.sleep(3000);
                
                getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binAutoAllocateBtn));
                binAutoAllocateBtn.click();
                
               
        		 Thread.sleep(2000);
                
				int binInwardGridListCount = binInwardGridList.size();
				
				ArrayList<String> binInwardGridListArray = new ArrayList<String>();
				
				for(int i=0;i<binInwardGridListCount;i++)
				{
					String data = binInwardGridList.get(i).getText();
					binInwardGridListArray.add(data);
				}
				
				
				String actbinInwardGridList=binInwardGridListArray.toString();
				
				String expbinInwardGridList="[, BG2, , 0.00, , 0.00, 0.00, 0.00, 0.00, , , , 0.00, , , , , , Bin Update, , 0.00, , 90.00, 0.00, 90.00, 90.00, , , , 90.00, , , , , , Bin1, , 0.00, , 90.00, 0.00, 90.00, 90.00, , , , 0.00, , , , , , Bin2, , 0.00, , 90.00, 0.00, 90.00, 90.00, , , , 0.00, , , , ]";
				
				System.out.println("ActbinInwardGridList : " + actbinInwardGridList);
				System.out.println("ExpbinInwardGridList : " + expbinInwardGridList);
			
				
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binOkBtn));
				binOkBtn.click();
				
				Thread.sleep(2000);
				
				String docno=documentNumberTxt.getAttribute("value");
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
				saveBtn.click();
				

				boolean savingMessage=checkVoucherSavingMessage(docno);
				
				String actMessage=Boolean.toString(savingMessage);
				String expMessage="true";
				
				if (actMessage.equalsIgnoreCase(expMessage) && actbinInwardGridList.equalsIgnoreCase(expbinInwardGridList)) 
				{
					System.out.println("Test Pass: Voucher Saved Successfully with Option Allocate into partially filled bins first");
					return true;
					
				}
				else
				{

					System.out.println("Test Fail: Voucher Saved Successfully Allocate into partially filled bins first");
					return false;
				}
	}
	
	
	
	

	
	
	public boolean checkSavingVoucher2InOpeningStocksAfterEnablePickFromPartiallyFilledBinsFirst() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		System.out.println("****************checkSavingVoucher2InOpeningStocksAfterEnablePickFromPartiallyFilledBinsFirst Method Executed ***********************");
		
		
            getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(warehouseTxt));
			warehouseTxt.click();
			warehouseTxt.sendKeys(Keys.SPACE);
		    
			ArrayList<String> actWarehouseOpt = new ArrayList<String>(); 
			
			int warehouselist=warehouseHeaderComboList.size();
			
			String actWarehouseList= actWarehouseOpt.toString();
	            
	        for (int i = 0; i < warehouselist; i++) 
			{
						String warehouse=warehouseHeaderComboList.get(i).getText();
						
						
						
			     if (warehouse.equalsIgnoreCase("SECUNDERABAD")) 
			     {
						warehouseHeaderComboList.get(i).click();
						
						warehouseTxt.sendKeys(Keys.TAB);
						
						break;
					}
			}

                getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
				select1stRow_1stColumn.click();
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
				enter_ItemTxt.sendKeys(Keys.SPACE);
				
				int itemsCount=itemComboList.size();
				
				for (int i = 0; i < itemsCount; i++) 
				{
					String item=itemComboList.get(i).getText();
					
					
					
					if (item.equalsIgnoreCase("FIFO COGS ITEM")) 
					{
						System.out.println("Entered If Loop");
						
						itemComboList.get(i).click();
						
						enter_ItemTxt.sendKeys(Keys.TAB);
						
						break;
					}
				}
				
                getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_UnitTxt));
				enter_UnitTxt.sendKeys(Keys.TAB);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
				enter_Quantity.sendKeys(Keys.END,Keys.SHIFT,Keys.HOME);
				enter_Quantity.sendKeys("5");
				enter_Quantity.sendKeys(Keys.TAB);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
				enter_Rate.sendKeys(Keys.END,Keys.SHIFT,Keys.HOME);
				enter_Rate.sendKeys("10.00");
				enter_Rate.sendKeys(Keys.TAB);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
				enter_Gross.sendKeys(Keys.TAB);

				
				Thread.sleep(2000);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binSearchBtn));
                getAction().doubleClick(binSearchBtn).build().perform();
				
                Thread.sleep(3000);
                
                getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binAutoAllocateBtn));
                binAutoAllocateBtn.click();
                
               
        		 Thread.sleep(2000);
                
				int binInwardGridListCount = binInwardGridList.size();
				
				ArrayList<String> binInwardGridListArray = new ArrayList<String>();
				
				for(int i=0;i<binInwardGridListCount;i++)
				{
					String data = binInwardGridList.get(i).getText();
					binInwardGridListArray.add(data);
				}
				
				
				String actbinInwardGridList=binInwardGridListArray.toString();
				
				String expbinInwardGridList="[, BG2, , 0.00, , 0.00, 0.00, 0.00, 0.00, , , , 0.00, , , , , , Bin1, , 0.00, , 90.00, 0.00, 90.00, 90.00, , , , 60.00, , , , , , Bin2, , 0.00, , 90.00, 0.00, 90.00, 90.00, , , , 0.00, , , , ]";
				
				System.out.println("ActbinInwardGridList : " + actbinInwardGridList);
				System.out.println("ExpbinInwardGridList : " + expbinInwardGridList);
			
				
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binOkBtn));
				binOkBtn.click();
				
				Thread.sleep(2000);
				
				String docno=documentNumberTxt.getAttribute("value");
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
				saveBtn.click();
				

				boolean savingMessage=checkVoucherSavingMessage(docno);
				
				String actMessage=Boolean.toString(savingMessage);
				String expMessage="true";
				
				if (actMessage.equalsIgnoreCase(expMessage) && actbinInwardGridList.equalsIgnoreCase(expbinInwardGridList)) 
				{
					System.out.println("Test Pass: Voucher Saved Successfully with Option Allocate into partially filled bins first");
					return true;
					
				}
				else
				{

					System.out.println("Test Fail: Voucher Saved Successfully Allocate into partially filled bins first");
					return false;
				}
	}
	
	
	
	
	public boolean checkSavingSalesInvoiceVoucherWithpickFromPartiallyFilledFirst() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
			financialsMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
			financialsTransactionMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialTransactionSalesMenu));
			financialTransactionSalesMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesInvoicesVoucher));
			salesInvoiceVATVoucher.click();

            getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
			newBtn.click();
			
			checkUserFriendlyMessage();

            getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dateTxt_CalenderBtn));
			dateTxt_CalenderBtn.click();
		        
			Thread.sleep(2000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerAccountTxt));
			customerAccountTxt.click();
			customerAccountTxt.sendKeys(Keys.SPACE);
			
			int customerAccountCount=customerAccountComboList.size();
			
			System.out.println("Customer Account List Size: "+customerAccountCount);
			
			for (int i = 0; i < customerAccountCount; i++) 
			{
				String customerAccount=customerAccountComboList.get(i).getText();
				
				if (customerAccount.equalsIgnoreCase("Customer A"))
				{
					System.out.println("Entered If Loop");
					
					customerAccountComboList.get(i).click();
					
					customerAccountTxt.sendKeys(Keys.TAB);
					
					break;
				}
			}
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherHeaderCurrency));
			voucherHeaderCurrency.click();
			voucherHeaderCurrency.sendKeys(Keys.END);
			voucherHeaderCurrency.sendKeys(Keys.SHIFT,Keys.HOME);
			voucherHeaderCurrency.sendKeys(Keys.SPACE);
			
			int currencyCount=currencyComboList.size();
			
			for (int i = 0; i < currencyCount; i++) 
			{
				String currency=currencyComboList.get(i).getText();
				
				System.out.println(i+"  "+currency);
				
				if (currency.equalsIgnoreCase("INR"))
				{
					System.out.println("Entered If Loop");
					
					currencyComboList.get(i).click();
					
					voucherHeaderCurrency.sendKeys(Keys.TAB);
					
					break;
				}
			}
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
			departmentTxt.click();
			departmentTxt.sendKeys(Keys.SPACE);
			
			int departmentCount=departmentComboList.size();
			
			for (int i = 0; i < departmentCount; i++) 
			{
				String department=departmentComboList.get(i).getText();
				
				System.out.println(i+"  "+department);
				
				if (department.equalsIgnoreCase("INDIA"))
				{
					System.out.println("Entered If Loop");
					
					departmentComboList.get(i).click();
					
					departmentTxt.sendKeys(Keys.TAB);
					
					break;
				}
			}
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesInvoiceVATPlaceOFSupply));
			salesInvoiceVATPlaceOFSupply.click();
			salesInvoiceVATPlaceOFSupply.sendKeys(Keys.END);
			salesInvoiceVATPlaceOFSupply.sendKeys(Keys.SHIFT,Keys.HOME);
			salesInvoiceVATPlaceOFSupply.sendKeys(Keys.SPACE);
			
			
			int placeOFSupplyListCount=placeOFSupplyList.size();
			
			System.err.println("placeOFSupplyListCount   : "+placeOFSupplyListCount);
				
			for(int i=0 ; i < placeOFSupplyListCount ;i++)
			{
				String data=placeOFSupplyList.get(i).getText();
				
				if(data.equalsIgnoreCase("Abu Dhabi"))
				{
					placeOFSupplyList.get(i).click();
					
					break;
				}
			}
				
			
			salesInvoiceVATPlaceOFSupply.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesInvoiceVATJuridictionxt));
			salesInvoiceVATJuridictionxt.click();
			salesInvoiceVATJuridictionxt.sendKeys(Keys.END);
			salesInvoiceVATJuridictionxt.sendKeys(Keys.SHIFT,Keys.HOME);
			salesInvoiceVATJuridictionxt.sendKeys(Keys.SPACE);
			
			
			int JuridictionListCount=JuridictionList.size();
			
			System.err.println("JuridictionList   : "+JuridictionListCount);
				
			for(int i=0 ; i < JuridictionListCount ;i++)
			{
				String data=JuridictionList.get(i).getText();
				
				if(data.equalsIgnoreCase("Abu Dhabi"))
				{
					JuridictionList.get(i).click();
					
					break;
				}
			}
				
			
			salesInvoiceVATJuridictionxt.sendKeys(Keys.TAB);
			
            getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
			select1stRow_1stColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pvWarehouseTxt));
			pvWarehouseTxt.sendKeys(Keys.SPACE);
			
			int warehouselist=warehouseBodyComboList.size();
			
			
			ArrayList<String> actWarehouseOpt = new ArrayList<String>();
			
			System.out.println("******* Warehouse List: "+warehouselist);
			
			for (int i = 0; i < warehouselist; i++) 
			{
				String warehouse=warehouseBodyComboList.get(i).getText();
				
				
				
				if (warehouse.equalsIgnoreCase("SECUNDERABAD"))
				{
					System.out.println("Entered If Loop");
					
					warehouseBodyComboList.get(i).click();
					
					pvWarehouseTxt.sendKeys(Keys.TAB);
					
					break;
				}
			}
			

            getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
			enter_ItemTxt.sendKeys(Keys.SPACE);
			
			int itemsCount=itemComboList.size();
			
			for (int i = 0; i < itemsCount; i++) 
			{
				String item=itemComboList.get(i).getText();
				
				if (item.equalsIgnoreCase("FIFO COGS ITEM")) 
				{
					System.out.println("Entered If Loop");
					
					itemComboList.get(i).click();
					
					enter_ItemTxt.sendKeys(Keys.TAB);
					
					break;
				}
			}
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_5thColumn));
			select1stRow_5thColumn.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_8thColumn));
			select1stRow_8thColumn.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_AQTxt));
			enter_AQTxt.clear();
			enter_AQTxt.sendKeys("25");
			enter_AQTxt.sendKeys(Keys.TAB);
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_FQTxt));
			enter_FQTxt.sendKeys(Keys.TAB);
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_14thColumn));
			select1stRow_14thColumn.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
			enter_Rate.sendKeys("10");
			enter_Rate.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
			enter_Gross.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_20thColumn));
			select1stRow_20thColumn.click();
			
			
			Thread.sleep(2000);
			getAction().doubleClick(binSearchBtn).build().perform();
			

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binAutoAllocateBtn));
			binAutoAllocateBtn.click();
			
			
			String actbinoutwardRowTotalToBePicked	=binoutwardRowTotalToBePicked.getText();
			
			
			int binInwardGridListCount = binInwardGridList.size();
			
			ArrayList<String> binInwardGridListArray = new ArrayList<String>();
			
			for(int i=0;i<binInwardGridListCount;i++)
			{
				String data = binInwardGridList.get(i).getText();
				binInwardGridListArray.add(data);
			}
			
			
			String actbinInwardGridList=binInwardGridListArray.toString();
			
			String expbinInwardGridList="[, Bin Update, , 90.00, 90.00, 90.00, 90.00, 0.00, 0.00, , , , 0.00, , , , , , Bin1, , 60.00, 60.00, 90.00, 60.00, 30.00, 30.00, , , , 0.00, , , , ]";
			
			System.out.println("ActbinInwardGridList : " + actbinInwardGridList);
			System.out.println("ExpbinInwardGridList : " + expbinInwardGridList);

           
			Thread.sleep(2000);

            getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binOkBtn));
			binOkBtn.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_20thColumn));
			
			String actBin=select1stRow_20thColumn.getText();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
			String docno=documentNumberTxt.getAttribute("value");
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
			saveBtn.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pickBtn));
			pickBtn.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newReferenceTxt));
			String actNewReference=newReferenceTxt.getAttribute("value");

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(Bill_OkBtn));
			Bill_OkBtn.click();
			
			Thread.sleep(2000);

			
			boolean savingMessage=checkVoucherSavingMessage(docno);
		    
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
			String actNewDocNo=documentNumberTxt.getAttribute("value");
			
			String expBin="Bin1";
			String expNewReference="250.00";
			String expNewDocNo="2";
			
			
			System.out.println("********** Bin Column     : "+actBin           +"  value expected  "+expBin);
			System.out.println("********** New Reference  : "+actNewReference  +"  value expected  "+expNewReference);
			System.out.println("********** New Voucher No : "+actNewDocNo      +"  value expected  "+expNewDocNo);
			
						
			if(actBin.equalsIgnoreCase(expBin) && actNewReference.equalsIgnoreCase(expNewReference) && actNewDocNo.equalsIgnoreCase(expNewDocNo) && savingMessage==true) 
			{
				System.out.println("***Test Pass: Sales Invoice N Voucher Saved Successfully***");
				
				return true;
			}
			else
			{
				System.out.println("***Test Fail: Sales Invoice N Voucher NOT Saved Successfully***");
				
				return false;
			}
		}
			



	

	public boolean checkSavingVoucher3InOpeningStocksAfterEnablePickFromPartiallyFilledBinsFirst() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		System.out.println("****************checkSavingVoucher3InOpeningStocksAfterEnablePickFromPartiallyFilledBinsFirst Method Executed ***********************");
		
		
		 Thread.sleep(2000);
		    
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
		inventoryMenu.click();
	    
		Thread.sleep(2000);
		
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(invTransactionsMenu));
	    invTransactionsMenu.click();
	    
	    Thread.sleep(2000);
	    
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(invTransStocksMenu));
	    invTransStocksMenu.click();
	    
	    Thread.sleep(2000);
		
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(openingStocksNewVoucher));
	    openingStocksNewVoucher.click();
	    
	    
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();
		
			checkUserFriendlyMessage();
			
            getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(warehouseTxt));
			warehouseTxt.click();
			warehouseTxt.sendKeys(Keys.SPACE);
		    
			ArrayList<String> actWarehouseOpt = new ArrayList<String>(); 
			
			int warehouselist=warehouseHeaderComboList.size();
			
			String actWarehouseList= actWarehouseOpt.toString();
	            
	        for (int i = 0; i < warehouselist; i++) 
			{
						String warehouse=warehouseHeaderComboList.get(i).getText();
						
						
						
			     if (warehouse.equalsIgnoreCase("SECUNDERABAD")) 
			     {
						warehouseHeaderComboList.get(i).click();
						
						warehouseTxt.sendKeys(Keys.TAB);
						
						break;
					}
			}

                getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
				select1stRow_1stColumn.click();
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
				enter_ItemTxt.sendKeys(Keys.SPACE);
				
				int itemsCount=itemComboList.size();
				
				for (int i = 0; i < itemsCount; i++) 
				{
					String item=itemComboList.get(i).getText();
					
					
					
					if (item.equalsIgnoreCase("FIFO COGS ITEM")) 
					{
						System.out.println("Entered If Loop");
						
						itemComboList.get(i).click();
						
						enter_ItemTxt.sendKeys(Keys.TAB);
						
						break;
					}
				}
				
                getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_UnitTxt));
				enter_UnitTxt.sendKeys(Keys.TAB);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
				enter_Quantity.sendKeys(Keys.END,Keys.SHIFT,Keys.HOME);
				enter_Quantity.sendKeys("7.5");
				enter_Quantity.sendKeys(Keys.TAB);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
				enter_Rate.sendKeys(Keys.END,Keys.SHIFT,Keys.HOME);
				enter_Rate.sendKeys("10.00");
				enter_Rate.sendKeys(Keys.TAB);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
				enter_Gross.sendKeys(Keys.TAB);

				
				Thread.sleep(2000);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binSearchBtn));
                getAction().doubleClick(binSearchBtn).build().perform();
				
                Thread.sleep(3000);
                
                getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binAutoAllocateBtn));
                binAutoAllocateBtn.click();
                
               
        		 Thread.sleep(2000);
                
				int binInwardGridListCount = binInwardGridList.size();
				
				ArrayList<String> binInwardGridListArray = new ArrayList<String>();
				
				for(int i=0;i<binInwardGridListCount;i++)
				{
					String data = binInwardGridList.get(i).getText();
					binInwardGridListArray.add(data);
				}
				
				
				String actbinInwardGridList=binInwardGridListArray.toString();
				
				String expbinInwardGridList="[, BG2, , 0.00, , 0.00, 0.00, 0.00, 0.00, , , , 0.00, , , , , , Bin Update, , 0.00, , 90.00, 0.00, 90.00, 90.00, , , , 90.00, , , , , , Bin1, , 0.00, , 90.00, 0.00, 90.00, 90.00, , , , 0.00, , , , , , Bin2, , 0.00, , 90.00, 0.00, 90.00, 90.00, , , , 0.00, , , , ]";
				
				System.out.println("ActbinInwardGridList : " + actbinInwardGridList);
				System.out.println("ExpbinInwardGridList : " + expbinInwardGridList);
			
				
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binOkBtn));
				binOkBtn.click();
				
				Thread.sleep(2000);
				
				String docno=documentNumberTxt.getAttribute("value");
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
				saveBtn.click();
				

				boolean savingMessage=checkVoucherSavingMessage(docno);
				
				String actMessage=Boolean.toString(savingMessage);
				String expMessage="true";
				
				if (actMessage.equalsIgnoreCase(expMessage) && actbinInwardGridList.equalsIgnoreCase(expbinInwardGridList)) 
				{
					System.out.println("Test Pass: Voucher Saved Successfully with Option Allocate into partially filled bins first");
					return true;
					
				}
				else
				{

					System.out.println("Test Fail: Voucher Saved Successfully Allocate into partially filled bins first");
					return false;
				}
	}
	
	
	

	public boolean checkSavingVoucher4InOpeningStocksAfterEnablePickFromPartiallyFilledBinsFirst() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		System.out.println("****************checkSavingVoucher4InOpeningStocksAfterEnablePickFromPartiallyFilledBinsFirst Method Executed ***********************");
		
		
		 Thread.sleep(2000);
			
            getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(warehouseTxt));
			warehouseTxt.click();
			warehouseTxt.sendKeys(Keys.SPACE);
		    
			ArrayList<String> actWarehouseOpt = new ArrayList<String>(); 
			
			int warehouselist=warehouseHeaderComboList.size();
			
			String actWarehouseList= actWarehouseOpt.toString();
	            
	        for (int i = 0; i < warehouselist; i++) 
			{
						String warehouse=warehouseHeaderComboList.get(i).getText();
						
						
						
			     if (warehouse.equalsIgnoreCase("SECUNDERABAD")) 
			     {
						warehouseHeaderComboList.get(i).click();
						
						warehouseTxt.sendKeys(Keys.TAB);
						
						break;
					}
			}

                getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
				select1stRow_1stColumn.click();
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
				enter_ItemTxt.sendKeys(Keys.SPACE);
				
				int itemsCount=itemComboList.size();
				
				for (int i = 0; i < itemsCount; i++) 
				{
					String item=itemComboList.get(i).getText();
					
					
					
					if (item.equalsIgnoreCase("FIFO COGS ITEM")) 
					{
						System.out.println("Entered If Loop");
						
						itemComboList.get(i).click();
						
						enter_ItemTxt.sendKeys(Keys.TAB);
						
						break;
					}
				}
				
                getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_UnitTxt));
				enter_UnitTxt.sendKeys(Keys.TAB);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
				enter_Quantity.sendKeys(Keys.END,Keys.SHIFT,Keys.HOME);
				enter_Quantity.sendKeys("7.5");
				enter_Quantity.sendKeys(Keys.TAB);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
				enter_Rate.sendKeys(Keys.END,Keys.SHIFT,Keys.HOME);
				enter_Rate.sendKeys("10.00");
				enter_Rate.sendKeys(Keys.TAB);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
				enter_Gross.sendKeys(Keys.TAB);

				
				Thread.sleep(2000);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binSearchBtn));
                getAction().doubleClick(binSearchBtn).build().perform();
				
                Thread.sleep(3000);
                
                getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binAutoAllocateBtn));
                binAutoAllocateBtn.click();
                
               
        		 Thread.sleep(2000);
                
				int binInwardGridListCount = binInwardGridList.size();
				
				ArrayList<String> binInwardGridListArray = new ArrayList<String>();
				
				for(int i=0;i<binInwardGridListCount;i++)
				{
					String data = binInwardGridList.get(i).getText();
					binInwardGridListArray.add(data);
				}
				
				
				String actbinInwardGridList=binInwardGridListArray.toString();
				
				String expbinInwardGridList="[, BG2, , 0.00, , 0.00, 0.00, 0.00, 0.00, , , , 0.00, , , , , , Bin1, , 0.00, , 90.00, 0.00, 90.00, 90.00, , , , 90.00, , , , , , Bin2, , 0.00, , 90.00, 0.00, 90.00, 90.00, , , , 0.00, , , , ]";
				
				System.out.println("ActbinInwardGridList : " + actbinInwardGridList);
				System.out.println("ExpbinInwardGridList : " + expbinInwardGridList);
			
				
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binOkBtn));
				binOkBtn.click();
				
				Thread.sleep(2000);
				
				String docno=documentNumberTxt.getAttribute("value");
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
				saveBtn.click();
				

				boolean savingMessage=checkVoucherSavingMessage(docno);
				
				String actMessage=Boolean.toString(savingMessage);
				String expMessage="true";
				
				if (actMessage.equalsIgnoreCase(expMessage) && actbinInwardGridList.equalsIgnoreCase(expbinInwardGridList)) 
				{
					System.out.println("Test Pass: Voucher Saved Successfully with Option Allocate into partially filled bins first");
					return true;
					
				}
				else
				{

					System.out.println("Test Fail: Voucher Saved Successfully Allocate into partially filled bins first");
					return false;
				}
	}
	

	@FindBy(xpath="//*[@id='id_transaction_bins_grid_row_heading']/th/div[1]")
	private static List<WebElement> binPopupGridLabel;
			
	
	 @FindBy(xpath="//tbody[@id='id_body_23_table_body']/tr/td")
	  private static List<WebElement> itemListCount;
			
	 @FindBy(xpath="//*[@id='id_header_268435459_table_body']/tr/td")
	 private static List<WebElement> openingBalDepartmentList;
			
	 @FindBy(xpath="//*[@id='140']/span")
	 private static WebElement  inventoryTransactionsSalesMenu; 
		
	
	@FindBy(xpath="//tbody[@id='id_body_536870916_table_body']/tr/td")
    private static List<WebElement> pvwareHouseListCount;
	
	@FindBy(xpath="//input[@id='id_body_33554460']")
	private static WebElement so_enter_AQTxt;
	
	@FindBy(xpath="//input[@id='id_body_33554461']")
	private static WebElement so_enter_FQTxt;

	@FindBy(xpath="//li[@id='btnPickQuantity']")
	private static WebElement res_PickBtn;
	
	@FindBy(xpath="//div[contains(text(),'Discard')]")
	private static WebElement res_DiscardBtn;
	
	@FindBy(xpath="//div[@class='col-sm-12 footer_button_image']//span[@class='icon-ok icon-font6']")
	private static WebElement res_OkBtn;
	
	@FindBy(xpath="//div[@class='col-sm-12 footer_button_image']//span[@class='icon-close icon-font6']")
	private static WebElement res_CloseBtn;
	
	@FindBy(xpath="//*[@id='Id_BinReservation_FGrid_body']/tr/td")
	private  static List<WebElement> binReservationPopGridBody;
	
	
	
	@FindBy(xpath="//*[@id='Id_BinReservation_FGrid_body']/tr/td[5]")
	private  static List<WebElement> binReservationPopGridBin;
	
	@FindBy(xpath="//*[@id='Id_BinReservation_FGrid_body']/tr/td[3]")
	private  static List<WebElement> binReservationPopGridQtyToRelease;
	
	
	@FindBy(xpath="//tbody[@id='id_header_3_table_body']/tr/td")
	private static List<WebElement> salesAccountListCount; 

    @FindBy(xpath="//tbody[@id='id_header_4_table_body']/tr/td")
	private static List<WebElement> customerAccountListCount; 
	
	 
public boolean checkReservingFullInwardQtyInSalesOrder() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
{
	
	    Thread.sleep(3000);
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
		inventoryMenu.click();
			
		 
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsMenu));
		inventoryTransactionsMenu.click();
			
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsSalesMenu));
		inventoryTransactionsSalesMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesOrdersVoucher));
		salesOrdersVoucher.click();
			
		 Thread.sleep(3000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();
		
		checkUserFriendlyMessage();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
		documentNumberTxt.click();
	
		documentNumberTxt.sendKeys(Keys.TAB);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dateTxt));
		dateTxt.click();
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerAccountTxt));
		customerAccountTxt.click();
		customerAccountTxt.sendKeys(Keys.SPACE);
		 
		int customercount=customerAccountListCount.size();
		 
		System.err.println(customercount);
		 
		for(int i=0 ; i < customercount ;i++)
		{
			String data=customerAccountListCount.get(i).getText();
			 
			if(data.equalsIgnoreCase("Customer A"))
			{
				 customerAccountListCount.get(i).click();
				 
				 break;
			 }
		 }
			
		 customerAccountTxt.sendKeys(Keys.TAB);
		 
		 
		 Thread.sleep(2000);
			
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
		select1stRow_1stColumn.click();
			
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pvWareHouseTxt));
		pvWareHouseTxt.click();
		pvWareHouseTxt.sendKeys(Keys.SPACE);
				
		int warehousecount=pvwareHouseListCount.size();
			
			System.err.println(warehousecount);
				
			for(int i=0 ; i < warehousecount ;i++)
			{
				String data=pvwareHouseListCount.get(i).getText();
				
				if(data.equalsIgnoreCase("SECUNDERABAD"))
				{
					pvwareHouseListCount.get(i).click();
					
					break;
				}
			}
				
			pvWareHouseTxt.sendKeys(Keys.TAB);
			
			Thread.sleep(2000);
				
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
			enter_ItemTxt.sendKeys(Keys.END);
			enter_ItemTxt.sendKeys(Keys.SHIFT,Keys.HOME);
			enter_ItemTxt.sendKeys(Keys.BACK_SPACE);
			enter_ItemTxt.sendKeys(Keys.SPACE);
			
			int itemcount1=itemListCount.size();
			
			System.err.println(itemcount1);
				
			for(int i=0 ; i < itemcount1 ;i++)
			{
				String data=itemListCount.get(i).getText();
				
				if(data.equalsIgnoreCase("FIFO COGS ITEM"))
				{
					itemListCount.get(i).click();
					
					break;
				}
			}
				
			enter_ItemTxt.sendKeys(Keys.TAB);	
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_UnitTxt));
			enter_UnitTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_5thColumn));
			select1stRow_5thColumn.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(so_enter_AQTxt));
			so_enter_AQTxt.sendKeys("180");
			so_enter_AQTxt.sendKeys(Keys.TAB);
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(so_enter_FQTxt));
			so_enter_FQTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
			String actQtyInVoucher	=enter_Quantity.getAttribute("value");
	

            getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
	        enter_Quantity.sendKeys(Keys.TAB);
	
	        Thread.sleep(2000);
	        
        int binReservationPopGridBodyCount=binReservationPopGridBody.size();
		  
		Set<String> binReservationPopGridBodyList=new HashSet<String>();
		  
		for (int i = 0; i < binReservationPopGridBodyCount; i++) 
		{
			String data=binReservationPopGridBody.get(i).getText();
			binReservationPopGridBodyList.add(data);
		}
		
		String actbinReservationPopGridBody = binReservationPopGridBodyList.toString();
		
		String expbinReservationPopGridBody ="[, 0, Bin1, 0.00, SECUNDERABAD, Available, Bin Update, 90.00]";
		
		System.out.println("binReservationPopGridBody Actual   : " +actbinReservationPopGridBody);
		System.out.println("binReservationPopGridBody Expected : " +expbinReservationPopGridBody);
		
		

	int binReservationPopGridBinCount = binReservationPopGridBin.size();
	
	ArrayList<String> binReservationPopGridBinArray = new ArrayList<String> ();
	
	for(int i=0;i<50;i++)
	{
		String data = binReservationPopGridBin.get(i).getText();
		
		if(data.equalsIgnoreCase("Bin1"))
		{
			binReservationPopGridQtyToRelease.get(i).click();
			
			break;
		}
		
	}
	
	Thread.sleep(2000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(res_PickBtn));
	res_PickBtn.click();
	
	Thread.sleep(2000);
	
	for(int i=0;i<50;i++)
	{
		String data = binReservationPopGridBin.get(i).getText();
		
		if(data.equalsIgnoreCase("Bin Update"))
		{
			binReservationPopGridQtyToRelease.get(i).click();
			
			break;
		}
		
	}
	
	Thread.sleep(2000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(res_PickBtn));
	res_PickBtn.click();
	
	Thread.sleep(2000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(res_OkBtn));
	res_OkBtn.click();
	
	Thread.sleep(2000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
	enter_Rate.click();
	enter_Rate.clear();
	enter_Rate.sendKeys("10");
	enter_Rate.sendKeys(Keys.TAB);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
	enter_Gross.sendKeys(Keys.TAB);
	

     Thread.sleep(2000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
    String docno=documentNumberTxt.getAttribute("value");
	
    Thread.sleep(2000);
    
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
	saveBtn.click();
	
	boolean savingMessage=checkVoucherSavingMessage(docno);
	
	String actSavingMessage=Boolean.toString(savingMessage);
	String expSavingMessage="true";
	
	System.out.println("************************************* checkSavingSalesOrderVoucherWithReservationBinItem  *********************************");
	
	System.out.println("SavingMessage  :  "+actSavingMessage +" Value Expected : "+"TRUE");
	
	if(actSavingMessage.equalsIgnoreCase(expSavingMessage))
	{
		System.out.println("Test Pass : Error Message is Displayed ");
		return true;
	}
	
	else
	{
		System.out.println("Test Fail :  Error Message is  not Displayed ");
		return false;
	}
}
	
	

@FindBy(xpath="//label[@id='id_transactionentry_footer_panel_summary_value_26']")
private static WebElement  QtyAmount;

@FindBy(xpath="//label[@id='id_transactionentry_footer_panel_summary_value_28']")
private static WebElement  GrossAmount;

@FindBy(xpath="//span[@class='col-xs-6 icon-expand icon-font6 no_padding_left_right theme_color-inverse']")
private static WebElement  new_footerExpandBtn;



@FindBy(xpath="//tbody[@id='id_body_87_table_body']/tr/td")
private static List<WebElement> wareHouseBodyListCount;
	

@FindBy(xpath="//*[@id='id_transaction_entry_detail_workflow_body']/tr")
private static List<WebElement>  LinkRowCountCL;	


@FindBy(xpath="//select[@id='id_transactionentry_workflow_dropdown']")
private static WebElement  workFlowDropdown;

@FindBy(xpath="//select[@id='id_transactionentry_workflow_searchon']")
private static WebElement  searchOnDropdownCL;

@FindBy(xpath="//select[@id='id_transactionentry_workflow_searchtype']")
private static WebElement  containingDropdownCL;
		
@FindBy(xpath="//input[@id='id_transactionentry_workflow_search_input']")
private static WebElement  workFlowSearchTxtCL;

@FindBy(xpath="//div[@id='id_transaction_entry_workflow_control_area2']//td[4]")
private static WebElement  workFlowCustomizeBtnCL;

@FindBy(xpath="//span[@class='icon-ok icon-font7']")
private static WebElement  workFlowOkBtnCL;


@FindBy(xpath="//span[@id='id_transaction_entry_workflow_togglebutton']")
private static WebElement workFlowExpandBtn;


@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_col_1-1']//input")
private static WebElement workFlowRow1ChkBoxCL;

@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_col_1-6']")
private static WebElement  workFlowRow1Column1CL;

@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_col_1-7']")
private static WebElement  workFlowRow1Column2CL;

@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_col_1-8']")
private static WebElement  workFlowRow1Column3CL;
		
@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_col_1-9']")
private static WebElement  workFlowRow1Column4CL;

@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_col_1-10']")
private static WebElement  workFlowRow1Column5CL;


		
	

public boolean checkSavingSalesInvoiceVoucherWithReservedQtyFromBin1() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
{
	
	    Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		financialsTransactionMenu.click();
		
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialTransactionSalesMenu));
		financialTransactionSalesMenu.click();
		
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesInvoicesVoucher));
		salesInvoiceVATVoucher.click();

		Thread.sleep(2000);
		
        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();
		
		checkUserFriendlyMessage();
		
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workFlowExpandBtn));
		workFlowExpandBtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workFlowRow1ChkBoxCL));
		workFlowRow1ChkBoxCL.click();
		
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workFlowOkBtnCL));
		workFlowOkBtnCL.click();
		
       
		Thread.sleep(3000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerAccountTxt));
		customerAccountTxt.click();
		customerAccountTxt.sendKeys(Keys.END,Keys.SHIFT,Keys.HOME);
		customerAccountTxt.sendKeys(Keys.SPACE);
		
		int customerAccountCount=customerAccountComboList.size();
		
		System.out.println("Customer Account List Size: "+customerAccountCount);
		
		for (int i = 0; i < customerAccountCount; i++) 
		{
			String customerAccount=customerAccountComboList.get(i).getText();
			
			if (customerAccount.equalsIgnoreCase("Customer A"))
			{
				System.out.println("Entered If Loop");
				
				customerAccountComboList.get(i).click();
				
				customerAccountTxt.sendKeys(Keys.TAB);
				
				break;
			}
		}
		Thread.sleep(2000);
		
		customerAccountTxt.sendKeys(Keys.TAB);
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherHeaderCurrency));
		voucherHeaderCurrency.click();
		voucherHeaderCurrency.sendKeys(Keys.END);
		voucherHeaderCurrency.sendKeys(Keys.SHIFT,Keys.HOME);
		voucherHeaderCurrency.sendKeys(Keys.SPACE);
		
		int currencyCount=currencyComboList.size();
		
		for (int i = 0; i < currencyCount; i++) 
		{
			String currency=currencyComboList.get(i).getText();
			
			System.out.println(i+"  "+currency);
			
			if (currency.equalsIgnoreCase("INR"))
			{
				System.out.println("Entered If Loop");
				
				currencyComboList.get(i).click();
				
				voucherHeaderCurrency.sendKeys(Keys.TAB);
				
				break;
			}
		}
		
		voucherHeaderCurrency.sendKeys(Keys.TAB);
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
		departmentTxt.click();
		departmentTxt.sendKeys(Keys.END);
		departmentTxt.sendKeys(Keys.SHIFT,Keys.HOME);
		departmentTxt.sendKeys(Keys.SPACE);
		
		int departmentCount=departmentComboList.size();
		
		for (int i = 0; i < departmentCount; i++) 
		{
			String department=departmentComboList.get(i).getText();
			
			System.out.println(i+"  "+department);
			
			if (department.equalsIgnoreCase("INDIA"))
			{
				System.out.println("Entered If Loop");
				
				departmentComboList.get(i).click();
				
				departmentTxt.sendKeys(Keys.TAB);
				
				break;
			}
		}
		departmentTxt.sendKeys(Keys.TAB);
		
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesInvoiceVATPlaceOFSupply));
		salesInvoiceVATPlaceOFSupply.click();
		salesInvoiceVATPlaceOFSupply.sendKeys(Keys.END);
		salesInvoiceVATPlaceOFSupply.sendKeys(Keys.SHIFT,Keys.HOME);
		salesInvoiceVATPlaceOFSupply.sendKeys(Keys.SPACE);
		
		
		int placeOFSupplyListCount=placeOFSupplyList.size();
		
		System.err.println("placeOFSupplyListCount   : "+placeOFSupplyListCount);
			
		for(int i=0 ; i < placeOFSupplyListCount ;i++)
		{
			String data=placeOFSupplyList.get(i).getText();
			
			if(data.equalsIgnoreCase("Abu Dhabi"))
			{
				placeOFSupplyList.get(i).click();
				
				break;
			}
		}
			
		
		salesInvoiceVATPlaceOFSupply.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesInvoiceVATJuridictionxt));
		salesInvoiceVATJuridictionxt.click();
		salesInvoiceVATJuridictionxt.sendKeys(Keys.END);
		salesInvoiceVATJuridictionxt.sendKeys(Keys.SHIFT,Keys.HOME);
		salesInvoiceVATJuridictionxt.sendKeys(Keys.SPACE);
		
		
		int JuridictionListCount=JuridictionList.size();
		
		System.err.println("JuridictionList   : "+JuridictionListCount);
			
		for(int i=0 ; i < JuridictionListCount ;i++)
		{
			String data=JuridictionList.get(i).getText();
			
			if(data.equalsIgnoreCase("Abu Dhabi"))
			{
				JuridictionList.get(i).click();
				
				break;
			}
		}
			
		
		salesInvoiceVATJuridictionxt.sendKeys(Keys.TAB);
		
        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
		select1stRow_1stColumn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pvWarehouseTxt));
		pvWarehouseTxt.sendKeys(Keys.END);
		pvWarehouseTxt.sendKeys(Keys.SHIFT,Keys.HOME);
		pvWarehouseTxt.sendKeys(Keys.SPACE);
		
		int warehouselist=warehouseBodyComboList.size();
		
		
		ArrayList<String> actWarehouseOpt = new ArrayList<String>();
		
		System.out.println("******* Warehouse List: "+warehouselist);
		
		for (int i = 0; i < warehouselist; i++) 
		{
			String warehouse=warehouseBodyComboList.get(i).getText();
			
			
			
			if (warehouse.equalsIgnoreCase("SECUNDERABAD"))
			{
				System.out.println("Entered If Loop");
				
				warehouseBodyComboList.get(i).click();
				
				pvWarehouseTxt.sendKeys(Keys.TAB);
				
				break;
			}
		}
		

        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
        enter_ItemTxt.sendKeys(Keys.END);
        enter_ItemTxt.sendKeys(Keys.SHIFT,Keys.HOME);
		enter_ItemTxt.sendKeys(Keys.SPACE);
		
		int itemsCount=itemComboList.size();
		
		for (int i = 0; i < itemsCount; i++) 
		{
			String item=itemComboList.get(i).getText();
			
			if (item.equalsIgnoreCase("FIFO COGS ITEM")) 
			{
				System.out.println("Entered If Loop");
				
				itemComboList.get(i).click();
				
				enter_ItemTxt.sendKeys(Keys.TAB);
				
				break;
			}
		}
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_5thColumn));
		select1stRow_5thColumn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_8thColumn));
		select1stRow_8thColumn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_AQTxt));
		enter_AQTxt.clear();
		enter_AQTxt.sendKeys(Keys.END);
		enter_AQTxt.sendKeys(Keys.SHIFT,Keys.HOME);
		enter_AQTxt.sendKeys("1");
		enter_AQTxt.sendKeys(Keys.TAB);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_FQTxt));
		enter_FQTxt.clear();
		enter_FQTxt.sendKeys(Keys.TAB);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_14thColumn));
		select1stRow_14thColumn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
		enter_Rate.sendKeys("10");
		enter_Rate.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
		enter_Gross.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_20thColumn));
		select1stRow_20thColumn.click();
		
		
		Thread.sleep(2000);
		getAction().doubleClick(binSearchBtn).build().perform();
		
		Thread.sleep(3000);
        
        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binselect2ndRow_1stColumn));
        
		getAction().doubleClick(binselect2ndRow_1stColumn).build().perform();
		
		String actbinoutwardRowTotalToBePicked	=binoutwardRowTotalToBePicked.getText();
		
		
		int binInwardGridListCount = binInwardGridList.size();
		
		ArrayList<String> binInwardGridListArray = new ArrayList<String>();
		
		for(int i=0;i<binInwardGridListCount;i++)
		{
			String data = binInwardGridList.get(i).getText();
			binInwardGridListArray.add(data);
		}
		
		
		String actbinInwardGridList=binInwardGridListArray.toString();
		
		String expbinInwardGridList="[, Bin Update, , 90.00, 90.00, 90.00, 90.00, 0.00, 0.00, , , , 0.00, , , , , , Bin1, , 90.00, 90.00, 90.00, 90.00, 0.00, 0.00, , , , 1.00, , , , ]";
		
		System.out.println("ActbinInwardGridList : " + actbinInwardGridList);
		System.out.println("ExpbinInwardGridList : " + expbinInwardGridList);

       
		Thread.sleep(2000);

        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binOkBtn));
		binOkBtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_20thColumn));
		
		String actBin=select1stRow_20thColumn.getText();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
		String docno=documentNumberTxt.getAttribute("value");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
		saveBtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pickBtn));
		pickBtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newReferenceTxt));
		String actNewReference=newReferenceTxt.getAttribute("value");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(Bill_OkBtn));
		Bill_OkBtn.click();
		
		Thread.sleep(2000);

		
		boolean savingMessage=checkVoucherSavingMessage(docno);
	    
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
		String actNewDocNo=documentNumberTxt.getAttribute("value");
		
		String expBin="Bin1";
		String expNewReference="10.00";
		String expNewDocNo="2";
		
		
		System.out.println("********** Bin Column     : "+actBin           +"  value expected  "+expBin);
		System.out.println("********** New Reference  : "+actNewReference  +"  value expected  "+expNewReference);
		System.out.println("********** New Voucher No : "+actNewDocNo      +"  value expected  "+expNewDocNo);
		
					
		if(actBin.equalsIgnoreCase(expBin) && actNewReference.equalsIgnoreCase(expNewReference) && actNewDocNo.equalsIgnoreCase(expNewDocNo) && savingMessage==true) 
		{
			System.out.println("***Test Pass: Sales Invoice N Voucher Saved Successfully***");
			
			return true;
		}
		else
		{
			System.out.println("***Test Fail: Sales Invoice N Voucher NOT Saved Successfully***");
			
			return false;
		}
	}
		

public boolean checkSavingSalesInvoiceVoucherWithReservedQtyWithClickOnAutoAllocate() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
{
	
	
	System.out.println("**************************checkSavingSalesInvoiceVoucherWithReservedQtyWithClickOnAutoAllocate Method Executes *************************");
	
	        
		Thread.sleep(2000);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workFlowExpandBtn));
		workFlowExpandBtn.click();
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workFlowRow1ChkBoxCL));
		workFlowRow1ChkBoxCL.click();
		

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workFlowOkBtnCL));
		workFlowOkBtnCL.click();
		
		Thread.sleep(2000);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerAccountTxt));
		customerAccountTxt.click();
		customerAccountTxt.sendKeys(Keys.END);
		customerAccountTxt.sendKeys(Keys.SHIFT,Keys.HOME);
		customerAccountTxt.sendKeys(Keys.SPACE);
		
		int customerAccountCount=customerAccountComboList.size();
		
		System.out.println("Customer Account List Size: "+customerAccountCount);
		
		for (int i = 0; i < customerAccountCount; i++) 
		{
			String customerAccount=customerAccountComboList.get(i).getText();
			
			if (customerAccount.equalsIgnoreCase("Customer A"))
			{
				System.out.println("Entered If Loop");
				
				customerAccountComboList.get(i).click();
				
				customerAccountTxt.sendKeys(Keys.TAB);
				
				break;
			}
		}
		customerAccountTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherHeaderCurrency));
		voucherHeaderCurrency.click();
		voucherHeaderCurrency.sendKeys(Keys.END);
		voucherHeaderCurrency.sendKeys(Keys.SHIFT,Keys.HOME);
		voucherHeaderCurrency.sendKeys(Keys.SPACE);
		
		int currencyCount=currencyComboList.size();
		
		for (int i = 0; i < currencyCount; i++) 
		{
			String currency=currencyComboList.get(i).getText();
			
			System.out.println(i+"  "+currency);
			
			if (currency.equalsIgnoreCase("INR"))
			{
				System.out.println("Entered If Loop");
				
				currencyComboList.get(i).click();
				
				voucherHeaderCurrency.sendKeys(Keys.TAB);
				
				break;
			}
		}
		voucherHeaderCurrency.sendKeys(Keys.TAB);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
		departmentTxt.click();
		departmentTxt.sendKeys(Keys.END);
		departmentTxt.sendKeys(Keys.SHIFT,Keys.HOME);
		departmentTxt.sendKeys(Keys.SPACE);
		
		int departmentCount=departmentComboList.size();
		
		for (int i = 0; i < departmentCount; i++) 
		{
			String department=departmentComboList.get(i).getText();
			
			System.out.println(i+"  "+department);
			
			if (department.equalsIgnoreCase("INDIA"))
			{
				System.out.println("Entered If Loop");
				
				departmentComboList.get(i).click();
				
				departmentTxt.sendKeys(Keys.TAB);
				
				break;
			}
		}
		departmentTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesInvoiceVATPlaceOFSupply));
		salesInvoiceVATPlaceOFSupply.click();
		salesInvoiceVATPlaceOFSupply.sendKeys(Keys.END);
		salesInvoiceVATPlaceOFSupply.sendKeys(Keys.SHIFT,Keys.HOME);
		salesInvoiceVATPlaceOFSupply.sendKeys(Keys.SPACE);
		
		
		int placeOFSupplyListCount=placeOFSupplyList.size();
		
		System.err.println("placeOFSupplyListCount   : "+placeOFSupplyListCount);
			
		for(int i=0 ; i < placeOFSupplyListCount ;i++)
		{
			String data=placeOFSupplyList.get(i).getText();
			
			if(data.equalsIgnoreCase("Abu Dhabi"))
			{
				placeOFSupplyList.get(i).click();
				
				break;
			}
		}
			
		
		salesInvoiceVATPlaceOFSupply.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesInvoiceVATJuridictionxt));
		salesInvoiceVATJuridictionxt.click();
		salesInvoiceVATJuridictionxt.sendKeys(Keys.END);
		salesInvoiceVATJuridictionxt.sendKeys(Keys.SHIFT,Keys.HOME);
		salesInvoiceVATJuridictionxt.sendKeys(Keys.SPACE);
		
		
		int JuridictionListCount=JuridictionList.size();
		
		System.err.println("JuridictionList   : "+JuridictionListCount);
			
		for(int i=0 ; i < JuridictionListCount ;i++)
		{
			String data=JuridictionList.get(i).getText();
			
			if(data.equalsIgnoreCase("Abu Dhabi"))
			{
				JuridictionList.get(i).click();
				
				break;
			}
		}
			
		
		salesInvoiceVATJuridictionxt.sendKeys(Keys.TAB);
		
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
			select1stRow_1stColumn.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pvWarehouseTxt));
			pvWarehouseTxt.sendKeys(Keys.END);
			pvWarehouseTxt.sendKeys(Keys.SHIFT,Keys.HOME);
			pvWarehouseTxt.sendKeys(Keys.SPACE);
			
			int warehouselist=warehouseBodyComboList.size();
			
			
			ArrayList<String> actWarehouseOpt = new ArrayList<String>();
			
			System.out.println("******* Warehouse List: "+warehouselist);
			
			for (int i = 0; i < warehouselist; i++) 
			{
				String warehouse=warehouseBodyComboList.get(i).getText();
				
				
				
				if (warehouse.equalsIgnoreCase("SECUNDERABAD"))
				{
					System.out.println("Entered If Loop");
					
					warehouseBodyComboList.get(i).click();
					
					pvWarehouseTxt.sendKeys(Keys.TAB);
					
					break;
				}
			}
			

            getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
            enter_ItemTxt.sendKeys(Keys.END);
            enter_ItemTxt.sendKeys(Keys.SHIFT,Keys.HOME);
			enter_ItemTxt.sendKeys(Keys.SPACE);
			
			int itemsCount=itemComboList.size();
			
			for (int i = 0; i < itemsCount; i++) 
			{
				String item=itemComboList.get(i).getText();
				
				if (item.equalsIgnoreCase("FIFO COGS ITEM")) 
				{
					System.out.println("Entered If Loop");
					
					itemComboList.get(i).click();
					
					enter_ItemTxt.sendKeys(Keys.TAB);
					
					break;
				}
			}
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_5thColumn));
			select1stRow_5thColumn.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_8thColumn));
			select1stRow_8thColumn.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_AQTxt));
			enter_AQTxt.clear();
			enter_AQTxt.sendKeys(Keys.END);
			enter_AQTxt.sendKeys(Keys.SHIFT,Keys.HOME);
			enter_AQTxt.sendKeys("1");
			enter_AQTxt.sendKeys(Keys.TAB);
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_FQTxt));
			enter_FQTxt.clear();
			enter_FQTxt.sendKeys(Keys.TAB);
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_14thColumn));
			select1stRow_14thColumn.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
			enter_Rate.sendKeys("10");
			enter_Rate.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
			enter_Gross.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_20thColumn));
			select1stRow_20thColumn.click();
		
		Thread.sleep(2000);
        binSearchBtn.click();
		
		Thread.sleep(3000);
        
        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binAutoAllocateBtn));
       
        binAutoAllocateBtn.click();
		
		String actbinoutwardRowTotalToBePicked	=binoutwardRowTotalToBePicked.getText();
		
		int binInwardGridListCount = binInwardGridList.size();
		
		ArrayList<String> binInwardGridListArray = new ArrayList<String>();
		
		for(int i=0;i<binInwardGridListCount;i++)
		{
			String data = binInwardGridList.get(i).getText();
			binInwardGridListArray.add(data);
		}
		
		
		String actbinInwardGridList=binInwardGridListArray.toString();
		
		String expbinInwardGridList="[, Bin Update, , 90.00, 90.00, 90.00, 90.00, 0.00, 0.00, , , , 0.00, , , , , , Bin1, , 89.00, 89.00, 90.00, 89.00, 1.00, 1.00, , , , 1.00, , , , ]";
		
		System.out.println("ActbinInwardGridList : " + actbinInwardGridList);
		System.out.println("ExpbinInwardGridList : " + expbinInwardGridList);

       
		Thread.sleep(2000);

        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binOkBtn));
		binOkBtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_20thColumn));
		
		String actBin=select1stRow_20thColumn.getText();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
		String docno=documentNumberTxt.getAttribute("value");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
		saveBtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pickBtn));
		pickBtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newReferenceTxt));
		String actNewReference=newReferenceTxt.getAttribute("value");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(Bill_OkBtn));
		Bill_OkBtn.click();
		
		Thread.sleep(2000);

		
		boolean savingMessage=checkVoucherSavingMessage(docno);
	    
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
		String actNewDocNo=documentNumberTxt.getAttribute("value");
		
		String expBin          ="Bin1";
		String expNewReference ="10.00";
		String expNewDocNo     ="3";
		
		System.out.println("********** Bin Column     : "+actBin           +"  value expected  "+expBin);
		System.out.println("********** New Reference  : "+actNewReference  +"  value expected  "+expNewReference);
		System.out.println("********** New Voucher No : "+actNewDocNo      +"  value expected  "+expNewDocNo);
					
		if(actBin.equalsIgnoreCase(expBin) && actNewReference.equalsIgnoreCase(expNewReference) && actNewDocNo.equalsIgnoreCase(expNewDocNo) && savingMessage==true) 
		{
			System.out.println("***Test Pass: Sales Invoice N Voucher Saved Successfully***");
			return true;
		}
		else
		{
			System.out.println("***Test Fail: Sales Invoice N Voucher NOT Saved Successfully***");
			return false;
		}
	}
		
	
	
	public boolean CheckEnabletheOptionAllocateIntoPartiallyWithClosest() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		System.out.println("*******CheckEnabletheOptionAllocateIntoPartiallyWithClosest Method Excuted ******************");
		
		Thread.sleep(3000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(SettingsmenuBtn));
		SettingsmenuBtn.click();
		
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ConfigureTransactionBtn));
		ConfigureTransactionBtn.click();
		
		
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(BinsBtn));
		BinsBtn.click();
		
		
		if (TwoDifferentBatchesCannotBePlacedInSameBinChkbox.isSelected()==true)
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(TwoDifferentBatchesCannotBePlacedInSameBinChkbox));
			TwoDifferentBatchesCannotBePlacedInSameBinChkbox.click();
			
		}
		
		
		if (AllocateIntoPartiallyChkBox.isSelected()==false)
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(AllocateIntoPartiallyChkBox));
			AllocateIntoPartiallyChkBox.click();
			
		}
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(PlaceTheItemfirstDropdown));
		PlaceTheItemfirstDropdown.click();
		
		int PlaceTheItemfirstDrpDwnListCount=PlaceTheItemfirstDrpDwnList.size();
		for (int i = 0; i < PlaceTheItemfirstDrpDwnListCount; i++) 
		{
			String data=PlaceTheItemfirstDrpDwnList.get(i).getText();
			if (data.equalsIgnoreCase("Closest"))
			{
				PlaceTheItemfirstDrpDwnList.get(i).click();
			}
		}
		
		
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(UpdateBtn));
		UpdateBtn.click();
		
		getWaitForAlert();
		
		String actAlertMgs  =getAlert().getText();
		String expAlertMgs  ="Do you want to save the changes?";
		
		
		System.out.println("******************CheckEnabletheOptionItemsArePlacedInBinsBasedOnTheirCategory*************************");
		
		System.out.println("AlertMessage     : "+actAlertMgs    +" Value Expected : "+expAlertMgs);	
		
		getAlert().accept();
		
		
		 String expMessage="Data saved Successfully";
			
		 String actMessage=checkValidationMessage(expMessage);
		
		
		 Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplay));
			userNameDisplay.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
			logoutOption.click();
		 
		 
		
		if(actAlertMgs.equalsIgnoreCase(expAlertMgs))
		{
			System.out.println("Test Pass :VerifyUpdatebutton Alert Pop_Up Displayed As Expected");
			return true;
			
		}
		else
		{
			System.out.println("Test Fail :VerifyUpdatebutton Alert Pop_Up Not Displayed As Expected");
			return false;
		}
	}
	


	public boolean checkSavingVoucherInOpeningStocksWithProductAByUsingAutoAllocate() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		System.out.println("****************checkSavingVoucherInOpeningStocksWithProductAByUsingAutoAllocate Method Executed ***********************");
		
			
		 Thread.sleep(2000);
		    
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
		inventoryMenu.click();
	    
		Thread.sleep(2000);
		
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(invTransactionsMenu));
	    invTransactionsMenu.click();
	    
	    Thread.sleep(2000);
	    
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(invTransStocksMenu));
	    invTransStocksMenu.click();
	    
	    Thread.sleep(2000);
		
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(openingStocksNewVoucher));
	    openingStocksNewVoucher.click();
	    
	    
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();
		
		checkUserFriendlyMessage();
		
        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(warehouseTxt));
		warehouseTxt.click();
		warehouseTxt.sendKeys(Keys.SPACE);
	    
		ArrayList<String> actWarehouseOpt = new ArrayList<String>(); 
		
		int warehouselist=warehouseHeaderComboList.size();
		
		String actWarehouseList= actWarehouseOpt.toString();
            
        for (int i = 0; i < warehouselist; i++) 
		{
					String warehouse=warehouseHeaderComboList.get(i).getText();
					
					
					
		     if (warehouse.equalsIgnoreCase("SECUNDERABAD")) 
		     {
					System.out.println("Entered If Loop");
					
					warehouseHeaderComboList.get(i).click();
					
					warehouseTxt.sendKeys(Keys.TAB);
					
					break;
				}
		}

            getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
			select1stRow_1stColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
			enter_ItemTxt.sendKeys(Keys.SPACE);
			
			int itemsCount=itemComboList.size();
			
			for (int i = 0; i < itemsCount; i++) 
			{
				String item=itemComboList.get(i).getText();
				
				System.out.println(i+"  "+item);
				
				if (item.equalsIgnoreCase("FIFO COGS ITEM")) 
				{
					System.out.println("Entered If Loop");
					
					itemComboList.get(i).click();
					
					enter_ItemTxt.sendKeys(Keys.TAB);
					
					break;
				}
			}
			
			Thread.sleep(2000);
            getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_UnitTxt));
			enter_UnitTxt.sendKeys(Keys.TAB);
			
			Thread.sleep(2000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
			enter_Quantity.sendKeys(Keys.END,Keys.SHIFT,Keys.HOME);
			enter_Quantity.sendKeys("7.5");
			enter_Quantity.sendKeys(Keys.TAB);
			
			Thread.sleep(2000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
			enter_Rate.sendKeys(Keys.END,Keys.SHIFT,Keys.HOME);
			enter_Rate.sendKeys("15.00");
			enter_Rate.sendKeys(Keys.TAB);
			
			Thread.sleep(2000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
			enter_Gross.sendKeys(Keys.TAB);

			
			Thread.sleep(2000);
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binSearchBtn));
            binSearchBtn.click();
			
            Thread.sleep(2000);
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binAutoAllocateBtn));
    		binAutoAllocateBtn.click();
            
            
			int binInwardGridListCount = binInwardGridList.size();
			
			ArrayList<String> binInwardGridListArray = new ArrayList<String>();
			
			for(int i=0;i<binInwardGridListCount;i++)
			{
				String data = binInwardGridList.get(i).getText();
				binInwardGridListArray.add(data);
			}
			
			
			String actbinInwardGridList=binInwardGridListArray.toString();
			
			String expbinInwardGridList="[, BG2, , 0.00, , 0.00, 0.00, 0.00, 0.00, , , , 0.00, , , , , , Bin Update, , 0.00, , 90.00, 0.00, 90.00, 90.00, , , , 90.00, , , , , , Bin1, , 0.00, , 90.00, 0.00, 90.00, 90.00, , , , 0.00, , , , , , Bin2, , 0.00, , 90.00, 0.00, 90.00, 90.00, , , , 0.00, , , , ]";
			
			System.out.println("ActbinInwardGridList : " + actbinInwardGridList);
			System.out.println("ExpbinInwardGridList : " + expbinInwardGridList);
		
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binOkBtn));
			binOkBtn.click();
			
			Thread.sleep(2000);
			
							
			String actselect1stRow_7thColumn=select1stRow_7thColumn.getText();
			String expselect1stRow_7thColumn="Bin Update";

			System.out.println("ACtselect1stRow_7thColumn   : "+actselect1stRow_7thColumn +" Value Expected  : "+expselect1stRow_7thColumn);
			
			
			String docno=documentNumberTxt.getAttribute("value");
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
			saveBtn.click();
			

			boolean savingMessage=checkVoucherSavingMessage(docno);
			
			String actMessage=Boolean.toString(savingMessage);
			String expMessage="true";
			
			
			if (actMessage.equalsIgnoreCase(expMessage) && actbinInwardGridList.equalsIgnoreCase(expbinInwardGridList) && 
					actselect1stRow_7thColumn.equalsIgnoreCase(expselect1stRow_7thColumn) ) 
			{
				System.out.println("Test Pass: Voucher Saved Successfully");
				return true;
				
			}
			else
			{

				System.out.println("Test Fail: Voucher Saved Successfully");
				return false;
			}
	}

	

	public boolean checkSavingSalesInvoiceVoucherWithClosetOption() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		
		
		System.out.println("**************************checkSavingSalesInvoiceVoucherWithClosetOption Method Executes *************************");
		
		        
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
			financialsMenu.click();
			
			Thread.sleep(2000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
			financialsTransactionMenu.click();
			
			Thread.sleep(2000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialTransactionSalesMenu));
			financialTransactionSalesMenu.click();
			
			Thread.sleep(2000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesInvoicesVoucher));
			salesInvoiceVATVoucher.click();

			Thread.sleep(2000);
            getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
			newBtn.click();
			
			checkUserFriendlyMessage();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerAccountTxt));
			customerAccountTxt.click();
			customerAccountTxt.sendKeys(Keys.END);
			customerAccountTxt.sendKeys(Keys.SHIFT,Keys.HOME);
			customerAccountTxt.sendKeys(Keys.SPACE);
			
			int customerAccountCount=customerAccountComboList.size();
			
			System.out.println("Customer Account List Size: "+customerAccountCount);
			
			for (int i = 0; i < customerAccountCount; i++) 
			{
				String customerAccount=customerAccountComboList.get(i).getText();
				
				if (customerAccount.equalsIgnoreCase("Customer A"))
				{
					System.out.println("Entered If Loop");
					
					customerAccountComboList.get(i).click();
					
					customerAccountTxt.sendKeys(Keys.TAB);
					
					break;
				}
			}
			customerAccountTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherHeaderCurrency));
			voucherHeaderCurrency.click();
			voucherHeaderCurrency.sendKeys(Keys.END);
			voucherHeaderCurrency.sendKeys(Keys.SHIFT,Keys.HOME);
			voucherHeaderCurrency.sendKeys(Keys.SPACE);
			
			int currencyCount=currencyComboList.size();
			
			for (int i = 0; i < currencyCount; i++) 
			{
				String currency=currencyComboList.get(i).getText();
				
				System.out.println(i+"  "+currency);
				
				if (currency.equalsIgnoreCase("INR"))
				{
					System.out.println("Entered If Loop");
					
					currencyComboList.get(i).click();
					
					voucherHeaderCurrency.sendKeys(Keys.TAB);
					
					break;
				}
			}
			voucherHeaderCurrency.sendKeys(Keys.TAB);
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
			departmentTxt.click();
			departmentTxt.sendKeys(Keys.END);
			departmentTxt.sendKeys(Keys.SHIFT,Keys.HOME);
			departmentTxt.sendKeys(Keys.SPACE);
			
			int departmentCount=departmentComboList.size();
			
			for (int i = 0; i < departmentCount; i++) 
			{
				String department=departmentComboList.get(i).getText();
				
				System.out.println(i+"  "+department);
				
				if (department.equalsIgnoreCase("INDIA"))
				{
					System.out.println("Entered If Loop");
					
					departmentComboList.get(i).click();
					
					departmentTxt.sendKeys(Keys.TAB);
					
					break;
				}
			}
			departmentTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesInvoiceVATPlaceOFSupply));
			salesInvoiceVATPlaceOFSupply.click();
			salesInvoiceVATPlaceOFSupply.sendKeys(Keys.END);
			salesInvoiceVATPlaceOFSupply.sendKeys(Keys.SHIFT,Keys.HOME);
			salesInvoiceVATPlaceOFSupply.sendKeys(Keys.SPACE);
			
			
			int placeOFSupplyListCount=placeOFSupplyList.size();
			
			System.err.println("placeOFSupplyListCount   : "+placeOFSupplyListCount);
				
			for(int i=0 ; i < placeOFSupplyListCount ;i++)
			{
				String data=placeOFSupplyList.get(i).getText();
				
				if(data.equalsIgnoreCase("Abu Dhabi"))
				{
					placeOFSupplyList.get(i).click();
					
					break;
				}
			}
				
			
			salesInvoiceVATPlaceOFSupply.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesInvoiceVATJuridictionxt));
			salesInvoiceVATJuridictionxt.click();
			salesInvoiceVATJuridictionxt.sendKeys(Keys.END);
			salesInvoiceVATJuridictionxt.sendKeys(Keys.SHIFT,Keys.HOME);
			salesInvoiceVATJuridictionxt.sendKeys(Keys.SPACE);
			
			
			int JuridictionListCount=JuridictionList.size();
			
			System.err.println("JuridictionList   : "+JuridictionListCount);
				
			for(int i=0 ; i < JuridictionListCount ;i++)
			{
				String data=JuridictionList.get(i).getText();
				
				if(data.equalsIgnoreCase("Abu Dhabi"))
				{
					JuridictionList.get(i).click();
					
					break;
				}
			}
				
			
			salesInvoiceVATJuridictionxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
			select1stRow_1stColumn.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pvWarehouseTxt));
			pvWarehouseTxt.sendKeys(Keys.END);
			pvWarehouseTxt.sendKeys(Keys.SHIFT,Keys.HOME);
			pvWarehouseTxt.sendKeys(Keys.SPACE);
			
			int warehouselist=warehouseBodyComboList.size();
			
			
			ArrayList<String> actWarehouseOpt = new ArrayList<String>();
			
			System.out.println("******* Warehouse List: "+warehouselist);
			
			for (int i = 0; i < warehouselist; i++) 
			{
				String warehouse=warehouseBodyComboList.get(i).getText();
				
				
				
				if (warehouse.equalsIgnoreCase("SECUNDERABAD"))
				{
					System.out.println("Entered If Loop");
					
					warehouseBodyComboList.get(i).click();
					
					pvWarehouseTxt.sendKeys(Keys.TAB);
					
					break;
				}
			}
			

            getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
            enter_ItemTxt.sendKeys(Keys.END);
            enter_ItemTxt.sendKeys(Keys.SHIFT,Keys.HOME);
			enter_ItemTxt.sendKeys(Keys.SPACE);
			
			int itemsCount=itemComboList.size();
			
			for (int i = 0; i < itemsCount; i++) 
			{
				String item=itemComboList.get(i).getText();
				
				if (item.equalsIgnoreCase("FIFO COGS ITEM")) 
				{
					System.out.println("Entered If Loop");
					
					itemComboList.get(i).click();
					
					enter_ItemTxt.sendKeys(Keys.TAB);
					
					break;
				}
			}
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_4thColumn));
			select1stRow_4thColumn.click();
			
			
			enter_AccountTxt.sendKeys(Keys.SPACE);
			enter_AccountTxt.sendKeys("Sales - Computers");
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_5thColumn));
			select1stRow_5thColumn.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_8thColumn));
			select1stRow_8thColumn.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_AQTxt));
			enter_AQTxt.clear();
			enter_AQTxt.sendKeys(Keys.END);
			enter_AQTxt.sendKeys(Keys.SHIFT,Keys.HOME);
			enter_AQTxt.sendKeys("90");
			enter_AQTxt.sendKeys(Keys.TAB);
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_FQTxt));
			enter_FQTxt.clear();
			enter_FQTxt.sendKeys(Keys.TAB);
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_14thColumn));
			select1stRow_14thColumn.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
			enter_Rate.sendKeys("10");
			enter_Rate.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
			enter_Gross.sendKeys(Keys.TAB);
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_20thColumn));
			select1stRow_20thColumn.click();
			
			
			Thread.sleep(2000);
			/*getAction().doubleClick(binSearchBtn).build().perform();*/
			
			binSearchBtn.click();
			
			Thread.sleep(3000);
            
            getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binAutoAllocateBtn));
           
            binAutoAllocateBtn.click();
			
			String actbinoutwardRowTotalToBePicked	=binoutwardRowTotalToBePicked.getText();
			
			int binInwardGridListCount = binInwardGridList.size();
			
			ArrayList<String> binInwardGridListArray = new ArrayList<String>();
			
			for(int i=0;i<binInwardGridListCount;i++)
			{
				String data = binInwardGridList.get(i).getText();
				binInwardGridListArray.add(data);
			}
			
			
			String actbinInwardGridList=binInwardGridListArray.toString();
			
			String expbinInwardGridList="[, Bin Update, , 90.00, 90.00, 90.00, 90.00, 0.00, 0.00, , , , 90.00, , , , ]";
			
			System.out.println("ActbinInwardGridList : " + actbinInwardGridList);
			System.out.println("ExpbinInwardGridList : " + expbinInwardGridList);

           
			Thread.sleep(2000);

            getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binOkBtn));
			binOkBtn.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_20thColumn));
			
			String actBin=select1stRow_20thColumn.getText();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
			String docno=documentNumberTxt.getAttribute("value");
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
			saveBtn.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pickBtn));
			pickBtn.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newReferenceTxt));
			String actNewReference=newReferenceTxt.getAttribute("value");

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(Bill_OkBtn));
			Bill_OkBtn.click();
			
			Thread.sleep(2000);

			
			boolean savingMessage=checkVoucherSavingMessage(docno);
		    
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
			String actNewDocNo=documentNumberTxt.getAttribute("value");
			
			String expBin          ="Bin Update";
			String expNewReference ="900.00";
			String expNewDocNo     ="2";
			
			System.out.println("********** Bin Column     : "+actBin           +"  value expected  "+expBin);
			System.out.println("********** New Reference  : "+actNewReference  +"  value expected  "+expNewReference);
			System.out.println("********** New Voucher No : "+actNewDocNo      +"  value expected  "+expNewDocNo);
						
			if(actBin.equalsIgnoreCase(expBin) && actNewReference.equalsIgnoreCase(expNewReference) && actNewDocNo.equalsIgnoreCase(expNewDocNo) && savingMessage==true) 
			{
				System.out.println("***Test Pass: Sales Invoice N Voucher Saved Successfully***");
				return true;
			}
			else
			{
				System.out.println("***Test Fail: Sales Invoice N Voucher NOT Saved Successfully***");
				return false;
			}
		}
	
	

	public boolean checkSavingVoucherInOpeningStocksWithOptionCloset() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		System.out.println("****************checkSavingVoucherInOpeningStocksWithOptionCloset Method Executed ***********************");
		
			
		 Thread.sleep(2000);
		    
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
		inventoryMenu.click();
	    
		Thread.sleep(2000);
		
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(invTransactionsMenu));
	    invTransactionsMenu.click();
	    
	    Thread.sleep(2000);
	    
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(invTransStocksMenu));
	    invTransStocksMenu.click();
	    
	    Thread.sleep(2000);
		
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(openingStocksNewVoucher));
	    openingStocksNewVoucher.click();
	    
	    
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();
		
		checkUserFriendlyMessage();
		
        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(warehouseTxt));
		warehouseTxt.click();
		warehouseTxt.sendKeys(Keys.SPACE);
	    
		ArrayList<String> actWarehouseOpt = new ArrayList<String>(); 
		
		int warehouselist=warehouseHeaderComboList.size();
		
		String actWarehouseList= actWarehouseOpt.toString();
            
        for (int i = 0; i < warehouselist; i++) 
		{
					String warehouse=warehouseHeaderComboList.get(i).getText();
					
					
					
		     if (warehouse.equalsIgnoreCase("SECUNDERABAD")) 
		     {
					System.out.println("Entered If Loop");
					
					warehouseHeaderComboList.get(i).click();
					
					warehouseTxt.sendKeys(Keys.TAB);
					
					break;
				}
		}

            getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
			select1stRow_1stColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
			enter_ItemTxt.sendKeys(Keys.SPACE);
			
			int itemsCount=itemComboList.size();
			
			for (int i = 0; i < itemsCount; i++) 
			{
				String item=itemComboList.get(i).getText();
				
				System.out.println(i+"  "+item);
				
				if (item.equalsIgnoreCase("FIFO COGS ITEM")) 
				{
					System.out.println("Entered If Loop");
					
					itemComboList.get(i).click();
					
					enter_ItemTxt.sendKeys(Keys.TAB);
					
					break;
				}
			}
			
            getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_UnitTxt));
			enter_UnitTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
			enter_Quantity.sendKeys(Keys.END,Keys.SHIFT,Keys.HOME);
			enter_Quantity.sendKeys("7.5");
			enter_Quantity.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
			enter_Rate.sendKeys(Keys.END,Keys.SHIFT,Keys.HOME);
			enter_Rate.sendKeys("15.00");
			enter_Rate.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
			enter_Gross.sendKeys(Keys.TAB);

			
			Thread.sleep(2000);
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binSearchBtn));
            binSearchBtn.click();
			
            Thread.sleep(2000);
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binAutoAllocateBtn));
    		binAutoAllocateBtn.click();
            
            
			int binInwardGridListCount = binInwardGridList.size();
			
			ArrayList<String> binInwardGridListArray = new ArrayList<String>();
			
			for(int i=0;i<binInwardGridListCount;i++)
			{
				String data = binInwardGridList.get(i).getText();
				binInwardGridListArray.add(data);
			}
			
			
			String actbinInwardGridList=binInwardGridListArray.toString();
			
			String expbinInwardGridList="[, BG2, , 0.00, , 0.00, 0.00, 0.00, 0.00, , , , 0.00, , , , , , Bin Update, , 0.00, , 90.00, 0.00, 90.00, 90.00, , , , 90.00, , , , , , Bin1, , 0.00, , 90.00, 0.00, 90.00, 90.00, , , , 0.00, , , , , , Bin2, , 0.00, , 90.00, 0.00, 90.00, 90.00, , , , 0.00, , , , ]";
			
			System.out.println("ActbinInwardGridList : " + actbinInwardGridList);
			System.out.println("ExpbinInwardGridList : " + expbinInwardGridList);
		
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binOkBtn));
			binOkBtn.click();
			
			Thread.sleep(2000);
			
							
			String actselect1stRow_7thColumn=select1stRow_7thColumn.getText();
			String expselect1stRow_7thColumn="Bin Update";

			System.out.println("ACtselect1stRow_7thColumn   : "+actselect1stRow_7thColumn +" Value Expected  : "+expselect1stRow_7thColumn);
			
			
			String docno=documentNumberTxt.getAttribute("value");
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
			saveBtn.click();
			

			boolean savingMessage=checkVoucherSavingMessage(docno);
			
			String actMessage=Boolean.toString(savingMessage);
			String expMessage="true";
			
			
			if (actMessage.equalsIgnoreCase(expMessage) && actbinInwardGridList.equalsIgnoreCase(expbinInwardGridList) && 
					actselect1stRow_7thColumn.equalsIgnoreCase(expselect1stRow_7thColumn) ) 
			{
				System.out.println("Test Pass: Voucher Saved Successfully");
				return true;
				
			}
			else
			{

				System.out.println("Test Fail: Voucher Saved Successfully");
				return false;
			}
	}


	
	
	
	//REports For Closest
	
	public boolean checkItemQueryOfFIFOItemWithClosetOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		
		System.out.println("****************checkItemQueryOfFIFOItemWithClosetOption Method*******************************");
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
		inventoryMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryReportsMenu));
		inventoryReportsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemQuery));
		itemQuery.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(iq_ItemTxt));
		iq_ItemTxt.click();
		iq_ItemTxt.sendKeys("FIFO COGS ITEM");
		Thread.sleep(2000);
		iq_ItemTxt.sendKeys(Keys.TAB);
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(iq_getStockBtn));
		iq_getStockBtn.click();
		
		Thread.sleep(5000);
		
		String actiq_OpeningStocks				=iq_OpeningStocks.getText();
		String actiq_PendingPurchaseOrders		=iq_PendingPurchaseOrders.getText();
		String actiq_CurrentStock				=iq_CurrentStock.getText();
		String actiq_PendingSalesOrders			=iq_PendingSalesOrders.getText();
		String actiq_AvgStockRate				=iq_AvgStockRate.getText();
		String actiq_QtyToBeOrdered				=iq_QtyToBeOrdered.getText();
		String actiq_Value						=iq_Value.getText();
		String actiq_BaseUnit     				=iq_BaseUnit.getText();
		
		String expiq_OpeningStocks				="180.00";
		String expiq_PendingPurchaseOrders		="0.00";
		String expiq_CurrentStock				="90.00";
		String expiq_PendingSalesOrders			="0.00";
		String expiq_AvgStockRate				="1.25";
		String expiq_QtyToBeOrdered				="0.00";
		String expiq_Value						="112.50";
		String expiq_BaseUnit     				="Pcs";
		
		// Recent Stock Transaction -Purchases
		
		
		
		// Recent Stock Transaction -Sales
		
		String actsalVoucherNoR1	=sal1strow_2ndColumn.getText();
		String actsalCustomerR1		=sal1strow_3rdColumn.getText();
		String actsalQtyR1			=sal1strow_4thColumn.getText();
		String actsalUnitR1			=sal1strow_5thColumn.getText();
		String actsalRateR1			=sal1strow_6thColumn.getText();
		String actsalCurrencyR1		=sal1strow_7thColumn.getText();
		String actsalQtyInBaseR1	=sal1strow_8thColumn.getText();
		
		String actsalVoucherNoR2	=sal2ndrow_2ndColumn.getText();
		

		// Expected
		String expsalVoucherNoR1	="NDT55:1";
		String expsalCustomerR1		="Customer A";
		String expsalQtyR1			="90.00";
		String expsalUnitR1			="Pcs";
		String expsalRateR1			="10.00";
		String expsalCurrencyR1		="Indian Rupees";
		String expsalQtyInBaseR1	="90.0000000000";
		
		
		
		String expsalVoucherNoR2	="90.00";
		
					
		
		
		System.out.println("iq_OpeningStocks     		 :   "+actiq_OpeningStocks					+" Value Expected : "+expiq_OpeningStocks);
		System.out.println("iq_PendingPurchaseOrders     :   "+actiq_PendingPurchaseOrders			+" Value Expected : "+expiq_PendingPurchaseOrders);
		System.out.println("iq_CurrentStock     		 :   "+actiq_CurrentStock					+" Value Expected : "+expiq_CurrentStock);
		System.out.println("iq_PendingSalesOrders     	 :   "+actiq_PendingSalesOrders				+" Value Expected : "+expiq_PendingSalesOrders);
		System.out.println("iq_AvgStockRate     		 :   "+actiq_AvgStockRate					+" Value Expected : "+expiq_AvgStockRate);
		System.out.println("iq_QtyToBeOrdered     		 :   "+actiq_QtyToBeOrdered					+" Value Expected : "+expiq_QtyToBeOrdered);
		System.out.println("iq_Value     				 :   "+actiq_Value							+" Value Expected : "+expiq_Value);
		System.out.println("iq_BaseUnit     			 :   "+actiq_BaseUnit						+" Value Expected : "+expiq_BaseUnit);
		
		System.out.println("********************* Purchase ******************");
		
		
		System.out.println("********************* Sales ******************");
		
		System.out.println("salVoucherNoR1     			 :   "+actsalVoucherNoR1					+" Value Expected : "+expsalVoucherNoR1);
		System.out.println("salCustomerR1     			 :   "+actsalCustomerR1						+" Value Expected : "+expsalCustomerR1);
		System.out.println("salQtyR1     				 :   "+actsalQtyR1							+" Value Expected : "+expsalQtyR1);
		System.out.println("salUnitR1     				 :   "+actsalUnitR1							+" Value Expected : "+expsalUnitR1);
		System.out.println("salRateR1     				 :   "+actsalRateR1							+" Value Expected : "+expsalRateR1);
		System.out.println("salCurrencyR1     			 :   "+actsalCurrencyR1						+" Value Expected : "+expsalCurrencyR1);
		System.out.println("salQtyInBaseR1     			 :   "+actsalQtyInBaseR1					+" Value Expected : "+expsalQtyInBaseR1);
		
		System.out.println("salVoucherNoR2     			 :   "+actsalVoucherNoR2					+" Value Expected : "+expsalVoucherNoR2);
		
		
		if(actiq_OpeningStocks.equalsIgnoreCase(expiq_OpeningStocks) && actiq_PendingPurchaseOrders.equalsIgnoreCase(expiq_PendingPurchaseOrders)
				&& actiq_CurrentStock.equalsIgnoreCase(expiq_CurrentStock) && actiq_PendingSalesOrders.equalsIgnoreCase(expiq_PendingSalesOrders)
				&& actiq_AvgStockRate.equalsIgnoreCase(expiq_AvgStockRate) && actiq_QtyToBeOrdered.equalsIgnoreCase(expiq_QtyToBeOrdered)
				&& actiq_Value.equalsIgnoreCase(expiq_Value) && actiq_BaseUnit.equalsIgnoreCase(expiq_BaseUnit)
				
				
				&& actsalVoucherNoR1.equalsIgnoreCase(expsalVoucherNoR1) && actsalCustomerR1.equalsIgnoreCase(expsalCustomerR1) && actsalQtyR1.equalsIgnoreCase(expsalQtyR1)
				&& actsalUnitR1.equalsIgnoreCase(expsalUnitR1) && actsalRateR1.equalsIgnoreCase(expsalRateR1) && actsalCurrencyR1.equalsIgnoreCase(expsalCurrencyR1)
				&& actsalQtyInBaseR1.equalsIgnoreCase(expsalQtyInBaseR1)
				
				&& actsalVoucherNoR2.equalsIgnoreCase(expsalVoucherNoR2) )
		{
			System.out.println("Test Pass : Data Displayed As esxpected");
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(iq_closeBtn));
			iq_closeBtn.click();
			//excelReader.setCellData(xlfile, xlsheet, 14, 9, resPass);
			
			return true;
		}
		else
		{
			System.out.println("Test Fail : Data NOT Displayed As esxpected");
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(iq_closeBtn));
			iq_closeBtn.click();
			//excelReader.setCellData(xlfile, xlsheet, 14, 9, resFail);
			return false;
		}
		
		
	}
	

	public boolean checkStockLedgerReportByClosetOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		
		System.out.println("************************************checkStockLedgerReportByClosetOption********************************************");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
		inventoryMenu.click();
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryReportsMenu));
		inventoryReportsMenu.click();
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(stockLedger));
		stockLedger.click();
		
		Thread.sleep(3000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByValue("1");
		
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_HeaderSelectChkBox));
		sl_HeaderSelectChkBox.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_OptionsBtn));
		report_OptionsBtn.click();
		
		
		Thread.sleep(5000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_1stRow2ndCol));

		String actItemNameR1				= sl_1stRow2ndCol.getText();
		
		String expItemNameR1				= "FIFO COGS ITEM FIFO COGS ITEM";
		
		System.out.println("ItemNameR1   			: "+actItemNameR1					+" Value Expected : "+expItemNameR1);
		
		
		
		
        int report2ndColListCount = report2ndRowList.size();
		
		ArrayList<String> report2ndColListArray = new ArrayList<String>();
		
		for(int i=0;i<report2ndColListCount;i++)
		{
			String data = report2ndRowList.get(i).getText();
			report2ndColListArray.add(data);
			
		}
		
		String actreport2ndColList = report2ndColListArray.toString();
		String expreport2ndColList = "[2, , Opening Balance, 180.00, , , , 180.00, , , 225.00, 1.25, , , ]";
		

		
		
		System.out.println("actreport2ndColList   : "+actreport2ndColList);
		System.out.println("expreport2ndColList   : "+expreport2ndColList);
		
		
        int report3rdColListCount = report3rdRowList.size();
		
		ArrayList<String> report3rdColListArray = new ArrayList<String>();
		
		for(int i=0;i<report3rdColListCount;i++)
		{
			String data = report3rdRowList.get(i).getText();
			if(i==1)
			{
				data="Date Field";
			}
			report3rdColListArray.add(data);
			
		}
		
		String actreport3rdColList = report3rdColListArray.toString();
		String expreport3rdColList = "[3, Date Field, NDT55:1, , , 90.00, 1.25, 90.00, , 112.50, 112.50, 1.25, , , ]";
		

		
		
		System.out.println("actreport3rdColList   : "+actreport3rdColList);
		System.out.println("expreport3rdColList   : "+expreport3rdColList);
		
		
        int report4thColListCount = report4thRowList.size();
		
		ArrayList<String> report4thColListArray = new ArrayList<String>();
		
		for(int i=0;i<report4thColListCount;i++)
		{
			String data = report4thRowList.get(i).getText();
			report4thColListArray.add(data);
			
		}
		
		String actreport4thColList = report4thColListArray.toString();
		String expreport4thColList = "[4, Sub Total, , 180.00, , 90.00, 1.25, 90.00, , 112.50, 112.50, 2.50, , , ]";
		
		
		System.out.println("actreport4thColList   : "+actreport4thColList);
		System.out.println("expreport4thColList   : "+expreport4thColList);
		
					
		
       if(actItemNameR1.equalsIgnoreCase(expItemNameR1) && actreport3rdColList.equalsIgnoreCase(expreport3rdColList) && 
        		   actreport3rdColList.equalsIgnoreCase(expreport3rdColList) && actreport4thColList.equalsIgnoreCase(expreport4thColList) )
		{
			System.out.println("Test Pass : Output Options Are as Expected ");
			//excelReader.setCellData(xlfile, xlsheet, 149, 9, resPass);
			return true;
		}
		else
		{
			System.out.println("Test Fail : output Options Are NOT as Expected ");
			//excelReader.setCellData(xlfile, xlsheet, 149, 9, resFail);
			
			return false;
		}
	}

	

	public boolean checkOpeningStockRegisterReportWithClosetOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
	inventoryMenu.click();
	
	Thread.sleep(3000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryReportsMenu));
	inventoryReportsMenu.click();
	
	Thread.sleep(3000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(openingStocksRegister));
	openingStocksRegister.click();
	
	Thread.sleep(2000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
	Select s=new Select(sl_DateOptionDropdown);
	s.selectByValue("1");
	
	String actsl_DateOptionDropdown    =s.getFirstSelectedOption().getText();
	String expsl_DateOptionDropdown    ="As on date";
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
	sl_OkBtn.click();
	
	Thread.sleep(3000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_1stRow2ndCol));

	Thread.sleep(2000);
	
	
    int report1stRowListCount = report1stRowList.size();
	
	ArrayList<String> report1stRowListArray = new ArrayList<String>();
	
	for(int i=0;i<report1stRowListCount;i++)
	{
		String data = report1stRowList.get(i).getText();
		
		if(i==1)
		{
			data="Date Field";
		}
		
		report1stRowListArray.add(data);
		
	}
	
	String actreport1stRowList = report1stRowListArray.toString();
	String expreport1stRowList = "[1, Date Field, FIFO COGS ITEM, 90.00, 15.00, 112.50]";
	
	System.out.println("actreport1stRowList   : "+actreport1stRowList);
	System.out.println("expreport1stRowList   : "+expreport1stRowList);
	
	
	int report2ndRowListCount = report2ndRowList.size();
		
	ArrayList<String> report2ndRowListArray = new ArrayList<String>();
	
	for(int i=0;i<report2ndRowListCount;i++)
	{
		String data = report2ndRowList.get(i).getText();
		
		if (i==1)
		{
			data="Date Field";
			
		}
		
		report2ndRowListArray.add(data);
	}
	
	String actreport2ndRowList = report2ndRowListArray.toString();
	String expreport2ndRowList = "[2, Date Field, FIFO COGS ITEM, 90.00, 15.00, 112.50]";
	
	System.out.println("actreport2ndRowList   : "+actreport2ndRowList);
	System.out.println("expreport2ndRowList   : "+expreport2ndRowList);
	
	
	int report3rdRowListCount = report3rdRowList.size();
	
	ArrayList<String> report3rdRowListArray = new ArrayList<String>();
	
	for(int i=0;i<report3rdRowListCount;i++)
	{
		String data = report3rdRowList.get(i).getText();
		report3rdRowListArray.add(data);
		
	}
	
	String actreport3rdRowList = report3rdRowListArray.toString();
	String expreport3rdRowList = "[3, Grand Total, , 180.00, 30.00, 225.00]";
	
	System.out.println("actreport3rdRowList   : "+actreport3rdRowList);
	System.out.println("expreport3rdRowList   : "+expreport3rdRowList);
	
	
	if(actreport1stRowList.equalsIgnoreCase(expreport1stRowList) && actreport2ndRowList.equalsIgnoreCase(expreport2ndRowList)  && 
			actreport3rdRowList.equalsIgnoreCase(expreport3rdRowList))
	{
		System.out.println("Test Pass : Report is As Expected");
		
		
		return true;
	}
	else
	{
		System.out.println("Test Fail : Report is NOT As Expected");
		
		return false;
	}
}

	


public boolean checkStockDetailsByBinsReportsWithClosetOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
{
	
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
	Thread.sleep(2000);
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
	inventoryMenu.click();
	
	Thread.sleep(2000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryReportsMenu));
	inventoryReportsMenu.click();
	
	getAction().sendKeys(Keys.END).build().perform();
	
	Thread.sleep(2000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binsReportMenu));
	binsReportMenu.click();
	
	Thread.sleep(2000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(stockDetailsByBins));
	stockDetailsByBins.click();
	
	int rowcount=stockLedgerHometableRowCount.size();
	System.out.println(rowcount);
	
	for (int i = 0; i < rowcount; i++) 
	{
		String actname=reportNameList.get(i).getText();
		
		System.out.println(actname);
		
		if (actname.equalsIgnoreCase("FIFO COGS ITEM")) 
		{
			reportsChkboxList.get(i).click();
			
			break;
		}
	}
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
	sl_OkBtn.click();
	
	Thread.sleep(3000);
	
	
	 int report1stRowListCount = report1stRowList.size();
		
		ArrayList<String> report1stRowListArray = new ArrayList<String>();
		
		for(int i=0;i<=1;i++)
		{
			String data = report1stRowList.get(i).getText();
			
			report1stRowListArray.add(data);
			
		}
		
		String actreport1stRowList = report1stRowListArray.toString();
		String expreport1stRowList = "[1, FIFO COGS ITEM FIFO COGS ITEM]";
		
		System.out.println("actreport1stRowList   : "+actreport1stRowList);
		System.out.println("expreport1stRowList   : "+expreport1stRowList);
		
		
		int report2ndRowListCount = report2ndRowList.size();
			
		ArrayList<String> report2ndRowListArray = new ArrayList<String>();
		
		for(int i=0;i<report2ndRowListCount;i++)
		{
			String data = report2ndRowList.get(i).getText();
			
			report2ndRowListArray.add(data);
			
		}
		
		String actreport2ndRowList = report2ndRowListArray.toString();
		String expreport2ndRowList = "[2, Bin Update, 0, 0, 90.00, , 90.00]";
		
		System.out.println("actreport2ndRowList   : "+actreport2ndRowList);
		System.out.println("expreport2ndRowList   : "+expreport2ndRowList);
		
		
		int report3rdRowListCount = report3rdRowList.size();
		
		ArrayList<String> report3rdRowListArray = new ArrayList<String>();
		
		for(int i=0;i<report3rdRowListCount;i++)
		{
			String data = report3rdRowList.get(i).getText();
			
			report3rdRowListArray.add(data);
			
		}
		
		String actreport3rdRowList = report3rdRowListArray.toString();
		String expreport3rdRowList = "[3, Total, , , 90.00, , 90.00]";
		
		System.out.println("actreport3rdRowList   : "+actreport3rdRowList);
		System.out.println("expreport3rdRowList   : "+expreport3rdRowList);
		
	
	if(actreport1stRowList.equalsIgnoreCase(expreport1stRowList) && actreport2ndRowList.equalsIgnoreCase(expreport2ndRowList) && 
			actreport3rdRowList.equalsIgnoreCase(expreport3rdRowList))
	{
		System.out.println("Test Pass : Reports Are As Expected");
		
		return true;
	}
	else
	{
		System.out.println("Test Fail : Reports Are NOT As Expected");
		
		return false;
	}
	
}		



// Stock Balance By Bins


public boolean checkStockBalanaceByBinsReportsWithCLosetOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
{
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
	inventoryMenu.click();
	
	Thread.sleep(2000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryReportsMenu));
	inventoryReportsMenu.click();
	
	Thread.sleep(2000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binsReportMenu));
	binsReportMenu.click();
	
	getAction().sendKeys(Keys.END).build().perform();
	
	Thread.sleep(2000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(stockBalancesByBins));
	stockBalancesByBins.click();
	
	Thread.sleep(2000);
	
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
	Select s=new Select(sl_DateOptionDropdown);
	s.selectByValue("1");
	
	String actsl_DateOptionDropdown    =s.getFirstSelectedOption().getText();
	String expsl_DateOptionDropdown    ="As on date";
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_SelectAllItemsChkBox));
	sl_SelectAllItemsChkBox.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
	sl_OkBtn.click();
	
	Thread.sleep(3000);
	
	
	 int report1stRowListCount = report1stRowList.size();
		
		ArrayList<String> report1stRowListArray = new ArrayList<String>();
		
		for(int i=0;i<=1;i++)
		{
			String data = report1stRowList.get(i).getText();
			
			report1stRowListArray.add(data);
			
		}
		
		String actreport1stRowList = report1stRowListArray.toString();
		String expreport1stRowList = "[1, Bin Update Bin Update]";
		
		System.out.println("actreport1stRowList   : "+actreport1stRowList);
		System.out.println("expreport1stRowList   : "+expreport1stRowList);
		
		
		int report2ndRowListCount = report2ndRowList.size();
			
		ArrayList<String> report2ndRowListArray = new ArrayList<String>();
		
		for(int i=0;i<report2ndRowListCount;i++)
		{
			String data = report2ndRowList.get(i).getText();
			
			report2ndRowListArray.add(data);
			
		}
		
		String actreport2ndRowList = report2ndRowListArray.toString();
		String expreport2ndRowList = "[2, FIFO COGS ITEM, 0, 0, 90.00, , 90.00]";
		
		System.out.println("actreport2ndRowList   : "+actreport2ndRowList);
		System.out.println("expreport2ndRowList   : "+expreport2ndRowList);
		
		
		int report3rdRowListCount = report3rdRowList.size();
		
		ArrayList<String> report3rdRowListArray = new ArrayList<String>();
		
		for(int i=0;i<report3rdRowListCount;i++)
		{
			String data = report3rdRowList.get(i).getText();
			
			report3rdRowListArray.add(data);
			
		}
		
		String actreport3rdRowList = report3rdRowListArray.toString();
		String expreport3rdRowList = "[3, Grand Total, , , 90.00, , 90.00]";
		
		System.out.println("actreport3rdRowList   : "+actreport3rdRowList);
		System.out.println("expreport3rdRowList   : "+expreport3rdRowList);
		
	
	if(actreport1stRowList.equalsIgnoreCase(expreport1stRowList) && actreport2ndRowList.equalsIgnoreCase(expreport2ndRowList) && 
			actreport3rdRowList.equalsIgnoreCase(expreport3rdRowList))
	{
		System.out.println("Test Pass : Reports Are As Expected");
		
		return true;
	}
	else
	{
		System.out.println("Test Fail : Reports Are NOT As Expected");
		return false;
	}
	
}		



//Stock Balance By Item By Bins


public boolean checkStockBalancesByItemByBinsReportsWithCLosetOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
{
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
	inventoryMenu.click();
	
	Thread.sleep(2000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryReportsMenu));
	inventoryReportsMenu.click();
	
	Thread.sleep(2000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binsReportMenu));
	binsReportMenu.click();
	
	getAction().sendKeys(Keys.END).build().perform();
	
	Thread.sleep(2000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(stockBalancesByItemByBins));
	stockBalancesByItemByBins.click();
	
	Thread.sleep(3000);

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
	Select s=new Select(sl_DateOptionDropdown);
	s.selectByValue("1");
	
	String actsl_DateOptionDropdown    =s.getFirstSelectedOption().getText();
	String expsl_DateOptionDropdown    ="As on date";
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_SelectAllItemsChkBox));
	sl_SelectAllItemsChkBox.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
	sl_OkBtn.click();
	
	Thread.sleep(3000);
	
	
	 int report1stRowListCount = report1stRowList.size();
		
		ArrayList<String> report1stRowListArray = new ArrayList<String>();
		
		for(int i=0;i<report1stRowListCount;i++)
		{
			String data = report1stRowList.get(i).getText();
			
			report1stRowListArray.add(data);
			
		}
		
		String actreport1stRowList = report1stRowListArray.toString();
		String expreport1stRowList = "[1, FIFO COGS ITEM FIFO COGS ITEM]";
		
		System.out.println("actreport1stRowList   : "+actreport1stRowList);
		System.out.println("expreport1stRowList   : "+expreport1stRowList);
		
		
		int report2ndRowListCount = report2ndRowList.size();
			
		ArrayList<String> report2ndRowListArray = new ArrayList<String>();
		
		for(int i=0;i<report2ndRowListCount;i++)
		{
			String data = report2ndRowList.get(i).getText();
			
			report2ndRowListArray.add(data);
			
		}
		
		String actreport2ndRowList = report2ndRowListArray.toString();
		String expreport2ndRowList = "[2, Bin Update, 0, 0, 90.00, , , 90.00]";
		
		System.out.println("actreport2ndRowList   : "+actreport2ndRowList);
		System.out.println("expreport2ndRowList   : "+expreport2ndRowList);
		
		
		int report3rdRowListCount = report3rdRowList.size();
		
		ArrayList<String> report3rdRowListArray = new ArrayList<String>();
		
		for(int i=0;i<report3rdRowListCount;i++)
		{
			String data = report3rdRowList.get(i).getText();
			
			report3rdRowListArray.add(data);
			
		}
		
		String actreport3rdRowList = report3rdRowListArray.toString();
		String expreport3rdRowList = "[3, Grand Total, , , 90.00, , , 90.00]";
		
		System.out.println("actreport3rdRowList   : "+actreport3rdRowList);
		System.out.println("expreport3rdRowList   : "+expreport3rdRowList);
		
	
	if(actreport1stRowList.equalsIgnoreCase(expreport1stRowList) && actreport2ndRowList.equalsIgnoreCase(expreport2ndRowList) && 
			actreport3rdRowList.equalsIgnoreCase(expreport3rdRowList))
	{
		System.out.println("Test Pass : Reports Are As Expected");
		
		return true;
	}
	else
	{
		System.out.println("Test Fail : Reports Are NOT As Expected");
		
		return false;
	}
	
}		

	
	
	
	public boolean CheckEnabletheOptionAllocateIntoPartiallyWithFarthest() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		System.out.println("*******CheckEnabletheOptionAllocateIntoPartiallyWithFarthest Method Excuted ******************");
		
		Thread.sleep(3000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(SettingsmenuBtn));
		SettingsmenuBtn.click();
		
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ConfigureTransactionBtn));
		ConfigureTransactionBtn.click();
		
		
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(BinsBtn));
		BinsBtn.click();
		
		
		
		if (AllocateIntoPartiallyChkBox.isSelected()==false)
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(AllocateIntoPartiallyChkBox));
			AllocateIntoPartiallyChkBox.click();
			
		}
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(PlaceTheItemfirstDropdown));
		PlaceTheItemfirstDropdown.click();
		
		int PlaceTheItemfirstDrpDwnListCount=PlaceTheItemfirstDrpDwnList.size();
		for (int i = 0; i < PlaceTheItemfirstDrpDwnListCount; i++) 
		{
			String data=PlaceTheItemfirstDrpDwnList.get(i).getText();
			if (data.equalsIgnoreCase(" Farthest "))
			{
				PlaceTheItemfirstDrpDwnList.get(i).click();
			}
		}
		
		
		
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(UpdateBtn));
		UpdateBtn.click();
		
		getWaitForAlert();
		
		String actAlertMgs  =getAlert().getText();
		String expAlertMgs  ="Do you want to save the changes?";
		
		
		System.out.println("******************CheckEnabletheOptionItemsArePlacedInBinsBasedOnTheirCategory*************************");
		
		System.out.println("AlertMessage     : "+actAlertMgs    +" Value Expected : "+expAlertMgs);	
		
		getAlert().accept();
		
		
		 String expMessage="Data saved Successfully";
			
		 String actMessage=checkValidationMessage(expMessage);
		
		
		 Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplay));
			userNameDisplay.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
			logoutOption.click();
		 
		 
		
		if(actAlertMgs.equalsIgnoreCase(expAlertMgs))
		{
			System.out.println("Test Pass :VerifyUpdatebutton Alert Pop_Up Displayed As Expected");
			return true;
			
		}
		else
		{
			System.out.println("Test Fail :VerifyUpdatebutton Alert Pop_Up Not Displayed As Expected");
			return false;
		}
	}
	
	@FindBy(xpath="//input[@id='iDistance']")
	private static WebElement distanceTxt ;
	
	
	public boolean CheckSavingBinsWithDistances() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		System.out.println("********CheckSavingBinsWithDistances Method Executes *******************");
		
		Thread.sleep(4000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(SettingsmenuBtn));
		homeMenu.click();
		
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMasterMenu));
		homeMasterMenu.click();
		
		
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binsMenu));
		binsMenu.click();
		
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastercmbMasterTxt));
		mastercmbMasterTxt.click();
		mastercmbMasterTxt.sendKeys("bin1"); 
		
		
		 Thread.sleep(2000);
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterEditBtn));
		 masterEditBtn.click();
		 
		 
		 Thread.sleep(2000);
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
		 nameTxt.click();
		 nameTxt.sendKeys(Keys.TAB);
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(codeTxt));
	     codeTxt.sendKeys(Keys.TAB);
		 
	     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(distanceTxt));
	     distanceTxt.click();
	     distanceTxt.clear();
	     distanceTxt.sendKeys("40");
	     Thread.sleep(2000);
	     distanceTxt.sendKeys(Keys.TAB);
	     
	     
	     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
         nameTxt.click();
         
         Thread.sleep(2000);
	     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newGeneralSaveBtn));
	     newGeneralSaveBtn.click();
		 
		 String expMessage="Updated Successfully";
			
		 String actMessage=checkValidationMessage(expMessage);
		
		
		 Thread.sleep(4000);
		 
		 
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastercmbMasterTxt));
		mastercmbMasterTxt.click();
		mastercmbMasterTxt.sendKeys("bin2"); 
			
			
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterEditBtn));
		masterEditBtn.click();
			 
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
		 nameTxt.click();
		 nameTxt.sendKeys(Keys.TAB);
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(codeTxt));
	     codeTxt.sendKeys(Keys.TAB);
		 
	     
	     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(categoryTxt));
	     distanceTxt.click();
	     distanceTxt.clear();
	     distanceTxt.sendKeys("30");
	     Thread.sleep(2000);
	     distanceTxt.sendKeys(Keys.TAB);
	     
	     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
         nameTxt.click();
         
         Thread.sleep(2000);
	     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newGeneralSaveBtn));
	     newGeneralSaveBtn.click();
		 
		 String expMessage2="Updated Successfully";
			
		 String actMessage2=checkValidationMessage(expMessage2);
		 
		 
		 
			Thread.sleep(2000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastercmbMasterTxt));
			mastercmbMasterTxt.click();
			mastercmbMasterTxt.sendKeys("bin Update"); 
				
				
			Thread.sleep(2000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterEditBtn));
			masterEditBtn.click();
				 
			 
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
			 nameTxt.click();
			 nameTxt.sendKeys(Keys.TAB);
			 
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(codeTxt));
		     codeTxt.sendKeys(Keys.TAB);
			 
		     
		     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(categoryTxt));
		     distanceTxt.click();
		     distanceTxt.clear();
		     distanceTxt.sendKeys("10");
		     Thread.sleep(2000);
		     distanceTxt.sendKeys(Keys.TAB);
		     
		     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
	         nameTxt.click();
	         
		     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newGeneralSaveBtn));
		     newGeneralSaveBtn.click();
			 
			 String expMessage3="Updated Successfully";
				
			 String actMessage3=checkValidationMessage(expMessage2);
			
		 
		 System.out.println("Message     : "+actMessage+" Value Expected : "+expMessage);
			
		 if(actMessage.equalsIgnoreCase(expMessage) && actMessage2.equalsIgnoreCase(expMessage2)
				 && actMessage3.equalsIgnoreCase(expMessage3))
		 {
			 System.out.println(" Test Pass   :  Distances  Created Successfully" );
			 return true;
		 }
		 
		 else
		 {
			 System.out.println(" Test Fail   :  Distances Created Successfully" );
			 return false;
		 }
		 }
	

	
	public boolean checkSavingVoucherInOpeningStocksNewWithFIFOWithFarthest() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		System.out.println("****************checkSavingVoucherInOpeningStocksNewWithFIFOWithFarthest Method Executed ***********************");
		
			
		 Thread.sleep(2000);
		    
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
		inventoryMenu.click();
	    
		Thread.sleep(2000);
		
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(invTransactionsMenu));
	    invTransactionsMenu.click();
	    
	    Thread.sleep(2000);
	    
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(invTransStocksMenu));
	    invTransStocksMenu.click();
	    
	    Thread.sleep(2000);
		
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(openingStocksNewVoucher));
	    openingStocksNewVoucher.click();
	    
	    
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();
		
		checkUserFriendlyMessage();
		
        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(warehouseTxt));
		warehouseTxt.click();
		warehouseTxt.sendKeys(Keys.SPACE);
	    
		ArrayList<String> actWarehouseOpt = new ArrayList<String>(); 
		
		int warehouselist=warehouseHeaderComboList.size();
		
		String actWarehouseList= actWarehouseOpt.toString();
            
        for (int i = 0; i < warehouselist; i++) 
		{
					String warehouse=warehouseHeaderComboList.get(i).getText();
					
		     if (warehouse.equalsIgnoreCase("SECUNDERABAD")) 
		     {
					System.out.println("Entered If Loop");
					
					warehouseHeaderComboList.get(i).click();
					
					warehouseTxt.sendKeys(Keys.TAB);
					
					break;
				}
		}

            getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
			select1stRow_1stColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
			enter_ItemTxt.sendKeys(Keys.SPACE);
			
			int itemsCount=itemComboList.size();
			
			for (int i = 0; i < itemsCount; i++) 
			{
				String item=itemComboList.get(i).getText();
				
				System.out.println(i+"  "+item);
				
				if (item.equalsIgnoreCase("FIFO COGS ITEM")) 
				{
					System.out.println("Entered If Loop");
					
					itemComboList.get(i).click();
					
					enter_ItemTxt.sendKeys(Keys.TAB);
					
					break;
				}
			}
			
            getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_UnitTxt));
			enter_UnitTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
			enter_Quantity.sendKeys(Keys.END,Keys.SHIFT,Keys.HOME);
			enter_Quantity.sendKeys("1");
			enter_Quantity.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
			enter_Rate.sendKeys(Keys.END,Keys.SHIFT,Keys.HOME);
			enter_Rate.sendKeys("15.00");
			enter_Rate.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
			enter_Gross.sendKeys(Keys.TAB);

			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binSearchBtn));
			binSearchBtn.click();
			
            Thread.sleep(2000);
            
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binAutoAllocateBtn));
            binAutoAllocateBtn.click();
            
			int binInwardGridListCount = binInwardGridList.size();
			
			ArrayList<String> binInwardGridListArray = new ArrayList<String>();
			
			for(int i=0;i<binInwardGridListCount;i++)
			{
				String data = binInwardGridList.get(i).getText();
				binInwardGridListArray.add(data);
			}
			
			String actbinInwardGridList=binInwardGridListArray.toString();
			
			String expbinInwardGridList="[, BG2, , 0.00, , 0.00, 0.00, 0.00, 0.00, , , , 0.00, , , , , , Bin Update, , 0.00, , 90.00, 0.00, 90.00, 90.00, , , , 0.00, , , , , , Bin1, , 0.00, , 90.00, 0.00, 90.00, 90.00, , , , 12.00, , , , , , Bin2, , 0.00, , 90.00, 0.00, 90.00, 90.00, , , , 0.00, , , , ]";
			
			System.out.println("ActbinInwardGridList : " + actbinInwardGridList);
			System.out.println("ExpbinInwardGridList : " + expbinInwardGridList);
		
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binOkBtn));
			binOkBtn.click();
			
			String docno=documentNumberTxt.getAttribute("value");
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
			saveBtn.click();
			

			boolean savingMessage=checkVoucherSavingMessage(docno);
			
			String actMessage=Boolean.toString(savingMessage);
			String expMessage="true";
			
			if (actMessage.equalsIgnoreCase(expMessage) && actbinInwardGridList.equalsIgnoreCase(expbinInwardGridList) ) 
			{
				System.out.println("Test Pass: Voucher Saved Successfully");
				return true;
			}
			else
			{
				System.out.println("Test Fail: Voucher Saved Successfully");
				return false;
			}
	}

	
	

	public boolean checkSavingSalesInvoiceVoucherWithFarthestOption() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		
		
		System.out.println("**************************checkSavingSalesInvoiceVoucherWithFarthestOption Method Executes *************************");
		
		        
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
			financialsMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
			financialsTransactionMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialTransactionSalesMenu));
			financialTransactionSalesMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesInvoicesVoucher));
			salesInvoiceVATVoucher.click();

            getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
			newBtn.click();
			
			checkUserFriendlyMessage();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerAccountTxt));
			customerAccountTxt.click();
			customerAccountTxt.sendKeys(Keys.END);
			customerAccountTxt.sendKeys(Keys.SHIFT,Keys.HOME);
			customerAccountTxt.sendKeys(Keys.SPACE);
			
			int customerAccountCount=customerAccountComboList.size();
			
			System.out.println("Customer Account List Size: "+customerAccountCount);
			
			for (int i = 0; i < customerAccountCount; i++) 
			{
				String customerAccount=customerAccountComboList.get(i).getText();
				
				if (customerAccount.equalsIgnoreCase("Customer A"))
				{
					System.out.println("Entered If Loop");
					
					customerAccountComboList.get(i).click();
					
					customerAccountTxt.sendKeys(Keys.TAB);
					
					break;
				}
			}
			customerAccountTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherHeaderCurrency));
			voucherHeaderCurrency.click();
			voucherHeaderCurrency.sendKeys(Keys.END);
			voucherHeaderCurrency.sendKeys(Keys.SHIFT,Keys.HOME);
			voucherHeaderCurrency.sendKeys(Keys.SPACE);
			
			int currencyCount=currencyComboList.size();
			
			for (int i = 0; i < currencyCount; i++) 
			{
				String currency=currencyComboList.get(i).getText();
				
				System.out.println(i+"  "+currency);
				
				if (currency.equalsIgnoreCase("INR"))
				{
					System.out.println("Entered If Loop");
					
					currencyComboList.get(i).click();
					
					voucherHeaderCurrency.sendKeys(Keys.TAB);
					
					break;
				}
			}
			voucherHeaderCurrency.sendKeys(Keys.TAB);
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
			departmentTxt.click();
			departmentTxt.sendKeys(Keys.END);
			departmentTxt.sendKeys(Keys.SHIFT,Keys.HOME);
			departmentTxt.sendKeys(Keys.SPACE);
			
			int departmentCount=departmentComboList.size();
			
			for (int i = 0; i < departmentCount; i++) 
			{
				String department=departmentComboList.get(i).getText();
				
				System.out.println(i+"  "+department);
				
				if (department.equalsIgnoreCase("INDIA"))
				{
					System.out.println("Entered If Loop");
					
					departmentComboList.get(i).click();
					
					departmentTxt.sendKeys(Keys.TAB);
					
					break;
				}
			}
			departmentTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesInvoiceVATPlaceOFSupply));
			salesInvoiceVATPlaceOFSupply.click();
			salesInvoiceVATPlaceOFSupply.sendKeys(Keys.END);
			salesInvoiceVATPlaceOFSupply.sendKeys(Keys.SHIFT,Keys.HOME);
			salesInvoiceVATPlaceOFSupply.sendKeys(Keys.SPACE);
			
			
			int placeOFSupplyListCount=placeOFSupplyList.size();
			
			System.err.println("placeOFSupplyListCount   : "+placeOFSupplyListCount);
				
			for(int i=0 ; i < placeOFSupplyListCount ;i++)
			{
				String data=placeOFSupplyList.get(i).getText();
				
				if(data.equalsIgnoreCase("Abu Dhabi"))
				{
					placeOFSupplyList.get(i).click();
					
					break;
				}
			}
				
			
			salesInvoiceVATPlaceOFSupply.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesInvoiceVATJuridictionxt));
			salesInvoiceVATJuridictionxt.click();
			salesInvoiceVATJuridictionxt.sendKeys(Keys.END);
			salesInvoiceVATJuridictionxt.sendKeys(Keys.SHIFT,Keys.HOME);
			salesInvoiceVATJuridictionxt.sendKeys(Keys.SPACE);
			
			
			int JuridictionListCount=JuridictionList.size();
			
			System.err.println("JuridictionList   : "+JuridictionListCount);
				
			for(int i=0 ; i < JuridictionListCount ;i++)
			{
				String data=JuridictionList.get(i).getText();
				
				if(data.equalsIgnoreCase("Abu Dhabi"))
				{
					JuridictionList.get(i).click();
					
					break;
				}
			}
				
			
			salesInvoiceVATJuridictionxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
			select1stRow_1stColumn.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pvWarehouseTxt));
			pvWarehouseTxt.sendKeys(Keys.END);
			pvWarehouseTxt.sendKeys(Keys.SHIFT,Keys.HOME);
			pvWarehouseTxt.sendKeys(Keys.SPACE);
			
			int warehouselist=warehouseBodyComboList.size();
			
			
			ArrayList<String> actWarehouseOpt = new ArrayList<String>();
			
			System.out.println("******* Warehouse List: "+warehouselist);
			
			for (int i = 0; i < warehouselist; i++) 
			{
				String warehouse=warehouseBodyComboList.get(i).getText();
				
				
				
				if (warehouse.equalsIgnoreCase("SECUNDERABAD"))
				{
					System.out.println("Entered If Loop");
					
					warehouseBodyComboList.get(i).click();
					
					pvWarehouseTxt.sendKeys(Keys.TAB);
					
					break;
				}
			}
			

            getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
            enter_ItemTxt.sendKeys(Keys.END);
            enter_ItemTxt.sendKeys(Keys.SHIFT,Keys.HOME);
			enter_ItemTxt.sendKeys(Keys.SPACE);
			
			int itemsCount=itemComboList.size();
			
			for (int i = 0; i < itemsCount; i++) 
			{
				String item=itemComboList.get(i).getText();
				
				if (item.equalsIgnoreCase("FIFO COGS ITEM")) 
				{
					System.out.println("Entered If Loop");
					
					itemComboList.get(i).click();
					
					enter_ItemTxt.sendKeys(Keys.TAB);
					
					break;
				}
			}
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_4thColumn));
			select1stRow_4thColumn.click();
			
			enter_AccountTxt.sendKeys(Keys.END,Keys.SHIFT,Keys.HOME);
			enter_AccountTxt.sendKeys(Keys.SPACE);
			
			enter_AccountTxt.sendKeys("Sales - Computers");
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_5thColumn));
			select1stRow_5thColumn.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_8thColumn));
			select1stRow_8thColumn.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_AQTxt));
			enter_AQTxt.clear();
			enter_AQTxt.sendKeys(Keys.END);
			enter_AQTxt.sendKeys(Keys.SHIFT,Keys.HOME);
			enter_AQTxt.sendKeys("12");
			enter_AQTxt.sendKeys(Keys.TAB);
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_FQTxt));
			enter_FQTxt.clear();
			enter_FQTxt.sendKeys(Keys.TAB);
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_14thColumn));
			select1stRow_14thColumn.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
			enter_Rate.sendKeys("10");
			enter_Rate.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
			enter_Gross.sendKeys(Keys.TAB);
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_20thColumn));
			select1stRow_20thColumn.click();
			
			
			Thread.sleep(2000);
			binSearchBtn.click();
			
			Thread.sleep(3000);
            
            getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binAutoAllocateBtn));
           
            binAutoAllocateBtn.click();
			
			String actbinoutwardRowTotalToBePicked	=binoutwardRowTotalToBePicked.getText();
			
			int binInwardGridListCount = binInwardGridList.size();
			
			ArrayList<String> binInwardGridListArray = new ArrayList<String>();
			
			for(int i=0;i<binInwardGridListCount;i++)
			{
				String data = binInwardGridList.get(i).getText();
				binInwardGridListArray.add(data);
			}
			
			
			String actbinInwardGridList=binInwardGridListArray.toString();
			
			String expbinInwardGridList="[, Bin1, , 12.00, 12.00, 90.00, 12.00, 78.00, 78.00, , , , 12.00, , , , ]";
			
			System.out.println("ActbinInwardGridList : " + actbinInwardGridList);
			System.out.println("ExpbinInwardGridList : " + expbinInwardGridList);

           
			Thread.sleep(2000);

            getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binOkBtn));
			binOkBtn.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_20thColumn));
			
			String actBin=select1stRow_20thColumn.getText();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
			String docno=documentNumberTxt.getAttribute("value");
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
			saveBtn.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pickBtn));
			pickBtn.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newReferenceTxt));
			String actNewReference=newReferenceTxt.getAttribute("value");

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(Bill_OkBtn));
			Bill_OkBtn.click();
			
			Thread.sleep(2000);

			
			boolean savingMessage=checkVoucherSavingMessage(docno);
		    
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
			String actNewDocNo=documentNumberTxt.getAttribute("value");
			
			String expBin          ="Bin1";
			String expNewReference ="120.00";
			String expNewDocNo     ="2";
			
			System.out.println("********** Bin Column     : "+actBin           +"  value expected  "+expBin);
			System.out.println("********** New Reference  : "+actNewReference  +"  value expected  "+expNewReference);
			System.out.println("********** New Voucher No : "+actNewDocNo      +"  value expected  "+expNewDocNo);
						
			if(actBin.equalsIgnoreCase(expBin) && actNewReference.equalsIgnoreCase(expNewReference) && actNewDocNo.equalsIgnoreCase(expNewDocNo) && savingMessage==true) 
			{
				System.out.println("***Test Pass: Sales Invoice N Voucher Saved Successfully***");
				return true;
			}
			else
			{
				System.out.println("***Test Fail: Sales Invoice N Voucher NOT Saved Successfully***");
				return false;
			}
		}

	
	
	
	public boolean checkSavingVoucher2InOpeningStocksNewWithFIFOWithFarthest() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		System.out.println("****************checkSavingVoucher2InOpeningStocksNewWithFIFOWithFarthest Method Executed ***********************");
		
			
		 Thread.sleep(2000);
		    
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
		inventoryMenu.click();
	    
		Thread.sleep(2000);
		
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(invTransactionsMenu));
	    invTransactionsMenu.click();
	    
	    Thread.sleep(2000);
	    
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(invTransStocksMenu));
	    invTransStocksMenu.click();
	    
	    Thread.sleep(2000);
		
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(openingStocksNewVoucher));
	    openingStocksNewVoucher.click();
	    
	    
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();
		
		checkUserFriendlyMessage();
		
        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(warehouseTxt));
		warehouseTxt.click();
		warehouseTxt.sendKeys(Keys.SPACE);
	    
		ArrayList<String> actWarehouseOpt = new ArrayList<String>(); 
		
		int warehouselist=warehouseHeaderComboList.size();
		
		String actWarehouseList= actWarehouseOpt.toString();
            
        for (int i = 0; i < warehouselist; i++) 
		{
					String warehouse=warehouseHeaderComboList.get(i).getText();
					
		     if (warehouse.equalsIgnoreCase("SECUNDERABAD")) 
		     {
					System.out.println("Entered If Loop");
					
					warehouseHeaderComboList.get(i).click();
					
					warehouseTxt.sendKeys(Keys.TAB);
					
					break;
				}
		}

            getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
			select1stRow_1stColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
			enter_ItemTxt.sendKeys(Keys.SPACE);
			
			int itemsCount=itemComboList.size();
			
			for (int i = 0; i < itemsCount; i++) 
			{
				String item=itemComboList.get(i).getText();
				
				System.out.println(i+"  "+item);
				
				if (item.equalsIgnoreCase("FIFO COGS ITEM")) 
				{
					System.out.println("Entered If Loop");
					
					itemComboList.get(i).click();
					
					enter_ItemTxt.sendKeys(Keys.TAB);
					
					break;
				}
			}
			
            getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_UnitTxt));
			enter_UnitTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
			enter_Quantity.sendKeys(Keys.END,Keys.SHIFT,Keys.HOME);
			enter_Quantity.sendKeys("1");
			enter_Quantity.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
			enter_Rate.sendKeys(Keys.END,Keys.SHIFT,Keys.HOME);
			enter_Rate.sendKeys("15.00");
			enter_Rate.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
			enter_Gross.sendKeys(Keys.TAB);

			Thread.sleep(2000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binSearchBtn));
			binSearchBtn.click();
			
            Thread.sleep(2000);
            
            Thread.sleep(2000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binAutoAllocateBtn));
            binAutoAllocateBtn.click();
            
			int binInwardGridListCount = binInwardGridList.size();
			
			ArrayList<String> binInwardGridListArray = new ArrayList<String>();
			
			for(int i=0;i<binInwardGridListCount;i++)
			{
				String data = binInwardGridList.get(i).getText();
				binInwardGridListArray.add(data);
			}
			
			String actbinInwardGridList=binInwardGridListArray.toString();
			
			String expbinInwardGridList="[, BG2, , 0.00, , 0.00, 0.00, 0.00, 0.00, , , , 0.00, , , , , , Bin Update, , 0.00, , 90.00, 0.00, 90.00, 90.00, , , , 0.00, , , , , , Bin1, , 0.00, , 90.00, 0.00, 90.00, 90.00, , , , 12.00, , , , , , Bin2, , 0.00, , 90.00, 0.00, 90.00, 90.00, , , , 0.00, , , , ]";
			
			System.out.println("ActbinInwardGridList : " + actbinInwardGridList);
			System.out.println("ExpbinInwardGridList : " + expbinInwardGridList);
		
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binOkBtn));
			binOkBtn.click();
			
			String docno=documentNumberTxt.getAttribute("value");
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
			saveBtn.click();
			

			boolean savingMessage=checkVoucherSavingMessage(docno);
			
			String actMessage=Boolean.toString(savingMessage);
			String expMessage="true";
			
			if (actMessage.equalsIgnoreCase(expMessage) && actbinInwardGridList.equalsIgnoreCase(expbinInwardGridList) ) 
			{
				System.out.println("Test Pass: Voucher Saved Successfully");
				return true;
			}
			else
			{
				System.out.println("Test Fail: Voucher Saved Successfully");
				return false;
			}
	}

	


		public boolean checkStockLedgerReportByFarthestOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
			xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			
			
			System.out.println("************************************checkStockLedgerReportByFarthestOption********************************************");
			
			Thread.sleep(3000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
			inventoryMenu.click();
			
			Thread.sleep(3000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryReportsMenu));
			inventoryReportsMenu.click();
			
			Thread.sleep(3000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(stockLedger));
			stockLedger.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
			Select s=new Select(sl_DateOptionDropdown);
			s.selectByValue("1");
			
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_HeaderSelectChkBox));
			sl_HeaderSelectChkBox.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
			sl_OkBtn.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_OptionsBtn));
			report_OptionsBtn.click();
			
			
			Thread.sleep(5000);
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_1stRow2ndCol));

			String actItemNameR1				= sl_1stRow2ndCol.getText();
			
			String expItemNameR1				= "FIFO COGS ITEM FIFO COGS ITEM";
			
			System.out.println("ItemNameR1   			: "+actItemNameR1					+" Value Expected : "+expItemNameR1);
			
			
			
			
            int report2ndColListCount = report2ndRowList.size();
			
			ArrayList<String> report2ndColListArray = new ArrayList<String>();
			
			for(int i=0;i<report2ndColListCount;i++)
			{
				String data = report2ndRowList.get(i).getText();
				report2ndColListArray.add(data);
				
			}
			
			String actreport2ndColList = report2ndColListArray.toString();
			String expreport2ndColList = "[2, , Opening Balance, 24.00, , , , 24.00, , , 30.00, 1.25, , , ]";
			
	
			
			
			System.out.println("actreport2ndColList   : "+actreport2ndColList);
			System.out.println("expreport2ndColList   : "+expreport2ndColList);
			
			
            int report3rdColListCount = report3rdRowList.size();
			
			ArrayList<String> report3rdColListArray = new ArrayList<String>();
			
			for(int i=0;i<report3rdColListCount;i++)
			{
				String data = report3rdRowList.get(i).getText();
				if(i==1)
				{
					data="Date Field";
				}
				report3rdColListArray.add(data);
				
			}
			
			String actreport3rdColList = report3rdColListArray.toString();
			String expreport3rdColList = "[3, Date Field, NDT55:1, , , 12.00, 1.25, 12.00, , 15.00, 15.00, 1.25, , , ]";
			
	
			
			
			System.out.println("actreport3rdColList   : "+actreport3rdColList);
			System.out.println("expreport3rdColList   : "+expreport3rdColList);
			
			
            int report4thColListCount = report4thRowList.size();
			
			ArrayList<String> report4thColListArray = new ArrayList<String>();
			
			for(int i=0;i<report4thColListCount;i++)
			{
				String data = report4thRowList.get(i).getText();
				report4thColListArray.add(data);
				
			}
			
			String actreport4thColList = report4thColListArray.toString();
			String expreport4thColList = "[4, Sub Total, , 24.00, , 12.00, 1.25, 12.00, , 15.00, 15.00, 2.50, , , ]";
			
			
			System.out.println("actreport4thColList   : "+actreport4thColList);
			System.out.println("expreport4thColList   : "+expreport4thColList);
			
						
			
           if(actItemNameR1.equalsIgnoreCase(expItemNameR1) && actreport3rdColList.equalsIgnoreCase(expreport3rdColList) && 
            		   actreport3rdColList.equalsIgnoreCase(expreport3rdColList) && actreport4thColList.equalsIgnoreCase(expreport4thColList) )
			{
				System.out.println("Test Pass : Output Options Are as Expected ");
				//excelReader.setCellData(xlfile, xlsheet, 149, 9, resPass);
				return true;
			}
			else
			{
				System.out.println("Test Fail : output Options Are NOT as Expected ");
				//excelReader.setCellData(xlfile, xlsheet, 149, 9, resFail);
				
				return false;
			}
		}
	
		

	public boolean checkOpeningStockRegisterReportWithFarthestOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
		inventoryMenu.click();
		
		Thread.sleep(3000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryReportsMenu));
		inventoryReportsMenu.click();
		
		Thread.sleep(3000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(openingStocksRegister));
		openingStocksRegister.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByValue("1");
		
		String actsl_DateOptionDropdown    =s.getFirstSelectedOption().getText();
		String expsl_DateOptionDropdown    ="As on date";
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		
		Thread.sleep(3000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_1stRow2ndCol));
	
		Thread.sleep(2000);
		
		
        int report1stRowListCount = report1stRowList.size();
		
		ArrayList<String> report1stRowListArray = new ArrayList<String>();
		
		for(int i=0;i<report1stRowListCount;i++)
		{
			String data = report1stRowList.get(i).getText();
			
			if(i==1)
			{
				data="Date Field";
			}
			
			report1stRowListArray.add(data);
			
		}
		
		String actreport1stRowList = report1stRowListArray.toString();
		String expreport1stRowList = "[1, Date Field, FIFO COGS ITEM, 12.00, 15.00, 15.00]";
		
		System.out.println("actreport1stRowList   : "+actreport1stRowList);
		System.out.println("expreport1stRowList   : "+expreport1stRowList);
		
		
		int report2ndRowListCount = report2ndRowList.size();
			
		ArrayList<String> report2ndRowListArray = new ArrayList<String>();
		
		for(int i=0;i<report2ndRowListCount;i++)
		{
			String data = report2ndRowList.get(i).getText();
			
			if (i==1)
			{
				data="Date Field";
				
			}
			
			report2ndRowListArray.add(data);
		}
		
		String actreport2ndRowList = report2ndRowListArray.toString();
		String expreport2ndRowList = "[2, Date Field, FIFO COGS ITEM, 12.00, 15.00, 15.00]";
		
		System.out.println("actreport2ndRowList   : "+actreport2ndRowList);
		System.out.println("expreport2ndRowList   : "+expreport2ndRowList);
		
		
		int report3rdRowListCount = report3rdRowList.size();
		
		ArrayList<String> report3rdRowListArray = new ArrayList<String>();
		
		for(int i=0;i<report3rdRowListCount;i++)
		{
			String data = report3rdRowList.get(i).getText();
			report3rdRowListArray.add(data);
			
		}
		
		String actreport3rdRowList = report3rdRowListArray.toString();
		String expreport3rdRowList = "[3, Grand Total, , 24.00, 30.00, 30.00]";
		
		System.out.println("actreport3rdRowList   : "+actreport3rdRowList);
		System.out.println("expreport3rdRowList   : "+expreport3rdRowList);
		
		
		if(actreport1stRowList.equalsIgnoreCase(expreport1stRowList) && actreport2ndRowList.equalsIgnoreCase(expreport2ndRowList)  && 
				actreport3rdRowList.equalsIgnoreCase(expreport3rdRowList))
		{
			System.out.println("Test Pass : Report is As Expected");
			
			
			return true;
		}
		else
		{
			System.out.println("Test Fail : Report is NOT As Expected");
			
			return false;
		}
	}

		
	
	
	public boolean checkStockDetailsByBinsReportsWithFarthestOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
		inventoryMenu.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryReportsMenu));
		inventoryReportsMenu.click();
		
		getAction().sendKeys(Keys.END).build().perform();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binsReportMenu));
		binsReportMenu.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(stockDetailsByBins));
		stockDetailsByBins.click();
		
		int rowcount=stockLedgerHometableRowCount.size();
		System.out.println(rowcount);
		
		for (int i = 0; i < rowcount; i++) 
		{
			String actname=reportNameList.get(i).getText();
			
			System.out.println(actname);
			
			if (actname.equalsIgnoreCase("FIFO COGS ITEM")) 
			{
				reportsChkboxList.get(i).click();
				
				break;
			}
		}
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		
		Thread.sleep(3000);
		
		
		 int report1stRowListCount = report1stRowList.size();
			
			ArrayList<String> report1stRowListArray = new ArrayList<String>();
			
			for(int i=0;i<report1stRowListCount;i++)
			{
				String data = report1stRowList.get(i).getText();
				
				report1stRowListArray.add(data);
				
			}
			
			String actreport1stRowList = report1stRowListArray.toString();
			String expreport1stRowList = "[1, FIFO COGS ITEM FIFO COGS ITEM]";
			
			System.out.println("actreport1stRowList   : "+actreport1stRowList);
			System.out.println("expreport1stRowList   : "+expreport1stRowList);
			
			
			int report2ndRowListCount = report2ndRowList.size();
				
			ArrayList<String> report2ndRowListArray = new ArrayList<String>();
			
			for(int i=0;i<report2ndRowListCount;i++)
			{
				String data = report2ndRowList.get(i).getText();
				
				report2ndRowListArray.add(data);
				
			}
			
			String actreport2ndRowList = report2ndRowListArray.toString();
			String expreport2ndRowList = "[2, Bin1, 0, 0, 12.00, , 12.00]";
			
			System.out.println("actreport2ndRowList   : "+actreport2ndRowList);
			System.out.println("expreport2ndRowList   : "+expreport2ndRowList);
			
			
			int report3rdRowListCount = report3rdRowList.size();
			
			ArrayList<String> report3rdRowListArray = new ArrayList<String>();
			
			for(int i=0;i<report3rdRowListCount;i++)
			{
				String data = report3rdRowList.get(i).getText();
				
				report3rdRowListArray.add(data);
				
			}
			
			String actreport3rdRowList = report3rdRowListArray.toString();
			String expreport3rdRowList = "[3, Total, , , 12.00, , 12.00]";
			
			System.out.println("actreport3rdRowList   : "+actreport3rdRowList);
			System.out.println("expreport3rdRowList   : "+expreport3rdRowList);
			
		
		if(actreport1stRowList.equalsIgnoreCase(expreport1stRowList) && actreport2ndRowList.equalsIgnoreCase(expreport2ndRowList) && 
				actreport3rdRowList.equalsIgnoreCase(expreport3rdRowList))
		{
			System.out.println("Test Pass : Reports Are As Expected");
			
			return true;
		}
		else
		{
			System.out.println("Test Fail : Reports Are NOT As Expected");
			
			return false;
		}
		
	}		
	

	
	// Stock Balance By Bins
	

	public boolean checkStockBalanaceByBinsReportsWithFarthestOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
		inventoryMenu.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryReportsMenu));
		inventoryReportsMenu.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binsReportMenu));
		binsReportMenu.click();
		
		getAction().sendKeys(Keys.END).build().perform();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(stockBalancesByBins));
		stockBalancesByBins.click();
		
		Thread.sleep(2000);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByValue("1");
		
		String actsl_DateOptionDropdown    =s.getFirstSelectedOption().getText();
		String expsl_DateOptionDropdown    ="As on date";
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_SelectAllItemsChkBox));
		sl_SelectAllItemsChkBox.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		
		Thread.sleep(3000);
		
		
		 int report1stRowListCount = report1stRowList.size();
			
			ArrayList<String> report1stRowListArray = new ArrayList<String>();
			
			for(int i=0;i<report1stRowListCount;i++)
			{
				String data = report1stRowList.get(i).getText();
				
				report1stRowListArray.add(data);
				
			}
			
			String actreport1stRowList = report1stRowListArray.toString();
			String expreport1stRowList = "[1, Bin1 Bin1]";
			
			System.out.println("actreport1stRowList   : "+actreport1stRowList);
			System.out.println("expreport1stRowList   : "+expreport1stRowList);
			
			
			int report2ndRowListCount = report2ndRowList.size();
				
			ArrayList<String> report2ndRowListArray = new ArrayList<String>();
			
			for(int i=0;i<report2ndRowListCount;i++)
			{
				String data = report2ndRowList.get(i).getText();
				
				report2ndRowListArray.add(data);
				
			}
			
			String actreport2ndRowList = report2ndRowListArray.toString();
			String expreport2ndRowList = "[2, FIFO COGS ITEM, 0, 0, 12.00, , 12.00]";
			
			System.out.println("actreport2ndRowList   : "+actreport2ndRowList);
			System.out.println("expreport2ndRowList   : "+expreport2ndRowList);
			
			
			int report3rdRowListCount = report3rdRowList.size();
			
			ArrayList<String> report3rdRowListArray = new ArrayList<String>();
			
			for(int i=0;i<report3rdRowListCount;i++)
			{
				String data = report3rdRowList.get(i).getText();
				
				report3rdRowListArray.add(data);
				
			}
			
			String actreport3rdRowList = report3rdRowListArray.toString();
			String expreport3rdRowList = "[3, Grand Total, , , 12.00, , 12.00]";
			
			System.out.println("actreport3rdRowList   : "+actreport3rdRowList);
			System.out.println("expreport3rdRowList   : "+expreport3rdRowList);
			
		
		if(actreport1stRowList.equalsIgnoreCase(expreport1stRowList) && actreport2ndRowList.equalsIgnoreCase(expreport2ndRowList) && 
				actreport3rdRowList.equalsIgnoreCase(expreport3rdRowList))
		{
			System.out.println("Test Pass : Reports Are As Expected");
			
			return true;
		}
		else
		{
			System.out.println("Test Fail : Reports Are NOT As Expected");
			return false;
		}
		
	}		



//Stock Balance By Item By Bins


	public boolean checkStockBalancesByItemByBinsReportsWithFarthestOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
		inventoryMenu.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryReportsMenu));
		inventoryReportsMenu.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binsReportMenu));
		binsReportMenu.click();
		
		getAction().sendKeys(Keys.END).build().perform();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(stockBalancesByItemByBins));
		stockBalancesByItemByBins.click();
		
		Thread.sleep(3000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByValue("1");
		
		String actsl_DateOptionDropdown    =s.getFirstSelectedOption().getText();
		String expsl_DateOptionDropdown    ="As on date";
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_SelectAllItemsChkBox));
		sl_SelectAllItemsChkBox.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		
		Thread.sleep(3000);
		
		
		 int report1stRowListCount = report1stRowList.size();
			
			ArrayList<String> report1stRowListArray = new ArrayList<String>();
			
			for(int i=0;i<report1stRowListCount;i++)
			{
				String data = report1stRowList.get(i).getText();
				
				report1stRowListArray.add(data);
				
			}
			
			String actreport1stRowList = report1stRowListArray.toString();
			String expreport1stRowList = "[1, FIFO COGS ITEM FIFO COGS ITEM]";
			
			System.out.println("actreport1stRowList   : "+actreport1stRowList);
			System.out.println("expreport1stRowList   : "+expreport1stRowList);
			
			
			int report2ndRowListCount = report2ndRowList.size();
				
			ArrayList<String> report2ndRowListArray = new ArrayList<String>();
			
			for(int i=0;i<report2ndRowListCount;i++)
			{
				String data = report2ndRowList.get(i).getText();
				
				report2ndRowListArray.add(data);
				
			}
			
			String actreport2ndRowList = report2ndRowListArray.toString();
			String expreport2ndRowList = "[2, Bin1, 0, 0, 12.00, , , 12.00]";
			
			System.out.println("actreport2ndRowList   : "+actreport2ndRowList);
			System.out.println("expreport2ndRowList   : "+expreport2ndRowList);
			
			
			int report3rdRowListCount = report3rdRowList.size();
			
			ArrayList<String> report3rdRowListArray = new ArrayList<String>();
			
			for(int i=0;i<report3rdRowListCount;i++)
			{
				String data = report3rdRowList.get(i).getText();
				
				report3rdRowListArray.add(data);
				
			}
			
			String actreport3rdRowList = report3rdRowListArray.toString();
			String expreport3rdRowList = "[3, Grand Total, , , 12.00, , , 12.00]";
			
			System.out.println("actreport3rdRowList   : "+actreport3rdRowList);
			System.out.println("expreport3rdRowList   : "+expreport3rdRowList);
			
		
		if(actreport1stRowList.equalsIgnoreCase(expreport1stRowList) && actreport2ndRowList.equalsIgnoreCase(expreport2ndRowList) && 
				actreport3rdRowList.equalsIgnoreCase(expreport3rdRowList))
		{
			System.out.println("Test Pass : Reports Are As Expected");
			
			return true;
		}
		else
		{
			System.out.println("Test Fail : Reports Are NOT As Expected");
			
			return false;
		}
		
	}		




	
	
	
	
	public boolean CheckEnabletheOptionAllocateIntoPartiallyWithClosestAndFromTop() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		System.out.println("*******CheckEnabletheOptionAllocateIntoPartiallyWithClosestAndFromTop Method Excuted ******************");
		
		Thread.sleep(3000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(SettingsmenuBtn));
		SettingsmenuBtn.click();
		
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ConfigureTransactionBtn));
		ConfigureTransactionBtn.click();
		
		
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(BinsBtn));
		BinsBtn.click();
		
		
		
		if (AllocateIntoPartiallyChkBox.isSelected()==false)
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(AllocateIntoPartiallyChkBox));
			AllocateIntoPartiallyChkBox.click();
			
		}
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(PlaceTheItemfirstDropdown));
		PlaceTheItemfirstDropdown.click();
		
		int PlaceTheItemfirstDrpDwnListCount=PlaceTheItemfirstDrpDwnList.size();
		for (int i = 0; i < PlaceTheItemfirstDrpDwnListCount; i++) 
		{
			String data=PlaceTheItemfirstDrpDwnList.get(i).getText();
			if (data.equalsIgnoreCase("Closest and from top"))
			{
				PlaceTheItemfirstDrpDwnList.get(i).click();
			}
		}
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(UpdateBtn));
		UpdateBtn.click();
		
		getWaitForAlert();
		
		String actAlertMgs  =getAlert().getText();
		String expAlertMgs  ="Do you want to save the changes?";
		
		
		System.out.println("******************CheckEnabletheOptionItemsArePlacedInBinsBasedOnTheirCategory*************************");
		
		System.out.println("AlertMessage     : "+actAlertMgs    +" Value Expected : "+expAlertMgs);	
		
		getAlert().accept();
		
		
		 String expMessage="Data saved Successfully";
			
		 String actMessage=checkValidationMessage(expMessage);
		
		
		 Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplay));
			userNameDisplay.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
			logoutOption.click();
		 
		 
		
		if(actAlertMgs.equalsIgnoreCase(expAlertMgs))
		{
			System.out.println("Test Pass :VerifyUpdatebutton Alert Pop_Up Displayed As Expected");
			return true;
			
		}
		else
		{
			System.out.println("Test Fail :VerifyUpdatebutton Alert Pop_Up Not Displayed As Expected");
			return false;
		}
	}
	
	@FindBy(xpath="//input[@id='ibinLevel']")
	private static WebElement  levelTxt;
	
	

	public boolean CheckSavingBinsWithLevels() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		System.out.println("********CheckSavingBinsWithLevels Method Executes *******************");
		
		Thread.sleep(4000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(SettingsmenuBtn));
		homeMenu.click();
		
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMasterMenu));
		homeMasterMenu.click();
		
		
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binsMenu));
		binsMenu.click();
		
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastercmbMasterTxt));
		mastercmbMasterTxt.click();
		mastercmbMasterTxt.sendKeys("bin1"); 
		
		
		 Thread.sleep(2000);
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterEditBtn));
		 masterEditBtn.click();
		 
		 
		 Thread.sleep(2000);
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
		 nameTxt.click();
		 nameTxt.sendKeys(Keys.TAB);
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(codeTxt));
	     codeTxt.sendKeys(Keys.TAB);
		 
	     Thread.sleep(2000);
	     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(levelTxt));
	     levelTxt.click();
	     levelTxt.clear();
	     levelTxt.sendKeys("1");
	     Thread.sleep(2000);
	     levelTxt.sendKeys(Keys.TAB);
	     
	     
	     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
         nameTxt.click();
         
	     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newGeneralSaveBtn));
	     newGeneralSaveBtn.click();
		 
		 String expMessage="Updated Successfully";
			
		 String actMessage=checkValidationMessage(expMessage);
		
		
		 Thread.sleep(4000);
		 
		 
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastercmbMasterTxt));
		mastercmbMasterTxt.click();
		mastercmbMasterTxt.sendKeys("bin2"); 
			
			
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterEditBtn));
		masterEditBtn.click();
			 
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
		 nameTxt.click();
		 nameTxt.sendKeys(Keys.TAB);
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(codeTxt));
	     codeTxt.sendKeys(Keys.TAB);
		 
	     Thread.sleep(2000);
	     
	     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(levelTxt));
	     levelTxt.click();
	     levelTxt.clear();
	     levelTxt.sendKeys("2");
	     Thread.sleep(2000);
	     levelTxt.sendKeys(Keys.TAB);
	     
	     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
         nameTxt.click();
         
	     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newGeneralSaveBtn));
	     newGeneralSaveBtn.click();
		 
		 String expMessage2="Updated Successfully";
			
		 String actMessage2=checkValidationMessage(expMessage2);
		 
		 
		 
			Thread.sleep(2000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastercmbMasterTxt));
			mastercmbMasterTxt.click();
			mastercmbMasterTxt.sendKeys("bin Update"); 
				
				
			Thread.sleep(2000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterEditBtn));
			masterEditBtn.click();
				 
			 
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
			 nameTxt.click();
			 nameTxt.sendKeys(Keys.TAB);
			 
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(codeTxt));
		     codeTxt.sendKeys(Keys.TAB);
			 
		     Thread.sleep(2000);
		     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(levelTxt));
		     levelTxt.click();
		     levelTxt.clear();
		     levelTxt.sendKeys("3");
		     Thread.sleep(2000);
		     levelTxt.sendKeys(Keys.TAB);
		     
		     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
	         nameTxt.click();
	         
		     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newGeneralSaveBtn));
		     newGeneralSaveBtn.click();
			 
			 String expMessage3="Updated Successfully";
				
			 String actMessage3=checkValidationMessage(expMessage2);
			
		 
		 System.out.println("Message     : "+actMessage+" Value Expected : "+expMessage);
			
		 if(actMessage.equalsIgnoreCase(expMessage) && actMessage2.equalsIgnoreCase(expMessage2)
				 && actMessage3.equalsIgnoreCase(expMessage3))
		 {
			 System.out.println(" Test Pass   :  Distances  Created Successfully" );
			 return true;
		 }
		 
		 else
		 {
			 System.out.println(" Test Fail   :  Distances Created Successfully" );
			 return false;
		 }
		 }
	
	
	
	
	public boolean checkSavingVoucherInOpeningStocksNewWithFIFOWithClosestAndFromTop() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		System.out.println("****************checkSavingVoucherInOpeningStocksNewWithFIFOWithClosestAndFromTop Method Executed ***********************");
		
			
		 Thread.sleep(2000);
		    
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
		inventoryMenu.click();
	    
		Thread.sleep(2000);
		
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(invTransactionsMenu));
	    invTransactionsMenu.click();
	    
	    Thread.sleep(2000);
	    
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(invTransStocksMenu));
	    invTransStocksMenu.click();
	    
	    Thread.sleep(2000);
		
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(openingStocksNewVoucher));
	    openingStocksNewVoucher.click();
	    
	    
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();
		
		checkUserFriendlyMessage();
		
        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(warehouseTxt));
		warehouseTxt.click();
		warehouseTxt.sendKeys(Keys.SPACE);
	    
		ArrayList<String> actWarehouseOpt = new ArrayList<String>(); 
		
		int warehouselist=warehouseHeaderComboList.size();
		
		String actWarehouseList= actWarehouseOpt.toString();
            
        for (int i = 0; i < warehouselist; i++) 
		{
			String warehouse=warehouseHeaderComboList.get(i).getText();
					
					
					
		     if (warehouse.equalsIgnoreCase("SECUNDERABAD")) 
		     {
					System.out.println("Entered If Loop");
					
					warehouseHeaderComboList.get(i).click();
					
					warehouseTxt.sendKeys(Keys.TAB);
					
					break;
				}
		}

            getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
			select1stRow_1stColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
			enter_ItemTxt.sendKeys(Keys.SPACE);
			
			int itemsCount=itemComboList.size();
			
			for (int i = 0; i < itemsCount; i++) 
			{
				String item=itemComboList.get(i).getText();
				
				System.out.println(i+"  "+item);
				
				if (item.equalsIgnoreCase("FIFO COGS ITEM")) 
				{
					System.out.println("Entered If Loop");
					
					itemComboList.get(i).click();
					
					enter_ItemTxt.sendKeys(Keys.TAB);
					
					break;
				}
			}
			
            getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_UnitTxt));
			enter_UnitTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
			enter_Quantity.sendKeys(Keys.END,Keys.SHIFT,Keys.HOME);
			enter_Quantity.sendKeys("1");
			enter_Quantity.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
			enter_Rate.sendKeys(Keys.END,Keys.SHIFT,Keys.HOME);
			enter_Rate.sendKeys("15.00");
			enter_Rate.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
			enter_Gross.sendKeys(Keys.TAB);

			
			Thread.sleep(2000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binSearchBtn));
			binSearchBtn.click();
			
            Thread.sleep(2000);
            
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binAutoAllocateBtn));
            binAutoAllocateBtn.click();
            
            
			int binInwardGridListCount = binInwardGridList.size();
			
			ArrayList<String> binInwardGridListArray = new ArrayList<String>();
			
			for(int i=0;i<binInwardGridListCount;i++)
			{
				String data = binInwardGridList.get(i).getText();
				binInwardGridListArray.add(data);
			}
			
			
			String actbinInwardGridList=binInwardGridListArray.toString();
			
			String expbinInwardGridList="[, BG2, , 0.00, , 0.00, 0.00, 0.00, 0.00, , , , 0.00, , , , , , Bin Update, , 0.00, , 90.00, 0.00, 90.00, 90.00, , , , 12.00, , , , , , Bin1, , 0.00, , 90.00, 0.00, 90.00, 90.00, , , , 0.00, , , , , , Bin2, , 0.00, , 90.00, 0.00, 90.00, 90.00, , , , 0.00, , , , ]";
			
			System.out.println("ActbinInwardGridList : " + actbinInwardGridList);
			System.out.println("ExpbinInwardGridList : " + expbinInwardGridList);
		
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binOkBtn));
			binOkBtn.click();
			
			Thread.sleep(2000);
			
							
			String actselect1stRow_7thColumn=select1stRow_7thColumn.getText();
			String expselect1stRow_7thColumn="Bin Update";

			System.out.println("ACtselect1stRow_7thColumn   : "+actselect1stRow_7thColumn +" Value Expected  : "+expselect1stRow_7thColumn);
			
			
			String docno=documentNumberTxt.getAttribute("value");
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
			saveBtn.click();
			

			boolean savingMessage=checkVoucherSavingMessage(docno);
			
			String actMessage=Boolean.toString(savingMessage);
			String expMessage="true";
			
			
			
			if (actMessage.equalsIgnoreCase(expMessage) && actbinInwardGridList.equalsIgnoreCase(expbinInwardGridList) && 
					 
					actselect1stRow_7thColumn.equalsIgnoreCase(expselect1stRow_7thColumn)) 
			{
				System.out.println("Test Pass: Voucher Saved Successfully");
				return true;
			}
			else
			{
				System.out.println("Test Fail: Voucher Saved Successfully");
				return false;
			}
	}

	

	
	
	public boolean CheckEnabletheOptionAllocateIntoPartiallyWithClosestAndFromBottom() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		System.out.println("*******CheckEnabletheOptionAllocateIntoPartiallyWithClosestAndFromBottom Method Excuted ******************");
		
		Thread.sleep(3000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(SettingsmenuBtn));
		SettingsmenuBtn.click();
		
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ConfigureTransactionBtn));
		ConfigureTransactionBtn.click();
		
		
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(BinsBtn));
		BinsBtn.click();
		
		
		
		if (AllocateIntoPartiallyChkBox.isSelected()==false)
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(AllocateIntoPartiallyChkBox));
			AllocateIntoPartiallyChkBox.click();
			
		}
		
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(PlaceTheItemfirstDropdown));
		PlaceTheItemfirstDropdown.click();
		
		int PlaceTheItemfirstDrpDwnListCount=PlaceTheItemfirstDrpDwnList.size();
		for (int i = 0; i < PlaceTheItemfirstDrpDwnListCount; i++) 
		{
			String data=PlaceTheItemfirstDrpDwnList.get(i).getText();
			if (data.equalsIgnoreCase(" Closest and from bottom "))
			{
				PlaceTheItemfirstDrpDwnList.get(i).click();
			}
		}
		
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(UpdateBtn));
		UpdateBtn.click();
		
		getWaitForAlert();
		
		String actAlertMgs  =getAlert().getText();
		String expAlertMgs  ="Do you want to save the changes?";
		
		
		
		System.out.println("AlertMessage     : "+actAlertMgs    +" Value Expected : "+expAlertMgs);	
		
		getAlert().accept();
		
		
		 String expMessage="Data saved Successfully";
			
		 String actMessage=checkValidationMessage(expMessage);
		
		
		 Thread.sleep(2000);
			
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplay));
		userNameDisplay.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
		logoutOption.click();
	 
		 
		
		if(actAlertMgs.equalsIgnoreCase(expAlertMgs))
		{
			System.out.println("Test Pass :Updatebutton Alert Pop_Up Displayed As Expected");
			return true;
			
		}
		else
		{
			System.out.println("Test Fail :Updatebutton Alert Pop_Up Not Displayed As Expected");
			return false;
		}
	}
	

	

	public boolean CheckSavingBinsWithLevelsClosestAndFromBottom() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		System.out.println("********CheckSavingBinsWithLevelsClosestAndFromBottom Method Executes *******************");
		
		Thread.sleep(4000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(SettingsmenuBtn));
		homeMenu.click();
		
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMasterMenu));
		homeMasterMenu.click();
		
		
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binsMenu));
		binsMenu.click();
		
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastercmbMasterTxt));
		mastercmbMasterTxt.click();
		mastercmbMasterTxt.sendKeys("bin1"); 
		
		
		 Thread.sleep(2000);
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterEditBtn));
		 masterEditBtn.click();
		 
		 
		 Thread.sleep(2000);
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
		 nameTxt.click();
		 nameTxt.sendKeys(Keys.TAB);
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(codeTxt));
	     codeTxt.sendKeys(Keys.TAB);
		 
	     Thread.sleep(2000);
	     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(levelTxt));
	     levelTxt.click();
	     levelTxt.clear();
	     levelTxt.sendKeys("4");
	     Thread.sleep(2000);
	     levelTxt.sendKeys(Keys.TAB);
	     
	     
	     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
         nameTxt.click();
         
	     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newGeneralSaveBtn));
	     newGeneralSaveBtn.click();
		 
		 String expMessage="Updated Successfully";
			
		 String actMessage=checkValidationMessage(expMessage);
		
		
		 Thread.sleep(4000);
		 
		 
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastercmbMasterTxt));
		mastercmbMasterTxt.click();
		mastercmbMasterTxt.sendKeys("bin2"); 
			
			
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterEditBtn));
		masterEditBtn.click();
			 
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
		 nameTxt.click();
		 nameTxt.sendKeys(Keys.TAB);
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(codeTxt));
	     codeTxt.sendKeys(Keys.TAB);
		 
	     Thread.sleep(2000);
	     
	     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(levelTxt));
	     levelTxt.click();
	     levelTxt.clear();
	     levelTxt.sendKeys("3");
	     Thread.sleep(2000);
	     levelTxt.sendKeys(Keys.TAB);
	     
	     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
         nameTxt.click();
         
	     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newGeneralSaveBtn));
	     newGeneralSaveBtn.click();
		 
		 String expMessage2="Updated Successfully";
			
		 String actMessage2=checkValidationMessage(expMessage2);
		 
		 
		 
			Thread.sleep(2000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastercmbMasterTxt));
			mastercmbMasterTxt.click();
			mastercmbMasterTxt.sendKeys("bin Update"); 
				
				
			Thread.sleep(2000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterEditBtn));
			masterEditBtn.click();
				 
			 
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
			 nameTxt.click();
			 nameTxt.sendKeys(Keys.TAB);
			 
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(codeTxt));
		     codeTxt.sendKeys(Keys.TAB);
			 
		     Thread.sleep(2000);
		     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(levelTxt));
		     levelTxt.click();
		     levelTxt.clear();
		     levelTxt.sendKeys("2");
		     Thread.sleep(2000);
		     levelTxt.sendKeys(Keys.TAB);
		     
		     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
	         nameTxt.click();
	         
		     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newGeneralSaveBtn));
		     newGeneralSaveBtn.click();
			 
			 String expMessage3="Updated Successfully";
				
			 String actMessage3=checkValidationMessage(expMessage2);
			
		 
		 System.out.println("Message     : "+actMessage+" Value Expected : "+expMessage);
			
		 if(actMessage.equalsIgnoreCase(expMessage) && actMessage2.equalsIgnoreCase(expMessage2)
				 && actMessage3.equalsIgnoreCase(expMessage3))
		 {
			 System.out.println(" Test Pass   :  Distances  Created Successfully" );
			 return true;
		 }
		 
		 else
		 {
			 System.out.println(" Test Fail   :  Distances Created Successfully" );
			 return false;
		 }
		 }
	
	
	
	
	
	public boolean checkSavingVoucherInOpeningStocksNewWithFIFOWithClosestAndFromBottom() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		System.out.println("****************checkSavingVoucherInOpeningStocksNewWithFIFOWithClosestAndFromBottom Method Executed ***********************");
		
			
		 Thread.sleep(2000);
		    
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
		inventoryMenu.click();
	    
		Thread.sleep(2000);
		
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(invTransactionsMenu));
	    invTransactionsMenu.click();
	    
	    Thread.sleep(2000);
	    
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(invTransStocksMenu));
	    invTransStocksMenu.click();
	    
	    Thread.sleep(2000);
		
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(openingStocksNewVoucher));
	    openingStocksNewVoucher.click();
	    
	    
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();
		
		checkUserFriendlyMessage();
		
        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(warehouseTxt));
		warehouseTxt.click();
		warehouseTxt.sendKeys(Keys.SPACE);
	    
		ArrayList<String> actWarehouseOpt = new ArrayList<String>(); 
		
		int warehouselist=warehouseHeaderComboList.size();
		
		String actWarehouseList= actWarehouseOpt.toString();
            
        for (int i = 0; i < warehouselist; i++) 
		{
					String warehouse=warehouseHeaderComboList.get(i).getText();
					
					
					
		     if (warehouse.equalsIgnoreCase("SECUNDERABAD")) 
		     {
					System.out.println("Entered If Loop");
					
					warehouseHeaderComboList.get(i).click();
					
					warehouseTxt.sendKeys(Keys.TAB);
					
					break;
				}
		}

            getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
			select1stRow_1stColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
			enter_ItemTxt.sendKeys(Keys.SPACE);
			
			int itemsCount=itemComboList.size();
			
			for (int i = 0; i < itemsCount; i++) 
			{
				String item=itemComboList.get(i).getText();
				
				System.out.println(i+"  "+item);
				
				if (item.equalsIgnoreCase("FIFO COGS ITEM")) 
				{
					System.out.println("Entered If Loop");
					
					itemComboList.get(i).click();
					
					enter_ItemTxt.sendKeys(Keys.TAB);
					
					break;
				}
			}
			
            getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_UnitTxt));
			enter_UnitTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
			enter_Quantity.sendKeys(Keys.END,Keys.SHIFT,Keys.HOME);
			enter_Quantity.sendKeys("1");
			enter_Quantity.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
			enter_Rate.sendKeys(Keys.END,Keys.SHIFT,Keys.HOME);
			enter_Rate.sendKeys("15.00");
			enter_Rate.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
			enter_Gross.sendKeys(Keys.TAB);

			
			Thread.sleep(2000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binSearchBtn));
			binSearchBtn.click();
			
            Thread.sleep(2000);
            
            getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binAutoAllocateBtn));
            binAutoAllocateBtn.click();
            
            
			int binInwardGridListCount = binInwardGridList.size();
			
			ArrayList<String> binInwardGridListArray = new ArrayList<String>();
			
			for(int i=0;i<binInwardGridListCount;i++)
			{
				String data = binInwardGridList.get(i).getText();
				binInwardGridListArray.add(data);
			}
			
			
			String actbinInwardGridList=binInwardGridListArray.toString();
			
			String expbinInwardGridList="[, BG2, , 0.00, , 0.00, 0.00, 0.00, 0.00, , , , 0.00, , , , , , Bin Update, , 0.00, , 90.00, 0.00, 90.00, 90.00, , , , 12.00, , , , , , Bin1, , 0.00, , 90.00, 0.00, 90.00, 90.00, , , , 0.00, , , , , , Bin2, , 0.00, , 90.00, 0.00, 90.00, 90.00, , , , 0.00, , , , ]";
			
			System.out.println("ActbinInwardGridList : " + actbinInwardGridList);
			System.out.println("ExpbinInwardGridList : " + expbinInwardGridList);
		
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binOkBtn));
			binOkBtn.click();
			
			Thread.sleep(2000);
							
			String actselect1stRow_7thColumn=select1stRow_7thColumn.getText();
			String expselect1stRow_7thColumn="Bin Update";

			System.out.println("ACtselect1stRow_7thColumn   : "+actselect1stRow_7thColumn +" Value Expected  : "+expselect1stRow_7thColumn);
			
			
			String docno=documentNumberTxt.getAttribute("value");
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
			saveBtn.click();
			

			boolean savingMessage=checkVoucherSavingMessage(docno);
			
			String actMessage=Boolean.toString(savingMessage);
			String expMessage="true";
			
			
			
			if (actMessage.equalsIgnoreCase(expMessage) && actbinInwardGridList.equalsIgnoreCase(expbinInwardGridList) && 
					 
					actselect1stRow_7thColumn.equalsIgnoreCase(expselect1stRow_7thColumn) ) 
			{
				System.out.println("Test Pass: Voucher Saved Successfully");
				return true;
				
			}
			else
			{

				System.out.println("Test Fail: Voucher Saved Successfully");
				return false;
			}
	}

	
	
	
	public boolean CheckEnabletheOptionAllocateIntoPartiallyWithFarthestAndFromTop() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		System.out.println("*******CheckEnabletheOptionAllocateIntoPartiallyWithFarthestAndFromTop Method Excuted ******************");
		
		Thread.sleep(3000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(SettingsmenuBtn));
		SettingsmenuBtn.click();
		
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ConfigureTransactionBtn));
		ConfigureTransactionBtn.click();
		
		
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(BinsBtn));
		BinsBtn.click();
		
		
		
		if (AllocateIntoPartiallyChkBox.isSelected()==false)
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(AllocateIntoPartiallyChkBox));
			AllocateIntoPartiallyChkBox.click();
			
		}
		
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(PlaceTheItemfirstDropdown));
		PlaceTheItemfirstDropdown.click();
		
		int PlaceTheItemfirstDrpDwnListCount=PlaceTheItemfirstDrpDwnList.size();
		for (int i = 0; i < PlaceTheItemfirstDrpDwnListCount; i++) 
		{
			String data=PlaceTheItemfirstDrpDwnList.get(i).getText();
			if (data.equalsIgnoreCase("Farthest and from top"))
			{
				PlaceTheItemfirstDrpDwnList.get(i).click();
			}
		}
		
		
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(UpdateBtn));
		UpdateBtn.click();
		
		getWaitForAlert();
		
		String actAlertMgs  =getAlert().getText();
		String expAlertMgs  ="Do you want to save the changes?";
		
		
		
		System.out.println("AlertMessage     : "+actAlertMgs    +" Value Expected : "+expAlertMgs);	
		
		getAlert().accept();
		
		
		 String expMessage="";
			
		 String actMessage=checkValidationMessage(expMessage);
		
		
		 Thread.sleep(2000);
			
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplay));
		userNameDisplay.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
		logoutOption.click();
	 
		 
		
		if(actAlertMgs.equalsIgnoreCase(expAlertMgs))
		{
			System.out.println("Test Pass :Updatebutton Alert Pop_Up Displayed As Expected");
			return true;
			
		}
		else
		{
			System.out.println("Test Fail :Updatebutton Alert Pop_Up Not Displayed As Expected");
			return false;
		}
	}
	

	
	
	public boolean checkSavingVoucherInOpeningStocksNewWithFIFOWithFarthestAndFromTop() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		System.out.println("****************checkSavingVoucherInOpeningStocksNewWithFIFOWithFarthestAndFromTop Method Executed ***********************");
		
			
		 Thread.sleep(2000);
		    
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
		inventoryMenu.click();
	    
		Thread.sleep(2000);
		
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(invTransactionsMenu));
	    invTransactionsMenu.click();
	    
	    Thread.sleep(2000);
	    
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(invTransStocksMenu));
	    invTransStocksMenu.click();
	    
	    Thread.sleep(2000);
		
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(openingStocksNewVoucher));
	    openingStocksNewVoucher.click();
	    
	    
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();
		
		checkUserFriendlyMessage();
		
        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(warehouseTxt));
		warehouseTxt.click();
		warehouseTxt.sendKeys(Keys.SPACE);
	    
		ArrayList<String> actWarehouseOpt = new ArrayList<String>(); 
		
		int warehouselist=warehouseHeaderComboList.size();
		
		String actWarehouseList= actWarehouseOpt.toString();
            
        for (int i = 0; i < warehouselist; i++) 
		{
					String warehouse=warehouseHeaderComboList.get(i).getText();
					
					
					
		     if (warehouse.equalsIgnoreCase("SECUNDERABAD")) 
		     {
					System.out.println("Entered If Loop");
					
					warehouseHeaderComboList.get(i).click();
					
					warehouseTxt.sendKeys(Keys.TAB);
					
					break;
				}
		}

            getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
			select1stRow_1stColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
			enter_ItemTxt.sendKeys(Keys.SPACE);
			
			int itemsCount=itemComboList.size();
			
			for (int i = 0; i < itemsCount; i++) 
			{
				String item=itemComboList.get(i).getText();
				
				System.out.println(i+"  "+item);
				
				if (item.equalsIgnoreCase("FIFO COGS ITEM")) 
				{
					System.out.println("Entered If Loop");
					
					itemComboList.get(i).click();
					
					enter_ItemTxt.sendKeys(Keys.TAB);
					
					break;
				}
			}
			
            getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_UnitTxt));
			enter_UnitTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
			enter_Quantity.sendKeys(Keys.END,Keys.SHIFT,Keys.HOME);
			enter_Quantity.sendKeys("0.5");
			enter_Quantity.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
			enter_Rate.sendKeys(Keys.END,Keys.SHIFT,Keys.HOME);
			enter_Rate.sendKeys("15.00");
			enter_Rate.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
			enter_Gross.sendKeys(Keys.TAB);

			
			Thread.sleep(2000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binSearchBtn));
            binSearchBtn.click();
			
            Thread.sleep(2000);
            
            getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binselect4thRow_1stColumn));
    		getAction().doubleClick(binselect4thRow_1stColumn).build().perform();
    		
            
            
            
			int binInwardGridListCount = binInwardGridList.size();
			
			ArrayList<String> binInwardGridListArray = new ArrayList<String>();
			
			for(int i=0;i<binInwardGridListCount;i++)
			{
				String data = binInwardGridList.get(i).getText();
				binInwardGridListArray.add(data);
			}
			
			
			String actbinInwardGridList=binInwardGridListArray.toString();
			
			String expbinInwardGridList="[, BG2, , 0.00, , 0.00, 0.00, 0.00, 0.00, , , , 0.00, , , , , , Bin Update, , 0.00, , 90.00, 0.00, 90.00, 90.00, , , , 0.00, , , , , , Bin1, , 0.00, , 90.00, 0.00, 90.00, 90.00, , , , 0.00, , , , , , Bin2, , 0.00, , 90.00, 0.00, 90.00, 90.00, , , , 6.00, , , , ]";
			
			System.out.println("ActbinInwardGridList : " + actbinInwardGridList);
			System.out.println("ExpbinInwardGridList : " + expbinInwardGridList);
		
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binOkBtn));
			binOkBtn.click();
			
			Thread.sleep(2000);
			
			String actselect1stRow_7thColumn=select1stRow_7thColumn.getText();
			String expselect1stRow_7thColumn="Bin2";

			System.out.println("ACtselect1stRow_7thColumn   : "+actselect1stRow_7thColumn +" Value Expected  : "+expselect1stRow_7thColumn);
			
			String docno=documentNumberTxt.getAttribute("value");
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
			saveBtn.click();
			

			boolean savingMessage=checkVoucherSavingMessage(docno);
			
			String actMessage=Boolean.toString(savingMessage);
			String expMessage="true";
			
			if (actMessage.equalsIgnoreCase(expMessage) && actbinInwardGridList.equalsIgnoreCase(expbinInwardGridList) && 
					 
					actselect1stRow_7thColumn.equalsIgnoreCase(expselect1stRow_7thColumn)) 
			{
				System.out.println("Test Pass: Voucher Saved Successfully");
				return true;
				
			}
			else
			{

				System.out.println("Test Fail: Voucher Saved Successfully");
				return false;
			}
	}

	
	
	public boolean CheckEnabletheOptionAllocateIntoPartiallyWithFarthestAndFromBottom() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		System.out.println("*******CheckEnabletheOptionAllocateIntoPartiallyWithFarthestAndFromBottom Method Excuted ******************");
		
		Thread.sleep(3000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(SettingsmenuBtn));
		SettingsmenuBtn.click();
		
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ConfigureTransactionBtn));
		ConfigureTransactionBtn.click();
		
		
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(BinsBtn));
		BinsBtn.click();
		
		
		
		if (AllocateIntoPartiallyChkBox.isSelected()==false)
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(AllocateIntoPartiallyChkBox));
			AllocateIntoPartiallyChkBox.click();
			
		}
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(PlaceTheItemfirstDropdown));
		PlaceTheItemfirstDropdown.click();
		
		int PlaceTheItemfirstDrpDwnListCount=PlaceTheItemfirstDrpDwnList.size();
		for (int i = 0; i < PlaceTheItemfirstDrpDwnListCount; i++) 
		{
			String data=PlaceTheItemfirstDrpDwnList.get(i).getText();
			if (data.equalsIgnoreCase(" Farthest and from bottom "))
			{
				PlaceTheItemfirstDrpDwnList.get(i).click();
			}
		}
		
		
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(UpdateBtn));
		UpdateBtn.click();
		
		getWaitForAlert();
		
		String actAlertMgs  =getAlert().getText();
		String expAlertMgs  ="Do you want to save the changes?";
		
		
		
		System.out.println("AlertMessage     : "+actAlertMgs    +" Value Expected : "+expAlertMgs);	
		
		getAlert().accept();
		
		
		 String expMessage="";
			
		 String actMessage=checkValidationMessage(expMessage);
		
		
		 Thread.sleep(2000);
			
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplay));
		userNameDisplay.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
		logoutOption.click();
	 
		 
		
		if(actAlertMgs.equalsIgnoreCase(expAlertMgs))
		{
			System.out.println("Test Pass :Updatebutton Alert Pop_Up Displayed As Expected");
			return true;
			
		}
		else
		{
			System.out.println("Test Fail :Updatebutton Alert Pop_Up Not Displayed As Expected");
			return false;
		}
	}
	

	
	
	public boolean checkSavingVoucherInOpeningStocksNewWithFIFOWithFarthestAndFromBottom() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		System.out.println("****************checkSavingVoucherInOpeningStocksNewWithFIFOWithFarthestAndFromBottom Method Executed ***********************");
		
			
		 Thread.sleep(2000);
		    
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
		inventoryMenu.click();
	    
		Thread.sleep(2000);
		
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(invTransactionsMenu));
	    invTransactionsMenu.click();
	    
	    Thread.sleep(2000);
	    
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(invTransStocksMenu));
	    invTransStocksMenu.click();
	    
	    Thread.sleep(2000);
		
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(openingStocksNewVoucher));
	    openingStocksNewVoucher.click();
	    
	    
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();
		
		checkUserFriendlyMessage();
		
        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(warehouseTxt));
		warehouseTxt.click();
		warehouseTxt.sendKeys(Keys.SPACE);
	    
		ArrayList<String> actWarehouseOpt = new ArrayList<String>(); 
		
		int warehouselist=warehouseHeaderComboList.size();
		
		String actWarehouseList= actWarehouseOpt.toString();
            
        for (int i = 0; i < warehouselist; i++) 
		{
					String warehouse=warehouseHeaderComboList.get(i).getText();
					
		     if (warehouse.equalsIgnoreCase("SECUNDERABAD")) 
		     {
					System.out.println("Entered If Loop");
					
					warehouseHeaderComboList.get(i).click();
					
					warehouseTxt.sendKeys(Keys.TAB);
					
					break;
				}
		}

            getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
			select1stRow_1stColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
			enter_ItemTxt.sendKeys(Keys.SPACE);
			
			int itemsCount=itemComboList.size();
			
			for (int i = 0; i < itemsCount; i++) 
			{
				String item=itemComboList.get(i).getText();
				
				
				if (item.equalsIgnoreCase("FIFO COGS ITEM")) 
				{
					System.out.println("Entered If Loop");
					
					itemComboList.get(i).click();
					
					enter_ItemTxt.sendKeys(Keys.TAB);
					
					break;
				}
			}
			
            getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_UnitTxt));
			enter_UnitTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
			enter_Quantity.sendKeys(Keys.END,Keys.SHIFT,Keys.HOME);
			enter_Quantity.sendKeys("1");
			enter_Quantity.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
			enter_Rate.sendKeys(Keys.END,Keys.SHIFT,Keys.HOME);
			enter_Rate.sendKeys("15.00");
			enter_Rate.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
			enter_Gross.sendKeys(Keys.TAB);

			
			Thread.sleep(2000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binSearchBtn));
            binSearchBtn.click();
			
            Thread.sleep(2000);
            
            Thread.sleep(2000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binAutoAllocateBtn));
            binAutoAllocateBtn.click();
            
			int binInwardGridListCount = binInwardGridList.size();
			
			ArrayList<String> binInwardGridListArray = new ArrayList<String>();
			
			for(int i=0;i<binInwardGridListCount;i++)
			{
				String data = binInwardGridList.get(i).getText();
				binInwardGridListArray.add(data);
			}
			
			String actbinInwardGridList=binInwardGridListArray.toString();
			
			String expbinInwardGridList="[, BG2, , 0.00, , 0.00, 0.00, 0.00, 0.00, , , , 0.00, , , , , , Bin Update, , 0.00, , 90.00, 0.00, 90.00, 90.00, , , , 0.00, , , , , , Bin1, , 0.00, , 90.00, 0.00, 90.00, 90.00, , , , 12.00, , , , , , Bin2, , 0.00, , 90.00, 0.00, 90.00, 90.00, , , , 0.00, , , , ]";
			
			System.out.println("ActbinInwardGridList : " + actbinInwardGridList);
			System.out.println("ExpbinInwardGridList : " + expbinInwardGridList);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binOkBtn));
			binOkBtn.click();
			
			
			String actselect1stRow_7thColumn=select1stRow_7thColumn.getText();
			String expselect1stRow_7thColumn="Bin1";

			System.out.println("ACtselect1stRow_7thColumn   : "+actselect1stRow_7thColumn +" Value Expected  : "+expselect1stRow_7thColumn);
			
			
			String docno=documentNumberTxt.getAttribute("value");
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
			saveBtn.click();
			

			boolean savingMessage=checkVoucherSavingMessage(docno);
			
			String actMessage=Boolean.toString(savingMessage);
			String expMessage="true";
			
			
			
			if (actMessage.equalsIgnoreCase(expMessage) && actbinInwardGridList.equalsIgnoreCase(expbinInwardGridList) && 
					 
					actselect1stRow_7thColumn.equalsIgnoreCase(expselect1stRow_7thColumn)) 
			{
				System.out.println("Test Pass: Voucher Saved Successfully");
				return true;
				
			}
			else
			{

				System.out.println("Test Fail: Voucher Saved Successfully");
				return false;
			}
	}

	
	//Issuing Options
	public boolean CheckEnabletheOptionPickFrompartiallyFilledBinsFirstWithCLoset() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		System.out.println("*******CheckEnabletheOptionPickFrompartiallyFilledBinsFirstWithCLoset Method Excuted ******************");
		
		Thread.sleep(3000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(SettingsmenuBtn));
		SettingsmenuBtn.click();
		
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ConfigureTransactionBtn));
		ConfigureTransactionBtn.click();
		
		
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(BinsBtn));
		BinsBtn.click();
		
		
		
		if (AllocateIntoPartiallyChkBox.isSelected()==true)
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(AllocateIntoPartiallyChkBox));
			AllocateIntoPartiallyChkBox.click();
			
		}
		
		
		
		
		Select s=new Select(PlaceTheItemfirstDropdown);
		
		s.selectByValue("0");
		
		
		if (PickfromPartiallychkbox.isSelected()==false)
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(PickfromPartiallychkbox));
			PickfromPartiallychkbox.click();
			
		}
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(PickTheItemFirstdropdown));
		PickTheItemFirstdropdown.click();
		
		int PickTheItemFirstdrpdwnListCount=PickTheItemFirstdrpdwnList.size();
		for (int i = 0; i < PickTheItemFirstdrpdwnListCount; i++) 
		{
			String data=PickTheItemFirstdrpdwnList.get(i).getText();
			if (data.equalsIgnoreCase("Closest"))
			{
				PickTheItemFirstdrpdwnList.get(i).click();
			}
		}
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(UpdateBtn));
		UpdateBtn.click();
		
		getWaitForAlert();
		
		String actAlertMgs  =getAlert().getText();
		String expAlertMgs  ="Do you want to save the changes?";
		
		
		
		System.out.println("AlertMessage     : "+actAlertMgs    +" Value Expected : "+expAlertMgs);	
		
		getAlert().accept();
		
		
		 String expMessage="";
			
		 String actMessage=checkValidationMessage(expMessage);
		
		
		 Thread.sleep(2000);
			
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplay));
		userNameDisplay.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
		logoutOption.click();
	 
		 
		
		if(actAlertMgs.equalsIgnoreCase(expAlertMgs))
		{
			System.out.println("Test Pass :Updatebutton Alert Pop_Up Displayed As Expected");
			return true;
			
		}
		else
		{
			System.out.println("Test Fail :Updatebutton Alert Pop_Up Not Displayed As Expected");
			return false;
		}
	}
	

	
	
	
	public boolean checkSavingVoucherInOpeningStocksNewWithPickFrompartiallyFilledBinsFirstWithCLoset() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		System.out.println("****************checkSavingVoucherInOpeningStocksNewWithPickFrompartiallyFilledBinsFirstWithCLoset Method Executed ***********************");
		
		Thread.sleep(2000);
		    
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
		inventoryMenu.click();
	    
		Thread.sleep(2000);
		
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(invTransactionsMenu));
	    invTransactionsMenu.click();
	    
	    Thread.sleep(2000);
	    
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(invTransStocksMenu));
	    invTransStocksMenu.click();
	    
	    Thread.sleep(2000);
		
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(openingStocksNewVoucher));
	    openingStocksNewVoucher.click();
	    
	    
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();
		
		checkUserFriendlyMessage();
		
        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(warehouseTxt));
		warehouseTxt.click();
		warehouseTxt.sendKeys(Keys.SPACE);
	    
		ArrayList<String> actWarehouseOpt = new ArrayList<String>(); 
		
		int warehouselist=warehouseHeaderComboList.size();
		
		String actWarehouseList= actWarehouseOpt.toString();
            
        for (int i = 0; i < warehouselist; i++) 
		{
					String warehouse=warehouseHeaderComboList.get(i).getText();
					
		     if (warehouse.equalsIgnoreCase("SECUNDERABAD")) 
		     {
					System.out.println("Entered If Loop");
					
					warehouseHeaderComboList.get(i).click();
					
					warehouseTxt.sendKeys(Keys.TAB);
					
					break;
				}
		}

            getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
			select1stRow_1stColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
			enter_ItemTxt.sendKeys(Keys.SPACE);
			
			int itemsCount=itemComboList.size();
			
			for (int i = 0; i < itemsCount; i++) 
			{
				String item=itemComboList.get(i).getText();
				
				
				if (item.equalsIgnoreCase("FIFO COGS ITEM")) 
				{
					System.out.println("Entered If Loop");
					
					itemComboList.get(i).click();
					
					enter_ItemTxt.sendKeys(Keys.TAB);
					
					break;
				}
			}
			
            getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_UnitTxt));
			enter_UnitTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
			enter_Quantity.sendKeys(Keys.END,Keys.SHIFT,Keys.HOME);
			enter_Quantity.sendKeys("3");
			enter_Quantity.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
			enter_Rate.sendKeys(Keys.END,Keys.SHIFT,Keys.HOME);
			enter_Rate.sendKeys("15.00");
			enter_Rate.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
			enter_Gross.sendKeys(Keys.TAB);

			
			Thread.sleep(2000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binSearchBtn));
            binSearchBtn.click();
			
            Thread.sleep(2000);
            
            getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binselect2ndRow_8thColumn));
            binselect2ndRow_8thColumn.click();
            
            binEnter8thColumn.click();
            
            binEnter8thColumn.sendKeys(Keys.END,Keys.SHIFT,Keys.HOME);
            
            binEnter8thColumn.sendKeys("12");
            
            Thread.sleep(2000);
            binEnter8thColumn.sendKeys(Keys.TAB);
            
            Thread.sleep(2000);
           
            binEnter8thColumn.click();
            
            binEnter8thColumn.sendKeys(Keys.END,Keys.SHIFT,Keys.HOME);
            
            binEnter8thColumn.sendKeys("12");
            
            Thread.sleep(2000);
            binEnter8thColumn.sendKeys(Keys.TAB);
            
            Thread.sleep(2000);
            binEnter8thColumn.click();
            
            binEnter8thColumn.sendKeys(Keys.END,Keys.SHIFT,Keys.HOME);
            
            binEnter8thColumn.sendKeys("12");
            Thread.sleep(2000);
            
            binEnter8thColumn.sendKeys(Keys.TAB);
            
            
			int binInwardGridListCount = binInwardGridList.size();
			
			ArrayList<String> binInwardGridListArray = new ArrayList<String>();
			
			for(int i=0;i<binInwardGridListCount;i++)
			{
				String data = binInwardGridList.get(i).getText();
				binInwardGridListArray.add(data);
			}
			
			String actbinInwardGridList=binInwardGridListArray.toString();
			
			String expbinInwardGridList="[, BG2, , 0.00, , 0.00, 0.00, 0.00, 0.00, , , , 0.00, , , , , , Bin Update, , 0.00, , 90.00, 0.00, 90.00, 90.00, , , , 12.00, , , , , , Bin1, , 0.00, , 90.00, 0.00, 90.00, 90.00, , , , 12.00, , , , , , Bin2, , 0.00, , 90.00, 0.00, 90.00, 90.00, , , , 12.00, , , , ]";
			
			System.out.println("ActbinInwardGridList : " + actbinInwardGridList);
			System.out.println("ExpbinInwardGridList : " + expbinInwardGridList);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binOkBtn));
			binOkBtn.click();
			
			
			String actselect1stRow_7thColumn=select1stRow_7thColumn.getText();
			String expselect1stRow_7thColumn="Bin Update";

			System.out.println("ACtselect1stRow_7thColumn   : "+actselect1stRow_7thColumn +" Value Expected  : "+expselect1stRow_7thColumn);
			
			String actselect2ndRow_7thColumn=select2ndRow_7thColumn.getText();
			String expselect2ndRow_7thColumn="Bin1";

			System.out.println("actselect2ndRow_7thColumn   : "+actselect2ndRow_7thColumn +" Value Expected  : "+expselect2ndRow_7thColumn);
			
			
			String actselect3rdRow_7thColumn=select3rdRow_7thColumn.getText();
			String expselect3rdRow_7thColumn="Bin2";

			System.out.println("actselect3rdRow_7thColumn   : "+actselect3rdRow_7thColumn +" Value Expected  : "+expselect3rdRow_7thColumn);
			
			
			
			String docno=documentNumberTxt.getAttribute("value");
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
			saveBtn.click();
			

			boolean savingMessage=checkVoucherSavingMessage(docno);
			
			String actMessage=Boolean.toString(savingMessage);
			String expMessage="true";
			
			if (actMessage.equalsIgnoreCase(expMessage) &&  
					 
					actselect1stRow_7thColumn.equalsIgnoreCase(expselect1stRow_7thColumn) && 
					actselect3rdRow_7thColumn.equalsIgnoreCase(expselect3rdRow_7thColumn) && 
					actselect2ndRow_7thColumn.equalsIgnoreCase(expselect2ndRow_7thColumn)) 
			{
				System.out.println("Test Pass: Voucher Saved Successfully");
				return true;
				
			}
			else
			{
				System.out.println("Test Fail: Voucher Saved Successfully");
				return false;
			}
	}

	
	
	
	
	public boolean checkSavingSalesInvoiceVoucherWithithPickFrompartiallyFilledBinsFirstWithCLoset() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		
		
		System.out.println("**************************checkSavingSalesInvoiceVoucherWithithPickFrompartiallyFilledBinsFirstWithCLoset Method Executes *************************");
		
		        
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
			financialsMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
			financialsTransactionMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialTransactionSalesMenu));
			financialTransactionSalesMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesInvoicesVoucher));
			salesInvoiceVATVoucher.click();

            getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
			newBtn.click();
			
			checkUserFriendlyMessage();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerAccountTxt));
			customerAccountTxt.click();
			customerAccountTxt.sendKeys(Keys.END);
			customerAccountTxt.sendKeys(Keys.SHIFT,Keys.HOME);
			customerAccountTxt.sendKeys(Keys.SPACE);
			
			int customerAccountCount=customerAccountComboList.size();
			
			System.out.println("Customer Account List Size: "+customerAccountCount);
			
			for (int i = 0; i < customerAccountCount; i++) 
			{
				String customerAccount=customerAccountComboList.get(i).getText();
				
				if (customerAccount.equalsIgnoreCase("Customer A"))
				{
					System.out.println("Entered If Loop");
					
					customerAccountComboList.get(i).click();
					
					customerAccountTxt.sendKeys(Keys.TAB);
					
					break;
				}
			}
			customerAccountTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherHeaderCurrency));
			voucherHeaderCurrency.click();
			voucherHeaderCurrency.sendKeys(Keys.END);
			voucherHeaderCurrency.sendKeys(Keys.SHIFT,Keys.HOME);
			voucherHeaderCurrency.sendKeys(Keys.SPACE);
			
			int currencyCount=currencyComboList.size();
			
			for (int i = 0; i < currencyCount; i++) 
			{
				String currency=currencyComboList.get(i).getText();
				
				System.out.println(i+"  "+currency);
				
				if (currency.equalsIgnoreCase("INR"))
				{
					System.out.println("Entered If Loop");
					
					currencyComboList.get(i).click();
					
					voucherHeaderCurrency.sendKeys(Keys.TAB);
					
					break;
				}
			}
			voucherHeaderCurrency.sendKeys(Keys.TAB);
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
			departmentTxt.click();
			departmentTxt.sendKeys(Keys.END);
			departmentTxt.sendKeys(Keys.SHIFT,Keys.HOME);
			departmentTxt.sendKeys(Keys.SPACE);
			
			int departmentCount=departmentComboList.size();
			
			for (int i = 0; i < departmentCount; i++) 
			{
				String department=departmentComboList.get(i).getText();
				
				System.out.println(i+"  "+department);
				
				if (department.equalsIgnoreCase("INDIA"))
				{
					System.out.println("Entered If Loop");
					
					departmentComboList.get(i).click();
					
					departmentTxt.sendKeys(Keys.TAB);
					
					break;
				}
			}
			departmentTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesInvoiceVATPlaceOFSupply));
			salesInvoiceVATPlaceOFSupply.click();
			salesInvoiceVATPlaceOFSupply.sendKeys(Keys.END);
			salesInvoiceVATPlaceOFSupply.sendKeys(Keys.SHIFT,Keys.HOME);
			salesInvoiceVATPlaceOFSupply.sendKeys(Keys.SPACE);
			
			
			int placeOFSupplyListCount=placeOFSupplyList.size();
			
			System.err.println("placeOFSupplyListCount   : "+placeOFSupplyListCount);
				
			for(int i=0 ; i < placeOFSupplyListCount ;i++)
			{
				String data=placeOFSupplyList.get(i).getText();
				
				if(data.equalsIgnoreCase("Abu Dhabi"))
				{
					placeOFSupplyList.get(i).click();
					
					break;
				}
			}
				
			
			salesInvoiceVATPlaceOFSupply.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesInvoiceVATJuridictionxt));
			salesInvoiceVATJuridictionxt.click();
			salesInvoiceVATJuridictionxt.sendKeys(Keys.END);
			salesInvoiceVATJuridictionxt.sendKeys(Keys.SHIFT,Keys.HOME);
			salesInvoiceVATJuridictionxt.sendKeys(Keys.SPACE);
			
			
			int JuridictionListCount=JuridictionList.size();
			
			System.err.println("JuridictionList   : "+JuridictionListCount);
				
			for(int i=0 ; i < JuridictionListCount ;i++)
			{
				String data=JuridictionList.get(i).getText();
				
				if(data.equalsIgnoreCase("Abu Dhabi"))
				{
					JuridictionList.get(i).click();
					
					break;
				}
			}
				
			
			salesInvoiceVATJuridictionxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
			select1stRow_1stColumn.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pvWarehouseTxt));
			pvWarehouseTxt.sendKeys(Keys.END);
			pvWarehouseTxt.sendKeys(Keys.SHIFT,Keys.HOME);
			pvWarehouseTxt.sendKeys(Keys.SPACE);
			
			int warehouselist=warehouseBodyComboList.size();
			
			
			ArrayList<String> actWarehouseOpt = new ArrayList<String>();
			
			System.out.println("******* Warehouse List: "+warehouselist);
			
			for (int i = 0; i < warehouselist; i++) 
			{
				String warehouse=warehouseBodyComboList.get(i).getText();
				
				
				
				if (warehouse.equalsIgnoreCase("SECUNDERABAD"))
				{
					System.out.println("Entered If Loop");
					
					warehouseBodyComboList.get(i).click();
					
					pvWarehouseTxt.sendKeys(Keys.TAB);
					
					break;
				}
			}
			

            getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
            enter_ItemTxt.sendKeys(Keys.END);
            enter_ItemTxt.sendKeys(Keys.SHIFT,Keys.HOME);
			enter_ItemTxt.sendKeys(Keys.SPACE);
			
			int itemsCount=itemComboList.size();
			
			for (int i = 0; i < itemsCount; i++) 
			{
				String item=itemComboList.get(i).getText();
				
				if (item.equalsIgnoreCase("FIFO COGS ITEM")) 
				{
					System.out.println("Entered If Loop");
					
					itemComboList.get(i).click();
					
					enter_ItemTxt.sendKeys(Keys.TAB);
					
					break;
				}
			}
			
		
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_5thColumn));
			select1stRow_5thColumn.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_8thColumn));
			select1stRow_8thColumn.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_AQTxt));
			enter_AQTxt.clear();
			enter_AQTxt.sendKeys(Keys.END);
			enter_AQTxt.sendKeys(Keys.SHIFT,Keys.HOME);
			enter_AQTxt.sendKeys("12");
			enter_AQTxt.sendKeys(Keys.TAB);
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_FQTxt));
			enter_FQTxt.clear();
			enter_FQTxt.sendKeys(Keys.TAB);
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_14thColumn));
			select1stRow_14thColumn.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
			enter_Rate.sendKeys("10");
			enter_Rate.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
			enter_Gross.sendKeys(Keys.TAB);
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_20thColumn));
			select1stRow_20thColumn.click();
			
			
			Thread.sleep(2000);
			binSearchBtn.click();
			
			Thread.sleep(3000);
            
            getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binAutoAllocateBtn));
           
            binAutoAllocateBtn.click();
			
			String actbinoutwardRowTotalToBePicked	=binoutwardRowTotalToBePicked.getText();
			
			int binInwardGridListCount = binInwardGridList.size();
			
			ArrayList<String> binInwardGridListArray = new ArrayList<String>();
			
			for(int i=0;i<binInwardGridListCount;i++)
			{
				String data = binInwardGridList.get(i).getText();
				binInwardGridListArray.add(data);
			}
			
			
			String actbinInwardGridList=binInwardGridListArray.toString();
			
			String expbinInwardGridList="[, Bin Update, , 12.00, 12.00, 90.00, 12.00, 78.00, 78.00, , , , 12.00, , , , , , Bin1, , 12.00, 12.00, 90.00, 12.00, 78.00, 78.00, , , , 0.00, , , , , , Bin2, , 12.00, 12.00, 90.00, 12.00, 78.00, 78.00, , , , 0.00, , , , ]";
			
			System.out.println("ActbinInwardGridList : " + actbinInwardGridList);
			System.out.println("ExpbinInwardGridList : " + expbinInwardGridList);

           
			Thread.sleep(2000);

            getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binOkBtn));
			binOkBtn.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_20thColumn));
			
			String actBin=select1stRow_20thColumn.getText();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
			String docno=documentNumberTxt.getAttribute("value");
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
			saveBtn.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pickBtn));
			pickBtn.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newReferenceTxt));
			String actNewReference=newReferenceTxt.getAttribute("value");

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(Bill_OkBtn));
			Bill_OkBtn.click();
			
			Thread.sleep(2000);

			
			boolean savingMessage=checkVoucherSavingMessage(docno);
		    
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
			String actNewDocNo=documentNumberTxt.getAttribute("value");
			
			String expBin          ="Bin Update";
			String expNewReference ="120.00";
			String expNewDocNo     ="2";
			
			System.out.println("********** Bin Column     : "+actBin           +"  value expected  "+expBin);
			System.out.println("********** New Reference  : "+actNewReference  +"  value expected  "+expNewReference);
			System.out.println("********** New Voucher No : "+actNewDocNo      +"  value expected  "+expNewDocNo);
						
			if(actBin.equalsIgnoreCase(expBin) && actNewReference.equalsIgnoreCase(expNewReference) && actNewDocNo.equalsIgnoreCase(expNewDocNo) && savingMessage==true) 
			{
				System.out.println("***Test Pass: Sales Invoice N Voucher Saved Successfully***");
				return true;
			}
			else
			{
				System.out.println("***Test Fail: Sales Invoice N Voucher NOT Saved Successfully***");
				return false;
			}
		}
	
	


  //Issuing Options
  		public boolean CheckEnabletheOptionPickFrompartiallyFilledBinsFirstWithFarthest() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
  		{
  			
  			System.out.println("*******CheckEnabletheOptionPickFrompartiallyFilledBinsFirstWithFarthest Method Excuted ******************");
  			
  			Thread.sleep(3000);
  			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(SettingsmenuBtn));
  			SettingsmenuBtn.click();
  			
  			Thread.sleep(2000);
  			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ConfigureTransactionBtn));
  			ConfigureTransactionBtn.click();
  			
  			
  			Thread.sleep(2000);
  			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(BinsBtn));
  			BinsBtn.click();
  			
  			
  			
  			

			if (AllocateIntoPartiallyChkBox.isSelected()==false)
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(AllocateIntoPartiallyChkBox));
				AllocateIntoPartiallyChkBox.click();
				
			}
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(PlaceTheItemfirstDropdown));
			PlaceTheItemfirstDropdown.click();
			
			int PlaceTheItemfirstDrpDwnListCount=PlaceTheItemfirstDrpDwnList.size();
			for (int i = 0; i < PlaceTheItemfirstDrpDwnListCount; i++) 
			{
				String data=PlaceTheItemfirstDrpDwnList.get(i).getText();
				if (data.equalsIgnoreCase(" Farthest "))
				{
					PlaceTheItemfirstDrpDwnList.get(i).click();
				}
			}
			
  			if (PickfromPartiallychkbox.isSelected()==false)
  			{
  				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(PickfromPartiallychkbox));
  				PickfromPartiallychkbox.click();
  				
  			}
  			
  			
  			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(PickTheItemFirstdropdown));
  			PickTheItemFirstdropdown.click();
  			
  			int PickTheItemFirstdrpdwnListCount=PickTheItemFirstdrpdwnList.size();
  			for (int i = 0; i < PickTheItemFirstdrpdwnListCount; i++) 
  			{
  				String data=PickTheItemFirstdrpdwnList.get(i).getText();
  				if (data.equalsIgnoreCase(" Farthest "))
  				{
  					PickTheItemFirstdrpdwnList.get(i).click();
  				}
  			}
  			
  			
  			
  			
  			Thread.sleep(2000);
  			
  			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(UpdateBtn));
  			UpdateBtn.click();
  			
  			getWaitForAlert();
  			
  			String actAlertMgs  =getAlert().getText();
  			String expAlertMgs  ="Do you want to save the changes?";
  			
  			
  			
  			System.out.println("AlertMessage     : "+actAlertMgs    +" Value Expected : "+expAlertMgs);	
  			
  			getAlert().accept();
  			
  			
  			 String expMessage="";
  				
  			 String actMessage=checkValidationMessage(expMessage);
  			
  			
  			 Thread.sleep(2000);
  				
  			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplay));
  			userNameDisplay.click();
  			
  			Thread.sleep(2000);
  			
  			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
  			logoutOption.click();
  		 
  			 
  			
  			if(actAlertMgs.equalsIgnoreCase(expAlertMgs))
  			{
  				System.out.println("Test Pass :Updatebutton Alert Pop_Up Displayed As Expected");
  				return true;
  				
  			}
  			else
  			{
  				System.out.println("Test Fail :Updatebutton Alert Pop_Up Not Displayed As Expected");
  				return false;
  			}
  		}
  		

  		
  		
  		
  		public boolean checkSavingVoucherInOpeningStocksNewWithPickFrompartiallyFilledBinsFirstWithFarthest() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
  		{
  			
  			System.out.println("****************checkSavingVoucherInOpeningStocksNewWithPickFrompartiallyFilledBinsFirstWithFarthest Method Executed ***********************");
  			
  				
  			 Thread.sleep(2000);
  			    
  			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
  			inventoryMenu.click();
  		    
  			Thread.sleep(2000);
  			
  		    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(invTransactionsMenu));
  		    invTransactionsMenu.click();
  		    
  		    Thread.sleep(2000);
  		    
  		    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(invTransStocksMenu));
  		    invTransStocksMenu.click();
  		    
  		    Thread.sleep(2000);
  			
  		    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(openingStocksNewVoucher));
  		    openingStocksNewVoucher.click();
  		    
  		    
  		    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
  			newBtn.click();
  			
  			checkUserFriendlyMessage();
  			
              getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(warehouseTxt));
  			warehouseTxt.click();
  			warehouseTxt.sendKeys(Keys.SPACE);
  		    
  			ArrayList<String> actWarehouseOpt = new ArrayList<String>(); 
  			
  			int warehouselist=warehouseHeaderComboList.size();
  			
  			String actWarehouseList= actWarehouseOpt.toString();
  	            
  	        for (int i = 0; i < warehouselist; i++) 
  			{
  						String warehouse=warehouseHeaderComboList.get(i).getText();
  						
  			     if (warehouse.equalsIgnoreCase("SECUNDERABAD")) 
  			     {
  						System.out.println("Entered If Loop");
  						
  						warehouseHeaderComboList.get(i).click();
  						
  						warehouseTxt.sendKeys(Keys.TAB);
  						
  						break;
  					}
  			}

                  getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
  				select1stRow_1stColumn.click();
  				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
  				enter_ItemTxt.sendKeys(Keys.SPACE);
  				
  				int itemsCount=itemComboList.size();
  				
  				for (int i = 0; i < itemsCount; i++) 
  				{
  					String item=itemComboList.get(i).getText();
  					
  					
  					if (item.equalsIgnoreCase("FIFO COGS ITEM")) 
  					{
  						System.out.println("Entered If Loop");
  						
  						itemComboList.get(i).click();
  						
  						enter_ItemTxt.sendKeys(Keys.TAB);
  						
  						break;
  					}
  				}
  				
                  getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_UnitTxt));
  				enter_UnitTxt.sendKeys(Keys.TAB);
  				
  				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
  				enter_Quantity.sendKeys(Keys.END,Keys.SHIFT,Keys.HOME);
  				enter_Quantity.sendKeys("1");
  				enter_Quantity.sendKeys(Keys.TAB);
  				
  				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
  				enter_Rate.sendKeys(Keys.END,Keys.SHIFT,Keys.HOME);
  				enter_Rate.sendKeys("15.00");
  				enter_Rate.sendKeys(Keys.TAB);
  				
  				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
  				enter_Gross.sendKeys(Keys.TAB);

  				
  				Thread.sleep(2000);
  				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binSearchBtn));
                  binSearchBtn.click();
  				
                  Thread.sleep(2000);
                  
                  getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binAutoAllocateBtn));
                  binAutoAllocateBtn.click();
                  
                    
                  
  				int binInwardGridListCount = binInwardGridList.size();
  				
  				ArrayList<String> binInwardGridListArray = new ArrayList<String>();
  				
  				for(int i=0;i<binInwardGridListCount;i++)
  				{
  					String data = binInwardGridList.get(i).getText();
  					binInwardGridListArray.add(data);
  				}
  				
  				String actbinInwardGridList=binInwardGridListArray.toString();
  				
  				String expbinInwardGridList="[, BG2, , 0.00, , 0.00, 0.00, 0.00, 0.00, , , , 0.00, , , , , , Bin Update, , 0.00, , 90.00, 0.00, 90.00, 90.00, , , , 0.00, , , , , , Bin1, , 0.00, , 90.00, 0.00, 90.00, 90.00, , , , 12.00, , , , , , Bin2, , 0.00, , 90.00, 0.00, 90.00, 90.00, , , , 0.00, , , , ]";
  				
  				System.out.println("ActbinInwardGridList : " + actbinInwardGridList);
  				System.out.println("ExpbinInwardGridList : " + expbinInwardGridList);
  				
  				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binOkBtn));
  				binOkBtn.click();
  				
  				
  				String actselect1stRow_7thColumn=select1stRow_7thColumn.getText();
  				String expselect1stRow_7thColumn="Bin1";

  				System.out.println("ACtselect1stRow_7thColumn   : "+actselect1stRow_7thColumn +" Value Expected  : "+expselect1stRow_7thColumn);
  				
  				
  				String docno=documentNumberTxt.getAttribute("value");
  				
  				Thread.sleep(1000);
  				
  				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
  				saveBtn.click();
  				

  				boolean savingMessage=checkVoucherSavingMessage(docno);
  				
  				String actMessage=Boolean.toString(savingMessage);
  				String expMessage="true";
  				
  				if (actMessage.equalsIgnoreCase(expMessage) && actbinInwardGridList.equalsIgnoreCase(expbinInwardGridList) && 
  						 
  						actselect1stRow_7thColumn.equalsIgnoreCase(expselect1stRow_7thColumn) ) 
  				{
  					System.out.println("Test Pass: Voucher Saved Successfully");
  					return true;
  					
  				}
  				else
  				{
  					System.out.println("Test Fail: Voucher Saved Successfully");
  					return false;
  				}
  		}

  		
  		
  		
  		
  		public boolean checkSavingSalesInvoiceVoucherWithithPickFrompartiallyFilledBinsFirstWithFarthest() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
  		{
  			
  			
  			System.out.println("**************************checkSavingSalesInvoiceVoucherWithithPickFrompartiallyFilledBinsFirstWithFarthest Method Executes *************************");
  			
  			        
  				Thread.sleep(2000);
  				
  				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
  				financialsMenu.click();
  				
  				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
  				financialsTransactionMenu.click();
  				
  				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialTransactionSalesMenu));
  				financialTransactionSalesMenu.click();
  				
  				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesInvoicesVoucher));
  				salesInvoiceVATVoucher.click();

  	            getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
  				newBtn.click();
  				
  				checkUserFriendlyMessage();
  				
  				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerAccountTxt));
  				customerAccountTxt.click();
  				customerAccountTxt.sendKeys(Keys.END);
  				customerAccountTxt.sendKeys(Keys.SHIFT,Keys.HOME);
  				customerAccountTxt.sendKeys(Keys.SPACE);
  				
  				int customerAccountCount=customerAccountComboList.size();
  				
  				System.out.println("Customer Account List Size: "+customerAccountCount);
  				
  				for (int i = 0; i < customerAccountCount; i++) 
  				{
  					String customerAccount=customerAccountComboList.get(i).getText();
  					
  					if (customerAccount.equalsIgnoreCase("Customer A"))
  					{
  						System.out.println("Entered If Loop");
  						
  						customerAccountComboList.get(i).click();
  						
  						customerAccountTxt.sendKeys(Keys.TAB);
  						
  						break;
  					}
  				}
  				customerAccountTxt.sendKeys(Keys.TAB);
  				
  				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherHeaderCurrency));
  				voucherHeaderCurrency.click();
  				voucherHeaderCurrency.sendKeys(Keys.END);
  				voucherHeaderCurrency.sendKeys(Keys.SHIFT,Keys.HOME);
  				voucherHeaderCurrency.sendKeys(Keys.SPACE);
  				
  				int currencyCount=currencyComboList.size();
  				
  				for (int i = 0; i < currencyCount; i++) 
  				{
  					String currency=currencyComboList.get(i).getText();
  					
  					System.out.println(i+"  "+currency);
  					
  					if (currency.equalsIgnoreCase("INR"))
  					{
  						System.out.println("Entered If Loop");
  						
  						currencyComboList.get(i).click();
  						
  						voucherHeaderCurrency.sendKeys(Keys.TAB);
  						
  						break;
  					}
  				}
  				voucherHeaderCurrency.sendKeys(Keys.TAB);
  				
  				
  				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
  				departmentTxt.click();
  				departmentTxt.sendKeys(Keys.END);
  				departmentTxt.sendKeys(Keys.SHIFT,Keys.HOME);
  				departmentTxt.sendKeys(Keys.SPACE);
  				
  				int departmentCount=departmentComboList.size();
  				
  				for (int i = 0; i < departmentCount; i++) 
  				{
  					String department=departmentComboList.get(i).getText();
  					
  					System.out.println(i+"  "+department);
  					
  					if (department.equalsIgnoreCase("INDIA"))
  					{
  						System.out.println("Entered If Loop");
  						
  						departmentComboList.get(i).click();
  						
  						departmentTxt.sendKeys(Keys.TAB);
  						
  						break;
  					}
  				}
  				departmentTxt.sendKeys(Keys.TAB);
  				
  				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesInvoiceVATPlaceOFSupply));
  				salesInvoiceVATPlaceOFSupply.click();
  				salesInvoiceVATPlaceOFSupply.sendKeys(Keys.END);
  				salesInvoiceVATPlaceOFSupply.sendKeys(Keys.SHIFT,Keys.HOME);
  				salesInvoiceVATPlaceOFSupply.sendKeys(Keys.SPACE);
  				
  				
  				int placeOFSupplyListCount=placeOFSupplyList.size();
  				
  				System.err.println("placeOFSupplyListCount   : "+placeOFSupplyListCount);
  					
  				for(int i=0 ; i < placeOFSupplyListCount ;i++)
  				{
  					String data=placeOFSupplyList.get(i).getText();
  					
  					if(data.equalsIgnoreCase("Abu Dhabi"))
  					{
  						placeOFSupplyList.get(i).click();
  						
  						break;
  					}
  				}
  					
  				
  				salesInvoiceVATPlaceOFSupply.sendKeys(Keys.TAB);
  				
  				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesInvoiceVATJuridictionxt));
  				salesInvoiceVATJuridictionxt.click();
  				salesInvoiceVATJuridictionxt.sendKeys(Keys.END);
  				salesInvoiceVATJuridictionxt.sendKeys(Keys.SHIFT,Keys.HOME);
  				salesInvoiceVATJuridictionxt.sendKeys(Keys.SPACE);
  				
  				
  				int JuridictionListCount=JuridictionList.size();
  				
  				System.err.println("JuridictionList   : "+JuridictionListCount);
  					
  				for(int i=0 ; i < JuridictionListCount ;i++)
  				{
  					String data=JuridictionList.get(i).getText();
  					
  					if(data.equalsIgnoreCase("Abu Dhabi"))
  					{
  						JuridictionList.get(i).click();
  						
  						break;
  					}
  				}
  					
  				
  				salesInvoiceVATJuridictionxt.sendKeys(Keys.TAB);
  				
  				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
  				select1stRow_1stColumn.click();
  				
  				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pvWarehouseTxt));
  				pvWarehouseTxt.sendKeys(Keys.END);
  				pvWarehouseTxt.sendKeys(Keys.SHIFT,Keys.HOME);
  				pvWarehouseTxt.sendKeys(Keys.SPACE);
  				
  				int warehouselist=warehouseBodyComboList.size();
  				
  				
  				ArrayList<String> actWarehouseOpt = new ArrayList<String>();
  				
  				System.out.println("******* Warehouse List: "+warehouselist);
  				
  				for (int i = 0; i < warehouselist; i++) 
  				{
  					String warehouse=warehouseBodyComboList.get(i).getText();
  					
  					
  					
  					if (warehouse.equalsIgnoreCase("SECUNDERABAD"))
  					{
  						System.out.println("Entered If Loop");
  						
  						warehouseBodyComboList.get(i).click();
  						
  						pvWarehouseTxt.sendKeys(Keys.TAB);
  						
  						break;
  					}
  				}
  				

  	            getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
  	            enter_ItemTxt.sendKeys(Keys.END);
  	            enter_ItemTxt.sendKeys(Keys.SHIFT,Keys.HOME);
  				enter_ItemTxt.sendKeys(Keys.SPACE);
  				
  				int itemsCount=itemComboList.size();
  				
  				for (int i = 0; i < itemsCount; i++) 
  				{
  					String item=itemComboList.get(i).getText();
  					
  					if (item.equalsIgnoreCase("FIFO COGS ITEM")) 
  					{
  						System.out.println("Entered If Loop");
  						
  						itemComboList.get(i).click();
  						
  						enter_ItemTxt.sendKeys(Keys.TAB);
  						
  						break;
  					}
  				}
  				
  				
  				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_5thColumn));
  				select1stRow_5thColumn.click();
  				
  				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_8thColumn));
  				select1stRow_8thColumn.click();
  				
  				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_AQTxt));
  				enter_AQTxt.clear();
  				enter_AQTxt.sendKeys(Keys.END);
  				enter_AQTxt.sendKeys(Keys.SHIFT,Keys.HOME);
  				enter_AQTxt.sendKeys("12");
  				enter_AQTxt.sendKeys(Keys.TAB);
  				
  				
  				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_FQTxt));
  				enter_FQTxt.clear();
  				enter_FQTxt.sendKeys(Keys.TAB);
  				
  				
  				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_14thColumn));
  				select1stRow_14thColumn.click();
  				
  				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
  				enter_Rate.sendKeys("10");
  				enter_Rate.sendKeys(Keys.TAB);
  				
  				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
  				enter_Gross.sendKeys(Keys.TAB);
  				
  				
  				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_20thColumn));
  				select1stRow_20thColumn.click();
  				
  				
  				Thread.sleep(2000);
  				binSearchBtn.click();
  				
  				Thread.sleep(3000);
  	            
  	            getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binAutoAllocateBtn));
  	           
  	            binAutoAllocateBtn.click();
  				
  				String actbinoutwardRowTotalToBePicked	=binoutwardRowTotalToBePicked.getText();
  				
  				int binInwardGridListCount = binInwardGridList.size();
  				
  				ArrayList<String> binInwardGridListArray = new ArrayList<String>();
  				
  				for(int i=0;i<binInwardGridListCount;i++)
  				{
  					String data = binInwardGridList.get(i).getText();
  					binInwardGridListArray.add(data);
  				}
  				
  				
  				String actbinInwardGridList=binInwardGridListArray.toString();
  				
  				String expbinInwardGridList="[, Bin1, , 12.00, 12.00, 90.00, 12.00, 78.00, 78.00, , , , 12.00, , , , ]";
  				
  				System.out.println("ActbinInwardGridList : " + actbinInwardGridList);
  				System.out.println("ExpbinInwardGridList : " + expbinInwardGridList);

  	           
  				Thread.sleep(2000);

  	            getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binOkBtn));
  				binOkBtn.click();
  				
  				Thread.sleep(2000);
  				
  				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_20thColumn));
  				
  				String actBin=select1stRow_20thColumn.getText();
  				
  				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
  				String docno=documentNumberTxt.getAttribute("value");
  				
  				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
  				saveBtn.click();
  				
  				Thread.sleep(2000);
  				
  				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pickBtn));
  				pickBtn.click();
  				
  				Thread.sleep(2000);
  				
  				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newReferenceTxt));
  				String actNewReference=newReferenceTxt.getAttribute("value");

  				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(Bill_OkBtn));
  				Bill_OkBtn.click();
  				
  				Thread.sleep(2000);

  				
  				boolean savingMessage=checkVoucherSavingMessage(docno);
  			    
  				
  				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
  				String actNewDocNo=documentNumberTxt.getAttribute("value");
  				
  				String expBin          ="Bin1";
  				String expNewReference ="120.00";
  				String expNewDocNo     ="2";
  				
  				System.out.println("********** Bin Column     : "+actBin           +"  value expected  "+expBin);
  				System.out.println("********** New Reference  : "+actNewReference  +"  value expected  "+expNewReference);
  				System.out.println("********** New Voucher No : "+actNewDocNo      +"  value expected  "+expNewDocNo);
  							
  				if(actBin.equalsIgnoreCase(expBin) && actNewReference.equalsIgnoreCase(expNewReference) && actNewDocNo.equalsIgnoreCase(expNewDocNo) && savingMessage==true) 
  				{
  					System.out.println("***Test Pass: Sales Invoice N Voucher Saved Successfully***");
  					return true;
  				}
  				else
  				{
  					System.out.println("***Test Fail: Sales Invoice N Voucher NOT Saved Successfully***");
  					return false;
  				}
  			}
  		
  		

	
	


      //Issuing Options
      		public boolean CheckEnabletheOptionPickFrompartiallyFilledBinsFirstWithClosestAndFromTop() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
      		{
      			
      			System.out.println("*******CheckEnabletheOptionPickFrompartiallyFilledBinsFirstWithClosestAndFromTop Method Excuted ******************");
      			
      			Thread.sleep(3000);
      			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(SettingsmenuBtn));
      			SettingsmenuBtn.click();
      			
      			Thread.sleep(2000);
      			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ConfigureTransactionBtn));
      			ConfigureTransactionBtn.click();
      			
      			
      			Thread.sleep(2000);
      			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(BinsBtn));
      			BinsBtn.click();
      			
      			
    			if (AllocateIntoPartiallyChkBox.isSelected()==true)
    			{
    				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(AllocateIntoPartiallyChkBox));
    				AllocateIntoPartiallyChkBox.click();
    				
    			}
    			
    			Select s=new Select(PlaceTheItemfirstDropdown);
    			
    			s.selectByValue("0");
      			
      			
      			if (PickfromPartiallychkbox.isSelected()==false)
      			{
      				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(PickfromPartiallychkbox));
      				PickfromPartiallychkbox.click();
      				
      			}
      			
      			
      			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(PickTheItemFirstdropdown));
      			PickTheItemFirstdropdown.click();
      			
      			int PickTheItemFirstdrpdwnListCount=PickTheItemFirstdrpdwnList.size();
      			for (int i = 0; i < PickTheItemFirstdrpdwnListCount; i++) 
      			{
      				String data=PickTheItemFirstdrpdwnList.get(i).getText();
      				if (data.equalsIgnoreCase("Closest and from top"))
      				{
      					PickTheItemFirstdrpdwnList.get(i).click();
      				}
      			}
      			
      			
      			Thread.sleep(2000);
      			
      			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(UpdateBtn));
      			UpdateBtn.click();
      			
      			getWaitForAlert();
      			
      			String actAlertMgs  =getAlert().getText();
      			String expAlertMgs  ="Do you want to save the changes?";
      			
      			
      			
      			System.out.println("AlertMessage     : "+actAlertMgs    +" Value Expected : "+expAlertMgs);	
      			
      			getAlert().accept();
      			
      			
      			 String expMessage="";
      				
      			 String actMessage=checkValidationMessage(expMessage);
      			
      			
      			 Thread.sleep(2000);
      				
      			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplay));
      			userNameDisplay.click();
      			
      			Thread.sleep(2000);
      			
      			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
      			logoutOption.click();
      		 
      			 
      			
      			if(actAlertMgs.equalsIgnoreCase(expAlertMgs))
      			{
      				System.out.println("Test Pass :Updatebutton Alert Pop_Up Displayed As Expected");
      				return true;
      				
      			}
      			else
      			{
      				System.out.println("Test Fail :Updatebutton Alert Pop_Up Not Displayed As Expected");
      				return false;
      			}
      		}
      		

      		
      		
      		
      		public boolean checkSavingVoucherInOpeningStocksNewWithPickFrompartiallyFilledBinsFirstWithClosestAndFromTop() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
      		{
      			
      			System.out.println("****************checkSavingVoucherInOpeningStocksNewWithPickFrompartiallyFilledBinsFirstWithClosestAndFromTop Method Executed ***********************");
      			
      				
      			 Thread.sleep(2000);
      			    
      			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
      			inventoryMenu.click();
      		    
      			Thread.sleep(2000);
      			
      		    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(invTransactionsMenu));
      		    invTransactionsMenu.click();
      		    
      		    Thread.sleep(2000);
      		    
      		    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(invTransStocksMenu));
      		    invTransStocksMenu.click();
      		    
      		    Thread.sleep(2000);
      			
      		    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(openingStocksNewVoucher));
      		    openingStocksNewVoucher.click();
      		    
      		    
      		    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
      			newBtn.click();
      			
      			checkUserFriendlyMessage();
      			
                  getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(warehouseTxt));
      			warehouseTxt.click();
      			warehouseTxt.sendKeys(Keys.SPACE);
      		    
      			ArrayList<String> actWarehouseOpt = new ArrayList<String>(); 
      			
      			int warehouselist=warehouseHeaderComboList.size();
      			
      			String actWarehouseList= actWarehouseOpt.toString();
      	            
      	        for (int i = 0; i < warehouselist; i++) 
      			{
      						String warehouse=warehouseHeaderComboList.get(i).getText();
      						
      			     if (warehouse.equalsIgnoreCase("SECUNDERABAD")) 
      			     {
      						System.out.println("Entered If Loop");
      						
      						warehouseHeaderComboList.get(i).click();
      						
      						warehouseTxt.sendKeys(Keys.TAB);
      						
      						break;
      					}
      			}

                      getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
      				select1stRow_1stColumn.click();
      				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
      				enter_ItemTxt.sendKeys(Keys.SPACE);
      				
      				int itemsCount=itemComboList.size();
      				
      				for (int i = 0; i < itemsCount; i++) 
      				{
      					String item=itemComboList.get(i).getText();
      					
      					
      					if (item.equalsIgnoreCase("FIFO COGS ITEM")) 
      					{
      						System.out.println("Entered If Loop");
      						
      						itemComboList.get(i).click();
      						
      						enter_ItemTxt.sendKeys(Keys.TAB);
      						
      						break;
      					}
      				}
      				
                      getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_UnitTxt));
      				enter_UnitTxt.sendKeys(Keys.TAB);
      				
      				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
      				enter_Quantity.sendKeys(Keys.END,Keys.SHIFT,Keys.HOME);
      				enter_Quantity.sendKeys("3");
      				enter_Quantity.sendKeys(Keys.TAB);
      				
      				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
      				enter_Rate.sendKeys(Keys.END,Keys.SHIFT,Keys.HOME);
      				enter_Rate.sendKeys("15.00");
      				enter_Rate.sendKeys(Keys.TAB);
      				
      				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
      				enter_Gross.sendKeys(Keys.TAB);

      				
	      			Thread.sleep(2000);
	      			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binSearchBtn));
                    binSearchBtn.click();
      				
                  Thread.sleep(2000);
                  
                  getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binselect2ndRow_8thColumn));
                  binselect2ndRow_8thColumn.click();
                  
                  binEnter8thColumn.click();
                  
                  binEnter8thColumn.sendKeys(Keys.END,Keys.SHIFT,Keys.HOME);
                  
                  binEnter8thColumn.sendKeys("12");
                  
                  Thread.sleep(2000);
                  binEnter8thColumn.sendKeys(Keys.TAB);
                  
                  Thread.sleep(2000);
                 /* getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binselect3rdRow_8thColumn));
                  binselect3rdRow_8thColumn.click();
                  */
                  binEnter8thColumn.click();
                  
                  binEnter8thColumn.sendKeys(Keys.END,Keys.SHIFT,Keys.HOME);
                  
                  binEnter8thColumn.sendKeys("12");
                  
                  Thread.sleep(2000);
                  binEnter8thColumn.sendKeys(Keys.TAB);
                  
                  Thread.sleep(2000);
                  binEnter8thColumn.click();
                  
                  binEnter8thColumn.sendKeys(Keys.END,Keys.SHIFT,Keys.HOME);
                  
                  binEnter8thColumn.sendKeys("12");
                  Thread.sleep(2000);
                  
                  binEnter8thColumn.sendKeys(Keys.TAB);
                  
                      
      				int binInwardGridListCount = binInwardGridList.size();
      				
      				ArrayList<String> binInwardGridListArray = new ArrayList<String>();
      				
      				for(int i=0;i<binInwardGridListCount;i++)
      				{
      					String data = binInwardGridList.get(i).getText();
      					binInwardGridListArray.add(data);
      				}
      				
      				String actbinInwardGridList=binInwardGridListArray.toString();
      				
      				String expbinInwardGridList="[, BG2, , 0.00, , 0.00, 0.00, 0.00, 0.00, , , , 0.00, , , , , , Bin Update, , 0.00, , 90.00, 0.00, 90.00, 90.00, , , , 12.00, , , , , , Bin1, , 0.00, , 90.00, 0.00, 90.00, 90.00, , , , 12.00, , , , , , Bin2, , 0.00, , 90.00, 0.00, 90.00, 90.00, , , , 12.00, , , , ]";
      				
      				System.out.println("ActbinInwardGridList : " + actbinInwardGridList);
      				System.out.println("ExpbinInwardGridList : " + expbinInwardGridList);
      				
      				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binOkBtn));
      				binOkBtn.click();
      				
      				
      				String actselect1stRow_7thColumn=select1stRow_7thColumn.getText();
      				String expselect1stRow_7thColumn="Bin Update";

      				System.out.println("ACtselect1stRow_7thColumn   : "+actselect1stRow_7thColumn +" Value Expected  : "+expselect1stRow_7thColumn);
      				
      				
      				String docno=documentNumberTxt.getAttribute("value");
      				
      				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
      				saveBtn.click();
      				

      				boolean savingMessage=checkVoucherSavingMessage(docno);
      				
      				String actMessage=Boolean.toString(savingMessage);
      				String expMessage="true";
      				
      				if (actMessage.equalsIgnoreCase(expMessage) && actbinInwardGridList.equalsIgnoreCase(expbinInwardGridList) && 
      						 
      						actselect1stRow_7thColumn.equalsIgnoreCase(expselect1stRow_7thColumn) ) 
      				{
      					System.out.println("Test Pass: Voucher Saved Successfully");
      					return true;
      					
      				}
      				else
      				{
      					System.out.println("Test Fail: Voucher Saved Successfully");
      					return false;
      				}
      		}

      		
      		
      		
      		
     public boolean checkSavingSalesInvoiceVoucherWithithPickFrompartiallyFilledBinsFirstWithClosestAndFromTop() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
		{
		
			
			    System.out.println("**************************checkSavingSalesInvoiceVoucherWithithPickFrompartiallyFilledBinsFirstWithClosestAndFromTop Method Executes *************************");
			
			        
				Thread.sleep(2000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
				financialsMenu.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
				financialsTransactionMenu.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialTransactionSalesMenu));
				financialTransactionSalesMenu.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesInvoicesVoucher));
				salesInvoiceVATVoucher.click();

	            getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
				newBtn.click();
				
				checkUserFriendlyMessage();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerAccountTxt));
				customerAccountTxt.click();
				customerAccountTxt.sendKeys(Keys.END);
				customerAccountTxt.sendKeys(Keys.SHIFT,Keys.HOME);
				customerAccountTxt.sendKeys(Keys.SPACE);
				
				int customerAccountCount=customerAccountComboList.size();
				
				System.out.println("Customer Account List Size: "+customerAccountCount);
				
				for (int i = 0; i < customerAccountCount; i++) 
				{
					String customerAccount=customerAccountComboList.get(i).getText();
					
					if (customerAccount.equalsIgnoreCase("Customer A"))
					{
						System.out.println("Entered If Loop");
						
						customerAccountComboList.get(i).click();
						
						customerAccountTxt.sendKeys(Keys.TAB);
						
						break;
					}
				}
				customerAccountTxt.sendKeys(Keys.TAB);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherHeaderCurrency));
				voucherHeaderCurrency.click();
				voucherHeaderCurrency.sendKeys(Keys.END);
				voucherHeaderCurrency.sendKeys(Keys.SHIFT,Keys.HOME);
				voucherHeaderCurrency.sendKeys(Keys.SPACE);
				
				int currencyCount=currencyComboList.size();
				
				for (int i = 0; i < currencyCount; i++) 
				{
					String currency=currencyComboList.get(i).getText();
					
					System.out.println(i+"  "+currency);
					
					if (currency.equalsIgnoreCase("INR"))
					{
						System.out.println("Entered If Loop");
						
						currencyComboList.get(i).click();
						
						voucherHeaderCurrency.sendKeys(Keys.TAB);
						
						break;
					}
				}
				voucherHeaderCurrency.sendKeys(Keys.TAB);
				
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
				departmentTxt.click();
				departmentTxt.sendKeys(Keys.END);
				departmentTxt.sendKeys(Keys.SHIFT,Keys.HOME);
				departmentTxt.sendKeys(Keys.SPACE);
				
				int departmentCount=departmentComboList.size();
				
				for (int i = 0; i < departmentCount; i++) 
				{
					String department=departmentComboList.get(i).getText();
					
					System.out.println(i+"  "+department);
					
					if (department.equalsIgnoreCase("INDIA"))
					{
						System.out.println("Entered If Loop");
						
						departmentComboList.get(i).click();
						
						departmentTxt.sendKeys(Keys.TAB);
						
						break;
					}
				}
				departmentTxt.sendKeys(Keys.TAB);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesInvoiceVATPlaceOFSupply));
				salesInvoiceVATPlaceOFSupply.click();
				salesInvoiceVATPlaceOFSupply.sendKeys(Keys.END);
				salesInvoiceVATPlaceOFSupply.sendKeys(Keys.SHIFT,Keys.HOME);
				salesInvoiceVATPlaceOFSupply.sendKeys(Keys.SPACE);
				
				
				int placeOFSupplyListCount=placeOFSupplyList.size();
				
				System.err.println("placeOFSupplyListCount   : "+placeOFSupplyListCount);
					
				for(int i=0 ; i < placeOFSupplyListCount ;i++)
				{
					String data=placeOFSupplyList.get(i).getText();
					
					if(data.equalsIgnoreCase("Abu Dhabi"))
					{
						placeOFSupplyList.get(i).click();
						
						break;
					}
				}
					
				
				salesInvoiceVATPlaceOFSupply.sendKeys(Keys.TAB);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesInvoiceVATJuridictionxt));
				salesInvoiceVATJuridictionxt.click();
				salesInvoiceVATJuridictionxt.sendKeys(Keys.END);
				salesInvoiceVATJuridictionxt.sendKeys(Keys.SHIFT,Keys.HOME);
				salesInvoiceVATJuridictionxt.sendKeys(Keys.SPACE);
				
				
				int JuridictionListCount=JuridictionList.size();
				
				System.err.println("JuridictionList   : "+JuridictionListCount);
					
				for(int i=0 ; i < JuridictionListCount ;i++)
				{
					String data=JuridictionList.get(i).getText();
					
					if(data.equalsIgnoreCase("Abu Dhabi"))
					{
						JuridictionList.get(i).click();
						
						break;
					}
				}
					
				
				salesInvoiceVATJuridictionxt.sendKeys(Keys.TAB);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
				select1stRow_1stColumn.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pvWarehouseTxt));
				pvWarehouseTxt.sendKeys(Keys.END);
				pvWarehouseTxt.sendKeys(Keys.SHIFT,Keys.HOME);
				pvWarehouseTxt.sendKeys(Keys.SPACE);
				
				int warehouselist=warehouseBodyComboList.size();
				
				
				ArrayList<String> actWarehouseOpt = new ArrayList<String>();
				
				System.out.println("******* Warehouse List: "+warehouselist);
				
				for (int i = 0; i < warehouselist; i++) 
				{
					String warehouse=warehouseBodyComboList.get(i).getText();
					
					
					
					if (warehouse.equalsIgnoreCase("SECUNDERABAD"))
					{
						System.out.println("Entered If Loop");
						
						warehouseBodyComboList.get(i).click();
						
						pvWarehouseTxt.sendKeys(Keys.TAB);
						
						break;
					}
				}
				

	            getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
	            enter_ItemTxt.sendKeys(Keys.END);
	            enter_ItemTxt.sendKeys(Keys.SHIFT,Keys.HOME);
				enter_ItemTxt.sendKeys(Keys.SPACE);
				
				int itemsCount=itemComboList.size();
				
				for (int i = 0; i < itemsCount; i++) 
				{
					String item=itemComboList.get(i).getText();
					
					if (item.equalsIgnoreCase("FIFO COGS ITEM")) 
					{
						System.out.println("Entered If Loop");
						
						itemComboList.get(i).click();
						
						enter_ItemTxt.sendKeys(Keys.TAB);
						
						break;
					}
				}
				
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_5thColumn));
				select1stRow_5thColumn.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_8thColumn));
				select1stRow_8thColumn.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_AQTxt));
				enter_AQTxt.clear();
				enter_AQTxt.sendKeys(Keys.END);
				enter_AQTxt.sendKeys(Keys.SHIFT,Keys.HOME);
				enter_AQTxt.sendKeys("12");
				enter_AQTxt.sendKeys(Keys.TAB);
				
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_FQTxt));
				enter_FQTxt.clear();
				enter_FQTxt.sendKeys(Keys.TAB);
				
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_14thColumn));
				select1stRow_14thColumn.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
				enter_Rate.sendKeys("10");
				enter_Rate.sendKeys(Keys.TAB);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
				enter_Gross.sendKeys(Keys.TAB);
				
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_20thColumn));
				select1stRow_20thColumn.click();
				
				
				Thread.sleep(2000);
				binSearchBtn.click();
				
				Thread.sleep(3000);
	            
	            getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binAutoAllocateBtn));
	           
	            binAutoAllocateBtn.click();
				
				String actbinoutwardRowTotalToBePicked	=binoutwardRowTotalToBePicked.getText();
				
				int binInwardGridListCount = binInwardGridList.size();
				
				ArrayList<String> binInwardGridListArray = new ArrayList<String>();
				
				for(int i=0;i<binInwardGridListCount;i++)
				{
					String data = binInwardGridList.get(i).getText();
					binInwardGridListArray.add(data);
				}
				
				
				String actbinInwardGridList=binInwardGridListArray.toString();
				
				String expbinInwardGridList="[, Bin Update, , 12.00, 12.00, 90.00, 12.00, 78.00, 78.00, , , , 12.00, , , , , , Bin1, , 12.00, 12.00, 90.00, 12.00, 78.00, 78.00, , , , 0.00, , , , , , Bin2, , 12.00, 12.00, 90.00, 12.00, 78.00, 78.00, , , , 0.00, , , , ]";
				
				System.out.println("ActbinInwardGridList : " + actbinInwardGridList);
				System.out.println("ExpbinInwardGridList : " + expbinInwardGridList);

	           
				Thread.sleep(2000);

	            getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binOkBtn));
				binOkBtn.click();
				
				Thread.sleep(2000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_20thColumn));
				
				String actBin=select1stRow_20thColumn.getText();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
				String docno=documentNumberTxt.getAttribute("value");
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
				saveBtn.click();
				
				Thread.sleep(2000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pickBtn));
				pickBtn.click();
				
				Thread.sleep(2000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newReferenceTxt));
				String actNewReference=newReferenceTxt.getAttribute("value");

				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(Bill_OkBtn));
				Bill_OkBtn.click();
				
				Thread.sleep(2000);

				
				boolean savingMessage=checkVoucherSavingMessage(docno);
			    
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
				String actNewDocNo=documentNumberTxt.getAttribute("value");
				
				String expBin          ="Bin Update";
				String expNewReference ="120.00";
				String expNewDocNo     ="2";
				
				System.out.println("********** Bin Column     : "+actBin           +"  value expected  "+expBin);
				System.out.println("********** New Reference  : "+actNewReference  +"  value expected  "+expNewReference);
				System.out.println("********** New Voucher No : "+actNewDocNo      +"  value expected  "+expNewDocNo);
							
				if(actBin.equalsIgnoreCase(expBin) && actNewReference.equalsIgnoreCase(expNewReference) && actNewDocNo.equalsIgnoreCase(expNewDocNo) && savingMessage==true) 
				{
					System.out.println("***Test Pass: Sales Invoice N Voucher Saved Successfully***");
					return true;
				}
				else
				{
					System.out.println("***Test Fail: Sales Invoice N Voucher NOT Saved Successfully***");
					return false;
				}
			}
      		
	
	
    

      //Issuing Options
      		public boolean CheckEnabletheOptionPickFrompartiallyFilledBinsFirstWithClosestAndFromBottom() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
      		{
      			
      			System.out.println("*******CheckEnabletheOptionPickFrompartiallyFilledBinsFirstWithClosestAndFromBottom Method Excuted ******************");
      			
      			Thread.sleep(3000);
      			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(SettingsmenuBtn));
      			SettingsmenuBtn.click();
      			
      			Thread.sleep(2000);
      			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ConfigureTransactionBtn));
      			ConfigureTransactionBtn.click();
      			
      			
      			Thread.sleep(2000);
      			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(BinsBtn));
      			BinsBtn.click();
      			
      			
    			if (AllocateIntoPartiallyChkBox.isSelected()==true)
    			{
    				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(AllocateIntoPartiallyChkBox));
    				AllocateIntoPartiallyChkBox.click();
    				
    			}
    			
    			Select s=new Select(PlaceTheItemfirstDropdown);
    			
    			s.selectByValue("0");
      			
      			
      			if (PickfromPartiallychkbox.isSelected()==false)
      			{
      				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(PickfromPartiallychkbox));
      				PickfromPartiallychkbox.click();
      				
      			}
      			
      			
      			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(PickTheItemFirstdropdown));
      			PickTheItemFirstdropdown.click();
      			
      			int PickTheItemFirstdrpdwnListCount=PickTheItemFirstdrpdwnList.size();
      			for (int i = 0; i < PickTheItemFirstdrpdwnListCount; i++) 
      			{
      				String data=PickTheItemFirstdrpdwnList.get(i).getText();
      				if (data.equalsIgnoreCase(" Closest and from bottom "))
      				{
      					PickTheItemFirstdrpdwnList.get(i).click();
      				}
      			}
      			
      			
               
      			Thread.sleep(2000);
      			
      			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(UpdateBtn));
      			UpdateBtn.click();
      			
      			getWaitForAlert();
      			
      			String actAlertMgs  =getAlert().getText();
      			String expAlertMgs  ="Do you want to save the changes?";
      			
      			
      			
      			System.out.println("AlertMessage     : "+actAlertMgs    +" Value Expected : "+expAlertMgs);	
      			
      			getAlert().accept();
      			
      			
      			 String expMessage="";
      				
      			 String actMessage=checkValidationMessage(expMessage);
      			
      			
      			 Thread.sleep(2000);
      				
      			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplay));
      			userNameDisplay.click();
      			
      			Thread.sleep(2000);
      			
      			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
      			logoutOption.click();
      		 
      			 
      			
      			if(actAlertMgs.equalsIgnoreCase(expAlertMgs))
      			{
      				System.out.println("Test Pass :Updatebutton Alert Pop_Up Displayed As Expected");
      				return true;
      				
      			}
      			else
      			{
      				System.out.println("Test Fail :Updatebutton Alert Pop_Up Not Displayed As Expected");
      				return false;
      			}
      		}
      		

      		
      		
      		
      		public boolean checkSavingVoucherInOpeningStocksNewWithPickFrompartiallyFilledBinsFirstWithClosestAndFromBottom() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
      		{
      			
      			System.out.println("****************checkSavingVoucherInOpeningStocksNewWithPickFrompartiallyFilledBinsFirstWithClosestAndFromBottom Method Executed ***********************");
      			
      				
      			 Thread.sleep(2000);
      			    
      			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
      			inventoryMenu.click();
      		    
      			Thread.sleep(2000);
      			
      		    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(invTransactionsMenu));
      		    invTransactionsMenu.click();
      		    
      		    Thread.sleep(2000);
      		    
      		    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(invTransStocksMenu));
      		    invTransStocksMenu.click();
      		    
      		    Thread.sleep(2000);
      			
      		    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(openingStocksNewVoucher));
      		    openingStocksNewVoucher.click();
      		    
      		    
      		    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
      			newBtn.click();
      			
      			checkUserFriendlyMessage();
      			
                  getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(warehouseTxt));
      			warehouseTxt.click();
      			warehouseTxt.sendKeys(Keys.SPACE);
      		    
      			ArrayList<String> actWarehouseOpt = new ArrayList<String>(); 
      			
      			int warehouselist=warehouseHeaderComboList.size();
      			
      			String actWarehouseList= actWarehouseOpt.toString();
      	            
      	        for (int i = 0; i < warehouselist; i++) 
      			{
      						String warehouse=warehouseHeaderComboList.get(i).getText();
      						
      			     if (warehouse.equalsIgnoreCase("SECUNDERABAD")) 
      			     {
      						System.out.println("Entered If Loop");
      						
      						warehouseHeaderComboList.get(i).click();
      						
      						warehouseTxt.sendKeys(Keys.TAB);
      						
      						break;
      					}
      			}

                      getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
      				select1stRow_1stColumn.click();
      				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
      				enter_ItemTxt.sendKeys(Keys.SPACE);
      				
      				int itemsCount=itemComboList.size();
      				
      				for (int i = 0; i < itemsCount; i++) 
      				{
      					String item=itemComboList.get(i).getText();
      					
      					
      					if (item.equalsIgnoreCase("FIFO COGS ITEM")) 
      					{
      						System.out.println("Entered If Loop");
      						
      						itemComboList.get(i).click();
      						
      						enter_ItemTxt.sendKeys(Keys.TAB);
      						
      						break;
      					}
      				}
      				
                    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_UnitTxt));
      				enter_UnitTxt.sendKeys(Keys.TAB);
      				
      				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
      				enter_Quantity.sendKeys(Keys.END,Keys.SHIFT,Keys.HOME);
      				enter_Quantity.sendKeys("3");
      				enter_Quantity.sendKeys(Keys.TAB);
      				
      				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
      				enter_Rate.sendKeys(Keys.END,Keys.SHIFT,Keys.HOME);
      				enter_Rate.sendKeys("15.00");
      				enter_Rate.sendKeys(Keys.TAB);
      				
      				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
      				enter_Gross.sendKeys(Keys.TAB);

      				
	      			Thread.sleep(2000);
	      			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binSearchBtn));
                    binSearchBtn.click();
      				
                 Thread.sleep(2000);
                 
                 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binselect2ndRow_8thColumn));
                 binselect2ndRow_8thColumn.click();
                 
                 binEnter8thColumn.click();
                 
                 binEnter8thColumn.sendKeys(Keys.END,Keys.SHIFT,Keys.HOME);
                 
                 binEnter8thColumn.sendKeys("12");
                 
                 Thread.sleep(2000);
                 binEnter8thColumn.sendKeys(Keys.TAB);
                 
                 Thread.sleep(2000);
                /* getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binselect3rdRow_8thColumn));
                 binselect3rdRow_8thColumn.click();
                 */
                 binEnter8thColumn.click();
                 
                 binEnter8thColumn.sendKeys(Keys.END,Keys.SHIFT,Keys.HOME);
                 
                 binEnter8thColumn.sendKeys("12");
                 
                 Thread.sleep(2000);
                 binEnter8thColumn.sendKeys(Keys.TAB);
                 
                 Thread.sleep(2000);
                 binEnter8thColumn.click();
                 
                 binEnter8thColumn.sendKeys(Keys.END,Keys.SHIFT,Keys.HOME);
                 
                 binEnter8thColumn.sendKeys("12");
                 Thread.sleep(2000);
                 
                 binEnter8thColumn.sendKeys(Keys.TAB);
                 
                      
      				int binInwardGridListCount = binInwardGridList.size();
      				
      				ArrayList<String> binInwardGridListArray = new ArrayList<String>();
      				
      				for(int i=0;i<binInwardGridListCount;i++)
      				{
      					String data = binInwardGridList.get(i).getText();
      					binInwardGridListArray.add(data);
      				}
      				
      				String actbinInwardGridList=binInwardGridListArray.toString();
      				
      				String expbinInwardGridList="[, BG2, , 0.00, , 0.00, 0.00, 0.00, 0.00, , , , 0.00, , , , , , Bin Update, , 0.00, , 90.00, 0.00, 90.00, 90.00, , , , 12.00, , , , , , Bin1, , 0.00, , 90.00, 0.00, 90.00, 90.00, , , , 12.00, , , , , , Bin2, , 0.00, , 90.00, 0.00, 90.00, 90.00, , , , 12.00, , , , ]";
      				
      				System.out.println("ActbinInwardGridList : " + actbinInwardGridList);
      				System.out.println("ExpbinInwardGridList : " + expbinInwardGridList);
      				
      				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binOkBtn));
      				binOkBtn.click();
      				
      				
      				String actselect1stRow_7thColumn=select1stRow_7thColumn.getText();
      				String expselect1stRow_7thColumn="Bin Update";

      				System.out.println("ACtselect1stRow_7thColumn   : "+actselect1stRow_7thColumn +" Value Expected  : "+expselect1stRow_7thColumn);
      				
      				
      				String docno=documentNumberTxt.getAttribute("value");
      				
      				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
      				saveBtn.click();
      				

      				boolean savingMessage=checkVoucherSavingMessage(docno);
      				
      				String actMessage=Boolean.toString(savingMessage);
      				String expMessage="true";
      				
      				if (actMessage.equalsIgnoreCase(expMessage) && actbinInwardGridList.equalsIgnoreCase(expbinInwardGridList) && 
      						 
      						actselect1stRow_7thColumn.equalsIgnoreCase(expselect1stRow_7thColumn) ) 
      				{
      					System.out.println("Test Pass: Voucher Saved Successfully");
      					return true;
      					
      				}
      				else
      				{
      					System.out.println("Test Fail: Voucher Saved Successfully");
      					return false;
      				}
      		}

      		
      		
      		
      		
     public boolean checkSavingSalesInvoiceVoucherWithithPickFrompartiallyFilledBinsFirstWithClosestAndFromBottom() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
		{
		
			
			    System.out.println("**************************checkSavingSalesInvoiceVoucherWithithPickFrompartiallyFilledBinsFirstWithClosestAndFromBottom Method Executes *************************");
			
			        
				Thread.sleep(2000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
				financialsMenu.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
				financialsTransactionMenu.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialTransactionSalesMenu));
				financialTransactionSalesMenu.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesInvoicesVoucher));
				salesInvoiceVATVoucher.click();

	            getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
				newBtn.click();
				
				checkUserFriendlyMessage();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerAccountTxt));
				customerAccountTxt.click();
				customerAccountTxt.sendKeys(Keys.END);
				customerAccountTxt.sendKeys(Keys.SHIFT,Keys.HOME);
				customerAccountTxt.sendKeys(Keys.SPACE);
				
				int customerAccountCount=customerAccountComboList.size();
				
				System.out.println("Customer Account List Size: "+customerAccountCount);
				
				for (int i = 0; i < customerAccountCount; i++) 
				{
					String customerAccount=customerAccountComboList.get(i).getText();
					
					if (customerAccount.equalsIgnoreCase("Customer A"))
					{
						System.out.println("Entered If Loop");
						
						customerAccountComboList.get(i).click();
						
						customerAccountTxt.sendKeys(Keys.TAB);
						
						break;
					}
				}
				customerAccountTxt.sendKeys(Keys.TAB);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherHeaderCurrency));
				voucherHeaderCurrency.click();
				voucherHeaderCurrency.sendKeys(Keys.END);
				voucherHeaderCurrency.sendKeys(Keys.SHIFT,Keys.HOME);
				voucherHeaderCurrency.sendKeys(Keys.SPACE);
				
				int currencyCount=currencyComboList.size();
				
				for (int i = 0; i < currencyCount; i++) 
				{
					String currency=currencyComboList.get(i).getText();
					
					System.out.println(i+"  "+currency);
					
					if (currency.equalsIgnoreCase("INR"))
					{
						System.out.println("Entered If Loop");
						
						currencyComboList.get(i).click();
						
						voucherHeaderCurrency.sendKeys(Keys.TAB);
						
						break;
					}
				}
				voucherHeaderCurrency.sendKeys(Keys.TAB);
				
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
				departmentTxt.click();
				departmentTxt.sendKeys(Keys.END);
				departmentTxt.sendKeys(Keys.SHIFT,Keys.HOME);
				departmentTxt.sendKeys(Keys.SPACE);
				
				int departmentCount=departmentComboList.size();
				
				for (int i = 0; i < departmentCount; i++) 
				{
					String department=departmentComboList.get(i).getText();
					
					System.out.println(i+"  "+department);
					
					if (department.equalsIgnoreCase("INDIA"))
					{
						System.out.println("Entered If Loop");
						
						departmentComboList.get(i).click();
						
						departmentTxt.sendKeys(Keys.TAB);
						
						break;
					}
				}
				departmentTxt.sendKeys(Keys.TAB);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesInvoiceVATPlaceOFSupply));
				salesInvoiceVATPlaceOFSupply.click();
				salesInvoiceVATPlaceOFSupply.sendKeys(Keys.END);
				salesInvoiceVATPlaceOFSupply.sendKeys(Keys.SHIFT,Keys.HOME);
				salesInvoiceVATPlaceOFSupply.sendKeys(Keys.SPACE);
				
				
				int placeOFSupplyListCount=placeOFSupplyList.size();
				
				System.err.println("placeOFSupplyListCount   : "+placeOFSupplyListCount);
					
				for(int i=0 ; i < placeOFSupplyListCount ;i++)
				{
					String data=placeOFSupplyList.get(i).getText();
					
					if(data.equalsIgnoreCase("Abu Dhabi"))
					{
						placeOFSupplyList.get(i).click();
						
						break;
					}
				}
					
				
				salesInvoiceVATPlaceOFSupply.sendKeys(Keys.TAB);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesInvoiceVATJuridictionxt));
				salesInvoiceVATJuridictionxt.click();
				salesInvoiceVATJuridictionxt.sendKeys(Keys.END);
				salesInvoiceVATJuridictionxt.sendKeys(Keys.SHIFT,Keys.HOME);
				salesInvoiceVATJuridictionxt.sendKeys(Keys.SPACE);
				
				
				int JuridictionListCount=JuridictionList.size();
				
				System.err.println("JuridictionList   : "+JuridictionListCount);
					
				for(int i=0 ; i < JuridictionListCount ;i++)
				{
					String data=JuridictionList.get(i).getText();
					
					if(data.equalsIgnoreCase("Abu Dhabi"))
					{
						JuridictionList.get(i).click();
						
						break;
					}
				}
					
				
				salesInvoiceVATJuridictionxt.sendKeys(Keys.TAB);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
				select1stRow_1stColumn.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pvWarehouseTxt));
				pvWarehouseTxt.sendKeys(Keys.END);
				pvWarehouseTxt.sendKeys(Keys.SHIFT,Keys.HOME);
				pvWarehouseTxt.sendKeys(Keys.SPACE);
				
				int warehouselist=warehouseBodyComboList.size();
				
				
				ArrayList<String> actWarehouseOpt = new ArrayList<String>();
				
				System.out.println("******* Warehouse List: "+warehouselist);
				
				for (int i = 0; i < warehouselist; i++) 
				{
					String warehouse=warehouseBodyComboList.get(i).getText();
					
					
					
					if (warehouse.equalsIgnoreCase("SECUNDERABAD"))
					{
						System.out.println("Entered If Loop");
						
						warehouseBodyComboList.get(i).click();
						
						pvWarehouseTxt.sendKeys(Keys.TAB);
						
						break;
					}
				}
				

	            getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
	            enter_ItemTxt.sendKeys(Keys.END);
	            enter_ItemTxt.sendKeys(Keys.SHIFT,Keys.HOME);
				enter_ItemTxt.sendKeys(Keys.SPACE);
				
				int itemsCount=itemComboList.size();
				
				for (int i = 0; i < itemsCount; i++) 
				{
					String item=itemComboList.get(i).getText();
					
					if (item.equalsIgnoreCase("FIFO COGS ITEM")) 
					{
						System.out.println("Entered If Loop");
						
						itemComboList.get(i).click();
						
						enter_ItemTxt.sendKeys(Keys.TAB);
						
						break;
					}
				}
				
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_5thColumn));
				select1stRow_5thColumn.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_8thColumn));
				select1stRow_8thColumn.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_AQTxt));
				enter_AQTxt.clear();
				enter_AQTxt.sendKeys(Keys.END);
				enter_AQTxt.sendKeys(Keys.SHIFT,Keys.HOME);
				enter_AQTxt.sendKeys("12");
				enter_AQTxt.sendKeys(Keys.TAB);
				
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_FQTxt));
				enter_FQTxt.clear();
				enter_FQTxt.sendKeys(Keys.TAB);
				
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_14thColumn));
				select1stRow_14thColumn.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
				enter_Rate.sendKeys("10");
				enter_Rate.sendKeys(Keys.TAB);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
				enter_Gross.sendKeys(Keys.TAB);
				
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_20thColumn));
				select1stRow_20thColumn.click();
				
				
				Thread.sleep(2000);
				binSearchBtn.click();
				
				Thread.sleep(3000);
	            
	            getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binAutoAllocateBtn));
	           
	            binAutoAllocateBtn.click();
				
				String actbinoutwardRowTotalToBePicked	=binoutwardRowTotalToBePicked.getText();
				
				int binInwardGridListCount = binInwardGridList.size();
				
				ArrayList<String> binInwardGridListArray = new ArrayList<String>();
				
				for(int i=0;i<binInwardGridListCount;i++)
				{
					String data = binInwardGridList.get(i).getText();
					binInwardGridListArray.add(data);
				}
				
				
				String actbinInwardGridList=binInwardGridListArray.toString();
				
				String expbinInwardGridList="[, Bin Update, , 12.00, 12.00, 90.00, 12.00, 78.00, 78.00, , , , 12.00, , , , , , Bin1, , 12.00, 12.00, 90.00, 12.00, 78.00, 78.00, , , , 0.00, , , , , , Bin2, , 12.00, 12.00, 90.00, 12.00, 78.00, 78.00, , , , 0.00, , , , ]";
				
				System.out.println("ActbinInwardGridList : " + actbinInwardGridList);
				System.out.println("ExpbinInwardGridList : " + expbinInwardGridList);

	           
				Thread.sleep(2000);

	            getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binOkBtn));
				binOkBtn.click();
				
				Thread.sleep(2000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_20thColumn));
				
				String actBin=select1stRow_20thColumn.getText();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
				String docno=documentNumberTxt.getAttribute("value");
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
				saveBtn.click();
				
				Thread.sleep(2000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pickBtn));
				pickBtn.click();
				
				Thread.sleep(2000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newReferenceTxt));
				String actNewReference=newReferenceTxt.getAttribute("value");

				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(Bill_OkBtn));
				Bill_OkBtn.click();
				
				Thread.sleep(2000);

				
				boolean savingMessage=checkVoucherSavingMessage(docno);
			    
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
				String actNewDocNo=documentNumberTxt.getAttribute("value");
				
				String expBin          ="Bin Update";
				String expNewReference ="120.00";
				String expNewDocNo     ="2";
				
				System.out.println("********** Bin Column     : "+actBin           +"  value expected  "+expBin);
				System.out.println("********** New Reference  : "+actNewReference  +"  value expected  "+expNewReference);
				System.out.println("********** New Voucher No : "+actNewDocNo      +"  value expected  "+expNewDocNo);
							
				if(actBin.equalsIgnoreCase(expBin) && actNewReference.equalsIgnoreCase(expNewReference) && actNewDocNo.equalsIgnoreCase(expNewDocNo) && savingMessage==true) 
				{
					System.out.println("***Test Pass: Sales Invoice N Voucher Saved Successfully***");
					return true;
				}
				else
				{
					System.out.println("***Test Fail: Sales Invoice N Voucher NOT Saved Successfully***");
					return false;
				}
			}
      		
	



 //Issuing Options
 		public boolean CheckEnabletheOptionPickFrompartiallyFilledBinsFirstWithFarthestAndFromTop() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
 		{
 			
 			System.out.println("*******CheckEnabletheOptionPickFrompartiallyFilledBinsFirstWithFarthestAndFromTop Method Excuted ******************");
 			
 			Thread.sleep(3000);
 			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(SettingsmenuBtn));
 			SettingsmenuBtn.click();
 			
 			Thread.sleep(2000);
 			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ConfigureTransactionBtn));
 			ConfigureTransactionBtn.click();
 			
 			
 			Thread.sleep(2000);
 			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(BinsBtn));
 			BinsBtn.click();
 			
 			
			    if (AllocateIntoPartiallyChkBox.isSelected()==true)
			   {
				 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(AllocateIntoPartiallyChkBox));
				 AllocateIntoPartiallyChkBox.click();
			   }
			
			   Select s=new Select(PlaceTheItemfirstDropdown);
			
			   s.selectByValue("0");
 			
 		   if (PickfromPartiallychkbox.isSelected()==false)
 		   {
 				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(PickfromPartiallychkbox));
 				PickfromPartiallychkbox.click();
 			}
 			
 		   
 		   
 		    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(PickTheItemFirstdropdown));
			PickTheItemFirstdropdown.click();
			
			int PickTheItemFirstdrpdwnListCount=PickTheItemFirstdrpdwnList.size();
			for (int i = 0; i < PickTheItemFirstdrpdwnListCount; i++) 
			{
				String data=PickTheItemFirstdrpdwnList.get(i).getText();
				if (data.equalsIgnoreCase("Farthest and from top"))
				{
					PickTheItemFirstdrpdwnList.get(i).click();
				}
			}
			
 		   
 		   
 			Thread.sleep(2000);
 			
 			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(UpdateBtn));
 			UpdateBtn.click();
 			
 			getWaitForAlert();
 			
 			String actAlertMgs  =getAlert().getText();
 			String expAlertMgs  ="Do you want to save the changes?";
 			
 			System.out.println("AlertMessage     : "+actAlertMgs    +" Value Expected : "+expAlertMgs);	
 			
 			getAlert().accept();
 			
 			
 			 String expMessage="";
 				
 			 String actMessage=checkValidationMessage(expMessage);
 			
 			
 			 Thread.sleep(2000);
 				
 			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplay));
 			userNameDisplay.click();
 			
 			Thread.sleep(2000);
 			
 			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
 			logoutOption.click();
 		 
 			 
 			
 			if(actAlertMgs.equalsIgnoreCase(expAlertMgs))
 			{
 				System.out.println("Test Pass :Updatebutton Alert Pop_Up Displayed As Expected");
 				return true;
 				
 			}
 			else
 			{
 				System.out.println("Test Fail :Updatebutton Alert Pop_Up Not Displayed As Expected");
 				return false;
 			}
 		}
 		

 		
 		
 		
 		public boolean checkSavingVoucherInOpeningStocksNewWithPickFrompartiallyFilledBinsFirstWithFarthestAndFromTop() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
 		{
 			
 			System.out.println("****************checkSavingVoucherInOpeningStocksNewWithPickFrompartiallyFilledBinsFirstWithFarthestAndFromTop Method Executed ***********************");
 			
 				
 			 Thread.sleep(2000);
 			    
 			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
 			inventoryMenu.click();
 		    
 			Thread.sleep(2000);
 			
 		    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(invTransactionsMenu));
 		    invTransactionsMenu.click();
 		    
 		    Thread.sleep(2000);
 		    
 		    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(invTransStocksMenu));
 		    invTransStocksMenu.click();
 		    
 		    Thread.sleep(2000);
 			
 		    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(openingStocksNewVoucher));
 		    openingStocksNewVoucher.click();
 		    
 		    
 		    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
 			newBtn.click();
 			
 			checkUserFriendlyMessage();
 			
             getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(warehouseTxt));
 			warehouseTxt.click();
 			warehouseTxt.sendKeys(Keys.SPACE);
 		    
 			ArrayList<String> actWarehouseOpt = new ArrayList<String>(); 
 			
 			int warehouselist=warehouseHeaderComboList.size();
 			
 			String actWarehouseList= actWarehouseOpt.toString();
 	            
 	        for (int i = 0; i < warehouselist; i++) 
 			{
 						String warehouse=warehouseHeaderComboList.get(i).getText();
 						
 			     if (warehouse.equalsIgnoreCase("SECUNDERABAD")) 
 			     {
 						System.out.println("Entered If Loop");
 						
 						warehouseHeaderComboList.get(i).click();
 						
 						warehouseTxt.sendKeys(Keys.TAB);
 						
 						break;
 					}
 			}

                 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
 				select1stRow_1stColumn.click();
 				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
 				enter_ItemTxt.sendKeys(Keys.SPACE);
 				
 				int itemsCount=itemComboList.size();
 				
 				for (int i = 0; i < itemsCount; i++) 
 				{
 					String item=itemComboList.get(i).getText();
 					
 					
 					if (item.equalsIgnoreCase("FIFO COGS ITEM")) 
 					{
 						System.out.println("Entered If Loop");
 						
 						itemComboList.get(i).click();
 						
 						enter_ItemTxt.sendKeys(Keys.TAB);
 						
 						break;
 					}
 				}
 				
               getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_UnitTxt));
 				enter_UnitTxt.sendKeys(Keys.TAB);
 				
 				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
 				enter_Quantity.sendKeys(Keys.END,Keys.SHIFT,Keys.HOME);
 				enter_Quantity.sendKeys("3");
 				enter_Quantity.sendKeys(Keys.TAB);
 				
 				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
 				enter_Rate.sendKeys(Keys.END,Keys.SHIFT,Keys.HOME);
 				enter_Rate.sendKeys("15.00");
 				enter_Rate.sendKeys(Keys.TAB);
 				
 				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
 				enter_Gross.sendKeys(Keys.TAB);

 				
      			Thread.sleep(2000);
      			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binSearchBtn));
               binSearchBtn.click();
 				
            Thread.sleep(2000);
            
            getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binselect2ndRow_8thColumn));
            binselect2ndRow_8thColumn.click();
            
            binEnter8thColumn.click();
            
            binEnter8thColumn.sendKeys(Keys.END,Keys.SHIFT,Keys.HOME);
            
            binEnter8thColumn.sendKeys("12");
            
            Thread.sleep(2000);
            binEnter8thColumn.sendKeys(Keys.TAB);
            
            Thread.sleep(2000);
           /* getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binselect3rdRow_8thColumn));
            binselect3rdRow_8thColumn.click();
            */
            binEnter8thColumn.click();
            
            binEnter8thColumn.sendKeys(Keys.END,Keys.SHIFT,Keys.HOME);
            
            binEnter8thColumn.sendKeys("12");
            
            Thread.sleep(2000);
            binEnter8thColumn.sendKeys(Keys.TAB);
            
            Thread.sleep(2000);
            binEnter8thColumn.click();
            
            binEnter8thColumn.sendKeys(Keys.END,Keys.SHIFT,Keys.HOME);
            
            binEnter8thColumn.sendKeys("12");
            Thread.sleep(2000);
            
            binEnter8thColumn.sendKeys(Keys.TAB);
            
                 
 				int binInwardGridListCount = binInwardGridList.size();
 				
 				ArrayList<String> binInwardGridListArray = new ArrayList<String>();
 				
 				for(int i=0;i<binInwardGridListCount;i++)
 				{
 					String data = binInwardGridList.get(i).getText();
 					binInwardGridListArray.add(data);
 				}
 				
 				String actbinInwardGridList=binInwardGridListArray.toString();
 				
 				String expbinInwardGridList="[, BG2, , 0.00, , 0.00, 0.00, 0.00, 0.00, , , , 0.00, , , , , , Bin Update, , 0.00, , 90.00, 0.00, 90.00, 90.00, , , , 12.00, , , , , , Bin1, , 0.00, , 90.00, 0.00, 90.00, 90.00, , , , 12.00, , , , , , Bin2, , 0.00, , 90.00, 0.00, 90.00, 90.00, , , , 12.00, , , , ]";
 				
 				System.out.println("ActbinInwardGridList : " + actbinInwardGridList);
 				System.out.println("ExpbinInwardGridList : " + expbinInwardGridList);
 				
 				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binOkBtn));
 				binOkBtn.click();
 				
 				
 				String actselect1stRow_7thColumn=select1stRow_7thColumn.getText();
 				String expselect1stRow_7thColumn="Bin Update";

 				System.out.println("ACtselect1stRow_7thColumn   : "+actselect1stRow_7thColumn +" Value Expected  : "+expselect1stRow_7thColumn);
 				
 				
 				String docno=documentNumberTxt.getAttribute("value");
 				
 				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
 				saveBtn.click();
 				

 				boolean savingMessage=checkVoucherSavingMessage(docno);
 				
 				String actMessage=Boolean.toString(savingMessage);
 				String expMessage="true";
 				
 				if (actMessage.equalsIgnoreCase(expMessage) && actbinInwardGridList.equalsIgnoreCase(expbinInwardGridList) && 
 						 
 						actselect1stRow_7thColumn.equalsIgnoreCase(expselect1stRow_7thColumn) ) 
 				{
 					System.out.println("Test Pass: Voucher Saved Successfully");
 					return true;
 					
 				}
 				else
 				{
 					System.out.println("Test Fail: Voucher Saved Successfully");
 					return false;
 				}
 		}

 		
 		
 		
 		
public boolean checkSavingSalesInvoiceVoucherWithithPickFrompartiallyFilledBinsFirstWithFarthestAndFromTop() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
{

	
	    System.out.println("**************************checkSavingSalesInvoiceVoucherWithithPickFrompartiallyFilledBinsFirstWithFarthestAndFromTop Method Executes *************************");
	
	        
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		financialsTransactionMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialTransactionSalesMenu));
		financialTransactionSalesMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesInvoicesVoucher));
		salesInvoiceVATVoucher.click();

        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();
		
		checkUserFriendlyMessage();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerAccountTxt));
		customerAccountTxt.click();
		customerAccountTxt.sendKeys(Keys.END);
		customerAccountTxt.sendKeys(Keys.SHIFT,Keys.HOME);
		customerAccountTxt.sendKeys(Keys.SPACE);
		
		int customerAccountCount=customerAccountComboList.size();
		
		System.out.println("Customer Account List Size: "+customerAccountCount);
		
		for (int i = 0; i < customerAccountCount; i++) 
		{
			String customerAccount=customerAccountComboList.get(i).getText();
			
			if (customerAccount.equalsIgnoreCase("Customer A"))
			{
				System.out.println("Entered If Loop");
				
				customerAccountComboList.get(i).click();
				
				customerAccountTxt.sendKeys(Keys.TAB);
				
				break;
			}
		}
		customerAccountTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherHeaderCurrency));
		voucherHeaderCurrency.click();
		voucherHeaderCurrency.sendKeys(Keys.END);
		voucherHeaderCurrency.sendKeys(Keys.SHIFT,Keys.HOME);
		voucherHeaderCurrency.sendKeys(Keys.SPACE);
		
		int currencyCount=currencyComboList.size();
		
		for (int i = 0; i < currencyCount; i++) 
		{
			String currency=currencyComboList.get(i).getText();
			
			System.out.println(i+"  "+currency);
			
			if (currency.equalsIgnoreCase("INR"))
			{
				System.out.println("Entered If Loop");
				
				currencyComboList.get(i).click();
				
				voucherHeaderCurrency.sendKeys(Keys.TAB);
				
				break;
			}
		}
		voucherHeaderCurrency.sendKeys(Keys.TAB);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
		departmentTxt.click();
		departmentTxt.sendKeys(Keys.END);
		departmentTxt.sendKeys(Keys.SHIFT,Keys.HOME);
		departmentTxt.sendKeys(Keys.SPACE);
		
		int departmentCount=departmentComboList.size();
		
		for (int i = 0; i < departmentCount; i++) 
		{
			String department=departmentComboList.get(i).getText();
			
			System.out.println(i+"  "+department);
			
			if (department.equalsIgnoreCase("INDIA"))
			{
				System.out.println("Entered If Loop");
				
				departmentComboList.get(i).click();
				
				departmentTxt.sendKeys(Keys.TAB);
				
				break;
			}
		}
		departmentTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesInvoiceVATPlaceOFSupply));
		salesInvoiceVATPlaceOFSupply.click();
		salesInvoiceVATPlaceOFSupply.sendKeys(Keys.END);
		salesInvoiceVATPlaceOFSupply.sendKeys(Keys.SHIFT,Keys.HOME);
		salesInvoiceVATPlaceOFSupply.sendKeys(Keys.SPACE);
		
		
		int placeOFSupplyListCount=placeOFSupplyList.size();
		
		System.err.println("placeOFSupplyListCount   : "+placeOFSupplyListCount);
			
		for(int i=0 ; i < placeOFSupplyListCount ;i++)
		{
			String data=placeOFSupplyList.get(i).getText();
			
			if(data.equalsIgnoreCase("Abu Dhabi"))
			{
				placeOFSupplyList.get(i).click();
				
				break;
			}
		}
			
		
		salesInvoiceVATPlaceOFSupply.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesInvoiceVATJuridictionxt));
		salesInvoiceVATJuridictionxt.click();
		salesInvoiceVATJuridictionxt.sendKeys(Keys.END);
		salesInvoiceVATJuridictionxt.sendKeys(Keys.SHIFT,Keys.HOME);
		salesInvoiceVATJuridictionxt.sendKeys(Keys.SPACE);
		
		
		int JuridictionListCount=JuridictionList.size();
		
		System.err.println("JuridictionList   : "+JuridictionListCount);
			
		for(int i=0 ; i < JuridictionListCount ;i++)
		{
			String data=JuridictionList.get(i).getText();
			
			if(data.equalsIgnoreCase("Abu Dhabi"))
			{
				JuridictionList.get(i).click();
				
				break;
			}
		}
			
		
		salesInvoiceVATJuridictionxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
		select1stRow_1stColumn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pvWarehouseTxt));
		pvWarehouseTxt.sendKeys(Keys.END);
		pvWarehouseTxt.sendKeys(Keys.SHIFT,Keys.HOME);
		pvWarehouseTxt.sendKeys(Keys.SPACE);
		
		int warehouselist=warehouseBodyComboList.size();
		
		
		ArrayList<String> actWarehouseOpt = new ArrayList<String>();
		
		System.out.println("******* Warehouse List: "+warehouselist);
		
		for (int i = 0; i < warehouselist; i++) 
		{
			String warehouse=warehouseBodyComboList.get(i).getText();
			
			
			
			if (warehouse.equalsIgnoreCase("SECUNDERABAD"))
			{
				System.out.println("Entered If Loop");
				
				warehouseBodyComboList.get(i).click();
				
				pvWarehouseTxt.sendKeys(Keys.TAB);
				
				break;
			}
		}
		

        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
        enter_ItemTxt.sendKeys(Keys.END);
        enter_ItemTxt.sendKeys(Keys.SHIFT,Keys.HOME);
		enter_ItemTxt.sendKeys(Keys.SPACE);
		
		int itemsCount=itemComboList.size();
		
		for (int i = 0; i < itemsCount; i++) 
		{
			String item=itemComboList.get(i).getText();
			
			if (item.equalsIgnoreCase("FIFO COGS ITEM")) 
			{
				System.out.println("Entered If Loop");
				
				itemComboList.get(i).click();
				
				enter_ItemTxt.sendKeys(Keys.TAB);
				
				break;
			}
		}
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_5thColumn));
		select1stRow_5thColumn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_8thColumn));
		select1stRow_8thColumn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_AQTxt));
		enter_AQTxt.clear();
		enter_AQTxt.sendKeys(Keys.END);
		enter_AQTxt.sendKeys(Keys.SHIFT,Keys.HOME);
		enter_AQTxt.sendKeys("12");
		enter_AQTxt.sendKeys(Keys.TAB);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_FQTxt));
		enter_FQTxt.clear();
		enter_FQTxt.sendKeys(Keys.TAB);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_14thColumn));
		select1stRow_14thColumn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
		enter_Rate.sendKeys("10");
		enter_Rate.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
		enter_Gross.sendKeys(Keys.TAB);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_20thColumn));
		select1stRow_20thColumn.click();
		
		
		Thread.sleep(2000);
		binSearchBtn.click();
		
		Thread.sleep(3000);
        
        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binAutoAllocateBtn));
       
        binAutoAllocateBtn.click();
		
		String actbinoutwardRowTotalToBePicked	=binoutwardRowTotalToBePicked.getText();
		
		int binInwardGridListCount = binInwardGridList.size();
		
		ArrayList<String> binInwardGridListArray = new ArrayList<String>();
		
		for(int i=0;i<binInwardGridListCount;i++)
		{
			String data = binInwardGridList.get(i).getText();
			binInwardGridListArray.add(data);
		}
		
		
		String actbinInwardGridList=binInwardGridListArray.toString();
		
		String expbinInwardGridList="[, Bin Update, , 12.00, 12.00, 90.00, 12.00, 78.00, 78.00, , , , 0.00, , , , , , Bin1, , 12.00, 12.00, 90.00, 12.00, 78.00, 78.00, , , , 12.00, , , , , , Bin2, , 12.00, 12.00, 90.00, 12.00, 78.00, 78.00, , , , 0.00, , , , ]";
		
		System.out.println("ActbinInwardGridList : " + actbinInwardGridList);
		System.out.println("ExpbinInwardGridList : " + expbinInwardGridList);

       
		Thread.sleep(2000);

        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binOkBtn));
		binOkBtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_20thColumn));
		
		String actBin=select1stRow_20thColumn.getText();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
		String docno=documentNumberTxt.getAttribute("value");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
		saveBtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pickBtn));
		pickBtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newReferenceTxt));
		String actNewReference=newReferenceTxt.getAttribute("value");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(Bill_OkBtn));
		Bill_OkBtn.click();
		
		Thread.sleep(2000);

		
		boolean savingMessage=checkVoucherSavingMessage(docno);
	    
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
		String actNewDocNo=documentNumberTxt.getAttribute("value");
		
		String expBin          ="Bin1";
		String expNewReference ="120.00";
		String expNewDocNo     ="2";
		
		System.out.println("********** Bin Column     : "+actBin           +"  value expected  "+expBin);
		System.out.println("********** New Reference  : "+actNewReference  +"  value expected  "+expNewReference);
		System.out.println("********** New Voucher No : "+actNewDocNo      +"  value expected  "+expNewDocNo);
					
		if(actBin.equalsIgnoreCase(expBin) && actNewReference.equalsIgnoreCase(expNewReference) && actNewDocNo.equalsIgnoreCase(expNewDocNo) && savingMessage==true) 
		{
			System.out.println("***Test Pass: Sales Invoice N Voucher Saved Successfully***");
			return true;
		}
		else
		{
			System.out.println("***Test Fail: Sales Invoice N Voucher NOT Saved Successfully***");
			return false;
		}
	}
 		



     //Issuing Options
    public boolean CheckEnabletheOptionPickFrompartiallyFilledBinsFirstWithFarthestAndFromBottom() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			
			System.out.println("*******CheckEnabletheOptionPickFrompartiallyFilledBinsFirstWithFarthestAndFromBottom Method Excuted ******************");
			
			Thread.sleep(3000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(SettingsmenuBtn));
			SettingsmenuBtn.click();
			
			Thread.sleep(2000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ConfigureTransactionBtn));
			ConfigureTransactionBtn.click();
			
			
			Thread.sleep(2000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(BinsBtn));
			BinsBtn.click();
			
			
	    if (AllocateIntoPartiallyChkBox.isSelected()==true)
	   {
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(AllocateIntoPartiallyChkBox));
		 AllocateIntoPartiallyChkBox.click();
	   }
	
	   Select s=new Select(PlaceTheItemfirstDropdown);
	
	   s.selectByValue("0");
			
		   if (PickfromPartiallychkbox.isSelected()==false)
		   {
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(PickfromPartiallychkbox));
				PickfromPartiallychkbox.click();
			}
			
		   
		    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(PickTheItemFirstdropdown));
			PickTheItemFirstdropdown.click();
			
			int PickTheItemFirstdrpdwnListCount=PickTheItemFirstdrpdwnList.size();
			for (int i = 0; i < PickTheItemFirstdrpdwnListCount; i++) 
			{
				String data=PickTheItemFirstdrpdwnList.get(i).getText();
				if (data.equalsIgnoreCase(" Farthest and from bottom "))
				{
					PickTheItemFirstdrpdwnList.get(i).click();
				}
			}
		   
		   
		   
       
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(UpdateBtn));
			UpdateBtn.click();
			
			getWaitForAlert();
			
			String actAlertMgs  =getAlert().getText();
			String expAlertMgs  ="Do you want to save the changes?";
			
			System.out.println("AlertMessage     : "+actAlertMgs    +" Value Expected : "+expAlertMgs);	
			
			getAlert().accept();
			
			
			 String expMessage="";
				
			 String actMessage=checkValidationMessage(expMessage);
			
			
			 Thread.sleep(2000);
				
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplay));
			userNameDisplay.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
			logoutOption.click();
		 
			 
			
			if(actAlertMgs.equalsIgnoreCase(expAlertMgs))
			{
				System.out.println("Test Pass :Updatebutton Alert Pop_Up Displayed As Expected");
				return true;
				
			}
			else
			{
				System.out.println("Test Fail :Updatebutton Alert Pop_Up Not Displayed As Expected");
				return false;
			}
		}
     		

     		
     		
     		
    public boolean checkSavingVoucherInOpeningStocksNewWithPickFrompartiallyFilledBinsFirstWithFarthestAndFromBottom() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			
			System.out.println("****************checkSavingVoucherInOpeningStocksNewWithPickFrompartiallyFilledBinsFirstWithFarthestAndFromBottom Method Executed ***********************");
			
				
			 Thread.sleep(2000);
			    
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
			inventoryMenu.click();
		    
			Thread.sleep(2000);
			
		    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(invTransactionsMenu));
		    invTransactionsMenu.click();
		    
		    Thread.sleep(2000);
		    
		    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(invTransStocksMenu));
		    invTransStocksMenu.click();
		    
		    Thread.sleep(2000);
			
		    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(openingStocksNewVoucher));
		    openingStocksNewVoucher.click();
		    
		    
		    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
			newBtn.click();
			
			checkUserFriendlyMessage();
			
         getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(warehouseTxt));
			warehouseTxt.click();
			warehouseTxt.sendKeys(Keys.SPACE);
		    
			ArrayList<String> actWarehouseOpt = new ArrayList<String>(); 
			
			int warehouselist=warehouseHeaderComboList.size();
			
			String actWarehouseList= actWarehouseOpt.toString();
	            
	        for (int i = 0; i < warehouselist; i++) 
			{
						String warehouse=warehouseHeaderComboList.get(i).getText();
						
			     if (warehouse.equalsIgnoreCase("SECUNDERABAD")) 
			     {
						System.out.println("Entered If Loop");
						
						warehouseHeaderComboList.get(i).click();
						
						warehouseTxt.sendKeys(Keys.TAB);
						
						break;
					}
			}

             getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
				select1stRow_1stColumn.click();
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
				enter_ItemTxt.sendKeys(Keys.SPACE);
				
				int itemsCount=itemComboList.size();
				
				for (int i = 0; i < itemsCount; i++) 
				{
					String item=itemComboList.get(i).getText();
					
					
					if (item.equalsIgnoreCase("FIFO COGS ITEM")) 
					{
						System.out.println("Entered If Loop");
						
						itemComboList.get(i).click();
						
						enter_ItemTxt.sendKeys(Keys.TAB);
						
						break;
					}
				}
				
           getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_UnitTxt));
				enter_UnitTxt.sendKeys(Keys.TAB);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
				enter_Quantity.sendKeys(Keys.END,Keys.SHIFT,Keys.HOME);
				enter_Quantity.sendKeys("3");
				enter_Quantity.sendKeys(Keys.TAB);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
				enter_Rate.sendKeys(Keys.END,Keys.SHIFT,Keys.HOME);
				enter_Rate.sendKeys("15.00");
				enter_Rate.sendKeys(Keys.TAB);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
				enter_Gross.sendKeys(Keys.TAB);

				
  			Thread.sleep(2000);
  			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binSearchBtn));
           binSearchBtn.click();
				
        Thread.sleep(2000);
        
        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binselect2ndRow_8thColumn));
        binselect2ndRow_8thColumn.click();
        
        binEnter8thColumn.click();
        
        binEnter8thColumn.sendKeys(Keys.END,Keys.SHIFT,Keys.HOME);
        
        binEnter8thColumn.sendKeys("12");
        
        Thread.sleep(2000);
        binEnter8thColumn.sendKeys(Keys.TAB);
        
        Thread.sleep(2000);
       /* getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binselect3rdRow_8thColumn));
        binselect3rdRow_8thColumn.click();
        */
        binEnter8thColumn.click();
        
        binEnter8thColumn.sendKeys(Keys.END,Keys.SHIFT,Keys.HOME);
        
        binEnter8thColumn.sendKeys("12");
        
        Thread.sleep(2000);
        binEnter8thColumn.sendKeys(Keys.TAB);
        
        Thread.sleep(2000);
        binEnter8thColumn.click();
        
        binEnter8thColumn.sendKeys(Keys.END,Keys.SHIFT,Keys.HOME);
        
        binEnter8thColumn.sendKeys("12");
        Thread.sleep(2000);
        
        binEnter8thColumn.sendKeys(Keys.TAB);
        
             
				int binInwardGridListCount = binInwardGridList.size();
				
				ArrayList<String> binInwardGridListArray = new ArrayList<String>();
				
				for(int i=0;i<binInwardGridListCount;i++)
				{
					String data = binInwardGridList.get(i).getText();
					binInwardGridListArray.add(data);
				}
				
				String actbinInwardGridList=binInwardGridListArray.toString();
				
				String expbinInwardGridList="[, BG2, , 0.00, , 0.00, 0.00, 0.00, 0.00, , , , 0.00, , , , , , Bin Update, , 0.00, , 90.00, 0.00, 90.00, 90.00, , , , 12.00, , , , , , Bin1, , 0.00, , 90.00, 0.00, 90.00, 90.00, , , , 12.00, , , , , , Bin2, , 0.00, , 90.00, 0.00, 90.00, 90.00, , , , 12.00, , , , ]";
				
				System.out.println("ActbinInwardGridList : " + actbinInwardGridList);
				System.out.println("ExpbinInwardGridList : " + expbinInwardGridList);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binOkBtn));
				binOkBtn.click();
				
				
				String actselect1stRow_7thColumn=select1stRow_7thColumn.getText();
				String expselect1stRow_7thColumn="Bin Update";

				System.out.println("ACtselect1stRow_7thColumn   : "+actselect1stRow_7thColumn +" Value Expected  : "+expselect1stRow_7thColumn);
				
				
				String docno=documentNumberTxt.getAttribute("value");
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
				saveBtn.click();
				

				boolean savingMessage=checkVoucherSavingMessage(docno);
				
				String actMessage=Boolean.toString(savingMessage);
				String expMessage="true";
				
				if (actMessage.equalsIgnoreCase(expMessage) && actbinInwardGridList.equalsIgnoreCase(expbinInwardGridList) && 
						 
						actselect1stRow_7thColumn.equalsIgnoreCase(expselect1stRow_7thColumn) ) 
				{
					System.out.println("Test Pass: Voucher Saved Successfully");
					return true;
					
				}
				else
				{
					System.out.println("Test Fail: Voucher Saved Successfully");
					return false;
				}
		}

     		
     		
     		
     		
    public boolean checkSavingSalesInvoiceVoucherWithithPickFrompartiallyFilledBinsFirstWithFarthestAndFromBottom() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		    System.out.println("**************************checkSavingSalesInvoiceVoucherWithithPickFrompartiallyFilledBinsFirstWithFarthestAndFromBottom Method Executes *************************");
				        
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
			financialsMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
			financialsTransactionMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialTransactionSalesMenu));
			financialTransactionSalesMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesInvoicesVoucher));
			salesInvoiceVATVoucher.click();

            getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
			newBtn.click();
			
			checkUserFriendlyMessage();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerAccountTxt));
			customerAccountTxt.click();
			customerAccountTxt.sendKeys(Keys.END);
			customerAccountTxt.sendKeys(Keys.SHIFT,Keys.HOME);
			customerAccountTxt.sendKeys(Keys.SPACE);
			
			int customerAccountCount=customerAccountComboList.size();
			
			System.out.println("Customer Account List Size: "+customerAccountCount);
			
			for (int i = 0; i < customerAccountCount; i++) 
			{
				String customerAccount=customerAccountComboList.get(i).getText();
				
				if (customerAccount.equalsIgnoreCase("Customer A"))
				{
					System.out.println("Entered If Loop");
					
					customerAccountComboList.get(i).click();
					
					customerAccountTxt.sendKeys(Keys.TAB);
					
					break;
				}
			}
			customerAccountTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherHeaderCurrency));
			voucherHeaderCurrency.click();
			voucherHeaderCurrency.sendKeys(Keys.END);
			voucherHeaderCurrency.sendKeys(Keys.SHIFT,Keys.HOME);
			voucherHeaderCurrency.sendKeys(Keys.SPACE);
			
			int currencyCount=currencyComboList.size();
			
			for (int i = 0; i < currencyCount; i++) 
			{
				String currency=currencyComboList.get(i).getText();
				
				System.out.println(i+"  "+currency);
				
				if (currency.equalsIgnoreCase("INR"))
				{
					System.out.println("Entered If Loop");
					
					currencyComboList.get(i).click();
					
					voucherHeaderCurrency.sendKeys(Keys.TAB);
					
					break;
				}
			}
			voucherHeaderCurrency.sendKeys(Keys.TAB);
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
			departmentTxt.click();
			departmentTxt.sendKeys(Keys.END);
			departmentTxt.sendKeys(Keys.SHIFT,Keys.HOME);
			departmentTxt.sendKeys(Keys.SPACE);
			
			int departmentCount=departmentComboList.size();
			
			for (int i = 0; i < departmentCount; i++) 
			{
				String department=departmentComboList.get(i).getText();
				
				System.out.println(i+"  "+department);
				
				if (department.equalsIgnoreCase("INDIA"))
				{
					System.out.println("Entered If Loop");
					
					departmentComboList.get(i).click();
					
					departmentTxt.sendKeys(Keys.TAB);
					
					break;
				}
			}
			departmentTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesInvoiceVATPlaceOFSupply));
			salesInvoiceVATPlaceOFSupply.click();
			salesInvoiceVATPlaceOFSupply.sendKeys(Keys.END);
			salesInvoiceVATPlaceOFSupply.sendKeys(Keys.SHIFT,Keys.HOME);
			salesInvoiceVATPlaceOFSupply.sendKeys(Keys.SPACE);
			
			
			int placeOFSupplyListCount=placeOFSupplyList.size();
			
			System.err.println("placeOFSupplyListCount   : "+placeOFSupplyListCount);
				
			for(int i=0 ; i < placeOFSupplyListCount ;i++)
			{
				String data=placeOFSupplyList.get(i).getText();
				
				if(data.equalsIgnoreCase("Abu Dhabi"))
				{
					placeOFSupplyList.get(i).click();
					
					break;
				}
			}
				
			
			salesInvoiceVATPlaceOFSupply.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesInvoiceVATJuridictionxt));
			salesInvoiceVATJuridictionxt.click();
			salesInvoiceVATJuridictionxt.sendKeys(Keys.END);
			salesInvoiceVATJuridictionxt.sendKeys(Keys.SHIFT,Keys.HOME);
			salesInvoiceVATJuridictionxt.sendKeys(Keys.SPACE);
			
			
			int JuridictionListCount=JuridictionList.size();
			
			System.err.println("JuridictionList   : "+JuridictionListCount);
				
			for(int i=0 ; i < JuridictionListCount ;i++)
			{
				String data=JuridictionList.get(i).getText();
				
				if(data.equalsIgnoreCase("Abu Dhabi"))
				{
					JuridictionList.get(i).click();
					
					break;
				}
			}
				
			
			salesInvoiceVATJuridictionxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
			select1stRow_1stColumn.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pvWarehouseTxt));
			pvWarehouseTxt.sendKeys(Keys.END);
			pvWarehouseTxt.sendKeys(Keys.SHIFT,Keys.HOME);
			pvWarehouseTxt.sendKeys(Keys.SPACE);
			
			int warehouselist=warehouseBodyComboList.size();
			
			
			ArrayList<String> actWarehouseOpt = new ArrayList<String>();
			
			System.out.println("******* Warehouse List: "+warehouselist);
			
			for (int i = 0; i < warehouselist; i++) 
			{
				String warehouse=warehouseBodyComboList.get(i).getText();
				
				
				
				if (warehouse.equalsIgnoreCase("SECUNDERABAD"))
				{
					System.out.println("Entered If Loop");
					
					warehouseBodyComboList.get(i).click();
					
					pvWarehouseTxt.sendKeys(Keys.TAB);
					
					break;
				}
			}
			

            getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
            enter_ItemTxt.sendKeys(Keys.END);
            enter_ItemTxt.sendKeys(Keys.SHIFT,Keys.HOME);
			enter_ItemTxt.sendKeys(Keys.SPACE);
			
			int itemsCount=itemComboList.size();
			
			for (int i = 0; i < itemsCount; i++) 
			{
				String item=itemComboList.get(i).getText();
				
				if (item.equalsIgnoreCase("FIFO COGS ITEM")) 
				{
					System.out.println("Entered If Loop");
					
					itemComboList.get(i).click();
					
					enter_ItemTxt.sendKeys(Keys.TAB);
					
					break;
				}
			}
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_5thColumn));
			select1stRow_5thColumn.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_8thColumn));
			select1stRow_8thColumn.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_AQTxt));
			enter_AQTxt.clear();
			enter_AQTxt.sendKeys(Keys.END);
			enter_AQTxt.sendKeys(Keys.SHIFT,Keys.HOME);
			enter_AQTxt.sendKeys("12");
			enter_AQTxt.sendKeys(Keys.TAB);
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_FQTxt));
			enter_FQTxt.clear();
			enter_FQTxt.sendKeys(Keys.TAB);
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_14thColumn));
			select1stRow_14thColumn.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
			enter_Rate.sendKeys("10");
			enter_Rate.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
			enter_Gross.sendKeys(Keys.TAB);
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_20thColumn));
			select1stRow_20thColumn.click();
			
			
			Thread.sleep(2000);
			binSearchBtn.click();
			
			Thread.sleep(3000);
            
            getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binAutoAllocateBtn));
           
            binAutoAllocateBtn.click();
			
			String actbinoutwardRowTotalToBePicked	=binoutwardRowTotalToBePicked.getText();
			
			int binInwardGridListCount = binInwardGridList.size();
			
			ArrayList<String> binInwardGridListArray = new ArrayList<String>();
			
			for(int i=0;i<binInwardGridListCount;i++)
			{
				String data = binInwardGridList.get(i).getText();
				binInwardGridListArray.add(data);
			}
			
			
			String actbinInwardGridList=binInwardGridListArray.toString();
			
			String expbinInwardGridList="[, Bin Update, , 12.00, 12.00, 90.00, 12.00, 78.00, 78.00, , , , 0.00, , , , , , Bin1, , 12.00, 12.00, 90.00, 12.00, 78.00, 78.00, , , , 12.00, , , , , , Bin2, , 12.00, 12.00, 90.00, 12.00, 78.00, 78.00, , , , 0.00, , , , ]";
			
			System.out.println("ActbinInwardGridList : " + actbinInwardGridList);
			System.out.println("ExpbinInwardGridList : " + expbinInwardGridList);

           
			Thread.sleep(2000);

            getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binOkBtn));
			binOkBtn.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_20thColumn));
			
			String actBin=select1stRow_20thColumn.getText();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
			String docno=documentNumberTxt.getAttribute("value");
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
			saveBtn.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pickBtn));
			pickBtn.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newReferenceTxt));
			String actNewReference=newReferenceTxt.getAttribute("value");

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(Bill_OkBtn));
			Bill_OkBtn.click();
			
			Thread.sleep(2000);

			
			boolean savingMessage=checkVoucherSavingMessage(docno);
		    
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
			String actNewDocNo=documentNumberTxt.getAttribute("value");
			
			String expBin          ="Bin1";
			String expNewReference ="120.00";
			String expNewDocNo     ="2";
			
			System.out.println("********** Bin Column     : "+actBin           +"  value expected  "+expBin);
			System.out.println("********** New Reference  : "+actNewReference  +"  value expected  "+expNewReference);
			System.out.println("********** New Voucher No : "+actNewDocNo      +"  value expected  "+expNewDocNo);
				
			
			
			Thread.sleep(2000);
			
			
			if(actBin.equalsIgnoreCase(expBin) && actNewReference.equalsIgnoreCase(expNewReference) && actNewDocNo.equalsIgnoreCase(expNewDocNo) && savingMessage==true) 
			{
				System.out.println("***Test Pass: Sales Invoice N Voucher Saved Successfully***");
				return true;
			}
			else
			{
				System.out.println("***Test Fail: Sales Invoice N Voucher NOT Saved Successfully***");
				return false;
			}
		}
    
    
    
    
    
    
    public boolean checkLogout() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
	  getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplay));
	  userNameDisplay.click();
	 
	  getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
	  logoutOption.click();
	  
	  Thread.sleep(2000);
	  
	  getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(username));
	  boolean actUserName = username.isDisplayed();
	  boolean expUserName = true; 
			  
      getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(password));
      boolean actPassword = password.isDisplayed();
      boolean expPassword = true;  
		
      System.out.println("*************************CheckLogout***************************");
      
      System.out.println("Logout  Successfully");
      
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
    
    
    
     		

    public BinOptionsPage(WebDriver driver)
	 {
	    	
	    	PageFactory.initElements(driver, this);
	    	
	 }
	
}
