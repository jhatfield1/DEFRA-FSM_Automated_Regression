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

WebUI.delay(2)

WebUI.click(findTestObject('FSM1/Complete ABP Inspection/ABP18 Forward Trace/Page_JClient/div_ABPR18 - Forward Trace1'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABP18 Forward Trace/Page_JClient/div_Create_GKH2EKQBDXB GKH2EKQ'))

WebUI.delay(2)

'Release 22 - FP-843'
WebUI.verifyElementPresent(findTestObject('FSM1/Release22/Page_JClient/div_Name of Operator_18'), 2)

'Release 22 - FP-843'
WebUI.verifyElementPresent(findTestObject('FSM1/Release22/Page_JClient/div_Name of Operator_18_1'), 2)

WebUI.click(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABP18 Forward Trace/Page_JClient/input_Is this inspection at th'))

WebUI.setText(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABP18 Forward Trace/Page_JClient/input_Approval Number_gwt-Text'), 
    '123')

WebUI.setText(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABP18 Forward Trace/Page_JClient/input_Premises Type_gwt-TextBo'), 
    'Test automation')

WebUI.setText(findTestObject('FSM1/Complete ABP Inspection/ABP18 Forward Trace/Page_JClient/input_Name of Operator_gwt-Tex'), 
    'Test automation')

WebUI.setText(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABP18 Forward Trace/Page_JClient/textarea_Address of premises_g'), 
    'Test automation')

WebUI.setText(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABP18 Forward Trace/Page_JClient/input_Postcode_gwt-TextBox GKH'), 
    'WR5 2NB')

WebUI.selectOptionByValue(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABP18 Forward Trace/Page_JClient/select_NorthScotlandSouthernWa'), 
    'Scotland', true)

WebUI.setText(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABP18 Forward Trace/Page_JClient/input_Name of haulier_gwt-Text'), 
    'Test automation')

WebUI.setText(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABP18 Forward Trace/Page_JClient/textarea_Address of haulier_gw'), 
    'Test automation')

WebUI.setText(findTestObject('FSM1/Complete ABP Inspection/ABP18 Forward Trace/Page_JClient/Postcode'), 'WR5 2NB')

WebUI.setText(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABP18 Forward Trace/Page_JClient/input_Registration number (if'), 
    '123')

WebUI.setText(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABP18 Forward Trace/Page_JClient/input_Reference No. of CD or o'), 
    '987')

WebUI.setText(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABP18 Forward Trace/Page_JClient/textarea_Description of materi'), 
    'Test automation')

WebUI.selectOptionByValue(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABP18 Forward Trace/Page_JClient/select_NACattleDeerFishGoatsPi'), 
    'Goats', true)

WebUI.setText(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABP18 Forward Trace/Page_JClient/input_Category_gwt-TextBox GKH'), 
    'Test automation')

WebUI.setText(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABP18 Forward Trace/Page_JClient/input_Quantity_gwt-TextBox GKH'), 
    '12')

WebUI.setText(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABP18 Forward Trace/Page_JClient/textarea_Any other relevant in'), 
    'Test automation')

WebUI.click(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABP18 Forward Trace/Page_JClient/input_Any other relevant infor'))

WebUI.setText(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABP18 Forward Trace/Page_JClient/textarea_If so give details_gw'), 
    'Test automation')

WebUI.click(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABP18 Forward Trace/Page_JClient/input_Yes_radio_group_132'))

not_run: WebUI.click(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABP18 Forward Trace/Page_JClient/input_How was the trace carrie'))

not_run: WebUI.click(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABP18 Forward Trace/Page_JClient/input_Outcome_radio_group_134'))

not_run: WebUI.setText(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABP18 Forward Trace/Page_JClient/textarea_Give Details_gwt-Text'), 
    'Test automation')

not_run: WebUI.setText(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABP18 Forward Trace/Page_JClient/textarea_Describe action taken'), 
    'Test automation')

mydate = new Date()

formattedDate = mydate.format('MM/dd/yyy')

WebUI.sendKeys(findTestObject('FSM1/Complete ABP Inspection/ABP18 Forward Trace/Page_JClient/DateofDespatch'), formattedDate)

WebUI.click(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABP18 Forward Trace/Page_JClient/div_Save'))

