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

WebUI.delay(3)

WebUI.click(findTestObject('FSM1/Complete ABP Inspection/ABPR17 Backward Trace/Page_JClient/div_ABPR17 - Backward Trace1'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABPR17 Backward Trace/Page_JClient/div_Create_GKH2EKQBDXB GKH2EKQ'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABPR17 Backward Trace/Page_JClient/input_Is this inspection at th'))

WebUI.setText(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABPR17 Backward Trace/Page_JClient/input_Approval Number_gwt-Text'), 
    '1234')

WebUI.setText(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABPR17 Backward Trace/Page_JClient/input_Premises Type_gwt-TextBo'), 
    'Test automation')

WebUI.setText(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABPR17 Backward Trace/Page_JClient/input_Name of originator_gwt-T'), 
    'Test automation')

WebUI.setText(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABPR17 Backward Trace/Page_JClient/textarea_Address of premises_g'), 
    'Test automation')

WebUI.setText(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABPR17 Backward Trace/Page_JClient/input_Postcode_gwt-TextBox GKH'), 
    'WR5 2NB')

WebUI.setText(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABPR17 Backward Trace/Page_JClient/input_Email_gwt-TextBox GKH2EK'), 
    'test@gmail.com')

WebUI.setText(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABPR17 Backward Trace/Page_JClient/input_Approval number (if appl'), 
    '1234')

WebUI.selectOptionByValue(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABPR17 Backward Trace/Page_JClient/select_NorthScotlandSouthernWa'), 
    'North', true)

WebUI.setText(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABPR17 Backward Trace/Page_JClient/input_Name of haulier_gwt-Text'), 
    'Test automation')

WebUI.setText(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABPR17 Backward Trace/Page_JClient/textarea_Address of haulier_gw'), 
    'Test automation')

WebUI.delay(2)

WebUI.setText(findTestObject('FSM1/Complete ABP Inspection/ABPR17 Backward Trace/Page_JClient/Postcode'), 'RN2 3WE')

WebUI.setText(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABPR17 Backward Trace/Page_JClient/input_Registration number (if'), 
    '9876')

WebUI.setText(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABPR17 Backward Trace/Page_JClient/input_Reference No. of CD or o'), 
    '112233')

WebUI.setText(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABPR17 Backward Trace/Page_JClient/textarea_Description of materi'), 
    'Test automation')

WebUI.selectOptionByValue(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABPR17 Backward Trace/Page_JClient/select_NACattleDeerFishGoatsPi'), 
    'Fish', true)

WebUI.setText(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABPR17 Backward Trace/Page_JClient/input_Category_gwt-TextBox GKH'), 
    'Test automation')

WebUI.setText(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABPR17 Backward Trace/Page_JClient/input_Quantity_gwt-TextBox GKH'), 
    '100')

WebUI.setText(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABPR17 Backward Trace/Page_JClient/textarea_Any other relevant in'), 
    'Test automation')

WebUI.click(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABPR17 Backward Trace/Page_JClient/input_Yes_radio_group_56'))

WebUI.click(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABPR17 Backward Trace/Page_JClient/input_Yes_radio_group_57'))

WebUI.delay(1)

mydate = new Date()

formattedDate = mydate.format('MM/dd/yyy')

WebUI.sendKeys(findTestObject('FSM1/Complete ABP Inspection/ABPR17 Backward Trace/Page_JClient/DateofDespatch'), formattedDate)

WebUI.click(findTestObject('FSM1/Complete ABP Inspection/ABPR17 Backward Trace/Page_JClient/div_Save1'))

