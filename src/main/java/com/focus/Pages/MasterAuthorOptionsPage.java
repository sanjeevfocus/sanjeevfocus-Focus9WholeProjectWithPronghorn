package com.focus.Pages;

import java.io.IOException;
import java.util.ArrayList;
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
import com.focus.supporters.ExcelReader;
import com.focus.utilities.POJOUtility;

public class MasterAuthorOptionsPage extends BaseEngine
{

	@FindBy(xpath="//div[@class='theme_color font-6']")
	public static WebElement errorMessage;

	@FindBy(xpath="//span[@class='icon-reject2 theme_color']")
	public static WebElement errorMessageCloseBtn;
	
	
	@FindBy(xpath="//*[@id='id_Authorization_container']/div/div/nav/div[1]/a/div/span[2]")
	private static WebElement masterAuthorLabel; 
		
	@FindBy(xpath="//input[@id='txtDoc']")
	private static WebElement masterDropdown; 	
	
		@FindBy(xpath="//li[contains(text(),'Account')]")
		private static WebElement account; 	
			
		@FindBy(xpath="//li[contains(text(),'Item')]")
		private static WebElement item; 	
			
		@FindBy(xpath="//li[contains(text(),'Department')]")
		private static WebElement department; 	
			
		@FindBy(xpath="//li[contains(text(),'Warehouse')]")
		private static WebElement warehouse; 	
			
		@FindBy(xpath="//li[contains(text(),'Cost Center')]")
		private static WebElement costCenter; 	
			
		@FindBy(xpath="//li[contains(text(),'Location')]")
		private static WebElement location; 	
			
		@FindBy(xpath="//li[contains(text(),'Region')]")
		private static WebElement region; 	
			
		@FindBy(xpath="//li[contains(text(),'Country')]")
		private static WebElement country; 	
			
		@FindBy(xpath="//li[contains(text(),'State')]")
		private static WebElement state; 	
			
		@FindBy(xpath="//li[contains(text(),'City')]")
		private static WebElement city; 	
			
		@FindBy(xpath="//li[contains(text(),'Units')]")
		private static WebElement units; 	
			
		@FindBy(xpath="//li[contains(text(),'Bins')]")
		private static WebElement bins; 	
			
		@FindBy(xpath="//li[contains(text(),'Tax Code')]")
		private static WebElement taxCode; 	
			
		@FindBy(xpath="//li[contains(text(),'Plant')]")
		private static WebElement plant; 	
			
		@FindBy(xpath="//li[contains(text(),'Supply Area')]")
		private static WebElement supplyArea; 	
			
		@FindBy(xpath="//li[contains(text(),'Maintenance Parameter')]")
		private static WebElement maintenanceParameter; 	
			
		@FindBy(xpath="//li[contains(text(),'Safety Instructions')]")
		private static WebElement safetyInstructions; 	
			
		@FindBy(xpath="//li[contains(text(),'Work Center')]")
		private static WebElement workCenter; 	
			
		@FindBy(xpath="//li[contains(text(),'Capacity')]")
		private static WebElement capacity; 	
			
		@FindBy(xpath="//li[contains(text(),'Holiday')]")
		private static WebElement holiday; 	
			
		@FindBy(xpath="//li[contains(text(),'Process')]")
		private static WebElement process; 	
			
		@FindBy(xpath="//li[contains(text(),'Qc failure reason')]")
		private static WebElement qcFailureReason; 	
			
		@FindBy(xpath="//li[contains(text(),'QC Parameters')]")
		private static WebElement qcParameters; 	
			
		@FindBy(xpath="//li[contains(text(),'Insurance')]")
		private static WebElement insurance; 	
			
		@FindBy(xpath="//li[contains(text(),'Fixed Asset')]")
		private static WebElement fixedAsset; 	
			
		@FindBy(xpath="//li[contains(text(),'Break down standard reason')]")
		private static WebElement breakDownStandardReason; 	
			
		@FindBy(xpath="//*[@id='MasterMenu']/li[27]")
		private static WebElement employee; 	
			
		@FindBy(xpath="//li[contains(text(),'Designation')]")
		private static WebElement designation; 	
			
		@FindBy(xpath="//li[contains(text(),'Position')]")
		private static WebElement position; 	
			
		@FindBy(xpath="//li[contains(text(),'Qualification')]")
		private static WebElement qualification; 	
			
		@FindBy(xpath="//li[contains(text(),'Specialization')]")
		private static WebElement specialization; 	
			
		@FindBy(xpath="//li[contains(text(),'Nationality')]")
		private static WebElement nationality; 	
			
		@FindBy(xpath="//li[contains(text(),'Skill Type')]")
		private static WebElement skillType; 	
			
		@FindBy(xpath="//*[@id='MasterMenu']/li[34]")
		private static WebElement skill; 	
			
		@FindBy(xpath="//li[contains(text(),'SourceType')]")
		private static WebElement sourceType; 	
			
		@FindBy(xpath="//*[@id='MasterMenu']/li[36]")
		private static WebElement source; 	
			
		@FindBy(xpath="//li[contains(text(),'RoundType')]")
		private static WebElement roundType; 	
			
		@FindBy(xpath="//*[@id='MasterMenu']/li[38]")
		private static WebElement grade; 	
			
		@FindBy(xpath="//li[contains(text(),'Scale')]")
		private static WebElement scale; 	
			
		@FindBy(xpath="//li[contains(text(),'Course Type')]")
		private static WebElement courseType; 	
			
		@FindBy(xpath="//*[@id='MasterMenu']/li[41]")
		private static WebElement course; 	
			
		@FindBy(xpath="//li[contains(text(),'Trainer')]")
		private static WebElement trainer; 	
			
		@FindBy(xpath="//li[contains(text(),'Airline Sector')]")
		private static WebElement airlineSector; 	
			
		@FindBy(xpath="//li[contains(text(),'Venue')]")
		private static WebElement venue; 	
			
		@FindBy(xpath="//li[contains(text(),'Request Types')]")
		private static WebElement requestTypes; 	
			
		@FindBy(xpath="//li[contains(text(),'Expense Claims')]")
		private static WebElement expenseClaims; 	
			
		@FindBy(xpath="//li[contains(text(),'Employee Bank')]")
		private static WebElement employeeBank; 	
			
		@FindBy(xpath="//li[contains(text(),'Travel Agent')]")
		private static WebElement travelAgent; 	
			
		@FindBy(xpath="//li[contains(text(),'Job Grade')]")
		private static WebElement jobGrade; 	
			
		@FindBy(xpath="//li[contains(text(),'Outlet')]")
		private static WebElement outlet; 	
			
		@FindBy(xpath="//li[contains(text(),'Counter')]")
		private static WebElement counter; 	
			
		@FindBy(xpath="//li[contains(text(),'Member Type')]")
		private static WebElement memberType; 	
			
		@FindBy(xpath="//li[contains(text(),'Gift Voucher Definition')]")
		private static WebElement giftVoucherDefinition; 	
			
		@FindBy(xpath="//li[contains(text(),'Category')]")
		private static WebElement category; 	
			
		@FindBy(xpath="//li[contains(text(),'Bank Card Type')]")
		private static WebElement bankCardType; 	
			
		@FindBy(xpath="//*[@id='MasterMenu']/li[56]")
		private static WebElement member; 	
			
		@FindBy(xpath="//li[contains(text(),'Discount Voucher Definition')]")
		private static WebElement discountVoucherDefinition; 	
			
		@FindBy(xpath="//li[contains(text(),'Floor')]")
		private static WebElement floor; 	
			
		@FindBy(xpath="//li[contains(text(),'Section')]")
		private static WebElement section; 	
			
		@FindBy(xpath="//li[contains(text(),'Table')]")
		private static WebElement table; 	
			
		@FindBy(xpath="//li[contains(text(),'Guest')]")
		private static WebElement guest; 	
			
		@FindBy(xpath="//li[contains(text(),'Void Remarks')]")
		private static WebElement voidRemarks; 	
			
		@FindBy(xpath="//li[contains(text(),'Member Card Definition')]")
		private static WebElement memberCardDefinition; 	
			
		@FindBy(xpath="//li[contains(text(),'Return Remarks')]")
		private static WebElement returnRemarks; 	
			
		@FindBy(xpath="//li[contains(text(),'Kitchen Display System')]")
		private static WebElement kitchenDisplaySystem; 	
			
		@FindBy(xpath="//li[contains(text(),'Delivery Time Interval')]")
		private static WebElement deliveryTimeInterval; 	
			
		@FindBy(xpath="//li[contains(text(),'E- Payment')]")
		private static WebElement ePayment; 	

		
	//Name Fields		
	@FindBy(xpath="//*[@id='ctrlAuthorizationH']")
	private static WebElement nameTxt; 	
		
	@FindBy(xpath="//*[@id='ctrlAuthorizationH_input_settings']/span")
	private static WebElement nameSettingBtn; 	

	    @FindBy(xpath="//*[@id='ctrlAuthorizationH_customize_popup_heading']")
	    private static WebElement nameSettingPop_CustomizeDisplayColoumnLabel;
	
	    @FindBy(xpath="//*[@id='ctrlAuthorizationH_customize_popup_container']")
	    private static WebElement nameSettingPop_sAuthorizationTxt;
	
	    @FindBy(xpath="//*[@id='ctrlAuthorizationH_customize_popup_footer']/div/div/input[1]")
	    private static WebElement nameSettingPop_StandardFieldsBtn;
	
			@FindBy(xpath="//*[@id='ctrlAuthorizationH_customize_popup_standardfields_list']")
		    private static WebElement nameSettingPop_StandardFields_FiledDropdown;
		
			@FindBy(xpath="//*[@id='ctrlAuthorizationH_customize_popup_standardfields_header']")
		    private static WebElement nameSettingPop_StandardFields_HeaderTxt;
		
			@FindBy(xpath="//*[@id='ctrlAuthorizationH_customize_popup_standardfields_alignment']")
		    private static WebElement nameSettingPop_StandardFields_AlignmentDropdown;
		
			@FindBy(xpath="//*[@id='ctrlAuthorizationH_customize_popup_standardfields_width']")
		    private static WebElement nameSettingPop_StandardFields_WidthTxt;
		
			@FindBy(xpath="//*[@id='ctrlAuthorizationH_customize_popup_footer']/div/div/input[3]")
			private static WebElement nameSettingPop_StandardFields_OkBtn;
			
			@FindBy(xpath="//*[@id='ctrlAuthorizationH_customize_popup_footer']/div/div/input[4]")
			private static WebElement nameSettingPop_StandardFields_CancelBtn;
	
	    @FindBy(xpath="//*[@id='ctrlAuthorizationH_customize_popup_footer']/div/div/input[2]")
	    private static WebElement nameSettingPop_DeleteColoumnBtn;
	
	    @FindBy(xpath="//*[@id='ctrlAuthorizationH_customize_popup_footer']/div/div/input[3]")
	    private static WebElement nameSettingPop_OkBtn;
	
	    @FindBy(xpath="//*[@id='ctrlAuthorizationH_customize_popup_footer']/div/div/input[4]")
	    private static WebElement nameSettingPop_CancelBtn;
	
	
	@FindBy(xpath="//*[@id='chkActive']")
	private static WebElement activeChkBox;  
	
	@FindBy(xpath="//*[@id='chkAlwaysauthorizationstartsfromfirstlevel']")
	private static WebElement alwaysauthorizationstartsfromfirstlevelChkBox; 
		
	
	//Master Authorization Clear,Delete,Save,Cancel
	@FindBy(xpath="//*[@id='ulAuthBtns']/li[1]/span/i")
	private static WebElement clearbtn; 
	
	@FindBy(xpath="//*[@id='spndeleteProfile']/i")
	private static WebElement deleteBtn; 
	
	@FindBy(xpath="//*[@id='btnSaveAuthorization']/i")
	private static WebElement saveBtn; 
	
	@FindBy(xpath="//*[@id='btnMasterSaveClick']")
	public static WebElement itemSaveBtn;
	
	@FindBy(xpath="//*[@id='ulAuthBtns']/li[5]/span/i")
	private static WebElement cancelBtn; 
		
	
	//Action On Initial Rejection
	@FindBy(xpath="//*[@id='ddlAuthStatus']")
	private static WebElement statusDropdown; 	
	
	@FindBy(xpath="//*[@id='chkSuspendCreditLimit']")
	private static WebElement suspendedCreditLimitChkBox;
	
	@FindBy(xpath="//*[@id='spnAddLevel']/i")
	private static WebElement addLevelBtn; 
	
	@FindBy(xpath="//*[@id='spnAddParallel']/i")
	private static WebElement addParallelBtn;    
	
	
	@FindBy(xpath="//i[@id='id_StartNode']")
	private static WebElement startPointBtn; 
	
	//After Clicking On AddLevel/Add Parallel Button The Authorization Definition POp Rises--Related Fields 
	@FindBy(xpath="//*[@id='id_report_popup_heading']")
	private static WebElement authorizationDefinitionLabel; 
		
	@FindBy(xpath="//span[contains(text(),'Condition')]")
	private static WebElement conditionTab; 
		
	//Description Fields
	@FindBy(xpath="//*[@id='txtDescription']")
	private static WebElement descriptionTxt; 
		
	@FindBy(xpath="//*[@id='chkConditionNotRequired']")
	private static WebElement conditionNotRequiredChkBox; 
	
	@FindBy(xpath="//*[@id='chkCreditLimitExceeded']")
	private static WebElement creditLimitExceededChkBox; 
		
	@FindBy(xpath="//*[@id='chkBudgetExceeded']")
	private static WebElement budgetExceededChkBox; 
		
	@FindBy(xpath="//*[@id='chkNegativeCashCheck']")
	private static WebElement negativeCashCheckChkBox; 
		
	@FindBy(xpath="//*[@id='chkLineWiseAuthorization']")
	private static WebElement lineWiseAuthorizationChkBox; 
		
	@FindBy(xpath="//*[@id='chkCreditDaysExceeded']")
	private static WebElement creditDaysExceededChkBox; 
		
	@FindBy(xpath="//*[@id='chkNegativeStockCheck']")
	private static WebElement negativeStockCheckChkBox; 
		
	@FindBy(xpath="//*[@id='chkDateRange']")
	private static WebElement dateRangeChkBox; 
		
	@FindBy(xpath="//*[@id='dpFromDate']")
	private static WebElement fromDateTxt; 
		
	@FindBy(xpath="//*[@id='dpToDate']")
	private static WebElement toDateTxt; 
	
	@FindBy(xpath="//*[@id='chkTimeRange']")
	private static WebElement timeRangeChkBox;
		
	@FindBy(xpath="//*[@id='chkTimeRange']")
	private static WebElement fromTimeTxt; 
		
	@FindBy(xpath="//*[@id='tpToTime']")
	private static WebElement totimeTxt; 
	
	
	//Condition Condition Fields
	@FindBy(xpath="//*[@id='67_0_AdvanceFilter_']/table/tbody/tr/td[1]/select")
	private static WebElement conjunctionDropdown; 
		
	@FindBy(xpath="//tbody//input[@placeholder='Select Field']")
	private static WebElement selectFieldTxt; 

    //Selection Field  Inner Fields
	@FindBy(xpath="//*[@id='5021']")
	private static WebElement sName;
	
	@FindBy(xpath="//*[@id='5003']")
	private static WebElement sCode;
	
	@FindBy(xpath="//*[@id='5023']")
	private static WebElement iproductType;
	
	
	@FindBy(xpath="//*[@id='5004']")
	private static WebElement iAccountType;
	
	@FindBy(xpath="//*[@id='5005']")
	private static WebElement fCreditLimit;
	
	@FindBy(xpath="//*[@id='5006']")
	private static WebElement iCreditDays;
	
	@FindBy(xpath="//*[@id='300012']")
	private static WebElement iDebitCreditProposal;
	
	@FindBy(xpath="//*[@id='300013']")
	private static WebElement iDebitCreditRequired;
	
	@FindBy(xpath="//*[@id='300014']")
	private static WebElement iExchangeAdjustmentGainAC;
	
	@FindBy(xpath="//*[@id='300015']")
	private static WebElement iExchangeAdjustmentLossAC;
	
	@FindBy(xpath="//*[@id='300016']")
	private static WebElement iPrimaryAccount;
	
	@FindBy(xpath="//*[@id='300018']")
	private static WebElement iConsolidationMethod;
	
	@FindBy(xpath="//*[@id='300023']")
	private static WebElement sAddress;
	
	@FindBy(xpath="//*[@id='300024']")
	private static WebElement sDeliveryAddress;
	
	@FindBy(xpath="//*[@id='300027']")
	private static WebElement sPin;
	
	@FindBy(xpath="//*[@id='300028']")
	private static WebElement sDeliveryPin;
	
	@FindBy(xpath="//*[@id='300083']")
	private static WebElement iCity;
	
	@FindBy(xpath="//*[@id='300084']")
	private static WebElement iDeliveryCity;
	
	@FindBy(xpath="//*[@id='300249']")
	private static WebElement sEmail;
	
	@FindBy(xpath="//*[@id='300250']")
	private static WebElement bSendEmailtocustomer;
	
	@FindBy(xpath="//*[@id='302774']")
	private static WebElement fChequeDiscountLimit;
	
	@FindBy(xpath="//*[@id='302870']")
	private static WebElement fRateofinterest;
	
	@FindBy(xpath="//*[@id='302968']")
	private static WebElement iBankAC;
	
	@FindBy(xpath="//*[@id='303573']")
	private static WebElement sTelNo;
	
	@FindBy(xpath="//*[@id='303574']")
	private static WebElement sFaxNo;
	
	@FindBy(xpath="//*[@id='303785']")
	private static WebElement sPassword;
	
	@FindBy(xpath="//*[@id='303786']")
	private static WebElement bAllowCustomerPortal;
	
	@FindBy(xpath="//*[@id='303935']")
	private static WebElement sBankAccountName;
	
	@FindBy(xpath="//*[@id='303936']")
	private static WebElement sBankAccountNumber;
	
	@FindBy(xpath="//*[@id='303937']")
	private static WebElement sIFSCCode;
	
	@FindBy(xpath="//*[@id='304047']")
	private static WebElement iPaymentType;
	
	@FindBy(xpath="//*[@id='304157']")
	private static WebElement iPDCDiscountedAC;
	
	@FindBy(xpath="//*[@id='304269']")
	private static WebElement sFinanceEmail;
	
	@FindBy(xpath="//*[@id='304379']")
	private static WebElement sPortalEmail;
		
	@FindBy(xpath="//*[@id='67_0_AdvanceFilter_']/table/tbody/tr/td[3]/select")
	private static WebElement selectOperatorDropdown; 
		
	@FindBy(xpath="//*[@id='67_0_AdvanceFilter_']/table/tbody/tr/td[4]/select")
	private static WebElement compareWithDropdown; 
		
	@FindBy(xpath="//*[@id='67_0_AdvanceFilter_']/table/tbody/tr/td[5]/input")
	private static WebElement valueTxt;
	
	@FindBy(xpath="//select[@id='advancefilter_SelectOptionControl_67_0']")
	private static WebElement valueDropdown;
		
	@FindBy(xpath="//*[@id='67_0_AdvanceFilter_']/table/tbody/tr/td[6]/span")
	private static WebElement deleteRow1Btn; 
		
	@FindBy(xpath="//*[@id='67_0_AdvanceFilter_']/table/tbody/tr/td[7]/span")
	private static WebElement addRowBtn; 
		
	@FindBy(xpath="//*[@id='67_0_AdvanceFilter']/table/tbody/tr[2]/td[6]/span")
	private static WebElement deleteSecondRowBtn; 
	
	@FindBy(xpath="//*[@id='67_0_AdvanceFilter_']/table/tbody/tr[2]/td[1]/select")
	private static WebElement conjunctionDropdown2; 
	
	@FindBy(xpath="//*[@id='67_0_AdvanceFilter_']/table/tbody/tr[2]/td[2]")
	private static WebElement selectFieldTxt2; 
	
	@FindBy(xpath="//*[@id='67_0_AdvanceFilter_']/table/tbody/tr[2]/td[3]/select")
	private static WebElement selectOperatorDropdown2; 
	
	@FindBy(xpath="//*[@id='67_0_AdvanceFilter_']/table/tbody/tr[2]/td[4]/select")
	private static WebElement comparewithDropdown2; 
	
	@FindBy(xpath="//*[@id='67_0_AdvanceFilter_']/table/tbody/tr[2]/td[5]/input")
	private static WebElement valueTxt2; 
	
	@FindBy(xpath="//*[@id='advancefilter_SelectOptionControl_67_0']")
	private static WebElement valueDropdown2; 
	
	//On Entry
	@FindBy(xpath="//select[@id='ddlStatus']")
	private static WebElement actionOnEntryStatusDropdown; 	
		
	//Authorization Mode
	@FindBy(xpath="//*[@id='chkFullAuthorization']")
	private static WebElement fullAuthorizationChkBox; 	
	
	//Undo AuthorizationOn Editing
	@FindBy(xpath="//*[@id='ddlUndoAuthEditing']")
	private static WebElement undoAuthEditingDropdown; 	
	
	
	//Master Authorization Add Field User Selection
	@FindBy(xpath="//*[@id='id_report_popup_body']/div[2]/div/div[1]/ul/li[2]/a/span")
	private static WebElement userSelectionTab;
	
	@FindBy(xpath="//*[@id='ddlUserSelection']")
	private static WebElement userselectionDropdown;
	
	@FindBy(xpath="//*[@id='ddlCriteria']")
	private static WebElement criteriaDropdown;
	
	// Grid
	@FindBy(xpath="//*[@id='id_tblUserSelection_User']")
	private static WebElement userdropdown; 	
	
	@FindBy(xpath="//*[@id='id_tblUserSelection_col_1-1']")
	private static WebElement userrow1;
		
	@FindBy(xpath="//*[@id='id_tblUserSelection_col_2-1']")
	private static WebElement userrow2; 
	
	//Alert Tab Fields
	@FindBy(xpath="//*[@id='id_report_popup_body']/div[2]/div/div[1]/ul/li[3]/a/span")
	private static WebElement alertsTab;	
		
	//Grid
	@FindBy(xpath="//*[@id='chkReceived']")
	private static WebElement receivedChkBox;	
		
	@FindBy(xpath="//*[@id='chkApproved']")
	private static WebElement approvedChkBox;	
		
	@FindBy(xpath="//*[@id='chkRejected']")
	private static WebElement rejectedChkBox;	
		
	@FindBy(xpath="//*[@id='chkStopped']")
	private static WebElement stoppedChkBox;	
	
	//EmailHeaderTemplate
	@FindBy(xpath="//*[@id='id_tblAlerts_control_heading_2']/div/u")
	private static WebElement emailHeaderTemplateBtn;	
	
		@FindBy(xpath="//*[@id='id_SMSTemplate']/div/nav/div/div[1]/a/div/span[2]")
		private static WebElement emailHeaderTemplate_CustomizeTemplateLabel;	
		
	//Header Fields Of Customize Template Pop
	@FindBy(xpath="//*[@id='btnNewSmsTemplate']")
	private static WebElement customizeTemplateNewBtn;	
	
	@FindBy(xpath="//*[@id='btnSaveSmsTemplate']")
	private static WebElement customizeTemplateSaveBtn;	
		
	@FindBy(xpath="//*[@id='btnCloseSMSModal']")
	private static WebElement customizeTemplateCloseBtn;	
		
	@FindBy(xpath="//*[@id='smsTemplateOptCtrl']")
	private static WebElement customizeTemplateTemplatestxt;	
		
	@FindBy(xpath="//*[@id='smsTemplateOptCtrl_input_settings']/span")
	private static WebElement customizeTemplate_TemplatesSettingBtn;	
	
	
		@FindBy(xpath="//*[@id='smsTemplateOptCtrl_customize_popup_heading']")
		private static WebElement templateSettingPop_CustomizeDisplayColoumnLabel;
		         
		@FindBy(xpath="//*[@id='smsTemplateOptCtrl_customize_popup_container']")
		private static WebElement templateSettingPop_sTemplateNameTxt;

		@FindBy(xpath="//*[@id='smsTemplateOptCtrl_customize_popup_footer']/div/div/input[1]")
		private static WebElement templateSettingPop_StandardFieldsBtn;

			@FindBy(xpath="//*[@id='smsTemplateOptCtrl_customize_popup_standardfields_list']")
		    private static WebElement templateSettingPop_StandardFields_FiledDropdown;
		
			@FindBy(xpath="//*[@id='smsTemplateOptCtrl_customize_popup_standardfields_header']")
		    private static WebElement templateSettingPop_StandardFields_HeaderTxt;
		
			@FindBy(xpath="//*[@id='smsTemplateOptCtrl_customize_popup_standardfields_alignment']")
		    private static WebElement templateSettingPop_StandardFields_AlignmentDropdown;
		
			@FindBy(xpath="//*[@id='smsTemplateOptCtrl_customize_popup_standardfields_width']")
		    private static WebElement templateSettingPop_StandardFields_WidthTxt;
		
			@FindBy(xpath="//*[@id='smsTemplateOptCtrl_customize_popup_footer']/div/div/input[3]")
			private static WebElement templateSettingPop_StandardFields_OkBtn;
			
			@FindBy(xpath="//*[@id='smsTemplateOptCtrl_customize_popup_footer']/div/div/input[4]")
			private static WebElement templateSettingPop_StandardFields_CancelBtn;

		@FindBy(xpath="//*[@id='smsTemplateOptCtrl_customize_popup_footer']/div/div/input[2]")
		private static WebElement templateSettingPop_DeleteColoumnBtn;

		@FindBy(xpath="//*[@id='smsTemplateOptCtrl_customize_popup_footer']/div/div/input[3]")
		private static WebElement templateSettingPop_OkBtn;

		@FindBy(xpath="//*[@id='smsTemplateOptCtrl_customize_popup_footer']/div/div/input[4]")
		private static WebElement templateSettingPop_CancelBtn;
		
	//Email Template Tab			
	//Header Fields
	@FindBy(xpath="//u[contains(text(),'Email Template')]")
	private static WebElement emailTemplateBtn;				
				
	@FindBy(xpath="//*[@id='forHf']/span[1]/span/i[1]")
	private static WebElement emailTemplateNewBtn;	
	
	@FindBy(xpath="//i[@class='icon-font6 icon-new']")
	private static WebElement  newdropdown;
	
	@FindBy(xpath="//*[@id='forHf']/span[1]/ul/li/a[1]")
	private static WebElement  new_LayoutBtn;
	
	@FindBy(xpath="//*[@id='forHf']/span[1]/ul/li/a[2]")
	private static WebElement  new_PageBtn;
	
	@FindBy(xpath="//i[@class='icon-font6 icon-open']")
	private static WebElement  opendropdown;
	
	@FindBy(xpath="//*[@id='forHf']/span[2]/ul/li/a[1]")
	private static WebElement  openBtn;

	   //Pop
	    @FindBy(xpath="//*[@id='1']")
	    private static WebElement  open_Selct1Option;
	
	    @FindBy(xpath="//button[@id='btn_PopUpOk']")
		private static WebElement  openBtn_OkBtn;
		
		@FindBy(xpath="//div[@id='id_PopUp']//button[@class='Fbutton'][contains(text(),'Cancel')]")
		private static WebElement  openBtn_CancelBtn;
	
	@FindBy(xpath="//*[@id='forHf']/span[2]/ul/li/a[2]")
	private static WebElement fromXMLBtn;
	
	@FindBy(xpath="//i[@class='icon-font6 icon-save']")
	private static WebElement  savedropdown;

		@FindBy(xpath="//*[@id='forHf']/span[3]/ul/li/a[1]")
		private static WebElement  emailPrintSaveBtn;
		
		@FindBy(xpath="//*[@id='forHf']/span[3]/ul/li/a[2]")
		private static WebElement  saveAsBtn; 
		
		@FindBy(xpath="//input[@id='id_PopuplayoutName']")
		private static WebElement  saveTxtField;
		
		@FindBy(xpath="//input[@id='id_PopuplayoutName']")
		private static WebElement  save_OkBtn;
		
		@FindBy(xpath="//*[@id='id_PopUp']/div/div/div[3]/button[2]")
		private static WebElement  save_CancekBtn;
		
		@FindBy(xpath="//*[@id='forHf']/span[3]/ul/li/a[3]")
		private static WebElement  saveAsImageBtn; //No Response
		
		@FindBy(xpath="//*[@id='forHf']/span[3]/ul/li/a[4]")
		private static WebElement  saveAsXMLBtn; // Downloads xml file
		
		@FindBy(xpath="//*[@id='forHf']/span[3]/ul/li/a[5]")
		private static WebElement  saveAsHTMLBtn; 

	@FindBy(xpath="//*[@id='forHf']/span[4]")
	private static WebElement  removedropdown;

		@FindBy(xpath="//*[@id='forHf']/span[4]/ul/li/a[1]")
		private static WebElement  removeBtn;  
		
		@FindBy(xpath="//*[@id='forHf']/span[4]/ul/li/a[2]")
		private static WebElement  removeCurrentPageBtn; 
                          
		/*//popup Error MEssage 
		@FindBy(xpath="//*[@id='idGlobalError']/div/table/tbody/tr/td[2]/div[1]")
		private static WebElement  newerrorMessage;//This Is only Page.You Not Delete this Page --Message while using RemovecurrentPAgeBtn 
*/		
		@FindBy(xpath="//*[@id='forHf']/span[4]/ul/li/a[3]")
		private static WebElement  removeControlBtn;				

	@FindBy(xpath="//*[@id='forHf']/span[5]")
	private static WebElement  pageNo;
	
	@FindBy(xpath="//*[@id='forHf']/span[6]")
	private static WebElement  controldrpdown;
		
		@FindBy(xpath="//*[@id='forHf']/span[6]/ul/li/a[1]")
		private static WebElement  staticTextBtn;
		
		@FindBy(xpath="//*[@id='forHf']/span[6]/ul/li/a[2]")
		private static WebElement  bitmapBtn;
		
		@FindBy(xpath="//*[@id='forHf']/span[6]/ul/li/a[3]")
		private static WebElement  bodyGridBtn;	
		
		@FindBy(xpath="//*[@id='forHf']/span[6]/ul/li/a[4]")
		private static WebElement  rectangleBtn;	
		
		@FindBy(xpath="//*[@id='forHf']/span[6]/ul/li/a[5]")
		private static WebElement  ecllipseBtn;	
		
		@FindBy(xpath="//*[@id='forHf']/span[6]/ul/li/a[6]")
		private static WebElement  lineBtn;	
		
		@FindBy(xpath="//*[@id='forHf']/span[6]/ul/li/a[7]")
		private static WebElement  areaBtn;
		
		@FindBy(xpath="//*[@id='forHf']/span[6]/ul/li/a[8]")
		private static WebElement  tableBtn;
		
		@FindBy(xpath="//*[@id='forHf']/span[6]/ul/li/a[9]")
		private static WebElement  approvalHistoryBtn;
	
	@FindBy(xpath="//*[@id='forHf']/span[7]/span/i[1]")
	private static WebElement  alignmentdropdown;
		
		@FindBy(xpath="//*[@id='forHf']/span[7]/ul/li/a[1]")
		private static WebElement  leftAlignmentBtn;
					
		@FindBy(xpath="//*[@id='forHf']/span[7]/ul/li/a[2]")
		private static WebElement  rightAlignmentBtn;
		
		@FindBy(xpath="//*[@id='forHf']/span[7]/ul/li/a[3]")
		private static WebElement  topAlignmentBtn;	
		
		@FindBy(xpath="//*[@id='forHf']/span[7]/ul/li/a[4]")
		private static WebElement  bottomAlignmentBtn;
	
	@FindBy(xpath="//*[@id='forHf']/span[8]")
	private static WebElement  sizedropdown;

		@FindBy(xpath="//*[@id='forHf']/span[8]/ul/li/a[1]")
		private static WebElement  sameSizeBtn;
					
		@FindBy(xpath="//*[@id='forHf']/span[8]/ul/li/a[2]")
		private static WebElement  sameWidthBtn;
		
		@FindBy(xpath="//*[@id='forHf']/span[8]/ul/li/a[3]")
		private static WebElement  sameHeightBtn;
	
	@FindBy(xpath="//*[@id='forHf']/span[9]")
	private static WebElement  printdropdown;
	
	@FindBy(xpath="//*[@id='menu-print']")
	private static WebElement  print_PrintBtn;
					
		@FindBy(xpath="//*[@id='menu-preview']	")
		private static WebElement  print_PreviewBtn;
		
		@FindBy(xpath="//*[@id='fit-button']")
		private static WebElement  preview_FitToWidthBtn;
		
		@FindBy(xpath="//*[@id='zoom-in-button']")
		private static WebElement  previewZ_ZoomInBtn;
		
		@FindBy(xpath="//*[@id='zoom-out-button']")
		private static WebElement  preview_ZoomOutBtn;
		
		@FindBy(xpath="//*[@id='forHf']/span[9]/ul/li/a[3]")
		private static WebElement  pageSetUpBtn;
		
		@FindBy(xpath="//*[@id='id_PageSetUpPreview']")
		private static WebElement  pageSetupPagePreviewField;
		
		@FindBy(xpath="//*[@id='id_PageType']")
		private static WebElement  pageSetupPaperSizedropdown;
		
		@FindBy(xpath="//*[@id='id_PaperOrientation'][@value='0']")
		private static WebElement  pageSetupPotraitRadio;
		
		@FindBy(xpath="//*[@id='id_PaperOrientation'][@value='1']")
		private static WebElement  pageSetupLandScapeRadio;
		
		@FindBy(xpath="//*[@id='id_PaperUnit'][@value='0']")
		private static WebElement  pageSetupCentimetersRadio;
		
		@FindBy(xpath="//*[@id='id_PaperUnit'][@value='1']")
		private static WebElement  pageSetupInchesRadio;
		
		@FindBy(xpath="//*[@id='id_PageSizeLeftMarginDisplay']")
		private static WebElement  pageSetupLeftTxt;
		
		@FindBy(xpath="//*[@id='id_PageSizeRightMarginDisplay']")
		private static WebElement  pageSetupRightTxt;
		
		@FindBy(xpath="//*[@id='id_PageSizeTopMarginDisplay']")
		private static WebElement  pageSetupTopTxt;
		
		@FindBy(xpath="//*[@id='id_PageSizeTopMarginDisplay']")
		private static WebElement  pageSetupBottomTxt;
		
		@FindBy(xpath="//*[@id='id_PageSetupOkBtn']")
		private static WebElement  pageSetupOkBtn;
		
		@FindBy(xpath="//*[@id='id_PageSetupCancelBtn']")
		private static WebElement  pageSetUpCancelBtn;
                  
	@FindBy(xpath="//*[@id='id_InvoiceDesingCancel']/i")
	private static WebElement  exitBtn;

    //Header Elements

	
	@FindBy(xpath="//*[@id='li_InvoicePageSetup']/a")
	private static WebElement  headerPageSetUpTab;
	
	@FindBy(xpath="//*[@id='li_InvoiceDesigner']/a")
	private static WebElement headerDesignerTab;
	
	@FindBy(xpath="//*[@id='li_InvoicePreview']/a")
	private static WebElement  headerPreviewTab;

	//Fields  
	
	@FindBy(xpath="//*[@id='LiDesignField']/a")
	private static WebElement  headerFieldsTab;
	
	@FindBy(xpath="//*[@id='LiProp']/a")
	private static WebElement  headerPropertiesTab;

	@FindBy(xpath="//span[contains(text(),'Company')]//i[@class='icon-expand icon-font8']")
	private static WebElement  fields_CompanyExpandBtn;

		@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'Company Name')]")
		private static WebElement  fields_Company_CompanyName;
		
		@FindBy(xpath="//span[contains(text(),'Company Code')]")
		private static WebElement  fields_Company_CompanyCode;
		
		@FindBy(xpath="//span[contains(text(),'Accounting Date')]")
		private static WebElement  fields_Company_AccountingDate;
		
		@FindBy(xpath="//span[contains(text(),'Address1')]")
		private static WebElement  fields_Company_Address1;
		
		@FindBy(xpath="//span[contains(text(),'Address2')]")
		private static WebElement  fields_Company_Address2;
		
		@FindBy(xpath="//li[@class='treeview active']//span[contains(text(),'City')]")
		private static WebElement  fields_Company_City;
		
		@FindBy(xpath="//span[contains(text(),'Zip Code')]")
		private static WebElement  fields_Company_Zipcode;
		
		@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'Country')]")
		private static WebElement  fields_Company_Country;
		
		@FindBy(xpath="//span[contains(text(),'Phone No1')]")
		private static WebElement  fields_Company_PhoneNumber1;
		
		@FindBy(xpath="//span[contains(text(),'Phone No2')]")
		private static WebElement  fields_Company_PhoneNumber2;
		
		@FindBy(xpath="//li[@class='treeview active']//span[contains(text(),'Fax')]")
		private static WebElement  fields_Company_Fax;
		
		@FindBy(xpath="//span[contains(text(),'Tax Registration Number')]")
		private static WebElement  fields_Company_TaxRegestrationNumber;
		
		@FindBy(xpath="//span[contains(text(),'Excise Registration Number')]")
		private static WebElement  fields_Company_ExciseRegistrationNumber;
		
	@FindBy(xpath="//span[contains(text(),'Master Fields')]//i[@class='icon-expand icon-font8']")
	private static WebElement fields_MasterFieldsExpandBtn; 	
	                       
		@FindBy(xpath="//span[contains(text(),'sName')]")
		private static WebElement fields_sName; 	
			
		@FindBy(xpath="//span[contains(text(),'sCode')]")
		private static WebElement fields_sCode; 	
			
		@FindBy(xpath="//span[contains(text(),'iAccountType')]")
		private static WebElement fields_iAccountType; 	
			
		@FindBy(xpath="//span[contains(text(),'fCreditLimit')]")
		private static WebElement fields_fCreditLimit; 	
			
		@FindBy(xpath="//span[contains(text(),'iCreditDays')]")
		private static WebElement fields_iCreditDays; 	
			
		@FindBy(xpath="//span[contains(text(),'iDebitCreditProposal')]")
		private static WebElement fields_iDebitCreditProposal; 	
			
		@FindBy(xpath="//span[contains(text(),'iDebitCreditRequired')]")
		private static WebElement fields_iDebitCreditRequired; 	
			
		@FindBy(xpath="//span[contains(text(),'iExchangeAdjustmentGainAC')]")
		private static WebElement fields_iExchangeAdjustmentGainAC; 	
			
		@FindBy(xpath="//span[contains(text(),'iExchangeAdjustmentLossAC')]")
		private static WebElement fields_iExchangeAdjustmentLossAC; 	
			
		@FindBy(xpath="//span[contains(text(),'iPrimaryAccount')]")
		private static WebElement fields_iPrimaryAccount; 	
			
		@FindBy(xpath="//span[contains(text(),'iDefaultCurrency')]")
		private static WebElement fields_iDefaultCurrency; 	
			
		@FindBy(xpath="//span[contains(text(),'iConsolidationMethod')]")
		private static WebElement fields_iConsolidationMethod; 	
			
		@FindBy(xpath="//span[contains(text(),'iPaymentTerms')]")
		private static WebElement fields_iPaymentTerms; 	
			
		@FindBy(xpath="//span[contains(text(),'iReminderTerms')]")
		private static WebElement fields_iReminderTerms; 	
			
		@FindBy(xpath="//span[contains(text(),'iFinanceChargeTerms')]")
		private static WebElement fields_iFinanceChargeTerms; 	
			
		@FindBy(xpath="//span[contains(text(),'sAddress')]")
		private static WebElement fields_sAddress; 	
			
		@FindBy(xpath="//span[contains(text(),'sDeliveryAddress')]")
		private static WebElement fields_sDeliveryAddress; 	
			
		@FindBy(xpath="//span[contains(text(),'sPin')]")
		private static WebElement fields_sPin; 	
			
		@FindBy(xpath="//span[contains(text(),'sDeliveryPin')]")
		private static WebElement fields_sDeliveryPin; 	
			
		@FindBy(xpath="//span[contains(text(),'iCity')]")
		private static WebElement fields_iCity; 	
			
		@FindBy(xpath="//span[contains(text(),'iDeliveryCity')]")
		private static WebElement fields_iDeliveryCity; 	
			
		@FindBy(xpath="//span[contains(text(),'sEMail')]")
		private static WebElement fields_sEmail; 	
			
		@FindBy(xpath="//span[contains(text(),'bSendEmailtocustomer')]")
		private static WebElement fields_bSendEmailtocustomer; 	
			
		@FindBy(xpath="//span[contains(text(),'fChequeDiscountLimit')]")
		private static WebElement fields_fChequeDiscountLimit; 	
			
		@FindBy(xpath="//span[contains(text(),'fRateofinterest')]")
		private static WebElement fields_fRateofinterest; 	
			
		@FindBy(xpath="//span[contains(text(),'iBankAc')]")
		private static WebElement fields_iBankAc; 	
			
		@FindBy(xpath="//span[contains(text(),'sTelNo')]")
		private static WebElement fields_sTelNo; 	
			
		@FindBy(xpath="//span[contains(text(),'sFaxNo')]")
		private static WebElement fields_sFaxNo; 	
			
		@FindBy(xpath="//span[contains(text(),'sPassword')]")
		private static WebElement fields_sPassword; 	
			
		@FindBy(xpath="//span[contains(text(),'bAllowCustomerPortal')]")
		private static WebElement fields_bAllowCustomerPortal; 	
			
		@FindBy(xpath="//span[contains(text(),'sBankAccountName')]")
		private static WebElement fields_sBankAccountName; 	
			
		@FindBy(xpath="//span[contains(text(),'sBankAccountNumber')]")
		private static WebElement fields_sBankAccountNumber; 	
			
		@FindBy(xpath="//span[contains(text(),'sIFSCCode')]")
		private static WebElement fields_sIFSCCode; 	
			
		@FindBy(xpath="//span[contains(text(),'iPaymentType')]")
		private static WebElement fields_iPaymentType; 	
			
		@FindBy(xpath="//span[contains(text(),'iPDCDiscountedAC')]")
		private static WebElement fields_iPDCDiscountedAC; 	
			
		@FindBy(xpath="//span[contains(text(),'sFinanceEmail')]")
		private static WebElement fields_sFinanceEmail; 	
			
		@FindBy(xpath="//span[contains(text(),'sPortalEmail')]")
		private static WebElement fields_sPortalEmail; 	
		
		
	//UserDetails
	@FindBy(xpath="//span[contains(text(),'User details')]//i[@class='icon-expand icon-font8']")
	private static WebElement  fields_UserDetailsExpandBtn;	

		@FindBy(xpath="//li[@class='treeview active']//li[1]//a[1]//span[1]")
		private static WebElement userDetails_UserName;
		
		@FindBy(xpath="//li[@class='treeview active']//li[2]//a[1]//span[1]")
		private static WebElement userDetails_MobileNumber;
		
		@FindBy(xpath="//li[@class='treeview active']//li[3]//a[1]//span[1]")
		private static WebElement userDetails_PhoneNumber;
		
		@FindBy(xpath="//li[@class='treeview active']//li[4]//a[1]//span[1]")
		private static WebElement userDetails_EmailId;
		
		@FindBy(xpath="//li[@class='treeview active']//li[5]//a[1]//span[1]")
		private static WebElement userDetails_Signature;
		
		@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'Employee')]")
		private static WebElement userDetails_Employee;
		
		@FindBy(xpath="//li[@class='treeview active']//li[7]//a[1]//span[1]")
		private static WebElement userDetails_AuthoriseUserName;
		
		@FindBy(xpath="//span[contains(text(),'Authorise User Mobile number')]")
		private static WebElement userDetails_AuthoriseUserMobileNumber;
		
		@FindBy(xpath="//span[contains(text(),'Authorise User Phone number')]")
		private static WebElement userDetails_AuthoriseUserPhoneNumber;
		
		@FindBy(xpath="//span[contains(text(),'Authorise User E-Mail Id')]")
		private static WebElement userDetails_AuthoriseUserEmailId;
		
		@FindBy(xpath="//span[contains(text(),'Authorise User Signature')]")
		private static WebElement userDetails_AuthoriseUserSignature;
		
		@FindBy(xpath="//span[contains(text(),'Authorise by')]")
		private static WebElement userDetails_AuthoriseBy;
		
		@FindBy(xpath="//span[contains(text(),'Next Authorise User name')]")
		private static WebElement userDetails_NextAuthoriseUserName;
		
		@FindBy(xpath="//span[contains(text(),'Next User Mobile number')]")
		private static WebElement userDetails_NextUserMobileNumber;
		
		@FindBy(xpath="//span[contains(text(),'Next User Phone number')]")
		private static WebElement userDetails_NextUserPhoneNumber;
		
		@FindBy(xpath="//span[contains(text(),'Next User E-Mail Id')]")
		private static WebElement userDetails_NextUserEmailId;
		
		@FindBy(xpath="//span[contains(text(),'Next User Signature')]")
		private static WebElement userDetails_NextUserSignature;
		
		@FindBy(xpath="//span[contains(text(),'Created by signature')]")
		private static WebElement userDetails_CreatedBySignature;
		               
		@FindBy(xpath="//span[contains(text(),'Modified by signature')]")
		private static WebElement userDetails_ModifiedBySignature;


  //Miscellaneous 
  @FindBy(xpath="//span[contains(text(),'Miscellaneous')]//i[@class='icon-expand icon-font8']")
  private static WebElement  fields_MiscellaneousExpandBtn;

	@FindBy(xpath="//span[contains(text(),'Login date')]")
	private static WebElement miscellaneous_Logindate;
	
	@FindBy(xpath="//span[contains(text(),'Page Number')]")
	private static WebElement miscellaneous_PageNumber;
	
	@FindBy(xpath="//span[contains(text(),'Print Date')]")
	private static WebElement miscellaneous_Printdate;
	
	@FindBy(xpath="//span[contains(text(),'Print Time')]")
	private static WebElement miscellaneous_PrintTime;
	
	@FindBy(xpath="//span[contains(text(),'Total Page')]")
	private static WebElement miscellaneous_TotalPage;
	
	@FindBy(xpath="//span[contains(text(),'S.No')]")
	private static WebElement miscellaneous_Sno;
	
	@FindBy(xpath="//span[contains(text(),'Page Type')]")
	private static WebElement miscellaneous_PageType;
	
	@FindBy(xpath="//span[contains(text(),'Ageing details')]")
	private static WebElement miscellaneous_AgeingDetails;
	
	@FindBy(xpath="//span[contains(text(),'Ageing amounts')]")
	private static WebElement miscellaneous_AgeingAmounts;
	
	@FindBy(xpath="//span[contains(text(),'Ageing headings')]")
	private static WebElement miscellaneous_AgeingHeadings;
	
	@FindBy(xpath="//span[contains(text(),'Ageing balance')]")
	private static WebElement miscellaneous_Ageingbalance;
	
	@FindBy(xpath="//span[contains(text(),'Ageing slab1')]")
	private static WebElement miscellaneous_AgeingSlab1;
	
	@FindBy(xpath="//span[contains(text(),'Ageing slab2')]")
	private static WebElement miscellaneous_AgeingSlab2;
	
	@FindBy(xpath="//span[contains(text(),'Ageing slab3')]")
	private static WebElement miscellaneous_AgeingSlab3;
	
	@FindBy(xpath="//span[contains(text(),'Ageing slab4')]")
	private static WebElement miscellaneous_AgeingSlab4;
	
	@FindBy(xpath="//span[contains(text(),'Ageing slab5')]")
	private static WebElement miscellaneous_AgeingSlab5;
	
	@FindBy(xpath="//span[contains(text(),'Ageing slab6')]")
	private static WebElement miscellaneous_AgeingSlab6;
	
	@FindBy(xpath="//span[contains(text(),'Ageing month-wise')]")
	private static WebElement miscellaneous_AgeingMonthWise;


	//'SMS template 
	@FindBy(xpath="//u[contains(text(),'SMS template')]")
	private static WebElement headerSMSTemplateBtn;					
	
	//Pop As Same Above EmailHeaderTemplate
	//Alerts
	@FindBy(xpath="//u[contains(text(),'Alerts')]")
	private static WebElement headerAlert;

	//Pop As Same Above EmailHeaderTemplate
	//Recipient
	@FindBy(xpath="//div[contains(text(),'Recipient')]")
	private static WebElement headerRecipient;					
	
	//Pop As Same Above EmailHeaderTemplate
	//Escalation
	@FindBy(xpath="//span[@class='font-5'][contains(text(),'Escalation')]")
	private static WebElement escalationTab;					
			
	
	@FindBy(xpath="//*[@id='spnAddEscalation']/i")
	private static WebElement escalationLevelAddBtn;					
		

	//First Escalation
	@FindBy(xpath="//*[@id='txtTimeLimit1']")
	private static WebElement timelimitTxt1;					
			
	@FindBy(xpath="//*[@id='ddlTimeLimit1']")
	private static WebElement dropdown1;					
			
	@FindBy(xpath="//*[@id='ddlEscalationType1']")
	private static WebElement escalationTypeDropdown1;	
	
	@FindBy(xpath="//*[@id='divEscalation1']/div[1]/div[2]/i[1]")
	private static WebElement minimize1;					
	
	@FindBy(xpath="//*[@id='divEscalation1']/div[1]/div[2]/i[2]")
	private static WebElement close1;					
		
	//Second Escalation
	@FindBy(xpath="//*[@id='txtTimeLimit2']")
	private static WebElement timelimitTxt2;					
			
	@FindBy(xpath="//*[@id='ddlTimeLimit2']")
	private static WebElement dropdown2;					
			
	@FindBy(xpath="//*[@id='ddlEscalationType2']")
	private static WebElement escalationTypeDropdown2;	
	
	@FindBy(xpath="//*[@id='divEscalation2']/div[1]/div[2]/i[1]")
	private static WebElement minimize2;					
	
	@FindBy(xpath="//*[@id='divEscalation2']/div[1]/div[2]/i[2]")
	private static WebElement close2;				


	//Ok And Cancel for Authorization Definition
	@FindBy(xpath="//*[@id='id_report_popup_ok']/i")
	private static WebElement definitionOkBtn;					
				
	@FindBy(xpath="//*[@id='id_report_popup_cancel']/i	")
	private static WebElement definitionCancelBtn;					
		
	@FindBy(xpath="//*[@id='16']/div/span")
	private static WebElement  settingsmenuBtn;
	
	@FindBy(xpath="//span[contains(text(),'Configure Transactions')]")
	private static WebElement  configureTransactionBtn;

	@FindBy(xpath="//*[@id='68']/span")
	private static WebElement  transactionAuthorizationBtn;
	
	@FindBy(xpath="//*[@id='235']/span")
	private static WebElement  pricebookAuthorizationBtn;
	
	@FindBy(xpath="//*[@id='19']/span")
	private static WebElement  configureMastersBtn;
	
	@FindBy(xpath="//*[@id='67']/span")
	private static WebElement  masterAuthorizationBtn;
	
	@FindBy(xpath="//*[@id='69']/span")
	private static WebElement  creditLimitAuthorizationBtn;
	
	@FindBy(xpath="//*[@id='74']/span")
	private static WebElement  designWorkflowBtn;
	
	@FindBy(xpath="//*[@id='105']/span")
	private static WebElement  settingsWizardBtn;
	
	@FindBy(xpath="//*[@id='232']/span")
	private static WebElement  batchCodeGenerationBtn;
	
	@FindBy(xpath="//*[@id='34']/span")
	private static WebElement  mapCreditLimitBtn;
	
	@FindBy(xpath="//*[@id='257']/span")
	private static WebElement  vatTaxCodeBtn;
	
	@FindBy(xpath="//*[@id='258']/span")
	private static WebElement  customerPortalAdminBtn;
	
	@FindBy(xpath="//*[@id='3308']/span")
	private static WebElement  budgetAuthorizationBtn;
	
	@FindBy(xpath="//*[@id='3320']/span")
	private static WebElement  paymentGatewayIntegrationBtn;


	@FindBy(xpath="//*[@id='dashName']")
	private static WebElement dashboard;

	@FindBy(xpath="//span[@class='hidden-xs']")
	private static WebElement userNameDisplay;

	@FindBy(xpath="//*[@id='ulCompanyDetails_HomePage']/li[1]")
	private static WebElement companyName;

	@FindBy(xpath="//*[@id='companyLogo']")
	private static WebElement companyLogo;
	
	@FindBy(xpath="//input[@id='donotshow']")
	private static WebElement doNotShowCheckbox;
    
    @FindBy(xpath="//span[@class='pull-right']")
	private static WebElement closeBtnInDemoPopupScreen;
	
	/*public String checkValidationMessage(String ExpMessage) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
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
	}*/

		
		@FindBy(xpath="//button[contains(text(),'Ok')]")
		private static WebElement loginRefreshOkBtn;
		
		
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

		@FindBy (xpath="//*[@id='25']/span")
	     private static WebElement dataMangementMenu;


		 @FindBy (xpath="//*[@id='27']/span")
		 private static WebElement restore;
			

		 @FindBy (xpath="//button[@class='btn Fbutton']")
	     private static WebElement folderpathExpandBtn;

		 @FindBy (xpath="//button[@class='Fbutton'][contains(text(),'Yes')]")
		 private static WebElement overRideYesBtn;
	   	
	   	@FindBy (xpath="//button[@class='Fbutton'][contains(text(),'No')]")
	   	private static WebElement overRideNoBtn;
	   	
	   	@FindBy (xpath="//button[@class='Fbutton'][contains(text(),'Cancel')]")
	   	private static WebElement overRideCancelBtn;
	    	
   	
	   	@FindBy (xpath="//div[@id='RestoreControls']//div[1]//div[1]")
	    private static WebElement restoreCompanyBtn;

	   	 @FindBy(xpath="//select[@id='ddlCompany']")
		 private static WebElement companyDropDownList;

	
		public boolean checkLoginToCheckMasterAuthorization() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
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
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
			homeMenu.click();
				
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dataMangementMenu));
			dataMangementMenu.click();
				
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(restore));
			restore.click();
				
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(folderpathExpandBtn));
			folderpathExpandBtn.click();
				
		    Thread.sleep(3000);
			     
			Runtime.getRuntime().exec(getBaseDir()+"\\autoIt\\scripts\\Master Authorization BackUp.exe");
			     
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
			 
			 if(getIsAlertPresent())
			 {
			    	 getWaitForAlert();
			    	 
			    	 getAlert().accept();
			 }
				
	    Thread.sleep(3000);
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
			    	 
			 if(data.contains("Master Authorization"))
			 {
			    s.selectByVisibleText(data);
			    		 
			    break;
			   }
			 }
			     
			     
			 lp.clickOnSignInBtn();
			     
			 Thread.sleep(10000);
			     
			     
			String actUserInfo1=userNameDisplay.getText();
					
			System.out.println("User Info  : "+actUserInfo1);
				
				System.out.println("User Info Capture Text  :  "+userNameDisplay.getText());
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(companyLogo));
				companyLogo.click();
				
				String getCompanyTxt1=companyName.getText();
				String getLoginCompanyName1=getCompanyTxt1.substring(0, 19);
				System.out.println("company name  :  "+ getLoginCompanyName1);
				companyLogo.click();
				

			
					           	
			String userInfo=userNameDisplay.getText();
					    	
			System.out.println("User Info : "+userInfo);
					    	
			System.out.println("User Info Capture Text :"+userNameDisplay.getText());
					    	
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(companyLogo));
					    	
			companyLogo.click();
					    	
			String getCompanyTxt=companyName.getText();
			String getLoginCompanyName=getCompanyTxt.substring(0, 19);
			System.out.println("company name :"+ getLoginCompanyName);
			companyLogo.click();
					    	
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashboard));
					    	
			String getDashboard=dashboard.getText();
		   
			System.out.println("getDashboard"+getDashboard);
			
			if(userInfo.equalsIgnoreCase("SU"))
			{
				System.out.println("Test Pass : Transaction Authorization is Displayed");
				return true;
				
			}
			else
			{
				System.out.println("Test Fail : Transaction Authorization is Displayed");
				return false;
			}
		}
		

		
		/*public boolean checkLoginToCheckMasterAuthorization() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
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
					           	
			String userInfo=userNameDisplay.getText();
					    	
			System.out.println("User Info : "+userInfo);
					    	
			System.out.println("User Info Capture Text :"+userNameDisplay.getText());
					    	
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(companyLogo));
					    	
			companyLogo.click();
					    	
			String getCompanyTxt=companyName.getText();
			String getLoginCompanyName=getCompanyTxt.substring(0, 19);
			System.out.println("company name :"+ getLoginCompanyName);
			companyLogo.click();
					    	
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashboard));
					    	
			String getDashboard=dashboard.getText();
		   
			System.out.println("getDashboard"+getDashboard);
			
			if(userInfo.equalsIgnoreCase("SU"))
			{

				System.out.println("Test Pass : Transaction Authorization is Displayed");
				return true;
				
			}
			else
			{
				System.out.println("Test Fail : Transaction Authorization is Displayed");
				return false;
			}
		}*/
		
		


		public boolean 	checkOpenMasterAuthorization() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsmenuBtn));
			settingsmenuBtn.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterAuthorizationBtn));
			masterAuthorizationBtn.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterDropdown));
			
		    boolean actmasterDropdown                       = masterDropdown.isDisplayed();
			boolean actnameTxt                              = nameTxt.isDisplayed();
			boolean actactiveChkBox                         = activeChkBox.isDisplayed();
			boolean actalwaysauthorstartsfirstlevelChkBox   = alwaysauthorizationstartsfromfirstlevelChkBox.isDisplayed();
			boolean actaddLevelBtn                          = addLevelBtn.isDisplayed();
			boolean actaddParallelBtn                       = addParallelBtn.isDisplayed();
			boolean actclearbtn               				= clearbtn.isDisplayed();
			boolean actsaveBtn  							= saveBtn.isDisplayed();
			boolean actcancelBtn 							= cancelBtn.isDisplayed();
			boolean actdeleteBtn			                = deleteBtn.isDisplayed();
			boolean actstatusDropdown						= statusDropdown.isDisplayed();
			boolean actsuspendedCreditLimitChkBox			= suspendedCreditLimitChkBox.isDisplayed();
			
			boolean expmasterDropdown                       = true;
			boolean expnameTxt            					= true;
			boolean expactiveChkBox                			= true;
			boolean expalwaysauthorstartsfirstlevelChkBox   = true;
			boolean expaddLevelBtn          				= true;
			boolean expaddParallelBtn              			= true;
			boolean expclearbtn               				= true;
			boolean expsaveBtn  							= true;
			boolean expcancelBtn							= true;
			boolean expdeleteBtn							= true;
			boolean expstatusDropdown						= true;
			boolean expsuspendedCreditLimitChkBox			= true;
			
			System.out.println("********************* checkTransactionAuthorizationOptions ******************");
		
			System.out.println("Home Page masterDropdown                     :"+actmasterDropdown                      +"  Value Expected : "+expmasterDropdown);
			System.out.println("Home Page nameTxt                            :"+actnameTxt                             +"  Value Expected : "+expnameTxt);
			System.out.println("Home Page activeChkBox                       :"+actactiveChkBox                        +"  Value Expected : "+expactiveChkBox);
			System.out.println("Home Page alwaysauthorstartsfirstlevelChkBox :"+actalwaysauthorstartsfirstlevelChkBox  +"  Value Expected : "+expalwaysauthorstartsfirstlevelChkBox);
	        System.out.println("Home Page addLevelBtn                        :"+actaddLevelBtn                         +"  Value Expected : "+expaddLevelBtn);
			System.out.println("Home Page addParallelBtn                     :"+actaddParallelBtn                      +"  Value Expected : "+expaddParallelBtn);
			System.out.println("Home Page clearbtn                           :"+actclearbtn                            +"  Value Expected : "+expclearbtn);
			System.out.println("Home Page saveBtn                            :"+actsaveBtn                             +"  Value Expected : "+expsaveBtn);
			System.out.println("Home Page cancelBtn 						 :"+actcancelBtn                           +"  Value Expected : "+expcancelBtn);
			System.out.println("Home Page deleteBtn                          :"+actdeleteBtn                           +"  Value Expected : "+expdeleteBtn);
			System.out.println("Home Page statusDropdown                     :"+actstatusDropdown                      +"  Value Expected : "+expstatusDropdown);
			System.out.println("Home Page suspendedCreditLimitChkBox         :"+actsuspendedCreditLimitChkBox          +"  Value Expected : "+expsuspendedCreditLimitChkBox);
			
			if( actmasterDropdown==expmasterDropdown  && actnameTxt==expnameTxt &&
					actactiveChkBox==expactiveChkBox && actalwaysauthorstartsfirstlevelChkBox==expalwaysauthorstartsfirstlevelChkBox && 
					actaddLevelBtn==expaddLevelBtn  && actaddParallelBtn==expaddParallelBtn && 
				    actclearbtn==expclearbtn && actsaveBtn==expsaveBtn && actcancelBtn==expcancelBtn && actdeleteBtn==expdeleteBtn && 
				    actstatusDropdown==expstatusDropdown && actsuspendedCreditLimitChkBox==expsuspendedCreditLimitChkBox)
				
			{
				System.out.println("Test Pass : Master Authorization is Displayed");
				return true;
			}
			else
			{
				System.out.println("Test Fail : Master Authorization is Displayed");
				return false;
			}
		}





		public boolean 	checkMasterDropdownOptions() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			
			
			String actmasterDropdown=masterDropdown.getAttribute("placeholder");
			String expmasterDropdown="Master Name";
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterDropdown));
			masterDropdown.click();
			
			Thread.sleep(2000);
			
		
			 boolean actaccount                        = account.isDisplayed();
			 boolean actitem            			   = item.isDisplayed();
			 boolean actdepartment             		   = department.isDisplayed();
			 boolean actwarehouse                      = warehouse.isDisplayed();
			 boolean actcostCenter                     = costCenter.isDisplayed();
			 boolean actlocation                       = location.isDisplayed();
			 boolean actregion                         = region.isDisplayed();
			 boolean actcountry                        = country.isDisplayed();
			 boolean actstate                          = state.isDisplayed();
			 boolean actcity                           = city.isDisplayed();
			 boolean actunits               		   = units.isDisplayed();
			 boolean actbins                 	       = bins.isDisplayed();
			 boolean acttaxCode                 	   = taxCode.isDisplayed();
			 boolean actplant                    	   = plant.isDisplayed();
			 boolean actsupplyArea                     = supplyArea.isDisplayed();
			 boolean actmaintenanceParameter           = maintenanceParameter.isDisplayed();
			 boolean actsafetyInstructions             = safetyInstructions.isDisplayed();
			 boolean actcapacity                   	   = capacity.isDisplayed();
			 boolean actworkCenter                	   = workCenter.isDisplayed();
			 boolean actholiday               		   = holiday.isDisplayed();
			 boolean actprocess                    	   = process.isDisplayed();
		     boolean actqcFailureReason                = qcFailureReason.isDisplayed();
			 boolean actqcParameters                   = qcParameters.isDisplayed();
			 boolean actinsurance 					   = insurance.isDisplayed();
			 boolean actfixedAsset            		   = fixedAsset.isDisplayed();
			 boolean actbreakDownStandardReason        = breakDownStandardReason.isDisplayed();
			 boolean actemployee                       = employee.isDisplayed();
			 boolean actdesignation                    = designation.isDisplayed();
			 boolean actposition                       = position.isDisplayed();
			 boolean actqualification                  = qualification.isDisplayed();
			 boolean actspecialization                 = specialization.isDisplayed();
			 boolean actnationality                    = nationality.isDisplayed();
			 boolean actskillType                      = skillType.isDisplayed();
			 boolean actskill                          = skill.isDisplayed();
			 boolean actsourceType                     = sourceType.isDisplayed();
			 boolean actsource                         = source.isDisplayed();
			 boolean actroundType                 	   = roundType.isDisplayed();
			 boolean actgrade                          = grade.isDisplayed();
			 boolean actscale                          = scale.isDisplayed();
			 boolean actcourseType                     = courseType.isDisplayed();
			 boolean acttrainer                        = trainer.isDisplayed();
			 boolean actairlineSector                  = airlineSector.isDisplayed();
			 boolean actvenue                          = venue.isDisplayed();
			 boolean actrequestTypes                   = requestTypes.isDisplayed();
			 boolean actexpenseClaims                  = expenseClaims.isDisplayed();
			 boolean actemployeeBank				   = employeeBank.isDisplayed();
			 boolean acttravelAgent                    = travelAgent.isDisplayed();
			 boolean actjobGrade                       = jobGrade.isDisplayed();
			 boolean actoutlet                         = outlet.isDisplayed();
			 boolean actcounter                        = counter.isDisplayed();
			 boolean actmemberType                     = memberType.isDisplayed();
			 boolean actgiftVoucherDefinition          = giftVoucherDefinition.isDisplayed();
			 boolean actcategory                       = category.isDisplayed();
			 boolean actbankCardType                   = bankCardType.isDisplayed();
			 boolean actmember                         = member.isDisplayed();
			 boolean actdiscountVoucherDef             = discountVoucherDefinition.isDisplayed();
			 boolean actfloor                          = floor.isDisplayed();
			 boolean actsection                        = section.isDisplayed();
			 boolean acttable                          = table.isDisplayed();
			 boolean actguest                          = guest.isDisplayed();
			 boolean actvoidRemarks                    = voidRemarks.isDisplayed();
			 boolean actmemberCardDefinition           = memberCardDefinition.isDisplayed();
			 boolean actreturnRemarks                  = returnRemarks.isDisplayed();
			 boolean actkitchenDisplaySystem           = kitchenDisplaySystem.isDisplayed();
			 boolean actdeliveryTimeInterval           = deliveryTimeInterval.isDisplayed();
			 boolean actePayment                       = ePayment.isDisplayed();

			 
			 
			 boolean expaccount                        = true;
			 boolean expitem            			   = true;
			 boolean expdepartment             		   = true;
			 boolean expwarehouse                      = true;
			 boolean expcostCenter                     = true;
			 boolean explocation                       = true;
			 boolean expregion                         = true;
			 boolean expcountry                        = true;
			 boolean expstate                          = true;
			 boolean expcity                		   = true;
			 boolean expunits                          = true;
			 boolean expbins                           = true;
			 boolean exptaxCode                        = true;
			 boolean expplant                          = true;
			 boolean expsupplyArea                     = true;
			 boolean expmaintenanceParameter           = true;
			 boolean expsafetyInstructions             = true;
			 boolean expcapacity                       = true;
			 boolean expworkCenter                     = true;
			 boolean expholiday                        = true;
			 boolean expprocess                        = true;
			 boolean expqcFailureReason                = true;
			 boolean expqcParameters                   = true;
			 boolean expinsurance                      = true;
			 boolean expfixedAsset            		   = true;
			 boolean expemployee               		   = true;
			 boolean expbreakDownStandardReason        = true;
			 boolean expdesignation                    = true;
			 boolean expposition                       = true;
			 boolean expqualification                  = true;
			 boolean expspecialization                 = true;
			 boolean expnationality                    = true;
			 boolean expskillType                      = true;
			 boolean expskill                          = true;
			 boolean expsourceType                     = true;
			 boolean expsource                         = true;
			 boolean exproundType                 	   = true;
			 boolean expgrade                          = true;
			 boolean expscale                          = true;
			 boolean expcourseType                     = true;
			 boolean exptrainer                        = true;
			 boolean expairlineSector                  = true;	
			 boolean expvenue                          = true;
			 boolean exprequestTypes                   = true;
			 boolean expexpenseClaims                  = true;
			 boolean expemployeeBank                   = true;
			 boolean exptravelAgent                    = true;
			 boolean expjobGrade                       = true;
			 boolean expoutlet                         = true;
			 boolean expcounter                        = true;
			 boolean expmemberType                     = true;
			 boolean expgiftVoucherDefinition          = true;
			 boolean expcategory                       = true;
			 boolean expbankCardType                   = true;
			 boolean expmember                         = true;
			 boolean expdiscountVoucherDef             = true;
			 boolean expfloor                          = true;
			 boolean expsection                        = true;
			 boolean exptable                          = true;
			 boolean expguest                          = true;
			 boolean expvoidRemarks                    = true;
			 boolean expmemberCardDefinition           = true;
			 boolean expreturnRemarks 				   = true;
			 boolean expkitchenDisplaySystem 		   = true;
			 boolean expdeliveryTimeInterval		   = true;
			 boolean expePayment 					   = true;

				
			 System.out.println("****************************** checkMasterDropdownOptions  ********************************************");
			 System.out.println("masterDropdown        : "+actmasterDropdown         +"   Value Expected  : "+expmasterDropdown);
			 System.out.println("account               :"+actaccount                 +"   Value Expected : "+expaccount);
			 System.out.println("item                  :"+actitem                    +"   Value Expected : "+expitem);
			 System.out.println("department            :"+actdepartment              +"	  Value Expected : "+expdepartment);
			 System.out.println("warehouse             :"+actwarehouse               +"	  Value Expected : "+expwarehouse);
			 System.out.println("costCenter            :"+actcostCenter              +"	  Value Expected : "+expcostCenter);
			 System.out.println("location              :"+actlocation                +"	  Value Expected : "+explocation);
			 System.out.println("region                :"+actregion                  +"	  Value Expected : "+expregion);
			 System.out.println("country               :"+actcountry                 +"	  Value Expected : "+expcountry);
			 System.out.println("state                 :"+actstate                   +"	  Value Expected : "+expstate);
			 System.out.println("city                  :"+actcity                    +"	  Value Expected : "+expcity);
			 System.out.println("units                 :"+actunits                   +"	  Value Expected : "+expunits);
			 System.out.println("bins                  :"+actbins                    +"   Value Expected : "+expbins);
			 System.out.println("taxCode               :"+acttaxCode                 +"	  Value Expected : "+exptaxCode);
			 System.out.println("plant                 :"+actplant                   +"	  Value Expected : "+expplant);
			 System.out.println("supplyArea            :"+actsupplyArea              +"	  Value Expected : "+expsupplyArea);
			 System.out.println("maintenanceParameter  :"+actmaintenanceParameter    +"	  Value Expected : "+expmaintenanceParameter);
			 System.out.println("safetyInstructions    :"+actsafetyInstructions      +"	  Value Expected : "+expsafetyInstructions);
			 System.out.println("capacity              :"+actcapacity                +"	  Value Expected : "+expcapacity);
			 System.out.println("workCenter            :"+actworkCenter              +"	  Value Expected : "+expworkCenter);
			 System.out.println("holiday               :"+actholiday                 +"	  Value Expected : "+expholiday);
			 System.out.println("process               :"+actprocess                 +"	  Value Expected : "+expprocess);
			 System.out.println("qcFailureReason       :"+actqcFailureReason         +"   Value Expected : "+expqcFailureReason);
			 System.out.println("ReasonTxt             :"+actqcParameters            +"   Value Expected : "+expqcParameters);
			 System.out.println("insurance             :"+actinsurance               +"	  Value Expected : "+expinsurance);
			 System.out.println("fixedAsset            :"+actfixedAsset              +"	  Value Expected : "+expfixedAsset);
			 System.out.println("breakDownStandReason  :"+actbreakDownStandardReason +"	  Value Expected : "+expbreakDownStandardReason);
			 System.out.println("employee              :"+actemployee                +"	  Value Expected : "+expemployee);
			 System.out.println("designation           :"+actdesignation             +"	  Value Expected : "+expdesignation);
			 System.out.println("position              :"+actposition                +"   Value Expected : "+expposition);
			 System.out.println("qualification         :"+actqualification           +"	  Value Expected : "+expqualification);
			 System.out.println("specialization        :"+actspecialization          +"	  Value Expected : "+expspecialization);
			 System.out.println("nationality           :"+actnationality             +"	  Value Expected : "+expnationality);
			 System.out.println("skillType             :"+actskillType               +"   Value Expected : "+expskillType);
			 System.out.println("skill                 :"+actskill                   +"	  Value Expected : "+expskill);
			 System.out.println("sourceType            :"+actsourceType              +"	  Value Expected : "+expsourceType);
			 System.out.println("source                :"+actsource                  +"	  Value Expected : "+expsource);
			 System.out.println("roundType             :"+actroundType               +"	  Value Expected : "+exproundType);
			 System.out.println("grade                 :"+actgrade                   +"	  Value Expected : "+expgrade);
			 System.out.println("scale                 :"+actscale                   +"	  Value Expected : "+expscale);
			 System.out.println("courseType            :"+actcourseType              +"	  Value Expected : "+expcourseType);
			 System.out.println("trainer               :"+acttrainer                 +"	  Value Expected : "+exptrainer);
			 System.out.println("airlineSector         :"+actairlineSector           +"	  Value Expected : "+expairlineSector);
			 System.out.println("venue         			:"+actvenue                  +"	  Value Expected : "+expvenue);
			 System.out.println("expenseClaims          :"+actexpenseClaims          +"	  Value Expected : "+expexpenseClaims);
			 System.out.println("employeeBank           :"+actemployeeBank           +"	  Value Expected : "+expemployeeBank);
			 System.out.println("travelAgent         	:"+acttravelAgent            +"	  Value Expected : "+exptravelAgent);
			 System.out.println("jobGrade         		:"+actjobGrade               +"	  Value Expected : "+expjobGrade);
			 System.out.println("outlet         		:"+actoutlet                 +"	  Value Expected : "+expoutlet);
			 System.out.println("counter         		:"+actcounter                +"	  Value Expected : "+expcounter);
			 System.out.println("memberType             :"+actmemberType             +"	  Value Expected : "+expmemberType);
			 System.out.println("giftVoucherDefinition  :"+actgiftVoucherDefinition  +"	  Value Expected : "+expgiftVoucherDefinition);
			 System.out.println("category               :"+actcategory               +"	  Value Expected : "+expcategory);
			 System.out.println("bankCardType           :"+actbankCardType           +"	  Value Expected : "+expbankCardType);
			 System.out.println("member                 :"+actmember                 +"	  Value Expected : "+expmember);
			 System.out.println("discountVoucherDef     :"+actdiscountVoucherDef     +"	  Value Expected : "+expdiscountVoucherDef);
			 System.out.println("floor                  :"+actfloor                  +"	  Value Expected : "+expfloor);
			 System.out.println("section                :"+actsection                +"	  Value Expected : "+expsection);
			 System.out.println("table                  :"+acttable                  +"	  Value Expected : "+exptable);
			 System.out.println("guest                  :"+actguest                  +"	  Value Expected : "+expguest);
			 System.out.println("voidRemarks            :"+actvoidRemarks            +"	  Value Expected : "+expvoidRemarks);
			 System.out.println("memberCardDefinition   :"+actmemberCardDefinition   +"	  Value Expected : "+expmemberCardDefinition);
			 System.out.println("returnRemarks          :"+actreturnRemarks          +"	  Value Expected : "+expreturnRemarks);
			 System.out.println("kitchenDisplaySystem   :"+actkitchenDisplaySystem   +"	  Value Expected : "+expkitchenDisplaySystem);
			 System.out.println("deliveryTimeInterval   :"+actdeliveryTimeInterval   +"	  Value Expected : "+expdeliveryTimeInterval);
			 System.out.println("ePayment               :"+actePayment               +"	  Value Expected : "+expePayment);
			 System.out.println("airlineSector          :"+actairlineSector          +"	  Value Expected : "+expairlineSector);
			 System.out.println("airlineSector          :"+actairlineSector          +"	  Value Expected : "+expairlineSector);
			 System.out.println("airlineSector          :"+actairlineSector          +"	  Value Expected : "+expairlineSector);
			 System.out.println("airlineSector          :"+actairlineSector          +"	  Value Expected : "+expairlineSector);
			 System.out.println("airlineSector          :"+actairlineSector          +"	  Value Expected : "+expairlineSector);
			 System.out.println("airlineSector          :"+actairlineSector          +"	  Value Expected : "+expairlineSector);
			 System.out.println("airlineSector          :"+actairlineSector          +"	  Value Expected : "+expairlineSector);
			 System.out.println("airlineSector          :"+actairlineSector          +"	  Value Expected : "+expairlineSector);
			 System.out.println("airlineSector          :"+actairlineSector          +"	  Value Expected : "+expairlineSector);
			 System.out.println("airlineSector          :"+actairlineSector          +"	  Value Expected : "+expairlineSector);
			 System.out.println("airlineSector          :"+actairlineSector          +"	  Value Expected : "+expairlineSector);
			 System.out.println("airlineSector          :"+actairlineSector          +"	  Value Expected : "+expairlineSector);
			  
			 if(actmasterDropdown.equalsIgnoreCase(expmasterDropdown) && actaccount==expaccount  && actitem==expitem && actdepartment==expdepartment && actwarehouse==expwarehouse 
					 && actcostCenter==expcostCenter && actlocation==explocation && actregion==expregion && actcountry==expcountry 
				     && actstate==expstate && actcity==expcity && actunits==expunits 
					 && actbins==expbins&& acttaxCode==exptaxCode && actplant==expplant
					 && actsupplyArea==expsupplyArea && actmaintenanceParameter==expmaintenanceParameter 
					 && actsafetyInstructions==expsafetyInstructions && actcapacity==expcapacity 
					 && actworkCenter==expworkCenter && actholiday==expholiday && actqcParameters==expqcParameters && actinsurance==expinsurance
					 && actprocess==expprocess && actqcFailureReason==expqcFailureReason && actfixedAsset==expfixedAsset
					 && actbreakDownStandardReason==expbreakDownStandardReason  &&  actdesignation==expdesignation
					 && actposition==expposition && actqualification==expqualification && actspecialization==expspecialization && actnationality==expnationality 
					 &&  actskillType==expskillType && actskill==expskill && actsourceType==expsourceType && actsource==expsource
					 && actroundType==exproundType && actgrade==expgrade && actscale==expscale && actcourseType==expcourseType && acttrainer==exptrainer  
					 && actairlineSector==expairlineSector && actvenue==expvenue && actrequestTypes==exprequestTypes && actexpenseClaims==expexpenseClaims 
					 && actemployeeBank==expemployeeBank && acttravelAgent==exptravelAgent && actjobGrade==expjobGrade && actoutlet==expoutlet 
					 && actcounter==expcounter && actmemberType==expmemberType && actgiftVoucherDefinition==expgiftVoucherDefinition && actcategory==expcategory 
					 && actbankCardType==expbankCardType &&actmember==expmember && actdiscountVoucherDef==expdiscountVoucherDef && actfloor==expfloor 
					 && actsection==expsection &&  acttable==exptable && actguest==expguest && actvoidRemarks==expvoidRemarks && actmemberCardDefinition==expmemberCardDefinition 
					 && actreturnRemarks==expreturnRemarks && actkitchenDisplaySystem==expkitchenDisplaySystem && actdeliveryTimeInterval==expdeliveryTimeInterval)

			{
				System.out.println("Test Pass : Master Dropdown Options Are As expected");
				return true;
			}
			else
			{
				System.out.println("Test Fail : Master Dropdown Options Are NOT As expected");
				return false;
			}
		}



		public boolean 	checkSaveWithoutSelectionOfMaster() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
			saveBtn.click();
			
			
			System.out.println("************************************checkSaveWithoutSelectionOfMaster**********************************");
			
			String expMessage="Please select a master";
			
			String actMessage=checkValidationMessage(expMessage);		
			
			if(actMessage.equalsIgnoreCase(expMessage))
			{
				System.out.println("Error Message is As Expected");
				return true;
			}
			else
			{
				System.out.println("Test Fail : Error Message is not Displayed ");
				return false;
			}
		}
		
		@FindBy(xpath="//*[@id='id_tblUserSelection_User']")
		private static WebElement userDropdown;

		public boolean 	CheckSAvingMasterAuthorisationWithCondition() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
		
			Thread.sleep(2000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterDropdown));
			masterDropdown.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(item));
			item.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
			nameTxt.sendKeys("Item");
			nameTxt.sendKeys(Keys.TAB);
			
			Thread.sleep(2000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(startPointBtn));
		    getAction().doubleClick(startPointBtn).build().perform();
			
		    Thread.sleep(2000);
		    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(descriptionTxt));
			descriptionTxt.click();
			descriptionTxt.sendKeys("Item");
            Thread.sleep(1000);
			descriptionTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(conjunctionDropdown));
			conjunctionDropdown.click();
			conjunctionDropdown.sendKeys("Where");
			Thread.sleep(3000);
			conjunctionDropdown.sendKeys(Keys.TAB);
			Thread.sleep(3000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(selectFieldTxt));
			selectFieldTxt.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sName));
			sName.click();
			
			Thread.sleep(2000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(selectOperatorDropdown));
			selectOperatorDropdown.click();
			
			Select s3=new Select(selectOperatorDropdown);
			s3.selectByValue("0");
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(compareWithDropdown));
			compareWithDropdown.click();
			
			Select s4=new Select(compareWithDropdown);
			s4.selectByValue("0");
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(valueTxt));
			valueTxt.sendKeys("RAW");
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(actionOnEntryStatusDropdown));
			actionOnEntryStatusDropdown.click();
			
			Select s5=new Select(actionOnEntryStatusDropdown);
			s5.selectByVisibleText("Inactive");
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userSelectionTab));
			userSelectionTab.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userrow1));
			userrow1.click();

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userDropdown));
			userDropdown.click();
			
			userDropdown.sendKeys("useralloptions");
			
			Thread.sleep(3000);
			
			userDropdown.sendKeys(Keys.TAB);
						
			Thread.sleep(3000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(definitionOkBtn));
			definitionOkBtn.click();
			
			Thread.sleep(2000);
			
			boolean actendpoint=endpoint.isDisplayed();
			boolean expendpoint=true;
			
			System.out.println("***************************************checkOkButtonOnSelectingUser*****************************");
			System.out.println("endpoint     : "+actendpoint +"  Value Expected : "+expendpoint);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
			saveBtn.click();
			
			System.out.println("**********************************checkSavingMasterAuthorization*****************************");
			
			String expMessage="Authorization Flow saved successfully.";
			
			String actMessage=checkValidationMessage(expMessage);
			
			if(actMessage.equalsIgnoreCase(expMessage) && actendpoint==expendpoint)
			{
				System.out.println(" Test Pass: Master Author Saved Success With Condition ");
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cancelBtn));
				cancelBtn.click();
				
				return true;
			}
			else
			{
				System.out.println(" Test Fail: Master Author Saved Success With Condition ");
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cancelBtn));
				cancelBtn.click();
				
				return false;
			}
			}
		
		@FindBy(xpath="//*[@id='1']/div/div")
		private static WebElement  homeMenu;   

		@FindBy(xpath="//*[@id='1000']/span")
		private static WebElement  homeMasterMenu;

		@FindBy(xpath="//*[@id='221']/span")
		private static WebElement  homeMasterItemMenu;

		@FindBy(xpath="//*[@id='1105']/span")
		private static WebElement  homeMasterItem_ItemMenu;
		
		@FindBy(xpath="//*[@id='btnNew']")
	    private static WebElement itemNewBtn;
		
		 @FindBy(xpath="//input[@id='sName']")
	     private static WebElement newGeneralName;
	     
	     @FindBy(xpath="//input[@id='sCode']")
	     private static WebElement newGeneralCode;
	     
		
		public boolean checkSavingItemInItemMaster() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
	      	homeMenu.click();
	      	
	      	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMasterMenu));
	      	homeMasterMenu.click();
	      	
	      	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMasterItemMenu));
	      	homeMasterItemMenu.click();
	      	
	    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMasterItem_ItemMenu));
	    	homeMasterItem_ItemMenu.click();
	    	
			Thread.sleep(2000);
	    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemNewBtn));
	    	itemNewBtn.click();
	    	 
	    	Thread.sleep(2000);
	    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newGeneralName));
			newGeneralName.sendKeys("RAW");
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newGeneralCode));
			newGeneralCode.sendKeys("RAW");
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemSaveBtn));
			itemSaveBtn.click();
			 
			String expMessage="Saved Successfully";
			String actMessage=checkValidationMessage(expMessage);
			
			Thread.sleep(2000);
	    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newGeneralName));
	    	newGeneralName.click();
	    	
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeBtn));
			closeBtn.click();
			
			if (actMessage.equalsIgnoreCase(expMessage)) 
			{
				System.out.println(" Test Pass : Item Saved Success after Creating Condition ");
				return true;
			}
			else 
			{
				System.out.println(" Test Fail : Item Saved Success after Creating Condition ");
				return false;
			}
	    	
		}
		
		
		@FindBy(xpath="//*[@id='GenerateNewMasterModel']/div/div[1]/div[2]/div/ul/li[2]/button[5]")
		public static WebElement closeBtn;
		
		
		@FindBy(xpath="//div[@class='divStopNode']//i[@class='icon-end icon-font4 grey']")
		private static WebElement endpoint;
		
		@FindBy(xpath="//a[@id='2050']//span[contains(text(),'Purchase Vouchers N')]")
		private static WebElement  purchaseVoucherNew;
		
		@FindBy(xpath="//a[@id='61']//span[contains(text(),'Transactions')]")
		private static WebElement  transactionsExpandBtn;
			
		@FindBy(xpath="//a[@id='2007']//span[contains(text(),'Purchases')]")
		private static WebElement  purchasesExpandBtn;
		
		@FindBy(xpath="//span[contains(text(),'Purchases Vouchers')]")
		private static WebElement  purchaseVouchersBtn;
	
		@FindBy(xpath="//span[@class='icon-financial icon-font1']")
		private static WebElement  finacinalsMenu;
		
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
			
		public boolean checkItemListAtVoucherLevel() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(finacinalsMenu));
			finacinalsMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(transactionsExpandBtn));
			transactionsExpandBtn.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchasesExpandBtn));
			purchasesExpandBtn.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVoucherNew));
			purchaseVoucherNew.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
			newBtn.click();
			
			checkUserFriendlyMessage();
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
			select1stRow_1stColumn.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
			enter_ItemTxt.sendKeys(Keys.SPACE);
			
			int itemcount=itemListCount.size();
			
			System.err.println(itemcount);
				
			ArrayList<String> itemList=new ArrayList<>();
			
			for(int i=0 ; i < itemcount ;i++)
			{
				String data=itemListCount.get(i).getText();
				itemList.add(data);
			}
				
			String actList=itemList.toString();
			String explist="[BATCH BIN FINISHED GOODS ITEM, BATCH BIN WITH NO RESERVATION ITEM, BATCH BIN WITH NO STOCK UPDATE ITEM, BATCH BR ITEM, BATCH FIFO ITEM, BATCH IGNORE EXP LIFO ITEM, BATCH WA ITEM, BIN FINISHED GOODS ITEM, BIN RAW MATERIAL ITEM, BR COGS ITEM, FIFO COGS ITEM, RMA BATCH ITEM, RMA FITEM, RMA RITEM, STD RATE COGS ITEM, STOCK ITEM, WA COGS ITEM]";
			
			System.out.println(" ACTUAL List : "+actList);
			System.out.println(" Exp List    : "+explist);
			
			Thread.sleep(3000);
			
			if (actList.equalsIgnoreCase(explist))
			{
				System.out.println("Test Pass: Item List as Expected ");
				return true;
				
			}
			else 
			{
				System.out.println("Test Fail: Item List as Expected ");
				return false;
			}
			
		}
		
		@FindBy(xpath="//tbody[@id='id_body_23_table_body']/tr/td[2]")
		private static List<WebElement> itemListCount;
		
		@FindBy(xpath="//input[@id='id_body_23']")
		private static WebElement  enter_ItemTxt;
		
		@FindBy(xpath="//div[@id='myNavbar']//span[@class='icon-new icon-font6']")
		private static WebElement  newBtn;
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[2]")
		private static WebElement  select1stRow_1stColumn;
		
		@FindBy(xpath="//*[@id='userprofile']/li/span[2]")
		private static WebElement logoutOption;	
	     
		
	public boolean checkLoginToAuthoriseUserToAuthorise() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		 getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(userNameDisplay));
		 userNameDisplay.click();
		  
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
		 logoutOption.click();
		
		 
		 Thread.sleep(2000);
		 LoginPage lp=new LoginPage(getDriver()); 
			
			String unamelt="Useralloptions";
					      
			String pawslt="12345";
					      
			lp.enterUserName(unamelt);
					
			lp.enterPassword(pawslt);
					  
			lp.clickOnSignInBtn();
			
			//checkRefershPopOnlogin();
					        
			//checkPopUpWindow();

			Thread.sleep(5000);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
	      	homeMenu.click();
	      	
	      	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMasterMenu));
	      	homeMasterMenu.click();
	      	
	      	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMasterItemMenu));
	      	homeMasterItemMenu.click();
	      	
	    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMasterItem_ItemMenu));
	    	homeMasterItem_ItemMenu.click();
	    	
			Thread.sleep(4000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemScreenShowAllUnauthorisedRecordsBtn));
			itemScreenShowAllUnauthorisedRecordsBtn.click();
			Thread.sleep(2000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(selectGridRowChkbox));
			selectGridRowChkbox.click();
			

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemMasterAuthoriseBtn));
			itemMasterAuthoriseBtn.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(reasonForAuthoriseTxt));
			reasonForAuthoriseTxt.click();
			reasonForAuthoriseTxt.sendKeys("Item Authorisation");
			Thread.sleep(1000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(reasonForAuthoriseSaveBtn));
			reasonForAuthoriseSaveBtn.click();
			
			String expMessage="Authorization Save Successfully";
			String actMessage=checkValidationMessage(expMessage);
			
			if (actMessage.equalsIgnoreCase(expMessage)) 
			{
				System.out.println("Test Pass: AUTHORISED Successfully");
				return true;
			}
			else
			{
				System.err.println("Test Fail: AUTHORISED Successfully");
				return false;
			}
		
	}
		
		
		public boolean checkItemListAfterAuthoriseItem() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(finacinalsMenu));
			finacinalsMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(transactionsExpandBtn));
			transactionsExpandBtn.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchasesExpandBtn));
			purchasesExpandBtn.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVoucherNew));
			purchaseVoucherNew.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
			newBtn.click();
			
			checkUserFriendlyMessage();
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
			select1stRow_1stColumn.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
			enter_ItemTxt.sendKeys(Keys.SPACE);
			
			int itemcount=itemListCount.size();
			
			System.err.println(itemcount);
				
			ArrayList<String> itemList=new ArrayList<>();
			
			for(int i=0 ; i < itemcount ;i++)
			{
				String data=itemListCount.get(i).getText();
				itemList.add(data);
			}
				
			String actList=itemList.toString();
			String explist="[BATCH BIN FINISHED GOODS ITEM, BATCH BIN WITH NO RESERVATION ITEM, BATCH BIN WITH NO STOCK UPDATE ITEM, BATCH BR ITEM, BATCH FIFO ITEM, BATCH IGNORE EXP LIFO ITEM, BATCH WA ITEM, BIN FINISHED GOODS ITEM, BIN RAW MATERIAL ITEM, BR COGS ITEM, FIFO COGS ITEM, RAW, RMA BATCH ITEM, RMA FITEM, RMA RITEM, STD RATE COGS ITEM, STOCK ITEM, WA COGS ITEM]";
			
			System.out.println(" ACTUAL List : "+actList);
			System.out.println(" Exp List    : "+explist);
			
			 getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(userNameDisplay));
			 userNameDisplay.click();
			  
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
			 logoutOption.click();
			
			
			if (actList.equalsIgnoreCase(explist))
			{
				System.out.println("Test Pass: Item List as Expected ");
				return true;
				
			}
			else 
			{
				System.out.println("Test Fail: Item List as Expected ");
				return false;
			}
		}
		
	@FindBy(xpath="//input[@id='txt_authMessage']")
	private static WebElement reasonForAuthoriseTxt;
	
	@FindBy(xpath="//button[@id='btnAuthorizationSave']")
	private static WebElement reasonForAuthoriseSaveBtn;
	
	@FindBy(xpath="//*[@id='liSelectAllMasters']")
	private static WebElement selectGridRowChkbox;

	@FindBy(xpath="//*[@id='btnAuthorize']/i")
	private static WebElement itemMasterAuthoriseBtn;
	
	@FindBy(xpath="//a[@id='id_showAllUnAuth']")
    private static WebElement itemScreenShowAllUnauthorisedRecordsBtn ;
	
	@FindBy(xpath="//div[@id='divLevel1']//i[@class='icon-edit icon-font7']")
	private static WebElement Level1editBtn;
	
	@FindBy(xpath="//select[@id='ddlCriteria']")
	private static WebElement userSelectionTabCerteriaDrpdwn;
	
	
	
		 
	 public boolean checkSelectbyAnyUserOptionInMaterAuthorisation() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
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
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsmenuBtn));
		settingsmenuBtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterAuthorizationBtn));
		masterAuthorizationBtn.click();
		
		Thread.sleep(2000);

        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterDropdown));
		masterDropdown.click();
		item.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
		nameTxt.click();
		nameTxt.sendKeys("item");
		Thread.sleep(2000);
		nameTxt.sendKeys(Keys.TAB);		           	

		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(Level1editBtn));
		Level1editBtn.click();
		
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(conditionNotRequiredChkBox));
		conditionNotRequiredChkBox.click();

		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userSelectionTab));
		userSelectionTab.click();
		Thread.sleep(2000);
		
		Select s1=new Select(userSelectionTabCerteriaDrpdwn);
		s1.selectByValue("0");
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userrow2));
		userrow2.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userDropdown));
		userDropdown.click();
		userDropdown.sendKeys("UserAccPOTransRestrictions");
		Thread.sleep(3000);
		userDropdown.sendKeys(Keys.TAB);
		
		Thread.sleep(3000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(definitionOkBtn));
		definitionOkBtn.click();
		
		Thread.sleep(2000);
		
		boolean actendpoint=endpoint.isDisplayed();
		boolean expendpoint=true;
		
		System.out.println("***************************************checkOkButtonOnSelectingUser*****************************");
		System.out.println("endpoint     : "+actendpoint +"  Value Expected : "+expendpoint);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
		saveBtn.click();
		
		System.out.println("**********************************checkSavingMasterAuthorization*****************************");
		
		String expMessage="Authorization Flow saved successfully.";
		
		String actMessage=checkValidationMessage(expMessage);
		
		if(actMessage.equalsIgnoreCase(expMessage) && actendpoint==expendpoint)
		{
			System.out.println(" Test Pass: Master Author Saved Success With no  Condition ");
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cancelBtn));
			cancelBtn.click();
			
			return true;
		}
		else
		{
			System.out.println(" Test Fail: Master Author Saved Success With  no Condition ");
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cancelBtn));
			cancelBtn.click();
			
			return false;
		}
		}
		
	
     public boolean checkItemCreationAndAuthorisation() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	 {
		    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
	      	homeMenu.click();
	      	
	      	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMasterMenu));
	      	homeMasterMenu.click();
	      	
	      	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMasterItemMenu));
	      	homeMasterItemMenu.click();
	      	
	    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMasterItem_ItemMenu));
	    	homeMasterItem_ItemMenu.click();
	    	
			Thread.sleep(2000);
	    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemNewBtn));
	    	itemNewBtn.click();
	    	 
	    	Thread.sleep(2000);
	    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newGeneralName));
			newGeneralName.sendKeys("ProductA");
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newGeneralCode));
			newGeneralCode.sendKeys("ProductA");
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemSaveBtn));
			itemSaveBtn.click();
			 
			String expMessage="Saved Successfully";
			String actMessage=checkValidationMessage(expMessage);
			
			Thread.sleep(2000);
	    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newGeneralName));
	    	newGeneralName.click();
	    	
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeBtn));
			closeBtn.click();
			
			
			if (infoSideBarBtn.isDisplayed()==true)
			{
				infoSideBarBtn.click();	
			}
			
			
			int itemListCount = itemList.size();
  	 		
  	 		for(int i=0;i<itemListCount;i++)
  	 		{
  	 			String data= itemList.get(i).getText();
  	 			
  	 			if(data.equalsIgnoreCase("ProductA"))
  	 			{
  	 				itemList.get(i).click();
  	 				itemListChkBox.get(i).click();
  	 				
  	 				break;
  	 			}
  	 		}
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemMasterAuthorPannelRow1));
			String actitemMasterAuthorPannelRow1User1=itemMasterAuthorPannelRow1.getText();
			String expitemMasterAuthorPannelRow1User1="Next to Approve UserAllOptions";
			
			System.out.println("actitemMasterAuthorPannelRow1User1  : "+actitemMasterAuthorPannelRow1User1);
			System.out.println("expitemMasterAuthorPannelRow1User1  : "+expitemMasterAuthorPannelRow1User1);
			
			String actitemMasterAuthorPannelRow4User1=itemMasterAuthorPannelRow4.getText();
			String expitemMasterAuthorPannelRow4User1="Status Pending";
			
			System.out.println("actitemMasterAuthorPannelRow4User1  : "+actitemMasterAuthorPannelRow4User1);
			System.out.println("expitemMasterAuthorPannelRow4User1  : "+expitemMasterAuthorPannelRow4User1);
			
			Thread.sleep(1000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemMasterAuthorPannelNextBtn));
			itemMasterAuthorPannelNextBtn.click();
			
			
			String actitemMasterAuthorPannelRow1User2=itemMasterAuthorPannelRow1.getText();
			String expitemMasterAuthorPannelRow1User2="Next to Approve UserAccPOTransRestrictions";
			
			System.out.println("actitemMasterAuthorPannelRow1User2  : "+actitemMasterAuthorPannelRow1User2);
			System.out.println("expitemMasterAuthorPannelRow1User2  : "+expitemMasterAuthorPannelRow1User2);
			
			String actitemMasterAuthorPannelRow4User2=itemMasterAuthorPannelRow4.getText();
			String expitemMasterAuthorPannelRow4User2="Status Pending";
			
			System.out.println("actitemMasterAuthorPannelRow4User2  : "+actitemMasterAuthorPannelRow4User2);
			System.out.println("expitemMasterAuthorPannelRow4User2  : "+expitemMasterAuthorPannelRow4User2);
			
			if (actitemMasterAuthorPannelRow1User1.equalsIgnoreCase(expitemMasterAuthorPannelRow1User1) && 
				actitemMasterAuthorPannelRow4User1.equalsIgnoreCase(expitemMasterAuthorPannelRow4User1) && 
				actitemMasterAuthorPannelRow1User2.equalsIgnoreCase(expitemMasterAuthorPannelRow1User2) && 
				actitemMasterAuthorPannelRow4User2.equalsIgnoreCase(expitemMasterAuthorPannelRow4User2))
			{
				System.out.println(" Test Pass: Values Displayed Correct");
				return true;
			}
			else 
			{
				System.out.println(" Test Fail: Values Displayed Correct");
				return false;

			}
	 }
     
     @FindBy(xpath="//*[@id='LandingGridBody']/tr/td[12]")
	 private static List<WebElement> itemList;
	  	
	 @FindBy(xpath="//*[@id='LandingGridBody']/tr/td[8]/div/label/input")
	 private static List<WebElement> itemListChkBox;
	  	  
		 
     @FindBy(xpath="//*[@id='panelData_tbody']/tr[1]")
	 private static WebElement itemMasterAuthorPannelRow1;
     
     @FindBy(xpath="//*[@id='panelData_tbody']/tr[4]")
	 private static WebElement itemMasterAuthorPannelRow4;
     
     @FindBy(xpath="//a[contains(text(),'Next')]")
	 private static WebElement itemMasterAuthorPannelNextBtn;
     
     @FindBy(xpath="//a[contains(text(),'Previous')]")
	 private static WebElement itemMasterAuthorPannelPrevBtn;
     
	 @FindBy(xpath="//label[@id='btnsideBar']")
	 private static WebElement infoSideBarBtn;
		 
	 
	 public boolean chechLoginTOUserAccPOTransRestrictionsUserToAuthorise() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	 {
		 getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(userNameDisplay));
		 userNameDisplay.click();
		  
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
		 logoutOption.click();
		
		 
		 Thread.sleep(2000);
		 LoginPage lp=new LoginPage(getDriver()); 
			
			String unamelt="UserAccPOTransRestrictions";
					      
			String pawslt="12345";
					      
			lp.enterUserName(unamelt);
					
			lp.enterPassword(pawslt);
					  
			lp.clickOnSignInBtn();
			
			//checkRefershPopOnlogin();
					        
			//checkPopUpWindow();

			Thread.sleep(5000);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
	      	homeMenu.click();
	      	
	      	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMasterMenu));
	      	homeMasterMenu.click();
	      	
	      	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMasterItemMenu));
	      	homeMasterItemMenu.click();
	      	
	    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMasterItem_ItemMenu));
	    	homeMasterItem_ItemMenu.click();
	    	
			Thread.sleep(4000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemScreenShowAllUnauthorisedRecordsBtn));
			itemScreenShowAllUnauthorisedRecordsBtn.click();
			Thread.sleep(2000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(selectGridRowChkbox));
			selectGridRowChkbox.click();
			

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemMasterAuthoriseBtn));
			itemMasterAuthoriseBtn.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(reasonForAuthoriseTxt));
			reasonForAuthoriseTxt.click();
			reasonForAuthoriseTxt.sendKeys("ProductA Item Authorisation");
			Thread.sleep(1000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(reasonForAuthoriseSaveBtn));
			reasonForAuthoriseSaveBtn.click();
			
			String expMessage="Authorization Save Successfully";
			String actMessage=checkValidationMessage(expMessage);
			
			if (actMessage.equalsIgnoreCase(expMessage)) 
			{
				System.out.println("Test Pass: AUTHORISED Successfully");
				return true;
			}
			else
			{
				System.err.println("Test Fail: AUTHORISED Successfully");
				return false;
			}
	}

	 
	 public boolean checkItemAuthoriseStatusInSuperUser() throws InterruptedException
	 {
		 
		 getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(userNameDisplay));
		 userNameDisplay.click();
		  
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
		 logoutOption.click();
		
		 
		 Thread.sleep(2000);
		 LoginPage lp=new LoginPage(getDriver()); 
			
			String unamelt="su";
					      
			String pawslt="su";
					      
			lp.enterUserName(unamelt);
					
			lp.enterPassword(pawslt);
					  
			lp.clickOnSignInBtn();
			
			//checkRefershPopOnlogin();
					        
			//checkPopUpWindow();

			Thread.sleep(5000);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
	      	homeMenu.click();
	      	
	      	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMasterMenu));
	      	homeMasterMenu.click();
	      	
	      	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMasterItemMenu));
	      	homeMasterItemMenu.click();
	      	
	    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMasterItem_ItemMenu));
	    	homeMasterItem_ItemMenu.click();
	    	
			Thread.sleep(4000);
			
			
			if (infoSideBarBtn.isDisplayed()==true)
			{
				infoSideBarBtn.click();	
			}
			
			
			int itemListCount = itemList.size();
  	 		
  	 		for(int i=0;i<itemListCount;i++)
  	 		{
  	 			String data= itemList.get(i).getText();
  	 			
  	 			if(data.equalsIgnoreCase("ProductA"))
  	 			{
  	 				itemList.get(i).click();
  	 				itemListChkBox.get(i).click();
  	 				
  	 				break;
  	 			}
  	 		}
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemMasterAuthorPannelRow1));
			String actitemMasterAuthorPannelRow1User1=itemMasterAuthorPannelRow1.getText();
			String expitemMasterAuthorPannelRow1User1="Authorize by UserAccPOTransRestrictions";
			
			System.out.println("actitemMasterAuthorPannelRow1User1  : "+actitemMasterAuthorPannelRow1User1);
			System.out.println("expitemMasterAuthorPannelRow1User1  : "+expitemMasterAuthorPannelRow1User1);
			
			String actitemMasterAuthorPannelRow4User1=itemMasterAuthorPannelRow4.getText();
			String expitemMasterAuthorPannelRow4User1="Status Authorised";
			
			System.out.println("actitemMasterAuthorPannelRow4User1  : "+actitemMasterAuthorPannelRow4User1);
			System.out.println("expitemMasterAuthorPannelRow4User1  : "+expitemMasterAuthorPannelRow4User1);
			
			Thread.sleep(1000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemMasterAuthorPannelNextBtn));
			itemMasterAuthorPannelNextBtn.click();
			
			
			String actitemMasterAuthorPannelRow1User2=itemMasterAuthorPannelRow1.getText();
			String expitemMasterAuthorPannelRow1User2="Authorize by UserAllOptions";
			
			System.out.println("actitemMasterAuthorPannelRow1User2  : "+actitemMasterAuthorPannelRow1User2);
			System.out.println("expitemMasterAuthorPannelRow1User2  : "+expitemMasterAuthorPannelRow1User2);
			
			String actitemMasterAuthorPannelRow4User2=itemMasterAuthorPannelRow4.getText();
			String expitemMasterAuthorPannelRow4User2="Status Authorised";
			
			System.out.println("actitemMasterAuthorPannelRow4User2  : "+actitemMasterAuthorPannelRow4User2);
			System.out.println("expitemMasterAuthorPannelRow4User2  : "+expitemMasterAuthorPannelRow4User2);
			
			if (actitemMasterAuthorPannelRow1User1.equalsIgnoreCase(expitemMasterAuthorPannelRow1User1) && 
				actitemMasterAuthorPannelRow4User1.equalsIgnoreCase(expitemMasterAuthorPannelRow4User1) && 
				actitemMasterAuthorPannelRow1User2.equalsIgnoreCase(expitemMasterAuthorPannelRow1User2) && 
				actitemMasterAuthorPannelRow4User2.equalsIgnoreCase(expitemMasterAuthorPannelRow4User2))
			{
				System.out.println(" Test Pass: Values Displayed Correct");
				return true;
			}
			else 
			{
				System.out.println(" Test Fail: Values Displayed Correct");
				return false;

			}
	 }

	 
	 public boolean checkSelectingSelectedUserOptionInAuthorisation() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	 {
		 
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsmenuBtn));
			settingsmenuBtn.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterAuthorizationBtn));
			masterAuthorizationBtn.click();
			
			Thread.sleep(2000);

	        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterDropdown));
			masterDropdown.click();
			item.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
			nameTxt.click();
			nameTxt.sendKeys("item");
			Thread.sleep(2000);
			nameTxt.sendKeys(Keys.TAB);		           	

			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(Level1editBtn));
			Level1editBtn.click();
			
			Thread.sleep(2000);
			if (conditionNotRequiredChkBox.isSelected()==false)
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(conditionNotRequiredChkBox));
				conditionNotRequiredChkBox.click();
			}
			

			Thread.sleep(2000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userSelectionTab));
			userSelectionTab.click();
			Thread.sleep(2000);
			
			Select s1=new Select(userSelectionTabCerteriaDrpdwn);
			s1.selectByValue("1");
			
			Thread.sleep(3000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(definitionOkBtn));
			definitionOkBtn.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
			saveBtn.click();
			
			System.out.println("**********************************checkSavingMasterAuthorization*****************************");
			
			String expMessage="Authorization Flow saved successfully.";
			
			String actMessage=checkValidationMessage(expMessage);
			
			if(actMessage.equalsIgnoreCase(expMessage))
			{
				System.out.println(" Test Pass: Master Author Saved Success With no  Condition ");
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cancelBtn));
				cancelBtn.click();
				
				return true;
			}
			else
			{
				System.out.println(" Test Fail: Master Author Saved Success With  no Condition ");
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cancelBtn));
				cancelBtn.click();
				
				return false;
			}
	 }
	 
	 
	 
	 

     public boolean checkItemCreationAndAuthorisationForSelectedUser() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	 {
		    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
	      	homeMenu.click();
	      	
	      	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMasterMenu));
	      	homeMasterMenu.click();
	      	
	      	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMasterItemMenu));
	      	homeMasterItemMenu.click();
	      	
	    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMasterItem_ItemMenu));
	    	homeMasterItem_ItemMenu.click();
	    	
			Thread.sleep(2000);
	    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemNewBtn));
	    	itemNewBtn.click();
	    	 
	    	Thread.sleep(2000);
	    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newGeneralName));
			newGeneralName.sendKeys("ProductB");
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newGeneralCode));
			newGeneralCode.sendKeys("ProductB");
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemSaveBtn));
			itemSaveBtn.click();
			 
			String expMessage="Saved Successfully";
			String actMessage=checkValidationMessage(expMessage);
			
			Thread.sleep(2000);
	    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newGeneralName));
	    	newGeneralName.click();
	    	
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeBtn));
			closeBtn.click();
			
			
			if (infoSideBarBtn.isDisplayed()==true)
			{
				infoSideBarBtn.click();	
			}
			
			
			int itemListCount = itemList.size();
  	 		
  	 		for(int i=0;i<itemListCount;i++)
  	 		{
  	 			String data= itemList.get(i).getText();
  	 			
  	 			if(data.equalsIgnoreCase("ProductB"))
  	 			{
  	 				itemList.get(i).click();
  	 				itemListChkBox.get(i).click();
  	 				
  	 				break;
  	 			}
  	 		}
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemMasterAuthorPannelRow1));
			String actitemMasterAuthorPannelRow1User1=itemMasterAuthorPannelRow1.getText();
			String expitemMasterAuthorPannelRow1User1="Next to Approve UserAllOptions";
			
			System.out.println("actitemMasterAuthorPannelRow1User1  : "+actitemMasterAuthorPannelRow1User1);
			System.out.println("expitemMasterAuthorPannelRow1User1  : "+expitemMasterAuthorPannelRow1User1);
			
			String actitemMasterAuthorPannelRow4User1=itemMasterAuthorPannelRow4.getText();
			String expitemMasterAuthorPannelRow4User1="Status Pending";
			
			System.out.println("actitemMasterAuthorPannelRow4User1  : "+actitemMasterAuthorPannelRow4User1);
			System.out.println("expitemMasterAuthorPannelRow4User1  : "+expitemMasterAuthorPannelRow4User1);
			
			Thread.sleep(1000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemMasterAuthorPannelNextBtn));
			itemMasterAuthorPannelNextBtn.click();
			
			
			String actitemMasterAuthorPannelRow1User2=itemMasterAuthorPannelRow1.getText();
			String expitemMasterAuthorPannelRow1User2="Next to Approve UserAccPOTransRestrictions";
			
			System.out.println("actitemMasterAuthorPannelRow1User2  : "+actitemMasterAuthorPannelRow1User2);
			System.out.println("expitemMasterAuthorPannelRow1User2  : "+expitemMasterAuthorPannelRow1User2);
			
			String actitemMasterAuthorPannelRow4User2=itemMasterAuthorPannelRow4.getText();
			String expitemMasterAuthorPannelRow4User2="Status Pending";
			
			System.out.println("actitemMasterAuthorPannelRow4User2  : "+actitemMasterAuthorPannelRow4User2);
			System.out.println("expitemMasterAuthorPannelRow4User2  : "+expitemMasterAuthorPannelRow4User2);
			
			if (actitemMasterAuthorPannelRow1User1.equalsIgnoreCase(expitemMasterAuthorPannelRow1User1) && 
				actitemMasterAuthorPannelRow4User1.equalsIgnoreCase(expitemMasterAuthorPannelRow4User1) && 
				actitemMasterAuthorPannelRow1User2.equalsIgnoreCase(expitemMasterAuthorPannelRow1User2) && 
				actitemMasterAuthorPannelRow4User2.equalsIgnoreCase(expitemMasterAuthorPannelRow4User2))
			{
				System.out.println(" Test Pass: Values Displayed Correct");
				return true;
			}
			else 
			{
				System.out.println(" Test Fail: Values Displayed Correct");
				return false;

			}
	 }

     public boolean chechLoginTOUserAccPOTransRestrictionsUserToAuthoriseForSelectedUserOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
     {
	 
	 getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(userNameDisplay));
	 userNameDisplay.click();
	  
	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
	 logoutOption.click();
	
	 
	 Thread.sleep(2000);
	 LoginPage lp=new LoginPage(getDriver()); 
		
		String unamelt="UserAccPOTransRestrictions";
				      
		String pawslt="12345";
				      
		lp.enterUserName(unamelt);
				
		lp.enterPassword(pawslt);
				  
		lp.clickOnSignInBtn();
		
		//checkRefershPopOnlogin();
				        
		//checkPopUpWindow();

		Thread.sleep(5000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
      	homeMenu.click();
      	
      	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMasterMenu));
      	homeMasterMenu.click();
      	
      	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMasterItemMenu));
      	homeMasterItemMenu.click();
      	
    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMasterItem_ItemMenu));
    	homeMasterItem_ItemMenu.click();
    	
		Thread.sleep(4000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemScreenShowAllUnauthorisedRecordsBtn));
		itemScreenShowAllUnauthorisedRecordsBtn.click();
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(selectGridRowChkbox));
		selectGridRowChkbox.click();
		

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemMasterAuthoriseBtn));
		itemMasterAuthoriseBtn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(reasonForAuthoriseTxt));
		reasonForAuthoriseTxt.click();
		reasonForAuthoriseTxt.sendKeys("ProductB Item Authorisation");
		Thread.sleep(1000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(reasonForAuthoriseSaveBtn));
		reasonForAuthoriseSaveBtn.click();
		
		String expMessage="Authorization Save Successfully";
		String actMessage=checkValidationMessage(expMessage);
		
		if (actMessage.equalsIgnoreCase(expMessage)) 
		{
			System.out.println("Test Pass: AUTHORISED Successfully From User 2");
			return true;
		}
		else
		{
			System.err.println("Test Fail: AUTHORISED Successfully From User 2");
			return false;
		}
}
     
     
     
     public boolean checkItemAuthoriseStatusInSuperUserAfterOneUserAuthorised() throws InterruptedException
	 {
		 
		 getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(userNameDisplay));
		 userNameDisplay.click();
		  
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
		 logoutOption.click();
		
		 
		 Thread.sleep(2000);
		 LoginPage lp=new LoginPage(getDriver()); 
			
			String unamelt="su";
					      
			String pawslt="su";
					      
			lp.enterUserName(unamelt);
					
			lp.enterPassword(pawslt);
					  
			lp.clickOnSignInBtn();
			
			//checkRefershPopOnlogin();
					        
			//checkPopUpWindow();

			Thread.sleep(5000);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
	      	homeMenu.click();
	      	
	      	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMasterMenu));
	      	homeMasterMenu.click();
	      	
	      	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMasterItemMenu));
	      	homeMasterItemMenu.click();
	      	
	    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMasterItem_ItemMenu));
	    	homeMasterItem_ItemMenu.click();
	    	
			Thread.sleep(4000);
			
			
			if (infoSideBarBtn.isDisplayed()==true)
			{
				infoSideBarBtn.click();	
			}
			
			
			int itemListCount = itemList.size();
  	 		
  	 		for(int i=0;i<itemListCount;i++)
  	 		{
  	 			String data= itemList.get(i).getText();
  	 			
  	 			if(data.equalsIgnoreCase("ProductB"))
  	 			{
  	 				itemList.get(i).click();
  	 				itemListChkBox.get(i).click();
  	 				
  	 				break;
  	 			}
  	 		}
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemMasterAuthorPannelRow1));
			String actitemMasterAuthorPannelRow1User1=itemMasterAuthorPannelRow1.getText();
			String expitemMasterAuthorPannelRow1User1="Authorize by UserAccPOTransRestrictions";
			
			System.out.println("actitemMasterAuthorPannelRow1User1  : "+actitemMasterAuthorPannelRow1User1);
			System.out.println("expitemMasterAuthorPannelRow1User1  : "+expitemMasterAuthorPannelRow1User1);
			
			String actitemMasterAuthorPannelRow4User1=itemMasterAuthorPannelRow4.getText();
			String expitemMasterAuthorPannelRow4User1="Status Authorised";
			
			System.out.println("actitemMasterAuthorPannelRow4User1  : "+actitemMasterAuthorPannelRow4User1);
			System.out.println("expitemMasterAuthorPannelRow4User1  : "+expitemMasterAuthorPannelRow4User1);
			
			Thread.sleep(1000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemMasterAuthorPannelNextBtn));
			itemMasterAuthorPannelNextBtn.click();
			
			
			String actitemMasterAuthorPannelRow1User2=itemMasterAuthorPannelRow1.getText();
			String expitemMasterAuthorPannelRow1User2="Next to Approve UserAllOptions";
			
			System.out.println("actitemMasterAuthorPannelRow1User2  : "+actitemMasterAuthorPannelRow1User2);
			System.out.println("expitemMasterAuthorPannelRow1User2  : "+expitemMasterAuthorPannelRow1User2);
			
			String actitemMasterAuthorPannelRow4User2=itemMasterAuthorPannelRow4.getText();
			String expitemMasterAuthorPannelRow4User2="Status Pending";
			
			System.out.println("actitemMasterAuthorPannelRow4User2  : "+actitemMasterAuthorPannelRow4User2);
			System.out.println("expitemMasterAuthorPannelRow4User2  : "+expitemMasterAuthorPannelRow4User2);
			
			if (actitemMasterAuthorPannelRow1User1.equalsIgnoreCase(expitemMasterAuthorPannelRow1User1) && 
				actitemMasterAuthorPannelRow4User1.equalsIgnoreCase(expitemMasterAuthorPannelRow4User1) && 
				actitemMasterAuthorPannelRow1User2.equalsIgnoreCase(expitemMasterAuthorPannelRow1User2) && 
				actitemMasterAuthorPannelRow4User2.equalsIgnoreCase(expitemMasterAuthorPannelRow4User2))
			{
				System.out.println(" Test Pass: Values Displayed Correct");
				return true;
			}
			else 
			{
				System.out.println(" Test Fail: Values Displayed Correct");
				return false;

			}
	 }


     
     
     
     public boolean chechLoginTOUserAllOptionsUserToAuthoriseForSelectedUserOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
     {
	 
	 getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(userNameDisplay));
	 userNameDisplay.click();
	  
	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
	 logoutOption.click();
	
	 
	 Thread.sleep(2000);
	 LoginPage lp=new LoginPage(getDriver()); 
		
		String unamelt="Useralloptions";
				      
		String pawslt="12345";
				      
		lp.enterUserName(unamelt);
				
		lp.enterPassword(pawslt);
				  
		lp.clickOnSignInBtn();
		
		//checkRefershPopOnlogin();
				        
		//checkPopUpWindow();

		Thread.sleep(5000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
      	homeMenu.click();
      	
      	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMasterMenu));
      	homeMasterMenu.click();
      	
      	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMasterItemMenu));
      	homeMasterItemMenu.click();
      	
    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMasterItem_ItemMenu));
    	homeMasterItem_ItemMenu.click();
    	
		Thread.sleep(4000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemScreenShowAllUnauthorisedRecordsBtn));
		itemScreenShowAllUnauthorisedRecordsBtn.click();
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(selectGridRowChkbox));
		selectGridRowChkbox.click();
		

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemMasterAuthoriseBtn));
		itemMasterAuthoriseBtn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(reasonForAuthoriseTxt));
		reasonForAuthoriseTxt.click();
		reasonForAuthoriseTxt.sendKeys("ProductB Item Authorisation");
		Thread.sleep(1000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(reasonForAuthoriseSaveBtn));
		reasonForAuthoriseSaveBtn.click();
		
		String expMessage="Authorization Save Successfully";
		String actMessage=checkValidationMessage(expMessage);
		
		if (actMessage.equalsIgnoreCase(expMessage)) 
		{
			System.out.println("Test Pass: AUTHORISED Successfully From User 2");
			return true;
		}
		else
		{
			System.err.println("Test Fail: AUTHORISED Successfully From User 2");
			return false;
		}
}
     
     
     
     public boolean checkItemAuthoriseStatusInSuperUserAfterTwoUserAuthorised() throws InterruptedException
	 {
		 
		 getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(userNameDisplay));
		 userNameDisplay.click();
		  
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
		 logoutOption.click();
		
		 
		 Thread.sleep(2000);
		 LoginPage lp=new LoginPage(getDriver()); 
			
			String unamelt="su";
					      
			String pawslt="su";
					      
			lp.enterUserName(unamelt);
					
			lp.enterPassword(pawslt);
					  
			lp.clickOnSignInBtn();
			
			//checkRefershPopOnlogin();
					        
			//checkPopUpWindow();

			Thread.sleep(5000);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
	      	homeMenu.click();
	      	
	      	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMasterMenu));
	      	homeMasterMenu.click();
	      	
	      	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMasterItemMenu));
	      	homeMasterItemMenu.click();
	      	
	    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMasterItem_ItemMenu));
	    	homeMasterItem_ItemMenu.click();
	    	
			Thread.sleep(4000);
			
			
			if (infoSideBarBtn.isDisplayed()==true)
			{
				infoSideBarBtn.click();	
			}
			
			
			int itemListCount = itemList.size();
  	 		
  	 		for(int i=0;i<itemListCount;i++)
  	 		{
  	 			String data= itemList.get(i).getText();
  	 			
  	 			if(data.equalsIgnoreCase("ProductB"))
  	 			{
  	 				itemList.get(i).click();
  	 				itemListChkBox.get(i).click();
  	 				
  	 				break;
  	 			}
  	 		}
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemMasterAuthorPannelRow1));
			String actitemMasterAuthorPannelRow1User1=itemMasterAuthorPannelRow1.getText();
			String expitemMasterAuthorPannelRow1User1="Authorize by UserAccPOTransRestrictions";
			
			System.out.println("actitemMasterAuthorPannelRow1User1  : "+actitemMasterAuthorPannelRow1User1);
			System.out.println("expitemMasterAuthorPannelRow1User1  : "+expitemMasterAuthorPannelRow1User1);
			
			String actitemMasterAuthorPannelRow4User1=itemMasterAuthorPannelRow4.getText();
			String expitemMasterAuthorPannelRow4User1="Status Authorised";
			
			System.out.println("actitemMasterAuthorPannelRow4User1  : "+actitemMasterAuthorPannelRow4User1);
			System.out.println("expitemMasterAuthorPannelRow4User1  : "+expitemMasterAuthorPannelRow4User1);
			
			Thread.sleep(1000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemMasterAuthorPannelNextBtn));
			itemMasterAuthorPannelNextBtn.click();
			
			
			String actitemMasterAuthorPannelRow1User2=itemMasterAuthorPannelRow1.getText();
			String expitemMasterAuthorPannelRow1User2="Authorize by UserAllOptions";
			
			System.out.println("actitemMasterAuthorPannelRow1User2  : "+actitemMasterAuthorPannelRow1User2);
			System.out.println("expitemMasterAuthorPannelRow1User2  : "+expitemMasterAuthorPannelRow1User2);
			
			String actitemMasterAuthorPannelRow4User2=itemMasterAuthorPannelRow4.getText();
			String expitemMasterAuthorPannelRow4User2="Status Authorised";
			
			System.out.println("actitemMasterAuthorPannelRow4User2  : "+actitemMasterAuthorPannelRow4User2);
			System.out.println("expitemMasterAuthorPannelRow4User2  : "+expitemMasterAuthorPannelRow4User2);
			
			if (actitemMasterAuthorPannelRow1User1.equalsIgnoreCase(expitemMasterAuthorPannelRow1User1) && 
				actitemMasterAuthorPannelRow4User1.equalsIgnoreCase(expitemMasterAuthorPannelRow4User1) && 
				actitemMasterAuthorPannelRow1User2.equalsIgnoreCase(expitemMasterAuthorPannelRow1User2) && 
				actitemMasterAuthorPannelRow4User2.equalsIgnoreCase(expitemMasterAuthorPannelRow4User2))
			{
				System.out.println(" Test Pass: Values Displayed Correct");
				return true;
			}
			else 
			{
				System.out.println(" Test Fail: Values Displayed Correct");
				return false;

			}
	 }

     public boolean checkAddingLevelInMasterAuthorisation() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
     {
    	 
    	    Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsmenuBtn));
			settingsmenuBtn.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterAuthorizationBtn));
			masterAuthorizationBtn.click();
			
			Thread.sleep(2000);

	        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterDropdown));
			masterDropdown.click();
			item.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
			nameTxt.click();
			nameTxt.sendKeys("item");
			Thread.sleep(2000);
			nameTxt.sendKeys(Keys.TAB);		           	

			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(addLevelBtn));
			addLevelBtn.click();
			
			Thread.sleep(2000);
		    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(descriptionTxt));
			descriptionTxt.click();
			descriptionTxt.sendKeys("Level2");
            Thread.sleep(1000);
			descriptionTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(conjunctionDropdown));
			conjunctionDropdown.click();
			conjunctionDropdown.sendKeys("Where");
			Thread.sleep(3000);
			conjunctionDropdown.sendKeys(Keys.TAB);
			Thread.sleep(3000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(selectFieldTxt));
			selectFieldTxt.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(iproductType));
			iproductType.click();
			
			Thread.sleep(2000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(selectOperatorDropdown));
			selectOperatorDropdown.click();
			
			Select s3=new Select(selectOperatorDropdown);
			s3.selectByValue("0");
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(compareWithDropdown));
			compareWithDropdown.click();
			
			Select s4=new Select(compareWithDropdown);
			s4.selectByValue("0");
			
			compareWithDropdown.sendKeys(Keys.TAB);
			
			Select s5=new Select(valueTypeDrpdwn);
			s5.selectByValue("2");
			
			Thread.sleep(3000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userSelectionTab));
			userSelectionTab.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userrow1));
			userrow1.click();

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userDropdown));
			userDropdown.click();
			userDropdown.sendKeys(Keys.END,Keys.SHIFT,Keys.HOME);
			Thread.sleep(1000);
			userDropdown.sendKeys("Useralloptions");
			
			Thread.sleep(3000);
			
			userDropdown.sendKeys(Keys.TAB);
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(definitionOkBtn));
			definitionOkBtn.click();
			
			Thread.sleep(2000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(level2EditBtn));
			level2EditBtn.click();
			
			Thread.sleep(2000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userSelectionTab));
			userSelectionTab.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userrow1));
			userrow1.click();

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userDropdown));
			userDropdown.click();
			userDropdown.sendKeys(Keys.END,Keys.SHIFT,Keys.HOME);
			Thread.sleep(1000);
			userDropdown.sendKeys("UserAccPOTransRestrictions");
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userrow2));
			userrow2.click();

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userDropdown));
			userDropdown.click();
			userDropdown.sendKeys(Keys.END,Keys.SHIFT,Keys.HOME);
			
			Select s1=new Select(userdropdown);
			s1.selectByValue("0");
			
			Thread.sleep(2000);
			userDropdown.sendKeys(Keys.TAB);
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(definitionOkBtn));
			definitionOkBtn.click();
			
			Thread.sleep(2000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
			saveBtn.click();
			
			System.out.println("**********************************checkSavingMasterAuthorization*****************************");
			
			String expMessage="Authorization Flow saved successfully.";
			
			String actMessage=checkValidationMessage(expMessage);
			
			if(actMessage.equalsIgnoreCase(expMessage) )
			{
				System.out.println(" Test Pass: level added And MA Saved  ");
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cancelBtn));
				cancelBtn.click();
				
				return true;
			}
			else
			{
				System.out.println(" Test Fail: level added And MA Saved  ");
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cancelBtn));
				cancelBtn.click();
				
				return false;
			}
			}
     
    
     public boolean checkSavingitemInItemMasterAfterAddingLevel() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
     {
    	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
	      	homeMenu.click();
	      	
	      	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMasterMenu));
	      	homeMasterMenu.click();
	      	
	      	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMasterItemMenu));
	      	homeMasterItemMenu.click();
	      	
	    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMasterItem_ItemMenu));
	    	homeMasterItem_ItemMenu.click();
	    	
			Thread.sleep(2000);
	    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemNewBtn));
	    	itemNewBtn.click();
	    	 
	    	Thread.sleep(2000);
	    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newGeneralName));
			newGeneralName.sendKeys("ProductRawMaterial");
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newGeneralCode));
			newGeneralCode.sendKeys("ProductRawMaterial");
			
			getAction().moveToElement(newGeneralCode).sendKeys(Keys.TAB).perform();
			 
	        newGeneralItemTypeDropDown.sendKeys("Raw Material");
	         
	        newGeneralItemTypeDropDown.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemSaveBtn));
			itemSaveBtn.click();
			 
			String expMessage="Saved Successfully";
			String actMessage=checkValidationMessage(expMessage);
			
			Thread.sleep(2000);
	    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newGeneralName));
	    	newGeneralName.click();
	    	
	    	
	    	Thread.sleep(2000);
	    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newGeneralName));
			newGeneralName.sendKeys("ProductService");
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newGeneralCode));
			newGeneralCode.sendKeys("ProductService");
			
			getAction().moveToElement(newGeneralCode).sendKeys(Keys.TAB).perform();
			 
	        newGeneralItemTypeDropDown.sendKeys("service");
	         
	        newGeneralItemTypeDropDown.sendKeys(Keys.TAB);
	        
	        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemSaveBtn));
			itemSaveBtn.click();
			 
			String expMessage1="Saved Successfully";
			String actMessage1=checkValidationMessage(expMessage1);
			
			Thread.sleep(2000);
	    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newGeneralName));
	    	newGeneralName.click();
	        
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeBtn));
			closeBtn.click();
			
			if (actMessage.equalsIgnoreCase(expMessage) && 
					actMessage1.equalsIgnoreCase(expMessage1))
			{
				return true;
			}
			else 
			{
				return false;

			}
    	 
     }
     
     
     public boolean checkPendingStatusOFItemWithProductTypeRawMaterial() throws InterruptedException
     {
    	 getDriver().navigate().refresh();
    	 
    	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
	      	homeMenu.click();
	      	
	      	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMasterMenu));
	      	homeMasterMenu.click();
	      	
	      	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMasterItemMenu));
	      	homeMasterItemMenu.click();
	      	
	    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMasterItem_ItemMenu));
	    	homeMasterItem_ItemMenu.click();	 
    	 
	    	Thread.sleep(3000);
	    	
	    	if (infoSideBarBtn.isDisplayed()==true)
			{
				infoSideBarBtn.click();	
			}
			
			int itemListCount = itemList.size();
  	 		
  	 		for(int i=0;i<itemListCount;i++)
  	 		{
  	 			String data= itemList.get(i).getText();
  	 			
  	 			if(data.equalsIgnoreCase("ProductRawMaterial"))
  	 			{
  	 				itemList.get(i).click();
  	 				itemListChkBox.get(i).click();
  	 				
  	 				break;
  	 			}
  	 		}
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemMasterAuthorPannelRow1));
			String actitemMasterAuthorPannelRow1User1=itemMasterAuthorPannelRow1.getText();
			String expitemMasterAuthorPannelRow1User1="Next to Approve UserAllOptions";
			
			System.out.println("actitemMasterAuthorPannelRow1User1  : "+actitemMasterAuthorPannelRow1User1);
			System.out.println("expitemMasterAuthorPannelRow1User1  : "+expitemMasterAuthorPannelRow1User1);
			
			String actitemMasterAuthorPannelRow4User1=itemMasterAuthorPannelRow4.getText();
			String expitemMasterAuthorPannelRow4User1="Status Pending";
			
			System.out.println("actitemMasterAuthorPannelRow4User1  : "+actitemMasterAuthorPannelRow4User1);
			System.out.println("expitemMasterAuthorPannelRow4User1  : "+expitemMasterAuthorPannelRow4User1);
			
			Thread.sleep(1000);
			boolean actitemMasterAuthorPannelNextBtn=itemMasterAuthorPannelNextBtn.isDisplayed();
			boolean expitemMasterAuthorPannelNextBtn=false;
			
			System.out.println(" act itemMasterAuthorPannelNextBtn : "+actitemMasterAuthorPannelNextBtn);
			System.out.println(" Exp itemMasterAuthorPannelNextBtn : "+expitemMasterAuthorPannelNextBtn);
			
			
			if (actitemMasterAuthorPannelRow1User1.equalsIgnoreCase(expitemMasterAuthorPannelRow1User1) && 
				actitemMasterAuthorPannelRow4User1.equalsIgnoreCase(expitemMasterAuthorPannelRow4User1)  && 
				actitemMasterAuthorPannelNextBtn==expitemMasterAuthorPannelNextBtn)
			{
				System.out.println(" Test Pass: Values Displayed Correct");
				return true;
			}
			else 
			{
				System.out.println(" Test Fail: Values Displayed Correct");
				return false;

			}
	 }

    	 
	    	
     public boolean checkItemStatusOFProductTypeSevice() throws InterruptedException
     {

 	     Thread.sleep(2000);
 	 
    	if (infoSideBarBtn.isDisplayed()==true)
		{
			infoSideBarBtn.click();	
		}
		
		int itemListCount = itemList.size();
 		
 		for(int i=0;i<itemListCount;i++)
 		{
 			String data= itemList.get(i).getText();
 			
 			if(data.equalsIgnoreCase("ProductRawMaterial"))
 			{
 				itemList.get(i).click();
 				itemListChkBox.get(i).click();
 				
 				break;
 			}
 		}
		
	 		
	 		for(int i=0;i<itemListCount;i++)
	 		{
	 			String data= itemList.get(i).getText();
	 			
	 			if(data.equalsIgnoreCase("ProductService"))
	 			{
	 				itemList.get(i).click();
	 				itemListChkBox.get(i).click();
	 				
	 				break;
	 			}
	 		}
	 		
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemMasterAuthorPannelRow1));
			String actitemMasterAuthorPannelRow1User1=itemMasterAuthorPannelRow1.getText();
			String expitemMasterAuthorPannelRow1User1="Next to Approve UserAccPOTransRestrictions";
			
			System.out.println("actitemMasterAuthorPannelRow1User1  : "+actitemMasterAuthorPannelRow1User1);
			System.out.println("expitemMasterAuthorPannelRow1User1  : "+expitemMasterAuthorPannelRow1User1);
			
			String actitemMasterAuthorPannelRow4User1=itemMasterAuthorPannelRow4.getText();
			String expitemMasterAuthorPannelRow4User1="Status Pending";
			
			System.out.println("actitemMasterAuthorPannelRow4User1  : "+actitemMasterAuthorPannelRow4User1);
			System.out.println("expitemMasterAuthorPannelRow4User1  : "+expitemMasterAuthorPannelRow4User1);
			
			Thread.sleep(1000);
			boolean actitemMasterAuthorPannelNextBtn=itemMasterAuthorPannelNextBtn.isDisplayed();
			boolean expitemMasterAuthorPannelNextBtn=false;
			
			System.out.println(" act itemMasterAuthorPannelNextBtn : "+actitemMasterAuthorPannelNextBtn);
			System.out.println(" Exp itemMasterAuthorPannelNextBtn : "+expitemMasterAuthorPannelNextBtn);
			
			
			if (actitemMasterAuthorPannelRow1User1.equalsIgnoreCase(expitemMasterAuthorPannelRow1User1) && 
				actitemMasterAuthorPannelRow4User1.equalsIgnoreCase(expitemMasterAuthorPannelRow4User1)  && 
				actitemMasterAuthorPannelNextBtn==expitemMasterAuthorPannelNextBtn)
			{
				System.out.println(" Test Pass: Values Displayed Correct");
				return true;
			}
			else 
			{
				System.out.println(" Test Fail: Values Displayed Correct");
				return false;

			}
     }
	    	
	    	
	    	
     public boolean checkPendingItemsInUserAllOptionsUser() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
     {
    	 
    	 getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(userNameDisplay));
		 userNameDisplay.click();
		  
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
		 logoutOption.click();
		
		 
		 Thread.sleep(2000);
		 LoginPage lp=new LoginPage(getDriver()); 
			
			String unamelt="Useralloptions";
					      
			String pawslt="12345";
					      
			lp.enterUserName(unamelt);
					
			lp.enterPassword(pawslt);
					  
			lp.clickOnSignInBtn();
			
			//checkRefershPopOnlogin();
					        
			//checkPopUpWindow();

			Thread.sleep(5000);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
	      	homeMenu.click();
	      	
	      	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMasterMenu));
	      	homeMasterMenu.click();
	      	
	      	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMasterItemMenu));
	      	homeMasterItemMenu.click();
	      	
	    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMasterItem_ItemMenu));
	    	homeMasterItem_ItemMenu.click();
	    	
			Thread.sleep(4000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemScreenShowAllUnauthorisedRecordsBtn));
			itemScreenShowAllUnauthorisedRecordsBtn.click();
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(selectGridRowChkbox));
			selectGridRowChkbox.click();
			
			
			int Count=itemList.size();
			int expCount=1;
			System.out.println(" Home Page Pending Item Count  : "+Count +" Value Expected "+expCount);
			
			ArrayList<String> ItemArray=new ArrayList<>();
			for (int i = 0; i <Count ; i++) 
			{
				String data=itemList.get(i).getText();
				ItemArray.add(data);
			}
			
			String actItemDisplayed=ItemArray.toString();
			String expItemDisplayed="[ProductRawMaterial]";
			
			System.out.println(" Home Page Pending Items   : "+actItemDisplayed +" Value Expected "+expItemDisplayed);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemMasterAuthoriseBtn));
			itemMasterAuthoriseBtn.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(reasonForAuthoriseTxt));
			reasonForAuthoriseTxt.click();
			reasonForAuthoriseTxt.sendKeys("Item Authorisation in UsaerAlloptions");
			Thread.sleep(1000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(reasonForAuthoriseSaveBtn));
			reasonForAuthoriseSaveBtn.click();
			
			String expMessage="Authorization Save Successfully";
			String actMessage=checkValidationMessage(expMessage);
			
			if (actMessage.equalsIgnoreCase(expMessage) && 
					actItemDisplayed.equalsIgnoreCase(expItemDisplayed) && Count==expCount) 
			{
				System.out.println("Test Pass: AUTHORISED Successfully");
				return true;
			}
			else
			{
				System.err.println("Test Fail: AUTHORISED Successfully");
				return false;
			}
    	 
     }
     
     
     public boolean checkPendingItemsInUserAccPOTransRestrictions() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
     {

    	 getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(userNameDisplay));
		 userNameDisplay.click();
		  
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
		 logoutOption.click();
		
		 
		 Thread.sleep(2000);
		 LoginPage lp=new LoginPage(getDriver()); 
			
			String unamelt="UserAccPOTransRestrictions";
					      
			String pawslt="12345";
					      
			lp.enterUserName(unamelt);
					
			lp.enterPassword(pawslt);
					  
			lp.clickOnSignInBtn();
			
			//checkRefershPopOnlogin();
					        
			//checkPopUpWindow();

			Thread.sleep(5000);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
	      	homeMenu.click();
	      	
	      	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMasterMenu));
	      	homeMasterMenu.click();
	      	
	      	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMasterItemMenu));
	      	homeMasterItemMenu.click();
	      	
	    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMasterItem_ItemMenu));
	    	homeMasterItem_ItemMenu.click();
	    	
			Thread.sleep(4000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemScreenShowAllUnauthorisedRecordsBtn));
			itemScreenShowAllUnauthorisedRecordsBtn.click();
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(selectGridRowChkbox));
			selectGridRowChkbox.click();
			
			
			int Count=itemList.size();
			int expCount=2;
			System.out.println(" Home Page Pending Item Count  : "+Count +" Value Expected +"+expCount);
			
			ArrayList<String> ItemArray=new ArrayList<>();
			for (int i = 0; i <Count ; i++) 
			{
				String data=itemList.get(i).getText();
				ItemArray.add(data);
			}
			
			String actItemDisplayed=ItemArray.toString();
			String expItemDisplayed="[ProductService, ProductRawMaterial]";
			
			System.out.println(" Home Page Pending Items   : "+actItemDisplayed +" Value Expected +"+expItemDisplayed);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemMasterAuthoriseBtn));
			itemMasterAuthoriseBtn.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(reasonForAuthoriseTxt));
			reasonForAuthoriseTxt.click();
			reasonForAuthoriseTxt.sendKeys("Item Authorisation in UserAccPOTransRestrictions");
			Thread.sleep(1000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(reasonForAuthoriseSaveBtn));
			reasonForAuthoriseSaveBtn.click();
			
			String expMessage="Authorization Save Successfully";
			String actMessage=checkValidationMessage(expMessage);
			
			if (actMessage.equalsIgnoreCase(expMessage) && actItemDisplayed.equalsIgnoreCase(expItemDisplayed) && 
					Count==expCount) 
			{
				System.out.println("Test Pass: AUTHORISED Successfully");
				return true;
			}
			else
			{
				System.err.println("Test Fail: AUTHORISED Successfully");
				return false;
			}
     
     }
     
     
      @FindBy(xpath="//div[@id='divSecondsub']//a[3]")
     private static WebElement itemScreenShowAllRecordsBtn;
    		 
     public boolean checkAuthorisationStatusOFItemsInSuperUserAfterTwoUserAuthorised() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
     {
    	 
    	 getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(userNameDisplay));
		 userNameDisplay.click();
		  
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
		 logoutOption.click();
		
		 
		 Thread.sleep(2000);
		 LoginPage lp=new LoginPage(getDriver()); 
			
			String unamelt="su";
					      
			String pawslt="su";
					      
			lp.enterUserName(unamelt);
					
			lp.enterPassword(pawslt);
					  
			lp.clickOnSignInBtn();
			
			//checkRefershPopOnlogin();
					        
			//checkPopUpWindow();

			Thread.sleep(3000);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
	      	homeMenu.click();
	      	
	      	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMasterMenu));
	      	homeMasterMenu.click();
	      	
	      	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMasterItemMenu));
	      	homeMasterItemMenu.click();
	      	
	    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMasterItem_ItemMenu));
	    	homeMasterItem_ItemMenu.click();
	    	
			
            Thread.sleep(3000);
	    	
	    	if (infoSideBarBtn.isDisplayed()==true)
			{
				infoSideBarBtn.click();	
			}
			
			int itemListCount = itemList.size();
  	 		
  	 		for(int i=0;i<itemListCount;i++)
  	 		{
  	 			String data= itemList.get(i).getText();
  	 			
  	 			if(data.equalsIgnoreCase("ProductRawMaterial"))
  	 			{
  	 				itemList.get(i).click();
  	 				itemListChkBox.get(i).click();
  	 				
  	 				break;
  	 			}
  	 		}
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemMasterAuthorPannelRow1));
			String actitemMasterAuthorPannelRow1User1=itemMasterAuthorPannelRow1.getText();
			String expitemMasterAuthorPannelRow1User1="Authorize by UserAllOptions";
			
			System.out.println("actitemMasterAuthorPannelRow1User1  : "+actitemMasterAuthorPannelRow1User1);
			System.out.println("expitemMasterAuthorPannelRow1User1  : "+expitemMasterAuthorPannelRow1User1);
			
			String actitemMasterAuthorPannelRow4User1=itemMasterAuthorPannelRow4.getText();
			String expitemMasterAuthorPannelRow4User1="Status Authorised";
			
			System.out.println("actitemMasterAuthorPannelRow4User1  : "+actitemMasterAuthorPannelRow4User1);
			System.out.println("expitemMasterAuthorPannelRow4User1  : "+expitemMasterAuthorPannelRow4User1);
			
			Thread.sleep(1000);
			boolean actitemMasterAuthorPannelNextBtn=itemMasterAuthorPannelNextBtn.isDisplayed();
			boolean expitemMasterAuthorPannelNextBtn=true;
			
			System.out.println(" act itemMasterAuthorPannelNextBtn : "+actitemMasterAuthorPannelNextBtn);
			System.out.println(" Exp itemMasterAuthorPannelNextBtn : "+expitemMasterAuthorPannelNextBtn);
			
			
			Thread.sleep(1000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemMasterAuthorPannelNextBtn));
			itemMasterAuthorPannelNextBtn.click();
			
			
			String actitemMasterAuthorPannelRow1User2=itemMasterAuthorPannelRow1.getText();
			String expitemMasterAuthorPannelRow1User2="Authorize by UserAccPOTransRestrictions";
			
			System.out.println("actitemMasterAuthorPannelRow1User2  : "+actitemMasterAuthorPannelRow1User2);
			System.out.println("expitemMasterAuthorPannelRow1User2  : "+expitemMasterAuthorPannelRow1User2);
			
			String actitemMasterAuthorPannelRow4User2=itemMasterAuthorPannelRow4.getText();
			String expitemMasterAuthorPannelRow4User2="Status Authorised";
			
			System.out.println("actitemMasterAuthorPannelRow4User2  : "+actitemMasterAuthorPannelRow4User2);
			System.out.println("expitemMasterAuthorPannelRow4User2  : "+expitemMasterAuthorPannelRow4User2);
			
			if (actitemMasterAuthorPannelRow1User1.equalsIgnoreCase(expitemMasterAuthorPannelRow1User1) && 
				actitemMasterAuthorPannelRow4User1.equalsIgnoreCase(expitemMasterAuthorPannelRow4User1) && 
				actitemMasterAuthorPannelRow1User2.equalsIgnoreCase(expitemMasterAuthorPannelRow1User2) && 
				actitemMasterAuthorPannelRow4User2.equalsIgnoreCase(expitemMasterAuthorPannelRow4User2))
			{
				System.out.println(" Test Pass: Values Displayed Correct");
				return true;
			}
			else 
			{
				System.out.println(" Test Fail: Values Displayed Correct");
				return false;

			}
	 }


     
     @FindBy(xpath="//select[@id='iProductType']")
     private static WebElement newGeneralItemTypeDropDown;

     @FindBy(xpath="//tbody/tr[1]/td[2]/div[1]/div[2]/div[1]/span[5]/i[1]")
     private static WebElement level2EditBtn;
     
     @FindBy(xpath="//select[@id='advancefilter_SelectOptionControl_67_0']")
     private static WebElement valueTypeDrpdwn;

     @FindBy(xpath="//*[@id='AuthInfoTableBody']/tr/td")
     private static List<WebElement> authorGridList;
     
     @FindBy(xpath="//*[@id='divAuthInfo']/ul/li/span")
     private static WebElement authorInfoCancelBtn;
   
     @FindBy(xpath="//*[@id='toggle_ribbon']")
     private static WebElement itemToggleRibbonBtn;

     @FindBy(xpath="//span[@id='btnAuthInfo']")
     private static WebElement itemAuthInfoBtn;


     
     public boolean checkAuthorisationInfoOfProductRawMaterial() throws InterruptedException
     {
    	 Thread.sleep(2000);
    	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemToggleRibbonBtn));
    	 itemToggleRibbonBtn.click();
    	 
    	 Thread.sleep(2000);
    	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemAuthInfoBtn));
    	 itemAuthInfoBtn.click();
    	 
    	 
    	 Thread.sleep(2000);
    	 int authorGridListCount=authorGridList.size();
    	 
    	 ArrayList<String >authorGridListArray=new ArrayList<>();
    	 for (int i = 1; i < authorGridListCount; i++) 
    	 {
    		 String data=authorGridList.get(i).getText();
    		 
    		 if (i==5 ) 
    		 {
				data="Date Field";
			 }
    		 if (i==6 ) 
    		 {
				data="Date Field";
			 }
    		 if (i==13 ) 
    		 {
				data="Date Field";
			 }
    		 if (i==14) 
    		 {
				data="Date Field";
			 }
    		 
    		 authorGridListArray.add(data);
		 }
    	 
    	 String actauthorGridList=authorGridListArray.toString();
    	 String expauthorGridList="[ProductRawMaterial, User, UserAllOptions, Authorised, Date Field, Date Field, Item Authorisation in UsaerAlloptions, , ProductRawMaterial, User, UserAccPOTransRestrictions, Authorised, Date Field, Date Field, Item Authorisation in UserAccPOTransRestrictions]";
    	 
    	 System.out.println("authorGridList Actual   : "+actauthorGridList);
    	 System.out.println("authorGridList Expect   : "+expauthorGridList);
    	 
    	 
    	 if (actauthorGridList.equalsIgnoreCase(expauthorGridList))
    	 {
    		 System.out.println(" Test Pass: Author Info Displayed Correctly");
    		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(authorInfoCancelBtn));
        	 authorInfoCancelBtn.click();
    		 return true;
		 }
    	 else 
    	 {
    		 System.out.println(" Test Fail: Author Info Displayed Correctly");
    		 return false;
		 }
     }
     
     
     public boolean checkFullAuthorizationOptionInMasterAuthor() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
     {
    	 
    	Thread.sleep(2000);
			
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsmenuBtn));
		settingsmenuBtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterAuthorizationBtn));
		masterAuthorizationBtn.click();
		
		Thread.sleep(2000);

        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterDropdown));
		masterDropdown.click();
		item.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
		nameTxt.click();
		nameTxt.sendKeys("item");
		Thread.sleep(2000);
		nameTxt.sendKeys(Keys.TAB);		           	

		Thread.sleep(2000);
			

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(Level1editBtn));
		Level1editBtn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(conditionTabFullAuthorChkBox));
		if (conditionTabFullAuthorChkBox.isSelected()==false) 
		{
			conditionTabFullAuthorChkBox.click();
		}
		
		Thread.sleep(3000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(definitionOkBtn));
		definitionOkBtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
		saveBtn.click();
		
		System.out.println("**********************************checkSavingMasterAuthorization*****************************");
		
		String expMessage="Authorization Flow saved successfully.";
		
		String actMessage=checkValidationMessage(expMessage);
		
		if(actMessage.equalsIgnoreCase(expMessage))
		{
			System.out.println(" Test Pass: Master Author Saved Success With no  Condition ");
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cancelBtn));
			cancelBtn.click();
			
			return true;
		}
		else
		{
			System.out.println(" Test Fail: Master Author Saved Success With  no Condition ");
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cancelBtn));
			cancelBtn.click();
			
			return false;
		}
 }
 
 
     
     
     @FindBy(xpath="//input[@id='chkFullAuthorization']")
     private static WebElement conditionTabFullAuthorChkBox;
     
     
     public boolean checkSavingItemForFullAuthorisationOption() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
     {
    	 
    	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
	      	homeMenu.click();
	      	
	      	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMasterMenu));
	      	homeMasterMenu.click();
	      	
	      	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMasterItemMenu));
	      	homeMasterItemMenu.click();
	      	
	    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMasterItem_ItemMenu));
	    	homeMasterItem_ItemMenu.click();
	    	
			Thread.sleep(2000);
	    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemNewBtn));
	    	itemNewBtn.click();
	    	 
	    	Thread.sleep(2000);
	    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newGeneralName));
			newGeneralName.sendKeys("FullAuthor");
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newGeneralCode));
			newGeneralCode.sendKeys("FullAuthor");
			
			
			getAction().moveToElement(newGeneralCode).sendKeys(Keys.TAB).perform();
			 
	        newGeneralItemTypeDropDown.sendKeys("Raw Material");
	         
	        newGeneralItemTypeDropDown.sendKeys(Keys.TAB);
			
	        Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemSaveBtn));
			itemSaveBtn.click();
			 
			String expMessage="Saved Successfully";
			String actMessage=checkValidationMessage(expMessage);
			
			Thread.sleep(2000);
	    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newGeneralName));
	    	newGeneralName.click();
	    	
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeBtn));
			closeBtn.click();
			
			Thread.sleep(2000);
	    	 getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(userNameDisplay));
			 userNameDisplay.click();
			  
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
			 logoutOption.click();
			
			 
			 Thread.sleep(2000);
			 LoginPage lp=new LoginPage(getDriver()); 
				
			 String unamelt="Useralloptions";
						      
			  String pawslt="12345";
						      
			lp.enterUserName(unamelt);
					
			lp.enterPassword(pawslt);
					  
			lp.clickOnSignInBtn();
			
			//checkRefershPopOnlogin();
					        
			//checkPopUpWindow();

			Thread.sleep(5000);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
	      	homeMenu.click();
	      	
	      	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMasterMenu));
	      	homeMasterMenu.click();
	      	
	      	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMasterItemMenu));
	      	homeMasterItemMenu.click();
	      	
	    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMasterItem_ItemMenu));
	    	homeMasterItem_ItemMenu.click();
	    	
			Thread.sleep(4000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemScreenShowAllUnauthorisedRecordsBtn));
			itemScreenShowAllUnauthorisedRecordsBtn.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(selectGridRowChkbox));
			selectGridRowChkbox.click();
			
			
			int Count=itemList.size();
			int expCount=1;
			System.out.println(" Home Page Pending Item Count  : "+Count +" Value Expected "+expCount);
			
			ArrayList<String> ItemArray=new ArrayList<>();
			for (int i = 0; i <Count ; i++) 
			{
				String data=itemList.get(i).getText();
				ItemArray.add(data);
			}
			
			String actItemDisplayed=ItemArray.toString();
			String expItemDisplayed="[FullAuthor]";
			
			System.out.println(" Home Page Pending Items   : "+actItemDisplayed +" Value Expected "+expItemDisplayed);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemMasterAuthoriseBtn));
			itemMasterAuthoriseBtn.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(reasonForAuthoriseTxt));
			reasonForAuthoriseTxt.click();
			reasonForAuthoriseTxt.sendKeys("Full Authorization");
			Thread.sleep(1000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(reasonForAuthoriseSaveBtn));
			reasonForAuthoriseSaveBtn.click();
			
			String expMessage1="Authorization Save Successfully";
			String actMessage1=checkValidationMessage(expMessage);
			
			if (actMessage.equalsIgnoreCase(expMessage) && 
					actItemDisplayed.equalsIgnoreCase(expItemDisplayed) && Count==expCount && 
					actMessage1.equalsIgnoreCase(expMessage1)) 
			{
				System.out.println("Test Pass: AUTHORISED Successfully");
				return true;
			}
			else
			{
				System.err.println("Test Fail: AUTHORISED Successfully");
				return false;
			}
	     }
	     

    	 public boolean checkFullAuthorItemInSuperUserAfterLevel2UserAuthorisation() throws InterruptedException
    	 {
    		 
    		Thread.sleep(2000);
	    	getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(userNameDisplay));
			userNameDisplay.click();
			  
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
			logoutOption.click();
			
			 
			Thread.sleep(2000);
			LoginPage lp=new LoginPage(getDriver()); 
				
			String unamelt="su";
						      
			String pawslt="su";
						      
			lp.enterUserName(unamelt);
					
			lp.enterPassword(pawslt);
					  
			lp.clickOnSignInBtn();
			
			Thread.sleep(5000);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
	      	homeMenu.click();
	      	
	      	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMasterMenu));
	      	homeMasterMenu.click();
	      	
	      	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMasterItemMenu));
	      	homeMasterItemMenu.click();
	      	
	    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMasterItem_ItemMenu));
	    	homeMasterItem_ItemMenu.click();
	    	
			Thread.sleep(4000);
			
			
			if (infoSideBarBtn.isDisplayed()==true)
			{
				infoSideBarBtn.click();	
			}
			
			
			int itemListCount = itemList.size();
  	 		
  	 		for(int i=0;i<itemListCount;i++)
  	 		{
  	 			String data= itemList.get(i).getText();
  	 			
  	 			if(data.equalsIgnoreCase("FullAuthor"))
  	 			{
  	 				itemList.get(i).click();
  	 				itemListChkBox.get(i).click();
  	 				
  	 				break;
  	 			}
  	 		}
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemMasterAuthorPannelRow1));
			String actitemMasterAuthorPannelRow1User1=itemMasterAuthorPannelRow1.getText();
			String expitemMasterAuthorPannelRow1User1="Authorize by UserAllOptions";
			
			System.out.println("actitemMasterAuthorPannelRow1User1  : "+actitemMasterAuthorPannelRow1User1);
			System.out.println("expitemMasterAuthorPannelRow1User1  : "+expitemMasterAuthorPannelRow1User1);
			
			String actitemMasterAuthorPannelRow4User1=itemMasterAuthorPannelRow4.getText();
			String expitemMasterAuthorPannelRow4User1="Status Authorised";
			
			System.out.println("actitemMasterAuthorPannelRow4User1  : "+actitemMasterAuthorPannelRow4User1);
			System.out.println("expitemMasterAuthorPannelRow4User1  : "+expitemMasterAuthorPannelRow4User1);
			
			Thread.sleep(1000);
			boolean actitemMasterAuthorPannelNextBtn=itemMasterAuthorPannelNextBtn.isDisplayed();
			boolean expitemMasterAuthorPannelNextBtn=false;
			
			System.out.println(" act itemMasterAuthorPannelNextBtn : "+actitemMasterAuthorPannelNextBtn);
			System.out.println(" Exp itemMasterAuthorPannelNextBtn : "+expitemMasterAuthorPannelNextBtn);
			
			
			if (actitemMasterAuthorPannelRow1User1.equalsIgnoreCase(expitemMasterAuthorPannelRow1User1) && 
				actitemMasterAuthorPannelRow4User1.equalsIgnoreCase(expitemMasterAuthorPannelRow4User1)  && 
				actitemMasterAuthorPannelNextBtn==expitemMasterAuthorPannelNextBtn)
			{
				System.out.println(" Test Pass: Values Displayed Correct");
				return true;
			}
			else 
			{
				System.out.println(" Test Fail: Values Displayed Correct");
				return false;

			}
     }
	    
     

	
	public MasterAuthorOptionsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
}
