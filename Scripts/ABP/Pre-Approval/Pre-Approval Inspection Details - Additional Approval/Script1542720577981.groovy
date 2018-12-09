import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.click(findTestObject('FSM1/Pre-Approval/Page_JClient/div_Inspection Details'))

WebUI.delay(3)

WebUI.click(findTestObject('FSM1/Pre-Approval/Page_JClient/input_Announced visit_radio_gr'))

WebUI.click(findTestObject('FSM1/Pre-Approval/Page_JClient/input_Yes_radio_group_2'))

WebUI.click(findTestObject('FSM1/Pre-Approval/Page_JClient/input_Yes_radio_group_3'))

mydate = new Date()

formattedDate = mydate.format('MM/dd/yyy')

WebUI.sendKeys(findTestObject('FSM1/Pre-Approval/Page_JClient/input_Date application receive'), formattedDate)

WebUI.click(findTestObject('FSM1/Pre-Approval/Page_JClient/input_Raw materials applicable'))

WebUI.setText(findTestObject('FSM1/Pre-Approval/Page_JClient/textarea_Record specific infor'), 'Test automation')

WebUI.click(findTestObject('FSM1/Pre-Approval/Page_JClient/input_Structure applicable_rad'))

WebUI.setText(findTestObject('FSM1/Pre-Approval/Page_JClient/textarea_No_gwt-TextArea GKH2E'), 'Test automation')

WebUI.click(findTestObject('FSM1/Pre-Approval/Page_JClient/input_Operating applicable_rad'))

WebUI.setText(findTestObject('FSM1/Pre-Approval/Page_JClient/textarea_No_gwt-TextArea GKH2E - Operating'), 'Test automation')

WebUI.click(findTestObject('FSM1/Pre-Approval/Page_JClient/input_Validation applicable_ra'))

WebUI.setText(findTestObject('FSM1/Pre-Approval/Page_JClient/textarea_No_gwt-TextArea GKH2E - Validation'), 'Test automation')

WebUI.click(findTestObject('FSM1/Pre-Approval/Page_JClient/input_Collection Transport  St'))

WebUI.setText(findTestObject('FSM1/Pre-Approval/Page_JClient/textarea_No_gwt-TextArea GKH2E - Transport'), 'Test automation')

WebUI.click(findTestObject('FSM1/Pre-Approval/Page_JClient/input_Microbiological Testing'))

WebUI.setText(findTestObject('FSM1/Pre-Approval/Page_JClient/textarea_No_gwt-TextArea GKH2E - Micro'), 'Test automation')

WebUI.click(findTestObject('FSM1/Pre-Approval/Page_JClient/input_Sampling applicable_radi'))

WebUI.click(findTestObject('FSM1/Pre-Approval/Page_JClient/input_Have samples been collec'))

WebUI.doubleClick(findTestObject('FSM1/Pre-Approval/Page_JClient/input_Record Keeping applicabl'))

WebUI.setText(findTestObject('FSM1/Pre-Approval/Page_JClient/textarea_Describe systems for'), 'Test automation')

WebUI.click(findTestObject('FSM1/Pre-Approval/Page_JClient/input_Pest Control applicable_'))

WebUI.setText(findTestObject('FSM1/Pre-Approval/Page_JClient/textarea_Describe pest control'), 'Test automation')

WebUI.click(findTestObject('FSM1/Pre-Approval/Page_JClient/input_Disposal of unused ABP a'))

WebUI.setText(findTestObject('FSM1/Pre-Approval/Page_JClient/textarea_What procedures have'), 'Test automation')

WebUI.click(findTestObject('FSM1/Pre-Approval/Page_JClient/input_Other applicable_radio_g'))

WebUI.setText(findTestObject('FSM1/Pre-Approval/Page_JClient/textarea_Record any other rele'), 'Test automation')

WebUI.setText(findTestObject('FSM1/Pre-Approval/Page_JClient/input_Chargeable time (minutes'), '7', FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('FSM1/Pre-Approval/Page_JClient/select_Create initial Routine'), 'Pre-Approval', 
    true)

mydate = new Date()

formattedDate = mydate.format('MM/dd/yyy')

WebUI.sendKeys(findTestObject('FSM1/Pre-Approval/Page_JClient/input_Next Inspection From'), formattedDate)

WebUI.sendKeys(findTestObject('FSM1/Pre-Approval/Page_JClient/input_Next Inspection To'), formattedDate)

WebUI.selectOptionByValue(findTestObject('FSM1/Pre-Approval/Page_JClient/select_VetTechMe'), 'Me', true)

WebUI.click(findTestObject('FSM1/Pre-Approval/Page_JClient/img_Signature_gwt-Image'))

WebUI.click(findTestObject('FSM1/Pre-Approval/Page_JClient/div_Unable To Sign'))

WebUI.delay(2)

WebUI.click(findTestObject('FSM1/Pre-Approval/Page_JClient/div_Save'))

